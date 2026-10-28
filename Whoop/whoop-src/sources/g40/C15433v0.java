package g40;

import a41.C0372h;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import d30.C11552o;
import fd3.C14408a;
import java.util.List;
import l83.C23454a0;
import p026b2.C2314t;
import p132f0.C13821r1;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15433v0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f58010E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C13821r1 f58011F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f58012w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f58013x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15413r0 f58014y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f58015z;

    public C15433v0(List list, long j7, C15413r0 c15413r0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C13821r1 c13821r1) {
        this.f58012w = list;
        this.f58013x = j7;
        this.f58014y = c15413r0;
        this.f58015z = interfaceC28601c1;
        this.f58010E = interfaceC28601c2;
        this.f58011F = c13821r1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C22665e0 c22665e0;
        int i13;
        int i14;
        InterfaceC30057d interfaceC30057d;
        Integer num;
        int iIntValue;
        boolean z4;
        C28655q c28655q;
        Integer num2;
        InterfaceC28601c1 interfaceC28601c1;
        Integer num3;
        boolean z13;
        C15413r0 c15413r0;
        boolean zM87157i;
        Object objM87133R;
        InterfaceC23013y DropdownMenu = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue2 & 17) == 16) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c22665e0 = new C22665e0();
                i13 = 0;
                for (Object obj4 : this.f58012w) {
                    i14 = i13 + 1;
                    interfaceC30057d = null;
                    if (i13 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    String str = (String) obj4;
                    C22659b0 c22659b0 = new C22659b0();
                    InterfaceC28670t2 interfaceC28670t2 = this.f58015z;
                    num = (Integer) interfaceC28670t2.getValue();
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (i13 >= iIntValue - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c22659b0.f89329w = z4;
                    c28655q = (C28655q) composer;
                    c28655q.m87150e0(646400455);
                    num2 = (Integer) interfaceC28670t2.getValue();
                    interfaceC28601c1 = this.f58010E;
                    if (num2 != null && i13 == num2.intValue()) {
                        Boolean bool = (Boolean) interfaceC28601c1.getValue();
                        bool.booleanValue();
                        AbstractC28683x.m87253g(c28655q, new C11552o(this.f58011F, c22665e0, interfaceC30057d, 22), bool);
                    }
                    c28655q.m87173q(false);
                    num3 = (Integer) interfaceC28670t2.getValue();
                    if (num3 == null && i13 == num3.intValue()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Modifier modifierM3500d = AbstractC1131a.m3500d(C2314t.f9131w, new C14408a(15, c22659b0, c22665e0));
                    c28655q.m87150e0(255115317);
                    c15413r0 = this.f58014y;
                    zM87157i = c28655q.m87157i(c15413r0) | c28655q.m87149e(i13);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0372h(c15413r0, i13, interfaceC28601c1, 3);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC15448y0.m43611b(str, z13, this.f58013x, modifierM3500d, (InterfaceC4339a) objM87133R, c28655q, 0);
                    i13 = i14;
                }
            }
        } else {
            c22665e0 = new C22665e0();
            i13 = 0;
            while (r3.hasNext()) {
                i14 = i13 + 1;
                interfaceC30057d = null;
                if (i13 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                String str2 = (String) obj4;
                C22659b0 c22659b1 = new C22659b0();
                InterfaceC28670t2 interfaceC28670t3 = this.f58015z;
                num = (Integer) interfaceC28670t3.getValue();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                if (i13 >= iIntValue - 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c22659b1.f89329w = z4;
                c28655q = (C28655q) composer;
                c28655q.m87150e0(646400455);
                num2 = (Integer) interfaceC28670t3.getValue();
                interfaceC28601c1 = this.f58010E;
                if (num2 != null) {
                    Boolean bool2 = (Boolean) interfaceC28601c1.getValue();
                    bool2.booleanValue();
                    AbstractC28683x.m87253g(c28655q, new C11552o(this.f58011F, c22665e0, interfaceC30057d, 22), bool2);
                }
                c28655q.m87173q(false);
                num3 = (Integer) interfaceC28670t3.getValue();
                if (num3 == null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                Modifier modifierM3500d2 = AbstractC1131a.m3500d(C2314t.f9131w, new C14408a(15, c22659b1, c22665e0));
                c28655q.m87150e0(255115317);
                c15413r0 = this.f58014y;
                zM87157i = c28655q.m87157i(c15413r0) | c28655q.m87149e(i13);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C0372h(c15413r0, i13, interfaceC28601c1, 3);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0372h(c15413r0, i13, interfaceC28601c1, 3);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC15448y0.m43611b(str2, z13, this.f58013x, modifierM3500d2, (InterfaceC4339a) objM87133R, c28655q, 0);
                i13 = i14;
            }
        }
        return C23454a0.f92919a;
    }
}
