package p395p6;

import android.content.Context;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28868c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f116837E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC28880g0 f116838F;

    /* JADX INFO: renamed from: G */
    public int f116839G;

    /* JADX INFO: renamed from: w */
    public Context f116840w;

    /* JADX INFO: renamed from: x */
    public C28864b f116841x;

    /* JADX INFO: renamed from: y */
    public Throwable f116842y;

    /* JADX INFO: renamed from: z */
    public int f116843z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28868c0(AbstractC28880g0 abstractC28880g0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116838F = abstractC28880g0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116837E = obj;
        this.f116839G |= Integer.MIN_VALUE;
        return this.f116838F.m87800b(null, 0, this);
    }
}
