package com;


public enum DesktopThings {
    COPYBOOK{
        @Override
        public String toString() {
            return "it's student copybook for my programming courses";
        }
    },
    PEN{
        @Override
        public String toString() {
            return "Blue pen";
        }
    },
    PENSIL{
        @Override
        public String toString() {
            return "Usual pensil";
        }
    },
    CALCULATOR{
        @Override
        public String toString() {
            return "Calculator to make work easier";
        }
    },
    BOOK{

        public String toString(String newBook) {
            return newBook;
        }

        @Override
        public String toString() {
            return "Lord Of The Rings";
        }
    },
    STUDENT_BOOK{

        public String toString(String newStudentBook) {
            return newStudentBook;
        }

        @Override
        public String toString() {
            return "Book for my English courses";
        }
    };

}
