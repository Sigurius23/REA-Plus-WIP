package p021av;

import a33.C0352d;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.health.platform.client.proto.C1491l2;
import androidx.health.platform.client.proto.C1496m2;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.AbstractC2995c1;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import c93.InterfaceC4339a;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import d53.C11721b;
import e93.AbstractC12889b;
import eu.C13610f;
import eu.C13613g0;
import eu.C13621k0;
import f53.C14122j;
import h53.C16940e;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.ThreadFactoryC20389j0;
import io.sentry.android.replay.C20253w;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC20241v;
import io.sentry.android.replay.capture.AbstractC20187c;
import io.sentry.android.replay.screenshot.C20223c;
import io.sentry.android.replay.util.C20235c;
import io.sentry.android.replay.util.ScheduledExecutorServiceC20236d;
import io.sentry.android.replay.video.C20242a;
import io.sentry.android.replay.video.C20245d;
import j93.InterfaceC21493z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25247g0;
import ne3.C26616h;
import p007a6.C0430i1;
import p027b3.C2462x0;
import p043c4.C3958f0;
import p043c4.C3969l;
import p111e8.C12812e;
import p128ew.C13715b;
import p128ew.C13717d;
import p157fv.C14802h;
import p161g.AbstractActivityC14909l;
import p161g.C14923z;
import p164g2.C15252x;
import p180h0.InterfaceC16432o1;
import p319m4.AbstractC25012a;
import p399pb.InterfaceC29049f;
import p635y2.InterfaceC39147y;
import p660yu.C39783a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import r80.AbstractC31061c;
import x03.C37812i;
import z33.C40053b;

