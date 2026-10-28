package t23;

import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import s83.AbstractC32269c;
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: t23.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C33479y extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public C22665e0 f139777E;

    /* JADX INFO: renamed from: F */
    public long f139778F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f139779G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C33368c0 f139780H;

    /* JADX INFO: renamed from: I */
    public int f139781I;

    /* JADX INFO: renamed from: w */
    public C33368c0 f139782w;

    /* JADX INFO: renamed from: x */
    public WebsocketReconnectStrategy f139783x;

    /* JADX INFO: renamed from: y */
    public String f139784y;

    /* JADX INFO: renamed from: z */
    public C22669g0 f139785z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33479y(C33368c0 c33368c0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139780H = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139779G = obj;
        this.f139781I |= Integer.MIN_VALUE;
        return this.f139780H.m105824s(null, null, this);
    }
}
