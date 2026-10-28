package gz0;

import c13.AbstractC3855a;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b2\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b9\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b:\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b;\u0010$R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b<\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b8\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b=\u0010$R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b>\u0010$R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b.\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b6\u0010$R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010$R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b)\u0010$R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b,\u0010$R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b0\u0010$R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010*\u001a\u0004\b4\u0010$R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\bA\u0010$R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010$R#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, m65681d2 = {"Lgz0/q;", "", "", "shepherd", "postpartum", "pregnancy", "pregnancyFirstTrimester", "pregnancySecondTrimester", "pregnancyThirdTrimester", "segmentalBodyComposition", LabsCampaign.LABRADOR_ENTRY, "singleBaby", "tripletsOrMore", "twins", "weight", "picker", "sage", "slowPaceOfAging", "fastPaceOfAging", "paceOfAging", "whoopAge", "bloodPressure", "cholesterol", "hba1c", "omron", "dayStress", "nonActivityStress", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "p", "b", "i", "c", "j", "d", "k", "e", "l", "f", "m", "g", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "q", "s", "t", "u", "n", "r", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "getDayStress", "x", "getNonActivityStress", "y", "Ljava/util/List;", "getDescriptions", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16320q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int shepherd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int postpartum;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pregnancy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int pregnancyFirstTrimester;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int pregnancySecondTrimester;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int pregnancyThirdTrimester;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int segmentalBodyComposition;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int labrador;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int singleBaby;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int tripletsOrMore;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int twins;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int weight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int picker;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int sage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int slowPaceOfAging;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int fastPaceOfAging;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int paceOfAging;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int whoopAge;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int bloodPressure;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int cholesterol;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int hba1c;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int omron;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int dayStress;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int nonActivityStress;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16320q(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, int i37, int i38, int i39, int i44, int i45, int i46, int i47, int i48, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.shepherd = i13;
        this.postpartum = i14;
        this.pregnancy = i15;
        this.pregnancyFirstTrimester = i16;
        this.pregnancySecondTrimester = i17;
        this.pregnancyThirdTrimester = i18;
        this.segmentalBodyComposition = i19;
        this.labrador = i24;
        this.singleBaby = i25;
        this.tripletsOrMore = i26;
        this.twins = i27;
        this.weight = i28;
        this.picker = i29;
        this.sage = i34;
        this.slowPaceOfAging = i35;
        this.fastPaceOfAging = i36;
        this.paceOfAging = i37;
        this.whoopAge = i38;
        this.bloodPressure = i39;
        this.cholesterol = i44;
        this.hba1c = i45;
        this.omron = i46;
        this.dayStress = i47;
        this.nonActivityStress = i48;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBloodPressure() {
        return this.bloodPressure;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCholesterol() {
        return this.cholesterol;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFastPaceOfAging() {
        return this.fastPaceOfAging;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getHba1c() {
        return this.hba1c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getLabrador() {
        return this.labrador;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16320q)) {
            return false;
        }
        C16320q c16320q = (C16320q) other;
        return this.shepherd == c16320q.shepherd && this.postpartum == c16320q.postpartum && this.pregnancy == c16320q.pregnancy && this.pregnancyFirstTrimester == c16320q.pregnancyFirstTrimester && this.pregnancySecondTrimester == c16320q.pregnancySecondTrimester && this.pregnancyThirdTrimester == c16320q.pregnancyThirdTrimester && this.segmentalBodyComposition == c16320q.segmentalBodyComposition && this.labrador == c16320q.labrador && this.singleBaby == c16320q.singleBaby && this.tripletsOrMore == c16320q.tripletsOrMore && this.twins == c16320q.twins && this.weight == c16320q.weight && this.picker == c16320q.picker && this.sage == c16320q.sage && this.slowPaceOfAging == c16320q.slowPaceOfAging && this.fastPaceOfAging == c16320q.fastPaceOfAging && this.paceOfAging == c16320q.paceOfAging && this.whoopAge == c16320q.whoopAge && this.bloodPressure == c16320q.bloodPressure && this.cholesterol == c16320q.cholesterol && this.hba1c == c16320q.hba1c && this.omron == c16320q.omron && this.dayStress == c16320q.dayStress && this.nonActivityStress == c16320q.nonActivityStress && AbstractC22676k.m65745e(this.descriptions, c16320q.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOmron() {
        return this.omron;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPaceOfAging() {
        return this.paceOfAging;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPicker() {
        return this.picker;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.nonActivityStress, AbstractC11266d.m30448b(this.dayStress, AbstractC11266d.m30448b(this.omron, AbstractC11266d.m30448b(this.hba1c, AbstractC11266d.m30448b(this.cholesterol, AbstractC11266d.m30448b(this.bloodPressure, AbstractC11266d.m30448b(this.whoopAge, AbstractC11266d.m30448b(this.paceOfAging, AbstractC11266d.m30448b(this.fastPaceOfAging, AbstractC11266d.m30448b(this.slowPaceOfAging, AbstractC11266d.m30448b(this.sage, AbstractC11266d.m30448b(this.picker, AbstractC11266d.m30448b(this.weight, AbstractC11266d.m30448b(this.twins, AbstractC11266d.m30448b(this.tripletsOrMore, AbstractC11266d.m30448b(this.singleBaby, AbstractC11266d.m30448b(this.labrador, AbstractC11266d.m30448b(this.segmentalBodyComposition, AbstractC11266d.m30448b(this.pregnancyThirdTrimester, AbstractC11266d.m30448b(this.pregnancySecondTrimester, AbstractC11266d.m30448b(this.pregnancyFirstTrimester, AbstractC11266d.m30448b(this.pregnancy, AbstractC11266d.m30448b(this.postpartum, Integer.hashCode(this.shepherd) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPostpartum() {
        return this.postpartum;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getPregnancy() {
        return this.pregnancy;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getPregnancyFirstTrimester() {
        return this.pregnancyFirstTrimester;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPregnancySecondTrimester() {
        return this.pregnancySecondTrimester;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getPregnancyThirdTrimester() {
        return this.pregnancyThirdTrimester;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSage() {
        return this.sage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getSegmentalBodyComposition() {
        return this.segmentalBodyComposition;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getShepherd() {
        return this.shepherd;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getSingleBaby() {
        return this.singleBaby;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getSlowPaceOfAging() {
        return this.slowPaceOfAging;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getTripletsOrMore() {
        return this.tripletsOrMore;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTwins() {
        return this.twins;
    }

    public String toString() {
        int i13 = this.shepherd;
        int i14 = this.postpartum;
        int i15 = this.pregnancy;
        int i16 = this.pregnancyFirstTrimester;
        int i17 = this.pregnancySecondTrimester;
        int i18 = this.pregnancyThirdTrimester;
        int i19 = this.segmentalBodyComposition;
        int i24 = this.labrador;
        int i25 = this.singleBaby;
        int i26 = this.tripletsOrMore;
        int i27 = this.twins;
        int i28 = this.weight;
        int i29 = this.picker;
        int i34 = this.sage;
        int i35 = this.slowPaceOfAging;
        int i36 = this.fastPaceOfAging;
        int i37 = this.paceOfAging;
        int i38 = this.whoopAge;
        int i39 = this.bloodPressure;
        int i44 = this.cholesterol;
        int i45 = this.hba1c;
        int i46 = this.omron;
        int i47 = this.dayStress;
        int i48 = this.nonActivityStress;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "HealthIcons(shepherd=", ", postpartum=", ", pregnancy=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", pregnancyFirstTrimester=", i16, ", pregnancySecondTrimester=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", pregnancyThirdTrimester=", i18, ", segmentalBodyComposition=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", labrador=", i24, ", singleBaby=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", tripletsOrMore=", i26, ", twins=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", weight=", i28, ", picker=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", sage=", i34, ", slowPaceOfAging=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", fastPaceOfAging=", i36, ", paceOfAging=");
        AbstractC30802r.m94773v(sbM30465s, i37, ", whoopAge=", i38, ", bloodPressure=");
        AbstractC30802r.m94773v(sbM30465s, i39, ", cholesterol=", i44, ", hba1c=");
        AbstractC30802r.m94773v(sbM30465s, i45, ", omron=", i46, ", dayStress=");
        AbstractC30802r.m94773v(sbM30465s, i47, ", nonActivityStress=", i48, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getWhoopAge() {
        return this.whoopAge;
    }
}
