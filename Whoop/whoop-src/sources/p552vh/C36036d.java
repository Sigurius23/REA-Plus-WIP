package p552vh;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import c93.InterfaceC4339a;
import f93.C14289a;
import fi.C14509o;
import gi.C15877h;
import hc3.AbstractC17182o;
import kc3.C22365e;
import p023ay.C2147u;
import p461rh.AbstractC31426o;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22659b0;
import p739ui0.C35015q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sh.C32483i;
import sh.InterfaceC32485k;
import sh.InterfaceC32491q;

/* JADX INFO: renamed from: vh.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36036d implements InterfaceC32485k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32491q f153721a;

    /* JADX INFO: renamed from: b */
    public final C14509o f153722b;

    /* JADX INFO: renamed from: c */
    public final boolean f153723c;

    public C36036d(InterfaceC32491q interfaceC32491q, C14509o c14509o, boolean z4) {
        this.f153721a = interfaceC32491q;
        this.f153722b = c14509o;
        this.f153723c = z4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sh.InterfaceC32485k
    /* JADX INFO: renamed from: a */
    public final Object mo71006a(InterfaceC30057d interfaceC30057d) {
        C36034b c36034b;
        C22659b0 c22659b0;
        C36036d c36036d;
        C22659b0 c22659b1;
        if (interfaceC30057d instanceof C36034b) {
            c36034b = (C36034b) interfaceC30057d;
            int i13 = c36034b.f153711E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c36034b.f153711E = i13 - Integer.MIN_VALUE;
            } else {
                c36034b = new C36034b(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c36034b = new C36034b(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM114401b = c36034b.f153714y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c36034b.f153711E;
        if (i14 != 0) {
            if (i14 == 1) {
                c22659b0 = c36034b.f153713x;
                c36036d = (C36036d) c36034b.f153712w;
                AbstractC34132o.m107864I(objM114401b);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22659b1 = (C22659b0) c36034b.f153712w;
                AbstractC34132o.m107864I(objM114401b);
            }
            return new C32483i(AbstractC31426o.m96739c((Drawable) objM114401b), c22659b1.f89329w);
        }
        AbstractC34132o.m107864I(objM114401b);
        C22659b0 c22659b2 = new C22659b0();
        C35015q c35015q = new C35015q(15, this, c22659b2);
        c36034b.f153712w = this;
        c36034b.f153713x = c22659b2;
        c36034b.f153711E = 1;
        Object objM8701G = AbstractC3006f0.m8701G(c35015q, c36034b);
        if (objM8701G != enumC31071a) {
            c22659b0 = c22659b2;
            objM114401b = objM8701G;
            c36036d = this;
        }
        return enumC31071a;
        c36034b.f153712w = c22659b0;
        c36034b.f153713x = null;
        c36034b.f153711E = 2;
        objM114401b = c36036d.m114401b((Drawable) objM114401b, c36034b);
        if (objM114401b != enumC31071a) {
            c22659b1 = c22659b0;
            return new C32483i(AbstractC31426o.m96739c((Drawable) objM114401b), c22659b1.f89329w);
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m114401b(Drawable drawable, AbstractC32269c abstractC32269c) {
        C36035c c36035c;
        C36036d c36036d;
        if (abstractC32269c instanceof C36035c) {
            c36035c = (C36035c) abstractC32269c;
            int i13 = c36035c.f153716E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c36035c.f153716E = i13 - Integer.MIN_VALUE;
            } else {
                c36035c = new C36035c(this, abstractC32269c);
            }
        } else {
            c36035c = new C36035c(this, abstractC32269c);
        }
        Object obj = c36035c.f153719y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c36035c.f153716E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            C14509o c14509o = this.f153722b;
            C14289a c14289a = AbstractC36038f.f153733a;
            if (((Number) AbstractC31426o.m96742f(c14509o, c14289a)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) AbstractC31426o.m96742f(c14509o, c14289a)).intValue());
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) AbstractC31426o.m96742f(c14509o, AbstractC36038f.f153735c);
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) AbstractC31426o.m96742f(c14509o, AbstractC36038f.f153736d);
            if (interfaceC4339a == null && interfaceC4339a2 == null) {
                c36036d = this;
            } else {
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
                C2147u c2147u = new C2147u(drawable, interfaceC4339a, interfaceC4339a2, null, 24);
                c36035c.f153717w = this;
                c36035c.f153718x = (AnimatedImageDrawable) drawable;
                c36035c.f153716E = 1;
                if (AbstractC3006f0.m8705K(abstractC3069w1Mo8825s, c2147u, c36035c) == enumC31071a) {
                    return enumC31071a;
                }
                c36036d = this;
                drawable = drawable;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = c36035c.f153718x;
            c36036d = c36035c.f153717w;
            AbstractC34132o.m107864I(obj);
        }
        return new C15877h(drawable, c36036d.f153722b.f53005c);
    }
}
