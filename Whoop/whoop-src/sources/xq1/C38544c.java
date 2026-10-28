package xq1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lxq1/c;", "", "Lcom/whoop/design/util/TextResource;", "refreshText", "title", "subTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "c", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38544c {

    /* JADX INFO: renamed from: d */
    public static final int f165861d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource refreshText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitle;

    public C38544c(TextResource refreshText, TextResource title, TextResource subTitle) {
        AbstractC22676k.m65750j(refreshText, "refreshText");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        this.refreshText = refreshText;
        this.title = title;
        this.subTitle = subTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getRefreshText() {
        return this.refreshText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38544c)) {
            return false;
        }
        C38544c c38544c = (C38544c) other;
        return AbstractC22676k.m65745e(this.refreshText, c38544c.refreshText) && AbstractC22676k.m65745e(this.title, c38544c.title) && AbstractC22676k.m65745e(this.subTitle, c38544c.subTitle);
    }

    public int hashCode() {
        return this.subTitle.hashCode() + AbstractC31061c.m95625a(this.refreshText.hashCode() * 31, this.title, 31);
    }

    public String toString() {
        TextResource textResource = this.refreshText;
        TextResource textResource2 = this.title;
        return AbstractC30007c.m91841k(AbstractC33745d.m106658q("BehaviorImpactsHeaderState(refreshText=", textResource, ", title=", textResource2, ", subTitle="), this.subTitle, ")");
    }
}
