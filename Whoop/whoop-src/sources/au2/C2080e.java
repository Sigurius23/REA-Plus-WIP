package au2;

import com.whoop.design.util.TextResource;
import p01.C28582b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: au2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lau2/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "Ly81/e;", "textColor", "Lp01/b;", "circularProgressIndicator", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lp01/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "()Ly81/e;", "Lp01/b;", "()Lp01/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2080e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28582b circularProgressIndicator;

    public C2080e(TextResource title, InterfaceC39332e textColor, C28582b circularProgressIndicator) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        this.title = title;
        this.textColor = textColor;
        this.circularProgressIndicator = circularProgressIndicator;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C28582b getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2080e)) {
            return false;
        }
        C2080e c2080e = (C2080e) other;
        return AbstractC22676k.m65745e(this.title, c2080e.title) && AbstractC22676k.m65745e(this.textColor, c2080e.textColor) && AbstractC22676k.m65745e(this.circularProgressIndicator, c2080e.circularProgressIndicator);
    }

    public int hashCode() {
        return this.circularProgressIndicator.hashCode() + AbstractC33745d.m106648g(this.textColor, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        return "NewSummaryListItemState(title=" + this.title + ", textColor=" + this.textColor + ", circularProgressIndicator=" + this.circularProgressIndicator + ")";
    }
}
