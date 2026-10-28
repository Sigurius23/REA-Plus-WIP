package com.whoop.community.presentation.login;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Slide;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.whoop.community.presentation.login.InviteCodeActivity;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.teams.TeamsShowInviteActivity;
import eq0.AbstractC13446c;
import hj0.AbstractActivityC17360s;
import in2.AbstractC18737i;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import nf1.AbstractC26662c;
import oq0.C28104a;
import oq0.C28107d;
import oq0.C28108e;
import oq0.C28110g;
import p114eb.C12962i;
import p161g.AbstractC14917t;
import p314m.AbstractC24830b;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import vu1.AbstractC36510a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38505d0;
import yb3.AbstractC39414r;
import yp0.AbstractC39701b;
import yp0.InterfaceC39700a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u001c¨\u0006H"}, m65681d2 = {"Lcom/whoop/community/presentation/login/InviteCodeActivity;", "Lhj0/s;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "p", "()Ljava/lang/String;", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "h0", "V", "l0", "m0", "()Z", "Z", "n0", "Loq0/g;", "viewState", "w0", "(Loq0/g;)V", "b0", "Lcom/whoop/domain/model/Invitation;", "invitation", "f0", "(Lcom/whoop/domain/model/Invitation;)V", "d0", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "invite", "e0", "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V", "g0", "a0", "Loq0/e;", "I", "Ll83/h;", "Y", "()Loq0/e;", "viewModel", "Lyp0/a;", "J", "X", "()Lyp0/a;", "communityAccessChecker", "Loq0/d;", "K", "Leb/i;", "W", "()Loq0/d;", "args", "Leq0/c;", "L", "Leq0/c;", "inviteCodeBinding", "c0", "isFromCommunityLanding", "M", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InviteCodeActivity extends AbstractActivityC17360s {

    /* JADX INFO: renamed from: N */
    public static final int f24980N = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6345g(this, null, new C6344f(this), null));

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h communityAccessChecker = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6342d(this, null, null));

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28107d.class), new C6343e(this));

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AbstractC13446c inviteCodeBinding;

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.InviteCodeActivity$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/community/presentation/login/InviteCodeActivity$b", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6340b extends AbstractC14917t {
        public C6340b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            InviteCodeActivity.this.m19311Z();
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.InviteCodeActivity$c */
    @Metadata(m65680d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m65681d2 = {"com/whoop/community/presentation/login/InviteCodeActivity$c", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "charSequence", "before", "onTextChanged", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6341c implements TextWatcher {
        public C6341c() {
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
            InviteCodeActivity.this.m19307V();
            InviteCodeActivity.this.m19310Y().m84971O(charSequence);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.InviteCodeActivity$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6342d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24987w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24988x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24989y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6342d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24987w = componentCallbacks;
            this.f24988x = interfaceC35951a;
            this.f24989y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yp0.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC39700a invoke() {
            ComponentCallbacks componentCallbacks = this.f24987w;
            InterfaceC35951a interfaceC35951a = this.f24988x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24989y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC39700a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.InviteCodeActivity$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6343e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Activity f24990w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6343e(Activity activity) {
            super(0);
            this.f24990w = activity;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle extras;
            Intent intent = this.f24990w.getIntent();
            if (intent != null) {
                Activity activity = this.f24990w;
                extras = intent.getExtras();
                if (extras == null) {
                    throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
                }
            } else {
                extras = null;
            }
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + this.f24990w + " has a null Intent");
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.InviteCodeActivity$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6344f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24991w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6344f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24991w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24991w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.InviteCodeActivity$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6345g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24992w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24993x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24994y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24995z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6345g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24992w = componentCallbacks;
            this.f24993x = interfaceC35951a;
            this.f24994y = interfaceC4339a;
            this.f24995z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, oq0.e] */
        @Override // c93.InterfaceC4339a
        public final C28108e invoke() {
            return AbstractC34132o.m107857B(this.f24992w, this.f24993x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28108e.class), this.f24994y, this.f24995z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public final void m19307V() {
        AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c == null) {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
        abstractC13446c.f47157j.setVisibility(8);
        boolean zM19324m0 = m19324m0();
        abstractC13446c.f47158k.setEnabled(zM19324m0);
        abstractC13446c.f47158k.setTextColor(getColor(zM19324m0 ? AbstractC36510a.f156040s : AbstractC36510a.f156009R));
    }

    /* JADX INFO: renamed from: W */
    private final C28107d m19308W() {
        return (C28107d) this.args.getValue();
    }

    /* JADX INFO: renamed from: X */
    private final InterfaceC39700a m19309X() {
        return (InterfaceC39700a) this.communityAccessChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final C28108e m19310Y() {
        return (C28108e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public final void m19311Z() {
        m19310Y().m84969M();
        finish();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m19312a0() {
        Object systemService = getSystemService("input_method");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c != null) {
            inputMethodManager.hideSoftInputFromWindow(abstractC13446c.f47154g.getWindowToken(), 0);
        } else {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m19313b0() {
        AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c == null) {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
        abstractC13446c.f47155h.getRoot().setTransitionName("backArrow");
        m49161F("navigationBar");
        abstractC13446c.f47155h.getRoot().setTransitionGroup(true);
    }

    /* JADX INFO: renamed from: c0 */
    private final boolean m19314c0() {
        return getIntent().getBooleanExtra("fromCommunityLanding", false);
    }

    /* JADX INFO: renamed from: d0 */
    private final void m19315d0() {
        Intent intent = new Intent("android.intent.action.VIEW", AbstractC39701b.m127034a());
        intent.setClassName(getBaseContext(), "com.whoop.ui.home.redesign.view.MainActivity");
        intent.setFlags(268468224);
        getBaseContext().startActivity(intent);
    }

    /* JADX INFO: renamed from: e0 */
    private final void m19316e0(DrawerDisplayInvite invite) {
        Intent intent = new Intent();
        intent.setClassName(getBaseContext(), "com.whoop.ui.home.redesign.view.MainActivity");
        intent.setFlags(268468224);
        intent.putExtra("invitePojo", invite);
        getBaseContext().startActivity(intent);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m19317f0(Invitation invitation) {
        Slide slide = new Slide(3);
        AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c == null) {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
        slide.excludeTarget((View) abstractC13446c.f47149b, true);
        slide.setDuration(1000);
        slide.excludeTarget(R.id.statusBarBackground, true);
        slide.excludeTarget(R.id.navigationBarBackground, true);
        getWindow().setExitTransition(slide);
        getWindow().setAllowEnterTransitionOverlap(false);
        getWindow().setAllowReturnTransitionOverlap(false);
        JoinTeamActivity.C6347b c6347bM19350r = JoinTeamActivity.m19345Q(this, invitation).m19351s(1000).m19350r(this);
        AbstractC13446c abstractC13446c2 = this.inviteCodeBinding;
        if (abstractC13446c2 != null) {
            c6347bM19350r.m19352c(abstractC13446c2.f47149b).m19353d(m49160E()).m49163a().m49155n(this, 324);
        } else {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m19318g0(DrawerDisplayInvite invite) {
        if (!m19314c0()) {
            TeamsShowInviteActivity.INSTANCE.m27393a(this, invite).m49148e().m49155n(this, 324);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("invitePojo", invite);
        setResult(899, intent);
        finish();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m19319h0() {
        final AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c == null) {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
        FrameLayout root = abstractC13446c.f47155h.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        AbstractC1953c.m5963a(root, new C28104a(this, 0));
        StrokedPillButton inviteCodeNextButton = abstractC13446c.f47158k;
        AbstractC22676k.m65749i(inviteCodeNextButton, "inviteCodeNextButton");
        AbstractC1953c.m5963a(inviteCodeNextButton, new C28104a(this, 2));
        abstractC13446c.f47154g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: oq0.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                return InviteCodeActivity.m19322k0(this.f113663a, abstractC13446c, textView, i13, keyEvent);
            }
        });
        EditText editText = abstractC13446c.f47154g.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C6341c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m19320i0(InviteCodeActivity inviteCodeActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        inviteCodeActivity.onBackPressed();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m19321j0(InviteCodeActivity inviteCodeActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        inviteCodeActivity.m19310Y().m84972P();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final boolean m19322k0(InviteCodeActivity inviteCodeActivity, AbstractC13446c abstractC13446c, TextView textView, int i13, KeyEvent keyEvent) {
        if (i13 != 6 && keyEvent.getKeyCode() != 66) {
            return false;
        }
        inviteCodeActivity.m19312a0();
        abstractC13446c.f47158k.performClick();
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    private final void m19323l0() {
        setSupportActionBar((Toolbar) findViewById(AbstractC38499a0.f165417t7));
        AbstractC24830b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo72834w(getString(AbstractC38505d0.f165717t0));
            supportActionBar.mo72826o(true);
            supportActionBar.mo72829r(AbstractC26662c.f105981c);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final boolean m19324m0() {
        AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c != null) {
            Editable text = abstractC13446c.f47154g.getText();
            return !(text == null || AbstractC39414r.m125890i0(text));
        }
        AbstractC22676k.m65757q("inviteCodeBinding");
        throw null;
    }

    /* JADX INFO: renamed from: n0 */
    private final void m19325n0() {
        m19310Y().m84966G().m35577c(this, new C28104a(this, 3));
        final int i13 = 0;
        m19310Y().getActionHideKeyboard().m85329c(this, new InterfaceC4339a(this) { // from class: oq0.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ InviteCodeActivity f113666x;

            {
                this.f113666x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return InviteCodeActivity.m19327p0(this.f113666x);
                    default:
                        return InviteCodeActivity.m19328q0(this.f113666x);
                }
            }
        });
        final int i14 = 1;
        m19310Y().getActionClearFocus().m85329c(this, new InterfaceC4339a(this) { // from class: oq0.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ InviteCodeActivity f113666x;

            {
                this.f113666x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return InviteCodeActivity.m19327p0(this.f113666x);
                    default:
                        return InviteCodeActivity.m19328q0(this.f113666x);
                }
            }
        });
        m19310Y().m84964D().m85346c(this, new C28104a(this, 4));
        m19310Y().m84962B().m85346c(this, new C28104a(this, 5));
        m19310Y().m84961A().m85346c(this, new C28104a(this, 6));
        m19310Y().m84963C().m85346c(this, new C28104a(this, 7));
        m19310Y().m84976z().m85346c(this, new C28104a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m19326o0(InviteCodeActivity inviteCodeActivity, C28110g viewState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        inviteCodeActivity.m19334w0(viewState);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m19327p0(InviteCodeActivity inviteCodeActivity) {
        inviteCodeActivity.m19312a0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m19328q0(InviteCodeActivity inviteCodeActivity) {
        View currentFocus = inviteCodeActivity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m19329r0(InviteCodeActivity inviteCodeActivity, int i13) {
        AbstractC18737i.m54481f(inviteCodeActivity, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m19330s0(InviteCodeActivity inviteCodeActivity, Invitation invite) {
        AbstractC22676k.m65750j(invite, "invite");
        inviteCodeActivity.m19317f0(invite);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m19331t0(InviteCodeActivity inviteCodeActivity, DrawerDisplayInvite invite) {
        AbstractC22676k.m65750j(invite, "invite");
        inviteCodeActivity.m19316e0(invite);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m19332u0(InviteCodeActivity inviteCodeActivity, DrawerDisplayInvite invite) {
        AbstractC22676k.m65750j(invite, "invite");
        inviteCodeActivity.m19318g0(invite);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m19333v0(InviteCodeActivity inviteCodeActivity, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        inviteCodeActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.VIEW", uri), inviteCodeActivity.getString(AbstractC38505d0.f165629W)));
        inviteCodeActivity.finish();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m19334w0(C28110g viewState) {
        AbstractC13446c abstractC13446c = this.inviteCodeBinding;
        if (abstractC13446c == null) {
            AbstractC22676k.m65757q("inviteCodeBinding");
            throw null;
        }
        Integer inviteCodeErrorTextId = viewState.getInviteCodeErrorTextId();
        if (inviteCodeErrorTextId != null) {
            abstractC13446c.f47157j.setText(inviteCodeErrorTextId.intValue());
        } else {
            abstractC13446c.f47157j.setText("");
        }
        abstractC13446c.f47157j.setVisibility(viewState.getInviteCodeErrorVisibility());
        EditText editText = abstractC13446c.f47154g.getEditText();
        if (editText != null && !AbstractC22676k.m65745e(editText.getText().toString(), viewState.getInviteCode())) {
            editText.setText(viewState.getInviteCode());
        }
        Integer inviteCodeSelection = viewState.getInviteCodeSelection();
        if (inviteCodeSelection != null) {
            int iIntValue = inviteCodeSelection.intValue();
            EditText editText2 = abstractC13446c.f47154g.getEditText();
            AbstractC22676k.m65747g(editText2);
            editText2.setSelection(iIntValue);
        }
        abstractC13446c.f47149b.setImageResource(viewState.getBackgroundResId());
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    @InterfaceC23457c
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 324 && resultCode == -1) {
            supportFinishAfterTransition();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // hj0.AbstractActivityC17360s, hj0.AbstractActivityC17361t, hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String strM84939a;
        super.onCreate(savedInstanceState);
        if (m19309X().mo31687a()) {
            m19315d0();
            finish();
            return;
        }
        AbstractC13446c abstractC13446cM38175c = AbstractC13446c.m38175c(getLayoutInflater());
        AbstractC22676k.m65749i(abstractC13446cM38175c, "inflate(...)");
        this.inviteCodeBinding = abstractC13446cM38175c;
        setContentView(abstractC13446cM38175c.getRoot());
        m19323l0();
        m19319h0();
        m19307V();
        m19325n0();
        m19310Y().m84970N(getIntent().getAction(), getIntent().getData());
        m19313b0();
        if (getIntent().getData() == null && (strM84939a = m19308W().m84939a()) != null) {
            m19310Y().m84973U(true);
            m19310Y().m84971O(AbstractC39414r.m125869O0(strM84939a).toString());
            if (strM84939a.length() > 0) {
                m19310Y().m84972P();
            }
        }
        getOnBackPressedDispatcher().m43015a(this, new C6340b());
    }

    @Override // hj0.AbstractActivityC17347f, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // hj0.AbstractActivityC17347f
    /* JADX INFO: renamed from: p */
    public String mo19335p() {
        return "Validate Invite Code - Join Team";
    }
}
