package com.whoop.profile.presentation.memberlevels;

import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.repositories.AchievementsRepository;
import java.util.List;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;", "Landroidx/lifecycle/w1;", "Lcom/whoop/data/repositories/AchievementsRepository;", "achievementsRepository", "Lsr2/y;", "urlProvider", "<init>", "(Lcom/whoop/data/repositories/AchievementsRepository;Lsr2/y;)V", "", "levelId", "Ll83/a0;", "getMemberLevels", "(I)V", "Lcom/whoop/data/repositories/AchievementsRepository;", "Landroidx/lifecycle/u0;", "", "Lcom/whoop/domain/model/memberlevels/MemberLevelsListViewData;", "_memberLevelsLiveData", "Landroidx/lifecycle/u0;", "", "profileHelpUrl", "Ljava/lang/String;", "getProfileHelpUrl", "()Ljava/lang/String;", "Landroidx/lifecycle/p0;", "getMemberLevelsLiveData", "()Landroidx/lifecycle/p0;", "memberLevelsLiveData", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MemberLevelsViewModel extends AbstractC1637w1 {
    public static final int $stable = 8;
    private final C1630u0 _memberLevelsLiveData;
    private final AchievementsRepository achievementsRepository;
    private final String profileHelpUrl;

    /* JADX INFO: renamed from: com.whoop.profile.presentation.memberlevels.MemberLevelsViewModel$getMemberLevels$1 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.profile.presentation.memberlevels.MemberLevelsViewModel$getMemberLevels$1", m100430f = "MemberLevelsViewModel.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C97271 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $levelId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97271(int i13, InterfaceC30057d<? super C97271> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$levelId = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MemberLevelsViewModel.this.new C97271(this.$levelId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C97271) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AchievementsRepository achievementsRepository = MemberLevelsViewModel.this.achievementsRepository;
                int i14 = this.$levelId;
                this.label = 1;
                obj = achievementsRepository.getAllMemberLevels(i14, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            List list = (List) ((Resource) obj).getData();
            if (list != null) {
                MemberLevelsViewModel.this._memberLevelsLiveData.setValue(list);
            }
            return C23454a0.f92919a;
        }
    }

    public MemberLevelsViewModel(AchievementsRepository achievementsRepository, AbstractC32943y urlProvider) {
        AbstractC22676k.m65750j(achievementsRepository, "achievementsRepository");
        AbstractC22676k.m65750j(urlProvider, "urlProvider");
        this.achievementsRepository = achievementsRepository;
        this._memberLevelsLiveData = new C1630u0();
        this.profileHelpUrl = AbstractC2875y.m8299l(urlProvider.getApiBaseUrl(), "/url-mapping-service/v1/PROFILE_LEVELS");
    }

    public final void getMemberLevels(int levelId) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C97271(levelId, null), 3);
    }

    public final AbstractC1615p0 getMemberLevelsLiveData() {
        return this._memberLevelsLiveData;
    }

    public final String getProfileHelpUrl() {
        return this.profileHelpUrl;
    }
}
