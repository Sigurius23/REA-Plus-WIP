package eu;

import android.os.Looper;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import l83.C23454a0;
import p127ev.C13668i;
import p390p1.AbstractC28667t;
import p390p1.C28647o;
import p390p1.C28679w;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28663s;
import p505ts.AbstractC34132o;
import p530up.C35146b;
import p530up.C35147c;
import p602x1.C37816b;
import p715kotlin.KotlinNothingValueException;
import q30.C29938w0;
import q83.C30065l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: eu.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C13624m extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C35147c f48265E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C28647o f48266F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C13636w f48267G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f48268H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC28601c1 f48269I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC28601c1 f48270J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC28601c1 f48271K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC28601c1 f48272L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC28601c1 f48273M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC28601c1 f48274N;

    /* JADX INFO: renamed from: w */
    public Object f48275w;

    /* JADX INFO: renamed from: x */
    public C35147c f48276x;

    /* JADX INFO: renamed from: y */
    public C37816b f48277y;

    /* JADX INFO: renamed from: z */
    public int f48278z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13624m(C35147c c35147c, C28647o c28647o, C13636w c13636w, int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC28601c1 interfaceC28601c6, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f48265E = c35147c;
        this.f48266F = c28647o;
        this.f48267G = c13636w;
        this.f48268H = i13;
        this.f48269I = interfaceC28601c1;
        this.f48270J = interfaceC28601c2;
        this.f48271K = interfaceC28601c3;
        this.f48272L = interfaceC28601c4;
        this.f48273M = interfaceC28601c5;
        this.f48274N = interfaceC28601c6;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C13624m(this.f48265E, this.f48266F, this.f48267G, this.f48268H, this.f48269I, this.f48270J, this.f48271K, this.f48272L, this.f48273M, this.f48274N, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((C13624m) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        return EnumC31071a.f128113w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C37816b c37816b;
        AbstractC28667t abstractC28667t;
        C35147c c35147c;
        Object objM92140a;
        InterfaceC28663s interfaceC28663s;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f48278z;
        if (i13 != 0) {
            if (i13 == 1) {
                c37816b = this.f48277y;
                C35147c c35147c2 = this.f48276x;
                abstractC28667t = (AbstractC28667t) this.f48275w;
                AbstractC34132o.m107864I(obj);
                c35147c = c35147c2;
                objM92140a = obj;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC28663s = (InterfaceC28663s) this.f48275w;
                try {
                    AbstractC34132o.m107864I(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            interfaceC28663s.dispose();
            throw th;
        }
        AbstractC34132o.m107864I(obj);
        c37816b = new C37816b(new C13622l(this.f48267G, this.f48268H, this.f48269I, this.f48270J, this.f48271K, this.f48272L, this.f48273M, this.f48274N), true, 102586552);
        abstractC28667t = this.f48266F;
        this.f48275w = abstractC28667t;
        c35147c = this.f48265E;
        this.f48276x = c35147c;
        this.f48277y = c37816b;
        this.f48278z = 1;
        C30065l c30065l = new C30065l(AbstractC15751g.m44424D(this));
        C13633t c13633t = new C13633t(c30065l);
        c35147c.getClass();
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("getMapAsync() must be called on the main thread");
        }
        C13668i c13668i = c35147c.f149132w;
        C29938w0 c29938w0 = (C29938w0) c13668i.f48454a;
        if (c29938w0 != null) {
            c29938w0.m91570t(c13633t);
        } else {
            ((ArrayList) c13668i.f48462i).add(c13633t);
        }
        objM92140a = c30065l.m92140a();
        if (objM92140a == enumC31071a) {
            return enumC31071a;
        }
        C28679w c28679w = new C28679w(abstractC28667t, new C13635v((C35146b) objM92140a, c35147c));
        c28679w.m87206A(c37816b);
        try {
            this.f48275w = c28679w;
            this.f48276x = null;
            this.f48277y = null;
            this.f48278z = 2;
            AbstractC3034m0.m8781a(this);
            return enumC31071a;
        } catch (Throwable th4) {
            th = th4;
            interfaceC28663s = c28679w;
        }
    }
}
