package ow2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j21.C21245d;
import jp1.C21859k;
import kotlin.C2028s;
import kw2.InterfaceC22873b;
import l83.C23454a0;
import l83.C23465k;
import lw2.C24778c;
import lw2.C24779d;
import lw2.InterfaceC24776a;
import of2.C27900d;
import os0.C28308d;
import ov2.C28402f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p294l3.C23285v0;
import p31.C28801l;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p725ot1.C28330f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s21.C32078a;
import s21.C32085h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ow2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llw2/c;", "viewState", "Lkotlin/Function1;", "Llw2/a;", "Ll83/a0;", "onViewEvent", "Lkw2/b;", "onNavEvent", "n", "(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llw2/d;", "progressIndicator", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Llw2/c;Llw2/d;Landroidx/compose/runtime/Composer;I)V", "l", "(Llw2/c;Landroidx/compose/runtime/Composer;I)V", "Lb91/a;", "z", "(Llw2/d;Landroidx/compose/runtime/Composer;I)Lb91/a;", "what-to-expect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28443f {

    /* JADX INFO: renamed from: ow2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.view.screens.WhatToExpectScreenKt$WhatToExpectScreen$3$1", m100430f = "WhatToExpectScreen.kt", m100431l = {74, 76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114676w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24778c f114677x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f114678y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C24778c c24778c, C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114677x = c24778c;
            this.f114678y = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f114677x, this.f114678y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r5.m43225f(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r5.m43223d(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f114676w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L3a
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                lw2.c r5 = r4.f114677x
                s21.h r5 = r5.getSelectedMilestone()
                if (r5 == 0) goto L2f
                g1.y3 r5 = r4.f114678y
                r4.f114676w = r3
                java.lang.Object r5 = r5.m43225f(r4)
                if (r5 != r0) goto L3a
                goto L39
            L2f:
                g1.y3 r5 = r4.f114678y
                r4.f114676w = r2
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L3a
            L39:
                return r0
            L3a:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ow2.AbstractC28443f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ow2.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.view.screens.WhatToExpectScreenKt$WhatToExpectScreen$4$1", m100430f = "WhatToExpectScreen.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114679w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f114680x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f114681y;

        /* JADX INFO: renamed from: ow2.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f114682w;

            public a(Function1 function1) {
                this.f114682w = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w) {
                    this.f114682w.invoke(new InterfaceC24776a.b(null));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114680x = c15199y3;
            this.f114681y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m86207h(C15199y3 c15199y3) {
            return c15199y3.m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f114680x, this.f114681y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f114679w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C28439b(this.f114680x, 3));
                a aVar = new a(this.f114681y);
                this.f114679w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ow2.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.view.screens.WhatToExpectScreenKt$WhatToExpectScreen$5$1$1$1", m100430f = "WhatToExpectScreen.kt", m100431l = {175}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114683w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f114684x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC35664f.a aVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114684x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f114684x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f114683w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f114684x.getModalBottomSheetState();
                this.f114683w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l */
    private static final void m86191l(C24778c c24778c, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1479663649);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c24778c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            float f13 = 8;
            float f14 = ((float) 0.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, 0.0f, 10);
            TextResource textResourceM72628f = c24778c.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM72628f, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i16).getT2();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 48, i17, 196600);
            AbstractC11266d.m30469w(1, f13, c2314t, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c24778c.getSubTitle(), c28655q, i15), AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, 0.0f, 10), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 48, i17, 196600);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(4 * f13, c2314t));
            AbstractC28438a.m86171b(C23016z.f90757a, c24778c.getDailyProgress(), c28655q, (i15 << 3) | 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c24778c, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m86192m(C24778c c24778c, int i13, Composer composer, int i14) {
        m86191l(c24778c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

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
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final void m86193n(final C24778c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        C15199y3 c15199y3M3460c;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        AbstractC35664f.a aVar;
        boolean zM87157i;
        Object objM87133R2;
        TextResource textResourceM99785c;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C32085h c32085hM72626d;
        boolean zM87157i2;
        Object objM87133R4;
        C32078a c32078aM99817f;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(664058964);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
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
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C28402f(2);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function5 = (Function1) objM87133R6;
                    } else {
                        function5 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C28402f(3);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    aVar = new AbstractC35664f.a(c15199y3M3460c);
                    C32085h c32085hM72626d2 = viewState.getSelectedMilestone();
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q.m87133R();
                    textResourceM99785c = null;
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(viewState, c15199y3M3460c, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c32085hM72626d2);
                    boolean zM87157i3 = c28655q.m87157i(c15199y3M3460c);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zM87157i3;
                    objM87133R3 = c28655q.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = new b(c15199y3M3460c, function5, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    c32085hM72626d = viewState.getSelectedMilestone();
                    if (c32085hM72626d != null && (c32078aM99817f = c32085hM72626d.getDialogInfo()) != null) {
                        textResourceM99785c = c32078aM99817f.getTitle();
                    }
                    C35666g c35666g = new C35666g(textResourceM99785c, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC35660d.m112871m(null, c35666g, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1265925180, c28655q, new Function3() { // from class: ow2.d
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC28443f.m86197r(viewState, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                        }
                    }), false, null, null, null, false, null, AbstractC37817c.m121344e(-2035959552, c28655q, new C21859k((Object) viewState, function7, (Object) function5, 12)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    function6 = function7;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28330f(viewState, function5, function6, i13, i14, 3);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C28402f(2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function5 = (Function1) objM87133R6;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C28402f(3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                C32085h c32085hM72626d3 = viewState.getSelectedMilestone();
                zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q.m87133R();
                textResourceM99785c = null;
                if (zM87157i) {
                    objM87133R2 = new a(viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c32085hM72626d3);
                boolean zM87157i4 = c28655q.m87157i(c15199y3M3460c);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i4;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new b(c15199y3M3460c, function5, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, function5, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c32085hM72626d = viewState.getSelectedMilestone();
                if (c32085hM72626d != null) {
                    textResourceM99785c = c32078aM99817f.getTitle();
                }
                C35666g c35666g2 = new C35666g(textResourceM99785c, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC35660d.m112871m(null, c35666g2, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1265925180, c28655q, new Function3() { // from class: ow2.d
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC28443f.m86197r(viewState, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                    }
                }), false, null, null, null, false, null, AbstractC37817c.m121344e(-2035959552, c28655q, new C21859k((Object) viewState, function7, (Object) function5, 12)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function6 = function7;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(viewState, function5, function6, i13, i14, 3);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
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
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C28402f(2);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function5 = (Function1) objM87133R6;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C28402f(3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                C32085h c32085hM72626d4 = viewState.getSelectedMilestone();
                zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q.m87133R();
                textResourceM99785c = null;
                if (zM87157i) {
                    objM87133R2 = new a(viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c32085hM72626d4);
                boolean zM87157i5 = c28655q.m87157i(c15199y3M3460c);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i5;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new b(c15199y3M3460c, function5, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, function5, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c32085hM72626d = viewState.getSelectedMilestone();
                if (c32085hM72626d != null) {
                    textResourceM99785c = c32078aM99817f.getTitle();
                }
                C35666g c35666g3 = new C35666g(textResourceM99785c, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC35660d.m112871m(null, c35666g3, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1265925180, c28655q, new Function3() { // from class: ow2.d
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC28443f.m86197r(viewState, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                    }
                }), false, null, null, null, false, null, AbstractC37817c.m121344e(-2035959552, c28655q, new C21859k((Object) viewState, function7, (Object) function5, 12)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function6 = function7;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(viewState, function5, function6, i13, i14, 3);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C28402f(2);
                    c28655q.m87172p0(objM87133R6);
                }
                function5 = (Function1) objM87133R6;
            } else {
                function5 = function3;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C28402f(3);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function4;
            }
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            aVar = new AbstractC35664f.a(c15199y3M3460c);
            C32085h c32085hM72626d5 = viewState.getSelectedMilestone();
            zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
            objM87133R2 = c28655q.m87133R();
            textResourceM99785c = null;
            if (zM87157i) {
                objM87133R2 = new a(viewState, c15199y3M3460c, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(viewState, c15199y3M3460c, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c32085hM72626d5);
            boolean zM87157i6 = c28655q.m87157i(c15199y3M3460c);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i6;
            objM87133R3 = c28655q.m87133R();
            if (z14) {
                objM87133R3 = new b(c15199y3M3460c, function5, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(c15199y3M3460c, function5, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            c32085hM72626d = viewState.getSelectedMilestone();
            if (c32085hM72626d != null) {
                textResourceM99785c = c32078aM99817f.getTitle();
            }
            C35666g c35666g4 = new C35666g(textResourceM99785c, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2028s(interfaceC2994c0, aVar, 2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC35660d.m112871m(null, c35666g4, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1265925180, c28655q, new Function3() { // from class: ow2.d
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC28443f.m86197r(viewState, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
                }
            }), false, null, null, null, false, null, AbstractC37817c.m121344e(-2035959552, c28655q, new C21859k((Object) viewState, function7, (Object) function5, 12)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
            c28655q = c28655q;
            c28655q.m87173q(true);
            function6 = function7;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(viewState, function5, function6, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m86194o(InterfaceC24776a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m86195p(InterfaceC22873b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m86196q(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m86197r(C24778c c24778c, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C32085h c32085hM72626d = c24778c.getSelectedMilestone();
            if (c32085hM72626d == null) {
                c28655q.m87150e0(-930739319);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-930739318);
                AbstractC28445h.m86211c(c32085hM72626d, c28655q, C32085h.f133051r);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0125  */
    /* JADX WARN: Code duplicated, block: B:25:0x0189  */
    /* JADX WARN: Code duplicated, block: B:26:0x018d  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x020f  */
    /* JADX WARN: Code duplicated, block: B:44:0x021a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0229  */
    /* JADX WARN: Code duplicated, block: B:48:0x0250  */
    /* JADX WARN: Code duplicated, block: B:51:0x0255  */
    /* JADX WARN: Code duplicated, block: B:60:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m86198s(C24778c c24778c, Function1 function1, Function1 function2, Composer composer, int i13) {
        C22957g c22957g;
        boolean zM87153g;
        Object objM87133R;
        C28655q c28655q;
        Object obj;
        float f13;
        int iHashCode;
        C24779d c24779dM72625c;
        ?? r14;
        C24778c c24778c2;
        C23454a0 c23454a0;
        C28655q c28655q2;
        float f14;
        boolean zM87157i;
        Object objM87133R2;
        Object obj2;
        C28655q c28655q3 = (C28655q) composer;
        boolean zM87135U = c28655q3.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q3.m87138X();
            return c23454a1;
        }
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        C38072d c38072d = C38072d.f163053a;
        float f15 = 8;
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1092a.m3357b(modifierM3407d, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(c38072d.m121949b(c28655q3, C38072d.f163054b).getAccentOnboardingAction())), new C23465k(Float.valueOf(0.3f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), null, 0.4f, 2), 0.0f, ((float) 6.75d) * f15, 0.0f, 0.0f, 13);
        C22957g c22957g2 = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q3, 0);
        int iHashCode2 = Long.hashCode(c28655q3.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q3.m87158i0();
        if (c28655q3.f115903S) {
            c28655q3.m87163l(c0213j);
        } else {
            c28655q3.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (!c28655q3.f115903S) {
            c22957g = c22957g2;
            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f15, 0.0f, 0.0f, 13);
            AbstractC6721d.a aVar = new AbstractC6721d.a(c24778c.getToolbarTitle(), null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            zM87153g = c28655q3.m87153g(function1);
            objM87133R = c28655q3.m87133R();
            Object obj3 = C28635l.f115821a;
            if (zM87153g || objM87133R == obj3) {
                objM87133R = new C28439b(function1, 2);
                c28655q3.m87172p0(objM87133R);
            }
            c28655q = c28655q3;
            obj = obj3;
            f13 = f15;
            AbstractC6719b.m20143d(modifierM3398t2, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f16 = 2 * f13;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f16, AbstractC1102d.m3407d(1.0f, c2314t)), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
            c24779dM72625c = c24778c.getProgressIndicator();
            if (c24779dM72625c == null) {
                c28655q.m87150e0(1698560180);
                r14 = 0;
                c28655q.m87173q(false);
                c23454a0 = null;
                c24778c2 = c24778c;
            } else {
                r14 = 0;
                c28655q.m87150e0(1698560181);
                c24778c2 = c24778c;
                m86202w(c24778c2, c24779dM72625c, c28655q, (C28582b.f115652u | TextResource.$stable) << 3);
                c28655q.m87173q(false);
                c23454a0 = c23454a1;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(1698683313);
                m86191l(c24778c2, c28655q, r14);
                c28655q.m87173q(r14);
            } else {
                c28655q.m87150e0(1301717451);
                c28655q.m87173q(r14);
            }
            c28655q.m87150e0(1301728099);
            c28655q2 = c28655q;
            for (InterfaceC25312u interfaceC25312u : c24778c2.m72624b()) {
                if (interfaceC25312u instanceof C28801l) {
                    c28655q2.m87150e0(523938465);
                    f14 = f13;
                    AbstractC25012a.m73388u(4, f14, c2314t, c28655q2, false);
                } else {
                    f14 = f13;
                    c28655q2.m87150e0(524054591);
                    AbstractC25012a.m73388u((float) 1.5d, f14, c2314t, c28655q2, false);
                }
                zM87157i = c28655q2.m87157i(interfaceC25312u) | c28655q2.m87153g(function2) | c28655q2.m87153g(function1);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if (objM87133R2 == obj2) {
                    }
                    C28655q c28655q4 = c28655q2;
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q4, 0, 6);
                    obj = obj2;
                    f13 = f14;
                    c28655q2 = c28655q4;
                }
                objM87133R2 = new C28442e(interfaceC25312u, function2, function1, 0);
                c28655q2.m87172p0(objM87133R2);
                C28655q c28655q5 = c28655q2;
                AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q5, 0, 6);
                obj = obj2;
                f13 = f14;
                c28655q2 = c28655q5;
            }
            c28655q2.m87173q(false);
            AbstractC25012a.m73388u((float) 7.5d, f13, c2314t, c28655q2, true);
            c28655q2.m87173q(true);
            return c23454a1;
        }
        c22957g = c22957g2;
        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f15, 0.0f, 0.0f, 13);
        AbstractC6721d.a aVar2 = new AbstractC6721d.a(c24778c.getToolbarTitle(), null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
        zM87153g = c28655q3.m87153g(function1);
        objM87133R = c28655q3.m87133R();
        Object obj4 = C28635l.f115821a;
        if (zM87153g) {
            objM87133R = new C28439b(function1, 2);
            c28655q3.m87172p0(objM87133R);
        } else {
            objM87133R = new C28439b(function1, 2);
            c28655q3.m87172p0(objM87133R);
        }
        c28655q = c28655q3;
        obj = obj4;
        f13 = f15;
        AbstractC6719b.m20143d(modifierM3398t3, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
        float f17 = 2 * f13;
        Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f17, AbstractC1102d.m3407d(1.0f, c2314t)), AbstractC30060g.m92099U(0, c28655q, 1), 14);
        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t));
        c24779dM72625c = c24778c.getProgressIndicator();
        if (c24779dM72625c == null) {
            c28655q.m87150e0(1698560180);
            r14 = 0;
            c28655q.m87173q(false);
            c23454a0 = null;
            c24778c2 = c24778c;
        } else {
            r14 = 0;
            c28655q.m87150e0(1698560181);
            c24778c2 = c24778c;
            m86202w(c24778c2, c24779dM72625c, c28655q, (C28582b.f115652u | TextResource.$stable) << 3);
            c28655q.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            c28655q.m87150e0(1698683313);
            m86191l(c24778c2, c28655q, r14);
            c28655q.m87173q(r14);
        } else {
            c28655q.m87150e0(1301717451);
            c28655q.m87173q(r14);
        }
        c28655q.m87150e0(1301728099);
        c28655q2 = c28655q;
        while (r1.hasNext()) {
            if (interfaceC25312u instanceof C28801l) {
                c28655q2.m87150e0(523938465);
                f14 = f13;
                AbstractC25012a.m73388u(4, f14, c2314t, c28655q2, false);
            } else {
                f14 = f13;
                c28655q2.m87150e0(524054591);
                AbstractC25012a.m73388u((float) 1.5d, f14, c2314t, c28655q2, false);
            }
            zM87157i = c28655q2.m87157i(interfaceC25312u) | c28655q2.m87153g(function2) | c28655q2.m87153g(function1);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                obj2 = obj;
                if (objM87133R2 == obj2) {
                }
                C28655q c28655q6 = c28655q2;
                AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q6, 0, 6);
                obj = obj2;
                f13 = f14;
                c28655q2 = c28655q6;
            } else {
                obj2 = obj;
            }
            objM87133R2 = new C28442e(interfaceC25312u, function2, function1, 0);
            c28655q2.m87172p0(objM87133R2);
            C28655q c28655q7 = c28655q2;
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q7, 0, 6);
            obj = obj2;
            f13 = f14;
            c28655q2 = c28655q7;
        }
        c28655q2.m87173q(false);
        AbstractC25012a.m73388u((float) 7.5d, f13, c2314t, c28655q2, true);
        c28655q2.m87173q(true);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m86199t(Function1 function1) {
        function1.invoke(InterfaceC22873b.b.f90146a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[DONT_INVERT] */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m86200u(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, Object it) {
        C32085h c32085h;
        boolean z4;
        String id4;
        AbstractC22676k.m65750j(it, "it");
        boolean z13 = interfaceC25312u instanceof C32085h;
        if (z13) {
            C32085h c32085h2 = (C32085h) interfaceC25312u;
            if (!c32085h2.getIsUnlocked()) {
                function1.invoke(new InterfaceC24776a.b(c32085h2));
            } else if (it instanceof C9598e) {
                if (z13) {
                    c32085h = (C32085h) interfaceC25312u;
                } else {
                    c32085h = null;
                }
                C9598e c9598e = (C9598e) it;
                if (c32085h != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c32085h != null || (id4 = c32085h.getId()) == null) {
                    id4 = "";
                }
                function2.invoke(new InterfaceC22873b.a(c9598e, z4, id4));
            }
        } else if (it instanceof C9598e) {
            if (z13) {
                c32085h = (C32085h) interfaceC25312u;
            } else {
                c32085h = null;
            }
            C9598e c9598e2 = (C9598e) it;
            if (c32085h != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c32085h != null) {
                id4 = "";
            } else {
                id4 = "";
            }
            function2.invoke(new InterfaceC22873b.a(c9598e2, z4, id4));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m86201v(C24778c c24778c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m86193n(c24778c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m86202w(C24778c viewState, C24779d c24779d, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        C24779d progressIndicator = c24779d;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(progressIndicator, "progressIndicator");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1318062893);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(progressIndicator) : c28655q2.m87157i(progressIndicator) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
            float f13 = 8;
            float f14 = ((float) 0.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, 0.0f, 10);
            TextResource textResourceM72628f = viewState.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM72628f, c28655q2, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q2, i16).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i16).getT2();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 48, i17, 196600);
            AbstractC11266d.m30469w(1, f13, c2314t, c28655q2);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubTitle(), c28655q2, i15), AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, 0.0f, 10), c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 48, i17, 196600);
            c28655q2.m87173q(true);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 3 * f13, 0.0f, 0.0f, 0.0f, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j = c0213j2;
                c28655q2.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            AbstractC28586f.m86944i(null, c24779d.getCircularProgressIndicator(), c28655q2, C28582b.f115652u << 3, 1);
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1303620996, c28655q2, new C21245d(25, c24779d, viewState)), c28655q2, 56);
            c28655q2.m87173q(true);
            float f15 = 2 * f13;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f15, c2314t));
            progressIndicator = c24779d;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c24779d.getSubText(), c28655q2, i15), null, c38072d.m121949b(c28655q2, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getBtS(), null, c28655q2, 0, i17, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(viewState, progressIndicator, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m86203x(C24779d c24779d, C24778c c24778c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(c24779d.getCompletedStepsText(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C24779d c24779dM72625c = c24778c.getProgressIndicator();
            int i15 = C28582b.f115652u | TextResource.$stable;
            C2886a c2886aM86205z = m86205z(c24779dM72625c, c28655q, i15);
            float fM124805c = C39183o.m124805c(AbstractC35745c.m113246h(28));
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            long jM95626b = AbstractC31061c.m95626b(fM124805c, 4294967296L, (InterfaceC39171c) c28655q.m87161k(c28674u2));
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i, null, jM125430y, jM95626b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM86205z, null, c28655q, 0, i16, 196594);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(c24779d.getTotalStepsText(), c28655q, 0), null, c38072d.m121949b(c28655q, i14).getWhite50(), AbstractC31061c.m95626b(C39183o.m124805c(AbstractC35745c.m113246h(28)), 4294967296L, (InterfaceC39171c) c28655q.m87161k(c28674u2)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m86205z(c24778c.getProgressIndicator(), c28655q, i15), null, c28655q, 0, i16, 196594);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m86204y(C24778c c24778c, C24779d c24779d, int i13, Composer composer, int i14) {
        m86202w(c24778c, c24779d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final C2886a m86205z(C24779d c24779d, Composer composer, int i13) {
        if (c24779d == null || !c24779d.getCompleted()) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1759580629);
            C2886a c2886aM8445z = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN45();
            c28655q.m87173q(false);
            return c2886aM8445z;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1759395869);
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q2, i14).getN45(), C23285v0.m67363a(c38072d.m121952e(c28655q2, i14).getN45().getStyle(), AbstractC15673b0.m43985G0(), 0L, null, null, 0L, 33554430), null, 2, null);
        c28655q2.m87173q(false);
        return c2886aM8397c;
    }
}
