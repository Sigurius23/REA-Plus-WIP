package t23;

import io.getstream.android.video.generated.models.Credentials;
import java.util.List;
import s83.AbstractC32269c;
import stream.video.sfu.event.ReconnectDetails;

/* JADX INFO: renamed from: t23.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33362b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Credentials f139217E;

    /* JADX INFO: renamed from: F */
    public List f139218F;

    /* JADX INFO: renamed from: G */
    public ReconnectDetails f139219G;

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f139220H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C33368c0 f139221I;

    /* JADX INFO: renamed from: J */
    public int f139222J;

    /* JADX INFO: renamed from: w */
    public C33368c0 f139223w;

    /* JADX INFO: renamed from: x */
    public String f139224x;

    /* JADX INFO: renamed from: y */
    public Object f139225y;

    /* JADX INFO: renamed from: z */
    public Object f139226z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33362b0(C33368c0 c33368c0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139221I = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139220H = obj;
        this.f139222J |= Integer.MIN_VALUE;
        return this.f139221I.m105827v(null, null, this);
    }
}
