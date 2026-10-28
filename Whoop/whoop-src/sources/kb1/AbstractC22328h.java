package kb1;

import com.whoop.design.models.calendar.CalendarDateModel;
import g51.C15493c;
import h91.C17027b;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qy0.InterfaceC30768a;

/* JADX INFO: renamed from: kb1.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\t\u001a\u00020\b2\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "domainState", "", "monthIndex", "", "isMCICalendarColorsOn", "Lg51/c;", "b", "(Lh91/b;IZ)Lg51/c;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22328h {
    /* JADX INFO: renamed from: b */
    public static final C15493c m64209b(C17027b<CalendarDateModel> domainState, int i13, boolean z4) {
        AbstractC22676k.m65750j(domainState, "domainState");
        return AbstractC22324d.m64148a(domainState, i13, new C19962a(new C22326f(z4), 12));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C15493c m64210c(C17027b c17027b, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        return m64209b(c17027b, i13, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC30768a m64211d(C22326f c22326f, C22325e dateArgs) {
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        return c22326f.m64175m(dateArgs);
    }
}
