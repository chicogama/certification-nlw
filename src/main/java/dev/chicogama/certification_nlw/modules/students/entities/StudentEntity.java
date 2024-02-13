package dev.chicogama.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntities;
}
