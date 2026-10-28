package mr1;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: mr1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lmr1/m;", "", "<init>", "()V", "Lmr1/a;", "dialogType", "", "b", "(Lmr1/a;)Ljava/lang/String;", "error", "a", "(Lmr1/a;Ljava/lang/String;)Ljava/lang/String;", "Lmr1/c;", "domainState", "Lmr1/l;", "c", "(Lmr1/c;)Lmr1/l;", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25923m {
    /* JADX INFO: renamed from: a */
    private final String m76680a(AbstractC25911a dialogType, String error) {
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.a.f102286a)) {
            return "Creating cart...";
        }
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.b.f102287a)) {
            return "Please check your internet connection and try again.";
        }
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.d.f102289a)) {
            return error == null ? "Request failed. Please try again." : error;
        }
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.c.f102288a)) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final String m76681b(AbstractC25911a dialogType) {
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.a.f102286a)) {
            return "Loading";
        }
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.b.f102287a)) {
            return "Network Error";
        }
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.d.f102289a)) {
            return "Request Failed";
        }
        if (AbstractC22676k.m65745e(dialogType, AbstractC25911a.c.f102288a)) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final C25922l m76682c(C25913c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        String cartId = domainState.getCartId();
        boolean isLoading = domainState.getIsLoading();
        String error = domainState.getError();
        String cartId2 = domainState.getCartId();
        return new C25922l(cartId, isLoading, error, !(cartId2 == null || AbstractC39414r.m125890i0(cartId2)), domainState.getShouldNavigateToCheckout(), !AbstractC22676k.m65745e(domainState.getCurrentDialogType(), AbstractC25911a.c.f102288a), m76681b(domainState.getCurrentDialogType()), m76680a(domainState.getCurrentDialogType(), domainState.getError()));
    }
}
