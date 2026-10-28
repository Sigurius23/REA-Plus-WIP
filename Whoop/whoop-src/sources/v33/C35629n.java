package v33;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.CallState;

/* JADX INFO: renamed from: v33.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C35629n extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final CallState f151423a;

    /* JADX INFO: renamed from: b */
    public final C35630o f151424b;

    /* JADX INFO: renamed from: c */
    public final int f151425c;

    /* JADX INFO: renamed from: d */
    public final boolean f151426d;

    /* JADX INFO: renamed from: e */
    public final List f151427e;

    public C35629n(CallState callState, C35630o c35630o, int i13, boolean z4, List publishOptions) {
        AbstractC22676k.m65750j(publishOptions, "publishOptions");
        this.f151423a = callState;
        this.f151424b = c35630o;
        this.f151425c = i13;
        this.f151426d = z4;
        this.f151427e = publishOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35629n)) {
            return false;
        }
        C35629n c35629n = (C35629n) obj;
        return AbstractC22676k.m65745e(this.f151423a, c35629n.f151423a) && AbstractC22676k.m65745e(this.f151424b, c35629n.f151424b) && this.f151425c == c35629n.f151425c && this.f151426d == c35629n.f151426d && AbstractC22676k.m65745e(this.f151427e, c35629n.f151427e);
    }

    public final int hashCode() {
        return this.f151427e.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f151425c, (this.f151424b.hashCode() + (this.f151423a.hashCode() * 31)) * 31, 31), 31, this.f151426d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JoinCallResponseEvent(callState=");
        sb4.append(this.f151423a);
        sb4.append(", participantCount=");
        sb4.append(this.f151424b);
        sb4.append(", fastReconnectDeadlineSeconds=");
        AbstractC13673n.m38573t(this.f151425c, ", isReconnected=", ", publishOptions=", sb4, this.f151426d);
        return AbstractC3855a.m11829m(sb4, this.f151427e, ")");
    }
}
