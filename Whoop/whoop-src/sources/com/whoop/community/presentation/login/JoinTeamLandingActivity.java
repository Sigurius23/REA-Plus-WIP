package com.whoop.community.presentation.login;

import android.R;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Slide;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.community.presentation.login.JoinTeamLandingActivity;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.teams.TeamsShowInviteActivity;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13466g;
import hj0.AbstractActivityC17347f;
import in2.AbstractC18737i;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n40.ViewTreeObserverOnGlobalLayoutListenerC26261a;
import oq0.C28112i;
import oq0.C28114k;
import oq0.C28116m;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u0004*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;", "Lhj0/f;", "<init>", "()V", "Ll83/a0;", "W", "c0", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "a0", "(Landroid/view/View;)V", "Landroid/widget/ScrollView;", "V", "(Landroid/widget/ScrollView;)V", "d0", "T", "U", "Lcom/whoop/domain/model/Invitation;", "invitation", "R", "(Lcom/whoop/domain/model/Invitation;)V", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "invite", "S", "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V", "Loq0/m;", "viewState", "k0", "(Loq0/m;)V", "Q", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Loq0/k;", "I", "Ll83/h;", "P", "()Loq0/k;", "viewModel", "Leq0/g;", "J", "Leq0/g;", "joinTeamLandingBinding", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JoinTeamLandingActivity extends AbstractActivityC17347f {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6351c(this, null, new C6350b(this), null));

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private AbstractC13466g joinTeamLandingBinding;

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.JoinTeamLandingActivity$a */
    @Metadata(m65680d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m65681d2 = {"com/whoop/community/presentation/login/JoinTeamLandingActivity$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "charSequence", "before", "onTextChanged", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6349a implements TextWatcher {
        public C6349a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s13, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
            AbstractC22676k.m65750j(charSequence, "charSequence");
            JoinTeamLandingActivity.this.m19366P().m85008G(charSequence);
            if (charSequence.length() > 0) {
                AbstractC13466g abstractC13466g = JoinTeamLandingActivity.this.joinTeamLandingBinding;
                if (abstractC13466g != null) {
                    abstractC13466g.f47303o.setAlpha(1.0f);
                    return;
                } else {
                    AbstractC22676k.m65757q("joinTeamLandingBinding");
                    throw null;
                }
            }
            AbstractC13466g abstractC13466g2 = JoinTeamLandingActivity.this.joinTeamLandingBinding;
            if (abstractC13466g2 != null) {
                abstractC13466g2.f47303o.setAlpha(0.5f);
            } else {
                AbstractC22676k.m65757q("joinTeamLandingBinding");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.JoinTeamLandingActivity$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6350b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25013w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6350b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25013w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25013w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.JoinTeamLandingActivity$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6351c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25014w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25015x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25016y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25017z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6351c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25014w = componentCallbacks;
            this.f25015x = interfaceC35951a;
            this.f25016y = interfaceC4339a;
            this.f25017z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, oq0.k] */
        @Override // c93.InterfaceC4339a
        public final C28114k invoke() {
            return AbstractC34132o.m107857B(this.f25014w, this.f25015x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28114k.class), this.f25016y, this.f25017z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final C28114k m19366P() {
        return (C28114k) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final void m19367Q() {
        Object systemService = getSystemService("input_method");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AbstractC13466g abstractC13466g = this.joinTeamLandingBinding;
        if (abstractC13466g != null) {
            inputMethodManager.hideSoftInputFromWindow(abstractC13466g.f47299k.getWindowToken(), 0);
        } else {
            AbstractC22676k.m65757q("joinTeamLandingBinding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m19368R(Invitation invitation) {
        Slide slide = new Slide(3);
        slide.setDuration(400);
        slide.excludeTarget(R.id.statusBarBackground, true);
        slide.excludeTarget(R.id.navigationBarBackground, true);
        getWindow().setExitTransition(slide);
        getWindow().setAllowEnterTransitionOverlap(false);
        getWindow().setAllowReturnTransitionOverlap(false);
        JoinTeamActivity.m19345Q(this, invitation).m19351s(450).m19350r(this).m49163a().m49154m();
    }

    /* JADX INFO: renamed from: S */
    private final void m19369S(DrawerDisplayInvite invite) {
        TeamsShowInviteActivity.INSTANCE.m27393a(this, invite).m49154m();
    }

    /* JADX INFO: renamed from: T */
    private final void m19370T() {
        m49099s().m128982C0();
        m19366P().m85009H();
    }

    /* JADX INFO: renamed from: U */
    private final void m19371U() {
        m49099s().m129058t();
        startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(getString(AbstractC38505d0.f165586H1))), "Choose browser"));
    }

    /* JADX INFO: renamed from: V */
    private final void m19372V(ScrollView scrollView) {
        scrollView.smoothScrollBy(0, (scrollView.getPaddingBottom() + scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom()) - (scrollView.getHeight() + scrollView.getScrollY()));
    }

    /* JADX INFO: renamed from: W */
    private final void m19373W() {
        AbstractC13466g abstractC13466g = this.joinTeamLandingBinding;
        if (abstractC13466g == null) {
            AbstractC22676k.m65757q("joinTeamLandingBinding");
            throw null;
        }
        StrokedPillButton joinTeamBrowseTeam = abstractC13466g.f47298j;
        AbstractC22676k.m65749i(joinTeamBrowseTeam, "joinTeamBrowseTeam");
        AbstractC1953c.m5963a(joinTeamBrowseTeam, new C28112i(this, 0));
        ImageView backArrow = abstractC13466g.f47289a;
        AbstractC22676k.m65749i(backArrow, "backArrow");
        AbstractC1953c.m5963a(backArrow, new C28112i(this, 1));
        StrokedPillButton joinTeamSubmitCode = abstractC13466g.f47303o;
        AbstractC22676k.m65749i(joinTeamSubmitCode, "joinTeamSubmitCode");
        AbstractC1953c.m5963a(joinTeamSubmitCode, new C28112i(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m19374X(JoinTeamLandingActivity joinTeamLandingActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        joinTeamLandingActivity.m19371U();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m19375Y(JoinTeamLandingActivity joinTeamLandingActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        joinTeamLandingActivity.finish();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m19376Z(JoinTeamLandingActivity joinTeamLandingActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        joinTeamLandingActivity.m19370T();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m19377a0(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC26261a(view, 1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m19378b0(View view, JoinTeamLandingActivity joinTeamLandingActivity) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (Math.abs(view.getRootView().getHeight() - (rect.bottom - rect.top)) > 100) {
            AbstractC13466g abstractC13466g = joinTeamLandingActivity.joinTeamLandingBinding;
            if (abstractC13466g == null) {
                AbstractC22676k.m65757q("joinTeamLandingBinding");
                throw null;
            }
            ScrollView joinTeamScrollView = abstractC13466g.f47302n;
            AbstractC22676k.m65749i(joinTeamScrollView, "joinTeamScrollView");
            joinTeamLandingActivity.m19372V(joinTeamScrollView);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final void m19379c0() {
        AbstractC13466g abstractC13466g = this.joinTeamLandingBinding;
        if (abstractC13466g == null) {
            AbstractC22676k.m65757q("joinTeamLandingBinding");
            throw null;
        }
        EditText editText = abstractC13466g.f47299k.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C6349a());
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m19380d0() {
        m19366P().m85006C().m35577c(this, new C28112i(this, 3));
        final int i13 = 0;
        m19366P().getActionHideKeyboard().m85329c(this, new InterfaceC4339a(this) { // from class: oq0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ JoinTeamLandingActivity f113716x;

            {
                this.f113716x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return JoinTeamLandingActivity.m19382f0(this.f113716x);
                    default:
                        return JoinTeamLandingActivity.m19383g0(this.f113716x);
                }
            }
        });
        final int i14 = 1;
        m19366P().getActionClearFocus().m85329c(this, new InterfaceC4339a(this) { // from class: oq0.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ JoinTeamLandingActivity f113716x;

            {
                this.f113716x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return JoinTeamLandingActivity.m19382f0(this.f113716x);
                    default:
                        return JoinTeamLandingActivity.m19383g0(this.f113716x);
                }
            }
        });
        m19366P().m85005A().m85346c(this, new C28112i(this, 4));
        m19366P().m85012y().m85346c(this, new C28112i(this, 5));
        m19366P().m85013z().m85346c(this, new C28112i(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m19381e0(JoinTeamLandingActivity joinTeamLandingActivity, C28116m viewState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        joinTeamLandingActivity.m19387k0(viewState);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m19382f0(JoinTeamLandingActivity joinTeamLandingActivity) {
        joinTeamLandingActivity.m19367Q();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m19383g0(JoinTeamLandingActivity joinTeamLandingActivity) {
        View currentFocus = joinTeamLandingActivity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m19384h0(JoinTeamLandingActivity joinTeamLandingActivity, int i13) {
        AbstractC18737i.m54481f(joinTeamLandingActivity, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m19385i0(JoinTeamLandingActivity joinTeamLandingActivity, Invitation invite) {
        AbstractC22676k.m65750j(invite, "invite");
        joinTeamLandingActivity.m19368R(invite);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m19386j0(JoinTeamLandingActivity joinTeamLandingActivity, DrawerDisplayInvite invite) {
        AbstractC22676k.m65750j(invite, "invite");
        joinTeamLandingActivity.m19369S(invite);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m19387k0(C28116m viewState) {
        AbstractC13466g abstractC13466g = this.joinTeamLandingBinding;
        if (abstractC13466g == null) {
            AbstractC22676k.m65757q("joinTeamLandingBinding");
            throw null;
        }
        Integer errorTextId = viewState.getErrorTextId();
        if (errorTextId != null) {
            abstractC13466g.f47300l.setText(errorTextId.intValue());
        } else {
            abstractC13466g.f47300l.setText("");
        }
        abstractC13466g.f47300l.setVisibility(viewState.getErrorVisibility());
        EditText editText = abstractC13466g.f47299k.getEditText();
        if (editText != null && !AbstractC22676k.m65745e(editText.getText().toString(), viewState.getInviteCode())) {
            editText.setText(viewState.getInviteCode());
        }
        Integer inviteCodeSelection = viewState.getInviteCodeSelection();
        if (inviteCodeSelection != null) {
            int iIntValue = inviteCodeSelection.intValue();
            EditText editText2 = abstractC13466g.f47299k.getEditText();
            AbstractC22676k.m65747g(editText2);
            editText2.setSelection(iIntValue);
        }
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC13466g abstractC13466gM38189c = AbstractC13466g.m38189c(getLayoutInflater());
        AbstractC22676k.m65749i(abstractC13466gM38189c, "inflate(...)");
        this.joinTeamLandingBinding = abstractC13466gM38189c;
        setContentView(abstractC13466gM38189c.getRoot());
        m19373W();
        m19380d0();
        m19379c0();
        AbstractC13466g abstractC13466g = this.joinTeamLandingBinding;
        if (abstractC13466g == null) {
            AbstractC22676k.m65757q("joinTeamLandingBinding");
            throw null;
        }
        ScrollView joinTeamScrollView = abstractC13466g.f47302n;
        AbstractC22676k.m65749i(joinTeamScrollView, "joinTeamScrollView");
        m19377a0(joinTeamScrollView);
    }
}
