package hd2;

import c13.AbstractC3855a;
import com.whoop.metrics.common.ScreenState;
import com.whoop.share.model.ShareBackground;
import com.whoop.share.model.StyleType;
import fy1.InterfaceC14875k;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: hd2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 \u0014B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m65681d2 = {"Lhd2/d;", "Lfy1/k;", "", "isLoading", "isError", "displayRefreshingSpinner", "Lhd2/d$a;", "screenContent", "<init>", "(ZZZLhd2/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "e", "()Z", "c", "d", "Lhd2/d$a;", "()Lhd2/d$a;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17202d implements InterfaceC14875k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final a screenContent;

    /* JADX INFO: renamed from: hd2.d$a */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lhd2/d$a;", "", "", "title", "", "analyticProperties", "", "Lhd2/d$b;", "assets", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/util/List;", "()Ljava/util/List;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, String> analyticProperties;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<b> assets;

        public a(String title, Map<String, String> analyticProperties, List<b> assets) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
            AbstractC22676k.m65750j(assets, "assets");
            this.title = title;
            this.analyticProperties = analyticProperties;
            this.assets = assets;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m48583a() {
            return this.analyticProperties;
        }

        /* JADX INFO: renamed from: b */
        public final List<b> m48584b() {
            return this.assets;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.analyticProperties, aVar.analyticProperties) && AbstractC22676k.m65745e(this.assets, aVar.assets);
        }

        public int hashCode() {
            return this.assets.hashCode() + AbstractC3855a.m11821e(this.analyticProperties, this.title.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.title;
            Map<String, String> map = this.analyticProperties;
            return AbstractC3855a.m11829m(AbstractC36095b.m114686n("ScreenContent(title=", str, ", analyticProperties=", ", assets=", map), this.assets, ")");
        }
    }

    /* JADX INFO: renamed from: hd2.d$b */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lhd2/d$b;", "", "", "id", "fileName", "", "Lm91/u;", "sections", "Lcom/whoop/share/model/ShareBackground;", "background", "Lcom/whoop/share/model/StyleType;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/share/model/ShareBackground;Lcom/whoop/share/model/StyleType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/whoop/share/model/ShareBackground;", "()Lcom/whoop/share/model/ShareBackground;", "e", "Lcom/whoop/share/model/StyleType;", "()Lcom/whoop/share/model/StyleType;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String fileName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<InterfaceC25312u> sections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final ShareBackground background;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final StyleType style;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String id4, String fileName, List<? extends InterfaceC25312u> sections, ShareBackground background, StyleType style) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(fileName, "fileName");
            AbstractC22676k.m65750j(sections, "sections");
            AbstractC22676k.m65750j(background, "background");
            AbstractC22676k.m65750j(style, "style");
            this.id = id4;
            this.fileName = fileName;
            this.sections = sections;
            this.background = background;
            this.style = style;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ShareBackground getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC25312u> m48589d() {
            return this.sections;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StyleType getStyle() {
            return this.style;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.id, bVar.id) && AbstractC22676k.m65745e(this.fileName, bVar.fileName) && AbstractC22676k.m65745e(this.sections, bVar.sections) && AbstractC22676k.m65745e(this.background, bVar.background) && this.style == bVar.style;
        }

        public int hashCode() {
            return this.style.hashCode() + ((this.background.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.fileName), 31, this.sections)) * 31);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.fileName;
            List<InterfaceC25312u> list = this.sections;
            ShareBackground shareBackground = this.background;
            StyleType styleType = this.style;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareAsset(id=", str, ", fileName=", str2, ", sections=");
            sbM32001t.append(list);
            sbM32001t.append(", background=");
            sbM32001t.append(shareBackground);
            sbM32001t.append(", style=");
            sbM32001t.append(styleType);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public C17202d(boolean z4, boolean z13, boolean z14, a aVar) {
        this.isLoading = z4;
        this.isError = z13;
        this.displayRefreshingSpinner = z14;
        this.screenContent = aVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getScreenContent() {
        return this.screenContent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17202d)) {
            return false;
        }
        C17202d c17202d = (C17202d) other;
        return this.isLoading == c17202d.isLoading && this.isError == c17202d.isError && this.displayRefreshingSpinner == c17202d.displayRefreshingSpinner && AbstractC22676k.m65745e(this.screenContent, c17202d.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this.isLoading) {
            return ScreenState.LOADING;
        }
        if (this.isError) {
            return ScreenState.ERROR;
        }
        return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.displayRefreshingSpinner);
        a aVar = this.screenContent;
        return iM8289b + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        boolean z14 = this.displayRefreshingSpinner;
        a aVar = this.screenContent;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ShareViewState(isLoading=", ", isError=", ", displayRefreshingSpinner=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", screenContent=");
        sbM32002u.append(aVar);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C17202d(boolean z4, boolean z13, boolean z14, a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? null : aVar);
    }
}
