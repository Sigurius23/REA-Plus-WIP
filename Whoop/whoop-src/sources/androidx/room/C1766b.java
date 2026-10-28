package androidx.room;

import java.util.concurrent.Callable;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import u00.C34377e;

/* JADX INFO: renamed from: androidx.room.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C1766b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Callable f6958w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f6959x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34377e f6960y;

    /* JADX INFO: renamed from: z */
    public int f6961z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1766b(C34377e c34377e, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f6960y = c34377e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f6959x = obj;
        this.f6961z |= Integer.MIN_VALUE;
        return this.f6960y.m108678s(null, false, null, this);
    }
}
