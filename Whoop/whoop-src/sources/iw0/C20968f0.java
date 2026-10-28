package iw0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw0.f0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001c¨\u0006 "}, m65681d2 = {"Liw0/f0;", "", "Lcom/whoop/design/util/TextResource;", "leadingTitle", "leadingSubtitle", "Ly81/e;", "leadingSubtitleColor", "trailingTitle", "trailingSubtitle", "trailingSubtitleColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "()Ly81/e;", "d", "f", "e", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20968f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource leadingTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource leadingSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC39332e leadingSubtitleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource trailingTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource trailingSubtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e trailingSubtitleColor;

    public C20968f0(TextResource leadingTitle, TextResource leadingSubtitle, InterfaceC39332e interfaceC39332e, TextResource trailingTitle, TextResource trailingSubtitle, InterfaceC39332e interfaceC39332e2) {
        AbstractC22676k.m65750j(leadingTitle, "leadingTitle");
        AbstractC22676k.m65750j(leadingSubtitle, "leadingSubtitle");
        AbstractC22676k.m65750j(trailingTitle, "trailingTitle");
        AbstractC22676k.m65750j(trailingSubtitle, "trailingSubtitle");
        this.leadingTitle = leadingTitle;
        this.leadingSubtitle = leadingSubtitle;
        this.leadingSubtitleColor = interfaceC39332e;
        this.trailingTitle = trailingTitle;
        this.trailingSubtitle = trailingSubtitle;
        this.trailingSubtitleColor = interfaceC39332e2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLeadingSubtitle() {
        return this.leadingSubtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getLeadingSubtitleColor() {
        return this.leadingSubtitleColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLeadingTitle() {
        return this.leadingTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTrailingSubtitle() {
        return this.trailingSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getTrailingSubtitleColor() {
        return this.trailingSubtitleColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20968f0)) {
            return false;
        }
        C20968f0 c20968f0 = (C20968f0) other;
        return AbstractC22676k.m65745e(this.leadingTitle, c20968f0.leadingTitle) && AbstractC22676k.m65745e(this.leadingSubtitle, c20968f0.leadingSubtitle) && AbstractC22676k.m65745e(this.leadingSubtitleColor, c20968f0.leadingSubtitleColor) && AbstractC22676k.m65745e(this.trailingTitle, c20968f0.trailingTitle) && AbstractC22676k.m65745e(this.trailingSubtitle, c20968f0.trailingSubtitle) && AbstractC22676k.m65745e(this.trailingSubtitleColor, c20968f0.trailingSubtitleColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTrailingTitle() {
        return this.trailingTitle;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.leadingTitle.hashCode() * 31, this.leadingSubtitle, 31);
        InterfaceC39332e interfaceC39332e = this.leadingSubtitleColor;
        int iM95625a2 = AbstractC31061c.m95625a(AbstractC31061c.m95625a((iM95625a + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31, this.trailingTitle, 31), this.trailingSubtitle, 31);
        InterfaceC39332e interfaceC39332e2 = this.trailingSubtitleColor;
        return iM95625a2 + (interfaceC39332e2 != null ? interfaceC39332e2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.leadingTitle;
        TextResource textResource2 = this.leadingSubtitle;
        InterfaceC39332e interfaceC39332e = this.leadingSubtitleColor;
        TextResource textResource3 = this.trailingTitle;
        TextResource textResource4 = this.trailingSubtitle;
        InterfaceC39332e interfaceC39332e2 = this.trailingSubtitleColor;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GraphTitleBarState(leadingTitle=", textResource, ", leadingSubtitle=", textResource2, ", leadingSubtitleColor=");
        AbstractC33745d.m106665x(sbM106658q, interfaceC39332e, ", trailingTitle=", textResource3, ", trailingSubtitle=");
        sbM106658q.append(textResource4);
        sbM106658q.append(", trailingSubtitleColor=");
        sbM106658q.append(interfaceC39332e2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
