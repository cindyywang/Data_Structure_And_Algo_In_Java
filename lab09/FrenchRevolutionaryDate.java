public class FrenchRevolutionaryDate extends Date {

    /** In a nonleap year for the French Revolutionary Calendar, the first
     *  twelve months have 30 days and month 13 has five days.
     */
    public FrenchRevolutionaryDate(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    @Override
    public int dayOfYear() {
        return (month() - 1) * 30 + dayOfMonth();
    }
    //@Override
    public Date nextDate()
    {
        if(this.month() != 13)
        {
            if(this.dayOfMonth()!= 30)
            {
                return new FrenchRevolutionaryDate(this.year(),this.month(),this.dayOfMonth()+1);
            }
            else
            {
                return new FrenchRevolutionaryDate(this.year(),this.month()+1,1);
            }
        }
        else // 13th month
        {
            if(this.dayOfMonth() != 5)
            {
                return new FrenchRevolutionaryDate(this.year(),this.month(),this.dayOfMonth()+1);
            }
            else
            {
                return new FrenchRevolutionaryDate(this.year()+1,1,1);
            }
        }

    }
}
