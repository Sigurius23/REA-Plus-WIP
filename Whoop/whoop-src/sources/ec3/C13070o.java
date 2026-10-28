package ec3;

import bm.C3383g;
import java.util.Iterator;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13070o extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Iterator f45161E;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45162w;

    /* JADX INFO: renamed from: x */
    public int f45163x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3383g f45164y;

    /* JADX INFO: renamed from: z */
    public InterfaceC13062m f45165z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13070o(C3383g c3383g, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45164y = c3383g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45162w = obj;
        this.f45163x |= Integer.MIN_VALUE;
        return this.f45164y.collect(null, this);
    }
}
