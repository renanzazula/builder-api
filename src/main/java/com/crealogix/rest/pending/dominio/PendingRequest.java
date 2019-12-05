package com.crealogix.rest.pending.dominio;

import com.crealogix.service.dto.ClassAttributes;
import com.crealogix.service.dto.ControllerAttributes;
import com.crealogix.service.dto.FieldAttributes;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PendingRequest implements Serializable {
 
    private ClassAttributes classAttributes;
    private ControllerAttributes controllerAttributes;
    private List<FieldAttributes> fields;
    
}
