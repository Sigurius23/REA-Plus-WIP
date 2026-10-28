package p395p6;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import androidx.glance.appwidget.protobuf.InterfaceC1380e0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p451r6.C30965s;
import p451r6.C30967u;
import p505ts.AbstractC34132o;
import p639y6.C39254f;
import q83.InterfaceC30062i;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v63.AbstractC35750h;

/* JADX INFO: renamed from: p6.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C28918t implements InterfaceC30062i {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ C28918t f117028w = new C28918t();

    /* JADX INFO: renamed from: a */
    public static final AbstractC28916s0 m87832a(String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        if (objNewInstance instanceof AbstractC28916s0) {
            return (AbstractC28916s0) objNewInstance;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m87833b(Context context, C28864b c28864b) {
        if (c28864b != null) {
            int i13 = c28864b.f116802a;
            if (Integer.MIN_VALUE > i13 || i13 >= -1) {
                try {
                    AbstractC35750h.m113273b(context, "appWidgetLayout-" + i13).delete();
                } catch (Exception e5) {
                    Log.d("GlanceAppWidget", "Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id " + c28864b, e5);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m87834c(int i13) {
        synchronized (UnmanagedSessionReceiver.f5859a) {
            if (UnmanagedSessionReceiver.f5860b.get(Integer.valueOf(i13)) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m87835d(Context context, int i13, AbstractC32269c abstractC32269c) throws Throwable {
        C28934y0 c28934y0;
        C30965s c30965sM95250q;
        if (abstractC32269c instanceof C28934y0) {
            c28934y0 = (C28934y0) abstractC32269c;
            int i14 = c28934y0.f117066E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c28934y0.f117066E = i14 - Integer.MIN_VALUE;
            } else {
                c28934y0 = new C28934y0(this, abstractC32269c);
            }
        } else {
            c28934y0 = new C28934y0(this, abstractC32269c);
        }
        Object objM125028c = c28934y0.f117069y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c28934y0.f117066E;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM125028c);
                c28934y0.f117067w = context;
                c28934y0.f117068x = i13;
                c28934y0.f117066E = 1;
                objM125028c = C39254f.f168772a.m125028c(context, C28878f1.f116874a, "appWidgetLayout-" + i13, c28934y0);
                if (objM125028c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = c28934y0.f117068x;
                context = c28934y0.f117067w;
                AbstractC34132o.m107864I(objM125028c);
            }
            c30965sM95250q = (C30965s) objM125028c;
        } catch (CorruptionException e5) {
            Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + i13 + " is corrupted", e5);
            c30965sM95250q = C30965s.m95250q();
        } catch (IOException e13) {
            Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + i13, e13);
            c30965sM95250q = C30965s.m95250q();
        }
        Context context2 = context;
        int i16 = i13;
        InterfaceC1380e0<C30967u> interfaceC1380e0M95252r = c30965sM95250q.m95252r();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(interfaceC1380e0M95252r, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (C30967u c30967u : interfaceC1380e0M95252r) {
            linkedHashMap.put(c30967u.m95257p(), new Integer(c30967u.m95258q()));
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap);
        return new C28936z0(context2, linkedHashMapM74003l0, c30965sM95250q.m95253s(), i16, AbstractC25265s.m74101H1(linkedHashMapM74003l0.values()));
    }
}
