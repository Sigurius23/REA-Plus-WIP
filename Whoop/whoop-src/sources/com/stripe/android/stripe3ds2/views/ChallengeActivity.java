package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractC1356w0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1643y1;
import b13.ViewOnClickListenerC2292a;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.whoop.android.R;
import e93.AbstractC12889b;
import java.util.List;
import java.util.ServiceLoader;
import k30.C22168a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m30.C24991g;
import m30.EnumC24994j;
import m30.InterfaceC24986b;
import m83.AbstractC25265s;
import n30.C26212c;
import n30.C26215f;
import n30.InterfaceC26213d;
import ng3.C26702o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p098dt.AbstractC12350b;
import p161g.C14895a0;
import p161g.C14923z;
import p314m.AbstractActivityC24852m;
import p314m.AbstractC24830b;
import p314m.C24828a;
import p408q.C29660d;
import p479s4.AbstractC32122c;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.AbstractC29894a0;
import q30.AbstractC29907h;
import q30.C29903f;
import q30.C29906g0;
import q30.C29911j;
import q30.C29934u0;
import q30.C29936v0;
import q30.C29938w0;
import q30.C29942z;
import q30.InterfaceC29913k;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import r30.C30900e;
import r30.EnumC30905j;
import s30.AbstractC32100b;
import s30.C32101c;
import s40.C32139c0;
import s40.C32176r0;
import t30.C33502d;
import t30.C33503e;
import t30.C33505g;
import t30.C33512n;
import t30.C33513o;
import t30.C33517s;
import t30.C33523y;
import t30.DialogC33515q;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;", "Lm/m;", "<init>", "()V", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ChallengeActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: M */
    public static final ExecutorC22364d f22425M;

    /* JADX INFO: renamed from: E */
    public final C23470p f22426E;

    /* JADX INFO: renamed from: F */
    public final C23470p f22427F;

    /* JADX INFO: renamed from: G */
    public final C1643y1 f22428G;

    /* JADX INFO: renamed from: H */
    public final C23470p f22429H;

    /* JADX INFO: renamed from: I */
    public final C23470p f22430I;

    /* JADX INFO: renamed from: J */
    public final C23470p f22431J;

    /* JADX INFO: renamed from: K */
    public DialogC33515q f22432K;

    /* JADX INFO: renamed from: L */
    public C30900e f22433L;

    /* JADX INFO: renamed from: w */
    public final C23470p f22434w;

    /* JADX INFO: renamed from: x */
    public final C23470p f22435x;

    /* JADX INFO: renamed from: y */
    public final C23470p f22436y;

    /* JADX INFO: renamed from: z */
    public final C23470p f22437z;

    static {
        C22365e c22365e = AbstractC3050q0.f12077a;
        f22425M = ExecutorC22364d.f87316w;
    }

    public ChallengeActivity() {
        final int i13 = 5;
        this.f22434w = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i14) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i14 = 7;
        this.f22435x = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i15) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i15 = 8;
        this.f22436y = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i16 = i15;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i16) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i16 = 9;
        AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i17 = i16;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i17) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i17 = 10;
        this.f22437z = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i18 = i17;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i18) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i18 = 0;
        this.f22426E = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i19 = i18;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i19) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i19 = 1;
        this.f22427F = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i19;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i110) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i24 = 2;
        this.f22428G = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33505g.class), new C33503e(this, 0), new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i24;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i110) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        }, new C33503e(this, 1));
        final int i25 = 3;
        this.f22429H = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i25;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i110) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i26 = 4;
        this.f22430I = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i26;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i110) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        final int i27 = 6;
        this.f22431J = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: t30.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139858x;

            {
                this.f139858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i27;
                ChallengeActivity challengeActivity = this.f139858x;
                switch (i110) {
                    case 0:
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        return new C29911j(challengeActivity.m16876p().f139926x, (InterfaceC26213d) challengeActivity.f22435x.getValue(), challengeActivity.m16876p().f139922E, ChallengeActivity.f22425M);
                    case 1:
                        ExecutorC22364d workContext = ChallengeActivity.f22425M;
                        AbstractC22676k.m65750j(workContext, "workContext");
                        String acsUrl = challengeActivity.m16876p().f139928z.f122214z;
                        InterfaceC26213d errorReporter = (InterfaceC26213d) challengeActivity.f22435x.getValue();
                        AbstractC22676k.m65750j(acsUrl, "acsUrl");
                        AbstractC22676k.m65750j(errorReporter, "errorReporter");
                        C29938w0 c29938w0 = new C29938w0(acsUrl, errorReporter, workContext);
                        C22365e c22365e = AbstractC3050q0.f12077a;
                        return new C29936v0(c29938w0, errorReporter, ExecutorC22364d.f87316w);
                    case 2:
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        return new C32176r0((InterfaceC29913k) challengeActivity.f22426E.getValue(), (C29906g0) challengeActivity.f22434w.getValue(), (InterfaceC26213d) challengeActivity.f22435x.getValue());
                    case 3:
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        Bundle extras = challengeActivity.getIntent().getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        AbstractC22676k.m65747g(extras);
                        Object objM34600u = AbstractC12350b.m34600u(extras, C33517s.class, "extra_args");
                        if (objM34600u != null) {
                            return (C33517s) objM34600u;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 4:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        return new C33523y(challengeActivity);
                    case 5:
                        ExecutorC22364d executorC22364d5 = ChallengeActivity.f22425M;
                        return new C29906g0(challengeActivity.m16876p().f139923F, (C29936v0) challengeActivity.f22427F.getValue(), challengeActivity.m16876p().f139926x);
                    case 6:
                        ExecutorC22364d executorC22364d6 = ChallengeActivity.f22425M;
                        return new C33516r(challengeActivity, challengeActivity.m16876p().f139927y);
                    case 7:
                        ExecutorC22364d executorC22364d7 = ChallengeActivity.f22425M;
                        Context applicationContext = challengeActivity.getApplicationContext();
                        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                        return new C26212c(applicationContext, new C26215f(challengeActivity.m16876p().f139926x.f127396z), null, null, 252);
                    case 8:
                        ExecutorC22364d executorC22364d8 = ChallengeActivity.f22425M;
                        return (C33512n) ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getFragment();
                    case 9:
                        return ((C33512n) challengeActivity.f22436y.getValue()).m105887B();
                    default:
                        ExecutorC22364d executorC22364d9 = ChallengeActivity.f22425M;
                        View viewInflate = challengeActivity.getLayoutInflater().inflate(R.layout.stripe_challenge_activity, (ViewGroup) null, false);
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) AbstractC34235f.m108203J(viewInflate, R.id.fragment_container);
                        if (fragmentContainerView != null) {
                            return new C22168a((FrameLayout) viewInflate, fragmentContainerView);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fragment_container)));
                }
            }
        });
        C29934u0 c29934u0 = C29934u0.f122247y;
        c29934u0 = c29934u0 == null ? new C29934u0(14) : c29934u0;
        if (C29934u0.f122247y == null) {
            C29934u0.f122247y = c29934u0;
        }
        ServiceLoader serviceLoader = (ServiceLoader) c29934u0.f122249x;
        if (serviceLoader.iterator().hasNext() && serviceLoader.iterator().next() != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m16875o() {
        AbstractActivityC1340r0 abstractActivityC1340r0 = ((C33523y) this.f22430I.getValue()).f139950a;
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC32122c.getSystemService(abstractActivityC1340r0, InputMethodManager.class);
        if (inputMethodManager == null || !inputMethodManager.isAcceptingText()) {
            return;
        }
        View currentFocus = abstractActivityC1340r0.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ThreeDS2Button threeDS2Button;
        Bundle extras = getIntent().getExtras();
        if (extras == null || AbstractC12350b.m34600u(extras, C33517s.class, "extra_args") == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        getSupportFragmentManager().f5698B = new C33513o(m16876p().f139927y, (C29906g0) this.f22434w.getValue(), (C29936v0) this.f22427F.getValue(), (InterfaceC26213d) this.f22435x.getValue(), (InterfaceC29913k) this.f22426E.getValue(), m16876p().f139925w.f127403E, m16876p().f139924G);
        super.onCreate(bundle);
        C14923z onBackPressedDispatcher = getOnBackPressedDispatcher();
        C14895a0 c14895a0 = new C14895a0(this, 2);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m43016b(c14895a0);
        getWindow().setFlags(DfuBaseService.ERROR_REMOTE_MASK, DfuBaseService.ERROR_REMOTE_MASK);
        setContentView(((C22168a) this.f22437z.getValue()).f85980a);
        final int i13 = 0;
        m16877r().f139866H.observe(this, new C33502d(new Function1(this) { // from class: t30.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139856x;

            {
                this.f139856x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnumC30905j enumC30905j;
                int i14 = i13;
                String str = null;
                C23454a0 c23454a0 = C23454a0.f92919a;
                ChallengeActivity challengeActivity = this.f139856x;
                switch (i14) {
                    case 0:
                        AbstractC29907h abstractC29907h = (AbstractC29907h) obj;
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.m16875o();
                            C33516r c33516r = (C33516r) challengeActivity.f22431J.getValue();
                            c33516r.getClass();
                            DialogC33515q dialogC33515q = new DialogC33515q(c33516r.f139920a, c33516r.f139921b);
                            dialogC33515q.show();
                            challengeActivity.f22432K = dialogC33515q;
                            C33505g c33505gM16877r = challengeActivity.m16877r();
                            AbstractC22676k.m65747g(abstractC29907h);
                            c33505gM16877r.m105885g(abstractC29907h);
                        }
                        return c23454a0;
                    case 1:
                        AbstractC29894a0 abstractC29894a0 = (AbstractC29894a0) obj;
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        Intent intent = new Intent();
                        abstractC29894a0.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(AbstractC12889b.m36273g(new C23465k("extra_result", abstractC29894a0))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        return c23454a0;
                    case 2:
                        C30900e c30900e = (C30900e) obj;
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        DialogC33515q dialogC33515q2 = challengeActivity.f22432K;
                        if (dialogC33515q2 != null && dialogC33515q2.isShowing()) {
                            dialogC33515q2.dismiss();
                        }
                        challengeActivity.f22432K = null;
                        if (c30900e != null) {
                            AbstractC1329o1 supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
                            C1271a c1271a = new C1271a(supportFragmentManager);
                            c1271a.m4069f(R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out, R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out);
                            int id4 = ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getId();
                            Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("arg_cres", c30900e));
                            AbstractC1356w0 abstractC1356w0 = c1271a.f5561a;
                            if (abstractC1356w0 == null) {
                                throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                            }
                            ClassLoader classLoader = c1271a.f5562b;
                            if (classLoader == null) {
                                throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
                            }
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1356w0.mo4083a(classLoader, C33512n.class.getName());
                            abstractComponentCallbacksC1320m0Mo4083a.setArguments(bundleM36273g);
                            c1271a.m4068e(id4, abstractComponentCallbacksC1320m0Mo4083a, null);
                            c1271a.m4046j();
                            challengeActivity.f22433L = c30900e;
                        }
                        return c23454a0;
                    default:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        if (AbstractC22676k.m65745e((Boolean) obj, Boolean.TRUE)) {
                            C33505g c33505gM16877r2 = challengeActivity.m16877r();
                            C30900e c30900e2 = challengeActivity.f22433L;
                            if (c30900e2 != null && (enumC30905j = c30900e2.f127403E) != null) {
                                str = enumC30905j.f127463w;
                            }
                            if (str == null) {
                                str = "";
                            }
                            c33505gM16877r2.f139867I.postValue(new C29942z(str, challengeActivity.m16876p().f139925w.f127403E, challengeActivity.m16876p().f139924G));
                        }
                        return c23454a0;
                }
            }
        }, 0));
        final int i14 = 1;
        m16877r().f139868J.observe(this, new C33502d(new Function1(this) { // from class: t30.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139856x;

            {
                this.f139856x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnumC30905j enumC30905j;
                int i15 = i14;
                String str = null;
                C23454a0 c23454a0 = C23454a0.f92919a;
                ChallengeActivity challengeActivity = this.f139856x;
                switch (i15) {
                    case 0:
                        AbstractC29907h abstractC29907h = (AbstractC29907h) obj;
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.m16875o();
                            C33516r c33516r = (C33516r) challengeActivity.f22431J.getValue();
                            c33516r.getClass();
                            DialogC33515q dialogC33515q = new DialogC33515q(c33516r.f139920a, c33516r.f139921b);
                            dialogC33515q.show();
                            challengeActivity.f22432K = dialogC33515q;
                            C33505g c33505gM16877r = challengeActivity.m16877r();
                            AbstractC22676k.m65747g(abstractC29907h);
                            c33505gM16877r.m105885g(abstractC29907h);
                        }
                        return c23454a0;
                    case 1:
                        AbstractC29894a0 abstractC29894a0 = (AbstractC29894a0) obj;
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        Intent intent = new Intent();
                        abstractC29894a0.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(AbstractC12889b.m36273g(new C23465k("extra_result", abstractC29894a0))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        return c23454a0;
                    case 2:
                        C30900e c30900e = (C30900e) obj;
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        DialogC33515q dialogC33515q2 = challengeActivity.f22432K;
                        if (dialogC33515q2 != null && dialogC33515q2.isShowing()) {
                            dialogC33515q2.dismiss();
                        }
                        challengeActivity.f22432K = null;
                        if (c30900e != null) {
                            AbstractC1329o1 supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
                            C1271a c1271a = new C1271a(supportFragmentManager);
                            c1271a.m4069f(R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out, R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out);
                            int id4 = ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getId();
                            Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("arg_cres", c30900e));
                            AbstractC1356w0 abstractC1356w0 = c1271a.f5561a;
                            if (abstractC1356w0 == null) {
                                throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                            }
                            ClassLoader classLoader = c1271a.f5562b;
                            if (classLoader == null) {
                                throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
                            }
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1356w0.mo4083a(classLoader, C33512n.class.getName());
                            abstractComponentCallbacksC1320m0Mo4083a.setArguments(bundleM36273g);
                            c1271a.m4068e(id4, abstractComponentCallbacksC1320m0Mo4083a, null);
                            c1271a.m4046j();
                            challengeActivity.f22433L = c30900e;
                        }
                        return c23454a0;
                    default:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        if (AbstractC22676k.m65745e((Boolean) obj, Boolean.TRUE)) {
                            C33505g c33505gM16877r2 = challengeActivity.m16877r();
                            C30900e c30900e2 = challengeActivity.f22433L;
                            if (c30900e2 != null && (enumC30905j = c30900e2.f127403E) != null) {
                                str = enumC30905j.f127463w;
                            }
                            if (str == null) {
                                str = "";
                            }
                            c33505gM16877r2.f139867I.postValue(new C29942z(str, challengeActivity.m16876p().f139925w.f127403E, challengeActivity.m16876p().f139924G));
                        }
                        return c23454a0;
                }
            }
        }, 0));
        C24991g c24991g = m16876p().f139927y.f97800w;
        InterfaceC24986b interfaceC24986bM73318b = m16876p().f139927y.m73318b(EnumC24994j.f97810z);
        AbstractC24830b supportActionBar = getSupportActionBar();
        InterfaceC30057d interfaceC30057d = null;
        if (supportActionBar == null) {
            threeDS2Button = null;
        } else {
            threeDS2Button = new ThreeDS2Button(new C29660d(this, R.style.Stripe3DS2ActionBarButton), null, 6);
            threeDS2Button.setBackgroundTintList(ColorStateList.valueOf(0));
            threeDS2Button.setButtonCustomization(interfaceC24986bM73318b);
            C24828a c24828a = new C24828a(-2, -2);
            c24828a.f97197a = 8388629;
            supportActionBar.mo72824m(threeDS2Button, c24828a);
            supportActionBar.mo72827p();
            if (c24991g != null) {
                String string = c24991g.f97795F;
                String str = c24991g.f97797z;
                String str2 = c24991g.f97796G;
                if (str2 == null || AbstractC39414r.m125890i0(str2)) {
                    threeDS2Button.setText(R.string.stripe_3ds2_hzv_cancel_label);
                } else {
                    threeDS2Button.setText(c24991g.f97796G);
                }
                if (str != null) {
                    supportActionBar.mo72823l(new ColorDrawable(Color.parseColor(str)));
                    String str3 = c24991g.f97794E;
                    if (str3 != null) {
                        int color = Color.parseColor(str3);
                        if (Build.VERSION.SDK_INT <= 34) {
                            getWindow().setStatusBarColor(color);
                        }
                    } else {
                        int color2 = Color.parseColor(str);
                        int iArgb = Color.argb(Color.alpha(color2), Math.min(Math.max((int) (Color.red(color2) * 0.8f), 0), 255), Math.min(Math.max((int) (Color.green(color2) * 0.8f), 0), 255), Math.min(Math.max((int) (Color.blue(color2) * 0.8f), 0), 255));
                        if (Build.VERSION.SDK_INT <= 34) {
                            getWindow().setStatusBarColor(iArgb);
                        }
                    }
                }
                if (string == null || AbstractC39414r.m125890i0(string)) {
                    string = getString(R.string.stripe_3ds2_hzv_header_label);
                    AbstractC22676k.m65747g(string);
                }
                supportActionBar.mo72834w(AbstractC32100b.m99858c(this, string, c24991g));
            } else {
                supportActionBar.mo72833v();
                threeDS2Button.setText(R.string.stripe_3ds2_hzv_cancel_label);
            }
        }
        if (threeDS2Button != null) {
            threeDS2Button.setOnClickListener(new ViewOnClickListenerC2292a(13, threeDS2Button, this));
        }
        final int i15 = 2;
        m16877r().f139873O.observe(this, new C33502d(new Function1(this) { // from class: t30.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139856x;

            {
                this.f139856x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnumC30905j enumC30905j;
                int i16 = i15;
                String str4 = null;
                C23454a0 c23454a0 = C23454a0.f92919a;
                ChallengeActivity challengeActivity = this.f139856x;
                switch (i16) {
                    case 0:
                        AbstractC29907h abstractC29907h = (AbstractC29907h) obj;
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.m16875o();
                            C33516r c33516r = (C33516r) challengeActivity.f22431J.getValue();
                            c33516r.getClass();
                            DialogC33515q dialogC33515q = new DialogC33515q(c33516r.f139920a, c33516r.f139921b);
                            dialogC33515q.show();
                            challengeActivity.f22432K = dialogC33515q;
                            C33505g c33505gM16877r = challengeActivity.m16877r();
                            AbstractC22676k.m65747g(abstractC29907h);
                            c33505gM16877r.m105885g(abstractC29907h);
                        }
                        return c23454a0;
                    case 1:
                        AbstractC29894a0 abstractC29894a0 = (AbstractC29894a0) obj;
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        Intent intent = new Intent();
                        abstractC29894a0.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(AbstractC12889b.m36273g(new C23465k("extra_result", abstractC29894a0))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        return c23454a0;
                    case 2:
                        C30900e c30900e = (C30900e) obj;
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        DialogC33515q dialogC33515q2 = challengeActivity.f22432K;
                        if (dialogC33515q2 != null && dialogC33515q2.isShowing()) {
                            dialogC33515q2.dismiss();
                        }
                        challengeActivity.f22432K = null;
                        if (c30900e != null) {
                            AbstractC1329o1 supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
                            C1271a c1271a = new C1271a(supportFragmentManager);
                            c1271a.m4069f(R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out, R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out);
                            int id4 = ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getId();
                            Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("arg_cres", c30900e));
                            AbstractC1356w0 abstractC1356w0 = c1271a.f5561a;
                            if (abstractC1356w0 == null) {
                                throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                            }
                            ClassLoader classLoader = c1271a.f5562b;
                            if (classLoader == null) {
                                throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
                            }
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1356w0.mo4083a(classLoader, C33512n.class.getName());
                            abstractComponentCallbacksC1320m0Mo4083a.setArguments(bundleM36273g);
                            c1271a.m4068e(id4, abstractComponentCallbacksC1320m0Mo4083a, null);
                            c1271a.m4046j();
                            challengeActivity.f22433L = c30900e;
                        }
                        return c23454a0;
                    default:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        if (AbstractC22676k.m65745e((Boolean) obj, Boolean.TRUE)) {
                            C33505g c33505gM16877r2 = challengeActivity.m16877r();
                            C30900e c30900e2 = challengeActivity.f22433L;
                            if (c30900e2 != null && (enumC30905j = c30900e2.f127403E) != null) {
                                str4 = enumC30905j.f127463w;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            c33505gM16877r2.f139867I.postValue(new C29942z(str4, challengeActivity.m16876p().f139925w.f127403E, challengeActivity.m16876p().f139924G));
                        }
                        return c23454a0;
                }
            }
        }, 0));
        if (bundle == null) {
            C33505g c33505gM16877r = m16877r();
            C30900e cres = m16876p().f139925w;
            AbstractC22676k.m65750j(cres, "cres");
            c33505gM16877r.f139872N.setValue(cres);
        }
        final int i16 = 3;
        AbstractC1640x1.m5044c(C30064k.f122676w, new C32139c0(m16877r(), interfaceC30057d, 10)).observe(this, new C33502d(new Function1(this) { // from class: t30.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChallengeActivity f139856x;

            {
                this.f139856x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnumC30905j enumC30905j;
                int i17 = i16;
                String str4 = null;
                C23454a0 c23454a0 = C23454a0.f92919a;
                ChallengeActivity challengeActivity = this.f139856x;
                switch (i17) {
                    case 0:
                        AbstractC29907h abstractC29907h = (AbstractC29907h) obj;
                        ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.m16875o();
                            C33516r c33516r = (C33516r) challengeActivity.f22431J.getValue();
                            c33516r.getClass();
                            DialogC33515q dialogC33515q = new DialogC33515q(c33516r.f139920a, c33516r.f139921b);
                            dialogC33515q.show();
                            challengeActivity.f22432K = dialogC33515q;
                            C33505g c33505gM16877r2 = challengeActivity.m16877r();
                            AbstractC22676k.m65747g(abstractC29907h);
                            c33505gM16877r2.m105885g(abstractC29907h);
                        }
                        return c23454a0;
                    case 1:
                        AbstractC29894a0 abstractC29894a0 = (AbstractC29894a0) obj;
                        ExecutorC22364d executorC22364d2 = ChallengeActivity.f22425M;
                        Intent intent = new Intent();
                        abstractC29894a0.getClass();
                        challengeActivity.setResult(-1, intent.putExtras(AbstractC12889b.m36273g(new C23465k("extra_result", abstractC29894a0))));
                        if (!challengeActivity.isFinishing()) {
                            challengeActivity.finish();
                        }
                        return c23454a0;
                    case 2:
                        C30900e c30900e = (C30900e) obj;
                        ExecutorC22364d executorC22364d3 = ChallengeActivity.f22425M;
                        DialogC33515q dialogC33515q2 = challengeActivity.f22432K;
                        if (dialogC33515q2 != null && dialogC33515q2.isShowing()) {
                            dialogC33515q2.dismiss();
                        }
                        challengeActivity.f22432K = null;
                        if (c30900e != null) {
                            AbstractC1329o1 supportFragmentManager = challengeActivity.getSupportFragmentManager();
                            AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
                            C1271a c1271a = new C1271a(supportFragmentManager);
                            c1271a.m4069f(R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out, R.anim.stripe_3ds2_challenge_transition_slide_in, R.anim.stripe_3ds2_challenge_transition_slide_out);
                            int id4 = ((C22168a) challengeActivity.f22437z.getValue()).f85981b.getId();
                            Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("arg_cres", c30900e));
                            AbstractC1356w0 abstractC1356w0 = c1271a.f5561a;
                            if (abstractC1356w0 == null) {
                                throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                            }
                            ClassLoader classLoader = c1271a.f5562b;
                            if (classLoader == null) {
                                throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
                            }
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1356w0.mo4083a(classLoader, C33512n.class.getName());
                            abstractComponentCallbacksC1320m0Mo4083a.setArguments(bundleM36273g);
                            c1271a.m4068e(id4, abstractComponentCallbacksC1320m0Mo4083a, null);
                            c1271a.m4046j();
                            challengeActivity.f22433L = c30900e;
                        }
                        return c23454a0;
                    default:
                        ExecutorC22364d executorC22364d4 = ChallengeActivity.f22425M;
                        if (AbstractC22676k.m65745e((Boolean) obj, Boolean.TRUE)) {
                            C33505g c33505gM16877r3 = challengeActivity.m16877r();
                            C30900e c30900e2 = challengeActivity.f22433L;
                            if (c30900e2 != null && (enumC30905j = c30900e2.f127403E) != null) {
                                str4 = enumC30905j.f127463w;
                            }
                            if (str4 == null) {
                                str4 = "";
                            }
                            c33505gM16877r3.f139867I.postValue(new C29942z(str4, challengeActivity.m16876p().f139925w.f127403E, challengeActivity.m16876p().f139924G));
                        }
                        return c23454a0;
                }
            }
        }, 0));
        this.f22433L = m16876p().f139925w;
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        DialogC33515q dialogC33515q = this.f22432K;
        if (dialogC33515q != null && dialogC33515q.isShowing()) {
            dialogC33515q.dismiss();
        }
        this.f22432K = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C32101c) m16877r().f139879y).getClass();
        C32101c.f133103b.evictAll();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onPause() {
        EnumC30905j enumC30905j;
        super.onPause();
        m16877r().f139874P = true;
        C26702o c26702o = EnumC30905j.f127461y;
        C30900e c30900e = this.f22433L;
        String str = (c30900e == null || (enumC30905j = c30900e.f127403E) == null) ? null : enumC30905j.f127463w;
        if (str == null) {
            str = "";
        }
        c26702o.getClass();
        m16877r().f139875Q = C26702o.m79411o(str) == EnumC30905j.OutOfBand;
        m16875o();
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!m16877r().f139875Q) {
            if (m16877r().f139874P) {
                m16877r().f139863E.setValue(C23454a0.f92919a);
            }
        } else {
            List listM4059f = getSupportFragmentManager().f5717c.m4059f();
            AbstractC22676k.m65749i(listM4059f, "getFragments(...)");
            Object objM74096F0 = AbstractC25265s.m74096F0(listM4059f);
            AbstractC22676k.m65748h(objM74096F0, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.views.ChallengeFragment");
            m16877r().m105885g(new C29903f(Boolean.valueOf(((C33512n) objM74096F0).m105890z().getWhitelistingSelection$3ds2sdk_release())));
        }
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        super.onTrimMemory(i13);
        ((C32101c) m16877r().f139879y).getClass();
        C32101c.f133103b.evictAll();
    }

    /* JADX INFO: renamed from: p */
    public final C33517s m16876p() {
        return (C33517s) this.f22429H.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final C33505g m16877r() {
        return (C33505g) this.f22428G.getValue();
    }
}
