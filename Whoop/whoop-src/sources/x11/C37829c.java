package x11;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: x11.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lx11/c;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "ctaMessage", "buttonLabel", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37829c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource ctaMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonLabel;

    public C37829c(Object event, TextResource ctaMessage, TextResource textResource) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(ctaMessage, "ctaMessage");
        this.event = event;
        this.ctaMessage = ctaMessage;
        this.buttonLabel = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonLabel() {
        return this.buttonLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCtaMessage() {
        return this.ctaMessage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37829c)) {
            return false;
        }
        C37829c c37829c = (C37829c) other;
        return AbstractC22676k.m65745e(this.event, c37829c.event) && AbstractC22676k.m65745e(this.ctaMessage, c37829c.ctaMessage) && AbstractC22676k.m65745e(this.buttonLabel, c37829c.buttonLabel);
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.event.hashCode() * 31, this.ctaMessage, 31);
        TextResource textResource = this.buttonLabel;
        return iM95625a + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.ctaMessage;
        TextResource textResource2 = this.buttonLabel;
        StringBuilder sb4 = new StringBuilder("GraphCardCTAState(event=");
        sb4.append(obj);
        sb4.append(", ctaMessage=");
        sb4.append(textResource);
        sb4.append(", buttonLabel=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }

    public /* synthetic */ C37829c(Object obj, TextResource textResource, TextResource textResource2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, textResource, textResource2);
    }
}
