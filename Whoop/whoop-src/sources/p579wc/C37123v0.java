package p579wc;

import java.io.Closeable;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37123v0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158814E;

    /* JADX INFO: renamed from: w */
    public C37113q0 f158815w;

    /* JADX INFO: renamed from: x */
    public Closeable f158816x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158817y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37127x0 f158818z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37123v0(C37127x0 c37127x0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158818z = c37127x0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158817y = obj;
        this.f158814E |= Integer.MIN_VALUE;
        return this.f158818z.m119042d(null, this);
    }
}
