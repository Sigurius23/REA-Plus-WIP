package p028b4;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import m83.C25272z;
import p005a3.C0230n0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C2695f implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2701l f10601a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0230n0 f10602b;

    public C2695f(AbstractC2701l abstractC2701l, C0230n0 c0230n0) {
        this.f10601a = abstractC2701l;
        this.f10602b = c0230n0;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        AbstractC2701l abstractC2701l = this.f10601a;
        int childCount = abstractC2701l.getChildCount();
        C25272z c25272z = C25272z.f99163w;
        if (childCount == 0) {
            return interfaceC39133t0.mo86822W(C39169a.m124767k(j7), C39169a.m124766j(j7), c25272z, C2692c.f10593y);
        }
        if (C39169a.m124767k(j7) != 0) {
            abstractC2701l.getChildAt(0).setMinimumWidth(C39169a.m124767k(j7));
        }
        if (C39169a.m124766j(j7) != 0) {
            abstractC2701l.getChildAt(0).setMinimumHeight(C39169a.m124766j(j7));
        }
        int iM124767k = C39169a.m124767k(j7);
        int iM124765i = C39169a.m124765i(j7);
        ViewGroup.LayoutParams layoutParams = abstractC2701l.getLayoutParams();
        AbstractC22676k.m65747g(layoutParams);
        int iM7579k = AbstractC2701l.m7579k(abstractC2701l, iM124767k, iM124765i, layoutParams.width);
        int iM124766j = C39169a.m124766j(j7);
        int iM124764h = C39169a.m124764h(j7);
        ViewGroup.LayoutParams layoutParams2 = abstractC2701l.getLayoutParams();
        AbstractC22676k.m65747g(layoutParams2);
        abstractC2701l.measure(iM7579k, AbstractC2701l.m7579k(abstractC2701l, iM124766j, iM124764h, layoutParams2.height));
        return interfaceC39133t0.mo86822W(abstractC2701l.getMeasuredWidth(), abstractC2701l.getMeasuredHeight(), c25272z, new C2693d(abstractC2701l, this.f10602b, 1));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC2701l abstractC2701l = this.f10601a;
        ViewGroup.LayoutParams layoutParams = abstractC2701l.getLayoutParams();
        AbstractC22676k.m65747g(layoutParams);
        abstractC2701l.measure(AbstractC2701l.m7579k(abstractC2701l, 0, i13, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC2701l.getMeasuredHeight();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC2701l abstractC2701l = this.f10601a;
        ViewGroup.LayoutParams layoutParams = abstractC2701l.getLayoutParams();
        AbstractC22676k.m65747g(layoutParams);
        abstractC2701l.measure(iMakeMeasureSpec, AbstractC2701l.m7579k(abstractC2701l, 0, i13, layoutParams.height));
        return abstractC2701l.getMeasuredWidth();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        AbstractC2701l abstractC2701l = this.f10601a;
        ViewGroup.LayoutParams layoutParams = abstractC2701l.getLayoutParams();
        AbstractC22676k.m65747g(layoutParams);
        abstractC2701l.measure(AbstractC2701l.m7579k(abstractC2701l, 0, i13, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return abstractC2701l.getMeasuredHeight();
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbstractC2701l abstractC2701l = this.f10601a;
        ViewGroup.LayoutParams layoutParams = abstractC2701l.getLayoutParams();
        AbstractC22676k.m65747g(layoutParams);
        abstractC2701l.measure(iMakeMeasureSpec, AbstractC2701l.m7579k(abstractC2701l, 0, i13, layoutParams.height));
        return abstractC2701l.getMeasuredWidth();
    }
}
