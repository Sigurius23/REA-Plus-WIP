package py1;

import androidx.core.app.NotificationCompat;
import dj0.C12065a;
import dj0.InterfaceC12085u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import uy1.EnumC35383g;
import xy1.EnumC38702c;

/* JADX INFO: renamed from: py1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007\"\u0018\u0010\r\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lxy1/c;", "", "c", "(Lxy1/c;)Ljava/lang/String;", "toAnalyticsMfaType", "Ldj0/u;", "b", "(Ldj0/u;)Ljava/lang/String;", "a", "toAnalyticsEventName", "Luy1/g;", "d", "(Luy1/g;)Ljava/lang/String;", "toAnalyticsType", "mfa_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29623b {

    /* JADX INFO: renamed from: py1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120966a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f120967b;

        static {
            int[] iArr = new int[EnumC38702c.values().length];
            try {
                iArr[EnumC38702c.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38702c.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120966a = iArr;
            int[] iArr2 = new int[EnumC35383g.values().length];
            try {
                iArr2[EnumC35383g.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC35383g.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f120967b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m91034a(InterfaceC12085u interfaceC12085u) {
        AbstractC22676k.m65750j(interfaceC12085u, "<this>");
        if (interfaceC12085u instanceof InterfaceC12085u.b) {
            return "Auth Flow";
        }
        if (interfaceC12085u instanceof InterfaceC12085u.a) {
            return "MFA Setup Flow";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final String m91035b(InterfaceC12085u interfaceC12085u) {
        AbstractC22676k.m65750j(interfaceC12085u, "<this>");
        if (interfaceC12085u instanceof InterfaceC12085u.b) {
            String challengeName = ((InterfaceC12085u.b) interfaceC12085u).getChallengeName();
            if (AbstractC22676k.m65745e(challengeName, "EMAIL_OTP")) {
                return NotificationCompat.CATEGORY_EMAIL;
            }
            return AbstractC22676k.m65745e(challengeName, "SMS_MFA") ? "phone_number" : "unknown";
        }
        if (!(interfaceC12085u instanceof InterfaceC12085u.a)) {
            throw new NoWhenBranchMatchedException();
        }
        C12065a codeDeliveryInfo = ((InterfaceC12085u.a) interfaceC12085u).getCodeDeliveryInfo();
        String deliveryMedium = codeDeliveryInfo != null ? codeDeliveryInfo.getDeliveryMedium() : null;
        if (AbstractC22676k.m65745e(deliveryMedium, "EMAIL")) {
            return NotificationCompat.CATEGORY_EMAIL;
        }
        return AbstractC22676k.m65745e(deliveryMedium, "SMS") ? "phone_number" : "unknown";
    }

    /* JADX INFO: renamed from: c */
    public static final String m91036c(EnumC38702c enumC38702c) {
        AbstractC22676k.m65750j(enumC38702c, "<this>");
        int i13 = a.f120966a[enumC38702c.ordinal()];
        if (i13 == 1) {
            return "phone_number";
        }
        if (i13 == 2) {
            return NotificationCompat.CATEGORY_EMAIL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final String m91037d(EnumC35383g enumC35383g) {
        AbstractC22676k.m65750j(enumC35383g, "<this>");
        int i13 = a.f120967b[enumC35383g.ordinal()];
        if (i13 == 1) {
            return NotificationCompat.CATEGORY_EMAIL;
        }
        if (i13 == 2) {
            return "phone_number";
        }
        throw new NoWhenBranchMatchedException();
    }
}
