package ao0;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.C25271y;
import p412q3.C29871f0;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30784c;
import sn0.AbstractC32772b;
import vn0.C36193c;
import vn0.C36195e;
import vn0.EnumC36191a;
import vn0.EnumC36196f;
import wb3.AbstractC37056f;
import wn0.AbstractC37412c;
import wn0.C37416g;
import x81.C38072d;
import zn0.C40905c;

/* JADX INFO: renamed from: ao0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, m65681d2 = {"Lao0/a;", "", "Lvn0/e;", "passwordValidator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lvn0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lvn0/a;", "backendPasswordValidationFailureReason", "Lcom/whoop/design/util/TextResource;", "a", "(Lvn0/a;)Lcom/whoop/design/util/TextResource;", "Lvn0/f;", "confirmPasswordErrorReason", "b", "(Lvn0/f;)Lcom/whoop/design/util/TextResource;", "Lwn0/c;", "error", "c", "(Lwn0/c;)Lcom/whoop/design/util/TextResource;", "Lvn0/c;", "domainResult", "Lzn0/c;", "d", "(Lvn0/c;)Lzn0/c;", "Lvn0/e;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "Lcom/whoop/design/util/TextResource$d$b;", "Ljava/util/List;", "lengthArg", "Lcom/whoop/design/util/TextResource$b;", "Lcom/whoop/design/util/TextResource$b;", "tooShortTextResource", "e", "tooShortBackendTextResource", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1865a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C36195e passwordValidator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<TextResource.AbstractC8690d.b> lengthArg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource.C8688b tooShortTextResource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource.C8688b tooShortBackendTextResource;

    /* JADX INFO: renamed from: ao0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7382a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f7383b;

        static {
            int[] iArr = new int[EnumC36191a.values().length];
            try {
                iArr[EnumC36191a.CURRENT_PASSWORD_INCORRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36191a.OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36191a.GENERIC_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36191a.NEW_PASSWORD_TOO_SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7382a = iArr;
            int[] iArr2 = new int[EnumC36196f.values().length];
            try {
                iArr2[EnumC36196f.NEW_PASSWORD_TOO_SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC36196f.PASSWORDS_DO_NOT_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC36196f.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f7383b = iArr2;
        }
    }

    public C1865a(C36195e passwordValidator, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(passwordValidator, "passwordValidator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.passwordValidator = passwordValidator;
        this.featureFlagChecker = featureFlagChecker;
        List<TextResource.AbstractC8690d.b> listM118958J = AbstractC37056f.m118958J(new TextResource.AbstractC8690d.b(12));
        this.lengthArg = listM118958J;
        this.tooShortTextResource = new TextResource.C8688b(AbstractC32772b.f136280B, listM118958J);
        this.tooShortBackendTextResource = new TextResource.C8688b(AbstractC32772b.f136298n, listM118958J);
    }

    /* JADX INFO: renamed from: a */
    private final TextResource m5528a(EnumC36191a backendPasswordValidationFailureReason) {
        int i13 = backendPasswordValidationFailureReason == null ? -1 : a.f7382a[backendPasswordValidationFailureReason.ordinal()];
        if (i13 == -1) {
            return null;
        }
        if (i13 == 1) {
            return new TextResource.C8688b(AbstractC32772b.f136304t, null, 2, null);
        }
        if (i13 == 2) {
            return new TextResource.C8688b(AbstractC32772b.f136297m, null, 2, null);
        }
        if (i13 == 3) {
            return new TextResource.C8688b(AbstractC32772b.f136299o, null, 2, null);
        }
        if (i13 == 4) {
            return this.tooShortBackendTextResource;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final TextResource m5529b(EnumC36196f confirmPasswordErrorReason) {
        int i13 = a.f7383b[confirmPasswordErrorReason.ordinal()];
        if (i13 == 1) {
            return this.tooShortTextResource;
        }
        if (i13 == 2) {
            return new TextResource.C8688b(AbstractC32772b.f136303s, null, 2, null);
        }
        if (i13 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    private final TextResource m5530c(AbstractC37412c error) {
        if (error instanceof AbstractC37412c.b) {
            return new TextResource.C8688b(AbstractC32772b.f136295k, null, 2, null);
        }
        if (!(error instanceof AbstractC37412c.c) && !(error instanceof AbstractC37412c.a)) {
            if (error == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new TextResource.C8688b(AbstractC32772b.f136294j, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX INFO: renamed from: d */
    public final C40905c m5531d(C36193c domainResult) {
        List listM74128f1;
        boolean z4;
        String initialConfirmPassword;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        C23465k c23465k = domainResult.getPasswordIsVisible() ? new C23465k(new AbstractC30784c.a(C38072d.f163053a.m121951d().getVarious().getStealthMode(), null, null, null, 14, null), C29871f0.f122092w) : new C23465k(new AbstractC30784c.a(C38072d.f163053a.m121951d().getVarious().getPrivacy(), null, null, null, 14, null), new C29885s());
        AbstractC30784c.a aVar = (AbstractC30784c.a) c23465k.f92937w;
        InterfaceC29873g0 interfaceC29873g0 = (InterfaceC29873g0) c23465k.f92938x;
        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32772b.f136281C, null, 2, null);
        String initialNewPassword = domainResult.getInitialNewPassword();
        C37416g c37416g = new C37416g("passwords_must_match", c8688b, (initialNewPassword == null || initialNewPassword.length() == 0 || (initialConfirmPassword = domainResult.getInitialConfirmPassword()) == null || initialConfirmPassword.length() == 0 || !AbstractC22676k.m65745e(domainResult.getInitialNewPassword(), domainResult.getInitialConfirmPassword())) ? false : true);
        if (domainResult.m115159i().isEmpty()) {
            listM74128f1 = C25271y.f99162w;
        } else {
            C36195e c36195e = this.passwordValidator;
            String initialNewPassword2 = domainResult.getInitialNewPassword();
            if (initialNewPassword2 == null) {
                initialNewPassword2 = "";
            }
            listM74128f1 = AbstractC25265s.m74128f1(c37416g, c36195e.m115189a(initialNewPassword2, domainResult.m115159i()));
        }
        List list = listM74128f1;
        if (list.isEmpty()) {
            z4 = true;
        } else {
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z4 = true;
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!((C37416g) it.next()).getIsValid()) {
                        z4 = false;
                    }
                }
                z4 = true;
            }
        }
        return new C40905c(domainResult.getIsLoadingRequirements(), domainResult.getIsSavingPassword(), domainResult.getIsSuccess(), domainResult.getPasswordIsVisible(), aVar, interfaceC29873g0, domainResult.getInitialCurrentPassword(), domainResult.getInitialNewPassword(), domainResult.getInitialConfirmPassword(), m5529b(domainResult.getConfirmPasswordErrorReason()), AbstractC8693b.m21267a(), m5528a(domainResult.getBackendPasswordValidationFailureReason()), list, z4, m5530c(domainResult.getRequirementsError()));
    }
}
