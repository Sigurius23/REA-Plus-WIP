package gf;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import o23.C27486p;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ug.C34913b;
import vg.C35961h;

/* JADX INFO: renamed from: gf.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C15774o {

    /* JADX INFO: renamed from: a */
    public long f59443a;

    /* JADX INFO: renamed from: b */
    public Serializable f59444b;

    /* JADX INFO: renamed from: c */
    public Object f59445c;

    /* JADX INFO: renamed from: d */
    public Comparable f59446d;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public Object m44477a(Object obj, C27486p c27486p, AbstractC32269c abstractC32269c) {
        C15773n c15773n;
        C27486p c27486p2;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        Object obj2;
        Object obj3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f59444b;
        if (abstractC32269c instanceof C15773n) {
            c15773n = (C15773n) abstractC32269c;
            int i14 = c15773n.f59438G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c15773n.f59438G = i14 - Integer.MIN_VALUE;
            } else {
                c15773n = new C15773n(this, abstractC32269c);
            }
        } else {
            c15773n = new C15773n(this, abstractC32269c);
        }
        Object objInvoke = c15773n.f59436E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c15773n.f59438G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                C25437c c25437c = (C25437c) this.f59445c;
                c15773n.f59439w = obj;
                c15773n.f59440x = c27486p;
                c15773n.f59441y = c25437c;
                c15773n.f59442z = 0;
                c15773n.f59438G = 1;
                if (c25437c.mo68211b(c15773n) != enumC31071a) {
                    c27486p2 = c27486p;
                    interfaceC25435a = c25437c;
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = c15773n.f59441y;
                obj2 = c15773n.f59439w;
                try {
                    AbstractC34132o.m107864I(objInvoke);
                    linkedHashMap.put(obj2, (C35961h) objInvoke);
                    interfaceC25435a = interfaceC25435a2;
                    obj3 = ((C35961h) objInvoke).f153125a;
                    interfaceC25435a.mo68214i(null);
                    return obj3;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = c15773n.f59442z;
            interfaceC25435a = c15773n.f59441y;
            c27486p2 = c15773n.f59440x;
            Object obj4 = c15773n.f59439w;
            AbstractC34132o.m107864I(objInvoke);
            i13 = i16;
            obj = obj4;
            C33647p c33647p = C34913b.f147015x;
            if (C33647p.m106274t().compareTo((C34913b) this.f59446d) > 0) {
                m44478b();
            }
            C35961h c35961h = (C35961h) linkedHashMap.get(obj);
            if (c35961h != null) {
                if (!(C33647p.m106274t().compareTo(c35961h.f153126b) >= 0)) {
                    obj3 = c35961h.f153125a;
                }
                interfaceC25435a.mo68214i(null);
                return obj3;
            }
            c15773n.f59439w = obj;
            c15773n.f59440x = null;
            c15773n.f59441y = interfaceC25435a;
            c15773n.f59442z = i13;
            c15773n.f59438G = 2;
            objInvoke = c27486p2.invoke(obj, c15773n);
            if (objInvoke != enumC31071a) {
                InterfaceC25435a interfaceC25435a3 = interfaceC25435a;
                obj2 = obj;
                interfaceC25435a2 = interfaceC25435a3;
                linkedHashMap.put(obj2, (C35961h) objInvoke);
                interfaceC25435a = interfaceC25435a2;
                obj3 = ((C35961h) objInvoke).f153125a;
                interfaceC25435a.mo68214i(null);
                return obj3;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m44478b() {
        Iterator it = ((LinkedHashMap) this.f59444b).entrySet().iterator();
        while (it.hasNext()) {
            C35961h c35961h = (C35961h) ((Map.Entry) it.next()).getValue();
            C33647p c33647p = C34913b.f147015x;
            if (C33647p.m106274t().compareTo(c35961h.f153126b) >= 0) {
                it.remove();
            }
        }
        C33647p c33647p2 = C34913b.f147015x;
        this.f59446d = C33647p.m106274t().m110115d(this.f59443a);
    }
}
