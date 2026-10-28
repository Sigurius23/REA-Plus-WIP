package rv2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: rv2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Lrv2/c;", "", "Lcom/whoop/design/util/TextResource;", "title", "primaryActionText", "Ly81/e;", "primaryActionColor", "secondaryActionText", "description", "Lrv2/d;", "approveEvent", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrv2/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ly81/e;", "()Ly81/e;", "e", "Lrv2/d;", "()Lrv2/d;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31845c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource primaryActionText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e primaryActionColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondaryActionText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC31846d approveEvent;

    public C31845c(TextResource title, TextResource primaryActionText, InterfaceC39332e primaryActionColor, TextResource secondaryActionText, TextResource description, InterfaceC31846d approveEvent) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(primaryActionText, "primaryActionText");
        AbstractC22676k.m65750j(primaryActionColor, "primaryActionColor");
        AbstractC22676k.m65750j(secondaryActionText, "secondaryActionText");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(approveEvent, "approveEvent");
        this.title = title;
        this.primaryActionText = primaryActionText;
        this.primaryActionColor = primaryActionColor;
        this.secondaryActionText = secondaryActionText;
        this.description = description;
        this.approveEvent = approveEvent;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC31846d getApproveEvent() {
        return this.approveEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getPrimaryActionColor() {
        return this.primaryActionColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPrimaryActionText() {
        return this.primaryActionText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSecondaryActionText() {
        return this.secondaryActionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31845c)) {
            return false;
        }
        C31845c c31845c = (C31845c) other;
        return AbstractC22676k.m65745e(this.title, c31845c.title) && AbstractC22676k.m65745e(this.primaryActionText, c31845c.primaryActionText) && AbstractC22676k.m65745e(this.primaryActionColor, c31845c.primaryActionColor) && AbstractC22676k.m65745e(this.secondaryActionText, c31845c.secondaryActionText) && AbstractC22676k.m65745e(this.description, c31845c.description) && AbstractC22676k.m65745e(this.approveEvent, c31845c.approveEvent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.approveEvent.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.primaryActionColor, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.primaryActionText, 31), 31), this.secondaryActionText, 31), this.description, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.primaryActionText;
        InterfaceC39332e interfaceC39332e = this.primaryActionColor;
        TextResource textResource3 = this.secondaryActionText;
        TextResource textResource4 = this.description;
        InterfaceC31846d interfaceC31846d = this.approveEvent;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("WorkoutLibraryDialogState(title=", textResource, ", primaryActionText=", textResource2, ", primaryActionColor=");
        AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", secondaryActionText=", textResource3, ", description=");
        sbM106658q.append(textResource4);
        sbM106658q.append(", approveEvent=");
        sbM106658q.append(interfaceC31846d);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
