package w43;

import c93.InterfaceC4351m;
import l83.C23468n;
import p499t9.C33647p;
import p715kotlin.jvm.internal.C22665e0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C36829c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Throwable f157537E;

    /* JADX INFO: renamed from: F */
    public long f157538F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f157539G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C33647p f157540H;

    /* JADX INFO: renamed from: I */
    public int f157541I;

    /* JADX INFO: renamed from: w */
    public C33647p f157542w;

    /* JADX INFO: renamed from: x */
    public C36828b f157543x;

    /* JADX INFO: renamed from: y */
    public InterfaceC4351m f157544y;

    /* JADX INFO: renamed from: z */
    public C22665e0 f157545z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36829c(C33647p c33647p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f157540H = c33647p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157539G = obj;
        this.f157541I |= Integer.MIN_VALUE;
        Object objM106278u = this.f157540H.m106278u(null, null, this);
        return objM106278u == EnumC31071a.f128113w ? objM106278u : new C23468n(objM106278u);
    }
}
