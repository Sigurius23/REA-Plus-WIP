package gm;

import a00.C0072g;
import a33.C0351c;
import ad3.AbstractC0757c;
import android.app.Notification;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.Surface;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.room.AbstractC1772c1;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4339a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.crypto.tink.internal.AbstractC5079a0;
import com.google.crypto.tink.internal.C5099k0;
import com.google.firebase.encoders.EncodingException;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import dm.EnumC12174d;
import e93.AbstractC12889b;
import g73.C15556d;
import gs.C16139j;
import gs.C16143l;
import gs.C16145n;
import gs.C16146o;
import gs.C16148q;
import gs.C16149r;
import gs.C16151t;
import gw.C16250a;
import gw.C16255f;
import gw.C16258i;
import gw.C16260k;
import gw.C16261l;
import gw.C16267r;
import h00.C16528v;
import h33.AbstractC16832b;
import h33.C16831a;
import hc3.C17171d;
import hn.C17493a;
import hn.InterfaceC17503k;
import i93.C18284j;
import im.InterfaceC18653b;
import io.getstream.video.android.core.notifications.internal.service.CallService;
import io.getstream.video.android.model.StreamCallId;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.hints.AbstractC20356c;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Adler32;
import javax.crypto.SecretKey;
import k83.InterfaceC22297a;
import kg.AbstractC22452f;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import l83.C23467m;
import l83.C23468n;
import ls.C24704a;
import ls.C24706c;
import ls.C24707d;
import lt.InterfaceC24720c;
import m63.C25126d;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25258m;
import m83.C25271y;
import mm.C25677a;
import mm.C25678b;
import mm.EnumC25679c;
import mo.C25727h;
import n30.C26212c;
import n33.C26232f;
import n33.C26238l;
import n33.C26244r;
import n53.C26311b2;
import ng3.C26701n;
import ng3.C26702o;
import nq0.C27050m;
import nz.C27300a;
import nz.C27301b;
import o30.C27507e;
import o30.C27508f;
import oa3.C27775r;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27773p;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import p000.AbstractC11266d;
import p002a0.C0005a0;
import p010a9.C0578c;
import p012ab.C0684i0;
import p048ce.AbstractC4482w;
import p075ct.C11105a;
import p078d1.C11457j;
import p087db.C11856j0;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p127ev.C13668i;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17246g;
import p202hw.C17691b;
import p202hw.C17694e;
import p213i7.C18194g;
import p251jg.C21648a;
import p251jg.C21649b;
import p251jg.C21658k;
import p251jg.C21659l;
import p251jg.C21660m;
import p251jg.C21661n;
import p299l9.C23526s0;
import p307lm.InterfaceC24505b;
import p309lo.AbstractC24567y;
import p314m.C24849k0;
import p344nm.C26827i;
import p344nm.InterfaceC26822d;
import p350nw.C27180a;
import p350nw.C27181b;
import p368og.EnumC27905b;
import p368og.InterfaceC27908e;
import p368og.InterfaceC27910g;
import p381ot.C28320f;
import p430qm.AbstractC30477a;
import p442qy.C30765d;
import p442qy.C30767f;
import p479s4.AbstractC32122c;
import p499t9.C33638k;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33649r;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p550vd.AbstractC35903f;
import p598wy.C37688a;
import p619xl.C38445a;
import p628xw.AbstractC38674d;
import p628xw.C38672b;
import p662yw.C39813a;
import p664yy.AbstractC39872m0;
import p664yy.AbstractC39877q;
import p664yy.C39858f0;
import p664yy.C39859g;
import p664yy.C39874n0;
import p673z7.C40137a;
import p674z8.InterfaceC40170f;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;
import stream.video.sfu.models.Codec;
import stream.video.sfu.models.PeerType;
import stream.video.sfu.models.PerformanceStats;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.VideoDimension;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import va3.AbstractC35849g;
import va3.C35845c;
import w93.C36968a;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: gm.r */
/* JADX INFO: loaded from: classes6.dex */
public class C15990r implements InterfaceC18653b, RTCStatsCollectorCallback, InterfaceC17503k, InterfaceC17242c, InterfaceC17246g, InterfaceC27773p, InterfaceC27910g {

    /* JADX INFO: renamed from: E */
    public static C15990r f60510E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60511w;

    /* JADX INFO: renamed from: x */
    public Object f60512x;

    /* JADX INFO: renamed from: y */
    public Object f60513y;

    /* JADX INFO: renamed from: z */
    public Object f60514z;

    public /* synthetic */ C15990r(int i13) {
        this.f60511w = i13;
        this.f60512x = null;
        this.f60513y = null;
        this.f60514z = null;
    }

