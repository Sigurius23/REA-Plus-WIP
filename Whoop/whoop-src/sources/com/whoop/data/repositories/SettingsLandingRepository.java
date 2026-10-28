package com.whoop.data.repositories;

import com.whoop.data.remote.domain.dto.growth.ReferralContentDtoV2;
import com.whoop.domain.model.ReferralContentV2;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.service.network.MembershipV2Api;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/repositories/SettingsLandingRepository;", "", "Lcom/whoop/service/network/MembershipV2Api;", "membershipV2Api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V", "", "source", "", ProfileApiKt.COMMUNITY_ID_PARAM, "Lcom/whoop/domain/model/ReferralContentV2;", "getReferralContentV2", "(Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/MembershipV2Api;", "getMembershipV2Api", "()Lcom/whoop/service/network/MembershipV2Api;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SettingsLandingRepository {
    private final InterfaceC34116n logger;
    private final MembershipV2Api membershipV2Api;

    /* JADX INFO: renamed from: com.whoop.data.repositories.SettingsLandingRepository$getReferralContentV2$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SettingsLandingRepository", m100430f = "SettingsLandingRepository.kt", m100431l = {15}, m100432m = "getReferralContentV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66081 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C66081(InterfaceC30057d<? super C66081> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsLandingRepository.this.getReferralContentV2(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SettingsLandingRepository$getReferralContentV2$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SettingsLandingRepository$getReferralContentV2$2", m100430f = "SettingsLandingRepository.kt", m100431l = {15}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66092 extends AbstractC32275i implements Function1 {
        final /* synthetic */ Integer $communityId;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66092(String str, Integer num, InterfaceC30057d<? super C66092> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$source = str;
            this.$communityId = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return SettingsLandingRepository.this.new C66092(this.$source, this.$communityId, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipV2Api membershipV2Api = SettingsLandingRepository.this.getMembershipV2Api();
            String str = this.$source;
            Integer num = this.$communityId;
            this.label = 1;
            Object referralContentV2 = membershipV2Api.getReferralContentV2(str, num, this);
            return referralContentV2 == enumC31071a ? enumC31071a : referralContentV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReferralContentDtoV2> interfaceC30057d) {
            return ((C66092) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public SettingsLandingRepository(MembershipV2Api membershipV2Api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipV2Api, "membershipV2Api");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipV2Api = membershipV2Api;
        this.logger = logger;
    }

    public static /* synthetic */ Object getReferralContentV2$default(SettingsLandingRepository settingsLandingRepository, String str, Integer num, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "Individual";
        }
        if ((i13 & 2) != 0) {
            num = null;
        }
        return settingsLandingRepository.getReferralContentV2(str, num, interfaceC30057d);
    }

    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    public final MembershipV2Api getMembershipV2Api() {
        return this.membershipV2Api;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object getReferralContentV2(String str, Integer num, InterfaceC30057d<? super ReferralContentV2> interfaceC30057d) {
        C66081 c66081;
        if (interfaceC30057d instanceof C66081) {
            c66081 = (C66081) interfaceC30057d;
            int i13 = c66081.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66081.label = i13 - Integer.MIN_VALUE;
            } else {
                c66081 = new C66081(interfaceC30057d);
            }
        } else {
            c66081 = new C66081(interfaceC30057d);
        }
        C66081 c66082 = c66081;
        Object objM108729b = c66082.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66082.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            C66092 c66092 = new C66092(str, num, null);
            c66082.L$0 = null;
            c66082.L$1 = null;
            c66082.label = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c66092, c66082, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        ReferralContentDtoV2 referralContentDtoV2 = (ReferralContentDtoV2) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        if (referralContentDtoV2 != null) {
            return referralContentDtoV2.toReferralContentV2();
        }
        return null;
    }
}
