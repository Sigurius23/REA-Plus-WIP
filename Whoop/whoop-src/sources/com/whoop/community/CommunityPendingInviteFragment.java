package com.whoop.community;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.remote.commons.Resource;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.p069ui.C10593k;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import de.hdodenhof.circleimageview.CircleImageView;
import e93.AbstractC12889b;
import eq0.AbstractC13551x0;
import hj0.AbstractC17354m;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nq0.C27046i;
import nq0.C27049l;
import or2.AbstractC28163g0;
import or2.C28198s;
import p114eb.C12997x0;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.C38520q;
import xp0.C38521r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003R\u001a\u0010,\u001a\u00020'8\u0016X\u0096D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020'0;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020'0?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, m65681d2 = {"Lcom/whoop/community/CommunityPendingInviteFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "Y", "b0", "", "item", "W", "(I)V", "J", "Q", "V", "U", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "pendingInvites", "N", "(Ljava/util/List;)V", "teamInviteDto", "X", "(Lcom/whoop/domain/model/teams/TeamInviteDto;)V", "a0", "P", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroyView", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lnq0/i;", "x", "Ll83/h;", "T", "()Lnq0/i;", "viewModel", "Lnq0/l;", "y", "Lnq0/l;", "communityPendingInviteAdapter", "Leq0/x0;", "z", "Leq0/x0;", "dataBinding", "Landroid/widget/ArrayAdapter;", "E", "Landroid/widget/ArrayAdapter;", "pendingInviteMenuAdapter", "", "F", "[Ljava/lang/String;", "pendingInviteMenuValues", "", "S", "()Z", "teamsOnly", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityPendingInviteFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ArrayAdapter<String> pendingInviteMenuAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String[] pendingInviteMenuValues;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "CommunityPendingInviteFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6293c(this, null, new C6292b(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C27049l communityPendingInviteAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private AbstractC13551x0 dataBinding;

    /* JADX INFO: renamed from: com.whoop.community.CommunityPendingInviteFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityPendingInviteFragment$loadPendingInvites$1", m100430f = "CommunityPendingInviteFragment.kt", m100431l = {181}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6291a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24876w;

        public C6291a(InterfaceC30057d<? super C6291a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m19108h(CommunityPendingInviteFragment communityPendingInviteFragment, Resource resource) {
            List list;
            if (resource == null || (list = (List) resource.getData()) == null) {
                return;
            }
            communityPendingInviteFragment.m19091N(list);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityPendingInviteFragment.this.new C6291a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6291a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24876w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C27046i c27046iM19097T = CommunityPendingInviteFragment.this.m19097T();
                this.f24876w = 1;
                obj = c27046iM19097T.m81246w0(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC1615p0 abstractC1615p0 = (AbstractC1615p0) obj;
            if (abstractC1615p0 != null) {
                InterfaceC1585g0 viewLifecycleOwner = CommunityPendingInviteFragment.this.getViewLifecycleOwner();
                final CommunityPendingInviteFragment communityPendingInviteFragment = CommunityPendingInviteFragment.this;
                abstractC1615p0.observe(viewLifecycleOwner, new InterfaceC1633v0() { // from class: com.whoop.community.h
                    @Override // androidx.lifecycle.InterfaceC1633v0
                    public final void onChanged(Object obj2) {
                        CommunityPendingInviteFragment.C6291a.m19108h(communityPendingInviteFragment, (Resource) obj2);
                    }
                });
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityPendingInviteFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6292b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24878w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6292b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24878w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f24878w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f24878w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityPendingInviteFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6293c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24879w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24880x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24881y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24882z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6293c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24879w = abstractComponentCallbacksC1320m0;
            this.f24880x = interfaceC35951a;
            this.f24881y = interfaceC4339a;
            this.f24882z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nq0.i] */
        @Override // c93.InterfaceC4339a
        public final C27046i invoke() {
            return AbstractC37056f.m118952D(this.f24879w, this.f24880x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27046i.class), this.f24881y, this.f24882z);
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m19087J() {
        m19097T().m81217C().observe(getViewLifecycleOwner(), new C38521r(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m19088K(CommunityPendingInviteFragment communityPendingInviteFragment, Boolean bool) {
        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
            String string = communityPendingInviteFragment.getString(AbstractC38505d0.f165657e);
            AbstractC22676k.m65749i(string, "getString(...)");
            AbstractC18737i.m54477b(communityPendingInviteFragment, string);
            AbstractC5583n.m16799z(communityPendingInviteFragment).m36410z();
            return;
        }
        if (!AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = communityPendingInviteFragment.getString(AbstractC38505d0.f165565A1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        AbstractC18737i.m54477b(communityPendingInviteFragment, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m19091N(List<TeamInviteDto> pendingInvites) {
        m19097T().m81228Y0(false, pendingInvites);
        C27049l c27049l = new C27049l(pendingInvites, pendingInvites.size(), new C38520q(this, 2));
        this.communityPendingInviteAdapter = c27049l;
        AbstractC13551x0 abstractC13551x0 = this.dataBinding;
        if (abstractC13551x0 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        abstractC13551x0.f47744a.f47657d.setText(getString(AbstractC38505d0.f165598L1, Integer.valueOf(c27049l.getDisplayCount())));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.setOrientation(1);
        AbstractC13551x0 abstractC13551x1 = this.dataBinding;
        if (abstractC13551x1 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        abstractC13551x1.f47745b.setLayoutManager(linearLayoutManager);
        AbstractC13551x0 abstractC13551x2 = this.dataBinding;
        if (abstractC13551x2 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        RecyclerView recyclerView = abstractC13551x2.f47745b;
        C27049l c27049l2 = this.communityPendingInviteAdapter;
        if (c27049l2 == null) {
            AbstractC22676k.m65757q("communityPendingInviteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c27049l2);
        C27049l c27049l3 = this.communityPendingInviteAdapter;
        if (c27049l3 != null) {
            c27049l3.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("communityPendingInviteAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m19092O(CommunityPendingInviteFragment communityPendingInviteFragment, TeamInviteDto it) {
        AbstractC22676k.m65750j(it, "it");
        communityPendingInviteFragment.m19101X(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private final void m19093P() {
        AbstractC13551x0 abstractC13551x0 = this.dataBinding;
        if (abstractC13551x0 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        ViewParent parent = abstractC13551x0.f47744a.f47655b.getParent();
        AbstractC22676k.m65749i(parent, "getParent(...)");
        AbstractC13551x0 abstractC13551x1 = this.dataBinding;
        if (abstractC13551x1 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC13551x1.f47744a.f47655b.getLayoutParams();
        AbstractC22676k.m65749i(layoutParams, "getLayoutParams(...)");
        ViewGroup viewGroup = (ViewGroup) parent;
        AbstractC13551x0 abstractC13551x2 = this.dataBinding;
        if (abstractC13551x2 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        viewGroup.removeView(abstractC13551x2.f47744a.f47655b);
        AbstractC13551x0 abstractC13551x3 = this.dataBinding;
        if (abstractC13551x3 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        viewGroup.addView(abstractC13551x3.f47744a.f47655b);
        AbstractC13551x0 abstractC13551x4 = this.dataBinding;
        if (abstractC13551x4 != null) {
            abstractC13551x4.f47744a.f47655b.setLayoutParams(layoutParams);
        } else {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m19094Q() {
        m19097T().m81233g0().observe(getViewLifecycleOwner(), new C38521r(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m19095R(CommunityPendingInviteFragment communityPendingInviteFragment, Boolean bool) {
        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
            String string = communityPendingInviteFragment.getString(AbstractC38505d0.f165665g);
            AbstractC22676k.m65749i(string, "getString(...)");
            AbstractC18737i.m54477b(communityPendingInviteFragment, string);
            AbstractC5583n.m16799z(communityPendingInviteFragment).m36410z();
            return;
        }
        if (!AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = communityPendingInviteFragment.getString(AbstractC38505d0.f165568B1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        AbstractC18737i.m54477b(communityPendingInviteFragment, string2);
    }

    /* JADX INFO: renamed from: S */
    private final boolean m19096S() {
        try {
            Bundle bundleM36479a = AbstractC5583n.m16799z(this).m36392g(AbstractC38499a0.f165077H0).m36479a();
            if (bundleM36479a != null) {
                return bundleM36479a.getBoolean("teamsOnly");
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final C27046i m19097T() {
        return (C27046i) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final void m19098U() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C6291a(null), 3);
    }

    /* JADX INFO: renamed from: V */
    private final void m19099V() {
        AbstractC28163g0.m85259o(this).m85338d(Uri.parse("whoop://com.whoop/privacyConsentFragment"));
    }

    /* JADX INFO: renamed from: W */
    private final void m19100W(int item) {
        if (item == 0) {
            m19087J();
        } else if (item == 1) {
            m19094Q();
        } else {
            if (item != 2) {
                return;
            }
            m19099V();
        }
    }

    /* JADX INFO: renamed from: X */
    private final void m19101X(TeamInviteDto teamInviteDto) {
        getEventDispatcher().m129046n(teamInviteDto.getCommunityId(), "All Invites");
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6330i.a aVarM19248e = AbstractC6330i.m19244a().m19248e(teamInviteDto.toDrawerDisplayInvite());
        AbstractC22676k.m65749i(aVarM19248e, "setInvitePojo(...)");
        c28198sM85259o.m85340f(aVarM19248e);
    }

    /* JADX INFO: renamed from: Y */
    private final void m19102Y() {
        AbstractC13551x0 abstractC13551x0 = this.dataBinding;
        if (abstractC13551x0 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        CircleImageView circleImageView = abstractC13551x0.f47744a.f47654a;
        circleImageView.setVisibility(0);
        AbstractC1953c.m5963a(circleImageView, new C38520q(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m19103Z(CommunityPendingInviteFragment communityPendingInviteFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC28163g0.m85259o(communityPendingInviteFragment).m85337c(AbstractC38499a0.f165346m, AbstractC12889b.m36273g(new C23465k("teamsOnly", Boolean.valueOf(communityPendingInviteFragment.m19096S()))), new C12997x0(false, false, AbstractC38499a0.f165077H0, true, false, -1, -1, -1, -1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m19104a0() {
        Window window = requireActivity().getWindow();
        window.setStatusBarColor(0);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(AbstractC32122c.getColor(requireContext(), AbstractC36510a.f156046y));
    }

    /* JADX INFO: renamed from: b0 */
    private final void m19105b0() {
        String string = getString(AbstractC38505d0.f165621T0);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC38505d0.f165618S0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        String string3 = getString(AbstractC38505d0.f165624U0);
        AbstractC22676k.m65749i(string3, "getString(...)");
        this.pendingInviteMenuValues = new String[]{string, string2, string3};
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        int i13 = AbstractC38501b0.f165544t0;
        int i14 = AbstractC38501b0.f165546u0;
        int i15 = AbstractC38499a0.f165255b7;
        String[] strArr = this.pendingInviteMenuValues;
        if (strArr == null) {
            AbstractC22676k.m65757q("pendingInviteMenuValues");
            throw null;
        }
        C10593k c10593k = new C10593k(contextRequireContext, R.layout.simple_spinner_item, i13, i14, i15, strArr, new C38520q(this, 0));
        this.pendingInviteMenuAdapter = c10593k;
        AbstractC13551x0 abstractC13551x0 = this.dataBinding;
        if (abstractC13551x0 != null) {
            abstractC13551x0.f47744a.f47655b.setAdapter((SpinnerAdapter) c10593k);
        } else {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m19106c0(CommunityPendingInviteFragment communityPendingInviteFragment, int i13) {
        communityPendingInviteFragment.m19093P();
        communityPendingInviteFragment.m19100W(i13);
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13551x0 abstractC13551x0M38263c = AbstractC13551x0.m38263c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13551x0M38263c, "inflate(...)");
        this.dataBinding = abstractC13551x0M38263c;
        return abstractC13551x0M38263c.getRoot();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC13551x0 abstractC13551x0 = this.dataBinding;
        if (abstractC13551x0 == null) {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
        abstractC13551x0.f47744a.f47654a.setVisibility(8);
        AbstractC13551x0 abstractC13551x1 = this.dataBinding;
        if (abstractC13551x1 != null) {
            abstractC13551x1.f47744a.f47657d.setText(getString(AbstractC38505d0.f165696n2));
        } else {
            AbstractC22676k.m65757q("dataBinding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m19102Y();
        m19098U();
        if (m19096S()) {
            getActivity();
        } else {
            getActivity();
        }
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m19098U();
        m19104a0();
        m19105b0();
    }
}
