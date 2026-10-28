package nn0;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nn0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lnn0/b;", "", "Lgz0/m0;", "icon", "Ly81/f;", "iconColor", "Lcom/whoop/design/util/TextResource;", "text", "subText", "<init>", "(Lgz0/m0;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Ly81/f;", "()Ly81/f;", "c", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26865b {

    /* JADX INFO: renamed from: e */
    public static final int f107204e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f iconColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subText;

    public C26865b(EnumC16313m0 icon, EnumC39333f iconColor, TextResource text, TextResource textResource) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(text, "text");
        this.icon = icon;
        this.iconColor = iconColor;
        this.text = text;
        this.subText = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26865b)) {
            return false;
        }
        C26865b c26865b = (C26865b) other;
        return this.icon == c26865b.icon && this.iconColor == c26865b.iconColor && AbstractC22676k.m65745e(this.text, c26865b.text) && AbstractC22676k.m65745e(this.subText, c26865b.subText);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.iconColor, this.icon.hashCode() * 31, 31), this.text, 31);
        TextResource textResource = this.subText;
        return iM95625a + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC39333f enumC39333f = this.iconColor;
        TextResource textResource = this.text;
        TextResource textResource2 = this.subText;
        StringBuilder sb4 = new StringBuilder("ChallengeItem(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", iconColor=");
        sb4.append(enumC39333f);
        sb4.append(", text=");
        return AbstractC33745d.m106655n(sb4, textResource, ", subText=", textResource2, ")");
    }
}
