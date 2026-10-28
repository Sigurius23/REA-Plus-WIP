package ep1;

import com.whoop.bot.models.feedback.FeedbackReason;
import gh0.AbstractC15850e;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ep1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13411f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f46973w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39967p f46974x;

    public /* synthetic */ C13411f(C39967p c39967p, int i13) {
        this.f46973w = i13;
        this.f46974x = c39967p;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f46973w) {
            case 0:
                return AbstractC13413h.m37953v(this.f46974x, obj);
            default:
                return AbstractC15850e.m44738y(this.f46974x, (FeedbackReason) obj);
        }
    }
}
