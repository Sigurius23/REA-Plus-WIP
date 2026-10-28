package p510u0;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.whoopaction.domain.models.Action;
import d30.C11570x;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemAdapter;
import java.util.List;
import jb1.C21536b;
import l83.C23454a0;
import p133f1.C13941g1;
import p180h0.EnumC16377d2;
import p185h6.C16955j;
import p208i2.C17924z0;
import p209i3.AbstractC18039u;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p294l3.AbstractC23284v;
import p294l3.C23250e;
import p294l3.C23267m0;
import p294l3.C23279s0;
import p294l3.C23283u0;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p412q3.C29870f;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import u01.AbstractC34382d;
import u10.AbstractC34428p;
import u11.AbstractC34443i;
import u21.AbstractC34483c;
import u22.C34494i;
import u31.AbstractC34504e;
import u51.AbstractC34544c;
import u70.AbstractC34561a;
import u71.AbstractC34568b;
import wb3.AbstractC37056f;
import yb3.C39410n;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: u0.r */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C34350r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144295w;

    public /* synthetic */ C34350r(int i13) {
        this.f144295w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0204  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        C23279s0 c23279s0Mo67353b;
        C23267m0 c23267m0;
        int i13 = this.f144295w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return c23454a0;
            case 1:
                return c23454a0;
            case 2:
                C13941g1 c13941g1 = (C13941g1) obj;
                String str = c13941g1.f49701g.f92135x;
                long j7 = c13941g1.f49700f;
                int i14 = C23283u0.f92252c;
                int i15 = (int) (j7 & 4294967295L);
                if (i15 > 0) {
                    C16955j c16955jM108639q = AbstractC34339n0.m108639q();
                    if (c16955jM108639q != null) {
                        int iM47710b = c16955jM108639q.m47710b(i15 - 1, str);
                        if (iM47710b >= 0) {
                            iOffsetByCodePoints = iM47710b;
                        } else if (i15 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i15, -1);
                        }
                    } else if (i15 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i15, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new C29870f(((int) (c13941g1.f49700f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 3:
                C13941g1 c13941g2 = (C13941g1) obj;
                String str2 = c13941g2.f49701g.f92135x;
                long j13 = c13941g2.f49700f;
                int i16 = C23283u0.f92252c;
                int iM108635m = AbstractC34339n0.m108635m((int) (j13 & 4294967295L), str2);
                if (iM108635m != -1) {
                    return new C29870f(0, iM108635m - ((int) (c13941g2.f49700f & 4294967295L)));
                }
                return null;
            case 4:
                C13941g1 c13941g3 = (C13941g1) obj;
                Integer numM39716e = c13941g3.m39716e();
                if (numM39716e == null) {
                    return null;
                }
                int iIntValue = numM39716e.intValue();
                long j14 = c13941g3.f49700f;
                int i17 = C23283u0.f92252c;
                return new C29870f(((int) (j14 & 4294967295L)) - iIntValue, 0);
            case 5:
                C13941g1 c13941g4 = (C13941g1) obj;
                Integer numM39715d = c13941g4.m39715d();
                if (numM39715d == null) {
                    return null;
                }
                int iIntValue2 = numM39715d.intValue();
                long j15 = c13941g4.f49700f;
                int i18 = C23283u0.f92252c;
                return new C29870f(0, iIntValue2 - ((int) (j15 & 4294967295L)));
            case 6:
                C13941g1 c13941g5 = (C13941g1) obj;
                Integer numM39714c = c13941g5.m39714c();
                if (numM39714c == null) {
                    return null;
                }
                int iIntValue3 = numM39714c.intValue();
                long j16 = c13941g5.f49700f;
                int i19 = C23283u0.f92252c;
                return new C29870f(((int) (j16 & 4294967295L)) - iIntValue3, 0);
            case 7:
                C13941g1 c13941g6 = (C13941g1) obj;
                Integer numM39713b = c13941g6.m39713b();
                if (numM39713b == null) {
                    return null;
                }
                int iIntValue4 = numM39713b.intValue();
                long j17 = c13941g6.f49700f;
                int i24 = C23283u0.f92252c;
                return new C29870f(0, iIntValue4 - ((int) (j17 & 4294967295L)));
            case 8:
                List list = (List) obj;
                Object obj2 = list.get(1);
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                EnumC16377d2 enumC16377d2 = ((Boolean) obj2).booleanValue() ? EnumC16377d2.f62971w : EnumC16377d2.f62972x;
                Object obj3 = list.get(0);
                AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C34340n1(enumC16377d2, ((Float) obj3).floatValue());
            case 9:
                C23250e c23250e = (C23250e) obj;
                Object obj4 = c23250e.f92125a;
                if (!(obj4 instanceof AbstractC23284v) || (c23279s0Mo67353b = ((AbstractC23284v) obj4).mo67353b()) == null || (c23279s0Mo67353b.f92237a == null && c23279s0Mo67353b.f92238b == null && c23279s0Mo67353b.f92239c == null && c23279s0Mo67353b.f92240d == null)) {
                    return AbstractC37056f.m118980f(c23250e);
                }
                Object obj5 = c23250e.f92125a;
                AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                C23279s0 c23279s0Mo67353b2 = ((AbstractC23284v) obj5).mo67353b();
                if (c23279s0Mo67353b2 == null || (c23267m0 = c23279s0Mo67353b2.f92237a) == null) {
                    c23267m0 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65535);
                }
                return AbstractC37056f.m118980f(c23250e, new C23250e(c23267m0, c23250e.f92126b, c23250e.f92127c));
            case 10:
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC18039u.f70059z, c23454a0);
                return c23454a0;
            case 11:
                return AbstractC34382d.m108699p(obj);
            case 12:
                AbstractC22676k.m65750j((AbstractC34428p) obj, "it");
                return c23454a0;
            case 13:
                C11570x state = (C11570x) obj;
                AbstractC22676k.m65750j(state, "state");
                return state.m30999a();
            case 14:
                return AbstractC34443i.m108838W(obj);
            case 15:
                return AbstractC34443i.m108885v0((Action) obj);
            case 16:
                return AbstractC34443i.m108881t0((Action) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC34443i.m108829N(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                MessageListItemAdapter.onAttachedToRecyclerView$lambda$5((BaseMessageItemViewHolder) obj);
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                MessageListItemAdapter.onDetachedFromRecyclerView$lambda$6((BaseMessageItemViewHolder) obj);
                return c23454a0;
            case 20:
                return AbstractC34483c.m108983g(obj);
            case 21:
                return C34494i.m109030c((C21536b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                InterfaceC39407k it = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(it, "it");
                return ((C39410n) it).m125843a();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String it3 = (String) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(it3.length() == 0);
            case 24:
                return AbstractC34504e.m109046k(((Integer) obj).intValue());
            case 25:
                return AbstractC34504e.m109047l((String) obj);
            case 26:
                return AbstractC34504e.m109053r((Modifier) obj);
            case 27:
                return AbstractC34544c.m109170n(obj);
            case 28:
                return AbstractC34561a.m109279c((C25308q) obj);
            default:
                return AbstractC34568b.m109300d(obj);
        }
    }
}
