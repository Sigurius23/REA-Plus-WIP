package gz0;

import c13.AbstractC3855a;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.y */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lgz0/y;", "", "", "inTheGreen", "startStrong", "sleepRight", "tryDry", "", "Lkd1/h;", "descriptions", "<init>", "(IIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "Ljava/util/List;", "getDescriptions", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16328y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int inTheGreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int startStrong;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int sleepRight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int tryDry;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16328y(int i13, int i14, int i15, int i16, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.inTheGreen = i13;
        this.startStrong = i14;
        this.sleepRight = i15;
        this.tryDry = i16;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getInTheGreen() {
        return this.inTheGreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSleepRight() {
        return this.sleepRight;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStartStrong() {
        return this.startStrong;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTryDry() {
        return this.tryDry;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16328y)) {
            return false;
        }
        C16328y c16328y = (C16328y) other;
        return this.inTheGreen == c16328y.inTheGreen && this.startStrong == c16328y.startStrong && this.sleepRight == c16328y.sleepRight && this.tryDry == c16328y.tryDry && AbstractC22676k.m65745e(this.descriptions, c16328y.descriptions);
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.tryDry, AbstractC11266d.m30448b(this.sleepRight, AbstractC11266d.m30448b(this.startStrong, Integer.hashCode(this.inTheGreen) * 31, 31), 31), 31);
    }

    public String toString() {
        int i13 = this.inTheGreen;
        int i14 = this.startStrong;
        int i15 = this.sleepRight;
        int i16 = this.tryDry;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "PlanIcons(inTheGreen=", ", startStrong=", ", sleepRight=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", tryDry=", i16, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }
}
