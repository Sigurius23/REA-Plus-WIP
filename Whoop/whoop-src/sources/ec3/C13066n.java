package ec3;

import bm.C3383g;
import java.util.Iterator;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C13066n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Iterator f45151E;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45152w;

    /* JADX INFO: renamed from: x */
    public int f45153x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3383g f45154y;

    /* JADX INFO: renamed from: z */
    public InterfaceC13062m f45155z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13066n(C3383g c3383g, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45154y = c3383g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45152w = obj;
        this.f45153x |= Integer.MIN_VALUE;
        return this.f45154y.collect(null, this);
    }
}
