package com.whoop.community.presentation.login;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC1329o1;
import bh3.InterfaceC3256c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.whoop.community.presentation.login.JoinTeamActivity;
import com.whoop.community.presentation.teams.JoinTeamConfirmationActivity;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.User;
import com.whoop.p069ui.C10540h;
import com.whoop.p069ui.C10594l;
import com.whoop.p069ui.C10608r;
import com.whoop.service.network.model.ClaimInviteResponse;
import cq0.C11054b;
import e50.C12723b;
import ge3.AbstractC15751g;
import hj0.AbstractActivityC17361t;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.ViewOnClickListenerC19855d;
import jo.ViewOnClickListenerC21821j;
import lr.RunnableC24693e;
import or2.C28169i0;
import p283kl.AbstractC22559h;
import p586wk.C37329g;
import pg3.C29218v0;
import pl.C29341d;
import qr2.AbstractC30556a;
import se.AbstractC32411b;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import vu1.AbstractC36512c;
import xg3.C38280g;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes7.dex */
public class JoinTeamActivity extends AbstractActivityC17361t {

    /* JADX INFO: renamed from: K */
    private static int f24996K = 400;

    /* JADX INFO: renamed from: I */
    private C6348c f24997I;

    /* JADX INFO: renamed from: J */
    private InterfaceC34116n f24998J = new C34117o(C12723b.m35566a().m35569d(), "Join Team");

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.JoinTeamActivity$a */
    public static class C6346a extends AbstractActivityC17361t.b<C6347b> {
        public C6346a(Context context, Invitation invitation) {
            super(context, (Class<?>) JoinTeamActivity.class);
            m49150i().putExtra("invitation", C28169i0.m85278i(invitation));
        }

        /* JADX INFO: renamed from: r */
        public C6347b m19350r(Activity activity) {
            return new C6347b(activity, this);
        }

