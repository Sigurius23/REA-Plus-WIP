package com.whoop.data.repositories;

import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.domain.dto.onboarding.OnboardingInfoDto;
import com.whoop.data.remote.domain.request.onboarding.StrapDetailsRequestBody;
import com.whoop.data.remote.domain.response.onboarding.OnboardingInfo;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.network.exception.DomainException;
import com.whoop.service.network.MembershipV0Api;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import w02.AbstractC36685b;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/data/repositories/OnboardingRepository;", "", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Ltd1/b;", "whoopStrap", "Lcom/whoop/service/network/MembershipV0Api;", "membershipV0Api", "<init>", "(Ltr2/n;Lrr2/c;Ltd1/b;Lcom/whoop/service/network/MembershipV0Api;)V", "", "getStrapGeneration", "()Ljava/lang/String;", "serialNumber", "strapSignature", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "fetchOnboardingInfo", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lrr2/c;", "Ltd1/b;", "Lcom/whoop/service/network/MembershipV0Api;", "getStrapSignature", "getStrapSerial", "strapSerial", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OnboardingRepository {
    private final InterfaceC31766c crashReporter;
    private final InterfaceC34116n logger;
    private final MembershipV0Api membershipV0Api;
    private final InterfaceC33704b whoopStrap;

    /* JADX INFO: renamed from: com.whoop.data.repositories.OnboardingRepository$fetchOnboardingInfo$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.OnboardingRepository", m100430f = "OnboardingRepository.kt", m100431l = {45}, m100432m = "fetchOnboardingInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66071 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C66071(InterfaceC30057d<? super C66071> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingRepository.this.fetchOnboardingInfo(null, null, this);
        }
    }

    public OnboardingRepository(InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC33704b whoopStrap, MembershipV0Api membershipV0Api) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(membershipV0Api, "membershipV0Api");
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.whoopStrap = whoopStrap;
        this.membershipV0Api = membershipV0Api;
    }

    public static /* synthetic */ Object fetchOnboardingInfo$default(OnboardingRepository onboardingRepository, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return onboardingRepository.fetchOnboardingInfo(str, str2, interfaceC30057d);
    }

    private final String getStrapSignature() {
        String strapSignature;
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrap.mo106493f();
        return (whoopStrapInfoMo106493f == null || (strapSignature = whoopStrapInfoMo106493f.getStrapSignature()) == null) ? "" : strapSignature;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object fetchOnboardingInfo(String str, String str2, InterfaceC30057d<? super Resource<OnboardingInfo>> interfaceC30057d) {
        C66071 c66071;
        Exception exc;
        StrapDetailsRequestBody strapDetailsRequestBody;
        if (interfaceC30057d instanceof C66071) {
            c66071 = (C66071) interfaceC30057d;
            int i13 = c66071.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66071.label = i13 - Integer.MIN_VALUE;
            } else {
                c66071 = new C66071(interfaceC30057d);
            }
        } else {
            c66071 = new C66071(interfaceC30057d);
        }
        Object obj = c66071.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66071.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            StrapDetailsRequestBody strapDetailsRequestBody2 = new StrapDetailsRequestBody(str == null ? getStrapSerial() : str, str2 == null ? getStrapSignature() : str2);
            this.logger.mo85228t("fetching onboarding info", new AbstractC30556a.a[0]);
            try {
                MembershipV0Api membershipV0Api = this.membershipV0Api;
                if (str == null) {
                    str = getStrapSerial();
                }
                if (str2 == null) {
                    str2 = getStrapSignature();
                }
                c66071.L$0 = null;
                c66071.L$1 = null;
                c66071.L$2 = strapDetailsRequestBody2;
                c66071.label = 1;
                Object objFetchGetOnboardingInfoV0 = membershipV0Api.fetchGetOnboardingInfoV0("create-account", str, str2, c66071);
                if (objFetchGetOnboardingInfoV0 == enumC31071a) {
                    return enumC31071a;
                }
                obj = objFetchGetOnboardingInfoV0;
            } catch (Exception e5) {
                exc = e5;
                strapDetailsRequestBody = strapDetailsRequestBody2;
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(exc, AbstractC31061c.m95640p("Failed to fetch onboarding info  - strapSerial ", strapDetailsRequestBody.getStrapSerial(), " - strapSignature ", strapDetailsRequestBody.getStrapSignature()), this.logger, this.crashReporter), null, null, DomainException.INSTANCE.m23148a(exc), 6, null);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strapDetailsRequestBody = (StrapDetailsRequestBody) c66071.L$2;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e13) {
                exc = e13;
                return Resource.Companion.error$default(Resource.INSTANCE, AbstractC36685b.m117759a(exc, AbstractC31061c.m95640p("Failed to fetch onboarding info  - strapSerial ", strapDetailsRequestBody.getStrapSerial(), " - strapSignature ", strapDetailsRequestBody.getStrapSignature()), this.logger, this.crashReporter), null, null, DomainException.INSTANCE.m23148a(exc), 6, null);
            }
        }
        OnboardingInfoDto onboardingInfoDto = (OnboardingInfoDto) obj;
        this.logger.mo85228t("received onboarding response " + onboardingInfoDto, new AbstractC30556a.a[0]);
        return Resource.INSTANCE.success(onboardingInfoDto.toOnboardingInfoResponse());
    }

    public final String getStrapGeneration() {
        if (getStrapSerial().length() == 0) {
            return "unknown";
        }
        return AbstractC39421y.m125930O(getStrapSerial(), "4", false) ? "Gen4" : "Gen3";
    }

    public final String getStrapSerial() {
        String serialNumber;
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrap.mo106493f();
        return (whoopStrapInfoMo106493f == null || (serialNumber = whoopStrapInfoMo106493f.getSerialNumber()) == null) ? "" : serialNumber;
    }
}
