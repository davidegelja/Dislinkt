package com.dislinkt.like;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "database_sequences")
public class SequencerApplication {



        @Id
        private String id;

        private Integer seq;



        //getters and setters omitted


}
