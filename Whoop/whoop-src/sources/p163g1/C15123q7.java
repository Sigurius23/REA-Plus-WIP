package p163g1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cz.C11194d;
import java.util.List;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.q7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15123q7 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56652E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56653w = 0;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ boolean f56654x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56655y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56656z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15123q7(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f56655y = interfaceC28601c1;
        this.f56656z = interfaceC28601c2;
        this.f56652E = interfaceC28601c3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56653w) {
            case 0:
                C15123q7 c15123q7 = new C15123q7((InterfaceC28601c1) this.f56655y, (InterfaceC28601c1) this.f56656z, (InterfaceC28601c1) this.f56652E, interfaceC30057d);
                c15123q7.f56654x = ((Boolean) obj).booleanValue();
                return c15123q7;
            default:
                C15123q7 c15123q8 = new C15123q7(this.f56654x, (InterfaceC2994c0) this.f56656z, (List) this.f56652E, interfaceC30057d);
                c15123q8.f56655y = obj;
                return c15123q8;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56653w) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C15123q7 c15123q7 = (C15123q7) create(bool, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c15123q7.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C15123q7 c15123q8 = (C15123q7) create((InterfaceC28661r1) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c15123q8.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f56653w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f56652E;
        Object obj3 = this.f56656z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                boolean z4 = this.f56654x;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f56655y;
                float f13 = AbstractC15133r7.f56711a;
                if (((Boolean) interfaceC28601c1.getValue()).booleanValue() != z4) {
                    Function1 function1 = (Function1) ((InterfaceC28601c1) obj3).getValue();
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(z4));
                    }
                    InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj2;
                    interfaceC28601c2.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c2.getValue()).booleanValue()));
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC28661r1 interfaceC28661r1 = (InterfaceC28661r1) this.f56655y;
                if (!this.f56654x) {
                    AbstractC3006f0.m8732z((InterfaceC2994c0) obj3, null, null, new C11194d((List) obj2, interfaceC28661r1, (InterfaceC30057d) null, 6), 3);
                }
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15123q7(boolean z4, InterfaceC2994c0 interfaceC2994c0, List list, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f56654x = z4;
        this.f56656z = interfaceC2994c0;
        this.f56652E = list;
    }
}
