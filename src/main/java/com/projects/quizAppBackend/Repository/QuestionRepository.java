package com.projects.quizAppBackend.Repository;

import com.projects.quizAppBackend.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {
}
