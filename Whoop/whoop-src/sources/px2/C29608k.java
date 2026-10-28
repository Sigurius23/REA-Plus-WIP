package px2;

import com.whoop.design.util.TextResource;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: px2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lpx2/k;", "", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "topText", "", "bottomText", "<init>", "(Ll83/k;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll83/k;", "b", "()Ll83/k;", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29608k {

    /* JADX INFO: renamed from: c */
    public static final int f120941c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23465k topText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String bottomText;

    public C29608k(C23465k topText, String bottomText) {
        AbstractC22676k.m65750j(topText, "topText");
        AbstractC22676k.m65750j(bottomText, "bottomText");
        this.topText = topText;
        this.bottomText = bottomText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23465k getTopText() {
        return this.topText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29608k)) {
            return false;
        }
        C29608k c29608k = (C29608k) other;
        return AbstractC22676k.m65745e(this.topText, c29608k.topText) && AbstractC22676k.m65745e(this.bottomText, c29608k.bottomText);
    }

    public int hashCode() {
        return this.bottomText.hashCode() + (this.topText.hashCode() * 31);
    }

    public String toString() {
        return "ContentBlockViewState(topText=" + this.topText + ", bottomText=" + this.bottomText + ")";
    }
}
