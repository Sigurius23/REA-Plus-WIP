package com.google.firebase;

import android.content.Context;
import android.os.Build;
import b23.C2342h;
import com.google.firebase.components.ComponentRegistrar;
import gt.C16162a;
import gt.C16163b;
import gt.C16171j;
import gt.C16177p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import l83.C23461g;
import p037bu.C3630a;
import p037bu.C3631b;
import p098dt.C12355g;
import p155ft.InterfaceC14761a;
import p249jc.AbstractC21598x;
import p437qt.C30579b;
import p437qt.C30581d;
import p437qt.C30582e;
import p437qt.InterfaceC30583f;
import p437qt.InterfaceC30584g;
import p505ts.AbstractC34132o;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m16377a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C16177p.m45715a(C3631b.class));
        for (Class cls : new Class[0]) {
            AbstractC34132o.m107884h(cls, "Null interface");
            hashSet.add(C16177p.m45715a(cls));
        }
        C16171j c16171j = new C16171j(2, 0, C3630a.class);
        if (hashSet.contains(c16171j.f61451a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(c16171j);
        arrayList.add(new C16163b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C2342h(2), hashSet3));
        C16177p c16177p = new C16177p(InterfaceC14761a.class, Executor.class);
        C16162a c16162a = new C16162a(C30581d.class, new Class[]{InterfaceC30583f.class, InterfaceC30584g.class});
        c16162a.m45705a(C16171j.m45713a(Context.class));
        c16162a.m45705a(C16171j.m45713a(C12355g.class));
        c16162a.m45705a(new C16171j(2, 0, C30582e.class));
        c16162a.m45705a(new C16171j(1, 1, C3631b.class));
        c16162a.m45705a(new C16171j(c16177p, 1, 0));
        c16162a.f61426f = new C30579b(c16177p, 0);
        arrayList.add(c16162a.m45706b());
        arrayList.add(AbstractC21598x.m60712y("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC21598x.m60712y("fire-core", "21.0.0"));
        arrayList.add(AbstractC21598x.m60712y("device-name", m16377a(Build.PRODUCT)));
        arrayList.add(AbstractC21598x.m60712y("device-model", m16377a(Build.DEVICE)));
        arrayList.add(AbstractC21598x.m60712y("device-brand", m16377a(Build.BRAND)));
        arrayList.add(AbstractC21598x.m60653I("android-target-sdk", new C2342h(6)));
        arrayList.add(AbstractC21598x.m60653I("android-min-sdk", new C2342h(7)));
        arrayList.add(AbstractC21598x.m60653I("android-platform", new C2342h(8)));
        arrayList.add(AbstractC21598x.m60653I("android-installer", new C2342h(9)));
        try {
            string = C23461g.f92929z.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(AbstractC21598x.m60712y("kotlin", string));
        }
        return arrayList;
    }
}
