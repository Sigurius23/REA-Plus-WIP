package hd2;

import com.whoop.share.model.ShareAsset;
import com.whoop.share.model.ShareBackground;
import com.whoop.share.model.ShareResponse;
import com.whoop.share.model.StyleType;
import ed2.C13115b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hd2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lhd2/e;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Led2/b;", "", "source", "Lhd2/d;", "d", "(Led2/b;Ljava/lang/String;)Lhd2/d;", "Lcom/whoop/share/model/ShareResponse;", "navigationSource", "Lhd2/d$a;", "b", "(Lcom/whoop/share/model/ShareResponse;Ljava/lang/String;)Lhd2/d$a;", "Lcom/whoop/share/model/ShareAsset;", "Lhd2/d$b;", "c", "(Lcom/whoop/share/model/ShareAsset;)Lhd2/d$b;", "domainResult", "a", "Ljb1/a;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17203e {

    /* JADX INFO: renamed from: b */
    public static final int f66088b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C17203e(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C17202d.a m48591b(ShareResponse shareResponse, String str) {
        if (shareResponse.getAssets().isEmpty()) {
            return null;
        }
        List<ShareAsset> assets = shareResponse.getAssets();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = assets.iterator();
        while (it.hasNext()) {
            C17202d.b bVarM48592c = m48592c((ShareAsset) it.next());
            if (bVarM48592c != null) {
                arrayList.add(bVarM48592c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C17202d.a(shareResponse.getTitle(), str != null ? AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("source", str), shareResponse.getAnalyticProperties()) : shareResponse.getAnalyticProperties(), arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: c */
    private final C17202d.b m48592c(ShareAsset shareAsset) {
        StyleType styleType;
        List<InterfaceC25312u> listM60540g = this.designItemReducer.m60540g(shareAsset.getItems());
        StyleType styleType2 = null;
        if (listM60540g.isEmpty()) {
            return null;
        }
        String id4 = shareAsset.getId();
        String fileName = shareAsset.getFileName();
        ShareBackground background = shareAsset.getBackground();
        String style = shareAsset.getStyle();
        if (style != null) {
            styleType = StyleType.DEFAULT;
            for (StyleType styleType3 : StyleType.values()) {
                if (AbstractC22676k.m65745e(styleType3.name(), style)) {
                    styleType2 = styleType3;
                    break;
                }
            }
            if (styleType2 != null) {
                styleType = styleType2;
            }
            if (styleType == null) {
                styleType = StyleType.DEFAULT;
            }
        } else {
            styleType = StyleType.DEFAULT;
        }
        return new C17202d.b(id4, fileName, listM60540g, background, styleType);
    }

    /* JADX INFO: renamed from: d */
    private final C17202d m48593d(C13115b c13115b, String str) {
        boolean isLoading = c13115b.getIsLoading();
        boolean isError = c13115b.getIsError();
        boolean displayRefreshingSpinner = c13115b.getDisplayRefreshingSpinner();
        ShareResponse data = c13115b.getData();
        return new C17202d(isLoading, isError, displayRefreshingSpinner, data != null ? m48591b(data, str) : null);
    }

    /* JADX INFO: renamed from: a */
    public final C17202d m48594a(C13115b domainResult, String source) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return m48593d(domainResult, source);
    }

    public /* synthetic */ C17203e(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC17204f.f66090a : c21535a);
    }
}
