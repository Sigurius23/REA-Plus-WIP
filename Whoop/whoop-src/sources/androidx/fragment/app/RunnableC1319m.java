package androidx.fragment.app;

import aa3.C0627i1;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.widget.EditText;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1588h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.p019ui.PlayerView;
import b30.C2570m;
import c93.InterfaceC4339a;
import com.google.android.material.timepicker.AbstractC5072e;
import com.iterable.iterableapi.C5359o1;
import com.iterable.iterableapi.C5379v0;
import com.iterable.iterableapi.IterableKeychainEncryptedDataMigrator$MigrationException;
import com.mapbox.common.module.cronet.CronetRequestDetail;
import com.mapbox.maps.NativeMapImpl;
import com.whoop.profile.view.ProfileScreenEventRouter;
import io.getstream.chat.android.p226ui.utils.extensions.EditTextKt;
import io.getstream.chat.android.p226ui.widgets.NestedScrollViewPaginationHelper;
import j43.C21318b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p002a0.C0006a1;
import p012ab.C0682h0;
import p031b9.C2814a;
import p031b9.C2817b;
import p031b9.C2830f0;
import p031b9.C2831f1;
import p031b9.C2848l0;
import p031b9.SurfaceHolderCallbackC2821c0;
import p046c8.C4297b;
import p047c9.C4313d;
import p047c9.C4317h;
import p085d9.C11780a0;
import p085d9.C11807x;
import p087db.C11847f;
import p087db.C11882x;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p127ev.C13668i;
import p161g.DialogC14910m;
import p161g.ViewTreeObserverOnDrawListenerC14906i;
import p164g2.C15247s;
import p189hb.C17073i;
import p215i9.C18229e;
import p217ib.AbstractC18317n;
import p320m5.C25067k;
import p450r5.RunnableC30928b;
import p547v8.AbstractC35785b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38063r;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import sb.SharedPreferencesC32338b;
import sb.SharedPreferencesEditorC32337a;

