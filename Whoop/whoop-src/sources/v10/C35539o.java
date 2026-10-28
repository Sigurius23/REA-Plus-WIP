package v10;

import android.content.Context;
import b10.C2219a;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import c93.InterfaceC4339a;
import java.util.List;
import l83.C23468n;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p537ux.AbstractC35345m0;
import p537ux.C35335h0;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38840g6;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: v10.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C35539o extends AbstractC35531g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35539o(Context context, InterfaceC4339a publishableKeyProvider, InterfaceC2227c1 stripeRepository, C30765d logger, InterfaceC30063j workContext) {
        super(context, new C2219a(publishableKeyProvider, 4), stripeRepository, logger, workContext);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workContext, "workContext");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: c */
    public final Object mo112687c(String str, String str2, AbstractC32269c abstractC32269c, C39857f c39857f) {
        C35536l c35536l;
        if (abstractC32269c instanceof C35536l) {
            c35536l = (C35536l) abstractC32269c;
            int i13 = c35536l.f151191y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35536l.f151191y = i13 - Integer.MIN_VALUE;
            } else {
                c35536l = new C35536l(this, abstractC32269c);
            }
        } else {
            c35536l = new C35536l(this, abstractC32269c);
        }
        Object obj = c35536l.f151189w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35536l.f151191y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c35536l.f151191y = 1;
        Object objM7084f = ((C2273z0) this.f151176b).m7084f(str, str2, c35536l, c39857f);
        return objM7084f == enumC31071a ? enumC31071a : objM7084f;
    }

    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: d */
    public final AbstractC35345m0 mo112688d(InterfaceC38802c8 interfaceC38802c8, int i13, String str) {
        return new C35335h0((C38840g6) interfaceC38802c8, i13, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: f */
    public final Object mo112690f(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C35537m c35537m;
        if (abstractC32269c instanceof C35537m) {
            c35537m = (C35537m) abstractC32269c;
            int i13 = c35537m.f151194y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35537m.f151194y = i13 - Integer.MIN_VALUE;
            } else {
                c35537m = new C35537m(this, abstractC32269c);
            }
        } else {
            c35537m = new C35537m(this, abstractC32269c);
        }
        Object obj = c35537m.f151192w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35537m.f151194y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c35537m.f151194y = 1;
        Object objM7066L = ((C2273z0) this.f151176b).m7066L(str, c39857f, c35537m);
        return objM7066L == enumC31071a ? enumC31071a : objM7066L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: g */
    public final Object mo112691g(String str, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C35538n c35538n;
        if (abstractC32269c instanceof C35538n) {
            c35538n = (C35538n) abstractC32269c;
            int i13 = c35538n.f151197y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35538n.f151197y = i13 - Integer.MIN_VALUE;
            } else {
                c35538n = new C35538n(this, abstractC32269c);
            }
        } else {
            c35538n = new C35538n(this, abstractC32269c);
        }
        Object obj = c35538n.f151195w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35538n.f151197y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c35538n.f151197y = 1;
        Object objM7072R = ((C2273z0) this.f151176b).m7072R(str, c39857f, list, c35538n);
        return objM7072R == enumC31071a ? enumC31071a : objM7072R;
    }
}
