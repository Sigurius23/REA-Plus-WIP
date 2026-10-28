package ed1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d30.C11546l;
import e51.C12725a;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p180h0.AbstractC16444q3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ed1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Led1/a;", "Lm91/f;", "Led1/b;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "key", "Lkotlin/Function0;", "Ll83/a0;", "onClick", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/a;)Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Led1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13112a implements InterfaceC25297f<C13113b> {

    /* JADX INFO: renamed from: ed1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC4339a f45336w;

        /* JADX INFO: renamed from: ed1.a$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.showcase.menu.view.DesignShowcaseMenuItem$consumeTap$1$1", m100430f = "DesignShowcaseMenuItem.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/v;", "Ll83/a0;", "<anonymous>", "(Lu2/v;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41520a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f45337w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f45338x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4339a f45339y;

            /* JADX INFO: renamed from: ed1.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.showcase.menu.view.DesignShowcaseMenuItem$consumeTap$1$1$1", m100430f = "DesignShowcaseMenuItem.kt", m100431l = {91, AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41521a extends AbstractC32274h implements InterfaceC4351m {

                /* JADX INFO: renamed from: E */
                final /* synthetic */ InterfaceC4339a f45340E;

                /* JADX INFO: renamed from: x */
                Object f45341x;

                /* JADX INFO: renamed from: y */
                int f45342y;

                /* JADX INFO: renamed from: z */
                private /* synthetic */ Object f45343z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41521a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super C41521a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f45340E = interfaceC4339a;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    C41521a c41521a = new C41521a(this.f45340E, interfaceC30057d);
                    c41521a.f45343z = obj;
                    return c41521a;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41521a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
                
                    if (r6 == r1) goto L21;
                 */
                @Override // s83.AbstractC32267a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = r5.f45343z
                        u2.b r0 = (p512u2.InterfaceC34449b) r0
                        r83.a r1 = r83.EnumC31071a.f128113w
                        int r2 = r5.f45342y
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L24
                        if (r2 == r4) goto L20
                        if (r2 != r3) goto L18
                        java.lang.Object r0 = r5.f45341x
                        u2.k r0 = (p512u2.C34465k) r0
                        p505ts.AbstractC34132o.m107864I(r6)
                        goto L69
                    L18:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L20:
                        p505ts.AbstractC34132o.m107864I(r6)
                        goto L37
                    L24:
                        p505ts.AbstractC34132o.m107864I(r6)
                        u2.l r6 = p512u2.EnumC34466l.f144806w
                        r5.f45343z = r0
                        r5.f45342y = r4
                        r2 = r0
                        u2.g0 r2 = (p512u2.C34460g0) r2
                        java.lang.Object r6 = r2.m108928a(r6, r5)
                        if (r6 != r1) goto L37
                        goto L68
                    L37:
                        u2.k r6 = (p512u2.C34465k) r6
                        java.lang.Object r6 = r6.f144800a
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.Iterator r6 = r6.iterator()
                    L41:
                        boolean r2 = r6.hasNext()
                        if (r2 == 0) goto L57
                        java.lang.Object r2 = r6.next()
                        u2.r r2 = (p512u2.C34472r) r2
                        boolean r4 = p512u2.AbstractC34454d0.m108911b(r2)
                        if (r4 == 0) goto L41
                        r2.m108946a()
                        goto L41
                    L57:
                        u2.l r6 = p512u2.EnumC34466l.f144806w
                        r2 = 0
                        r5.f45343z = r2
                        r5.f45341x = r2
                        r5.f45342y = r3
                        u2.g0 r0 = (p512u2.C34460g0) r0
                        java.lang.Object r6 = r0.m108928a(r6, r5)
                        if (r6 != r1) goto L69
                    L68:
                        return r1
                    L69:
                        u2.k r6 = (p512u2.C34465k) r6
                        java.lang.Object r6 = r6.f144800a
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        c93.a r0 = r5.f45340E
                        java.util.Iterator r6 = r6.iterator()
                    L75:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L8e
                        java.lang.Object r1 = r6.next()
                        u2.r r1 = (p512u2.C34472r) r1
                        boolean r2 = p512u2.AbstractC34454d0.m108913d(r1)
                        if (r2 == 0) goto L75
                        r0.invoke()
                        r1.m108946a()
                        goto L75
                    L8e:
                        l83.a0 r6 = l83.C23454a0.f92919a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ed1.C13112a.a.C41520a.C41521a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41520a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super C41520a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f45339y = interfaceC4339a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41520a c41520a = new C41520a(this.f45339y, interfaceC30057d);
                c41520a.f45338x = obj;
                return c41520a;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41520a) create(interfaceC34476v, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC34476v interfaceC34476v = (InterfaceC34476v) this.f45338x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f45337w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C41521a c41521a = new C41521a(this.f45339y, null);
                    this.f45338x = null;
                    this.f45337w = 1;
                    if (((C34462h0) interfaceC34476v).m108934X0(c41521a, this) == enumC31071a) {
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

        public a(InterfaceC4339a interfaceC4339a) {
            this.f45336w = interfaceC4339a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46631m = AbstractC16444q3.m46631m(interfaceC34476v, new C41520a(this.f45336w, null), interfaceC30057d);
            return objM46631m == EnumC31071a.f128113w ? objM46631m : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m36653e(Function1 function1, C13113b c13113b) {
        function1.invoke(c13113b.getNavigationEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m36654f(C13113b c13113b, Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q, 6);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (c13113b.getPreview() != null) {
                c28655q.m87150e0(2024681221);
                C2307m c2307m = C2299e.f9102E;
                Modifier modifierM3412i = AbstractC1102d.m3412i(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(16, AbstractC1092a.m3358c(modifier, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkAlt(), AbstractC17918w0.f69621a))), 0, 140);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3412i);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC11895b.m31978A(0, c13113b.getPreview(), c28655q, true, false);
            } else {
                c28655q.m87150e0(2025105580);
                c28655q.m87173q(false);
            }
            String strM36666l = c13113b.getText();
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2886a h7 = c38072d.m121952e(c28655q, i14).getH3();
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM36666l, modifierM3394p, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 48, i15, 196600);
            C28655q c28655q2 = c28655q;
            if (c13113b.getShowLocation()) {
                c28655q2.m87150e0(2025412480);
                AbstractC30795n.m94707h(c13113b.getLocation(), AbstractC1099a.m3398t(c2314t, f13, 0.0f, f13, f13, 2), c38072d.m121949b(c28655q2, i14).getGreyL1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getH4(), null, c28655q2, 48, i15, 196600);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(2025731532);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m36655g(C13112a c13112a, Modifier modifier, C13113b c13113b, Function1 function1, int i13, Composer composer, int i14) {
        c13112a.Compose(modifier, c13113b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private final Modifier m36656h(Modifier modifier, Object obj, InterfaceC4339a interfaceC4339a) {
        return AbstractC34452c0.m108903b(modifier, obj, new a(interfaceC4339a));
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C13113b itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1750465923);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(8, AbstractC1102d.m3412i(AbstractC1102d.m3409f(1.0f, modifier), 64, 300));
            String strM36666l = itemState.getText();
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11546l(14, onViewEvent, itemState);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(m36656h(modifierM3394p, strM36666l, (InterfaceC4339a) objM87133R), null, AbstractC17918w0.m51518f(0.25f, 0.25f, 0.25f, 0.0f, 24), null, 0.0f, AbstractC37817c.m121344e(211554848, c28655q, new C0003a0(25, itemState, modifier)), c28655q, 1573248, 58);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12725a(i13, 6, this, modifier, itemState, onViewEvent);
        }
    }
}