/* JADX INFO: renamed from: androidx.fragment.app.m */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC1319m implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5675w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f5676x;

    public /* synthetic */ RunnableC1319m(C2848l0 c2848l0, C2831f1 c2831f1) {
        this.f5675w = 9;
        this.f5676x = c2831f1;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        boolean z4;
        SharedPreferencesC32338b sharedPreferencesC32338bM100637a;
        switch (this.f5675w) {
            case 0:
                C22669g0 seekCancelLambda = (C22669g0) this.f5676x;
                AbstractC22676k.m65750j(seekCancelLambda, "$seekCancelLambda");
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) seekCancelLambda.f89336w;
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                    return;
                }
                return;
            case 1:
                AbstractC1286d2.m4079d((ArrayList) this.f5676x, 4);
                return;
            case 2:
                C1335q c1335q = (C1335q) this.f5676x;
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = c1335q.f5761c.iterator();
                while (it.hasNext()) {
                    ((C1339r) it.next()).f5663a.m4202c(c1335q);
                }
                return;
            case 3:
                Iterator it3 = ((AbstractC1329o1) this.f5676x).f5729o.iterator();
                while (it3.hasNext()) {
                    ((C17073i) it3.next()).getClass();
                }
                return;
            case 4:
                C13668i c13668i = (C13668i) this.f5676x;
                do {
                    AtomicBoolean atomicBoolean2 = (AtomicBoolean) c13668i.f48456c;
                    atomicBoolean = (AtomicBoolean) c13668i.f48455b;
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        z4 = false;
                        AbstractC18317n abstractC18317nM38531b = null;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                abstractC18317nM38531b = c13668i.m38531b();
                                z4 = true;
                            } catch (Throwable th3) {
                                atomicBoolean2.set(false);
                                throw th3;
                            }
                        }
                        if (z4) {
                            ((C1588h) c13668i.f48454a).postValue(abstractC18317nM38531b);
                        }
                        atomicBoolean2.set(false);
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            case 5:
                C25067k c25067k = (C25067k) this.f5676x;
                Class cls = AndroidComposeView.f4886h1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    c25067k.invoke();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 6:
                C2817b c2817b = (C2817b) this.f5676x;
                ((Context) c2817b.f11024y).unregisterReceiver((C2814a) c2817b.f11025z);
                return;
            case 7:
                C2814a c2814a = (C2814a) this.f5676x;
                if (((C2817b) c2814a.f11012d).f11023x) {
                    ((SurfaceHolderCallbackC2821c0) c2814a.f11010b).f11043w.m8088I0(3, false);
                    return;
                }
                return;
            case 8:
                C2830f0 c2830f0 = (C2830f0) this.f5676x;
                C2570m c2570m = c2830f0.f11137g0;
                Context context = c2830f0.f11104F;
                int i13 = AbstractC38065t.f163031a;
                Integer numValueOf = Integer.valueOf(AbstractC35785b.m113423r(context).generateAudioSessionId());
                c2570m.f9985F = numValueOf;
                ((C38063r) c2570m.f9988y).m121879c(new RunnableC30928b(18, c2570m, numValueOf));
                return;
            case 9:
                C2831f1 c2831f1 = (C2831f1) this.f5676x;
                try {
                    synchronized (c2831f1) {
                    }
                    try {
                        c2831f1.f11159a.mo8047a(c2831f1.f11161c, c2831f1.f11162d);
                        return;
                    } finally {
                        c2831f1.m8126a(true);
                    }
                } catch (ExoPlaybackException e5) {
                    AbstractC38046a.m121813h("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e5);
                    throw new RuntimeException(e5);
                }
            case 10:
                C4297b c4297b = (C4297b) this.f5676x;
                try {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i14 = runningAppProcessInfo.importance;
                    int i15 = (i14 == 100 || i14 == 125 || i14 == 200) ? 1 : 0;
                    c4297b.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
                        parcelObtain.writeInt(i15);
                        c4297b.f17417f.transact(1, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e13) {
                    Log.e("a", "HealthDataSdkService#getIsInForeground failed: " + e13.getMessage());
                    return;
                }
            case 11:
                C4317h c4317h = (C4317h) this.f5676x;
                c4317h.m13602l(c4317h.m13597g(), 1028, new C4313d(7));
                c4317h.f17516F.m121834d();
                return;
            case 12:
                ((AbstractC5072e) this.f5676x).mo15913f();
                return;
            case 13:
                C0627i1 c0627i1 = (C0627i1) this.f5676x;
                Context context2 = (Context) c0627i1.f2195b;
                try {
                    C0682h0 c0682h0 = new C0682h0(context2);
                    if (AbstractC12682p.m35485e(1) != 0) {
                        throw new IllegalArgumentException("Unsupported scheme: ".concat("AES256_GCM"));
                    }
                    if (((KeyGenParameterSpec) c0682h0.f2434z) != null) {
                        throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                    }
                    c0682h0.f2432x = 1;
                    sharedPreferencesC32338bM100637a = SharedPreferencesC32338b.m100637a(context2, c0682h0.m1693h());
                    if (sharedPreferencesC32338bM100637a == null) {
                        c0627i1.m1629n();
                        IterableKeychainEncryptedDataMigrator$MigrationException iterableKeychainEncryptedDataMigrator$MigrationException = new IterableKeychainEncryptedDataMigrator$MigrationException("Failed to load EncryptedSharedPreferences", (Throwable) null);
                        C0006a1 c0006a1 = (C0006a1) c0627i1.f2198e;
                        if (c0006a1 != null) {
                            c0006a1.invoke(iterableKeychainEncryptedDataMigrator$MigrationException);
                            return;
                        }
                        return;
                    }
                    C5359o1 c5359o1 = (C5359o1) c0627i1.f2197d;
                    SharedPreferences.Editor editorEdit = sharedPreferencesC32338bM100637a.edit();
                    String string = sharedPreferencesC32338bM100637a.getString("iterable-email", null);
                    if (string != null) {
                        c5359o1.m16505c("iterable-email", string);
                        ((SharedPreferencesEditorC32337a) editorEdit).remove("iterable-email");
                        AbstractC12350b.m34593n("IterableKeychainMigrator", "Email migrated: ".concat(string));
                    } else {
                        AbstractC12350b.m34593n("IterableKeychainMigrator", "No email found to migrate.");
                    }
                    String string2 = sharedPreferencesC32338bM100637a.getString("iterable-user-id", null);
                    if (string2 != null) {
                        c5359o1.m16505c("iterable-user-id", string2);
                        ((SharedPreferencesEditorC32337a) editorEdit).remove("iterable-user-id");
                        AbstractC12350b.m34593n("IterableKeychainMigrator", "User ID migrated: ".concat(string2));
                    } else {
                        AbstractC12350b.m34579a0("IterableKeychainMigrator", "No user ID found to migrate.");
                    }
                    String string3 = sharedPreferencesC32338bM100637a.getString("iterable-auth-token", null);
                    if (string3 != null) {
                        c5359o1.m16505c("iterable-auth-token", string3);
                        ((SharedPreferencesEditorC32337a) editorEdit).remove("iterable-auth-token");
                        AbstractC12350b.m34593n("IterableKeychainMigrator", "Auth token migrated: ".concat(string3));
                    } else {
                        AbstractC12350b.m34593n("IterableKeychainMigrator", "No auth token found to migrate.");
                    }
                    ((SharedPreferencesEditorC32337a) editorEdit).apply();
                    c0627i1.m1629n();
                    C0006a1 c0006a2 = (C0006a1) c0627i1.f2198e;
                    if (c0006a2 != null) {
                        c0006a2.invoke(null);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    sharedPreferencesC32338bM100637a = null;
                }
                break;
            case 14:
                ((C5379v0) this.f5676x).m16535G();
                return;
            case 15:
                CronetRequestDetail.start$lambda$0((CronetRequestDetail) this.f5676x);
                return;
            case 16:
                NativeMapImpl._set_sizeSet_$lambda$1((NativeMapImpl) this.f5676x);
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((ProfileScreenEventRouter) this.f5676x).deferredModalCardButtonIdForConfirm = null;
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((AbstractC22680m) this.f5676x).invoke();
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C11807x c11807x = (C11807x) this.f5676x;
                if (c11807x.f38378h0 >= 300000) {
                    ((C11780a0) c11807x.f38389r.f130665x).f38189o1 = true;
                    c11807x.f38378h0 = 0L;
                    return;
                }
                return;
            case 20:
                ((C11847f) this.f5676x).m31801d(false);
                return;
            case 21:
                ((C11882x) this.f5676x).m31860o();
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((PlayerView) this.f5676x).invalidate();
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ViewTreeObserverOnDrawListenerC14906i viewTreeObserverOnDrawListenerC14906i = (ViewTreeObserverOnDrawListenerC14906i) this.f5676x;
                Runnable runnable = viewTreeObserverOnDrawListenerC14906i.f55583x;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC14906i.f55583x = null;
                    return;
                }
                return;
            case 24:
                DialogC14910m.m43001a((DialogC14910m) this.f5676x);
                return;
            case 25:
                ((C21318b) this.f5676x).invoke();
                return;
            case 26:
                ((C15247s) this.f5676x).m43352b();
                return;
            case 27:
                C18229e c18229e = (C18229e) this.f5676x;
                synchronized (c18229e.f70924a) {
                    try {
                        if (c18229e.f70936m) {
                            return;
                        }
                        long j7 = c18229e.f70935l - 1;
                        c18229e.f70935l = j7;
                        if (j7 > 0) {
                            return;
                        }
                        if (j7 >= 0) {
                            c18229e.m52498a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (c18229e.f70924a) {
                            c18229e.f70937n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 28:
                EditTextKt.showKeyboardIfFocused$lambda$0((EditText) this.f5676x);
                return;
            default:
                NestedScrollViewPaginationHelper.scrollChangeListener$lambda$2$lambda$1((NestedScrollViewPaginationHelper) this.f5676x);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1319m(InterfaceC4339a interfaceC4339a) {
        this.f5675w = 18;
        this.f5676x = (AbstractC22680m) interfaceC4339a;
    }

    public /* synthetic */ RunnableC1319m(Object obj, int i13) {
        this.f5675w = i13;
        this.f5676x = obj;
    }
}
