package g43;

import android.app.PendingIntent;
import android.support.v4.media.session.C1082p;
import io.getstream.video.android.model.StreamCallId;
import java.util.Map;
import s83.AbstractC32269c;
import t23.C33368c0;

/* JADX INFO: renamed from: g43.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C15471h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public StreamCallId f58098E;

    /* JADX INFO: renamed from: F */
    public StreamCallId f58099F;

    /* JADX INFO: renamed from: G */
    public AbstractC15473j f58100G;

    /* JADX INFO: renamed from: H */
    public PendingIntent f58101H;

    /* JADX INFO: renamed from: I */
    public C1082p f58102I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f58103J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ AbstractC15473j f58104K;

    /* JADX INFO: renamed from: L */
    public int f58105L;

    /* JADX INFO: renamed from: w */
    public AbstractC15473j f58106w;

    /* JADX INFO: renamed from: x */
    public C33368c0 f58107x;

    /* JADX INFO: renamed from: y */
    public String f58108y;

    /* JADX INFO: renamed from: z */
    public Map f58109z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15471h(AbstractC15473j abstractC15473j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f58104K = abstractC15473j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f58103J = obj;
        this.f58105L |= Integer.MIN_VALUE;
        return AbstractC15473j.m43668r(this.f58104K, null, null, this);
    }
}
