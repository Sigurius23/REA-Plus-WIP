package w81;

import androidx.compose.runtime.Composer;
import androidx.recyclerview.widget.AbstractC1717o2;
import e91.C12886a;
import l83.C23454a0;
import p027b3.C2384h2;
import p390p1.C28655q;
import p602x1.C37816b;
import p700bd1.C3092j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w81.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lw81/e;", "Landroidx/recyclerview/widget/o2;", "Le91/a;", "viewBinding", "<init>", "(Le91/a;)V", "", "page", "Lkotlin/Function1;", "Ll83/a0;", "pageContents", "b", "(ILkotlin/jvm/functions/Function3;)V", "d", "()V", "a", "Le91/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36947e extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12886a viewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36947e(C12886a viewBinding) {
        super(viewBinding.getRoot());
        AbstractC22676k.m65750j(viewBinding, "viewBinding");
        this.viewBinding = viewBinding;
        viewBinding.f44369b.setViewCompositionStrategy(C2384h2.f9434x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m118632c(Function3 function3, int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            function3.invoke(Integer.valueOf(i13), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m118633b(int page, Function3 pageContents) {
        AbstractC22676k.m65750j(pageContents, "pageContents");
        this.viewBinding.f44369b.setContent(new C37816b(new C3092j(pageContents, page, 4), true, -795030836));
    }

    /* JADX INFO: renamed from: d */
    public final void m118634d() {
        this.viewBinding.f44369b.m7235d();
    }
}
