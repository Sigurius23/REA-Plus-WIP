package up1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import l83.C23471q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: up1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lzr2/a;", "dateAndTimeProvider", "", "currentDate", "Ll83/q;", "", "a", "(Lzr2/a;Ljava/lang/String;)Ll83/q;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35152b {
    /* JADX INFO: renamed from: a */
    public static final C23471q m111203a(InterfaceC41070a dateAndTimeProvider, String currentDate) throws ParseException {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(currentDate);
        Calendar calendar = Calendar.getInstance();
        if (date == null) {
            date = dateAndTimeProvider.mo133364c().toDate();
        }
        calendar.setTime(date);
        return new C23471q(Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2)), Integer.valueOf(calendar.get(5)));
    }
}
