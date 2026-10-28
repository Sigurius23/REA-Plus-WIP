package tp1;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tp1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ltp1/c;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "primaryButtonTitle", "", "Ltp1/b;", "options", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34063c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource primaryButtonTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C34062b> options;

    public C34063c(TextResource titleDisplay, TextResource primaryButtonTitle, List<C34062b> options) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(options, "options");
        this.titleDisplay = titleDisplay;
        this.primaryButtonTitle = primaryButtonTitle;
        this.options = options;
    }

    /* JADX INFO: renamed from: a */
    public final List<C34062b> m107665a() {
        return this.options;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34063c)) {
            return false;
        }
        C34063c c34063c = (C34063c) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c34063c.titleDisplay) && AbstractC22676k.m65745e(this.primaryButtonTitle, c34063c.primaryButtonTitle) && AbstractC22676k.m65745e(this.options, c34063c.options);
    }

    public int hashCode() {
        return this.options.hashCode() + AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.primaryButtonTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.primaryButtonTitle;
        return AbstractC3855a.m11829m(AbstractC33745d.m106658q("HormonalInsightsBottomSheetState(titleDisplay=", textResource, ", primaryButtonTitle=", textResource2, ", options="), this.options, ")");
    }
}
