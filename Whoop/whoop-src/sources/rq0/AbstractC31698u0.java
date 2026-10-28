package rq0;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.RecyclerView;
import eq0.AbstractC13552x1;
import java.util.WeakHashMap;
import l83.InterfaceC23459e;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p465rm.C31559p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: rq0.u0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Leq0/x1;", "Ll83/a0;", "b", "(Leq0/x1;)V", "Landroid/view/View;", "root", "", "paddedViews", "c", "(Landroid/view/View;[Landroid/view/View;)V", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31698u0 {

    /* JADX INFO: renamed from: rq0.u0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f131260w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f131260w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f131260w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f131260w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m98270b(AbstractC13552x1 abstractC13552x1) {
        AbstractC22676k.m65750j(abstractC13552x1, "<this>");
        View root = abstractC13552x1.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        RecyclerView recyclerView = abstractC13552x1.f47754i;
        AbstractC22676k.m65749i(recyclerView, "recyclerView");
        LinearLayout leaderBoardView = abstractC13552x1.f47747b.f47694l;
        AbstractC22676k.m65749i(leaderBoardView, "leaderBoardView");
        m98271c(root, recyclerView, leaderBoardView);
    }

    /* JADX INFO: renamed from: c */
    public static final void m98271c(View root, View... paddedViews) {
        AbstractC22676k.m65750j(root, "root");
        AbstractC22676k.m65750j(paddedViews, "paddedViews");
        C31559p c31559p = new C31559p(paddedViews, 4);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c31559p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C16905q1 m98272d(View[] viewArr, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        int i13 = windowInsets.f64864a.mo47530g(2).f151452d;
        for (View view2 : viewArr) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i13);
        }
        return windowInsets;
    }
}
