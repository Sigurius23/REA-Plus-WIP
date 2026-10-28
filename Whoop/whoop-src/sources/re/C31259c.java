package re;

/* JADX INFO: renamed from: re.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31259c extends AbstractC31268f {

    /* JADX INFO: renamed from: b */
    public static final C31259c f128763b = new C31259c(0);

    /* JADX INFO: renamed from: c */
    public static final C31259c f128764c = new C31259c(1);

    /* JADX INFO: renamed from: d */
    public static final C31259c f128765d = new C31259c(2);

    /* JADX INFO: renamed from: e */
    public static final C31259c f128766e = new C31259c(3);

    /* JADX INFO: renamed from: f */
    public static final C31259c f128767f = new C31259c(4);

    /* JADX INFO: renamed from: g */
    public static final C31259c f128768g = new C31259c(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128769a;

    public /* synthetic */ C31259c(int i13) {
        this.f128769a = i13;
    }

    @Override // re.AbstractC31268f
    /* JADX INFO: renamed from: a */
    public final String mo96283a() {
        switch (this.f128769a) {
            case 0:
                return "ADMIN_NO_SRP_AUTH";
            case 1:
                return "ADMIN_USER_PASSWORD_AUTH";
            case 2:
                return "CUSTOM_AUTH";
            case 3:
                return "REFRESH_TOKEN";
            case 4:
                return "USER_AUTH";
            default:
                return "USER_SRP_AUTH";
        }
    }

    public final String toString() {
        switch (this.f128769a) {
            case 0:
                return "AdminNoSrpAuth";
            case 1:
                return "AdminUserPasswordAuth";
            case 2:
                return "CustomAuth";
            case 3:
                return "RefreshToken";
            case 4:
                return "UserAuth";
            default:
                return "UserSrpAuth";
        }
    }
}
