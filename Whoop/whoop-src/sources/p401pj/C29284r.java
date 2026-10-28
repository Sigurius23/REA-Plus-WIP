package p401pj;

import android.content.Context;
import android.graphics.Rect;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p525uj.C35035m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: pj.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C29284r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f118507E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f118508F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Nudge f118509G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Context f118510H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C35035m f118511I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC28601c1 f118512J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118513w;

    /* JADX INFO: renamed from: x */
    public int f118514x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Rect f118515y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C4861a f118516z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29284r(Rect rect, C4861a c4861a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Nudge nudge, Context context, C35035m c35035m, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f118513w = i13;
        this.f118515y = rect;
        this.f118516z = c4861a;
        this.f118507E = interfaceC28601c1;
        this.f118508F = interfaceC28601c2;
        this.f118509G = nudge;
        this.f118510H = context;
        this.f118511I = c35035m;
        this.f118512J = interfaceC28601c3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f118513w) {
            case 0:
                return new C29284r(this.f118515y, this.f118516z, this.f118507E, this.f118508F, this.f118509G, this.f118510H, this.f118511I, this.f118512J, interfaceC30057d, 0);
            default:
                return new C29284r(this.f118515y, this.f118516z, this.f118507E, this.f118508F, this.f118509G, this.f118510H, this.f118511I, this.f118512J, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f118513w) {
            case 0:
                break;
        }
        return ((C29284r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f118513w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f118514x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f118514x = 1;
                    Object objM8719m = AbstractC3006f0.m8719m(new C29288v(this.f118515y, this.f118516z, this.f118507E, this.f118508F, this.f118509G, this.f118510H, this.f118511I, this.f118512J, null), this);
                    if (objM8719m != enumC31071a) {
                        objM8719m = c23454a0;
                    }
                    if (objM8719m == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f118514x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f118514x = 1;
                    Object objM8719m2 = AbstractC3006f0.m8719m(new C29288v(this.f118515y, this.f118516z, this.f118507E, this.f118508F, this.f118509G, this.f118510H, this.f118511I, this.f118512J, null), this);
                    if (objM8719m2 != enumC31071a2) {
                        objM8719m2 = c23454a1;
                    }
                    if (objM8719m2 == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
        }
    }
}
