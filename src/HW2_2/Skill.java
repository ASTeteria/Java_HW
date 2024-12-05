package HW2_2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class Skill {
        private String title;
        private int exp;
    }
