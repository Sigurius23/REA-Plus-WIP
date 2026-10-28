package com.whoop.p069ui;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractC1329o1;
import bh3.InterfaceC3255b;
import bh3.InterfaceC3256c;
import com.mapbox.maps.C5538l;
import ge3.AbstractC15751g;
import hj0.AbstractC17348g;
import lh3.C24079b;
import nf1.AbstractC26663d;
import nf1.AbstractC26665f;
import or2.InterfaceC28172j0;
import p233ix.C21011a;
import xg3.C38280g;
import xg3.InterfaceC38281h;
import xg3.InterfaceC38293t;
import zg3.C40634a;

/* JADX INFO: renamed from: com.whoop.ui.h */
/* JADX INFO: loaded from: classes10.dex */
public class C10540h extends AbstractC17348g {

    /* JADX INFO: renamed from: H */
    private e f31973H;

    /* JADX INFO: renamed from: I */
    private ObjectAnimator f31974I;

    /* JADX INFO: renamed from: F */
    private InterfaceC28172j0 f31971F = (InterfaceC28172j0) AbstractC15751g.m44472y(InterfaceC28172j0.class, null, null);

    /* JADX INFO: renamed from: G */
    private boolean f31972G = false;

    /* JADX INFO: renamed from: J */
    private C24079b f31975J = C24079b.m70996Y(null, false);

    /* JADX INFO: renamed from: com.whoop.ui.h$a */
    public class a implements InterfaceC38281h {
        public a() {
        }

        @Override // xg3.InterfaceC38281h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            C10540h.this.m27210K();
        }

        @Override // xg3.InterfaceC38281h
        public void onCompleted() {
        }

