package androidx.lifecycle;

import androidx.room.AbstractC1848z0;
import androidx.room.C1768b1;
import androidx.room.C1797i2;
import androidx.room.InterfaceC1843x1;
import bc3.AbstractC3076z;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11930o;
import ec3.EnumC13102y1;
import ec3.InterfaceC13017a2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fc3.AbstractC14370a;
import io.ktor.utils.p228io.C20020m;
import l83.C23454a0;
import mc3.C25437c;
import p077d0.C11344e;
import p077d0.C11350f1;
import p077d0.C11373l0;
import p077d0.C11421z1;
import p114eb.C12982q;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p343nk.C26792m;
import p390p1.InterfaceC28601c1;
import p581we.C37199o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1578e1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f6208E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f6209F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6210w;

    /* JADX INFO: renamed from: x */
    public int f6211x;

    /* JADX INFO: renamed from: y */
    public Object f6212y;

    /* JADX INFO: renamed from: z */
    public Object f6213z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578e1(AbstractC1848z0 abstractC1848z0, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6210w = 12;
        this.f6208E = abstractC1848z0;
        this.f6209F = function1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ec3.o1, fc3.a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ec3.o1, fc3.a] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f6210w) {
            case 0:
                return new C1578e1((C25437c) this.f6209F, (InterfaceC4351m) this.f6208E, interfaceC30057d);
            case 1:
                C1578e1 c1578e1 = new C1578e1((AbstractC1848z0) this.f6213z, (C3033m) this.f6208E, (C1768b1) this.f6209F, interfaceC30057d, 1);
                c1578e1.f6212y = obj;
                return c1578e1;
            case 2:
                C1578e1 c1578e2 = new C1578e1((C1797i2) this.f6213z, (int[]) this.f6208E, (String[]) this.f6209F, interfaceC30057d, 2);
                c1578e2.f6212y = obj;
                return c1578e2;
            case 3:
                return new C1578e1(this.f6212y, (C11344e) this.f6213z, (InterfaceC28601c1) this.f6208E, (InterfaceC28601c1) this.f6209F, interfaceC30057d, 3);
            case 4:
                C1578e1 c1578e3 = new C1578e1((InterfaceC28601c1) this.f6208E, (C11373l0) this.f6209F, interfaceC30057d, 4);
                c1578e3.f6213z = obj;
                return c1578e3;
            case 5:
                C1578e1 c1578e4 = new C1578e1((C22669g0) this.f6208E, (InterfaceC13062m) this.f6209F, interfaceC30057d, 5);
                c1578e4.f6213z = obj;
                return c1578e4;
            case 6:
                C1578e1 c1578e5 = new C1578e1((InterfaceC13058l) this.f6213z, (InterfaceC13072o1) this.f6208E, this.f6209F, interfaceC30057d);
                c1578e5.f6212y = obj;
                return c1578e5;
            case 7:
                return new C1578e1((InterfaceC13017a2) this.f6212y, (InterfaceC13058l) this.f6213z, (InterfaceC13072o1) this.f6208E, this.f6209F, interfaceC30057d);
            case 8:
                return new C1578e1((C37199o) this.f6212y, (InterfaceC18598b) this.f6213z, (String) this.f6208E, (String) this.f6209F, interfaceC30057d, 8);
            case 9:
                C1578e1 c1578e6 = new C1578e1((C11350f1) this.f6213z, (C12982q) this.f6208E, (C11421z1) this.f6209F, interfaceC30057d, 9);
                c1578e6.f6212y = obj;
                return c1578e6;
            case 10:
                C1578e1 c1578e7 = new C1578e1((C20020m) this.f6208E, (InterfaceC4351m) this.f6213z, (AbstractC3076z) this.f6209F, interfaceC30057d);
                c1578e7.f6212y = obj;
                return c1578e7;
            case 11:
                return new C1578e1((C26792m) this.f6212y, (String) this.f6213z, (C21743a) this.f6208E, this.f6211x, (String) this.f6209F, interfaceC30057d);
            default:
                C1578e1 c1578e8 = new C1578e1((AbstractC1848z0) this.f6208E, (Function1) this.f6209F, interfaceC30057d);
                c1578e8.f6213z = obj;
                return c1578e8;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f6210w) {
            case 0:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                ((C1578e1) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 3:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 5:
                return ((C1578e1) create(new C11930o(((C11930o) obj).f39032a), (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C1578e1) create((EnumC13102y1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                C1578e1 c1578e1 = (C1578e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c1578e1.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                return ((C1578e1) create((InterfaceC1843x1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:253:0x04a9 A[PHI: r2
      0x04a9: PHI (r2v16 ec3.m) = (r2v14 ec3.m), (r2v15 ec3.m), (r2v21 ec3.m) binds: [B:246:0x0487, B:251:0x04a6, B:243:0x0468] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [ec3.l] */
    /* JADX WARN: Type inference failed for: r11v3, types: [ec3.m, ec3.o1, fc3.a] */
    /* JADX WARN: Type inference failed for: r11v4, types: [ec3.m, ec3.o1, fc3.a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [c93.m] */
    /* JADX WARN: Type inference failed for: r1v43, types: [ec3.l] */
    /* JADX WARN: Type inference failed for: r1v56, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:210:0x03c5 -> B:214:0x03e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x03e0 -> B:214:0x03e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1578e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1578e1(InterfaceC13058l interfaceC13058l, InterfaceC13072o1 interfaceC13072o1, Object obj, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6210w = 6;
        this.f6213z = interfaceC13058l;
        this.f6208E = (AbstractC14370a) interfaceC13072o1;
        this.f6209F = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1578e1(InterfaceC13017a2 interfaceC13017a2, InterfaceC13058l interfaceC13058l, InterfaceC13072o1 interfaceC13072o1, Object obj, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6210w = 7;
        this.f6212y = interfaceC13017a2;
        this.f6213z = interfaceC13058l;
        this.f6208E = (AbstractC14370a) interfaceC13072o1;
        this.f6209F = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1578e1(C20020m c20020m, InterfaceC4351m interfaceC4351m, AbstractC3076z abstractC3076z, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6210w = 10;
        this.f6208E = c20020m;
        this.f6213z = (AbstractC32275i) interfaceC4351m;
        this.f6209F = abstractC3076z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1578e1(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f6210w = i13;
        this.f6212y = obj;
        this.f6213z = obj2;
        this.f6208E = obj3;
        this.f6209F = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1578e1(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f6210w = i13;
        this.f6213z = obj;
        this.f6208E = obj2;
        this.f6209F = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1578e1(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f6210w = i13;
        this.f6208E = obj;
        this.f6209F = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1578e1(C25437c c25437c, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6210w = 0;
        this.f6209F = c25437c;
        this.f6208E = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578e1(C26792m c26792m, String str, C21743a c21743a, int i13, String str2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6210w = 11;
        this.f6212y = c26792m;
        this.f6213z = str;
        this.f6208E = c21743a;
        this.f6211x = i13;
        this.f6209F = str2;
    }
}
