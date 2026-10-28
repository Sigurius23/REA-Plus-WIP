package p114eb;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1625s1;
import androidx.lifecycle.C1646z1;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import l83.C23470p;
import m83.C25262p;
import p298l8.AbstractC23420c;
import p298l8.C23422e;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: eb.q */
/* JADX INFO: loaded from: classes.dex */
public final class C12982q implements InterfaceC1585g0, InterfaceC1583f2, InterfaceC1620r, InterfaceC29049f {

    /* JADX INFO: renamed from: E */
    public final C12942b0 f44834E;

    /* JADX INFO: renamed from: F */
    public final String f44835F;

    /* JADX INFO: renamed from: G */
    public final Bundle f44836G;

    /* JADX INFO: renamed from: H */
    public final C1593i0 f44837H = new C1593i0(this);

    /* JADX INFO: renamed from: I */
    public final C29048e f44838I = new C29048e(new C31183a(this, new C25262p(this, 10)));

    /* JADX INFO: renamed from: J */
    public boolean f44839J;

    /* JADX INFO: renamed from: K */
    public final C23470p f44840K;

    /* JADX INFO: renamed from: L */
    public EnumC1635w f44841L;

    /* JADX INFO: renamed from: M */
    public final C1625s1 f44842M;

    /* JADX INFO: renamed from: w */
    public final Context f44843w;

    /* JADX INFO: renamed from: x */
    public C12977n0 f44844x;

    /* JADX INFO: renamed from: y */
    public final Bundle f44845y;

    /* JADX INFO: renamed from: z */
    public EnumC1635w f44846z;

    public C12982q(Context context, C12977n0 c12977n0, Bundle bundle, EnumC1635w enumC1635w, C12942b0 c12942b0, String str, Bundle bundle2) {
        this.f44843w = context;
        this.f44844x = c12977n0;
        this.f44845y = bundle;
        this.f44846z = enumC1635w;
        this.f44834E = c12942b0;
        this.f44835F = str;
        this.f44836G = bundle2;
        C23470p c23470pM92088H = AbstractC30060g.m92088H(new C12980p(this, 0));
        this.f44840K = AbstractC30060g.m92088H(new C12980p(this, 1));
        this.f44841L = EnumC1635w.f6326x;
        this.f44842M = (C1625s1) c23470pM92088H.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m36479a() {
        Bundle bundle = this.f44845y;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final C1601k1 m36480b() {
        return (C1601k1) this.f44840K.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m36481c(EnumC1635w maxState) {
        AbstractC22676k.m65750j(maxState, "maxState");
        this.f44841L = maxState;
        m36482d();
    }

    /* JADX INFO: renamed from: d */
    public final void m36482d() {
        if (!this.f44839J) {
            C29048e c29048e = this.f44838I;
            c29048e.f117550a.m95914a();
            this.f44839J = true;
            if (this.f44834E != null) {
                AbstractC1613o1.m5016f(this);
            }
            c29048e.m88295a(this.f44836G);
        }
        int iOrdinal = this.f44846z.ordinal();
        int iOrdinal2 = this.f44841L.ordinal();
        C1593i0 c1593i0 = this.f44837H;
        if (iOrdinal < iOrdinal2) {
            c1593i0.m4993i(this.f44846z);
        } else {
            c1593i0.m4993i(this.f44841L);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C12982q)) {
            C12982q c12982q = (C12982q) obj;
            Bundle bundle = c12982q.f44845y;
            if (AbstractC22676k.m65745e(this.f44835F, c12982q.f44835F) && AbstractC22676k.m65745e(this.f44844x, c12982q.f44844x) && AbstractC22676k.m65745e(this.f44837H, c12982q.f44837H) && AbstractC22676k.m65745e(this.f44838I.f117551b, c12982q.f44838I.f117551b)) {
                Bundle bundle2 = this.f44845y;
                if (AbstractC22676k.m65745e(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!AbstractC22676k.m65745e(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public final AbstractC23420c getDefaultViewModelCreationExtras() {
        C23422e c23422e = new C23422e(0);
        Context context = this.f44843w;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = c23422e.f92772a;
        if (application != null) {
            linkedHashMap.put(C1646z1.f6353d, application);
        }
        linkedHashMap.put(AbstractC1613o1.f6291a, this);
        linkedHashMap.put(AbstractC1613o1.f6292b, this);
        Bundle bundleM36479a = m36479a();
        if (bundleM36479a != null) {
            linkedHashMap.put(AbstractC1613o1.f6293c, bundleM36479a);
        }
        return c23422e;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public final InterfaceC1563a2 getDefaultViewModelProviderFactory() {
        return this.f44842M;
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f44837H;
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.f44838I.f117551b;
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public final C1579e2 getViewModelStore() {
        if (!this.f44839J) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f44837H.f6250d == EnumC1635w.f6325w) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C12942b0 c12942b0 = this.f44834E;
        if (c12942b0 == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = this.f44835F;
        AbstractC22676k.m65750j(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = c12942b0.f44710w;
        C1579e2 c1579e2 = (C1579e2) linkedHashMap.get(backStackEntryId);
        if (c1579e2 != null) {
            return c1579e2;
        }
        C1579e2 c1579e3 = new C1579e2();
        linkedHashMap.put(backStackEntryId, c1579e3);
        return c1579e3;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f44844x.hashCode() + (this.f44835F.hashCode() * 31);
        Bundle bundle = this.f44845y;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i13 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i13 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f44838I.f117551b.hashCode() + ((this.f44837H.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C12982q.class.getSimpleName());
        sb4.append("(" + this.f44835F + ')');
        sb4.append(" destination=");
        sb4.append(this.f44844x);
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
