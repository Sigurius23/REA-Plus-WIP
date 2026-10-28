package p30;

import ai.C0904j;
import android.content.Context;
import bc3.AbstractC3006f0;
import gm.C15990r;
import l30.C23294c;
import l30.C23296e;
import l83.C23467m;
import n30.C26212c;
import o30.C27508f;
import p012ab.C0682h0;
import p077d0.C11387o2;
import p078d1.C11457j;
import p127ev.C13668i;
import p279kd.C22379f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29922o0;
import q30.C29924p0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s30.C32101c;

/* JADX INFO: renamed from: p30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C28789a {

    /* JADX INFO: renamed from: a */
    public final C29924p0 f116557a;

    /* JADX INFO: renamed from: b */
    public final C26212c f116558b;

    /* JADX INFO: renamed from: c */
    public final C11457j f116559c;

    public C28789a(Context context, boolean z4, InterfaceC30063j interfaceC30063j) {
        Object objM107888l;
        C32101c c32101c = C32101c.f133102a;
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        C26212c c26212c = new C26212c(applicationContext, null, null, z4 ? C29922o0.f122221d : C29922o0.f122220c, 246);
        C27508f c27508f = new C27508f(c26212c);
        C23294c c23294c = new C23294c();
        C29924p0 c29924p0 = new C29924p0();
        try {
            objM107888l = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        int iIntValue = ((Number) (objM107888l instanceof C23467m ? -1 : objM107888l)).intValue();
        C0682h0 c0682h0 = new C0682h0(context, iIntValue, interfaceC30063j);
        C0904j c0904j = new C0904j();
        c0904j.f3302x = c0682h0;
        c0904j.f3301w = iIntValue;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(interfaceC30063j), null, null, new C22379f(c0904j, (InterfaceC30057d) null, 6), 3);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
        C23296e c23296e = new C23296e(applicationContext2, c0904j, c29924p0);
        C11387o2 c11387o2 = new C11387o2(4);
        C15990r c15990r = new C15990r(c27508f, c26212c);
        C13668i c13668i = new C13668i();
        c13668i.f48454a = c23296e;
        c13668i.f48455b = c11387o2;
        c13668i.f48456c = c23294c;
        c13668i.f48457d = c0904j;
        c13668i.f48458e = c15990r;
        c13668i.f48459f = c29924p0;
        c13668i.f48460g = "3DS_LOA_SDK_STIN_020200_00960";
        c13668i.f48461h = c26212c;
        c13668i.f48462i = interfaceC30063j;
        C11457j c11457j = new C11457j(27, c13668i, c27508f);
        c23294c.m67388a();
        AbstractC22676k.m65749i(context.getApplicationContext(), "getApplicationContext(...)");
        this.f116557a = c29924p0;
        this.f116558b = c26212c;
        this.f116559c = c11457j;
    }
}
