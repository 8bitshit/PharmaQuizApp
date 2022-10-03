package com.example.pharmaquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val QUESTIONS_TOTAL: String = "cuestions_total"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val q1 = Question(1,
            "Przydatność diuretyków w leczeniu obrzęków ostrych (np. pluc) i przewlekłych opiera się na zdolności zwiększania wydalania NaCl i wody, co jest warunkiem niezbędnym do ich usunięcia. Obrzęki występujqce u kobiet ciężarnych:",

            "Sq wskazaniem do stosowania diuretyków.",
            "Nie sq wskazaniem do stosowania diuretyków.",
            "Sq wskazaniem do stosowania diuretyków w poczqtkowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w końcowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w dawkach subterapeutycznych.",

            1)

        questionList.add(q1)

        val q2 = Question(2,
            "Przydatność diuretyków w leczeniu obrzęków ostrych (np. pluc) i przewlekłych opiera się na zdolności zwiększania wydalania NaCl i wody, co jest warunkiem niezbędnym do ich usunięcia. Obrzęki występujqce u kobiet ciężarnych:",

            "Sq wskazaniem do stosowania diuretyków.",
            "Nie sq wskazaniem do stosowania diuretyków.",
            "Sq wskazaniem do stosowania diuretyków w poczqtkowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w końcowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w dawkach subterapeutycznych.",

            1)

        questionList.add(q2)

        val q3 = Question(3,
            "Przydatność diuretyków w leczeniu obrzęków ostrych (np. pluc) i przewlekłych opiera się na zdolności zwiększania wydalania NaCl i wody, co jest warunkiem niezbędnym do ich usunięcia. Obrzęki występujqce u kobiet ciężarnych:",

            "Sq wskazaniem do stosowania diuretyków.",
            "Nie sq wskazaniem do stosowania diuretyków.",
            "Sq wskazaniem do stosowania diuretyków w poczqtkowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w końcowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w dawkach subterapeutycznych.",

            1)

        questionList.add(q3)

        val q4 = Question(4,
            "Przydatność diuretyków w leczeniu obrzęków ostrych (np. pluc) i przewlekłych opiera się na zdolności zwiększania wydalania NaCl i wody, co jest warunkiem niezbędnym do ich usunięcia. Obrzęki występujqce u kobiet ciężarnych:",

            "Sq wskazaniem do stosowania diuretyków.",
            "Nie sq wskazaniem do stosowania diuretyków.",
            "Sq wskazaniem do stosowania diuretyków w poczqtkowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w końcowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w dawkach subterapeutycznych.",

            1)

        questionList.add(q4)


        val q5 = Question(5,
            "Przydatność diuretyków w leczeniu obrzęków ostrych (np. pluc) i przewlekłych opiera się na zdolności zwiększania wydalania NaCl i wody, co jest warunkiem niezbędnym do ich usunięcia. Obrzęki występujqce u kobiet ciężarnych:",

            "Sq wskazaniem do stosowania diuretyków.",
            "Nie sq wskazaniem do stosowania diuretyków.",
            "Sq wskazaniem do stosowania diuretyków w poczqtkowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w końcowym etapie ciqży.",
            "Sq wskazaniem do stosowania diuretyków w dawkach subterapeutycznych.",

            1)

        questionList.add(q5)

        return questionList
    }

}