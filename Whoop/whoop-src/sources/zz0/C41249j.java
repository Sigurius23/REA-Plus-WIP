package zz0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zz0.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lzz0/j;", "", "<init>", "()V", "", "dateTime", "Lzz0/m;", "b", "(Ljava/lang/String;)Lzz0/m;", "Lzz0/m;", "a", "()Lzz0/m;", "currentWindow", "c", "getMiddleWindow", "middleWindow", "d", "getOldestWindow", "oldestWindow", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41249j {

    /* JADX INFO: renamed from: a */
    public static final C41249j f177965a = new C41249j();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C41252m currentWindow = AbstractC41250k.m134008c("MAR '25 - MAY '25", AbstractC37056f.m118959K("MAR", "APR", "MAY"), true, null, "2025-02-01T00:00:00.000-05:00", 0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C41252m middleWindow = AbstractC41250k.m134008c("DEC '24 - FEB '25", AbstractC37056f.m118959K("DEC", "JAN", "FEB"), false, "2025-05-01T00:00:00.000-05:00", "2024-11-01T00:00:00.000-05:00", 3);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C41252m oldestWindow = AbstractC41250k.m134008c("SEP '24 - NOV '24", AbstractC37056f.m118959K("SEP", "OCT", "NOV"), false, "2025-02-01T00:00:00.000-05:00", null, 5);

    /* JADX INFO: renamed from: e */
    public static final int f177969e = 8;

    private C41249j() {
    }

    /* JADX INFO: renamed from: a */
    public final C41252m m134004a() {
        return currentWindow;
    }

    /* JADX INFO: renamed from: b */
    public final C41252m m134005b(String dateTime) {
        AbstractC22676k.m65750j(dateTime, "dateTime");
        C41252m c41252m = currentWindow;
        if (!dateTime.equals(c41252m.getDatePickerState().getPreviousDateTime())) {
            C41252m c41252m2 = oldestWindow;
            if (!dateTime.equals(c41252m2.getDatePickerState().getNextDateTime())) {
                C41252m c41252m3 = middleWindow;
                if (dateTime.equals(c41252m3.getDatePickerState().getPreviousDateTime())) {
                    return c41252m2;
                }
                dateTime.equals(c41252m3.getDatePickerState().getNextDateTime());
                return c41252m;
            }
        }
        return middleWindow;
    }
}
