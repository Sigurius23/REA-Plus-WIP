package com.whoop.community;

import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.viewpager.widget.ViewPager;
import aq0.C1904o;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.CommunityManageTeamFragment;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractViewOnTouchListenerC10539g;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.WhoopZoomageView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import de.hdodenhof.circleimageview.CircleImageView;
import e93.AbstractC12889b;
import eq0.AbstractC13463f1;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import il.C18615a;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import j93.InterfaceC21493z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28198s;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.C12962i;
import p114eb.C12997x0;
import p144fc.AbstractC14355k;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p236j.AbstractC21065d;
import p267k.C22083d;
import p313lz.DialogInterfaceOnClickListenerC24814k;
import p314m.C24844i;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p531uq.C35156a;
import p579wc.C37082e1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rq0.AbstractC31697u;
import rq0.C31652b0;
import rq0.C31655c0;
import rq0.C31657d;
import rq0.EnumC31649a0;
import rq0.InterfaceC31687p;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32416g;
import se.AbstractC32417h;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vq0.AbstractC36281e;
import vq0.C36280d;
import vu1.AbstractC36518i;
import vv1.C36532c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38505d0;
import xp0.C38517n;
import xp0.C38518o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0003J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u000e0\u00192\u0014\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b/\u00100R\u001a\u00106\u001a\u0002018\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010?\u001a\u0002072\u0006\u00108\u001a\u0002078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR+\u0010L\u001a\u00020F2\u0006\u00108\u001a\u00020F8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR0\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\u001dR\u0018\u0010U\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010W\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Z\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010YR\u0016\u0010]\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010YR\u001b\u0010c\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001e\u0010h\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010m\u001a\u00020)8\u0014X\u0094D¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, m65681d2 = {"Lcom/whoop/community/CommunityManageTeamFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "q0", "G0", "M0", "", "direction", "U0", "(I)V", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "deliverResult", "O0", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/BitmapDrawable;", "f0", "()Landroid/graphics/drawable/BitmapDrawable;", "g0", "K0", "J0", "R0", "Lrq0/c0;", "T0", "()Lrq0/c0;", "j0", "", "isTransfer", "I0", "(Z)V", "Landroid/text/Editable;", "f", "h0", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Leq0/f1;", "<set-?>", "x", "Lcom/whoop/ui/b;", "n0", "()Leq0/f1;", "P0", "(Leq0/f1;)V", "fragmentManageTeamBinding", "Lrq0/b0;", "y", "Ll83/h;", "p0", "()Lrq0/b0;", "viewModel", "Lrq0/d;", "z", "o0", "()Lrq0/d;", "Q0", "(Lrq0/d;)V", "pagerAdapter", "E", "Lkotlin/jvm/functions/Function1;", "getOnPhotoPick", "()Lkotlin/jvm/functions/Function1;", "setOnPhotoPick", "onPhotoPick", "F", "Landroid/graphics/Bitmap;", "bannerCropping", "G", "logoCropping", "H", "I", "bannerIndex", "logoIndex", "J", "logoVariantIndex", "Lxp0/o;", "K", "Leb/i;", "m0", "()Lxp0/o;", "args", "Lj/d;", "Lj/m;", "L", "Lj/d;", "pickMedia", "M", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityManageTeamFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f24839N;

    /* JADX INFO: renamed from: O */
    public static final int f24840O;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Function1 onPhotoPick;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Bitmap bannerCropping;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Bitmap logoCropping;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int bannerIndex;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int logoIndex;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int logoVariantIndex;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AbstractC21065d pickMedia;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "CommunityManageTeamFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b fragmentManageTeamBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b pagerAdapter;

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityManageTeamFragment$debouncer$1$1", m100430f = "CommunityManageTeamFragment.kt", m100431l = {365}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6280a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24854w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f24855x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Editable f24856y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6280a(Function1 function1, Editable editable, InterfaceC30057d<? super C6280a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24855x = function1;
            this.f24856y = editable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C6280a(this.f24855x, this.f24856y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6280a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24854w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f24854w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f24855x.invoke(this.f24856y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/CommunityManageTeamFragment$b", "Lfc/k;", "", "position", "Ll83/a0;", "c", "(I)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6281b extends AbstractC14355k {
        public C6281b() {
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: c */
        public void mo19079c(int position) {
            int iM97920x = CommunityManageTeamFragment.this.m19067o0().m97920x(position);
            CommunityManageTeamFragment.this.m19068p0().m97866O(iM97920x);
            C31652b0 c31652b0M19068p0 = CommunityManageTeamFragment.this.m19068p0();
            Integer num = CommunityManageTeamFragment.this.m19067o0().m97919v().get(Integer.valueOf(iM97920x));
            c31652b0M19068p0.m97867P(num != null ? num.intValue() : 0);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"com/whoop/community/CommunityManageTeamFragment$c", "Lcom/whoop/ui/g;", "Ll83/a0;", "b", "()V", "c", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6282c extends AbstractViewOnTouchListenerC10539g {
        public C6282c(Context context) {
            super(context);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: b */
        public void mo19080b() {
            CommunityManageTeamFragment.this.m19068p0().m97874u(-1);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: c */
        public void mo19081c() {
            CommunityManageTeamFragment.this.m19068p0().m97874u(1);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"com/whoop/community/CommunityManageTeamFragment$d", "Lcom/whoop/ui/g;", "Ll83/a0;", "b", "()V", "c", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6283d extends AbstractViewOnTouchListenerC10539g {
        public C6283d(Context context) {
            super(context);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: b */
        public void mo19080b() {
            CommunityManageTeamFragment.this.m19046U0(1);
        }

        @Override // com.whoop.p069ui.AbstractViewOnTouchListenerC10539g
        /* JADX INFO: renamed from: c */
        public void mo19081c() {
            CommunityManageTeamFragment.this.m19046U0(-1);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/CommunityManageTeamFragment$e", "Lvq0/e;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6284e extends AbstractC36281e {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f24860w;

        public C6284e(Function1 function1) {
            this.f24860w = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            this.f24860w.invoke(s13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/CommunityManageTeamFragment$f", "Lvq0/e;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6285f extends AbstractC36281e {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f24861w;

        public C6285f(Function1 function1) {
            this.f24861w = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            this.f24861w.invoke(s13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$g */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/community/CommunityManageTeamFragment$g", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6286g extends AbstractC14917t {
        public C6286g() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            CommunityManageTeamFragment.this.m19030M0();
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6287h implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f24863w;

        public C6287h(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f24863w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f24863w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24863w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6288i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24864w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6288i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24864w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f24864w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f24864w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6289j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24865w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6289j(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24865w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24865w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityManageTeamFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6290k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24866w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24867x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24868y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24869z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6290k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24866w = componentCallbacks;
            this.f24867x = interfaceC35951a;
            this.f24868y = interfaceC4339a;
            this.f24869z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.b0] */
        @Override // c93.InterfaceC4339a
        public final C31652b0 invoke() {
            return AbstractC34132o.m107857B(this.f24866w, this.f24867x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31652b0.class), this.f24868y, this.f24869z);
        }
    }

    static {
        C22686q c22686q = new C22686q(CommunityManageTeamFragment.class, "fragmentManageTeamBinding", "getFragmentManageTeamBinding()Lcom/whoop/community/databinding/FragmentManageTeamBinding;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f24839N = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(CommunityManageTeamFragment.class, "pagerAdapter", "getPagerAdapter()Lcom/whoop/community/presentation/teams/LogoPagerAdapter;", 0, c22673i0)};
        f24840O = 8;
    }

    public CommunityManageTeamFragment() {
        C36532c c36532c = new C36532c(this, 23);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6290k(this, null, new C6289j(this), c36532c));
        this.pagerAdapter = AbstractC10463c.m26726c(this, null, 1, null);
        this.bannerIndex = -1;
        this.logoIndex = -1;
        this.logoVariantIndex = -1;
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38518o.class), new C6288i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m19009A0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19040R0();
        communityManageTeamFragment.m19068p0().m97855A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m19010B0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19068p0().m97872Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m19011C0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19068p0().m97873Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m19012D0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        AbstractC21065d abstractC21065d = communityManageTeamFragment.pickMedia;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(AbstractC32416g.m101149f(C22083d.f85640a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m19014E0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19034O0(new C38517n(communityManageTeamFragment, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m19016F0(CommunityManageTeamFragment communityManageTeamFragment, Bitmap it) {
        AbstractC22676k.m65750j(it, "it");
        communityManageTeamFragment.m19068p0().m97876w(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m19018G0() {
        m19066n0().f47253H.setOnCheckedChangeListener(new C35156a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m19020H0(CommunityManageTeamFragment communityManageTeamFragment, CompoundButton compoundButton, boolean z4) {
        AbstractC22676k.m65750j(compoundButton, "<unused var>");
        communityManageTeamFragment.m19068p0().m97871X(z4);
    }

    /* JADX INFO: renamed from: I0 */
    private final void m19022I0(boolean isTransfer) {
        Team teamM97897m;
        C31655c0 c31655c0M19044T0 = m19044T0();
        if (c31655c0M19044T0 == null || (teamM97897m = c31655c0M19044T0.getLoadedTeam()) == null) {
            return;
        }
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6328g.b bVarM19231b = AbstractC6328g.m19231b(isTransfer, teamM97897m);
        AbstractC22676k.m65749i(bVarM19231b, "actionCommunityManageTea…emoveMembersFragment(...)");
        c28198sM85259o.m85340f(bVarM19231b);
    }

    /* JADX INFO: renamed from: J0 */
    private final void m19024J0() {
        C31655c0 c31655c0M19044T0 = m19044T0();
        String strM97891g = c31655c0M19044T0 != null ? c31655c0M19044T0.getBannerUrlToLoad() : null;
        C31655c0 c31655c0M19044T1 = m19044T0();
        String strM97901q = c31655c0M19044T1 != null ? c31655c0M19044T1.getLogoUrlToLoad() : null;
        m19068p0().m97863L();
        if (strM97891g == null || strM97901q == null) {
            m19068p0().m97859G();
        } else {
            m19068p0().m97860H(strM97891g, strM97901q);
        }
    }

    /* JADX INFO: renamed from: K0 */
    private final void m19026K0() {
        m19068p0().getViewStateLiveData().observe(this, new C6287h(new C38517n(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m19028L0(CommunityManageTeamFragment communityManageTeamFragment, C31655c0 c31655c0) {
        AbstractC13463f1 abstractC13463f1M19066n0 = communityManageTeamFragment.m19066n0();
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47255J, c31655c0.getLoading());
        if (c31655c0.getLoading()) {
            abstractC13463f1M19066n0.f47255J.m26663f();
        } else {
            abstractC13463f1M19066n0.f47255J.m26664g();
        }
        boolean z4 = c31655c0.getIsConnected() && !c31655c0.getLoading();
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47249D, !c31655c0.getIsConnected());
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47246A, c31655c0.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() == EnumC31649a0.MAIN && z4);
        View root = abstractC13463f1M19066n0.f47265h.getRoot();
        EnumC31649a0 enumC31649a0M97906v = c31655c0.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        EnumC31649a0 enumC31649a0 = EnumC31649a0.BANNER_PICK;
        AbstractC32417h.m101189T(root, enumC31649a0M97906v == enumC31649a0 && z4);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47282y.getRoot(), c31655c0.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() == EnumC31649a0.LOGO_PICK && z4);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47260c, c31655c0.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() == EnumC31649a0.BANNER_CROP && z4);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47277t, c31655c0.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() == EnumC31649a0.LOGO_CROP && z4);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47264g, c31655c0.getBannerCropping() == null);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47258a, c31655c0.getBannerCropping() != null);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47266i, c31655c0.getMemberCount() == 1);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47251F, c31655c0.getMemberCount() != 1);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47257L, c31655c0.getMemberCount() != 1);
        AbstractC32417h.m101189T(abstractC13463f1M19066n0.f47256K, c31655c0.getMemberCount() != 1);
        abstractC13463f1M19066n0.f47253H.setChecked(c31655c0.getChatEnabled());
        if (!AbstractC22676k.m65745e(c31655c0.getName(), abstractC13463f1M19066n0.f47273p.getText().toString())) {
            abstractC13463f1M19066n0.f47273p.setText(c31655c0.getName());
        }
        if (!AbstractC22676k.m65745e(c31655c0.getDescription(), abstractC13463f1M19066n0.f47270m.getText().toString())) {
            abstractC13463f1M19066n0.f47270m.setText(c31655c0.getDescription());
        }
        if (!c31655c0.getLoading() && c31655c0.m97892h().size() > 0) {
            InterfaceC31687p interfaceC31687p = c31655c0.m97892h().get(c31655c0.getBannerIndex());
            AbstractC22676k.m65749i(interfaceC31687p, "get(...)");
            InterfaceC31687p interfaceC31687p2 = interfaceC31687p;
            if (c31655c0.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() != enumC31649a0 || c31655c0.getBannerIndex() == communityManageTeamFragment.bannerIndex) {
                ImageView bannerImage = abstractC13463f1M19066n0.f47264g;
                AbstractC22676k.m65749i(bannerImage, "bannerImage");
                Context contextRequireContext = communityManageTeamFragment.requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                InterfaceC31687p.m98188a(interfaceC31687p2, bannerImage, contextRequireContext, null, 4, null);
            } else {
                ImageView bannerImage2 = abstractC13463f1M19066n0.f47264g;
                AbstractC22676k.m65749i(bannerImage2, "bannerImage");
                Context contextRequireContext2 = communityManageTeamFragment.requireContext();
                AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
                interfaceC31687p2.mo98189b(bannerImage2, contextRequireContext2, C18615a.m53885b(500));
            }
            communityManageTeamFragment.bannerIndex = c31655c0.getBannerIndex();
        }
        if (!AbstractC22676k.m65745e(c31655c0.getBannerCropping(), communityManageTeamFragment.bannerCropping)) {
            abstractC13463f1M19066n0.f47258a.setImageBitmap(c31655c0.getBannerCropping());
            communityManageTeamFragment.bannerCropping = c31655c0.getBannerCropping();
        }
        if (!AbstractC22676k.m65745e(c31655c0.getLogoCropping(), communityManageTeamFragment.logoCropping)) {
            abstractC13463f1M19066n0.f47275r.setImageBitmap(c31655c0.getLogoCropping());
            communityManageTeamFragment.logoCropping = c31655c0.getLogoCropping();
        }
        if (c31655c0.m97903s().size() > 0) {
            InterfaceC31687p interfaceC31687p3 = c31655c0.m97903s().get(c31655c0.getLogoIndex()).get(c31655c0.getLogoVariantIndex());
            CircleImageView logoImage = abstractC13463f1M19066n0.f47281x;
            AbstractC22676k.m65749i(logoImage, "logoImage");
            Context contextRequireContext3 = communityManageTeamFragment.requireContext();
            AbstractC22676k.m65749i(contextRequireContext3, "requireContext(...)");
            InterfaceC31687p.m98188a(interfaceC31687p3, logoImage, contextRequireContext3, null, 4, null);
            if (c31655c0.getLogoIndex() != communityManageTeamFragment.logoIndex || c31655c0.getLogoVariantIndex() != communityManageTeamFragment.logoVariantIndex) {
                communityManageTeamFragment.m19067o0().m97919v().put(Integer.valueOf(c31655c0.getLogoIndex()), Integer.valueOf(c31655c0.getLogoVariantIndex()));
                communityManageTeamFragment.logoIndex = c31655c0.getLogoIndex();
                communityManageTeamFragment.logoVariantIndex = c31655c0.getLogoVariantIndex();
            }
            if (!AbstractC22676k.m65745e(c31655c0.m97903s(), communityManageTeamFragment.m19067o0().m97918u())) {
                communityManageTeamFragment.m19067o0().m97921y(c31655c0.m97903s());
            }
            if (c31655c0.getLogoIndex() != communityManageTeamFragment.m19067o0().m97920x(abstractC13463f1M19066n0.f47282y.f47512a.getCurrentItem())) {
                communityManageTeamFragment.m19067o0().m40968j();
                abstractC13463f1M19066n0.f47282y.f47512a.m5469D((communityManageTeamFragment.m19067o0().m97918u().size() * 100) + c31655c0.getLogoIndex(), false);
            }
        }
        if (c31655c0.getBannerUrlToLoad() != null) {
            communityManageTeamFragment.m19024J0();
        }
        String strM97895k = c31655c0.getFinishToast();
        if (strM97895k != null) {
            AbstractC18737i.m54479d(communityManageTeamFragment.requireContext(), strM97895k);
            AbstractC5583n.m16799z(communityManageTeamFragment).m36410z();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final void m19030M0() {
        if (m19068p0().getManageTeam() == null) {
            AbstractC5583n.m16799z(this).m36410z();
            return;
        }
        C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
        AbstractC6328g.a aVarM19230a = AbstractC6328g.m19230a(1, "DAILY");
        Team teamM97856B = m19068p0().getManageTeam();
        AbstractC22676k.m65748h(teamM97856B, "null cannot be cast to non-null type com.whoop.domain.model.teams.Team");
        AbstractC6328g.a aVarM19241k = aVarM19230a.m19241k(teamM97856B);
        AbstractC22676k.m65749i(aVarM19241k, "setTeam(...)");
        c28198sM85259o.m85340f(aVarM19241k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m19032N0(CommunityManageTeamFragment communityManageTeamFragment, Uri uri) {
        if (uri != null) {
            File filesDir = communityManageTeamFragment.requireContext().getFilesDir();
            AbstractC22676k.m65749i(filesDir, "getFilesDir(...)");
            ContentResolver contentResolver = communityManageTeamFragment.requireContext().getContentResolver();
            AbstractC22676k.m65749i(contentResolver, "getContentResolver(...)");
            communityManageTeamFragment.m19068p0().m97875v(new C36280d(filesDir, contentResolver, uri).m115968a());
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m19034O0(Function1 deliverResult) {
        this.onPhotoPick = deliverResult;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(requireActivity().getPackageManager()) == null) {
            Toast.makeText(requireContext(), getString(AbstractC38505d0.f165592J1), 1).show();
        } else {
            requireActivity().startActivityForResult(intent, 1);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private final void m19036P0(AbstractC13463f1 abstractC13463f1) {
        this.fragmentManageTeamBinding.setValue(this, f24839N[0], abstractC13463f1);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m19038Q0(C31657d c31657d) {
        this.pagerAdapter.setValue(this, f24839N[1], c31657d);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m19040R0() {
        ArrayList<List<InterfaceC31687p>> arrayList;
        ArrayList<List<InterfaceC31687p>> arrayListM97903s;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        m19038Q0(new C31657d(contextRequireContext, new C38517n(this, 2)));
        m19066n0().f47282y.f47512a.setAdapter(m19067o0());
        C31657d c31657dM19067o0 = m19067o0();
        C31655c0 c31655c0M19044T0 = m19044T0();
        if (c31655c0M19044T0 == null || (arrayList = c31655c0M19044T0.m97903s()) == null) {
            arrayList = new ArrayList<>();
        }
        c31657dM19067o0.m97921y(arrayList);
        C31655c0 c31655c0M19044T1 = m19044T0();
        int size = 0;
        if (c31655c0M19044T1 != null) {
            int iM97900p = c31655c0M19044T1.getLogoIndex();
            HashMap<Integer, Integer> mapM97919v = m19067o0().m97919v();
            Integer numValueOf = Integer.valueOf(iM97900p);
            C31655c0 c31655c0M19044T2 = m19044T0();
            mapM97919v.put(numValueOf, Integer.valueOf(c31655c0M19044T2 != null ? c31655c0M19044T2.getLogoVariantIndex() : 0));
        }
        ViewPager viewPager = m19066n0().f47282y.f47512a;
        C31655c0 c31655c0M19044T3 = m19044T0();
        int iM97900p2 = c31655c0M19044T3 != null ? c31655c0M19044T3.getLogoIndex() : 0;
        C31655c0 c31655c0M19044T4 = m19044T0();
        if (c31655c0M19044T4 != null && (arrayListM97903s = c31655c0M19044T4.m97903s()) != null) {
            size = arrayListM97903s.size();
        }
        viewPager.setCurrentItem((size * 100) + iM97900p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m19042S0(CommunityManageTeamFragment communityManageTeamFragment, int i13) {
        communityManageTeamFragment.m19068p0().m97867P(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T0 */
    private final C31655c0 m19044T0() {
        return (C31655c0) m19068p0().getViewStateLiveData().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public final void m19046U0(int direction) {
        m19066n0().f47282y.f47512a.setCurrentItem(m19066n0().f47282y.f47512a.getCurrentItem() + direction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C34911a m19048V0(CommunityManageTeamFragment communityManageTeamFragment) {
        return AbstractC15751g.m44431K(communityManageTeamFragment.requireContext());
    }

    /* JADX INFO: renamed from: f0 */
    private final BitmapDrawable m19058f0() {
        AbstractC13463f1 abstractC13463f1M19066n0 = m19066n0();
        Drawable foreground = abstractC13463f1M19066n0.f47258a.getForeground();
        abstractC13463f1M19066n0.f47258a.setForeground(null);
        WhoopZoomageView bannerCropImage = abstractC13463f1M19066n0.f47258a;
        AbstractC22676k.m65749i(bannerCropImage, "bannerCropImage");
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        BitmapDrawable bitmapDrawableM98268a = AbstractC31697u.m98268a(bannerCropImage, resources);
        abstractC13463f1M19066n0.f47258a.setForeground(foreground);
        return bitmapDrawableM98268a;
    }

    /* JADX INFO: renamed from: g0 */
    private final BitmapDrawable m19059g0() {
        WhoopZoomageView logoCropImage = m19066n0().f47275r;
        AbstractC22676k.m65749i(logoCropImage, "logoCropImage");
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        return AbstractC31697u.m98268a(logoCropImage, resources);
    }

    /* JADX INFO: renamed from: h0 */
    private final Function1 m19060h0(Function1 f13) {
        return new C37082e1(new C22669g0(), this, f13, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m19061i0(C22669g0 c22669g0, CommunityManageTeamFragment communityManageTeamFragment, Function1 function1, Editable editable) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
        if (interfaceC3027k1 == null || interfaceC3027k1.isCompleted()) {
            InterfaceC1585g0 viewLifecycleOwner = communityManageTeamFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            c22669g0.f89336w = AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6280a(function1, editable, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m19062j0() {
        C24844i c24844i = new C24844i(requireContext(), AbstractC36518i.f156128b);
        C31655c0 c31655c0M19044T0 = m19044T0();
        C24844i title = c24844i.setTitle(c31655c0M19044T0 != null ? c31655c0M19044T0.getName() : null);
        title.m72848a(AbstractC38505d0.f165573D0);
        title.setPositiveButton(AbstractC38505d0.f165701p, new DialogInterfaceOnClickListenerC24814k(this, 3)).setNegativeButton(AbstractC38505d0.f165697o, new DialogInterfaceOnClickListenerC19904c(7)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m19063k0(CommunityManageTeamFragment communityManageTeamFragment, DialogInterface dialogInterface, int i13) {
        communityManageTeamFragment.m19068p0().m97877y();
        boolean z4 = false;
        try {
            Bundle bundleM36479a = AbstractC5583n.m16799z(communityManageTeamFragment).m36392g(AbstractC38499a0.f165077H0).m36479a();
            if (bundleM36479a != null) {
                z4 = bundleM36479a.getBoolean("teamsOnly");
            }
        } catch (IllegalArgumentException unused) {
        }
        AbstractC28163g0.m85259o(communityManageTeamFragment).m85337c(AbstractC38499a0.f165328k, AbstractC12889b.m36273g(new C23465k("teamsOnly", Boolean.valueOf(z4))), new C12997x0(false, false, AbstractC38499a0.f165077H0, true, false, -1, -1, -1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m19064l0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: renamed from: m0 */
    private final C38518o m19065m0() {
        return (C38518o) this.args.getValue();
    }

    /* JADX INFO: renamed from: n0 */
    private final AbstractC13463f1 m19066n0() {
        return (AbstractC13463f1) this.fragmentManageTeamBinding.getValue(this, f24839N[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final C31657d m19067o0() {
        return (C31657d) this.pagerAdapter.getValue(this, f24839N[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final C31652b0 m19068p0() {
        return (C31652b0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    private final void m19069q0() {
        Function1 function1M19060h0 = m19060h0(new C38517n(this, 3));
        Function1 function1M19060h1 = m19060h0(new C38517n(this, 5));
        AbstractC13463f1 abstractC13463f1M19066n0 = m19066n0();
        abstractC13463f1M19066n0.f47273p.addTextChangedListener(new C6284e(function1M19060h0));
        abstractC13463f1M19066n0.f47270m.addTextChangedListener(new C6285f(function1M19060h1));
        EditText editText = abstractC13463f1M19066n0.f47270m;
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        final int i13 = 8;
        abstractC13463f1M19066n0.f47251F.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i14 = 9;
        abstractC13463f1M19066n0.f47257L.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i15 = 10;
        abstractC13463f1M19066n0.f47266i.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i16 = 0;
        abstractC13463f1M19066n0.f47267j.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i17 = 1;
        abstractC13463f1M19066n0.f47272o.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i18 = 2;
        abstractC13463f1M19066n0.f47265h.f47470d.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i19 = 3;
        abstractC13463f1M19066n0.f47282y.f47513b.f47470d.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        m19040R0();
        abstractC13463f1M19066n0.f47282y.f47512a.m5478c(new C6281b());
        abstractC13463f1M19066n0.f47265h.getRoot().setOnTouchListener(new C6282c(requireContext()));
        abstractC13463f1M19066n0.f47282y.f47513b.f47467a.setOnTouchListener(new C6283d(requireContext()));
        final int i24 = 4;
        abstractC13463f1M19066n0.f47265h.f47468b.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i25 = 5;
        abstractC13463f1M19066n0.f47282y.f47513b.f47468b.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i25) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i26 = 6;
        abstractC13463f1M19066n0.f47259b.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i26) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        final int i27 = 7;
        abstractC13463f1M19066n0.f47276s.setOnClickListener(new View.OnClickListener(this) { // from class: xp0.m

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ CommunityManageTeamFragment f165772x;

            {
                this.f165772x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i27) {
                    case 0:
                        CommunityManageTeamFragment.m19078z0(this.f165772x, view);
                        break;
                    case 1:
                        CommunityManageTeamFragment.m19009A0(this.f165772x, view);
                        break;
                    case 2:
                        CommunityManageTeamFragment.m19010B0(this.f165772x, view);
                        break;
                    case 3:
                        CommunityManageTeamFragment.m19011C0(this.f165772x, view);
                        break;
                    case 4:
                        CommunityManageTeamFragment.m19012D0(this.f165772x, view);
                        break;
                    case 5:
                        CommunityManageTeamFragment.m19014E0(this.f165772x, view);
                        break;
                    case 6:
                        CommunityManageTeamFragment.m19073u0(this.f165772x, view);
                        break;
                    case 7:
                        CommunityManageTeamFragment.m19074v0(this.f165772x, view);
                        break;
                    case 8:
                        CommunityManageTeamFragment.m19072t0(this.f165772x, view);
                        break;
                    case 9:
                        CommunityManageTeamFragment.m19076x0(this.f165772x, view);
                        break;
                    default:
                        CommunityManageTeamFragment.m19077y0(this.f165772x, view);
                        break;
                }
            }
        });
        abstractC13463f1M19066n0.f47264g.setImageDrawable(null);
        abstractC13463f1M19066n0.f47248C.m26687n(new C38517n(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m19070r0(CommunityManageTeamFragment communityManageTeamFragment, Editable editable) {
        communityManageTeamFragment.m19068p0().m97870V(String.valueOf(editable));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m19071s0(CommunityManageTeamFragment communityManageTeamFragment, Editable editable) {
        communityManageTeamFragment.m19068p0().m97869U(String.valueOf(editable));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m19072t0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19022I0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m19073u0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19068p0().m97864M(communityManageTeamFragment.m19058f0());
        communityManageTeamFragment.m19068p0().m97872Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m19074v0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19068p0().m97865N(communityManageTeamFragment.m19059g0());
        communityManageTeamFragment.m19068p0().m97873Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m19075w0(CommunityManageTeamFragment communityManageTeamFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityManageTeamFragment.m19030M0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m19076x0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19022I0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m19077y0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19062j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m19078z0(CommunityManageTeamFragment communityManageTeamFragment, View view) {
        communityManageTeamFragment.m19068p0().m97878z();
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
        AbstractC13463f1 abstractC13463f1M38185c = AbstractC13463f1.m38185c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13463f1M38185c, "inflate(...)");
        m19036P0(abstractC13463f1M38185c);
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, new C6286g());
        this.pickMedia = registerForActivityResult(new ActivityResultContracts$PickVisualMedia(), new C1904o(this, 19));
        View root = m19066n0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m19026K0();
        m19068p0().m97862K();
        C31655c0 c31655c0 = (C31655c0) m19068p0().getViewStateLiveData().getValue();
        if (c31655c0 == null || c31655c0.getId() == null) {
            m19068p0().m97861I(m19065m0().m123415a(), TeamType.COMMUNITY);
        }
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m19068p0().m97858E();
        m19069q0();
        m19018G0();
    }
}