        @Override // xg3.InterfaceC38281h
        public void onError(Throwable th3) {
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.h$b */
    public class b implements InterfaceC38281h {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10594l f31977E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC3256c f31978F;

        /* JADX INFO: renamed from: w */
        boolean f31979w = false;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38280g f31980x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC3256c f31981y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C10540h f31982z;

        /* JADX INFO: renamed from: com.whoop.ui.h$b$a */
        public class a implements InterfaceC3255b {

            /* JADX INFO: renamed from: w */
            boolean f31983w = false;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Throwable f31984x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C21011a f31985y;

            public a(Throwable th3, C21011a c21011a) {
                this.f31984x = th3;
                this.f31985y = c21011a;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo9472b(Boolean bool) {
                if (!this.f31983w) {
                    b bVar = b.this;
                    if (!bVar.f31979w) {
                        this.f31983w = true;
                        bVar.f31981y.mo9473c(this.f31984x, bVar.f31982z);
                    }
                }
                b.this.f31979w = true;
                InterfaceC38293t interfaceC38293t = (InterfaceC38293t) this.f31985y.f79523a;
                if (interfaceC38293t != null) {
                    interfaceC38293t.mo14750b();
                    this.f31985y.f79523a = null;
                }
            }
        }

        public b(C38280g c38280g, InterfaceC3256c interfaceC3256c, C10540h c10540h, C10594l c10594l, InterfaceC3256c interfaceC3256c2) {
            this.f31980x = c38280g;
            this.f31981y = interfaceC3256c;
            this.f31982z = c10540h;
            this.f31977E = c10594l;
            this.f31978F = interfaceC3256c2;
        }

        @Override // xg3.InterfaceC38281h
        public void onCompleted() {
        }

        @Override // xg3.InterfaceC38281h
        public void onError(Throwable th3) {
            C21011a c21011a = new C21011a();
            InterfaceC38293t interfaceC38293tM122661K = this.f31980x.m122661K(new a(th3, c21011a));
            c21011a.f79523a = interfaceC38293tM122661K;
            this.f31977E.m27330a(interfaceC38293tM122661K);
        }

        @Override // xg3.InterfaceC38281h
        public void onNext(T t14) {
            if (this.f31979w) {
                return;
            }
            this.f31978F.mo9473c(t14, this.f31982z);
            this.f31979w = true;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.h$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C10540h.this.f31975J.onNext(Boolean.FALSE);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C10540h.this.f31975J.onNext(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.h$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private C10540h f31988a = C10540h.m27205S();

        /* JADX INFO: renamed from: a */
        public d m27214a() {
            this.f31988a.m27207U(true);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C10540h m27215b() {
            return this.f31988a;
        }

        /* JADX INFO: renamed from: c */
        public d m27216c(String str) {
            this.f31988a.m27208V(str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m27217d(String str) {
            this.f31988a.m27209W(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.h$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        LoadingDial f31989a;

        public e(View view) {
            this.f31989a = (LoadingDial) view.findViewById(AbstractC26663d.f105984c);
        }
    }

    /* JADX INFO: renamed from: L */
    public static <T> C10540h m27198L(AbstractC1329o1 abstractC1329o1, String str, String str2, String str3, C10594l c10594l, C38280g<T> c38280g, InterfaceC3256c interfaceC3256c, InterfaceC3256c interfaceC3256c2) {
        C10540h c10540h = (C10540h) abstractC1329o1.m4140E(str);
        if (c10540h != null) {
            c10540h.dismiss();
        }
        C10540h c10540hM27215b = new d().m27217d(str2).m27216c(str3).m27214a().m27215b();
        c10540hM27215b.show(abstractC1329o1, str);
        C38280g<Boolean> c38280gM27206T = c10540hM27215b.m27206T();
        c10540hM27215b.f31972G = true;
        c10594l.m27330a(c38280gM27206T.m122668S(c38280g).m122663M(c10540hM27215b.new a()));
        c10594l.m27330a(C38280g.m122638f(c38280g, c38280gM27206T, new C5538l(13)).m122652B(C40634a.m131874a()).m122663M(new b(c38280gM27206T, interfaceC3256c2, c10540hM27215b, c10594l, interfaceC3256c)));
        return c10540hM27215b;
    }

    /* JADX INFO: renamed from: M */
    private boolean m27199M() {
        return getArguments().getBoolean("animOnStart", false);
    }

    /* JADX INFO: renamed from: N */
    private String m27200N() {
        return getArguments().getString("subtext");
    }

    /* JADX INFO: renamed from: O */
    private String m27201O() {
        return getArguments().getString("title");
    }

    /* JADX INFO: renamed from: P */
    public static C10540h m27202P(AbstractC1329o1 abstractC1329o1, String str) {
        return (C10540h) abstractC1329o1.m4140E(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Object m27203Q(Object obj, Boolean bool) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Boolean m27204R(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: S */
    public static C10540h m27205S() {
        return new C10540h();
    }

    /* JADX INFO: renamed from: T */
    private C38280g<Boolean> m27206T() {
        return this.f31975J.m122678n(new C5538l(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m27207U(boolean z4) {
        getArguments().putBoolean("animOnStart", z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m27208V(String str) {
        getArguments().putString("subtext", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m27209W(String str) {
        getArguments().putString("title", str);
    }

    /* JADX INFO: renamed from: K */
    public void m27210K() {
        e eVar = this.f31973H;
        if (eVar != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(eVar.f31989a, NotificationCompat.CATEGORY_PROGRESS, 0.0f, 1.0f);
            this.f31974I = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1000L);
            if (!this.f31972G) {
                this.f31974I.setRepeatCount(100);
            }
            this.f31974I.addListener(new c());
            this.f31974I.start();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m27211X(AbstractC1329o1 abstractC1329o1, String str, String str2, String str3) {
        C10540h c10540h = (C10540h) abstractC1329o1.m4140E(str);
        if (c10540h != null) {
            c10540h.dismiss();
        }
        new d().m27217d(str2).m27216c(str3).m27214a().m27215b().show(abstractC1329o1, str);
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().requestFeature(1);
        dialogOnCreateDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
        setCancelable(false);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC26665f.f106006a, viewGroup, false);
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        this.f31973H = null;
        ObjectAnimator objectAnimator = this.f31974I;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        this.f31971F.mo85208a();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStop() {
        this.f31971F.mo85209b();
        super.onStop();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        e eVar = new e(view);
        this.f31973H = eVar;
        eVar.f31989a.m26649b(m27201O(), m27200N());
        if (m27199M()) {
            m27210K();
        }
    }
}
