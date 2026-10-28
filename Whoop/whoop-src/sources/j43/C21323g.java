package j43;

import al0.C0971f;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.video.android.model.StreamCallId;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import l83.C23470p;
import lu.AbstractC24744f;
import lu.C24740b;
import lu.C24741c;
import m40.AbstractC25026c;
import m40.C25032i;
import m40.EnumC25029f;
import m40.InterfaceC25031h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p014aj.C0926a;
import p031b9.C2817b;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import t23.C33368c0;

/* JADX INFO: renamed from: j43.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C21323g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81533a;

    /* JADX INFO: renamed from: b */
    public final C23470p f81534b;

    public C21323g(Context context) {
        this.f81533a = 3;
        AbstractC22676k.m65750j(context, "context");
        this.f81534b = AbstractC30060g.m92088H(new C0971f(this, context, 6));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m59850f(C25032i c25032i, C2817b c2817b, InterfaceC25031h interfaceC25031h) throws Throwable {
        Bitmap.CompressFormat compressFormat;
        BufferedOutputStream bufferedOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(c2817b.m8015r(0), DfuBaseService.ERROR_REMOTE_MASK);
            try {
                String value = c25032i.f98052a.getValue();
                try {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c2817b.m8015r(1), AbstractC24744f.f96764b);
                    try {
                        outputStreamWriter2.write(value);
                        AbstractC24744f.m72450a(outputStreamWriter2);
                        if (interfaceC25031h == EnumC25029f.Jpeg) {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                        } else if (interfaceC25031h == EnumC25029f.Png) {
                            compressFormat = Bitmap.CompressFormat.PNG;
                        } else {
                            if (interfaceC25031h != EnumC25029f.Webp) {
                                throw new IllegalArgumentException(AbstractC11266d.m30461o("Unexpected image type: ", interfaceC25031h.getValue()));
                            }
                            compressFormat = Bitmap.CompressFormat.WEBP;
                        }
                        Bitmap bitmap = c25032i.f98053b;
                        int i13 = AbstractC25026c.f98040a[compressFormat.ordinal()];
                        int i14 = 80;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                i14 = 100;
                            } else if (i13 != 3) {
                                throw new IllegalArgumentException("Unexpected compress format: " + compressFormat);
                            }
                        }
                        boolean zCompress = bitmap.compress(compressFormat, i14, bufferedOutputStream2);
                        bufferedOutputStream2.close();
                        return zCompress;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStreamWriter = outputStreamWriter2;
                        AbstractC24744f.m72450a(outputStreamWriter);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public Intent m59851a(Context context, C21325i c21325i) {
        AbstractC22676k.m65750j(context, "context");
        String str = c21325i.f81541b;
        Class cls = c21325i.f81543d.f81524d;
        C2345k c2345k = (C2345k) this.f81534b.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str2 = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345k.f9274b.log(enumC2341g, str2, AbstractC11266d.m30459m(cls, "[buildStartIntent], Resolved service class: "), null);
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("io.getstream.video.android.intent-extra.call_cid", c21325i.f81540a);
        switch (str.hashCode()) {
            case -822844713:
                if (str.equals("incoming_call")) {
                    intent.putExtra("io.getstream.video.android.core.notifications.internal.service.CallService.call_trigger", "incoming_call");
                    intent.putExtra("io.getstream.video.android.intent-extra.call_displayname", c21325i.f81542c);
                    return intent;
                }
                break;
            case -294064839:
                if (str.equals("remove_call")) {
                    intent.putExtra("io.getstream.video.android.core.notifications.internal.service.CallService.call_trigger", "remove_call");
                    return intent;
                }
                break;
            case -285646686:
                if (str.equals("ongoing_call")) {
                    intent.putExtra("io.getstream.video.android.core.notifications.internal.service.CallService.call_trigger", "ongoing_call");
                    return intent;
                }
                break;
            case 89080657:
                if (str.equals("outgoing_call")) {
                    intent.putExtra("io.getstream.video.android.core.notifications.internal.service.CallService.call_trigger", "outgoing_call");
                    return intent;
                }
                break;
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("Unknown ", str, ", must be one of: incoming_call, outgoing_call, ongoing_call"));
    }

    /* JADX INFO: renamed from: b */
    public Intent m59852b(Context context, C21326j c21326j) {
        AbstractC22676k.m65750j(context, "context");
        C33368c0 c33368c0 = c21326j.f81544a;
        C23470p c23470p = this.f81534b;
        C2345k c2345k = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[buildStopIntent]", null);
        }
        Class cls = c21326j.f81545b.f81524d;
        if (!m59854d(context, cls)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        C2345k c2345k2 = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            InterfaceC2344j interfaceC2344j = c2345k2.f9274b;
            ComponentName component = intent.getComponent();
            interfaceC2344j.log(enumC2341g, str2, AbstractC31061c.m95640p("[buildStopIntent], class:", component != null ? component.getShortClassName() : null, ", call_id: ", c33368c0 != null ? c33368c0.f139308v : null), null);
        }
        if (c33368c0 != null) {
            intent.putExtra("io.getstream.video.android.intent-extra.call_cid", new StreamCallId(c33368c0.f139288b, c33368c0.f139289c, c33368c0.f139308v, false, 8, (DefaultConstructorMarker) null));
        }
        return intent.putExtra("io.getstream.video.android.core.stop_service", true);
    }

    /* JADX INFO: renamed from: c */
    public C2345k m59853c() {
        switch (this.f81533a) {
            case 1:
                break;
        }
        return (C2345k) this.f81534b.getValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m59854d(Context context, Class serviceClass) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(serviceClass, "serviceClass");
        try {
            Object systemService = context.getSystemService("activity");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
            while (it.hasNext()) {
                if (serviceClass.getName().equals(it.next().service.getClassName())) {
                    C2345k c2345k = (C2345k) this.f81534b.getValue();
                    InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, c2345k.f9273a)) {
                        c2345k.f9274b.log(enumC2341g, c2345k.f9273a, "[isServiceRunning], Service is running: " + serviceClass, null);
                        return true;
                    }
                    return true;
                }
            }
            C2345k c2345k2 = (C2345k) this.f81534b.getValue();
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (!interfaceC2339e2.isLoggable(enumC2341g2, c2345k2.f9273a)) {
                return false;
            }
            c2345k2.f9274b.log(enumC2341g2, c2345k2.f9273a, "[isServiceRunning], Service is NOT running: " + serviceClass, null);
            return false;
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g3, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m59855e(String key, C25032i c25032i) {
        boolean z4;
        AbstractC22676k.m65750j(key, "key");
        String strValueOf = String.valueOf(key.hashCode());
        C2817b c2817bM72443i = null;
        try {
            C24741c c24741c = (C24741c) this.f81534b.getValue();
            C0926a c0926aM72444k = c24741c != null ? c24741c.m72444k(String.valueOf(key.hashCode())) : null;
            z4 = c0926aM72444k != null;
            if (c0926aM72444k != null) {
                c0926aM72444k.close();
            }
        } catch (IOException e5) {
            Log.e("stripe_image_disk_cache", "error reading from cache", e5);
            z4 = false;
        }
        if (z4) {
            return;
        }
        try {
            C24741c c24741c2 = (C24741c) this.f81534b.getValue();
            c2817bM72443i = c24741c2 != null ? c24741c2.m72443i(strValueOf) : null;
            if (c2817bM72443i == null) {
                return;
            }
            if (!m59850f(c25032i, c2817bM72443i, c25032i.f98052a)) {
                c2817bM72443i.m8004a();
                Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + strValueOf);
                return;
            }
            C24741c c24741c3 = (C24741c) this.f81534b.getValue();
            if (c24741c3 != null) {
                synchronized (c24741c3) {
                    if (c24741c3.f96745I == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    c24741c3.m72446p0();
                    c24741c3.f96745I.flush();
                }
            }
            C24741c c24741c4 = (C24741c) c2817bM72443i.f11021E;
            if (!c2817bM72443i.f11023x) {
                C24741c.m72434b(c24741c4, c2817bM72443i, true);
            } else {
                C24741c.m72434b(c24741c4, c2817bM72443i, false);
                c24741c4.m72442b0(((C24740b) c2817bM72443i.f11024y).f96734a);
            }
        } catch (IOException unused) {
            Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + strValueOf);
            if (c2817bM72443i != null) {
                try {
                    c2817bM72443i.m8004a();
                } catch (Throwable th3) {
                    AbstractC34132o.m107888l(th3);
                }
            }
        }
    }

    public C21323g(int i13) {
        this.f81533a = i13;
        switch (i13) {
            case 1:
                this.f81534b = AbstractC1772c1.m5382S(this, "ServiceNotificationRetriever");
                break;
            case 2:
                this.f81534b = AbstractC1772c1.m5382S(this, "CallServiceLifecycleManager");
                break;
            default:
                this.f81534b = AbstractC1772c1.m5382S(this, "ServiceIntentBuilder");
                break;
        }
    }
}
