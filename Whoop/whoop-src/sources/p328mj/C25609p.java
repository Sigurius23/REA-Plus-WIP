package p328mj;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import androidx.room.C1778e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import hc3.AbstractC17182o;
import j93.InterfaceC21493z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kc3.C22365e;
import m83.C25271y;
import p161g.InterfaceC14897b0;
import p197hj.C17338u;
import p342nj.AbstractC26738c;
import p390p1.C28674u2;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p525uj.C35035m;
import p553vj.C36064a;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: mj.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C25609p {

    /* JADX INFO: renamed from: a */
    public final C4861a f100461a;

    /* JADX INFO: renamed from: b */
    public final Nudge f100462b;

    /* JADX INFO: renamed from: c */
    public int f100463c;

    /* JADX INFO: renamed from: d */
    public final C35035m f100464d;

    /* JADX INFO: renamed from: e */
    public final C25594a f100465e;

    /* JADX INFO: renamed from: f */
    public boolean f100466f;

    /* JADX INFO: renamed from: g */
    public WeakReference f100467g;

    /* JADX INFO: renamed from: h */
    public final C25605l f100468h;

    /* JADX INFO: renamed from: i */
    public ComposeView f100469i;

    /* JADX INFO: renamed from: j */
    public ViewGroup f100470j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f100471k;

    public C25609p(C4861a c4861a, Nudge nudge, int i13, C35035m c35035m, C25594a c25594a) {
        C17338u c17338u = C17338u.f67142w;
        this.f100461a = c4861a;
        this.f100462b = nudge;
        this.f100463c = i13;
        this.f100464d = c35035m;
        this.f100465e = c25594a;
        C25605l c25605l = new C25605l(this);
        this.f100468h = c25605l;
        Activity activityM49083a = c17338u.m49083a();
        this.f100467g = activityM49083a != null ? new WeakReference(activityM49083a) : null;
        C17338u.f67144y.add(c25605l);
        this.f100471k = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m75331a() {
        if (this.f100466f) {
            C4861a.f20259o.m16067m0("NudgeViewManager#dispose -- already disposed! variantId=" + this.f100462b.getVariantId());
            return;
        }
        m75334d();
        WeakReference weakReference = this.f100467g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f100467g = null;
        this.f100470j = null;
        this.f100469i = null;
        this.f100471k.clear();
        C17338u c17338u = C17338u.f67142w;
        C17338u.f67144y.remove(this.f100468h);
        this.f100466f = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m75332b(String str, AbstractC32269c abstractC32269c) {
        C25606m c25606m;
        if (abstractC32269c instanceof C25606m) {
            c25606m = (C25606m) abstractC32269c;
            int i13 = c25606m.f100456y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25606m.f100456y = i13 - Integer.MIN_VALUE;
            } else {
                c25606m = new C25606m(this, abstractC32269c);
            }
        } else {
            c25606m = new C25606m(this, abstractC32269c);
        }
        Object objM8705K = c25606m.f100454w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25606m.f100456y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            WeakReference weakReference = this.f100467g;
            InterfaceC30057d interfaceC30057d = null;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                c25606m.f100456y = 1;
                InterfaceC21493z[] interfaceC21493zArr = AbstractC26738c.f106347a;
                C22365e c22365e = AbstractC3050q0.f12077a;
                objM8705K = AbstractC3006f0.m8705K(AbstractC17182o.f65999a, new C1778e(activity, str, interfaceC30057d, 27), c25606m);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C25271y.f99162w;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM8705K);
        List list = (List) objM8705K;
        if (list != null) {
            return list;
        }
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: c */
    public final void m75333c() {
        ViewGroup viewGroup;
        InterfaceC14897b0 interfaceC14897b0;
        InterfaceC29049f interfaceC29049f;
        InterfaceC1583f2 interfaceC1583f2;
        InterfaceC1585g0 interfaceC1585g0;
        if (this.f100466f) {
            C4861a.f20259o.m16067m0("NudgeViewManager used after being disposed");
            return;
        }
        WeakReference weakReference = this.f100467g;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity == null) {
            return;
        }
        C28674u2 c28674u2 = AbstractC25611r.f100475a;
        Object objFindViewById = activity.findViewById(R.id.content);
        while (true) {
            viewGroup = (ViewGroup) objFindViewById;
            ViewParent parent = viewGroup.getParent();
            if ((parent instanceof ViewGroup ? (ViewGroup) parent : null) == null) {
                break;
            }
            objFindViewById = viewGroup.getParent();
            AbstractC22676k.m65748h(objFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        }
        ComposeView composeView = new ComposeView(activity, null, 6);
        composeView.setContent(new C37816b(new C25608o(this, 3), true, 234998301));
        m75334d();
        C36064a c36064a = new C36064a(viewGroup, activity);
        C29048e c29048e = c36064a.f154013w;
        if (!c29048e.f117551b.f117548a.f128501g) {
            c29048e.m88295a(c36064a.f154014x);
            EnumC1632v enumC1632v = EnumC1632v.ON_CREATE;
            C1593i0 c1593i0 = c36064a.f154016z;
            c1593i0.m4991g(enumC1632v);
            c1593i0.m4991g(EnumC1632v.ON_RESUME);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(viewGroup);
        View view = c36064a.f154015y;
        if (interfaceC1585g0M5017g == null) {
            InterfaceC1585g0 interfaceC1585g0M5017g2 = AbstractC1613o1.m5017g(view);
            if (interfaceC1585g0M5017g2 == null) {
                interfaceC1585g0 = interfaceC1585g0M5017g2;
                interfaceC1585g0 = c36064a;
            }
            interfaceC1585g0 = interfaceC1585g0M5017g2;
            AbstractC1613o1.m5024n(viewGroup, interfaceC1585g0);
        }
        if (AbstractC1613o1.m5018h(viewGroup) == null) {
            InterfaceC1583f2 interfaceC1583f2M5018h = AbstractC1613o1.m5018h(view);
            if (interfaceC1583f2M5018h == null) {
                interfaceC1583f2 = interfaceC1583f2M5018h;
                interfaceC1583f2 = c36064a;
            }
            interfaceC1583f2 = interfaceC1583f2M5018h;
            AbstractC1613o1.m5025o(viewGroup, interfaceC1583f2);
        }
        if (AbstractC34132o.m107891t(viewGroup) == null) {
            InterfaceC29049f interfaceC29049fM107891t = AbstractC34132o.m107891t(view);
            if (interfaceC29049fM107891t == null) {
                interfaceC29049f = interfaceC29049fM107891t;
                interfaceC29049f = c36064a;
            }
            interfaceC29049f = interfaceC29049fM107891t;
            AbstractC34132o.m107862G(viewGroup, interfaceC29049f);
        }
        if (AbstractC1772c1.m5402t(viewGroup) == null) {
            InterfaceC14897b0 interfaceC14897b0M5402t = AbstractC1772c1.m5402t(view);
            if (interfaceC14897b0M5402t != null) {
                interfaceC14897b0 = c36064a;
                interfaceC14897b0 = interfaceC14897b0M5402t;
            }
            interfaceC14897b0 = c36064a;
            AbstractC1772c1.m5376M(viewGroup, interfaceC14897b0);
        }
        viewGroup.addView(composeView);
        this.f100470j = viewGroup;
        this.f100469i = composeView;
    }

    /* JADX INFO: renamed from: d */
    public final void m75334d() {
        ComposeView composeView = this.f100469i;
        if (composeView != null) {
            C4861a.f20259o.m16031I("NudgeViewManager#unmounting -- variantId=" + this.f100462b.getVariantId());
            ViewGroup viewGroup = this.f100470j;
            if (viewGroup != null) {
                viewGroup.removeView(composeView);
            }
            this.f100469i = null;
            this.f100470j = null;
        }
    }
}
