package p026b2;

import al.AbstractC0954a;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import c93.InterfaceC4351m;
import gb.C15656q;
import i63.AbstractC18179r;
import i63.C18187z;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p027b3.AbstractC2346a;
import p040c0.AbstractC3736e1;
import p040c0.C3739f1;
import p040c0.EnumC3771q0;
import p079d2.ViewOnAttachStateChangeListenerC11482d;
import p209i3.C18034p;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22681m0;
import ud3.C34830n0;
import uf3.C34911a;
import wb3.AbstractC37056f;
import xf3.C38266c;
import y53.AbstractC39248h;

/* JADX INFO: renamed from: b2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2312r extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9128w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9129x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2312r(Object obj, int i13) {
        super(2);
        this.f9128w = i13;
        this.f9129x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f9128w;
        boolean z4 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f9129x;
        switch (i13) {
            case 0:
                Modifier modifier = (Modifier) obj;
                Modifier modifierM118961M = (InterfaceC2315u) obj2;
                Composer composer = (Composer) obj3;
                if (modifierM118961M instanceof C2310p) {
                    Function3 function3 = ((C2310p) modifierM118961M).f9126x;
                    AbstractC22681m0.m65774e(3, function3);
                    modifierM118961M = AbstractC37056f.m118961M(composer, (Modifier) function3.invoke(C2314t.f9131w, composer, 0));
                }
                return modifier.mo3471e(modifierM118961M);
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer2;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractC2346a) obj3).mo3598a(c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                return c23454a0;
            case 2:
                ((Number) obj2).intValue();
                ((ComposeView) obj3).mo3598a((Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 3:
                EnumC3771q0 enumC3771q0 = (EnumC3771q0) obj;
                EnumC3771q0 enumC3771q1 = (EnumC3771q0) obj2;
                EnumC3771q0 enumC3771q2 = EnumC3771q0.f15394y;
                if (enumC3771q0 == enumC3771q2 && enumC3771q1 == enumC3771q2 && !((C3739f1) ((AbstractC3736e1) obj3)).f15302c.f15434e) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 4:
                ((ViewOnAttachStateChangeListenerC11482d) obj3).m30904l(((Number) obj).intValue(), (C18034p) obj2);
                return c23454a0;
            case 5:
                ((Number) obj2).intValue();
                AbstractC1772c1.m5384a((C15656q) obj3, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 6:
                C38266c single = (C38266c) obj;
                C34911a it = (C34911a) obj2;
                AbstractC22676k.m65750j(single, "$this$single");
                AbstractC22676k.m65750j(it, "it");
                return (Context) obj3;
            case 7:
                String key = (String) obj;
                List values = (List) obj2;
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(values, "values");
                ((C18187z) obj3).f70542i.mo2297E(key, values);
                return c23454a0;
            case 8:
                String name = (String) obj;
                List values2 = (List) obj2;
                AbstractC22676k.m65750j(name, "name");
                AbstractC22676k.m65750j(values2, "values");
                ((AbstractC0954a) obj3).mo2297E(name, values2);
                return c23454a0;
            case 9:
                String key2 = (String) obj;
                List values3 = (List) obj2;
                C2312r c2312r = (C2312r) obj3;
                AbstractC22676k.m65750j(key2, "key");
                AbstractC22676k.m65750j(values3, "values");
                List list = AbstractC18179r.f70507a;
                if (!"Content-Length".equals(key2) && !"Content-Type".equals(key2)) {
                    if (AbstractC39248h.f168750a.contains(key2)) {
                        Iterator it3 = values3.iterator();
                        while (it3.hasNext()) {
                            c2312r.invoke(key2, (String) it3.next());
                        }
                    } else {
                        c2312r.invoke(key2, AbstractC25265s.m74110N0(values3, ",", null, null, null, 62));
                    }
                }
                return c23454a0;
            default:
                String key3 = (String) obj;
                String value = (String) obj2;
                AbstractC22676k.m65750j(key3, "key");
                AbstractC22676k.m65750j(value, "value");
                List list2 = AbstractC18179r.f70507a;
                if (!key3.equals("Content-Length")) {
                    ((C34830n0) obj3).m109900a(key3, value);
                }
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2312r(Object obj, int i13, int i14) {
        super(2);
        this.f9128w = i14;
        this.f9129x = obj;
    }
}
