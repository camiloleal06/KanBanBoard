package org.kanban.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TareaUsuarioDTO {
    private Long id;
	private String title;
	private String description;
	private Long user_id;
	private String fullname;
	
	public TareaUsuarioDTO(Long id, String title, String description, String fullname,Long user_id) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.fullname = fullname;
		this.user_id = user_id;
	}
	
	public TareaUsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
