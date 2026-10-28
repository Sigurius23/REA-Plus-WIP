package j02;

import com.whoop.navigation.C9598e;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: j02.o0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lj02/o0;", "", "Lj02/m0;", "navigationScreen", "Lj02/p0;", "b", "(Lj02/m0;)Lj02/p0;", "Lcom/whoop/navigation/e;", "navigationAction", "a", "(Lcom/whoop/navigation/e;)Lj02/p0;", "destination", "", "e", "(Lcom/whoop/navigation/e;)Z", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21159o0 {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ boolean m59391c(InterfaceC21159o0 interfaceC21159o0, C9598e c9598e, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToShopTabIfConfigured");
        }
        if ((i13 & 1) != 0) {
            c9598e = null;
        }
        return interfaceC21159o0.mo59395e(c9598e);
    }

    /* JADX INFO: renamed from: a */
    AbstractC21161p0 mo59392a(C9598e navigationAction);

    @InterfaceC23457c
    /* JADX INFO: renamed from: b */
    AbstractC21161p0 mo59393b(AbstractC21155m0 navigationScreen);

    /* JADX INFO: renamed from: d */
    AbstractC21161p0 mo59394d(C9598e navigationAction);

    /* JADX INFO: renamed from: e */
    boolean mo59395e(C9598e destination);
}
