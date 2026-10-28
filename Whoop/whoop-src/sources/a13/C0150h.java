package a13;

import a33.C0352d;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.platform.client.proto.C1533u;
import b10.C2273z0;
import b30.AbstractC2495c4;
import b30.C2482b;
import b30.C2547j0;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm.AbstractC4803d;
import cm.C4800a;
import cm.InterfaceC4801b;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import cz.C11215n0;
import d30.C11566v;
import e43.C12717i;
import ec3.C13045h2;
import fi.C14513s;
import fi.ViewOnAttachStateChangeListenerC14514t;
import h20.C16776z4;
import h40.C16845k;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import io.getstream.video.android.model.StreamCallId;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import l30.C23292a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25272z;
import ne3.AbstractC26604b;
import ne3.C26610e;
import p012ab.C0682h0;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p040c0.C3756l0;
import p043c4.DialogC3954d0;
import p117eh.C13188e;
import p133f1.C13966p;
import p133f1.EnumC13975s;
import p161g.AbstractActivityC14909l;
import p180h0.C16417l1;
import p208i2.C17919x;
import p236j.AbstractC21065d;
import p292l1.C23203x4;
import p390p1.InterfaceC28601c1;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p647yf.C39489b;
import p647yf.InterfaceC39500m;
import p647yf.InterfaceC39508u;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32100b;
import s40.C32139c0;
import s83.AbstractC32275i;
import t23.C33365b3;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33390g0;
import t23.C33403i3;
import t23.C33450s0;
import t23.EnumC33393g3;
import t23.InterfaceC33408j3;
import th.C33807e;
import x43.C37975g;
import x43.C37976h;

