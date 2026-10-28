package p395p6;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import bc3.AbstractC3006f0;
import bi.C3278p;
import com.whoop.android.R;
import p279kd.C22379f;
import q83.C30064k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: p6.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28925v0 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a */
    public final GlanceRemoteViewsService f117036a;

    /* JADX INFO: renamed from: b */
    public final int f117037b;

    /* JADX INFO: renamed from: c */
    public final int f117038c;

    /* JADX INFO: renamed from: d */
    public final String f117039d;

    public C28925v0(GlanceRemoteViewsService glanceRemoteViewsService, int i13, int i14, String str) {
        this.f117036a = glanceRemoteViewsService;
        this.f117037b = i13;
        this.f117038c = i14;
        this.f117039d = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r10 == r12) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m87836a(p395p6.C28925v0 r10, p395p6.C28864b r11, s83.AbstractC32269c r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            androidx.glance.appwidget.GlanceRemoteViewsService r1 = r10.f117036a
            int r6 = r10.f117037b
            boolean r0 = r12 instanceof p395p6.C28922u0
            if (r0 == 0) goto L18
            r0 = r12
            p6.u0 r0 = (p395p6.C28922u0) r0
            int r2 = r0.f117034y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r0.f117034y = r2
        L16:
            r5 = r0
            goto L1e
        L18:
            p6.u0 r0 = new p6.u0
            r0.<init>(r10, r12)
            goto L16
        L1e:
            java.lang.Object r10 = r5.f117032w
            r83.a r12 = r83.EnumC31071a.f128113w
            int r0 = r5.f117034y
            l83.a0 r7 = l83.C23454a0.f92919a
            r8 = 3
            r2 = 1
            r9 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L45
            r11 = 2
            if (r0 == r11) goto L3e
            if (r0 != r8) goto L36
            p505ts.AbstractC34132o.m107864I(r10)
            return r7
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            p505ts.AbstractC34132o.m107864I(r10)
            r9 = r10
            bc3.k1 r9 = (bc3.InterfaceC3027k1) r9
            goto L99
        L45:
            p505ts.AbstractC34132o.m107864I(r10)
            goto L8d
        L49:
            p505ts.AbstractC34132o.m107864I(r10)
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r1)
            android.appwidget.AppWidgetProviderInfo r10 = r10.getAppWidgetInfo(r6)
            if (r10 == 0) goto L79
            android.content.ComponentName r10 = r10.provider
            if (r10 == 0) goto L79
            java.lang.String r10 = r10.getClassName()
            if (r10 == 0) goto L79
            java.lang.Class r10 = java.lang.Class.forName(r10)
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r9)
            java.lang.Object r10 = r10.newInstance(r9)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver"
            p715kotlin.jvm.internal.AbstractC22676k.m65748h(r10, r0)
            p6.s0 r10 = (p395p6.AbstractC28916s0) r10
            p6.g0 r10 = r10.mo28930f()
            r0 = r10
            goto L7a
        L79:
            r0 = r9
        L7a:
            if (r0 == 0) goto L94
            p6.f0 r4 = new p6.f0
            r10 = 4
            r4.<init>(r10, r2, r9)
            r5.f117034y = r2
            r3 = 0
            r2 = r11
            java.lang.Object r10 = r0.m87803e(r1, r2, r3, r4, r5)
            if (r10 != r12) goto L8d
            goto La3
        L8d:
            bc3.k1 r10 = (bc3.InterfaceC3027k1) r10
            if (r10 != 0) goto L92
            goto L94
        L92:
            r9 = r10
            goto L99
        L94:
            p6.t r10 = androidx.glance.appwidget.UnmanagedSessionReceiver.f5859a
            p395p6.C28918t.m87834c(r6)
        L99:
            if (r9 == 0) goto La4
            r5.f117034y = r8
            java.lang.Object r10 = r9.join(r5)
            if (r10 != r12) goto La4
        La3:
            return r12
        La4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p395p6.C28925v0.m87836a(p6.v0, p6.b, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final C28893k1 m87837b() {
        C28893k1 c28893k1;
        C3278p c3278p = GlanceRemoteViewsService.f5857w;
        int i13 = this.f117037b;
        int i14 = this.f117038c;
        String str = this.f117039d;
        C3278p c3278p2 = GlanceRemoteViewsService.f5857w;
        synchronized (c3278p2) {
            c28893k1 = (C28893k1) c3278p2.f12803a.get(C3278p.m9546c(i13, i14, str));
            if (c28893k1 == null) {
                c28893k1 = C28893k1.f116947d;
            }
        }
        return c28893k1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return m87837b().f116948a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i13) {
        try {
            return m87837b().f116948a[i13];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i13) {
        try {
            return m87837b().f116949b[i13];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f117036a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return m87837b().f116950c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        m87837b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() throws Throwable {
        AbstractC3006f0.m8699E(C30064k.f122676w, new C22379f(this, (InterfaceC30057d) null, 25));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        C3278p c3278p = GlanceRemoteViewsService.f5857w;
        int i13 = this.f117037b;
        int i14 = this.f117038c;
        String str = this.f117039d;
        C3278p c3278p2 = GlanceRemoteViewsService.f5857w;
        synchronized (c3278p2) {
            c3278p2.f12803a.remove(C3278p.m9546c(i13, i14, str));
        }
    }
}
