package p399pb;

import android.os.Bundle;
import androidx.lifecycle.C1623s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p108e4.AbstractC12667a;
import p314m.C24848k;
import p456rb.C31183a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C29047d {

    /* JADX INFO: renamed from: a */
    public final C31183a f117548a;

    /* JADX INFO: renamed from: b */
    public C24848k f117549b;

    public C29047d(C31183a c31183a) {
        this.f117548a = c31183a;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m88291a(String key) {
        Bundle bundle;
        AbstractC22676k.m65750j(key, "key");
        C31183a c31183a = this.f117548a;
        if (!c31183a.f128501g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle2 = c31183a.f128500f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(key)) {
            bundle = bundle2.getBundle(key);
            if (bundle == null) {
                AbstractC12667a.m35438I(key);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(key);
        if (bundle2.isEmpty()) {
            c31183a.f128500f = null;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC29046c m88292b() {
        InterfaceC29046c interfaceC29046c;
        C31183a c31183a = this.f117548a;
        synchronized (c31183a.f128497c) {
            Iterator it = c31183a.f128498d.entrySet().iterator();
            do {
                interfaceC29046c = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                InterfaceC29046c interfaceC29046c2 = (InterfaceC29046c) entry.getValue();
                if (AbstractC22676k.m65745e(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    interfaceC29046c = interfaceC29046c2;
                }
            } while (interfaceC29046c == null);
        }
        return interfaceC29046c;
    }

    /* JADX INFO: renamed from: c */
    public final void m88293c(String str, InterfaceC29046c provider) {
        AbstractC22676k.m65750j(provider, "provider");
        C31183a c31183a = this.f117548a;
        synchronized (c31183a.f128497c) {
            if (c31183a.f128498d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            c31183a.f128498d.put(str, provider);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88294d() {
        if (!this.f117548a.f128502h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C24848k c24848k = this.f117549b;
        if (c24848k == null) {
            c24848k = new C24848k(this);
        }
        this.f117549b = c24848k;
        try {
            C1623s.class.getDeclaredConstructor(null);
            C24848k c24848k2 = this.f117549b;
            if (c24848k2 != null) {
                ((LinkedHashSet) c24848k2.f97340b).add(C1623s.class.getName());
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + C1623s.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
