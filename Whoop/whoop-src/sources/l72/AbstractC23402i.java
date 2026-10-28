package l72;

import a72.AbstractC0524a;
import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.sage.onboarding.domain.models.ManualBloodPressureReadingInput;
import com.whoop.sage.onboarding.domain.models.SageInputRange;
import g72.C15552f;
import gb1.AbstractC15676d;
import j72.AbstractC21403h;
import j72.C21399d;
import j72.C21401f;
import j72.EnumC21402g;
import java.util.ArrayList;
import java.util.List;
import jp1.C21862n;
import js2.C21927e;
import l01.C23045q;
import l60.C23374a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p292l1.C23091f0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30787f;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: l72.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a_\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u00022\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\u0014\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\nX\u008a\u0084\u0002²\u0006\u000e\u0010!\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lj72/d;", "viewState", "Lkotlin/Function1;", "La72/a;", "Ll83/a0;", "onAnalyticsEvent", "Lj72/h;", "onViewEvent", "G", "(Lj72/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lj72/f;", "section", "Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "systolicRange", "diastolicRange", "Ll72/a;", "readingState", "", "onSystolicChange", "onDiastolicChange", "r", "(Lj72/f;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Ll72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "readingStates", "Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "P", "(Ljava/util/List;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;)Ljava/util/List;", "value", "range", "", "Q", "(Ljava/lang/Integer;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;)Ljava/lang/String;", "successfulSageReport", "systolicString", "diastolicString", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23402i {

    /* JADX INFO: renamed from: l72.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.view.SageManualEntryScreenKt$SageManualEntryScreen$3$1", m100430f = "SageManualEntryScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f92735w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f92736x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21399d f92737y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C21399d c21399d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f92736x = function1;
            this.f92737y = c21399d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f92736x, this.f92737y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f92735w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f92736x.invoke(new AbstractC0524a.t(this.f92737y.getScreenId().name()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m67760A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m67761B(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m67799w(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m67762C(Function1 function1, Double d3) {
        function1.invoke(d3 != null ? Integer.valueOf((int) d3.doubleValue()) : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m67763D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m67764E(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m67801y(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m67765F(Function1 function1, Double d3) {
        function1.invoke(d3 != null ? Integer.valueOf((int) d3.doubleValue()) : null);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x0310  */
    /* JADX WARN: Code duplicated, block: B:108:0x0373  */
    /* JADX WARN: Code duplicated, block: B:109:0x0377  */
    /* JADX WARN: Code duplicated, block: B:112:0x038a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0398  */
    /* JADX WARN: Code duplicated, block: B:117:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x03be  */
    /* JADX WARN: Code duplicated, block: B:123:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:129:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x03db  */
    /* JADX WARN: Code duplicated, block: B:134:0x041d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0428  */
    /* JADX WARN: Code duplicated, block: B:140:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1 A[LOOP:1: B:55:0x00cb->B:57:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0173  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0204  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x02f4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: G */
    public static final void m67766G(C21399d viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Function1 function3;
        int i15;
        Function1 function4;
        int i16;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function7;
        Function1 function8;
        boolean zM87149e;
        ArrayList arrayList;
        Object obj2;
        C39967p c39967p;
        Object objM87133R;
        InterfaceC28670t2 interfaceC28670t2;
        int i17;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        Function1 function9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C39967p c39967p2;
        int iHashCode2;
        final C39967p c39967p3;
        final int i18;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        Function1 function10;
        Function1 function11;
        int i19;
        boolean zM87153g;
        Object objM87133R4;
        boolean zM87153g2;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-361949717);
        int i24 = (i13 & 6) == 0 ? (c28655q2.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i24 |= c28655q2.m87157i(function3) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i24 |= i16;
                }
                if ((i24 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i24 & 1, z4)) {
                    obj = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == obj) {
                            objM87133R7 = new C23374a(11);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                    } else {
                        function7 = function3;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == obj) {
                            objM87133R6 = new C23374a(12);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    zM87149e = c28655q2.m87149e(viewState.m60126d().size());
                    Object objM87133R8 = c28655q2.m87133R();
                    obj2 = objM87133R8;
                    if (zM87149e || objM87133R8 == obj) {
                        C39967p c39967p4 = new C39967p();
                        List<C21401f> listM60126d = viewState.m60126d();
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d, 10));
                        for (C21401f c21401f : listM60126d) {
                            arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                        }
                        c39967p4.addAll(arrayList);
                        c28655q2.m87172p0(c39967p4);
                        obj2 = c39967p4;
                    }
                    c39967p = (C39967p) obj2;
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = AbstractC28683x.m87264r(new C23045q(5, c39967p, viewState));
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                    i17 = i24 & 112;
                    if (i17 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q2.m87157i(viewState);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i || objM87133R2 == obj) {
                        objM87133R2 = new a(function7, viewState, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, viewState);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, c2314t));
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    function9 = function7;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66720i);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c39967p2 = c39967p;
                    } else {
                        c39967p2 = c39967p;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        float f13 = 8;
                        float f14 = 2 * f13;
                        float f15 = 4 * f13;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, f15, 0.0f, 0.0f, 13);
                        C23016z c23016z = C23016z.f90757a;
                        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c23016z.m66779c(modifierM3398t, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                        AbstractC22953f.m66715b(c28655q2, c23016z.m66779c(c2314t, true, 1.5f));
                        String titleDisplay = viewState.getTitleDisplay();
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        C2886a t14 = c38072d.m121952e(c28655q2, i26).getT2();
                        long brandWhite = c38072d.m121949b(c28655q2, i26).getBrandWhite();
                        int i27 = C2886a.f11498d << 18;
                        c39967p3 = c39967p2;
                        int i28 = i24;
                        AbstractC30795n.m94707h(titleDisplay, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 0, i27, 196602);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f13, c2314t));
                        AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d.m121949b(c28655q2, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i26).getP2(), null, c28655q2, 0, i27, 196602);
                        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t));
                        c28655q2.m87150e0(601138143);
                        i18 = 0;
                        for (Object obj3 : viewState.m60126d()) {
                            i19 = i18 + 1;
                            if (i18 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            C21401f c21401f2 = (C21401f) obj3;
                            C23394a c23394a = (C23394a) c39967p3.get(i18);
                            SageInputRange systolicRange = viewState.getSystolicRange();
                            SageInputRange diastolicRange = viewState.getDiastolicRange();
                            zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87153g || objM87133R4 == obj) {
                                final int i29 = 0;
                                objM87133R4 = new Function1() { // from class: l72.g
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        switch (i29) {
                                            case 0:
                                                return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                            default:
                                                return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R4);
                            }
                            Function1 function12 = (Function1) objM87133R4;
                            zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                            objM87133R5 = c28655q2.m87133R();
                            if (zM87153g2 || objM87133R5 == obj) {
                                final int i34 = 1;
                                objM87133R5 = new Function1() { // from class: l72.g
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        switch (i34) {
                                            case 0:
                                                return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                            default:
                                                return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R5);
                            }
                            m67794r(c21401f2, systolicRange, diastolicRange, c23394a, function12, (Function1) objM87133R5, c28655q2, 0, 0);
                            i18 = i19;
                        }
                        c28655q2.m87173q(false);
                        AbstractC22953f.m66715b(c28655q2, c23016z.m66779c(c2314t, true, 1.0f));
                        c28655q2.m87173q(true);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f13, 7);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getNextButtonText());
                        if (m67770K(interfaceC28670t2) != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM87157i2 = c28655q2.m87157i(viewState);
                        if (i17 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i2 | z15 | ((i28 & 896) == 256);
                        objM87133R3 = c28655q2.m87133R();
                        if (!z16 || objM87133R3 == obj) {
                            function10 = function8;
                            function11 = function9;
                            C1012d c1012d = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                            c28655q2.m87172p0(c1012d);
                            objM87133R3 = c1012d;
                        } else {
                            function10 = function8;
                            function11 = function9;
                        }
                        AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(r1);
                        c28655q3.m87173q(true);
                        function5 = function11;
                        function6 = function10;
                        c28655q = c28655q3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                    float f16 = 8;
                    float f17 = 2 * f16;
                    float f18 = 4 * f16;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2), 0.0f, f18, 0.0f, 0.0f, 13);
                    C23016z c23016z2 = C23016z.f90757a;
                    Modifier modifierM92116f1 = AbstractC30060g.m92116f0(c23016z2.m66779c(modifierM3398t3, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N4);
                    AbstractC22953f.m66715b(c28655q2, c23016z2.m66779c(c2314t, true, 1.5f));
                    String titleDisplay2 = viewState.getTitleDisplay();
                    C38072d c38072d2 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    C2886a t15 = c38072d2.m121952e(c28655q2, i210).getT2();
                    long brandWhite2 = c38072d2.m121949b(c28655q2, i210).getBrandWhite();
                    int i211 = C2886a.f11498d << 18;
                    c39967p3 = c39967p2;
                    int i212 = i24;
                    AbstractC30795n.m94707h(titleDisplay2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t15, null, c28655q2, 0, i211, 196602);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f16, c2314t));
                    AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d2.m121949b(c28655q2, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i210).getP2(), null, c28655q2, 0, i211, 196602);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18, c2314t));
                    c28655q2.m87150e0(601138143);
                    i18 = 0;
                    while (r2.hasNext()) {
                        i19 = i18 + 1;
                        if (i18 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C21401f c21401f3 = (C21401f) obj3;
                        C23394a c23394a2 = (C23394a) c39967p3.get(i18);
                        SageInputRange systolicRange2 = viewState.getSystolicRange();
                        SageInputRange diastolicRange2 = viewState.getDiastolicRange();
                        zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i213 = 0;
                            objM87133R4 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            final int i214 = 0;
                            objM87133R4 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        }
                        Function1 function13 = (Function1) objM87133R4;
                        zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i35 = 1;
                            objM87133R5 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i35) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            final int i36 = 1;
                            objM87133R5 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i36) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R5);
                        }
                        m67794r(c21401f3, systolicRange2, diastolicRange2, c23394a2, function13, (Function1) objM87133R5, c28655q2, 0, 0);
                        i18 = i19;
                    }
                    c28655q2.m87173q(false);
                    AbstractC22953f.m66715b(c28655q2, c23016z2.m66779c(c2314t, true, 1.0f));
                    c28655q2.m87173q(true);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f16, 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getNextButtonText());
                    if (m67770K(interfaceC28670t2) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i3 = c28655q2.m87157i(viewState);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i3 | z15 | ((i212 & 896) == 256);
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        function10 = function8;
                        function11 = function9;
                        C1012d c1012d2 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                        c28655q2.m87172p0(c1012d2);
                        objM87133R3 = c1012d2;
                    } else {
                        function10 = function8;
                        function11 = function9;
                        C1012d c1012d3 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                        c28655q2.m87172p0(c1012d3);
                        objM87133R3 = c1012d3;
                    }
                    AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                    C28655q c28655q4 = c28655q2;
                    c28655q4.m87173q(r1);
                    c28655q4.m87173q(true);
                    function5 = function11;
                    function6 = function10;
                    c28655q = c28655q4;
                } else {
                    c28655q2.m87138X();
                    function5 = function3;
                    function6 = function4;
                    c28655q = c28655q2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23401h(i13, i14, 0, (Object) viewState, (Object) function5, (InterfaceC23459e) function6);
                }
            }
            i24 |= 384;
            function4 = function2;
            if ((i24 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == obj) {
                        objM87133R7 = new C23374a(11);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == obj) {
                        objM87133R6 = new C23374a(12);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                zM87149e = c28655q2.m87149e(viewState.m60126d().size());
                Object objM87133R9 = c28655q2.m87133R();
                obj2 = objM87133R9;
                if (zM87149e) {
                    C39967p c39967p5 = new C39967p();
                    List<C21401f> listM60126d2 = viewState.m60126d();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d2, 10));
                    while (r7.hasNext()) {
                        arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                    }
                    c39967p5.addAll(arrayList);
                    c28655q2.m87172p0(c39967p5);
                    obj2 = c39967p5;
                } else {
                    C39967p c39967p6 = new C39967p();
                    List<C21401f> listM60126d3 = viewState.m60126d();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d3, 10));
                    while (r7.hasNext()) {
                        arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                    }
                    c39967p6.addAll(arrayList);
                    c28655q2.m87172p0(c39967p6);
                    obj2 = c39967p6;
                }
                c39967p = (C39967p) obj2;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87264r(new C23045q(5, c39967p, viewState));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                i17 = i24 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(viewState);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(function7, viewState, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function7, viewState, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, viewState);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, c2314t2));
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                function9 = function7;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM66720i2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a4);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c39967p2 = c39967p;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                    float f19 = 8;
                    float f110 = 2 * f19;
                    float f111 = 4 * f19;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f110, 0.0f, 2), 0.0f, f111, 0.0f, 0.0f, 13);
                    C23016z c23016z3 = C23016z.f90757a;
                    Modifier modifierM92116f2 = AbstractC30060g.m92116f0(c23016z3.m66779c(modifierM3398t5, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM92116f2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m7);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N7);
                    AbstractC22953f.m66715b(c28655q2, c23016z3.m66779c(c2314t2, true, 1.5f));
                    String titleDisplay3 = viewState.getTitleDisplay();
                    C38072d c38072d3 = C38072d.f163053a;
                    int i215 = C38072d.f163054b;
                    C2886a t16 = c38072d3.m121952e(c28655q2, i215).getT2();
                    long brandWhite3 = c38072d3.m121949b(c28655q2, i215).getBrandWhite();
                    int i216 = C2886a.f11498d << 18;
                    c39967p3 = c39967p2;
                    int i217 = i24;
                    AbstractC30795n.m94707h(titleDisplay3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t16, null, c28655q2, 0, i216, 196602);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f19, c2314t2));
                    AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d3.m121949b(c28655q2, i215).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i215).getP2(), null, c28655q2, 0, i216, 196602);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111, c2314t2));
                    c28655q2.m87150e0(601138143);
                    i18 = 0;
                    while (r2.hasNext()) {
                        i19 = i18 + 1;
                        if (i18 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C21401f c21401f4 = (C21401f) obj3;
                        C23394a c23394a3 = (C23394a) c39967p3.get(i18);
                        SageInputRange systolicRange3 = viewState.getSystolicRange();
                        SageInputRange diastolicRange3 = viewState.getDiastolicRange();
                        zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i218 = 0;
                            objM87133R4 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i218) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            final int i219 = 0;
                            objM87133R4 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i219) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        }
                        Function1 function14 = (Function1) objM87133R4;
                        zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i37 = 1;
                            objM87133R5 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i37) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            final int i38 = 1;
                            objM87133R5 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i38) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R5);
                        }
                        m67794r(c21401f4, systolicRange3, diastolicRange3, c23394a3, function14, (Function1) objM87133R5, c28655q2, 0, 0);
                        i18 = i19;
                    }
                    c28655q2.m87173q(false);
                    AbstractC22953f.m66715b(c28655q2, c23016z3.m66779c(c2314t2, true, 1.0f));
                    c28655q2.m87173q(true);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f110, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f19, 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(viewState.getNextButtonText());
                    if (m67770K(interfaceC28670t2) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i4 = c28655q2.m87157i(viewState);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i4 | z15 | ((i217 & 896) == 256);
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        function10 = function8;
                        function11 = function9;
                        C1012d c1012d4 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                        c28655q2.m87172p0(c1012d4);
                        objM87133R3 = c1012d4;
                    } else {
                        function10 = function8;
                        function11 = function9;
                        C1012d c1012d5 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                        c28655q2.m87172p0(c1012d5);
                        objM87133R3 = c1012d5;
                    }
                    AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l3, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(r1);
                    c28655q5.m87173q(true);
                    function5 = function11;
                    function6 = function10;
                    c28655q = c28655q5;
                } else {
                    c39967p2 = c39967p;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N6);
                float f112 = 8;
                float f113 = 2 * f112;
                float f114 = 4 * f112;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f113, 0.0f, 2), 0.0f, f114, 0.0f, 0.0f, 13);
                C23016z c23016z4 = C23016z.f90757a;
                Modifier modifierM92116f3 = AbstractC30060g.m92116f0(c23016z4.m66779c(modifierM3398t7, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM92116f3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N9);
                AbstractC22953f.m66715b(c28655q2, c23016z4.m66779c(c2314t2, true, 1.5f));
                String titleDisplay4 = viewState.getTitleDisplay();
                C38072d c38072d4 = C38072d.f163053a;
                int i2110 = C38072d.f163054b;
                C2886a t17 = c38072d4.m121952e(c28655q2, i2110).getT2();
                long brandWhite4 = c38072d4.m121949b(c28655q2, i2110).getBrandWhite();
                int i2111 = C2886a.f11498d << 18;
                c39967p3 = c39967p2;
                int i2112 = i24;
                AbstractC30795n.m94707h(titleDisplay4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t17, null, c28655q2, 0, i2111, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f112, c2314t2));
                AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d4.m121949b(c28655q2, i2110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i2110).getP2(), null, c28655q2, 0, i2111, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f114, c2314t2));
                c28655q2.m87150e0(601138143);
                i18 = 0;
                while (r2.hasNext()) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C21401f c21401f5 = (C21401f) obj3;
                    C23394a c23394a4 = (C23394a) c39967p3.get(i18);
                    SageInputRange systolicRange4 = viewState.getSystolicRange();
                    SageInputRange diastolicRange4 = viewState.getDiastolicRange();
                    zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i2113 = 0;
                        objM87133R4 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i2113) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        final int i2114 = 0;
                        objM87133R4 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i2114) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Function1 function15 = (Function1) objM87133R4;
                    zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i39 = 1;
                        objM87133R5 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i39) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        final int i310 = 1;
                        objM87133R5 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i310) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    }
                    m67794r(c21401f5, systolicRange4, diastolicRange4, c23394a4, function15, (Function1) objM87133R5, c28655q2, 0, 0);
                    i18 = i19;
                }
                c28655q2.m87173q(false);
                AbstractC22953f.m66715b(c28655q2, c23016z4.m66779c(c2314t2, true, 1.0f));
                c28655q2.m87173q(true);
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f113, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f112, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3398t8);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getNextButtonText());
                if (m67770K(interfaceC28670t2) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i5 = c28655q2.m87157i(viewState);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i5 | z15 | ((i2112 & 896) == 256);
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    function10 = function8;
                    function11 = function9;
                    C1012d c1012d6 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                    c28655q2.m87172p0(c1012d6);
                    objM87133R3 = c1012d6;
                } else {
                    function10 = function8;
                    function11 = function9;
                    C1012d c1012d7 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                    c28655q2.m87172p0(c1012d7);
                    objM87133R3 = c1012d7;
                }
                AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(r1);
                c28655q6.m87173q(true);
                function5 = function11;
                function6 = function10;
                c28655q = c28655q6;
            } else {
                c28655q2.m87138X();
                function5 = function3;
                function6 = function4;
                c28655q = c28655q2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 0, (Object) viewState, (Object) function5, (InterfaceC23459e) function6);
            }
        }
        i24 |= 48;
        function3 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i24 |= i16;
            }
            if ((i24 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i24 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == obj) {
                        objM87133R7 = new C23374a(11);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function3;
                }
                if (i15 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == obj) {
                        objM87133R6 = new C23374a(12);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                zM87149e = c28655q2.m87149e(viewState.m60126d().size());
                Object objM87133R10 = c28655q2.m87133R();
                obj2 = objM87133R10;
                if (zM87149e) {
                    C39967p c39967p7 = new C39967p();
                    List<C21401f> listM60126d4 = viewState.m60126d();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d4, 10));
                    while (r7.hasNext()) {
                        arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                    }
                    c39967p7.addAll(arrayList);
                    c28655q2.m87172p0(c39967p7);
                    obj2 = c39967p7;
                } else {
                    C39967p c39967p8 = new C39967p();
                    List<C21401f> listM60126d5 = viewState.m60126d();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d5, 10));
                    while (r7.hasNext()) {
                        arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                    }
                    c39967p8.addAll(arrayList);
                    c28655q2.m87172p0(c39967p8);
                    obj2 = c39967p8;
                }
                c39967p = (C39967p) obj2;
                objM87133R = c28655q2.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87264r(new C23045q(5, c39967p, viewState));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                i17 = i24 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(viewState);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(function7, viewState, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(function7, viewState, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, viewState);
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66720i3 = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, c2314t3));
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                function9 = function7;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM66720i3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a7);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c39967p2 = c39967p;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N11);
                    float f115 = 8;
                    float f116 = 2 * f115;
                    float f117 = 4 * f115;
                    Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f116, 0.0f, 2), 0.0f, f117, 0.0f, 0.0f, 13);
                    C23016z c23016z5 = C23016z.f90757a;
                    Modifier modifierM92116f4 = AbstractC30060g.m92116f0(c23016z5.m66779c(modifierM3398t9, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM92116f4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m12);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N12);
                    AbstractC22953f.m66715b(c28655q2, c23016z5.m66779c(c2314t3, true, 1.5f));
                    String titleDisplay5 = viewState.getTitleDisplay();
                    C38072d c38072d5 = C38072d.f163053a;
                    int i2115 = C38072d.f163054b;
                    C2886a t18 = c38072d5.m121952e(c28655q2, i2115).getT2();
                    long brandWhite5 = c38072d5.m121949b(c28655q2, i2115).getBrandWhite();
                    int i2116 = C2886a.f11498d << 18;
                    c39967p3 = c39967p2;
                    int i2117 = i24;
                    AbstractC30795n.m94707h(titleDisplay5, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t18, null, c28655q2, 0, i2116, 196602);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f115, c2314t3));
                    AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d5.m121949b(c28655q2, i2115).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q2, i2115).getP2(), null, c28655q2, 0, i2116, 196602);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f117, c2314t3));
                    c28655q2.m87150e0(601138143);
                    i18 = 0;
                    while (r2.hasNext()) {
                        i19 = i18 + 1;
                        if (i18 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C21401f c21401f6 = (C21401f) obj3;
                        C23394a c23394a5 = (C23394a) c39967p3.get(i18);
                        SageInputRange systolicRange5 = viewState.getSystolicRange();
                        SageInputRange diastolicRange5 = viewState.getDiastolicRange();
                        zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87153g) {
                            final int i2118 = 0;
                            objM87133R4 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i2118) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            final int i2119 = 0;
                            objM87133R4 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i2119) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R4);
                        }
                        Function1 function16 = (Function1) objM87133R4;
                        zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87153g2) {
                            final int i311 = 1;
                            objM87133R5 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i311) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            final int i312 = 1;
                            objM87133R5 = new Function1() { // from class: l72.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i312) {
                                        case 0:
                                            return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                        default:
                                            return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R5);
                        }
                        m67794r(c21401f6, systolicRange5, diastolicRange5, c23394a5, function16, (Function1) objM87133R5, c28655q2, 0, 0);
                        i18 = i19;
                    }
                    c28655q2.m87173q(false);
                    AbstractC22953f.m66715b(c28655q2, c23016z5.m66779c(c2314t3, true, 1.0f));
                    c28655q2.m87173q(true);
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f116, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f115, 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3398t10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(viewState.getNextButtonText());
                    if (m67770K(interfaceC28670t2) != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i6 = c28655q2.m87157i(viewState);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i6 | z15 | ((i2117 & 896) == 256);
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        function10 = function8;
                        function11 = function9;
                        C1012d c1012d8 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                        c28655q2.m87172p0(c1012d8);
                        objM87133R3 = c1012d8;
                    } else {
                        function10 = function8;
                        function11 = function9;
                        C1012d c1012d9 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                        c28655q2.m87172p0(c1012d9);
                        objM87133R3 = c1012d9;
                    }
                    AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                    C28655q c28655q7 = c28655q2;
                    c28655q7.m87173q(r1);
                    c28655q7.m87173q(true);
                    function5 = function11;
                    function6 = function10;
                    c28655q = c28655q7;
                } else {
                    c39967p2 = c39967p;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i14 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N11);
                float f118 = 8;
                float f119 = 2 * f118;
                float f1110 = 4 * f118;
                Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f119, 0.0f, 2), 0.0f, f1110, 0.0f, 0.0f, 13);
                C23016z c23016z6 = C23016z.f90757a;
                Modifier modifierM92116f5 = AbstractC30060g.m92116f0(c23016z6.m66779c(modifierM3398t11, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM92116f5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N14);
                AbstractC22953f.m66715b(c28655q2, c23016z6.m66779c(c2314t3, true, 1.5f));
                String titleDisplay6 = viewState.getTitleDisplay();
                C38072d c38072d6 = C38072d.f163053a;
                int i21110 = C38072d.f163054b;
                C2886a t19 = c38072d6.m121952e(c28655q2, i21110).getT2();
                long brandWhite6 = c38072d6.m121949b(c28655q2, i21110).getBrandWhite();
                int i21111 = C2886a.f11498d << 18;
                c39967p3 = c39967p2;
                int i21112 = i24;
                AbstractC30795n.m94707h(titleDisplay6, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t19, null, c28655q2, 0, i21111, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f118, c2314t3));
                AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d6.m121949b(c28655q2, i21110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q2, i21110).getP2(), null, c28655q2, 0, i21111, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1110, c2314t3));
                c28655q2.m87150e0(601138143);
                i18 = 0;
                while (r2.hasNext()) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C21401f c21401f7 = (C21401f) obj3;
                    C23394a c23394a6 = (C23394a) c39967p3.get(i18);
                    SageInputRange systolicRange6 = viewState.getSystolicRange();
                    SageInputRange diastolicRange6 = viewState.getDiastolicRange();
                    zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i21113 = 0;
                        objM87133R4 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i21113) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        final int i21114 = 0;
                        objM87133R4 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i21114) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Function1 function17 = (Function1) objM87133R4;
                    zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i313 = 1;
                        objM87133R5 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i313) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        final int i314 = 1;
                        objM87133R5 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i314) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    }
                    m67794r(c21401f7, systolicRange6, diastolicRange6, c23394a6, function17, (Function1) objM87133R5, c28655q2, 0, 0);
                    i18 = i19;
                }
                c28655q2.m87173q(false);
                AbstractC22953f.m66715b(c28655q2, c23016z6.m66779c(c2314t3, true, 1.0f));
                c28655q2.m87173q(true);
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f119, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f118, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3398t12);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(viewState.getNextButtonText());
                if (m67770K(interfaceC28670t2) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i7 = c28655q2.m87157i(viewState);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i7 | z15 | ((i21112 & 896) == 256);
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    function10 = function8;
                    function11 = function9;
                    C1012d c1012d10 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                    c28655q2.m87172p0(c1012d10);
                    objM87133R3 = c1012d10;
                } else {
                    function10 = function8;
                    function11 = function9;
                    C1012d c1012d11 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                    c28655q2.m87172p0(c1012d11);
                    objM87133R3 = c1012d11;
                }
                AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l6, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                C28655q c28655q8 = c28655q2;
                c28655q8.m87173q(r1);
                c28655q8.m87173q(true);
                function5 = function11;
                function6 = function10;
                c28655q = c28655q8;
            } else {
                c28655q2.m87138X();
                function5 = function3;
                function6 = function4;
                c28655q = c28655q2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 0, (Object) viewState, (Object) function5, (InterfaceC23459e) function6);
            }
        }
        i24 |= 384;
        function4 = function2;
        if ((i24 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i24 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == obj) {
                    objM87133R7 = new C23374a(11);
                    c28655q2.m87172p0(objM87133R7);
                }
                function7 = (Function1) objM87133R7;
            } else {
                function7 = function3;
            }
            if (i15 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == obj) {
                    objM87133R6 = new C23374a(12);
                    c28655q2.m87172p0(objM87133R6);
                }
                function8 = (Function1) objM87133R6;
            } else {
                function8 = function4;
            }
            zM87149e = c28655q2.m87149e(viewState.m60126d().size());
            Object objM87133R11 = c28655q2.m87133R();
            obj2 = objM87133R11;
            if (zM87149e) {
                C39967p c39967p9 = new C39967p();
                List<C21401f> listM60126d6 = viewState.m60126d();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d6, 10));
                while (r7.hasNext()) {
                    arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                }
                c39967p9.addAll(arrayList);
                c28655q2.m87172p0(c39967p9);
                obj2 = c39967p9;
            } else {
                C39967p c39967p10 = new C39967p();
                List<C21401f> listM60126d7 = viewState.m60126d();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60126d7, 10));
                while (r7.hasNext()) {
                    arrayList.add(new C23394a(c21401f.getSystolicInput(), c21401f.getDiastolicInput()));
                }
                c39967p10.addAll(arrayList);
                c28655q2.m87172p0(c39967p10);
                obj2 = c39967p10;
            }
            c39967p = (C39967p) obj2;
            objM87133R = c28655q2.m87133R();
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87264r(new C23045q(5, c39967p, viewState));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            i17 = i24 & 112;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q2.m87157i(viewState);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(function7, viewState, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(function7, viewState, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, viewState);
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66720i4 = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, c2314t4));
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            function9 = function7;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM66720i4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i15 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a10);
            C0209i c0209i16 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                c39967p2 = c39967p;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N16);
                float f1111 = 8;
                float f1112 = 2 * f1111;
                float f1113 = 4 * f1111;
                Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f1112, 0.0f, 2), 0.0f, f1113, 0.0f, 0.0f, 13);
                C23016z c23016z7 = C23016z.f90757a;
                Modifier modifierM92116f6 = AbstractC30060g.m92116f0(c23016z7.m66779c(modifierM3398t13, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM92116f6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m17);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N17);
                AbstractC22953f.m66715b(c28655q2, c23016z7.m66779c(c2314t4, true, 1.5f));
                String titleDisplay7 = viewState.getTitleDisplay();
                C38072d c38072d7 = C38072d.f163053a;
                int i21115 = C38072d.f163054b;
                C2886a t110 = c38072d7.m121952e(c28655q2, i21115).getT2();
                long brandWhite7 = c38072d7.m121949b(c28655q2, i21115).getBrandWhite();
                int i21116 = C2886a.f11498d << 18;
                c39967p3 = c39967p2;
                int i21117 = i24;
                AbstractC30795n.m94707h(titleDisplay7, null, brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t110, null, c28655q2, 0, i21116, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1111, c2314t4));
                AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d7.m121949b(c28655q2, i21115).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q2, i21115).getP2(), null, c28655q2, 0, i21116, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1113, c2314t4));
                c28655q2.m87150e0(601138143);
                i18 = 0;
                while (r2.hasNext()) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C21401f c21401f8 = (C21401f) obj3;
                    C23394a c23394a7 = (C23394a) c39967p3.get(i18);
                    SageInputRange systolicRange7 = viewState.getSystolicRange();
                    SageInputRange diastolicRange7 = viewState.getDiastolicRange();
                    zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87153g) {
                        final int i21118 = 0;
                        objM87133R4 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i21118) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        final int i21119 = 0;
                        objM87133R4 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i21119) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Function1 function18 = (Function1) objM87133R4;
                    zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2) {
                        final int i315 = 1;
                        objM87133R5 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i315) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        final int i316 = 1;
                        objM87133R5 = new Function1() { // from class: l72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i316) {
                                    case 0:
                                        return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                    default:
                                        return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R5);
                    }
                    m67794r(c21401f8, systolicRange7, diastolicRange7, c23394a7, function18, (Function1) objM87133R5, c28655q2, 0, 0);
                    i18 = i19;
                }
                c28655q2.m87173q(false);
                AbstractC22953f.m66715b(c28655q2, c23016z7.m66779c(c2314t4, true, 1.0f));
                c28655q2.m87173q(true);
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f1112, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f1111, 7);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3398t14);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m18);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N18);
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(viewState.getNextButtonText());
                if (m67770K(interfaceC28670t2) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i8 = c28655q2.m87157i(viewState);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i8 | z15 | ((i21117 & 896) == 256);
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    function10 = function8;
                    function11 = function9;
                    C1012d c1012d12 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                    c28655q2.m87172p0(c1012d12);
                    objM87133R3 = c1012d12;
                } else {
                    function10 = function8;
                    function11 = function9;
                    C1012d c1012d13 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                    c28655q2.m87172p0(c1012d13);
                    objM87133R3 = c1012d13;
                }
                AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l7, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
                C28655q c28655q9 = c28655q2;
                c28655q9.m87173q(r1);
                c28655q9.m87173q(true);
                function5 = function11;
                function6 = function10;
                c28655q = c28655q9;
            } else {
                c39967p2 = c39967p;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i18 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N16);
            float f1114 = 8;
            float f1115 = 2 * f1114;
            float f1116 = 4 * f1114;
            Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f1115, 0.0f, 2), 0.0f, f1116, 0.0f, 0.0f, 13);
            C23016z c23016z8 = C23016z.f90757a;
            Modifier modifierM92116f7 = AbstractC30060g.m92116f0(c23016z8.m66779c(modifierM3398t15, true, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM92116f7);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m19);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N19);
            AbstractC22953f.m66715b(c28655q2, c23016z8.m66779c(c2314t4, true, 1.5f));
            String titleDisplay8 = viewState.getTitleDisplay();
            C38072d c38072d8 = C38072d.f163053a;
            int i211110 = C38072d.f163054b;
            C2886a t111 = c38072d8.m121952e(c28655q2, i211110).getT2();
            long brandWhite8 = c38072d8.m121949b(c28655q2, i211110).getBrandWhite();
            int i211111 = C2886a.f11498d << 18;
            c39967p3 = c39967p2;
            int i211112 = i24;
            AbstractC30795n.m94707h(titleDisplay8, null, brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t111, null, c28655q2, 0, i211111, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f1114, c2314t4));
            AbstractC30795n.m94707h(viewState.getDescriptionDisplay(), null, c38072d8.m121949b(c28655q2, i211110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q2, i211110).getP2(), null, c28655q2, 0, i211111, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1116, c2314t4));
            c28655q2.m87150e0(601138143);
            i18 = 0;
            while (r2.hasNext()) {
                i19 = i18 + 1;
                if (i18 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C21401f c21401f9 = (C21401f) obj3;
                C23394a c23394a8 = (C23394a) c39967p3.get(i18);
                SageInputRange systolicRange8 = viewState.getSystolicRange();
                SageInputRange diastolicRange8 = viewState.getDiastolicRange();
                zM87153g = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                objM87133R4 = c28655q2.m87133R();
                if (zM87153g) {
                    final int i211113 = 0;
                    objM87133R4 = new Function1() { // from class: l72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i211113) {
                                case 0:
                                    return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                default:
                                    return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    final int i211114 = 0;
                    objM87133R4 = new Function1() { // from class: l72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i211114) {
                                case 0:
                                    return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                default:
                                    return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function19 = (Function1) objM87133R4;
                zM87153g2 = c28655q2.m87153g(c39967p3) | c28655q2.m87149e(i18);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g2) {
                    final int i317 = 1;
                    objM87133R5 = new Function1() { // from class: l72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i317) {
                                case 0:
                                    return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                default:
                                    return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    final int i318 = 1;
                    objM87133R5 = new Function1() { // from class: l72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i318) {
                                case 0:
                                    return AbstractC23402i.m67771L(c39967p3, i18, (Integer) obj4);
                                default:
                                    return AbstractC23402i.m67772M(c39967p3, i18, (Integer) obj4);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R5);
                }
                m67794r(c21401f9, systolicRange8, diastolicRange8, c23394a8, function19, (Function1) objM87133R5, c28655q2, 0, 0);
                i18 = i19;
            }
            c28655q2.m87173q(false);
            AbstractC22953f.m66715b(c28655q2, c23016z8.m66779c(c2314t4, true, 1.0f));
            c28655q2.m87173q(true);
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), f1115, 0.0f, 2), 0.0f, 0.0f, 0.0f, 3 * f1114, 7);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM3398t16);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m110);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N110);
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(viewState.getNextButtonText());
            if (m67770K(interfaceC28670t2) != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zM87157i9 = c28655q2.m87157i(viewState);
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87157i9 | z15 | ((i211112 & 896) == 256);
            objM87133R3 = c28655q2.m87133R();
            if (z16) {
                function10 = function8;
                function11 = function9;
                C1012d c1012d14 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                c28655q2.m87172p0(c1012d14);
                objM87133R3 = c1012d14;
            } else {
                function10 = function8;
                function11 = function9;
                C1012d c1012d15 = new C1012d((Object) viewState, (Object) interfaceC28670t2, function11, (Object) function10, 25);
                c28655q2.m87172p0(c1012d15);
                objM87133R3 = c1012d15;
            }
            AbstractC27292z.m82343j(null, z14, false, null, null, null, textResourceM21278l8, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, TextResource.$stable << 18, 0, 8125);
            C28655q c28655q10 = c28655q2;
            c28655q10.m87173q(r1);
            c28655q10.m87173q(true);
            function5 = function11;
            function6 = function10;
            c28655q = c28655q10;
        } else {
            c28655q2.m87138X();
            function5 = function3;
            function6 = function4;
            c28655q = c28655q2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 0, (Object) viewState, (Object) function5, (InterfaceC23459e) function6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m67767H(AbstractC0524a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m67768I(AbstractC21403h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final List m67769J(C39967p c39967p, C21399d c21399d) {
        return m67775P(c39967p, c21399d.getSystolicRange(), c21399d.getDiastolicRange());
    }

    /* JADX INFO: renamed from: K */
    private static final List<ManualBloodPressureReadingInput> m67770K(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m67771L(C39967p c39967p, int i13, Integer num) {
        c39967p.set(i13, C23394a.m67704b((C23394a) c39967p.get(i13), num, null, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m67772M(C39967p c39967p, int i13, Integer num) {
        c39967p.set(i13, C23394a.m67704b((C23394a) c39967p.get(i13), null, num, 1, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m67773N(C21399d c21399d, InterfaceC28670t2 interfaceC28670t2, Function1 function1, Function1 function2) {
        List<ManualBloodPressureReadingInput> listM67770K;
        EnumC21402g buttonNextId = c21399d.getButtonNextId();
        if (buttonNextId != null && (listM67770K = m67770K(interfaceC28670t2)) != null) {
            function1.invoke(new AbstractC0524a.g(c21399d.getScreenId().name(), "proceed"));
            function2.invoke(new AbstractC21403h.d(buttonNextId, new C15552f(null, listM67770K, null, 5, null)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m67774O(C21399d c21399d, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m67766G(c21399d, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    public static final List<ManualBloodPressureReadingInput> m67775P(List<C23394a> readingStates, SageInputRange systolicRange, SageInputRange diastolicRange) {
        AbstractC22676k.m65750j(readingStates, "readingStates");
        AbstractC22676k.m65750j(systolicRange, "systolicRange");
        AbstractC22676k.m65750j(diastolicRange, "diastolicRange");
        List<C23394a> list = readingStates;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C23394a c23394a : list) {
            Integer systolic = c23394a.getSystolic();
            Integer diastolic = c23394a.getDiastolic();
            if (systolic == null || m67776Q(systolic, systolicRange) != null || diastolic == null || m67776Q(diastolic, diastolicRange) != null) {
                return null;
            }
            arrayList.add(new ManualBloodPressureReadingInput(systolic.intValue(), diastolic.intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Q */
    public static final String m67776Q(Integer num, SageInputRange range) {
        AbstractC22676k.m65750j(range, "range");
        if (num == null) {
            return null;
        }
        if (num.intValue() < range.getMin() || num.intValue() > range.getMax()) {
            return range.getRangeError();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0188  */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x0261  */
    /* JADX WARN: Code duplicated, block: B:109:0x0265  */
    /* JADX WARN: Code duplicated, block: B:112:0x0274  */
    /* JADX WARN: Code duplicated, block: B:114:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x0294  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:130:0x02db  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x0386  */
    /* JADX WARN: Code duplicated, block: B:136:0x0389  */
    /* JADX WARN: Code duplicated, block: B:139:0x0397  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:149:0x03cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x045c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0465  */
    /* JADX WARN: Code duplicated, block: B:162:0x0485  */
    /* JADX WARN: Code duplicated, block: B:163:0x0489  */
    /* JADX WARN: Code duplicated, block: B:166:0x0496  */
    /* JADX WARN: Code duplicated, block: B:168:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:171:0x0519  */
    /* JADX WARN: Code duplicated, block: B:172:0x051c  */
    /* JADX WARN: Code duplicated, block: B:175:0x052a  */
    /* JADX WARN: Code duplicated, block: B:178:0x053d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0554  */
    /* JADX WARN: Code duplicated, block: B:182:0x0556  */
    /* JADX WARN: Code duplicated, block: B:185:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0564  */
    /* JADX WARN: Code duplicated, block: B:190:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:193:0x05be  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    /* JADX INFO: renamed from: r */
    public static final void m67794r(C21401f section, SageInputRange systolicRange, SageInputRange diastolicRange, C23394a readingState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Object objM87133R;
        String str;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        String strM67776Q;
        String strM67776Q2;
        boolean z13;
        Function1 function8;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        Function1 function9;
        int iHashCode2;
        float f13;
        int iHashCode3;
        boolean z14;
        Object objM87133R4;
        Object objM87133R5;
        boolean z15;
        Object objM87133R6;
        Function1 function10;
        int iHashCode4;
        boolean z16;
        Object objM87133R7;
        Object objM87133R8;
        boolean z17;
        Object objM87133R9;
        Function1 function11;
        Integer diastolic;
        String strValueOf;
        Integer systolic;
        String strValueOf2;
        Object objM87133R10;
        Object objM87133R11;
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(systolicRange, "systolicRange");
        AbstractC22676k.m65750j(diastolicRange, "diastolicRange");
        AbstractC22676k.m65750j(readingState, "readingState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-782126698);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(section) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(systolicRange) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(diastolicRange) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(readingState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                function3 = function1;
                i15 |= c28655q2.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C23374a(13);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    }
                    if (i16 != 0) {
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C23374a(14);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function4;
                    }
                    objM87133R = c28655q2.m87133R();
                    str = "";
                    if (objM87133R == c28676v0) {
                        systolic = readingState.getSystolic();
                        if (systolic != null || (strValueOf2 = String.valueOf(systolic.intValue())) == null) {
                            strValueOf2 = "";
                        }
                        objM87133R = AbstractC28683x.m87272z(strValueOf2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        diastolic = readingState.getDiastolic();
                        if (diastolic != null && (strValueOf = String.valueOf(diastolic.intValue())) != null) {
                            str = strValueOf;
                        }
                        objM87133R2 = AbstractC28683x.m87272z(str);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    strM67776Q = m67776Q(readingState.getSystolic(), systolicRange);
                    strM67776Q2 = m67776Q(readingState.getDiastolic(), diastolicRange);
                    if (strM67776Q == null || strM67776Q2 != null) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    function8 = function7;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C23374a(15);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3409f, z13, (Function1) objM87133R3);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44099b);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    i18 = i15;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    String titleDisplay = section.getText().getTitleDisplay();
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    C2886a btS = c38072d.m121952e(c28655q2, i24).getBtS();
                    long brandWhite = c38072d.m121949b(c28655q2, i24).getBrandWhite();
                    int i25 = C2886a.f11498d << 18;
                    function9 = function3;
                    AbstractC30795n.m94707h(titleDisplay, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, btS, null, c28655q2, 0, i25, 196602);
                    float f14 = 8;
                    float f15 = 2 * f14;
                    Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f15, c28655q2, c2314t, 1.0f);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9107J, c28655q2, 6);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM91835e);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    float f16 = 4;
                    AbstractC30795n.m94707h(section.getText().getSystolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t, f16, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getBtS(), null, c28655q2, 48, i25, 196600);
                    float f17 = ((float) 0.5d) * f14;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17, c2314t));
                    Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "SystolicInputField");
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(m67798v(interfaceC28601c1));
                    float f18 = 3 * f16;
                    C33252i c33252iM105489e = AbstractC33253j.m105489e(f18);
                    if (strM67776Q != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(strM67776Q);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C23091f0(29);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C21927e(4, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function1 function12 = (Function1) objM87133R5;
                    if ((i18 & 57344) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (!z15 || objM87133R6 == c28676v0) {
                        function10 = function9;
                        objM87133R6 = new C21862n(function10, 25);
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        function10 = function9;
                    }
                    int i26 = TextResource.$stable;
                    int i27 = i26 << 3;
                    int i28 = i26 << 24;
                    function5 = function10;
                    AbstractC30787f.m94664c(modifierM3599a, textResourceM21278l, null, null, null, null, null, null, textResourceM21278l2, z14, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e, null, null, null, null, false, interfaceC4339a, function12, (Function1) objM87133R6, c28655q2, i27 | 6 | i28, 384, 14352384, 32500988);
                    c28655q2.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    AbstractC30795n.m94707h(section.getText().getDiastolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t, f16, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q2, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getBtS(), null, c28655q2, 48, i25, 196600);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f17, c2314t));
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m67800x(interfaceC28601c2));
                    C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f18);
                    if (strM67776Q2 != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(strM67776Q2);
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C23399f(0);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C21927e(5, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    Function1 function13 = (Function1) objM87133R8;
                    if ((i18 & 458752) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R9 = c28655q2.m87133R();
                    if (!z17 || objM87133R9 == c28676v0) {
                        function11 = function8;
                        objM87133R9 = new C21862n(function11, 26);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        function11 = function8;
                    }
                    AbstractC30787f.m94664c(null, textResourceM21278l3, null, null, null, null, null, null, textResourceM21278l4, z16, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e2, null, null, null, null, false, interfaceC4339a2, function13, (Function1) objM87133R9, c28655q2, i27 | i28, 384, 14352384, 32500989);
                    c28655q = c28655q2;
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                    function6 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(i13, i14, 19, section, systolicRange, diastolicRange, readingState, function5, function6);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function4 = function2;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C23374a(13);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C23374a(14);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q2.m87133R();
                str = "";
                if (objM87133R == c28676v0) {
                    systolic = readingState.getSystolic();
                    if (systolic != null) {
                        strValueOf2 = "";
                    } else {
                        strValueOf2 = "";
                    }
                    objM87133R = AbstractC28683x.m87272z(strValueOf2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    diastolic = readingState.getDiastolic();
                    if (diastolic != null) {
                        str = strValueOf;
                    }
                    objM87133R2 = AbstractC28683x.m87272z(str);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                strM67776Q = m67776Q(readingState.getSystolic(), systolicRange);
                strM67776Q2 = m67776Q(readingState.getDiastolic(), diastolicRange);
                if (strM67776Q == null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                function8 = function7;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C23374a(15);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3409f2, z13, (Function1) objM87133R3);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM44099b2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                i18 = i15;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
                String titleDisplay2 = section.getText().getTitleDisplay();
                C38072d c38072d2 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a btS2 = c38072d2.m121952e(c28655q2, i29).getBtS();
                long brandWhite2 = c38072d2.m121949b(c28655q2, i29).getBrandWhite();
                int i210 = C2886a.f11498d << 18;
                function9 = function3;
                AbstractC30795n.m94707h(titleDisplay2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, btS2, null, c28655q2, 0, i210, 196602);
                float f19 = 8;
                float f110 = 2 * f19;
                Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t2, f110, c28655q2, c2314t2, 1.0f);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f110), C2299e.f9107J, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM91835e2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m7);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N7);
                float f111 = 4;
                AbstractC30795n.m94707h(section.getText().getSystolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t2, f111, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getBtS(), null, c28655q2, 48, i210, 196600);
                float f112 = ((float) 0.5d) * f19;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f112, c2314t2));
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t2, "SystolicInputField");
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m67798v(interfaceC28601c1));
                float f113 = 3 * f111;
                C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f113);
                if (strM67776Q != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(strM67776Q);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C23091f0(29);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C21927e(4, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R5);
                }
                Function1 function14 = (Function1) objM87133R5;
                if ((i18 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z15) {
                    function10 = function9;
                    objM87133R6 = new C21862n(function10, 25);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    function10 = function9;
                    objM87133R6 = new C21862n(function10, 25);
                    c28655q2.m87172p0(objM87133R6);
                }
                int i211 = TextResource.$stable;
                int i212 = i211 << 3;
                int i213 = i211 << 24;
                function5 = function10;
                AbstractC30787f.m94664c(modifierM3599a2, textResourceM21278l5, null, null, null, null, null, null, textResourceM21278l6, z14, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e3, null, null, null, null, false, interfaceC4339a3, function14, (Function1) objM87133R6, c28655q2, i212 | 6 | i213, 384, 14352384, 32500988);
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m8);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N8);
                AbstractC30795n.m94707h(section.getText().getDiastolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t2, f111, 0.0f, 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i29).getBtS(), null, c28655q2, 48, i210, 196600);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f112, c2314t2));
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m67800x(interfaceC28601c2));
                C33252i c33252iM105489e4 = AbstractC33253j.m105489e(f113);
                if (strM67776Q2 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                TextResource textResourceM21278l8 = AbstractC8693b.m21278l(strM67776Q2);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C23399f(0);
                    c28655q2.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R7;
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C21927e(5, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R8);
                }
                Function1 function15 = (Function1) objM87133R8;
                if ((i18 & 458752) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R9 = c28655q2.m87133R();
                if (z17) {
                    function11 = function8;
                    objM87133R9 = new C21862n(function11, 26);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    function11 = function8;
                    objM87133R9 = new C21862n(function11, 26);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC30787f.m94664c(null, textResourceM21278l7, null, null, null, null, null, null, textResourceM21278l8, z16, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e4, null, null, null, null, false, interfaceC4339a4, function15, (Function1) objM87133R9, c28655q2, i212 | i213, 384, 14352384, 32500989);
                c28655q = c28655q2;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function6 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 19, section, systolicRange, diastolicRange, readingState, function5, function6);
            }
        }
        i15 |= 24576;
        function3 = function1;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C23374a(13);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                }
                if (i16 != 0) {
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C23374a(14);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q2.m87133R();
                str = "";
                if (objM87133R == c28676v0) {
                    systolic = readingState.getSystolic();
                    if (systolic != null) {
                        strValueOf2 = "";
                    } else {
                        strValueOf2 = "";
                    }
                    objM87133R = AbstractC28683x.m87272z(strValueOf2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    diastolic = readingState.getDiastolic();
                    if (diastolic != null) {
                        str = strValueOf;
                    }
                    objM87133R2 = AbstractC28683x.m87272z(str);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                strM67776Q = m67776Q(readingState.getSystolic(), systolicRange);
                strM67776Q2 = m67776Q(readingState.getDiastolic(), diastolicRange);
                if (strM67776Q == null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                function8 = function7;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C23374a(15);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM3409f3, z13, (Function1) objM87133R3);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM44099b3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a7);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m9);
                c0209i = C0217k.f732j;
                i18 = i15;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N9);
                String titleDisplay3 = section.getText().getTitleDisplay();
                C38072d c38072d3 = C38072d.f163053a;
                int i214 = C38072d.f163054b;
                C2886a btS3 = c38072d3.m121952e(c28655q2, i214).getBtS();
                long brandWhite3 = c38072d3.m121949b(c28655q2, i214).getBrandWhite();
                int i215 = C2886a.f11498d << 18;
                function9 = function3;
                AbstractC30795n.m94707h(titleDisplay3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, btS3, null, c28655q2, 0, i215, 196602);
                float f114 = 8;
                float f115 = 2 * f114;
                Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t3, f115, c28655q2, c2314t3, 1.0f);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f115), C2299e.f9107J, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM91835e3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m10);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N10);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f13, true);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N11);
                float f116 = 4;
                AbstractC30795n.m94707h(section.getText().getSystolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t3, f116, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q2, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i214).getBtS(), null, c28655q2, 48, i215, 196600);
                float f117 = ((float) 0.5d) * f114;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f117, c2314t3));
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t3, "SystolicInputField");
                TextResource textResourceM21278l9 = AbstractC8693b.m21278l(m67798v(interfaceC28601c1));
                float f118 = 3 * f116;
                C33252i c33252iM105489e5 = AbstractC33253j.m105489e(f118);
                if (strM67776Q != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(strM67776Q);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C23091f0(29);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C21927e(4, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R5);
                }
                Function1 function16 = (Function1) objM87133R5;
                if ((i18 & 57344) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q2.m87133R();
                if (z15) {
                    function10 = function9;
                    objM87133R6 = new C21862n(function10, 25);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    function10 = function9;
                    objM87133R6 = new C21862n(function10, 25);
                    c28655q2.m87172p0(objM87133R6);
                }
                int i216 = TextResource.$stable;
                int i217 = i216 << 3;
                int i218 = i216 << 24;
                function5 = function10;
                AbstractC30787f.m94664c(modifierM3599a3, textResourceM21278l9, null, null, null, null, null, null, textResourceM21278l10, z14, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e5, null, null, null, null, false, interfaceC4339a5, function16, (Function1) objM87133R6, c28655q2, i217 | 6 | i218, 384, 14352384, 32500988);
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N12);
                AbstractC30795n.m94707h(section.getText().getDiastolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t3, f116, 0.0f, 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q2, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i214).getBtS(), null, c28655q2, 48, i215, 196600);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f117, c2314t3));
                TextResource textResourceM21278l11 = AbstractC8693b.m21278l(m67800x(interfaceC28601c2));
                C33252i c33252iM105489e6 = AbstractC33253j.m105489e(f118);
                if (strM67776Q2 != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                TextResource textResourceM21278l12 = AbstractC8693b.m21278l(strM67776Q2);
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C23399f(0);
                    c28655q2.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R7;
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C21927e(5, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R8);
                }
                Function1 function17 = (Function1) objM87133R8;
                if ((i18 & 458752) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R9 = c28655q2.m87133R();
                if (z17) {
                    function11 = function8;
                    objM87133R9 = new C21862n(function11, 26);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    function11 = function8;
                    objM87133R9 = new C21862n(function11, 26);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC30787f.m94664c(null, textResourceM21278l11, null, null, null, null, null, null, textResourceM21278l12, z16, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e6, null, null, null, null, false, interfaceC4339a6, function17, (Function1) objM87133R9, c28655q2, i217 | i218, 384, 14352384, 32500989);
                c28655q = c28655q2;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function6 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(i13, i14, 19, section, systolicRange, diastolicRange, readingState, function5, function6);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function4 = function2;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C23374a(13);
                    c28655q2.m87172p0(objM87133R11);
                }
                function3 = (Function1) objM87133R11;
            }
            if (i16 != 0) {
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C23374a(14);
                    c28655q2.m87172p0(objM87133R10);
                }
                function7 = (Function1) objM87133R10;
            } else {
                function7 = function4;
            }
            objM87133R = c28655q2.m87133R();
            str = "";
            if (objM87133R == c28676v0) {
                systolic = readingState.getSystolic();
                if (systolic != null) {
                    strValueOf2 = "";
                } else {
                    strValueOf2 = "";
                }
                objM87133R = AbstractC28683x.m87272z(strValueOf2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                diastolic = readingState.getDiastolic();
                if (diastolic != null) {
                    str = strValueOf;
                }
                objM87133R2 = AbstractC28683x.m87272z(str);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            strM67776Q = m67776Q(readingState.getSystolic(), systolicRange);
            strM67776Q2 = m67776Q(readingState.getDiastolic(), diastolicRange);
            if (strM67776Q == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            function8 = function7;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C23374a(15);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM3409f4, z13, (Function1) objM87133R3);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM44099b4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a10);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m13);
            c0209i = C0217k.f732j;
            i18 = i15;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N13);
            String titleDisplay4 = section.getText().getTitleDisplay();
            C38072d c38072d4 = C38072d.f163053a;
            int i219 = C38072d.f163054b;
            C2886a btS4 = c38072d4.m121952e(c28655q2, i219).getBtS();
            long brandWhite4 = c38072d4.m121949b(c28655q2, i219).getBrandWhite();
            int i2110 = C2886a.f11498d << 18;
            function9 = function3;
            AbstractC30795n.m94707h(titleDisplay4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, btS4, null, c28655q2, 0, i2110, 196602);
            float f119 = 8;
            float f1110 = 2 * f119;
            Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t4, f1110, c28655q2, c2314t4, 1.0f);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1110), C2299e.f9107J, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM91835e4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m14);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f13, true);
            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement7);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a11);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m15);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N15);
            float f1111 = 4;
            AbstractC30795n.m94707h(section.getText().getSystolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t4, f1111, 0.0f, 0.0f, 0.0f, 14), c38072d4.m121949b(c28655q2, i219).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i219).getBtS(), null, c28655q2, 48, i2110, 196600);
            float f1112 = ((float) 0.5d) * f119;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1112, c2314t4));
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t4, "SystolicInputField");
            TextResource textResourceM21278l13 = AbstractC8693b.m21278l(m67798v(interfaceC28601c1));
            float f1113 = 3 * f1111;
            C33252i c33252iM105489e7 = AbstractC33253j.m105489e(f1113);
            if (strM67776Q != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            TextResource textResourceM21278l14 = AbstractC8693b.m21278l(strM67776Q);
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C23091f0(29);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C21927e(4, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R5);
            }
            Function1 function18 = (Function1) objM87133R5;
            if ((i18 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R6 = c28655q2.m87133R();
            if (z15) {
                function10 = function9;
                objM87133R6 = new C21862n(function10, 25);
                c28655q2.m87172p0(objM87133R6);
            } else {
                function10 = function9;
                objM87133R6 = new C21862n(function10, 25);
                c28655q2.m87172p0(objM87133R6);
            }
            int i2111 = TextResource.$stable;
            int i2112 = i2111 << 3;
            int i2113 = i2111 << 24;
            function5 = function10;
            AbstractC30787f.m94664c(modifierM3599a4, textResourceM21278l13, null, null, null, null, null, null, textResourceM21278l14, z14, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e7, null, null, null, null, false, interfaceC4339a7, function18, (Function1) objM87133R6, c28655q2, i2112 | 6 | i2113, 384, 14352384, 32500988);
            c28655q2.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m16);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N16);
            AbstractC30795n.m94707h(section.getText().getDiastolicInputLabelDisplay(), AbstractC1099a.m3398t(c2314t4, f1111, 0.0f, 0.0f, 0.0f, 14), c38072d4.m121949b(c28655q2, i219).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i219).getBtS(), null, c28655q2, 48, i2110, 196600);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f1112, c2314t4));
            TextResource textResourceM21278l15 = AbstractC8693b.m21278l(m67800x(interfaceC28601c2));
            C33252i c33252iM105489e8 = AbstractC33253j.m105489e(f1113);
            if (strM67776Q2 != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            TextResource textResourceM21278l16 = AbstractC8693b.m21278l(strM67776Q2);
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C23399f(0);
                c28655q2.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R7;
            objM87133R8 = c28655q2.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C21927e(5, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R8);
            }
            Function1 function19 = (Function1) objM87133R8;
            if ((i18 & 458752) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R9 = c28655q2.m87133R();
            if (z17) {
                function11 = function8;
                objM87133R9 = new C21862n(function11, 26);
                c28655q2.m87172p0(objM87133R9);
            } else {
                function11 = function8;
                objM87133R9 = new C21862n(function11, 26);
                c28655q2.m87172p0(objM87133R9);
            }
            AbstractC30787f.m94664c(null, textResourceM21278l15, null, null, null, null, null, null, textResourceM21278l16, z16, null, false, 3, 0, 0, false, null, false, false, null, c33252iM105489e8, null, null, null, null, false, interfaceC4339a8, function19, (Function1) objM87133R9, c28655q2, i2112 | i2113, 384, 14352384, 32500989);
            c28655q = c28655q2;
            AbstractC25012a.m73392y(c28655q, true, true, true);
            function6 = function11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(i13, i14, 19, section, systolicRange, diastolicRange, readingState, function5, function6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m67795s(Integer num) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m67796t(Integer num) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m67797u(C21401f c21401f, SageInputRange sageInputRange, SageInputRange sageInputRange2, C23394a c23394a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m67794r(c21401f, sageInputRange, sageInputRange2, c23394a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final String m67798v(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m67799w(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: x */
    private static final String m67800x(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: y */
    private static final void m67801y(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Modifier m67802z(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3398t(applyIf, 0.0f, 0.0f, 0.0f, 3 * 8, 7);
    }
}