/* JADX INFO: renamed from: a13.h */
/* JADX INFO: loaded from: classes11.dex */
public final class C0150h extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f466w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f467x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150h(C0352d c0352d, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f466w = 9;
        PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.TokenCreate;
        this.f467x = c0352d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        int i13 = this.f466w;
        Object obj2 = this.f467x;
        switch (i13) {
            case 0:
                return new C0150h((C0151i) obj2, interfaceC30057d, 0);
            case 1:
                return new C0150h((Callable) obj2, interfaceC30057d, 1);
            case 2:
                return new C0150h((C2273z0) obj2, interfaceC30057d, 2);
            case 3:
                return new C0150h((C2547j0) obj2, interfaceC30057d, 3);
            case 4:
                return new C0150h((InterfaceC28601c1) obj2, interfaceC30057d, 4);
            case 5:
                return new C0150h((InterfaceC2464x2) obj2, interfaceC30057d, 5);
            case 6:
                return new C0150h((DialogC3954d0) obj2, interfaceC30057d, 6);
            case 7:
                return new C0150h((C11215n0) obj2, interfaceC30057d, 7);
            case 8:
                return new C0150h((C11566v) obj2, interfaceC30057d, 8);
            case 9:
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.TokenCreate;
                return new C0150h((C0352d) obj2, interfaceC30057d);
            case 10:
                return new C0150h((C13188e) obj2, interfaceC30057d, 10);
            case 11:
                return new C0150h((C13966p) obj2, interfaceC30057d, 11);
            case 12:
                return new C0150h((ViewOnAttachStateChangeListenerC14514t) obj2, interfaceC30057d, 12);
            case 13:
                return new C0150h((C16776z4) obj2, interfaceC30057d, 13);
            case 14:
                return new C0150h((C0682h0) obj2, interfaceC30057d, 14);
            case 15:
                return new C0150h((C23203x4) obj2, interfaceC30057d, 15);
            case 16:
                return new C0150h((C16845k) obj2, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C0150h((InterfaceC4801b) obj2, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C0150h((C33450s0) obj2, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C0150h((C33366b4) obj2, interfaceC30057d, 19);
            case 20:
                return new C0150h((C33807e) obj2, interfaceC30057d, 20);
            case 21:
                return new C0150h((Process) obj2, interfaceC30057d, 21);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C0150h((C37976h) obj2, interfaceC30057d, 22);
            default:
                return new C0150h((InterfaceC39508u) obj2, interfaceC30057d, 23);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws IOException {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f466w) {
            case 0:
                C0150h c0150h = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c0150h.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                C0150h c0150h2 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c0150h2.invokeSuspend(c23454a1);
                return c23454a1;
            case 3:
                C0150h c0150h3 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c0150h3.invokeSuspend(c23454a2);
                return c23454a2;
            case 4:
                C0150h c0150h4 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c0150h4.invokeSuspend(c23454a3);
                return c23454a3;
            case 5:
                C0150h c0150h5 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c0150h5.invokeSuspend(c23454a4);
                return c23454a4;
            case 6:
                C0150h c0150h6 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c0150h6.invokeSuspend(c23454a5);
                return c23454a5;
            case 7:
                C0150h c0150h7 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c0150h7.invokeSuspend(c23454a6);
                return c23454a6;
            case 8:
                C0150h c0150h8 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a7 = C23454a0.f92919a;
                c0150h8.invokeSuspend(c23454a7);
                return c23454a7;
            case 9:
                C0150h c0150h9 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a8 = C23454a0.f92919a;
                c0150h9.invokeSuspend(c23454a8);
                return c23454a8;
            case 10:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 12:
                C0150h c0150h10 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a9 = C23454a0.f92919a;
                c0150h10.invokeSuspend(c23454a9);
                return c23454a9;
            case 13:
                C0150h c0150h11 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a10 = C23454a0.f92919a;
                c0150h11.invokeSuspend(c23454a10);
                return c23454a10;
            case 14:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 15:
                C0150h c0150h12 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a11 = C23454a0.f92919a;
                c0150h12.invokeSuspend(c23454a11);
                return c23454a11;
            case 16:
                C0150h c0150h13 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a12 = C23454a0.f92919a;
                c0150h13.invokeSuspend(c23454a12);
                return c23454a12;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C0150h c0150h14 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a13 = C23454a0.f92919a;
                c0150h14.invokeSuspend(c23454a13);
                return c23454a13;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C0150h c0150h15 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a14 = C23454a0.f92919a;
                c0150h15.invokeSuspend(c23454a14);
                return c23454a14;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C0150h c0150h16 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a15 = C23454a0.f92919a;
                c0150h16.invokeSuspend(c23454a15);
                return c23454a15;
            case 20:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C0150h c0150h17 = (C0150h) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a16 = C23454a0.f92919a;
                c0150h17.invokeSuspend(c23454a16);
                return c23454a16;
            default:
                return ((C0150h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
    /* JADX WARN: Type inference failed for: r15v50, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws IOException {
        AbstractC21065d abstractC21065d;
        String str;
        int i13 = 0;
        InterfaceC30057d interfaceC30057d = null;
        switch (this.f466w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C0151i c0151i = (C0151i) this.f467x;
                Activity activity = c0151i.f471x;
                if (activity != null) {
                    if (Build.VERSION.SDK_INT < 33) {
                        Log.w("PnPermissionRequester", "[requestPermission] not supported on this version");
                        c0151i.m365a(EnumC0147e.f460x);
                    } else if (AbstractC32122c.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS") == 0) {
                        Log.v("PnPermissionRequester", "[requestPermission] already granted");
                        c0151i.m365a(EnumC0147e.f460x);
                    } else if (ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.POST_NOTIFICATIONS")) {
                        Log.i("PnPermissionRequester", "[requestPermission] rationale requested");
                        c0151i.m365a(EnumC0147e.f462z);
                    } else {
                        AbstractActivityC14909l abstractActivityC14909l = activity instanceof AbstractActivityC14909l ? (AbstractActivityC14909l) activity : null;
                        if (abstractActivityC14909l != null) {
                            View viewFindViewById = abstractActivityC14909l.findViewById(R.id.content);
                            AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
                            Object tag = viewFindViewById.getTag(com.whoop.android.R.id.stream_post_notifications_permission);
                            if (tag instanceof AbstractC21065d) {
                                abstractC21065d = (AbstractC21065d) tag;
                            } else {
                                abstractC21065d = null;
                            }
                        } else {
                            abstractC21065d = null;
                        }
                        Log.i("PnPermissionRequester", "[requestPermission] launcher: " + abstractC21065d);
                        if (abstractC21065d != null) {
                            abstractC21065d.mo4052a("android.permission.POST_NOTIFICATIONS", null);
                        }
                        c0151i.m365a(EnumC0147e.f459w);
                    }
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return ((Callable) this.f467x).call();
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                HttpResponseCache.install(new File(((C2273z0) this.f467x).f9011b.getCacheDir(), "stripe_api_repository_cache"), AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES);
                return C23454a0.f92919a;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h2 = ((C2547j0) this.f467x).f9897q;
                C2482b c2482bM7453a = C2482b.m7453a((C2482b) c13045h2.getValue(), null, null, null, null, false, null, 447);
                c13045h2.getClass();
                c13045h2.m36571k(null, c2482bM7453a);
                return C23454a0.f92919a;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f467x;
                C3756l0 c3756l0 = AbstractC2495c4.f9723a;
                ((InterfaceC4339a) interfaceC28601c1.getValue()).invoke();
                return C23454a0.f92919a;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) this.f467x;
                if (interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                return C23454a0.f92919a;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((DialogC3954d0) this.f467x).show();
                return C23454a0.f92919a;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C11215n0) this.f467x).m30341q();
                return C23454a0.f92919a;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C13045h2 c13045h3 = ((C11566v) this.f467x).f37327k;
                Boolean bool = Boolean.TRUE;
                c13045h3.getClass();
                c13045h3.m36571k(null, bool);
                return C23454a0.f92919a;
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C0352d c0352d = (C0352d) this.f467x;
                ((C39865j) c0352d.f1237x).m127938a(((AbstractC39851c) c0352d.f1238y).mo7052a(PaymentAnalyticsEvent.CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields, C25272z.f99163w));
                return C23454a0.f92919a;
            case 10:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C13188e c13188e = (C13188e) this.f467x;
                synchronized (c13188e) {
                    if (!c13188e.f45720L || c13188e.f45721M) {
                        return C23454a0.f92919a;
                    }
                    try {
                        c13188e.m37085a0();
                        break;
                    } catch (IOException unused) {
                        c13188e.f45722N = true;
                    }
                    try {
                        if ((c13188e.f45717I >= 2000 ? 1 : 0) != 0) {
                            c13188e.m37090o0();
                        }
                        break;
                    } catch (IOException unused2) {
                        c13188e.f45723O = true;
                        c13188e.f45718J = AbstractC26604b.m79157b(new C26610e());
                    }
                    return C23454a0.f92919a;
                }
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C13966p c13966p = (C13966p) this.f467x;
                Context context = c13966p.f49796b;
                EnumC13975s enumC13975s = c13966p.f49797c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = enumC13975s.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "textview";
                }
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                c13966p.f49800f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
            case 12:
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514t = (ViewOnAttachStateChangeListenerC14514t) this.f467x;
                C14513s c14513s = viewOnAttachStateChangeListenerC14514t.f53031z;
                if (c14513s != null) {
                    c14513s.m41416c();
                }
                viewOnAttachStateChangeListenerC14514t.f53031z = null;
                return C23454a0.f92919a;
            case 13:
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C16776z4) this.f467x).f64489h.invoke(null);
                return C23454a0.f92919a;
            case 14:
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C0682h0 c0682h0 = (C0682h0) this.f467x;
                int i14 = c0682h0.m1702q().getInt("app_version", 0);
                String string = c0682h0.m1702q().getString("sdk_app_id", null);
                if (string != null) {
                    return new C23292a(string, i14);
                }
                return null;
            case 15:
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C23203x4) this.f467x).m67159a();
                return C23454a0.f92919a;
            case 16:
                EnumC31071a enumC31071a17 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C16845k) this.f467x).getClass();
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                EnumC31071a enumC31071a18 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C4800a) ((InterfaceC4801b) this.f467x)).m15163a(C17919x.f69636m, AbstractC4803d.f19791b);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                EnumC31071a enumC31071a19 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Set setM74101H1 = AbstractC25265s.m74101H1((Iterable) ((C33450s0) this.f467x).f139634W.getValue());
                InterfaceC33408j3.f139483t.getClass();
                InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
                if (interfaceC33408j3 != null) {
                    setM74101H1.add(((C33366b4) interfaceC33408j3).f139236I.m31011a().getId());
                }
                C13045h2 c13045h4 = ((C33450s0) this.f467x).f139634W;
                Set setM74103I1 = AbstractC25265s.m74103I1(setM74101H1);
                c13045h4.getClass();
                c13045h4.m36571k(null, setM74103I1);
                C13045h2 c13045h5 = ((C33450s0) this.f467x).f139617F;
                C33365b3 c33365b3 = C33365b3.f139231a;
                c13045h5.getClass();
                c13045h5.m36571k(null, c33365b3);
                ((C33450s0) this.f467x).f139640b.m105823p(new C33390g0(EnumC33393g3.LOCAL_CALL_MISSED_EVENT, "LocalCallMissedEvent"));
                if (((C33450s0) this.f467x).f139638a.f139248U.f139405h.getValue() != null) {
                    C33368c0 c33368c0 = ((C33450s0) this.f467x).f139640b;
                    NotificationManagerCompat.from(((C33450s0) this.f467x).f139638a.f139259w).cancel(new StreamCallId(c33368c0.f139288b, c33368c0.f139289c, (String) null, false, 12, (DefaultConstructorMarker) null).getNotificationId(C12717i.f43512b));
                } else {
                    C33450s0 c33450s0 = (C33450s0) this.f467x;
                    c33450s0.f139638a.f139248U.m105847c(c33450s0.f139640b);
                }
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                EnumC31071a enumC31071a20 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C33366b4 c33366b4 = (C33366b4) this.f467x;
                C2570m c2570m = (C2570m) c33366b4.f139246S.f140442x;
                C13045h2 videoSocketStateFlow = c33366b4.f139232E.f168482j.f50772j;
                AbstractC22676k.m65750j(videoSocketStateFlow, "videoSocketStateFlow");
                C2996c2 c2996c2 = (C2996c2) c2570m.f9984E;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
                c2570m.f9984E = null;
                C13045h2 c13045h6 = (C13045h2) c2570m.f9985F;
                c13045h6.getClass();
                c13045h6.m36571k(null, "");
                c2570m.f9984E = AbstractC3006f0.m8732z((InterfaceC2994c0) c2570m.f9987x, null, null, new C32139c0(videoSocketStateFlow, c2570m, interfaceC30057d, 27), 3);
                return C23454a0.f92919a;
            case 20:
                EnumC31071a enumC31071a21 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C33807e c33807e = (C33807e) this.f467x;
                synchronized (c33807e.f141595H) {
                    try {
                        if (!c33807e.f141600M || c33807e.f141601N) {
                            return C23454a0.f92919a;
                        }
                        try {
                            c33807e.m106965a0();
                            break;
                        } catch (IOException unused3) {
                            c33807e.f141602O = true;
                        }
                        try {
                            if ((c33807e.f141597J >= 2000 ? 1 : 0) != 0) {
                                c33807e.m106970o0();
                            }
                            break;
                        } catch (IOException unused4) {
                            c33807e.f141603P = true;
                            c33807e.f141598K = AbstractC26604b.m79157b(new C26610e());
                        }
                        return C23454a0.f92919a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 21:
                EnumC31071a enumC31071a22 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return new Integer(((Process) this.f467x).waitFor());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                EnumC31071a enumC31071a23 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C37976h c37976h = (C37976h) this.f467x;
                if (System.currentTimeMillis() - c37976h.f162630h >= c37976h.f162624b) {
                    c37976h.m121615c();
                } else {
                    C2996c2 c2996c3 = c37976h.f162632j;
                    if (c2996c3 != null) {
                        c2996c3.cancel((CancellationException) null);
                    }
                    c37976h.f162632j = AbstractC3006f0.m8732z(c37976h.f162625c, null, null, new C16417l1(1000L, new C37975g(c37976h, interfaceC30057d, i13), null), 3);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a24 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC39508u interfaceC39508u = (InterfaceC39508u) this.f467x;
                try {
                    AbstractC22676k.m65750j(interfaceC39508u, "<this>");
                    byte[] bArrMo126149n = (interfaceC39508u instanceof InterfaceC39500m ? (InterfaceC39500m) interfaceC39508u : new C39489b(AbstractC26604b.m79158c(AbstractC32100b.m99874x(interfaceC39508u)))).mo126149n();
                    interfaceC39508u.close();
                    return bArrMo126149n;
                } catch (Throwable th4) {
                    try {
                        interfaceC39508u.close();
                        throw th4;
                    } catch (Throwable th5) {
                        AbstractC29125c.m88530g(th4, th5);
                        throw th4;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0150h(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f466w = i13;
        this.f467x = obj;
    }
}
