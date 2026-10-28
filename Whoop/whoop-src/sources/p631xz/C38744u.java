package p631xz;

import androidx.room.C1841x;
import ec3.InterfaceC13062m;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C38744u extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166733w;

    /* JADX INFO: renamed from: x */
    public int f166734x;

    /* JADX INFO: renamed from: y */
    public InterfaceC13062m f166735y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1841x f166736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38744u(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f166736z = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166733w = obj;
        this.f166734x |= Integer.MIN_VALUE;
        return this.f166736z.emit(null, this);
    }
}
