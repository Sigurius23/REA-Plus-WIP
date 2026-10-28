package com.whoop.profile.p067di;

import ad3.AbstractC0757c;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.communitymoments.domain.models.MomentCardModel;
import com.whoop.data.repositories.AchievementsRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.profile.ProfileFeatureFlagsKt;
import com.whoop.profile.analytics.ProfileAnalyticsHelper;
import com.whoop.profile.domain.ProfileApi;
import com.whoop.profile.domain.ProfileInteractor;
import com.whoop.profile.domain.edit.EditProfileInteractor;
import com.whoop.profile.domain.models.components.ContextHubTileModel;
import com.whoop.profile.domain.models.components.ReferralsTileModel;
import com.whoop.profile.domain.models.components.StreakTileModel;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.presentation.ProfileViewModel;
import com.whoop.profile.presentation.edit.EditProfileViewModel;
import com.whoop.profile.presentation.edit.reducers.EditProfileViewStateReducer;
import com.whoop.profile.presentation.memberlevels.MemberLevelsViewModel;
import com.whoop.profile.presentation.reducers.ProfileViewStateReducer;
import com.whoop.profile.view.C9811g;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ji0.InterfaceC21718f;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import on2.C28049b;
import p02.C28589a;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pd1.C29104a;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pr2.InterfaceC29494b;
import q41.C29968a;
import q42.C29976a;
import qf3.C30330b;
import qw2.C30695c;
import rf3.C31362a;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/profile/di/ProfileModule;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "dependencies", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileModule implements InterfaceC26584j {
    public static final int $stable = 8;
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    private static final C23454a0 define$lambda$0(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", ProfileModuleKt.PROFILE_FEATURE_MODELS);
        C28589a c28589a = new C28589a(29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c28589a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, ProfileModuleKt.PROFILE_CONVERTER_FACTORY);
        C29976a c29976a = new C29976a(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C34643d.class);
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c29976a, 2);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c);
        C31362a c31362a = new C31362a(c30330b);
        c33768a.m106774b(strM60669Y, c31362a, false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(AbstractC29199m.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31362a.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), c31362a, true);
        C35953c c35953c2 = new C35953c(ProfileModuleKt.PROFILE_BFF_CACHE_DESERIALIZER);
        C29976a c29976a2 = new C29976a(4);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953c2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, c35953c2, c29976a2, 2)), false);
        C29976a c29976a3 = new C29976a(5);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(ProfileInteractor.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c29976a3, 2)), false);
        C29976a c29976a4 = new C29976a(6);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(ProfileViewStateReducer.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c29976a4, 2)), false);
        C29976a c29976a5 = new C29976a(7);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(ProfileActionRouter.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c29976a5, 2)), false);
        C28589a c28589a2 = new C28589a(25);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(ProfileAnalyticsHelper.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c28589a2, 2)), false);
        C28589a c28589a3 = new C28589a(26);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(ProfileApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c28589a3, 2)), false);
        C28589a c28589a4 = new C28589a(27);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(EditProfileInteractor.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c28589a4, 2)), false);
        C28589a c28589a5 = new C28589a(28);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(EditProfileViewStateReducer.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c28589a5, 2)), false);
        C29976a c29976a6 = new C29976a(0);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(ProfileViewModel.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c29976a6, 2)), false);
        C29976a c29976a7 = new C29976a(1);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(EditProfileViewModel.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c29976a7, 2)), false);
        C29976a c29976a8 = new C29976a(2);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(MemberLevelsViewModel.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass13, null, c29976a8, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map define$lambda$0$0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("STREAK_TILE", c22673i0.getOrCreateKotlinClass(StreakTileModel.class)), new C23465k("REFERRALS_TILE", c22673i0.getOrCreateKotlinClass(ReferralsTileModel.class)), new C23465k("CONTEXT_HUB_TILE", c22673i0.getOrCreateKotlinClass(ContextHubTileModel.class)), new C23465k("MOMENT_CARD", c22673i0.getOrCreateKotlinClass(MomentCardModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34643d define$lambda$0$1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", ProfileModuleKt.PROFILE_FEATURE_MODELS);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), map, null, 2, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null);
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        return c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S(ProfileFeatureFlagsKt.KT_SERIALIZATION_PROFILE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewModel define$lambda$0$10(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ProfileViewModel((ProfileInteractor) viewModel.m122602a(new C9811g((Integer) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Integer.class)), (Integer) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(Integer.class)), 1), c22673i0.getOrCreateKotlinClass(ProfileInteractor.class), null), (ProfileViewStateReducer) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(ProfileViewStateReducer.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a define$lambda$0$10$0(Integer num, Integer num2) {
        return AbstractC15751g.m44431K(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileViewModel define$lambda$0$11(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new EditProfileViewModel((EditProfileInteractor) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(EditProfileInteractor.class), null), (EditProfileViewStateReducer) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(EditProfileViewStateReducer.class), null), (ProfileAnalyticsHelper) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(ProfileAnalyticsHelper.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberLevelsViewModel define$lambda$0$12(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new MemberLevelsViewModel((AchievementsRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AchievementsRepository.class), null), (AbstractC32943y) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC34640a define$lambda$0$2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", ProfileModuleKt.PROFILE_FEATURE_MODELS);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null);
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), map, null, 2, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return new C34642c(abstractC0757cM20380e, gsonCreate, (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S(ProfileFeatureFlagsKt.KT_SERIALIZATION_PROFILE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileInteractor define$lambda$0$3(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Integer num = (Integer) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Integer.class));
        Integer num2 = (Integer) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(Integer.class));
        return new ProfileInteractor((InterfaceC26834e) factory.m122602a(new C28049b(factory, 4), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (ProfileAnalyticsHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ProfileAnalyticsHelper.class), null), (InterfaceC21718f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), InterfaceC34116n.INSTANCE.m107848a("ProfileInteractor"), AbstractC6728b.m20380e(factory, (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c(ProfileModuleKt.PROFILE_FEATURE_MODELS)), null, null, null, null, 30, null), num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a define$lambda$0$3$0(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c(ProfileModuleKt.PROFILE_BFF_CACHE_DESERIALIZER))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ProfileViewStateReducer define$lambda$0$4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new ProfileViewStateReducer(null, InterfaceC34116n.INSTANCE.m107848a("ProfileViewStateReducer"), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileActionRouter define$lambda$0$5(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ProfileActionRouter((ProfileAnalyticsHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ProfileAnalyticsHelper.class), null), AbstractC6728b.m20380e(factory, (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c(ProfileModuleKt.PROFILE_FEATURE_MODELS)), null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileAnalyticsHelper define$lambda$0$6(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new ProfileAnalyticsHelper((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileApi define$lambda$0$7(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C29968a(1), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(ProfileApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (ProfileApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a define$lambda$0$7$0() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(ProfileFeatureFlagsKt.KT_SERIALIZATION_PROFILE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileInteractor define$lambda$0$8(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new EditProfileInteractor((C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), InterfaceC34116n.INSTANCE.m107848a("EditProfileInteractor"), (InterfaceC29494b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC29494b.class), null), (C29104a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29104a.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditProfileViewStateReducer define$lambda$0$9(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new EditProfileViewStateReducer((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        define$lambda$0(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
