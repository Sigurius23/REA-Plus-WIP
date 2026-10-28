package lb;

import ec3.InterfaceC13062m;
import p040c0.C3723a0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C23566i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f93462w;

    /* JADX INFO: renamed from: x */
    public int f93463x;

    /* JADX INFO: renamed from: y */
    public InterfaceC13062m f93464y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3723a0 f93465z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23566i(C3723a0 c3723a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f93465z = c3723a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93462w = obj;
        this.f93463x |= Integer.MIN_VALUE;
        return this.f93465z.emit(null, this);
    }
}
