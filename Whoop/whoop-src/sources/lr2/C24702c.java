package lr2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lr2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006$"}, m65681d2 = {"Llr2/c;", "", "Lcom/whoop/design/util/TextResource;", "text", "subtext", "", "imageUrl", "buttonText", "Llq2/e;", "backgroundStyle", "", "displayAnimation", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Llq2/e;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/lang/String;", "getImageUrl", "Llq2/e;", "()Llq2/e;", "f", "Z", "()Z", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24702c {

    /* JADX INFO: renamed from: g */
    public static final int f96616g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean displayAnimation;

    public C24702c(TextResource text, TextResource subtext, String str, TextResource buttonText, InterfaceC24673e backgroundStyle, boolean z4) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subtext, "subtext");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        this.text = text;
        this.subtext = subtext;
        this.imageUrl = str;
        this.buttonText = buttonText;
        this.backgroundStyle = backgroundStyle;
        this.displayAnimation = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC24673e getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDisplayAnimation() {
        return this.displayAnimation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24702c)) {
            return false;
        }
        C24702c c24702c = (C24702c) other;
        return AbstractC22676k.m65745e(this.text, c24702c.text) && AbstractC22676k.m65745e(this.subtext, c24702c.subtext) && AbstractC22676k.m65745e(this.imageUrl, c24702c.imageUrl) && AbstractC22676k.m65745e(this.buttonText, c24702c.buttonText) && AbstractC22676k.m65745e(this.backgroundStyle, c24702c.backgroundStyle) && this.displayAnimation == c24702c.displayAnimation;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.text.hashCode() * 31, this.subtext, 31);
        String str = this.imageUrl;
        return Boolean.hashCode(this.displayAnimation) + AbstractC30007c.m91834d(this.backgroundStyle, AbstractC31061c.m95625a((iM95625a + (str == null ? 0 : str.hashCode())) * 31, this.buttonText, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        TextResource textResource2 = this.subtext;
        String str = this.imageUrl;
        TextResource textResource3 = this.buttonText;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        boolean z4 = this.displayAnimation;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("LandingViewState(text=", textResource, ", subtext=", textResource2, ", imageUrl=");
        AbstractC30007c.m91826A(sbM106658q, str, ", buttonText=", textResource3, ", backgroundStyle=");
        sbM106658q.append(interfaceC24673e);
        sbM106658q.append(", displayAnimation=");
        sbM106658q.append(z4);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ C24702c(TextResource textResource, TextResource textResource2, String str, TextResource textResource3, InterfaceC24673e interfaceC24673e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, str, textResource3, interfaceC24673e, (i13 & 32) != 0 ? true : z4);
    }
}
