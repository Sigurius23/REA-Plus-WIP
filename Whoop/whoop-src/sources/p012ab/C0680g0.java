package p012ab;

import a33.C0352d;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import androidx.media3.common.PlaybackException;
import aq0.C1906q;
import bc3.AbstractC3006f0;
import bh3.InterfaceC3260g;
import com.google.firebase.encoders.EncodingException;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.OfflineSwitchObserver;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.profile.view.edit.form.C9779c;
import com.whoop.settings.myaccount.MyAccountFragment;
import com.whoop.training.activitydetection.ActivityDetectionFragment;
import cq0.C11059g;
import fm.C14579i;
import fm.C14583m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k83.InterfaceC22297a;
import la.C23548b;
import p000.C12473e;
import p023ay.C2123a;
import p023ay.C2126b0;
import p031b9.C2832g;
import p031b9.SurfaceHolderCallbackC2821c0;
import p047c9.C4310a;
import p047c9.C4321l;
import p047c9.InterfaceC4311b;
import p073cq.InterfaceC11036e;
import p094dn.C12190j;
import p094dn.C12197q;
import p095dp.AbstractC12240d;
import p122em.C13322b;
import p122em.C13323c;
import p127ev.C13670k;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p299l9.C23527t;
import p299l9.C23537y;
import p348nt.C27111d;
import p348nt.C27112e;
import p499t9.AbstractC33618a;
import p499t9.InterfaceC33639k0;
import p516u8.C34581a0;
import p516u8.C34585c0;
import p516u8.C34586d;
import p516u8.C34619t0;
import p516u8.InterfaceC34595h0;
import p576w8.C36933c;
import p607x8.C38059n;
import p607x8.InterfaceC38051f;
import p641y8.InterfaceC39323r;
import p658yr.InterfaceC39718e;
import p664yy.C39864i0;
import p664yy.EnumC39882v;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ab.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0680g0 implements InterfaceC39323r, InterfaceC16915u, InterfaceC22297a, InterfaceC38051f, InterfaceC11036e, OfflineSwitchObserver, CameraChangedCoalescedCallback, MapLoadingErrorDelegate, RenderFrameFinishedCallback, InterfaceC3260g, Expected.Transformer, InterfaceC39718e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2412w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f2413x;

    public /* synthetic */ C0680g0(C4310a c4310a, Object obj, int i13) {
        this.f2412w = i13;
        this.f2413x = obj;
    }

    @Override // p641y8.InterfaceC39323r
    /* JADX INFO: renamed from: a */
    public void mo1677a(long j7, C38059n c38059n) {
        AbstractC33618a.m106212d(j7, c38059n, (InterfaceC33639k0[]) ((C0352d) this.f2413x).f1238y);
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        C12197q c12197q = (C12197q) obj;
        ((C12190j) this.f2413x).getClass();
        return c12197q;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        switch (this.f2412w) {
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C11059g.m29768i0((C9779c) this.f2413x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C11059g.m29751W((C6494e) this.f2413x, obj);
            default:
                return C11059g.m29763f0((C6494e) this.f2413x, obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public C13322b m1679c(C0352d c0352d) {
        C13323c c13323c = (C13323c) this.f2413x;
        URL url = (URL) c0352d.f1237x;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c13323c.f46167g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c0352d.f1239z;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C23548b c23548b = c13323c.f46161a;
                    C14579i c14579i = (C14579i) c0352d.f1238y;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C27111d c27111d = (C27111d) c23548b.f93280x;
                    C27112e c27112e = new C27112e(bufferedWriter, c27111d.f108357a, c27111d.f108358b, c27111d.f108359c, c27111d.f108360d);
                    c27112e.m81482f(c14579i);
                    c27112e.m81484h();
                    c27112e.f108362b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    AbstractC12240d.m34088y(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    AbstractC12240d.m34088y(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C13322b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C13322b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C13322b c13322b = new C13322b(responseCode, null, C14583m.m41740a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f53658a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c13322b;
                        } catch (Throwable th3) {
                            if (gZIPInputStream == null) {
                                throw th3;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        if (inputStream == null) {
                            throw th5;
                        }
                        try {
                            inputStream.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        gZIPOutputStream.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            } catch (Throwable th9) {
                if (outputStream == null) {
                    throw th9;
                }
                try {
                    outputStream.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        } catch (EncodingException e5) {
            e = e5;
            AbstractC12240d.m34035A("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C13322b(400, null, 0L);
        } catch (ConnectException e13) {
            e = e13;
            AbstractC12240d.m34035A("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C13322b(500, null, 0L);
        } catch (UnknownHostException e14) {
            e = e14;
            AbstractC12240d.m34035A("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C13322b(500, null, 0L);
        } catch (IOException e15) {
            e = e15;
            AbstractC12240d.m34035A("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C13322b(400, null, 0L);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m1680d(C2123a c2123a) {
        C2126b0 c2126b0 = (C2126b0) ((IntentConfirmationChallengeActivity) this.f2413x).f22143x.getValue();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c2126b0), null, null, new C12473e(c2126b0, c2123a, (InterfaceC30057d) null, 12), 3);
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        EnumC39882v enumC39882v;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((C39864i0) this.f2413x).f172152a).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    enumC39882v = EnumC39882v.Mobile2G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    enumC39882v = EnumC39882v.Mobile3G;
                    break;
                case 13:
                case C1533u.AVG_FIELD_NUMBER /* 18 */:
                case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    enumC39882v = EnumC39882v.Mobile4G;
                    break;
                case 20:
                    enumC39882v = EnumC39882v.Mobile5G;
                    break;
                default:
                    enumC39882v = EnumC39882v.Unknown;
                    break;
            }
        } else {
            enumC39882v = type != 1 ? EnumC39882v.Unknown : EnumC39882v.WiFi;
        }
        return enumC39882v.f172206w;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return PromoteId.toValue$lambda$0((PromoteId) this.f2413x, (String) obj);
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        GoogleDeviceLocationProvider.doStop$lambda$3((GoogleDeviceLocationProvider) this.f2413x, exc);
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        switch (this.f2412w) {
            case 1:
                return C1906q.m5741U0((C1906q) this.f2413x, view, c16905q1);
            case 11:
                return ActivityDetectionFragment.m26527E((ActivityDetectionFragment) this.f2413x, view, c16905q1);
            default:
                return MyAccountFragment.m25629k0((MyAccountFragment) this.f2413x, view, c16905q1);
        }
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        switch (this.f2412w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                MapController._init_$lambda$4((C13670k) this.f2413x, cameraChangedCoalesced);
                break;
            default:
                DebugOptionsController.updateCameraSubscriptionIfNeeded$lambda$1((DebugOptionsController) this.f2413x, cameraChangedCoalesced);
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.f2412w) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                MapboxMap._init_$lambda$1((NativeObserver) this.f2413x, mapLoadingError);
                break;
            default:
                MapboxMap._init_$lambda$2((MapboxMap) this.f2413x, mapLoadingError);
                break;
        }
    }

    @Override // com.mapbox.common.OfflineSwitchObserver
    public void statusChanged(boolean z4) {
        MapboxHttpClient.offlineObserver$lambda$1((MapboxHttpClient) this.f2413x, z4);
    }

    public /* synthetic */ C0680g0(C4310a c4310a, C23527t c23527t, C23537y c23537y, IOException iOException, boolean z4) {
        this.f2412w = 14;
        this.f2413x = c23537y;
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void mo134038invoke(Object obj) {
        switch (this.f2412w) {
            case 4:
                ((InterfaceC34595h0) obj).onMediaMetadataChanged((C34581a0) this.f2413x);
                break;
            case 5:
                ((InterfaceC34595h0) obj).onTrackSelectionParametersChanged((C34619t0) this.f2413x);
                break;
            case 6:
                ((InterfaceC34595h0) obj).onAudioAttributesChanged((C34586d) this.f2413x);
                break;
            case 7:
                ((InterfaceC34595h0) obj).onCues((C36933c) this.f2413x);
                break;
            case 8:
                ((InterfaceC34595h0) obj).onMediaMetadataChanged(((SurfaceHolderCallbackC2821c0) this.f2413x).f11043w.f11147q0);
                break;
            case 9:
                ((InterfaceC34595h0) obj).onMetadata((C34585c0) this.f2413x);
                break;
            case 10:
            case 11:
            default:
                C23537y c23537y = (C23537y) this.f2413x;
                C4321l c4321l = (C4321l) ((InterfaceC4311b) obj);
                c4321l.getClass();
                c4321l.f17567w = c23537y.f93206a;
                break;
            case 12:
                ((C4321l) ((InterfaceC4311b) obj)).f17559o = (PlaybackException) this.f2413x;
                break;
            case 13:
                C2832g c2832g = (C2832g) this.f2413x;
                C4321l c4321l2 = (C4321l) ((InterfaceC4311b) obj);
                c4321l2.f17569y += c2832g.f11172h;
                c4321l2.f17570z += c2832g.f11170f;
                break;
        }
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        MapboxRenderer.renderFrameFinishedCallback$lambda$0((MapboxRenderer) this.f2413x, renderFrameFinished);
    }

    public /* synthetic */ C0680g0(Object obj, int i13) {
        this.f2412w = i13;
        this.f2413x = obj;
    }
}
