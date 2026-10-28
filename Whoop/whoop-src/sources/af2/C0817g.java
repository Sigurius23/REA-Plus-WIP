package af2;

import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xe2.EnumC38233b;

/* JADX INFO: renamed from: af2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\"\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b \u0010\u0012¨\u0006("}, m65681d2 = {"Laf2/g;", "", "", "sleepGoalTextDisplay", "", "Laf2/h;", "sleepGoalList", "sleepGoalButtonTextDisplay", "Lxe2/b;", "nextState", "Laf2/i;", "selectedSleepGoalValue", "helpIconLink", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxe2/b;Laf2/i;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxe2/b;Laf2/i;Ljava/lang/String;)Laf2/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "e", "d", "Lxe2/b;", "getNextState", "()Lxe2/b;", "Laf2/i;", "()Laf2/i;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0817g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sleepGoalTextDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C0818h> sleepGoalList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sleepGoalButtonTextDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38233b nextState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC0819i selectedSleepGoalValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String helpIconLink;

    public C0817g(String sleepGoalTextDisplay, List<C0818h> sleepGoalList, String sleepGoalButtonTextDisplay, EnumC38233b nextState, EnumC0819i enumC0819i, String helpIconLink) {
        AbstractC22676k.m65750j(sleepGoalTextDisplay, "sleepGoalTextDisplay");
        AbstractC22676k.m65750j(sleepGoalList, "sleepGoalList");
        AbstractC22676k.m65750j(sleepGoalButtonTextDisplay, "sleepGoalButtonTextDisplay");
        AbstractC22676k.m65750j(nextState, "nextState");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.sleepGoalTextDisplay = sleepGoalTextDisplay;
        this.sleepGoalList = sleepGoalList;
        this.sleepGoalButtonTextDisplay = sleepGoalButtonTextDisplay;
        this.nextState = nextState;
        this.selectedSleepGoalValue = enumC0819i;
        this.helpIconLink = helpIconLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0817g m1996b(C0817g c0817g, String str, List list, String str2, EnumC38233b enumC38233b, EnumC0819i enumC0819i, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0817g.sleepGoalTextDisplay;
        }
        if ((i13 & 2) != 0) {
            list = c0817g.sleepGoalList;
        }
        if ((i13 & 4) != 0) {
            str2 = c0817g.sleepGoalButtonTextDisplay;
        }
        if ((i13 & 8) != 0) {
            enumC38233b = c0817g.nextState;
        }
        if ((i13 & 16) != 0) {
            enumC0819i = c0817g.selectedSleepGoalValue;
        }
        if ((i13 & 32) != 0) {
            str3 = c0817g.helpIconLink;
        }
        EnumC0819i enumC0819i2 = enumC0819i;
        String str4 = str3;
        return c0817g.m1997a(str, list, str2, enumC38233b, enumC0819i2, str4);
    }

    /* JADX INFO: renamed from: a */
    public final C0817g m1997a(String sleepGoalTextDisplay, List<C0818h> sleepGoalList, String sleepGoalButtonTextDisplay, EnumC38233b nextState, EnumC0819i selectedSleepGoalValue, String helpIconLink) {
        AbstractC22676k.m65750j(sleepGoalTextDisplay, "sleepGoalTextDisplay");
        AbstractC22676k.m65750j(sleepGoalList, "sleepGoalList");
        AbstractC22676k.m65750j(sleepGoalButtonTextDisplay, "sleepGoalButtonTextDisplay");
        AbstractC22676k.m65750j(nextState, "nextState");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        return new C0817g(sleepGoalTextDisplay, sleepGoalList, sleepGoalButtonTextDisplay, nextState, selectedSleepGoalValue, helpIconLink);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC0819i getSelectedSleepGoalValue() {
        return this.selectedSleepGoalValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSleepGoalButtonTextDisplay() {
        return this.sleepGoalButtonTextDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0817g)) {
            return false;
        }
        C0817g c0817g = (C0817g) other;
        return AbstractC22676k.m65745e(this.sleepGoalTextDisplay, c0817g.sleepGoalTextDisplay) && AbstractC22676k.m65745e(this.sleepGoalList, c0817g.sleepGoalList) && AbstractC22676k.m65745e(this.sleepGoalButtonTextDisplay, c0817g.sleepGoalButtonTextDisplay) && this.nextState == c0817g.nextState && this.selectedSleepGoalValue == c0817g.selectedSleepGoalValue && AbstractC22676k.m65745e(this.helpIconLink, c0817g.helpIconLink);
    }

    /* JADX INFO: renamed from: f */
    public final List<C0818h> m2001f() {
        return this.sleepGoalList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSleepGoalTextDisplay() {
        return this.sleepGoalTextDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.nextState.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.sleepGoalTextDisplay.hashCode() * 31, 31, this.sleepGoalList), 31, this.sleepGoalButtonTextDisplay)) * 31;
        EnumC0819i enumC0819i = this.selectedSleepGoalValue;
        return this.helpIconLink.hashCode() + ((iHashCode + (enumC0819i == null ? 0 : enumC0819i.hashCode())) * 31);
    }

    public String toString() {
        String str = this.sleepGoalTextDisplay;
        List<C0818h> list = this.sleepGoalList;
        String str2 = this.sleepGoalButtonTextDisplay;
        EnumC38233b enumC38233b = this.nextState;
        EnumC0819i enumC0819i = this.selectedSleepGoalValue;
        String str3 = this.helpIconLink;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SleepGoalDomainObject(sleepGoalTextDisplay=", str, ", sleepGoalList=", ", sleepGoalButtonTextDisplay=", list);
        sbM94766o.append(str2);
        sbM94766o.append(", nextState=");
        sbM94766o.append(enumC38233b);
        sbM94766o.append(", selectedSleepGoalValue=");
        sbM94766o.append(enumC0819i);
        sbM94766o.append(", helpIconLink=");
        sbM94766o.append(str3);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ C0817g(String str, List list, String str2, EnumC38233b enumC38233b, EnumC0819i enumC0819i, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, enumC38233b, (i13 & 16) != 0 ? null : enumC0819i, str3);
    }
}
