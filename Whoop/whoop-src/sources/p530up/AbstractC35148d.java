package p530up;

import a30.C0278b1;
import a30.C0281c1;
import a30.C0336y0;
import a30.C0338z0;
import ab3.C0718j;
import am2.C1023i0;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.widget.PopupWindow;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import androidx.health.platform.client.proto.C1439b0;
import androidx.health.platform.client.proto.C1454e0;
import androidx.health.platform.client.proto.C1464g0;
import androidx.health.platform.client.proto.C1518r;
import androidx.health.platform.client.proto.C1533u;
import androidx.health.platform.client.proto.InterfaceC1544w0;
import androidx.lifecycle.C1646z1;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2609r;
import c53.AbstractC4257c;
import c53.C4255a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.SurveyResponseNumber;
import com.amplitude.android.engagement.types.SurveyResponseSelect;
import com.amplitude.android.engagement.types.SurveyResponseText;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.iterable.iterableapi.AbstractC5380v1;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5371s1;
import com.iterable.iterableapi.C5374t1;
import com.iterable.iterableapi.C5377u1;
import com.iterable.iterableapi.IterablePushActionReceiver;
import com.iterable.iterableapi.IterableTrampolineActivity;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import com.whoop.navigation.AppScreen;
import d13.AbstractC11478a;
import d30.C11518b0;
import d40.AbstractC11673r;
import ec3.AbstractC13091v;
import ec3.InterfaceC13075p1;
import ee.C13135a;
import f41.C14075m;
import fg3.AbstractC14476d;
import g00.AbstractC14936g;
import g00.C14931b;
import ha3.C17062e;
import hg3.AbstractC17264d;
import hg3.C17267g;
import ig3.InterfaceC18476b;
import ig3.InterfaceC18478d;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.RunnableC20277c7;
import io.sentry.android.replay.C20231t;
import io.sentry.hints.C20363j;
import j93.AbstractC21478l0;
import j93.EnumC21483p;
import j93.InterfaceC21467g;
import j93.InterfaceC21484q;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import lb3.AbstractC23773f1;
import live.hms.video.utils.AndroidSDKConstants;
import live.hms.video.utils.HMSConstantsKt;
import m40.C25046w;
import m40.EnumC25028e;
import m81.C25228c;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import mb3.C25396m;
import n33.C26228b;
import n43.C26285a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq0.C27050m;
import o73.C27648a;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import ou1.C28376a;
import ov2.C28402f;
import p000.AbstractC30802r;
import p000.C21061j;
import p003a1.C0103b;
import p005a3.AbstractC0201g;
import p005a3.C0223l1;
import p005a3.C0230n0;
import p025b1.C2212c;
import p025b1.C2213d;
import p026b2.AbstractC2316v;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p048ce.C4470k;
import p072cp.BinderC10935b;
import p077d0.AbstractC11348f;
import p077d0.C11365j0;
import p077d0.EnumC11408v0;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p132f0.C13774c;
import p163g1.AbstractC15011f9;
import p163g1.C15069l3;
import p163g1.C15150t4;
import p181h2.C16618c;
import p181h2.C16620e;
import p208i2.AbstractC17918w0;
import p208i2.C17924z0;
import p209i3.AbstractC18032n;
import p241j3.C21266c;
import p250jf.AbstractC21636e;
import p294l3.C23246c;
import p294l3.C23248d;
import p294l3.C23249d0;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23271o0;
import p294l3.C23285v0;
import p298l8.AbstractC23420c;
import p305lj.C24427f0;
import p322m7.AbstractC25145g;
import p322m7.AbstractC25152i0;
import p322m7.C25127a;
import p322m7.C25128a0;
import p322m7.C25129a1;
import p322m7.C25130b;
import p322m7.C25131b0;
import p322m7.C25132b1;
import p322m7.C25133c;
import p322m7.C25135c1;
import p322m7.C25136d;
import p322m7.C25137d0;
import p322m7.C25138d1;
import p322m7.C25139e;
import p322m7.C25141e1;
import p322m7.C25142f;
import p322m7.C25143f0;
import p322m7.C25144f1;
import p322m7.C25147g1;
import p322m7.C25148h;
import p322m7.C25149h0;
import p322m7.C25150h1;
import p322m7.C25151i;
import p322m7.C25153j;
import p322m7.C25154j0;
import p322m7.C25155k;
import p322m7.C25156k0;
import p322m7.C25157l;
import p322m7.C25159m;
import p322m7.C25160m0;
import p322m7.C25161n;
import p322m7.C25162n0;
import p322m7.C25163o;
import p322m7.C25164o0;
import p322m7.C25165p;
import p322m7.C25166p0;
import p322m7.C25167q;
import p322m7.C25168q0;
import p322m7.C25169r;
import p322m7.C25171s;
import p322m7.C25172s0;
import p322m7.C25173t;
import p322m7.C25174t0;
import p322m7.C25175u;
import p322m7.C25177v;
import p322m7.C25178v0;
import p322m7.C25179w;
import p322m7.C25180w0;
import p322m7.C25181x;
import p322m7.C25182x0;
import p322m7.C25183y;
import p322m7.C25184y0;
import p322m7.C25185z;
import p322m7.C25186z0;
import p322m7.InterfaceC25170r0;
import p331n2.AbstractC26165a;
import p336n7.C26413c;
import p353o0.C27325i;
import p375op.AbstractC28076h;
import p375op.InterfaceC28079k;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p40.C28826a;
import p40.C28829d;
import p401pj.C29261c;
import p401pj.C29276j0;
import p401pj.C29281o;
import p401pj.InterfaceC29260b0;
import p452r7.C31003b0;
import p452r7.C31005c0;
import p452r7.C31006d;
import p452r7.C31007d0;
import p452r7.C31008e;
import p452r7.C31015h0;
import p452r7.C31019j0;
import p452r7.C31020k;
import p452r7.C31021k0;
import p452r7.C31022l;
import p452r7.C31023l0;
import p452r7.C31033q0;
import p452r7.C31036s;
import p452r7.C31038t;
import p452r7.C31045w0;
import p452r7.EnumC31013g0;
import p452r7.EnumC31043v0;
import p463rj.AbstractC31479j;
import p474s.C31983m2;
import p478s3.C32096b;
import p481s6.AbstractC32229a;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34339n0;
import p510u0.C34327j0;
import p512u2.C34450b0;
import p529uo.AbstractC35135w;
import p530up.AbstractC35148d;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35902e;
import p557vo.AbstractC36220b;
import p558vp.C36257a;
import p558vp.C36260d;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p646yd.AbstractC39455f;
import p667z0.AbstractC39926h;
import p698au1.C2061f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import rb3.AbstractC31199g;
import rb3.AbstractC31210r;
import rb3.C31198f;
import rb3.C31201i;
import rb3.InterfaceC31197e;
import s30.AbstractC32103e;
import s83.AbstractC32269c;
import stream.video.sfu.models.Codec;
import t83.C33617b;
import v63.AbstractC35745c;
import va3.C35850h;
import vg.InterfaceC35967n;
import y00.C38840g6;
import y00.C38887l3;
import y00.EnumC38837g3;
import y00.InterfaceC38802c8;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: up.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35148d {

    /* JADX INFO: renamed from: a */
    public static boolean f149133a = false;

    /* JADX INFO: renamed from: b */
    public static int f149134b = 1;

    /* JADX INFO: renamed from: c */
    public static InterfaceC18476b f149135c;

    /* JADX INFO: renamed from: A */
    public static final ArrayList m111150A(InterfaceC21467g interfaceC21467g) {
        AbstractC22676k.m65750j(interfaceC21467g, "<this>");
        List parameters = interfaceC21467g.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((InterfaceC21484q) obj).getKind() == EnumC21483p.f82449z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public static synchronized int m111151B(Context context) {
        String str;
        try {
            AbstractC35135w.m111095g(context, "Context is null");
            Log.d("d", "preferredRenderer: ".concat("null"));
            if (f149133a) {
                return 0;
            }
            try {
                C36260d c36260dM96946y = AbstractC31479j.m96946y(context);
                try {
                    C36257a c36257aM115716m0 = c36260dM96946y.m115716m0();
                    AbstractC35135w.m111094f(c36257aM115716m0);
                    AbstractC32103e.f133104w = c36257aM115716m0;
                    InterfaceC28079k interfaceC28079kM115718o0 = c36260dM96946y.m115718o0();
                    if (AbstractC32229a.f133444w == null) {
                        AbstractC35135w.m111095g(interfaceC28079kM115718o0, "delegate must not be null");
                        AbstractC32229a.f133444w = interfaceC28079kM115718o0;
                    }
                    f149133a = true;
                    try {
                        Parcel parcelM57321j0 = c36260dM96946y.m57321j0(c36260dM96946y.m57322k0(), 9);
                        int i13 = parcelM57321j0.readInt();
                        parcelM57321j0.recycle();
                        if (i13 == 2) {
                            f149134b = 2;
                        }
                        BinderC10935b binderC10935b = new BinderC10935b(context);
                        Parcel parcelM57322k0 = c36260dM96946y.m57322k0();
                        AbstractC28076h.m84852d(parcelM57322k0, binderC10935b);
                        parcelM57322k0.writeInt(0);
                        c36260dM96946y.m57323l0(parcelM57322k0, 10);
                    } catch (RemoteException e5) {
                        Log.e("d", "Failed to retrieve renderer type or log initialization.", e5);
                    }
                    int i14 = f149134b;
                    if (i14 != 1) {
                        str = i14 != 2 ? "null" : "LATEST";
                    } else {
                        str = "LEGACY";
                    }
                    Log.d("d", "loadedRenderer: ".concat(str));
                    return 0;
                } catch (RemoteException e13) {
                    throw new RuntimeRemoteException(e13);
                }
            } catch (GooglePlayServicesNotAvailableException e14) {
                return e14.f20477w;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: C */
    public static C20231t m111152C() {
        C20231t c20231t = new C20231t();
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new RunnableC20277c7(c20231t, 11));
        return c20231t;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m111153D(Bundle bundle) {
        return (bundle.containsKey("itbl") ? bundle.getString("body", "") : "").isEmpty();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m111154E(Bundle bundle) {
        return AbstractC5380v1.m16538b(bundle);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m111155F(Bundle bundle) {
        return bundle.containsKey("itbl");
    }

    /* JADX INFO: renamed from: G */
    public static boolean m111156G(int i13) {
        int type = Character.getType(i13);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: H */
    public static Bundle m111157H(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: I */
    public static String m111158I(int i13) {
        if (i13 == 0) {
            return "SUCCESS";
        }
        if (i13 == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i13 == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i13 == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i13 == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i13 == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i13 == 41) {
            return "GATT PAIRING WITH UNIT KEY NOT SUPPORTED";
        }
        if (i13 == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i13 == 133) {
            return "GATT ERROR";
        }
        if (i13 != 147) {
            return i13 != 256 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : "GATT CONN CANCEL ";
        }
        return "GATT TIMEOUT";
    }

    /* JADX INFO: renamed from: J */
    public static final C21266c m111159J(long j7, long j13, long j14, long j15, long j16, AbstractC2316v abstractC2316v, float[] fArr) {
        NodeCoordinator nodeCoordinatorM514n = AbstractC0201g.m514n(abstractC2316v, 2);
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(abstractC2316v);
        boolean zM606Y = c0230n0M516p.m606Y();
        C0223l1 c0223l1 = c0230n0M516p.f783e0;
        if (!zM606Y) {
            return null;
        }
        if (((NodeCoordinator) c0223l1.f741e) == nodeCoordinatorM514n) {
            return new C21266c(j7, j13, j14, j15, j16, abstractC2316v, fArr);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L);
        long j17 = nodeCoordinatorM514n.f168213y;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) c0223l1.f741e;
        nodeCoordinator.getClass();
        long jM115291C = AbstractC36220b.m115291C(nodeCoordinator.m3545p1(nodeCoordinatorM514n, jFloatToRawIntBits));
        return new C21266c(jM115291C, (4294967295L & ((long) (((int) (jM115291C & 4294967295L)) + ((int) (j17 & 4294967295L))))) | (((long) (((int) (jM115291C >> 32)) + ((int) (j17 >> 32)))) << 32), j14, j15, j16, abstractC2316v, fArr);
    }

    /* JADX INFO: renamed from: K */
    public static final Application m111160K(AbstractC23420c abstractC23420c) {
        AbstractC22676k.m65750j(abstractC23420c, "<this>");
        Object objMo67910a = abstractC23420c.mo67910a(C1646z1.f6353d);
        if (objMo67910a != null) {
            return (Application) objMo67910a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX INFO: renamed from: L */
    public static void m111161L(InterfaceC38802c8 stripeIntent) throws Throwable {
        Throwable c0281c1;
        StripeIntent$Status stripeIntent$Status;
        C38887l3 c38887l3;
        EnumC38837g3 enumC38837g3;
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        boolean z4 = stripeIntent instanceof C38887l3;
        if (z4 && (enumC38837g3 = ((C38887l3) stripeIntent).f167373H) != EnumC38837g3.Automatic) {
            c0281c1 = new C0336y0(enumC38837g3);
        } else if (z4) {
            StripeIntent$Status stripeIntent$Status2 = ((C38887l3) stripeIntent).f167382Q;
            if (AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new StripeIntent$Status[]{StripeIntent$Status.Canceled, StripeIntent$Status.Succeeded, StripeIntent$Status.RequiresCapture}), stripeIntent$Status2)) {
                c0281c1 = new C0278b1(stripeIntent$Status2);
            } else if (z4) {
                c38887l3 = (C38887l3) stripeIntent;
                if (c38887l3.f167393y != null || c38887l3.f167376K == null) {
                    c0281c1 = C0338z0.f1189w;
                } else if (stripeIntent instanceof C38840g6) {
                    stripeIntent$Status = ((C38840g6) stripeIntent).f167172K;
                    if (AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new StripeIntent$Status[]{StripeIntent$Status.Canceled, StripeIntent$Status.Succeeded}), stripeIntent$Status)) {
                        c0281c1 = new C0281c1(stripeIntent$Status);
                    } else {
                        c0281c1 = null;
                    }
                } else {
                    c0281c1 = null;
                }
            } else if (stripeIntent instanceof C38840g6) {
                stripeIntent$Status = ((C38840g6) stripeIntent).f167172K;
                if (AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new StripeIntent$Status[]{StripeIntent$Status.Canceled, StripeIntent$Status.Succeeded}), stripeIntent$Status)) {
                    c0281c1 = new C0281c1(stripeIntent$Status);
                } else {
                    c0281c1 = null;
                }
            } else {
                c0281c1 = null;
            }
        } else if (z4) {
            c38887l3 = (C38887l3) stripeIntent;
            if (c38887l3.f167393y != null) {
            }
            c0281c1 = C0338z0.f1189w;
        } else if (stripeIntent instanceof C38840g6) {
            stripeIntent$Status = ((C38840g6) stripeIntent).f167172K;
            if (AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new StripeIntent$Status[]{StripeIntent$Status.Canceled, StripeIntent$Status.Succeeded}), stripeIntent$Status)) {
                c0281c1 = new C0281c1(stripeIntent$Status);
            } else {
                c0281c1 = null;
            }
        } else {
            c0281c1 = null;
        }
        if (c0281c1 != null) {
            throw c0281c1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public static final Object m111162M(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C13135a c13135a;
        if (abstractC32269c instanceof C13135a) {
            c13135a = (C13135a) abstractC32269c;
            int i13 = c13135a.f45436x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13135a.f45436x = i13 - Integer.MIN_VALUE;
            } else {
                c13135a = new C13135a(abstractC32269c);
            }
        } else {
            c13135a = new C13135a(abstractC32269c);
        }
        Object objM99483g = c13135a.f45435w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c13135a.f45436x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            String str = (String) AbstractC21636e.m60882c(AbstractC39455f.f169744f, interfaceC35967n);
            if (str != null) {
                return str;
            }
            c13135a.f45436x = 1;
            objM99483g = c31983m2.m99483g(c13135a);
            if (objM99483g == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM99483g);
        }
        C4470k c4470k = (C4470k) objM99483g;
        AbstractC22676k.m65750j(c4470k, "<this>");
        return c4470k.m13963a("sdk_ua_app_id", null);
    }

    /* JADX INFO: renamed from: N */
    public static void m111163N(InterfaceC18476b interfaceC18476b) {
        f149135c = interfaceC18476b;
    }

    /* JADX INFO: renamed from: O */
    public static final void m111164O(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f13 = 1 - 0.0f;
        float f14 = 0.213f * f13;
        float f15 = 0.715f * f13;
        float f16 = f13 * 0.072f;
        fArr[0] = f14 + 0.0f;
        fArr[1] = f15;
        fArr[2] = f16;
        fArr[5] = f14;
        fArr[6] = f15 + 0.0f;
        fArr[7] = f16;
        fArr[10] = f14;
        fArr[11] = f15;
        fArr[12] = f16 + 0.0f;
    }

    /* JADX INFO: renamed from: P */
    public static final void m111165P(float[] fArr, float f13, float f14, float f15) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f13;
        fArr[6] = f14;
        fArr[12] = f15;
        fArr[18] = 1.0f;
    }

    /* JADX INFO: renamed from: Q */
    public static void m111166Q(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m111167R(AbstractC23773f1 a5, AbstractC23773f1 b) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        return AbstractC5583n.m16774d0(C25396m.f99492w, a5, b);
    }

    /* JADX INFO: renamed from: S */
    public static final void m111168S(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f13 = fArr[0];
        float f14 = fArr2[0];
        float f15 = fArr[1];
        float f16 = fArr2[5];
        float f17 = fArr[2];
        float f18 = fArr2[10];
        float f19 = f17 * f18;
        float f24 = fArr[3];
        float f25 = fArr2[15];
        float f26 = f24 * f25;
        float f27 = f26 + f19 + (f15 * f16) + (f13 * f14);
        float f28 = fArr2[1];
        float f29 = fArr2[6];
        float f34 = fArr2[11];
        float f35 = f17 * f34;
        float f36 = fArr2[16];
        float f37 = f24 * f36;
        float f38 = f37 + f35 + (f15 * f29) + (f13 * f28);
        float f39 = fArr2[2];
        float f43 = fArr2[7];
        float f44 = fArr2[12];
        float f45 = f17 * f44;
        float f46 = fArr2[17];
        float f47 = f24 * f46;
        float f48 = f47 + f45 + (f15 * f43) + (f13 * f39);
        float f49 = fArr2[3];
        float f54 = fArr2[8];
        float f55 = fArr2[13];
        float f56 = f17 * f55;
        float f57 = fArr2[18];
        float f58 = f24 * f57;
        float f59 = f58 + f56 + (f15 * f54) + (f13 * f49);
        float f64 = fArr2[4];
        float f65 = fArr2[9];
        float f66 = fArr2[14];
        float f67 = f17 * f66;
        float f68 = fArr2[19];
        float f69 = f24 * f68;
        float f74 = f69 + f67 + (f15 * f65) + (f13 * f64) + fArr[4];
        float f75 = fArr[5];
        float f76 = fArr[6];
        float f77 = fArr[7];
        float f78 = (f77 * f18) + (f76 * f16) + (f75 * f14);
        float f79 = fArr[8];
        float f84 = (f79 * f25) + f78;
        float f85 = (f79 * f36) + (f77 * f34) + (f76 * f29) + (f75 * f28);
        float f86 = (f79 * f46) + (f77 * f44) + (f76 * f43) + (f75 * f39);
        float f87 = (f79 * f57) + (f77 * f55) + (f76 * f54) + (f75 * f49);
        float f88 = f77 * f66;
        float f89 = f79 * f68;
        float f94 = f89 + f88 + (f76 * f65) + (f75 * f64) + fArr[9];
        float f95 = fArr[10];
        float f96 = fArr[11];
        float f97 = fArr[12];
        float f98 = (f97 * f18) + (f96 * f16) + (f95 * f14);
        float f99 = fArr[13];
        float f100 = (f99 * f25) + f98;
        float f101 = (f99 * f36) + (f97 * f34) + (f96 * f29) + (f95 * f28);
        float f102 = (f99 * f46) + (f97 * f44) + (f96 * f43) + (f95 * f39);
        float f103 = (f99 * f57) + (f97 * f55) + (f96 * f54) + (f95 * f49);
        float f104 = f97 * f66;
        float f105 = f99 * f68;
        float f106 = f105 + f104 + (f96 * f65) + (f95 * f64) + fArr[14];
        float f107 = fArr[15];
        float f108 = fArr[16];
        float f109 = (f16 * f108) + (f14 * f107);
        float f110 = fArr[17];
        float f111 = (f18 * f110) + f109;
        float f112 = fArr[18];
        float f113 = (f25 * f112) + f111;
        float f114 = f34 * f110;
        float f115 = f36 * f112;
        float f116 = f115 + f114 + (f29 * f108) + (f28 * f107);
        float f117 = f44 * f110;
        float f118 = f46 * f112;
        float f119 = f118 + f117 + (f43 * f108) + (f39 * f107);
        float f120 = f55 * f110;
        float f121 = f57 * f112;
        float f122 = f121 + f120 + (f54 * f108) + (f49 * f107);
        float f123 = f110 * f66;
        float f124 = f112 * f68;
        float f125 = f124 + f123 + (f108 * f65) + (f107 * f64) + fArr[19];
        fArr[0] = f27;
        fArr[1] = f38;
        fArr[2] = f48;
        fArr[3] = f59;
        fArr[4] = f74;
        fArr[5] = f84;
        fArr[6] = f85;
        fArr[7] = f86;
        fArr[8] = f87;
        fArr[9] = f94;
        fArr[10] = f100;
        fArr[11] = f101;
        fArr[12] = f102;
        fArr[13] = f103;
        fArr[14] = f106;
        fArr[15] = f113;
        fArr[16] = f116;
        fArr[17] = f119;
        fArr[18] = f122;
        fArr[19] = f125;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r1v113, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v115, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v246, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC25170r0 m111169T(C1533u c1533u) {
        List list;
        List list2;
        AbstractC22674j c25175u;
        C31036s c31036sM95556a;
        C31036s c31036sM95556a2;
        C31036s c31036sM95556a3;
        C31036s c31036sM95556a4;
        C31003b0 c31003b0M95566a;
        C31003b0 c31003b0M95566a2;
        C31003b0 c31003b0M95566a3;
        C31020k c31020kM95546a;
        C31020k c31020kM95546a2;
        C31003b0 c31003b0M95566a4;
        C31003b0 c31003b0M95566a5;
        C31003b0 c31003b0M95566a6;
        C31003b0 c31003b0M95566a7;
        C31003b0 c31003b0M95566a8;
        C31003b0 c31003b0M95566a9;
        C31003b0 c31003b0M95566a10;
        C31003b0 c31003b0M95566a11;
        C31003b0 c31003b0M95566a12;
        C31003b0 c31003b0M95566a13;
        C31003b0 c31003b0M95566a14;
        C31003b0 c31003b0M95566a15;
        C31003b0 c31003b0M95566a16;
        C31003b0 c31003b0M95566a17;
        C31003b0 c31003b0M95566a18;
        C31003b0 c31003b0M95566a19;
        C31003b0 c31003b0M95566a20;
        C31003b0 c31003b0M95566a21;
        C31003b0 c31003b0M95566a22;
        C31003b0 c31003b0M95566a23;
        C31003b0 c31003b0M95566a24;
        C31003b0 c31003b0M95566a25;
        C31003b0 c31003b0M95566a26;
        C31003b0 c31003b0M95566a27;
        C31003b0 c31003b0M95566a28;
        C31003b0 c31003b0M95566a29;
        C31003b0 c31003b0M95566a30;
        C31003b0 c31003b0M95566a31;
        C31003b0 c31003b0M95566a32;
        C31003b0 c31003b0M95566a33;
        C31003b0 c31003b0M95566a34;
        C31003b0 c31003b0M95566a35;
        C31003b0 c31003b0M95566a36;
        C31003b0 c31003b0M95566a37;
        C31003b0 c31003b0M95566a38;
        C31003b0 c31003b0M95566a39;
        List list3;
        String strM4922r = c1533u.m4844J().m4922r();
        if (strM4922r != null) {
            int iHashCode = strM4922r.hashCode();
            C25271y c25271y = C25271y.f99162w;
            C31003b0 c31003b0M95566a40 = null;
            switch (iHashCode) {
                case -2137162425:
                    if (strM4922r.equals("Height")) {
                        double dM113424s = AbstractC35785b.m113424s(c1533u, "height");
                        C31022l c31022l = C31036s.f128022y;
                        return new C25131b0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), C31022l.m95556a(dM113424s), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1931142571:
                    if (strM4922r.equals("BasalMetabolicRate")) {
                        return new C25133c(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), new C31015h0(AbstractC35785b.m113424s(c1533u, "bmr"), EnumC31013g0.f127997x), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1878699588:
                    if (strM4922r.equals("MenstruationPeriod")) {
                        return new C25156k0(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1739492291:
                    if (strM4922r.equals("HeartRateSeries")) {
                        Instant instantM113380C = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v = AbstractC35785b.m113427v(c1533u);
                        InterfaceC1544w0<C1439b0> seriesValuesList = c1533u.m4850Q();
                        AbstractC22676k.m65749i(seriesValuesList, "seriesValuesList");
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(seriesValuesList, 10));
                        for (C1439b0 c1439b0 : seriesValuesList) {
                            Instant instantOfEpochMilli = Instant.ofEpochMilli(c1439b0.m4574r());
                            AbstractC22676k.m65749i(instantOfEpochMilli, "ofEpochMilli(value.instantTimeMillis)");
                            C1464g0 c1464g0 = (C1464g0) c1439b0.m4575s().get("bpm");
                            arrayList.add(new C25183y(c1464g0 != null ? c1464g0.m4622y() : 0L, instantOfEpochMilli));
                        }
                        return new C25185z(instantM113380C, zoneOffsetM113381D, instantM113426u, zoneOffsetM113427v, arrayList, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1728782805:
                    if (strM4922r.equals("Vo2Max")) {
                        return new C25144f1(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113424s(c1533u, "vo2"), AbstractC35785b.m113387J(c1533u, "measurementMethod", C25144f1.f98586f), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1707725160:
                    if (strM4922r.equals("Weight")) {
                        double dM113424s2 = AbstractC35785b.m113424s(c1533u, "weight");
                        C31038t c31038t = C31003b0.f127986y;
                        return new C25147g1(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), C31038t.m95567b(dM113424s2), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1547814841:
                    if (strM4922r.equals("HeartRateVariabilityRmssd")) {
                        double dM113424s3 = 1.0d;
                        if (AbstractC35785b.m113424s(c1533u, "heartRateVariability") >= 1.0d) {
                            dM113424s3 = 200.0d;
                            if (AbstractC35785b.m113424s(c1533u, "heartRateVariability") <= 200.0d) {
                                dM113424s3 = AbstractC35785b.m113424s(c1533u, "heartRateVariability");
                            }
                        }
                        return new C25128a0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), dM113424s3, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1249467044:
                    if (strM4922r.equals("LeanBodyMass")) {
                        double dM113424s4 = AbstractC35785b.m113424s(c1533u, "mass");
                        C31038t c31038t2 = C31003b0.f127986y;
                        return new C25149h0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), C31038t.m95567b(dM113424s4), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1170329975:
                    if (strM4922r.equals("SexualActivity")) {
                        return new C25178v0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113387J(c1533u, "protectionUsed", C25178v0.f98773e), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -1089246824:
                    if (strM4922r.equals("TotalCaloriesBurned")) {
                        double dM113424s5 = AbstractC35785b.m113424s(c1533u, "energy");
                        C31008e c31008e = C31020k.f128009y;
                        return new C25141e1(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), C31008e.m95546a(dM113424s5), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -633416129:
                    if (strM4922r.equals("BloodPressure")) {
                        return new C25139e(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), new C31019j0(AbstractC35785b.m113424s(c1533u, "systolic")), new C31019j0(AbstractC35785b.m113424s(c1533u, "diastolic")), AbstractC35785b.m113387J(c1533u, "bodyPosition", C25139e.f98558j), AbstractC35785b.m113387J(c1533u, "measurementLocation", C25139e.f98556h), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -562822786:
                    if (strM4922r.equals("SpeedSeries")) {
                        Instant instantM113380C2 = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D2 = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u2 = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v2 = AbstractC35785b.m113427v(c1533u);
                        InterfaceC1544w0<C1439b0> seriesValuesList2 = c1533u.m4850Q();
                        AbstractC22676k.m65749i(seriesValuesList2, "seriesValuesList");
                        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(seriesValuesList2, 10));
                        for (C1439b0 c1439b1 : seriesValuesList2) {
                            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(c1439b1.m4574r());
                            AbstractC22676k.m65749i(instantOfEpochMilli2, "ofEpochMilli(value.instantTimeMillis)");
                            double dM113425t = AbstractC35785b.m113425t(c1439b1, "speed");
                            C31023l0 c31023l0 = C31033q0.f128016y;
                            arrayList2.add(new C25186z0(instantOfEpochMilli2, C31023l0.m95557a(dM113425t)));
                        }
                        return new C25129a1(instantM113380C2, zoneOffsetM113381D2, instantM113426u2, zoneOffsetM113427v2, arrayList2, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -561665783:
                    if (strM4922r.equals("BodyWaterMass")) {
                        double dM113424s6 = AbstractC35785b.m113424s(c1533u, "mass");
                        C31038t c31038t3 = C31003b0.f127986y;
                        return new C25151i(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), C31038t.m95567b(dM113424s6), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -539421262:
                    if (strM4922r.equals("OxygenSaturation")) {
                        return new C25164o0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), new C31005c0(AbstractC35785b.m113424s(c1533u, "percentage")), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case -136898551:
                    if (strM4922r.equals("OvulationTest")) {
                        return new C25162n0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113387J(c1533u, "result", C25162n0.f98720e), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 8847540:
                    if (strM4922r.equals("BloodGlucose")) {
                        LinkedHashMap linkedHashMap = C31006d.f127993y;
                        return new C25136d(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC12314q.m34312D(AbstractC35785b.m113424s(c1533u, "level")), AbstractC35785b.m113387J(c1533u, "specimenSource", C25136d.f98534k), AbstractC35785b.m113387J(c1533u, "mealType", AbstractC25152i0.f98621a), AbstractC35785b.m113387J(c1533u, "relationToMeal", C25136d.f98532i), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 80208647:
                    if (strM4922r.equals("Steps")) {
                        return new C25138d1(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), AbstractC35785b.m113431z(c1533u, "count"), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 128630298:
                    if (strM4922r.equals("ActiveCaloriesBurned")) {
                        double dM113424s7 = AbstractC35785b.m113424s(c1533u, "energy");
                        C31008e c31008e2 = C31020k.f128009y;
                        return new C25127a(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), C31008e.m95546a(dM113424s7), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 187665747:
                    if (strM4922r.equals("BasalBodyTemperature")) {
                        return new C25130b(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), new C31021k0(AbstractC35785b.m113424s(c1533u, "temperature")), AbstractC35785b.m113387J(c1533u, "measurementLocation", AbstractC25145g.f98593a), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 246984731:
                    if (strM4922r.equals("Menstruation")) {
                        return new C25154j0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113387J(c1533u, "flow", C25154j0.f98628e), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 353103893:
                    if (strM4922r.equals("Distance")) {
                        double dM113424s8 = AbstractC35785b.m113424s(c1533u, "distance");
                        C31022l c31022l2 = C31036s.f128022y;
                        return new C25161n(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), C31022l.m95556a(dM113424s8), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 557067342:
                    if (strM4922r.equals("CervicalMucus")) {
                        return new C25155k(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113387J(c1533u, "texture", C25155k.f98634f), AbstractC35785b.m113387J(c1533u, "amount", C25155k.f98636h), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 761063032:
                    if (strM4922r.equals("RestingHeartRate")) {
                        return new C25174t0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113431z(c1533u, "bpm"), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 955204109:
                    if (strM4922r.equals("FloorsClimbed")) {
                        return new C25181x(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), AbstractC35785b.m113424s(c1533u, "floors"), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 989918314:
                    if (strM4922r.equals("RespiratoryRate")) {
                        return new C25172s0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113424s(c1533u, "rate"), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1051870422:
                    if (strM4922r.equals("Hydration")) {
                        return new C25137d0(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), new C31045w0(AbstractC35785b.m113424s(c1533u, "volume"), EnumC31043v0.f128026w), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1108584865:
                    if (strM4922r.equals("StepsCadenceSeries")) {
                        Instant instantM113380C3 = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D3 = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u3 = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v3 = AbstractC35785b.m113427v(c1533u);
                        InterfaceC1544w0<C1439b0> seriesValuesList3 = c1533u.m4850Q();
                        AbstractC22676k.m65749i(seriesValuesList3, "seriesValuesList");
                        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(seriesValuesList3, 10));
                        for (C1439b0 c1439b2 : seriesValuesList3) {
                            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(c1439b2.m4574r());
                            AbstractC22676k.m65749i(instantOfEpochMilli3, "ofEpochMilli(value.instantTimeMillis)");
                            arrayList3.add(new C25132b1(AbstractC35785b.m113425t(c1439b2, "rate"), instantOfEpochMilli3));
                        }
                        return new C25135c1(instantM113380C3, zoneOffsetM113381D3, instantM113426u3, zoneOffsetM113427v3, arrayList3, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1193457969:
                    if (strM4922r.equals("IntermenstrualBleeding")) {
                        return new C25143f0(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1468615931:
                    if (strM4922r.equals("ElevationGained")) {
                        double dM113424s9 = AbstractC35785b.m113424s(c1533u, "elevation");
                        C31022l c31022l3 = C31036s.f128022y;
                        return new C25163o(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), C31022l.m95556a(dM113424s9), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1478142546:
                    if (strM4922r.equals("WheelchairPushes")) {
                        return new C25150h1(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), AbstractC35785b.m113431z(c1533u, "count"), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1498531293:
                    if (strM4922r.equals("CyclingPedalingCadenceSeries")) {
                        Instant instantM113380C4 = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D4 = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u4 = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v4 = AbstractC35785b.m113427v(c1533u);
                        InterfaceC1544w0<C1439b0> seriesValuesList4 = c1533u.m4850Q();
                        AbstractC22676k.m65749i(seriesValuesList4, "seriesValuesList");
                        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(seriesValuesList4, 10));
                        for (C1439b0 c1439b3 : seriesValuesList4) {
                            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(c1439b3.m4574r());
                            AbstractC22676k.m65749i(instantOfEpochMilli4, "ofEpochMilli(value.instantTimeMillis)");
                            arrayList4.add(new C25157l(AbstractC35785b.m113425t(c1439b3, "rpm"), instantOfEpochMilli4));
                        }
                        return new C25159m(instantM113380C4, zoneOffsetM113381D4, instantM113426u4, zoneOffsetM113427v4, arrayList4, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1513758823:
                    if (strM4922r.equals("ActivitySession")) {
                        int iM113387J = AbstractC35785b.m113387J(c1533u, "activityType", C25179w.f98779l);
                        String strM113382E = AbstractC35785b.m113382E(c1533u, "title");
                        String strM113382E2 = AbstractC35785b.m113382E(c1533u, "notes");
                        Instant instantM113380C5 = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D5 = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u5 = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v5 = AbstractC35785b.m113427v(c1533u);
                        C26413c c26413cM113378A = AbstractC35785b.m113378A(c1533u);
                        C1518r c1518r = (C1518r) c1533u.m4853T().get("segments");
                        if (c1518r != null) {
                            InterfaceC1544w0<C1454e0> valuesList = c1518r.m4812r();
                            AbstractC22676k.m65749i(valuesList, "valuesList");
                            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(valuesList, 10));
                            for (C1454e0 c1454e0 : valuesList) {
                                Instant instantOfEpochMilli5 = Instant.ofEpochMilli(c1454e0.m4592t());
                                AbstractC22676k.m65749i(instantOfEpochMilli5, "ofEpochMilli(it.startTimeMillis)");
                                Instant instantOfEpochMilli6 = Instant.ofEpochMilli(c1454e0.m4591s());
                                AbstractC22676k.m65749i(instantOfEpochMilli6, "ofEpochMilli(it.endTimeMillis)");
                                C1464g0 c1464g1 = (C1464g0) c1454e0.m4593u().get("type");
                                int iIntValue = (c1464g1 != null ? Long.valueOf(c1464g1.m4622y()) : 0).intValue();
                                C1464g0 c1464g2 = (C1464g0) c1454e0.m4593u().get("reps");
                                arrayList5.add(new C25177v(instantOfEpochMilli5, instantOfEpochMilli6, iIntValue, c1464g2 != null ? (int) c1464g2.m4622y() : 0));
                            }
                            list = arrayList5;
                        } else {
                            list = c25271y;
                        }
                        C1518r c1518r2 = (C1518r) c1533u.m4853T().get("laps");
                        if (c1518r2 != null) {
                            InterfaceC1544w0<C1454e0> valuesList2 = c1518r2.m4812r();
                            AbstractC22676k.m65749i(valuesList2, "valuesList");
                            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(valuesList2, 10));
                            for (C1454e0 c1454e1 : valuesList2) {
                                Instant instantOfEpochMilli7 = Instant.ofEpochMilli(c1454e1.m4592t());
                                AbstractC22676k.m65749i(instantOfEpochMilli7, "ofEpochMilli(it.startTimeMillis)");
                                Instant instantOfEpochMilli8 = Instant.ofEpochMilli(c1454e1.m4591s());
                                AbstractC22676k.m65749i(instantOfEpochMilli8, "ofEpochMilli(it.endTimeMillis)");
                                C1464g0 c1464g3 = (C1464g0) c1454e1.m4593u().get("length");
                                if (c1464g3 != null) {
                                    double dM4620w = c1464g3.m4620w();
                                    C31022l c31022l4 = C31036s.f128022y;
                                    c31036sM95556a4 = C31022l.m95556a(dM4620w);
                                } else {
                                    c31036sM95556a4 = null;
                                }
                                arrayList6.add(new C25165p(instantOfEpochMilli7, instantOfEpochMilli8, c31036sM95556a4));
                            }
                            list2 = arrayList6;
                        } else {
                            list2 = c25271y;
                        }
                        C1518r c1518r3 = (C1518r) c1533u.m4853T().get("route");
                        if (c1518r3 != null) {
                            InterfaceC1544w0<C1454e0> valuesList3 = c1518r3.m4812r();
                            AbstractC22676k.m65749i(valuesList3, "valuesList");
                            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(valuesList3, 10));
                            for (C1454e0 c1454e2 : valuesList3) {
                                Instant instantOfEpochMilli9 = Instant.ofEpochMilli(c1454e2.m4592t());
                                C1464g0 c1464g4 = (C1464g0) c1454e2.m4593u().get("latitude");
                                double dM4620w2 = c1464g4 != null ? c1464g4.m4620w() : 0.0d;
                                C1464g0 c1464g5 = (C1464g0) c1454e2.m4593u().get("longitude");
                                double dM4620w3 = c1464g5 != null ? c1464g5.m4620w() : 0.0d;
                                C1464g0 c1464g6 = (C1464g0) c1454e2.m4593u().get("altitude");
                                if (c1464g6 != null) {
                                    double dM4620w4 = c1464g6.m4620w();
                                    C31022l c31022l5 = C31036s.f128022y;
                                    c31036sM95556a = C31022l.m95556a(dM4620w4);
                                } else {
                                    c31036sM95556a = null;
                                }
                                C1464g0 c1464g7 = (C1464g0) c1454e2.m4593u().get("horizontal_accuracy");
                                if (c1464g7 != null) {
                                    double dM4620w5 = c1464g7.m4620w();
                                    C31022l c31022l6 = C31036s.f128022y;
                                    c31036sM95556a2 = C31022l.m95556a(dM4620w5);
                                } else {
                                    c31036sM95556a2 = null;
                                }
                                C1464g0 c1464g8 = (C1464g0) c1454e2.m4593u().get("vertical_accuracy");
                                if (c1464g8 != null) {
                                    double dM4620w6 = c1464g8.m4620w();
                                    C31022l c31022l7 = C31036s.f128022y;
                                    c31036sM95556a3 = C31022l.m95556a(dM4620w6);
                                } else {
                                    c31036sM95556a3 = null;
                                }
                                AbstractC22676k.m65749i(instantOfEpochMilli9, "ofEpochMilli(it.startTimeMillis)");
                                arrayList7.add(new C25167q(instantOfEpochMilli9, dM4620w2, dM4620w3, c31036sM95556a2, c31036sM95556a3, c31036sM95556a));
                            }
                            c25175u = new C25173t(new C25169r(arrayList7));
                        } else {
                            C1464g0 c1464g9 = (C1464g0) c1533u.m4856W().get("hasRoute");
                            c25175u = (c1464g9 == null || !c1464g9.m4619u()) ? new C25175u() : new C25171s();
                        }
                        return new C25179w(instantM113380C5, zoneOffsetM113381D5, instantM113426u5, zoneOffsetM113427v5, iM113387J, strM113382E, strM113382E2, c26413cM113378A, list, list2, c25175u);
                    }
                    break;
                case 1584919122:
                    if (strM4922r.equals("BodyTemperature")) {
                        return new C25148h(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), new C31021k0(AbstractC35785b.m113424s(c1533u, "temperature")), AbstractC35785b.m113387J(c1533u, "measurementLocation", AbstractC25145g.f98593a), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1598107271:
                    if (strM4922r.equals("SleepStage")) {
                        return new C25184y0(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), AbstractC35785b.m113387J(c1533u, "stage", C25184y0.f98813g), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1719563767:
                    if (strM4922r.equals("BodyFat")) {
                        return new C25142f(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), new C31005c0(AbstractC35785b.m113424s(c1533u, "percentage")), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 1738316664:
                    if (strM4922r.equals("Nutrition")) {
                        C1464g0 c1464g10 = (C1464g0) c1533u.m4856W().get("biotin");
                        if (c1464g10 != null) {
                            double dM4620w7 = c1464g10.m4620w();
                            C31038t c31038t4 = C31003b0.f127986y;
                            c31003b0M95566a = C31038t.m95566a(dM4620w7);
                        } else {
                            c31003b0M95566a = null;
                        }
                        C1464g0 c1464g11 = (C1464g0) c1533u.m4856W().get("caffeine");
                        if (c1464g11 != null) {
                            double dM4620w8 = c1464g11.m4620w();
                            C31038t c31038t5 = C31003b0.f127986y;
                            c31003b0M95566a2 = C31038t.m95566a(dM4620w8);
                        } else {
                            c31003b0M95566a2 = null;
                        }
                        C1464g0 c1464g12 = (C1464g0) c1533u.m4856W().get("calcium");
                        if (c1464g12 != null) {
                            double dM4620w9 = c1464g12.m4620w();
                            C31038t c31038t6 = C31003b0.f127986y;
                            c31003b0M95566a3 = C31038t.m95566a(dM4620w9);
                        } else {
                            c31003b0M95566a3 = null;
                        }
                        C1464g0 c1464g13 = (C1464g0) c1533u.m4856W().get("calories");
                        if (c1464g13 != null) {
                            double dM4620w10 = c1464g13.m4620w();
                            C31008e c31008e3 = C31020k.f128009y;
                            c31020kM95546a = C31008e.m95546a(dM4620w10);
                        } else {
                            c31020kM95546a = null;
                        }
                        C1464g0 c1464g14 = (C1464g0) c1533u.m4856W().get("caloriesFromFat");
                        if (c1464g14 != null) {
                            double dM4620w11 = c1464g14.m4620w();
                            C31008e c31008e4 = C31020k.f128009y;
                            c31020kM95546a2 = C31008e.m95546a(dM4620w11);
                        } else {
                            c31020kM95546a2 = null;
                        }
                        C1464g0 c1464g15 = (C1464g0) c1533u.m4856W().get("chloride");
                        if (c1464g15 != null) {
                            double dM4620w12 = c1464g15.m4620w();
                            C31038t c31038t7 = C31003b0.f127986y;
                            c31003b0M95566a4 = C31038t.m95566a(dM4620w12);
                        } else {
                            c31003b0M95566a4 = null;
                        }
                        C1464g0 c1464g16 = (C1464g0) c1533u.m4856W().get("cholesterol");
                        if (c1464g16 != null) {
                            double dM4620w13 = c1464g16.m4620w();
                            C31038t c31038t8 = C31003b0.f127986y;
                            c31003b0M95566a5 = C31038t.m95566a(dM4620w13);
                        } else {
                            c31003b0M95566a5 = null;
                        }
                        C1464g0 c1464g17 = (C1464g0) c1533u.m4856W().get("chromium");
                        if (c1464g17 != null) {
                            double dM4620w14 = c1464g17.m4620w();
                            C31038t c31038t9 = C31003b0.f127986y;
                            c31003b0M95566a6 = C31038t.m95566a(dM4620w14);
                        } else {
                            c31003b0M95566a6 = null;
                        }
                        C1464g0 c1464g18 = (C1464g0) c1533u.m4856W().get("copper");
                        if (c1464g18 != null) {
                            double dM4620w15 = c1464g18.m4620w();
                            C31038t c31038t10 = C31003b0.f127986y;
                            c31003b0M95566a7 = C31038t.m95566a(dM4620w15);
                        } else {
                            c31003b0M95566a7 = null;
                        }
                        C1464g0 c1464g19 = (C1464g0) c1533u.m4856W().get("dietaryFiber");
                        if (c1464g19 != null) {
                            double dM4620w16 = c1464g19.m4620w();
                            C31038t c31038t11 = C31003b0.f127986y;
                            c31003b0M95566a8 = C31038t.m95566a(dM4620w16);
                        } else {
                            c31003b0M95566a8 = null;
                        }
                        C1464g0 c1464g20 = (C1464g0) c1533u.m4856W().get("folate");
                        if (c1464g20 != null) {
                            double dM4620w17 = c1464g20.m4620w();
                            C31038t c31038t12 = C31003b0.f127986y;
                            c31003b0M95566a9 = C31038t.m95566a(dM4620w17);
                        } else {
                            c31003b0M95566a9 = null;
                        }
                        C1464g0 c1464g21 = (C1464g0) c1533u.m4856W().get("folicAcid");
                        if (c1464g21 != null) {
                            double dM4620w18 = c1464g21.m4620w();
                            C31038t c31038t13 = C31003b0.f127986y;
                            c31003b0M95566a10 = C31038t.m95566a(dM4620w18);
                        } else {
                            c31003b0M95566a10 = null;
                        }
                        C1464g0 c1464g22 = (C1464g0) c1533u.m4856W().get("iodine");
                        if (c1464g22 != null) {
                            double dM4620w19 = c1464g22.m4620w();
                            C31038t c31038t14 = C31003b0.f127986y;
                            c31003b0M95566a11 = C31038t.m95566a(dM4620w19);
                        } else {
                            c31003b0M95566a11 = null;
                        }
                        C1464g0 c1464g23 = (C1464g0) c1533u.m4856W().get("iron");
                        if (c1464g23 != null) {
                            double dM4620w20 = c1464g23.m4620w();
                            C31038t c31038t15 = C31003b0.f127986y;
                            c31003b0M95566a12 = C31038t.m95566a(dM4620w20);
                        } else {
                            c31003b0M95566a12 = null;
                        }
                        C1464g0 c1464g24 = (C1464g0) c1533u.m4856W().get("magnesium");
                        if (c1464g24 != null) {
                            double dM4620w21 = c1464g24.m4620w();
                            C31038t c31038t16 = C31003b0.f127986y;
                            c31003b0M95566a13 = C31038t.m95566a(dM4620w21);
                        } else {
                            c31003b0M95566a13 = null;
                        }
                        C1464g0 c1464g25 = (C1464g0) c1533u.m4856W().get("manganese");
                        if (c1464g25 != null) {
                            double dM4620w22 = c1464g25.m4620w();
                            C31038t c31038t17 = C31003b0.f127986y;
                            c31003b0M95566a14 = C31038t.m95566a(dM4620w22);
                        } else {
                            c31003b0M95566a14 = null;
                        }
                        C1464g0 c1464g26 = (C1464g0) c1533u.m4856W().get("molybdenum");
                        if (c1464g26 != null) {
                            double dM4620w23 = c1464g26.m4620w();
                            C31038t c31038t18 = C31003b0.f127986y;
                            c31003b0M95566a15 = C31038t.m95566a(dM4620w23);
                        } else {
                            c31003b0M95566a15 = null;
                        }
                        C1464g0 c1464g27 = (C1464g0) c1533u.m4856W().get("monounsaturatedFat");
                        if (c1464g27 != null) {
                            double dM4620w24 = c1464g27.m4620w();
                            C31038t c31038t19 = C31003b0.f127986y;
                            c31003b0M95566a16 = C31038t.m95566a(dM4620w24);
                        } else {
                            c31003b0M95566a16 = null;
                        }
                        C1464g0 c1464g28 = (C1464g0) c1533u.m4856W().get("niacin");
                        if (c1464g28 != null) {
                            double dM4620w25 = c1464g28.m4620w();
                            C31038t c31038t20 = C31003b0.f127986y;
                            c31003b0M95566a17 = C31038t.m95566a(dM4620w25);
                        } else {
                            c31003b0M95566a17 = null;
                        }
                        C1464g0 c1464g29 = (C1464g0) c1533u.m4856W().get("pantothenicAcid");
                        if (c1464g29 != null) {
                            double dM4620w26 = c1464g29.m4620w();
                            C31038t c31038t21 = C31003b0.f127986y;
                            c31003b0M95566a18 = C31038t.m95566a(dM4620w26);
                        } else {
                            c31003b0M95566a18 = null;
                        }
                        C1464g0 c1464g30 = (C1464g0) c1533u.m4856W().get("phosphorus");
                        if (c1464g30 != null) {
                            double dM4620w27 = c1464g30.m4620w();
                            C31038t c31038t22 = C31003b0.f127986y;
                            c31003b0M95566a19 = C31038t.m95566a(dM4620w27);
                        } else {
                            c31003b0M95566a19 = null;
                        }
                        C1464g0 c1464g31 = (C1464g0) c1533u.m4856W().get("polyunsaturatedFat");
                        if (c1464g31 != null) {
                            double dM4620w28 = c1464g31.m4620w();
                            C31038t c31038t23 = C31003b0.f127986y;
                            c31003b0M95566a20 = C31038t.m95566a(dM4620w28);
                        } else {
                            c31003b0M95566a20 = null;
                        }
                        C1464g0 c1464g32 = (C1464g0) c1533u.m4856W().get("potassium");
                        if (c1464g32 != null) {
                            double dM4620w29 = c1464g32.m4620w();
                            C31038t c31038t24 = C31003b0.f127986y;
                            c31003b0M95566a21 = C31038t.m95566a(dM4620w29);
                        } else {
                            c31003b0M95566a21 = null;
                        }
                        C1464g0 c1464g33 = (C1464g0) c1533u.m4856W().get("protein");
                        if (c1464g33 != null) {
                            double dM4620w30 = c1464g33.m4620w();
                            C31038t c31038t25 = C31003b0.f127986y;
                            c31003b0M95566a22 = C31038t.m95566a(dM4620w30);
                        } else {
                            c31003b0M95566a22 = null;
                        }
                        C1464g0 c1464g34 = (C1464g0) c1533u.m4856W().get("riboflavin");
                        if (c1464g34 != null) {
                            double dM4620w31 = c1464g34.m4620w();
                            C31038t c31038t26 = C31003b0.f127986y;
                            c31003b0M95566a23 = C31038t.m95566a(dM4620w31);
                        } else {
                            c31003b0M95566a23 = null;
                        }
                        C1464g0 c1464g35 = (C1464g0) c1533u.m4856W().get("saturatedFat");
                        if (c1464g35 != null) {
                            double dM4620w32 = c1464g35.m4620w();
                            C31038t c31038t27 = C31003b0.f127986y;
                            c31003b0M95566a24 = C31038t.m95566a(dM4620w32);
                        } else {
                            c31003b0M95566a24 = null;
                        }
                        C1464g0 c1464g36 = (C1464g0) c1533u.m4856W().get("selenium");
                        if (c1464g36 != null) {
                            double dM4620w33 = c1464g36.m4620w();
                            C31038t c31038t28 = C31003b0.f127986y;
                            c31003b0M95566a25 = C31038t.m95566a(dM4620w33);
                        } else {
                            c31003b0M95566a25 = null;
                        }
                        C1464g0 c1464g37 = (C1464g0) c1533u.m4856W().get("sodium");
                        if (c1464g37 != null) {
                            double dM4620w34 = c1464g37.m4620w();
                            C31038t c31038t29 = C31003b0.f127986y;
                            c31003b0M95566a26 = C31038t.m95566a(dM4620w34);
                        } else {
                            c31003b0M95566a26 = null;
                        }
                        C1464g0 c1464g38 = (C1464g0) c1533u.m4856W().get("sugar");
                        if (c1464g38 != null) {
                            double dM4620w35 = c1464g38.m4620w();
                            C31038t c31038t30 = C31003b0.f127986y;
                            c31003b0M95566a27 = C31038t.m95566a(dM4620w35);
                        } else {
                            c31003b0M95566a27 = null;
                        }
                        C1464g0 c1464g39 = (C1464g0) c1533u.m4856W().get("thiamin");
                        if (c1464g39 != null) {
                            double dM4620w36 = c1464g39.m4620w();
                            C31038t c31038t31 = C31003b0.f127986y;
                            c31003b0M95566a28 = C31038t.m95566a(dM4620w36);
                        } else {
                            c31003b0M95566a28 = null;
                        }
                        C1464g0 c1464g40 = (C1464g0) c1533u.m4856W().get("totalCarbohydrate");
                        if (c1464g40 != null) {
                            double dM4620w37 = c1464g40.m4620w();
                            C31038t c31038t32 = C31003b0.f127986y;
                            c31003b0M95566a29 = C31038t.m95566a(dM4620w37);
                        } else {
                            c31003b0M95566a29 = null;
                        }
                        C1464g0 c1464g41 = (C1464g0) c1533u.m4856W().get("totalFat");
                        if (c1464g41 != null) {
                            double dM4620w38 = c1464g41.m4620w();
                            C31038t c31038t33 = C31003b0.f127986y;
                            c31003b0M95566a30 = C31038t.m95566a(dM4620w38);
                        } else {
                            c31003b0M95566a30 = null;
                        }
                        C1464g0 c1464g42 = (C1464g0) c1533u.m4856W().get("transFat");
                        if (c1464g42 != null) {
                            double dM4620w39 = c1464g42.m4620w();
                            C31038t c31038t34 = C31003b0.f127986y;
                            c31003b0M95566a31 = C31038t.m95566a(dM4620w39);
                        } else {
                            c31003b0M95566a31 = null;
                        }
                        C1464g0 c1464g43 = (C1464g0) c1533u.m4856W().get("unsaturatedFat");
                        if (c1464g43 != null) {
                            double dM4620w40 = c1464g43.m4620w();
                            C31038t c31038t35 = C31003b0.f127986y;
                            c31003b0M95566a32 = C31038t.m95566a(dM4620w40);
                        } else {
                            c31003b0M95566a32 = null;
                        }
                        C1464g0 c1464g44 = (C1464g0) c1533u.m4856W().get("vitaminA");
                        if (c1464g44 != null) {
                            double dM4620w41 = c1464g44.m4620w();
                            C31038t c31038t36 = C31003b0.f127986y;
                            c31003b0M95566a33 = C31038t.m95566a(dM4620w41);
                        } else {
                            c31003b0M95566a33 = null;
                        }
                        C1464g0 c1464g45 = (C1464g0) c1533u.m4856W().get("vitaminB12");
                        if (c1464g45 != null) {
                            double dM4620w42 = c1464g45.m4620w();
                            C31038t c31038t37 = C31003b0.f127986y;
                            c31003b0M95566a34 = C31038t.m95566a(dM4620w42);
                        } else {
                            c31003b0M95566a34 = null;
                        }
                        C1464g0 c1464g46 = (C1464g0) c1533u.m4856W().get("vitaminB6");
                        if (c1464g46 != null) {
                            double dM4620w43 = c1464g46.m4620w();
                            C31038t c31038t38 = C31003b0.f127986y;
                            c31003b0M95566a35 = C31038t.m95566a(dM4620w43);
                        } else {
                            c31003b0M95566a35 = null;
                        }
                        C1464g0 c1464g47 = (C1464g0) c1533u.m4856W().get("vitaminC");
                        if (c1464g47 != null) {
                            double dM4620w44 = c1464g47.m4620w();
                            C31038t c31038t39 = C31003b0.f127986y;
                            c31003b0M95566a36 = C31038t.m95566a(dM4620w44);
                        } else {
                            c31003b0M95566a36 = null;
                        }
                        C1464g0 c1464g48 = (C1464g0) c1533u.m4856W().get("vitaminD");
                        if (c1464g48 != null) {
                            double dM4620w45 = c1464g48.m4620w();
                            C31038t c31038t40 = C31003b0.f127986y;
                            c31003b0M95566a37 = C31038t.m95566a(dM4620w45);
                        } else {
                            c31003b0M95566a37 = null;
                        }
                        C1464g0 c1464g49 = (C1464g0) c1533u.m4856W().get("vitaminE");
                        if (c1464g49 != null) {
                            double dM4620w46 = c1464g49.m4620w();
                            C31038t c31038t41 = C31003b0.f127986y;
                            c31003b0M95566a38 = C31038t.m95566a(dM4620w46);
                        } else {
                            c31003b0M95566a38 = null;
                        }
                        C1464g0 c1464g50 = (C1464g0) c1533u.m4856W().get("vitaminK");
                        if (c1464g50 != null) {
                            double dM4620w47 = c1464g50.m4620w();
                            C31038t c31038t42 = C31003b0.f127986y;
                            c31003b0M95566a39 = C31038t.m95566a(dM4620w47);
                        } else {
                            c31003b0M95566a39 = null;
                        }
                        C1464g0 c1464g51 = (C1464g0) c1533u.m4856W().get("zinc");
                        if (c1464g51 != null) {
                            double dM4620w48 = c1464g51.m4620w();
                            C31038t c31038t43 = C31003b0.f127986y;
                            c31003b0M95566a40 = C31038t.m95566a(dM4620w48);
                        }
                        return new C25160m0(AbstractC35785b.m113380C(c1533u), AbstractC35785b.m113381D(c1533u), AbstractC35785b.m113426u(c1533u), AbstractC35785b.m113427v(c1533u), c31003b0M95566a, c31003b0M95566a2, c31003b0M95566a3, c31020kM95546a, c31020kM95546a2, c31003b0M95566a4, c31003b0M95566a5, c31003b0M95566a6, c31003b0M95566a7, c31003b0M95566a8, c31003b0M95566a9, c31003b0M95566a10, c31003b0M95566a11, c31003b0M95566a12, c31003b0M95566a13, c31003b0M95566a14, c31003b0M95566a15, c31003b0M95566a16, c31003b0M95566a17, c31003b0M95566a18, c31003b0M95566a19, c31003b0M95566a20, c31003b0M95566a21, c31003b0M95566a22, c31003b0M95566a23, c31003b0M95566a24, c31003b0M95566a25, c31003b0M95566a26, c31003b0M95566a27, c31003b0M95566a28, c31003b0M95566a29, c31003b0M95566a30, c31003b0M95566a31, c31003b0M95566a32, c31003b0M95566a33, c31003b0M95566a34, c31003b0M95566a35, c31003b0M95566a36, c31003b0M95566a37, c31003b0M95566a38, c31003b0M95566a39, c31003b0M95566a40, AbstractC35785b.m113382E(c1533u, "name"), AbstractC35785b.m113387J(c1533u, "mealType", AbstractC25152i0.f98621a), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 2034898936:
                    if (strM4922r.equals("BoneMass")) {
                        double dM113424s10 = AbstractC35785b.m113424s(c1533u, "mass");
                        C31038t c31038t44 = C31003b0.f127986y;
                        return new C25153j(AbstractC35785b.m113383F(c1533u), AbstractC35785b.m113384G(c1533u), C31038t.m95567b(dM113424s10), AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 2065313759:
                    if (strM4922r.equals("SleepSession")) {
                        String strM113382E3 = AbstractC35785b.m113382E(c1533u, "title");
                        String strM113382E4 = AbstractC35785b.m113382E(c1533u, "notes");
                        Instant instantM113380C6 = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D6 = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u6 = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v6 = AbstractC35785b.m113427v(c1533u);
                        C1518r c1518r4 = (C1518r) c1533u.m4853T().get("stages");
                        if (c1518r4 != null) {
                            InterfaceC1544w0<C1454e0> valuesList4 = c1518r4.m4812r();
                            AbstractC22676k.m65749i(valuesList4, "valuesList");
                            ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(valuesList4, 10));
                            for (C1454e0 c1454e3 : valuesList4) {
                                Instant instantOfEpochMilli10 = Instant.ofEpochMilli(c1454e3.m4592t());
                                AbstractC22676k.m65749i(instantOfEpochMilli10, "ofEpochMilli(it.startTimeMillis)");
                                Instant instantOfEpochMilli11 = Instant.ofEpochMilli(c1454e3.m4591s());
                                AbstractC22676k.m65749i(instantOfEpochMilli11, "ofEpochMilli(it.endTimeMillis)");
                                ?? r10 = C25182x0.f98801i;
                                C1464g0 c1464g52 = (C1464g0) c1454e3.m4593u().get("stage");
                                Integer num = (Integer) r10.get(c1464g52 != null ? c1464g52.m4621x() : null);
                                arrayList8.add(new C25180w0(instantOfEpochMilli10, instantOfEpochMilli11, num != null ? num.intValue() : 0));
                            }
                            list3 = arrayList8;
                        } else {
                            list3 = c25271y;
                        }
                        return new C25182x0(instantM113380C6, zoneOffsetM113381D6, instantM113426u6, zoneOffsetM113427v6, strM113382E3, strM113382E4, list3, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
                case 2095285180:
                    if (strM4922r.equals("PowerSeries")) {
                        Instant instantM113380C7 = AbstractC35785b.m113380C(c1533u);
                        ZoneOffset zoneOffsetM113381D7 = AbstractC35785b.m113381D(c1533u);
                        Instant instantM113426u7 = AbstractC35785b.m113426u(c1533u);
                        ZoneOffset zoneOffsetM113427v7 = AbstractC35785b.m113427v(c1533u);
                        InterfaceC1544w0<C1439b0> seriesValuesList5 = c1533u.m4850Q();
                        AbstractC22676k.m65749i(seriesValuesList5, "seriesValuesList");
                        ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(seriesValuesList5, 10));
                        for (C1439b0 c1439b4 : seriesValuesList5) {
                            Instant instantOfEpochMilli12 = Instant.ofEpochMilli(c1439b4.m4574r());
                            AbstractC22676k.m65749i(instantOfEpochMilli12, "ofEpochMilli(value.instantTimeMillis)");
                            double dM113425t2 = AbstractC35785b.m113425t(c1439b4, "power");
                            C31007d0 c31007d0 = C31015h0.f127999y;
                            arrayList9.add(new C25166p0(instantOfEpochMilli12, C31007d0.m95545a(dM113425t2)));
                        }
                        return new C25168q0(instantM113380C7, zoneOffsetM113381D7, instantM113426u7, zoneOffsetM113427v7, arrayList9, AbstractC35785b.m113378A(c1533u));
                    }
                    break;
            }
        }
        throw new RuntimeException("Unknown data type " + c1533u.m4844J().m4922r());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154 A[LOOP:0: B:96:0x0137->B:108:0x0154, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0167  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:124:0x0195  */
    /* JADX WARN: Code duplicated, block: B:125:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:131:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0142  */
    /* JADX INFO: renamed from: a */
    public static final void m111170a(String content, Modifier modifier, String str, long j7, long j13, int i13, float f13, C28780r c28780r, Typeface typeface, long j14, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        long j15;
        int i17;
        int i18;
        long j16;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g2;
        Object objM87133R2;
        int[] iArrM35486f;
        int length;
        int i19;
        int i24;
        int iM35485e;
        int[] iArr;
        int i25;
        int i26;
        String str2;
        InterfaceC29260b0 interfaceC29260b0;
        long j17;
        String str3;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1473227835);
        if ((i14 & 14) == 0) {
            i16 = (c28655q.m87153g(content) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 112) == 0) {
            i16 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 7168) == 0) {
            i16 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 57344) == 0) {
            i16 |= c28655q.m87151f(j13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 458752) == 0) {
            i16 |= c28655q.m87149e(i13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 3670016) == 0) {
            i16 |= c28655q.m87147d(f13) ? 1048576 : 524288;
        }
        if ((29360128 & i14) == 0) {
            i16 |= c28655q.m87153g(c28780r) ? 8388608 : 4194304;
        }
        int i27 = i15 & 512;
        if (i27 != 0) {
            j15 = j14;
            i18 = i16 | 805306368;
            i17 = 2;
        } else {
            j15 = j14;
            if ((i14 & 1879048192) == 0) {
                i17 = 2;
                i16 |= c28655q.m87151f(j15) ? 536870912 : 268435456;
            } else {
                i17 = 2;
            }
            i18 = i16;
        }
        int i28 = c28655q.m87157i(function1) ? 4 : i17;
        c28655q.m87140Z();
        if ((i14 & 1) == 0 || c28655q.m87118C()) {
            if (i27 != 0) {
                j16 = 0;
            }
            c28655q.m87175r();
            zM87153g = c28655q.m87153g(content);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87153g2 = c28655q.m87153g(str);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                iArrM35486f = AbstractC12682p.m35486f(i17);
                length = iArrM35486f.length;
                i19 = 0;
                while (true) {
                    if (i19 >= length) {
                        i24 = 0;
                        break;
                    }
                    iArr = iArrM35486f;
                    i25 = iArr[i19];
                    i26 = length;
                    if (i25 == 1) {
                        str2 = "typewriter";
                    } else {
                        if (i25 != 2) {
                            throw null;
                        }
                        str2 = "none";
                    }
                    if (str2.equals(str)) {
                        i24 = i25;
                        break;
                    } else {
                        i19++;
                        iArrM35486f = iArr;
                        length = i26;
                    }
                }
                if (i24 != 0) {
                    i17 = i24;
                }
                iM35485e = AbstractC12682p.m35485e(i17);
                if (iM35485e == 0) {
                    objM87133R2 = new C29276j0();
                } else {
                    if (iM35485e != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objM87133R2 = new C29281o();
                }
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC29260b0 = (InterfaceC29260b0) objM87133R2;
            j17 = j16;
            AbstractC28683x.m87253g(c28655q, new C13774c(j17, interfaceC29260b0, content, interfaceC28601c1, (InterfaceC30057d) null), content);
            if (interfaceC29260b0 instanceof C29281o) {
                str3 = content;
            } else {
                str3 = (String) interfaceC28601c1.getValue();
            }
            int i29 = i18 >> 3;
            AbstractC35902e.m113960d(str3, modifier, j7, j13, i13, f13, c28780r, typeface, function1, c28655q, 16777216 | (i18 & 112) | (i29 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | ((i28 << 24) & 234881024));
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                return;
            }
            c28677v1M87180u.f115982d = new C29261c(content, modifier, str, j7, j13, i13, f13, c28780r, typeface, j17, function1, i14, i15);
        }
        c28655q.m87138X();
        j16 = j15;
        c28655q.m87175r();
        zM87153g = c28655q.m87153g(content);
        objM87133R = c28655q.m87133R();
        C28676v0 c28676v1 = C28635l.f115821a;
        if (zM87153g) {
            objM87133R = AbstractC28683x.m87272z("");
            c28655q.m87172p0(objM87133R);
        } else {
            objM87133R = AbstractC28683x.m87272z("");
            c28655q.m87172p0(objM87133R);
        }
        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        zM87153g2 = c28655q.m87153g(str);
        objM87133R2 = c28655q.m87133R();
        if (zM87153g2) {
            iArrM35486f = AbstractC12682p.m35486f(i17);
            length = iArrM35486f.length;
            i19 = 0;
            while (true) {
                if (i19 >= length) {
                    i24 = 0;
                    break;
                }
                iArr = iArrM35486f;
                i25 = iArr[i19];
                i26 = length;
                if (i25 == 1) {
                    str2 = "typewriter";
                } else {
                    if (i25 != 2) {
                        throw null;
                    }
                    str2 = "none";
                }
                if (str2.equals(str)) {
                    i24 = i25;
                    break;
                } else {
                    i19++;
                    iArrM35486f = iArr;
                    length = i26;
                }
            }
            if (i24 != 0) {
                i17 = i24;
            }
            iM35485e = AbstractC12682p.m35485e(i17);
            if (iM35485e == 0) {
                objM87133R2 = new C29276j0();
            } else {
                if (iM35485e != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                objM87133R2 = new C29281o();
            }
            c28655q.m87172p0(objM87133R2);
        } else {
            iArrM35486f = AbstractC12682p.m35486f(i17);
            length = iArrM35486f.length;
            i19 = 0;
            while (true) {
                if (i19 >= length) {
                    i24 = 0;
                    break;
                }
                iArr = iArrM35486f;
                i25 = iArr[i19];
                i26 = length;
                if (i25 == 1) {
                    str2 = "typewriter";
                } else {
                    if (i25 != 2) {
                        throw null;
                    }
                    str2 = "none";
                }
                if (str2.equals(str)) {
                    i24 = i25;
                    break;
                } else {
                    i19++;
                    iArrM35486f = iArr;
                    length = i26;
                }
            }
            if (i24 != 0) {
                i17 = i24;
            }
            iM35485e = AbstractC12682p.m35485e(i17);
            if (iM35485e == 0) {
                objM87133R2 = new C29276j0();
            } else {
                if (iM35485e != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                objM87133R2 = new C29281o();
            }
            c28655q.m87172p0(objM87133R2);
        }
        interfaceC29260b0 = (InterfaceC29260b0) objM87133R2;
        j17 = j16;
        AbstractC28683x.m87253g(c28655q, new C13774c(j17, interfaceC29260b0, content, interfaceC28601c1, (InterfaceC30057d) null), content);
        if (interfaceC29260b0 instanceof C29281o) {
            str3 = content;
        } else {
            str3 = (String) interfaceC28601c1.getValue();
        }
        int i210 = i18 >> 3;
        AbstractC35902e.m113960d(str3, modifier, j7, j13, i13, f13, c28780r, typeface, function1, c28655q, 16777216 | (i18 & 112) | (i210 & 896) | (i210 & 7168) | (i210 & 57344) | (i210 & 458752) | (i210 & 3670016) | ((i28 << 24) & 234881024));
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C29261c(content, modifier, str, j7, j13, i13, f13, c28780r, typeface, j17, function1, i14, i15);
    }

    /* JADX INFO: renamed from: b */
    public static final void m111171b(C23254g c23254g, long j7, C23285v0 c23285v0, Modifier modifier, Map map, boolean z4, int i13, int i14, Function1 function1, Function1 function2, Composer composer, int i15) {
        int i16;
        long j13;
        C23285v0 c23285v1;
        Map map2;
        C28655q c28655q;
        int i17;
        Function1 function3;
        boolean z13;
        int i18;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1952998280);
        if ((i15 & 6) == 0) {
            i16 = (c28655q2.m87153g(c23254g) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            j13 = j7;
            i16 |= c28655q2.m87151f(j13) ? 32 : 16;
        } else {
            j13 = j7;
        }
        if ((i15 & 384) == 0) {
            c23285v1 = c23285v0;
            i16 |= c28655q2.m87153g(c23285v1) ? 256 : 128;
        } else {
            c23285v1 = c23285v0;
        }
        if ((i15 & 3072) == 0) {
            i16 |= c28655q2.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            map2 = map;
            i16 |= c28655q2.m87157i(map2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            map2 = map;
        }
        int i19 = i16 | 115015680;
        if ((805306368 & i15) == 0) {
            i19 |= c28655q2.m87157i(function2) ? 536870912 : 268435456;
        }
        if ((306783379 & i19) == 306783378 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            z13 = z4;
            i18 = i13;
            i17 = i14;
            function3 = function1;
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(-1159071624);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C28402f(21);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function4 = (Function1) objM87133R;
            Object objM94759h = AbstractC30802r.m94759h(-1159069718, c28655q2, false);
            InterfaceC30057d interfaceC30057d = null;
            if (objM94759h == c28676v0) {
                objM94759h = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM94759h);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM94759h;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(-1159065526);
            boolean z14 = (1879048192 & i19) == 536870912;
            Object objM87133R2 = c28655q2.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26285a(interfaceC28601c1, function2, interfaceC30057d, 7);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            Modifier modifierMo3471e = modifier.mo3471e(C2314t.f9131w.mo3471e(new SuspendPointerInputElement(function2, null, null, new C34450b0((InterfaceC4351m) objM87133R2), 6)));
            C23285v0 c23285v0M67364b = C23285v0.m67364b(c23285v1, j13, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
            c28655q2.m87150e0(-1159033598);
            boolean z15 = (i19 & 234881024) == 67108864;
            Object objM87133R3 = c28655q2.m87133R();
            if (z15 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2609r(interfaceC28601c1, function4, 29);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC30060g.m92109c(c23254g, modifierMo3471e, c23285v0M67364b, (Function1) objM87133R3, 0, map2, c28655q, (i19 & 14) | (57344 & (i19 >> 6)) | (458752 & i19) | ((i19 >> 3) & 3670016) | ((i19 << 12) & 234881024));
            i17 = Integer.MAX_VALUE;
            function3 = function4;
            z13 = true;
            i18 = 1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14075m(c23254g, j7, c23285v0, modifier, map, z13, i18, i17, function3, function2, i15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m111172c(Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-499228189);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(c28655q2, R.string.stripe_wallet_default), AbstractC1136a.m3599a(modifier, "default_payment_method_label"), AbstractC11673r.m31082k(c28655q2).f37674g, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q2).f56285l, 0L, 0L, C28780r.f116540G, null, 0L, 0, 0L, null, null, 16777211), c28655q, 0, 3120, 55288);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2061f(modifier, i13, 1, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:118:0x0186  */
    /* JADX WARN: Code duplicated, block: B:119:0x018d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:123:0x019d  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:142:0x0224  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x011d, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static final void m111173d(String html, Modifier modifier, Map map, long j7, C23285v0 c23285v0, boolean z4, C23267m0 c23267m0, int i13, InterfaceC4339a interfaceC4339a, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        Map map2;
        int i18;
        C23285v0 c23285v1;
        int i19;
        boolean z13;
        int i24;
        int i25;
        C23267m0 c23267m1;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        C28676v0 c28676v0;
        C23267m0 c23267m2;
        InterfaceC4339a interfaceC4339a2;
        Map map3;
        C23267m0 c23267m3;
        Object objM87133R;
        Context context;
        boolean z14;
        boolean zM87157i;
        Object objM87133R2;
        Map map4;
        C23267m0 c23267m4;
        InterfaceC4339a interfaceC4339a3;
        Modifier modifier3;
        int i35;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i36;
        int i37;
        AbstractC22676k.m65750j(html, "html");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-9822761);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(html) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i38 = i15 & 2;
        if (i38 == 0) {
            if ((i14 & 48) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    map2 = map;
                    if (c28655q.m87157i(map2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) != 0) {
                    if (c28655q.m87151f(j7)) {
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i37;
                }
                if ((i14 & 24576) == 0) {
                    c23285v1 = c23285v0;
                    if (c28655q.m87153g(c23285v1)) {
                        i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i36 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i36;
                } else {
                    c23285v1 = c23285v0;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    if ((196608 & i14) == 0) {
                        z13 = z4;
                        if (c28655q.m87155h(z13)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 1572864;
                        c23267m1 = c23267m0;
                    } else {
                        c23267m1 = c23267m0;
                        if ((i14 & 1572864) == 0) {
                            if (c28655q.m87153g(c23267m1)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i16 |= i26;
                        }
                    }
                    if ((i14 & 12582912) != 0) {
                        i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
                    }
                    i27 = i15 & 256;
                    if (i27 != 0) {
                        i16 |= 100663296;
                    } else if ((i14 & 100663296) == 0) {
                        if (c28655q.m87157i(interfaceC4339a)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i28;
                    }
                    i29 = i16;
                    if ((i16 & 38347923) == 38347922 || !c28655q.m87121F()) {
                        c28655q.m87140Z();
                        i34 = i14 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i34 != 0 || c28655q.m87118C()) {
                            if (i38 != 0) {
                                modifier2 = C2314t.f9131w;
                            }
                            if (i17 != 0) {
                                map2 = C25272z.f99163w;
                            }
                            if (i19 != 0) {
                                z13 = true;
                            }
                            if (i25 != 0) {
                                c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                            } else {
                                c23267m2 = c23267m1;
                            }
                            if ((i15 & 128) != 0) {
                                i29 &= -29360129;
                                i13 = 1;
                            } else {
                                i13 = i13;
                            }
                            if (i27 != 0) {
                                c28655q.m87150e0(-2101772058);
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C28376a(7);
                                    c28655q.m87172p0(objM87133R);
                                }
                                c28655q.m87173q(false);
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a2 = interfaceC4339a;
                            }
                            map3 = map2;
                            c23267m3 = c23267m2;
                        } else {
                            c28655q.m87138X();
                            if ((i15 & 128) != 0) {
                                i29 &= -29360129;
                            }
                            map3 = map2;
                            c23267m3 = c23267m1;
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        c28655q.m87175r();
                        context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                        c28655q.m87150e0(-2101765232);
                        if ((i29 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c28655q.m87173q(false);
                        int i39 = i29 >> 3;
                        int i44 = (i29 & 65534) | (i39 & 458752) | (i39 & 3670016);
                        Modifier modifier4 = modifier2;
                        m111174e(html, modifier4, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i44);
                        map4 = map3;
                        c23267m4 = c23267m3;
                        interfaceC4339a3 = interfaceC4339a2;
                        modifier3 = modifier4;
                        i35 = i13;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a3 = interfaceC4339a;
                        modifier3 = modifier2;
                        map4 = map2;
                        c23267m4 = c23267m1;
                        i35 = i13;
                    }
                    z15 = z13;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
                    }
                }
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z13 = z4;
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    c23267m1 = c23267m0;
                } else {
                    c23267m1 = c23267m0;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q.m87153g(c23267m1)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                }
                if ((i14 & 12582912) != 0) {
                    i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                i29 = i16;
                if ((i16 & 38347923) == 38347922) {
                    c28655q.m87140Z();
                    i34 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    }
                    c28655q.m87175r();
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q.m87150e0(-2101765232);
                    if ((i29 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i310 = i29 >> 3;
                    int i45 = (i29 & 65534) | (i310 & 458752) | (i310 & 3670016);
                    Modifier modifier5 = modifier2;
                    m111174e(html, modifier5, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i45);
                    map4 = map3;
                    c23267m4 = c23267m3;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier5;
                    i35 = i13;
                } else {
                    c28655q.m87140Z();
                    i34 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    }
                    c28655q.m87175r();
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q.m87150e0(-2101765232);
                    if ((i29 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i311 = i29 >> 3;
                    int i46 = (i29 & 65534) | (i311 & 458752) | (i311 & 3670016);
                    Modifier modifier6 = modifier2;
                    m111174e(html, modifier6, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i46);
                    map4 = map3;
                    c23267m4 = c23267m3;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier6;
                    i35 = i13;
                }
                z15 = z13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
                }
            }
            i16 |= 384;
            map2 = map;
            if ((i14 & 3072) != 0) {
                if (c28655q.m87151f(j7)) {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i37;
            }
            if ((i14 & 24576) == 0) {
                c23285v1 = c23285v0;
                if (c28655q.m87153g(c23285v1)) {
                    i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i36 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i36;
            } else {
                c23285v1 = c23285v0;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    c23267m1 = c23267m0;
                } else {
                    c23267m1 = c23267m0;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q.m87153g(c23267m1)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                }
                if ((i14 & 12582912) != 0) {
                    i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                i29 = i16;
                if ((i16 & 38347923) == 38347922) {
                    c28655q.m87140Z();
                    i34 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    }
                    c28655q.m87175r();
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q.m87150e0(-2101765232);
                    if ((i29 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i312 = i29 >> 3;
                    int i47 = (i29 & 65534) | (i312 & 458752) | (i312 & 3670016);
                    Modifier modifier7 = modifier2;
                    m111174e(html, modifier7, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i47);
                    map4 = map3;
                    c23267m4 = c23267m3;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier7;
                    i35 = i13;
                } else {
                    c28655q.m87140Z();
                    i34 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    }
                    c28655q.m87175r();
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q.m87150e0(-2101765232);
                    if ((i29 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i313 = i29 >> 3;
                    int i48 = (i29 & 65534) | (i313 & 458752) | (i313 & 3670016);
                    Modifier modifier8 = modifier2;
                    m111174e(html, modifier8, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i48);
                    map4 = map3;
                    c23267m4 = c23267m3;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier8;
                    i35 = i13;
                }
                z15 = z13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                c23267m1 = c23267m0;
            } else {
                c23267m1 = c23267m0;
                if ((i14 & 1572864) == 0) {
                    if (c28655q.m87153g(c23267m1)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            if ((i14 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            i29 = i16;
            if ((i16 & 38347923) == 38347922) {
                c28655q.m87140Z();
                i34 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                }
                c28655q.m87175r();
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87150e0(-2101765232);
                if ((i29 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                int i314 = i29 >> 3;
                int i49 = (i29 & 65534) | (i314 & 458752) | (i314 & 3670016);
                Modifier modifier9 = modifier2;
                m111174e(html, modifier9, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i49);
                map4 = map3;
                c23267m4 = c23267m3;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier9;
                i35 = i13;
            } else {
                c28655q.m87140Z();
                i34 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                }
                c28655q.m87175r();
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87150e0(-2101765232);
                if ((i29 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                int i315 = i29 >> 3;
                int i410 = (i29 & 65534) | (i315 & 458752) | (i315 & 3670016);
                Modifier modifier10 = modifier2;
                m111174e(html, modifier10, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i410);
                map4 = map3;
                c23267m4 = c23267m3;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier10;
                i35 = i13;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
            }
        }
        i16 |= 48;
        modifier2 = modifier;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                map2 = map;
                if (c28655q.m87157i(map2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) != 0) {
                if (c28655q.m87151f(j7)) {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i37;
            }
            if ((i14 & 24576) == 0) {
                c23285v1 = c23285v0;
                if (c28655q.m87153g(c23285v1)) {
                    i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i36 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i36;
            } else {
                c23285v1 = c23285v0;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                    c23267m1 = c23267m0;
                } else {
                    c23267m1 = c23267m0;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q.m87153g(c23267m1)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                }
                if ((i14 & 12582912) != 0) {
                    i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
                }
                i27 = i15 & 256;
                if (i27 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i28;
                }
                i29 = i16;
                if ((i16 & 38347923) == 38347922) {
                    c28655q.m87140Z();
                    i34 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    }
                    c28655q.m87175r();
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q.m87150e0(-2101765232);
                    if ((i29 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i316 = i29 >> 3;
                    int i411 = (i29 & 65534) | (i316 & 458752) | (i316 & 3670016);
                    Modifier modifier11 = modifier2;
                    m111174e(html, modifier11, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i411);
                    map4 = map3;
                    c23267m4 = c23267m3;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier11;
                    i35 = i13;
                } else {
                    c28655q.m87140Z();
                    i34 = i14 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    } else {
                        if (i38 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i17 != 0) {
                            map2 = C25272z.f99163w;
                        }
                        if (i19 != 0) {
                            z13 = true;
                        }
                        if (i25 != 0) {
                            c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                        } else {
                            c23267m2 = c23267m1;
                        }
                        if ((i15 & 128) != 0) {
                            i29 &= -29360129;
                            i13 = 1;
                        } else {
                            i13 = i13;
                        }
                        if (i27 != 0) {
                            c28655q.m87150e0(-2101772058);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C28376a(7);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a2 = interfaceC4339a;
                        }
                        map3 = map2;
                        c23267m3 = c23267m2;
                    }
                    c28655q.m87175r();
                    context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                    c28655q.m87150e0(-2101765232);
                    if ((i29 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i317 = i29 >> 3;
                    int i412 = (i29 & 65534) | (i317 & 458752) | (i317 & 3670016);
                    Modifier modifier12 = modifier2;
                    m111174e(html, modifier12, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i412);
                    map4 = map3;
                    c23267m4 = c23267m3;
                    interfaceC4339a3 = interfaceC4339a2;
                    modifier3 = modifier12;
                    i35 = i13;
                }
                z15 = z13;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z13 = z4;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                c23267m1 = c23267m0;
            } else {
                c23267m1 = c23267m0;
                if ((i14 & 1572864) == 0) {
                    if (c28655q.m87153g(c23267m1)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            if ((i14 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            i29 = i16;
            if ((i16 & 38347923) == 38347922) {
                c28655q.m87140Z();
                i34 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                }
                c28655q.m87175r();
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87150e0(-2101765232);
                if ((i29 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                int i318 = i29 >> 3;
                int i413 = (i29 & 65534) | (i318 & 458752) | (i318 & 3670016);
                Modifier modifier13 = modifier2;
                m111174e(html, modifier13, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i413);
                map4 = map3;
                c23267m4 = c23267m3;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier13;
                i35 = i13;
            } else {
                c28655q.m87140Z();
                i34 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                }
                c28655q.m87175r();
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87150e0(-2101765232);
                if ((i29 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                int i319 = i29 >> 3;
                int i414 = (i29 & 65534) | (i319 & 458752) | (i319 & 3670016);
                Modifier modifier14 = modifier2;
                m111174e(html, modifier14, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i414);
                map4 = map3;
                c23267m4 = c23267m3;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier14;
                i35 = i13;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
            }
        }
        i16 |= 384;
        map2 = map;
        if ((i14 & 3072) != 0) {
            if (c28655q.m87151f(j7)) {
                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i37;
        }
        if ((i14 & 24576) == 0) {
            c23285v1 = c23285v0;
            if (c28655q.m87153g(c23285v1)) {
                i36 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i36 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i36;
        } else {
            c23285v1 = c23285v0;
        }
        i19 = i15 & 32;
        if (i19 != 0) {
            if ((196608 & i14) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
                c23267m1 = c23267m0;
            } else {
                c23267m1 = c23267m0;
                if ((i14 & 1572864) == 0) {
                    if (c28655q.m87153g(c23267m1)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
            }
            if ((i14 & 12582912) != 0) {
                i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
            }
            i27 = i15 & 256;
            if (i27 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i28;
            }
            i29 = i16;
            if ((i16 & 38347923) == 38347922) {
                c28655q.m87140Z();
                i34 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                }
                c28655q.m87175r();
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87150e0(-2101765232);
                if ((i29 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                int i3110 = i29 >> 3;
                int i415 = (i29 & 65534) | (i3110 & 458752) | (i3110 & 3670016);
                Modifier modifier15 = modifier2;
                m111174e(html, modifier15, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i415);
                map4 = map3;
                c23267m4 = c23267m3;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier15;
                i35 = i13;
            } else {
                c28655q.m87140Z();
                i34 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                } else {
                    if (i38 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i17 != 0) {
                        map2 = C25272z.f99163w;
                    }
                    if (i19 != 0) {
                        z13 = true;
                    }
                    if (i25 != 0) {
                        c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                    } else {
                        c23267m2 = c23267m1;
                    }
                    if ((i15 & 128) != 0) {
                        i29 &= -29360129;
                        i13 = 1;
                    } else {
                        i13 = i13;
                    }
                    if (i27 != 0) {
                        c28655q.m87150e0(-2101772058);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C28376a(7);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                    }
                    map3 = map2;
                    c23267m3 = c23267m2;
                }
                c28655q.m87175r();
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87150e0(-2101765232);
                if ((i29 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                int i3111 = i29 >> 3;
                int i416 = (i29 & 65534) | (i3111 & 458752) | (i3111 & 3670016);
                Modifier modifier16 = modifier2;
                m111174e(html, modifier16, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i416);
                map4 = map3;
                c23267m4 = c23267m3;
                interfaceC4339a3 = interfaceC4339a2;
                modifier3 = modifier16;
                i35 = i13;
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
            c23267m1 = c23267m0;
        } else {
            c23267m1 = c23267m0;
            if ((i14 & 1572864) == 0) {
                if (c28655q.m87153g(c23267m1)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
        }
        if ((i14 & 12582912) != 0) {
            i16 |= ((i15 & 128) == 0 || !c28655q.m87149e(i13)) ? 4194304 : 8388608;
        }
        i27 = i15 & 256;
        if (i27 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (c28655q.m87157i(interfaceC4339a)) {
                i28 = 67108864;
            } else {
                i28 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i28;
        }
        i29 = i16;
        if ((i16 & 38347923) == 38347922) {
            c28655q.m87140Z();
            i34 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i17 != 0) {
                    map2 = C25272z.f99163w;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if (i25 != 0) {
                    c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                } else {
                    c23267m2 = c23267m1;
                }
                if ((i15 & 128) != 0) {
                    i29 &= -29360129;
                    i13 = 1;
                } else {
                    i13 = i13;
                }
                if (i27 != 0) {
                    c28655q.m87150e0(-2101772058);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28376a(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                map3 = map2;
                c23267m3 = c23267m2;
            } else {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i17 != 0) {
                    map2 = C25272z.f99163w;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if (i25 != 0) {
                    c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                } else {
                    c23267m2 = c23267m1;
                }
                if ((i15 & 128) != 0) {
                    i29 &= -29360129;
                    i13 = 1;
                } else {
                    i13 = i13;
                }
                if (i27 != 0) {
                    c28655q.m87150e0(-2101772058);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28376a(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                map3 = map2;
                c23267m3 = c23267m2;
            }
            c28655q.m87175r();
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87150e0(-2101765232);
            if ((i29 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            int i3112 = i29 >> 3;
            int i417 = (i29 & 65534) | (i3112 & 458752) | (i3112 & 3670016);
            Modifier modifier17 = modifier2;
            m111174e(html, modifier17, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i417);
            map4 = map3;
            c23267m4 = c23267m3;
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier17;
            i35 = i13;
        } else {
            c28655q.m87140Z();
            i34 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i17 != 0) {
                    map2 = C25272z.f99163w;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if (i25 != 0) {
                    c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                } else {
                    c23267m2 = c23267m1;
                }
                if ((i15 & 128) != 0) {
                    i29 &= -29360129;
                    i13 = 1;
                } else {
                    i13 = i13;
                }
                if (i27 != 0) {
                    c28655q.m87150e0(-2101772058);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28376a(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                map3 = map2;
                c23267m3 = c23267m2;
            } else {
                if (i38 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i17 != 0) {
                    map2 = C25272z.f99163w;
                }
                if (i19 != 0) {
                    z13 = true;
                }
                if (i25 != 0) {
                    c23267m2 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61439);
                } else {
                    c23267m2 = c23267m1;
                }
                if ((i15 & 128) != 0) {
                    i29 &= -29360129;
                    i13 = 1;
                } else {
                    i13 = i13;
                }
                if (i27 != 0) {
                    c28655q.m87150e0(-2101772058);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C28376a(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                }
                map3 = map2;
                c23267m3 = c23267m2;
            }
            c28655q.m87175r();
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87150e0(-2101765232);
            if ((i29 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z14 | ((i29 & 234881024) == 67108864) | c28655q.m87157i(context);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C1023i0(z13, interfaceC4339a2, context, 10);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            int i3113 = i29 >> 3;
            int i418 = (i29 & 65534) | (i3113 & 458752) | (i3113 & 3670016);
            Modifier modifier18 = modifier2;
            m111174e(html, modifier18, map3, j7, c23285v1, c23267m3, i13, (Function1) objM87133R2, c28655q, i418);
            map4 = map3;
            c23267m4 = c23267m3;
            interfaceC4339a3 = interfaceC4339a2;
            modifier3 = modifier18;
            i35 = i13;
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14075m(html, modifier3, map4, j7, c23285v0, z15, c23267m4, i35, interfaceC4339a3, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX INFO: renamed from: e */
    public static final void m111174e(String html, Modifier modifier, Map map, long j7, C23285v0 c23285v0, C23267m0 c23267m0, int i13, Function1 onClick, Composer composer, int i14) {
        Map map2;
        int i15;
        ?? r10;
        C28655q c28655q;
        Iterator it;
        Modifier modifier2 = modifier;
        C23285v0 c23285v1 = c23285v0;
        int i16 = i13;
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(583944314);
        int i17 = (i14 & 6) == 0 ? (c28655q2.m87153g(html) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87153g(modifier2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            map2 = map;
            i17 |= c28655q2.m87157i(map2) ? 256 : 128;
        } else {
            map2 = map;
        }
        if ((i14 & 3072) == 0) {
            i17 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i17 |= c28655q2.m87153g(c23285v1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i17 |= c28655q2.m87153g(c23267m0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i17 |= c28655q2.m87149e(i16) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i17 |= c28655q2.m87157i(onClick) ? 8388608 : 4194304;
        }
        int i18 = i17;
        if ((i18 & 4793491) == 4793490 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            int i19 = (i18 >> 3) & 112;
            int i24 = i18 >> 9;
            C23254g c23254gM111183n = m111183n(html, map2, c23267m0, c28655q2, (i18 & 14) | i19 | (i24 & 896), 0);
            C28655q c28655q3 = c28655q2;
            c28655q3.m87150e0(-217737456);
            Object objM87133R = c28655q3.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM94759h = AbstractC30802r.m94759h(-217735361, c28655q3, false);
            if (objM94759h == obj) {
                objM94759h = new C25046w(context, 14);
                c28655q3.m87172p0(objM94759h);
            }
            C25046w c25046w = (C25046w) objM94759h;
            c28655q3.m87173q(false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                InterfaceC28601c1 interfaceC28601c2 = interfaceC28601c1;
                if (((C28826a) entry.getValue()) instanceof C28826a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    obj = obj;
                }
                interfaceC28601c1 = interfaceC28601c2;
            }
            InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c1;
            Object obj2 = obj;
            int i25 = i18 >> 6;
            c28655q3.m87150e0(1107909875);
            Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W);
            for (Map.Entry entry2 : setEntrySet) {
                String str = (String) entry2.getKey();
                C28826a c28826a = (C28826a) entry2.getValue();
                int i26 = i25;
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c28826a.f116697a, c28655q3, 0);
                float fM47211c = C16620e.m47211c(abstractC26165aM88500I.getF4822H());
                float fM47213e = C16620e.m47213e(abstractC26165aM88500I.getF4822H());
                C28655q c28655q4 = c28655q3;
                long j13 = c23285v1.f92255a.f92192b;
                float f13 = fM47213e / fM47211c;
                AbstractC35745c.m113242a(j13);
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                int i27 = i16;
                linkedHashMap3.put(str, new C34327j0(new C23249d0(AbstractC11478a.m30852d(j13, j13 & 1095216660480L, f13), j13, i27), AbstractC37817c.m121344e(-271963554, c28655q4, new C11518b0(6, abstractC26165aM88500I, c28826a))));
                linkedHashMap2 = linkedHashMap3;
                c28655q3 = c28655q4;
                c25046w = c25046w;
                c23254gM111183n = c23254gM111183n;
                i25 = i26;
                c23285v1 = c23285v0;
                i16 = i27;
            }
            int i28 = i25;
            LinkedHashMap linkedHashMap4 = linkedHashMap2;
            C23254g c23254g = c23254gM111183n;
            int i29 = i16;
            C25046w c25046w2 = c25046w;
            C28655q c28655q5 = c28655q3;
            c28655q5.m87173q(false);
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
            }
            c28655q5.m87150e0(1925244042);
            Set setEntrySet2 = linkedHashMap5.entrySet();
            int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet2, 10));
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(iM73988W2 < 16 ? 16 : iM73988W2);
            Iterator it4 = setEntrySet2.iterator();
            if (it4.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it4.next();
                if (entry3.getValue() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            Object objM94759h2 = AbstractC30802r.m94759h(-217707235, c28655q5, false);
            if (objM94759h2 == obj2) {
                objM94759h2 = new C27325i(4, interfaceC28601c3);
                c28655q5.m87172p0(objM94759h2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM94759h2;
            c28655q5.m87173q(false);
            int i34 = i19 | 24576 | (i24 & 7168);
            c28655q5.m87150e0(-1863307166);
            List listM67315b = c23254g.m67315b(0, c23254g.f92135x.length());
            ArrayList arrayList = new ArrayList();
            Iterator it5 = listM67315b.iterator();
            while (it5.hasNext()) {
                Object next = it5.next();
                String str2 = (String) ((C23250e) next).f92125a;
                AbstractC22676k.m65750j(str2, "<this>");
                C33617b c33617b = EnumC25028e.f98043y;
                if (c33617b != null && c33617b.isEmpty()) {
                    it = it5;
                    break;
                    break;
                }
                Iterator it6 = c33617b.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        it = it5;
                        break;
                    }
                    List list = ((EnumC25028e) it6.next()).f98044w;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it7 = list.iterator();
                        while (it7.hasNext()) {
                            it = it5;
                            if (AbstractC39421y.m125920E(str2, (String) it7.next(), true)) {
                                if (!map.keySet().contains(str2)) {
                                    arrayList.add(next);
                                    break;
                                }
                                break;
                            }
                            it5 = it;
                        }
                    }
                    it5 = it5;
                }
                it5 = it;
            }
            c28655q5.m87150e0(-1903946131);
            Object objM87133R2 = c28655q5.m87133R();
            if (objM87133R2 == obj2) {
                objM87133R2 = AbstractC13091v.m36593c(C25272z.f99163w);
                c28655q5.m87172p0(objM87133R2);
            }
            InterfaceC13075p1 interfaceC13075p1 = (InterfaceC13075p1) objM87133R2;
            c28655q5.m87173q(false);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q5.m87161k(AbstractC2453v1.f9569h);
            c28655q5.m87150e0(-1903940740);
            if (arrayList.isEmpty()) {
                i15 = 8388608;
                r10 = 0;
            } else {
                c28655q5.m87150e0(-1903938607);
                boolean zM87157i = ((((i34 & 7168) ^ 3072) > 2048 && c28655q5.m87149e(i29)) || (i34 & 3072) == 2048) | c28655q5.m87157i(arrayList) | c28655q5.m87157i(c25046w2) | c28655q5.m87157i(interfaceC13075p1) | c28655q5.m87153g(interfaceC39171c);
                Object objM87133R3 = c28655q5.m87133R();
                if (zM87157i || objM87133R3 == obj2) {
                    i15 = 8388608;
                    Object c28829d = new C28829d(arrayList, interfaceC13075p1, interfaceC4339a, c25046w2, interfaceC39171c, i29, null);
                    c28655q5.m87172p0(c28829d);
                    objM87133R3 = c28829d;
                } else {
                    i15 = 8388608;
                }
                r10 = 0;
                c28655q5.m87173q(false);
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R3, c23254g);
            }
            c28655q5.m87173q(r10);
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(interfaceC13075p1, c28655q5, r10);
            c28655q5.m87173q(r10);
            Map map3 = (Map) interfaceC28601c1M83597t.getValue();
            if (map3.isEmpty() || ((Boolean) interfaceC28601c3.getValue()).booleanValue()) {
                c28655q5.m87150e0(-217697360);
                Object objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == obj2) {
                    objM87133R4 = new C28402f(20);
                    c28655q5.m87172p0(objM87133R4);
                }
                c28655q5.m87173q(false);
                modifier2 = modifier;
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifier2, true, (Function1) objM87133R4);
                LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(linkedHashMap4, linkedHashMap6), map3);
                c28655q5.m87150e0(-217690992);
                boolean zM87153g = c28655q5.m87153g(c23254g) | ((i18 & 29360128) == i15);
                Object objM87133R5 = c28655q5.m87133R();
                if (zM87153g || objM87133R5 == obj2) {
                    objM87133R5 = new C27050m(20, onClick, c23254g);
                    c28655q5.m87172p0(objM87133R5);
                }
                c28655q5.m87173q(false);
                m111171b(c23254g, j7, c23285v0, modifierM51775c, linkedHashMapM73995d0, false, 0, 0, null, (Function1) objM87133R5, c28655q5, i28 & MessageListItemViewType.GIPHY);
                c28655q = c28655q5;
            } else {
                modifier2 = modifier;
                c28655q = c28655q5;
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25228c(html, modifier2, map, j7, c23285v0, c23267m0, i13, onClick, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[PHI: r0 r5 r9
      0x0093: PHI (r0v14 int) = (r0v9 int), (r0v15 int), (r0v16 int) binds: [B:57:0x00c7, B:48:0x008f, B:49:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r5v7 long) = (r5v1 long), (r5v0 long), (r5v0 long) binds: [B:57:0x00c7, B:48:0x008f, B:49:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r9v9 long) = (r9v1 long), (r9v0 long), (r9v0 long) binds: [B:57:0x00c7, B:48:0x008f, B:49:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m111175f(float f13, final int i13, final int i14, long j7, long j13, Composer composer, final Modifier modifier) {
        int i15;
        float f14;
        float f15;
        long j14;
        long j15;
        C11365j0 c11365j0M30559g;
        boolean z4;
        boolean zM87153g;
        Object objM87133R;
        long j16;
        final long j17;
        final float f16;
        final long j18;
        C28677v1 c28677v1M87180u;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(459278094);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        long j19 = j7;
        long j24 = j13;
        int i16 = i15 | (((i14 & 2) == 0 && c28655q.m87151f(j19)) ? 32 : 16) | (((i14 & 4) == 0 && c28655q.m87151f(j24)) ? 256 : 128);
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                i16 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i16 & 1171) == 1170 || !c28655q.m87121F()) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if ((i14 & 2) != 0) {
                        c28655q.m87150e0(-443512897);
                        C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                        c28655q.m87173q(false);
                        j19 = c14931b.f55686y;
                        i16 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        c28655q.m87150e0(-443512897);
                        C14931b c14931b2 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                        c28655q.m87173q(false);
                        j24 = c14931b2.f55665d;
                        i16 &= -897;
                    }
                    if (i17 != 0) {
                        f15 = 6;
                        j14 = j24;
                    }
                    c28655q.m87175r();
                    j15 = j14;
                    c11365j0M30559g = AbstractC11348f.m30559g(AbstractC11348f.m30571s(null, c28655q, 1), 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1200, 0, null, 6), EnumC11408v0.f36577w, 4), null, c28655q, 4536, 8);
                    c28655q.m87150e0(2130810875);
                    if ((i16 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM87153g = z4 | ((((i16 & 896) ^ 384) <= 256 && c28655q.m87151f(j15)) || (i16 & 384) == 256) | c28655q.m87153g(c11365j0M30559g) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j19)) || (i16 & 48) == 32);
                    objM87133R = c28655q.m87133R();
                    if (!zM87153g || objM87133R == C28635l.f115821a) {
                        j16 = j19;
                        objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        j16 = j19;
                    }
                    c28655q.m87173q(false);
                    AbstractC21478l0.m60421a(modifier, (Function1) objM87133R, c28655q, i16 & 14);
                    j17 = j15;
                    f16 = f15;
                    j18 = j16;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i16 &= -113;
                    }
                    if ((i14 & 4) != 0) {
                        i16 &= -897;
                    }
                }
                j14 = j24;
                f15 = f14;
                c28655q.m87175r();
                j15 = j14;
                c11365j0M30559g = AbstractC11348f.m30559g(AbstractC11348f.m30571s(null, c28655q, 1), 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1200, 0, null, 6), EnumC11408v0.f36577w, 4), null, c28655q, 4536, 8);
                c28655q.m87150e0(2130810875);
                if ((i16 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87153g = z4 | ((((i16 & 896) ^ 384) <= 256 && c28655q.m87151f(j15)) || (i16 & 384) == 256) | c28655q.m87153g(c11365j0M30559g) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j19)) || (i16 & 48) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    j16 = j19;
                    objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                    c28655q.m87172p0(objM87133R);
                } else {
                    j16 = j19;
                    objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC21478l0.m60421a(modifier, (Function1) objM87133R, c28655q, i16 & 14);
                j17 = j15;
                f16 = f15;
                j18 = j16;
            } else {
                c28655q.m87138X();
                j18 = j19;
                j17 = j24;
                f16 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h00.g0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                        AbstractC35148d.m111175f(f16, iM87244L, i14, j18, j17, (Composer) obj, modifier);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 3072;
        f14 = f13;
        if ((i16 & 1171) == 1170) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b3 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j19 = c14931b3.f55686y;
                    i16 &= -113;
                }
                if ((i14 & 4) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b4 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j24 = c14931b4.f55665d;
                    i16 &= -897;
                }
                if (i17 != 0) {
                    f15 = 6;
                    j14 = j24;
                } else {
                    j14 = j24;
                    f15 = f14;
                }
            } else {
                if ((i14 & 2) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b5 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j19 = c14931b5.f55686y;
                    i16 &= -113;
                }
                if ((i14 & 4) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b6 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j24 = c14931b6.f55665d;
                    i16 &= -897;
                }
                if (i17 != 0) {
                    f15 = 6;
                    j14 = j24;
                } else {
                    j14 = j24;
                    f15 = f14;
                }
            }
            c28655q.m87175r();
            j15 = j14;
            c11365j0M30559g = AbstractC11348f.m30559g(AbstractC11348f.m30571s(null, c28655q, 1), 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1200, 0, null, 6), EnumC11408v0.f36577w, 4), null, c28655q, 4536, 8);
            c28655q.m87150e0(2130810875);
            if ((i16 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87153g = z4 | ((((i16 & 896) ^ 384) <= 256 && c28655q.m87151f(j15)) || (i16 & 384) == 256) | c28655q.m87153g(c11365j0M30559g) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j19)) || (i16 & 48) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                j16 = j19;
                objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                c28655q.m87172p0(objM87133R);
            } else {
                j16 = j19;
                objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC21478l0.m60421a(modifier, (Function1) objM87133R, c28655q, i16 & 14);
            j17 = j15;
            f16 = f15;
            j18 = j16;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b7 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j19 = c14931b7.f55686y;
                    i16 &= -113;
                }
                if ((i14 & 4) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b8 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j24 = c14931b8.f55665d;
                    i16 &= -897;
                }
                if (i17 != 0) {
                    f15 = 6;
                    j14 = j24;
                } else {
                    j14 = j24;
                    f15 = f14;
                }
            } else {
                if ((i14 & 2) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b9 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j19 = c14931b9.f55686y;
                    i16 &= -113;
                }
                if ((i14 & 4) != 0) {
                    c28655q.m87150e0(-443512897);
                    C14931b c14931b10 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                    c28655q.m87173q(false);
                    j24 = c14931b10.f55665d;
                    i16 &= -897;
                }
                if (i17 != 0) {
                    f15 = 6;
                    j14 = j24;
                } else {
                    j14 = j24;
                    f15 = f14;
                }
            }
            c28655q.m87175r();
            j15 = j14;
            c11365j0M30559g = AbstractC11348f.m30559g(AbstractC11348f.m30571s(null, c28655q, 1), 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1200, 0, null, 6), EnumC11408v0.f36577w, 4), null, c28655q, 4536, 8);
            c28655q.m87150e0(2130810875);
            if ((i16 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87153g = z4 | ((((i16 & 896) ^ 384) <= 256 && c28655q.m87151f(j15)) || (i16 & 384) == 256) | c28655q.m87153g(c11365j0M30559g) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j19)) || (i16 & 48) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                j16 = j19;
                objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                c28655q.m87172p0(objM87133R);
            } else {
                j16 = j19;
                objM87133R = new C15150t4(f15, j15, j16, c11365j0M30559g);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC21478l0.m60421a(modifier, (Function1) objM87133R, c28655q, i16 & 14);
            j17 = j15;
            f16 = f15;
            j18 = j16;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h00.g0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    AbstractC35148d.m111175f(f16, iM87244L, i14, j18, j17, (Composer) obj, modifier);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m111176g(Modifier modifier, AbstractC28669t1 abstractC28669t1, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C37816b c37816b2;
        C37816b c37816b3 = AbstractC39926h.f172362a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-714464401);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(abstractC28669t1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c37816b3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                C28633k1 c28633k1 = new C28633k1(null, C28676v0.f115976y);
                c28655q.m87172p0(c28633k1);
                objM87133R = c28633k1;
            }
            C2212c c2212cM111184o = m111184o(c37816b3, c28655q, (i14 >> 6) & 14);
            modifier2 = modifier;
            c37816b2 = c37816b;
            AbstractC28683x.m87247a(abstractC28669t1.mo86977a(c2212cM111184o), AbstractC37817c.m121344e(274270255, c28655q, new C2213d(modifier2, (InterfaceC28601c1) objM87133R, c37816b2, c2212cM111184o, 0)), c28655q, 56);
        } else {
            modifier2 = modifier;
            c37816b2 = c37816b;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(modifier2, abstractC28669t1, c37816b2, i13);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C4255a m111177h(C4255a c4255a, InterfaceC30063j context, int i13) {
        if ((i13 & 1) != 0) {
            c4255a = AbstractC4257c.m13288a();
        }
        if ((i13 & 2) != 0) {
            context = C30064k.f122676w;
        }
        AbstractC22676k.m65750j(context, "context");
        return new C4255a(c4255a, context);
    }

    /* JADX INFO: renamed from: i */
    public static final Double m111178i(Collection collection) {
        if (collection.isEmpty()) {
            return null;
        }
        double dDoubleValue = 0.0d;
        for (Object obj : collection) {
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Number");
            dDoubleValue += ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue / ((double) collection.size()));
    }

    /* JADX INFO: renamed from: j */
    public static final Codec m111179j(String str, Map map) {
        RTCStats rTCStats;
        if (str == null || (rTCStats = (RTCStats) map.get(str)) == null) {
            return null;
        }
        C26228b c26228bM34267S = AbstractC12313p.m34267S(rTCStats);
        String str2 = c26228bM34267S.f104010g;
        String str3 = str2 == null ? "" : str2;
        Long l7 = c26228bM34267S.f104011h;
        int iLongValue = l7 != null ? (int) l7.longValue() : 0;
        Long l12 = c26228bM34267S.f104008e;
        int iLongValue2 = l12 != null ? (int) l12.longValue() : 0;
        String str4 = c26228bM34267S.f104007d;
        return new Codec(iLongValue2, str3, iLongValue, null, str4 == null ? "" : str4, null, 40, null);
    }

    /* JADX INFO: renamed from: k */
    public static final C16618c m111180k(NodeCoordinator nodeCoordinator, InterfaceC39147y interfaceC39147y, C16618c c16618c) {
        return c16618c.m47206l(nodeCoordinator.mo3547r(interfaceC39147y, false).m47200f());
    }

    /* JADX INFO: renamed from: l */
    public static final void m111181l(Map map, String str, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                C5705a c5705a = IdentifierSpec.Companion;
                String strM111182m = m111182m(str, (String) entry.getKey());
                c5705a.getClass();
                linkedHashMap.put(C5705a.m16893b(strM111182m), null);
            } else if (value instanceof String) {
                C5705a c5705a2 = IdentifierSpec.Companion;
                String strM111182m2 = m111182m(str, (String) entry.getKey());
                c5705a2.getClass();
                IdentifierSpec identifierSpecM16893b = C5705a.m16893b(strM111182m2);
                Object value2 = entry.getValue();
                AbstractC22676k.m65748h(value2, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(identifierSpecM16893b, (String) value2);
            } else if (value instanceof Map) {
                Object value3 = entry.getValue();
                AbstractC22676k.m65748h(value3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                m111181l((Map) value3, m111182m(str, (String) entry.getKey()), linkedHashMap);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final String m111182m(String str, String str2) {
        return str.length() == 0 ? str2 : AbstractC11895b.m31997p(str, "[", str2, "]");
    }

    /* JADX INFO: renamed from: n */
    public static final C23254g m111183n(String text, Map map, C23267m0 c23267m0, Composer composer, int i13, int i14) {
        C28655q c28655q;
        Spanned spanned;
        C28655q c28655q2;
        Object[] objArr;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(1962487584);
        Map map2 = (i14 & 2) != 0 ? C25272z.f99163w : map;
        int i19 = i14 & 4;
        C36776l c36776l = C36776l.f157352c;
        C23267m0 c23267m1 = i19 != 0 ? new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, c36776l, (C17924z0) null, 61439) : c23267m0;
        c28655q3.m87150e0(-1904949768);
        int i24 = 1;
        boolean z4 = false;
        boolean z13 = (((i13 & 14) ^ 6) > 4 && c28655q3.m87153g(text)) || (i13 & 6) == 4;
        Object objM87133R = c28655q3.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z13 || objM87133R == c28676v0) {
            objM87133R = Html.fromHtml(text, 0);
            c28655q3.m87172p0(objM87133R);
        }
        Spanned spanned2 = (Spanned) objM87133R;
        c28655q3.m87173q(false);
        AbstractC22676k.m65747g(spanned2);
        c28655q3.m87150e0(-1904943230);
        boolean zM87153g = c28655q3.m87153g(spanned2);
        Object objM87133R2 = c28655q3.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            C23248d c23248d = new C23248d();
            Object[] spans = spanned2.getSpans(0, spanned2.length(), Object.class);
            AbstractC22676k.m65749i(spans, "getSpans(...)");
            int length = spans.length;
            int i25 = 0;
            int i26 = 0;
            while (i25 < length) {
                Object obj = spans[i25];
                int spanStart = spanned2.getSpanStart(obj);
                int spanEnd = spanned2.getSpanEnd(obj);
                if (i26 >= spanned2.toString().length() || spanStart >= spanned2.toString().length() || spanStart - i26 < 0) {
                    spanned = spanned2;
                    c28655q2 = c28655q3;
                    objArr = spans;
                    i15 = i24;
                    i16 = length;
                    i17 = i25;
                } else {
                    String strSubstring = spanned2.toString().substring(i26, spanStart);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    c23248d.m67300b(strSubstring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style == i24) {
                            c23248d.m67299a(new C23267m0(0L, 0L, C28780r.f116542I, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65531), spanStart, spanEnd);
                        } else if (style == 2) {
                            c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, new C28776n(i24), (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65527), spanStart, spanEnd);
                        } else if (style == 3) {
                            c23248d.m67299a(new C23267m0(0L, 0L, C28780r.f116542I, new C28776n(i24), (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65523), spanStart, spanEnd);
                        }
                        spanned = spanned2;
                        c28655q2 = c28655q3;
                        objArr = spans;
                        i15 = i24;
                        i16 = length;
                        i17 = i25;
                        i18 = spanStart;
                    } else if (obj instanceof UnderlineSpan) {
                        i16 = length;
                        i17 = i25;
                        objArr = spans;
                        i15 = i24;
                        spanned = spanned2;
                        c28655q2 = c28655q3;
                        i18 = spanStart;
                        c23248d.m67299a(new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, c36776l, (C17924z0) null, 61439), i18, spanEnd);
                    } else {
                        spanned = spanned2;
                        c28655q2 = c28655q3;
                        objArr = spans;
                        i15 = i24;
                        i16 = length;
                        i17 = i25;
                        i18 = spanStart;
                        if (obj instanceof BulletSpan) {
                            c23248d.m67300b("•\t");
                        } else if (obj instanceof ForegroundColorSpan) {
                            c23248d.m67299a(new C23267m0(AbstractC17918w0.m51515c(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), i18, spanEnd);
                        } else if (obj instanceof ImageSpan) {
                            ImageSpan imageSpan = (ImageSpan) obj;
                            if (imageSpan.getSource() != null) {
                                if (!map2.isEmpty()) {
                                    String source = imageSpan.getSource();
                                    AbstractC22676k.m65747g(source);
                                    map2.containsKey(source);
                                }
                                String source2 = imageSpan.getSource();
                                AbstractC22676k.m65747g(source2);
                                AbstractC34339n0.m108632j(c23248d, source2, "�");
                            }
                            i26 = spanEnd;
                        } else if (obj instanceof URLSpan) {
                            c23248d.m67299a(c23267m1, i18, spanEnd);
                            String url = ((URLSpan) obj).getURL();
                            AbstractC22676k.m65749i(url, "getURL(...)");
                            c23248d.f92121y.add(new C23246c(i18, spanEnd, new C23271o0(url), AppScreen.URLScreen.NAME));
                        }
                    }
                    i26 = i18;
                }
                i25 = i17 + 1;
                spanned2 = spanned;
                c28655q3 = c28655q2;
                length = i16;
                spans = objArr;
                i24 = i15;
                z4 = false;
            }
            Spanned spanned3 = spanned2;
            C28655q c28655q4 = c28655q3;
            if (i26 != spanned3.toString().length()) {
                String strSubstring2 = spanned3.toString().substring(i26);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                c23248d.m67300b(strSubstring2);
            }
            objM87133R2 = c23248d.m67309k();
            c28655q = c28655q4;
            c28655q.m87172p0(objM87133R2);
        } else {
            c28655q = c28655q3;
        }
        C23254g c23254g = (C23254g) objM87133R2;
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        return c23254g;
    }

    /* JADX INFO: renamed from: o */
    public static final C2212c m111184o(C37816b c37816b, Composer composer, int i13) {
        boolean z4 = (((i13 & 14) ^ 6) > 4 && ((C28655q) composer).m87153g(c37816b)) || (i13 & 6) == 4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z4 || objM87133R == c28676v0) {
            objM87133R = new C2212c(c37816b);
            c28655q.m87172p0(objM87133R);
        }
        C2212c c2212c = (C2212c) objM87133R;
        boolean zM87153g = c28655q.m87153g(c2212c);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C0103b(c2212c, 13);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(c2212c, (Function1) objM87133R2, c28655q);
        return c2212c;
    }

    /* JADX INFO: renamed from: p */
    public static final int m111185p(float f13) {
        return (int) Math.ceil(f13);
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC31199g m111186q(C17062e c17062e) {
        for (C31201i c31201i : AbstractC31210r.f128555d) {
            C39412p c39412p = c31201i.f128536b;
            C35850h c35850h = c31201i.f128535a;
            if (c35850h == null || AbstractC22676k.m65745e(c17062e.getName(), c35850h)) {
                if (c39412p != null) {
                    String strM113817b = c17062e.getName().m113817b();
                    AbstractC22676k.m65749i(strM113817b, "asString(...)");
                    if (!c39412p.m125851e(strM113817b)) {
                        continue;
                    }
                }
                Collection collection = c31201i.f128537c;
                if (collection == null || collection.contains(c17062e.getName())) {
                    for (InterfaceC31197e interfaceC31197e : c31201i.f128539e) {
                        if (interfaceC31197e.mo96149b(c17062e) != null) {
                            return new C31198f(false);
                        }
                    }
                    return ((String) c31201i.f128538d.invoke(c17062e)) != null ? new C31198f(false) : C31198f.f128523c;
                }
            }
        }
        return C31198f.f128522b;
    }

    /* JADX INFO: renamed from: r */
    public static float[] m111187r() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    /* JADX INFO: renamed from: s */
    public static C0718j m111188s(String message) {
        AbstractC22676k.m65750j(message, "message");
        return new C0718j(message);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0254  */
    /* JADX WARN: Code duplicated, block: B:104:0x025f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0288  */
    /* JADX WARN: Code duplicated, block: B:108:0x028f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0296  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f1 A[LOOP:0: B:102:0x0259->B:119:0x02f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x031e A[Catch: NameNotFoundException -> 0x032d, TRY_LEAVE, TryCatch #8 {NameNotFoundException -> 0x032d, blocks: (B:121:0x030c, B:123:0x031e, B:124:0x0324, B:128:0x032f), top: B:171:0x030c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0346  */
    /* JADX WARN: Code duplicated, block: B:136:0x035f  */
    /* JADX WARN: Code duplicated, block: B:138:0x036c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0373  */
    /* JADX WARN: Code duplicated, block: B:143:0x0385 A[LOOP:1: B:139:0x0371->B:143:0x0385, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0397  */
    /* JADX WARN: Code duplicated, block: B:149:0x039f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fb A[EDGE_INSN: B:174:0x02fb->B:120:0x02fb BREAK  A[LOOP:0: B:102:0x0259->B:119:0x02f1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0218  */
    /* JADX WARN: Instruction removed from duplicated block: B:98:0x0218, please report this as an issue */
    /* JADX INFO: renamed from: t */
    public static C5371s1 m111189t(Context context, Bundle bundle) {
        String strReplaceFirst;
        String str;
        Uri uri;
        String string;
        String string2;
        String str2;
        String str3;
        int identifier;
        String str4;
        Class<IterableTrampolineActivity> cls;
        ArrayList<C5374t1> arrayList;
        NotificationManager notificationManager;
        NotificationManager notificationManager2;
        NotificationChannel notificationChannel;
        String str5;
        int i13;
        String strM16537a;
        StatusBarNotification[] activeNotifications;
        int length;
        Bundle bundle2;
        int i14;
        Intent intent;
        String str6;
        int i15;
        String str7;
        PendingIntent broadcast;
        NotificationCompat.Action.Builder builder;
        Class<IterableTrampolineActivity> cls2;
        int iIntValue;
        String str8;
        Bundle bundle3 = bundle;
        String string3 = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        if (!bundle3.containsKey("itbl")) {
            AbstractC12350b.m34579a0("IterableNotification", "Notification doesn't have an Iterable payload. Skipping.");
            return null;
        }
        if (AbstractC5380v1.m16538b(bundle3)) {
            AbstractC12350b.m34579a0("IterableNotification", "Received a ghost push notification. Skipping.");
            return null;
        }
        String string4 = bundle3.getString("title", string3);
        String string5 = bundle3.getString("body");
        String string6 = bundle3.getString("sound");
        if (string6 != null) {
            if (string6.contains("https")) {
                str8 = string6;
                string6 = string6.substring(string6.lastIndexOf(47) + 1);
            } else {
                str8 = null;
            }
            String str9 = str8;
            strReplaceFirst = string6.replaceFirst("[.][^.]+$", "");
            str = str9;
        } else {
            strReplaceFirst = string6;
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            int identifier2 = strReplaceFirst != null ? context.getResources().getIdentifier(strReplaceFirst, "raw", context.getPackageName()) : 0;
            uri = identifier2 == 0 ? Settings.System.DEFAULT_NOTIFICATION_URI : Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier2);
        }
        Uri uri2 = uri;
        if (uri2 == Settings.System.DEFAULT_NOTIFICATION_URI) {
            try {
                Bundle bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle4 != null) {
                    Object obj = bundle4.get("iterable_notification_channel_name");
                    string = obj instanceof String ? (String) obj : (!(obj instanceof Integer) || (iIntValue = ((Integer) obj).intValue()) == 0) ? null : context.getString(iIntValue);
                    try {
                        AbstractC12350b.m34593n("IterableNotification", "channel name: " + string);
                    } catch (Exception e5) {
                        e = e5;
                        AbstractC12350b.m34596q("IterableNotification", "Error while retrieving channel name", e);
                    }
                } else {
                    string = null;
                }
            } catch (Exception e13) {
                e = e13;
                string = null;
            }
            if (string == null) {
                string = "iterable channel";
            }
        } else {
            string = strReplaceFirst;
        }
        String packageName = uri2 == Settings.System.DEFAULT_NOTIFICATION_URI ? context.getPackageName() : AbstractC5380v1.m16537a(context, strReplaceFirst, true);
        C5371s1 c5371s1 = new C5371s1(context, packageName);
        String string7 = bundle3.getString("itbl");
        try {
            JSONObject jSONObject = new JSONObject(string7);
            string2 = jSONObject.has("attachment-url") ? jSONObject.getString("attachment-url") : null;
        } catch (JSONException e14) {
            AbstractC12350b.m34579a0("IterableNotification", e14.toString());
            string2 = null;
        }
        C5377u1 c5377u1 = new C5377u1(string7);
        String str10 = (String) c5377u1.f21847d;
        Notification notification = new Notification();
        notification.defaults |= 4;
        String str11 = string;
        try {
            str3 = packageName;
            try {
                str2 = strReplaceFirst;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    Bundle bundle5 = applicationInfo.metaData;
                    if (bundle5 != null) {
                        identifier = bundle5.getInt("iterable_notification_icon", 0);
                        try {
                            AbstractC12350b.m34593n("IterableNotification", "iconID: " + applicationInfo.metaData.get("iterable_notification_icon"));
                        } catch (PackageManager.NameNotFoundException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    } else {
                        identifier = 0;
                    }
                } catch (PackageManager.NameNotFoundException e16) {
                    e = e16;
                    identifier = 0;
                    e.printStackTrace();
                    if (identifier == 0) {
                        Resources resources = context.getResources();
                        C5341k c5341k = C5341k.f21742r;
                        identifier = resources.getIdentifier(context.getSharedPreferences("iterable_notification_icon", 0).getString("iterable_notification_icon", ""), "drawable", context.getPackageName());
                    }
                    if (identifier == 0) {
                        if (context.getApplicationInfo().icon != 0) {
                            AbstractC12350b.m34593n("IterableNotification", "No Notification Icon defined - defaulting to app icon");
                            identifier = context.getApplicationInfo().icon;
                        } else {
                            AbstractC12350b.m34579a0("IterableNotification", "No Notification Icon defined - push notifications will not be displayed");
                        }
                    }
                    c5371s1.setSmallIcon(identifier).setTicker(string3).setAutoCancel(true).setContentTitle(string4).setPriority(1).setContentText(string5);
                    c5371s1.setShowWhen(true);
                    c5371s1.f21827c = string2;
                    c5371s1.f21828d = string5;
                    c5371s1.f21829e = Math.abs((int) System.currentTimeMillis());
                    AbstractC12350b.m34593n("IterableNotification", "Request code = " + c5371s1.f21829e);
                    if (str10 != null) {
                        c5371s1.f21829e = Math.abs(str10.hashCode());
                        AbstractC12350b.m34593n("IterableNotification", "Request code = " + c5371s1.f21829e);
                    }
                    str4 = "com.iterable.push.ACTION_PUSH_ACTION";
                    Intent intent2 = new Intent("com.iterable.push.ACTION_PUSH_ACTION");
                    cls = IterableTrampolineActivity.class;
                    intent2.setClass(context, cls);
                    intent2.putExtras(bundle3);
                    intent2.putExtra("actionIdentifier", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
                    intent2.setFlags(268435456);
                    arrayList = (ArrayList) c5377u1.f21849f;
                    if (arrayList != null) {
                        i14 = 0;
                        for (C5374t1 c5374t1 : arrayList) {
                            intent = new Intent(str4);
                            intent.putExtras(bundle3);
                            intent.putExtra("requestCode", c5371s1.f21829e);
                            intent.putExtra("actionIdentifier", c5374t1.f21832a);
                            intent.putExtra("actionIdentifier", c5374t1.f21832a);
                            str6 = c5374t1.f21834c;
                            if (str6.equals("textInput")) {
                                i15 = 167772160;
                            } else {
                                i15 = 201326592;
                            }
                            str7 = str4;
                            if (c5374t1.f21835d) {
                                AbstractC12350b.m34593n("IterableNotification", "Go through TrampolineActivity");
                                intent.setClass(context, cls);
                                intent.setFlags(268435456);
                                broadcast = PendingIntent.getActivity(context, intent.hashCode(), intent, i15);
                            } else {
                                AbstractC12350b.m34593n("IterableNotification", "Go through IterablePushActionReceiver");
                                intent.setClass(context, IterablePushActionReceiver.class);
                                broadcast = PendingIntent.getBroadcast(context, intent.hashCode(), intent, i15);
                            }
                            cls2 = cls;
                            builder = new NotificationCompat.Action.Builder(0, c5374t1.f21833b, broadcast);
                            if (str6.equals("textInput")) {
                                builder.addRemoteInput(new RemoteInput.Builder("userInput").setLabel(c5374t1.f21836e).build());
                            }
                            c5371s1.addAction(builder.build());
                            i14++;
                            if (i14 == 3) {
                                break;
                            }
                            bundle3 = bundle;
                            str4 = str7;
                            cls = cls2;
                        }
                    }
                    c5371s1.setContentIntent(PendingIntent.getActivity(context, c5371s1.f21829e, intent2, 201326592));
                    c5371s1.f21826b = AbstractC5380v1.m16538b(bundle);
                    bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle2 != null) {
                        int color = bundle2.getInt("iterable_notification_color");
                        try {
                            color = context.getResources().getColor(color);
                        } catch (Resources.NotFoundException unused) {
                        }
                        c5371s1.setColor(color);
                    }
                    if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
                        notification.defaults |= 2;
                    }
                    c5371s1.setDefaults(notification.defaults);
                    notificationManager = (NotificationManager) context.getApplicationContext().getSystemService("notification");
                    if (notificationManager != null) {
                        i13 = 0;
                        strM16537a = AbstractC5380v1.m16537a(context, str2, false);
                        if (notificationManager.getNotificationChannel(strM16537a) != null) {
                            activeNotifications = notificationManager.getActiveNotifications();
                            length = activeNotifications.length;
                            while (true) {
                                if (i13 < length) {
                                    notificationManager.deleteNotificationChannel(strM16537a);
                                    break;
                                }
                                if (activeNotifications[i13].getNotification().getChannelId() == strM16537a) {
                                    AbstractC12350b.m34593n("IterableNotification", "Not Deleting the channel as there are active notification for old channel");
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    notificationManager2 = (NotificationManager) context.getApplicationContext().getSystemService("notification");
                    if (notificationManager2 != null) {
                        String str12 = str3;
                        notificationChannel = notificationManager2.getNotificationChannel(str12);
                        if (notificationChannel != null) {
                            str5 = str11;
                            if (!notificationChannel.getName().equals(str5)) {
                            }
                        } else {
                            str5 = str11;
                        }
                        AbstractC12350b.m34593n("IterableNotification", AbstractC2875y.m8300m("Creating notification: channelId = ", str12, " channelName = ", str5, " channelDescription = "));
                        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
                        NotificationChannel notificationChannel2 = new NotificationChannel(str12, str5, 4);
                        notificationChannel2.setDescription("");
                        notificationChannel2.enableLights(true);
                        notificationChannel2.setShowBadge(AbstractC5380v1.m16539c(context));
                        notificationChannel2.setSound(uri2, audioAttributesBuild);
                        notificationManager2.createNotificationChannel(notificationChannel2);
                    }
                    return c5371s1;
                }
            } catch (PackageManager.NameNotFoundException e17) {
                e = e17;
                str2 = strReplaceFirst;
            }
        } catch (PackageManager.NameNotFoundException e18) {
            e = e18;
            str2 = strReplaceFirst;
            str3 = packageName;
        }
        if (identifier == 0) {
            Resources resources2 = context.getResources();
            C5341k c5341k2 = C5341k.f21742r;
            identifier = resources2.getIdentifier(context.getSharedPreferences("iterable_notification_icon", 0).getString("iterable_notification_icon", ""), "drawable", context.getPackageName());
        }
        if (identifier == 0) {
            if (context.getApplicationInfo().icon != 0) {
                AbstractC12350b.m34593n("IterableNotification", "No Notification Icon defined - defaulting to app icon");
                identifier = context.getApplicationInfo().icon;
            } else {
                AbstractC12350b.m34579a0("IterableNotification", "No Notification Icon defined - push notifications will not be displayed");
            }
        }
        c5371s1.setSmallIcon(identifier).setTicker(string3).setAutoCancel(true).setContentTitle(string4).setPriority(1).setContentText(string5);
        c5371s1.setShowWhen(true);
        c5371s1.f21827c = string2;
        c5371s1.f21828d = string5;
        c5371s1.f21829e = Math.abs((int) System.currentTimeMillis());
        AbstractC12350b.m34593n("IterableNotification", "Request code = " + c5371s1.f21829e);
        if (str10 != null) {
            c5371s1.f21829e = Math.abs(str10.hashCode());
            AbstractC12350b.m34593n("IterableNotification", "Request code = " + c5371s1.f21829e);
        }
        str4 = "com.iterable.push.ACTION_PUSH_ACTION";
        Intent intent3 = new Intent("com.iterable.push.ACTION_PUSH_ACTION");
        cls = IterableTrampolineActivity.class;
        intent3.setClass(context, cls);
        intent3.putExtras(bundle3);
        intent3.putExtra("actionIdentifier", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
        intent3.setFlags(268435456);
        arrayList = (ArrayList) c5377u1.f21849f;
        if (arrayList != null) {
            i14 = 0;
            while (r9.hasNext()) {
                intent = new Intent(str4);
                intent.putExtras(bundle3);
                intent.putExtra("requestCode", c5371s1.f21829e);
                intent.putExtra("actionIdentifier", c5374t1.f21832a);
                intent.putExtra("actionIdentifier", c5374t1.f21832a);
                str6 = c5374t1.f21834c;
                if (str6.equals("textInput")) {
                    i15 = 167772160;
                } else {
                    i15 = 201326592;
                }
                str7 = str4;
                if (c5374t1.f21835d) {
                    AbstractC12350b.m34593n("IterableNotification", "Go through TrampolineActivity");
                    intent.setClass(context, cls);
                    intent.setFlags(268435456);
                    broadcast = PendingIntent.getActivity(context, intent.hashCode(), intent, i15);
                } else {
                    AbstractC12350b.m34593n("IterableNotification", "Go through IterablePushActionReceiver");
                    intent.setClass(context, IterablePushActionReceiver.class);
                    broadcast = PendingIntent.getBroadcast(context, intent.hashCode(), intent, i15);
                }
                cls2 = cls;
                builder = new NotificationCompat.Action.Builder(0, c5374t1.f21833b, broadcast);
                if (str6.equals("textInput")) {
                    builder.addRemoteInput(new RemoteInput.Builder("userInput").setLabel(c5374t1.f21836e).build());
                }
                c5371s1.addAction(builder.build());
                i14++;
                if (i14 == 3) {
                    break;
                    break;
                }
                bundle3 = bundle;
                str4 = str7;
                cls = cls2;
            }
        }
        c5371s1.setContentIntent(PendingIntent.getActivity(context, c5371s1.f21829e, intent3, 201326592));
        c5371s1.f21826b = AbstractC5380v1.m16538b(bundle);
        try {
            bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle2 != null) {
                int color2 = bundle2.getInt("iterable_notification_color");
                color2 = context.getResources().getColor(color2);
                c5371s1.setColor(color2);
            }
        } catch (PackageManager.NameNotFoundException e19) {
            e19.printStackTrace();
        }
        if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
            notification.defaults |= 2;
        }
        c5371s1.setDefaults(notification.defaults);
        notificationManager = (NotificationManager) context.getApplicationContext().getSystemService("notification");
        if (notificationManager != null) {
            i13 = 0;
            strM16537a = AbstractC5380v1.m16537a(context, str2, false);
            if (notificationManager.getNotificationChannel(strM16537a) != null) {
                activeNotifications = notificationManager.getActiveNotifications();
                length = activeNotifications.length;
                while (true) {
                    if (i13 < length) {
                        notificationManager.deleteNotificationChannel(strM16537a);
                        break;
                    }
                    if (activeNotifications[i13].getNotification().getChannelId() == strM16537a) {
                        AbstractC12350b.m34593n("IterableNotification", "Not Deleting the channel as there are active notification for old channel");
                        break;
                    }
                    i13++;
                }
            }
        }
        notificationManager2 = (NotificationManager) context.getApplicationContext().getSystemService("notification");
        if (notificationManager2 != null) {
            String str13 = str3;
            notificationChannel = notificationManager2.getNotificationChannel(str13);
            if (notificationChannel != null) {
                str5 = str11;
                if (!notificationChannel.getName().equals(str5)) {
                }
            } else {
                str5 = str11;
            }
            AbstractC12350b.m34593n("IterableNotification", AbstractC2875y.m8300m("Creating notification: channelId = ", str13, " channelName = ", str5, " channelDescription = "));
            AudioAttributes audioAttributesBuild2 = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
            NotificationChannel notificationChannel3 = new NotificationChannel(str13, str5, 4);
            notificationChannel3.setDescription("");
            notificationChannel3.enableLights(true);
            notificationChannel3.setShowBadge(AbstractC5380v1.m16539c(context));
            notificationChannel3.setSound(uri2, audioAttributesBuild2);
            notificationManager2.createNotificationChannel(notificationChannel3);
        }
        return c5371s1;
    }

    /* JADX INFO: renamed from: u */
    public static final float m111190u(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        return ((Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getDimension(i13) / ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getDensity();
    }

    /* JADX INFO: renamed from: v */
    public static InterfaceC18476b m111191v() {
        InterfaceC18476b c20363j;
        if (f149135c == null) {
            InterfaceC18478d interfaceC18478dM41340d = AbstractC14476d.m41340d();
            if (interfaceC18478dM41340d != null) {
                c20363j = interfaceC18478dM41340d.mo48844c();
                if (interfaceC18478dM41340d instanceof C17267g) {
                    AbstractC17264d.m48848d("Temporary mdcAdapter given by SubstituteServiceProvider.");
                    AbstractC17264d.m48848d("This mdcAdapter will be replaced after backend initialization has completed.");
                }
            } else {
                AbstractC17264d.m48845a("Failed to find provider.");
                AbstractC17264d.m48845a("Defaulting to no-operation MDCAdapter implementation.");
                c20363j = new C20363j(26);
            }
            f149135c = c20363j;
        }
        return f149135c;
    }

    /* JADX INFO: renamed from: w */
    public static Intent m111192w(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(applicationContext.getPackageName());
        return intent;
    }

    /* JADX INFO: renamed from: x */
    public static final Integer m111193x(SurveyResponseNumber surveyResponseNumber, String blockId) {
        AbstractC22676k.m65750j(blockId, "blockId");
        if (AbstractC22676k.m65745e(surveyResponseNumber != null ? surveyResponseNumber.getBlockId() : null, blockId) && surveyResponseNumber != null) {
            return Integer.valueOf(surveyResponseNumber.getValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final C24427f0 m111194y(SurveyResponseSelect surveyResponseSelect, String blockId) {
        AbstractC22676k.m65750j(blockId, "blockId");
        if (AbstractC22676k.m65745e(surveyResponseSelect != null ? surveyResponseSelect.getBlockId() : null, blockId) && surveyResponseSelect != null) {
            return new C24427f0(surveyResponseSelect.getValue(), surveyResponseSelect.getStringResponse(), surveyResponseSelect.getOtherText());
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final String m111195z(SurveyResponseText surveyResponseText, String blockId) {
        AbstractC22676k.m65750j(blockId, "blockId");
        if (AbstractC22676k.m65745e(surveyResponseText != null ? surveyResponseText.getBlockId() : null, blockId) && surveyResponseText != null) {
            return surveyResponseText.getStringResponse();
        }
        return null;
    }
}
