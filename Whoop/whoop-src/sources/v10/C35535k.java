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
import p537ux.C35364z;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38887l3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: v10.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C35535k extends AbstractC35531g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35535k(Context context, InterfaceC4339a publishableKeyProvider, InterfaceC2227c1 stripeRepository, C30765d logger, InterfaceC30063j workContext) {
        super(context, new C2219a(publishableKeyProvider, 3), stripeRepository, logger, workContext);
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
        C35532h c35532h;
        if (abstractC32269c instanceof C35532h) {
            c35532h = (C35532h) abstractC32269c;
            int i13 = c35532h.f151182y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35532h.f151182y = i13 - Integer.MIN_VALUE;
            } else {
                c35532h = new C35532h(this, abstractC32269c);
            }
        } else {
            c35532h = new C35532h(this, abstractC32269c);
        }
        Object obj = c35532h.f151180w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35532h.f151182y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c35532h.f151182y = 1;
        Object objM7083e = ((C2273z0) this.f151176b).m7083e(str, str2, c35532h, c39857f);
        return objM7083e == enumC31071a ? enumC31071a : objM7083e;
    }

    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: d */
    public final AbstractC35345m0 mo112688d(InterfaceC38802c8 interfaceC38802c8, int i13, String str) {
        return new C35364z((C38887l3) interfaceC38802c8, i13, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: f */
    public final Object mo112690f(String str, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C35533i c35533i;
        if (abstractC32269c instanceof C35533i) {
            c35533i = (C35533i) abstractC32269c;
            int i13 = c35533i.f151185y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35533i.f151185y = i13 - Integer.MIN_VALUE;
            } else {
                c35533i = new C35533i(this, abstractC32269c);
            }
        } else {
            c35533i = new C35533i(this, abstractC32269c);
        }
        Object obj = c35533i.f151183w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35533i.f151185y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c35533i.f151185y = 1;
        Object objM7065K = ((C2273z0) this.f151176b).m7065K(str, c39857f, c35533i);
        return objM7065K == enumC31071a ? enumC31071a : objM7065K;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v10.AbstractC35531g
    /* JADX INFO: renamed from: g */
    public final Object mo112691g(String str, C39857f c39857f, List list, AbstractC32269c abstractC32269c) {
        C35534j c35534j;
        if (abstractC32269c instanceof C35534j) {
            c35534j = (C35534j) abstractC32269c;
            int i13 = c35534j.f151188y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35534j.f151188y = i13 - Integer.MIN_VALUE;
            } else {
                c35534j = new C35534j(this, abstractC32269c);
            }
        } else {
            c35534j = new C35534j(this, abstractC32269c);
        }
        Object obj = c35534j.f151186w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35534j.f151188y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c35534j.f151188y = 1;
        Object objM7071Q = ((C2273z0) this.f151176b).m7071Q(str, c39857f, list, c35534j);
        return objM7071Q == enumC31071a ? enumC31071a : objM7071Q;
    }
}
