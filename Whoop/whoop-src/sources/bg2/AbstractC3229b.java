package bg2;

import com.whoop.sms.common.data.SmsContactPhoneNumberResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bg2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/sms/common/data/SmsContactPhoneNumberResponse;", "Lbg2/a;", "a", "(Lcom/whoop/sms/common/data/SmsContactPhoneNumberResponse;)Lbg2/a;", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3229b {
    /* JADX INFO: renamed from: a */
    public static final C3228a m9330a(SmsContactPhoneNumberResponse smsContactPhoneNumberResponse) {
        AbstractC22676k.m65750j(smsContactPhoneNumberResponse, "<this>");
        String phoneNumber = smsContactPhoneNumberResponse.getPhoneNumber();
        String label = smsContactPhoneNumberResponse.getLabel();
        if (label == null) {
            label = "";
        }
        return new C3228a(phoneNumber, label);
    }
}
