package e10;

import a00.C0073h;
import androidx.lifecycle.C1601k1;
import com.whoop.android.R;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: e10.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12550i0 {

    /* JADX INFO: renamed from: a */
    public final C1601k1 f42871a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12551j f42872b;

    /* JADX INFO: renamed from: c */
    public Object f42873c;

    /* JADX INFO: renamed from: d */
    public final String f42874d;

    /* JADX INFO: renamed from: e */
    public final String f42875e;

    public C12550i0(C1601k1 savedStateHandle, InterfaceC12551j definition) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(definition, "definition");
        this.f42871a = savedStateHandle;
        this.f42872b = definition;
        this.f42874d = definition.getKey().concat("Parameters");
        this.f42875e = definition.getKey();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m35205a(InterfaceC12555l interfaceC12555l, C12553k c12553k, AbstractC32269c abstractC32269c) {
        C12548h0 c12548h0;
        C12550i0 c12550i0;
        InterfaceC12555l interfaceC12555l2;
        if (abstractC32269c instanceof C12548h0) {
            c12548h0 = (C12548h0) abstractC32269c;
            int i13 = c12548h0.f42866F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12548h0.f42866F = i13 - Integer.MIN_VALUE;
            } else {
                c12548h0 = new C12548h0(this, abstractC32269c);
            }
        } else {
            c12548h0 = new C12548h0(this, abstractC32269c);
        }
        Object objMo35210e = c12548h0.f42870z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12548h0.f42866F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo35210e);
            InterfaceC12551j interfaceC12551j = this.f42872b;
            InterfaceC12555l interfaceC12555lMo35207b = interfaceC12551j.mo35207b(interfaceC12555l);
            if (interfaceC12555lMo35207b == null) {
                Class<?> cls = interfaceC12555l.getClass();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                return new C12540d0(new IllegalArgumentException(AbstractC2875y.m8300m("Parameter type of '", c22673i0.getOrCreateKotlinClass(cls).getSimpleName(), "' cannot be used with ", c22673i0.getOrCreateKotlinClass(C12550i0.class).getSimpleName(), " to read a result")), AbstractC32128i.m100054h(R.string.stripe_something_went_wrong), C12567r.f42912a);
            }
            c12548h0.f42867w = this;
            c12548h0.f42868x = c12553k;
            c12548h0.f42869y = interfaceC12555lMo35207b;
            c12548h0.f42866F = 1;
            objMo35210e = interfaceC12551j.mo35210e(interfaceC12555lMo35207b, c12553k, c12548h0);
            if (objMo35210e == enumC31071a) {
                return enumC31071a;
            }
            c12550i0 = this;
            interfaceC12555l2 = interfaceC12555lMo35207b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC12555l interfaceC12555l3 = c12548h0.f42869y;
            c12553k = c12548h0.f42868x;
            C12550i0 c12550i1 = c12548h0.f42867w;
            AbstractC34132o.m107864I(objMo35210e);
            interfaceC12555l2 = interfaceC12555l3;
            c12550i0 = c12550i1;
        }
        C12553k c12553k2 = c12553k;
        InterfaceC12539d interfaceC12539d = (InterfaceC12539d) objMo35210e;
        if (interfaceC12539d instanceof C12537c) {
            Object obj = c12550i0.f42873c;
            if (obj != null) {
                C12537c c12537c = (C12537c) interfaceC12539d;
                return new C12542e0(new C0073h(c12550i0, interfaceC12555l2, c12553k2, c12537c, obj, 7), c12537c.f42843b);
            }
            IllegalStateException illegalStateException = new IllegalStateException(AbstractC11895b.m31996o("No launcher for ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(c12550i0.f42872b.getClass()).getSimpleName(), " was found, did you call register?"));
            return new C12540d0(illegalStateException, AbstractC37926s0.m121456H(illegalStateException), C12563p.f42902a);
        }
        if (interfaceC12539d instanceof C12533a) {
            C12533a c12533a = (C12533a) interfaceC12539d;
            return new C12538c0(c12533a.f42835a, c12533a.f42836b, c12533a.f42837c);
        }
        if (!(interfaceC12539d instanceof C12535b)) {
            throw new NoWhenBranchMatchedException();
        }
        C12535b c12535b = (C12535b) interfaceC12539d;
        return new C12540d0(c12535b.f42839a, c12535b.f42840b, c12535b.f42841c);
    }
}
