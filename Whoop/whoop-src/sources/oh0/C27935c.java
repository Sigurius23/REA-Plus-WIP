package oh0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17911t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: oh0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, m65681d2 = {"Loh0/c;", "Lm91/u;", "", "content", "", "textHash", "", "suppressParagraphBottomMargin", "fadeInReveal", "Li2/t;", "colorBrush", "<init>", "(Ljava/lang/String;IZZLi2/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "getTextHash", "c", "Z", "e", "()Z", "d", "Li2/t;", "()Li2/t;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27935c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int textHash;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean suppressParagraphBottomMargin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean fadeInReveal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC17911t colorBrush;

    public C27935c(String content, int i13, boolean z4, boolean z13, AbstractC17911t abstractC17911t) {
        AbstractC22676k.m65750j(content, "content");
        this.content = content;
        this.textHash = i13;
        this.suppressParagraphBottomMargin = z4;
        this.fadeInReveal = z13;
        this.colorBrush = abstractC17911t;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17911t getColorBrush() {
        return this.colorBrush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFadeInReveal() {
        return this.fadeInReveal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSuppressParagraphBottomMargin() {
        return this.suppressParagraphBottomMargin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27935c)) {
            return false;
        }
        C27935c c27935c = (C27935c) other;
        return AbstractC22676k.m65745e(this.content, c27935c.content) && this.textHash == c27935c.textHash && this.suppressParagraphBottomMargin == c27935c.suppressParagraphBottomMargin && this.fadeInReveal == c27935c.fadeInReveal && AbstractC22676k.m65745e(this.colorBrush, c27935c.colorBrush);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.textHash, this.content.hashCode() * 31, 31), 31, this.suppressParagraphBottomMargin), 31, this.fadeInReveal);
        AbstractC17911t abstractC17911t = this.colorBrush;
        return iM8289b + (abstractC17911t == null ? 0 : abstractC17911t.hashCode());
    }

    public String toString() {
        String str = this.content;
        int i13 = this.textHash;
        boolean z4 = this.suppressParagraphBottomMargin;
        boolean z13 = this.fadeInReveal;
        AbstractC17911t abstractC17911t = this.colorBrush;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "MarkdownTextWidgetViewState(content=", str, ", textHash=", ", suppressParagraphBottomMargin=");
        AbstractC38963t7.m124392v(sbM30467u, z4, ", fadeInReveal=", z13, ", colorBrush=");
        sbM30467u.append(abstractC17911t);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public /* synthetic */ C27935c(String str, int i13, boolean z4, boolean z13, AbstractC17911t abstractC17911t, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? str.hashCode() : i13, (i14 & 4) != 0 ? false : z4, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? null : abstractC17911t);
    }
}
