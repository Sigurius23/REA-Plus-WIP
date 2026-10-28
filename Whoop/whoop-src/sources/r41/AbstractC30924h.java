package r41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b30.C2564l1;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import g40.C15362h2;
import ge3.AbstractC15751g;
import jp2.C21881l;
import l83.C23454a0;
import nw0.C27198e;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p163g1.AbstractC15170v4;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p294l3.C23254g;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p412q3.C29869e0;
import p412q3.InterfaceC29873g0;
import p412q3.InterfaceC29884r;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p510u0.C34342o0;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p730qt2.C30617w;
import p90.C29000h;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qb0.C30179a;
import qr2.AbstractC30556a;
import qv1.C30654e;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import qz0.C30793l;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: r41.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0019\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u001a\u0010\u001f\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u001a\u0010\"\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015\"\u001a\u0010%\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015\"\u001a\u0010(\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015¨\u0006+²\u0006\u0010\u0010*\u001a\u0004\u0018\u00010)8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lr41/i;", "itemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "o", "(Lr41/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "", "G", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "Lq3/r;", "O", "(Ljava/lang/CharSequence;)Lq3/r;", "Ly3/f;", "a", "F", "J", "()F", "weightliftingSetIconStartPadding", "b", "H", "weightliftingSetIconEndPadding", "c", "I", "weightliftingSetIconSize", "d", "N", "weightliftingSetTextFieldSpacerSize", "e", "M", "weightliftingSetNumberStartPadding", "f", "K", "weightliftingSetNumberEndPadding", "g", "L", "weightliftingSetNumberSize", "Lg2/v;", "focusState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30924h {

    /* JADX INFO: renamed from: a */
    private static final float f127507a;

    /* JADX INFO: renamed from: b */
    private static final float f127508b;

    /* JADX INFO: renamed from: c */
    private static final float f127509c = AbstractC27274q.c.f109140f.getTouchArea();

    /* JADX INFO: renamed from: d */
    private static final float f127510d;

    /* JADX INFO: renamed from: e */
    private static final float f127511e;

    /* JADX INFO: renamed from: f */
    private static final float f127512f;

    /* JADX INFO: renamed from: g */
    private static final float f127513g;

    /* JADX INFO: renamed from: r41.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.weightliftingset.WeightliftingSetKt$WeightliftingSet$2$2$10$1$1", m100430f = "WeightliftingSet.kt", m100431l = {339, 346}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C11344e f127514E;

        /* JADX INFO: renamed from: w */
        int f127515w;

        /* JADX INFO: renamed from: x */
        int f127516x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30925i f127517y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f127518z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC30925i abstractC30925i, InterfaceC28601c1 interfaceC28601c1, C11344e c11344e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f127517y = abstractC30925i;
            this.f127518z = interfaceC28601c1;
            this.f127514E = c11344e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f127517y, this.f127518z, this.f127514E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
        
            if (p077d0.C11344e.m30547d(r1, r1, r3, null, r14, 12) == r6) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                r83.a r6 = r83.EnumC31071a.f128113w
                int r0 = r14.f127516x
                r7 = 4
                r8 = 1153138688(0x44bb8000, float:1500.0)
                r9 = 1056964608(0x3f000000, float:0.5)
                r10 = 1065353216(0x3f800000, float:1.0)
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L28
                if (r0 == r1) goto L22
                if (r0 != r11) goto L1a
                p505ts.AbstractC34132o.m107864I(r15)
                goto La9
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                int r0 = r14.f127515w
                p505ts.AbstractC34132o.m107864I(r15)
                goto L8c
            L28:
                p505ts.AbstractC34132o.m107864I(r15)
                r41.i r0 = r14.f127517y
                boolean r0 = r0.getIconFill()
                p1.c1 r2 = r14.f127518z
                java.lang.Object r2 = r2.getValue()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r0 == r2) goto L41
                r13 = r1
                goto L43
            L41:
                r0 = 0
                r13 = r0
            L43:
                p1.c1 r0 = r14.f127518z
                r41.i r2 = r14.f127517y
                boolean r2 = r2.getIconFill()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.setValue(r2)
                if (r13 == 0) goto La9
                d0.e r0 = r14.f127514E
                java.lang.Object r0 = r0.m30549e()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
                if (r0 != 0) goto La9
                d0.e r0 = r14.f127514E
                boolean r0 = r0.m30550f()
                if (r0 != 0) goto La9
                d0.e r0 = r14.f127514E
                java.lang.Float r2 = new java.lang.Float
                r3 = 1067869798(0x3fa66666, float:1.3)
                r2.<init>(r3)
                r3 = r2
                d0.i1 r2 = p077d0.AbstractC11348f.m30573u(r9, r8, r7, r12)
                r14.f127515w = r13
                r14.f127516x = r1
                r1 = r3
                r3 = 0
                r5 = 12
                r4 = r14
                java.lang.Object r0 = p077d0.C11344e.m30547d(r0, r1, r2, r3, r4, r5)
                if (r0 != r6) goto L8b
                goto La8
            L8b:
                r0 = r13
            L8c:
                d0.e r1 = r14.f127514E
                r2 = r1
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r10)
                d0.i1 r3 = p077d0.AbstractC11348f.m30573u(r9, r8, r7, r12)
                r14.f127515w = r0
                r14.f127516x = r11
                r0 = r2
                r2 = r3
                r3 = 0
                r5 = 12
                r4 = r14
                java.lang.Object r0 = p077d0.C11344e.m30547d(r0, r1, r2, r3, r4, r5)
                if (r0 != r6) goto La9
            La8:
                return r6
            La9:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r41.AbstractC30924h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: r41.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.weightliftingset.WeightliftingSetKt$WeightliftingSet$2$2$7$1$1", m100430f = "WeightliftingSet.kt", m100431l = {307}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC34116n f127519E;

        /* JADX INFO: renamed from: w */
        int f127520w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f127521x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30925i f127522y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC34345p0 f127523z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, AbstractC30925i abstractC30925i, InterfaceC34345p0 interfaceC34345p0, InterfaceC34116n interfaceC34116n, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f127521x = function1;
            this.f127522y = abstractC30925i;
            this.f127523z = interfaceC34345p0;
            this.f127519E = interfaceC34116n;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f127521x, this.f127522y, this.f127523z, this.f127519E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127520w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f127521x.invoke(new C30917a(this.f127522y.getSetIndex()));
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(50L, DurationUnit.MILLISECONDS);
                this.f127520w = 1;
                if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            try {
                ((C34342o0) this.f127523z).m108645a(6);
            } catch (IllegalStateException e5) {
                this.f127519E.mo85218i("Exception trying to send ImeAction.Next", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r41.h$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"r41/h$c", "Lq3/r;", "", MapboxMap.QFE_OFFSET, "x", "(I)I", "n", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC29884r {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ CharSequence f127524w;

        public c(CharSequence charSequence) {
            this.f127524w = charSequence;
        }

        @Override // p412q3.InterfaceC29884r
        /* JADX INFO: renamed from: n */
        public int mo15743n(int offset) {
            return this.f127524w.length();
        }

        @Override // p412q3.InterfaceC29884r
        /* JADX INFO: renamed from: x */
        public int mo15749x(int offset) {
            if (this.f127524w.length() > 3) {
                return this.f127524w.length() + 1;
            }
            return 4;
        }
    }

    static {
        float f13 = 8;
        float f14 = ((float) 2.5d) * f13;
        f127507a = f14;
        float f15 = 2 * f13;
        f127508b = f15;
        float f16 = 3 * 4;
        f127510d = f16;
        f127511e = f15;
        f127512f = f14;
        f127513g = f16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m95060A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m95061B(Function1 function1, AbstractC30925i abstractC30925i, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        function1.invoke(new C30921e(newText, abstractC30925i.getSetIndex()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m95062C(InterfaceC15237i interfaceC15237i, Function1 function1, AbstractC30925i abstractC30925i, InterfaceC28601c1 interfaceC28601c1) {
        InterfaceC15250v interfaceC15250vM95091q = m95091q(interfaceC28601c1);
        if (interfaceC15250vM95091q != null && ((EnumC15251w) interfaceC15250vM95091q).m43353a()) {
            ((C15240l) interfaceC15237i).m43339b(false);
        }
        function1.invoke(abstractC30925i.getOnIconClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final Modifier m95063D(Modifier modifier, Function1 function1) {
        return AbstractC1126a.m3484c(modifier, new C29000h(function1, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m95064E(Function1 function1, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        if (((EnumC15251w) it).m43353a()) {
            function1.invoke(C30919c.f127499a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m95065F(AbstractC30925i abstractC30925i, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m95089o(abstractC30925i, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final String m95066G(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        StringBuilder sb4 = new StringBuilder();
        int length = 3 - charSequence.length();
        if (length < 0) {
            length = 0;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i13 = 0; i13 < length; i13++) {
            sb5.append(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        }
        sb5.append(charSequence);
        String string = sb5.toString();
        String strM125857C0 = AbstractC39414r.m125857C0(string, AbstractC12889b.m36278i0(0, string.length() - 2));
        String strM125867M0 = AbstractC39414r.m125867M0(2, string);
        sb4.append(strM125857C0);
        sb4.append(":");
        sb4.append(strM125867M0);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: H */
    public static final float m95067H() {
        return f127508b;
    }

    /* JADX INFO: renamed from: I */
    public static final float m95068I() {
        return f127509c;
    }

    /* JADX INFO: renamed from: J */
    public static final float m95069J() {
        return f127507a;
    }

    /* JADX INFO: renamed from: K */
    public static final float m95070K() {
        return f127512f;
    }

    /* JADX INFO: renamed from: L */
    public static final float m95071L() {
        return f127513g;
    }

    /* JADX INFO: renamed from: M */
    public static final float m95072M() {
        return f127511e;
    }

    /* JADX INFO: renamed from: N */
    public static final float m95073N() {
        return f127510d;
    }

    /* JADX INFO: renamed from: O */
    public static final InterfaceC29884r m95074O(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        return new c(charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x038d  */
    /* JADX WARN: Code duplicated, block: B:104:0x039b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x039d  */
    /* JADX WARN: Code duplicated, block: B:109:0x041d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x041f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0439  */
    /* JADX WARN: Code duplicated, block: B:114:0x043b  */
    /* JADX WARN: Code duplicated, block: B:117:0x044d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0458  */
    /* JADX WARN: Code duplicated, block: B:123:0x048a  */
    /* JADX WARN: Code duplicated, block: B:126:0x049b  */
    /* JADX WARN: Code duplicated, block: B:127:0x049d  */
    /* JADX WARN: Code duplicated, block: B:130:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:134:0x0536  */
    /* JADX WARN: Code duplicated, block: B:136:0x053e  */
    /* JADX WARN: Code duplicated, block: B:139:0x054c  */
    /* JADX WARN: Code duplicated, block: B:141:0x055a  */
    /* JADX WARN: Code duplicated, block: B:146:0x056d  */
    /* JADX WARN: Code duplicated, block: B:148:0x059f  */
    /* JADX WARN: Code duplicated, block: B:150:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:155:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x05ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x0603  */
    /* JADX WARN: Code duplicated, block: B:164:0x066e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0670  */
    /* JADX WARN: Code duplicated, block: B:168:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x0684  */
    /* JADX WARN: Code duplicated, block: B:174:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:177:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x028a  */
    /* JADX WARN: Code duplicated, block: B:80:0x029e  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x02df  */
    /* JADX WARN: Code duplicated, block: B:94:0x0354  */
    /* JADX WARN: Code duplicated, block: B:96:0x0376  */
    /* JADX WARN: Code duplicated, block: B:99:0x0389  */
    /* JADX INFO: renamed from: o */
    public static final void m95089o(final AbstractC30925i itemState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        C38072d c38072d;
        C2886a c2886aM8397c;
        InterfaceC15237i interfaceC15237i;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R3;
        InterfaceC34116n interfaceC34116n;
        C22976l1 c22976l1;
        float f13;
        C33252i c33252iM105489e;
        Modifier modifierM44455h;
        final Function1 function5;
        Object objM87133R4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        boolean zMo95120u;
        C23000t1 c23000t1;
        C23000t1 c23000t2;
        C2886a c2886a;
        Object objM87133R5;
        boolean z13;
        boolean zM87157i;
        Object objM87133R6;
        boolean z14;
        C28655q c28655q;
        boolean zM87157i2;
        Object objM87133R7;
        int i18;
        boolean z15;
        boolean zM87157i3;
        Object c21881l;
        final AbstractC30925i abstractC30925i;
        final Function1 function6;
        boolean z16;
        Object objM87133R8;
        boolean z17;
        boolean zM87157i4;
        Object objM87133R9;
        Function1 function7;
        int iHashCode2;
        Object objM87133R10;
        C11344e c11344e;
        boolean z18;
        boolean zM87157i5;
        Object c27198e;
        Function1 function8;
        Object objM87133R11;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87157i6;
        Object objM87133R12;
        Object objM87133R13;
        Object objM87133R14;
        boolean z19;
        boolean zM87157i7;
        Object objM87133R15;
        Object objM87133R16;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-539791438);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(itemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R16 = c28655q2.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C30617w(23);
                            c28655q2.m87172p0(objM87133R16);
                        }
                        function4 = (Function1) objM87133R16;
                    } else {
                        function4 = function2;
                    }
                    c38072d = C38072d.f163053a;
                    c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, 6).getN7(), C23285v0.m67364b(c38072d.m121952e(c28655q2, 6).getN7().getStyle(), itemState.getRepsAndWeightTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null);
                    interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = InterfaceC34116n.INSTANCE.m107848a("WeightliftingSet");
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC34116n = (InterfaceC34116n) objM87133R3;
                    float f14 = 8;
                    float f15 = ((float) 1.25d) * f14;
                    float fM94696f = C30793l.f126917a.m94696f();
                    c22976l1 = new C22976l1(fM94696f, f15, fM94696f, f15);
                    f13 = 1;
                    c33252iM105489e = AbstractC33253j.m105489e(4 * f13);
                    if (itemState.getShowCurrentSetIndicator()) {
                        c28655q2.m87150e0(2129116338);
                        modifierM44455h = AbstractC15751g.m44455h(c2314t, f13, c38072d.m121949b(c28655q2, 6).getAccentAction(), c33252iM105489e);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(2129224900);
                        c28655q2.m87173q(false);
                        modifierM44455h = c2314t;
                    }
                    function5 = function4;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, ((float) 0.25d) * f14, 1).mo3471e(modifierM44455h), itemState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c33252iM105489e), 0.0f, ((float) 0.5d) * f14, 1);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29802c(4, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM3396r, (Function1) objM87133R4);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3484c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i4 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, c22994r1M66759a);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i3 = c0209i;
                    } else {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                        zMo95120u = itemState.getUseTimeEntry();
                        c23000t1 = C23000t1.f90727a;
                        if (zMo95120u) {
                            c28655q2.m87150e0(-657518929);
                            TextResource textResourceMo95119t = itemState.getTimeText();
                            TextResource textResourceM21267a = AbstractC8693b.m21267a();
                            objM87133R13 = c28655q2.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C15362h2(2);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC29873g0 interfaceC29873g0 = (InterfaceC29873g0) objM87133R13;
                            Modifier modifierM95063D = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C30654e(6);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R14;
                            if ((i15 & 896) == 256) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i7 = z19 | c28655q2.m87157i(itemState);
                            objM87133R15 = c28655q2.m87133R();
                            if (zM87157i7 || objM87133R15 == c28676v0) {
                                final int i24 = 1;
                                objM87133R15 = new Function1() { // from class: r41.g
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        switch (i24) {
                                            case 0:
                                                return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                            case 1:
                                                return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                            default:
                                                return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R15);
                            }
                            c2886a = c2886aM8397c;
                            c23000t2 = c23000t1;
                            AbstractC30792k.m94678l(modifierM95063D, textResourceMo95119t, c2886a, null, null, null, null, null, textResourceM21267a, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g0, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                            z14 = false;
                        } else {
                            c23000t2 = c23000t1;
                            c2886a = c2886aM8397c;
                            c28655q2.m87150e0(-656599686);
                            TextResource textResourceMo95113n = itemState.getRepsText();
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            Modifier modifierM95063D2 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C30654e(7);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                            if ((i15 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = z13 | c28655q2.m87157i(itemState);
                            objM87133R6 = c28655q2.m87133R();
                            if (zM87157i || objM87133R6 == c28676v0) {
                                final int i25 = 2;
                                objM87133R6 = new Function1() { // from class: r41.g
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        switch (i25) {
                                            case 0:
                                                return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                            case 1:
                                                return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                            default:
                                                return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                        }
                                    }
                                };
                                c28655q2.m87172p0(objM87133R6);
                            }
                            z14 = false;
                            AbstractC30792k.m94678l(modifierM95063D2, textResourceMo95113n, c2886a, null, null, null, null, null, textResourceM21267a2, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a2, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        }
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                        TextResource textResourceMo95122w = itemState.getWeightText();
                        TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                        int iMo95121v = itemState.getWeightFieldImeAction();
                        zM87157i2 = c28655q.m87157i(interfaceC15237i);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R7 == c28676v0) {
                            objM87133R7 = new C2564l1(interfaceC15237i, 18);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function9 = (Function1) objM87133R7;
                        boolean zM87157i8 = c28655q.m87157i(interfaceC2994c0);
                        i18 = i15 & 896;
                        if (i18 == 256) {
                            z15 = true;
                        } else {
                            z15 = z14;
                        }
                        zM87157i3 = z15 | zM87157i8 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                        Object objM87133R17 = c28655q.m87133R();
                        if (!zM87157i3 || objM87133R17 == c28676v0) {
                            abstractC30925i = itemState;
                            function6 = r3;
                            z16 = true;
                            c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                            c28655q.m87172p0(c21881l);
                        } else {
                            abstractC30925i = itemState;
                            c21881l = objM87133R17;
                            function6 = function5;
                            z16 = true;
                        }
                        C34348q0 c34348q0 = new C34348q0(function9, (Function1) c21881l, null, null, 58);
                        Modifier modifierM95063D3 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C30654e(5);
                            c28655q.m87172p0(objM87133R8);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R8;
                        if (i18 == 256) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                        zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i4 || objM87133R9 == c28676v0) {
                            final int i26 = 0;
                            objM87133R9 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i26) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R9);
                        }
                        C28655q c28655q3 = c28655q;
                        function7 = function6;
                        C0209i c0209i6 = c0209i3;
                        AbstractC30792k.m94678l(modifierM95063D3, textResourceMo95122w, c2886a, null, null, null, null, null, textResourceM21267a3, false, false, null, 0L, false, 9, 0, iMo95121v, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q0, interfaceC4339a3, (Function1) objM87133R9, c28655q3, 0, 805330944, 0, 6, 402046712, 0);
                        c28655q2 = c28655q3;
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                        if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                            c28655q2.m87150e0(1567646491);
                            AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                            function8 = function7;
                        } else {
                            c28655q2.m87150e0(1567947160);
                            objM87133R10 = c28655q2.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            c11344e = (C11344e) objM87133R10;
                            if (abstractC30925i.getAnimateIconOnChange()) {
                                c28655q2.m87150e0(1568011981);
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                                Boolean boolValueOf = Boolean.valueOf(abstractC30925i.getIconFill());
                                zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                                objM87133R12 = c28655q2.m87133R();
                                if (zM87157i6 || objM87133R12 == c28676v0) {
                                    objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1569154610);
                                c28655q2.m87173q(false);
                            }
                            C27270o c27270o = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                            Modifier modifierM3488c = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                            boolean zM87157i9 = c28655q2.m87157i(interfaceC15237i);
                            if (i18 == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i5 = zM87157i9 | z18 | c28655q2.m87157i(abstractC30925i);
                            Object objM87133R18 = c28655q2.m87133R();
                            if (!zM87157i5 || objM87133R18 == c28676v0) {
                                function8 = function7;
                                c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                                c28655q2.m87172p0(c27198e);
                            } else {
                                c27198e = objM87133R18;
                                function8 = function7;
                            }
                            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3488c, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        function3 = function8;
                        modifier2 = modifier3;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                    zMo95120u = itemState.getUseTimeEntry();
                    c23000t1 = C23000t1.f90727a;
                    if (zMo95120u) {
                        c28655q2.m87150e0(-657518929);
                        TextResource textResourceMo95119t2 = itemState.getTimeText();
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        objM87133R13 = c28655q2.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C15362h2(2);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC29873g0 interfaceC29873g1 = (InterfaceC29873g0) objM87133R13;
                        Modifier modifierM95063D4 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C30654e(6);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R14;
                        if ((i15 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i7 = z19 | c28655q2.m87157i(itemState);
                        objM87133R15 = c28655q2.m87133R();
                        if (zM87157i7) {
                            final int i27 = 1;
                            objM87133R15 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i27) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R15);
                        } else {
                            final int i28 = 1;
                            objM87133R15 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i28) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R15);
                        }
                        c2886a = c2886aM8397c;
                        c23000t2 = c23000t1;
                        AbstractC30792k.m94678l(modifierM95063D4, textResourceMo95119t2, c2886a, null, null, null, null, null, textResourceM21267a4, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g1, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a4, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c23000t2 = c23000t1;
                        c2886a = c2886aM8397c;
                        c28655q2.m87150e0(-656599686);
                        TextResource textResourceMo95113n2 = itemState.getRepsText();
                        TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                        Modifier modifierM95063D5 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30654e(7);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q2.m87157i(itemState);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            final int i29 = 2;
                            objM87133R6 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i29) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            final int i210 = 2;
                            objM87133R6 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i210) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R6);
                        }
                        z14 = false;
                        AbstractC30792k.m94678l(modifierM95063D5, textResourceMo95113n2, c2886a, null, null, null, null, null, textResourceM21267a5, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a5, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                    TextResource textResourceMo95122w2 = itemState.getWeightText();
                    TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                    int iMo95121v2 = itemState.getWeightFieldImeAction();
                    zM87157i2 = c28655q.m87157i(interfaceC15237i);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R7 = new C2564l1(interfaceC15237i, 18);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C2564l1(interfaceC15237i, 18);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function10 = (Function1) objM87133R7;
                    boolean zM87157i10 = c28655q.m87157i(interfaceC2994c0);
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    zM87157i3 = z15 | zM87157i10 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                    Object objM87133R19 = c28655q.m87133R();
                    if (zM87157i3) {
                        abstractC30925i = itemState;
                        function6 = r3;
                        z16 = true;
                        c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                        c28655q.m87172p0(c21881l);
                    } else {
                        abstractC30925i = itemState;
                        function6 = r3;
                        z16 = true;
                        c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                        c28655q.m87172p0(c21881l);
                    }
                    C34348q0 c34348q1 = new C34348q0(function10, (Function1) c21881l, null, null, 58);
                    Modifier modifierM95063D6 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C30654e(5);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    if (i18 == 256) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                    zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        final int i211 = 0;
                        objM87133R9 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i211) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i212 = 0;
                        objM87133R9 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i212) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    C28655q c28655q4 = c28655q;
                    function7 = function6;
                    C0209i c0209i8 = c0209i3;
                    AbstractC30792k.m94678l(modifierM95063D6, textResourceMo95122w2, c2886a, null, null, null, null, null, textResourceM21267a6, false, false, null, 0L, false, 9, 0, iMo95121v2, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q1, interfaceC4339a6, (Function1) objM87133R9, c28655q4, 0, 805330944, 0, 6, 402046712, 0);
                    c28655q2 = c28655q4;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
                    if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                        c28655q2.m87150e0(1567646491);
                        AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        function8 = function7;
                    } else {
                        c28655q2.m87150e0(1567947160);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c11344e = (C11344e) objM87133R10;
                        if (abstractC30925i.getAnimateIconOnChange()) {
                            c28655q2.m87150e0(1568011981);
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                                c28655q2.m87172p0(objM87133R11);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                            Boolean boolValueOf2 = Boolean.valueOf(abstractC30925i.getIconFill());
                            zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87157i6) {
                                objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf2);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1569154610);
                            c28655q2.m87173q(false);
                        }
                        C27270o c27270o2 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                        String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                        Modifier modifierM3488c2 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                        boolean zM87157i11 = c28655q2.m87157i(interfaceC15237i);
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i5 = zM87157i11 | z18 | c28655q2.m87157i(abstractC30925i);
                        Object objM87133R110 = c28655q2.m87133R();
                        if (zM87157i5) {
                            function8 = function7;
                            c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                            c28655q2.m87172p0(c27198e);
                        } else {
                            function8 = function7;
                            c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                            c28655q2.m87172p0(c27198e);
                        }
                        AbstractC27242b1.m82092d(c27270o2, strM92103Y2, modifierM3488c2, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    modifier2 = modifier3;
                } else {
                    c28655q2.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C30179a(i13, i14, 20, itemState, modifier2, function3);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R16 = c28655q2.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C30617w(23);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    function4 = (Function1) objM87133R16;
                } else {
                    function4 = function2;
                }
                c38072d = C38072d.f163053a;
                c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, 6).getN7(), C23285v0.m67364b(c38072d.m121952e(c28655q2, 6).getN7().getStyle(), itemState.getRepsAndWeightTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null);
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = InterfaceC34116n.INSTANCE.m107848a("WeightliftingSet");
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC34116n = (InterfaceC34116n) objM87133R3;
                float f16 = 8;
                float f17 = ((float) 1.25d) * f16;
                float fM94696f2 = C30793l.f126917a.m94696f();
                c22976l1 = new C22976l1(fM94696f2, f17, fM94696f2, f17);
                f13 = 1;
                c33252iM105489e = AbstractC33253j.m105489e(4 * f13);
                if (itemState.getShowCurrentSetIndicator()) {
                    c28655q2.m87150e0(2129116338);
                    modifierM44455h = AbstractC15751g.m44455h(c2314t, f13, c38072d.m121949b(c28655q2, 6).getAccentAction(), c33252iM105489e);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2129224900);
                    c28655q2.m87173q(false);
                    modifierM44455h = c2314t;
                }
                function5 = function4;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, ((float) 0.25d) * f16, 1).mo3471e(modifierM44455h), itemState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c33252iM105489e), 0.0f, ((float) 0.5d) * f16, 1);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C29802c(4, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R4);
                }
                Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierM3396r2, (Function1) objM87133R4);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3484c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i9 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i9, c22994r1M66759a2);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m4);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N4);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                    zMo95120u = itemState.getUseTimeEntry();
                    c23000t1 = C23000t1.f90727a;
                    if (zMo95120u) {
                        c28655q2.m87150e0(-657518929);
                        TextResource textResourceMo95119t3 = itemState.getTimeText();
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        objM87133R13 = c28655q2.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C15362h2(2);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC29873g0 interfaceC29873g2 = (InterfaceC29873g0) objM87133R13;
                        Modifier modifierM95063D7 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C30654e(6);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                        if ((i15 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i7 = z19 | c28655q2.m87157i(itemState);
                        objM87133R15 = c28655q2.m87133R();
                        if (zM87157i7) {
                            final int i213 = 1;
                            objM87133R15 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R15);
                        } else {
                            final int i214 = 1;
                            objM87133R15 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i214) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R15);
                        }
                        c2886a = c2886aM8397c;
                        c23000t2 = c23000t1;
                        AbstractC30792k.m94678l(modifierM95063D7, textResourceMo95119t3, c2886a, null, null, null, null, null, textResourceM21267a7, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g2, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a7, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c23000t2 = c23000t1;
                        c2886a = c2886aM8397c;
                        c28655q2.m87150e0(-656599686);
                        TextResource textResourceMo95113n3 = itemState.getRepsText();
                        TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                        Modifier modifierM95063D8 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30654e(7);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q2.m87157i(itemState);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            final int i215 = 2;
                            objM87133R6 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i215) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            final int i216 = 2;
                            objM87133R6 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i216) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R6);
                        }
                        z14 = false;
                        AbstractC30792k.m94678l(modifierM95063D8, textResourceMo95113n3, c2886a, null, null, null, null, null, textResourceM21267a8, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a8, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                    TextResource textResourceMo95122w3 = itemState.getWeightText();
                    TextResource textResourceM21267a9 = AbstractC8693b.m21267a();
                    int iMo95121v3 = itemState.getWeightFieldImeAction();
                    zM87157i2 = c28655q.m87157i(interfaceC15237i);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R7 = new C2564l1(interfaceC15237i, 18);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C2564l1(interfaceC15237i, 18);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11 = (Function1) objM87133R7;
                    boolean zM87157i12 = c28655q.m87157i(interfaceC2994c0);
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    zM87157i3 = z15 | zM87157i12 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                    Object objM87133R111 = c28655q.m87133R();
                    if (zM87157i3) {
                        abstractC30925i = itemState;
                        function6 = r3;
                        z16 = true;
                        c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                        c28655q.m87172p0(c21881l);
                    } else {
                        abstractC30925i = itemState;
                        function6 = r3;
                        z16 = true;
                        c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                        c28655q.m87172p0(c21881l);
                    }
                    C34348q0 c34348q2 = new C34348q0(function11, (Function1) c21881l, null, null, 58);
                    Modifier modifierM95063D9 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C30654e(5);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R8;
                    if (i18 == 256) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                    zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        final int i217 = 0;
                        objM87133R9 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i217) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i218 = 0;
                        objM87133R9 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i218) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    C28655q c28655q5 = c28655q;
                    function7 = function6;
                    C0209i c0209i11 = c0209i3;
                    AbstractC30792k.m94678l(modifierM95063D9, textResourceMo95122w3, c2886a, null, null, null, null, null, textResourceM21267a9, false, false, null, 0L, false, 9, 0, iMo95121v3, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q2, interfaceC4339a9, (Function1) objM87133R9, c28655q5, 0, 805330944, 0, 6, 402046712, 0);
                    c28655q2 = c28655q5;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N5);
                    if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                        c28655q2.m87150e0(1567646491);
                        AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        function8 = function7;
                    } else {
                        c28655q2.m87150e0(1567947160);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c11344e = (C11344e) objM87133R10;
                        if (abstractC30925i.getAnimateIconOnChange()) {
                            c28655q2.m87150e0(1568011981);
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                                c28655q2.m87172p0(objM87133R11);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                            Boolean boolValueOf3 = Boolean.valueOf(abstractC30925i.getIconFill());
                            zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87157i6) {
                                objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf3);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1569154610);
                            c28655q2.m87173q(false);
                        }
                        C27270o c27270o3 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                        String strM92103Y3 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                        Modifier modifierM3488c3 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                        boolean zM87157i13 = c28655q2.m87157i(interfaceC15237i);
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i5 = zM87157i13 | z18 | c28655q2.m87157i(abstractC30925i);
                        Object objM87133R112 = c28655q2.m87133R();
                        if (zM87157i5) {
                            function8 = function7;
                            c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                            c28655q2.m87172p0(c27198e);
                        } else {
                            function8 = function7;
                            c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                            c28655q2.m87172p0(c27198e);
                        }
                        AbstractC27242b1.m82092d(c27270o3, strM92103Y3, modifierM3488c3, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    modifier2 = modifier3;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N4);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                zMo95120u = itemState.getUseTimeEntry();
                c23000t1 = C23000t1.f90727a;
                if (zMo95120u) {
                    c28655q2.m87150e0(-657518929);
                    TextResource textResourceMo95119t4 = itemState.getTimeText();
                    TextResource textResourceM21267a10 = AbstractC8693b.m21267a();
                    objM87133R13 = c28655q2.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C15362h2(2);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC29873g0 interfaceC29873g3 = (InterfaceC29873g0) objM87133R13;
                    Modifier modifierM95063D10 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C30654e(6);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R14;
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i7 = z19 | c28655q2.m87157i(itemState);
                    objM87133R15 = c28655q2.m87133R();
                    if (zM87157i7) {
                        final int i219 = 1;
                        objM87133R15 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i219) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R15);
                    } else {
                        final int i2110 = 1;
                        objM87133R15 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i2110) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R15);
                    }
                    c2886a = c2886aM8397c;
                    c23000t2 = c23000t1;
                    AbstractC30792k.m94678l(modifierM95063D10, textResourceMo95119t4, c2886a, null, null, null, null, null, textResourceM21267a10, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g3, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a10, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    c23000t2 = c23000t1;
                    c2886a = c2886aM8397c;
                    c28655q2.m87150e0(-656599686);
                    TextResource textResourceMo95113n4 = itemState.getRepsText();
                    TextResource textResourceM21267a11 = AbstractC8693b.m21267a();
                    Modifier modifierM95063D11 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30654e(7);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R5;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q2.m87157i(itemState);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        final int i2111 = 2;
                        objM87133R6 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i2111) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        final int i2112 = 2;
                        objM87133R6 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i2112) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    }
                    z14 = false;
                    AbstractC30792k.m94678l(modifierM95063D11, textResourceMo95113n4, c2886a, null, null, null, null, null, textResourceM21267a11, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a11, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                TextResource textResourceMo95122w4 = itemState.getWeightText();
                TextResource textResourceM21267a12 = AbstractC8693b.m21267a();
                int iMo95121v4 = itemState.getWeightFieldImeAction();
                zM87157i2 = c28655q.m87157i(interfaceC15237i);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R7 = new C2564l1(interfaceC15237i, 18);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C2564l1(interfaceC15237i, 18);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function12 = (Function1) objM87133R7;
                boolean zM87157i14 = c28655q.m87157i(interfaceC2994c0);
                i18 = i15 & 896;
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zM87157i3 = z15 | zM87157i14 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                Object objM87133R113 = c28655q.m87133R();
                if (zM87157i3) {
                    abstractC30925i = itemState;
                    function6 = r3;
                    z16 = true;
                    c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                    c28655q.m87172p0(c21881l);
                } else {
                    abstractC30925i = itemState;
                    function6 = r3;
                    z16 = true;
                    c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                    c28655q.m87172p0(c21881l);
                }
                C34348q0 c34348q3 = new C34348q0(function12, (Function1) c21881l, null, null, 58);
                Modifier modifierM95063D12 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C30654e(5);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R8;
                if (i18 == 256) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    final int i2113 = 0;
                    objM87133R9 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i2113) {
                                case 0:
                                    return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i2114 = 0;
                    objM87133R9 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i2114) {
                                case 0:
                                    return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                C28655q c28655q6 = c28655q;
                function7 = function6;
                C0209i c0209i13 = c0209i3;
                AbstractC30792k.m94678l(modifierM95063D12, textResourceMo95122w4, c2886a, null, null, null, null, null, textResourceM21267a12, false, false, null, 0L, false, 9, 0, iMo95121v4, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q3, interfaceC4339a12, (Function1) objM87133R9, c28655q6, 0, 805330944, 0, 6, 402046712, 0);
                c28655q2 = c28655q6;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N6);
                if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                    c28655q2.m87150e0(1567646491);
                    AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    function8 = function7;
                } else {
                    c28655q2.m87150e0(1567947160);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c11344e = (C11344e) objM87133R10;
                    if (abstractC30925i.getAnimateIconOnChange()) {
                        c28655q2.m87150e0(1568011981);
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                            c28655q2.m87172p0(objM87133R11);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                        Boolean boolValueOf4 = Boolean.valueOf(abstractC30925i.getIconFill());
                        zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87157i6) {
                            objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf4);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1569154610);
                        c28655q2.m87173q(false);
                    }
                    C27270o c27270o4 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                    String strM92103Y4 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                    Modifier modifierM3488c4 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                    boolean zM87157i15 = c28655q2.m87157i(interfaceC15237i);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i5 = zM87157i15 | z18 | c28655q2.m87157i(abstractC30925i);
                    Object objM87133R114 = c28655q2.m87133R();
                    if (zM87157i5) {
                        function8 = function7;
                        c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                        c28655q2.m87172p0(c27198e);
                    } else {
                        function8 = function7;
                        c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                        c28655q2.m87172p0(c27198e);
                    }
                    AbstractC27242b1.m82092d(c27270o4, strM92103Y4, modifierM3488c4, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                modifier2 = modifier3;
            } else {
                c28655q2.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 20, itemState, modifier2, function3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R16 = c28655q2.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C30617w(23);
                        c28655q2.m87172p0(objM87133R16);
                    }
                    function4 = (Function1) objM87133R16;
                } else {
                    function4 = function2;
                }
                c38072d = C38072d.f163053a;
                c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, 6).getN7(), C23285v0.m67364b(c38072d.m121952e(c28655q2, 6).getN7().getStyle(), itemState.getRepsAndWeightTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null);
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = InterfaceC34116n.INSTANCE.m107848a("WeightliftingSet");
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC34116n = (InterfaceC34116n) objM87133R3;
                float f18 = 8;
                float f19 = ((float) 1.25d) * f18;
                float fM94696f3 = C30793l.f126917a.m94696f();
                c22976l1 = new C22976l1(fM94696f3, f19, fM94696f3, f19);
                f13 = 1;
                c33252iM105489e = AbstractC33253j.m105489e(4 * f13);
                if (itemState.getShowCurrentSetIndicator()) {
                    c28655q2.m87150e0(2129116338);
                    modifierM44455h = AbstractC15751g.m44455h(c2314t, f13, c38072d.m121949b(c28655q2, 6).getAccentAction(), c33252iM105489e);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(2129224900);
                    c28655q2.m87173q(false);
                    modifierM44455h = c2314t;
                }
                function5 = function4;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, ((float) 0.25d) * f18, 1).mo3471e(modifierM44455h), itemState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c33252iM105489e), 0.0f, ((float) 0.5d) * f18, 1);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C29802c(4, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R4);
                }
                Modifier modifierM3484c3 = AbstractC1126a.m3484c(modifierM3396r3, (Function1) objM87133R4);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3484c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i14 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i14, c22994r1M66759a3);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m7);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N7);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                    zMo95120u = itemState.getUseTimeEntry();
                    c23000t1 = C23000t1.f90727a;
                    if (zMo95120u) {
                        c28655q2.m87150e0(-657518929);
                        TextResource textResourceMo95119t5 = itemState.getTimeText();
                        TextResource textResourceM21267a13 = AbstractC8693b.m21267a();
                        objM87133R13 = c28655q2.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C15362h2(2);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC29873g0 interfaceC29873g4 = (InterfaceC29873g0) objM87133R13;
                        Modifier modifierM95063D13 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C30654e(6);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R14;
                        if ((i15 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i7 = z19 | c28655q2.m87157i(itemState);
                        objM87133R15 = c28655q2.m87133R();
                        if (zM87157i7) {
                            final int i2115 = 1;
                            objM87133R15 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i2115) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R15);
                        } else {
                            final int i2116 = 1;
                            objM87133R15 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i2116) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R15);
                        }
                        c2886a = c2886aM8397c;
                        c23000t2 = c23000t1;
                        AbstractC30792k.m94678l(modifierM95063D13, textResourceMo95119t5, c2886a, null, null, null, null, null, textResourceM21267a13, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g4, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a13, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        c23000t2 = c23000t1;
                        c2886a = c2886aM8397c;
                        c28655q2.m87150e0(-656599686);
                        TextResource textResourceMo95113n5 = itemState.getRepsText();
                        TextResource textResourceM21267a14 = AbstractC8693b.m21267a();
                        Modifier modifierM95063D14 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C30654e(7);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R5;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = z13 | c28655q2.m87157i(itemState);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i) {
                            final int i2117 = 2;
                            objM87133R6 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i2117) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            final int i2118 = 2;
                            objM87133R6 = new Function1() { // from class: r41.g
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    switch (i2118) {
                                        case 0:
                                            return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                        case 1:
                                            return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                        default:
                                            return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R6);
                        }
                        z14 = false;
                        AbstractC30792k.m94678l(modifierM95063D14, textResourceMo95113n5, c2886a, null, null, null, null, null, textResourceM21267a14, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a14, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                    TextResource textResourceMo95122w5 = itemState.getWeightText();
                    TextResource textResourceM21267a15 = AbstractC8693b.m21267a();
                    int iMo95121v5 = itemState.getWeightFieldImeAction();
                    zM87157i2 = c28655q.m87157i(interfaceC15237i);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R7 = new C2564l1(interfaceC15237i, 18);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C2564l1(interfaceC15237i, 18);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function13 = (Function1) objM87133R7;
                    boolean zM87157i16 = c28655q.m87157i(interfaceC2994c0);
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    zM87157i3 = z15 | zM87157i16 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                    Object objM87133R115 = c28655q.m87133R();
                    if (zM87157i3) {
                        abstractC30925i = itemState;
                        function6 = r3;
                        z16 = true;
                        c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                        c28655q.m87172p0(c21881l);
                    } else {
                        abstractC30925i = itemState;
                        function6 = r3;
                        z16 = true;
                        c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                        c28655q.m87172p0(c21881l);
                    }
                    C34348q0 c34348q4 = new C34348q0(function13, (Function1) c21881l, null, null, 58);
                    Modifier modifierM95063D15 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C30654e(5);
                        c28655q.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R8;
                    if (i18 == 256) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                    zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        final int i2119 = 0;
                        objM87133R9 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i2119) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        final int i21110 = 0;
                        objM87133R9 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21110) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R9);
                    }
                    C28655q c28655q7 = c28655q;
                    function7 = function6;
                    C0209i c0209i16 = c0209i3;
                    AbstractC30792k.m94678l(modifierM95063D15, textResourceMo95122w5, c2886a, null, null, null, null, null, textResourceM21267a15, false, false, null, 0L, false, 9, 0, iMo95121v5, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q4, interfaceC4339a15, (Function1) objM87133R9, c28655q7, 0, 805330944, 0, 6, 402046712, 0);
                    c28655q2 = c28655q7;
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N8);
                    if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                        c28655q2.m87150e0(1567646491);
                        AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                        function8 = function7;
                    } else {
                        c28655q2.m87150e0(1567947160);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c11344e = (C11344e) objM87133R10;
                        if (abstractC30925i.getAnimateIconOnChange()) {
                            c28655q2.m87150e0(1568011981);
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                                c28655q2.m87172p0(objM87133R11);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                            Boolean boolValueOf5 = Boolean.valueOf(abstractC30925i.getIconFill());
                            zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                            objM87133R12 = c28655q2.m87133R();
                            if (zM87157i6) {
                                objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf5);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1569154610);
                            c28655q2.m87173q(false);
                        }
                        C27270o c27270o5 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                        String strM92103Y5 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                        Modifier modifierM3488c5 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                        boolean zM87157i17 = c28655q2.m87157i(interfaceC15237i);
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i5 = zM87157i17 | z18 | c28655q2.m87157i(abstractC30925i);
                        Object objM87133R116 = c28655q2.m87133R();
                        if (zM87157i5) {
                            function8 = function7;
                            c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                            c28655q2.m87172p0(c27198e);
                        } else {
                            function8 = function7;
                            c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                            c28655q2.m87172p0(c27198e);
                        }
                        AbstractC27242b1.m82092d(c27270o5, strM92103Y5, modifierM3488c5, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function3 = function8;
                    modifier2 = modifier3;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N7);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                zMo95120u = itemState.getUseTimeEntry();
                c23000t1 = C23000t1.f90727a;
                if (zMo95120u) {
                    c28655q2.m87150e0(-657518929);
                    TextResource textResourceMo95119t6 = itemState.getTimeText();
                    TextResource textResourceM21267a16 = AbstractC8693b.m21267a();
                    objM87133R13 = c28655q2.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C15362h2(2);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC29873g0 interfaceC29873g5 = (InterfaceC29873g0) objM87133R13;
                    Modifier modifierM95063D16 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C30654e(6);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R14;
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i7 = z19 | c28655q2.m87157i(itemState);
                    objM87133R15 = c28655q2.m87133R();
                    if (zM87157i7) {
                        final int i21111 = 1;
                        objM87133R15 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21111) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R15);
                    } else {
                        final int i21112 = 1;
                        objM87133R15 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21112) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R15);
                    }
                    c2886a = c2886aM8397c;
                    c23000t2 = c23000t1;
                    AbstractC30792k.m94678l(modifierM95063D16, textResourceMo95119t6, c2886a, null, null, null, null, null, textResourceM21267a16, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g5, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a16, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    c23000t2 = c23000t1;
                    c2886a = c2886aM8397c;
                    c28655q2.m87150e0(-656599686);
                    TextResource textResourceMo95113n6 = itemState.getRepsText();
                    TextResource textResourceM21267a17 = AbstractC8693b.m21267a();
                    Modifier modifierM95063D17 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30654e(7);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R5;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q2.m87157i(itemState);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        final int i21113 = 2;
                        objM87133R6 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21113) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        final int i21114 = 2;
                        objM87133R6 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21114) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    }
                    z14 = false;
                    AbstractC30792k.m94678l(modifierM95063D17, textResourceMo95113n6, c2886a, null, null, null, null, null, textResourceM21267a17, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a17, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                TextResource textResourceMo95122w6 = itemState.getWeightText();
                TextResource textResourceM21267a18 = AbstractC8693b.m21267a();
                int iMo95121v6 = itemState.getWeightFieldImeAction();
                zM87157i2 = c28655q.m87157i(interfaceC15237i);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R7 = new C2564l1(interfaceC15237i, 18);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C2564l1(interfaceC15237i, 18);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function14 = (Function1) objM87133R7;
                boolean zM87157i18 = c28655q.m87157i(interfaceC2994c0);
                i18 = i15 & 896;
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zM87157i3 = z15 | zM87157i18 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                Object objM87133R117 = c28655q.m87133R();
                if (zM87157i3) {
                    abstractC30925i = itemState;
                    function6 = r3;
                    z16 = true;
                    c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                    c28655q.m87172p0(c21881l);
                } else {
                    abstractC30925i = itemState;
                    function6 = r3;
                    z16 = true;
                    c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                    c28655q.m87172p0(c21881l);
                }
                C34348q0 c34348q5 = new C34348q0(function14, (Function1) c21881l, null, null, 58);
                Modifier modifierM95063D18 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C30654e(5);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R8;
                if (i18 == 256) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    final int i21115 = 0;
                    objM87133R9 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i21115) {
                                case 0:
                                    return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i21116 = 0;
                    objM87133R9 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i21116) {
                                case 0:
                                    return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                C28655q c28655q8 = c28655q;
                function7 = function6;
                C0209i c0209i18 = c0209i3;
                AbstractC30792k.m94678l(modifierM95063D18, textResourceMo95122w6, c2886a, null, null, null, null, null, textResourceM21267a18, false, false, null, 0L, false, 9, 0, iMo95121v6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q5, interfaceC4339a18, (Function1) objM87133R9, c28655q8, 0, 805330944, 0, 6, 402046712, 0);
                c28655q2 = c28655q8;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N9);
                if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                    c28655q2.m87150e0(1567646491);
                    AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    function8 = function7;
                } else {
                    c28655q2.m87150e0(1567947160);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c11344e = (C11344e) objM87133R10;
                    if (abstractC30925i.getAnimateIconOnChange()) {
                        c28655q2.m87150e0(1568011981);
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                            c28655q2.m87172p0(objM87133R11);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                        Boolean boolValueOf6 = Boolean.valueOf(abstractC30925i.getIconFill());
                        zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87157i6) {
                            objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf6);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1569154610);
                        c28655q2.m87173q(false);
                    }
                    C27270o c27270o6 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                    String strM92103Y6 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                    Modifier modifierM3488c6 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                    boolean zM87157i19 = c28655q2.m87157i(interfaceC15237i);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i5 = zM87157i19 | z18 | c28655q2.m87157i(abstractC30925i);
                    Object objM87133R118 = c28655q2.m87133R();
                    if (zM87157i5) {
                        function8 = function7;
                        c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                        c28655q2.m87172p0(c27198e);
                    } else {
                        function8 = function7;
                        c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                        c28655q2.m87172p0(c27198e);
                    }
                    AbstractC27242b1.m82092d(c27270o6, strM92103Y6, modifierM3488c6, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                modifier2 = modifier3;
            } else {
                c28655q2.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 20, itemState, modifier2, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R16 = c28655q2.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C30617w(23);
                    c28655q2.m87172p0(objM87133R16);
                }
                function4 = (Function1) objM87133R16;
            } else {
                function4 = function2;
            }
            c38072d = C38072d.f163053a;
            c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, 6).getN7(), C23285v0.m67364b(c38072d.m121952e(c28655q2, 6).getN7().getStyle(), itemState.getRepsAndWeightTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null);
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = InterfaceC34116n.INSTANCE.m107848a("WeightliftingSet");
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC34116n = (InterfaceC34116n) objM87133R3;
            float f110 = 8;
            float f111 = ((float) 1.25d) * f110;
            float fM94696f4 = C30793l.f126917a.m94696f();
            c22976l1 = new C22976l1(fM94696f4, f111, fM94696f4, f111);
            f13 = 1;
            c33252iM105489e = AbstractC33253j.m105489e(4 * f13);
            if (itemState.getShowCurrentSetIndicator()) {
                c28655q2.m87150e0(2129116338);
                modifierM44455h = AbstractC15751g.m44455h(c2314t, f13, c38072d.m121949b(c28655q2, 6).getAccentAction(), c33252iM105489e);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2129224900);
                c28655q2.m87173q(false);
                modifierM44455h = c2314t;
            }
            function5 = function4;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier3), 0.0f, ((float) 0.25d) * f110, 1).mo3471e(modifierM44455h), itemState.getBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c33252iM105489e), 0.0f, ((float) 0.5d) * f110, 1);
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C29802c(4, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R4);
            }
            Modifier modifierM3484c4 = AbstractC1126a.m3484c(modifierM3396r4, (Function1) objM87133R4);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3484c4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i19 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i19, c22994r1M66759a4);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m10);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N10);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
                zMo95120u = itemState.getUseTimeEntry();
                c23000t1 = C23000t1.f90727a;
                if (zMo95120u) {
                    c28655q2.m87150e0(-657518929);
                    TextResource textResourceMo95119t7 = itemState.getTimeText();
                    TextResource textResourceM21267a19 = AbstractC8693b.m21267a();
                    objM87133R13 = c28655q2.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C15362h2(2);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC29873g0 interfaceC29873g6 = (InterfaceC29873g0) objM87133R13;
                    Modifier modifierM95063D19 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C30654e(6);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R14;
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i7 = z19 | c28655q2.m87157i(itemState);
                    objM87133R15 = c28655q2.m87133R();
                    if (zM87157i7) {
                        final int i21117 = 1;
                        objM87133R15 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21117) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R15);
                    } else {
                        final int i21118 = 1;
                        objM87133R15 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21118) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R15);
                    }
                    c2886a = c2886aM8397c;
                    c23000t2 = c23000t1;
                    AbstractC30792k.m94678l(modifierM95063D19, textResourceMo95119t7, c2886a, null, null, null, null, null, textResourceM21267a19, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g6, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a19, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    c23000t2 = c23000t1;
                    c2886a = c2886aM8397c;
                    c28655q2.m87150e0(-656599686);
                    TextResource textResourceMo95113n7 = itemState.getRepsText();
                    TextResource textResourceM21267a110 = AbstractC8693b.m21267a();
                    Modifier modifierM95063D110 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C30654e(7);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R5;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = z13 | c28655q2.m87157i(itemState);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i) {
                        final int i21119 = 2;
                        objM87133R6 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i21119) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        final int i211110 = 2;
                        objM87133R6 = new Function1() { // from class: r41.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i211110) {
                                    case 0:
                                        return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                    case 1:
                                        return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                    default:
                                        return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R6);
                    }
                    z14 = false;
                    AbstractC30792k.m94678l(modifierM95063D110, textResourceMo95113n7, c2886a, null, null, null, null, null, textResourceM21267a110, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a110, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
                TextResource textResourceMo95122w7 = itemState.getWeightText();
                TextResource textResourceM21267a111 = AbstractC8693b.m21267a();
                int iMo95121v7 = itemState.getWeightFieldImeAction();
                zM87157i2 = c28655q.m87157i(interfaceC15237i);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R7 = new C2564l1(interfaceC15237i, 18);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C2564l1(interfaceC15237i, 18);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function15 = (Function1) objM87133R7;
                boolean zM87157i110 = c28655q.m87157i(interfaceC2994c0);
                i18 = i15 & 896;
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zM87157i3 = z15 | zM87157i110 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
                Object objM87133R119 = c28655q.m87133R();
                if (zM87157i3) {
                    abstractC30925i = itemState;
                    function6 = r3;
                    z16 = true;
                    c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                    c28655q.m87172p0(c21881l);
                } else {
                    abstractC30925i = itemState;
                    function6 = r3;
                    z16 = true;
                    c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                    c28655q.m87172p0(c21881l);
                }
                C34348q0 c34348q6 = new C34348q0(function15, (Function1) c21881l, null, null, 58);
                Modifier modifierM95063D111 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C30654e(5);
                    c28655q.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R8;
                if (i18 == 256) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    final int i211111 = 0;
                    objM87133R9 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211111) {
                                case 0:
                                    return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                } else {
                    final int i211112 = 0;
                    objM87133R9 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211112) {
                                case 0:
                                    return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R9);
                }
                C28655q c28655q9 = c28655q;
                function7 = function6;
                C0209i c0209i111 = c0209i3;
                AbstractC30792k.m94678l(modifierM95063D111, textResourceMo95122w7, c2886a, null, null, null, null, null, textResourceM21267a111, false, false, null, 0L, false, 9, 0, iMo95121v7, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q6, interfaceC4339a111, (Function1) objM87133R9, c28655q9, 0, 805330944, 0, 6, 402046712, 0);
                c28655q2 = c28655q9;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3398t7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N11);
                if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                    c28655q2.m87150e0(1567646491);
                    AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                    function8 = function7;
                } else {
                    c28655q2.m87150e0(1567947160);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c11344e = (C11344e) objM87133R10;
                    if (abstractC30925i.getAnimateIconOnChange()) {
                        c28655q2.m87150e0(1568011981);
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                            c28655q2.m87172p0(objM87133R11);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                        Boolean boolValueOf7 = Boolean.valueOf(abstractC30925i.getIconFill());
                        zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87157i6) {
                            objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf7);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1569154610);
                        c28655q2.m87173q(false);
                    }
                    C27270o c27270o7 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                    String strM92103Y7 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                    Modifier modifierM3488c7 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                    boolean zM87157i111 = c28655q2.m87157i(interfaceC15237i);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i5 = zM87157i111 | z18 | c28655q2.m87157i(abstractC30925i);
                    Object objM87133R1110 = c28655q2.m87133R();
                    if (zM87157i5) {
                        function8 = function7;
                        c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                        c28655q2.m87172p0(c27198e);
                    } else {
                        function8 = function7;
                        c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                        c28655q2.m87172p0(c27198e);
                    }
                    AbstractC27242b1.m82092d(c27270o7, strM92103Y7, modifierM3488c7, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function3 = function8;
                modifier2 = modifier3;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            C0209i c0209i112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N10);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(itemState.getSetNumberText(), c28655q2, 0), AbstractC1099a.m3398t(c2314t, f127511e, 0.0f, f127512f, 0.0f, 10), itemState.getSetNumberColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN6(), null, c28655q2, 48, 0, 196600);
            zMo95120u = itemState.getUseTimeEntry();
            c23000t1 = C23000t1.f90727a;
            if (zMo95120u) {
                c28655q2.m87150e0(-657518929);
                TextResource textResourceMo95119t8 = itemState.getTimeText();
                TextResource textResourceM21267a112 = AbstractC8693b.m21267a();
                objM87133R13 = c28655q2.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C15362h2(2);
                    c28655q2.m87172p0(objM87133R13);
                }
                InterfaceC29873g0 interfaceC29873g7 = (InterfaceC29873g0) objM87133R13;
                Modifier modifierM95063D112 = m95063D(c23000t1.mo66772c(c2314t, true, 0.4f), function5);
                objM87133R14 = c28655q2.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C30654e(6);
                    c28655q2.m87172p0(objM87133R14);
                }
                InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R14;
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i7 = z19 | c28655q2.m87157i(itemState);
                objM87133R15 = c28655q2.m87133R();
                if (zM87157i7) {
                    final int i211113 = 1;
                    objM87133R15 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211113) {
                                case 0:
                                    return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R15);
                } else {
                    final int i211114 = 1;
                    objM87133R15 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211114) {
                                case 0:
                                    return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R15);
                }
                c2886a = c2886aM8397c;
                c23000t2 = c23000t1;
                AbstractC30792k.m94678l(modifierM95063D112, textResourceMo95119t8, c2886a, null, null, null, null, null, textResourceM21267a112, false, false, null, 0L, false, 3, 0, 6, false, interfaceC29873g7, false, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a112, (Function1) objM87133R15, c28655q2, 0, 102260736, 0, 6, 939179768, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
                z14 = false;
            } else {
                c23000t2 = c23000t1;
                c2886a = c2886aM8397c;
                c28655q2.m87150e0(-656599686);
                TextResource textResourceMo95113n8 = itemState.getRepsText();
                TextResource textResourceM21267a113 = AbstractC8693b.m21267a();
                Modifier modifierM95063D113 = m95063D(c23000t2.mo66772c(c2314t, true, 0.4f), function5);
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C30654e(7);
                    c28655q2.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R5;
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(itemState);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i) {
                    final int i211115 = 2;
                    objM87133R6 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211115) {
                                case 0:
                                    return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    final int i211116 = 2;
                    objM87133R6 = new Function1() { // from class: r41.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211116) {
                                case 0:
                                    return AbstractC30924h.m95061B(function5, itemState, (String) obj);
                                case 1:
                                    return AbstractC30924h.m95096v(function5, itemState, (String) obj);
                                default:
                                    return AbstractC30924h.m95098x(function5, itemState, (String) obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R6);
                }
                z14 = false;
                AbstractC30792k.m94678l(modifierM95063D113, textResourceMo95113n8, c2886a, null, null, null, null, null, textResourceM21267a113, false, false, null, 0L, false, 3, 0, 6, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, null, interfaceC4339a113, (Function1) objM87133R6, c28655q2, 0, 806903808, 0, 6, 938917624, 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f127510d, c2314t));
            TextResource textResourceMo95122w8 = itemState.getWeightText();
            TextResource textResourceM21267a114 = AbstractC8693b.m21267a();
            int iMo95121v8 = itemState.getWeightFieldImeAction();
            zM87157i2 = c28655q.m87157i(interfaceC15237i);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R7 = new C2564l1(interfaceC15237i, 18);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C2564l1(interfaceC15237i, 18);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function16 = (Function1) objM87133R7;
            boolean zM87157i112 = c28655q.m87157i(interfaceC2994c0);
            i18 = i15 & 896;
            if (i18 == 256) {
                z15 = true;
            } else {
                z15 = z14;
            }
            zM87157i3 = z15 | zM87157i112 | c28655q.m87157i(itemState) | c28655q.m87157i(interfaceC34116n);
            Object objM87133R1111 = c28655q.m87133R();
            if (zM87157i3) {
                abstractC30925i = itemState;
                function6 = r3;
                z16 = true;
                c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                c28655q.m87172p0(c21881l);
            } else {
                abstractC30925i = itemState;
                function6 = r3;
                z16 = true;
                c21881l = new C21881l(interfaceC2994c0, function6, abstractC30925i, interfaceC34116n, 27);
                c28655q.m87172p0(c21881l);
            }
            C34348q0 c34348q7 = new C34348q0(function16, (Function1) c21881l, null, null, 58);
            Modifier modifierM95063D114 = m95063D(c23000t2.mo66772c(c2314t, z16, 0.6f), function6);
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C30654e(5);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R8;
            if (i18 == 256) {
                z17 = z16;
            } else {
                z17 = false;
            }
            zM87157i4 = z17 | c28655q.m87157i(abstractC30925i);
            objM87133R9 = c28655q.m87133R();
            if (zM87157i4) {
                final int i211117 = 0;
                objM87133R9 = new Function1() { // from class: r41.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i211117) {
                            case 0:
                                return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                            case 1:
                                return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                            default:
                                return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R9);
            } else {
                final int i211118 = 0;
                objM87133R9 = new Function1() { // from class: r41.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i211118) {
                            case 0:
                                return AbstractC30924h.m95061B(function6, abstractC30925i, (String) obj);
                            case 1:
                                return AbstractC30924h.m95096v(function6, abstractC30925i, (String) obj);
                            default:
                                return AbstractC30924h.m95098x(function6, abstractC30925i, (String) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R9);
            }
            C28655q c28655q10 = c28655q;
            function7 = function6;
            C0209i c0209i113 = c0209i3;
            AbstractC30792k.m94678l(modifierM95063D114, textResourceMo95122w8, c2886a, null, null, null, null, null, textResourceM21267a114, false, false, null, 0L, false, 9, 0, iMo95121v8, false, null, true, false, 0, false, null, null, null, null, c22976l1, null, c34348q7, interfaceC4339a114, (Function1) objM87133R9, c28655q10, 0, 805330944, 0, 6, 402046712, 0);
            c28655q2 = c28655q10;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, f127507a, 0.0f, f127508b, 0.0f, 10);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3398t8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m12);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N12);
            if (abstractC30925i.getShowProgressIndicatorInsteadOfIcon()) {
                c28655q2.m87150e0(1567646491);
                AbstractC15170v4.m43202b(AbstractC1102d.m3419p(f127509c, c2314t), c38072d.m121949b(c28655q2, 6).getAccentAction(), 3, 0L, 0, c28655q2, 390, 24);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
                function8 = function7;
            } else {
                c28655q2.m87150e0(1567947160);
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R10);
                }
                c11344e = (C11344e) objM87133R10;
                if (abstractC30925i.getAnimateIconOnChange()) {
                    c28655q2.m87150e0(1568011981);
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC28683x.m87272z(Boolean.valueOf(abstractC30925i.getIconFill()));
                        c28655q2.m87172p0(objM87133R11);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R11;
                    Boolean boolValueOf8 = Boolean.valueOf(abstractC30925i.getIconFill());
                    zM87157i6 = c28655q2.m87157i(abstractC30925i) | c28655q2.m87157i(c11344e);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87157i6) {
                        objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new a(abstractC30925i, interfaceC28601c2, c11344e, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf8);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(1569154610);
                    c28655q2.m87173q(false);
                }
                C27270o c27270o8 = new C27270o(abstractC30925i.getIconButtonType(), abstractC30925i.getIcon(), abstractC30925i.getIconColor(), abstractC30925i.getIconCircleColor(), null, abstractC30925i.getIconEnabled(), abstractC30925i.getIconNonFunctional(), false, 0.0f, abstractC30925i.getIconFill(), 400, null);
                String strM92103Y8 = AbstractC30060g.m92103Y(c28655q2, abstractC30925i.getIconContentDescriptionResId());
                Modifier modifierM3488c8 = AbstractC1127a.m3488c(c2314t, ((Number) c11344e.m30549e()).floatValue(), ((Number) c11344e.m30549e()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284);
                boolean zM87157i113 = c28655q2.m87157i(interfaceC15237i);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i5 = zM87157i113 | z18 | c28655q2.m87157i(abstractC30925i);
                Object objM87133R1112 = c28655q2.m87133R();
                if (zM87157i5) {
                    function8 = function7;
                    c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                    c28655q2.m87172p0(c27198e);
                } else {
                    function8 = function7;
                    c27198e = new C27198e((Object) interfaceC15237i, function8, (Object) abstractC30925i, (Object) interfaceC28601c1, 9);
                    c28655q2.m87172p0(c27198e);
                }
                AbstractC27242b1.m82092d(c27270o8, strM92103Y8, modifierM3488c8, null, (InterfaceC4339a) c27198e, c28655q2, 0, 8);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            function3 = function8;
            modifier2 = modifier3;
        } else {
            c28655q2.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 20, itemState, modifier2, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m95090p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final InterfaceC15250v m95091q(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC15250v) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final void m95092r(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v interfaceC15250v) {
        interfaceC28601c1.setValue(interfaceC15250v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m95093s(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        m95092r(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C29869e0 m95094t(C23254g inputText) {
        AbstractC22676k.m65750j(inputText, "inputText");
        return new C29869e0(new C23254g(m95066G(inputText)), m95074O(inputText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m95095u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m95096v(Function1 function1, AbstractC30925i abstractC30925i, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        function1.invoke(new C30920d(newText, abstractC30925i.getSetIndex()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m95097w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m95098x(Function1 function1, AbstractC30925i abstractC30925i, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        function1.invoke(new C30918b(newText, abstractC30925i.getSetIndex()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m95099y(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m95100z(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC30925i abstractC30925i, InterfaceC34116n interfaceC34116n, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(function1, abstractC30925i, KeyboardActions, interfaceC34116n, null), 3);
        return C23454a0.f92919a;
    }
}
