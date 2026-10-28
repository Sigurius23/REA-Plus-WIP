package gz0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.e0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b)\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b+\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b.\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b/\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b8\u0010\u001fR#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b&\u0010<¨\u0006="}, m65681d2 = {"Lgz0/e0;", "", "", "calories", "heartRate", "hrZonesTraining", "hrZones3", "hrZones4_5", "hrZone1", "hrZone2", "hrZone3", "hrZone4", "hrZone5", "leanBodyMass", "list", "sedentaryTime", "steps", "strain", "superset", "tonnage", "totalVolumeLoad", "vo2Max", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "k", "d", "i", "e", "j", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getLeanBodyMass", "l", "m", "getSedentaryTime", "n", "o", "p", "q", "r", "s", "t", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16297e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int calories;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int heartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int hrZonesTraining;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int hrZones3;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int hrZones4_5;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int hrZone1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int hrZone2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int hrZone3;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int hrZone4;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int hrZone5;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int leanBodyMass;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int list;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int sedentaryTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int steps;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int strain;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int superset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int tonnage;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int totalVolumeLoad;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int vo2Max;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16297e0(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, int i37, int i38, int i39, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.calories = i13;
        this.heartRate = i14;
        this.hrZonesTraining = i15;
        this.hrZones3 = i16;
        this.hrZones4_5 = i17;
        this.hrZone1 = i18;
        this.hrZone2 = i19;
        this.hrZone3 = i24;
        this.hrZone4 = i25;
        this.hrZone5 = i26;
        this.leanBodyMass = i27;
        this.list = i28;
        this.sedentaryTime = i29;
        this.steps = i34;
        this.strain = i35;
        this.superset = i36;
        this.tonnage = i37;
        this.totalVolumeLoad = i38;
        this.vo2Max = i39;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: b */
    public final List<C22396h<Integer>> m46176b() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHrZone1() {
        return this.hrZone1;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHrZone2() {
        return this.hrZone2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16297e0)) {
            return false;
        }
        C16297e0 c16297e0 = (C16297e0) other;
        return this.calories == c16297e0.calories && this.heartRate == c16297e0.heartRate && this.hrZonesTraining == c16297e0.hrZonesTraining && this.hrZones3 == c16297e0.hrZones3 && this.hrZones4_5 == c16297e0.hrZones4_5 && this.hrZone1 == c16297e0.hrZone1 && this.hrZone2 == c16297e0.hrZone2 && this.hrZone3 == c16297e0.hrZone3 && this.hrZone4 == c16297e0.hrZone4 && this.hrZone5 == c16297e0.hrZone5 && this.leanBodyMass == c16297e0.leanBodyMass && this.list == c16297e0.list && this.sedentaryTime == c16297e0.sedentaryTime && this.steps == c16297e0.steps && this.strain == c16297e0.strain && this.superset == c16297e0.superset && this.tonnage == c16297e0.tonnage && this.totalVolumeLoad == c16297e0.totalVolumeLoad && this.vo2Max == c16297e0.vo2Max && AbstractC22676k.m65745e(this.descriptions, c16297e0.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHrZone3() {
        return this.hrZone3;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getHrZone4() {
        return this.hrZone4;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getHrZone5() {
        return this.hrZone5;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.vo2Max, AbstractC11266d.m30448b(this.totalVolumeLoad, AbstractC11266d.m30448b(this.tonnage, AbstractC11266d.m30448b(this.superset, AbstractC11266d.m30448b(this.strain, AbstractC11266d.m30448b(this.steps, AbstractC11266d.m30448b(this.sedentaryTime, AbstractC11266d.m30448b(this.list, AbstractC11266d.m30448b(this.leanBodyMass, AbstractC11266d.m30448b(this.hrZone5, AbstractC11266d.m30448b(this.hrZone4, AbstractC11266d.m30448b(this.hrZone3, AbstractC11266d.m30448b(this.hrZone2, AbstractC11266d.m30448b(this.hrZone1, AbstractC11266d.m30448b(this.hrZones4_5, AbstractC11266d.m30448b(this.hrZones3, AbstractC11266d.m30448b(this.hrZonesTraining, AbstractC11266d.m30448b(this.heartRate, Integer.hashCode(this.calories) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getHrZones3() {
        return this.hrZones3;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getHrZones4_5() {
        return this.hrZones4_5;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getHrZonesTraining() {
        return this.hrZonesTraining;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getList() {
        return this.list;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getStrain() {
        return this.strain;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSuperset() {
        return this.superset;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getTonnage() {
        return this.tonnage;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getTotalVolumeLoad() {
        return this.totalVolumeLoad;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getVo2Max() {
        return this.vo2Max;
    }

    public String toString() {
        int i13 = this.calories;
        int i14 = this.heartRate;
        int i15 = this.hrZonesTraining;
        int i16 = this.hrZones3;
        int i17 = this.hrZones4_5;
        int i18 = this.hrZone1;
        int i19 = this.hrZone2;
        int i24 = this.hrZone3;
        int i25 = this.hrZone4;
        int i26 = this.hrZone5;
        int i27 = this.leanBodyMass;
        int i28 = this.list;
        int i29 = this.sedentaryTime;
        int i34 = this.steps;
        int i35 = this.strain;
        int i36 = this.superset;
        int i37 = this.tonnage;
        int i38 = this.totalVolumeLoad;
        int i39 = this.vo2Max;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "StrainIcons(calories=", ", heartRate=", ", hrZonesTraining=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", hrZones3=", i16, ", hrZones4_5=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", hrZone1=", i18, ", hrZone2=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", hrZone3=", i24, ", hrZone4=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", hrZone5=", i26, ", leanBodyMass=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", list=", i28, ", sedentaryTime=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", steps=", i34, ", strain=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", superset=", i36, ", tonnage=");
        AbstractC30802r.m94773v(sbM30465s, i37, ", totalVolumeLoad=", i38, ", vo2Max=");
        sbM30465s.append(i39);
        sbM30465s.append(", descriptions=");
        sbM30465s.append(list);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
