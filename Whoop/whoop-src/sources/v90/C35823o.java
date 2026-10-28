package v90;

import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: v90.o */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010\u000f¨\u0006$"}, m65681d2 = {"Lv90/o;", "Lm91/u;", "Lkd1/o;", "backgroundImage", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "Lv90/k;", "upcycleOptions", "", "analyticsName", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35823o implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C35819k> upcycleOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String analyticsName;

    public C35823o(AbstractC22403o backgroundImage, TextResource title, TextResource subtitle, List<C35819k> upcycleOptions, String analyticsName) {
        AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(upcycleOptions, "upcycleOptions");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.backgroundImage = backgroundImage;
        this.title = title;
        this.subtitle = subtitle;
        this.upcycleOptions = upcycleOptions;
        this.analyticsName = analyticsName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e */
    public final List<C35819k> m113636e() {
        return this.upcycleOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35823o)) {
            return false;
        }
        C35823o c35823o = (C35823o) other;
        return AbstractC22676k.m65745e(this.backgroundImage, c35823o.backgroundImage) && AbstractC22676k.m65745e(this.title, c35823o.title) && AbstractC22676k.m65745e(this.subtitle, c35823o.subtitle) && AbstractC22676k.m65745e(this.upcycleOptions, c35823o.upcycleOptions) && AbstractC22676k.m65745e(this.analyticsName, c35823o.analyticsName);
    }

    public int hashCode() {
        return this.analyticsName.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.backgroundImage.hashCode() * 31, this.title, 31), this.subtitle, 31), 31, this.upcycleOptions);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.backgroundImage;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        List<C35819k> list = this.upcycleOptions;
        String str = this.analyticsName;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("TrialPlanPickerState(backgroundImage=", textResource, abstractC22403o, ", title=", ", subtitle=");
        AbstractC21702c.m61143n(textResource2, ", upcycleOptions=", ", analyticsName=", sbM114683k, list);
        return AbstractC25012a.m73376i(str, ")", sbM114683k);
    }
}
