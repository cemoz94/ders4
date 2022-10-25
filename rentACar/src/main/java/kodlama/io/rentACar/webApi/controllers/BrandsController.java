package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController     //annotation:bilgilendirme ifadesi
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;

	@Autowired 
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		return brandService.getAll();
	}

}

//1. ve 2. @ istek controller e yapılıyor controller business a gidiyor soruyor business dataaccess e gidiyor ve data verliyo0r
//3.@ git parametrelerine bak git uygulamayı tara kim brandservice i implement ediyor brandmanager onu newle bana
//www.kodlama.io/api/brands/getall 4.@
//dependency injection