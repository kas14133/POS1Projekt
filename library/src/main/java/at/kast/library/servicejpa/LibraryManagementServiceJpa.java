package at.kast.library.servicejpa;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibraryManagementServiceJpa implements ServiceJpa {

    @Autowired
    private personJpaRepository PersonJpaRepository;

    @Autowired
    private TeachingUnitJpaRepository teachingUnitJpaRepository;

    public void createNewTeacher(String name) {
        // start transaction
        // write audit log
        Teacher teacher = new Teacher(name, new Date());
        teacherJpaRepository.persist(teacher);
        // end (commit) transaction
    }

    public void setTeacherJpaRepository(TeacherJpaRepository teacherJpaRepository) {
        this.teacherJpaRepository = teacherJpaRepository;
    }

    public void setTeachingUnitJpaRepository(TeachingUnitJpaRepository teachingUnitJpaRepository) {
        this.teachingUnitJpaRepository = teachingUnitJpaRepository;
    }
}
