package a33;

import l83.C23468n;
import p715kotlin.jvm.functions.Function1;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0349a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1220E;

    /* JADX INFO: renamed from: F */
    public long f1221F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f1222G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C0352d f1223H;

    /* JADX INFO: renamed from: I */
    public int f1224I;

    /* JADX INFO: renamed from: w */
    public C0352d f1225w;

    /* JADX INFO: renamed from: x */
    public Function1 f1226x;

    /* JADX INFO: renamed from: y */
    public int f1227y;

    /* JADX INFO: renamed from: z */
    public int f1228z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349a(C0352d c0352d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1223H = c0352d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1222G = obj;
        this.f1224I |= Integer.MIN_VALUE;
        Object objM918E = this.f1223H.m918E(0, null, this);
        return objM918E == EnumC31071a.f128113w ? objM918E : new C23468n(objM918E);
    }
}
