package f11;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b!\u0010\u001a¨\u0006\""}, m65681d2 = {"Lf11/b;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "currentStatus", "description", "Ly81/f;", "activeColor", "rightAlignedDescription", "supertitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "Ly81/f;", "()Ly81/f;", "f", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14002b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource currentStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f activeColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource rightAlignedDescription;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource supertitle;

    public C14002b(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, EnumC39333f enumC39333f, TextResource textResource5, TextResource textResource6) {
        this.title = textResource;
        this.subtitle = textResource2;
        this.currentStatus = textResource3;
        this.description = textResource4;
        this.activeColor = enumC39333f;
        this.rightAlignedDescription = textResource5;
        this.supertitle = textResource6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getActiveColor() {
        return this.activeColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCurrentStatus() {
        return this.currentStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getRightAlignedDescription() {
        return this.rightAlignedDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14002b)) {
            return false;
        }
        C14002b c14002b = (C14002b) other;
        return AbstractC22676k.m65745e(this.title, c14002b.title) && AbstractC22676k.m65745e(this.subtitle, c14002b.subtitle) && AbstractC22676k.m65745e(this.currentStatus, c14002b.currentStatus) && AbstractC22676k.m65745e(this.description, c14002b.description) && this.activeColor == c14002b.activeColor && AbstractC22676k.m65745e(this.rightAlignedDescription, c14002b.rightAlignedDescription) && AbstractC22676k.m65745e(this.supertitle, c14002b.supertitle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSupertitle() {
        return this.supertitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.currentStatus;
        int iHashCode3 = (iHashCode2 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        TextResource textResource4 = this.description;
        int iHashCode4 = (iHashCode3 + (textResource4 == null ? 0 : textResource4.hashCode())) * 31;
        EnumC39333f enumC39333f = this.activeColor;
        int iHashCode5 = (iHashCode4 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        TextResource textResource5 = this.rightAlignedDescription;
        int iHashCode6 = (iHashCode5 + (textResource5 == null ? 0 : textResource5.hashCode())) * 31;
        TextResource textResource6 = this.supertitle;
        return iHashCode6 + (textResource6 != null ? textResource6.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.currentStatus;
        TextResource textResource4 = this.description;
        EnumC39333f enumC39333f = this.activeColor;
        TextResource textResource5 = this.rightAlignedDescription;
        TextResource textResource6 = this.supertitle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("DailyTickMarkHeader(title=", textResource, ", subtitle=", textResource2, ", currentStatus=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", description=", textResource4, ", activeColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(", rightAlignedDescription=");
        sbM106658q.append(textResource5);
        sbM106658q.append(", supertitle=");
        return AbstractC30007c.m91841k(sbM106658q, textResource6, ")");
    }

    public /* synthetic */ C14002b(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, EnumC39333f enumC39333f, TextResource textResource5, TextResource textResource6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? null : textResource3, (i13 & 8) != 0 ? null : textResource4, (i13 & 16) != 0 ? null : enumC39333f, (i13 & 32) != 0 ? null : textResource5, (i13 & 64) != 0 ? null : textResource6);
    }
}
