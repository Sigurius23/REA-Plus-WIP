package bo0;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p706eo0.C13377h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import sn0.AbstractC32772b;
import vn0.C36195e;
import wn0.AbstractC37412c;
import wn0.AbstractC37414e;
import wn0.C37416g;
import xn0.C38475c;

/* JADX INFO: renamed from: bo0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lbo0/d;", "", "Leo0/h;", "screenArgs", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lvn0/e;", "passwordValidator", "<init>", "(Leo0/h;Lcom/whoop/data/repositories/FeatureFlagChecker;Lvn0/e;)V", "Lwn0/c;", "error", "Lcom/whoop/design/util/TextResource;", "a", "(Lwn0/c;)Lcom/whoop/design/util/TextResource;", "Lwn0/e;", "b", "(Lwn0/e;)Lcom/whoop/design/util/TextResource;", "Lxn0/c;", "domainResult", "Lbo0/c;", "c", "(Lxn0/c;)Lbo0/c;", "Leo0/h;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lvn0/e;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3506d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13377h screenArgs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36195e passwordValidator;

    public C3506d(C13377h screenArgs, FeatureFlagChecker featureFlagChecker, C36195e passwordValidator) {
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(passwordValidator, "passwordValidator");
        this.screenArgs = screenArgs;
        this.featureFlagChecker = featureFlagChecker;
        this.passwordValidator = passwordValidator;
    }

    /* JADX INFO: renamed from: a */
    private final TextResource m10351a(AbstractC37412c error) {
        if (!(error instanceof AbstractC37412c.a) && !(error instanceof AbstractC37412c.c)) {
            if (error instanceof AbstractC37412c.b) {
                return new TextResource.C8688b(AbstractC32772b.f136295k, null, 2, null);
            }
            if (error == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new TextResource.C8688b(AbstractC32772b.f136294j, null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    private final TextResource m10352b(AbstractC37414e error) {
        if (error instanceof AbstractC37414e.e) {
            return new TextResource.C8688b(AbstractC32772b.f136310z, null, 2, null);
        }
        if (error instanceof AbstractC37414e.b) {
            return new TextResource.C8688b(AbstractC32772b.f136308x, null, 2, null);
        }
        if (!(error instanceof AbstractC37414e.c) && !(error instanceof AbstractC37414e.d)) {
            if (error instanceof AbstractC37414e.a) {
                return new TextResource.C8688b(AbstractC32772b.f136295k, null, 2, null);
            }
            if (error == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new TextResource.C8688b(AbstractC32772b.f136294j, null, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final C3505c m10353c(C38475c domainResult) {
        boolean z4;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        List<C37416g> listM115189a = !domainResult.m123285e().isEmpty() ? this.passwordValidator.m115189a(domainResult.getCurrentPassword(), domainResult.m123285e()) : C25271y.f99162w;
        if (listM115189a.isEmpty()) {
            z4 = false;
        } else {
            List<C37416g> list = listM115189a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C37416g) it.next()).getIsValid()) {
                            z4 = false;
                        }
                    }
                }
            }
            z4 = true;
        }
        return new C3505c(domainResult.getCurrentPassword(), listM115189a, z4, domainResult.getIsLoading() && domainResult.m123285e().isEmpty(), domainResult.getIsLoading() && !domainResult.m123285e().isEmpty(), m10351a(domainResult.getRequirementsError()), m10352b(domainResult.getSubmissionError()), domainResult.getIsSuccess(), this.screenArgs.getIsExpired() || (domainResult.getSubmissionError() instanceof AbstractC37414e.e), domainResult.getNewLinkSent(), domainResult.getShowExitDialog());
    }
}
