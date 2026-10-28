package m11;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: m11.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lm11/a;", "", "", "value", "units", "", "achievementIconRes", "Ly81/f;", "valueColorKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ly81/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24929a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String units;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer achievementIconRes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f valueColorKey;

    public C24929a(String value, String str, Integer num, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
        this.units = str;
        this.achievementIconRes = num;
        this.valueColorKey = enumC39333f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAchievementIconRes() {
        return this.achievementIconRes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getValueColorKey() {
        return this.valueColorKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24929a)) {
            return false;
        }
        C24929a c24929a = (C24929a) other;
        return AbstractC22676k.m65745e(this.value, c24929a.value) && AbstractC22676k.m65745e(this.units, c24929a.units) && AbstractC22676k.m65745e(this.achievementIconRes, c24929a.achievementIconRes) && this.valueColorKey == c24929a.valueColorKey;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.units;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.achievementIconRes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        EnumC39333f enumC39333f = this.valueColorKey;
        return iHashCode3 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    public String toString() {
        String str = this.value;
        String str2 = this.units;
        Integer num = this.achievementIconRes;
        EnumC39333f enumC39333f = this.valueColorKey;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExerciseBreakdownCellViewState(value=", str, ", units=", str2, ", achievementIconRes=");
        sbM32001t.append(num);
        sbM32001t.append(", valueColorKey=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
