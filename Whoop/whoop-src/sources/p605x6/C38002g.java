package p605x6;

import mc3.C25437c;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x6.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C38002g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C38007l f162788E;

    /* JADX INFO: renamed from: F */
    public int f162789F;

    /* JADX INFO: renamed from: w */
    public Object f162790w;

    /* JADX INFO: renamed from: x */
    public AbstractC32275i f162791x;

    /* JADX INFO: renamed from: y */
    public C25437c f162792y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f162793z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38002g(C38007l c38007l, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f162788E = c38007l;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162793z = obj;
        this.f162789F |= Integer.MIN_VALUE;
        return C38007l.m121742b(this.f162788E, null, this);
    }
}
