package bd3;

import java.util.LinkedHashMap;
import l83.C23455b;
import s83.AbstractC32267a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bd3.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3113b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12220E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f12221F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C3115c0 f12222G;

    /* JADX INFO: renamed from: H */
    public int f12223H;

    /* JADX INFO: renamed from: w */
    public C23455b f12224w;

    /* JADX INFO: renamed from: x */
    public C3115c0 f12225x;

    /* JADX INFO: renamed from: y */
    public LinkedHashMap f12226y;

    /* JADX INFO: renamed from: z */
    public String f12227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3113b0(C3115c0 c3115c0, AbstractC32267a abstractC32267a) {
        super(abstractC32267a);
        this.f12222G = c3115c0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12221F = obj;
        this.f12223H |= Integer.MIN_VALUE;
        return C3115c0.m8978a(this.f12222G, null, this);
    }
}
