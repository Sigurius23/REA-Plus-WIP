package androidx.room;

import p014aj.C0928c;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1791h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f7074w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0928c f7075x;

    /* JADX INFO: renamed from: y */
    public int f7076y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791h0(C0928c c0928c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f7075x = c0928c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7074w = obj;
        this.f7076y |= Integer.MIN_VALUE;
        this.f7075x.m2293A(null, this);
        return EnumC31071a.f128113w;
    }
}
