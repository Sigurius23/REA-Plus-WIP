package com.whoop.community.presentation.teams;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.User;
import com.whoop.service.network.model.UserState;
import e50.C12723b;
import hj0.AbstractActivityC17361t;
import jo.ViewOnClickListenerC21821j;
import or2.C28169i0;
import p283kl.AbstractC22559h;
import pl.C29341d;
import qr2.AbstractC30556a;
import se.AbstractC32411b;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes7.dex */
public class JoinTeamConfirmationActivity extends AbstractActivityC17361t {

    /* JADX INFO: renamed from: I */
    private C6360d f25037I;

    /* JADX INFO: renamed from: J */
    private InterfaceC34116n f25038J = new C34117o(C12723b.m35566a().m35569d(), "Join Team Confirmation");

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.JoinTeamConfirmationActivity$a */
    public class RunnableC6357a implements Runnable {
        public RunnableC6357a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            JoinTeamConfirmationActivity.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.JoinTeamConfirmationActivity$b */
    public static class C6358b extends AbstractActivityC17361t.b<C6359c> {
        public C6358b(Context context, Invitation invitation, User user) {
            super(context, (Class<?>) JoinTeamConfirmationActivity.class);
            m19418r(invitation);
            m19421u(user);
        }

        /* JADX INFO: renamed from: r */
        public C6358b m19418r(Invitation invitation) {
            m49150i().putExtra("invitation", C28169i0.m85278i(invitation));
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C6359c m19419s(Activity activity) {
            return new C6359c(activity, this);
        }

        /* JADX INFO: renamed from: t */
        public C6358b m19420t(int i13) {
            m49150i().putExtra("transitionDelay", i13);
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C6358b m19421u(User user) {
            m49150i().putExtra(UserState.Sources.USER, C28169i0.m85278i(user));
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.JoinTeamConfirmationActivity$c */
    public static class C6359c extends AbstractActivityC17361t.c<C6358b> {
        public C6359c(Activity activity, C6358b c6358b) {
            super(activity, c6358b);
        }

        /* JADX INFO: renamed from: c */
        public C6359c m19422c(View view) {
            m49164b("background", view);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C6359c m19423d(View view) {
            if (view != null) {
                m49164b("navigationBar", view);
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C6359c m19424e(View view) {
            m49164b("teamIcon", view);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C6359c m19425f(View view) {
            m49164b("whoopLogo", view);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.JoinTeamConfirmationActivity$d */
    public static class C6360d {

        /* JADX INFO: renamed from: a */
        View f25040a;

        /* JADX INFO: renamed from: b */
        View f25041b;

        /* JADX INFO: renamed from: c */
        ViewGroup f25042c;

        /* JADX INFO: renamed from: d */
        ImageView f25043d;

        /* JADX INFO: renamed from: e */
        TextView f25044e;

        /* JADX INFO: renamed from: f */
        View f25045f;

        public C6360d(Activity activity) {
            this.f25040a = activity.findViewById(AbstractC38499a0.f165382q);
            this.f25041b = activity.findViewById(AbstractC38499a0.f165427v);
            this.f25042c = (ViewGroup) activity.findViewById(AbstractC38499a0.f165418u);
            this.f25043d = (ImageView) activity.findViewById(AbstractC38499a0.f165409t);
            this.f25044e = (TextView) activity.findViewById(AbstractC38499a0.f165400s);
            this.f25045f = activity.findViewById(AbstractC38499a0.f165391r);
        }
    }

    /* JADX INFO: renamed from: I */
    private Invitation m19412I() {
        String stringExtra = getIntent().getStringExtra("invitation");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return (Invitation) C28169i0.m85275e(stringExtra, Invitation.class);
    }

    /* JADX INFO: renamed from: J */
    private int m19413J() {
        return getIntent().getIntExtra("transitionDelay", 0);
    }

    /* JADX INFO: renamed from: K */
    private User m19414K() {
        String stringExtra = getIntent().getStringExtra(UserState.Sources.USER);
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return (User) C28169i0.m85275e(stringExtra, User.class);
    }

    /* JADX INFO: renamed from: L */
    private void m19415L() {
        this.f25037I.f25041b.setTransitionName("whoopLogo");
        this.f25037I.f25040a.setTransitionName("background");
        this.f25037I.f25042c.setTransitionName("teamIcon");
        m49161F("navigationBar");
        this.f25037I.f25042c.setTransitionGroup(true);
        postponeEnterTransition();
        AbstractC32411b.m101066J().postDelayed(new RunnableC6357a(), m19413J());
    }

    /* JADX INFO: renamed from: M */
    public static C6358b m19416M(Context context, Invitation invitation, User user) {
        return new C6358b(context, invitation, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m19417N(View view) {
        if (C12723b.m35566a().m35572g().m84057h() != null) {
            Intent intent = new Intent();
            intent.setClassName(view.getContext(), "com.whoop.ui.home.redesign.view.MainActivity");
            intent.addFlags(268435456);
            intent.addFlags(32768);
            intent.addFlags(67108864);
            startActivity(intent);
            finishAffinity();
        }
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // hj0.AbstractActivityC17361t, hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m49096B();
        Invitation invitationM19412I = m19412I();
        if (invitationM19412I == null) {
            this.f25038J.mo85222m("No invite code found, aborting", new AbstractC30556a.a[0]);
            finish();
            return;
        }
        User userM19414K = m19414K();
        if (userM19414K == null) {
            this.f25038J.mo85222m("No user found, aborting", new AbstractC30556a.a[0]);
            finish();
            return;
        }
        setContentView(AbstractC38501b0.f165513e);
        this.f25037I = new C6360d(this);
        m19415L();
        this.f25037I.f25044e.setText(getString(AbstractC38505d0.f165641a, userM19414K.getFullName(), invitationM19412I.getTeamName()));
        C4964f c4964fM15549m = ComponentCallbacks2C4960b.m15528d(this).m75569h(this).m15549m(invitationM19412I.getTeamIcon());
        C29341d c29341d = (C29341d) new C29341d().m89319j(AbstractC36512c.f156071n);
        c29341d.getClass();
        c4964fM15549m.mo15533a(c29341d.m89324p(AbstractC22559h.f88754b, Boolean.TRUE)).m15537y(this.f25037I.f25043d);
        this.f25037I.f25045f.setOnClickListener(new ViewOnClickListenerC21821j(this, 13));
    }
}
