package p395p6;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import dc1.C11906c;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hc3.C17171d;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25262p;
import m83.C25271y;
import m83.C25272z;
import n20.C26175j;
import o23.C27486p;
import p007a6.InterfaceC0422g;
import p023ay.C2147u;
import p109e6.C12746a;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: p6.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28901n0 {

    /* JADX INFO: renamed from: d */
    public static final C28889j0 f116983d = new C28889j0();

    /* JADX INFO: renamed from: e */
    public static final C12746a f116984e;

    /* JADX INFO: renamed from: f */
    public static InterfaceC0422g f116985f;

    /* JADX INFO: renamed from: g */
    public static final C14132d f116986g;

    /* JADX INFO: renamed from: a */
    public final Context f116987a;

    /* JADX INFO: renamed from: b */
    public final AppWidgetManager f116988b;

    /* JADX INFO: renamed from: c */
    public final C23470p f116989c = AbstractC30060g.m92088H(new C25262p(this, 9));

    static {
        String name = "GlanceAppWidgetManager-" + Application.getProcessName();
        C11906c c11906c = new C11906c(18);
        C22365e c22365e = AbstractC3050q0.f12077a;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        AbstractC22676k.m65750j(name, "name");
        f116984e = new C12746a(name, c17171dM8708b, c11906c);
        f116986g = AbstractC15751g.m44442V("list::Providers");
    }

    public C28901n0(Context context) {
        this.f116987a = context;
        this.f116988b = AppWidgetManager.getInstance(context);
    }

    /* JADX INFO: renamed from: a */
    public final Object m87819a(AbstractC32275i abstractC32275i) {
        String packageName = this.f116987a.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.f116988b.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (AbstractC22676k.m65745e(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object objMo1102a = ((InterfaceC0422g) this.f116989c.getValue()).mo1102a(new C27486p(AbstractC25265s.m74103I1(arrayList2), null, 3), abstractC32275i);
        return objMo1102a == EnumC31071a.f128113w ? objMo1102a : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m87820b(Class cls, InterfaceC30057d interfaceC30057d) {
        C28895l0 c28895l0;
        if (interfaceC30057d instanceof C28895l0) {
            c28895l0 = (C28895l0) interfaceC30057d;
            int i13 = c28895l0.f116968z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28895l0.f116968z = i13 - Integer.MIN_VALUE;
            } else {
                c28895l0 = new C28895l0(this, interfaceC30057d);
            }
        } else {
            c28895l0 = new C28895l0(this, interfaceC30057d);
        }
        Object objM87821c = c28895l0.f116966x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28895l0.f116968z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM87821c);
            c28895l0.f116965w = cls;
            c28895l0.f116968z = 1;
            objM87821c = m87821c(c28895l0);
            if (objM87821c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = c28895l0.f116965w;
            AbstractC34132o.m107864I(objM87821c);
        }
        C28892k0 c28892k0 = (C28892k0) objM87821c;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no canonical provider name");
        }
        List list = (List) c28892k0.f116946b.get(canonicalName);
        if (list == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = this.f116988b.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i15 : appWidgetIds) {
                arrayList2.add(new C28864b(i15));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m87821c(AbstractC32269c abstractC32269c) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C28898m0 c28898m0;
        C28901n0 c28901n0;
        AbstractC14134f abstractC14134f;
        C28901n0 c28901n1;
        String packageName;
        Set<String> set;
        ArrayList arrayList;
        ComponentName componentName;
        String str;
        C23465k c23465k;
        if (abstractC32269c instanceof C28898m0) {
            c28898m0 = (C28898m0) abstractC32269c;
            int i13 = c28898m0.f116978z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28898m0.f116978z = i13 - Integer.MIN_VALUE;
            } else {
                c28898m0 = new C28898m0(this, abstractC32269c);
            }
        } else {
            c28898m0 = new C28898m0(this, abstractC32269c);
        }
        Object objM36575A = c28898m0.f116976x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28898m0.f116978z;
        C23470p c23470p = this.f116989c;
        C28889j0 c28889j0 = f116983d;
        C14132d c14132d = f116986g;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = ((InterfaceC0422g) c23470p.getValue()).getData();
            c28898m0.f116975w = this;
            c28898m0.f116978z = 1;
            objM36575A = AbstractC13091v.m36575A(data, c28898m0);
            if (objM36575A != enumC31071a) {
                c28901n0 = this;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c28901n0 = c28898m0.f116975w;
            AbstractC34132o.m107864I(objM36575A);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28901n1 = c28898m0.f116975w;
            AbstractC34132o.m107864I(objM36575A);
        }
        abstractC14134f = (AbstractC14134f) objM36575A;
        c28901n0 = c28901n1;
        packageName = c28901n0.f116987a.getPackageName();
        set = (Set) abstractC14134f.mo40227b(c14132d);
        if (set == null) {
            C25272z c25272z = C25272z.f99163w;
            return new C28892k0(c25272z, c25272z);
        }
        arrayList = new ArrayList();
        for (String str2 : set) {
            componentName = new ComponentName(packageName, str2);
            str = (String) abstractC14134f.mo40227b(C28889j0.m87811a(c28889j0, str2));
            if (str == null) {
                c23465k = null;
            } else {
                c23465k = new C23465k(componentName, str);
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList);
        return new C28892k0(mapM74000i0, AbstractC37926s0.m121471i(mapM74000i0));
        if (((AbstractC14134f) objM36575A).mo40227b(c14132d) == null) {
            objM36575A = null;
        }
        abstractC14134f = (AbstractC14134f) objM36575A;
        if (abstractC14134f == null) {
            c28898m0.f116975w = c28901n0;
            c28898m0.f116978z = 2;
            List<AppWidgetProviderInfo> installedProviders = this.f116988b.getInstalledProviders();
            ArrayList<AppWidgetProviderInfo> arrayList2 = new ArrayList();
            for (Object obj : installedProviders) {
                if (AbstractC22676k.m65745e(((AppWidgetProviderInfo) obj).provider.getPackageName(), this.f116987a.getPackageName())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (AppWidgetProviderInfo appWidgetProviderInfo : arrayList2) {
                c28889j0.getClass();
                Object objNewInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                AbstractC28916s0 abstractC28916s0 = objNewInstance instanceof AbstractC28916s0 ? (AbstractC28916s0) objNewInstance : null;
                if (abstractC28916s0 != null) {
                    arrayList3.add(abstractC28916s0);
                }
            }
            objM36575A = ((InterfaceC0422g) c23470p.getValue()).mo1102a(new C27486p(arrayList3, interfaceC30057d, 2), c28898m0);
            if (objM36575A != enumC31071a) {
                c28901n1 = c28901n0;
                abstractC14134f = (AbstractC14134f) objM36575A;
                c28901n0 = c28901n1;
            }
            return enumC31071a;
        }
        packageName = c28901n0.f116987a.getPackageName();
        set = (Set) abstractC14134f.mo40227b(c14132d);
        if (set == null) {
            C25272z c25272z2 = C25272z.f99163w;
            return new C28892k0(c25272z2, c25272z2);
        }
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            componentName = new ComponentName(packageName, str2);
            str = (String) abstractC14134f.mo40227b(C28889j0.m87811a(c28889j0, str2));
            if (str == null) {
                c23465k = null;
            } else {
                c23465k = new C23465k(componentName, str);
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        Map mapM74000i1 = AbstractC25247g0.m74000i0(arrayList);
        return new C28892k0(mapM74000i1, AbstractC37926s0.m121471i(mapM74000i1));
    }

    /* JADX INFO: renamed from: d */
    public final Object m87822d(AbstractC28916s0 abstractC28916s0, AbstractC28880g0 abstractC28880g0, C26175j c26175j) {
        f116983d.getClass();
        String canonicalName = abstractC28916s0.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = abstractC28880g0.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objMo1102a = ((InterfaceC0422g) this.f116989c.getValue()).mo1102a(new C2147u(canonicalName, canonicalName2, null, 18), c26175j);
        return objMo1102a == EnumC31071a.f128113w ? objMo1102a : C23454a0.f92919a;
    }
}
