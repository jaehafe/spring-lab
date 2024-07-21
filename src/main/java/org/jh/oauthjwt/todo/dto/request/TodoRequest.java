package org.jh.oauthjwt.todo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TodoRequest {

    @NotBlank(message = "할 일의 이름을 입력해주세요.")
    @Size(max = 20, message = "할 일의 이름은 20자를 초과할 수 없습니다.")
    private final String title;

    @NotBlank(message = "할 일의 내용을 입력해주세요.")
    @Size(max = 100, message = "할 일의 내용은 100자를 초과할 수 없습니다.")
    private final String body;

    @NotBlank(message = "할 일의 마감일을 입력해주세요.")
    private final LocalDateTime dueDate;
}