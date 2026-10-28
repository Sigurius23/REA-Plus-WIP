package am2;

import com.whoop.design.util.TextResource;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: am2.o */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lam2/o;", "", "Lcom/whoop/design/util/TextResource;", "leadingText", "trailingText", "", "trailingImage", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/lang/String;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1034o {

    /* JADX INFO: renamed from: d */
    public static final int f3927d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource leadingText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource trailingText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String trailingImage;

    public C1034o(TextResource leadingText, TextResource textResource, String str) {
        AbstractC22676k.m65750j(leadingText, "leadingText");
        this.leadingText = leadingText;
        this.trailingText = textResource;
        this.trailingImage = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLeadingText() {
        return this.leadingText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTrailingImage() {
        return this.trailingImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTrailingText() {
        return this.trailingText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1034o)) {
            return false;
        }
        C1034o c1034o = (C1034o) other;
        return AbstractC22676k.m65745e(this.leadingText, c1034o.leadingText) && AbstractC22676k.m65745e(this.trailingText, c1034o.trailingText) && AbstractC22676k.m65745e(this.trailingImage, c1034o.trailingImage);
    }

    public int hashCode() {
        int iHashCode = this.leadingText.hashCode() * 31;
        TextResource textResource = this.trailingText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str = this.trailingImage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.trailingImage, ")", AbstractC33745d.m106658q("LastUpdatedViewState(leadingText=", this.leadingText, ", trailingText=", this.trailingText, ", trailingImage="));
    }
}
