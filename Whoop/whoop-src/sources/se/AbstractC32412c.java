package se;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.ExpiredTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.RegionDisabledException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidUserPoolConfigurationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.LimitExceededException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordHistoryPolicyViolationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnexpectedLambdaException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedOperationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserLambdaValidationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import l83.C23468n;
import m83.AbstractC25260n;
import p031b9.C2817b;
import p091dg.C12002a;
import p194hg.C17248i;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p251jg.C21649b;
import p251jg.C21652e;
import p459rf.C31341l;
import p501te.C33740e;
import p501te.EnumC33741f;
import p505ts.AbstractC34132o;
import p522uf.InterfaceC34879h;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.AbstractC32145e0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: se.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32412c implements InterfaceC34879h {
    /* JADX INFO: renamed from: b */
    public static ExpiredTokenException m101115b(C12002a context, C31341l call, byte[] bArr) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String str = null;
        if (bArr != null) {
            C2817b c2817bM100103j = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
            while (true) {
                C2817b c2817bM8017t = c2817bM100103j.m8017t();
                if (c2817bM8017t == null) {
                    break;
                }
                if (AbstractC22676k.m65745e(c2817bM8017t.m8014q(), "message")) {
                    try {
                        objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        objM107888l = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#expiredIdentityTokenMessage`)", thM68037a);
                    }
                    AbstractC34132o.m107864I(objM107888l);
                    str = (String) objM107888l;
                }
                c2817bM8017t.m8009j();
            }
        }
        ExpiredTokenException expiredTokenException = new ExpiredTokenException(str);
        expiredTokenException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return expiredTokenException;
    }

    /* JADX INFO: renamed from: c */
    public static MalformedPolicyDocumentException m101116c(C12002a context, C31341l call, byte[] bArr) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String str = null;
        if (bArr != null) {
            C2817b c2817bM100103j = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
            while (true) {
                C2817b c2817bM8017t = c2817bM100103j.m8017t();
                if (c2817bM8017t == null) {
                    break;
                }
                if (AbstractC22676k.m65745e(c2817bM8017t.m8014q(), "message")) {
                    try {
                        objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        objM107888l = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#malformedPolicyDocumentMessage`)", thM68037a);
                    }
                    AbstractC34132o.m107864I(objM107888l);
                    str = (String) objM107888l;
                }
                c2817bM8017t.m8009j();
            }
        }
        MalformedPolicyDocumentException malformedPolicyDocumentException = new MalformedPolicyDocumentException(str);
        malformedPolicyDocumentException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return malformedPolicyDocumentException;
    }

    /* JADX INFO: renamed from: d */
    public static PackedPolicyTooLargeException m101117d(C12002a context, C31341l call, byte[] bArr) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String str = null;
        if (bArr != null) {
            C2817b c2817bM100103j = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
            while (true) {
                C2817b c2817bM8017t = c2817bM100103j.m8017t();
                if (c2817bM8017t == null) {
                    break;
                }
                if (AbstractC22676k.m65745e(c2817bM8017t.m8014q(), "message")) {
                    try {
                        objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        objM107888l = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#packedPolicyTooLargeMessage`)", thM68037a);
                    }
                    AbstractC34132o.m107864I(objM107888l);
                    str = (String) objM107888l;
                }
                c2817bM8017t.m8009j();
            }
        }
        PackedPolicyTooLargeException packedPolicyTooLargeException = new PackedPolicyTooLargeException(str);
        packedPolicyTooLargeException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return packedPolicyTooLargeException;
    }

    /* JADX INFO: renamed from: e */
    public static RegionDisabledException m101118e(C12002a context, C31341l call, byte[] bArr) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String str = null;
        if (bArr != null) {
            C2817b c2817bM100103j = AbstractC32145e0.m100103j(AbstractC35903f.m114005Z(bArr));
            while (true) {
                C2817b c2817bM8017t = c2817bM100103j.m8017t();
                if (c2817bM8017t == null) {
                    break;
                }
                if (AbstractC22676k.m65745e(c2817bM8017t.m8014q(), "message")) {
                    try {
                        objM107888l = AbstractC35903f.m114017l(c2817bM8017t);
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        objM107888l = AbstractC33745d.m106662u("expected (string: `com.amazonaws.sts#regionDisabledMessage`)", thM68037a);
                    }
                    AbstractC34132o.m107864I(objM107888l);
                    str = (String) objM107888l;
                }
                c2817bM8017t.m8009j();
            }
        }
        RegionDisabledException regionDisabledException = new RegionDisabledException(str);
        regionDisabledException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return regionDisabledException;
    }

    /* JADX INFO: renamed from: f */
    public static InvalidSmsRoleTrustRelationshipException m101119f(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        InvalidSmsRoleTrustRelationshipException invalidSmsRoleTrustRelationshipException = new InvalidSmsRoleTrustRelationshipException(strMo45166o);
        invalidSmsRoleTrustRelationshipException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return invalidSmsRoleTrustRelationshipException;
    }

    /* JADX INFO: renamed from: g */
    public static InvalidUserPoolConfigurationException m101120g(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        InvalidUserPoolConfigurationException invalidUserPoolConfigurationException = new InvalidUserPoolConfigurationException(strMo45166o);
        invalidUserPoolConfigurationException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return invalidUserPoolConfigurationException;
    }

    /* JADX INFO: renamed from: h */
    public static LimitExceededException m101121h(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        LimitExceededException limitExceededException = new LimitExceededException(strMo45166o);
        limitExceededException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return limitExceededException;
    }

    /* JADX INFO: renamed from: i */
    public static NotAuthorizedException m101122i(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        NotAuthorizedException notAuthorizedException = new NotAuthorizedException(strMo45166o);
        notAuthorizedException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return notAuthorizedException;
    }

    /* JADX INFO: renamed from: j */
    public static PasswordHistoryPolicyViolationException m101123j(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        PasswordHistoryPolicyViolationException passwordHistoryPolicyViolationException = new PasswordHistoryPolicyViolationException(strMo45166o);
        passwordHistoryPolicyViolationException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return passwordHistoryPolicyViolationException;
    }

    /* JADX INFO: renamed from: k */
    public static PasswordResetRequiredException m101124k(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        PasswordResetRequiredException passwordResetRequiredException = new PasswordResetRequiredException(strMo45166o);
        passwordResetRequiredException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return passwordResetRequiredException;
    }

    /* JADX INFO: renamed from: l */
    public static ResourceNotFoundException m101125l(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        ResourceNotFoundException resourceNotFoundException = new ResourceNotFoundException(strMo45166o);
        resourceNotFoundException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return resourceNotFoundException;
    }

    /* JADX INFO: renamed from: m */
    public static TooManyRequestsException m101126m(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        TooManyRequestsException tooManyRequestsException = new TooManyRequestsException(strMo45166o);
        tooManyRequestsException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return tooManyRequestsException;
    }

    /* JADX INFO: renamed from: n */
    public static UnexpectedLambdaException m101127n(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        UnexpectedLambdaException unexpectedLambdaException = new UnexpectedLambdaException(strMo45166o);
        unexpectedLambdaException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return unexpectedLambdaException;
    }

    /* JADX INFO: renamed from: o */
    public static UnsupportedOperationException m101128o(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(strMo45166o);
        unsupportedOperationException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return unsupportedOperationException;
    }

    /* JADX INFO: renamed from: p */
    public static UserLambdaValidationException m101129p(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        UserLambdaValidationException userLambdaValidationException = new UserLambdaValidationException(strMo45166o);
        userLambdaValidationException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return userLambdaValidationException;
    }

    /* JADX INFO: renamed from: q */
    public static UserNotConfirmedException m101130q(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        UserNotConfirmedException userNotConfirmedException = new UserNotConfirmedException(strMo45166o);
        userNotConfirmedException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return userNotConfirmedException;
    }

    /* JADX INFO: renamed from: r */
    public static UserNotFoundException m101131r(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        String strMo45166o = null;
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17248i c17248i = new C17248i(C17251l.f66278i, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC17176i.m48508j(c17248i), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    if (numMo45167q == null) {
                        break;
                    }
                    interfaceC17242cM30855g.skipValue();
                } else {
                    strMo45166o = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        UserNotFoundException userNotFoundException = new UserNotFoundException(strMo45166o);
        userNotFoundException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return userNotFoundException;
    }
}
