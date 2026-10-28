package fa0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import bc3.InterfaceC2994c0;
import be1.C3172f;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca0.AbstractC4359a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cu2.C11139s;
import cy1.C11186b;
import d30.C11558r;
import da0.InterfaceC11829b;
import da0.InterfaceC11831d;
import eo2.C13390j;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import j11.AbstractC21211n;
import java.util.List;
import java.util.WeakHashMap;
import kd1.C22411w;
import l83.C23454a0;
import n82.C26457c;
import n82.InterfaceC26456b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import o82.AbstractC27660d;
import or2.C28205u0;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p133f1.C13921a0;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p294l3.C23254g;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.C32864d;
import sp0.C32870j;
import tp0.AbstractC34056a;
import tp0.AbstractC34057b;
import tp0.AbstractC34060e;
import tp0.EnumC34058c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import z90.AbstractC40203a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: fa0.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\u000e\u0010\u001d\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lda0/d;", "viewState", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function1;", "Lda0/b;", "Ll83/a0;", "onEvent", "Ln82/b;", "onSelectActivityTypeEvent", "Lca0/a;", "onNavigationEvent", "I", "(Lda0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lda0/d$a;", "Ltp0/c;", "onSectionSelected", "selectedSectionState", "B", "(Lda0/d$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ltp0/c;Lor2/u0;Lzr2/a;Landroidx/compose/runtime/Composer;II)V", "onSectionClicked", "X", "(Ltp0/c;Lkotlin/jvm/functions/Function1;Lda0/d$a;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lda0/d$d;", "onViewEvent", "f0", "(Lda0/d$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "screenSelectedSectionState", "Lcom/whoop/design/util/TextResource;", "bottomSheetTitle", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14296c {

    /* JADX INFO: renamed from: fa0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.view.compose.AddActivityScreenKt$AddActivityScreen$1$1", m100430f = "AddActivityScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f52200E;

        /* JADX INFO: renamed from: w */
        int f52201w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f52202x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f52203y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f52204z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, float f13, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52202x = c15199y3;
            this.f52203y = f13;
            this.f52204z = function1;
            this.f52200E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f52202x, this.f52203y, this.f52204z, this.f52200E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52201w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC15209z3 enumC15209z3M43221b = this.f52202x.m43221b();
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            if (enumC15209z3M43221b == enumC15209z3 && this.f52202x.m43222c() == enumC15209z3 && ((Number) this.f52202x.f57060b.f55774k.getValue()).floatValue() == this.f52203y) {
                AbstractC14296c.m40848K(this.f52200E, EnumC34058c.NONE);
                this.f52204z.invoke(InterfaceC11829b.e.f38431a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fa0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.view.compose.AddActivityScreenKt$FullScreenModalScreen$1$4$1", m100430f = "AddActivityScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52205w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC11831d.d f52206x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f52207y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC11831d.d dVar, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52206x = dVar;
            this.f52207y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f52206x, this.f52207y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52205w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC11829b interfaceC11829bM31763h = this.f52206x.getFollowUpEvent();
            if (interfaceC11829bM31763h != null) {
                this.f52207y.invoke(interfaceC11829bM31763h);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0262  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x030f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:123:0x0320  */
    /* JADX WARN: Code duplicated, block: B:126:0x0352  */
    /* JADX WARN: Code duplicated, block: B:128:0x0381  */
    /* JADX WARN: Code duplicated, block: B:129:0x0387  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:139:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:148:0x040c  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x020c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0256  */
    /* JADX WARN: Code duplicated, block: B:98:0x0258  */
    /* JADX INFO: renamed from: B */
    public static final void m40839B(InterfaceC11831d.a viewState, Function1 onSectionSelected, Function1 onEvent, EnumC34058c enumC34058c, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Composer composer, int i13, int i14) {
        int i15;
        Function1 function1;
        EnumC34058c enumC34058c2;
        EnumC34058c enumC34058c3;
        C0209i c0209i;
        C23016z c23016z;
        float f13;
        int iHashCode;
        C38072d c38072d;
        int i16;
        int i17;
        boolean z4;
        int i18;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        EnumC34058c enumC34058c4;
        int i19;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        boolean z17;
        Object objM87133R4;
        boolean z18;
        int i24;
        int iHashCode2;
        boolean z19;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSectionSelected, "onSectionSelected");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1619875446);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onSectionSelected) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        int i25 = i14 & 8;
        if (i25 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC34058c == null ? -1 : enumC34058c.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q.m87153g(localizedDateTimeFormatter) : c28655q.m87157i(localizedDateTimeFormatter) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(dateAndTimeProvider) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            EnumC34058c enumC34058c5 = i25 != 0 ? EnumC34058c.NONE : enumC34058c;
            WeakHashMap weakHashMap = C22944c2.f90553v;
            boolean zBooleanValue = ((Boolean) C22949e.m66712e(c28655q).f90556c.f90544d.getValue()).booleanValue();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                enumC34058c3 = enumC34058c5;
            } else {
                enumC34058c3 = enumC34058c5;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                c23016z = C23016z.f90757a;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c23016z.m66779c(c2314t, true, 0.8f), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                f13 = 8;
                C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 2.5d, f13, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
                C22411w c22411w = C22411w.f87680a;
                Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3398t, c22411w.m64535a().m64090c());
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i16).getBlack10(), c22411w.m64535a().m64090c());
                C39282o c39282oM31748k = viewState.getSelectedActivityMenuItemState();
                i17 = i15 & 112;
                if (i17 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i18 = i15 & 896;
                int i26 = i15;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z4 | z13 | c28655q.m87157i(viewState);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C11558r(onSectionSelected, onEvent, viewState, 12);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC39281n.m125207c(modifierM3358c, c39282oM31748k, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 0);
                AbstractC17755i2.m50938j(null, null, null, AbstractC8693b.m21277k(AbstractC40203a.f173541N), null, 0L, 0L, null, c28655q, TextResource.C8688b.f25889c << 9, 247);
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C12122i(onSectionSelected, 20);
                    c28655q.m87172p0(objM87133R2);
                }
                int i27 = i26 >> 3;
                enumC34058c4 = enumC34058c3;
                m40861X(enumC34058c4, (Function1) objM87133R2, viewState, localizedDateTimeFormatter, dateAndTimeProvider, onEvent, c28655q, ((i26 >> 9) & 14) | ((i26 << 6) & 896) | (C28205u0.f113964d << 9) | (i27 & 7168) | (i27 & 57344) | (458752 & (i26 << 9)));
                TextResource textResourceM31744g = viewState.getLocationDividerTitleDisplay();
                i19 = TextResource.$stable;
                int i28 = i19 << 9;
                AbstractC17755i2.m50938j(null, null, null, textResourceM31744g, null, 0L, 0L, null, c28655q, i28, 247);
                C32870j c32870jM31741d = viewState.getCurrentStrapLocation();
                if (enumC34058c4 == EnumC34058c.STRAP_LOCATION) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i17 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z16 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C12122i(onSectionSelected, 21);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function2 = (Function1) objM87133R3;
                TextResource textResourceM31745h = viewState.getLocationPromptDisplay();
                List<C32870j> listM31739b = viewState.m31739b();
                if (i18 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z17 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C12122i(onEvent, 22);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC34060e.m107654p(c32870jM31741d, z15, function2, textResourceM31745h, 0, listM31739b, (Function1) objM87133R4, c28655q, i19 | i28, 16);
                c28655q = c28655q;
                AbstractC22953f.m66715b(c28655q, c23016z.m66779c(c2314t, true, 1.0f));
                c28655q.m87173q(true);
                if (zBooleanValue) {
                    function1 = onEvent;
                    z18 = true;
                    c28655q.m87150e0(282119862);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(281525964);
                    Modifier modifierM3394p = AbstractC1099a.m3394p(3 * f13, c23016z.m66779c(c2314t, true, 0.2f));
                    i24 = 0;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h = AbstractC8693b.m21274h(viewState.getCallToActionDisplay(), c28655q, i19);
                    long jM125377a = c38072d.m121949b(c28655q, i16).getAccentAction();
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    boolean zM31747j = viewState.getPrimaryButtonEnabled();
                    if (i18 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (!z19 || objM87133R5 == c28676v0) {
                        function1 = onEvent;
                        objM87133R5 = new C14294a(function1, i24);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function1 = onEvent;
                    }
                    z18 = true;
                    AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h, zM31747j, jM125377a, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 96);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z18);
                enumC34058c2 = enumC34058c4;
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            c23016z = C23016z.f90757a;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(c23016z.m66779c(c2314t, true, 0.8f), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            f13 = 8;
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 2.5d, f13, c2305k, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
            C22411w c22411w2 = C22411w.f87680a;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifierM3398t2, c22411w2.m64535a().m64090c());
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, c38072d.m121949b(c28655q, i16).getBlack10(), c22411w2.m64535a().m64090c());
            C39282o c39282oM31748k2 = viewState.getSelectedActivityMenuItemState();
            i17 = i15 & 112;
            if (i17 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            i18 = i15 & 896;
            int i29 = i15;
            if (i18 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z4 | z13 | c28655q.m87157i(viewState);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i) {
                objM87133R = new C11558r(onSectionSelected, onEvent, viewState, 12);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11558r(onSectionSelected, onEvent, viewState, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(modifierM3358c2, c39282oM31748k2, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 0);
            AbstractC17755i2.m50938j(null, null, null, AbstractC8693b.m21277k(AbstractC40203a.f173541N), null, 0L, 0L, null, c28655q, TextResource.C8688b.f25889c << 9, 247);
            if (i17 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new C12122i(onSectionSelected, 20);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12122i(onSectionSelected, 20);
                c28655q.m87172p0(objM87133R2);
            }
            int i210 = i29 >> 3;
            enumC34058c4 = enumC34058c3;
            m40861X(enumC34058c4, (Function1) objM87133R2, viewState, localizedDateTimeFormatter, dateAndTimeProvider, onEvent, c28655q, ((i29 >> 9) & 14) | ((i29 << 6) & 896) | (C28205u0.f113964d << 9) | (i210 & 7168) | (i210 & 57344) | (458752 & (i29 << 9)));
            TextResource textResourceM31744g2 = viewState.getLocationDividerTitleDisplay();
            i19 = TextResource.$stable;
            int i211 = i19 << 9;
            AbstractC17755i2.m50938j(null, null, null, textResourceM31744g2, null, 0L, 0L, null, c28655q, i211, 247);
            C32870j c32870jM31741d2 = viewState.getCurrentStrapLocation();
            if (enumC34058c4 == EnumC34058c.STRAP_LOCATION) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i17 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                objM87133R3 = new C12122i(onSectionSelected, 21);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C12122i(onSectionSelected, 21);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function3 = (Function1) objM87133R3;
            TextResource textResourceM31745h2 = viewState.getLocationPromptDisplay();
            List<C32870j> listM31739b2 = viewState.m31739b();
            if (i18 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z17) {
                objM87133R4 = new C12122i(onEvent, 22);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C12122i(onEvent, 22);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC34060e.m107654p(c32870jM31741d2, z15, function3, textResourceM31745h2, 0, listM31739b2, (Function1) objM87133R4, c28655q, i19 | i211, 16);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, c23016z.m66779c(c2314t, true, 1.0f));
            c28655q.m87173q(true);
            if (zBooleanValue) {
                c28655q.m87150e0(281525964);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(3 * f13, c23016z.m66779c(c2314t, true, 0.2f));
                i24 = 0;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getCallToActionDisplay(), c28655q, i19);
                long jM125377a2 = c38072d.m121949b(c28655q, i16).getAccentAction();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM31747j2 = viewState.getPrimaryButtonEnabled();
                if (i18 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z19) {
                    function1 = onEvent;
                    objM87133R5 = new C14294a(function1, i24);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function1 = onEvent;
                    objM87133R5 = new C14294a(function1, i24);
                    c28655q.m87172p0(objM87133R5);
                }
                z18 = true;
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h2, zM31747j2, jM125377a2, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 96);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                function1 = onEvent;
                z18 = true;
                c28655q.m87150e0(282119862);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z18);
            enumC34058c2 = enumC34058c4;
        } else {
            function1 = onEvent;
            c28655q.m87138X();
            enumC34058c2 = enumC34058c;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(viewState, onSectionSelected, function1, enumC34058c2, localizedDateTimeFormatter, dateAndTimeProvider, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m40840C(Function1 function1, Function1 function2, InterfaceC11831d.a aVar) {
        function1.invoke(EnumC34058c.NONE);
        function2.invoke(new InterfaceC11829b.i(aVar.getPageType()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m40841D(Function1 function1, EnumC34058c it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m40842E(Function1 function1, boolean z4) {
        function1.invoke(EnumC34058c.STRAP_LOCATION);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m40843F(Function1 function1, C32870j it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC11829b.l(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m40844G(Function1 function1) {
        function1.invoke(InterfaceC11829b.j.f38440a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m40845H(InterfaceC11831d.a aVar, Function1 function1, Function1 function2, EnumC34058c enumC34058c, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, int i13, int i14, Composer composer, int i15) {
        m40839B(aVar, function1, function2, enumC34058c, c28205u0, interfaceC41070a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026c  */
    /* JADX WARN: Code duplicated, block: B:101:0x0288  */
    /* JADX WARN: Code duplicated, block: B:104:0x0295  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x032d  */
    /* JADX WARN: Code duplicated, block: B:124:0x033a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0353  */
    /* JADX WARN: Code duplicated, block: B:127:0x0355  */
    /* JADX WARN: Code duplicated, block: B:131:0x035e  */
    /* JADX WARN: Code duplicated, block: B:134:0x036f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0371  */
    /* JADX WARN: Code duplicated, block: B:139:0x037a  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static final void m40846I(InterfaceC11831d viewState, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Function1 function1, Function1 onSelectActivityTypeEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object aVar;
        EnumC15209z3 enumC15209z3;
        InterfaceC28601c1 interfaceC28601c1;
        int i15;
        boolean z4;
        Function1 function2;
        C15199y3 c15199y3;
        C39274g c39274g;
        C39274g c39274g2;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        boolean z15;
        Object objM87133R3;
        boolean z16;
        Object objM87133R4;
        boolean z17;
        Object objM87133R5;
        Function1 onEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onSelectActivityTypeEvent, "onSelectActivityTypeEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1337249389);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(localizedDateTimeFormatter) : c28655q2.m87157i(localizedDateTimeFormatter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(dateAndTimeProvider) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onSelectActivityTypeEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q2, 3078, 6);
            Object objM87133R6 = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(EnumC34058c.NONE);
                c28655q2.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R6;
            Object objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(AbstractC8693b.m21267a());
                c28655q2.m87172p0(objM87133R7);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R7;
            EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
            EnumC15209z3 enumC15209z3M43222c = c15199y3M3460c.m43222c();
            boolean zM87157i = c28655q2.m87157i(c15199y3M3460c);
            int i16 = i14 & 7168;
            boolean z18 = zM87157i | (i16 == 2048);
            Object objM87133R8 = c28655q2.m87133R();
            if (z18 || objM87133R8 == c28676v0) {
                enumC15209z3 = enumC15209z3M43222c;
                interfaceC28601c1 = interfaceC28601c2;
                i15 = i14;
                z4 = false;
                function2 = function1;
                c15199y3 = c15199y3M3460c;
                aVar = new a(c15199y3, 1.0f, function2, interfaceC28601c1, null);
                c28655q2.m87172p0(aVar);
            } else {
                function2 = onEvent;
                aVar = objM87133R8;
                i15 = i14;
                enumC15209z3 = enumC15209z3M43222c;
                interfaceC28601c1 = interfaceC28601c2;
                z4 = false;
                c15199y3 = c15199y3M3460c;
            }
            AbstractC28683x.m87254h(enumC15209z3M43221b, enumC15209z3, (InterfaceC4351m) aVar, c28655q2);
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.8f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z4);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            TextResource textResourceM40849L = m40849L(interfaceC28601c3);
            if (viewState instanceof InterfaceC11831d.a) {
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getAction().getCross(), AbstractC8693b.m21277k(AbstractC40203a.f173544a));
            } else {
                TextResource textResource = null;
                Object[] objArr = 0;
                if (viewState instanceof InterfaceC11831d.e) {
                    c39274g2 = new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), textResource, 2, objArr == true ? 1 : 0);
                } else {
                    c39274g = null;
                }
                C35666g c35666g = new C35666g(textResourceM40849L, c39274g, null, null, null, 0.0f, 0.0f, 124, null);
                AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3);
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C13390j(function2, 29);
                    c28655q2.m87172p0(objM87133R);
                }
                onEvent = function1;
                AbstractC35660d.m112871m(null, c35666g, aVar2, null, (InterfaceC4339a) objM87133R, null, null, AbstractC37817c.m121344e(-698576811, c28655q2, new C11139s(viewState, function1, localizedDateTimeFormatter, dateAndTimeProvider, onSelectActivityTypeEvent, interfaceC28601c3, interfaceC28601c1, 2)), false, null, null, null, false, null, C14297d.f52208a.m40903b(), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
                c28655q = c28655q2;
                if (viewState instanceof InterfaceC11831d.d) {
                    c28655q.m87150e0(2112943417);
                    m40875f0((InterfaceC11831d.d) viewState, onEvent, onNavigationEvent, c28655q, (i15 & 14) | ((i15 >> 6) & 112) | ((i15 >> 9) & 896));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2113068347);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof InterfaceC11831d.b) {
                    c28655q.m87150e0(2113156108);
                    InterfaceC11831d.b bVar = (InterfaceC11831d.b) viewState;
                    TextResource textResourceM31751b = bVar.getDialogTitle();
                    C23254g c23254gM107629a = AbstractC34056a.m107629a(bVar.getDescription(), c28655q, 0);
                    TextResource textResourceM31752c = bVar.getPrimaryButtonText();
                    if (i16 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z16 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C14294a(onEvent, 5);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                    if (i16 == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z17 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C14294a(onEvent, 6);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i17 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM31751b, null, textResourceM31752c, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, c23254gM107629a, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R5, null, null, null, c28655q, (i17 << 3) | (i17 << 9), 384, 0, 247197685);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2113641723);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof InterfaceC11831d.c) {
                    c28655q.m87150e0(2113733359);
                    InterfaceC11831d.c cVar = (InterfaceC11831d.c) viewState;
                    TextResource textResourceM31754b = cVar.getDialogTitle();
                    TextResource textResourceM31753a = cVar.getDescription();
                    TextResource textResourceM31755c = cVar.getPrimaryButtonText();
                    if (i16 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C14294a(onEvent, 7);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    if (i16 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C14294a(onEvent, 8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i18 = TextResource.$stable;
                    C28655q c28655q3 = c28655q;
                    AbstractC21211n.m59497o(null, textResourceM31754b, textResourceM31753a, textResourceM31755c, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, (InterfaceC4339a) objM87133R3, null, null, null, c28655q3, (i18 << 3) | (i18 << 6) | (i18 << 9), 384, 0, 247459825);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2114185339);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            c39274g = c39274g2;
            C35666g c35666g2 = new C35666g(textResourceM40849L, c39274g, null, null, null, 0.0f, 0.0f, 124, null);
            AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y3);
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C13390j(function2, 29);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C13390j(function2, 29);
                c28655q2.m87172p0(objM87133R);
            }
            onEvent = function1;
            AbstractC35660d.m112871m(null, c35666g2, aVar3, null, (InterfaceC4339a) objM87133R, null, null, AbstractC37817c.m121344e(-698576811, c28655q2, new C11139s(viewState, function1, localizedDateTimeFormatter, dateAndTimeProvider, onSelectActivityTypeEvent, interfaceC28601c3, interfaceC28601c1, 2)), false, null, null, null, false, null, C14297d.f52208a.m40903b(), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
            c28655q = c28655q2;
            if (viewState instanceof InterfaceC11831d.d) {
                c28655q.m87150e0(2112943417);
                m40875f0((InterfaceC11831d.d) viewState, onEvent, onNavigationEvent, c28655q, (i15 & 14) | ((i15 >> 6) & 112) | ((i15 >> 9) & 896));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2113068347);
                c28655q.m87173q(false);
            }
            if (viewState instanceof InterfaceC11831d.b) {
                c28655q.m87150e0(2113156108);
                InterfaceC11831d.b bVar2 = (InterfaceC11831d.b) viewState;
                TextResource textResourceM31751b2 = bVar2.getDialogTitle();
                C23254g c23254gM107629a2 = AbstractC34056a.m107629a(bVar2.getDescription(), c28655q, 0);
                TextResource textResourceM31752c2 = bVar2.getPrimaryButtonText();
                if (i16 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z16) {
                    objM87133R4 = new C14294a(onEvent, 5);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C14294a(onEvent, 5);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                if (i16 == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z17) {
                    objM87133R5 = new C14294a(onEvent, 6);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C14294a(onEvent, 6);
                    c28655q.m87172p0(objM87133R5);
                }
                int i19 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM31751b2, null, textResourceM31752c2, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, c23254gM107629a2, null, false, null, interfaceC4339a3, null, (InterfaceC4339a) objM87133R5, null, null, null, c28655q, (i19 << 3) | (i19 << 9), 384, 0, 247197685);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2113641723);
                c28655q.m87173q(false);
            }
            if (viewState instanceof InterfaceC11831d.c) {
                c28655q.m87150e0(2113733359);
                InterfaceC11831d.c cVar2 = (InterfaceC11831d.c) viewState;
                TextResource textResourceM31754b2 = cVar2.getDialogTitle();
                TextResource textResourceM31753a2 = cVar2.getDescription();
                TextResource textResourceM31755c2 = cVar2.getPrimaryButtonText();
                if (i16 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C14294a(onEvent, 7);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C14294a(onEvent, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                if (i16 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    objM87133R3 = new C14294a(onEvent, 8);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C14294a(onEvent, 8);
                    c28655q.m87172p0(objM87133R3);
                }
                int i110 = TextResource.$stable;
                C28655q c28655q4 = c28655q;
                AbstractC21211n.m59497o(null, textResourceM31754b2, textResourceM31753a2, textResourceM31755c2, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a4, null, (InterfaceC4339a) objM87133R3, null, null, null, c28655q4, (i110 << 3) | (i110 << 6) | (i110 << 9), 384, 0, 247459825);
                c28655q = c28655q4;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2114185339);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f((Object) viewState, (Object) localizedDateTimeFormatter, (Object) dateAndTimeProvider, (Object) onEvent, (Object) onSelectActivityTypeEvent, (Object) onNavigationEvent, i13, 5);
        }
    }

    /* JADX INFO: renamed from: J */
    private static final EnumC34058c m40847J(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC34058c) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m40848K(InterfaceC28601c1 interfaceC28601c1, EnumC34058c enumC34058c) {
        interfaceC28601c1.setValue(enumC34058c);
    }

    /* JADX INFO: renamed from: L */
    private static final TextResource m40849L(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: M */
    private static final void m40850M(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m40851N(Function1 function1) {
        function1.invoke(new InterfaceC11829b.b(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m40852O(InterfaceC11831d interfaceC11831d, Function1 function1, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c3;
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.8f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean z4 = interfaceC11831d instanceof InterfaceC11831d.a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(2078527032);
                InterfaceC11831d.a aVar = (InterfaceC11831d.a) interfaceC11831d;
                m40850M(interfaceC28601c1, aVar.getAddActivityTitleDisplay());
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c2;
                    objM87133R = new C13921a0(2, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                }
                m40839B(aVar, (Function1) objM87133R, function1, m40847J(interfaceC28601c3), c28205u0, interfaceC41070a, c28655q, (C28205u0.f113964d << 12) | 48, 0);
                c28655q.m87173q(false);
            } else if (interfaceC11831d instanceof InterfaceC11831d.e) {
                c28655q.m87150e0(2079598082);
                InterfaceC11831d.e eVar = (InterfaceC11831d.e) interfaceC11831d;
                m40850M(interfaceC28601c1, eVar.getSelectActivityTitleDisplay());
                C26457c c26457cM31776b = eVar.m31776b();
                boolean zM87153g = c28655q.m87153g(function2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C12122i(function2, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function3 = (Function1) objM87133R2;
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C12122i(function1, 19);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27660d.m83637n(c26457cM31776b, function3, (Function1) objM87133R3, c28655q, C26457c.f105074k);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2080266101);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m40853P(InterfaceC28601c1 interfaceC28601c1, EnumC34058c selectedSection) {
        AbstractC22676k.m65750j(selectedSection, "selectedSection");
        if (selectedSection == m40847J(interfaceC28601c1)) {
            selectedSection = EnumC34058c.NONE;
        }
        m40848K(interfaceC28601c1, selectedSection);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m40854Q(Function1 function1, InterfaceC26456b selectActivityEvent) {
        AbstractC22676k.m65750j(selectActivityEvent, "selectActivityEvent");
        function1.invoke(selectActivityEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m40855R(Function1 function1, String activityName) {
        AbstractC22676k.m65750j(activityName, "activityName");
        function1.invoke(new InterfaceC11829b.a(activityName));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m40856S(Function1 function1) {
        function1.invoke(InterfaceC11829b.c.f38429a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m40857T(Function1 function1) {
        function1.invoke(InterfaceC11829b.c.f38429a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m40858U(Function1 function1) {
        function1.invoke(InterfaceC11829b.c.f38429a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m40859V(Function1 function1) {
        function1.invoke(InterfaceC11829b.c.f38429a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m40860W(InterfaceC11831d interfaceC11831d, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m40846I(interfaceC11831d, c28205u0, interfaceC41070a, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    public static final void m40861X(EnumC34058c selectedSectionState, Function1 onSectionClicked, InterfaceC11831d.a viewState, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(selectedSectionState, "selectedSectionState");
        AbstractC22676k.m65750j(onSectionClicked, "onSectionClicked");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1491947569);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(selectedSectionState.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onSectionClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(localizedDateTimeFormatter) : c28655q.m87157i(localizedDateTimeFormatter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(dateAndTimeProvider) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            boolean z4 = selectedSectionState == EnumC34058c.START_DATE;
            int i15 = i14 & 112;
            boolean z13 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C14294a(onSectionClicked, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z14 = selectedSectionState == EnumC34058c.START_TIME;
            boolean z15 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C14294a(onSectionClicked, 2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = i14;
            boolean z16 = z14;
            C32864d c32864dM31749l = viewState.getStartTimePickerState();
            int i17 = i16 & 458752;
            boolean z17 = i17 == 131072;
            Object objM87133R3 = c28655q.m87133R();
            if (z17 || objM87133R3 == c28676v0) {
                objM87133R3 = new C12122i(onEvent, 23);
                c28655q.m87172p0(objM87133R3);
            }
            int i18 = C28205u0.f113964d << 18;
            int i19 = i16 << 9;
            int i24 = i19 & 3670016;
            int i25 = i19 & 29360128;
            AbstractC34057b.m107634e(modifierM3398t, z4, interfaceC4339a, z16, interfaceC4339a2, c32864dM31749l, localizedDateTimeFormatter, dateAndTimeProvider, (Function1) objM87133R3, c28655q, i18 | 6 | i24 | i25, 0);
            boolean z18 = selectedSectionState == EnumC34058c.END_DATE;
            boolean z19 = i15 == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z19 || objM87133R4 == c28676v0) {
                objM87133R4 = new C14294a(onSectionClicked, 3);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
            boolean z24 = selectedSectionState == EnumC34058c.END_TIME;
            boolean z25 = i15 == 32;
            Object objM87133R5 = c28655q.m87133R();
            if (z25 || objM87133R5 == c28676v0) {
                objM87133R5 = new C14294a(onSectionClicked, 4);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
            C32864d c32864dM31742e = viewState.getEndTimePickerState();
            boolean z26 = i17 == 131072;
            Object objM87133R6 = c28655q.m87133R();
            if (z26 || objM87133R6 == c28676v0) {
                objM87133R6 = new C12122i(onEvent, 24);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC34057b.m107634e(null, z18, interfaceC4339a3, z24, interfaceC4339a4, c32864dM31742e, localizedDateTimeFormatter, dateAndTimeProvider, (Function1) objM87133R6, c28655q, i18 | i24 | i25, 1);
            C4092p2 c4092p2M31743f = viewState.getInfoCalloutState();
            if (c4092p2M31743f == null) {
                c28655q.m87150e0(1401489671);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1401489672);
                AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c4092p2M31743f, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(selectedSectionState, onSectionClicked, viewState, localizedDateTimeFormatter, dateAndTimeProvider, onEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m40862Y(Function1 function1) {
        function1.invoke(EnumC34058c.START_DATE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m40863Z(Function1 function1) {
        function1.invoke(EnumC34058c.START_TIME);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m40865a0(Function1 function1, LocalDateTime it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC11829b.k(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m40867b0(Function1 function1) {
        function1.invoke(EnumC34058c.END_DATE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m40869c0(Function1 function1) {
        function1.invoke(EnumC34058c.END_TIME);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m40871d0(Function1 function1, LocalDateTime it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC11829b.d(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m40873e0(EnumC34058c enumC34058c, Function1 function1, InterfaceC11831d.a aVar, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function2, int i13, Composer composer, int i14) {
        m40861X(enumC34058c, function1, aVar, c28205u0, interfaceC41070a, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m40875f0(final InterfaceC11831d.d viewState, final Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(475126757);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = viewState.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q2.m87150e0(2109812818);
                TextResource textResourceMo105309c = viewState.getType().getTitle();
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C14294a(onNavigationEvent, 9);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceMo105309c, 0L, (InterfaceC4339a) objM87133R, 2, null), viewState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(2110179827);
                int i15 = i14;
                AbstractC33208p0 abstractC33208p0M31769n = viewState.getType();
                TextResource textResourceM31768m = viewState.getSupportText();
                TextResource textResourceM31765j = viewState.getPrimaryButtonText();
                int i16 = i15 & 112;
                boolean zM87157i = c28655q2.m87157i(viewState) | (i16 == 32);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i17 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: fa0.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    return AbstractC14296c.m40879h0(viewState, onViewEvent);
                                default:
                                    return AbstractC14296c.m40881i0(viewState, onViewEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean zM21270d = AbstractC8693b.m21270d(viewState.getSecondaryButtonText());
                TextResource textResourceM31767l = viewState.getSecondaryButtonText();
                boolean zM87157i2 = c28655q2.m87157i(viewState) | (i16 == 32);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i18 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: fa0.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC14296c.m40879h0(viewState, onViewEvent);
                                default:
                                    return AbstractC14296c.m40881i0(viewState, onViewEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                int i19 = AbstractC33208p0.f138461d;
                int i24 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M31769n, textResourceM31768m, null, textResourceM31765j, interfaceC4339a, zM21270d, false, textResourceM31767l, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i19 | (i24 << 3) | (i24 << 9) | (i24 << 21), 0, 3652);
                c28655q = c28655q2;
                InterfaceC11829b interfaceC11829bM31763h = viewState.getFollowUpEvent();
                boolean zM87157i3 = c28655q.m87157i(viewState) | (i16 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new b(viewState, onViewEvent, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC11829bM31763h);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(viewState, onViewEvent, onNavigationEvent, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m40877g0(Function1 function1) {
        function1.invoke(AbstractC4359a.a.f17632a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m40879h0(InterfaceC11831d.d dVar, Function1 function1) {
        InterfaceC11829b interfaceC11829bM31764i = dVar.getPrimaryButtonClickEvent();
        if (interfaceC11829bM31764i != null) {
            function1.invoke(interfaceC11829bM31764i);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m40881i0(InterfaceC11831d.d dVar, Function1 function1) {
        InterfaceC11829b interfaceC11829bM31766k = dVar.getSecondaryButtonClickEvent();
        if (interfaceC11829bM31766k != null) {
            function1.invoke(interfaceC11829bM31766k);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m40883j0(InterfaceC11831d.d dVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m40875f0(dVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
