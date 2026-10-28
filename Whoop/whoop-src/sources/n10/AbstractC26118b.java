package n10;

import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2324d;
import bc3.AbstractC3028k2;
import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.confirmation.intent.CallbackNotFoundException;
import com.whoop.android.R;
import g20.C15270p;
import k83.InterfaceC22297a;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n10.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC26118b {

    /* JADX INFO: renamed from: a */
    public final C2326f f103477a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22297a f103478b;

    public AbstractC26118b(C2326f errorReporter, InterfaceC22297a requestOptionsProvider) {
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(requestOptionsProvider, "requestOptionsProvider");
        this.f103477a = errorReporter;
        this.f103478b = requestOptionsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: a */
    public final Object m77679a(EnumC2324d enumC2324d, EnumC2323c enumC2323c, String str, String str2, InterfaceC4339a interfaceC4339a, AbstractC32269c abstractC32269c) throws CallbackNotFoundException {
        C26116a c26116a;
        String str3;
        AbstractC26118b abstractC26118b;
        EnumC2323c enumC2323c2;
        String str4;
        if (abstractC32269c instanceof C26116a) {
            c26116a = (C26116a) abstractC32269c;
            int i13 = c26116a.f103469G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26116a.f103469G = i13 - Integer.MIN_VALUE;
            } else {
                c26116a = new C26116a(this, abstractC32269c);
            }
        } else {
            c26116a = new C26116a(this, abstractC32269c);
        }
        C26116a c26116a2 = c26116a;
        Object objInvoke = c26116a2.f103467E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26116a2.f103469G;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            objInvoke = interfaceC4339a.invoke();
            if (objInvoke == null) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                C15270p c15270p = new C15270p(interfaceC4339a, this, enumC2324d, interfaceC30057d, 29);
                c26116a2.f103470w = this;
                c26116a2.f103471x = enumC2323c;
                c26116a2.f103472y = str;
                str3 = str2;
                c26116a2.f103473z = str3;
                c26116a2.f103469G = 1;
                objInvoke = AbstractC3028k2.m8751e(duration, c15270p, c26116a2);
                if (objInvoke == enumC31071a) {
                    return enumC31071a;
                }
                abstractC26118b = this;
                enumC2323c2 = enumC2323c;
                str4 = str;
            }
            return objInvoke;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str5 = c26116a2.f103473z;
        str4 = c26116a2.f103472y;
        EnumC2323c enumC2323c3 = c26116a2.f103471x;
        abstractC26118b = c26116a2.f103470w;
        AbstractC34132o.m107864I(objInvoke);
        str3 = str5;
        enumC2323c2 = enumC2323c3;
        if (objInvoke == null) {
            AbstractC35903f.m113990H(abstractC26118b.f103477a, enumC2323c2, null, null, 6);
            throw new CallbackNotFoundException(str4, ((C39857f) abstractC26118b.f103478b.get()).m127934f() ? AbstractC32128i.m100054h(R.string.stripe_internal_error) : AbstractC32128i.m100055i(str4), str3);
        }
        return objInvoke;
    }
}
