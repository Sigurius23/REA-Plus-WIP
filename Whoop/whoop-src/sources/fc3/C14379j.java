package fc3;

import androidx.room.C1769b2;
import bc3.InterfaceC3027k1;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fc3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C14379j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C1769b2 f52496E;

    /* JADX INFO: renamed from: F */
    public int f52497F;

    /* JADX INFO: renamed from: w */
    public C1769b2 f52498w;

    /* JADX INFO: renamed from: x */
    public Object f52499x;

    /* JADX INFO: renamed from: y */
    public InterfaceC3027k1 f52500y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f52501z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14379j(C1769b2 c1769b2, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f52496E = c1769b2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52501z = obj;
        this.f52497F |= Integer.MIN_VALUE;
        return this.f52496E.emit(null, this);
    }
}
