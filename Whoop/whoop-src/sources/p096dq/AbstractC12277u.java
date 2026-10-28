package p096dq;

import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.C4974e;
import com.google.android.gms.common.api.C4975f;

/* JADX INFO: renamed from: dq.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12277u {

    /* JADX INFO: renamed from: a */
    public static final C4975f f41106a = new C4975f("Wallet.API", new C12281y(0), new C4974e());

    /* JADX INFO: renamed from: b */
    public static final C4986c f41107b;

    /* JADX INFO: renamed from: c */
    public static final C4986c f41108c;

    /* JADX INFO: renamed from: d */
    public static final C4986c[] f41109d;

    static {
        C4986c c4986c = new C4986c("wallet", 1L);
        C4986c c4986c2 = new C4986c("wallet_biometric_auth_keys", 1L);
        C4986c c4986c3 = new C4986c("wallet_payment_dynamic_update", 2L);
        f41107b = c4986c3;
        C4986c c4986c4 = new C4986c("wallet_1p_initialize_buyflow", 1L);
        C4986c c4986c5 = new C4986c("wallet_warm_up_ui_process", 1L);
        C4986c c4986c6 = new C4986c("wallet_get_setup_wizard_intent", 4L);
        C4986c c4986c7 = new C4986c("wallet_get_payment_card_recognition_intent", 1L);
        f41108c = c4986c7;
        f41109d = new C4986c[]{c4986c, c4986c2, c4986c3, c4986c4, c4986c5, c4986c6, c4986c7, new C4986c("wallet_save_instrument", 1L)};
    }
}
