package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import com.google.android.material.textfield.C5057p;
import com.whoop.android.R;
import io.sentry.hints.C20363j;
import j93.InterfaceC21461d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p161g.C14923z;
import p161g.InterfaceC14897b0;
import p167g5.InterfaceC15482a;
import p184h5.InterfaceC16885k;
import p189hb.C17073i;
import p236j.AbstractC21071j;
import p236j.C21062a;
import p236j.C21070i;
import p236j.C21073l;
import p236j.InterfaceC21072k;
import p249jc.AbstractC21598x;
import p267k.AbstractC22081b;
import p298l8.C23418a;
import p319m4.AbstractC25012a;
import p321m6.AbstractC25106b;
import p399pb.C29047d;
import p399pb.InterfaceC29049f;
import p479s4.InterfaceC32129j;
import p479s4.InterfaceC32130k;
import p581we.C37199o;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1329o1 {

    /* JADX INFO: renamed from: A */
    public AbstractComponentCallbacksC1320m0 f5697A;

    /* JADX INFO: renamed from: B */
    public AbstractC1356w0 f5698B;

    /* JADX INFO: renamed from: C */
    public final C1293f1 f5699C;

    /* JADX INFO: renamed from: D */
    public final C20363j f5700D;

    /* JADX INFO: renamed from: E */
    public C21070i f5701E;

    /* JADX INFO: renamed from: F */
    public C21070i f5702F;

    /* JADX INFO: renamed from: G */
    public C21070i f5703G;

    /* JADX INFO: renamed from: H */
    public ArrayDeque f5704H;

    /* JADX INFO: renamed from: I */
    public boolean f5705I;

    /* JADX INFO: renamed from: J */
    public boolean f5706J;

    /* JADX INFO: renamed from: K */
    public boolean f5707K;

    /* JADX INFO: renamed from: L */
    public boolean f5708L;

    /* JADX INFO: renamed from: M */
    public boolean f5709M;

    /* JADX INFO: renamed from: N */
    public ArrayList f5710N;

    /* JADX INFO: renamed from: O */
    public ArrayList f5711O;

    /* JADX INFO: renamed from: P */
    public ArrayList f5712P;

    /* JADX INFO: renamed from: Q */
    public C1348t1 f5713Q;

    /* JADX INFO: renamed from: R */
    public final RunnableC1276b0 f5714R;

    /* JADX INFO: renamed from: b */
    public boolean f5716b;

    /* JADX INFO: renamed from: e */
    public ArrayList f5719e;

    /* JADX INFO: renamed from: g */
    public C14923z f5721g;

    /* JADX INFO: renamed from: p */
    public final C37199o f5730p;

    /* JADX INFO: renamed from: q */
    public final CopyOnWriteArrayList f5731q;

    /* JADX INFO: renamed from: r */
    public final C1277b1 f5732r;

    /* JADX INFO: renamed from: s */
    public final C1277b1 f5733s;

    /* JADX INFO: renamed from: t */
    public final C1277b1 f5734t;

    /* JADX INFO: renamed from: u */
    public final C1277b1 f5735u;

    /* JADX INFO: renamed from: v */
    public final C1289e1 f5736v;

    /* JADX INFO: renamed from: w */
    public int f5737w;

    /* JADX INFO: renamed from: x */
    public AbstractC1359x0 f5738x;

    /* JADX INFO: renamed from: y */
    public AbstractC1350u0 f5739y;

    /* JADX INFO: renamed from: z */
    public AbstractComponentCallbacksC1320m0 f5740z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5715a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C1274a2 f5717c = new C1274a2();

    /* JADX INFO: renamed from: d */
    public ArrayList f5718d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C1365z0 f5720f = new LayoutInflaterFactory2C1365z0(this);

    /* JADX INFO: renamed from: h */
    public C1271a f5722h = null;

    /* JADX INFO: renamed from: i */
    public boolean f5723i = false;

    /* JADX INFO: renamed from: j */
    public final C1285d1 f5724j = new C1285d1(this);

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f5725k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    public final Map f5726l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final Map f5727m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    public final Map f5728n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o */
    public final ArrayList f5729o = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.fragment.app.b1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.fragment.app.b1] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.fragment.app.b1] */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.fragment.app.b1] */
    public AbstractC1329o1() {
        C37199o c37199o = new C37199o();
        c37199o.f159040w = this;
        c37199o.f159041x = new CopyOnWriteArrayList();
        this.f5730p = c37199o;
        this.f5731q = new CopyOnWriteArrayList();
        final int i13 = 0;
        this.f5732r = new InterfaceC15482a(this) { // from class: androidx.fragment.app.b1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1329o1 f5546b;

            {
                this.f5546b = this;
            }

            @Override // p167g5.InterfaceC15482a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1329o1 abstractC1329o1 = this.f5546b;
                        if (abstractC1329o1.m4146O()) {
                            abstractC1329o1.m4173i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1329o1 abstractC1329o2 = this.f5546b;
                        if (abstractC1329o2.m4146O() && num.intValue() == 80) {
                            abstractC1329o2.m4180m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o3 = this.f5546b;
                        if (abstractC1329o3.m4146O()) {
                            abstractC1329o3.m4182n(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o4 = this.f5546b;
                        if (abstractC1329o4.m4146O()) {
                            abstractC1329o4.m4188s(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
                        }
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f5733s = new InterfaceC15482a(this) { // from class: androidx.fragment.app.b1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1329o1 f5546b;

            {
                this.f5546b = this;
            }

            @Override // p167g5.InterfaceC15482a
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1329o1 abstractC1329o1 = this.f5546b;
                        if (abstractC1329o1.m4146O()) {
                            abstractC1329o1.m4173i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1329o1 abstractC1329o2 = this.f5546b;
                        if (abstractC1329o2.m4146O() && num.intValue() == 80) {
                            abstractC1329o2.m4180m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o3 = this.f5546b;
                        if (abstractC1329o3.m4146O()) {
                            abstractC1329o3.m4182n(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o4 = this.f5546b;
                        if (abstractC1329o4.m4146O()) {
                            abstractC1329o4.m4188s(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
                        }
                        break;
                }
            }
        };
        final int i15 = 2;
        this.f5734t = new InterfaceC15482a(this) { // from class: androidx.fragment.app.b1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1329o1 f5546b;

            {
                this.f5546b = this;
            }

            @Override // p167g5.InterfaceC15482a
            public final void accept(Object obj) {
                switch (i15) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1329o1 abstractC1329o1 = this.f5546b;
                        if (abstractC1329o1.m4146O()) {
                            abstractC1329o1.m4173i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1329o1 abstractC1329o2 = this.f5546b;
                        if (abstractC1329o2.m4146O() && num.intValue() == 80) {
                            abstractC1329o2.m4180m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o3 = this.f5546b;
                        if (abstractC1329o3.m4146O()) {
                            abstractC1329o3.m4182n(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o4 = this.f5546b;
                        if (abstractC1329o4.m4146O()) {
                            abstractC1329o4.m4188s(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
                        }
                        break;
                }
            }
        };
        final int i16 = 3;
        this.f5735u = new InterfaceC15482a(this) { // from class: androidx.fragment.app.b1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC1329o1 f5546b;

            {
                this.f5546b = this;
            }

            @Override // p167g5.InterfaceC15482a
            public final void accept(Object obj) {
                switch (i16) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        AbstractC1329o1 abstractC1329o1 = this.f5546b;
                        if (abstractC1329o1.m4146O()) {
                            abstractC1329o1.m4173i(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC1329o1 abstractC1329o2 = this.f5546b;
                        if (abstractC1329o2.m4146O() && num.intValue() == 80) {
                            abstractC1329o2.m4180m(false);
                            break;
                        }
                        break;
                    case 2:
                        MultiWindowModeChangedInfo multiWindowModeChangedInfo = (MultiWindowModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o3 = this.f5546b;
                        if (abstractC1329o3.m4146O()) {
                            abstractC1329o3.m4182n(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
                        }
                        break;
                    default:
                        PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (PictureInPictureModeChangedInfo) obj;
                        AbstractC1329o1 abstractC1329o4 = this.f5546b;
                        if (abstractC1329o4.m4146O()) {
                            abstractC1329o4.m4188s(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
                        }
                        break;
                }
            }
        };
        this.f5736v = new C1289e1(this);
        this.f5737w = -1;
        this.f5698B = null;
        this.f5699C = new C1293f1(this);
        this.f5700D = new C20363j(6);
        this.f5704H = new ArrayDeque();
        this.f5714R = new RunnableC1276b0(this, 1);
    }

    /* JADX INFO: renamed from: F */
    public static AbstractComponentCallbacksC1320m0 m4130F(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = tag instanceof AbstractComponentCallbacksC1320m0 ? (AbstractComponentCallbacksC1320m0) tag : null;
            if (abstractComponentCallbacksC1320m0 != null) {
                return abstractComponentCallbacksC1320m0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static HashSet m4131H(C1271a c1271a) {
        HashSet hashSet = new HashSet();
        for (int i13 = 0; i13 < c1271a.f5563c.size(); i13++) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) c1271a.f5563c.get(i13)).f5548b;
            if (abstractComponentCallbacksC1320m0 != null && c1271a.f5569i) {
                hashSet.add(abstractComponentCallbacksC1320m0);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m4132M(int i13) {
        return Log.isLoggable("FragmentManager", i13);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m4133N(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (abstractComponentCallbacksC1320m0.mHasMenu && abstractComponentCallbacksC1320m0.mMenuVisible) {
            return true;
        }
        boolean zM4133N = false;
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 : abstractComponentCallbacksC1320m0.mChildFragmentManager.f5717c.m4058e()) {
            if (abstractComponentCallbacksC1320m1 != null) {
                zM4133N = m4133N(abstractComponentCallbacksC1320m1);
            }
            if (zM4133N) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m4134P(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (abstractComponentCallbacksC1320m0 == null) {
            return true;
        }
        AbstractC1329o1 abstractC1329o1 = abstractComponentCallbacksC1320m0.mFragmentManager;
        return abstractComponentCallbacksC1320m0.equals(abstractC1329o1.f5697A) && m4134P(abstractC1329o1.f5740z);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m4135k0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (m4132M(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC1320m0);
        }
        if (abstractComponentCallbacksC1320m0.mHidden) {
            abstractComponentCallbacksC1320m0.mHidden = false;
            abstractComponentCallbacksC1320m0.mHiddenChanged = !abstractComponentCallbacksC1320m0.mHiddenChanged;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m4136A(C1271a c1271a, boolean z4) {
        if (z4 && (this.f5738x == null || this.f5708L)) {
            return;
        }
        m4194y(z4);
        C1271a c1271a2 = this.f5722h;
        if (c1271a2 != null) {
            c1271a2.f5519u = false;
            c1271a2.m4045i();
            if (m4132M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f5722h + " as part of execSingleAction for action " + c1271a);
            }
            this.f5722h.m4047k(false, false);
            this.f5722h.mo4041a(this.f5710N, this.f5711O);
            Iterator it = this.f5722h.f5563c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) it.next()).f5548b;
                if (abstractComponentCallbacksC1320m0 != null) {
                    abstractComponentCallbacksC1320m0.mTransitioning = false;
                }
            }
            this.f5722h = null;
        }
        c1271a.mo4041a(this.f5710N, this.f5711O);
        this.f5716b = true;
        try {
            m4156Z(this.f5710N, this.f5711O);
            m4163d();
            m4183n0();
            boolean z13 = this.f5709M;
            C1274a2 c1274a2 = this.f5717c;
            if (z13) {
                this.f5709M = false;
                for (C1366z1 c1366z1 : c1274a2.m4057d()) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                    if (abstractComponentCallbacksC1320m1.mDeferStart) {
                        if (this.f5716b) {
                            this.f5709M = true;
                        } else {
                            abstractComponentCallbacksC1320m1.mDeferStart = false;
                            c1366z1.m4256k();
                        }
                    }
                }
            }
            c1274a2.f5526b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th3) {
            m4163d();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021f A[PHI: r15
      0x021f: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:103:0x020c, B:107:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX INFO: renamed from: B */
    public final void m4137B(ArrayList arrayList, ArrayList arrayList2, int i13, int i14) {
        boolean z4;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19 = i13;
        boolean z14 = ((C1271a) arrayList.get(i19)).f5578r;
        ArrayList arrayList3 = this.f5712P;
        if (arrayList3 == null) {
            this.f5712P = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.f5712P;
        C1274a2 c1274a2 = this.f5717c;
        arrayList4.addAll(c1274a2.m4059f());
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5697A;
        int i24 = i19;
        boolean z15 = false;
        while (true) {
            int i25 = 1;
            if (i24 >= i14) {
                boolean z16 = z14;
                boolean z17 = z15;
                this.f5712P.clear();
                if (!z16 && this.f5737w >= 1) {
                    for (int i26 = i19; i26 < i14; i26++) {
                        Iterator it = ((C1271a) arrayList.get(i26)).f5563c.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = ((C1278b2) it.next()).f5548b;
                            if (abstractComponentCallbacksC1320m1 != null && abstractComponentCallbacksC1320m1.mFragmentManager != null) {
                                c1274a2.m4060g(m4169g(abstractComponentCallbacksC1320m1));
                            }
                        }
                    }
                }
                int i27 = i19;
                while (i27 < i14) {
                    C1271a c1271a = (C1271a) arrayList.get(i27);
                    if (((Boolean) arrayList2.get(i27)).booleanValue()) {
                        c1271a.m4044h(-1);
                        AbstractC1329o1 abstractC1329o1 = c1271a.f5518t;
                        ArrayList arrayList5 = c1271a.f5563c;
                        boolean z18 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            C1278b2 c1278b2 = (C1278b2) arrayList5.get(size);
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = c1278b2.f5548b;
                            if (abstractComponentCallbacksC1320m2 != null) {
                                abstractComponentCallbacksC1320m2.mBeingSaved = c1271a.f5521w;
                                abstractComponentCallbacksC1320m2.setPopDirection(z18);
                                int i28 = c1271a.f5568h;
                                int i29 = 8194;
                                int i34 = DfuBaseService.ERROR_FILE_NOT_FOUND;
                                if (i28 != 4097) {
                                    if (i28 != 8194) {
                                        i29 = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                                        if (i28 != 8197) {
                                            i34 = DfuBaseService.ERROR_FILE_INVALID;
                                            if (i28 != 4099) {
                                                i29 = i28 != 4100 ? 0 : 8197;
                                            } else {
                                                i29 = i34;
                                            }
                                        }
                                    } else {
                                        i29 = i34;
                                    }
                                }
                                abstractComponentCallbacksC1320m2.setNextTransition(i29);
                                abstractComponentCallbacksC1320m2.setSharedElementNames(c1271a.f5577q, c1271a.f5576p);
                            }
                            switch (c1278b2.f5547a) {
                                case 1:
                                    abstractComponentCallbacksC1320m2.setAnimations(c1278b2.f5550d, c1278b2.f5551e, c1278b2.f5552f, c1278b2.f5553g);
                                    z18 = true;
                                    abstractC1329o1.m4166e0(abstractComponentCallbacksC1320m2, true);
                                    abstractC1329o1.m4155Y(abstractComponentCallbacksC1320m2);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c1278b2.f5547a);
                                case 3:
                                    abstractComponentCallbacksC1320m2.setAnimations(c1278b2.f5550d, c1278b2.f5551e, c1278b2.f5552f, c1278b2.f5553g);
                                    abstractC1329o1.m4157a(abstractComponentCallbacksC1320m2);
                                    z18 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1320m2.setAnimations(c1278b2.f5550d, c1278b2.f5551e, c1278b2.f5552f, c1278b2.f5553g);
                                    abstractC1329o1.getClass();
                                    m4135k0(abstractComponentCallbacksC1320m2);
                                    z18 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1320m2.setAnimations(c1278b2.f5550d, c1278b2.f5551e, c1278b2.f5552f, c1278b2.f5553g);
                                    abstractC1329o1.m4166e0(abstractComponentCallbacksC1320m2, true);
                                    abstractC1329o1.m4145L(abstractComponentCallbacksC1320m2);
                                    z18 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1320m2.setAnimations(c1278b2.f5550d, c1278b2.f5551e, c1278b2.f5552f, c1278b2.f5553g);
                                    abstractC1329o1.m4161c(abstractComponentCallbacksC1320m2);
                                    z18 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1320m2.setAnimations(c1278b2.f5550d, c1278b2.f5551e, c1278b2.f5552f, c1278b2.f5553g);
                                    abstractC1329o1.m4166e0(abstractComponentCallbacksC1320m2, true);
                                    abstractC1329o1.m4171h(abstractComponentCallbacksC1320m2);
                                    z18 = true;
                                    break;
                                case 8:
                                    abstractC1329o1.m4174i0(null);
                                    z18 = true;
                                    break;
                                case 9:
                                    abstractC1329o1.m4174i0(abstractComponentCallbacksC1320m2);
                                    z18 = true;
                                    break;
                                case 10:
                                    abstractC1329o1.m4172h0(abstractComponentCallbacksC1320m2, c1278b2.f5554h);
                                    z18 = true;
                                    break;
                            }
                        }
                    } else {
                        c1271a.m4044h(1);
                        AbstractC1329o1 abstractC1329o2 = c1271a.f5518t;
                        ArrayList arrayList6 = c1271a.f5563c;
                        int size2 = arrayList6.size();
                        int i35 = 0;
                        while (i35 < size2) {
                            C1278b2 c1278b3 = (C1278b2) arrayList6.get(i35);
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m3 = c1278b3.f5548b;
                            if (abstractComponentCallbacksC1320m3 != null) {
                                abstractComponentCallbacksC1320m3.mBeingSaved = c1271a.f5521w;
                                abstractComponentCallbacksC1320m3.setPopDirection(false);
                                abstractComponentCallbacksC1320m3.setNextTransition(c1271a.f5568h);
                                abstractComponentCallbacksC1320m3.setSharedElementNames(c1271a.f5576p, c1271a.f5577q);
                            }
                            switch (c1278b3.f5547a) {
                                case 1:
                                    i27 = i27;
                                    abstractComponentCallbacksC1320m3.setAnimations(c1278b3.f5550d, c1278b3.f5551e, c1278b3.f5552f, c1278b3.f5553g);
                                    abstractC1329o2.m4166e0(abstractComponentCallbacksC1320m3, false);
                                    abstractC1329o2.m4157a(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c1278b3.f5547a);
                                case 3:
                                    abstractComponentCallbacksC1320m3.setAnimations(c1278b3.f5550d, c1278b3.f5551e, c1278b3.f5552f, c1278b3.f5553g);
                                    abstractC1329o2.m4155Y(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1320m3.setAnimations(c1278b3.f5550d, c1278b3.f5551e, c1278b3.f5552f, c1278b3.f5553g);
                                    abstractC1329o2.m4145L(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1320m3.setAnimations(c1278b3.f5550d, c1278b3.f5551e, c1278b3.f5552f, c1278b3.f5553g);
                                    abstractC1329o2.m4166e0(abstractComponentCallbacksC1320m3, false);
                                    m4135k0(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1320m3.setAnimations(c1278b3.f5550d, c1278b3.f5551e, c1278b3.f5552f, c1278b3.f5553g);
                                    abstractC1329o2.m4171h(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1320m3.setAnimations(c1278b3.f5550d, c1278b3.f5551e, c1278b3.f5552f, c1278b3.f5553g);
                                    abstractC1329o2.m4166e0(abstractComponentCallbacksC1320m3, false);
                                    abstractC1329o2.m4161c(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 8:
                                    abstractC1329o2.m4174i0(abstractComponentCallbacksC1320m3);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 9:
                                    abstractC1329o2.m4174i0(null);
                                    i35++;
                                    i27 = i27;
                                    break;
                                case 10:
                                    abstractC1329o2.m4172h0(abstractComponentCallbacksC1320m3, c1278b3.f5555i);
                                    i35++;
                                    i27 = i27;
                                    break;
                            }
                        }
                    }
                    i27++;
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i14 - 1)).booleanValue();
                ArrayList<C17073i> arrayList7 = this.f5729o;
                if (z17 && !arrayList7.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.addAll(m4131H((C1271a) it3.next()));
                    }
                    if (this.f5722h == null) {
                        for (C17073i c17073i : arrayList7) {
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                c17073i.m48199b((AbstractComponentCallbacksC1320m0) it4.next(), zBooleanValue);
                            }
                        }
                        for (C17073i c17073i2 : arrayList7) {
                            Iterator it5 = linkedHashSet.iterator();
                            while (it5.hasNext()) {
                                c17073i2.m48198a((AbstractComponentCallbacksC1320m0) it5.next(), zBooleanValue);
                            }
                        }
                    }
                }
                for (int i36 = i19; i36 < i14; i36++) {
                    C1271a c1271a2 = (C1271a) arrayList.get(i36);
                    if (zBooleanValue) {
                        for (int size3 = c1271a2.f5563c.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m4 = ((C1278b2) c1271a2.f5563c.get(size3)).f5548b;
                            if (abstractComponentCallbacksC1320m4 != null) {
                                m4169g(abstractComponentCallbacksC1320m4).m4256k();
                            }
                        }
                    } else {
                        Iterator it6 = c1271a2.f5563c.iterator();
                        while (it6.hasNext()) {
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m5 = ((C1278b2) it6.next()).f5548b;
                            if (abstractComponentCallbacksC1320m5 != null) {
                                m4169g(abstractComponentCallbacksC1320m5).m4256k();
                            }
                        }
                    }
                }
                m4148R(this.f5737w, true);
                for (C1343s c1343s : m4167f(arrayList, i19, i14)) {
                    c1343s.f5794e = zBooleanValue;
                    c1343s.m4223l();
                    c1343s.m4219e();
                }
                while (i19 < i14) {
                    C1271a c1271a3 = (C1271a) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c1271a3.f5520v >= 0) {
                        c1271a3.f5520v = -1;
                    }
                    if (c1271a3.f5579s != null) {
                        for (int i37 = 0; i37 < c1271a3.f5579s.size(); i37++) {
                            ((Runnable) c1271a3.f5579s.get(i37)).run();
                        }
                        c1271a3.f5579s = null;
                    }
                    i19++;
                }
                if (z17) {
                    for (int i38 = 0; i38 < arrayList7.size(); i38++) {
                        ((C17073i) arrayList7.get(i38)).getClass();
                    }
                    return;
                }
                return;
            }
            C1271a c1271a4 = (C1271a) arrayList.get(i24);
            if (((Boolean) arrayList2.get(i24)).booleanValue()) {
                z4 = z14;
                i15 = i24;
                z13 = z15;
                int i39 = 1;
                ArrayList arrayList8 = this.f5712P;
                ArrayList arrayList9 = c1271a4.f5563c;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    C1278b2 c1278b4 = (C1278b2) arrayList9.get(size4);
                    int i44 = c1278b4.f5547a;
                    if (i44 != i39) {
                        if (i44 != 3) {
                            switch (i44) {
                                case 6:
                                    arrayList8.add(c1278b4.f5548b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC1320m0 = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC1320m0 = c1278b4.f5548b;
                                    break;
                                case 10:
                                    c1278b4.f5555i = c1278b4.f5554h;
                                    break;
                            }
                        } else {
                            arrayList8.add(c1278b4.f5548b);
                        }
                        size4--;
                        i39 = 1;
                    }
                    arrayList8.remove(c1278b4.f5548b);
                    size4--;
                    i39 = 1;
                }
            } else {
                ArrayList arrayList10 = this.f5712P;
                ArrayList arrayList11 = c1271a4.f5563c;
                int i45 = 0;
                while (i45 < arrayList11.size()) {
                    C1278b2 c1278b5 = (C1278b2) arrayList11.get(i45);
                    boolean z19 = z14;
                    int i46 = c1278b5.f5547a;
                    if (i46 != i25) {
                        i16 = i24;
                        if (i46 != 2) {
                            if (i46 == 3 || i46 == 6) {
                                arrayList10.remove(c1278b5.f5548b);
                                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m6 = c1278b5.f5548b;
                                if (abstractComponentCallbacksC1320m6 == abstractComponentCallbacksC1320m0) {
                                    arrayList11.add(i45, new C1278b2(abstractComponentCallbacksC1320m6, 9));
                                    i45++;
                                    abstractComponentCallbacksC1320m0 = null;
                                }
                                i17 = 1;
                            } else if (i46 == 7) {
                                i17 = 1;
                            } else if (i46 == 8) {
                                arrayList11.add(i45, new C1278b2(abstractComponentCallbacksC1320m0, 9, 0));
                                c1278b5.f5549c = true;
                                i45++;
                                abstractComponentCallbacksC1320m0 = c1278b5.f5548b;
                            }
                            i17 = 1;
                        } else {
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m7 = c1278b5.f5548b;
                            int i47 = abstractComponentCallbacksC1320m7.mContainerId;
                            int size5 = arrayList10.size() - 1;
                            boolean z24 = false;
                            while (size5 >= 0) {
                                int i48 = size5;
                                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m8 = (AbstractComponentCallbacksC1320m0) arrayList10.get(size5);
                                boolean z25 = z15;
                                if (abstractComponentCallbacksC1320m8.mContainerId != i47) {
                                    i47 = i47;
                                } else if (abstractComponentCallbacksC1320m8 == abstractComponentCallbacksC1320m7) {
                                    i47 = i47;
                                    z24 = true;
                                } else {
                                    if (abstractComponentCallbacksC1320m8 == abstractComponentCallbacksC1320m0) {
                                        i18 = 0;
                                        arrayList11.add(i45, new C1278b2(abstractComponentCallbacksC1320m8, 9, 0));
                                        i45++;
                                        abstractComponentCallbacksC1320m0 = null;
                                    } else {
                                        i18 = 0;
                                    }
                                    C1278b2 c1278b6 = new C1278b2(abstractComponentCallbacksC1320m8, 3, i18);
                                    c1278b6.f5550d = c1278b5.f5550d;
                                    c1278b6.f5552f = c1278b5.f5552f;
                                    c1278b6.f5551e = c1278b5.f5551e;
                                    c1278b6.f5553g = c1278b5.f5553g;
                                    arrayList11.add(i45, c1278b6);
                                    arrayList10.remove(abstractComponentCallbacksC1320m8);
                                    i45++;
                                    abstractComponentCallbacksC1320m0 = abstractComponentCallbacksC1320m0;
                                }
                                size5 = i48 - 1;
                                i47 = i47;
                                z15 = z25;
                            }
                            z15 = z15;
                            i17 = 1;
                            if (z24) {
                                arrayList11.remove(i45);
                                i45--;
                            } else {
                                c1278b5.f5547a = 1;
                                c1278b5.f5549c = true;
                                arrayList10.add(abstractComponentCallbacksC1320m7);
                            }
                        }
                        i45 += i17;
                        i25 = i17;
                        z14 = z19;
                        i24 = i16;
                        z15 = z15;
                    } else {
                        i16 = i24;
                        i17 = i25;
                    }
                    z15 = z15;
                    arrayList10.add(c1278b5.f5548b);
                    i45 += i17;
                    i25 = i17;
                    z14 = z19;
                    i24 = i16;
                    z15 = z15;
                }
                z4 = z14;
                i15 = i24;
                z13 = z15;
            }
            z15 = z13 || c1271a4.f5569i;
            i24 = i15 + 1;
            z14 = z4;
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m4138C(int i13, String str, boolean z4) {
        if (this.f5718d.isEmpty()) {
            return -1;
        }
        if (str == null && i13 < 0) {
            if (z4) {
                return 0;
            }
            return this.f5718d.size() - 1;
        }
        int size = this.f5718d.size() - 1;
        while (size >= 0) {
            C1271a c1271a = (C1271a) this.f5718d.get(size);
            if ((str != null && str.equals(c1271a.f5571k)) || (i13 >= 0 && i13 == c1271a.f5520v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z4) {
            if (size == this.f5718d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1271a c1271a2 = (C1271a) this.f5718d.get(size - 1);
            if ((str == null || !str.equals(c1271a2.f5571k)) && (i13 < 0 || i13 != c1271a2.f5520v)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: D */
    public final AbstractComponentCallbacksC1320m0 m4139D(int i13) {
        C1274a2 c1274a2 = this.f5717c;
        ArrayList arrayList = c1274a2.f5525a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) arrayList.get(size);
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.mFragmentId == i13) {
                return abstractComponentCallbacksC1320m0;
            }
        }
        for (C1366z1 c1366z1 : c1274a2.f5526b.values()) {
            if (c1366z1 != null) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                if (abstractComponentCallbacksC1320m1.mFragmentId == i13) {
                    return abstractComponentCallbacksC1320m1;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final AbstractComponentCallbacksC1320m0 m4140E(String str) {
        C1274a2 c1274a2 = this.f5717c;
        ArrayList arrayList = c1274a2.f5525a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) arrayList.get(size);
                if (abstractComponentCallbacksC1320m0 != null && str.equals(abstractComponentCallbacksC1320m0.mTag)) {
                    return abstractComponentCallbacksC1320m0;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1366z1 c1366z1 : c1274a2.f5526b.values()) {
            if (c1366z1 != null) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                if (str.equals(abstractComponentCallbacksC1320m1.mTag)) {
                    return abstractComponentCallbacksC1320m1;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final void m4141G() {
        for (C1343s c1343s : m4165e()) {
            if (c1343s.f5795f) {
                if (m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c1343s.f5795f = false;
                c1343s.m4219e();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final ViewGroup m4142I(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        ViewGroup viewGroup = abstractComponentCallbacksC1320m0.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC1320m0.mContainerId <= 0 || !this.f5739y.mo4071c()) {
            return null;
        }
        View viewMo4070b = this.f5739y.mo4070b(abstractComponentCallbacksC1320m0.mContainerId);
        if (viewMo4070b instanceof ViewGroup) {
            return (ViewGroup) viewMo4070b;
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final AbstractC1356w0 m4143J() {
        AbstractC1356w0 abstractC1356w0 = this.f5698B;
        if (abstractC1356w0 != null) {
            return abstractC1356w0;
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5740z;
        return abstractComponentCallbacksC1320m0 != null ? abstractComponentCallbacksC1320m0.mFragmentManager.m4143J() : this.f5699C;
    }

    /* JADX INFO: renamed from: K */
    public final C20363j m4144K() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5740z;
        return abstractComponentCallbacksC1320m0 != null ? abstractComponentCallbacksC1320m0.mFragmentManager.m4144K() : this.f5700D;
    }

    /* JADX INFO: renamed from: L */
    public final void m4145L(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (m4132M(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC1320m0);
        }
        if (abstractComponentCallbacksC1320m0.mHidden) {
            return;
        }
        abstractComponentCallbacksC1320m0.mHidden = true;
        abstractComponentCallbacksC1320m0.mHiddenChanged = true ^ abstractComponentCallbacksC1320m0.mHiddenChanged;
        m4176j0(abstractComponentCallbacksC1320m0);
    }

    /* JADX INFO: renamed from: O */
    public final boolean m4146O() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5740z;
        if (abstractComponentCallbacksC1320m0 == null) {
            return true;
        }
        return abstractComponentCallbacksC1320m0.isAdded() && this.f5740z.getParentFragmentManager().m4146O();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m4147Q() {
        return this.f5706J || this.f5707K;
    }

    /* JADX INFO: renamed from: R */
    public final void m4148R(int i13, boolean z4) {
        AbstractC1359x0 abstractC1359x0;
        if (this.f5738x == null && i13 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i13 != this.f5737w) {
            this.f5737w = i13;
            C1274a2 c1274a2 = this.f5717c;
            HashMap map = c1274a2.f5526b;
            Iterator it = c1274a2.f5525a.iterator();
            while (it.hasNext()) {
                C1366z1 c1366z1 = (C1366z1) map.get(((AbstractComponentCallbacksC1320m0) it.next()).mWho);
                if (c1366z1 != null) {
                    c1366z1.m4256k();
                }
            }
            for (C1366z1 c1366z2 : map.values()) {
                if (c1366z2 != null) {
                    c1366z2.m4256k();
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z2.f5852c;
                    if (abstractComponentCallbacksC1320m0.mRemoving && !abstractComponentCallbacksC1320m0.isInBackStack()) {
                        if (abstractComponentCallbacksC1320m0.mBeingSaved && !c1274a2.f5527c.containsKey(abstractComponentCallbacksC1320m0.mWho)) {
                            c1274a2.m4062i(c1366z2.m4259n(), abstractComponentCallbacksC1320m0.mWho);
                        }
                        c1274a2.m4061h(c1366z2);
                    }
                }
            }
            for (C1366z1 c1366z3 : c1274a2.m4057d()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z3.f5852c;
                if (abstractComponentCallbacksC1320m1.mDeferStart) {
                    if (this.f5716b) {
                        this.f5709M = true;
                    } else {
                        abstractComponentCallbacksC1320m1.mDeferStart = false;
                        c1366z3.m4256k();
                    }
                }
            }
            if (this.f5705I && (abstractC1359x0 = this.f5738x) != null && this.f5737w == 7) {
                ((C1336q0) abstractC1359x0).f5776E.invalidateMenu();
                this.f5705I = false;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m4149S() {
        if (this.f5738x == null) {
            return;
        }
        this.f5706J = false;
        this.f5707K = false;
        this.f5713Q.f5809F = false;
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4150T() {
        return m4151U(-1, 0);
    }

    /* JADX INFO: renamed from: U */
    public final boolean m4151U(int i13, int i14) {
        m4195z(false);
        m4194y(true);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5697A;
        if (abstractComponentCallbacksC1320m0 != null && i13 < 0 && abstractComponentCallbacksC1320m0.getChildFragmentManager().m4150T()) {
            return true;
        }
        boolean zM4152V = m4152V(this.f5710N, this.f5711O, null, i13, i14);
        if (zM4152V) {
            this.f5716b = true;
            try {
                m4156Z(this.f5710N, this.f5711O);
                m4163d();
            } catch (Throwable th3) {
                m4163d();
                throw th3;
            }
        }
        m4183n0();
        boolean z4 = this.f5709M;
        C1274a2 c1274a2 = this.f5717c;
        if (z4) {
            this.f5709M = false;
            for (C1366z1 c1366z1 : c1274a2.m4057d()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                if (abstractComponentCallbacksC1320m1.mDeferStart) {
                    if (this.f5716b) {
                        this.f5709M = true;
                    } else {
                        abstractComponentCallbacksC1320m1.mDeferStart = false;
                        c1366z1.m4256k();
                    }
                }
            }
        }
        c1274a2.f5526b.values().removeAll(Collections.singleton(null));
        return zM4152V;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m4152V(ArrayList arrayList, ArrayList arrayList2, String str, int i13, int i14) {
        int iM4138C = m4138C(i13, str, (i14 & 1) != 0);
        if (iM4138C < 0) {
            return false;
        }
        for (int size = this.f5718d.size() - 1; size >= iM4138C; size--) {
            arrayList.add((C1271a) this.f5718d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final void m4153W(Bundle bundle, String str, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (abstractComponentCallbacksC1320m0.mFragmentManager == this) {
            bundle.putString(str, abstractComponentCallbacksC1320m0.mWho);
        } else {
            m4179l0(new IllegalStateException(AbstractC11266d.m30458l(abstractComponentCallbacksC1320m0, "Fragment ", " is not currently in the FragmentManager")));
            throw null;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m4154X(FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks, boolean z4) {
        C37199o c37199o = this.f5730p;
        c37199o.getClass();
        ((CopyOnWriteArrayList) c37199o.f159041x).add(new C1273a1(fragmentManager$FragmentLifecycleCallbacks, z4));
    }

    /* JADX INFO: renamed from: Y */
    public final void m4155Y(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (m4132M(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC1320m0 + " nesting=" + abstractComponentCallbacksC1320m0.mBackStackNesting);
        }
        boolean zIsInBackStack = abstractComponentCallbacksC1320m0.isInBackStack();
        if (abstractComponentCallbacksC1320m0.mDetached && zIsInBackStack) {
            return;
        }
        C1274a2 c1274a2 = this.f5717c;
        synchronized (c1274a2.f5525a) {
            c1274a2.f5525a.remove(abstractComponentCallbacksC1320m0);
        }
        abstractComponentCallbacksC1320m0.mAdded = false;
        if (m4133N(abstractComponentCallbacksC1320m0)) {
            this.f5705I = true;
        }
        abstractComponentCallbacksC1320m0.mRemoving = true;
        m4176j0(abstractComponentCallbacksC1320m0);
    }

    /* JADX INFO: renamed from: Z */
    public final void m4156Z(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            if (!((C1271a) arrayList.get(i13)).f5578r) {
                if (i14 != i13) {
                    m4137B(arrayList, arrayList2, i14, i13);
                }
                i14 = i13 + 1;
                if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                    while (i14 < size && ((Boolean) arrayList2.get(i14)).booleanValue() && !((C1271a) arrayList.get(i14)).f5578r) {
                        i14++;
                    }
                }
                m4137B(arrayList, arrayList2, i13, i14);
                i13 = i14 - 1;
            }
            i13++;
        }
        if (i14 != size) {
            m4137B(arrayList, arrayList2, i14, size);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C1366z1 m4157a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        String str = abstractComponentCallbacksC1320m0.mPreviousWho;
        if (str != null) {
            AbstractC25106b.m73600c(abstractComponentCallbacksC1320m0, str);
        }
        if (m4132M(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC1320m0);
        }
        C1366z1 c1366z1M4169g = m4169g(abstractComponentCallbacksC1320m0);
        abstractComponentCallbacksC1320m0.mFragmentManager = this;
        C1274a2 c1274a2 = this.f5717c;
        c1274a2.m4060g(c1366z1M4169g);
        if (!abstractComponentCallbacksC1320m0.mDetached) {
            c1274a2.m4054a(abstractComponentCallbacksC1320m0);
            abstractComponentCallbacksC1320m0.mRemoving = false;
            if (abstractComponentCallbacksC1320m0.mView == null) {
                abstractComponentCallbacksC1320m0.mHiddenChanged = false;
            }
            if (m4133N(abstractComponentCallbacksC1320m0)) {
                this.f5705I = true;
            }
        }
        return c1366z1M4169g;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4158a0(Bundle bundle) {
        C37199o c37199o;
        C1366z1 c1366z1;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f5738x.f5827x.getClassLoader());
                this.f5727m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f5738x.f5827x.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C1274a2 c1274a2 = this.f5717c;
        HashMap map2 = c1274a2.f5527c;
        HashMap map3 = c1274a2.f5526b;
        map2.clear();
        map2.putAll(map);
        C1341r1 c1341r1 = (C1341r1) bundle.getParcelable("state");
        if (c1341r1 == null) {
            return;
        }
        map3.clear();
        Iterator it = c1341r1.f5786w.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c37199o = this.f5730p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM4062i = c1274a2.m4062i(null, (String) it.next());
            if (bundleM4062i != null) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.f5713Q.f5810w.get(((C1360x1) bundleM4062i.getParcelable("state")).f5842x);
                if (abstractComponentCallbacksC1320m0 != null) {
                    if (m4132M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC1320m0);
                    }
                    c1366z1 = new C1366z1(c37199o, c1274a2, abstractComponentCallbacksC1320m0, bundleM4062i);
                } else {
                    c1366z1 = new C1366z1(this.f5730p, this.f5717c, this.f5738x.f5827x.getClassLoader(), m4143J(), bundleM4062i);
                }
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                abstractComponentCallbacksC1320m1.mSavedFragmentState = bundleM4062i;
                abstractComponentCallbacksC1320m1.mFragmentManager = this;
                if (m4132M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC1320m1.mWho + "): " + abstractComponentCallbacksC1320m1);
                }
                c1366z1.m4257l(this.f5738x.f5827x.getClassLoader());
                c1274a2.m4060g(c1366z1);
                c1366z1.f5854e = this.f5737w;
            }
        }
        C1348t1 c1348t1 = this.f5713Q;
        c1348t1.getClass();
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 : new ArrayList(c1348t1.f5810w.values())) {
            if (map3.get(abstractComponentCallbacksC1320m2.mWho) == null) {
                if (m4132M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC1320m2 + " that was not found in the set of active Fragments " + c1341r1.f5786w);
                }
                this.f5713Q.m4230o(abstractComponentCallbacksC1320m2);
                abstractComponentCallbacksC1320m2.mFragmentManager = this;
                C1366z1 c1366z2 = new C1366z1(c37199o, c1274a2, abstractComponentCallbacksC1320m2);
                c1366z2.f5854e = 1;
                c1366z2.m4256k();
                abstractComponentCallbacksC1320m2.mRemoving = true;
                c1366z2.m4256k();
            }
        }
        ArrayList<String> arrayList = c1341r1.f5787x;
        c1274a2.f5525a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4055b = c1274a2.m4055b(str3);
                if (abstractComponentCallbacksC1320m0M4055b == null) {
                    throw new IllegalStateException(AbstractC11895b.m31996o("No instantiated fragment for (", str3, ")"));
                }
                if (m4132M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC1320m0M4055b);
                }
                c1274a2.m4054a(abstractComponentCallbacksC1320m0M4055b);
            }
        }
        if (c1341r1.f5788y != null) {
            this.f5718d = new ArrayList(c1341r1.f5788y.length);
            int i13 = 0;
            while (true) {
                C1275b[] c1275bArr = c1341r1.f5788y;
                if (i13 >= c1275bArr.length) {
                    break;
                }
                C1271a c1271aM4064f = c1275bArr[i13].m4064f(this);
                if (m4132M(2)) {
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "restoreAllState: back stack #", " (index ");
                    sbM30466t.append(c1271aM4064f.f5520v);
                    sbM30466t.append("): ");
                    sbM30466t.append(c1271aM4064f);
                    Log.v("FragmentManager", sbM30466t.toString());
                    PrintWriter printWriter = new PrintWriter(new C1322m2());
                    c1271aM4064f.m4049m("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5718d.add(c1271aM4064f);
                i13++;
            }
        } else {
            this.f5718d = new ArrayList();
        }
        this.f5725k.set(c1341r1.f5789z);
        String str4 = c1341r1.f5782E;
        if (str4 != null) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4055b2 = c1274a2.m4055b(str4);
            this.f5697A = abstractComponentCallbacksC1320m0M4055b2;
            m4187r(abstractComponentCallbacksC1320m0M4055b2);
        }
        ArrayList arrayList2 = c1341r1.f5783F;
        if (arrayList2 != null) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                this.f5726l.put((String) arrayList2.get(i14), (C1279c) c1341r1.f5784G.get(i14));
            }
        }
        this.f5704H = new ArrayDeque(c1341r1.f5785H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m4159b(AbstractC1359x0 abstractC1359x0, AbstractC1350u0 abstractC1350u0, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        String strM73376i;
        InterfaceC1585g0 interfaceC1585g0;
        if (this.f5738x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f5738x = abstractC1359x0;
        this.f5739y = abstractC1350u0;
        this.f5740z = abstractComponentCallbacksC1320m0;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5731q;
        if (abstractComponentCallbacksC1320m0 != null) {
            copyOnWriteArrayList.add(new C1301h1(abstractComponentCallbacksC1320m0));
        } else if (abstractC1359x0 instanceof InterfaceC1351u1) {
            copyOnWriteArrayList.add((InterfaceC1351u1) abstractC1359x0);
        }
        if (this.f5740z != null) {
            m4183n0();
        }
        if (abstractC1359x0 instanceof InterfaceC14897b0) {
            InterfaceC14897b0 interfaceC14897b0 = (InterfaceC14897b0) abstractC1359x0;
            C14923z onBackPressedDispatcher = interfaceC14897b0.getOnBackPressedDispatcher();
            this.f5721g = onBackPressedDispatcher;
            if (abstractComponentCallbacksC1320m0 != null) {
                interfaceC1585g0 = interfaceC14897b0;
                interfaceC1585g0 = abstractComponentCallbacksC1320m0;
            }
            interfaceC1585g0 = interfaceC14897b0;
            onBackPressedDispatcher.m43015a(interfaceC1585g0, this.f5724j);
        }
        if (abstractComponentCallbacksC1320m0 != null) {
            C1348t1 c1348t1 = abstractComponentCallbacksC1320m0.mFragmentManager.f5713Q;
            HashMap map = c1348t1.f5811x;
            C1348t1 c1348t2 = (C1348t1) map.get(abstractComponentCallbacksC1320m0.mWho);
            if (c1348t2 == null) {
                c1348t2 = new C1348t1(c1348t1.f5813z);
                map.put(abstractComponentCallbacksC1320m0.mWho, c1348t2);
            }
            this.f5713Q = c1348t2;
        } else if (abstractC1359x0 instanceof InterfaceC1583f2) {
            C1579e2 store = ((InterfaceC1583f2) abstractC1359x0).getViewModelStore();
            AbstractC22676k.m65750j(store, "store");
            C23418a defaultCreationExtras = C23418a.f92771b;
            AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
            C41113q c41113q = new C41113q(store, C1348t1.f5807G, defaultCreationExtras);
            InterfaceC21461d modelClass = AbstractC21598x.m60666V(C1348t1.class);
            AbstractC22676k.m65750j(modelClass, "modelClass");
            String qualifiedName = modelClass.getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f5713Q = (C1348t1) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
        } else {
            this.f5713Q = new C1348t1(false);
        }
        this.f5713Q.f5809F = m4147Q();
        this.f5717c.f5528d = this.f5713Q;
        Object obj = this.f5738x;
        if ((obj instanceof InterfaceC29049f) && abstractComponentCallbacksC1320m0 == null) {
            C29047d savedStateRegistry = ((InterfaceC29049f) obj).getSavedStateRegistry();
            savedStateRegistry.m88293c("android:support:fragments", new C1324n0(this, 1));
            Bundle bundleM88291a = savedStateRegistry.m88291a("android:support:fragments");
            if (bundleM88291a != null) {
                m4158a0(bundleM88291a);
            }
        }
        Object obj2 = this.f5738x;
        if (obj2 instanceof InterfaceC21072k) {
            AbstractC21071j activityResultRegistry = ((InterfaceC21072k) obj2).getActivityResultRegistry();
            if (abstractComponentCallbacksC1320m0 != null) {
                strM73376i = AbstractC25012a.m73376i(abstractComponentCallbacksC1320m0.mWho, ":", new StringBuilder());
            } else {
                strM73376i = "";
            }
            String strM30461o = AbstractC11266d.m30461o("FragmentManager:", strM73376i);
            this.f5701E = activityResultRegistry.m58914d(AbstractC2875y.m8299l(strM30461o, "StartActivityForResult"), new ActivityResultContracts$StartActivityForResult(), new C1281c1(this, 1));
            this.f5702F = activityResultRegistry.m58914d(AbstractC2875y.m8299l(strM30461o, "StartIntentSenderForResult"), new AbstractC22081b() { // from class: androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
                @Override // p267k.AbstractC22081b
                public final Intent createIntent(Context context, Object obj3) {
                    Bundle bundleExtra;
                    C21073l c21073lM15858a = (C21073l) obj3;
                    Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                    Intent intentM58917b = c21073lM15858a.m58917b();
                    if (intentM58917b != null && (bundleExtra = intentM58917b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                        intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                        intentM58917b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                        if (intentM58917b.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                            C5057p c5057p = new C5057p(c21073lM15858a.m58920i());
                            c5057p.m15870m(null);
                            c5057p.m15871n(c21073lM15858a.m58919h(), c21073lM15858a.m58918f());
                            c21073lM15858a = c5057p.m15858a();
                        }
                    }
                    intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c21073lM15858a);
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                    }
                    return intent;
                }

                @Override // p267k.AbstractC22081b
                public final Object parseResult(int i13, Intent intent) {
                    return new C21062a(i13, intent);
                }
            }, new C1281c1(this, 2));
            this.f5703G = activityResultRegistry.m58914d(AbstractC2875y.m8299l(strM30461o, "RequestPermissions"), new ActivityResultContracts$RequestMultiplePermissions(), new C1281c1(this, 0));
        }
        Object obj3 = this.f5738x;
        if (obj3 instanceof InterfaceC32129j) {
            ((InterfaceC32129j) obj3).addOnConfigurationChangedListener(this.f5732r);
        }
        Object obj4 = this.f5738x;
        if (obj4 instanceof InterfaceC32130k) {
            ((InterfaceC32130k) obj4).addOnTrimMemoryListener(this.f5733s);
        }
        Object obj5 = this.f5738x;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.f5734t);
        }
        Object obj6 = this.f5738x;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.f5735u);
        }
        Object obj7 = this.f5738x;
        if ((obj7 instanceof InterfaceC16885k) && abstractComponentCallbacksC1320m0 == null) {
            ((InterfaceC16885k) obj7).addMenuProvider(this.f5736v);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final Bundle m4160b0() {
        ArrayList arrayList;
        C1275b[] c1275bArr;
        Bundle bundle = new Bundle();
        m4141G();
        m4192w();
        m4195z(true);
        this.f5706J = true;
        this.f5713Q.f5809F = true;
        C1274a2 c1274a2 = this.f5717c;
        c1274a2.getClass();
        HashMap map = c1274a2.f5526b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C1366z1 c1366z1 : map.values()) {
            if (c1366z1 != null) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
                c1274a2.m4062i(c1366z1.m4259n(), abstractComponentCallbacksC1320m0.mWho);
                arrayList2.add(abstractComponentCallbacksC1320m0.mWho);
                if (m4132M(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC1320m0 + ": " + abstractComponentCallbacksC1320m0.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f5717c.f5527c;
        if (!map2.isEmpty()) {
            C1274a2 c1274a3 = this.f5717c;
            synchronized (c1274a3.f5525a) {
                try {
                    if (c1274a3.f5525a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(c1274a3.f5525a.size());
                        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 : c1274a3.f5525a) {
                            arrayList.add(abstractComponentCallbacksC1320m1.mWho);
                            if (m4132M(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC1320m1.mWho + "): " + abstractComponentCallbacksC1320m1);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            int size = this.f5718d.size();
            if (size > 0) {
                c1275bArr = new C1275b[size];
                for (int i13 = 0; i13 < size; i13++) {
                    c1275bArr[i13] = new C1275b((C1271a) this.f5718d.get(i13));
                    if (m4132M(2)) {
                        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "saveAllState: adding back stack #", ": ");
                        sbM30466t.append(this.f5718d.get(i13));
                        Log.v("FragmentManager", sbM30466t.toString());
                    }
                }
            } else {
                c1275bArr = null;
            }
            C1341r1 c1341r1 = new C1341r1();
            c1341r1.f5782E = null;
            ArrayList arrayList3 = new ArrayList();
            c1341r1.f5783F = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            c1341r1.f5784G = arrayList4;
            c1341r1.f5786w = arrayList2;
            c1341r1.f5787x = arrayList;
            c1341r1.f5788y = c1275bArr;
            c1341r1.f5789z = this.f5725k.get();
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = this.f5697A;
            if (abstractComponentCallbacksC1320m2 != null) {
                c1341r1.f5782E = abstractComponentCallbacksC1320m2.mWho;
            }
            arrayList3.addAll(this.f5726l.keySet());
            arrayList4.addAll(this.f5726l.values());
            c1341r1.f5785H = new ArrayList(this.f5704H);
            bundle.putParcelable("state", c1341r1);
            for (String str : this.f5727m.keySet()) {
                bundle.putBundle(AbstractC11266d.m30461o("result_", str), (Bundle) this.f5727m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC11266d.m30461o("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (m4132M(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public final void m4161c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (m4132M(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC1320m0);
        }
        if (abstractComponentCallbacksC1320m0.mDetached) {
            abstractComponentCallbacksC1320m0.mDetached = false;
            if (abstractComponentCallbacksC1320m0.mAdded) {
                return;
            }
            this.f5717c.m4054a(abstractComponentCallbacksC1320m0);
            if (m4132M(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC1320m0);
            }
            if (m4133N(abstractComponentCallbacksC1320m0)) {
                this.f5705I = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final C1316l0 m4162c0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        C1366z1 c1366z1 = (C1366z1) this.f5717c.f5526b.get(abstractComponentCallbacksC1320m0.mWho);
        if (c1366z1 != null) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
            if (abstractComponentCallbacksC1320m1.equals(abstractComponentCallbacksC1320m0)) {
                if (abstractComponentCallbacksC1320m1.mState > -1) {
                    return new C1316l0(c1366z1.m4259n());
                }
                return null;
            }
        }
        m4179l0(new IllegalStateException(AbstractC11266d.m30458l(abstractComponentCallbacksC1320m0, "Fragment ", " is not currently in the FragmentManager")));
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m4163d() {
        this.f5716b = false;
        this.f5711O.clear();
        this.f5710N.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4164d0() {
        synchronized (this.f5715a) {
            try {
                if (this.f5715a.size() == 1) {
                    this.f5738x.f5828y.removeCallbacks(this.f5714R);
                    this.f5738x.f5828y.post(this.f5714R);
                    m4183n0();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m4165e() {
        C1343s c1343s;
        HashSet hashSet = new HashSet();
        Iterator it = this.f5717c.m4057d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C1366z1) it.next()).f5852c.mContainer;
            if (viewGroup != null) {
                C20363j factory = m4144K();
                AbstractC22676k.m65750j(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C1343s) {
                    c1343s = (C1343s) tag;
                } else {
                    c1343s = new C1343s(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c1343s);
                }
                hashSet.add(c1343s);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4166e0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, boolean z4) {
        ViewGroup viewGroupM4142I = m4142I(abstractComponentCallbacksC1320m0);
        if (viewGroupM4142I == null || !(viewGroupM4142I instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM4142I).setDrawDisappearingViewsLast(!z4);
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m4167f(ArrayList arrayList, int i13, int i14) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i13 < i14) {
            Iterator it = ((C1271a) arrayList.get(i13)).f5563c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) it.next()).f5548b;
                if (abstractComponentCallbacksC1320m0 != null && (viewGroup = abstractComponentCallbacksC1320m0.mContainer) != null) {
                    hashSet.add(C1343s.m4213j(viewGroup, this));
                }
            }
            i13++;
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: f0 */
    public final void m4168f0(Bundle bundle, String str) {
        C1309j1 c1309j1 = (C1309j1) this.f5728n.get(str);
        if (c1309j1 != null) {
            if (c1309j1.f5652a.getCurrentState().compareTo(EnumC1635w.f6328z) >= 0) {
                c1309j1.mo4108a(bundle, str);
            } else {
                this.f5727m.put(str, bundle);
            }
        } else {
            this.f5727m.put(str, bundle);
        }
        if (m4132M(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1366z1 m4169g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        String str = abstractComponentCallbacksC1320m0.mWho;
        C1274a2 c1274a2 = this.f5717c;
        C1366z1 c1366z1 = (C1366z1) c1274a2.f5526b.get(str);
        if (c1366z1 != null) {
            return c1366z1;
        }
        C1366z1 c1366z2 = new C1366z1(this.f5730p, c1274a2, abstractComponentCallbacksC1320m0);
        c1366z2.m4257l(this.f5738x.f5827x.getClassLoader());
        c1366z2.f5854e = this.f5737w;
        return c1366z2;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4170g0(String str, InterfaceC1585g0 interfaceC1585g0, InterfaceC1357w1 interfaceC1357w1) {
        AbstractC1638x lifecycle = interfaceC1585g0.getLifecycle();
        if (lifecycle.getCurrentState() == EnumC1635w.f6325w) {
            return;
        }
        C1297g1 c1297g1 = new C1297g1(this, str, interfaceC1357w1, lifecycle);
        C1309j1 c1309j1 = (C1309j1) this.f5728n.put(str, new C1309j1(lifecycle, interfaceC1357w1, c1297g1));
        if (c1309j1 != null) {
            c1309j1.f5652a.mo4988d(c1309j1.f5654c);
        }
        if (m4132M(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + interfaceC1357w1);
        }
        lifecycle.mo4986a(c1297g1);
    }

    /* JADX INFO: renamed from: h */
    public final void m4171h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (m4132M(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC1320m0);
        }
        if (abstractComponentCallbacksC1320m0.mDetached) {
            return;
        }
        abstractComponentCallbacksC1320m0.mDetached = true;
        if (abstractComponentCallbacksC1320m0.mAdded) {
            if (m4132M(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC1320m0);
            }
            C1274a2 c1274a2 = this.f5717c;
            synchronized (c1274a2.f5525a) {
                c1274a2.f5525a.remove(abstractComponentCallbacksC1320m0);
            }
            abstractComponentCallbacksC1320m0.mAdded = false;
            if (m4133N(abstractComponentCallbacksC1320m0)) {
                this.f5705I = true;
            }
            m4176j0(abstractComponentCallbacksC1320m0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m4172h0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, EnumC1635w enumC1635w) {
        if (abstractComponentCallbacksC1320m0.equals(this.f5717c.m4055b(abstractComponentCallbacksC1320m0.mWho)) && (abstractComponentCallbacksC1320m0.mHost == null || abstractComponentCallbacksC1320m0.mFragmentManager == this)) {
            abstractComponentCallbacksC1320m0.mMaxState = enumC1635w;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1320m0 + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: i */
    public final void m4173i(boolean z4, Configuration configuration) {
        if (z4 && (this.f5738x instanceof InterfaceC32129j)) {
            m4179l0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.performConfigurationChanged(configuration);
                if (z4) {
                    abstractComponentCallbacksC1320m0.mChildFragmentManager.m4173i(true, configuration);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m4174i0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (abstractComponentCallbacksC1320m0 != null) {
            if (!abstractComponentCallbacksC1320m0.equals(this.f5717c.m4055b(abstractComponentCallbacksC1320m0.mWho)) || (abstractComponentCallbacksC1320m0.mHost != null && abstractComponentCallbacksC1320m0.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1320m0 + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = this.f5697A;
        this.f5697A = abstractComponentCallbacksC1320m0;
        m4187r(abstractComponentCallbacksC1320m1);
        m4187r(this.f5697A);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4175j(MenuItem menuItem) {
        if (this.f5737w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4176j0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        ViewGroup viewGroupM4142I = m4142I(abstractComponentCallbacksC1320m0);
        if (viewGroupM4142I != null) {
            if (abstractComponentCallbacksC1320m0.getPopExitAnim() + abstractComponentCallbacksC1320m0.getPopEnterAnim() + abstractComponentCallbacksC1320m0.getExitAnim() + abstractComponentCallbacksC1320m0.getEnterAnim() > 0) {
                if (viewGroupM4142I.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM4142I.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC1320m0);
                }
                ((AbstractComponentCallbacksC1320m0) viewGroupM4142I.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(abstractComponentCallbacksC1320m0.getPopDirection());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4177k(Menu menu, MenuInflater menuInflater) {
        if (this.f5737w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.isMenuVisible() && abstractComponentCallbacksC1320m0.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC1320m0);
                z4 = true;
            }
        }
        if (this.f5719e != null) {
            for (int i13 = 0; i13 < this.f5719e.size(); i13++) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = (AbstractComponentCallbacksC1320m0) this.f5719e.get(i13);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1320m1)) {
                    abstractComponentCallbacksC1320m1.onDestroyOptionsMenu();
                }
            }
        }
        this.f5719e = arrayList;
        return z4;
    }

    /* JADX INFO: renamed from: l */
    public final void m4178l() {
        boolean zIsChangingConfigurations = true;
        this.f5708L = true;
        m4195z(true);
        m4192w();
        AbstractC1359x0 abstractC1359x0 = this.f5738x;
        boolean z4 = abstractC1359x0 instanceof InterfaceC1583f2;
        C1274a2 c1274a2 = this.f5717c;
        if (z4) {
            zIsChangingConfigurations = c1274a2.f5528d.f5808E;
        } else {
            AbstractActivityC1340r0 abstractActivityC1340r0 = abstractC1359x0.f5827x;
            if (abstractActivityC1340r0 != null) {
                zIsChangingConfigurations = true ^ abstractActivityC1340r0.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f5726l.values().iterator();
            while (it.hasNext()) {
                Iterator it3 = ((C1279c) it.next()).f5556w.iterator();
                while (it3.hasNext()) {
                    c1274a2.f5528d.m4228l((String) it3.next(), false);
                }
            }
        }
        m4190u(-1);
        Object obj = this.f5738x;
        if (obj instanceof InterfaceC32130k) {
            ((InterfaceC32130k) obj).removeOnTrimMemoryListener(this.f5733s);
        }
        Object obj2 = this.f5738x;
        if (obj2 instanceof InterfaceC32129j) {
            ((InterfaceC32129j) obj2).removeOnConfigurationChangedListener(this.f5732r);
        }
        Object obj3 = this.f5738x;
        if (obj3 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.f5734t);
        }
        Object obj4 = this.f5738x;
        if (obj4 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.f5735u);
        }
        Object obj5 = this.f5738x;
        if ((obj5 instanceof InterfaceC16885k) && this.f5740z == null) {
            ((InterfaceC16885k) obj5).removeMenuProvider(this.f5736v);
        }
        this.f5738x = null;
        this.f5739y = null;
        this.f5740z = null;
        if (this.f5721g != null) {
            this.f5724j.m43011h();
            this.f5721g = null;
        }
        C21070i c21070i = this.f5701E;
        if (c21070i != null) {
            c21070i.mo4053b();
            this.f5702F.mo4053b();
            this.f5703G.mo4053b();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4179l0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1322m2());
        AbstractC1359x0 abstractC1359x0 = this.f5738x;
        if (abstractC1359x0 == null) {
            try {
                m4191v("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e5) {
                Log.e("FragmentManager", "Failed dumping state", e5);
                throw runtimeException;
            }
        }
        try {
            ((C1336q0) abstractC1359x0).f5776E.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e13) {
            Log.e("FragmentManager", "Failed dumping state", e13);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4180m(boolean z4) {
        if (z4 && (this.f5738x instanceof InterfaceC32130k)) {
            m4179l0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.performLowMemory();
                if (z4) {
                    abstractComponentCallbacksC1320m0.mChildFragmentManager.m4180m(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4181m0(FragmentManager$FragmentLifecycleCallbacks cb) {
        C37199o c37199o = this.f5730p;
        c37199o.getClass();
        AbstractC22676k.m65750j(cb, "cb");
        synchronized (((CopyOnWriteArrayList) c37199o.f159041x)) {
            int size = ((CopyOnWriteArrayList) c37199o.f159041x).size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((C1273a1) ((CopyOnWriteArrayList) c37199o.f159041x).get(i13)).f5523a == cb) {
                    ((CopyOnWriteArrayList) c37199o.f159041x).remove(i13);
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4182n(boolean z4, boolean z13) {
        if (z13 && (this.f5738x instanceof OnMultiWindowModeChangedProvider)) {
            m4179l0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.performMultiWindowModeChanged(z4);
                if (z13) {
                    abstractComponentCallbacksC1320m0.mChildFragmentManager.m4182n(z4, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m4183n0() {
        synchronized (this.f5715a) {
            try {
                if (!this.f5715a.isEmpty()) {
                    this.f5724j.m43013j(true);
                    if (m4132M(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z4 = this.f5718d.size() + (this.f5722h != null ? 1 : 0) > 0 && m4134P(this.f5740z);
                if (m4132M(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z4);
                }
                this.f5724j.m43013j(z4);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4184o() {
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4058e()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.onHiddenChanged(abstractComponentCallbacksC1320m0.isHidden());
                abstractComponentCallbacksC1320m0.mChildFragmentManager.m4184o();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4185p(MenuItem menuItem) {
        if (this.f5737w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m4186q(Menu menu) {
        if (this.f5737w < 1) {
            return;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4187r(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        if (abstractComponentCallbacksC1320m0 != null) {
            if (abstractComponentCallbacksC1320m0.equals(this.f5717c.m4055b(abstractComponentCallbacksC1320m0.mWho))) {
                abstractComponentCallbacksC1320m0.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4188s(boolean z4, boolean z13) {
        if (z13 && (this.f5738x instanceof OnPictureInPictureModeChangedProvider)) {
            m4179l0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.performPictureInPictureModeChanged(z4);
                if (z13) {
                    abstractComponentCallbacksC1320m0.mChildFragmentManager.m4188s(z4, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m4189t(Menu menu) {
        boolean z4 = false;
        if (this.f5737w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : this.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.isMenuVisible() && abstractComponentCallbacksC1320m0.performPrepareOptionsMenu(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("FragmentManager{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append(" in ");
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5740z;
        if (abstractComponentCallbacksC1320m0 != null) {
            sb4.append(abstractComponentCallbacksC1320m0.getClass().getSimpleName());
            sb4.append("{");
            sb4.append(Integer.toHexString(System.identityHashCode(this.f5740z)));
            sb4.append("}");
        } else {
            AbstractC1359x0 abstractC1359x0 = this.f5738x;
            if (abstractC1359x0 != null) {
                sb4.append(abstractC1359x0.getClass().getSimpleName());
                sb4.append("{");
                sb4.append(Integer.toHexString(System.identityHashCode(this.f5738x)));
                sb4.append("}");
            } else {
                sb4.append("null");
            }
        }
        sb4.append("}}");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m4190u(int i13) {
        try {
            this.f5716b = true;
            for (C1366z1 c1366z1 : this.f5717c.f5526b.values()) {
                if (c1366z1 != null) {
                    c1366z1.f5854e = i13;
                }
            }
            m4148R(i13, false);
            Iterator it = m4165e().iterator();
            while (it.hasNext()) {
                ((C1343s) it.next()).m4222i();
            }
            this.f5716b = false;
            m4195z(true);
        } catch (Throwable th3) {
            this.f5716b = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4191v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strM8299l = AbstractC2875y.m8299l(str, "    ");
        C1274a2 c1274a2 = this.f5717c;
        ArrayList arrayList = c1274a2.f5525a;
        String strM8299l2 = AbstractC2875y.m8299l(str, "    ");
        HashMap map = c1274a2.f5526b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1366z1 c1366z1 : map.values()) {
                printWriter.print(str);
                if (c1366z1 != null) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
                    printWriter.println(abstractComponentCallbacksC1320m0);
                    abstractComponentCallbacksC1320m0.dump(strM8299l2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i13 = 0; i13 < size2; i13++) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = (AbstractComponentCallbacksC1320m0) arrayList.get(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i13);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1320m1.toString());
            }
        }
        ArrayList arrayList2 = this.f5719e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i14 = 0; i14 < size; i14++) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = (AbstractComponentCallbacksC1320m0) this.f5719e.get(i14);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1320m2.toString());
            }
        }
        int size3 = this.f5718d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i15 = 0; i15 < size3; i15++) {
                C1271a c1271a = (C1271a) this.f5718d.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(c1271a.toString());
                c1271a.m4049m(strM8299l, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5725k.get());
        synchronized (this.f5715a) {
            try {
                int size4 = this.f5715a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i16 = 0; i16 < size4; i16++) {
                        Object obj = (InterfaceC1313k1) this.f5715a.get(i16);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i16);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5738x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5739y);
        if (this.f5740z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5740z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5737w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5706J);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5707K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5708L);
        if (this.f5705I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5705I);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4192w() {
        Iterator it = m4165e().iterator();
        while (it.hasNext()) {
            ((C1343s) it.next()).m4222i();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m4193x(InterfaceC1313k1 interfaceC1313k1, boolean z4) {
        if (!z4) {
            if (this.f5738x == null) {
                if (!this.f5708L) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m4147Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f5715a) {
            try {
                if (this.f5738x == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f5715a.add(interfaceC1313k1);
                    m4164d0();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4194y(boolean z4) {
        if (this.f5716b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f5738x == null) {
            if (!this.f5708L) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f5738x.f5828y.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && m4147Q()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f5710N == null) {
            this.f5710N = new ArrayList();
            this.f5711O = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m4195z(boolean z4) {
        boolean zMo4041a;
        C1271a c1271a;
        m4194y(z4);
        if (!this.f5723i && (c1271a = this.f5722h) != null) {
            c1271a.f5519u = false;
            c1271a.m4045i();
            if (m4132M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f5722h + " as part of execPendingActions for actions " + this.f5715a);
            }
            this.f5722h.m4047k(false, false);
            this.f5715a.add(0, this.f5722h);
            Iterator it = this.f5722h.f5563c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) it.next()).f5548b;
                if (abstractComponentCallbacksC1320m0 != null) {
                    abstractComponentCallbacksC1320m0.mTransitioning = false;
                }
            }
            this.f5722h = null;
        }
        boolean z13 = false;
        while (true) {
            ArrayList arrayList = this.f5710N;
            ArrayList arrayList2 = this.f5711O;
            synchronized (this.f5715a) {
                if (this.f5715a.isEmpty()) {
                    zMo4041a = false;
                } else {
                    try {
                        int size = this.f5715a.size();
                        zMo4041a = false;
                        for (int i13 = 0; i13 < size; i13++) {
                            zMo4041a |= ((InterfaceC1313k1) this.f5715a.get(i13)).mo4041a(arrayList, arrayList2);
                        }
                        this.f5715a.clear();
                        this.f5738x.f5828y.removeCallbacks(this.f5714R);
                    } catch (Throwable th3) {
                        this.f5715a.clear();
                        this.f5738x.f5828y.removeCallbacks(this.f5714R);
                        throw th3;
                    }
                }
            }
            if (!zMo4041a) {
                break;
            }
            this.f5716b = true;
            try {
                m4156Z(this.f5710N, this.f5711O);
                m4163d();
                z13 = true;
            } catch (Throwable th4) {
                m4163d();
                throw th4;
            }
        }
        m4183n0();
        if (this.f5709M) {
            this.f5709M = false;
            for (C1366z1 c1366z1 : this.f5717c.m4057d()) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                if (abstractComponentCallbacksC1320m1.mDeferStart) {
                    if (this.f5716b) {
                        this.f5709M = true;
                    } else {
                        abstractComponentCallbacksC1320m1.mDeferStart = false;
                        c1366z1.m4256k();
                    }
                }
            }
        }
        this.f5717c.f5526b.values().removeAll(Collections.singleton(null));
        return z13;
    }
}
