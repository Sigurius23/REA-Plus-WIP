package com.iterable.iterableapi;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.health.platform.client.proto.C1533u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l53.C23372m;
import p031b9.AbstractC2875y;
import p048ce.AbstractC4482w;
import p137f5.AbstractC14087f;
import p137f5.C14086e;
import p314m.C24845i0;
import p385ox.AbstractC28446a;
import p444r.InterfaceC30829w;
import p444r.MenuC30818l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.iterable.iterableapi.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5327g1 implements InterfaceC30829w {

    /* JADX INFO: renamed from: w */
    public boolean f21694w;

    /* JADX INFO: renamed from: x */
    public Object f21695x;

    public /* synthetic */ C5327g1(Object obj) {
        this.f21695x = obj;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16439a(String str) {
        boolean z4 = false;
        for (String str2 : AbstractC28446a.m86214a()) {
            String strM8299l = AbstractC2875y.m8299l(str2, str);
            if (new File(str2, str).exists()) {
                AbstractC4482w.m14002m0(strM8299l + " binary detected!");
                z4 = true;
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16440b() {
        return this.f21694w;
    }

    /* JADX INFO: renamed from: c */
    public List m16441c() {
        return (List) this.f21695x;
    }

    /* JADX INFO: renamed from: d */
    public boolean m16442d() {
        return this.f21694w;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16443e(ArrayList arrayList) {
        PackageManager packageManager = ((Context) this.f21695x).getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                AbstractC4482w.m13971G(str + " ROOT management app detected!");
                z4 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX INFO: renamed from: f */
    public boolean m16444f(int i13, CharSequence charSequence) {
        if (charSequence == null || i13 < 0 || charSequence.length() - i13 < 0) {
            throw new IllegalArgumentException();
        }
        C14086e c14086e = (C14086e) this.f21695x;
        if (c14086e == null) {
            return m16440b();
        }
        c14086e.getClass();
        char c3 = 0;
        c3 = 2;
        for (int i14 = 0; i14 < i13 && c3 == 2; i14++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i14));
            C5327g1 c5327g1 = AbstractC14087f.f50617a;
            if (directionality == 0) {
                c3 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c3 = 1;
                        continue;
                    case 16:
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        break;
                    default:
                        c3 = 2;
                        continue;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 != 1) {
            return m16440b();
        }
        return false;
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: g */
    public void mo16445g(MenuC30818l menuC30818l, boolean z4) {
        C24845i0 c24845i0 = (C24845i0) this.f21695x;
        if (this.f21694w) {
            return;
        }
        this.f21694w = true;
        c24845i0.f97326a.f132828a.m3313f();
        c24845i0.f97327b.onPanelClosed(108, menuC30818l);
        this.f21694w = false;
    }

    /* JADX INFO: renamed from: h */
    public void m16446h() {
        this.f21694w = false;
        AbstractC4482w.f18018E = 0;
    }

    /* JADX INFO: renamed from: i */
    public C23372m m16447i(String name) {
        AbstractC22676k.m65750j(name, "name");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f21695x;
        Object obj = concurrentHashMap.get(name);
        Object obj2 = obj;
        if (obj == null) {
            C23372m c23372m = new C23372m(name);
            boolean z4 = this.f21694w;
            synchronized (c23372m.f92652b) {
                if (c23372m.f92653c != z4) {
                    c23372m.f92653c = z4;
                    c23372m.f92652b.clear();
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(name, c23372m);
            obj2 = c23372m;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (C23372m) obj2;
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: s */
    public boolean mo16448s(MenuC30818l menuC30818l) {
        ((C24845i0) this.f21695x).f97327b.onMenuOpened(108, menuC30818l);
        return true;
    }

    public /* synthetic */ C5327g1(Object obj, boolean z4) {
        this.f21695x = obj;
        this.f21694w = z4;
    }

    public C5327g1(Context context) {
        this.f21694w = true;
        this.f21695x = context;
    }

    public C5327g1(C14086e c14086e, boolean z4) {
        this(c14086e);
        this.f21694w = z4;
    }

    public C5327g1(boolean z4, C5323f1 c5323f1) {
        this.f21694w = z4;
        this.f21695x = c5323f1;
    }
}
