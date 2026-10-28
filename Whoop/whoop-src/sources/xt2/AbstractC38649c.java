package xt2;

import a61.C0472e;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.weeklyplan.weeklyplan.domain.models.GoalSection;
import java.util.Iterator;
import java.util.List;
import k71.C22256m;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import zt2.C41133b;
import zt2.C41139h;
import zt2.C41145n;

/* JADX INFO: renamed from: xt2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;", "goalSections", "", "a", "(Ljava/util/List;)Ljava/lang/String;", HttpHeaders.DATE, "Lorg/joda/time/LocalDate;", "todayDate", "", "b", "(Ljava/lang/String;Lorg/joda/time/LocalDate;)I", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38649c {
    /* JADX INFO: renamed from: a */
    public static final String m123892a(List<GoalSection> goalSections) {
        AbstractC22676k.m65750j(goalSections, "goalSections");
        Iterator<T> it = goalSections.iterator();
        while (it.hasNext()) {
            Iterator<T> it3 = ((GoalSection) it.next()).getGoalCards().iterator();
            while (it3.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = AbstractC38648b.m123880h().m60541h((DesignSystemModel) it3.next());
                if (interfaceC25312uM60541h instanceof C41145n) {
                    return "Locked";
                }
                if ((interfaceC25312uM60541h instanceof C41133b) || (interfaceC25312uM60541h instanceof C22256m) || (interfaceC25312uM60541h instanceof C41139h) || (interfaceC25312uM60541h instanceof C0472e)) {
                    return "Active Plan";
                }
            }
        }
        return "Empty State";
    }

    /* JADX INFO: renamed from: b */
    public static final int m123893b(String str, LocalDate todayDate) {
        AbstractC22676k.m65750j(todayDate, "todayDate");
        if (str == null) {
            return 0;
        }
        LocalDate localDate = LocalDate.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd"));
        return Days.daysBetween(localDate, todayDate).getDays() % 7 == 0 ? Days.daysBetween(localDate, todayDate).getDays() / 7 : (Days.daysBetween(localDate, todayDate).getDays() / 7) + 1;
    }
}
