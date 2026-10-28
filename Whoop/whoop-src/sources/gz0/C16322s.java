package gz0;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b%\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b&\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b'\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b(\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b)\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b*\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b+\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b-\u0010\u001aR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lgz0/s;", "", "", "creamyCervicalMucus", "dryCervicalMucus", "eggWhiteCervicalMucus", "glueLikeCervicalMucus", "heavyPeriodFlow", "intrauterineDevice", "lightPeriodFlow", "mediumPeriodFlow", "nonePeriodFlow", "somethingWrongCervicalMucus", "spottingCervicalMucus", "spottingFlow", "stickyCervicalMucus", "wateryCervicalMucus", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "j", "k", "l", "m", "n", "o", "Ljava/util/List;", "getDescriptions", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16322s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int creamyCervicalMucus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int dryCervicalMucus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int eggWhiteCervicalMucus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int glueLikeCervicalMucus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int heavyPeriodFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int intrauterineDevice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int lightPeriodFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int mediumPeriodFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int nonePeriodFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int somethingWrongCervicalMucus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int spottingCervicalMucus;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int spottingFlow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int stickyCervicalMucus;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int wateryCervicalMucus;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16322s(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.creamyCervicalMucus = i13;
        this.dryCervicalMucus = i14;
        this.eggWhiteCervicalMucus = i15;
        this.glueLikeCervicalMucus = i16;
        this.heavyPeriodFlow = i17;
        this.intrauterineDevice = i18;
        this.lightPeriodFlow = i19;
        this.mediumPeriodFlow = i24;
        this.nonePeriodFlow = i25;
        this.somethingWrongCervicalMucus = i26;
        this.spottingCervicalMucus = i27;
        this.spottingFlow = i28;
        this.stickyCervicalMucus = i29;
        this.wateryCervicalMucus = i34;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCreamyCervicalMucus() {
        return this.creamyCervicalMucus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDryCervicalMucus() {
        return this.dryCervicalMucus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEggWhiteCervicalMucus() {
        return this.eggWhiteCervicalMucus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getGlueLikeCervicalMucus() {
        return this.glueLikeCervicalMucus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHeavyPeriodFlow() {
        return this.heavyPeriodFlow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16322s)) {
            return false;
        }
        C16322s c16322s = (C16322s) other;
        return this.creamyCervicalMucus == c16322s.creamyCervicalMucus && this.dryCervicalMucus == c16322s.dryCervicalMucus && this.eggWhiteCervicalMucus == c16322s.eggWhiteCervicalMucus && this.glueLikeCervicalMucus == c16322s.glueLikeCervicalMucus && this.heavyPeriodFlow == c16322s.heavyPeriodFlow && this.intrauterineDevice == c16322s.intrauterineDevice && this.lightPeriodFlow == c16322s.lightPeriodFlow && this.mediumPeriodFlow == c16322s.mediumPeriodFlow && this.nonePeriodFlow == c16322s.nonePeriodFlow && this.somethingWrongCervicalMucus == c16322s.somethingWrongCervicalMucus && this.spottingCervicalMucus == c16322s.spottingCervicalMucus && this.spottingFlow == c16322s.spottingFlow && this.stickyCervicalMucus == c16322s.stickyCervicalMucus && this.wateryCervicalMucus == c16322s.wateryCervicalMucus && AbstractC22676k.m65745e(this.descriptions, c16322s.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getIntrauterineDevice() {
        return this.intrauterineDevice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getLightPeriodFlow() {
        return this.lightPeriodFlow;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMediumPeriodFlow() {
        return this.mediumPeriodFlow;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.wateryCervicalMucus, AbstractC11266d.m30448b(this.stickyCervicalMucus, AbstractC11266d.m30448b(this.spottingFlow, AbstractC11266d.m30448b(this.spottingCervicalMucus, AbstractC11266d.m30448b(this.somethingWrongCervicalMucus, AbstractC11266d.m30448b(this.nonePeriodFlow, AbstractC11266d.m30448b(this.mediumPeriodFlow, AbstractC11266d.m30448b(this.lightPeriodFlow, AbstractC11266d.m30448b(this.intrauterineDevice, AbstractC11266d.m30448b(this.heavyPeriodFlow, AbstractC11266d.m30448b(this.glueLikeCervicalMucus, AbstractC11266d.m30448b(this.eggWhiteCervicalMucus, AbstractC11266d.m30448b(this.dryCervicalMucus, Integer.hashCode(this.creamyCervicalMucus) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getNonePeriodFlow() {
        return this.nonePeriodFlow;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSomethingWrongCervicalMucus() {
        return this.somethingWrongCervicalMucus;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSpottingCervicalMucus() {
        return this.spottingCervicalMucus;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getSpottingFlow() {
        return this.spottingFlow;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getStickyCervicalMucus() {
        return this.stickyCervicalMucus;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getWateryCervicalMucus() {
        return this.wateryCervicalMucus;
    }

    public String toString() {
        int i13 = this.creamyCervicalMucus;
        int i14 = this.dryCervicalMucus;
        int i15 = this.eggWhiteCervicalMucus;
        int i16 = this.glueLikeCervicalMucus;
        int i17 = this.heavyPeriodFlow;
        int i18 = this.intrauterineDevice;
        int i19 = this.lightPeriodFlow;
        int i24 = this.mediumPeriodFlow;
        int i25 = this.nonePeriodFlow;
        int i26 = this.somethingWrongCervicalMucus;
        int i27 = this.spottingCervicalMucus;
        int i28 = this.spottingFlow;
        int i29 = this.stickyCervicalMucus;
        int i34 = this.wateryCervicalMucus;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "HormonalHealthIcons(creamyCervicalMucus=", ", dryCervicalMucus=", ", eggWhiteCervicalMucus=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", glueLikeCervicalMucus=", i16, ", heavyPeriodFlow=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", intrauterineDevice=", i18, ", lightPeriodFlow=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", mediumPeriodFlow=", i24, ", nonePeriodFlow=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", somethingWrongCervicalMucus=", i26, ", spottingCervicalMucus=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", spottingFlow=", i28, ", stickyCervicalMucus=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", wateryCervicalMucus=", i34, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }
}
