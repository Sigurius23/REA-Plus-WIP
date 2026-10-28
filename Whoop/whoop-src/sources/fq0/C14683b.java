package fq0;

import ad3.AbstractC0757c;
import al0.C0971f;
import android.content.Context;
import ao1.C1872g;
import bc3.InterfaceC2994c0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.community.data.network.ChatApi;
import com.whoop.community.data.network.CommunityServiceApi;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.room.dao.wipeable.FeatureTeamDao;
import com.whoop.data.local.room.dao.wipeable.MemberStoryDao;
import com.whoop.data.local.room.dao.wipeable.TeamInviteDao;
import com.whoop.data.local.room.dao.wipeable.TeamsDao;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.AppExecutors;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.service.network.CommunityApi;
import com.whoop.service.network.UsersApi;
import com.whoop.widget.api.WidgetApi;
import cq0.C11053a;
import cq0.C11059g;
import cq0.C11060h;
import dq0.C12286d;
import dq0.InterfaceC12284b;
import ep0.C13395a;
import f91.C14284b;
import ge3.AbstractC15751g;
import gq0.C16080a;
import hj0.C17345d;
import i92.InterfaceC18260e;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.p226ui.viewmodel.messages.ChannelViewModelFactory;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageComposerViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import iq0.C20820b0;
import iq0.C20834m;
import j02.InterfaceC21142g;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import le1.C23876c;
import m83.AbstractC25260n;
import mq0.C25884i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import nq0.C27046i;
import nq0.C27055r;
import od1.C27858u;
import od1.InterfaceC27837a0;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29224y0;
import qe1.C30306d;
import qf3.C30330b;
import qv1.C30653d;
import qv1.C30655f;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import sx1.C33067c;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.C34642c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import wm0.C37378a;
import xf3.C38266c;
import y92.C39352a;
import yp0.InterfaceC39700a;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: fq0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lfq0/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14683b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f54249c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m41996A(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C20820b0 m41997B(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C20820b0((ChatClient) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(ChatClient.class), null), (C11053a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11053a.class), null), InterfaceC34116n.INSTANCE.m107848a("NotificationSettingsViewModel"), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C11060h m41998C(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11060h((WidgetApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WidgetApi.class), null), InterfaceC34116n.INSTANCE.m107848a("WidgetRepository"), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C12286d m41999D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1872g c1872g = new C1872g(factory, 3);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("StreamSessionLifecycleHandler");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12286d(c1872g, interfaceC34116nM107848a, (InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final InterfaceC12284b m42000E(C38266c c38266c) {
        return (InterfaceC12284b) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12284b.class), new C35953c("streamClient"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C27055r m42001F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27055r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C16080a m42002G(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C1872g c1872g = new C1872g(single, 2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16080a((FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC26834e) single.m122602a(c1872g, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C37378a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (C17345d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC39700a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39700a.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m42003H(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("community-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC21142g m42004I(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC21142g) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16080a.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C11059g m42005J(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC18732d interfaceC18732d = (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null);
        AppExecutors appExecutors = (AppExecutors) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AppExecutors.class), null);
        return new C11059g(interfaceC18732d, (CommunityApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(CommunityApi.class), null), (CommunityServiceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(CommunityServiceApi.class), null), (UsersApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(UsersApi.class), null), (ChatApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ChatApi.class), null), appExecutors, (TeamsDao) single.m122602a(null, c22673i0.getOrCreateKotlinClass(TeamsDao.class), null), (RemoteDataSource) single.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDataSource.class), null), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), InterfaceC34116n.INSTANCE.m107848a("TeamsRepository"), (TeamInviteDao) single.m122602a(null, c22673i0.getOrCreateKotlinClass(TeamInviteDao.class), null), (FeatureTeamDao) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureTeamDao.class), null), (MemberStoryDao) single.m122602a(null, c22673i0.getOrCreateKotlinClass(MemberStoryDao.class), null), (PreferenceHelper) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C11053a m42006K(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11053a((ChatApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ChatApi.class), null), InterfaceC34116n.INSTANCE.m107848a("ChatRepository"), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final ChannelViewModelFactory m42007L(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return new ChannelViewModelFactory(AbstractC29125c.m88532i(factory), (String) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class)), null, null, null, null, null, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097148, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final MessageListViewModel m42008M(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return (MessageListViewModel) ((ChannelViewModelFactory) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChannelViewModelFactory.class))).create(MessageListViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final MessageComposerViewModel m42009N(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return (MessageComposerViewModel) ((ChannelViewModelFactory) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChannelViewModelFactory.class))).create(MessageComposerViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C20834m m42010O(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("streamClient");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C20834m((InterfaceC12284b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12284b.class), c35953c), (C11053a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11053a.class), null), (C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), InterfaceC34116n.INSTANCE.m107848a("CommunityChatViewModel"), (PreferenceHelper) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (C39352a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, null, 768, null);
    }

    /* JADX INFO: renamed from: u */
    private static final C23454a0 m42031u(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "community-bff-cache-deserializer");
        C14284b c14284b = new C14284b(26);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c14284b, 2)), false);
        C14682a c14682a = new C14682a(9);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(CommunityServiceApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c14682a, 2)), false);
        C14682a c14682a2 = new C14682a(10);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C16080a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, c14682a2, 1)), false);
        C14682a c14682a3 = new C14682a(11);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC21142g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, null, c14682a3, 1)), false);
        C14284b c14284b2 = new C14284b(27);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C11059g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c14284b2, 1)), false);
        C14284b c14284b3 = new C14284b(28);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C11053a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c14284b3, 1)), false);
        C14284b c14284b4 = new C14284b(29);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(ChannelViewModelFactory.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c14284b4, 2)), false);
        C14682a c14682a4 = new C14682a(0);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(MessageListViewModel.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c14682a4, 2)), false);
        C14682a c14682a5 = new C14682a(1);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(MessageComposerViewModel.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c14682a5, 2)), false);
        C14682a c14682a6 = new C14682a(2);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C20834m.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c14682a6, 2)), false);
        C14682a c14682a7 = new C14682a(3);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C27046i.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c14682a7, 2)), false);
        C14682a c14682a8 = new C14682a(4);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C25884i.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c14682a8, 2)), false);
        C14682a c14682a9 = new C14682a(5);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C20820b0.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c14682a9, 2)), false);
        C14682a c14682a10 = new C14682a(6);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C11060h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass14, null, c14682a10, 1)), false);
        C14682a c14682a11 = new C14682a(7);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C12286d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c14682a11, 2)), false);
        C14682a c14682a12 = new C14682a(8);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C27055r.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass16, null, c14682a12, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC34640a m42032v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null);
        Gson gsonCreate = AbstractC6730d.m20388f(new GsonBuilder(), null, null, 3, null).create();
        AbstractC22676k.m65749i(gsonCreate, "create(...)");
        return new C34642c(abstractC0757cM20380e, gsonCreate, (FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-community"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final CommunityServiceApi m42033w(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C13395a(8), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableLegacyDefaultRetrofit"))).m88733b(CommunityServiceApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (CommunityServiceApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C34911a m42034x() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S("kt-serialization-community"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C27046i m42035y(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27046i((C11059g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), InterfaceC34116n.INSTANCE.m107848a("CommunityLandingViewModel"), (C23876c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C23876c.class), null), (C30306d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30306d.class), null), (C30653d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30653d.class), null), (C30655f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30655f.class), null), null, (LanguageRepository) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), (C33067c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33067c.class), null), (InterfaceC40205a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C25884i m42036z(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Context context = (Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class));
        return new C25884i((InterfaceC18260e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C11053a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11053a.class), null), (C27858u) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (StringsRepository) viewModel.m122602a(new C0971f(context, 4), c22673i0.getOrCreateKotlinClass(StringsRepository.class), new C35953c("stringRepo")), null, 16, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m42031u(c33768a);
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
