package rt1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;

/* JADX INFO: renamed from: rt1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, m65681d2 = {"Lrt1/d;", "", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "message", "primaryButtonText", "Lrt1/b;", "primaryButtonClickEvent", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lrt1/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIcon", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "e", "Lrt1/b;", "()Lrt1/b;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31806d {

    /* JADX INFO: renamed from: f */
    public static final int f131736f = TextResource.$stable;

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

    public C31806d(int i13, TextResource title, TextResource message, TextResource primaryButtonText, InterfaceC31804b interfaceC31804b) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        this.icon = i13;
        this.title = title;
        this.message = message;
        this.primaryButtonText = primaryButtonText;
        this.primaryButtonClickEvent = interfaceC31804b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC31804b getPrimaryButtonClickEvent() {
        return this.primaryButtonClickEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31806d)) {
            return false;
        }
        C31806d c31806d = (C31806d) other;
        return this.icon == c31806d.icon && AbstractC22676k.m65745e(this.title, c31806d.title) && AbstractC22676k.m65745e(this.message, c31806d.message) && AbstractC22676k.m65745e(this.primaryButtonText, c31806d.primaryButtonText) && AbstractC22676k.m65745e(this.primaryButtonClickEvent, c31806d.primaryButtonClickEvent);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.icon) * 31, this.title, 31), this.message, 31), this.primaryButtonText, 31);
        InterfaceC31804b interfaceC31804b = this.primaryButtonClickEvent;
        return iM95625a + (interfaceC31804b == null ? 0 : interfaceC31804b.hashCode());
    }

    public String toString() {
        int i13 = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.message;
        TextResource textResource3 = this.primaryButtonText;
        InterfaceC31804b interfaceC31804b = this.primaryButtonClickEvent;
        StringBuilder sbM91844n = AbstractC30007c.m91844n("LabradorReadingInitialInconclusiveDialogViewState(icon=", i13, ", title=", textResource, ", message=");
        AbstractC30007c.m91855y(sbM91844n, textResource2, ", primaryButtonText=", textResource3, ", primaryButtonClickEvent=");
        sbM91844n.append(interfaceC31804b);
        sbM91844n.append(")");
        return sbM91844n.toString();
    }

    public /* synthetic */ C31806d(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC31804b interfaceC31804b, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? EnumC16313m0.CROSS.toWhoopIcon() : i13, (i14 & 2) != 0 ? new TextResource.C8688b(AbstractC31794f.f131652d0, null, 2, null) : textResource, (i14 & 4) != 0 ? new TextResource.C8688b(AbstractC31794f.f131650c0, null, 2, null) : textResource2, (i14 & 8) != 0 ? new TextResource.C8688b(AbstractC31794f.f131655f, null, 2, null) : textResource3, (i14 & 16) != 0 ? null : interfaceC31804b);
    }
}
