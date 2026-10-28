package com.whoop.sms.common.data;

import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H§@¢\u0006\u0004\b\u0011\u0010\nJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H§@¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sms/common/data/SmsVerificationApi;", "", "Lcom/whoop/sms/common/data/SmsVerificationRequest;", "request", "Lpg3/v0;", "Ll83/a0;", "sendVerificationCode", "(Lcom/whoop/sms/common/data/SmsVerificationRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sms/common/data/TextingSettingsAvailabilityResponse;", "textingSettingsAvailability", "(Lq83/d;)Ljava/lang/Object;", "", "code", "Lcom/whoop/sms/common/data/SmsVerifyResponse;", "verifyCode", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;", "phoneNumber", "Lcom/whoop/sms/common/data/SmsPrefilledBodyResponse;", "prefilledBody", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SmsVerificationApi {
    @InterfaceC37275f("messaging-service/v1/sms/onboarding/phone-number")
    Object phoneNumber(InterfaceC30057d<? super C29218v0<SmsPhoneNumberResponse>> interfaceC30057d);

    @InterfaceC37284o("messaging-service/v1/sms/onboarding/body")
    Object prefilledBody(InterfaceC30057d<? super C29218v0<SmsPrefilledBodyResponse>> interfaceC30057d);

    @InterfaceC37284o("messaging-service/v1/sms/verification")
    Object sendVerificationCode(@InterfaceC37270a SmsVerificationRequest smsVerificationRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("messaging-service/v1/sms/feature-eligibility")
    Object textingSettingsAvailability(InterfaceC30057d<? super C29218v0<TextingSettingsAvailabilityResponse>> interfaceC30057d);

    @InterfaceC37284o("messaging-service/v1/sms/verify/{code}")
    Object verifyCode(@InterfaceC37288s("code") String str, InterfaceC30057d<? super C29218v0<SmsVerifyResponse>> interfaceC30057d);
}
