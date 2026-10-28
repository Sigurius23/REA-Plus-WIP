package fc3;

import androidx.room.C1769b2;
import ec3.InterfaceC13058l;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fc3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C14374e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f52483E;

    /* JADX INFO: renamed from: w */
    public C1769b2 f52484w;

    /* JADX INFO: renamed from: x */
    public InterfaceC13058l f52485x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f52486y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1769b2 f52487z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14374e(C1769b2 c1769b2, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f52487z = c1769b2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52486y = obj;
        this.f52483E |= Integer.MIN_VALUE;
        return this.f52487z.m5362b(null, this);
    }
}
