package p705ea2;

import androidx.lifecycle.AbstractC1637w1;
import ci2.InterfaceC4733b;
import com.whoop.data.repositories.UserStrapsRepository;
import gc2.EnumC15710a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import jk0.InterfaceC21750d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: ea2.f0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m65681d2 = {"Lea2/f0;", "Landroidx/lifecycle/w1;", "Lcom/whoop/data/repositories/UserStrapsRepository;", "userStrapsRepository", "Lci2/b;", "whoopStrapProvider", "Lea2/d0;", "tileVisibilityChecker", "<init>", "(Lcom/whoop/data/repositories/UserStrapsRepository;Lci2/b;Lea2/d0;)V", "Lgc2/a;", "tile", "", "j", "(Lgc2/a;)Z", "", "name", "Lj02/o0;", "navigator", "Ll83/a0;", "l", "(Ljava/lang/String;Lj02/o0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/data/repositories/UserStrapsRepository;", "x", "Lci2/b;", "y", "Lea2/d0;", "z", "Z", "isMaverickOrGoose", "()Z", "E", "isStrapDisconnected", "Ljk0/d;", "g", "()Ljk0/d;", "whoopStrap", "F", "a", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12905f0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: G */
    public static final int f44409G = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean isStrapDisconnected;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final UserStrapsRepository userStrapsRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C12901d0 tileVisibilityChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean isMaverickOrGoose;

    public C12905f0(UserStrapsRepository userStrapsRepository, InterfaceC4733b whoopStrapProvider, C12901d0 tileVisibilityChecker) {
        EnumC32978v enumC32978vMo24752w0;
        AbstractC22676k.m65750j(userStrapsRepository, "userStrapsRepository");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(tileVisibilityChecker, "tileVisibilityChecker");
        this.userStrapsRepository = userStrapsRepository;
        this.whoopStrapProvider = whoopStrapProvider;
        this.tileVisibilityChecker = tileVisibilityChecker;
        InterfaceC21750d interfaceC21750dM36306g = m36306g();
        this.isMaverickOrGoose = (interfaceC21750dM36306g == null || (enumC32978vMo24752w0 = interfaceC21750dM36306g.mo24752w0()) == null) ? false : enumC32978vMo24752w0.isMaverickOrGoose();
        this.isStrapDisconnected = m36306g() == null;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC21750d m36306g() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m36307j(EnumC15710a tile) {
        AbstractC22676k.m65750j(tile, "tile");
        return this.tileVisibilityChecker.m36305a(tile);
    }

    /* JADX INFO: renamed from: l */
    public final void m36308l(String name, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(navigator, "navigator");
        navigator.mo59393b(new AbstractC21155m0.f3(name, "", "Tutorial", null, null, 24, null));
    }
}
