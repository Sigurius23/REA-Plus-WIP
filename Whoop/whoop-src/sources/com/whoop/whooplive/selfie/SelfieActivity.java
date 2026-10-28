package com.whoop.whooplive.selfie;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.viewpager.widget.ViewPager;
import as2.C1951a;
import bh3.InterfaceC3255b;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.load.engine.GlideException;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.p069ui.ProgressDial;
import com.whoop.p069ui.WhoopZoomageView;
import com.whoop.service.network.model.cycles.Cycle;
import com.whoop.service.network.model.cycles.Period;
import com.whoop.service.network.model.cycles.Recovery;
import com.whoop.service.network.model.cycles.Sleep;
import com.whoop.service.network.model.cycles.Strain;
import com.whoop.whooplive.live.views.AspectLetterboxView;
import com.whoop.whooplive.live.views.WhoopPlaybackView;
import com.whoop.whooplive.live.views.WhoopRecordableSurfaceView;
import com.whoop.whooplive.selfie.camera.CameraView;
import e50.C12723b;
import ge3.AbstractC15751g;
import hj0.AbstractActivityC17347f;
import hj0.C17358q;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j02.InterfaceC21153l0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import jo.ViewOnClickListenerC21821j;
import lh3.C24079b;
import mh3.C25566c;
import nf1.AbstractC26662c;
import or2.C28144a0;
import or2.C28169i0;
import or2.C28204u;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p144fc.InterfaceC14351g;
import p429ql.C30460f;
import p429ql.InterfaceC30463i;
import p479s4.AbstractC32122c;
import p586wk.EnumC37323a;
import p684zk.C40786k;
import p92.C29020i;
import pl.AbstractC29338a;
import pl.C29341d;
import pl.InterfaceC29340c;
import pz2.AbstractC29650c;
import pz2.AbstractC29651d;
import pz2.AbstractC29652e;
import pz2.AbstractC29653f;
import pz2.AbstractC29654g;
import qr2.AbstractC30556a;
import rz2.C31930c;
import rz2.EnumC31928a;
import rz2.EnumC31929b;
import se.AbstractC32410a;
import sz2.C33239a;
import tr2.C34117o;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uf3.C34911a;
import ut2.C35231a;
import uz2.C35448e;
import uz2.EnumC35444a;
import uz2.EnumC35445b;
import uz2.RunnableC35447d;
import vf3.C35953c;
import vu1.AbstractC36511b;
import vu1.AbstractC36512c;
import vz2.AbstractC36615a;
import vz2.C36620f;
import vz2.EnumC36621g;
import xz2.C38768a;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"NewApi"})
public class SelfieActivity extends AbstractActivityC17347f implements ActivityCompat.OnRequestPermissionsResultCallback, View.OnTouchListener {

    /* JADX INFO: renamed from: I */
    private C29020i f33496I;

    /* JADX INFO: renamed from: J */
    private C33239a f33497J;

    /* JADX INFO: renamed from: M */
    private long f33500M;

    /* JADX INFO: renamed from: O */
    private boolean f33502O;

    /* JADX INFO: renamed from: Q */
    private boolean f33504Q;

    /* JADX INFO: renamed from: U */
    private Timer f33508U;

    /* JADX INFO: renamed from: V */
    private Handler f33509V;

    /* JADX INFO: renamed from: W */
    private Runnable f33510W;

    /* JADX INFO: renamed from: X */
    private C34660d f33511X;

    /* JADX INFO: renamed from: Y */
    private InterfaceC34116n f33512Y;

    /* JADX INFO: renamed from: Z */
    private C10880j f33513Z;

    /* JADX INFO: renamed from: e0 */
    private Bitmap f33518e0;

    /* JADX INFO: renamed from: f0 */
    private Bitmap f33519f0;

    /* JADX INFO: renamed from: h0 */
    private Canvas f33521h0;

    /* JADX INFO: renamed from: j0 */
    private Matrix f33523j0;

    /* JADX INFO: renamed from: k0 */
    private Matrix f33524k0;

    /* JADX INFO: renamed from: l0 */
    private boolean f33525l0;

    /* JADX INFO: renamed from: m0 */
    private C31930c f33526m0;

    /* JADX INFO: renamed from: K */
    private File f33498K = null;

    /* JADX INFO: renamed from: L */
    private EnumC31929b f33499L = EnumC31929b.START;

    /* JADX INFO: renamed from: N */
    private long f33501N = 15000;

    /* JADX INFO: renamed from: P */
    private View f33503P = null;

    /* JADX INFO: renamed from: R */
    private boolean f33505R = true;

    /* JADX INFO: renamed from: S */
    private boolean f33506S = false;

    /* JADX INFO: renamed from: T */
    private Timer f33507T = new Timer();

    /* JADX INFO: renamed from: a0 */
    private C24079b f33514a0 = C24079b.m70996Y(Boolean.FALSE, true);

    /* JADX INFO: renamed from: b0 */
    private C25566c f33515b0 = new C25566c();

    /* JADX INFO: renamed from: c0 */
    private C25566c f33516c0 = new C25566c();

    /* JADX INFO: renamed from: d0 */
    private C24079b f33517d0 = C24079b.m70996Y(EnumC10879i.NONE, true);

    /* JADX INFO: renamed from: g0 */
    private Paint f33520g0 = new Paint();

    /* JADX INFO: renamed from: i0 */
    private ColorFilter f33522i0 = new LightingColorFilter(-8355712, 0);

    /* JADX INFO: renamed from: n0 */
    private C28144a0 f33527n0 = (C28144a0) AbstractC15751g.m44472y(C28144a0.class, null, null);

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$a */
    public class C10871a extends TimerTask {
        public C10871a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SelfieActivity.this.m28858o2();
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC10872b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ View f33529w;

        public ViewTreeObserverOnGlobalLayoutListenerC10872b(View view) {
            this.f33529w = view;
        }

        /* JADX INFO: renamed from: a */
        private void m28891a(View view) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            View view2 = (View) view.getParent();
            int measuredWidth2 = view2.getMeasuredWidth();
            int measuredHeight2 = view2.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = (measuredHeight2 - measuredHeight) / 2;
            marginLayoutParams.leftMargin = (measuredWidth2 - measuredWidth) / 2;
            view.setLayoutParams(marginLayoutParams);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int measuredWidth = SelfieActivity.this.f33513Z.f33578u.getMeasuredWidth();
            int measuredHeight = SelfieActivity.this.f33513Z.f33578u.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) SelfieActivity.this.f33513Z.f33578u.getLayoutParams();
            marginLayoutParams.width = measuredWidth;
            marginLayoutParams.height = measuredHeight;
            marginLayoutParams.topMargin = ((SelfieActivity.this.f33513Z.f33577t.getMeasuredHeight() - SelfieActivity.this.m28818b1()) - SelfieActivity.this.getResources().getDimensionPixelSize(AbstractC36511b.f156049b)) - measuredHeight;
            SelfieActivity.this.f33513Z.f33578u.setLayoutParams(marginLayoutParams);
            m28891a(SelfieActivity.this.f33513Z.f33579v);
            m28891a(SelfieActivity.this.f33513Z.f33580w);
            m28891a(SelfieActivity.this.f33513Z.f33581x);
            this.f33529w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC10873c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ViewPager f33531w;

