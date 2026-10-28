package gz0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b!\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u0015R#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, m65681d2 = {"Lgz0/a0;", "", "", "hrvMax", "hrvMin", "hrvOutline", "menstrualCycle", "maxHeartRate", "recovery", "respiratoryRate", "rhr", "skinTemperature", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "f", "e", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16289a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int hrvMax;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int hrvMin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int hrvOutline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int menstrualCycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int maxHeartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int recovery;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int respiratoryRate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int rhr;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int skinTemperature;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16289a0(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.hrvMax = i13;
        this.hrvMin = i14;
        this.hrvOutline = i15;
        this.menstrualCycle = i16;
        this.maxHeartRate = i17;
        this.recovery = i18;
        this.respiratoryRate = i19;
        this.rhr = i24;
        this.skinTemperature = i25;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22396h<Integer>> m46132a() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHrvMax() {
        return this.hrvMax;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHrvMin() {
        return this.hrvMin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHrvOutline() {
        return this.hrvOutline;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16289a0)) {
            return false;
        }
        C16289a0 c16289a0 = (C16289a0) other;
        return this.hrvMax == c16289a0.hrvMax && this.hrvMin == c16289a0.hrvMin && this.hrvOutline == c16289a0.hrvOutline && this.menstrualCycle == c16289a0.menstrualCycle && this.maxHeartRate == c16289a0.maxHeartRate && this.recovery == c16289a0.recovery && this.respiratoryRate == c16289a0.respiratoryRate && this.rhr == c16289a0.rhr && this.skinTemperature == c16289a0.skinTemperature && AbstractC22676k.m65745e(this.descriptions, c16289a0.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMenstrualCycle() {
        return this.menstrualCycle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRespiratoryRate() {
        return this.respiratoryRate;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.skinTemperature, AbstractC11266d.m30448b(this.rhr, AbstractC11266d.m30448b(this.respiratoryRate, AbstractC11266d.m30448b(this.recovery, AbstractC11266d.m30448b(this.maxHeartRate, AbstractC11266d.m30448b(this.menstrualCycle, AbstractC11266d.m30448b(this.hrvOutline, AbstractC11266d.m30448b(this.hrvMin, Integer.hashCode(this.hrvMax) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getRhr() {
        return this.rhr;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSkinTemperature() {
        return this.skinTemperature;
    }

    public String toString() {
        int i13 = this.hrvMax;
        int i14 = this.hrvMin;
        int i15 = this.hrvOutline;
        int i16 = this.menstrualCycle;
        int i17 = this.maxHeartRate;
        int i18 = this.recovery;
        int i19 = this.respiratoryRate;
        int i24 = this.rhr;
        int i25 = this.skinTemperature;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "RecoveryIcons(hrvMax=", ", hrvMin=", ", hrvOutline=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", menstrualCycle=", i16, ", maxHeartRate=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", recovery=", i18, ", respiratoryRate=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", rhr=", i24, ", skinTemperature=");
        sbM30465s.append(i25);
        sbM30465s.append(", descriptions=");
        sbM30465s.append(list);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
