package cn0;

import ck1.C4780c;
import com.whoop.design.models.calendar.archmini.CalendarDayModel;
import g51.C15493c;
import h91.C17027b;
import kb1.AbstractC22324d;
import kb1.C22325e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qy0.InterfaceC30768a;

/* JADX INFO: renamed from: cn0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lh91/b;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "domainState", "", "monthIndex", "Lg51/c;", "b", "(Lh91/b;I)Lg51/c;", "calendar-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4848b {
    /* JADX INFO: renamed from: b */
    public static final C15493c m15461b(C17027b<CalendarDayModel> domainState, int i13) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return AbstractC22324d.m64148a(domainState, i13, new C4780c(new C4847a(), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC30768a m15462c(C4847a c4847a, C22325e dateArgs) {
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        return c4847a.m15436i(AbstractC4850d.m15467b(dateArgs), AbstractC4850d.m15466a(dateArgs));
    }
}
