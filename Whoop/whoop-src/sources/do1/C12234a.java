package do1;

import co1.C4859a;
import co1.C4860b;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.calendar.CalendarDayState;
import com.whoop.design.models.calendar.CalendarOverlay;
import com.whoop.design.models.calendar.CalendarOverlayType;
import kb1.C22325e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import xn1.AbstractC38479b;

/* JADX INFO: renamed from: do1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Ldo1/a;", "", "<init>", "()V", "Lcom/whoop/design/models/calendar/CalendarOverlay;", "overlay", "Lco1/b;", "b", "(Lcom/whoop/design/models/calendar/CalendarOverlay;)Lco1/b;", "Lkb1/e;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;", "dateArgs", "Lco1/a;", "a", "(Lkb1/e;)Lco1/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12234a {
    /* JADX INFO: renamed from: b */
    private final C4860b m34024b(CalendarOverlay overlay) {
        return new C4860b(EnumC39333f.SURFACE_MCI_OVULATORY, (float) 1.5d, overlay.getType() == CalendarOverlayType.FERTILE_WINDOW_FUTURE, overlay.getFirstDayOfOverlay(), overlay.getLastDayOfOverlay(), null);
    }

    /* JADX INFO: renamed from: a */
    public final C4859a m34025a(C22325e<CalendarDateModel> dateArgs) {
        AbstractC22676k.m65750j(dateArgs, "dateArgs");
        CalendarDateModel calendarDateModelM64155g = dateArgs.m64155g();
        if (calendarDateModelM64155g != null) {
            CalendarOverlay overlay = calendarDateModelM64155g.getOverlay();
            boolean z4 = calendarDateModelM64155g.getDayState() == CalendarDayState.OVULATION;
            if (overlay != null || z4) {
                return new C4859a(z4 ? Integer.valueOf(AbstractC38479b.f164853a) : null, overlay != null ? m34024b(overlay) : null);
            }
        }
        return null;
    }
}