/* JADX INFO: renamed from: av.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2088b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8255w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f8256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2088b(Object obj, int i13) {
        super(0);
        this.f8255w = i13;
        this.f8256x = obj;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, l83.h] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        String strM95641q;
        int i13 = this.f8255w;
        InterfaceC39147y interfaceC39147y = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f8256x;
        switch (i13) {
            case 0:
                HashMap map = new HashMap();
                map.put("type", new C39783a("type", ((AbstractC2091e) obj).mo6602e()));
                return map;
            case 1:
                AbstractC3006f0.m8714h(((C2462x0) obj).f9612y, null);
                return c23454a0;
            case 2:
                InterfaceC16432o1 interfaceC16432o1 = (InterfaceC16432o1) obj;
                C37812i c37812i = interfaceC16432o1 instanceof C37812i ? (C37812i) interfaceC16432o1 : null;
                if (c37812i != null) {
                    return (Integer) c37812i.f161951f.getValue();
                }
                return null;
            case 3:
                return Boolean.valueOf(((C3058t) obj).m8807L(c23454a0));
            case 4:
                return AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), (AbstractC2995c1) ((C23470p) ((C0352d) obj).f1239z).getValue()));
            case 5:
                C3958f0 c3958f0 = (C3958f0) obj;
                InterfaceC39147y parentLayoutCoordinates = c3958f0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.mo3532g()) {
                    interfaceC39147y = parentLayoutCoordinates;
                }
                return Boolean.valueOf((interfaceC39147y == null || c3958f0.m134049getPopupContentSizebOM6tXw() == null) ? false : true);
            case 6:
                return (String) ((C11721b) obj).f37874w.getValue();
            case 7:
                return new C5588s((C26616h) ((C5591v) obj).f22124f.getValue());
            case 8:
                C12812e c12812e = (C12812e) obj;
                C1491l2 c1491l2M4701x = C1496m2.m4701x();
                String str = c12812e.f43849x;
                c1491l2M4701x.m4815c();
                C1496m2.m4697p((C1496m2) c1491l2M4701x.f6114x, str);
                int i14 = c12812e.f43850y;
                c1491l2M4701x.m4815c();
                C1496m2.m4698q((C1496m2) c1491l2M4701x.f6114x, i14);
                String str2 = c12812e.f43851z;
                if (str2 != null) {
                    c1491l2M4701x.m4815c();
                    C1496m2.m4699r((C1496m2) c1491l2M4701x.f6114x, str2);
                }
                boolean z4 = c12812e.f43847E;
                c1491l2M4701x.m4815c();
                C1496m2.m4700s((C1496m2) c1491l2M4701x.f6114x, z4);
                return (C1496m2) c1491l2M4701x.m4813a();
            case 9:
                return ((C3969l) obj).invoke();
            case 10:
                return ((C13613g0) obj).invoke();
            case 11:
                return ((C13621k0) obj).invoke();
            case 12:
                Map map2 = ((C13715b) obj).f48685w;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (str3 != null) {
                        Locale locale = Locale.ROOT;
                        strM95641q = AbstractC31061c.m95641q(locale, "ROOT", str3, locale, "this as java.lang.String).toLowerCase(locale)");
                    } else {
                        strM95641q = null;
                    }
                    linkedHashMap.put(strM95641q, entry.getValue());
                }
                return linkedHashMap;
            case 13:
                C26616h c26616h = new C26616h();
                ((C13717d) obj).m38859a(new C0430i1(c26616h));
                return Integer.valueOf((int) c26616h.f105866x);
            case 14:
                return Boolean.valueOf(((C14122j) obj).f50753g.m128401c());
            case 15:
                ((AnimatorSet) obj).start();
                return c23454a0;
            case 16:
                InterfaceC21493z[] interfaceC21493zArr = C14802h.f54931W;
                ((C14802h) obj).m42549e();
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((AbstractActivityC14909l) obj).reportFullyDrawn();
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((C14923z) obj).m43018d();
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((C15252x) obj).m43357Y0();
                return c23454a0;
            case 20:
                return Boolean.valueOf(((C40053b) ((C16940e) obj).f65004g).m128401c());
            case 21:
                return "AmplitudeEngagement.sdk#handlePreviewLinkIntent(intent=" + ((Intent) obj) + ')';
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25012a.m73377j(new StringBuilder("AmplitudeEngagement.sdk#screen(screenName="), (String) obj, ')');
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((ViewTreeObserverOnDrawListenerC20241v) obj).f76031z.set(true);
                return c23454a0;
            case 24:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC20389j0(2));
                AbstractC22676k.m65747g(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                return new ScheduledExecutorServiceC20236d(scheduledExecutorServiceNewSingleThreadScheduledExecutor, ((AbstractC20187c) obj).f75831a);
            case 25:
                Matrix matrix = new Matrix();
                C20253w c20253w = ((C20223c) obj).f75949d;
                matrix.preScale(c20253w.f76071c, c20253w.f76072d);
                return matrix;
            case 26:
                return new Canvas((Bitmap) ((C20235c) obj).f76019w.getValue());
            case 27:
                C20245d c20245d = (C20245d) obj;
                C20242a c20242a = (C20242a) c20245d.f76046b;
                C20513q6 c20513q6 = (C20513q6) c20245d.f76045a;
                String str4 = c20242a.f76037f;
                int iIntValue = c20242a.f76036e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) c20245d.f76049e).getCodecInfo().getCapabilitiesForType(str4).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iIntValue))) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        AbstractC22676k.m65749i(objClamp, "clamp(...)");
                        iIntValue = ((Number) objClamp).intValue();
                    }
                    break;
                } catch (Throwable th3) {
                    c20513q6.getLogger().mo16060j(EnumC20436n5.DEBUG, "Could not retrieve MediaCodec info", th3);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str4, c20242a.f76033b, c20242a.f76034c);
                AbstractC22676k.m65749i(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", c20242a.f76035d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case 28:
                InterfaceC29049f interfaceC29049f = (InterfaceC29049f) obj;
                InterfaceC1583f2 storeOwner = (InterfaceC1583f2) interfaceC29049f;
                AbstractC22676k.m65750j(storeOwner, "storeOwner");
                C1579e2 viewModelStore = storeOwner.getViewModelStore();
                AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
                return new C21647a(viewModelStore, interfaceC29049f);
            default:
                ((C13610f) obj).mo38428a(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                return c23454a0;
        }
    }
}
