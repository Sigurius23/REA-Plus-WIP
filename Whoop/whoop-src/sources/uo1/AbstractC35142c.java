package uo1;

import com.whoop.design.models.calendar.CalendarDateModel;
import g51.C15493c;
import h91.C17027b;
import kb1.AbstractC22324d;
import kb1.C22325e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qy0.InterfaceC30768a;

/* JADX INFO: renamed from: uo1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "domainState", "", "monthIndex", "Lg51/c;", "b", "(Lh91/b;I)Lg51/c;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35142c {
    /* JADX INFO: renamed from: b */
    public static final C15493c m111141b(C17027b<CalendarDateModel> domainState, int i13) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return AbstractC22324d.m64148a(domainState, i13, new C35141b(new C35140a(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final InterfaceC30768a m111142c(C35140a c35140a, C22325e dateArgs) {
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        return c35140a.m111116i(dateArgs);
    }
}
