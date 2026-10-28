package ie;

import bf.AbstractC3187b;
import bf.InterfaceC3186a;
import cf.InterfaceC4526a;
import e93.AbstractC12889b;
import gm.C15990r;
import h02.C16587n0;
import ib0.C18332c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p485sf.C32433e;
import p485sf.C32441m;
import p550vd.AbstractC35903f;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30063j;
import s93.AbstractC32309k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ie.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18440c implements InterfaceC4526a {
    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: c */
    public final Object mo14169c(C32433e c32433e, C32441m c32441m) {
        String strM74110N0;
        InterfaceC30063j context = c32441m.getContext();
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18440c.class).getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
        }
        C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
        Set set = (Set) c32433e.f134269c.mo33082b(AbstractC3187b.f12493a);
        if (set == null) {
            return c32433e.f134268b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC3186a interfaceC3186a = (InterfaceC3186a) next;
            if (interfaceC3186a.mo9168a().length() > 2) {
                c15990rM113984B.mo390n(null, new C16587n0(interfaceC3186a, 18));
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            strM74110N0 = "";
        } else {
            strM74110N0 = AbstractC25265s.m74110N0(arrayList, ",", "m/", null, new C18332c(13), 28);
            byte[] bArrM125919D = AbstractC39421y.m125919D(strM74110N0);
            if (bArrM125919D.length > 1024) {
                byte[] bArrM74038N0 = AbstractC25260n.m74038N0(bArrM125919D, AbstractC12889b.m36278i0(0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED));
                int length = bArrM74038N0.length - 1;
                if (length < 0) {
                    length = -1;
                    break;
                }
                while (true) {
                    int i13 = length - 1;
                    if (bArrM74038N0[length] == 44) {
                        break;
                    }
                    if (i13 < 0) {
                        length = -1;
                        break;
                    }
                    length = i13;
                }
                Integer numValueOf = length != -1 ? Integer.valueOf(length) : null;
                if (numValueOf == null) {
                    throw new IllegalStateException("Business metrics are incorrectly formatted: ".concat(strM74110N0));
                }
                strM74110N0 = AbstractC39421y.m125917B(bArrM125919D, 0, numValueOf.intValue(), true);
            }
        }
        String str = (String) c32433e.f134268b.getHeaders().get("User-Agent");
        C35937b c35937bM100579i = AbstractC32309k.m100579i(c32433e.f134268b);
        c35937bM100579i.f153017y.m380N(str + strM74110N0, "User-Agent");
        return c35937bM100579i.m114177b();
    }
}
