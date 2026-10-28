package p189hb;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.fragment.app.InterfaceC1351u1;
import androidx.lifecycle.AbstractC1638x;
import ec3.C13045h2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import m83.AbstractC25265s;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12964i1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12988t;
import p114eb.C12997x0;
import p114eb.InterfaceC12961h1;
import p319m4.AbstractC25012a;
import p399pb.C29044a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: hb.d */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12961h1("dialog")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lhb/d;", "Leb/i1;", "Lhb/b;", "navigation-fragment_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class C17068d extends AbstractC12964i1 {

    /* JADX INFO: renamed from: c */
    public final Context f65596c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1329o1 f65597d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f65598e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final C29044a f65599f = new C29044a(this, 2);

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f65600g = new LinkedHashMap();

    public C17068d(Context context, AbstractC1329o1 abstractC1329o1) {
        this.f65596c = context;
        this.f65597d = abstractC1329o1;
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: a */
    public final C12977n0 mo36423a() {
        return new C17066b(this);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: d */
    public final void mo36436d(List list, C12997x0 c12997x0) {
        AbstractC1329o1 abstractC1329o1 = this.f65597d;
        if (abstractC1329o1.m4147Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12982q c12982q = (C12982q) it.next();
            m48191k(c12982q).show(abstractC1329o1, c12982q.f44835F);
            C12982q c12982q2 = (C12982q) AbstractC25265s.m74114R0((List) m36435b().f44870e.f45200w.getValue());
            boolean zM74155w0 = AbstractC25265s.m74155w0((Iterable) m36435b().f44871f.f45200w.getValue(), c12982q2);
            m36435b().m36499i(c12982q);
            if (c12982q2 != null && !zM74155w0) {
                m36435b().m36492b(c12982q2);
            }
        }
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: e */
    public final void mo36437e(C12988t c12988t) {
        AbstractC1638x lifecycle;
        super.mo36437e(c12988t);
        Iterator it = ((List) c12988t.f44870e.f45200w.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            AbstractC1329o1 abstractC1329o1 = this.f65597d;
            if (!zHasNext) {
                abstractC1329o1.f5731q.add(new InterfaceC1351u1() { // from class: hb.a
                    @Override // androidx.fragment.app.InterfaceC1351u1
                    /* JADX INFO: renamed from: a */
                    public final void mo4085a(AbstractC1329o1 abstractC1329o2, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
                        AbstractC22676k.m65750j(abstractC1329o2, "<anonymous parameter 0>");
                        C17068d c17068d = this.f65593w;
                        LinkedHashSet linkedHashSet = c17068d.f65598e;
                        String tag = abstractComponentCallbacksC1320m0.getTag();
                        AbstractC22681m0.m65770a(linkedHashSet);
                        if (linkedHashSet.remove(tag)) {
                            abstractComponentCallbacksC1320m0.getLifecycle().mo4986a(c17068d.f65599f);
                        }
                        LinkedHashMap linkedHashMap = c17068d.f65600g;
                        AbstractC22681m0.m65772c(linkedHashMap).remove(abstractComponentCallbacksC1320m0.getTag());
                    }
                });
                return;
            }
            C12982q c12982q = (C12982q) it.next();
            DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = (DialogInterfaceOnCancelListenerC1361y) abstractC1329o1.m4140E(c12982q.f44835F);
            if (dialogInterfaceOnCancelListenerC1361y == null || (lifecycle = dialogInterfaceOnCancelListenerC1361y.getLifecycle()) == null) {
                this.f65598e.add(c12982q.f44835F);
            } else {
                lifecycle.mo4986a(this.f65599f);
            }
        }
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: f */
    public final void mo36438f(C12982q c12982q) {
        String str = c12982q.f44835F;
        AbstractC1329o1 abstractC1329o1 = this.f65597d;
        if (abstractC1329o1.m4147Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = (DialogInterfaceOnCancelListenerC1361y) this.f65600g.get(str);
        if (dialogInterfaceOnCancelListenerC1361y == null) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = abstractC1329o1.m4140E(str);
            dialogInterfaceOnCancelListenerC1361y = abstractComponentCallbacksC1320m0M4140E instanceof DialogInterfaceOnCancelListenerC1361y ? (DialogInterfaceOnCancelListenerC1361y) abstractComponentCallbacksC1320m0M4140E : null;
        }
        if (dialogInterfaceOnCancelListenerC1361y != null) {
            dialogInterfaceOnCancelListenerC1361y.getLifecycle().mo4988d(this.f65599f);
            dialogInterfaceOnCancelListenerC1361y.dismiss();
        }
        m48191k(c12982q).show(abstractC1329o1, str);
        C12988t c12988tM36435b = m36435b();
        List list = (List) c12988tM36435b.f44870e.f45200w.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C12982q c12982q2 = (C12982q) listIterator.previous();
            if (AbstractC22676k.m65745e(c12982q2.f44835F, str)) {
                C13045h2 c13045h2 = c12988tM36435b.f44868c;
                c13045h2.m36571k(null, AbstractC12350b.m34555D(c12982q, AbstractC12350b.m34555D(c12982q2, (Set) c13045h2.getValue())));
                c12988tM36435b.m36493c(c12982q);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: i */
    public final void mo36441i(C12982q popUpTo, boolean z4) {
        AbstractC22676k.m65750j(popUpTo, "popUpTo");
        AbstractC1329o1 abstractC1329o1 = this.f65597d;
        if (abstractC1329o1.m4147Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) m36435b().f44870e.f45200w.getValue();
        int iIndexOf = list.indexOf(popUpTo);
        Iterator it = AbstractC25265s.m74138n1(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = abstractC1329o1.m4140E(((C12982q) it.next()).f44835F);
            if (abstractComponentCallbacksC1320m0M4140E != null) {
                ((DialogInterfaceOnCancelListenerC1361y) abstractComponentCallbacksC1320m0M4140E).dismiss();
            }
        }
        m48192l(iIndexOf, popUpTo, z4);
    }

    /* JADX INFO: renamed from: k */
    public final DialogInterfaceOnCancelListenerC1361y m48191k(C12982q c12982q) {
        C12977n0 c12977n0 = c12982q.f44844x;
        AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C17066b c17066b = (C17066b) c12977n0;
        String str = c17066b.f65594L;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f65596c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = this.f65597d.m4143J().mo4083a(context.getClassLoader(), str);
        AbstractC22676k.m65749i(abstractComponentCallbacksC1320m0Mo4083a, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogInterfaceOnCancelListenerC1361y.class.isAssignableFrom(abstractComponentCallbacksC1320m0Mo4083a.getClass())) {
            DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = (DialogInterfaceOnCancelListenerC1361y) abstractComponentCallbacksC1320m0Mo4083a;
            dialogInterfaceOnCancelListenerC1361y.setArguments(c12982q.m36479a());
            dialogInterfaceOnCancelListenerC1361y.getLifecycle().mo4986a(this.f65599f);
            this.f65600g.put(c12982q.f44835F, dialogInterfaceOnCancelListenerC1361y);
            return dialogInterfaceOnCancelListenerC1361y;
        }
        StringBuilder sb4 = new StringBuilder("Dialog destination ");
        String str2 = c17066b.f65594L;
        if (str2 != null) {
            throw new IllegalArgumentException(AbstractC25012a.m73376i(str2, " is not an instance of DialogFragment", sb4).toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    /* JADX INFO: renamed from: l */
    public final void m48192l(int i13, C12982q c12982q, boolean z4) {
        C12982q c12982q2 = (C12982q) AbstractC25265s.m74102I0(i13 - 1, (List) m36435b().f44870e.f45200w.getValue());
        boolean zM74155w0 = AbstractC25265s.m74155w0((Iterable) m36435b().f44871f.f45200w.getValue(), c12982q2);
        m36435b().m36496f(c12982q, z4);
        if (c12982q2 == null || zM74155w0) {
            return;
        }
        m36435b().m36492b(c12982q2);
    }
}
