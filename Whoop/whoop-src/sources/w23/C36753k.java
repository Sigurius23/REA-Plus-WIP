package w23;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w23.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C36753k extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f157290w;

    /* JADX INFO: renamed from: x */
    public int f157291x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1841x f157292y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36753k(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f157292y = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157290w = obj;
        this.f157291x |= Integer.MIN_VALUE;
        return this.f157292y.emit(null, this);
    }
}
