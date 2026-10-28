package af2;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: af2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, m65681d2 = {"Laf2/e;", "", "Laf2/b;", "selectionState", "", "dayLabelDisplay", "dayOfWeekValue", "", "displayIndex", "<init>", "(Laf2/b;Ljava/lang/String;Ljava/lang/String;I)V", "a", "(Laf2/b;Ljava/lang/String;Ljava/lang/String;I)Laf2/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laf2/b;", "f", "()Laf2/b;", "b", "Ljava/lang/String;", "c", "d", "I", "e", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0815e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC0812b selectionState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String dayLabelDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String dayOfWeekValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int displayIndex;

    public C0815e(EnumC0812b selectionState, String dayLabelDisplay, String dayOfWeekValue, int i13) {
        AbstractC22676k.m65750j(selectionState, "selectionState");
        AbstractC22676k.m65750j(dayLabelDisplay, "dayLabelDisplay");
        AbstractC22676k.m65750j(dayOfWeekValue, "dayOfWeekValue");
        this.selectionState = selectionState;
        this.dayLabelDisplay = dayLabelDisplay;
        this.dayOfWeekValue = dayOfWeekValue;
        this.displayIndex = i13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0815e m1989b(C0815e c0815e, EnumC0812b enumC0812b, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            enumC0812b = c0815e.selectionState;
        }
        if ((i14 & 2) != 0) {
            str = c0815e.dayLabelDisplay;
        }
        if ((i14 & 4) != 0) {
            str2 = c0815e.dayOfWeekValue;
        }
        if ((i14 & 8) != 0) {
            i13 = c0815e.displayIndex;
        }
        return c0815e.m1990a(enumC0812b, str, str2, i13);
    }

    /* JADX INFO: renamed from: a */
    public final C0815e m1990a(EnumC0812b selectionState, String dayLabelDisplay, String dayOfWeekValue, int displayIndex) {
        AbstractC22676k.m65750j(selectionState, "selectionState");
        AbstractC22676k.m65750j(dayLabelDisplay, "dayLabelDisplay");
        AbstractC22676k.m65750j(dayOfWeekValue, "dayOfWeekValue");
        return new C0815e(selectionState, dayLabelDisplay, dayOfWeekValue, displayIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDayLabelDisplay() {
        return this.dayLabelDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDayOfWeekValue() {
        return this.dayOfWeekValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDisplayIndex() {
        return this.displayIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0815e)) {
            return false;
        }
        C0815e c0815e = (C0815e) other;
        return this.selectionState == c0815e.selectionState && AbstractC22676k.m65745e(this.dayLabelDisplay, c0815e.dayLabelDisplay) && AbstractC22676k.m65745e(this.dayOfWeekValue, c0815e.dayOfWeekValue) && this.displayIndex == c0815e.displayIndex;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC0812b getSelectionState() {
        return this.selectionState;
    }

    public int hashCode() {
        return Integer.hashCode(this.displayIndex) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.selectionState.hashCode() * 31, 31, this.dayLabelDisplay), 31, this.dayOfWeekValue);
    }

    public String toString() {
        return "ScheduleDayDomainObject(selectionState=" + this.selectionState + ", dayLabelDisplay=" + this.dayLabelDisplay + ", dayOfWeekValue=" + this.dayOfWeekValue + ", displayIndex=" + this.displayIndex + ")";
    }
}
