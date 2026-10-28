package p089dd;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.AliasExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeDeliveryFailureException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeMismatchException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ExpiredCodeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ForbiddenException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InternalErrorException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidEmailRoleAccessPolicyException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidLambdaResponseException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidPasswordException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import io.seon.androidsdk.service.C20653c0;
import m83.AbstractC25260n;
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
import p522uf.InterfaceC34879h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dd.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11941a implements InterfaceC34879h {
    /* JADX INFO: renamed from: b */
    public static AliasExistsException m32236b(C12002a context, C31341l call, byte[] bArr) {
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
        AliasExistsException aliasExistsException = new AliasExistsException(strMo45166o);
        aliasExistsException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return aliasExistsException;
    }

    /* JADX INFO: renamed from: c */
    public static CodeDeliveryFailureException m32237c(C12002a context, C31341l call, byte[] bArr) {
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
        CodeDeliveryFailureException codeDeliveryFailureException = new CodeDeliveryFailureException(strMo45166o);
        codeDeliveryFailureException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return codeDeliveryFailureException;
    }

    /* JADX INFO: renamed from: d */
    public static CodeMismatchException m32238d(C12002a context, C31341l call, byte[] bArr) {
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
        CodeMismatchException codeMismatchException = new CodeMismatchException(strMo45166o);
        codeMismatchException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return codeMismatchException;
    }

    /* JADX INFO: renamed from: e */
    public static ExpiredCodeException m32239e(C12002a context, C31341l call, byte[] bArr) {
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
        ExpiredCodeException expiredCodeException = new ExpiredCodeException(strMo45166o);
        expiredCodeException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return expiredCodeException;
    }

    /* JADX INFO: renamed from: f */
    public static ForbiddenException m32240f(C12002a context, C31341l call, byte[] bArr) {
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
        ForbiddenException forbiddenException = new ForbiddenException(strMo45166o);
        forbiddenException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return forbiddenException;
    }

    /* JADX INFO: renamed from: g */
    public static InternalErrorException m32241g(C12002a context, C31341l call, byte[] bArr) {
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
        InternalErrorException internalErrorException = new InternalErrorException(strMo45166o);
        internalErrorException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141129x);
        return internalErrorException;
    }

    /* JADX INFO: renamed from: h */
    public static InvalidEmailRoleAccessPolicyException m32242h(C12002a context, C31341l call, byte[] bArr) {
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
        InvalidEmailRoleAccessPolicyException invalidEmailRoleAccessPolicyException = new InvalidEmailRoleAccessPolicyException(strMo45166o);
        invalidEmailRoleAccessPolicyException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return invalidEmailRoleAccessPolicyException;
    }

    /* JADX INFO: renamed from: i */
    public static InvalidLambdaResponseException m32243i(C12002a context, C31341l call, byte[] bArr) {
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
        InvalidLambdaResponseException invalidLambdaResponseException = new InvalidLambdaResponseException(strMo45166o);
        invalidLambdaResponseException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return invalidLambdaResponseException;
    }

    /* JADX INFO: renamed from: j */
    public static InvalidParameterException m32244j(C12002a context, C31341l call, byte[] bArr) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(call, "call");
        C20653c0 c20653c0 = new C20653c0();
        if (bArr != null) {
            C21649b c21649b = new C21649b(bArr);
            C17251l c17251l = C17251l.f66278i;
            C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("message")}), 0);
            C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("reasonCode")}), 0);
            InterfaceC17242c interfaceC17242cM30855g = AbstractC11478a.m30855g(AbstractC11478a.m30864p(c17248i, c17248i2), c21649b);
            while (true) {
                Integer numMo45167q = interfaceC17242cM30855g.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    int i14 = c17248i2.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i14) {
                        if (numMo45167q == null) {
                            break;
                        }
                        interfaceC17242cM30855g.skipValue();
                    } else {
                        c20653c0.f77249b = interfaceC17242cM30855g.mo45166o();
                    }
                } else {
                    c20653c0.f77248a = interfaceC17242cM30855g.mo45166o();
                }
            }
        }
        return new InvalidParameterException(c20653c0);
    }

    /* JADX INFO: renamed from: k */
    public static InvalidPasswordException m32245k(C12002a context, C31341l call, byte[] bArr) {
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
        InvalidPasswordException invalidPasswordException = new InvalidPasswordException(strMo45166o);
        invalidPasswordException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return invalidPasswordException;
    }

    /* JADX INFO: renamed from: l */
    public static InvalidSmsRoleAccessPolicyException m32246l(C12002a context, C31341l call, byte[] bArr) {
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
        InvalidSmsRoleAccessPolicyException invalidSmsRoleAccessPolicyException = new InvalidSmsRoleAccessPolicyException(strMo45166o);
        invalidSmsRoleAccessPolicyException.f8368y.f141122a.mo33083c(C33740e.f141125g, EnumC33741f.f141128w);
        return invalidSmsRoleAccessPolicyException;
    }
}
