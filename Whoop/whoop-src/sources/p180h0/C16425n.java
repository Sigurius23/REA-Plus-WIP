package p180h0;

import androidx.compose.foundation.gestures.AbstractC1096a;
import androidx.room.EnumC1840w1;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import gm1.C15992b;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lb.C23571n;
import p007a6.C0458v;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16425n extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC23459e f63123E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63124w = 0;

    /* JADX INFO: renamed from: x */
    public int f63125x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f63126y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f63127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16425n(C16435p c16435p, Object obj, InterfaceC4352n interfaceC4352n, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f63126y = c16435p;
        this.f63127z = obj;
        this.f63123E = interfaceC4352n;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f63124w) {
            case 0:
                return new C16425n((C16435p) this.f63126y, this.f63127z, (InterfaceC4352n) this.f63123E, interfaceC30057d);
            default:
                return new C16425n((C23571n) this.f63126y, (EnumC1840w1) this.f63127z, (InterfaceC4351m) this.f63123E, interfaceC30057d);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f63124w) {
            case 0:
                break;
        }
        return ((C16425n) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f63124w) {
            case 0:
                C16435p c16435p = (C16435p) this.f63126y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f63125x;
                Object obj2 = this.f63127z;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    c16435p.f63156h.setValue(obj2);
                    C16415l c16415l = new C16415l(c16435p, 2);
                    C0458v c0458v = new C0458v((InterfaceC4352n) this.f63123E, c16435p, (InterfaceC30057d) null, 10);
                    this.f63125x = 1;
                    if (AbstractC1096a.m3370a(c16415l, c0458v, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C15992b c15992b = c16435p.f63149a;
                c16435p.f63158j.m46600b(((C16475x) c16435p.m46613c()).m46650e(obj2), c16435p.f63155g.m87022x());
                c16435p.f63152d.setValue(obj2);
                c16435p.m46617g(obj2);
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f63125x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C23571n c23571n = (C23571n) this.f63126y;
                EnumC1840w1 enumC1840w1 = (EnumC1840w1) this.f63127z;
                ?? r10 = (AbstractC32275i) this.f63123E;
                this.f63125x = 1;
                Object objM68217e = c23571n.m68217e(enumC1840w1, r10, this);
                return objM68217e == enumC31071a2 ? enumC31071a2 : objM68217e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16425n(C23571n c23571n, EnumC1840w1 enumC1840w1, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f63126y = c23571n;
        this.f63127z = enumC1840w1;
        this.f63123E = (AbstractC32275i) interfaceC4351m;
    }
}
