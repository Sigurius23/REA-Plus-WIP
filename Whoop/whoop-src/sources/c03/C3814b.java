package c03;

import a03.InterfaceC0101d;
import c41.AbstractC4076n0;
import c41.C4069m0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InAppBrowserScreenModel;
import com.whoop.whoopstatus.domain.model.WhoopStatusResponse;
import kd1.EnumC22400l;
import or2.C28162g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yz2.AbstractC39915a;

/* JADX INFO: renamed from: c03.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lc03/b;", "", "Lor2/g;", "buildConfigProvider", "<init>", "(Lor2/g;)V", "La03/d$c;", "result", "", "statusUrl", "Lc41/m0;", "a", "(La03/d$c;Ljava/lang/String;)Lc41/m0;", "La03/d;", "Lc03/c;", "b", "(La03/d;)Lc03/c;", "Lor2/g;", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3814b {

    /* JADX INFO: renamed from: c */
    public static final int f15647c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    public C3814b(C28162g buildConfigProvider) {
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        this.buildConfigProvider = buildConfigProvider;
    }

    /* JADX INFO: renamed from: a */
    private final C4069m0 m11682a(InterfaceC0101d.c result, String statusUrl) {
        TextResource c8688b;
        TextResource c8688b2;
        WhoopStatusResponse whoopStatusResponse = result.getWhoopStatusResponse();
        String title = whoopStatusResponse.getTitle();
        if (title == null || (c8688b = AbstractC8693b.m21278l(title)) == null) {
            c8688b = new TextResource.C8688b(AbstractC39915a.f172319b, null, 2, null);
        }
        String subtitle = whoopStatusResponse.getSubtitle();
        if (subtitle == null || (c8688b2 = AbstractC8693b.m21278l(subtitle)) == null) {
            c8688b2 = new TextResource.C8688b(AbstractC39915a.f172318a, null, 2, null);
        }
        return new C4069m0(c8688b, c8688b2, AbstractC4076n0.c.f16558d, EnumC22400l.MAINTENANCE, new C9598e(AppScreen.C9457y2.f28061w, new InAppBrowserScreenModel(statusUrl), null, 4, null), null, null, 96, null);
    }

    /* JADX INFO: renamed from: b */
    public final C3815c m11683b(InterfaceC0101d result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(InterfaceC0101d.a.f324a) || result.equals(InterfaceC0101d.b.f325a)) {
            return new C3815c(false, null, null, 7, null);
        }
        if (!(result instanceof InterfaceC0101d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = AbstractC22676k.m65745e(this.buildConfigProvider.getBuildFlavor(), "qaDev") ? "https://status.dev.whoop.com" : "https://status.whoop.com";
        InterfaceC0101d.c cVar = (InterfaceC0101d.c) result;
        return new C3815c(cVar.getWhoopStatusResponse().getActiveMaintenance(), m11682a(cVar, str), str);
    }
}
