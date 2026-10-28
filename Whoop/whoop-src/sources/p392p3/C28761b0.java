package p392p3;

import ad3.AbstractC0757c;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1807l1;
import b63.C2764b;
import c93.InterfaceC4339a;
import com.google.gson.Gson;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternTileModel;
import dc1.C11906c;
import hs1.C17605b;
import io.sentry.InterfaceC20259b1;
import j93.AbstractC21478l0;
import java.util.Map;
import jb1.C21535a;
import kk0.C22538a;
import l83.C23454a0;
import p163g1.EnumC14960b2;
import p218ic.C18358g;
import p218ic.EnumC18371m0;
import p249jc.C21567b;
import p31.AbstractC28799j;
import p31.C28800k;
import p31.C28801l;
import p389p0.C28539n0;
import p411q2.InterfaceC29805a;
import p420qc.C30194d;
import p420qc.C30195e;
import p420qc.C30198h;
import p420qc.C30199i;
import p420qc.C30201k;
import p420qc.C30202l;
import p420qc.C30212v;
import p420qc.C30213w;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.AbstractC36215s;
import pf.AbstractC29125c;
import rr2.C31778o;
import td1.C33706d;
import tm1.AbstractC33953b;
import to1.AbstractC34019l;
import tr2.C34109g;
import tr2.C34110h;
import v71.C35765f;
import v71.C35768i;
import x02.AbstractC37803b;
import x71.AbstractC38040b;
import x71.C38042d;
import yt0.C39767f;
import zt0.C41124b;

/* JADX INFO: renamed from: p3.b0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C28761b0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116505w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f116506x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f116507y;

    public /* synthetic */ C28761b0(int i13, Object obj, Object obj2) {
        this.f116505w = i13;
        this.f116506x = obj;
        this.f116507y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f116505w) {
            case 0:
                C28539n0 c28539n0 = (C28539n0) this.f116506x;
                C28759a0 c28759a0 = (C28759a0) this.f116507y;
                InterfaceC28767e0 interfaceC28767e0 = (InterfaceC28767e0) obj;
                synchronized (((C21567b) c28539n0.f115462x)) {
                    try {
                        if (interfaceC28767e0.mo87527b()) {
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return C23454a0.f92919a;
            case 1:
                return C28800k.m87587e((Function1) this.f116506x, (C28801l) this.f116507y, (AbstractC28799j) obj);
            case 2:
                C30195e c30195e = (C30195e) this.f116506x;
                C30194d c30194d = (C30194d) this.f116507y;
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                c30195e.f123593b.insert(_connection, c30194d);
                return C23454a0.f92919a;
            case 3:
                C30199i c30199i = (C30199i) this.f116506x;
                C30198h c30198h = (C30198h) this.f116507y;
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                c30199i.f123602b.insert(_connection2, c30198h);
                return C23454a0.f92919a;
            case 4:
                C30202l c30202l = (C30202l) this.f116506x;
                C30201k c30201k = (C30201k) this.f116507y;
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                c30202l.f123608b.insert(_connection3, c30201k);
                return C23454a0.f92919a;
            case 5:
                EnumC18371m0 enumC18371m0 = (EnumC18371m0) this.f116506x;
                String str = (String) this.f116507y;
                InterfaceC33687a _connection4 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection4, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection4.mo68212g1("UPDATE workspec SET state=? WHERE id=?");
                try {
                    interfaceC33689cMo68212g1.mo5356p(1, AbstractC21478l0.m60424b0(enumC18371m0));
                    interfaceC33689cMo68212g1.mo5354L(2, str);
                    interfaceC33689cMo68212g1.mo5355e1();
                    return Integer.valueOf(AbstractC21478l0.m60402H(_connection4));
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 6:
                C18358g c18358g = (C18358g) this.f116506x;
                String str2 = (String) this.f116507y;
                InterfaceC33687a _connection5 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection5, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection5.mo68212g1("UPDATE workspec SET output=? WHERE id=?");
                try {
                    C18358g c18358g2 = C18358g.f71479b;
                    interfaceC33689cMo68212g2.mo5357q(1, AbstractC29125c.m88515X(c18358g));
                    interfaceC33689cMo68212g2.mo5354L(2, str2);
                    interfaceC33689cMo68212g2.mo5355e1();
                    return C23454a0.f92919a;
                } finally {
                    interfaceC33689cMo68212g2.close();
                }
            case 7:
                C30213w c30213w = (C30213w) this.f116506x;
                C30212v c30212v = (C30212v) this.f116507y;
                InterfaceC33687a _connection6 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection6, "_connection");
                c30213w.f123671b.insert(_connection6, c30212v);
                return C23454a0.f92919a;
            case 8:
                return C31778o.m98671D((String) this.f116506x, (Map) this.f116507y, (InterfaceC20259b1) obj);
            case 9:
                return C33706d.m106523U((C33706d) this.f116506x, (C22538a) this.f116507y, (Byte) obj);
            case 10:
                return AbstractC33953b.m107398e((C17605b) this.f116506x, (Function1) this.f116507y, obj);
            case 11:
                return AbstractC34019l.m107524G((AbstractC0757c) this.f116506x, (C21535a) this.f116507y, (CyclePatternTileModel) obj);
            case 12:
                return ((C34109g) this.f116506x).m107831y((C34110h) this.f116507y, (InterfaceC33687a) obj);
            case 13:
                return C34109g.m107832z((String) this.f116506x, (C1807l1) this.f116507y, (InterfaceC33687a) obj);
            case 14:
                return C35765f.m113329g((Function1) this.f116506x, (C35768i) this.f116507y, obj);
            case 15:
                Function1 function1 = (Function1) this.f116506x;
                C11906c c11906c = (C11906c) this.f116507y;
                function1.invoke(obj);
                c11906c.invoke(obj);
                return C23454a0.f92919a;
            case 16:
                return Boolean.valueOf(AbstractC36215s.m115276i((InterfaceC4339a) this.f116506x, (InterfaceC29805a) this.f116507y, (EnumC14960b2) obj));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37803b.m121316h((AbstractC0757c) this.f116506x, (Gson) this.f116507y, (C2764b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC38040b.m121793g((C38042d) this.f116506x, (Function1) this.f116507y, (Modifier) obj);
            default:
                return ((C39767f) this.f116506x).m127312u((C41124b) this.f116507y, (InterfaceC33687a) obj);
        }
    }
}
