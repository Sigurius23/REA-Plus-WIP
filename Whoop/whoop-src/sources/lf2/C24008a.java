package lf2;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lf2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Llf2/a;", "", "", "alarmModeTypeTitle", "alarmModeTypeDescription", "Llf2/b;", "alarmType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llf2/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Llf2/b;", "()Llf2/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24008a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String alarmModeTypeTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String alarmModeTypeDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC24009b alarmType;

    public C24008a(String alarmModeTypeTitle, String alarmModeTypeDescription, EnumC24009b alarmType) {
        AbstractC22676k.m65750j(alarmModeTypeTitle, "alarmModeTypeTitle");
        AbstractC22676k.m65750j(alarmModeTypeDescription, "alarmModeTypeDescription");
        AbstractC22676k.m65750j(alarmType, "alarmType");
        this.alarmModeTypeTitle = alarmModeTypeTitle;
        this.alarmModeTypeDescription = alarmModeTypeDescription;
        this.alarmType = alarmType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlarmModeTypeDescription() {
        return this.alarmModeTypeDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAlarmModeTypeTitle() {
        return this.alarmModeTypeTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC24009b getAlarmType() {
        return this.alarmType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24008a)) {
            return false;
        }
        C24008a c24008a = (C24008a) other;
        return AbstractC22676k.m65745e(this.alarmModeTypeTitle, c24008a.alarmModeTypeTitle) && AbstractC22676k.m65745e(this.alarmModeTypeDescription, c24008a.alarmModeTypeDescription) && this.alarmType == c24008a.alarmType;
    }

    public int hashCode() {
        return this.alarmType.hashCode() + AbstractC11266d.m30450d(this.alarmModeTypeTitle.hashCode() * 31, 31, this.alarmModeTypeDescription);
    }

    public String toString() {
        String str = this.alarmModeTypeTitle;
        String str2 = this.alarmModeTypeDescription;
        EnumC24009b enumC24009b = this.alarmType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AlarmModeTypeViewState(alarmModeTypeTitle=", str, ", alarmModeTypeDescription=", str2, ", alarmType=");
        sbM32001t.append(enumC24009b);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
