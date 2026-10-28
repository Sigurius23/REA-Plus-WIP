package af2;

import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xe2.EnumC38233b;

/* JADX INFO: renamed from: af2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Laf2/d;", "", "", "repeatDaysHelperTextDisplay", "daysToScheduleLabelDisplay", "daysToScheduleButtonLabelDisplay", "", "Laf2/e;", "scheduleDayList", "helpIconLink", "Lxe2/b;", "nextState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxe2/b;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxe2/b;)Laf2/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "d", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "e", "Lxe2/b;", "getNextState", "()Lxe2/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0814d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String repeatDaysHelperTextDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String daysToScheduleLabelDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String daysToScheduleButtonLabelDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C0815e> scheduleDayList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String helpIconLink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC38233b nextState;

    public C0814d(String repeatDaysHelperTextDisplay, String daysToScheduleLabelDisplay, String daysToScheduleButtonLabelDisplay, List<C0815e> scheduleDayList, String helpIconLink, EnumC38233b nextState) {
        AbstractC22676k.m65750j(repeatDaysHelperTextDisplay, "repeatDaysHelperTextDisplay");
        AbstractC22676k.m65750j(daysToScheduleLabelDisplay, "daysToScheduleLabelDisplay");
        AbstractC22676k.m65750j(daysToScheduleButtonLabelDisplay, "daysToScheduleButtonLabelDisplay");
        AbstractC22676k.m65750j(scheduleDayList, "scheduleDayList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(nextState, "nextState");
        this.repeatDaysHelperTextDisplay = repeatDaysHelperTextDisplay;
        this.daysToScheduleLabelDisplay = daysToScheduleLabelDisplay;
        this.daysToScheduleButtonLabelDisplay = daysToScheduleButtonLabelDisplay;
        this.scheduleDayList = scheduleDayList;
        this.helpIconLink = helpIconLink;
        this.nextState = nextState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0814d m1982b(C0814d c0814d, String str, String str2, String str3, List list, String str4, EnumC38233b enumC38233b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0814d.repeatDaysHelperTextDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = c0814d.daysToScheduleLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = c0814d.daysToScheduleButtonLabelDisplay;
        }
        if ((i13 & 8) != 0) {
            list = c0814d.scheduleDayList;
        }
        if ((i13 & 16) != 0) {
            str4 = c0814d.helpIconLink;
        }
        if ((i13 & 32) != 0) {
            enumC38233b = c0814d.nextState;
        }
        String str5 = str4;
        EnumC38233b enumC38233b2 = enumC38233b;
        return c0814d.m1983a(str, str2, str3, list, str5, enumC38233b2);
    }

    /* JADX INFO: renamed from: a */
    public final C0814d m1983a(String repeatDaysHelperTextDisplay, String daysToScheduleLabelDisplay, String daysToScheduleButtonLabelDisplay, List<C0815e> scheduleDayList, String helpIconLink, EnumC38233b nextState) {
        AbstractC22676k.m65750j(repeatDaysHelperTextDisplay, "repeatDaysHelperTextDisplay");
        AbstractC22676k.m65750j(daysToScheduleLabelDisplay, "daysToScheduleLabelDisplay");
        AbstractC22676k.m65750j(daysToScheduleButtonLabelDisplay, "daysToScheduleButtonLabelDisplay");
        AbstractC22676k.m65750j(scheduleDayList, "scheduleDayList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(nextState, "nextState");
        return new C0814d(repeatDaysHelperTextDisplay, daysToScheduleLabelDisplay, daysToScheduleButtonLabelDisplay, scheduleDayList, helpIconLink, nextState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDaysToScheduleButtonLabelDisplay() {
        return this.daysToScheduleButtonLabelDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDaysToScheduleLabelDisplay() {
        return this.daysToScheduleLabelDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0814d)) {
            return false;
        }
        C0814d c0814d = (C0814d) other;
        return AbstractC22676k.m65745e(this.repeatDaysHelperTextDisplay, c0814d.repeatDaysHelperTextDisplay) && AbstractC22676k.m65745e(this.daysToScheduleLabelDisplay, c0814d.daysToScheduleLabelDisplay) && AbstractC22676k.m65745e(this.daysToScheduleButtonLabelDisplay, c0814d.daysToScheduleButtonLabelDisplay) && AbstractC22676k.m65745e(this.scheduleDayList, c0814d.scheduleDayList) && AbstractC22676k.m65745e(this.helpIconLink, c0814d.helpIconLink) && this.nextState == c0814d.nextState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRepeatDaysHelperTextDisplay() {
        return this.repeatDaysHelperTextDisplay;
    }

    /* JADX INFO: renamed from: g */
    public final List<C0815e> m1988g() {
        return this.scheduleDayList;
    }

    public int hashCode() {
        return this.nextState.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.repeatDaysHelperTextDisplay.hashCode() * 31, 31, this.daysToScheduleLabelDisplay), 31, this.daysToScheduleButtonLabelDisplay), 31, this.scheduleDayList), 31, this.helpIconLink);
    }

    public String toString() {
        String str = this.repeatDaysHelperTextDisplay;
        String str2 = this.daysToScheduleLabelDisplay;
        String str3 = this.daysToScheduleButtonLabelDisplay;
        List<C0815e> list = this.scheduleDayList;
        String str4 = this.helpIconLink;
        EnumC38233b enumC38233b = this.nextState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RepeatDaysDomainObject(repeatDaysHelperTextDisplay=", str, ", daysToScheduleLabelDisplay=", str2, ", daysToScheduleButtonLabelDisplay=");
        AbstractC36095b.m114694v(str3, ", scheduleDayList=", ", helpIconLink=", sbM32001t, list);
        sbM32001t.append(str4);
        sbM32001t.append(", nextState=");
        sbM32001t.append(enumC38233b);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