        /* JADX INFO: renamed from: s */
        public C6346a m19351s(int i13) {
            m49150i().putExtra("transitionDelay", i13);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.JoinTeamActivity$b */
    public static class C6347b extends AbstractActivityC17361t.c<C6346a> {
        public C6347b(Activity activity, C6346a c6346a) {
            super(activity, c6346a);
        }

        /* JADX INFO: renamed from: c */
        public C6347b m19352c(View view) {
            m49164b("background", view);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C6347b m19353d(View view) {
            if (view != null) {
                m49164b("navigationBar", view);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.login.JoinTeamActivity$c */
    public static class C6348c {

        /* JADX INFO: renamed from: a */
        View f24999a;

        /* JADX INFO: renamed from: b */
        View f25000b;

        /* JADX INFO: renamed from: c */
        View f25001c;

        /* JADX INFO: renamed from: d */
        ViewGroup f25002d;

        /* JADX INFO: renamed from: e */
        ImageView f25003e;

        /* JADX INFO: renamed from: f */
        ViewGroup f25004f;

        /* JADX INFO: renamed from: g */
        ImageView f25005g;

        /* JADX INFO: renamed from: h */
        TextView f25006h;

        /* JADX INFO: renamed from: i */
        ViewGroup f25007i;

        /* JADX INFO: renamed from: j */
        View f25008j;

        /* JADX INFO: renamed from: k */
        View f25009k;

        public C6348c(Activity activity) {
            this.f24999a = activity.findViewById(AbstractC38499a0.f165067G);
            this.f25000b = activity.findViewById(AbstractC38499a0.f165436w);
            this.f25001c = activity.findViewById(AbstractC38499a0.f165022B);
            this.f25002d = (ViewGroup) activity.findViewById(AbstractC38499a0.f165058F);
            this.f25003e = (ImageView) activity.findViewById(AbstractC38499a0.f165049E);
            this.f25004f = (ViewGroup) activity.findViewById(AbstractC38499a0.f165040D);
            this.f25005g = (ImageView) activity.findViewById(AbstractC38499a0.f165031C);
            this.f25006h = (TextView) activity.findViewById(AbstractC38499a0.f165013A);
            this.f25007i = (ViewGroup) activity.findViewById(AbstractC38499a0.f165445x);
            this.f25008j = activity.findViewById(AbstractC38499a0.f165454y);
            this.f25009k = activity.findViewById(AbstractC38499a0.f165463z);
        }
    }

    /* JADX INFO: renamed from: L */
    private void m19340L() {
        m49099s().m128985E();
        setResult(0);
        supportFinishAfterTransition();
    }

    /* JADX INFO: renamed from: M */
    private Invitation m19341M() {
        String stringExtra = getIntent().getStringExtra("invitation");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return (Invitation) C28169i0.m85275e(stringExtra, Invitation.class);
    }

    /* JADX INFO: renamed from: N */
    private int m19342N() {
        return getIntent().getIntExtra("transitionDelay", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m19346R(C29218v0<ClaimInviteResponse> c29218v0, C10540h c10540h, Invitation invitation, User user) {
        if (c10540h != null) {
            c10540h.dismiss();
        }
        if (c29218v0 == null || !c29218v0.f118269a.f146788Q) {
            C10608r.m27365b(this, AbstractC38505d0.f165645b, 1).show();
            return;
        }
        JoinTeamConfirmationActivity.m19416M(this, invitation, user).m19420t(f24996K).m19419s(this).m19425f(this.f24997I.f24999a).m19422c(this.f24997I.f25000b).m19423d(m49160E()).m19424e(this.f24997I.f25004f).m49163a().m49154m();
        setResult(-1);
        supportFinishAfterTransition();
    }

    /* JADX INFO: renamed from: P */
    private void m19344P() {
        this.f24997I.f24999a.setTransitionName("whoopLogo");
        this.f24997I.f25000b.setTransitionName("background");
        m49161F("navigationBar");
        this.f24997I.f25007i.setTransitionGroup(true);
        this.f24997I.f25002d.setTransitionGroup(true);
        this.f24997I.f25004f.setTransitionGroup(true);
        Slide slide = new Slide(5);
        slide.excludeTarget(this.f24997I.f24999a, true);
        slide.excludeTarget(this.f24997I.f25000b, true);
        slide.excludeTarget(R.id.statusBarBackground, true);
        slide.excludeTarget(R.id.navigationBarBackground, true);
        slide.setDuration(400L);
        getWindow().setEnterTransition(slide);
        getWindow().setAllowReturnTransitionOverlap(false);
        getWindow().setAllowEnterTransitionOverlap(false);
        postponeEnterTransition();
        AbstractC32411b.m101066J().postDelayed(new RunnableC24693e(this, 5), m19342N());
        Slide slide2 = new Slide(3);
        slide2.excludeTarget(this.f24997I.f24999a, true);
        slide2.excludeTarget(this.f24997I.f25000b, true);
        slide2.excludeTarget((View) this.f24997I.f25004f, true);
        slide2.excludeTarget(R.id.statusBarBackground, true);
        slide2.excludeTarget(R.id.navigationBarBackground, true);
        slide2.setDuration(f24996K);
        getWindow().setExitTransition(slide2);
    }

    /* JADX INFO: renamed from: Q */
    public static C6346a m19345Q(Context context, Invitation invitation) {
        return new C6346a(context, invitation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m19347S(Invitation invitation, User user, Throwable th3, C10540h c10540h) {
        m19346R(null, c10540h, invitation, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m19348T(final Invitation invitation, final User user, View view) {
        m49099s().m128979B();
        AbstractC1329o1 abstractC1329o1M49102v = m49102v();
        String string = getString(AbstractC38505d0.f165653d);
        C10594l c10594lM49098r = m49098r();
        C38280g<C29218v0<ClaimInviteResponse>> c38280gM29719a = ((C11054b) AbstractC15751g.m44472y(C11054b.class, null, null)).m29719a(invitation);
        final int i13 = 0;
        InterfaceC3256c interfaceC3256c = new InterfaceC3256c(this) { // from class: oq0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ JoinTeamActivity f113710x;

            {
                this.f113710x = this;
            }

            @Override // bh3.InterfaceC3256c
            /* JADX INFO: renamed from: c */
            public final void mo9473c(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        this.f113710x.m19346R(invitation, user, (C29218v0) obj, (C10540h) obj2);
                        break;
                    default:
                        this.f113710x.m19347S(invitation, user, (Throwable) obj, (C10540h) obj2);
                        break;
                }
            }
        };
        final int i14 = 1;
        C10540h.m27198L(abstractC1329o1M49102v, "JoinTeam", string, null, c10594lM49098r, c38280gM29719a, interfaceC3256c, new InterfaceC3256c(this) { // from class: oq0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ JoinTeamActivity f113710x;

            {
                this.f113710x = this;
            }

            @Override // bh3.InterfaceC3256c
            /* JADX INFO: renamed from: c */
            public final void mo9473c(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        this.f113710x.m19346R(invitation, user, (C29218v0) obj, (C10540h) obj2);
                        break;
                    default:
                        this.f113710x.m19347S(invitation, user, (Throwable) obj, (C10540h) obj2);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m19349U(View view) {
        m19340L();
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void onBackPressed() {
        m19340L();
    }

    @Override // hj0.AbstractActivityC17361t, hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m49096B();
        Session sessionM84057h = C12723b.m35566a().m35572g().m84057h();
        User user = sessionM84057h != null ? sessionM84057h.getUser() : null;
        if (user == null) {
            this.f24998J.mo85222m("No current user, aborting", new AbstractC30556a.a[0]);
            finish();
            return;
        }
        Invitation invitationM19341M = m19341M();
        if (invitationM19341M == null) {
            this.f24998J.mo85222m("No invite code found, aborting", new AbstractC30556a.a[0]);
            finish();
            return;
        }
        setContentView(AbstractC38501b0.f165511d);
        this.f24997I = new C6348c(this);
        m19344P();
        this.f24997I.f25006h.setText(getString(AbstractC38505d0.f165649c, user.getFullName(), invitationM19341M.getTeamName()));
        ComponentCallbacks2C4966h componentCallbacks2C4966hM75569h = ComponentCallbacks2C4960b.m15528d(this).m75569h(this);
        C4964f c4964fM15549m = componentCallbacks2C4966hM75569h.m15549m(user.getAvatarUrl());
        C29341d c29341d = (C29341d) new C29341d().m89319j(AbstractC36512c.f156071n);
        c29341d.getClass();
        C37329g c37329g = AbstractC22559h.f88754b;
        Boolean bool = Boolean.TRUE;
        c4964fM15549m.mo15533a(c29341d.m89324p(c37329g, bool)).m15537y(this.f24997I.f25003e);
        C4964f c4964fM15549m2 = componentCallbacks2C4966hM75569h.m15549m(invitationM19341M.getTeamIcon());
        C29341d c29341d2 = (C29341d) new C29341d().m89319j(AbstractC36512c.f156071n);
        c29341d2.getClass();
        c4964fM15549m2.mo15533a(c29341d2.m89324p(c37329g, bool)).m15537y(this.f24997I.f25005g);
        this.f24997I.f25008j.setOnClickListener(new ViewOnClickListenerC19855d(this, invitationM19341M, user, 2));
        this.f24997I.f25009k.setOnClickListener(new ViewOnClickListenerC21821j(this, 9));
    }
}