    /* JADX INFO: renamed from: I */
    public static C15990r m45135I(Context context) {
        if (f60510E == null) {
            Context applicationContext = context.getApplicationContext();
            f60510E = new C15990r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f60510E;
    }

    /* JADX INFO: renamed from: J */
    public static StripeException m45136J(C39874n0 c39874n0) {
        C39858f0 c39858f0 = c39874n0.f172191f;
        String str = c39858f0 != null ? c39858f0.f172131a : null;
        int i13 = c39874n0.f172186a;
        C30767f c30767fM121114b = C37688a.m121114b(AbstractC39877q.m127952i(c39874n0));
        if (i13 != 202) {
            if (i13 == 429) {
                return new RateLimitException(c30767fM121114b, str, 12);
            }
            if (i13 != 400) {
                if (i13 == 401) {
                    return new AuthenticationException(c30767fM121114b, str);
                }
                if (i13 == 403) {
                    return new PermissionException(c30767fM121114b, str);
                }
                if (i13 != 404) {
                    return new APIException(i13, 24, str, null, null, c30767fM121114b);
                }
            }
        }
        return new InvalidRequestException(i13, 24, str, null, null, c30767fM121114b);
    }

    /* JADX INFO: renamed from: L */
    public static void m45137L(CallService callService, StreamCallId streamCallId, int i13, Notification notification) {
        C11457j c11457jMo35558c;
        AbstractC22676k.m65750j(notification, "notification");
        if (AbstractC32122c.checkSelfPermission(callService, "android.permission.POST_NOTIFICATIONS") == 0) {
            InterfaceC33408j3.f139483t.getClass();
            InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
            if (interfaceC33408j3 == null || (c11457jMo35558c = ((C33366b4) interfaceC33408j3).mo35558c()) == null) {
                return;
            }
            c11457jMo35558c.m30733C(i13, notification, streamCallId);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m45138A(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f60512x;
        C28320f c28320f = new C28320f(byteArrayOutputStream, map, (HashMap) this.f60513y, (InterfaceC24720c) this.f60514z);
        InterfaceC24720c interfaceC24720c = (InterfaceC24720c) map.get(obj.getClass());
        if (interfaceC24720c != null) {
            interfaceC24720c.mo41739a(obj, c28320f);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x00cf  */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x00cc. Please report as an issue. */
    /* JADX INFO: renamed from: B */
    public String m45139B(String str, PublicKey acsPublicKey, String directoryServerId, String str2) throws ParseException {
        Object objM107888l;
        AbstractC22676k.m65750j(acsPublicKey, "acsPublicKey");
        AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
        String str3 = "The JWE algorithm \"alg\" cannot be \"none\"";
        if (acsPublicKey instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) acsPublicKey;
            ((C26702o) this.f60512x).getClass();
            C16258i c16258i = C16258i.f61806E;
            C16255f c16255f = C16255f.f61802z;
            if (c16258i.f61776w.equals(C16250a.f61775x.f61776w)) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            Objects.requireNonNull(c16255f);
            C16261l c16261l = new C16261l(new C16260k(c16258i, c16255f, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, null, 0, null, null, null, null, null, null, null, null), new C16267r(str));
            c16261l.m46081b(new C17694e(rSAPublicKey));
            objM107888l = c16261l.m46083d();
            AbstractC22676k.m65749i(objM107888l, "serialize(...)");
        } else if (acsPublicKey instanceof ECPublicKey) {
            C11457j c11457j = (C11457j) this.f60513y;
            ECPublicKey eCPublicKey = (ECPublicKey) acsPublicKey;
            c11457j.getClass();
            int i13 = C39813a.f171575x;
            Map mapM124059i = AbstractC38674d.m124059i(-1, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = mapM124059i.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                str4.getClass();
                Iterator it3 = it;
                switch (str4) {
                    case "aud":
                        Object obj = mapM124059i.get("aud");
                        if (!(obj instanceof String)) {
                            if (obj instanceof List) {
                                linkedHashMap.put("aud", AbstractC38674d.m124057g("aud", mapM124059i));
                            } else {
                                if (obj != null) {
                                    throw new ParseException("Illegal aud claim", 0);
                                }
                                linkedHashMap.put("aud", null);
                            }
                            break;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add((String) AbstractC38674d.m124053c(mapM124059i, "aud", String.class));
                            linkedHashMap.put("aud", arrayList);
                            break;
                        }
                        break;
                    case "exp":
                        linkedHashMap.put("exp", AbstractC38674d.m124052b("exp", mapM124059i));
                        break;
                    case "iat":
                        linkedHashMap.put("iat", AbstractC38674d.m124052b("iat", mapM124059i));
                        break;
                    case "iss":
                        linkedHashMap.put("iss", (String) AbstractC38674d.m124053c(mapM124059i, "iss", String.class));
                        break;
                    case "jti":
                        linkedHashMap.put("jti", (String) AbstractC38674d.m124053c(mapM124059i, "jti", String.class));
                        break;
                    case "nbf":
                        linkedHashMap.put("nbf", AbstractC38674d.m124052b("nbf", mapM124059i));
                        break;
                    case "sub":
                        Object obj2 = mapM124059i.get("sub");
                        if (!(obj2 instanceof String)) {
                            if (obj2 instanceof Number) {
                                linkedHashMap.put("sub", String.valueOf(obj2));
                            } else {
                                if (obj2 != null) {
                                    throw new ParseException("Illegal sub claim", 0);
                                }
                                linkedHashMap.put("sub", null);
                            }
                            break;
                        } else {
                            linkedHashMap.put("sub", (String) AbstractC38674d.m124053c(mapM124059i, "sub", String.class));
                            break;
                        }
                        break;
                    default:
                        linkedHashMap.put(str4, mapM124059i.get(str4));
                        break;
                }
                it = it3;
                str3 = str3;
            }
            String str5 = str3;
            new C39813a(linkedHashMap);
            KeyPair keyPairM82921a = ((C27508f) c11457j.f36753x).m82921a();
            C27507e c27507e = (C27507e) c11457j.f36754y;
            PrivateKey privateKey = keyPairM82921a.getPrivate();
            AbstractC22676k.m65748h(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
            SecretKey secretKeyM82920a = c27507e.m82920a(eCPublicKey, (ECPrivateKey) privateKey, directoryServerId);
            C27180a c27180a = C27180a.f108790y;
            PublicKey publicKey = keyPairM82921a.getPublic();
            AbstractC22676k.m65748h(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
            ECPublicKey eCPublicKey2 = (ECPublicKey) publicKey;
            C38672b c38672bM81763e = C27181b.m81763e(eCPublicKey2.getParams().getCurve().getField().getFieldSize(), eCPublicKey2.getW().getAffineX());
            C38672b c38672bM81763e2 = C27181b.m81763e(eCPublicKey2.getParams().getCurve().getField().getFieldSize(), eCPublicKey2.getW().getAffineY());
            Objects.requireNonNull(c27180a, "The curve must not be null");
            try {
                C27181b c27181b = new C27181b(c27180a, c38672bM81763e, c38672bM81763e2, null, null, null, null, null, null, null, null, null, null, null, null);
                C16258i c16258i2 = C16258i.f61812K;
                C16255f c16255f2 = C16255f.f61802z;
                if (c16258i2.f61776w.equals(C16250a.f61775x.f61776w)) {
                    throw new IllegalArgumentException(str5);
                }
                Objects.requireNonNull(c16255f2);
                C16261l c16261l2 = new C16261l(new C16260k(c16258i2, c16255f2, null, null, null, null, null, null, null, null, null, null, C27181b.m81765h(AbstractC38674d.m124059i(-1, AbstractC38674d.m124060j(c27181b.mo81767d()))), null, null, null, null, 0, null, null, null, null, null, null, null, null), new C16267r(str));
                c16261l2.m46081b(new C17691b(secretKeyM82920a));
                objM107888l = c16261l2.m46083d();
                AbstractC22676k.m65749i(objM107888l, "serialize(...)");
            } catch (IllegalArgumentException e5) {
                throw new IllegalStateException(e5.getMessage(), e5);
            }
        } else {
            objM107888l = AbstractC34132o.m107888l(new SDKRuntimeException(AbstractC11266d.m30461o("Unsupported public key algorithm: ", acsPublicKey.getAlgorithm()), 0));
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) this.f60514z).m77828c(thM68037a);
        }
        AbstractC34132o.m107864I(objM107888l);
        return (String) objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public Object m45140C(C39859g c39859g, InterfaceC37138c interfaceC37138c, AbstractC32269c abstractC32269c) {
        C27300a c27300a;
        if (abstractC32269c instanceof C27300a) {
            c27300a = (C27300a) abstractC32269c;
            int i13 = c27300a.f109354y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c27300a.f109354y = i13 - Integer.MIN_VALUE;
            } else {
                c27300a = new C27300a(this, abstractC32269c);
            }
        } else {
            c27300a = new C27300a(this, abstractC32269c);
        }
        Object obj = c27300a.f109352w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c27300a.f109354y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C27050m c27050m = new C27050m(1, this, interfaceC37138c);
        c27300a.f109354y = 1;
        Object objM45141D = m45141D(c39859g, c27050m, c27300a);
        return objM45141D == obj2 ? obj2 : objM45141D;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: D */
    public Object m45141D(AbstractC39872m0 abstractC39872m0, C27050m c27050m, AbstractC32269c abstractC32269c) {
        C27301b c27301b;
        C15990r c15990r;
        Object objM107888l;
        Object objM107888l2;
        if (abstractC32269c instanceof C27301b) {
            c27301b = (C27301b) abstractC32269c;
            int i13 = c27301b.f109356F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c27301b.f109356F = i13 - Integer.MIN_VALUE;
            } else {
                c27301b = new C27301b(this, abstractC32269c);
            }
        } else {
            c27301b = new C27301b(this, abstractC32269c);
        }
        Object objM1727r = c27301b.f109360z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c27301b.f109356F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM1727r);
            ((C30765d) this.f60514z).m94511a("Executing " + abstractC39872m0.getMethod().f172167w + " request to " + abstractC39872m0.getUrl());
            try {
                C0684i0 c0684i0 = (C0684i0) this.f60512x;
                c27301b.f109357w = this;
                c27301b.f109358x = abstractC39872m0;
                c27301b.f109359y = c27050m;
                c27301b.f109356F = 1;
                objM1727r = c0684i0.m1727r(abstractC39872m0, c27301b);
                if (objM1727r == enumC31071a) {
                    return enumC31071a;
                }
                c15990r = this;
            } catch (Throwable th3) {
                th = th3;
                c15990r = this;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27050m = c27301b.f109359y;
            abstractC39872m0 = c27301b.f109358x;
            c15990r = c27301b.f109357w;
            try {
                AbstractC34132o.m107864I(objM1727r);
            } catch (Throwable th4) {
                th = th4;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        objM107888l = (C39874n0) objM1727r;
        if (!(objM107888l instanceof C23467m)) {
            try {
                C39874n0 c39874n0 = (C39874n0) objM107888l;
                if (c39874n0.f172190e) {
                    c15990r.getClass();
                    throw m45136J(c39874n0);
                }
                Object obj = c39874n0.f172187b;
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objM107888l2 = ((C23468n) c27050m.invoke(obj)).f92940w;
                AbstractC34132o.m107864I(objM107888l2);
                objM107888l = objM107888l2;
            } catch (Throwable th5) {
                objM107888l2 = AbstractC34132o.m107888l(th5);
            }
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a == null) {
            return objM107888l;
        }
        try {
            throw new APIConnectionException("Failed to execute " + abstractC39872m0, thM68037a);
        } catch (Throwable th6) {
            return AbstractC34132o.m107888l(th6);
        }
    }

    /* JADX INFO: renamed from: E */
    public long m45142E() {
        C33638k c33638k = (C33638k) this.f60514z;
        if (c33638k != null) {
            return c33638k.f140408z;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: F */
    public C20321e5 m45143F() {
        return (C20321e5) this.f60512x;
    }

    /* JADX INFO: renamed from: G */
    public AbstractC20356c m45144G() {
        return (AbstractC20356c) this.f60514z;
    }

    /* JADX INFO: renamed from: H */
    public C20337g0 m45145H() {
        return (C20337g0) this.f60513y;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX INFO: renamed from: K */
    public void m45146K(InterfaceC40170f interfaceC40170f, Uri uri, Map map, long j7, long j13, C23526s0 c23526s0) throws UnrecognizedInputFormatException {
        C33638k c33638k = new C33638k(interfaceC40170f, j7, j13);
        this.f60514z = c33638k;
        if (((InterfaceC33644n) this.f60513y) != null) {
            return;
        }
        InterfaceC33644n[] interfaceC33644nArrMo106258c = ((InterfaceC33649r) this.f60512x).mo106258c(uri, map);
        int length = interfaceC33644nArrMo106258c.length;
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        AbstractC41047q.m133273c(length, "expectedSize");
        C41014d0 c41014d0 = new C41014d0(length);
        boolean z4 = true;
        if (interfaceC33644nArrMo106258c.length == 1) {
            this.f60513y = interfaceC33644nArrMo106258c[0];
        } else {
            for (InterfaceC33644n interfaceC33644n : interfaceC33644nArrMo106258c) {
                try {
                    if (interfaceC33644n.mo1542h(c33638k)) {
                        this.f60513y = interfaceC33644n;
                        c33638k.f140403F = 0;
                        break;
                    }
                    c41014d0.m133224c(interfaceC33644n.mo78551j());
                    boolean z13 = ((InterfaceC33644n) this.f60513y) != null || c33638k.f140408z == j7;
                    AbstractC35849g.m113807i(z13);
                    c33638k.f140403F = 0;
                } catch (EOFException unused) {
                    if (((InterfaceC33644n) this.f60513y) != null || c33638k.f140408z == j7) {
                    }
                } catch (Throwable th3) {
                    if (((InterfaceC33644n) this.f60513y) == null && c33638k.f140408z != j7) {
                        z4 = false;
                    }
                    AbstractC35849g.m113807i(z4);
                    c33638k.f140403F = 0;
                    throw th3;
                }
                AbstractC35849g.m113807i(z13);
                c33638k.f140403F = 0;
            }
            if (((InterfaceC33644n) this.f60513y) == null) {
                StringBuilder sb4 = new StringBuilder("None of the available extractors (");
                C11856j0 c11856j0 = new C11856j0(", ", 15);
                Iterator it = AbstractC41047q.m133290t(AbstractC41023g0.m133253n(interfaceC33644nArrMo106258c), new C18194g(26)).iterator();
                StringBuilder sb5 = new StringBuilder();
                c11856j0.m31819c(sb5, it);
                sb4.append(sb5.toString());
                sb4.append(") could read the stream.");
                String string = sb4.toString();
                uri.getClass();
                C41060w0 c41060w0M133239f = c41014d0.m133239f();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(string, null, false, 1);
                AbstractC41023g0.m133252m(c41060w0M133239f);
                throw unrecognizedInputFormatException;
            }
        }
        ((InterfaceC33644n) this.f60513y).mo1541g(c23526s0);
    }

    /* JADX INFO: renamed from: M */
    public AbstractC22452f m45147M() {
        AbstractC22452f abstractC22452fM123186x = (AbstractC22452f) ((C25258m) this.f60513y).m74024q();
        if (abstractC22452fM123186x == null) {
            abstractC22452fM123186x = ((C38445a) this.f60512x).m123186x();
        }
        this.f60514z = abstractC22452fM123186x;
        return abstractC22452fM123186x;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: N */
    public Object m45148N(String str, C0351c c0351c, AbstractC32269c abstractC32269c) {
        C26311b2 c26311b2;
        InterfaceC3018i0 interfaceC3018i0M8711e;
        C15990r c15990r;
        Object objM107888l;
        ConcurrentMap concurrentMap = (ConcurrentMap) this.f60513y;
        if (abstractC32269c instanceof C26311b2) {
            c26311b2 = (C26311b2) abstractC32269c;
            int i13 = c26311b2.f104552F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26311b2.f104552F = i13 - Integer.MIN_VALUE;
            } else {
                c26311b2 = new C26311b2(this, abstractC32269c);
            }
        } else {
            c26311b2 = new C26311b2(this, abstractC32269c);
        }
        Object objAwait = c26311b2.f104556z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26311b2.f104552F;
        int i15 = 2;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objAwait);
                if (((AtomicBoolean) this.f60514z).get()) {
                    return AbstractC34132o.m107888l(new ClosedSendChannelException("SingleFlight is closed"));
                }
                InterfaceC3018i0 interfaceC3018i0 = (InterfaceC3018i0) concurrentMap.get(str);
                if (interfaceC3018i0 != null) {
                    c26311b2.f104552F = 1;
                    objAwait = interfaceC3018i0.await(c26311b2);
                    if (objAwait == enumC31071a) {
                    }
                    return ((C23468n) objAwait).f92940w;
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f60512x;
                EnumC2998d0 enumC2998d0 = EnumC2998d0.f12004w;
                interfaceC3018i0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C16528v(i15, c0351c, null), 1);
                InterfaceC3018i0 interfaceC3018i1 = (InterfaceC3018i0) concurrentMap.putIfAbsent(str, interfaceC3018i0M8711e);
                if (interfaceC3018i1 == null) {
                    interfaceC3018i0M8711e.start();
                } else {
                    interfaceC3018i0M8711e = interfaceC3018i1;
                }
                try {
                    c26311b2.f104553w = this;
                    c26311b2.f104554x = str;
                    c26311b2.f104555y = interfaceC3018i0M8711e;
                    c26311b2.f104552F = 2;
                    objAwait = interfaceC3018i0M8711e.await(c26311b2);
                    if (objAwait != enumC31071a) {
                        c15990r = this;
                        objM107888l = ((C23468n) objAwait).f92940w;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c15990r = this;
                    objM107888l = AbstractC34132o.m107888l(th);
                    return objM107888l;
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objAwait);
                return ((C23468n) objAwait).f92940w;
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC3018i0 interfaceC3018i2 = c26311b2.f104555y;
            String str2 = c26311b2.f104554x;
            c15990r = c26311b2.f104553w;
            try {
                AbstractC34132o.m107864I(objAwait);
                interfaceC3018i0M8711e = interfaceC3018i2;
                str = str2;
                try {
                    objM107888l = ((C23468n) objAwait).f92940w;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        objM107888l = AbstractC34132o.m107888l(th);
                    } finally {
                        ((ConcurrentMap) c15990r.f60513y).remove(str, interfaceC3018i0M8711e);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC3018i0M8711e = interfaceC3018i2;
                str = str2;
                objM107888l = AbstractC34132o.m107888l(th);
                return objM107888l;
            }
            return objM107888l;
        } catch (Throwable th6) {
            return AbstractC34132o.m107888l(th6);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m45149O(C15981i c15981i, int i13, boolean z4) {
        C25677a c25677a = (C25677a) this.f60514z;
        Context context = (Context) this.f60512x;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c15981i.f60488a;
        String str2 = c15981i.f60488a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC12174d enumC12174d = c15981i.f60490c;
        adler32.update(byteBufferAllocate.putInt(AbstractC30477a.m93285a(enumC12174d)).array());
        byte[] bArr = c15981i.f60489b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z4) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i14 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i14 < i13) {
                        break;
                    }
                    AbstractC12240d.m34088y(c15981i, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((C26827i) ((InterfaceC26822d) this.f60513y)).m80058b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(AbstractC30477a.m93285a(enumC12174d))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c25677a.m75616a(enumC12174d, jLongValue, i13));
            Set set = ((C25678b) c25677a.f101006b.get(enumC12174d)).f101009c;
            if (set.contains(EnumC25679c.f101010w)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC25679c.f101012y)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC25679c.f101011x)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i13);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", AbstractC30477a.m93285a(enumC12174d));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c15981i, Integer.valueOf(value), Long.valueOf(c25677a.m75616a(enumC12174d, jLongValue, i13)), lValueOf, Integer.valueOf(i13)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th3) {
            cursorRawQuery.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m45150P(Integer num) {
        switch (this.f60511w) {
            case 1:
                this.f60514z = num;
                break;
            case 2:
                this.f60514z = num;
                break;
            case 3:
                this.f60514z = num;
                break;
            default:
                this.f60514z = num;
                break;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m45151Q(C31624i c31624i) {
        switch (this.f60511w) {
            case 1:
                this.f60513y = c31624i;
                break;
            case 2:
                this.f60513y = c31624i;
                break;
            case 3:
                this.f60513y = c31624i;
                break;
            default:
                this.f60513y = c31624i;
                break;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m45152R(C16145n c16145n) {
        this.f60512x = c16145n;
    }

    /* JADX INFO: renamed from: S */
    public void m45153S(C16148q c16148q) {
        this.f60512x = c16148q;
    }

    /* JADX INFO: renamed from: T */
    public void m45154T(C16151t c16151t) {
        this.f60512x = c16151t;
    }

    /* JADX INFO: renamed from: U */
    public void m45155U(C24707d c24707d) {
        this.f60512x = c24707d;
    }

    /* JADX INFO: renamed from: V */
    public void m45156V() {
        ArrayList arrayList = (ArrayList) this.f60513y;
        if (arrayList.isEmpty()) {
            return;
        }
        ((HashMap) ((C38445a) this.f60514z).f164637y).put((C27775r) this.f60512x, arrayList);
    }

    /* JADX INFO: renamed from: W */
    public void m45157W(Object obj, String str) {
        C15990r c15990r = new C15990r(19, false);
        ((C15990r) this.f60514z).f60514z = c15990r;
        this.f60514z = c15990r;
        c15990r.f60513y = obj;
        c15990r.f60512x = str;
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: a */
    public void mo45158a(int i13, int i14, long j7, int i15) {
        ((MediaCodec) this.f60512x).queueInputBuffer(i13, 0, i14, j7, i15);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: b */
    public void mo45159b(int i13) {
        ((MediaCodec) this.f60512x).setVideoScalingMode(i13);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: c */
    public void mo45160c(Surface surface) {
        ((MediaCodec) this.f60512x).setOutputSurface(surface);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: d */
    public void mo45161d(int i13, long j7) {
        ((MediaCodec) this.f60512x).releaseOutputBuffer(i13, j7);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: e */
    public int mo45162e() {
        return ((MediaCodec) this.f60512x).dequeueInputBuffer(0L);
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: f */
    public int mo45163f(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        MediaCodec mediaCodec = (MediaCodec) this.f60512x;
        do {
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && AbstractC24567y.f95875a < 21) {
                this.f60514z = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // hn.InterfaceC17503k
    public void flush() {
        ((MediaCodec) this.f60512x).flush();
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: g */
    public InterfaceC27908e mo44899g(EnumC27905b enumC27905b) {
        return ((InterfaceC27910g) this.f60513y).mo44899g(enumC27905b);
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        switch (this.f60511w) {
            case 0:
                return new C15989q(new C26701n(14), new C26702o(13, false), (InterfaceC24505b) ((C2570m) this.f60512x).get(), (C13668i) ((C25126d) this.f60513y).get(), (C0072g) ((C0072g) this.f60514z).get());
            default:
                return new C15990r((Context) ((InterfaceC22297a) this.f60512x).get(), (InterfaceC26822d) ((InterfaceC22297a) this.f60513y).get(), (C25677a) ((C15556d) this.f60514z).get(), 18);
        }
    }

    @Override // hn.InterfaceC17503k
    public ByteBuffer getInputBuffer(int i13) {
        return AbstractC24567y.f95875a >= 21 ? ((MediaCodec) this.f60512x).getInputBuffer(i13) : ((ByteBuffer[]) this.f60513y)[i13];
    }

    @Override // hn.InterfaceC17503k
    public ByteBuffer getOutputBuffer(int i13) {
        return AbstractC24567y.f95875a >= 21 ? ((MediaCodec) this.f60512x).getOutputBuffer(i13) : ((ByteBuffer[]) this.f60514z)[i13];
    }

    @Override // hn.InterfaceC17503k
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.f60512x).getOutputFormat();
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: h */
    public int mo45164h() {
        return ((C21649b) this.f60512x).mo45164h();
    }

    @Override // oa3.InterfaceC27773p
    /* JADX INFO: renamed from: i */
    public InterfaceC27771n mo45165i(C35845c c35845c, C36968a c36968a) {
        return ((C5099k0) ((C38445a) this.f60514z).f164636x).m15989G(c35845c, c36968a, (ArrayList) this.f60513y);
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: j */
    public boolean mo389j(EnumC27905b enumC27905b) {
        return ((InterfaceC27910g) this.f60513y).mo389j(enumC27905b);
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: n */
    public void mo390n(Throwable th3, InterfaceC4339a interfaceC4339a) {
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f60512x;
        String str = (String) this.f60514z;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        AbstractC35903f.m113983A(interfaceC30063j, EnumC27905b.f112505x, str, th3, interfaceC4339a);
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: o */
    public String mo45166o() {
        return ((C21649b) this.f60512x).mo45166o();
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02ed  */
    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        List listM118958J;
        TrackType trackType;
        String str;
        Long l7;
        Double d3;
        Map<String, Object> members;
        Object next;
        Long l12;
        Double d14;
        Map map = (Map) this.f60513y;
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        C2570m c2570m = (C2570m) this.f60512x;
        C25258m c25258m = (C25258m) c2570m.f9984E;
        C25258m c25258m2 = (C25258m) c2570m.f9985F;
        if (AbstractC16832b.f64692a[((PeerType) c2570m.f9988y).ordinal()] == 1) {
            AbstractC22676k.m65747g(statsMap);
            Collection<RTCStats> collectionValues = statsMap.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (AbstractC22676k.m65745e(((RTCStats) obj).getType(), "inbound-rtp")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC12313p.m34271W((RTCStats) it.next()));
            }
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    C26232f c26232f = (C26232f) next;
                    Long l13 = c26232f.f104105M;
                    long jLongValue = l13 != null ? l13.longValue() : 0L;
                    Long l14 = c26232f.f104106N;
                    long jLongValue2 = jLongValue * (l14 != null ? l14.longValue() : 0L);
                    do {
                        Object next2 = it3.next();
                        C26232f c26232f2 = (C26232f) next2;
                        Long l15 = c26232f2.f104105M;
                        long jLongValue3 = l15 != null ? l15.longValue() : 0L;
                        Long l16 = c26232f2.f104106N;
                        long jLongValue4 = jLongValue3 * (l16 != null ? l16.longValue() : 0L);
                        if (jLongValue2 < jLongValue4) {
                            next = next2;
                            jLongValue2 = jLongValue4;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            C26232f c26232f3 = (C26232f) next;
            if (c26232f3 == null) {
                listM118958J = C25271y.f99162w;
            } else {
                RTCStats rTCStats = (RTCStats) ((Map) c2570m.f9989z).get(c26232f3.f104119a);
                C26232f c26232fM34271W = rTCStats != null ? AbstractC12313p.m34271W(rTCStats) : null;
                Double d15 = c26232f3.f104109Q;
                double dDoubleValue = (d15 != null ? d15.doubleValue() : 0.0d) - ((c26232fM34271W == null || (d14 = c26232fM34271W.f104109Q) == null) ? 0.0d : d14.doubleValue());
                Long l17 = c26232f3.f104101I;
                double dLongValue = (l17 != null ? l17.longValue() : 0L) - ((c26232fM34271W == null || (l12 = c26232fM34271W.f104101I) == null) ? 0L : l12.longValue());
                c25258m.addLast(Double.valueOf(dLongValue > 0.0d ? (dDoubleValue / dLongValue) * ((double) 1000) : 0.0d));
                Double d16 = c26232f3.f104107O;
                c25258m2.addLast(Double.valueOf(d16 != null ? d16.doubleValue() : 0.0d));
                TrackType trackType2 = (TrackType) map.get(c26232f3.f104131k);
                if (trackType2 == null) {
                    trackType2 = TrackType.TRACK_TYPE_VIDEO;
                }
                TrackType trackType3 = trackType2;
                Codec codecM111179j = AbstractC35148d.m111179j(c26232f3.f104127g, statsMap);
                Double dM111178i = AbstractC35148d.m111178i(c25258m);
                float fDoubleValue = dM111178i != null ? (float) dM111178i.doubleValue() : 0.0f;
                Double dM111178i2 = AbstractC35148d.m111178i(c25258m2);
                float fDoubleValue2 = dM111178i2 != null ? (float) dM111178i2.doubleValue() : 0.0f;
                Long l18 = c26232f3.f104105M;
                int iLongValue = l18 != null ? (int) l18.longValue() : 0;
                Long l19 = c26232f3.f104106N;
                listM118958J = AbstractC37056f.m118958J(new PerformanceStats(trackType3, codecM111179j, fDoubleValue, fDoubleValue2, new VideoDimension(iLongValue, l19 != null ? (int) l19.longValue() : 0, null, 4, null), 0, null, 96, null));
            }
        } else {
            AbstractC22676k.m65747g(statsMap);
            ArrayList arrayList3 = new ArrayList();
            Collection<RTCStats> collectionValues2 = statsMap.values();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : collectionValues2) {
                if (AbstractC22676k.m65745e(((RTCStats) obj2).getType(), "outbound-rtp")) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(AbstractC12313p.m34274Z((RTCStats) it4.next()));
            }
            ArrayList<C26238l> arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                C26238l c26238l = (C26238l) obj3;
                if (AbstractC22676k.m65745e(c26238l.f104266e, "video") && ((Map) c2570m.f9989z).containsKey(c26238l.f104262a)) {
                    arrayList6.add(obj3);
                }
            }
            for (C26238l c26238l2 : arrayList6) {
                RTCStats rTCStats2 = (RTCStats) ((Map) c2570m.f9989z).get(c26238l2.f104262a);
                C26238l c26238lM34274Z = rTCStats2 != null ? AbstractC12313p.m34274Z(rTCStats2) : null;
                Double d17 = c26238l2.f104280s;
                double dDoubleValue2 = (d17 != null ? d17.doubleValue() : 0.0d) - ((c26238lM34274Z == null || (d3 = c26238lM34274Z.f104280s) == null) ? 0.0d : d3.doubleValue());
                Long l24 = c26238l2.f104287z;
                double dLongValue2 = (l24 != null ? l24.longValue() : 0L) - ((c26238lM34274Z == null || (l7 = c26238lM34274Z.f104287z) == null) ? 0L : l7.longValue());
                c25258m.addLast(Double.valueOf(dLongValue2 > 0.0d ? (dDoubleValue2 / dLongValue2) * ((double) 1000) : 0.0d));
                Double d18 = c26238l2.f104286y;
                c25258m2.addLast(Double.valueOf(d18 != null ? d18.doubleValue() : 0.0d));
                String str2 = c26238l2.f104272k;
                if (str2 == null) {
                    trackType = TrackType.TRACK_TYPE_VIDEO;
                } else {
                    RTCStats rTCStats3 = statsMap.get(str2);
                    C26244r c26244rM34286f0 = rTCStats3 != null ? AbstractC12313p.m34286f0(rTCStats3) : null;
                    if (c26244rM34286f0 == null || (str = c26244rM34286f0.f104354e) == null || (trackType = (TrackType) map.get(str)) == null) {
                        trackType = TrackType.TRACK_TYPE_VIDEO;
                    }
                }
                TrackType trackType4 = trackType;
                Codec codecM111179j2 = AbstractC35148d.m111179j(c26238l2.f104268g, statsMap);
                Double dM111178i3 = AbstractC35148d.m111178i(c25258m);
                float fDoubleValue3 = dM111178i3 != null ? (float) dM111178i3.doubleValue() : 0.0f;
                Double dM111178i4 = AbstractC35148d.m111178i(c25258m2);
                float fDoubleValue4 = dM111178i4 != null ? (float) dM111178i4.doubleValue() : 0.0f;
                Double d19 = c26238l2.f104278q;
                int iM36257W = d19 != null ? AbstractC12889b.m36257W(d19.doubleValue()) : 0;
                Long l25 = c26238l2.f104284w;
                int iLongValue2 = l25 != null ? (int) l25.longValue() : 0;
                Long l26 = c26238l2.f104285x;
                arrayList3.add(new PerformanceStats(trackType4, codecM111179j2, fDoubleValue3, fDoubleValue4, new VideoDimension(iLongValue2, l26 != null ? (int) l26.longValue() : 0, null, 4, null), iM36257W, null, 64, null));
            }
            listM118958J = arrayList3;
        }
        Map map2 = (Map) c2570m.f9989z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, RTCStats>> it5 = statsMap.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry<String, RTCStats> next3 = it5.next();
            String key = next3.getKey();
            RTCStats value = next3.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            RTCStats rTCStats4 = (RTCStats) map2.get(key);
            if (rTCStats4 == null || !AbstractC22676k.m65745e(rTCStats4.getType(), value.getType())) {
                linkedHashMap2.put("type", value.getType());
            }
            Map<String, Object> members2 = value.getMembers();
            AbstractC22676k.m65749i(members2, "getMembers(...)");
            for (Map.Entry<String, Object> entry : members2.entrySet()) {
                Map map3 = map2;
                String key2 = entry.getKey();
                Object value2 = entry.getValue();
                Iterator<Map.Entry<String, RTCStats>> it6 = it5;
                Object obj4 = (rTCStats4 == null || (members = rTCStats4.getMembers()) == null) ? null : members.get(key2);
                if (map3.isEmpty() || !AbstractC22676k.m65745e(value2, obj4)) {
                    AbstractC22676k.m65747g(key2);
                    linkedHashMap2.put(key2, value2);
                }
                it5 = it6;
                map2 = map3;
            }
            linkedHashMap2.put("timestamp", Double.valueOf(value.getTimestampUs()));
            linkedHashMap.put(key, linkedHashMap2);
            it5 = it5;
            map2 = map2;
        }
        Collection collectionValues3 = linkedHashMap.values();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = collectionValues3.iterator();
        while (it7.hasNext()) {
            Object obj5 = ((Map) it7.next()).get("timestamp");
            Number number = obj5 instanceof Number ? (Number) obj5 : null;
            Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
            if (lValueOf != null) {
                arrayList7.add(lValueOf);
            }
        }
        Long l27 = (Long) AbstractC25265s.m74115S0(arrayList7);
        long jLongValue5 = l27 != null ? l27.longValue() : Long.MIN_VALUE;
        for (Map map4 : linkedHashMap.values()) {
            Object obj6 = map4.get("timestamp");
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            if (number2 != null && number2.longValue() == jLongValue5) {
                map4.put("timestamp", 0L);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.putAll(linkedHashMap);
        linkedHashMap3.put("timestamp", Long.valueOf(jLongValue5 / ((long) 1000)));
        while (c25258m.f99142y > 2) {
            c25258m.removeFirst();
        }
        while (c25258m2.f99142y > 2) {
            c25258m2.removeFirst();
        }
        c2570m.f9989z = statsMap;
        ((C3033m) this.f60514z).resumeWith(new C16831a(rTCStatsReport, linkedHashMap3, listM118958J));
    }

    @Override // p194hg.InterfaceC17242c
    /* JADX INFO: renamed from: q */
    public Integer mo45167q() {
        C17249j c17249j = (C17249j) this.f60514z;
        C40137a c40137a = (C40137a) this.f60513y;
        AbstractC5583n abstractC5583nM128691k = c40137a.m128691k();
        boolean zEquals = abstractC5583nM128691k.equals(C21659l.f83173c);
        C21661n c21661n = C21661n.f83175c;
        Integer numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        Object obj = null;
        if (zEquals) {
            AbstractC5583n abstractC5583nM128689i = c40137a.m128689i();
            if (abstractC5583nM128689i.getClass() != C21659l.class) {
                StringBuilder sb4 = new StringBuilder("expected ");
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                sb4.append(c22673i0.getOrCreateKotlinClass(C21659l.class));
                sb4.append("; found ");
                sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
                throw new DeserializationException(sb4.toString());
            }
        } else if (!abstractC5583nM128691k.equals(C21658k.f83172c)) {
            if (abstractC5583nM128691k.equals(c21661n)) {
                AbstractC5583n abstractC5583nM128689i2 = c40137a.m128689i();
                if (abstractC5583nM128689i2.getClass() != C21661n.class) {
                    StringBuilder sb5 = new StringBuilder("expected ");
                    C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                    sb5.append(c22673i1.getOrCreateKotlinClass(C21661n.class));
                    sb5.append("; found ");
                    sb5.append(c22673i1.getOrCreateKotlinClass(abstractC5583nM128689i2.getClass()));
                    throw new DeserializationException(sb5.toString());
                }
            } else {
                AbstractC5583n abstractC5583nM128689i3 = c40137a.m128689i();
                if (abstractC5583nM128689i3.getClass() != C21660m.class) {
                    StringBuilder sb6 = new StringBuilder("expected ");
                    C22673i0 c22673i2 = AbstractC22671h0.f89337a;
                    sb6.append(c22673i2.getOrCreateKotlinClass(C21660m.class));
                    sb6.append("; found ");
                    sb6.append(c22673i2.getOrCreateKotlinClass(abstractC5583nM128689i3.getClass()));
                    throw new DeserializationException(sb6.toString());
                }
                String str = ((C21660m) abstractC5583nM128689i3).f83174c;
                for (Object obj2 : c17249j.f66269d) {
                    if (AbstractC22676k.m65745e(AbstractC4482w.m13980P((C17248i) obj2), str)) {
                        obj = obj2;
                        break;
                    }
                }
                C17248i c17248i = (C17248i) obj;
                if (c17249j.f66268c.contains(new C21648a(str))) {
                    c40137a.m128699s();
                    return mo45167q();
                }
                numValueOf = Integer.valueOf(c17248i != null ? c17248i.f66267b : -1);
            }
        }
        if (numValueOf == null || !c40137a.m128691k().equals(c21661n)) {
            return numValueOf;
        }
        AbstractC5583n abstractC5583nM128689i4 = c40137a.m128689i();
        if (abstractC5583nM128689i4.getClass() == C21661n.class) {
            return mo45167q();
        }
        StringBuilder sb7 = new StringBuilder("expected ");
        C22673i0 c22673i3 = AbstractC22671h0.f89337a;
        sb7.append(c22673i3.getOrCreateKotlinClass(C21661n.class));
        sb7.append("; found ");
        sb7.append(c22673i3.getOrCreateKotlinClass(abstractC5583nM128689i4.getClass()));
        throw new DeserializationException(sb7.toString());
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: r */
    public void mo45168r(int i13, C0578c c0578c, long j7) {
        ((MediaCodec) this.f60512x).queueSecureInputBuffer(i13, 0, c0578c.f2061i, j7, 0);
    }

    @Override // hn.InterfaceC17503k
    public void release() {
        this.f60513y = null;
        this.f60514z = null;
        ((MediaCodec) this.f60512x).release();
    }

    @Override // hn.InterfaceC17503k
    public void releaseOutputBuffer(int i13, boolean z4) {
        ((MediaCodec) this.f60512x).releaseOutputBuffer(i13, z4);
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: s */
    public void mo394s(Throwable th3, InterfaceC4339a interfaceC4339a) {
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f60512x;
        String str = (String) this.f60514z;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        AbstractC35903f.m113983A(interfaceC30063j, EnumC27905b.f112502E, str, th3, interfaceC4339a);
    }

    @Override // hn.InterfaceC17503k
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f60512x).setParameters(bundle);
    }

    @Override // p194hg.InterfaceC17242c
    public void skipValue() {
        ((C40137a) this.f60513y).m128699s();
    }

    @Override // hn.InterfaceC17503k
    /* JADX INFO: renamed from: t */
    public void mo45169t(C25727h c25727h, Handler handler) {
        ((MediaCodec) this.f60512x).setOnFrameRenderedListener(new C17493a(this, c25727h, 1), handler);
    }

    public String toString() {
        switch (this.f60511w) {
            case 20:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f60512x);
                sb4.append('{');
                C15990r c15990r = (C15990r) ((C15990r) this.f60513y).f60514z;
                String str = "";
                while (c15990r != null) {
                    Object obj = c15990r.f60513y;
                    sb4.append(str);
                    String str2 = (String) c15990r.f60512x;
                    if (str2 != null) {
                        sb4.append(str2);
                        sb4.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb4.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb4.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c15990r = (C15990r) c15990r.f60514z;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    @Override // p368og.InterfaceC27910g
    /* JADX INFO: renamed from: u */
    public void mo396u(Throwable th3, InterfaceC4339a interfaceC4339a) {
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f60512x;
        String str = (String) this.f60514z;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        AbstractC35903f.m113983A(interfaceC30063j, EnumC27905b.f112507z, str, th3, interfaceC4339a);
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: v */
    public long mo45170v() {
        return ((C21649b) this.f60512x).mo45170v();
    }

    /* JADX INFO: renamed from: w */
    public C16143l m45171w() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15952b;
        C16145n c16145n = (C16145n) this.f60512x;
        if (c16145n == null || (c31624i = (C31624i) this.f60513y) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c16145n.f61339a != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c16145n.mo42237a() && ((Integer) this.f60514z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C16145n) this.f60512x).mo42237a() && ((Integer) this.f60514z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C16139j c16139j = ((C16145n) this.f60512x).f61342d;
        if (c16139j == C16139j.f61306m) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else if (c16139j == C16139j.f61305l) {
            c11105aM15952b = AbstractC5079a0.m15951a(((Integer) this.f60514z).intValue());
        } else {
            if (c16139j != C16139j.f61304k) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((C16145n) this.f60512x).f61342d);
            }
            c11105aM15952b = AbstractC5079a0.m15952b(((Integer) this.f60514z).intValue());
        }
        return new C16143l((C16145n) this.f60512x, (C31624i) this.f60513y, c11105aM15952b, (Integer) this.f60514z);
    }

    /* JADX INFO: renamed from: x */
    public C16146o m45172x() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15952b;
        C16148q c16148q = (C16148q) this.f60512x;
        if (c16148q == null || (c31624i = (C31624i) this.f60513y) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c16148q.f61352a != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c16148q.mo42237a() && ((Integer) this.f60514z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C16148q) this.f60512x).mo42237a() && ((Integer) this.f60514z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C16139j c16139j = ((C16148q) this.f60512x).f61355d;
        if (c16139j == C16139j.f61309p) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else if (c16139j == C16139j.f61308o) {
            c11105aM15952b = AbstractC5079a0.m15951a(((Integer) this.f60514z).intValue());
        } else {
            if (c16139j != C16139j.f61307n) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((C16148q) this.f60512x).f61355d);
            }
            c11105aM15952b = AbstractC5079a0.m15952b(((Integer) this.f60514z).intValue());
        }
        return new C16146o((C16148q) this.f60512x, (C31624i) this.f60513y, c11105aM15952b, (Integer) this.f60514z);
    }

    /* JADX INFO: renamed from: y */
    public C16149r m45173y() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15952b;
        C16151t c16151t = (C16151t) this.f60512x;
        if (c16151t == null || (c31624i = (C31624i) this.f60513y) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c16151t.f61364a != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c16151t.mo42237a() && ((Integer) this.f60514z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C16151t) this.f60512x).mo42237a() && ((Integer) this.f60514z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C16139j c16139j = ((C16151t) this.f60512x).f61365b;
        if (c16139j == C16139j.f61312s) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else if (c16139j == C16139j.f61311r) {
            c11105aM15952b = AbstractC5079a0.m15951a(((Integer) this.f60514z).intValue());
        } else {
            if (c16139j != C16139j.f61310q) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((C16151t) this.f60512x).f61365b);
            }
            c11105aM15952b = AbstractC5079a0.m15952b(((Integer) this.f60514z).intValue());
        }
        return new C16149r((C16151t) this.f60512x, (C31624i) this.f60513y, c11105aM15952b, (Integer) this.f60514z);
    }

    /* JADX INFO: renamed from: z */
    public C24704a m45174z() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15952b;
        C24707d c24707d = (C24707d) this.f60512x;
        if (c24707d == null || (c31624i = (C31624i) this.f60513y) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (c24707d.f96635a != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c24707d.mo42237a() && ((Integer) this.f60514z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C24707d) this.f60512x).mo42237a() && ((Integer) this.f60514z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C24706c c24706c = ((C24707d) this.f60512x).f96636b;
        if (c24706c == C24706c.f96633d) {
            c11105aM15952b = AbstractC5079a0.f21389a;
        } else if (c24706c == C24706c.f96632c) {
            c11105aM15952b = AbstractC5079a0.m15951a(((Integer) this.f60514z).intValue());
        } else {
            if (c24706c != C24706c.f96631b) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((C24707d) this.f60512x).f96636b);
            }
            c11105aM15952b = AbstractC5079a0.m15952b(((Integer) this.f60514z).intValue());
        }
        return new C24704a((C24707d) this.f60512x, (C31624i) this.f60513y, c11105aM15952b, (Integer) this.f60514z);
    }

    public /* synthetic */ C15990r(int i13, boolean z4) {
        this.f60511w = i13;
    }

    public /* synthetic */ C15990r(Object obj, Object obj2, Object obj3, int i13) {
        this.f60511w = i13;
        this.f60512x = obj;
        this.f60513y = obj2;
        this.f60514z = obj3;
    }

    public C15990r(String str) {
        this.f60511w = 20;
        C15990r c15990r = new C15990r(19, false);
        this.f60513y = c15990r;
        this.f60514z = c15990r;
        this.f60512x = str;
    }

    public C15990r(C38445a c38445a) {
        this.f60511w = 13;
        this.f60512x = c38445a;
        this.f60513y = new C25258m();
    }

    public C15990r(C0684i0 c0684i0, AbstractC0757c json, C30765d logger) {
        this.f60511w = 23;
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.f60512x = c0684i0;
        this.f60513y = json;
        this.f60514z = logger;
    }

    public C15990r(C27508f c27508f, C26212c c26212c) {
        this.f60511w = 24;
        C26702o c26702o = new C26702o(6, false);
        C11457j c11457j = new C11457j(c27508f, c26212c);
        this.f60512x = c26702o;
        this.f60513y = c11457j;
        this.f60514z = c26212c;
    }

    public C15990r(C33368c0 c33368c0, C33366b4 c33366b4, C17171d scope) {
        this.f60511w = 21;
        AbstractC22676k.m65750j(scope, "scope");
        this.f60512x = c33368c0;
        this.f60513y = c33366b4;
        this.f60514z = AbstractC1772c1.m5382S(this, "CallEventObserver");
    }

    public C15990r(InterfaceC2994c0 scope) {
        this.f60511w = 22;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        AbstractC22676k.m65750j(scope, "scope");
        this.f60512x = scope;
        this.f60513y = concurrentHashMap;
        this.f60514z = new AtomicBoolean(false);
    }

    public C15990r(C38445a c38445a, C17171d c17171d) {
        this.f60511w = 11;
        this.f60512x = c38445a;
        this.f60513y = c17171d;
        this.f60514z = AbstractC1772c1.m5382S(this, "CallServiceNotificationManager");
    }

    public C15990r(InterfaceC33649r interfaceC33649r) {
        this.f60511w = 12;
        this.f60512x = interfaceC33649r;
    }

    public C15990r(Context context, LocationManager locationManager) {
        this.f60511w = 16;
        this.f60514z = new C24849k0();
        this.f60512x = context;
        this.f60513y = locationManager;
    }

    public C15990r(C18284j argumentRange, List[] listArr, Method method) {
        this.f60511w = 17;
        AbstractC22676k.m65750j(argumentRange, "argumentRange");
        this.f60512x = argumentRange;
        this.f60513y = listArr;
        this.f60514z = method;
    }

    public C15990r(MediaCodec mediaCodec) {
        this.f60511w = 6;
        this.f60512x = mediaCodec;
        if (AbstractC24567y.f95875a < 21) {
            this.f60513y = mediaCodec.getInputBuffers();
            this.f60514z = mediaCodec.getOutputBuffers();
        }
    }

    public C15990r(C38445a c38445a, C27775r c27775r) {
        this.f60511w = 25;
        this.f60514z = c38445a;
        this.f60512x = c27775r;
        this.f60513y = new ArrayList();
    }

    public C15990r(C40137a reader, C17249j descriptor, C21649b c21649b) {
        this.f60511w = 9;
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f60512x = c21649b;
        this.f60513y = reader;
        this.f60514z = descriptor;
    }

    public C15990r(InterfaceC30063j context, InterfaceC27910g delegate, String str) {
        this.f60511w = 28;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f60512x = context;
        this.f60513y = delegate;
        this.f60514z = str;
    }

    public C15990r() {
        this.f60511w = 10;
        this.f60512x = new C0005a0(8);
    }
}
