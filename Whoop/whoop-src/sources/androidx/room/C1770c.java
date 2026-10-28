package androidx.room;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.AbstractC32269c;
import u00.C34377e;

/* JADX INFO: renamed from: androidx.room.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1770c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f6973E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C34377e f6974F;

    /* JADX INFO: renamed from: G */
    public int f6975G;

    /* JADX INFO: renamed from: w */
    public AbstractC1848z0 f6976w;

    /* JADX INFO: renamed from: x */
    public CancellationSignal f6977x;

    /* JADX INFO: renamed from: y */
    public Callable f6978y;

    /* JADX INFO: renamed from: z */
    public InterfaceC30063j f6979z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770c(C34377e c34377e, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f6974F = c34377e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f6973E = obj;
        this.f6975G |= Integer.MIN_VALUE;
        return this.f6974F.m108677r(null, null, null, this);
    }
}
