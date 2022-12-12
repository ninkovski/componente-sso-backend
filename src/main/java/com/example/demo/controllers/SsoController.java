package com.example.demo.controllers;

import com.example.demo.models.SsoApiResponse;
import com.example.demo.models.SsoMenuResponse;
import com.example.demo.models.SsoUsuarioResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class SsoController {


    @GetMapping()
    @RequestMapping("api/auth/datos_usuario")
    public SsoUsuarioResponse obtenerLogin() throws  JsonProcessingException {
        String text = "{\n" +
                "    \"id\": 53801,\n" +
                "    \"cuuid\": \"700c6d3c-8932-4cf8-9ac4-e0c13800ece2\",\n" +
                "    \"usuario\": \"42011339\",\n" +
                "    \"sad_id\": 38375,\n" +
                "    \"personal_id\": null,\n" +
                "    \"foto_rec\": \"./assets/images/usertest.png\",\n" +
                "    \"foto\": \"./assets/images/usertest.png\",\n" +
                "    \"tipo_doc_codigo\": \"01\",\n" +
                "    \"tipo_doc_nombre\": \"DNI\",\n" +
                "    \"numero_doc\": \"42011339\",\n" +
                "    \"nombre_completo\": \"CORDOVA CESPEDES MILAGROS CAROLINA\",\n" +
                "    \"nombres\": \"MILAGROS CAROLINA\",\n" +
                "    \"papellido\": \"CORDOVA\",\n" +
                "    \"sapellido\": \"CESPEDES\",\n" +
                "    \"correo\": \"\",\n" +
                "    \"correo_ins\": null,\n" +
                "    \"email_ins_val\": \"0\",\n" +
                "    \"rel_laboral_nombre\": \"CIUDADANO\",\n" +
                "    \"rel_laboral_codigo\": \"NIN\",\n" +
                "    \"dependencia\": null,\n" +
                "    \"cargo\": null,\n" +
                "    \"fecha_ult_acc\": \"2022-12-01T12:47:59.252001\",\n" +
                "    \"historial\": null,\n" +
                "    \"fecha_ing\": null,\n" +
                "    \"bloqueado\": \"NO\",\n" +
                "    \"exonerado\": \"NO\",\n" +
                "    \"cancelado\": \"NO\",\n" +
                "    \"estado\": \"1\"\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();

        SsoUsuarioResponse ssoUsuarioResponse = mapper.readValue(text, SsoUsuarioResponse.class);

        //JSONObject json = new JSONObject(text);
        return ssoUsuarioResponse;
    }

    @GetMapping()
    @RequestMapping("/api/aplicaciones/info_app")
    public SsoApiResponse obtenerDatosApp() throws  JsonProcessingException {
        String text = "{\n" +
                "    \"id\": 282,\n" +
                "    \"cuuid\": \"3afdbe83984a44e6b324719b77885ca7\",\n" +
                "    \"logo\": \" ./assets/images/usertest.png\",\n" +
                "    \"logo_sm\": \"./assets/images/usertest.png\",\n" +
                "    \"logo_lg\": \"./assets/images/usertest.png\",\n" +
                "    \"siglas\": \"SMA\",\n" +
                "    \"nombre\": \"SISTEMA DE MONITOREO DE ALERTAS\",\n" +
                "    \"nombre_corto\": \"SISTEMA DE MONITOREO DE ALERTAS\",\n" +
                "    \"entidad_nombre\": \"OBSERVATORIO DE CRIMINALIDAD DEL MINISTERIO PÚBLICO\",\n" +
                "    \"arquitectura_nombre\": \"APLICACIÓN WEB\",\n" +
                "    \"sad_id\": 232\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();

        SsoApiResponse ssoUsuarioResponse = mapper.readValue(text, SsoApiResponse.class);

        return ssoUsuarioResponse;
    }

    @GetMapping()
    @RequestMapping("/api/menus/jerarquico")
    public ArrayList<SsoMenuResponse> obtenerMenus() throws  JsonProcessingException {
        ArrayList<SsoMenuResponse> reponse = new ArrayList<>();
        SsoMenuResponse menu = null;
        SsoMenuResponse children = null;
        ArrayList<SsoMenuResponse> childrenList = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();
        String text = "";
        // primero
        text = "{\n" +
                "        \"id\": 4608,\n" +
                "        \"title\": \"Dashboard\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/dashboard\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"sub\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\",\n" +
                "        \"children\": null\n" +
                "    }";

        menu = mapper.readValue(text, SsoMenuResponse.class);

        text = "{\n" +
                "        \"id\": 4611,\n" +
                "        \"title\": \"Principal\",\n" +
                "        \"icon\": \"\",\n" +
                "        \"routerLink\": \"/dashboard/principal\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\"\n" +
//                "        \"children\": null\n" +
                "    }";

        children = mapper.readValue(text, SsoMenuResponse.class);
        children.setChildren(new ArrayList<>());
        childrenList = new ArrayList<>();
        childrenList.add(children);
        menu.setChildren(childrenList);
        reponse.add(menu);
        // segundo
        text = "{\n" +
                "        \"id\": 4605,\n" +
                "        \"title\": \"Alertas\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/alertas\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"sub\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\",\n" +
                "        \"children\": null\n" +
                "    }";

        menu = mapper.readValue(text, SsoMenuResponse.class);

        text = "{\n" +
                "        \"id\": 4610,\n" +
                "        \"title\": \"Acciones\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/alertas/acciones\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\" \n" +
//                "        \"children\": null\n" +
                "    }";

        children = mapper.readValue(text, SsoMenuResponse.class);
        children.setChildren(new ArrayList<>());
        childrenList = new ArrayList<>();
        childrenList.add(children);
        menu.setChildren(childrenList);
        reponse.add(menu);
        // tercero


        text = "{\n" +
                "        \"id\": 4606,\n" +
                "        \"title\": \"Reportes\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/reportes\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"sub\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\",\n" +
                "        \"children\": null\n" +
                "    }";

        menu = mapper.readValue(text, SsoMenuResponse.class);

        text = "{\n" +
                "        \"id\": 4607,\n" +
                "        \"title\": \"Reporte de alertas\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/reportes/alertas\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\"\n" +
//                "        \"children\": null\n" +
                "    }";

        children = mapper.readValue(text, SsoMenuResponse.class);
        children.setChildren(new ArrayList<>());
        childrenList = new ArrayList<>();
        childrenList.add(children);
        menu.setChildren(childrenList);
        reponse.add(menu);

        // cuarto


        text = "{\n" +
                "        \"id\": 4611,\n" +
                "        \"title\": \"RECA\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/reca-list\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"sub\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\",\n" +
                "        \"children\": null\n" +
                "    }";

        menu = mapper.readValue(text, SsoMenuResponse.class);

        text = "{\n" +
                "        \"id\": 4612,\n" +
                "        \"title\": \"Registro de ficha RECA\",\n" +
                "        \"icon\": \"fa fa-home\",\n" +
                "        \"routerLink\": \"/reca-list/reca-list\",\n" +
                "        \"target\": null,\n" +
                "        \"clase\": \"\",\n" +
                "        \"badge\": \"\",\n" +
                "        \"badgeClase\": \"\"\n" +
//                "        \"children\": null\n" +
                "    }";

        children = mapper.readValue(text, SsoMenuResponse.class);
        children.setChildren(new ArrayList<>());
        childrenList = new ArrayList<>();
        childrenList.add(children);
        menu.setChildren(childrenList);
        reponse.add(menu);
        return reponse;
    }
}