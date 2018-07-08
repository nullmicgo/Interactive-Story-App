package com.nullmicgo.itdogstory.model;

import com.nullmicgo.itdogstory.R;



public class Story {

    private Page[] pages;

    public Story() {
        pages = new Page[7];

        pages[0] = new Page(R.drawable.page0,
                R.string.page0,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page0_choice1, 1),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page0_choice2, 3));

        pages[1] = new Page(R.drawable.page2,
                R.string.page1,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page1_choice1, 0),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page1_choice2, 2));


        pages[2] = new Page(R.drawable.page8, R.string.page2);


        pages[3] = new Page(R.drawable.page0,
                R.string.page3,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page3_choice1, 4),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page3_choice2, 5));


        pages[4] = new Page(R.drawable.page9,
                R.string.page4,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page4_choice1, 4),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page4_choice2, 7));


        pages[5] = new Page(R.drawable.page1,
                R.string.page5,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page5_choice1, 6),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page5_choice2, 6));


        pages[6] = new Page(R.drawable.page6, R.string.page6);

        pages[7] = new Page(R.drawable.page4,
                R.string.page7,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page7_choice1, 8),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page7_choice2, 6));

        pages[8] = new Page(R.drawable.page3,
                R.string.page8,
                new com.nullmicgo.itdogstory.model.Choice(R.string.page8_choice1, 9),
                new com.nullmicgo.itdogstory.model.Choice(R.string.page8_choice2, 6));

        pages[9] = new Page(R.drawable.page5, R.string.page9);
    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];
    }
}








