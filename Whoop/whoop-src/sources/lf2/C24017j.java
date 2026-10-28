package lf2;

import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001e"}, m65681d2 = {"Llf2/j;", "", "", "bottomSheetTitle", "", "Llf2/a;", "alarmTypeList", "Llf2/c;", "noAlarmState", "helpIconLink", "<init>", "(Ljava/lang/String;Ljava/util/List;Llf2/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Llf2/c;", "d", "()Llf2/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24017j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C24008a> alarmTypeList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24010c noAlarmState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String helpIconLink;

    public C24017j(String bottomSheetTitle, List<C24008a> alarmTypeList, C24010c noAlarmState, String helpIconLink) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(alarmTypeList, "alarmTypeList");
        AbstractC22676k.m65750j(noAlarmState, "noAlarmState");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.bottomSheetTitle = bottomSheetTitle;
        this.alarmTypeList = alarmTypeList;
        this.noAlarmState = noAlarmState;
        this.helpIconLink = helpIconLink;
    }

    /* JADX INFO: renamed from: a */
    public final List<C24008a> m70850a() {
        return this.alarmTypeList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C24010c getNoAlarmState() {
        return this.noAlarmState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24017j)) {
            return false;
        }
        C24017j c24017j = (C24017j) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, c24017j.bottomSheetTitle) && AbstractC22676k.m65745e(this.alarmTypeList, c24017j.alarmTypeList) && AbstractC22676k.m65745e(this.noAlarmState, c24017j.noAlarmState) && AbstractC22676k.m65745e(this.helpIconLink, c24017j.helpIconLink);
    }

    public int hashCode() {
        return this.helpIconLink.hashCode() + ((this.noAlarmState.hashCode() + AbstractC11895b.m31983b(this.bottomSheetTitle.hashCode() * 31, 31, this.alarmTypeList)) * 31);
    }

    public String toString() {
        String str = this.bottomSheetTitle;
        List<C24008a> list = this.alarmTypeList;
        C24010c c24010c = this.noAlarmState;
        String str2 = this.helpIconLink;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("WakeModeViewState(bottomSheetTitle=", str, ", alarmTypeList=", ", noAlarmState=", list);
        sbM94766o.append(c24010c);
        sbM94766o.append(", helpIconLink=");
        sbM94766o.append(str2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
