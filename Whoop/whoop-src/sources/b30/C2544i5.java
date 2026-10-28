package b30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.view.CardNumberEditText;
import ec3.C13045h2;
import g40.C15432v;
import g40.C15440w2;
import g40.InterfaceC15450y2;
import i20.C17948h1;
import i20.C17954j1;
import i20.InterfaceC17951i1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m63.C25126d;
import m83.C25272z;
import n00.C26075c;
import n00.C26083k;
import p164g2.C15240l;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p292l1.C23203x4;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.i5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2544i5 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9877w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ boolean f9878x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9879y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2544i5(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9877w = i13;
        this.f9879y = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f9877w) {
            case 0:
                return new C2544i5(this.f9878x, (InterfaceC15237i) this.f9879y, interfaceC30057d, 0);
            case 1:
                return new C2544i5(this.f9878x, (C15247s) this.f9879y, interfaceC30057d, 1);
            case 2:
                return new C2544i5((C17954j1) this.f9879y, this.f9878x, interfaceC30057d, 2);
            case 3:
                C2544i5 c2544i5 = new C2544i5((C23203x4) this.f9879y, interfaceC30057d, 3);
                c2544i5.f9878x = ((Boolean) obj).booleanValue();
                return c2544i5;
            case 4:
                C2544i5 c2544i6 = new C2544i5((C26083k) this.f9879y, interfaceC30057d, 4);
                c2544i6.f9878x = ((Boolean) obj).booleanValue();
                return c2544i6;
            case 5:
                return new C2544i5((C15440w2) this.f9879y, this.f9878x, interfaceC30057d, 5);
            default:
                return new C2544i5((CardNumberEditText) this.f9879y, this.f9878x, interfaceC30057d, 6);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9877w) {
            case 0:
                C2544i5 c2544i5 = (C2544i5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c2544i5.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C2544i5 c2544i6 = (C2544i5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c2544i6.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C2544i5 c2544i7 = (C2544i5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c2544i7.invokeSuspend(c23454a2);
                return c23454a2;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C2544i5 c2544i8 = (C2544i5) create(bool, (InterfaceC30057d) obj2);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c2544i8.invokeSuspend(c23454a3);
                return c23454a3;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                C2544i5 c2544i9 = (C2544i5) create(bool2, (InterfaceC30057d) obj2);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c2544i9.invokeSuspend(c23454a4);
                return c23454a4;
            case 5:
                C2544i5 c2544i10 = (C2544i5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c2544i10.invokeSuspend(c23454a5);
                return c23454a5;
            default:
                C2544i5 c2544i11 = (C2544i5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c2544i11.invokeSuspend(c23454a6);
                return c23454a6;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i13 = this.f9877w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f9879y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (this.f9878x) {
                    ((C15240l) ((InterfaceC15237i) obj2)).m43339b(false);
                }
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (this.f9878x) {
                    ((C15247s) obj2).m43352b();
                }
                break;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C17954j1 c17954j1 = (C17954j1) obj2;
                C25126d c25126d = c17954j1.f69751L;
                if (((InterfaceC17951i1) c17954j1.f69745F.getValue()) instanceof C17948h1) {
                    if (!this.f9878x) {
                        Map map = c17954j1.f69746G;
                        if (map == null) {
                            map = C25272z.f99163w;
                        }
                        c25126d.getClass();
                        ((C15432v) c25126d.f98486z).mo43539h(map);
                    } else {
                        LinkedHashMap linkedHashMap = c17954j1.f69744E;
                        if (linkedHashMap != null) {
                            c25126d.getClass();
                            ((C15432v) c25126d.f98486z).mo43539h(linkedHashMap);
                        }
                    }
                }
                break;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (!this.f9878x) {
                    ((C23203x4) obj2).m67159a();
                }
                break;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                boolean z4 = this.f9878x;
                int i14 = C26083k.f103293R;
                C13045h2 c13045h2 = ((C26083k) obj2).f103303N;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C26075c.m77570a((C26075c) value, z4, null, false, null, null, 253)));
                break;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                List list = ((C15440w2) obj2).f58025b;
                boolean z13 = this.f9878x;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC15450y2) it.next()).mo43537b(z13);
                }
                break;
            default:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((CardNumberEditText) obj2).isLoadingCallback.invoke(Boolean.valueOf(this.f9878x));
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2544i5(Object obj, boolean z4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9877w = i13;
        this.f9879y = obj;
        this.f9878x = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2544i5(boolean z4, Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f9877w = i13;
        this.f9878x = z4;
        this.f9879y = obj;
    }
}
