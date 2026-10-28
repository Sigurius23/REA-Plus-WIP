package af2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xe2.EnumC38232a;
import xe2.EnumC38233b;

/* JADX INFO: renamed from: af2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Laf2/a;", "", "", "alarmModeTypeDisplay", "alarmModeTypeDescriptionDisplay", "Lxe2/b;", "nextState", "Lxe2/a;", "alarmModeState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lxe2/b;Lxe2/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lxe2/b;", "d", "()Lxe2/b;", "Lxe2/a;", "()Lxe2/a;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0811a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String alarmModeTypeDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String alarmModeTypeDescriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC38233b nextState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38232a alarmModeState;

    public C0811a(String alarmModeTypeDisplay, String alarmModeTypeDescriptionDisplay, EnumC38233b nextState, EnumC38232a alarmModeState) {
        AbstractC22676k.m65750j(alarmModeTypeDisplay, "alarmModeTypeDisplay");
        AbstractC22676k.m65750j(alarmModeTypeDescriptionDisplay, "alarmModeTypeDescriptionDisplay");
        AbstractC22676k.m65750j(nextState, "nextState");
        AbstractC22676k.m65750j(alarmModeState, "alarmModeState");
        this.alarmModeTypeDisplay = alarmModeTypeDisplay;
        this.alarmModeTypeDescriptionDisplay = alarmModeTypeDescriptionDisplay;
        this.nextState = nextState;
        this.alarmModeState = alarmModeState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC38232a getAlarmModeState() {
        return this.alarmModeState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAlarmModeTypeDescriptionDisplay() {
        return this.alarmModeTypeDescriptionDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAlarmModeTypeDisplay() {
        return this.alarmModeTypeDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC38233b getNextState() {
        return this.nextState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0811a)) {
            return false;
        }
        C0811a c0811a = (C0811a) other;
        return AbstractC22676k.m65745e(this.alarmModeTypeDisplay, c0811a.alarmModeTypeDisplay) && AbstractC22676k.m65745e(this.alarmModeTypeDescriptionDisplay, c0811a.alarmModeTypeDescriptionDisplay) && this.nextState == c0811a.nextState && this.alarmModeState == c0811a.alarmModeState;
    }

    public int hashCode() {
        return this.alarmModeState.hashCode() + ((this.nextState.hashCode() + AbstractC11266d.m30450d(this.alarmModeTypeDisplay.hashCode() * 31, 31, this.alarmModeTypeDescriptionDisplay)) * 31);
    }

    public String toString() {
        String str = this.alarmModeTypeDisplay;
        String str2 = this.alarmModeTypeDescriptionDisplay;
        EnumC38233b enumC38233b = this.nextState;
        EnumC38232a enumC38232a = this.alarmModeState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AlarmModeTypeDomainObject(alarmModeTypeDisplay=", str, ", alarmModeTypeDescriptionDisplay=", str2, ", nextState=");
        sbM32001t.append(enumC38233b);
        sbM32001t.append(", alarmModeState=");
        sbM32001t.append(enumC38232a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
