package p720m91;

import c93.InterfaceC4339a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m91.w */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lm91/w;", "", "<init>", "()V", "", "<set-?>", "a", "Lp1/a1;", "c", "()I", "e", "(I)V", "collapsedHeightPx", "Lkotlin/Function0;", "", "b", "Lp1/c1;", "d", "()Lc93/a;", "f", "(Lc93/a;)V", "expansionProgress", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25314w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28593a1 collapsedHeightPx = new C28621h1(0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28601c1 expansionProgress = AbstractC28683x.m87272z(new C25313v(0));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final float m74330b() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final int m74331c() {
        return ((C28621h1) this.collapsedHeightPx).m87024x();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a m74332d() {
        return (InterfaceC4339a) this.expansionProgress.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m74333e(int i13) {
        ((C28621h1) this.collapsedHeightPx).m87025y(i13);
    }

    /* JADX INFO: renamed from: f */
    public final void m74334f(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.expansionProgress.setValue(interfaceC4339a);
    }
}
