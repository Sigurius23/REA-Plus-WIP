package or2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.location.LocationManager;
import c93.InterfaceC4339a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.C5057p;
import io.getstream.chat.android.p226ui.utils.C19902a;
import l83.C23454a0;
import p073cq.InterfaceC11034c;
import p073cq.InterfaceC11037f;
import p236j.AbstractC21065d;
import p432qo.C30523a;
import p503tp.C34038i;
import p503tp.C34040k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.C34117o;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.y0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lor2/y0;", "", "Landroid/content/Context;", "context", "Ltr2/n;", "systemLogger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "", "e", "()Z", "Landroid/app/Activity;", "activity", "Lj/d;", "Lj/l;", "checkLocationSettingsLauncher", "Lkotlin/Function0;", "Ll83/a0;", "onSuccess", "onError", "onCanceled", "f", "(Landroid/app/Activity;Lj/d;Lc93/a;Lc93/a;Lc93/a;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ltr2/o;", "b", "Ltr2/o;", "getLogger", "()Ltr2/o;", "logger", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28217y0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34117o logger;

    public C28217y0(Context context, InterfaceC34116n systemLogger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(systemLogger, "systemLogger");
        this.context = context;
        this.logger = new C34117o(systemLogger, "LocationServicesHelper", null, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m85439g(C28217y0 c28217y0, Activity activity, AbstractC21065d abstractC21065d, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            abstractC21065d = null;
        }
        c28217y0.m85445f(activity, abstractC21065d, interfaceC4339a, interfaceC4339a2, interfaceC4339a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m85440h(C28217y0 c28217y0, InterfaceC4339a interfaceC4339a, C34040k c34040k) {
        c28217y0.logger.mo85216g("checkLocationSettings -> success", new AbstractC30556a.a[0]);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m85441i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m85442j(AbstractC21065d abstractC21065d, Activity activity, C28217y0 c28217y0, InterfaceC4339a interfaceC4339a, Exception e5) {
        AbstractC22676k.m65750j(e5, "e");
        int iM15589a = ((ApiException) e5).m15589a();
        if (iM15589a != 6) {
            if (iM15589a != 8502) {
                return;
            }
            c28217y0.logger.mo85230v("checkLocationSettings -> can't change settings", e5, new AbstractC30556a.a[0]);
            interfaceC4339a.invoke();
            return;
        }
        try {
            ResolvableApiException resolvableApiException = (ResolvableApiException) e5;
            if (abstractC21065d == null) {
                resolvableApiException.m15592c(activity, 214);
                return;
            }
            PendingIntent pendingIntentM15591b = resolvableApiException.m15591b();
            AbstractC22676k.m65749i(pendingIntentM15591b, "getResolution(...)");
            abstractC21065d.mo4052a(new C5057p(pendingIntentM15591b).m15858a(), null);
        } catch (IntentSender.SendIntentException e13) {
            c28217y0.logger.mo85213c("checkLocationSettings -> can't send intent", e13, new AbstractC30556a.a[0]);
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m85443k(C28217y0 c28217y0, InterfaceC4339a interfaceC4339a) {
        c28217y0.logger.mo85226q("checkLocationSettings -> onCanceled", new AbstractC30556a.a[0]);
        interfaceC4339a.invoke();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85444e() {
        LocationManager locationManager = (LocationManager) this.context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    /* JADX INFO: renamed from: f */
    public final void m85445f(Activity activity, AbstractC21065d checkLocationSettingsLauncher, InterfaceC4339a onSuccess, InterfaceC4339a onError, final InterfaceC4339a onCanceled) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(onSuccess, "onSuccess");
        AbstractC22676k.m65750j(onError, "onError");
        AbstractC22676k.m65750j(onCanceled, "onCanceled");
        C34038i c34038i = new C34038i();
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.m15630k(100);
        c34038i.m107623a(locationRequest);
        c34038i.m107625c();
        c34038i.m107626d();
        Task taskM93542c = new C30523a(activity).m93542c(c34038i.m107624b());
        final C28192q c28192q = new C28192q(3, this, onSuccess);
        taskM93542c.addOnSuccessListener(new InterfaceC11037f() { // from class: or2.w0
            @Override // p073cq.InterfaceC11037f
            public final void onSuccess(Object obj) {
                C28217y0.m85441i(c28192q, obj);
            }
        }).addOnFailureListener(new C19902a(checkLocationSettingsLauncher, activity, this, onError, 2)).addOnCanceledListener(new InterfaceC11034c() { // from class: or2.x0
            @Override // p073cq.InterfaceC11034c
            /* JADX INFO: renamed from: d */
            public final void mo2320d() {
                C28217y0.m85443k(this.f113991w, onCanceled);
            }
        });
    }
}
