package p395p6;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import d20.C11500p;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import n20.C26175j;
import p328mj.C25595b;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: p6.s0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC28916s0 extends AppWidgetProvider {

    /* JADX INFO: renamed from: x */
    public static final C28907p0 f117025x = new C28907p0();

    /* JADX INFO: renamed from: w */
    private final InterfaceC30063j f117026w = AbstractC3050q0.f12077a;

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:19:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m87826a(bc3.InterfaceC2994c0 r7, android.content.Context r8, int[] r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p395p6.C28910q0
            if (r0 == 0) goto L13
            r0 = r10
            p6.q0 r0 = (p395p6.C28910q0) r0
            int r1 = r0.f117007G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117007G = r1
            goto L18
        L13:
            p6.q0 r0 = new p6.q0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f117005E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f117007G
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r7 = r0.f117011z
            int r8 = r0.f117010y
            int[] r9 = r0.f117009x
            android.content.Context r2 = r0.f117008w
            p505ts.AbstractC34132o.m107864I(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            p505ts.AbstractC34132o.m107864I(r10)
            r6.m87831g(r7, r8)
            int r7 = r9.length
            r10 = 0
            r5 = r9
            r9 = r8
            r8 = r10
            r10 = r5
        L45:
            if (r8 >= r7) goto L60
            r2 = r10[r8]
            p6.g0 r4 = r6.mo28930f()
            r0.f117008w = r9
            r0.f117009x = r10
            r0.f117010y = r8
            r0.f117011z = r7
            r0.f117007G = r3
            java.lang.Object r2 = r4.m87800b(r9, r2, r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            int r8 = r8 + r3
            goto L45
        L60:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p395p6.AbstractC28916s0.m87826a(bc3.c0, android.content.Context, int[], q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final Object m87827b(InterfaceC2994c0 interfaceC2994c0, Context context, int i13, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        m87831g(interfaceC2994c0, context);
        Object objM87797o = AbstractC28880g0.m87797o(mo28930f(), context, i13, str, null, interfaceC30057d, 8, null);
        return objM87797o == EnumC31071a.f128113w ? objM87797o : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m87828c(InterfaceC2994c0 interfaceC2994c0, Context context, int i13, Bundle bundle, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        m87831g(interfaceC2994c0, context);
        Object objM87807m = mo28930f().m87807m(context, i13, bundle, interfaceC30057d);
        return objM87807m == EnumC31071a.f128113w ? objM87807m : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m87829d(InterfaceC2994c0 interfaceC2994c0, Context context, int[] iArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        m87831g(interfaceC2994c0, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i13 : iArr) {
            arrayList.add(AbstractC3006f0.m8711e(interfaceC2994c0, null, new C25595b(this, context, i13, null), 3));
        }
        Object objM8712f = AbstractC3006f0.m8712f(arrayList, interfaceC30057d);
        return objM8712f == EnumC31071a.f128113w ? objM8712f : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC30063j m87830e() {
        return this.f117026w;
    }

    /* JADX INFO: renamed from: f */
    public abstract AbstractC28880g0 mo28930f();

    /* JADX INFO: renamed from: g */
    public final void m87831g(InterfaceC2994c0 interfaceC2994c0, Context context) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C26175j(context, this, (InterfaceC30057d) null, 14), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i13, Bundle bundle) {
        if (AbstractC37978j.m121631O(context, new C6517d(this, i13, bundle, 8))) {
            return;
        }
        AbstractC36259c.m115680a0(this, m87830e(), new C11500p(this, context, i13, bundle, (InterfaceC30057d) null, 2));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        if (AbstractC37978j.m121631O(context, new C28904o0(this, iArr, 0))) {
            return;
        }
        AbstractC36259c.m115680a0(this, m87830e(), new C28913r0(this, context, iArr, null, 0));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: all -> 0x0056, CancellationException -> 0x00c8, TryCatch #4 {CancellationException -> 0x00c8, all -> 0x0056, blocks: (B:23:0x004f, B:30:0x0060, B:31:0x0068, B:32:0x0069, B:33:0x0071, B:34:0x0072, B:50:0x00bd, B:40:0x0088, B:42:0x009a, B:44:0x00a5, B:46:0x00b1, B:45:0x00ad, B:48:0x00b5, B:49:0x00bc, B:37:0x007d), top: B:56:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5 A[Catch: all -> 0x0056, CancellationException -> 0x00c8, TryCatch #4 {CancellationException -> 0x00c8, all -> 0x0056, blocks: (B:23:0x004f, B:30:0x0060, B:31:0x0068, B:32:0x0069, B:33:0x0071, B:34:0x0072, B:50:0x00bd, B:40:0x0088, B:42:0x009a, B:44:0x00a5, B:46:0x00b1, B:45:0x00ad, B:48:0x00b5, B:49:0x00bc, B:37:0x007d), top: B:56:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x0056, CancellationException -> 0x00c8, TryCatch #4 {CancellationException -> 0x00c8, all -> 0x0056, blocks: (B:23:0x004f, B:30:0x0060, B:31:0x0068, B:32:0x0069, B:33:0x0071, B:34:0x0072, B:50:0x00bd, B:40:0x0088, B:42:0x009a, B:44:0x00a5, B:46:0x00b1, B:45:0x00ad, B:48:0x00b5, B:49:0x00bc, B:37:0x007d), top: B:56:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[Catch: all -> 0x0056, CancellationException -> 0x00c8, TryCatch #4 {CancellationException -> 0x00c8, all -> 0x0056, blocks: (B:23:0x004f, B:30:0x0060, B:31:0x0068, B:32:0x0069, B:33:0x0071, B:34:0x0072, B:50:0x00bd, B:40:0x0088, B:42:0x009a, B:44:0x00a5, B:46:0x00b1, B:45:0x00ad, B:48:0x00b5, B:49:0x00bc, B:37:0x007d), top: B:56:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            try {
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode == -19011148) {
                        context2 = context;
                        if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            AbstractC22676k.m65747g(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 649033583) {
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                        }
                        appWidgetManager = AppWidgetManager.getInstance(context2);
                        packageName = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        componentName = new ComponentName(packageName, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            AbstractC22676k.m65747g(appWidgetIds);
                        } else {
                            appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager, appWidgetIds);
                        return;
                    }
                    if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        if (!AbstractC37978j.m121631O(context, new C6517d(this, intExtra, stringExtra, 7))) {
                            AbstractC36259c.m115680a0(this, m87830e(), new C11500p(this, context, intExtra, stringExtra, (InterfaceC30057d) null, 3));
                            return;
                        }
                    }
                    context2 = context;
                    return;
                }
                context2 = context;
                super.onReceive(context2, intent);
            } catch (CancellationException unused) {
            } catch (Throwable th3) {
                th = th3;
                Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
            }
        } catch (CancellationException unused2) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (AbstractC37978j.m121631O(context, new C28904o0(this, iArr, 1))) {
            return;
        }
        AbstractC36259c.m115680a0(this, m87830e(), new C28913r0(this, context, iArr, null, 1));
    }
}
