package p399pb;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.C12982q;
import p161g.AbstractActivityC14909l;
import p189hb.AbstractC17067c;
import p189hb.C17068d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C29044a implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117546w;

    /* JADX INFO: renamed from: x */
    public final Object f117547x;

    public /* synthetic */ C29044a(Object obj, int i13) {
        this.f117546w = i13;
        this.f117547x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        int iNextIndex;
        switch (this.f117546w) {
            case 0:
                InterfaceC29049f interfaceC29049f = (InterfaceC29049f) this.f117547x;
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "event");
                if (event != EnumC1632v.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().mo4988d(this);
                Bundle bundleM88291a = interfaceC29049f.getSavedStateRegistry().m88291a("androidx.savedstate.Restarter");
                if (bundleM88291a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM88291a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C29044a.class.getClassLoader()).asSubclass(InterfaceC29045b.class);
                        AbstractC22676k.m65747g(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                AbstractC22676k.m65747g(objNewInstance);
                                if (!(interfaceC29049f instanceof InterfaceC1583f2)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC29049f).toString());
                                }
                                C1579e2 viewModelStore = ((InterfaceC1583f2) interfaceC29049f).getViewModelStore();
                                C29047d savedStateRegistry = interfaceC29049f.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f6214a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    AbstractC22676k.m65750j(key, "key");
                                    AbstractC1637w1 abstractC1637w1 = (AbstractC1637w1) linkedHashMap.get(key);
                                    if (abstractC1637w1 != null) {
                                        AbstractC1613o1.m5013c(abstractC1637w1, savedStateRegistry, interfaceC29049f.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m88294d();
                                }
                            } catch (Exception e5) {
                                throw new RuntimeException(AbstractC11266d.m30461o("Failed to instantiate ", str), e5);
                            }
                        } catch (NoSuchMethodException e13) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e13);
                        }
                    } catch (ClassNotFoundException e14) {
                        throw new RuntimeException(AbstractC11895b.m31996o("Class ", str, " wasn't found"), e14);
                    }
                }
                return;
            case 1:
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "event");
                AbstractActivityC14909l abstractActivityC14909l = (AbstractActivityC14909l) this.f117547x;
                AbstractActivityC14909l.access$ensureViewModelStore(abstractActivityC14909l);
                abstractActivityC14909l.getLifecycle().mo4988d(this);
                return;
            default:
                C17068d c17068d = (C17068d) this.f117547x;
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "event");
                int i13 = AbstractC17067c.f65595a[event.ordinal()];
                if (i13 == 1) {
                    DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y = (DialogInterfaceOnCancelListenerC1361y) source;
                    Iterable iterable = (Iterable) c17068d.m36435b().f44870e.f45200w.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (AbstractC22676k.m65745e(((C12982q) it.next()).f44835F, dialogInterfaceOnCancelListenerC1361y.getTag())) {
                                return;
                            }
                        }
                    }
                    dialogInterfaceOnCancelListenerC1361y.dismiss();
                    return;
                }
                Object obj = null;
                if (i13 == 2) {
                    DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y2 = (DialogInterfaceOnCancelListenerC1361y) source;
                    for (Object obj2 : (Iterable) c17068d.m36435b().f44871f.f45200w.getValue()) {
                        if (AbstractC22676k.m65745e(((C12982q) obj2).f44835F, dialogInterfaceOnCancelListenerC1361y2.getTag())) {
                            obj = obj2;
                        }
                    }
                    C12982q c12982q = (C12982q) obj;
                    if (c12982q != null) {
                        c17068d.m36435b().m36492b(c12982q);
                        return;
                    }
                    return;
                }
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                    DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y3 = (DialogInterfaceOnCancelListenerC1361y) source;
                    for (Object obj3 : (Iterable) c17068d.m36435b().f44871f.f45200w.getValue()) {
                        if (AbstractC22676k.m65745e(((C12982q) obj3).f44835F, dialogInterfaceOnCancelListenerC1361y3.getTag())) {
                            obj = obj3;
                        }
                    }
                    C12982q c12982q2 = (C12982q) obj;
                    if (c12982q2 != null) {
                        c17068d.m36435b().m36492b(c12982q2);
                    }
                    dialogInterfaceOnCancelListenerC1361y3.getLifecycle().mo4988d(this);
                    return;
                }
                DialogInterfaceOnCancelListenerC1361y dialogInterfaceOnCancelListenerC1361y4 = (DialogInterfaceOnCancelListenerC1361y) source;
                if (dialogInterfaceOnCancelListenerC1361y4.requireDialog().isShowing()) {
                    return;
                }
                List list = (List) c17068d.m36435b().f44870e.f45200w.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (AbstractC22676k.m65745e(((C12982q) listIterator.previous()).f44835F, dialogInterfaceOnCancelListenerC1361y4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                C12982q c12982q3 = (C12982q) AbstractC25265s.m74102I0(iNextIndex, list);
                if (!AbstractC22676k.m65745e(AbstractC25265s.m74114R0(list), c12982q3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC1361y4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (c12982q3 != null) {
                    c17068d.m48192l(iNextIndex, c12982q3, false);
                    return;
                }
                return;
        }
    }
}
