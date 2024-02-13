package dev.chicogama.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
    private UUID id;
    private UUID studentID;
    private String technology;
    private int grate;
    List<AnswersCertificationsEntity>answersCertificationsEntities;
}
