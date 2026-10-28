package p229ip;

import com.google.android.gms.common.C4986c;

/* JADX INFO: renamed from: ip.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20795f {

    /* JADX INFO: renamed from: a */
    public static final C4986c f78083a;

    /* JADX INFO: renamed from: b */
    public static final C4986c f78084b;

    /* JADX INFO: renamed from: c */
    public static final C4986c f78085c;

    /* JADX INFO: renamed from: d */
    public static final C4986c[] f78086d;

    static {
        C4986c c4986c = new C4986c("auth_api_credentials_begin_sign_in", 9L);
        C4986c c4986c2 = new C4986c("auth_api_credentials_sign_out", 2L);
        f78083a = c4986c2;
        C4986c c4986c3 = new C4986c("auth_api_credentials_authorize", 1L);
        C4986c c4986c4 = new C4986c("auth_api_credentials_revoke_access", 1L);
        C4986c c4986c5 = new C4986c("auth_api_credentials_save_password", 4L);
        f78084b = c4986c5;
        C4986c c4986c6 = new C4986c("auth_api_credentials_get_sign_in_intent", 6L);
        f78085c = c4986c6;
        f78086d = new C4986c[]{c4986c, c4986c2, c4986c3, c4986c4, c4986c5, c4986c6, new C4986c("auth_api_credentials_save_account_linking_token", 3L), new C4986c("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }
}
