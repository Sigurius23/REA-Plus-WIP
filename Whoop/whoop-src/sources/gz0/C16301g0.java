package gz0;

import c13.AbstractC3855a;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.g0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u0012R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, m65681d2 = {"Lgz0/g0;", "", "", "pairStrap", "removeStrap", "strap", "strapCutout", "strapVibration", "strapSettings", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "g", "f", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16301g0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int pairStrap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int removeStrap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int strap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int strapCutout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int strapVibration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int strapSettings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16301g0(int i13, int i14, int i15, int i16, int i17, int i18, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.pairStrap = i13;
        this.removeStrap = i14;
        this.strap = i15;
        this.strapCutout = i16;
        this.strapVibration = i17;
        this.strapSettings = i18;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22396h<Integer>> m46211a() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPairStrap() {
        return this.pairStrap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRemoveStrap() {
        return this.removeStrap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStrap() {
        return this.strap;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStrapCutout() {
        return this.strapCutout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16301g0)) {
            return false;
        }
        C16301g0 c16301g0 = (C16301g0) other;
        return this.pairStrap == c16301g0.pairStrap && this.removeStrap == c16301g0.removeStrap && this.strap == c16301g0.strap && this.strapCutout == c16301g0.strapCutout && this.strapVibration == c16301g0.strapVibration && this.strapSettings == c16301g0.strapSettings && AbstractC22676k.m65745e(this.descriptions, c16301g0.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getStrapSettings() {
        return this.strapSettings;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStrapVibration() {
        return this.strapVibration;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.strapSettings, AbstractC11266d.m30448b(this.strapVibration, AbstractC11266d.m30448b(this.strapCutout, AbstractC11266d.m30448b(this.strap, AbstractC11266d.m30448b(this.removeStrap, Integer.hashCode(this.pairStrap) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        int i13 = this.pairStrap;
        int i14 = this.removeStrap;
        int i15 = this.strap;
        int i16 = this.strapCutout;
        int i17 = this.strapVibration;
        int i18 = this.strapSettings;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "StrapIcons(pairStrap=", ", removeStrap=", ", strap=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", strapCutout=", i16, ", strapVibration=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", strapSettings=", i18, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }
}
