package lf0;

import ih0.AbstractC18489d0;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.m1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Llf0/m1;", "Lm91/u;", "Llf0/d1;", "currentTest", "", "Llf0/k1;", "tests", "", "showOverlay", "<init>", "(Llf0/d1;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llf0/d1;", "()Llf0/d1;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23944m1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23908d1 currentTest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C23936k1> tests;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showOverlay;

    public C23944m1(C23908d1 currentTest, List<C23936k1> tests, boolean z4) {
        AbstractC22676k.m65750j(currentTest, "currentTest");
        AbstractC22676k.m65750j(tests, "tests");
        this.currentTest = currentTest;
        this.tests = tests;
        this.showOverlay = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23908d1 getCurrentTest() {
        return this.currentTest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowOverlay() {
        return this.showOverlay;
    }

    /* JADX INFO: renamed from: c */
    public final List<C23936k1> m70528c() {
        return this.tests;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23944m1)) {
            return false;
        }
        C23944m1 c23944m1 = (C23944m1) other;
        return AbstractC22676k.m65745e(this.currentTest, c23944m1.currentTest) && AbstractC22676k.m65745e(this.tests, c23944m1.tests) && this.showOverlay == c23944m1.showOverlay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showOverlay) + AbstractC11895b.m31983b(this.currentTest.hashCode() * 31, 31, this.tests);
    }

    public String toString() {
        C23908d1 c23908d1 = this.currentTest;
        List<C23936k1> list = this.tests;
        boolean z4 = this.showOverlay;
        StringBuilder sb4 = new StringBuilder("LabsTestSelectionState(currentTest=");
        sb4.append(c23908d1);
        sb4.append(", tests=");
        sb4.append(list);
        sb4.append(", showOverlay=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C23944m1(C23908d1 c23908d1, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23908d1, list, (i13 & 4) != 0 ? false : z4);
    }
}
