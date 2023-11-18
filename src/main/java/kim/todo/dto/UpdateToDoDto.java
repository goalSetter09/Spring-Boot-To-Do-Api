package kim.todo.dto;

import lombok.Data;

@Data
public class UpdateToDoDto {
    private String name;
    private Boolean completed;
}
