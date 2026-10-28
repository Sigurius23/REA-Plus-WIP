package t23;

import io.getstream.android.video.generated.models.Credentials;
import java.util.List;
import n23.AbstractC26205h;
import s83.AbstractC32269c;
import stream.video.sfu.event.ReconnectDetails;

/* JADX INFO: renamed from: t23.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33356a0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Credentials f139179E;

    /* JADX INFO: renamed from: F */
    public List f139180F;

    /* JADX INFO: renamed from: G */
    public ReconnectDetails f139181G;

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f139182H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C33368c0 f139183I;

    /* JADX INFO: renamed from: J */
    public int f139184J;

    /* JADX INFO: renamed from: w */
    public C33368c0 f139185w;

    /* JADX INFO: renamed from: x */
    public Object f139186x;

    /* JADX INFO: renamed from: y */
    public Object f139187y;

    /* JADX INFO: renamed from: z */
    public AbstractC26205h f139188z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33356a0(C33368c0 c33368c0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139183I = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139182H = obj;
        this.f139184J |= Integer.MIN_VALUE;
        return this.f139183I.m105826u(null, this);
    }
}
