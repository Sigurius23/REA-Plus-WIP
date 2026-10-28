package p395p6;

import android.content.Context;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28910q0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f117005E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC28916s0 f117006F;

    /* JADX INFO: renamed from: G */
    public int f117007G;

    /* JADX INFO: renamed from: w */
    public Context f117008w;

    /* JADX INFO: renamed from: x */
    public int[] f117009x;

    /* JADX INFO: renamed from: y */
    public int f117010y;

    /* JADX INFO: renamed from: z */
    public int f117011z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28910q0(AbstractC28916s0 abstractC28916s0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f117006F = abstractC28916s0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f117005E = obj;
        this.f117007G |= Integer.MIN_VALUE;
        return this.f117006F.m87826a(null, null, null, this);
    }
}
