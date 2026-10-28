package yi1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import d11.C11474i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: yi1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lyi1/k;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lyi1/l;", "header", "Lcom/whoop/design/util/TextResource;", "body", "Ld11/i;", "cta", "<init>", "(Ljava/lang/Object;Lyi1/l;Lcom/whoop/design/util/TextResource;Ld11/i;)V", "a", "(Ljava/lang/Object;Lyi1/l;Lcom/whoop/design/util/TextResource;Ld11/i;)Lyi1/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lyi1/l;", "f", "()Lyi1/l;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Ld11/i;", "e", "()Ld11/i;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39577k implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39578l header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C11474i cta;

    public C39577k(Object event, C39578l header, TextResource body, C11474i cta) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        this.event = event;
        this.header = header;
        this.body = body;
        this.cta = cta;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39577k m126446b(C39577k c39577k, Object obj, C39578l c39578l, TextResource textResource, C11474i c11474i, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = c39577k.event;
        }
        if ((i13 & 2) != 0) {
            c39578l = c39577k.header;
        }
        if ((i13 & 4) != 0) {
            textResource = c39577k.body;
        }
        if ((i13 & 8) != 0) {
            c11474i = c39577k.cta;
        }
        return c39577k.m126447a(obj, c39578l, textResource, c11474i);
    }

    /* JADX INFO: renamed from: a */
    public final C39577k m126447a(Object event, C39578l header, TextResource body, C11474i cta) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        return new C39577k(event, header, body, cta);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11474i getCta() {
        return this.cta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39577k)) {
            return false;
        }
        C39577k c39577k = (C39577k) other;
        return AbstractC22676k.m65745e(this.event, c39577k.event) && AbstractC22676k.m65745e(this.header, c39577k.header) && AbstractC22676k.m65745e(this.body, c39577k.body) && AbstractC22676k.m65745e(this.cta, c39577k.cta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C39578l getHeader() {
        return this.header;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    public int hashCode() {
        return this.cta.hashCode() + AbstractC31061c.m95625a((this.header.hashCode() + (this.event.hashCode() * 31)) * 31, this.body, 31);
    }

    public String toString() {
        return "OnboardingCardViewState(event=" + this.event + ", header=" + this.header + ", body=" + this.body + ", cta=" + this.cta + ")";
    }
}