        public ViewTreeObserverOnGlobalLayoutListenerC10873c(ViewPager viewPager) {
            this.f33531w = viewPager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m28894c(ViewPager viewPager, View view) {
            viewPager.m5469D(((ViewGroup) view.getParent()).indexOfChild(view), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m28895d(C10878h c10878h, ViewPager viewPager) {
            c10878h.mo19079c(viewPager.getCurrentItem());
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            final C10878h c10878h = new C10878h(SelfieActivity.this, this.f33531w, 0);
            this.f33531w.m5478c(c10878h);
            final ViewPager viewPager = this.f33531w;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.whoop.whooplive.selfie.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelfieActivity.ViewTreeObserverOnGlobalLayoutListenerC10873c.m28894c(viewPager, view);
                }
            };
            SelfieActivity selfieActivity = SelfieActivity.this;
            this.f33531w.setAdapter(new C10881a(selfieActivity, selfieActivity.f33505R, onClickListener));
            this.f33531w.setOffscreenPageLimit(4);
            int measuredWidth = (this.f33531w.getMeasuredWidth() - SelfieActivity.this.getResources().getDimensionPixelSize(AbstractC29650c.f121093a)) / 2;
            ViewPager viewPager2 = this.f33531w;
            viewPager2.setPadding(measuredWidth, viewPager2.getPaddingTop(), measuredWidth, this.f33531w.getPaddingBottom());
            final ViewPager viewPager3 = this.f33531w;
            viewPager3.post(new Runnable() { // from class: com.whoop.whooplive.selfie.d
                @Override // java.lang.Runnable
                public final void run() {
                    SelfieActivity.ViewTreeObserverOnGlobalLayoutListenerC10873c.m28895d(c10878h, viewPager3);
                }
            });
            int intExtra = SelfieActivity.this.getIntent().getIntExtra("selfieMode", EnumC35445b.OVERVIEW.ordinal());
            if (!SelfieActivity.this.f33505R) {
                intExtra--;
            }
            SelfieActivity.this.f33513Z.f33561d.setCurrentItem(intExtra);
            this.f33531w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$d */
    public class C10874d extends TimerTask {
        public C10874d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SelfieActivity.this.m28879v2();
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$e */
    public class C10875e implements InterfaceC29340c {
        public C10875e() {
        }

        @Override // pl.InterfaceC29340c
        /* JADX INFO: renamed from: a */
        public boolean mo28896a(GlideException glideException, Object obj, InterfaceC30463i interfaceC30463i, boolean z4) {
            Toast.makeText(SelfieActivity.this, AbstractC29654g.f121186b, 0).show();
            SelfieActivity.this.f33517d0.onNext(EnumC10879i.SHOOTING);
            return false;
        }

        @Override // pl.InterfaceC29340c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo28897b(Drawable drawable, Object obj, InterfaceC30463i interfaceC30463i, EnumC37323a enumC37323a, boolean z4) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                SelfieActivity.this.f33518e0 = bitmap.copy(bitmap.getConfig(), false);
                SelfieActivity selfieActivity = SelfieActivity.this;
                selfieActivity.m28801V1(selfieActivity.f33518e0);
            }
            if (SelfieActivity.this.f33513Z.f33577t != null) {
                SelfieActivity.this.m28804W1(SelfieActivity.this.f33513Z.f33577t.getColorMode());
            }
            SelfieActivity selfieActivity2 = SelfieActivity.this;
            selfieActivity2.m28755G0(selfieActivity2.f33513Z.f33558a.getWidth(), SelfieActivity.this.f33513Z.f33558a.getHeight(), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            SelfieActivity selfieActivity3 = SelfieActivity.this;
            selfieActivity3.m28741B0(((Boolean) selfieActivity3.f33514a0.m70997Z()).booleanValue());
            SelfieActivity.this.f33517d0.onNext(EnumC10879i.EDITING);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$f */
    public static /* synthetic */ class C10876f {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f33535a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f33536b;

        static {
            int[] iArr = new int[EnumC31929b.values().length];
            f33536b = iArr;
            try {
                iArr[EnumC31929b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33536b[EnumC31929b.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33536b[EnumC31929b.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC35445b.values().length];
            f33535a = iArr2;
            try {
                iArr2[EnumC35445b.LIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33535a[EnumC35445b.OVERVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33535a[EnumC35445b.STRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33535a[EnumC35445b.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33535a[EnumC35445b.SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$h */
    public class C10878h implements InterfaceC14351g {

        /* JADX INFO: renamed from: a */
        private ViewPager f33537a;

        public /* synthetic */ C10878h(SelfieActivity selfieActivity, ViewPager viewPager, int i13) {
            this(viewPager);
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: a */
        public void mo24184a(int i13, float f13, int i14) {
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: b */
        public void mo24185b(int i13) {
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: c */
        public void mo19079c(int i13) {
            int i14 = 0;
            while (true) {
                boolean z4 = true;
                if (i14 >= this.f33537a.getChildCount()) {
                    break;
                }
                View childAt = this.f33537a.getChildAt(i14);
                if (i14 != i13) {
                    z4 = false;
                }
                childAt.setSelected(z4);
                i14++;
            }
            if (!SelfieActivity.this.f33505R) {
                i13++;
            }
            if (SelfieActivity.this.f33517d0.m70997Z() == EnumC10879i.EDITING && EnumC35445b.values()[i13] == EnumC35445b.LIVE) {
                this.f33537a.setCurrentItem(1);
                return;
            }
            SelfieActivity.this.m28758H0(EnumC35445b.values()[i13] == EnumC35445b.LIVE);
            if (SelfieActivity.this.f33513Z.f33577t != null) {
                SelfieActivity.this.f33513Z.f33577t.setMode(EnumC35445b.values()[i13]);
            }
        }

        private C10878h(ViewPager viewPager) {
            this.f33537a = viewPager;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$i */
    public enum EnumC10879i {
        NONE,
        SHOOTING,
        EDITING,
        ZOOMING,
        SNAP_PLUS
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$j */
    public static class C10880j {

        /* JADX INFO: renamed from: A */
        ViewFlipper f33539A;

        /* JADX INFO: renamed from: B */
        View f33540B;

        /* JADX INFO: renamed from: C */
        View f33541C;

        /* JADX INFO: renamed from: D */
        View f33542D;

        /* JADX INFO: renamed from: E */
        View f33543E;

        /* JADX INFO: renamed from: F */
        View f33544F;

        /* JADX INFO: renamed from: G */
        ImageView f33545G;

        /* JADX INFO: renamed from: H */
        View f33546H;

        /* JADX INFO: renamed from: I */
        View f33547I;

        /* JADX INFO: renamed from: J */
        ProgressDial f33548J;

        /* JADX INFO: renamed from: K */
        WhoopPlaybackView f33549K;

        /* JADX INFO: renamed from: L */
        WhoopRecordableSurfaceView f33550L;

        /* JADX INFO: renamed from: M */
        ImageView f33551M;

        /* JADX INFO: renamed from: N */
        View f33552N;

        /* JADX INFO: renamed from: O */
        ImageView f33553O;

        /* JADX INFO: renamed from: P */
        View f33554P;

        /* JADX INFO: renamed from: Q */
        View f33555Q;

        /* JADX INFO: renamed from: R */
        ImageView f33556R;

        /* JADX INFO: renamed from: S */
        TextView f33557S;

        /* JADX INFO: renamed from: a */
        CameraView f33558a;

        /* JADX INFO: renamed from: b */
        TextView f33559b;

        /* JADX INFO: renamed from: c */
        AspectLetterboxView f33560c;

        /* JADX INFO: renamed from: d */
        ViewPager f33561d;

        /* JADX INFO: renamed from: e */
        View f33562e;

        /* JADX INFO: renamed from: f */
        View f33563f;

        /* JADX INFO: renamed from: g */
        View f33564g;

        /* JADX INFO: renamed from: h */
        View f33565h;

        /* JADX INFO: renamed from: i */
        ViewFlipper f33566i;

        /* JADX INFO: renamed from: j */
        View f33567j;

        /* JADX INFO: renamed from: k */
        View f33568k;

        /* JADX INFO: renamed from: l */
        View f33569l;

        /* JADX INFO: renamed from: m */
        ViewFlipper f33570m;

        /* JADX INFO: renamed from: n */
        View f33571n;

        /* JADX INFO: renamed from: o */
        View f33572o;

        /* JADX INFO: renamed from: p */
        View f33573p;

        /* JADX INFO: renamed from: q */
        View f33574q;

        /* JADX INFO: renamed from: r */
        View f33575r;

        /* JADX INFO: renamed from: s */
        TextView f33576s;

        /* JADX INFO: renamed from: t */
        OverlayView f33577t;

        /* JADX INFO: renamed from: u */
        View f33578u;

        /* JADX INFO: renamed from: v */
        View f33579v;

        /* JADX INFO: renamed from: w */
        View f33580w;

        /* JADX INFO: renamed from: x */
        View f33581x;

        /* JADX INFO: renamed from: y */
        ImageView f33582y;

        /* JADX INFO: renamed from: z */
        View f33583z;

        public C10880j(Activity activity) {
            this.f33558a = (CameraView) activity.findViewById(AbstractC29652e.f121143h);
            this.f33559b = (TextView) activity.findViewById(AbstractC29652e.f121145i);
            this.f33560c = (AspectLetterboxView) activity.findViewById(AbstractC29652e.f121137e);
            this.f33561d = (ViewPager) activity.findViewById(AbstractC29652e.f121175x);
            this.f33562e = activity.findViewById(AbstractC29652e.f121110H);
            this.f33563f = activity.findViewById(AbstractC29652e.f121149k);
            this.f33564g = activity.findViewById(AbstractC29652e.f121169u);
            this.f33565h = activity.findViewById(AbstractC29652e.f121177y);
            this.f33566i = (ViewFlipper) activity.findViewById(AbstractC29652e.f121131b);
            this.f33567j = activity.findViewById(AbstractC29652e.f121135d);
            this.f33568k = activity.findViewById(AbstractC29652e.f121133c);
            this.f33569l = activity.findViewById(AbstractC29652e.f121102C);
            this.f33570m = (ViewFlipper) activity.findViewById(AbstractC29652e.f121159p);
            this.f33571n = activity.findViewById(AbstractC29652e.f121163r);
            this.f33572o = activity.findViewById(AbstractC29652e.f121161q);
            this.f33573p = activity.findViewById(AbstractC29652e.f121179z);
            this.f33574q = activity.findViewById(AbstractC29652e.f121151l);
            this.f33575r = activity.findViewById(AbstractC29652e.f121171v);
            this.f33576s = (TextView) activity.findViewById(AbstractC29652e.f121173w);
            this.f33577t = (OverlayView) activity.findViewById(AbstractC29652e.f121156n0);
            this.f33578u = activity.findViewById(AbstractC29652e.f121158o0);
            this.f33579v = activity.findViewById(AbstractC29652e.f121101B0);
            this.f33580w = activity.findViewById(AbstractC29652e.f121168t0);
            this.f33581x = activity.findViewById(AbstractC29652e.f121176x0);
            this.f33582y = (ImageView) activity.findViewById(AbstractC29652e.f121108F);
            this.f33583z = activity.findViewById(AbstractC29652e.f121147j);
            this.f33539A = (ViewFlipper) activity.findViewById(AbstractC29652e.f121153m);
            this.f33540B = activity.findViewById(AbstractC29652e.f121157o);
            this.f33541C = activity.findViewById(AbstractC29652e.f121155n);
            this.f33542D = activity.findViewById(AbstractC29652e.f121129a);
            this.f33543E = activity.findViewById(AbstractC29652e.f121098A);
            this.f33544F = activity.findViewById(AbstractC29652e.f121100B);
            this.f33545G = (ImageView) activity.findViewById(AbstractC29652e.f121139f);
            this.f33546H = activity.findViewById(AbstractC29652e.f121141g);
            this.f33547I = activity.findViewById(AbstractC29652e.f121104D);
            this.f33548J = (ProgressDial) activity.findViewById(AbstractC29652e.f121106E);
            this.f33549K = (WhoopPlaybackView) activity.findViewById(AbstractC29652e.f121165s);
            this.f33550L = (WhoopRecordableSurfaceView) activity.findViewById(AbstractC29652e.f121167t);
            this.f33551M = (ImageView) activity.findViewById(AbstractC29652e.f121138e0);
            this.f33552N = activity.findViewById(AbstractC29652e.f121140f0);
            this.f33553O = (ImageView) activity.findViewById(AbstractC29652e.f121150k0);
            this.f33554P = activity.findViewById(AbstractC29652e.f121111I);
            this.f33555Q = activity.findViewById(AbstractC29652e.f121112J);
            this.f33556R = (ImageView) activity.findViewById(AbstractC29652e.f121142g0);
            this.f33557S = (TextView) activity.findViewById(AbstractC29652e.f121113K);
        }
    }

    /* JADX INFO: renamed from: A0 */
    private void m28738A0() {
        this.f33513Z.f33542D.setOnClickListener(new C1951a(new C35448e(this, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public /* synthetic */ void m28739A1(View view) {
        this.f33513Z.f33558a.setFlashMode(EnumC36621g.OFF);
    }

    /* JADX INFO: renamed from: A2 */
    private void m28740A2() {
        this.f33513Z.f33558a.setVisibility(4);
        this.f33513Z.f33582y.setVisibility(0);
        this.f33513Z.f33577t.setVisibility(8);
        this.f33513Z.f33558a.m28910i();
        this.f33513Z.f33583z.setVisibility(4);
        this.f33513Z.f33563f.setVisibility(4);
        this.f33513Z.f33561d.setVisibility(4);
        this.f33513Z.f33562e.setVisibility(4);
        this.f33513Z.f33554P.setVisibility(0);
        this.f33513Z.f33545G.setImageResource(AbstractC26662c.f105981c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public void m28741B0(boolean z4) {
        WhoopZoomageView whoopZoomageView = (WhoopZoomageView) this.f33513Z.f33582y;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) whoopZoomageView.getLayoutParams();
        int measuredHeight = this.f33513Z.f33558a.getMeasuredHeight();
        if (this.f33518e0 == null || measuredHeight <= 0) {
            return;
        }
        if (z4) {
            layoutParams.height = m28812Z0();
            layoutParams.topMargin = m28818b1();
            whoopZoomageView.setImageMatrix(this.f33524k0);
        } else {
            layoutParams.height = measuredHeight;
            layoutParams.topMargin = 0;
            whoopZoomageView.setImageMatrix(this.f33523j0);
            whoopZoomageView.m26714q();
        }
        this.f33513Z.f33582y.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public /* synthetic */ void m28742B1(View view) {
        this.f33513Z.f33558a.m28913l();
    }

    /* JADX INFO: renamed from: C0 */
    private void m28743C0() {
        this.f33513Z.f33557S.setOnClickListener(new C1951a(new C35448e(this, 10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m28744C1(View view) {
        this.f33526m0.m99415U();
    }

    /* JADX INFO: renamed from: D0 */
    private void m28746D0() {
        this.f33513Z.f33568k.setOnClickListener(new C1951a(new C35448e(this, 15)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public /* synthetic */ void m28747D1(View view) {
        int i13 = C10876f.f33536b[this.f33499L.ordinal()];
        if (i13 == 1) {
            m49099s().m129000L0(this.f33511X.m109528e(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, false), "Live", "Video");
            m28861p2();
        } else if (i13 == 2) {
            m28870s2();
        } else {
            if (i13 != 3) {
                return;
            }
            m28840i2();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m28749E0() {
        this.f33513Z.f33567j.setOnClickListener(new C1951a(new C35448e(this, 16)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public /* synthetic */ void m28750E1(View view) {
        m28827e1();
    }

    /* JADX INFO: renamed from: F0 */
    private static double m28752F0(int i13) {
        return ((double) i13) * 4.184d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public /* synthetic */ void m28753F1(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(intent, getString(AbstractC29654g.f121196l)), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public void m28755G0(int i13, int i14, int i15, int i16) {
        float f13;
        float f14;
        ImageView imageView = this.f33513Z.f33582y;
        Matrix imageMatrix = imageView.getImageMatrix();
        if (i15 * i14 > i16 * i13) {
            f13 = i14;
            f14 = i16;
        } else {
            f13 = i13;
            f14 = i15;
        }
        float f15 = f13 / f14;
        imageMatrix.setScale(f15, f15);
        this.f33523j0 = new Matrix(imageMatrix);
        Matrix matrix = new Matrix(imageMatrix);
        this.f33524k0 = matrix;
        matrix.postTranslate(0.0f, -m28818b1());
        if (((Boolean) this.f33514a0.m70997Z()).booleanValue()) {
            imageView.setImageMatrix(this.f33524k0);
        } else {
            imageView.setImageMatrix(this.f33523j0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public /* synthetic */ void m28756G1(View view) {
        m28827e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public void m28758H0(boolean z4) {
        this.f33502O = z4;
        if (z4) {
            this.f33517d0.onNext(EnumC10879i.SNAP_PLUS);
        } else if (this.f33517d0.m70997Z() == EnumC10879i.SNAP_PLUS) {
            this.f33517d0.onNext(EnumC10879i.SHOOTING);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public /* synthetic */ void m28759H1(View view) {
        m28840i2();
    }

    /* JADX INFO: renamed from: I0 */
    private void m28761I0() {
        this.f33506S = true;
        if (this.f33526m0 != null) {
            this.f33512Y.mo85216g("VideoFragment has been closed", new AbstractC30556a.a[0]);
            AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
            C1271a c1271aM94758g = AbstractC30802r.m94758g(supportFragmentManager, supportFragmentManager);
            c1271aM94758g.m4050n(this.f33526m0);
            c1271aM94758g.m4046j();
            this.f33526m0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public /* synthetic */ void m28762I1(View view) {
        m28834g2();
    }

    /* JADX INFO: renamed from: J0 */
    private void m28764J0() {
        C10880j c10880j = this.f33513Z;
        c10880j.f33558a.m28914m(c10880j.f33577t.m28731t(), this.f33513Z.f33577t.m28734w());
        this.f33515b0.m75179c(this.f33513Z.f33558a.m28909h().m122662L(new C35448e(this, 9), new C35448e(this, 19)));
        this.f33515b0.m75179c(this.f33513Z.f33558a.m28908g().m122661K(new C35448e(this, 22)));
        this.f33515b0.m75179c(this.f33513Z.f33558a.m28907f().m122661K(new C35448e(this, 23)));
        this.f33515b0.m75179c(this.f33514a0.m122661K(new C35448e(this, 24)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public /* synthetic */ void m28765J1(View view) {
        m28873t2();
    }

    /* JADX INFO: renamed from: K0 */
    private void m28767K0() {
        m28795T1();
        m28749E0();
        m28791S0();
        m28746D0();
        m28788R0();
        m28803W0();
        m28789R1();
        m28800V0();
        m28797U0();
        m28837h2();
        if (this.f33505R) {
            this.f33513Z.f33569l.setOnTouchListener(this);
        } else {
            m28852m2();
        }
        m28738A0();
        m28825d2();
        m28786Q1();
        m28828e2();
        m28783P1();
        m28743C0();
        this.f33513Z.f33556R.setOnClickListener(new ViewOnClickListenerC21821j(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public /* synthetic */ void m28768K1() {
        getWindow().addFlags(128);
        m28879v2();
        if (this.f33513Z.f33550L.m28672o()) {
            return;
        }
        this.f33513Z.f33550L.m28675r();
    }

    /* JADX INFO: renamed from: L0 */
    private void m28770L0() {
        Cycle cycleM28899q = new C10877g(this, getIntent()).m28899q();
        if (cycleM28899q == null) {
            this.f33512Y.mo85222m("Couldn't load Snap - no cycle in Intent?", new AbstractC30556a.a[0]);
        }
        this.f33513Z.f33577t.setCycle(cycleM28899q);
        View view = this.f33513Z.f33578u;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC10872b(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public /* synthetic */ void m28771L1() {
        C10880j c10880j = this.f33513Z;
        this.f33503P = c10880j.f33577t;
        c10880j.f33548J.setVisibility(0);
        this.f33513Z.f33566i.setVisibility(8);
        this.f33513Z.f33565h.setVisibility(8);
        this.f33513Z.f33570m.setVisibility(8);
        this.f33513Z.f33573p.setVisibility(8);
        this.f33513Z.f33562e.setVisibility(4);
        this.f33513Z.f33545G.setVisibility(8);
        this.f33513Z.f33561d.setVisibility(4);
        this.f33513Z.f33577t.setVisibility(4);
        this.f33513Z.f33558a.setVisibility(4);
        this.f33513Z.f33558a.m28910i();
        EnumC35444a colorMode = this.f33513Z.f33577t.getColorMode();
        this.f33526m0.m99411M(m28809Y0());
        this.f33526m0.m99410L();
        this.f33503P.setVisibility(8);
        C33239a c33239a = this.f33497J;
        if (c33239a != null) {
            if (colorMode == EnumC35444a.TINTED) {
                c33239a.m105443F(this.f33513Z.f33577t.getTintColor().intValue());
            } else {
                c33239a.m105446J(colorMode);
            }
        }
        this.f33499L = EnumC31929b.RECORDING;
        m28855n2();
        m28864q2();
    }

    /* JADX INFO: renamed from: M0 */
    private void m28773M0() {
        this.f33496I = (C29020i) AbstractC15751g.m44472y(C29020i.class, null, new C35231a(19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public /* synthetic */ void m28774M1() {
        if (this.f33499L == EnumC31929b.RECORDING) {
            m28867r2();
        }
    }

    /* JADX INFO: renamed from: N0 */
    private void m28776N0() {
        this.f33515b0.m75179c(this.f33513Z.f33577t.m28731t().m122661K(new C35448e(this, 0)));
        this.f33515b0.m75179c(this.f33513Z.f33577t.m28734w().m122661K(new C35448e(this, 1)));
        this.f33515b0.m75179c(this.f33513Z.f33577t.m28732u().m122661K(new C35448e(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public /* synthetic */ void m28777N1() {
        if (this.f33499L == EnumC31929b.RECORDING) {
            this.f33499L = EnumC31929b.DONE;
        }
        this.f33513Z.f33548J.setVisibility(8);
        this.f33513Z.f33569l.setVisibility(8);
        this.f33513Z.f33547I.setVisibility(0);
        this.f33513Z.f33545G.setImageResource(AbstractC26662c.f105981c);
        this.f33513Z.f33545G.setVisibility(0);
        this.f33513Z.f33562e.setVisibility(4);
        this.f33513Z.f33561d.setVisibility(4);
        if (this.f33513Z.f33550L.m28672o()) {
            this.f33513Z.f33550L.m28677t();
        }
        this.f33526m0.m99407G();
        m28798U1();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f33503P.getWidth(), this.f33503P.getHeight(), Bitmap.Config.ARGB_8888);
        C33239a c33239a = this.f33497J;
        if (c33239a != null) {
            c33239a.m105447K(bitmapCreateBitmap);
        }
    }

    /* JADX INFO: renamed from: O0 */
    private void m28779O0() {
        ViewPager viewPager = this.f33513Z.f33561d;
        viewPager.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC10873c(viewPager));
        this.f33515b0.m75179c(this.f33513Z.f33577t.m28733v().m122661K(new C35448e(this, 25)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public /* synthetic */ void m28780O1() {
        this.f33497J.m105445I();
        C31930c c31930c = this.f33526m0;
        if (c31930c != null) {
            c31930c.m99411M(m28809Y0());
            this.f33526m0.m99410L();
        }
        C10880j c10880j = this.f33513Z;
        if (c10880j != null) {
            c10880j.f33577t.m28737z();
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m28782P0() {
        C29020i c29020i = this.f33496I;
        if (c29020i != null) {
            c29020i.m88252b();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m28783P1() {
        this.f33513Z.f33553O.setOnClickListener(new C1951a(new C35448e(this, 20)));
    }

    /* JADX INFO: renamed from: Q0 */
    private void m28785Q0() {
        this.f33513Z.f33545G.setImageResource(AbstractC26662c.f105981c);
        this.f33513Z.f33545G.setVisibility(0);
        this.f33513Z.f33551M.setImageDrawable(AbstractC32122c.getDrawable(this, AbstractC29651d.f121095a));
    }

    /* JADX INFO: renamed from: Q1 */
    private void m28786Q1() {
        this.f33513Z.f33551M.setOnClickListener(new C1951a(new C35448e(this, 17)));
    }

    /* JADX INFO: renamed from: R0 */
    private void m28788R0() {
        this.f33513Z.f33541C.setOnClickListener(new C1951a(new C35448e(this, 7)));
    }

    /* JADX INFO: renamed from: R1 */
    private void m28789R1() {
        this.f33513Z.f33545G.setOnClickListener(new C1951a(new C35448e(this, 21)));
    }

    /* JADX INFO: renamed from: S0 */
    private void m28791S0() {
        this.f33513Z.f33540B.setOnClickListener(new C1951a(new C35448e(this, 11)));
    }

    /* JADX INFO: renamed from: S1 */
    private void m28792S1() {
        if (this.f33525l0) {
            m49099s().m129057s0(m28815a1(this.f33513Z.f33577t.getMode()));
        } else {
            m49099s().m129055r0(m28815a1(this.f33513Z.f33577t.getMode()));
        }
    }

    /* JADX INFO: renamed from: T0 */
    private void m28794T0() {
        C29020i c29020i = this.f33496I;
        if (c29020i != null) {
            c29020i.m88251a();
        }
    }

    /* JADX INFO: renamed from: T1 */
    private void m28795T1() {
        this.f33513Z.f33565h.setOnClickListener(new C1951a(new C35448e(this, 14)));
    }

    /* JADX INFO: renamed from: U0 */
    private void m28797U0() {
        this.f33513Z.f33572o.setOnClickListener(new C1951a(new C35448e(this, 6)));
    }

    /* JADX INFO: renamed from: U1 */
    private void m28798U1() {
        if (this.f33498K != null) {
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", this.f33498K);
            this.f33513Z.f33549K.setVisibility(0);
            this.f33513Z.f33549K.m28655k(uriForFile);
            this.f33513Z.f33549K.m28657n();
        }
    }

    /* JADX INFO: renamed from: V0 */
    private void m28800V0() {
        this.f33513Z.f33571n.setOnClickListener(new C1951a(new C35448e(this, 13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public void m28801V1(Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (this.f33519f0 == null) {
            this.f33519f0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.f33521h0 = new Canvas(this.f33519f0);
        }
        this.f33521h0.drawBitmap(bitmap, 0.0f, 0.0f, this.f33520g0);
    }

    /* JADX INFO: renamed from: W0 */
    private void m28803W0() {
        this.f33513Z.f33573p.setOnClickListener(new C1951a(new C35448e(this, 8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public void m28804W1(EnumC35444a enumC35444a) {
        if (enumC35444a == EnumC35444a.TINTED) {
            this.f33513Z.f33582y.setImageBitmap(this.f33519f0);
        } else if (enumC35444a == EnumC35444a.DARK) {
            this.f33513Z.f33582y.setImageBitmap(this.f33518e0);
            this.f33513Z.f33582y.setColorFilter(this.f33522i0);
        } else {
            this.f33513Z.f33582y.setImageBitmap(this.f33518e0);
            this.f33513Z.f33582y.setColorFilter((ColorFilter) null);
        }
    }

    /* JADX INFO: renamed from: X0 */
    private Bitmap m28806X0(View view) {
        if (1 > view.getWidth()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: X1 */
    private void m28807X1() {
        this.f33509V.removeCallbacks(this.f33510W);
    }

    /* JADX INFO: renamed from: Y0 */
    private int m28809Y0() {
        if (this.f33513Z.f33558a.m28906d()) {
            C31930c.m99399J().m99411M(1);
        } else {
            C31930c.m99399J().m99411M(0);
        }
        return C31930c.m99399J().m99408I();
    }

    /* JADX INFO: renamed from: Y1 */
    private void m28810Y1() {
        if (!m28830f1("android.permission.CAMERA")) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, 1);
        }
        if (m28830f1("android.permission.RECORD_AUDIO")) {
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
    }

    /* JADX INFO: renamed from: Z0 */
    private int m28812Z0() {
        return (int) (this.f33513Z.f33558a.getMeasuredWidth() * this.f33513Z.f33560c.getAspectRatio());
    }

    /* JADX INFO: renamed from: Z1 */
    private void m28813Z1() {
        this.f33513Z.f33549K.m28656l();
        this.f33513Z.f33549K.m28654f();
        this.f33513Z.f33549K.setVisibility(8);
        this.f33499L = EnumC31929b.START;
        this.f33498K = null;
        if (this.f33506S) {
            m28822c2();
            this.f33506S = false;
        } else {
            m28819b2();
        }
        this.f33513Z.f33566i.setVisibility(0);
        this.f33513Z.f33565h.setVisibility(0);
        this.f33513Z.f33570m.setVisibility(0);
        this.f33513Z.f33573p.setVisibility(0);
        this.f33513Z.f33569l.setVisibility(0);
        this.f33513Z.f33547I.setVisibility(8);
        getWindow().clearFlags(128);
    }

    /* JADX INFO: renamed from: a1 */
    private String m28815a1(EnumC35445b enumC35445b) {
        int i13 = C10876f.f33535a[enumC35445b.ordinal()];
        if (i13 == 1) {
            return "Live";
        }
        if (i13 == 2) {
            return "Overview";
        }
        if (i13 == 3) {
            return "Strain";
        }
        if (i13 != 4) {
            return i13 != 5 ? "" : "Sleep";
        }
        return "Recovery";
    }

    /* JADX INFO: renamed from: a2 */
    private void m28816a2() {
        this.f33513Z.f33549K.m28656l();
        this.f33513Z.f33549K.m28654f();
        this.f33513Z.f33549K.setVisibility(8);
        this.f33498K.delete();
        this.f33498K = null;
        this.f33499L = EnumC31929b.START;
        if (this.f33506S) {
            m28822c2();
            this.f33506S = false;
        } else {
            m28819b2();
        }
        this.f33513Z.f33553O.setVisibility(0);
        this.f33513Z.f33551M.setImageDrawable(AbstractC32122c.getDrawable(this, AbstractC29651d.f121096b));
        this.f33513Z.f33577t.m28736y();
        m28890z2();
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public int m28818b1() {
        return (this.f33513Z.f33558a.getMeasuredHeight() - m28812Z0()) / 2;
    }

    /* JADX INFO: renamed from: b2 */
    private void m28819b2() {
        try {
            this.f33512Y.mo85216g("Resetting Media Recorder.", new AbstractC30556a.a[0]);
            this.f33498K = m28821c1();
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getRealSize(point);
            this.f33513Z.f33550L.m28671n(this.f33498K, point.x, point.y, null, null);
        } catch (IOException e5) {
            this.f33512Y.mo85222m("Couldn't re-init recording " + e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private File m28821c1() {
        return new File(getExternalCacheDir(), "WhoopLive_" + C28204u.m85357f() + ".mp4");
    }

    /* JADX INFO: renamed from: c2 */
    private void m28822c2() {
        if (!m28830f1("android.permission.CAMERA") || !m28830f1("android.permission.RECORD_AUDIO")) {
            m28810Y1();
            return;
        }
        this.f33512Y.mo85216g("Resetting Video Fragment ", new AbstractC30556a.a[0]);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getRealSize(point);
        int i13 = point.y;
        int i14 = point.x;
        this.f33512Y.mo85216g(AbstractC2875y.m8295h(i13, "display Metrics Media  Recorder Height: "), new AbstractC30556a.a[0]);
        this.f33512Y.mo85216g(AbstractC2875y.m8295h(i14, "display Metrics Media  Recorder Width: "), new AbstractC30556a.a[0]);
        if (this.f33497J == null) {
            int iM117627b = AbstractC36615a.m117627b(i13);
            int iM117626a = AbstractC36615a.m117626a(i14);
            if (iM117627b <= i14) {
                iM117627b = i14;
            }
            if (iM117626a <= i13) {
                iM117626a = i13;
            }
            this.f33497J = new C33239a(this, iM117627b, iM117626a);
        }
        m28831f2(this.f33497J);
        this.f33513Z.f33550L.m28674q();
        File fileM28821c1 = m28821c1();
        this.f33498K = fileM28821c1;
        try {
            this.f33513Z.f33550L.m28671n(fileM28821c1, i14, i13, null, null);
        } catch (IOException e5) {
            this.f33512Y.mo85222m("Couldn't re-init recording " + e5, new AbstractC30556a.a[0]);
            Log.e("SelfieActivity", "Couldn't re-init recording", e5);
        }
    }

    /* JADX INFO: renamed from: d1 */
    private void m28824d1() {
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(5634);
        window.setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: d2 */
    private void m28825d2() {
        this.f33513Z.f33555Q.setOnClickListener(new C1951a(new C35448e(this, 4)));
    }

    /* JADX INFO: renamed from: e1 */
    private void m28827e1() {
        Object objM70997Z = this.f33517d0.m70997Z();
        EnumC10879i enumC10879i = EnumC10879i.EDITING;
        if (objM70997Z == enumC10879i) {
            this.f33517d0.onNext(EnumC10879i.SHOOTING);
            return;
        }
        if (this.f33517d0.m70997Z() == EnumC10879i.ZOOMING) {
            this.f33517d0.onNext(enumC10879i);
            return;
        }
        boolean z4 = this.f33502O;
        if (!z4 && this.f33499L == EnumC31929b.DONE) {
            this.f33499L = EnumC31929b.START;
            m28813Z1();
            m28888y2();
        } else if (z4 && this.f33499L == EnumC31929b.DONE) {
            this.f33499L = EnumC31929b.START;
            m28816a2();
        } else {
            setResult(0);
            finish();
        }
    }

    /* JADX INFO: renamed from: e2 */
    private void m28828e2() {
        this.f33513Z.f33547I.setOnClickListener(new C1951a(new C35448e(this, 18)));
    }

    /* JADX INFO: renamed from: f1 */
    private boolean m28830f1(String str) {
        return AbstractC32122c.checkSelfPermission(this, str) == 0;
    }

    /* JADX INFO: renamed from: f2 */
    private void m28831f2(C33239a c33239a) {
        AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = supportFragmentManager.m4140E("WhoopVideoFragment");
        if (abstractComponentCallbacksC1320m0M4140E != null) {
            this.f33526m0 = (C31930c) abstractComponentCallbacksC1320m0M4140E;
            return;
        }
        C31930c c31930cM99399J = C31930c.m99399J();
        this.f33526m0 = c31930cM99399J;
        c31930cM99399J.m99413O(this.f33513Z.f33550L);
        this.f33526m0.m99414P(c33239a);
        this.f33526m0.m99411M(0);
        C1271a c1271a = new C1271a(supportFragmentManager);
        c1271a.mo4042d(0, this.f33526m0, "WhoopVideoFragment", 1);
        c1271a.m4046j();
        supportFragmentManager.m4195z(true);
        supportFragmentManager.m4141G();
    }

    /* JADX INFO: renamed from: g1 */
    private void m28833g1() {
        this.f33513Z.f33553O.setVisibility(4);
        this.f33513Z.f33551M.setImageDrawable(AbstractC32122c.getDrawable(this, AbstractC29651d.f121097c));
        this.f33513Z.f33561d.setVisibility(4);
        this.f33513Z.f33562e.setVisibility(4);
        this.f33513Z.f33577t.m28730l();
        this.f33513Z.f33545G.setVisibility(4);
        this.f33513Z.f33577t.setVisibility(4);
        this.f33503P = this.f33513Z.f33577t;
    }

    /* JADX INFO: renamed from: g2 */
    private void m28834g2() {
        View view = this.f33513Z.f33544F;
        view.setDrawingCacheEnabled(true);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM28812Z0 = ((Boolean) this.f33514a0.m70997Z()).booleanValue() ? m28812Z0() : measuredHeight;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, iM28812Z0, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(0.0f, ((measuredHeight - iM28812Z0) * (-1)) >> 1);
        view.draw(canvas);
        File file = new File(getExternalCacheDir(), "whoop_share.jpg");
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(file));
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/jpeg");
            intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(this, getPackageName() + ".provider", file));
            intent.addFlags(1);
            Intent intentCreateChooser = Intent.createChooser(intent, getString(AbstractC29654g.f121185a));
            intentCreateChooser.addFlags(1);
            startActivityForResult(intentCreateChooser, 3);
            m28792S1();
        } catch (IOException e5) {
            this.f33512Y.mo85230v("Could not share", e5, new AbstractC30556a.a[0]);
            Toast.makeText(this, AbstractC29654g.f121188d, 0).show();
        }
    }

    /* JADX INFO: renamed from: h1 */
    private void m28836h1() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f33520g0.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    /* JADX INFO: renamed from: h2 */
    private void m28837h2() {
        this.f33513Z.f33543E.setOnClickListener(new C1951a(new C35448e(this, 5)));
    }

    /* JADX INFO: renamed from: i1 */
    public static C10877g m28839i1(Context context, long j7, String str, String str2, Double d3, int i13, Long l7, boolean z4, int i14) {
        String str3 = (l7 == null || l7.longValue() <= 0) ? "pending" : "complete";
        String str4 = i13 > 0 ? "complete" : "pending";
        if (d3 != null) {
            int i15 = (d3.doubleValue() > 0.0d ? 1 : (d3.doubleValue() == 0.0d ? 0 : -1));
        }
        return new C10877g(context).m28900r(new Cycle(j7, null, new Period(str, str2), null, null, new Strain(null, -1.0f, -1, m28752F0(i14), d3.doubleValue(), -1.0d, null), new Sleep(-1, str3, -1, l7, null, null, null), new Recovery(-1, str4, i13, str4.equals("pending"), null, null, -1, Double.valueOf(-1.0d), true, -1)));
    }

    /* JADX INFO: renamed from: i2 */
    private void m28840i2() {
        if (this.f33498K != null) {
            C10880j c10880j = this.f33513Z;
            if (c10880j != null && c10880j.f33577t != null) {
                m49099s().m129055r0(m28815a1(this.f33513Z.f33577t.getMode()));
            }
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", this.f33498K);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType(MimeType.MIME_TYPE_VIDEO_MP4);
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            startActivity(Intent.createChooser(intent, getString(AbstractC29654g.f121198n)));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public static boolean m28842j1(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return true;
        }
        C12723b.m35566a().m35569d().mo85216g("Selfie disabled: Camera=false", new AbstractC30556a.a[0]);
        return false;
    }

    /* JADX INFO: renamed from: j2 */
    private void m28843j2(Uri uri) {
        C4964f c4964fM15545i = ComponentCallbacks2C4960b.m15530f(this.f33513Z.f33582y).m15545i(Drawable.class);
        c4964fM15545i.f20321Y = uri;
        c4964fM15545i.f20323a0 = true;
        m28846k2(c4964fM15545i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m28845k1(View view) {
        if (this.f33513Z.f33577t.m28729k()) {
            this.f33517d0.onNext(EnumC10879i.ZOOMING);
        }
    }

    /* JADX INFO: renamed from: k2 */
    private void m28846k2(C4964f c4964f, boolean z4) {
        if (z4) {
            c4964f = c4964f.mo15533a((C29341d) new C29341d().m89329u(new C38768a(), true));
        }
        C10875e c10875e = new C10875e();
        c4964f.f20322Z = null;
        c4964f.f20322Z = new ArrayList();
        c4964f.f20322Z.add(c10875e);
        c4964f.m15538z(new C30460f(c4964f.f20317U));
        this.f33513Z.f33564g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m28848l1(View view) {
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null)));
    }

    /* JADX INFO: renamed from: l2 */
    private void m28849l2(byte[] bArr, boolean z4) {
        C4964f c4964fM15545i = ComponentCallbacks2C4960b.m15530f(this.f33513Z.f33582y).m15545i(Drawable.class);
        c4964fM15545i.f20321Y = bArr;
        c4964fM15545i.f20323a0 = true;
        if (!AbstractC29338a.m89312g(c4964fM15545i.f118873w, 4)) {
            c4964fM15545i = c4964fM15545i.mo15533a((C29341d) new C29341d().m89314d(C40786k.f175892c));
        }
        if (!AbstractC29338a.m89312g(c4964fM15545i.f118873w, 256)) {
            if (C29341d.f118877T == null) {
                C29341d c29341d = (C29341d) new C29341d().m89326r(true);
                if (c29341d.f118869P && !c29341d.f118870Q) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
                c29341d.f118870Q = true;
                c29341d.f118869P = true;
                C29341d.f118877T = c29341d;
            }
            c4964fM15545i = c4964fM15545i.mo15533a(C29341d.f118877T);
        }
        m28846k2(c4964fM15545i, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m28851m1(View view) {
        this.f33514a0.onNext(Boolean.FALSE);
        m49099s().m129053q0();
    }

    /* JADX INFO: renamed from: m2 */
    private void m28852m2() {
        this.f33513Z.f33569l.setOnClickListener(new C1951a(new C35448e(this, 12)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m28854n1(View view) {
        this.f33514a0.onNext(Boolean.TRUE);
        m49099s().m129051p0();
    }

    /* JADX INFO: renamed from: n2 */
    private void m28855n2() {
        runOnUiThread(new RunnableC35447d(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m28857o1(byte[] bArr) {
        m28849l2(bArr, this.f33513Z.f33558a.m28906d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public void m28858o2() {
        runOnUiThread(new RunnableC35447d(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m28860p1(Throwable th3) {
        this.f33512Y.mo85230v("Capture failed", th3, new AbstractC30556a.a[0]);
        this.f33513Z.f33564g.setVisibility(8);
        Toast.makeText(this, AbstractC29654g.f121186b, 0).show();
    }

    /* JADX INFO: renamed from: p2 */
    private void m28861p2() {
        m28833g1();
        this.f33499L = EnumC31929b.RECORDING;
        this.f33526m0.m99411M(m28809Y0());
        m28855n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m28863q1(EnumC36621g enumC36621g) {
        if (enumC36621g == EnumC36621g.ON) {
            C10880j c10880j = this.f33513Z;
            ViewFlipper viewFlipper = c10880j.f33570m;
            viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(c10880j.f33571n));
        } else {
            C10880j c10880j2 = this.f33513Z;
            ViewFlipper viewFlipper2 = c10880j2.f33570m;
            viewFlipper2.setDisplayedChild(viewFlipper2.indexOfChild(c10880j2.f33572o));
        }
    }

    /* JADX INFO: renamed from: q2 */
    private void m28864q2() {
        RunnableC35447d runnableC35447d = new RunnableC35447d(this, 3);
        this.f33510W = runnableC35447d;
        this.f33509V.postDelayed(runnableC35447d, this.f33501N);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m28866r1(C36620f c36620f) {
        this.f33513Z.f33570m.setVisibility(c36620f.m117690b() ? 0 : 4);
        this.f33513Z.f33573p.setVisibility(c36620f.m117689a() ? 0 : 4);
    }

    /* JADX INFO: renamed from: r2 */
    private void m28867r2() {
        runOnUiThread(new RunnableC35447d(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m28869s1(Boolean bool) {
        if (bool.booleanValue()) {
            this.f33513Z.f33560c.setVisibility(0);
            C10880j c10880j = this.f33513Z;
            int iIndexOfChild = c10880j.f33566i.indexOfChild(c10880j.f33568k);
            this.f33513Z.f33566i.setDisplayedChild(iIndexOfChild);
            this.f33513Z.f33539A.setDisplayedChild(iIndexOfChild);
            m28741B0(true);
            return;
        }
        this.f33513Z.f33560c.setVisibility(4);
        C10880j c10880j2 = this.f33513Z;
        int iIndexOfChild2 = c10880j2.f33566i.indexOfChild(c10880j2.f33567j);
        this.f33513Z.f33566i.setDisplayedChild(iIndexOfChild2);
        this.f33513Z.f33539A.setDisplayedChild(iIndexOfChild2);
        m28741B0(false);
    }

    /* JADX INFO: renamed from: s2 */
    private void m28870s2() {
        this.f33499L = EnumC31929b.DONE;
        this.f33513Z.f33550L.m28677t();
        this.f33526m0.m99407G();
        m28785Q0();
        m28798U1();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f33513Z.f33577t.getWidth(), this.f33513Z.f33577t.getHeight(), Bitmap.Config.ARGB_8888);
        C33239a c33239a = this.f33497J;
        if (c33239a != null) {
            c33239a.m105447K(bitmapCreateBitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m28872t1(View view) {
        finish();
    }

    /* JADX INFO: renamed from: t2 */
    private void m28873t2() {
        m49099s().m129000L0(this.f33511X.m109528e(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, false), m28815a1(this.f33513Z.f33577t.getMode()), "Photo");
        this.f33513Z.f33564g.setVisibility(0);
        this.f33513Z.f33558a.m28912k();
        this.f33525l0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static /* synthetic */ C34911a m28875u1() {
        return AbstractC15751g.m44431K(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public void m28876u2(EnumC31928a enumC31928a) {
        C33239a c33239a = this.f33497J;
        if (c33239a != null) {
            c33239a.m105444H(enumC31928a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m28878v1(Integer num) {
        if (num.intValue() != -1) {
            this.f33513Z.f33582y.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public void m28879v2() {
        if (this.f33497J != null) {
            if (this.f33499L == EnumC31929b.RECORDING) {
                this.f33507T.schedule(new C10874d(), 25L);
            }
            this.f33497J.m105447K(m28806X0(this.f33503P));
            if (this.f33513Z.f33577t.getMode() != EnumC35445b.LIVE) {
                this.f33513Z.f33548J.setProgress((System.currentTimeMillis() - this.f33500M) / this.f33501N);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public /* synthetic */ void m28881w1(String str) {
        if (AbstractC32410a.m101006O(str)) {
            this.f33513Z.f33577t.setVisibility(0);
            this.f33513Z.f33575r.setVisibility(4);
            this.f33513Z.f33569l.setEnabled(true);
            this.f33513Z.f33543E.setEnabled(true);
            return;
        }
        this.f33513Z.f33577t.setVisibility(8);
        this.f33513Z.f33575r.setVisibility(0);
        this.f33513Z.f33576s.setText(str);
        this.f33513Z.f33569l.setEnabled(false);
        this.f33513Z.f33543E.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public void m28882w2(EnumC10879i enumC10879i) {
        if (enumC10879i == EnumC10879i.SHOOTING) {
            m28888y2();
        } else if (enumC10879i == EnumC10879i.EDITING) {
            m28885x2();
        } else if (enumC10879i == EnumC10879i.ZOOMING) {
            m28740A2();
        } else if (enumC10879i == EnumC10879i.SNAP_PLUS) {
            m28890z2();
        }
        this.f33513Z.f33564g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m28884x1(View view) {
        this.f33514a0.onNext(Boolean.FALSE);
        m49099s().m129053q0();
    }

    /* JADX INFO: renamed from: x2 */
    private void m28885x2() {
        boolean zM28729k = this.f33513Z.f33577t.m28729k();
        this.f33513Z.f33558a.setVisibility(4);
        this.f33513Z.f33582y.setVisibility(0);
        this.f33513Z.f33577t.setVisibility(zM28729k ? 0 : 8);
        this.f33513Z.f33558a.m28910i();
        this.f33513Z.f33583z.setVisibility(0);
        this.f33513Z.f33563f.setVisibility(4);
        this.f33513Z.f33561d.setVisibility(0);
        this.f33513Z.f33562e.setVisibility(0);
        this.f33513Z.f33554P.setVisibility(4);
        this.f33513Z.f33545G.setImageResource(AbstractC26662c.f105981c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public /* synthetic */ void m28887y1(View view) {
        this.f33514a0.onNext(Boolean.TRUE);
        m49099s().m129051p0();
    }

    /* JADX INFO: renamed from: y2 */
    private void m28888y2() {
        boolean zM28729k = this.f33513Z.f33577t.m28729k();
        if (this.f33518e0 != null) {
            this.f33518e0 = null;
        }
        if (this.f33519f0 != null) {
            this.f33519f0 = null;
        }
        if (this.f33504Q) {
            this.f33504Q = false;
        } else {
            this.f33497J.m105445I();
            this.f33526m0.m99411M(m28809Y0());
            this.f33513Z.f33577t.m28735x();
        }
        this.f33513Z.f33549K.setVisibility(8);
        this.f33513Z.f33558a.setVisibility(0);
        this.f33513Z.f33558a.m28911j();
        this.f33513Z.f33582y.setVisibility(8);
        this.f33513Z.f33577t.setVisibility(zM28729k ? 0 : 8);
        this.f33513Z.f33583z.setVisibility(4);
        this.f33513Z.f33552N.setVisibility(4);
        this.f33513Z.f33563f.setVisibility(0);
        this.f33513Z.f33561d.setVisibility(0);
        this.f33513Z.f33562e.setVisibility(0);
        this.f33513Z.f33554P.setVisibility(4);
        this.f33513Z.f33545G.setImageResource(AbstractC36512c.f156067j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m28889z1(View view) {
        this.f33513Z.f33558a.setFlashMode(EnumC36621g.ON);
    }

    /* JADX INFO: renamed from: z2 */
    private void m28890z2() {
        boolean zM28729k = this.f33513Z.f33577t.m28729k();
        if (this.f33504Q) {
            this.f33504Q = false;
        }
        this.f33513Z.f33549K.setVisibility(8);
        this.f33513Z.f33558a.m28910i();
        this.f33513Z.f33558a.setVisibility(4);
        this.f33513Z.f33582y.setVisibility(8);
        this.f33513Z.f33577t.setVisibility(zM28729k ? 0 : 8);
        this.f33513Z.f33583z.setVisibility(4);
        this.f33513Z.f33563f.setVisibility(4);
        this.f33513Z.f33552N.setVisibility(0);
        this.f33513Z.f33561d.setVisibility(0);
        this.f33513Z.f33562e.setVisibility(0);
        this.f33513Z.f33554P.setVisibility(4);
        this.f33513Z.f33545G.setImageResource(AbstractC36512c.f156067j);
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC35447d(this, 0), 50L);
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        if (i13 != 2) {
            super.onActivityResult(i13, i14, intent);
            return;
        }
        if (i14 == -1) {
            try {
                m28843j2(intent.getData());
                this.f33525l0 = true;
            } catch (Exception e5) {
                this.f33512Y.mo85230v("User selected an image but we could not load it", e5, new AbstractC30556a.a[0]);
                Toast.makeText(this, AbstractC29654g.f121187c, 0).show();
            }
        }
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void onBackPressed() {
        m28827e1();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33512Y = new C34117o(C12723b.m35566a().m35569d(), "SelfieActivity");
        if (!m28842j1(this)) {
            this.f33512Y.mo85226q("Selfie feature is not supported on this device", new AbstractC30556a.a[0]);
            finish();
            return;
        }
        this.f33504Q = true;
        m28836h1();
        setContentView(AbstractC29653f.f121181a);
        this.f33513Z = new C10880j(this);
        m28824d1();
        m28767K0();
        m28770L0();
        m28764J0();
        m28776N0();
        m28779O0();
        m28773M0();
        m28810Y1();
        m28822c2();
        this.f33509V = new Handler(Looper.getMainLooper());
        C34660d c34660d = (C34660d) AbstractC15751g.m44472y(C34660d.class, new C35953c("mainPrefs"), null);
        this.f33511X = c34660d;
        c34660d.m109538q(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, true);
        m49099s().m129035g0("WHOOP Live");
        ((InterfaceC21153l0) AbstractC15751g.m44472y(InterfaceC21153l0.class, null, null)).mo59004J("SelfieActivity");
    }

    @Override // hj0.AbstractActivityC17347f, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C34660d c34660d = this.f33511X;
        if (c34660d != null) {
            c34660d.m109538q(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, false);
        }
        C10880j c10880j = this.f33513Z;
        if (c10880j != null) {
            c10880j.f33550L.m28676s();
            this.f33513Z = null;
        }
        this.f33515b0.m75180d();
        this.f33527n0.m85161d();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f33513Z.f33550L.m28673p();
        this.f33513Z.f33558a.m28910i();
        File file = this.f33498K;
        if (file != null && file.length() > 0 && this.f33499L == EnumC31929b.RECORDING) {
            m28870s2();
            this.f33513Z.f33549K.m28656l();
            m28761I0();
            return;
        }
        File file2 = this.f33498K;
        if (file2 != null && file2.length() > 0 && this.f33499L == EnumC31929b.DONE) {
            this.f33513Z.f33549K.m28656l();
            m28761I0();
        } else {
            this.f33516c0.m75180d();
            m28761I0();
            getWindow().clearFlags(128);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i13, strArr, iArr);
        if (m28830f1("android.permission.CAMERA") && m28830f1("android.permission.RECORD_AUDIO")) {
            this.f33513Z.f33574q.setVisibility(8);
            this.f33513Z.f33546H.setVisibility(0);
        } else {
            this.f33513Z.f33574q.setVisibility(0);
            this.f33513Z.f33546H.setVisibility(8);
            this.f33513Z.f33558a.setVisibility(4);
        }
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m28830f1("android.permission.CAMERA") && m28830f1("android.permission.RECORD_AUDIO")) {
            this.f33513Z.f33574q.setVisibility(8);
            this.f33513Z.f33546H.setVisibility(0);
            File file = this.f33498K;
            if (file != null && file.length() > 0 && this.f33499L == EnumC31929b.DONE) {
                this.f33513Z.f33549K.m28657n();
                return;
            }
            if (this.f33506S) {
                m28822c2();
                this.f33506S = false;
            }
            this.f33516c0.m75179c(this.f33517d0.m122672a().m122677k().m122661K(new InterfaceC3255b() { // from class: com.whoop.whooplive.selfie.b
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    this.f33587w.m28882w2((SelfieActivity.EnumC10879i) obj);
                }
            }));
            if (this.f33517d0.m70997Z() == EnumC10879i.NONE) {
                this.f33517d0.onNext(EnumC10879i.SHOOTING);
            }
        }
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        m28794T0();
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStop() {
        super.onStop();
        m28782P0();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Timer timer = new Timer();
            this.f33508U = timer;
            timer.schedule(new C10871a(), 150L);
            this.f33500M = System.currentTimeMillis();
            return true;
        }
        if (action != 1) {
            return false;
        }
        this.f33508U.cancel();
        m28807X1();
        if (System.currentTimeMillis() - this.f33500M < 150) {
            m28873t2();
        } else if (this.f33499L == EnumC31929b.RECORDING) {
            m49099s().m129000L0(this.f33511X.m109528e(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, false), m28815a1(this.f33513Z.f33577t.getMode()), "Video");
            m28867r2();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (!z4 || this.f33504Q) {
            return;
        }
        m28824d1();
    }

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.SelfieActivity$g */
    public static class C10877g extends C17358q {
        public C10877g(Context context) {
            super(context, (Class<?>) SelfieActivity.class);
            m49150i().putExtra("selfieMode", EnumC35445b.OVERVIEW.ordinal());
        }

        /* JADX INFO: renamed from: q */
        public Cycle m28899q() {
            if (!m49150i().hasExtra(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE)) {
                return null;
            }
            String stringExtra = m49150i().getStringExtra(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE);
            if (TextUtils.isEmpty(stringExtra)) {
                return null;
            }
            return (Cycle) C28169i0.m85275e(stringExtra, Cycle.class);
        }

        /* JADX INFO: renamed from: r */
        public C10877g m28900r(Cycle cycle) {
            m49150i().putExtra(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, C28169i0.m85278i(cycle));
            return this;
        }

        public C10877g(Context context, Intent intent) {
            super(context, intent);
        }
    }
}
