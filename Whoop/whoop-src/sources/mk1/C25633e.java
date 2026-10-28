package mk1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: mk1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, m65681d2 = {"Lmk1/e;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "subtitleDisplay", "ctaTextDisplay", "Lcom/whoop/navigation/e;", "destination", "Lmk1/d;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lmk1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lmk1/d;", "()Lmk1/d;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25633e implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f100575f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaTextDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC25632d style;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f100575f = i13 | i14 | i14 | i14;
    }

    public C25633e(TextResource titleDisplay, TextResource subtitleDisplay, TextResource textResource, C9598e c9598e, EnumC25632d style) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.ctaTextDisplay = textResource;
        this.destination = c9598e;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC25632d getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25633e)) {
            return false;
        }
        C25633e c25633e = (C25633e) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c25633e.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, c25633e.subtitleDisplay) && AbstractC22676k.m65745e(this.ctaTextDisplay, c25633e.ctaTextDisplay) && AbstractC22676k.m65745e(this.destination, c25633e.destination) && this.style == c25633e.style;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.subtitleDisplay, 31);
        TextResource textResource = this.ctaTextDisplay;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return this.style.hashCode() + ((iHashCode + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.subtitleDisplay;
        TextResource textResource3 = this.ctaTextDisplay;
        C9598e c9598e = this.destination;
        EnumC25632d enumC25632d = this.style;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HealthspanVowViewState(titleDisplay=", textResource, ", subtitleDisplay=", textResource2, ", ctaTextDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", style=");
        sbM106658q.append(enumC25632d);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
