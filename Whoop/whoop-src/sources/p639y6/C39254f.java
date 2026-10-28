package p639y6;

import android.content.Context;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p007a6.InterfaceC0422g;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: y6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C39254f implements InterfaceC39249a {

    /* JADX INFO: renamed from: a */
    public static final C39254f f168772a = new C39254f();

    /* JADX INFO: renamed from: b */
    public static final C25437c f168773b = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f168774c = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m125026a(Context context, InterfaceC39255g interfaceC39255g, String str, AbstractC32269c abstractC32269c) {
        C39250b c39250b;
        C25437c c25437c;
        if (abstractC32269c instanceof C39250b) {
            c39250b = (C39250b) abstractC32269c;
            int i13 = c39250b.f168753G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39250b.f168753G = i13 - Integer.MIN_VALUE;
            } else {
                c39250b = new C39250b(this, abstractC32269c);
            }
        } else {
            c39250b = new C39250b(this, abstractC32269c);
        }
        Object obj = c39250b.f168751E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39250b.f168753G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c39250b.f168754w = context;
            c39250b.f168755x = interfaceC39255g;
            c39250b.f168756y = str;
            c25437c = f168773b;
            c39250b.f168757z = c25437c;
            c39250b.f168753G = 1;
            if (c25437c.mo68211b(c39250b) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C25437c c25437c2 = c39250b.f168757z;
            str = c39250b.f168756y;
            interfaceC39255g = c39250b.f168755x;
            Context context2 = c39250b.f168754w;
            AbstractC34132o.m107864I(obj);
            c25437c = c25437c2;
            context = context2;
        }
        try {
            f168774c.remove(str);
            interfaceC39255g.mo87794a(context, str).delete();
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m125027b(Context context, InterfaceC39255g interfaceC39255g, String str, AbstractC32269c abstractC32269c) throws Throwable {
        C39251c c39251c;
        C25437c c25437c;
        InterfaceC25435a interfaceC25435a;
        Object obj;
        String str2;
        Map map;
        if (abstractC32269c instanceof C39251c) {
            c39251c = (C39251c) abstractC32269c;
            int i13 = c39251c.f168760G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39251c.f168760G = i13 - Integer.MIN_VALUE;
            } else {
                c39251c = new C39251c(this, abstractC32269c);
            }
        } else {
            c39251c = new C39251c(this, abstractC32269c);
        }
        Object obj2 = c39251c.f168758E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39251c.f168760G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj2);
                c39251c.f168761w = context;
                c39251c.f168762x = interfaceC39255g;
                c39251c.f168763y = str;
                c25437c = f168773b;
                c39251c.f168764z = c25437c;
                c39251c.f168760G = 1;
                if (c25437c.mo68211b(c39251c) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = c39251c.f168763y;
                map = (Map) c39251c.f168762x;
                interfaceC25435a = (InterfaceC25435a) c39251c.f168761w;
                try {
                    AbstractC34132o.m107864I(obj2);
                    obj = (InterfaceC0422g) obj2;
                    map.put(str2, obj);
                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
                    InterfaceC0422g interfaceC0422g = (InterfaceC0422g) obj;
                    interfaceC25435a.mo68214i(null);
                    return interfaceC0422g;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a.mo68214i(null);
                    throw th;
                }
            }
            C25437c c25437c2 = c39251c.f168764z;
            str = c39251c.f168763y;
            interfaceC39255g = (InterfaceC39255g) c39251c.f168762x;
            Context context2 = (Context) c39251c.f168761w;
            AbstractC34132o.m107864I(obj2);
            c25437c = c25437c2;
            context = context2;
            LinkedHashMap linkedHashMap = f168774c;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                c39251c.f168761w = c25437c;
                c39251c.f168762x = linkedHashMap;
                c39251c.f168763y = str;
                c39251c.f168764z = null;
                c39251c.f168760G = 2;
                Object objMo87795b = interfaceC39255g.mo87795b(context, str);
                if (objMo87795b != enumC31071a) {
                    C25437c c25437c3 = c25437c;
                    obj2 = objMo87795b;
                    str2 = str;
                    interfaceC25435a = c25437c3;
                    map = linkedHashMap;
                    obj = (InterfaceC0422g) obj2;
                    map.put(str2, obj);
                }
                return enumC31071a;
            }
            interfaceC25435a = c25437c;
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore>");
            InterfaceC0422g interfaceC0422g2 = (InterfaceC0422g) obj;
            interfaceC25435a.mo68214i(null);
            return interfaceC0422g2;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a = c25437c;
            interfaceC25435a.mo68214i(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m125028c(Context context, InterfaceC39255g interfaceC39255g, String str, AbstractC32269c abstractC32269c) throws Throwable {
        C39252d c39252d;
        if (abstractC32269c instanceof C39252d) {
            c39252d = (C39252d) abstractC32269c;
            int i13 = c39252d.f168767y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39252d.f168767y = i13 - Integer.MIN_VALUE;
            } else {
                c39252d = new C39252d(this, abstractC32269c);
            }
        } else {
            c39252d = new C39252d(this, abstractC32269c);
        }
        Object objM125027b = c39252d.f168765w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c39252d.f168767y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125027b);
            c39252d.f168767y = 1;
            objM125027b = m125027b(context, interfaceC39255g, str, c39252d);
            if (objM125027b != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM125027b);
            return objM125027b;
        }
        AbstractC34132o.m107864I(objM125027b);
        InterfaceC13058l data = ((InterfaceC0422g) objM125027b).getData();
        c39252d.f168767y = 2;
        Object objM36575A = AbstractC13091v.m36575A(data, c39252d);
        return objM36575A == obj ? obj : objM36575A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Object m125029d(Context context, InterfaceC39255g interfaceC39255g, String str, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C39253e c39253e;
        InterfaceC4351m interfaceC4351m2;
        if (abstractC32269c instanceof C39253e) {
            c39253e = (C39253e) abstractC32269c;
            int i13 = c39253e.f168771z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39253e.f168771z = i13 - Integer.MIN_VALUE;
            } else {
                c39253e = new C39253e(this, abstractC32269c);
            }
        } else {
            c39253e = new C39253e(this, abstractC32269c);
        }
        Object objM125027b = c39253e.f168769x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c39253e.f168771z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125027b);
            c39253e.f168768w = (AbstractC32275i) interfaceC4351m;
            c39253e.f168771z = 1;
            objM125027b = m125027b(context, interfaceC39255g, str, c39253e);
            if (objM125027b != obj) {
            }
            interfaceC4351m2 = interfaceC4351m;
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM125027b);
            return objM125027b;
        }
        InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) c39253e.f168768w;
        AbstractC34132o.m107864I(objM125027b);
        interfaceC4351m2 = interfaceC4351m3;
        interfaceC4351m2 = interfaceC4351m;
        c39253e.f168768w = null;
        c39253e.f168771z = 2;
        Object objMo1102a = ((InterfaceC0422g) objM125027b).mo1102a(interfaceC4351m2, c39253e);
        if (objMo1102a != obj) {
            return objMo1102a;
        }
        interfaceC4351m2 = interfaceC4351m;
        return obj;
    }
}
