package com.whoop.community;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.gson.Gson;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.C10593k;
import com.whoop.p069ui.ScoreContext;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13512p0;
import hj0.AbstractC17354m;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import nq0.EnumC27048k;
import or2.AbstractC28163g0;
import or2.C28198s;
import p000.AbstractC11266d;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p190hc.AbstractC17145h;
import p313lz.DialogInterfaceOnClickListenerC24814k;
import p314m.C24844i;
import p377or.C28134h;
import p465rm.C31559p;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rq0.C31671h1;
import rq0.C31674i1;
import rq0.C31696t0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import vu1.AbstractC36518i;
import vv1.C36532c;
import wb3.AbstractC37056f;
import xl0.C38448b;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.C38506e;
import xp0.C38508f;
import xp0.C38519p;
import z82.C40191e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 r2\u00020\u0001:\u0001sB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J'\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u000eH\u0002¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002012\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u0004\u0018\u00010'2\u0006\u00108\u001a\u000201H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010\u0003R\u001a\u0010@\u001a\u0002018\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010J\u001a\b\u0012\u0004\u0012\u0002010G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u0002010K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR+\u0010c\u001a\u00020[2\u0006\u0010\\\u001a\u00020[8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010eR\u001a\u0010n\u001a\u00020\u00158\u0014X\u0094D¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001b\u0010\u001c\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bp\u0010q¨\u0006t"}, m65681d2 = {"Lcom/whoop/community/CommunityFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "q0", "", "teamId", "", "isOnline", "Lcom/whoop/domain/model/teams/TeamType;", "teamType", "F0", "(IZLcom/whoop/domain/model/teams/TeamType;)V", "Lcom/whoop/domain/model/teams/Team;", "team", "w0", "(Lcom/whoop/domain/model/teams/Team;)V", "D0", "loadingTeam", "t0", "p0", "o0", "id", "s0", "(I)V", "Lnq0/k;", "communityMenuSettings", "y0", "(Lnq0/k;Lcom/whoop/domain/model/teams/Team;)V", "u0", "g0", "e0", "v0", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "", "m0", "(Lcom/whoop/community/domain/model/teams/TimePeriod;)Ljava/lang/String;", "Lcom/whoop/ui/ScoreContext;", "pillarType", "k0", "(Lcom/whoop/ui/ScoreContext;)Ljava/lang/String;", "selectedMenu", "j0", "(Ljava/lang/String;)Lnq0/k;", "c0", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lrq0/h1;", "x", "Ll83/h;", "n0", "()Lrq0/h1;", "viewModel", "Landroid/widget/ArrayAdapter;", "y", "Landroid/widget/ArrayAdapter;", "teamSpinnerAdapter", "", "z", "[Ljava/lang/String;", "teamSpinnerValues", "Lxp0/f;", "E", "Leb/i;", "h0", "()Lxp0/f;", "args", "F", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Leq0/p0;", "<set-?>", "H", "Lcom/whoop/ui/b;", "i0", "()Leq0/p0;", "C0", "(Leq0/p0;)V", "dataBinding", "Landroid/view/inputmethod/InputMethodManager;", "I", "Landroid/view/inputmethod/InputMethodManager;", "inputManager", "J", "originalToolbarPaddingTop", "K", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "L", "l0", "()Lcom/whoop/domain/model/teams/Team;", "M", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private TimePeriod timePeriod;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C10462b dataBinding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private InputMethodManager inputManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int originalToolbarPaddingTop;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h team;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "CommunityFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6269i(this, null, new C6268h(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private ArrayAdapter<String> teamSpinnerAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private String[] teamSpinnerValues;

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f24749N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CommunityFragment.class, "dataBinding", "getDataBinding()Lcom/whoop/community/databinding/FragmentCommunityBinding;", 0))};

    /* JADX INFO: renamed from: O */
    public static final int f24750O = 8;

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6262b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24763a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24764b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f24765c;

        static {
            int[] iArr = new int[EnumC27048k.values().length];
            try {
                iArr[EnumC27048k.ADD_MEMBERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27048k.LEAVE_TEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27048k.MANAGE_TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC27048k.MUTE_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24763a = iArr;
            int[] iArr2 = new int[TimePeriod.values().length];
            try {
                iArr2[TimePeriod.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TimePeriod.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f24764b = iArr2;
            int[] iArr3 = new int[ScoreContext.values().length];
            try {
                iArr3[ScoreContext.RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ScoreContext.SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ScoreContext.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f24765c = iArr3;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityFragment$doLeaveTeam$1", m100430f = "CommunityFragment.kt", m100431l = {323}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6263c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24766w;

        public C6263c(InterfaceC30057d<? super C6263c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityFragment.this.new C6263c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6263c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String name;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24766w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31671h1 c31671h1M18881n0 = CommunityFragment.this.m18881n0();
                this.f24766w = 1;
                obj = c31671h1M18881n0.m98040l0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                AbstractActivityC1340r0 activity = CommunityFragment.this.getActivity();
                if (activity != null) {
                    Resources resources = CommunityFragment.this.getResources();
                    int i14 = AbstractC38505d0.f165687l1;
                    Team teamM98033c0 = CommunityFragment.this.m18881n0().m98033c0();
                    if (teamM98033c0 == null || (name = teamM98033c0.getName()) == null) {
                        name = "";
                    }
                    String string = resources.getString(i14, name);
                    AbstractC22676k.m65749i(string, "getString(...)");
                    AbstractC18737i.m54479d(activity, string);
                }
                AbstractC5583n.m16799z(CommunityFragment.this).m36410z();
            } else {
                AbstractActivityC1340r0 activity2 = CommunityFragment.this.getActivity();
                if (activity2 != null) {
                    AbstractC18737i.m54478c(activity2, AbstractC38505d0.f165691m1);
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityFragment$initTeamMenu$1", m100430f = "CommunityFragment.kt", m100431l = {249}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6264d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Team f24768E;

        /* JADX INFO: renamed from: w */
        Object f24769w;

        /* JADX INFO: renamed from: x */
        int f24770x;

        /* JADX INFO: renamed from: y */
        int f24771y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6264d(Team team, InterfaceC30057d<? super C6264d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24768E = team;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m18895h(CommunityFragment communityFragment, Team team, int i13) {
            communityFragment.m18872e0();
            String[] strArr = communityFragment.teamSpinnerValues;
            if (strArr != null) {
                communityFragment.m18892y0(communityFragment.m18877j0(strArr[i13]), team);
                return C23454a0.f92919a;
            }
            AbstractC22676k.m65757q("teamSpinnerValues");
            throw null;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityFragment.this.new C6264d(this.f24768E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6264d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            CommunityFragment communityFragment;
            int i13;
            String[] strArr;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f24771y;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                communityFragment = CommunityFragment.this;
                int adminId = this.f24768E.getAdminId();
                C31671h1 c31671h1M18881n0 = CommunityFragment.this.m18881n0();
                this.f24769w = communityFragment;
                this.f24770x = adminId;
                this.f24771y = 1;
                Object objM98024F0 = c31671h1M18881n0.m98024F0(this);
                if (objM98024F0 == enumC31071a) {
                    return enumC31071a;
                }
                i13 = adminId;
                obj = objM98024F0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f24770x;
                communityFragment = (CommunityFragment) this.f24769w;
                AbstractC34132o.m107864I(obj);
            }
            if (i13 == ((Number) obj).intValue()) {
                String string = CommunityFragment.this.getString(AbstractC38505d0.f165636Y0);
                AbstractC22676k.m65749i(string, "getString(...)");
                String string2 = CommunityFragment.this.getString(AbstractC38505d0.f165595K1);
                AbstractC22676k.m65749i(string2, "getString(...)");
                String string3 = CommunityFragment.this.getString(AbstractC38505d0.f165664f2);
                AbstractC22676k.m65749i(string3, "getString(...)");
                strArr = new String[]{string, string2, string3};
            } else {
                String string4 = CommunityFragment.this.getString(AbstractC38505d0.f165636Y0);
                AbstractC22676k.m65749i(string4, "getString(...)");
                String string5 = CommunityFragment.this.getString(AbstractC38505d0.f165595K1);
                AbstractC22676k.m65749i(string5, "getString(...)");
                String string6 = CommunityFragment.this.getString(AbstractC38505d0.f165639Z0);
                AbstractC22676k.m65749i(string6, "getString(...)");
                strArr = new String[]{string4, string5, string6};
            }
            communityFragment.teamSpinnerValues = strArr;
            CommunityFragment communityFragment2 = CommunityFragment.this;
            Context contextRequireContext = CommunityFragment.this.requireContext();
            AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
            int i15 = AbstractC38501b0.f165544t0;
            int i16 = AbstractC38501b0.f165546u0;
            int i17 = AbstractC38499a0.f165255b7;
            String[] strArr2 = CommunityFragment.this.teamSpinnerValues;
            if (strArr2 == null) {
                AbstractC22676k.m65757q("teamSpinnerValues");
                throw null;
            }
            final CommunityFragment communityFragment3 = CommunityFragment.this;
            final Team team = this.f24768E;
            communityFragment2.teamSpinnerAdapter = new C10593k(contextRequireContext, R.layout.simple_spinner_item, i15, i16, i17, strArr2, new Function1() { // from class: com.whoop.community.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CommunityFragment.C6264d.m18895h(communityFragment3, team, ((Integer) obj2).intValue());
                }
            });
            Spinner spinner = CommunityFragment.this.m18876i0().f47530g;
            ArrayAdapter arrayAdapter = CommunityFragment.this.teamSpinnerAdapter;
            if (arrayAdapter != null) {
                spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                return C23454a0.f92919a;
            }
            AbstractC22676k.m65757q("teamSpinnerAdapter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$e */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/community/CommunityFragment$e", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6265e extends AbstractC14917t {
        public C6265e() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(CommunityFragment.this);
            if (abstractC12939a0M16799z.m36375A(AbstractC38499a0.f165077H0, false)) {
                return;
            }
            abstractC12939a0M16799z.m36410z();
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/CommunityFragment$f", "Lhc/h;", "", "p0", "Ll83/a0;", "onPageSelected", "(I)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6266f extends AbstractC17145h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List<ScoreContext> f24774a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Team f24775b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CommunityFragment f24776c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC13512p0 f24777d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C38519p f24778e;

        /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24779a;

            static {
                int[] iArr = new int[ScoreContext.values().length];
                try {
                    iArr[ScoreContext.RECOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScoreContext.SLEEP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f24779a = iArr;
            }
        }

        public C6266f(List<ScoreContext> list, Team team, CommunityFragment communityFragment, AbstractC13512p0 abstractC13512p0, C38519p c38519p) {
            this.f24774a = list;
            this.f24775b = team;
            this.f24776c = communityFragment;
            this.f24777d = abstractC13512p0;
            this.f24778e = c38519p;
        }

        @Override // p190hc.AbstractC17145h
        public void onPageSelected(int p13) {
            int color;
            Team teamMo97831b;
            Map<ScoreContext, LeadersEntry> mapM98096d;
            LeadersEntry leadersEntry;
            Double recoveryScore;
            super.onPageSelected(p13);
            int i13 = a.f24779a[this.f24774a.get(p13).ordinal()];
            if (i13 != 1) {
                color = i13 != 2 ? AbstractC32122c.getColor(this.f24776c.requireContext(), AbstractC36510a.f156020b) : AbstractC32122c.getColor(this.f24776c.requireContext(), AbstractC36510a.f156026e);
            } else {
                C31674i1 c31674i1 = (C31674i1) this.f24776c.m18881n0().m98039j0().getValue();
                if (c31674i1 == null || (teamMo97831b = c31674i1.getTeam()) == null || this.f24775b.getId() != teamMo97831b.getId()) {
                    color = AbstractC32122c.getColor(this.f24776c.requireContext(), AbstractC36510a.f156006O);
                } else {
                    C31674i1 c31674i2 = (C31674i1) this.f24776c.m18881n0().m98039j0().getValue();
                    if (c31674i2 == null || (mapM98096d = c31674i2.m98096d()) == null || (leadersEntry = mapM98096d.get(ScoreContext.RECOVERY)) == null || (recoveryScore = leadersEntry.getRecoveryScore()) == null) {
                        color = AbstractC32122c.getColor(this.f24776c.requireContext(), AbstractC36510a.f156042u);
                    } else {
                        CommunityFragment communityFragment = this.f24776c;
                        double dDoubleValue = recoveryScore.doubleValue();
                        if (dDoubleValue <= 33.0d) {
                            color = AbstractC32122c.getColor(communityFragment.requireContext(), AbstractC36510a.f156040s);
                        } else {
                            color = dDoubleValue <= 66.0d ? AbstractC32122c.getColor(communityFragment.requireContext(), AbstractC36510a.f156025d0) : AbstractC32122c.getColor(communityFragment.requireContext(), AbstractC36510a.f156036o);
                        }
                    }
                }
            }
            this.f24777d.f47526c.setSelectedTabIndicatorColor(color);
            if (p13 > 0 && this.f24778e.m123417d().size() > p13 && (this.f24778e.m123417d().get(p13) instanceof C31696t0)) {
                AbstractC17354m abstractC17354m = this.f24778e.m123417d().get(p13);
                AbstractC22676k.m65748h(abstractC17354m, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamsBoardFragment");
                ((C31696t0) abstractC17354m).m98265D0();
            }
            this.f24776c.m18887t0(this.f24775b);
            InputMethodManager inputMethodManager = this.f24776c.inputManager;
            if (inputMethodManager == null) {
                AbstractC22676k.m65757q("inputManager");
                throw null;
            }
            inputMethodManager.hideSoftInputFromWindow(this.f24776c.m18876i0().getRoot().getWindowToken(), 0);
            try {
                if (AbstractC22676k.m65745e(this.f24776c.m18878k0(this.f24774a.get(p13)), "Chat")) {
                    this.f24776c.getEventDispatcher().m129060u(String.valueOf(this.f24775b.getId()));
                    return;
                }
                C40191e eventDispatcher = this.f24776c.getEventDispatcher();
                String strM18878k0 = this.f24776c.m18878k0(this.f24774a.get(p13));
                CommunityFragment communityFragment2 = this.f24776c;
                TimePeriod timePeriod = communityFragment2.timePeriod;
                if (timePeriod != null) {
                    eventDispatcher.m129005O(strM18878k0, communityFragment2.m18880m0(timePeriod), String.valueOf(this.f24775b.getId()));
                } else {
                    AbstractC22676k.m65757q("timePeriod");
                    throw null;
                }
            } catch (IndexOutOfBoundsException e5) {
                this.f24776c.getLog().mo85222m(AbstractC11266d.m30461o("Selected position out of bounds for team - no event sent: ", e5.getLocalizedMessage()), new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6267g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24780w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6267g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24780w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f24780w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f24780w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6268h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24781w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6268h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24781w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f24781w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f24781w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6269i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24782w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24783x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24784y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24785z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6269i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24782w = abstractComponentCallbacksC1320m0;
            this.f24783x = interfaceC35951a;
            this.f24784y = interfaceC4339a;
            this.f24785z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.h1] */
        @Override // c93.InterfaceC4339a
        public final C31671h1 invoke() {
            return AbstractC37056f.m118952D(this.f24782w, this.f24783x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31671h1.class), this.f24784y, this.f24785z);
        }
    }

    public CommunityFragment() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.args = new C12962i(c22673i0.getOrCreateKotlinClass(C38508f.class), new C6267g(this));
        this.featureFlagChecker = (FeatureFlagChecker) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        this.dataBinding = AbstractC10463c.m26725b(this, new C38448b(1));
        this.team = AbstractC30060g.m92088H(new C36532c(this, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m18840A0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m18841B0(CommunityFragment communityFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityFragment.requireActivity().getOnBackPressedDispatcher().m43018d();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m18842C0(AbstractC13512p0 abstractC13512p0) {
        this.dataBinding.setValue(this, f24749N[0], abstractC13512p0);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m18843D0() {
        Window window = requireActivity().getWindow();
        window.setStatusBarColor(0);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(AbstractC32122c.getColor(requireContext(), AbstractC36510a.f156016Y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Team m18845E0(CommunityFragment communityFragment) {
        Team teamM123406f = communityFragment.m18875h0().m123406f();
        if (teamM123406f != null) {
            return teamM123406f;
        }
        String strM123407g = communityFragment.m18875h0().m123407g();
        if (strM123407g == null || strM123407g.length() == 0) {
            throw new IllegalStateException("CommunityFragment requires a team; args.team and args.teamString were both missing");
        }
        return (Team) new Gson().fromJson(strM123407g, Team.class);
    }

    /* JADX INFO: renamed from: F0 */
    private final void m18847F0(int teamId, boolean isOnline, TeamType teamType) {
        if (teamType == TeamType.COMMUNITY) {
            m18881n0().m98023E0(teamId, isOnline);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final void m18870c0() {
        View root = m18876i0().getRoot();
        C31559p c31559p = new C31559p(this, 16);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c31559p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C16905q1 m18871d0(CommunityFragment communityFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        ConstraintLayout teamToolbar = communityFragment.m18876i0().f47527d;
        AbstractC22676k.m65749i(teamToolbar, "teamToolbar");
        teamToolbar.setPadding(teamToolbar.getPaddingLeft(), c35643bMo47530g.f151450b + communityFragment.originalToolbarPaddingTop, teamToolbar.getPaddingRight(), teamToolbar.getPaddingBottom());
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final void m18872e0() {
        AbstractC13512p0 abstractC13512p0M18876i0 = m18876i0();
        ViewParent parent = abstractC13512p0M18876i0.f47530g.getParent();
        AbstractC22676k.m65749i(parent, "getParent(...)");
        ViewGroup.LayoutParams layoutParams = abstractC13512p0M18876i0.f47530g.getLayoutParams();
        AbstractC22676k.m65749i(layoutParams, "getLayoutParams(...)");
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(abstractC13512p0M18876i0.f47530g);
        viewGroup.addView(abstractC13512p0M18876i0.f47530g);
        abstractC13512p0M18876i0.f47530g.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m18873f0(AbstractC13512p0 it) {
        AbstractC22676k.m65750j(it, "it");
        it.f47525b.setAdapter(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m18874g0() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6263c(null), 3);
    }

    /* JADX INFO: renamed from: h0 */
    private final C38508f m18875h0() {
        return (C38508f) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final AbstractC13512p0 m18876i0() {
        return (AbstractC13512p0) this.dataBinding.getValue(this, f24749N[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public final EnumC27048k m18877j0(String selectedMenu) {
        if (AbstractC22676k.m65745e(selectedMenu, getString(AbstractC38505d0.f165636Y0))) {
            return EnumC27048k.ADD_MEMBERS;
        }
        if (AbstractC22676k.m65745e(selectedMenu, getString(AbstractC38505d0.f165595K1))) {
            return EnumC27048k.MUTE_NOTIFICATION;
        }
        if (AbstractC22676k.m65745e(selectedMenu, getString(AbstractC38505d0.f165664f2))) {
            return EnumC27048k.MANAGE_TEAM;
        }
        if (AbstractC22676k.m65745e(selectedMenu, getString(AbstractC38505d0.f165639Z0))) {
            return EnumC27048k.LEAVE_TEAM;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final String m18878k0(ScoreContext pillarType) {
        int i13 = C6262b.f24765c[pillarType.ordinal()];
        if (i13 == 1) {
            return "Recovery";
        }
        if (i13 != 2) {
            return i13 != 3 ? "Day Strain" : "Chat";
        }
        return "Sleep Performance";
    }

    /* JADX INFO: renamed from: l0 */
    private final Team m18879l0() {
        Object value = this.team.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (Team) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final String m18880m0(TimePeriod timePeriod) {
        int i13 = C6262b.f24764b[timePeriod.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? "Daily" : "Monthly";
        }
        return "Weekly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final C31671h1 m18881n0() {
        return (C31671h1) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final void m18882o0() {
        m18876i0().f47530g.setVisibility(8);
        m18876i0().f47529f.setVisibility(8);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m18883p0(Team loadingTeam) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C6264d(loadingTeam, null), 3);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m18884q0() {
        String strM123408h = m18875h0().m123408h();
        AbstractC22676k.m65749i(strM123408h, "getTimePeriod(...)");
        this.timePeriod = TimePeriod.valueOf(strM123408h);
        observe(m18881n0().m98042n0(m18879l0()), new C6312d(new C38506e(this, 1)));
        if (m18875h0().m123402b() == 0) {
            m18887t0(m18879l0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m18885r0(CommunityFragment communityFragment, Team team) {
        AbstractC22676k.m65747g(team);
        communityFragment.m18890w0(team);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m18886s0(int id4) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6311c.b bVarM19198b = AbstractC6311c.m19198b(id4);
        AbstractC22676k.m65749i(bVarM19198b, "actionCommunityFragmentT…tyManageTeamFragment(...)");
        c28198sM85259o.m85340f(bVarM19198b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final void m18887t0(Team loadingTeam) {
        if (loadingTeam.getTeamType() == TeamType.ELITE) {
            m18882o0();
        } else {
            m18883p0(loadingTeam);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m18888u0(Team team) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6311c.c cVarM19199c = AbstractC6311c.m19199c(team);
        AbstractC22676k.m65749i(cVarM19199c, "actionCommunityFragmentT…tionSettingsFragment(...)");
        c28198sM85259o.m85340f(cVarM19199c);
    }

    /* JADX INFO: renamed from: v0 */
    private final void m18889v0(Team team) {
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6311c.a aVarM19197a = AbstractC6311c.m19197a(team);
        AbstractC22676k.m65749i(aVarM19197a, "actionCommunityFragmentT…ityAddMemberFragment(...)");
        c28198sM85259o.m85340f(aVarM19197a);
    }

    /* JADX INFO: renamed from: w0 */
    private final void m18890w0(Team team) {
        TimePeriod timePeriod = this.timePeriod;
        if (timePeriod == null) {
            AbstractC22676k.m65757q("timePeriod");
            throw null;
        }
        C38519p c38519p = new C38519p(this, team, timePeriod, m18875h0().m123403c(), m18875h0().m123401a(), m18875h0().m123409i());
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        c38519p.m123419f(contextRequireContext);
        List<ScoreContext> enabledTabs = team.getEnabledTabs();
        ArrayList arrayList = new ArrayList();
        AbstractC25265s.m74087A1(enabledTabs, arrayList);
        if (team.getChatChannel() != null) {
            arrayList.add(1, ScoreContext.CHAT);
        }
        AbstractC13512p0 abstractC13512p0M18876i0 = m18876i0();
        abstractC13512p0M18876i0.f47525b.setAdapter(c38519p);
        new C3936c(abstractC13512p0M18876i0.f47526c, abstractC13512p0M18876i0.f47525b, new C31559p(c38519p, 17)).m11985b();
        abstractC13512p0M18876i0.f47525b.m5508b(new C6266f(arrayList, team, this, abstractC13512p0M18876i0, c38519p));
        abstractC13512p0M18876i0.f47525b.setCurrentItem(m18875h0().m123402b());
        abstractC13512p0M18876i0.f47525b.setOffscreenPageLimit(c38519p.getPageCount());
        abstractC13512p0M18876i0.f47531h.setText(team.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m18891x0(C38519p c38519p, C28134h tab, int i13) {
        AbstractC22676k.m65750j(tab, "tab");
        tab.m85123a(c38519p.m123418e(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m18892y0(EnumC27048k communityMenuSettings, Team team) {
        Team teamM98033c0;
        int i13 = communityMenuSettings == null ? -1 : C6262b.f24763a[communityMenuSettings.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                if (getActivity() == null || (teamM98033c0 = m18881n0().m98033c0()) == null) {
                    return;
                }
                m18889v0(teamM98033c0);
                return;
            }
            if (i13 != 2) {
                if (i13 == 3) {
                    m18886s0(team.getId());
                    return;
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m18888u0(team);
                    return;
                }
            }
            AbstractActivityC1340r0 activity = getActivity();
            if (activity != null) {
                C24844i c24844i = new C24844i(activity, AbstractC36518i.f156128b);
                c24844i.m72849b(AbstractC38505d0.f165594K0);
                c24844i.m72848a(AbstractC38505d0.f165591J0);
                c24844i.setPositiveButton(AbstractC38505d0.f165713s, new DialogInterfaceOnClickListenerC24814k(this, 2)).setNegativeButton(AbstractC38505d0.f165709r, new DialogInterfaceOnClickListenerC19904c(6)).create().show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m18893z0(CommunityFragment communityFragment, DialogInterface dialogInterface, int i13) {
        communityFragment.m18874g0();
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13512p0 abstractC13512p0M38231c = AbstractC13512p0.m38231c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13512p0M38231c, "inflate(...)");
        m18842C0(abstractC13512p0M38231c);
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, new C6265e());
        View root = m18876i0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        m18847F0(m18879l0().getId(), false, m18879l0().getTeamType());
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.originalToolbarPaddingTop = m18876i0().f47527d.getPaddingTop();
        m18870c0();
        m18876i0().f47525b.setSaveEnabled(!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.COMMUNITY_TEAMS_CRASH));
        String strM123404d = m18875h0().m123404d();
        if (strM123404d != null) {
            m18881n0().m49139u(strM123404d);
        }
        Object systemService = requireContext().getSystemService((Class<Object>) InputMethodManager.class);
        AbstractC22676k.m65749i(systemService, "getSystemService(...)");
        this.inputManager = (InputMethodManager) systemService;
        m18881n0().m98044p0();
        m18847F0(m18879l0().getId(), true, m18879l0().getTeamType());
        m18843D0();
        ImageView teamToolbarBack = m18876i0().f47528e;
        AbstractC22676k.m65749i(teamToolbarBack, "teamToolbarBack");
        AbstractC1953c.m5963a(teamToolbarBack, new C38506e(this, 0));
        m18884q0();
    }
}
