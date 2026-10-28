package gz0;

import c13.AbstractC3855a;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0012R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, m65681d2 = {"Lgz0/c;", "", "", "activity", "cycling", "other", "running", "strengthTraining", "weightlifting", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "getStrengthTraining", "f", "g", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16292c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cycling;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int other;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int running;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int strengthTraining;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int weightlifting;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16292c(int i13, int i14, int i15, int i16, int i17, int i18, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.activity = i13;
        this.cycling = i14;
        this.other = i15;
        this.running = i16;
        this.strengthTraining = i17;
        this.weightlifting = i18;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActivity() {
        return this.activity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCycling() {
        return this.cycling;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22396h<Integer>> m46150c() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getOther() {
        return this.other;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRunning() {
        return this.running;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16292c)) {
            return false;
        }
        C16292c c16292c = (C16292c) other;
        return this.activity == c16292c.activity && this.cycling == c16292c.cycling && this.other == c16292c.other && this.running == c16292c.running && this.strengthTraining == c16292c.strengthTraining && this.weightlifting == c16292c.weightlifting && AbstractC22676k.m65745e(this.descriptions, c16292c.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWeightlifting() {
        return this.weightlifting;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.weightlifting, AbstractC11266d.m30448b(this.strengthTraining, AbstractC11266d.m30448b(this.running, AbstractC11266d.m30448b(this.other, AbstractC11266d.m30448b(this.cycling, Integer.hashCode(this.activity) * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        int i13 = this.activity;
        int i14 = this.cycling;
        int i15 = this.other;
        int i16 = this.running;
        int i17 = this.strengthTraining;
        int i18 = this.weightlifting;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ActivitiesIcons(activity=", ", cycling=", ", other=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", running=", i16, ", strengthTraining=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", weightlifting=", i18, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }
}
