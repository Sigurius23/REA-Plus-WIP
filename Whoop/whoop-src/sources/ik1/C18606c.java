package ik1;

import c13.AbstractC3855a;
import c51.C4242s;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ik1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lik1/c;", "", "Lc51/s;", "amoeba", "", "onStep", "", "Lik1/b;", "steps", "<init>", "(Lc51/s;ILjava/util/List;)V", "a", "(Lc51/s;ILjava/util/List;)Lik1/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc51/s;", "c", "()Lc51/s;", "b", "I", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18606c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4242s amoeba;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int onStep;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C18605b> steps;

    public C18606c(C4242s amoeba, int i13, List<C18605b> steps) {
        AbstractC22676k.m65750j(amoeba, "amoeba");
        AbstractC22676k.m65750j(steps, "steps");
        this.amoeba = amoeba;
        this.onStep = i13;
        this.steps = steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18606c m53834b(C18606c c18606c, C4242s c4242s, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            c4242s = c18606c.amoeba;
        }
        if ((i14 & 2) != 0) {
            i13 = c18606c.onStep;
        }
        if ((i14 & 4) != 0) {
            list = c18606c.steps;
        }
        return c18606c.m53835a(c4242s, i13, list);
    }

    /* JADX INFO: renamed from: a */
    public final C18606c m53835a(C4242s amoeba, int onStep, List<C18605b> steps) {
        AbstractC22676k.m65750j(amoeba, "amoeba");
        AbstractC22676k.m65750j(steps, "steps");
        return new C18606c(amoeba, onStep, steps);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4242s getAmoeba() {
        return this.amoeba;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getOnStep() {
        return this.onStep;
    }

    /* JADX INFO: renamed from: e */
    public final List<C18605b> m53838e() {
        return this.steps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18606c)) {
            return false;
        }
        C18606c c18606c = (C18606c) other;
        return AbstractC22676k.m65745e(this.amoeba, c18606c.amoeba) && this.onStep == c18606c.onStep && AbstractC22676k.m65745e(this.steps, c18606c.steps);
    }

    public int hashCode() {
        return this.steps.hashCode() + AbstractC11266d.m30448b(this.onStep, this.amoeba.hashCode() * 31, 31);
    }

    public String toString() {
        C4242s c4242s = this.amoeba;
        int i13 = this.onStep;
        List<C18605b> list = this.steps;
        StringBuilder sb4 = new StringBuilder("AmoebaOnboardingViewState(amoeba=");
        sb4.append(c4242s);
        sb4.append(", onStep=");
        sb4.append(i13);
        sb4.append(", steps=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
