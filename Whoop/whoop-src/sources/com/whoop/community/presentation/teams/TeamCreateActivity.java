package com.whoop.community.presentation.teams;

import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.community.presentation.teams.TeamCreateActivity;
import com.whoop.p069ui.ProgressBar;
import com.whoop.p069ui.WhoopZoomageView;
import eq0.AbstractC13436a;
import ge3.AbstractC15751g;
import hj0.AbstractActivityC17350i;
import java.io.File;
import java.util.HashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf1.AbstractC26660a;
import nf1.AbstractC26662c;
import nf1.AbstractC26663d;
import p000.AbstractC30802r;
import p144fc.AbstractC14355k;
import p161g.AbstractC14917t;
import p314m.AbstractC24830b;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.C29124b;
import q80.C30036h;
import q83.AbstractC30060g;
import rq0.AbstractC31685o;
import rq0.AbstractC31697u;
import rq0.C31648a;
import rq0.C31705y;
import rq0.C31707z;
import rq0.EnumC31701w;
import se.AbstractC32417h;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vq0.C36280d;
import vu1.AbstractC36510a;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020#8\u0014X\u0094D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00102R$\u00109\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010;\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00104\u001a\u0004\b/\u00106\"\u0004\b:\u00108R0\u0010A\u001a\u001e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020=0<j\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020=`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010F¨\u0006I"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/TeamCreateActivity;", "Lhj0/i;", "<init>", "()V", "Ll83/a0;", "I", "J", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "enabled", "N", "(Z)V", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "deliverResult", "L", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/BitmapDrawable;", "F", "()Landroid/graphics/drawable/BitmapDrawable;", "", "E", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "logTag", "Lrq0/y;", "Ll83/h;", "H", "()Lrq0/y;", "viewModel", "Lrq0/w;", "G", "Lrq0/w;", "attachedStep", "Lkotlin/jvm/functions/Function1;", "onPhotoPick", "Landroid/graphics/Bitmap;", "getBannerCropping", "()Landroid/graphics/Bitmap;", "setBannerCropping", "(Landroid/graphics/Bitmap;)V", "bannerCropping", "M", "logoCropping", "Ljava/util/HashMap;", "Lrq0/o;", "Lkotlin/collections/HashMap;", "K", "Ljava/util/HashMap;", "fragments", "Lrq0/a;", "Lrq0/a;", "bannerPagerAdapter", "Leq0/a;", "Leq0/a;", "binding", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TeamCreateActivity extends AbstractActivityC17350i {

    /* JADX INFO: renamed from: O */
    public static final int f25047O = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag = "TeamCreateActivity";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private EnumC31701w attachedStep;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Function1 onPhotoPick;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Bitmap bannerCropping;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Bitmap logoCropping;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final HashMap<EnumC31701w, AbstractC31685o> fragments;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private C31648a bannerPagerAdapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private AbstractC13436a binding;

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamCreateActivity$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6362b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25057a;

        static {
            int[] iArr = new int[EnumC31701w.values().length];
            try {
                iArr[EnumC31701w.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25057a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamCreateActivity$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/presentation/teams/TeamCreateActivity$c", "Lfc/k;", "", "position", "Ll83/a0;", "c", "(I)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6363c extends AbstractC14355k {
        public C6363c() {
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: c */
        public void mo19079c(int position) {
            TeamCreateActivity.this.m19430H().m98307S(position);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamCreateActivity$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/community/presentation/teams/TeamCreateActivity$d", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6364d extends AbstractC14917t {
        public C6364d() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            TeamCreateActivity.this.m19431I();
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamCreateActivity$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6365e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25060w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6365e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25060w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25060w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamCreateActivity$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6366f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25063y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25064z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6366f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25061w = componentCallbacks;
            this.f25062x = interfaceC35951a;
            this.f25063y = interfaceC4339a;
            this.f25064z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.y] */
        @Override // c93.InterfaceC4339a
        public final C31705y invoke() {
            return AbstractC34132o.m107857B(this.f25061w, this.f25062x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31705y.class), this.f25063y, this.f25064z);
        }
    }

    public TeamCreateActivity() {
        C30036h c30036h = new C30036h(this, 16);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6366f(this, null, new C6365e(this), c30036h));
        this.fragments = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final C31705y m19430H() {
        return (C31705y) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m19431I() {
        AbstractC31685o abstractC31685o;
        EnumC31701w enumC31701w = this.attachedStep;
        if (enumC31701w != null && (abstractC31685o = this.fragments.get(enumC31701w)) != null) {
            abstractC31685o.mo19489O();
        }
        C31707z c31707z = (C31707z) m19430H().getViewStateLiveData().getValue();
        if ((c31707z != null ? c31707z.getStep() : null) == EnumC31701w.SPLASH) {
            finish();
        } else {
            m19430H().m98303M();
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m19432J() {
        m19430H().getViewStateLiveData().observe(this, new C6374a(new C29124b(this, 28)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m19433K(TeamCreateActivity teamCreateActivity, C31707z c31707z) {
        boolean z4;
        AbstractC13436a abstractC13436a = teamCreateActivity.binding;
        if (abstractC13436a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (c31707z.getStep() != teamCreateActivity.attachedStep) {
            AbstractC31685o abstractC31685o = teamCreateActivity.fragments.get(c31707z.getStep());
            if (abstractC31685o == null) {
                throw new IllegalArgumentException();
            }
            EnumC31701w step = c31707z.getStep();
            if (step == null) {
                step = EnumC31701w.SPLASH;
            }
            EnumC31701w enumC31701w = teamCreateActivity.attachedStep;
            if (enumC31701w == null) {
                enumC31701w = EnumC31701w.SPLASH;
            }
            int i13 = step.compareTo(enumC31701w) > 0 ? AbstractC26660a.f105963h : AbstractC26660a.f105967l;
            EnumC31701w step2 = c31707z.getStep();
            if (step2 == null) {
                step2 = EnumC31701w.SPLASH;
            }
            EnumC31701w enumC31701w2 = teamCreateActivity.attachedStep;
            if (enumC31701w2 == null) {
                enumC31701w2 = EnumC31701w.SPLASH;
            }
            int i14 = step2.compareTo(enumC31701w2) > 0 ? AbstractC26660a.f105964i : AbstractC26660a.f105968m;
            AbstractC1329o1 supportFragmentManager = teamCreateActivity.getSupportFragmentManager();
            C1271a c1271aM94758g = AbstractC30802r.m94758g(supportFragmentManager, supportFragmentManager);
            c1271aM94758g.m4069f(i13, i14, 0, 0);
            if (c1271aM94758g.f5569i) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c1271aM94758g.f5570j = false;
            c1271aM94758g.m4068e(AbstractC38499a0.f165043D2, abstractC31685o, null);
            c1271aM94758g.m4046j();
            teamCreateActivity.attachedStep = c31707z.getStep();
            AbstractC24830b supportActionBar = teamCreateActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo72834w(teamCreateActivity.getString(abstractC31685o.getTitleRes()));
                EnumC31701w step3 = c31707z.getStep();
                if ((step3 == null ? -1 : C6362b.f25057a[step3.ordinal()]) == 1) {
                    supportActionBar.mo72826o(true);
                    supportActionBar.mo72829r(AbstractC36512c.f156067j);
                } else {
                    supportActionBar.mo72826o(true);
                    supportActionBar.mo72829r(AbstractC26662c.f105981c);
                }
            }
            WhoopZoomageView whoopZoomageView = abstractC13436a.f47103a;
            EnumC31701w step4 = c31707z.getStep();
            EnumC31701w enumC31701w3 = EnumC31701w.BANNER;
            whoopZoomageView.setTranslatable(step4 == enumC31701w3);
            abstractC13436a.f47103a.setZoomable(c31707z.getStep() == enumC31701w3);
            abstractC13436a.f47107e.setText(teamCreateActivity.getString(abstractC31685o.getNextButtonRes()));
        }
        C31648a c31648a = teamCreateActivity.bannerPagerAdapter;
        if (c31648a == null) {
            AbstractC22676k.m65757q("bannerPagerAdapter");
            throw null;
        }
        if (c31648a.m97817t().size() != c31707z.m98322g().size()) {
            C31648a c31648a2 = teamCreateActivity.bannerPagerAdapter;
            if (c31648a2 == null) {
                AbstractC22676k.m65757q("bannerPagerAdapter");
                throw null;
            }
            c31648a2.m97819v(c31707z.m98322g());
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || (c31707z.m98322g().size() != 0 && abstractC13436a.f47104b.getCurrentItem() % c31707z.m98322g().size() != c31707z.getBannerIndex())) {
            abstractC13436a.f47104b.m5469D((c31707z.m98322g().size() * 10) + c31707z.getBannerIndex(), c31707z.getStep() == EnumC31701w.BANNER);
        }
        AbstractC32417h.m101189T(abstractC13436a.f47103a, c31707z.getBannerCropping() != null);
        AbstractC32417h.m101189T(abstractC13436a.f47105c, c31707z.getBannerCropping() == null);
        AbstractC32417h.m101189T(abstractC13436a.f47104b, c31707z.getBannerCropping() == null);
        abstractC13436a.f47104b.setSwipeDisabled(c31707z.getStep() != EnumC31701w.BANNER);
        if (!AbstractC22676k.m65745e(c31707z.getBannerCropping(), teamCreateActivity.bannerCropping)) {
            abstractC13436a.f47103a.setImageBitmap(c31707z.getBannerCropping());
            teamCreateActivity.bannerCropping = c31707z.getBannerCropping();
        }
        AbstractC32417h.m101189T(abstractC13436a.f47106d, !c31707z.getLoading());
        AbstractC32417h.m101189T(abstractC13436a.f47107e, !c31707z.getLoading());
        AbstractC32417h.m101189T(abstractC13436a.f47108f, c31707z.getLoading());
        if (c31707z.getLoading()) {
            abstractC13436a.f47108f.m26663f();
        } else {
            abstractC13436a.f47108f.m26664g();
        }
        if (c31707z.getFinishToast() != null) {
            Toast.makeText(abstractC13436a.getRoot().getContext(), c31707z.getFinishToast(), 1).show();
            int finishCode = c31707z.getFinishCode();
            Intent intent = new Intent();
            intent.putExtra("createdTeam", c31707z.getCreatedTeam());
            teamCreateActivity.setResult(finishCode, intent);
            teamCreateActivity.finish();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final void m19434O(boolean z4, TeamCreateActivity teamCreateActivity, View view) {
        EnumC31701w enumC31701w;
        AbstractC31685o abstractC31685o;
        if (!z4 || (enumC31701w = teamCreateActivity.attachedStep) == null || (abstractC31685o = teamCreateActivity.fragments.get(enumC31701w)) == null) {
            return;
        }
        abstractC31685o.mo19489O();
        teamCreateActivity.m19430H().m98302K(abstractC31685o.mo19483G(), abstractC31685o.mo19484H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C34911a m19435P(TeamCreateActivity teamCreateActivity) {
        return AbstractC15751g.m44431K(teamCreateActivity);
    }

    /* JADX INFO: renamed from: F */
    public final BitmapDrawable m19437F() {
        AbstractC13436a abstractC13436a = this.binding;
        if (abstractC13436a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        Drawable foreground = abstractC13436a.f47103a.getForeground();
        abstractC13436a.f47103a.setForeground(null);
        WhoopZoomageView bannerCrop = abstractC13436a.f47103a;
        AbstractC22676k.m65749i(bannerCrop, "bannerCrop");
        Resources resources = getResources();
        AbstractC22676k.m65749i(resources, "getResources(...)");
        BitmapDrawable bitmapDrawableM98268a = AbstractC31697u.m98268a(bannerCrop, resources);
        abstractC13436a.f47103a.setForeground(foreground);
        return bitmapDrawableM98268a;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Bitmap getLogoCropping() {
        return this.logoCropping;
    }

    /* JADX INFO: renamed from: L */
    public final void m19439L(Function1 deliverResult) {
        AbstractC22676k.m65750j(deliverResult, "deliverResult");
        this.onPhotoPick = deliverResult;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 1);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m19440M(Bitmap bitmap) {
        this.logoCropping = bitmap;
    }

    /* JADX INFO: renamed from: N */
    public final void m19441N(final boolean enabled) {
        int color = getResources().getColor(enabled ? AbstractC36510a.f156040s : AbstractC36510a.f156041t, null);
        AbstractC13436a abstractC13436a = this.binding;
        if (abstractC13436a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13436a.f47107e.setStrokeColor(color);
        AbstractC13436a abstractC13436a2 = this.binding;
        if (abstractC13436a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13436a2.f47107e.setTextColor(color);
        AbstractC13436a abstractC13436a3 = this.binding;
        if (abstractC13436a3 != null) {
            abstractC13436a3.f47107e.setOnClickListener(new View.OnClickListener() { // from class: rq0.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TeamCreateActivity.m19434O(enabled, this, view);
                }
            });
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri data2;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1 || resultCode != -1 || data == null || (data2 = data.getData()) == null) {
            return;
        }
        File filesDir = getFilesDir();
        AbstractC22676k.m65749i(filesDir, "getFilesDir(...)");
        ContentResolver contentResolver = getContentResolver();
        AbstractC22676k.m65749i(contentResolver, "getContentResolver(...)");
        Bitmap bitmapM115968a = new C36280d(filesDir, contentResolver, data2).m115968a();
        Function1 function1 = this.onPhotoPick;
        if (function1 != null) {
            function1.invoke(bitmapM115968a);
        }
        this.onPhotoPick = null;
    }

    @Override // hj0.AbstractActivityC17350i, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC1168a0 abstractC1168a0M3733d = AbstractC1177g.m3733d(this, AbstractC38501b0.f165505a);
        AbstractC22676k.m65749i(abstractC1168a0M3733d, "setContentView(...)");
        this.binding = (AbstractC13436a) abstractC1168a0M3733d;
        m19430H().m98304O();
        setSupportActionBar((Toolbar) findViewById(AbstractC26663d.f105992k));
        AbstractC24830b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo72830s();
        }
        ((ProgressBar) findViewById(AbstractC26663d.f105995n)).m26654a();
        this.fragments.put(EnumC31701w.SPLASH, C6379f.INSTANCE.m19531a());
        this.fragments.put(EnumC31701w.NAME, C6377d.INSTANCE.m19518a());
        this.fragments.put(EnumC31701w.BANNER, C6375b.INSTANCE.m19490a());
        this.fragments.put(EnumC31701w.LOGO, C6376c.INSTANCE.m19505a());
        this.fragments.put(EnumC31701w.SHARING, C6378e.INSTANCE.m19530a());
        C31648a c31648a = new C31648a(this);
        this.bannerPagerAdapter = c31648a;
        AbstractC13436a abstractC13436a = this.binding;
        if (abstractC13436a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13436a.f47104b.setAdapter(c31648a);
        AbstractC13436a abstractC13436a2 = this.binding;
        if (abstractC13436a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13436a2.f47104b.m5478c(new C6363c());
        getOnBackPressedDispatcher().m43015a(this, new C6364d());
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        m19432J();
        C31707z c31707z = (C31707z) m19430H().getViewStateLiveData().getValue();
        if (c31707z == null || c31707z.getStep() == null) {
            C31705y.m98291L(m19430H(), null, null, 3, null);
        }
    }

    @Override // hj0.AbstractActivityC17350i
    /* JADX INFO: renamed from: v, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }
}
