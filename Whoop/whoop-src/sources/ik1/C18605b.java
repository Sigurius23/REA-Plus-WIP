package ik1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ik1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, m65681d2 = {"Lik1/b;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "buttonText", "Ly81/f;", "buttonColor", "", "buttonRevealsAmoeba", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ly81/f;", "()Ly81/f;", "Z", "()Z", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18605b {

    /* JADX INFO: renamed from: f */
    public static final int f72717f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f buttonColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean buttonRevealsAmoeba;

    public C18605b(TextResource title, TextResource subtitle, TextResource buttonText, EnumC39333f buttonColor, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(buttonColor, "buttonColor");
        this.title = title;
        this.subtitle = subtitle;
        this.buttonText = buttonText;
        this.buttonColor = buttonColor;
        this.buttonRevealsAmoeba = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getButtonColor() {
        return this.buttonColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getButtonRevealsAmoeba() {
        return this.buttonRevealsAmoeba;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18605b)) {
            return false;
        }
        C18605b c18605b = (C18605b) other;
        return AbstractC22676k.m65745e(this.title, c18605b.title) && AbstractC22676k.m65745e(this.subtitle, c18605b.subtitle) && AbstractC22676k.m65745e(this.buttonText, c18605b.buttonText) && this.buttonColor == c18605b.buttonColor && this.buttonRevealsAmoeba == c18605b.buttonRevealsAmoeba;
    }

    public int hashCode() {
        return Boolean.hashCode(this.buttonRevealsAmoeba) + AbstractC21702c.m61132c(this.buttonColor, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.buttonText, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.buttonText;
        EnumC39333f enumC39333f = this.buttonColor;
        boolean z4 = this.buttonRevealsAmoeba;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("AmoebaOnboardingStepViewState(title=", textResource, ", subtitle=", textResource2, ", buttonText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", buttonColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(", buttonRevealsAmoeba=");
        return AbstractC18489d0.m53372m(sbM106658q, z4, ")");
    }
}
