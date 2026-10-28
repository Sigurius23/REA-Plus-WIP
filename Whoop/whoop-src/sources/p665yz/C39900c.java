package p665yz;

import androidx.health.platform.client.proto.C1533u;
import dz.AbstractC12462i;

/* JADX INFO: renamed from: yz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39900c extends AbstractC12462i {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172296w;

    /* JADX INFO: renamed from: x */
    public static final C39900c f172293x = new C39900c(0);

    /* JADX INFO: renamed from: y */
    public static final C39900c f172294y = new C39900c(1);

    /* JADX INFO: renamed from: z */
    public static final C39900c f172295z = new C39900c(2);

    /* JADX INFO: renamed from: E */
    public static final C39900c f172277E = new C39900c(3);

    /* JADX INFO: renamed from: F */
    public static final C39900c f172278F = new C39900c(4);

    /* JADX INFO: renamed from: G */
    public static final C39900c f172279G = new C39900c(5);

    /* JADX INFO: renamed from: H */
    public static final C39900c f172280H = new C39900c(6);

    /* JADX INFO: renamed from: I */
    public static final C39900c f172281I = new C39900c(7);

    /* JADX INFO: renamed from: J */
    public static final C39900c f172282J = new C39900c(8);

    /* JADX INFO: renamed from: K */
    public static final C39900c f172283K = new C39900c(9);

    /* JADX INFO: renamed from: L */
    public static final C39900c f172284L = new C39900c(10);

    /* JADX INFO: renamed from: M */
    public static final C39900c f172285M = new C39900c(11);

    /* JADX INFO: renamed from: N */
    public static final C39900c f172286N = new C39900c(12);

    /* JADX INFO: renamed from: O */
    public static final C39900c f172287O = new C39900c(13);

    /* JADX INFO: renamed from: P */
    public static final C39900c f172288P = new C39900c(14);

    /* JADX INFO: renamed from: Q */
    public static final C39900c f172289Q = new C39900c(15);

    /* JADX INFO: renamed from: R */
    public static final C39900c f172290R = new C39900c(16);

    /* JADX INFO: renamed from: S */
    public static final C39900c f172291S = new C39900c(17);

    /* JADX INFO: renamed from: T */
    public static final C39900c f172292T = new C39900c(18);

    public /* synthetic */ C39900c(int i13) {
        this.f172296w = i13;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f172296w) {
            case 0:
                return "link.account_lookup.failure";
            case 1:
                return "link.account_refresh.failure";
            case 2:
                return "link.email_suggestion.accepted";
            case 3:
                return "link.popup.cancel";
            case 4:
                return "link.popup.error";
            case 5:
                return "link.popup.logout";
            case 6:
                return "link.popup.show";
            case 7:
                return "link.popup.skipped";
            case 8:
                return "link.popup.success";
            case 9:
                return "link.signup.checkbox_checked";
            case 10:
                return "link.signup.complete";
            case 11:
                return "link.signup.failure";
            case 12:
                return "link.signup.failure.invalidSessionState";
            case 13:
                return "link.signup.start";
            case 14:
                return "link.2fa.cancel";
            case 15:
                return "link.2fa.complete";
            case 16:
                return "link.2fa.failure";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "link.2fa.start";
            default:
                return "link.2fa.start_failure";
        }
    }
}
