package p545v6;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import cd3.AbstractC4457i;
import g40.AbstractC15327b3;
import g40.C15425t2;
import g40.InterfaceC15361h1;
import g40.InterfaceC15421s3;
import g40.InterfaceC15450y2;
import h02.C16602z;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l40.C23328a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32072d;
import p549vb.AbstractC35862g;
import p636y3.C39180l;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.C36198b;
import uf3.C34911a;
import vo1.AbstractC36229d;
import vo1.C36226a;
import vy0.AbstractC36588p;
import vy0.C36590r;
import w31.AbstractC36791e;
import w31.EnumC36788b;
import w60.C36859g;
import w60.C36860h;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import wi0.AbstractC37313e;
import wo1.AbstractC37471t;
import wo1.C37436a;
import wq1.C37511e;
import wt0.C37618a;
import xc3.AbstractC38195a;
import xf3.C38266c;
import y00.EnumC38853i;

/* JADX INFO: renamed from: v6.q */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C35728q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151980w;

    public /* synthetic */ C35728q(int i13) {
        this.f151980w = 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        ?? arrayList;
        switch (this.f151980w) {
            case 0:
                ((C35723l) obj).f151967c = (InterfaceC26398o) obj2;
                return C23454a0.f92919a;
            case 1:
                ((C35723l) obj).f151969e = ((C35713b) obj2).f151946a;
                return C23454a0.f92919a;
            case 2:
                ((C35723l) obj).f151968d = ((C35712a) obj2).f151945a;
                return C23454a0.f92919a;
            case 3:
                ((C35724m) obj).f151970a = (InterfaceC26398o) obj2;
                return C23454a0.f92919a;
            case 4:
                return C36198b.m115191c((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return C36226a.m115377e((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC36229d.m115386F(((Integer) obj).intValue(), (String) obj2);
            case 7:
                return AbstractC36588p.m117400L0((C39180l) obj, (C39180l) obj2);
            case 8:
                return C36590r.m117507e((Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return C36590r.m117508f((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                ((Integer) obj2).getClass();
                AbstractC32072d.m99696e((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 11:
                return AbstractC36791e.m117905q((EnumC36788b) obj, (EnumC36788b) obj2);
            case 12:
                return C36859g.m118206c((Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return C36860h.m118213g((Composer) obj, ((Integer) obj2).intValue());
            case 14:
                InterfaceC21461d clazz = (InterfaceC21461d) obj;
                List types = (List) obj2;
                AbstractC22676k.m65750j(clazz, "clazz");
                AbstractC22676k.m65750j(types, "types");
                ArrayList arrayListM113848k = AbstractC35862g.m113848k(AbstractC4457i.f17965a, types, true);
                AbstractC22676k.m65747g(arrayListM113848k);
                return AbstractC35862g.m113844g(clazz, arrayListM113848k, new C16602z(types, 4));
            case 15:
                InterfaceC21461d clazz2 = (InterfaceC21461d) obj;
                List types2 = (List) obj2;
                AbstractC22676k.m65750j(clazz2, "clazz");
                AbstractC22676k.m65750j(types2, "types");
                ArrayList arrayListM113848k2 = AbstractC35862g.m113848k(AbstractC4457i.f17965a, types2, true);
                AbstractC22676k.m65747g(arrayListM113848k2);
                InterfaceC37138c interfaceC37138cM113844g = AbstractC35862g.m113844g(clazz2, arrayListM113848k2, new C16602z(types2, 5));
                if (interfaceC37138cM113844g != null) {
                    return AbstractC38195a.m122336d(interfaceC37138cM113844g);
                }
                return null;
            case 16:
                return AbstractC37313e.m119521q((String) obj, ((Boolean) obj2).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C37436a.m119844c((Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37471t.m120135m(((Integer) obj).intValue(), (String) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C37511e.m120266h((Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return C37618a.m120852d((C38266c) obj, (C34911a) obj2);
            case 21:
                return C37618a.m120853e((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                List<InterfaceC15450y2> fields = (List) obj;
                Set hiddenIdentifiers = (Set) obj2;
                AbstractC22676k.m65750j(fields, "fields");
                AbstractC22676k.m65750j(hiddenIdentifiers, "hiddenIdentifiers");
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC15450y2 interfaceC15450y2 : fields) {
                    if (interfaceC15450y2 instanceof C15425t2) {
                        List list = ((C15425t2) interfaceC15450y2).f57975b;
                        arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!hiddenIdentifiers.contains(((AbstractC15327b3) obj3).mo43531a())) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        List listM118958J = AbstractC37056f.m118958J(interfaceC15450y2);
                        if (hiddenIdentifiers.contains(interfaceC15450y2.mo43531a())) {
                            arrayList = listM118958J;
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = C25271y.f99162w;
                        }
                    }
                    AbstractC25265s.m74141p0(arrayList2, (Iterable) arrayList);
                }
                return arrayList2;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC15421s3 fieldState = (InterfaceC15421s3) obj2;
                AbstractC22676k.m65750j(fieldState, "fieldState");
                InterfaceC15361h1 interfaceC15361h1Mo43602f = fieldState.mo43602f();
                if (interfaceC15361h1Mo43602f == null || !zBooleanValue) {
                    return null;
                }
                return interfaceC15361h1Mo43602f;
            case 24:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                String value = (String) obj2;
                AbstractC22676k.m65750j(value, "value");
                return new C23328a(value, zBooleanValue2);
            case 25:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                String value2 = (String) obj2;
                AbstractC22676k.m65750j(value2, "value");
                return new C23328a(value2, zBooleanValue3);
            case 26:
                List choices = (List) obj;
                EnumC38853i selected = (EnumC38853i) obj2;
                AbstractC22676k.m65750j(choices, "choices");
                AbstractC22676k.m65750j(selected, "selected");
                EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74146r1(choices);
                return enumC38853i == null ? selected : enumC38853i;
            case 27:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                InterfaceC15421s3 fieldState2 = (InterfaceC15421s3) obj2;
                AbstractC22676k.m65750j(fieldState2, "fieldState");
                InterfaceC15361h1 interfaceC15361h1Mo43602f2 = fieldState2.mo43602f();
                if (interfaceC15361h1Mo43602f2 == null || !zBooleanValue4) {
                    return null;
                }
                return interfaceC15361h1Mo43602f2;
            case 28:
                return new C23328a((String) obj2, ((Boolean) obj).booleanValue());
            default:
                return new C23328a((String) obj2, ((Boolean) obj).booleanValue());
        }
    }

    public /* synthetic */ C35728q(int i13, byte b) {
        this.f151980w = i13;
    }
}
