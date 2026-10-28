package p222ij;

import ad3.C0775r;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.lifecycle.RunnableC1605m;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.AmplitudeInitOptions;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import no.nordicsemi.android.dfu.DfuBaseService;
import p185h6.RunnableC16957l;
import p197hj.C17334q;
import p254jj.C21735a;
import p254jj.C21736b;
import p581we.C37199o;
import p585wj.AbstractC37316b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import vf3.AbstractC35952b;
import wb3.AbstractC37056f;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ij.m */
/* JADX INFO: loaded from: classes.dex */
public final class C18587m {

    /* JADX INFO: renamed from: a */
    public final Context f72603a;

    /* JADX INFO: renamed from: b */
    public final C4861a f72604b;

    /* JADX INFO: renamed from: c */
    public final HandlerThread f72605c;

    /* JADX INFO: renamed from: d */
    public final Handler f72606d;

    /* JADX INFO: renamed from: e */
    public QuickJSContext f72607e;

    /* JADX INFO: renamed from: f */
    public C41113q f72608f;

    /* JADX INFO: renamed from: g */
    public C41113q f72609g;

    /* JADX INFO: renamed from: h */
    public final C18584j f72610h;

    /* JADX INFO: renamed from: i */
    public C18588n f72611i;

    /* JADX INFO: renamed from: j */
    public final C37199o f72612j;

    public C18587m(Context context, C4861a c4861a) {
        this.f72603a = context;
        this.f72604b = c4861a;
        HandlerThread handlerThread = new HandlerThread("JSThread");
        handlerThread.start();
        this.f72605c = handlerThread;
        Handler handler = new Handler(handlerThread.getLooper());
        this.f72606d = handler;
        this.f72610h = new C18584j();
        this.f72612j = new C37199o(this, c4861a);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new RunnableC1605m(9, this, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e5) {
            C4861a.f20259o.m16032K("Interrupted while waiting for bundle initialization", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m53801a(String js3, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(js3, "js");
        QuickJSContext quickJSContextM53802b = m53802b();
        if (quickJSContextM53802b == null) {
            return;
        }
        this.f72606d.post(new RunnableC16957l(quickJSContextM53802b, js3, interfaceC4351m, 1));
    }

    /* JADX INFO: renamed from: b */
    public final QuickJSContext m53802b() {
        if (this.f72607e == null) {
            C4861a.f20259o.m16067m0("jsContext is null but expected it to be non-null; maybe initialization failed?");
        }
        return this.f72607e;
    }

    /* JADX INFO: renamed from: c */
    public final void m53803c() {
        String strM1833d;
        C4861a c4861a = this.f72604b;
        try {
            QuickJSContext quickJSContextM53802b = m53802b();
            if (quickJSContextM53802b != null) {
                quickJSContextM53802b.evaluate("__GS_PLATFORM__ = 'android';");
            }
            InputStream inputStreamOpen = this.f72603a.getAssets().open("engagement.js");
            AbstractC22676k.m65749i(inputStreamOpen, "context.assets.open(\"engagement.js\")");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
            try {
                String strM114200h = AbstractC35952b.m114200h(bufferedReader);
                bufferedReader.close();
                QuickJSContext quickJSContextM53802b2 = m53802b();
                if (quickJSContextM53802b2 != null) {
                    quickJSContextM53802b2.evaluateModule(strM114200h);
                }
                QuickJSContext quickJSContextM53802b3 = m53802b();
                if (quickJSContextM53802b3 != null) {
                    StringBuilder sb4 = new StringBuilder("window.engagement.init(\"");
                    sb4.append(c4861a.f20260a);
                    sb4.append("\", ");
                    AmplitudeInitOptions amplitudeInitOptions = c4861a.f20261b;
                    try {
                        C0775r c0775r = AbstractC37316b.f159546a;
                        c0775r.getClass();
                        strM1833d = c0775r.m1833d(AmplitudeInitOptions.Companion.serializer(), amplitudeInitOptions);
                    } catch (Exception e5) {
                        C4861a.f20259o.m16067m0("Failed to serialize to JSON string: " + e5.getMessage());
                        strM1833d = null;
                    }
                    sb4.append(strM1833d);
                    sb4.append(')');
                    quickJSContextM53802b3.evaluate(sb4.toString());
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(bufferedReader, th3);
                    throw th4;
                }
            }
        } catch (Exception e13) {
            C4861a.f20259o.m16032K("Failed to load JS bundle", e13);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m53804d() {
        C18580f c18580f = new C18580f(this);
        C21735a c21735a = new C21735a();
        LinkedHashMap linkedHashMap = c18580f.f72590d;
        linkedHashMap.put("fetch", c21735a);
        C4861a c4861a = this.f72604b;
        linkedHashMap.put("showDebugToolbar", new C21736b(c4861a, 1));
        linkedHashMap.put("hideDebugToolbar", new C21736b(c4861a, 0));
        linkedHashMap.put("isElementVisible", new C21736b());
        C41113q c41113q = this.f72608f;
        if (c41113q == null) {
            AbstractC22676k.m65757q("globalBridge");
            throw null;
        }
        c41113q.m133449A(c18580f);
        C41113q c41113q2 = this.f72608f;
        if (c41113q2 == null) {
            AbstractC22676k.m65757q("globalBridge");
            throw null;
        }
        c41113q2.m133449A(new C18590p("base64Encode", C18577c.f72584y));
        C41113q c41113q3 = this.f72608f;
        if (c41113q3 == null) {
            AbstractC22676k.m65757q("globalBridge");
            throw null;
        }
        c41113q3.m133449A(new C18590p("base64Decode", C18577c.f72585z));
        C41113q c41113q4 = this.f72608f;
        if (c41113q4 == null) {
            AbstractC22676k.m65757q("globalBridge");
            throw null;
        }
        c41113q4.m133449A(new C18590p("getRandomBase64", C18577c.f72578E));
        QuickJSContext quickJSContextM53802b = m53802b();
        if (quickJSContextM53802b != null) {
            quickJSContextM53802b.setConsole(this.f72610h);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m53805e() {
        C0775r c0775r = AbstractC18591q.f72618a;
        C18590p c18590p = new C18590p("clickElement", C18577c.f72579F);
        C18590p c18590p2 = new C18590p("getDefaultUIMode", C18577c.f72580G);
        C4861a c4861a = this.f72604b;
        for (C18590p c18590p3 : AbstractC37056f.m118959K(c18590p, c18590p2, new C18590p("closeStep", new C17334q(c4861a, 3)), new C18590p("linkExecutable", new C18577c(c4861a)), new C18590p("appReviewExecutable", C18577c.f72581H), new C18590p("renderNudge", new C17334q(c4861a, 4)))) {
            C41113q c41113q = this.f72609g;
            if (c41113q == null) {
                AbstractC22676k.m65757q("nudgeServicesBridge");
                throw null;
            }
            c41113q.m133449A(c18590p3);
        }
    }
}
