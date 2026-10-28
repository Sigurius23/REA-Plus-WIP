package t23;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33445r0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f139600w;

    /* JADX INFO: renamed from: x */
    public int f139601x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f139602y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33445r0(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f139602y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139600w = obj;
        this.f139601x |= Integer.MIN_VALUE;
        return this.f139602y.emit(null, this);
    }
}
