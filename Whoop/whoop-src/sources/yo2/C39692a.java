package yo2;

import com.whoop.universalcheckout.features.externalwebcheckout.domain.models.ExternalWebCheckoutResponse;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33205o0;
import vo2.C36254c;
import vo2.InterfaceC36252a;
import xo2.C38497c;
import xo2.InterfaceC38495a;

/* JADX INFO: renamed from: yo2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lyo2/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lvo2/a$a;", "", "cartId", "Lxo2/c;", "b", "(Lvo2/a$a;Ljava/lang/String;)Lxo2/c;", "Lvo2/c;", "Lxo2/c$a;", "dialog", "c", "(Lvo2/c;Lxo2/c$a;)Lxo2/c;", "domainResult", "a", "(Lvo2/c;)Lxo2/c;", "Ljb1/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39692a {

    /* JADX INFO: renamed from: b */
    public static final int f170855b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C39692a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final C38497c m127027b(InterfaceC36252a.a aVar, String str) {
        if (aVar instanceof InterfaceC36252a.b) {
            return new C38497c(null, new C38497c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC36252a.c) {
            return new C38497c(null, new C38497c.b(C33205o0.f138451a.m105289c(), new InterfaceC38495a.e(str), null, InterfaceC38495a.f.f164962a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC36252a.d) {
            return new C38497c(null, new C38497c.b(C33205o0.f138451a.m105291e(), new InterfaceC38495a.e(str), null, InterfaceC38495a.f.f164962a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final C38497c m127028c(C36254c c36254c, C38497c.a aVar) {
        String redirectUrl;
        String cartId = c36254c.getCartId();
        ExternalWebCheckoutResponse response = c36254c.getResponse();
        if (response == null || (redirectUrl = response.getRedirectUrl()) == null) {
            redirectUrl = "";
        }
        return new C38497c(aVar, null, new C38497c.c(cartId, redirectUrl), 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final C38497c m127029a(C36254c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC36252a.a ? m127027b((InterfaceC36252a.a) domainResult.getCurrentDialogType(), domainResult.getCartId()) : m127028c(domainResult, null);
    }

    public /* synthetic */ C39692a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC39693b.f170857a : c21535a);
    }
}
