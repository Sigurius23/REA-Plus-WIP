package p499t9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import bc3.AbstractC3050q0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.stripe.android.model.StripeIntent$Usage;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25265s;
import nf.C26650d;
import p002a0.C0030i1;
import p073cq.InterfaceC11033b;
import p284ko.InterfaceC22613d0;
import p412q3.C29875i;
import p479s4.AbstractC32123d;
import p528un.InterfaceC35092c;
import p537ux.C35362x;
import p537ux.C35363y;
import p588wm.InterfaceC37360b;
import p589wn.C37402j;
import p589wn.C37405m;
import p589wn.C37407o;
import p589wn.InterfaceC37408p;
import p613xf.InterfaceC38257c;
import p613xf.InterfaceC38260f;
import p666z.AbstractC39918b;
import p666z.C39917a;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;
import wb3.AbstractC37056f;
import y00.C38977v3;
import y00.C38988w5;
import y00.C38997x5;
import y00.EnumC38828f4;
import y00.EnumC38852h8;
import y00.EnumC38853i;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: t9.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33623c0 implements InterfaceC33648q, InterfaceC11033b, InterfaceC35092c, InterfaceC37360b, InterfaceC37408p, InterfaceC38260f {
    /* JADX INFO: renamed from: g */
    public static C38997x5 m106234g(Integer num, Integer num2, C38988w5 c38988w5, C38977v3 c38977v3, Set set) {
        return new C38997x5(num, num2, c38988w5, c38977v3, set, null);
    }

    /* JADX INFO: renamed from: h */
    public static EnumC38853i m106235h(String str) {
        List listM118958J;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return EnumC38853i.Unknown;
        }
        ArrayList arrayListM106241q = m106241q(str);
        if (arrayListM106241q.size() != 1) {
            listM118958J = arrayListM106241q;
            listM118958J = null;
        }
        if (listM118958J == null) {
            listM118958J = AbstractC37056f.m118958J(EnumC38853i.Unknown);
        }
        return (EnumC38853i) AbstractC25265s.m74096F0(listM118958J);
    }

    /* JADX INFO: renamed from: i */
    public static EnumC38853i m106236i(String str) {
        Object next;
        C33617b c33617b = EnumC38853i.f167251Z;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        do {
            if (!c0030i1.hasNext()) {
                next = null;
                break;
            }
            next = c0030i1.next();
        } while (!AbstractC39421y.m125921F(((EnumC38853i) next).f167260w, str, true));
        EnumC38853i enumC38853i = (EnumC38853i) next;
        return enumC38853i == null ? EnumC38853i.Unknown : enumC38853i;
    }

    /* JADX INFO: renamed from: k */
    public static EnumC38828f4 m106237k(String str) {
        Object next;
        C33617b c33617b = EnumC38828f4.f167129v0;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            next = c0030i1.next();
            if (AbstractC22676k.m65745e(((EnumC38828f4) next).f167132w, str)) {
                return (EnumC38828f4) next;
            }
        }
        next = null;
        return (EnumC38828f4) next;
    }

    /* JADX INFO: renamed from: m */
    public static EnumC38852h8 m106238m(String str) {
        Object next;
        C33617b c33617b = EnumC38852h8.f167233E;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            next = c0030i1.next();
            if (AbstractC25265s.m74155w0(((EnumC38852h8) next).f167237w, str)) {
                return (EnumC38852h8) next;
            }
        }
        next = null;
        return (EnumC38852h8) next;
    }

    /* JADX INFO: renamed from: n */
    public static StripeIntent$Usage m106239n(String str) {
        Object next;
        C33617b c33617b = StripeIntent$Usage.f22254F;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            next = c0030i1.next();
            if (((StripeIntent$Usage) next).f22258w.equals(str)) {
                return (StripeIntent$Usage) next;
            }
        }
        next = null;
        return (StripeIntent$Usage) next;
    }

    /* JADX INFO: renamed from: p */
    public static List m106240p(String str) {
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return EnumC38853i.f167239N;
        }
        ArrayList arrayListM106241q = m106241q(str);
        if (arrayListM106241q.isEmpty()) {
            arrayListM106241q = null;
        }
        return arrayListM106241q == null ? AbstractC37056f.m118958J(EnumC38853i.Unknown) : arrayListM106241q;
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList m106241q(String str) {
        Matcher matcher;
        C33617b c33617b = EnumC38853i.f167251Z;
        ArrayList arrayList = new ArrayList();
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            Object next = c0030i1.next();
            EnumC38853i enumC38853i = (EnumC38853i) next;
            Pattern pattern = (Pattern) enumC38853i.f167256I.get(Integer.valueOf(str.length()));
            if (pattern == null) {
                pattern = enumC38853i.f167255H;
            }
            if (pattern != null && (matcher = pattern.matcher(str)) != null && matcher.matches()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((EnumC38853i) obj).f167258K) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: r */
    public static void m106242r(Context context, String publishableKey) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        C35363y.f150632y = new C35363y(publishableKey, null);
        new C35362x(context).f150631a.edit().putString("key_publishable_key", publishableKey).putString("key_account_id", null).apply();
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC32123d.m100021a(context, ExecutorC22364d.f87316w).m108290b();
    }

    @Override // p073cq.InterfaceC11033b
    /* JADX INFO: renamed from: a */
    public Object mo11178a(Task task) throws ApiException {
        if (((Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered", null, null));
    }

    @Override // p528un.InterfaceC35092c
    /* JADX INFO: renamed from: b */
    public long mo36164b() {
        throw new NoSuchElementException();
    }

    @Override // p589wn.InterfaceC37408p
    /* JADX INFO: renamed from: c */
    public InterfaceC22613d0 mo106243c() {
        return new C37407o(C37405m.f160056n, null);
    }

    @Override // p588wm.InterfaceC37360b
    /* JADX INFO: renamed from: d */
    public long mo106244d(long j7) {
        return j7;
    }

    @Override // p528un.InterfaceC35092c
    /* JADX INFO: renamed from: e */
    public long mo36165e() {
        throw new NoSuchElementException();
    }

    @Override // p589wn.InterfaceC37408p
    /* JADX INFO: renamed from: f */
    public InterfaceC22613d0 mo106245f(C37405m c37405m, C37402j c37402j) {
        return new C37407o(c37405m, c37402j);
    }

    @Override // p613xf.InterfaceC38260f
    /* JADX INFO: renamed from: j */
    public InterfaceC38257c mo2324j(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C26650d.f105939w;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public void mo3098l() {
    }

    @Override // p528un.InterfaceC35092c
    public boolean next() {
        return false;
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: o */
    public InterfaceC33639k0 mo3101o(int i13, int i14) {
        return new C33642m();
    }

    /* JADX INFO: renamed from: s */
    public void m106246s(C29875i c29875i, float f13) {
        C39917a c39917a = (C39917a) ((Drawable) c29875i.f122095w);
        CardView cardView = (CardView) c29875i.f122096x;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f13 != c39917a.f172329e || c39917a.f172330f != useCompatPadding || c39917a.f172331g != preventCornerOverlap) {
            c39917a.f172329e = f13;
            c39917a.f172330f = useCompatPadding;
            c39917a.f172331g = preventCornerOverlap;
            c39917a.m128081b(null);
            c39917a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c29875i.m91500i(0, 0, 0, 0);
            return;
        }
        C39917a c39917a2 = (C39917a) ((Drawable) c29875i.f122095w);
        float f14 = c39917a2.f172329e;
        float f15 = c39917a2.f172325a;
        int iCeil = (int) Math.ceil(AbstractC39918b.m128082a(f14, f15, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC39918b.m128083b(f14, f15, cardView.getPreventCornerOverlap()));
        c29875i.m91500i(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: v */
    public void mo3109v(InterfaceC33627e0 interfaceC33627e0) {
    }
}
