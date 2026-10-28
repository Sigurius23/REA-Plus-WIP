package p401pj;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.TooltipFormFactor;
import l83.C23454a0;
import p328mj.C25609p;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: pj.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29262c0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ TooltipFormFactor f118410E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f118411F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f118412G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f118413H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC28601c1 f118414I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118415w;

    /* JADX INFO: renamed from: x */
    public int f118416x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C25609p f118417y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f118418z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29262c0(C25609p c25609p, String str, TooltipFormFactor tooltipFormFactor, long j7, int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d, int i15) {
        super(2, interfaceC30057d);
        this.f118415w = i15;
        this.f118417y = c25609p;
        this.f118418z = str;
        this.f118410E = tooltipFormFactor;
        this.f118411F = j7;
        this.f118412G = i13;
        this.f118413H = i14;
        this.f118414I = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f118415w) {
            case 0:
                return new C29262c0(this.f118417y, this.f118418z, this.f118410E, this.f118411F, this.f118412G, this.f118413H, this.f118414I, interfaceC30057d, 0);
            default:
                return new C29262c0(this.f118417y, this.f118418z, this.f118410E, this.f118411F, this.f118412G, this.f118413H, this.f118414I, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f118415w) {
            case 0:
                break;
        }
        return ((C29262c0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f118415w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f118416x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f118416x = 1;
                    if (AbstractC37978j.m121652m(this.f118417y, this.f118418z, this.f118410E, this.f118411F, this.f118412G, this.f118413H, this.f118414I, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f118416x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f118416x = 1;
                    if (AbstractC37978j.m121652m(this.f118417y, this.f118418z, this.f118410E, this.f118411F, this.f118412G, this.f118413H, this.f118414I, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
