package bo1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bo1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0018\u0010$R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, m65681d2 = {"Lbo1/b;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "description", "", "enabled", "Lcom/whoop/navigation/e;", "ctaDestination", "ctaTextDisplay", "Lgz0/m0;", "ctaIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "Z", "f", "()Z", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lgz0/m0;", "()Lgz0/m0;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3508b implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f13974g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e ctaDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource ctaTextDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC16313m0 ctaIcon;

    static {
        int i13 = TextResource.$stable;
        f13974g = i13 | C9598e.f28134d | i13 | i13;
    }

    public C3508b(TextResource title, TextResource description, boolean z4, C9598e ctaDestination, TextResource ctaTextDisplay, EnumC16313m0 ctaIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(ctaDestination, "ctaDestination");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        this.title = title;
        this.description = description;
        this.enabled = z4;
        this.ctaDestination = ctaDestination;
        this.ctaTextDisplay = ctaTextDisplay;
        this.ctaIcon = ctaIcon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3508b)) {
            return false;
        }
        C3508b c3508b = (C3508b) other;
        return AbstractC22676k.m65745e(this.title, c3508b.title) && AbstractC22676k.m65745e(this.description, c3508b.description) && this.enabled == c3508b.enabled && AbstractC22676k.m65745e(this.ctaDestination, c3508b.ctaDestination) && AbstractC22676k.m65745e(this.ctaTextDisplay, c3508b.ctaTextDisplay) && this.ctaIcon == c3508b.ctaIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.ctaIcon.hashCode() + AbstractC31061c.m95625a(AbstractC36095b.m114673a(this.ctaDestination, AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), 31, this.enabled), 31), this.ctaTextDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        boolean z4 = this.enabled;
        C9598e c9598e = this.ctaDestination;
        TextResource textResource3 = this.ctaTextDisplay;
        EnumC16313m0 enumC16313m0 = this.ctaIcon;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("FertilitySettingsToggleViewState(title=", textResource, ", description=", textResource2, ", enabled=");
        sbM106658q.append(z4);
        sbM106658q.append(", ctaDestination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", ctaTextDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", ctaIcon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
