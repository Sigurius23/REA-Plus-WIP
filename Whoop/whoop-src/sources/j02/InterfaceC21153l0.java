package j02;

import androidx.lifecycle.DefaultLifecycleObserver;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: j02.l0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lj02/l0;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Leb/a0;", "navController", "", "prefix", "Ll83/a0;", "i", "(Leb/a0;Ljava/lang/String;)V", "Leb/n0;", "currentDestination", "a0", "(Leb/n0;)V", "navigationTag", "J", "(Ljava/lang/String;)V", "fromDestinationTag", "toDestinationTag", "T", "(Ljava/lang/String;Ljava/lang/String;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21153l0 extends DefaultLifecycleObserver {
    /* JADX INFO: renamed from: k */
    static /* synthetic */ void m59003k(InterfaceC21153l0 interfaceC21153l0, AbstractC12939a0 abstractC12939a0, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachListener");
        }
        if ((i13 & 2) != 0) {
            str = "";
        }
        interfaceC21153l0.mo59007i(abstractC12939a0, str);
    }

    /* JADX INFO: renamed from: J */
    void mo59004J(String navigationTag);

    /* JADX INFO: renamed from: T */
    void mo59005T(String fromDestinationTag, String toDestinationTag);

    /* JADX INFO: renamed from: a0 */
    void mo59006a0(C12977n0 currentDestination);

    /* JADX INFO: renamed from: i */
    void mo59007i(AbstractC12939a0 navController, String prefix);
}
