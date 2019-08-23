package HolaMundoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotasController {

    @RequestMapping("/mascota")
    public Mascota mascota(
        @RequestParam(value="nombre", defaultValue="Sin nombre") String nombre, 
        @RequestParam(value="edad", defaultValue="0")  int edad) {
        return new Mascota(nombre, edad);
    }

    @RequestMapping("/")
    public String inicio() {
        return "Estamos en el índice /";
    }
}