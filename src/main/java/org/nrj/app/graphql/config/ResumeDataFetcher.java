package org.nrj.app.graphql.config;

import graphql.schema.DataFetcher;
import org.nrj.app.repo.ResumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeDataFetcher {

    @Autowired
    private ResumeRepo resumeRepo;


    public DataFetcher getAllResumeData() {
        return dataFetchingEnvironment -> {
            String bookId = dataFetchingEnvironment.getArgument("id");
            return resumeRepo.findAll();
        };
    }
//
//    public DataFetcher getAuthorDataFetcher() {
//        return dataFetchingEnvironment -> {
//            Map<String,String> book = dataFetchingEnvironment.getSource();
//            String authorId = book.get("authorId");
//            return authors
//                    .stream()
//                    .filter(author -> author.get("id").equals(authorId))
//                    .findFirst()
//                    .orElse(null);
//        };
//    }
}
