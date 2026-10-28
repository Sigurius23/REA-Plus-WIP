package rt1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;

/* JADX INFO: renamed from: rt1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\u001e\u0010\"¨\u0006%"}, m65681d2 = {"Lrt1/c;", "", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "message", "primaryButtonText", "Lrt1/b;", "primaryButtonClickEvent", "secondaryButtonText", "secondaryButtonClickEvent", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrt1/b;Lcom/whoop/design/util/TextResource;Lrt1/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIcon", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lrt1/b;", "getPrimaryButtonClickEvent", "()Lrt1/b;", "f", "g", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31805c {

    /* JADX INFO: renamed from: h */
    public static final int f131728h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC31804b primaryButtonClickEvent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource secondaryButtonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC31804b secondaryButtonClickEvent;

    public C31805c(int i13, TextResource title, TextResource message, TextResource primaryButtonText, InterfaceC31804b interfaceC31804b, TextResource secondaryButtonText, InterfaceC31804b interfaceC31804b2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(secondaryButtonText, "secondaryButtonText");
        this.icon = i13;
        this.title = title;
        this.message = message;
        this.primaryButtonText = primaryButtonText;
        this.primaryButtonClickEvent = interfaceC31804b;
        this.secondaryButtonText = secondaryButtonText;
        this.secondaryButtonClickEvent = interfaceC31804b2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC31804b getSecondaryButtonClickEvent() {
        return this.secondaryButtonClickEvent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31805c)) {
            return false;
        }
        C31805c c31805c = (C31805c) other;
        return this.icon == c31805c.icon && AbstractC22676k.m65745e(this.title, c31805c.title) && AbstractC22676k.m65745e(this.message, c31805c.message) && AbstractC22676k.m65745e(this.primaryButtonText, c31805c.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, c31805c.primaryButtonClickEvent) && AbstractC22676k.m65745e(this.secondaryButtonText, c31805c.secondaryButtonText) && AbstractC22676k.m65745e(this.secondaryButtonClickEvent, c31805c.secondaryButtonClickEvent);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.title, 31), this.message, 31), this.primaryButtonText, 31);
        InterfaceC31804b interfaceC31804b = this.primaryButtonClickEvent;
        int iM95625a2 = AbstractC31061c.m95625a((iM95625a + (interfaceC31804b == null ? 0 : interfaceC31804b.hashCode())) * 31, this.secondaryButtonText, 31);
        InterfaceC31804b interfaceC31804b2 = this.secondaryButtonClickEvent;
        return iM95625a2 + (interfaceC31804b2 != null ? interfaceC31804b2.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.message;
        TextResource textResource3 = this.primaryButtonText;
        InterfaceC31804b interfaceC31804b = this.primaryButtonClickEvent;
        TextResource textResource4 = this.secondaryButtonText;
        InterfaceC31804b interfaceC31804b2 = this.secondaryButtonClickEvent;
        StringBuilder sbM91844n = AbstractC30007c.m91844n("LabradorReadingFailedDialogViewState(icon=", i13, ", title=", textResource, ", message=");
        AbstractC30007c.m91855y(sbM91844n, textResource2, ", primaryButtonText=", textResource3, ", primaryButtonClickEvent=");
        sbM91844n.append(interfaceC31804b);
        sbM91844n.append(", secondaryButtonText=");
        sbM91844n.append(textResource4);
        sbM91844n.append(", secondaryButtonClickEvent=");
        sbM91844n.append(interfaceC31804b2);
        sbM91844n.append(")");
        return sbM91844n.toString();
    }

    public /* synthetic */ C31805c(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC31804b interfaceC31804b, TextResource textResource4, InterfaceC31804b interfaceC31804b2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? EnumC16313m0.CROSS.toWhoopIcon() : i13, (i14 & 2) != 0 ? new TextResource.C8688b(AbstractC31794f.f131643Y, null, 2, null) : textResource, (i14 & 4) != 0 ? new TextResource.C8688b(AbstractC31794f.f131642X, null, 2, null) : textResource2, (i14 & 8) != 0 ? new TextResource.C8688b(AbstractC31794f.f131653e, null, 2, null) : textResource3, (i14 & 16) != 0 ? null : interfaceC31804b, (i14 & 32) != 0 ? new TextResource.C8688b(AbstractC31794f.f131665k, null, 2, null) : textResource4, (i14 & 64) != 0 ? null : interfaceC31804b2);
    }
}
