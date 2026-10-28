package d33;

import java.util.List;
import s83.AbstractC32269c;
import stream.video.sfu.event.ReconnectDetails;

/* JADX INFO: renamed from: d33.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C11630u extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f37557E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11602h1 f37558F;

    /* JADX INFO: renamed from: G */
    public int f37559G;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37560w;

    /* JADX INFO: renamed from: x */
    public ReconnectDetails f37561x;

    /* JADX INFO: renamed from: y */
    public List f37562y;

    /* JADX INFO: renamed from: z */
    public String f37563z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11630u(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37558F = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37557E = obj;
        this.f37559G |= Integer.MIN_VALUE;
        return this.f37558F.m31034i(null, null, this);
    }
}
