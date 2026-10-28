package ai;

import a13.C0150h;
import android.view.View;
import androidx.recyclerview.widget.InterfaceC1657a1;
import bc3.AbstractC3006f0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ed3.C13117a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l30.C23292a;
import l30.C23293b;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import p012ab.C0682h0;
import p077d0.C11387o2;
import p088dc.AbstractC11895b;
import p211i5.InterfaceC18102o;
import p461rh.InterfaceC31421j;
import p464rl.C31507b;
import p464rl.InterfaceC31508c;
import p464rl.InterfaceC31509d;
import p499t9.C33638k;
import p505ts.AbstractC34132o;
import p586wk.EnumC37323a;
import p588wm.C37364f;
import p607x8.C38059n;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ai.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C0904j implements InterfaceC1657a1, InterfaceC18102o, InterfaceC31509d {

    /* JADX INFO: renamed from: w */
    public int f3301w;

    /* JADX INFO: renamed from: x */
    public Object f3302x;

    public /* synthetic */ C0904j(int i13, Object obj) {
        this.f3301w = i13;
        this.f3302x = obj;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: a */
    public void mo2214a(int i13, int i14) {
        ((InterfaceC1657a1) this.f3302x).mo2214a(i13 + this.f3301w, i14);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: b */
    public void mo2215b(int i13, int i14) {
        ((InterfaceC1657a1) this.f3302x).mo2215b(i13 + this.f3301w, i14);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: c */
    public void mo2216c(int i13, int i14, Object obj) {
        ((InterfaceC1657a1) this.f3302x).mo2216c(i13 + this.f3301w, i14, obj);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1657a1
    /* JADX INFO: renamed from: d */
    public void mo2217d(int i13, int i14) {
        InterfaceC1657a1 interfaceC1657a1 = (InterfaceC1657a1) this.f3302x;
        int i15 = this.f3301w;
        interfaceC1657a1.mo2217d(i13 + i15, i14 + i15);
    }

    @Override // p464rl.InterfaceC31509d
    /* JADX INFO: renamed from: e */
    public InterfaceC31508c mo2218e(EnumC37323a enumC37323a) {
        if (enumC37323a == EnumC37323a.f159579E) {
            return C31507b.f130006w;
        }
        if (((C11387o2) this.f3302x) == null) {
            this.f3302x = new C11387o2(this.f3301w, 6);
        }
        return (C11387o2) this.f3302x;
    }

    /* JADX INFO: renamed from: f */
    public void m2219f(Object obj) {
        int i13 = this.f3301w;
        Object[] objArr = (Object[]) this.f3302x;
        if (objArr == null) {
            objArr = new Object[16];
            this.f3302x = objArr;
        } else if (i13 == objArr.length) {
            Object[] objArr2 = new Object[(i13 >> 2) + i13];
            System.arraycopy(objArr, 0, objArr2, 0, i13);
            this.f3302x = objArr2;
            objArr = objArr2;
        }
        objArr[i13] = obj;
        this.f3301w = i13 + 1;
    }

    /* JADX INFO: renamed from: g */
    public void m2220g() {
        WeakReference weakReference;
        int i13 = this.f3301w;
        this.f3301w = i13 + 1;
        if (i13 >= 10) {
            this.f3301w = 0;
            Iterator it = ((LinkedHashMap) this.f3302x).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    C0903i c0903i = (C0903i) AbstractC25265s.m74100H0(arrayList);
                    if (((c0903i == null || (weakReference = c0903i.f3298a) == null) ? null : (InterfaceC31421j) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i14 = 0;
                    for (int i15 = 0; i15 < size; i15++) {
                        int i16 = i15 - i14;
                        if (((C0903i) arrayList.get(i16)).f3298a.get() == null) {
                            arrayList.remove(i16);
                            i14++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public Object m2221h(AbstractC32269c abstractC32269c) throws Throwable {
        C23293b c23293b;
        C0904j c0904j;
        if (abstractC32269c instanceof C23293b) {
            c23293b = (C23293b) abstractC32269c;
            int i13 = c23293b.f92285z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23293b.f92285z = i13 - Integer.MIN_VALUE;
            } else {
                c23293b = new C23293b(this, abstractC32269c);
            }
        } else {
            c23293b = new C23293b(this, abstractC32269c);
        }
        Object objM8705K = c23293b.f92283x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23293b.f92285z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C0682h0 c0682h0 = (C0682h0) this.f3302x;
            c23293b.f92282w = this;
            c23293b.f92285z = 1;
            objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) c0682h0.f2433y, new C0150h(c0682h0, null, 14), c23293b);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
            c0904j = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0904j = c23293b.f92282w;
            AbstractC34132o.m107864I(objM8705K);
        }
        C23292a c23292a = (C23292a) objM8705K;
        return c23292a == null ? c0904j.m2224k() : c23292a;
    }

    /* JADX INFO: renamed from: i */
    public int m2222i() {
        return this.f3301w;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC23811y m2223j() {
        return (AbstractC23811y) this.f3302x;
    }

    /* JADX INFO: renamed from: k */
    public C23292a m2224k() {
        String strM31995n = AbstractC11895b.m31995n("toString(...)");
        C23292a c23292a = new C23292a(strM31995n, this.f3301w);
        C0682h0 c0682h0 = (C0682h0) this.f3302x;
        c0682h0.getClass();
        c0682h0.m1702q().edit().putInt("app_version", c0682h0.f2432x).putString("sdk_app_id", strM31995n).apply();
        return c23292a;
    }

    /* JADX INFO: renamed from: l */
    public long m2225l(C33638k c33638k) {
        C38059n c38059n = (C38059n) this.f3302x;
        int i13 = 0;
        c33638k.mo3092c(c38059n.f163017a, 0, 1, false);
        int i14 = c38059n.f163017a[0] & 255;
        if (i14 == 0) {
            return Long.MIN_VALUE;
        }
        int i15 = 128;
        int i16 = 0;
        while ((i14 & i15) == 0) {
            i15 >>= 1;
            i16++;
        }
        int i17 = i14 & (~i15);
        c33638k.mo3092c(c38059n.f163017a, 1, i16, false);
        while (i13 < i16) {
            i13++;
            i17 = (c38059n.f163017a[i13] & 255) + (i17 << 8);
        }
        this.f3301w = i16 + 1 + this.f3301w;
        return i17;
    }

    @Override // p211i5.InterfaceC18102o
    /* JADX INFO: renamed from: m */
    public boolean mo2226m(View view) {
        ((BottomSheetBehavior) this.f3302x).m15701W(this.f3301w);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public long m2227n(C37364f c37364f) {
        C13117a c13117a = (C13117a) this.f3302x;
        int i13 = 0;
        c37364f.mo3092c(c13117a.f45381a, 0, 1, false);
        int i14 = c13117a.f45381a[0] & 255;
        if (i14 == 0) {
            return Long.MIN_VALUE;
        }
        int i15 = 128;
        int i16 = 0;
        while ((i14 & i15) == 0) {
            i15 >>= 1;
            i16++;
        }
        int i17 = i14 & (~i15);
        c37364f.mo3092c(c13117a.f45381a, 1, i16, false);
        while (i13 < i16) {
            i13++;
            i17 = (c13117a.f45381a[i13] & 255) + (i17 << 8);
        }
        this.f3301w = i16 + 1 + this.f3301w;
        return i17;
    }

    /* JADX INFO: renamed from: o */
    public void m2228o(C0896b c0896b, InterfaceC31421j interfaceC31421j, Map map, long j7) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3302x;
        Object arrayList = linkedHashMap.get(c0896b);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c0896b, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        C0903i c0903i = new C0903i(new WeakReference(interfaceC31421j), map, j7);
        if (arrayList2.isEmpty()) {
            arrayList2.add(c0903i);
        } else {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                C0903i c0903i2 = (C0903i) arrayList2.get(i13);
                if (j7 >= c0903i2.f3300c) {
                    if (c0903i2.f3298a.get() == interfaceC31421j) {
                        arrayList2.set(i13, c0903i);
                        break;
                    } else {
                        arrayList2.add(i13, c0903i);
                        break;
                    }
                }
            }
        }
        m2220g();
    }

    public /* synthetic */ C0904j(Object obj, int i13) {
        this.f3302x = obj;
        this.f3301w = i13;
    }

    public C0904j(int i13, boolean z4) {
        switch (i13) {
            case 1:
                this.f3302x = new C13117a(8);
                break;
            case 3:
                break;
            case 9:
                this.f3302x = new C38059n(8);
                break;
            case 13:
                this.f3301w = 0;
                this.f3302x = new StringBuilder();
                break;
            default:
                this.f3302x = new LinkedHashMap();
                break;
        }
    }
}
