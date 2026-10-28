package af2;

import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xe2.EnumC38232a;

/* JADX INFO: renamed from: af2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Laf2/k;", "", "", "alarmModeDisplay", "", "Laf2/a;", "alarmModeTypeList", "helpIconLink", "Lxe2/a;", "currentSelectedAlarm", "", "isAlarmEnabled", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxe2/a;Z)V", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxe2/a;Z)Laf2/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "f", "Lxe2/a;", "e", "()Lxe2/a;", "Z", "g", "()Z", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0821k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String alarmModeDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C0811a> alarmModeTypeList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String helpIconLink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38232a currentSelectedAlarm;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isAlarmEnabled;

    public C0821k(String alarmModeDisplay, List<C0811a> alarmModeTypeList, String helpIconLink, EnumC38232a enumC38232a, boolean z4) {
        AbstractC22676k.m65750j(alarmModeDisplay, "alarmModeDisplay");
        AbstractC22676k.m65750j(alarmModeTypeList, "alarmModeTypeList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.alarmModeDisplay = alarmModeDisplay;
        this.alarmModeTypeList = alarmModeTypeList;
        this.helpIconLink = helpIconLink;
        this.currentSelectedAlarm = enumC38232a;
        this.isAlarmEnabled = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0821k m2020b(C0821k c0821k, String str, List list, String str2, EnumC38232a enumC38232a, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0821k.alarmModeDisplay;
        }
        if ((i13 & 2) != 0) {
            list = c0821k.alarmModeTypeList;
        }
        if ((i13 & 4) != 0) {
            str2 = c0821k.helpIconLink;
        }
        if ((i13 & 8) != 0) {
            enumC38232a = c0821k.currentSelectedAlarm;
        }
        if ((i13 & 16) != 0) {
            z4 = c0821k.isAlarmEnabled;
        }
        boolean z13 = z4;
        String str3 = str2;
        return c0821k.m2021a(str, list, str3, enumC38232a, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C0821k m2021a(String alarmModeDisplay, List<C0811a> alarmModeTypeList, String helpIconLink, EnumC38232a currentSelectedAlarm, boolean isAlarmEnabled) {
        AbstractC22676k.m65750j(alarmModeDisplay, "alarmModeDisplay");
        AbstractC22676k.m65750j(alarmModeTypeList, "alarmModeTypeList");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        return new C0821k(alarmModeDisplay, alarmModeTypeList, helpIconLink, currentSelectedAlarm, isAlarmEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAlarmModeDisplay() {
        return this.alarmModeDisplay;
    }

    /* JADX INFO: renamed from: d */
    public final List<C0811a> m2023d() {
        return this.alarmModeTypeList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC38232a getCurrentSelectedAlarm() {
        return this.currentSelectedAlarm;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0821k)) {
            return false;
        }
        C0821k c0821k = (C0821k) other;
        return AbstractC22676k.m65745e(this.alarmModeDisplay, c0821k.alarmModeDisplay) && AbstractC22676k.m65745e(this.alarmModeTypeList, c0821k.alarmModeTypeList) && AbstractC22676k.m65745e(this.helpIconLink, c0821k.helpIconLink) && this.currentSelectedAlarm == c0821k.currentSelectedAlarm && this.isAlarmEnabled == c0821k.isAlarmEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsAlarmEnabled() {
        return this.isAlarmEnabled;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.alarmModeDisplay.hashCode() * 31, 31, this.alarmModeTypeList), 31, this.helpIconLink);
        EnumC38232a enumC38232a = this.currentSelectedAlarm;
        return Boolean.hashCode(this.isAlarmEnabled) + ((iM30450d + (enumC38232a == null ? 0 : enumC38232a.hashCode())) * 31);
    }

    public String toString() {
        String str = this.alarmModeDisplay;
        List<C0811a> list = this.alarmModeTypeList;
        String str2 = this.helpIconLink;
        EnumC38232a enumC38232a = this.currentSelectedAlarm;
        boolean z4 = this.isAlarmEnabled;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("WakeModeDomainObject(alarmModeDisplay=", str, ", alarmModeTypeList=", ", helpIconLink=", list);
        sbM94766o.append(str2);
        sbM94766o.append(", currentSelectedAlarm=");
        sbM94766o.append(enumC38232a);
        sbM94766o.append(", isAlarmEnabled=");
        return AbstractC18489d0.m53372m(sbM94766o, z4, ")");
    }

    public /* synthetic */ C0821k(String str, List list, String str2, EnumC38232a enumC38232a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, (i13 & 8) != 0 ? null : enumC38232a, (i13 & 16) != 0 ? false : z4);
    }
}
