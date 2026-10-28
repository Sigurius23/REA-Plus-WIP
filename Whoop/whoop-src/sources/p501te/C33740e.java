package p501te;

import gf.C15760a;

/* JADX INFO: renamed from: te.e */
/* JADX INFO: loaded from: classes6.dex */
public class C33740e extends C33738c {

    /* JADX INFO: renamed from: e */
    public static final C15760a f141123e = new C15760a("aws.smithy.kotlin#ErrorCode");

    /* JADX INFO: renamed from: f */
    public static final C15760a f141124f = new C15760a("aws.smithy.kotlin#ErrorMessage");

    /* JADX INFO: renamed from: g */
    public static final C15760a f141125g = new C15760a("aws.smithy.kotlin#ErrorType");

    /* JADX INFO: renamed from: h */
    public static final C15760a f141126h = new C15760a("aws.smithy.kotlin#ProtocolResponse");

    /* JADX INFO: renamed from: i */
    public static final C15760a f141127i = new C15760a("aws.smithy.kotlin#RequestId");

    /* JADX INFO: renamed from: e */
    public final String m106624e() {
        return (String) this.f141122a.mo33082b(f141123e);
    }

    /* JADX INFO: renamed from: f */
    public final String m106625f() {
        return (String) this.f141122a.mo33082b(f141124f);
    }

    /* JADX INFO: renamed from: g */
    public final EnumC33741f m106626g() {
        EnumC33741f enumC33741f = (EnumC33741f) this.f141122a.mo33082b(f141125g);
        return enumC33741f == null ? EnumC33741f.f141130y : enumC33741f;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC33739d m106627h() {
        InterfaceC33739d interfaceC33739d = (InterfaceC33739d) this.f141122a.mo33082b(f141126h);
        return interfaceC33739d == null ? C33737b.f141118a : interfaceC33739d;
    }

    /* JADX INFO: renamed from: i */
    public final String m106628i() {
        return (String) this.f141122a.mo33082b(f141127i);
    }
}
