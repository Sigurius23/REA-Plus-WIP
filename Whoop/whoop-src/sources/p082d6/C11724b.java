package p082d6;

import a11.C0134l;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l83.C23470p;
import m83.AbstractC25265s;
import p007a6.C0448q;
import p109e6.C12754i;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11724b {

    /* JADX INFO: renamed from: a */
    public final C0448q f37880a;

    /* JADX INFO: renamed from: b */
    public final C12754i f37881b;

    /* JADX INFO: renamed from: c */
    public final Context f37882c;

    /* JADX INFO: renamed from: d */
    public final String f37883d;

    /* JADX INFO: renamed from: e */
    public final C23470p f37884e;

    /* JADX INFO: renamed from: f */
    public final Set f37885f;

    public C11724b(Context context, String str, Set keysToMigrate, C0448q c0448q, C12754i c12754i) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(keysToMigrate, "keysToMigrate");
        C0134l c0134l = new C0134l(15, context, str);
        this.f37880a = c0448q;
        this.f37881b = c12754i;
        this.f37882c = context;
        this.f37883d = str;
        this.f37884e = AbstractC30060g.m92088H(c0134l);
        this.f37885f = keysToMigrate == AbstractC11725c.f37886a ? null : AbstractC25265s.m74101H1(keysToMigrate);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m31328a(Object obj, AbstractC32269c abstractC32269c) throws Throwable {
        C11723a c11723a;
        if (abstractC32269c instanceof C11723a) {
            c11723a = (C11723a) abstractC32269c;
            int i13 = c11723a.f37879y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11723a.f37879y = i13 - Integer.MIN_VALUE;
            } else {
                c11723a = new C11723a(this, abstractC32269c);
            }
        } else {
            c11723a = new C11723a(this, abstractC32269c);
        }
        Object objInvoke = c11723a.f37877w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11723a.f37879y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            c11723a.f37879y = 1;
            objInvoke = this.f37880a.invoke(obj, c11723a);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        C23470p c23470p = this.f37884e;
        Set set = this.f37885f;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) c23470p.getValue()).getAll();
            AbstractC22676k.m65749i(all, "getAll(...)");
            if (all.isEmpty()) {
                z4 = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) c23470p.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z4 = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z4 = false;
            }
        }
        return Boolean.valueOf(z4);
    }
}
