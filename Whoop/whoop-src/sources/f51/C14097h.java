package f51;

import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: f51.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lf51/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "text", "Ly81/f;", "backgroundColor", "textColor", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14097h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f textColor;

    public C14097h(TextResource text, EnumC39333f backgroundColor, EnumC39333f textColor) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(textColor, "textColor");
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14097h)) {
            return false;
        }
        C14097h c14097h = (C14097h) other;
        return AbstractC22676k.m65745e(this.text, c14097h.text) && this.backgroundColor == c14097h.backgroundColor && this.textColor == c14097h.textColor;
    }

    public int hashCode() {
        return this.textColor.hashCode() + AbstractC21702c.m61132c(this.backgroundColor, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        EnumC39333f enumC39333f = this.backgroundColor;
        EnumC39333f enumC39333f2 = this.textColor;
        StringBuilder sb4 = new StringBuilder("ImpactCalloutViewState(text=");
        sb4.append(textResource);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", textColor=");
        return AbstractC21702c.m61138i(sb4, enumC39333f2, ")");
    }
}
