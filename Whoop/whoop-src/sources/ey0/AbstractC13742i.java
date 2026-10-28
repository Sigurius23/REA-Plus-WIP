package ey0;

import a01.C0084d;
import a81.C0555f;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import by0.C3691a;
import by0.C3693c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import cy0.C11183b;
import cy0.C11184c;
import cy0.InterfaceC11182a;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import ep1.C13412g;
import ev2.C13693b;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.io.IOException;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.C27273p0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p701ce2.C4494b;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p736sz0.C33205o0;
import p745y81.EnumC39333f;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tu1.C34188a;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y71.C39274g;

/* JADX INFO: renamed from: ey0.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0012\u001a=\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001e²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "pillar", HttpHeaders.DATE, "Lby0/c;", "navRouter", "Lby0/a;", "actionRouter", "Lcy0/a$i;", "screenViewEvent", "Ll83/a0;", "x", "(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;Landroidx/compose/runtime/Composer;I)V", "Lcy0/c;", "viewState", "Lkotlin/Function1;", "Lcy0/a;", "onEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "s", "Lg1/y3;", "bottomSheetState", "o", "(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "l", "(Lcy0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcy0/b;", "viewModel", "Ltu1/a;", "currentBottomSheet", "deep-dive_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13742i {

    /* JADX INFO: renamed from: ey0.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.view.DeepDiveScreenKt$DeepDiveHostScreen$2$1", m100430f = "DeepDiveScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f49012w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f49013x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C11184c f49014y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15199y3 f49015z;

        /* JADX INFO: renamed from: ey0.i$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.deepdive.view.DeepDiveScreenKt$DeepDiveHostScreen$2$1$1", m100430f = "DeepDiveScreen.kt", m100431l = {113, 115}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41573a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f49016w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11184c f49017x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C15199y3 f49018y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41573a(C11184c c11184c, C15199y3 c15199y3, InterfaceC30057d<? super C41573a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f49017x = c11184c;
                this.f49018y = c15199y3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41573a(this.f49017x, this.f49018y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41573a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
                    int r1 = r4.f49016w
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
                    cy0.c r5 = r4.f49017x
                    tu1.a r5 = r5.getBottomSheet()
                    if (r5 == 0) goto L2f
                    g1.y3 r5 = r4.f49018y
                    r4.f49016w = r3
                    java.lang.Object r5 = r5.m43225f(r4)
                    if (r5 != r0) goto L3a
                    goto L39
                L2f:
                    g1.y3 r5 = r4.f49018y
                    r4.f49016w = r2
                    java.lang.Object r5 = r5.m43223d(r4)
                    if (r5 != r0) goto L3a
                L39:
                    return r0
                L3a:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ey0.AbstractC13742i.a.C41573a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2994c0 interfaceC2994c0, C11184c c11184c, C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f49013x = interfaceC2994c0;
            this.f49014y = c11184c;
            this.f49015z = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f49013x, this.f49014y, this.f49015z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f49012w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(this.f49013x, null, null, new C41573a(this.f49014y, this.f49015z, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ey0.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.view.DeepDiveScreenKt$DeepDiveHostScreen$3$1", m100430f = "DeepDiveScreen.kt", m100431l = {122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f49019w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f49020x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f49021y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f49022z;

        /* JADX INFO: renamed from: ey0.i$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f49023w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f49024x;

            public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
                this.f49023w = function1;
                this.f49024x = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w && AbstractC13742i.m39079u(this.f49024x) != null) {
                    this.f49023w.invoke(new InterfaceC11182a.d(null));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f49020x = c15199y3;
            this.f49021y = function1;
            this.f49022z = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m39086h(C15199y3 c15199y3) {
            return c15199y3.m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f49020x, this.f49021y, this.f49022z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f49019w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C13743j(this.f49020x, 0));
                a aVar = new a(this.f49021y, this.f49022z);
                this.f49019w = 1;
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

    /* JADX INFO: renamed from: ey0.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f49025w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f49026x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f49027y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f49028z;

        /* JADX INFO: renamed from: ey0.i$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f49029w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f49029w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f49029w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f49025w = c38266c;
            this.f49026x = interfaceC35951a;
            this.f49027y = interfaceC4339a;
            this.f49028z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cy0.b] */
        @Override // c93.InterfaceC4339a
        public final C11183b invoke() {
            return AbstractC21598x.m60668X(this.f49025w, this.f49026x, new a(this.f49028z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11183b.class), null, this.f49027y);
        }
    }

    /* JADX INFO: renamed from: ey0.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.view.DeepDiveScreenKt$DeepDiveScreen$1$1", m100430f = "DeepDiveScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f49030E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC23462h f49031F;

        /* JADX INFO: renamed from: w */
        int f49032w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3691a f49033x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC11182a.i f49034y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f49035z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3691a c3691a, InterfaceC11182a.i iVar, String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f49033x = c3691a;
            this.f49034y = iVar;
            this.f49035z = str;
            this.f49030E = str2;
            this.f49031F = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f49033x, this.f49034y, this.f49035z, this.f49030E, this.f49031F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f49032w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f49033x.m11487c(this.f49034y);
            AbstractC13742i.m39083y(this.f49031F).m30310n(new InterfaceC11182a.h(this.f49035z, this.f49030E, false, 4, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m39053A(C3691a c3691a, C3693c c3693c, InterfaceC23462h interfaceC23462h, InterfaceC11182a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC11182a interfaceC11182aM11487c = c3691a.m11487c(event);
        if (interfaceC11182aM11487c instanceof InterfaceC11182a.k) {
            m39083y(interfaceC23462h).m30310n((InterfaceC11182a.k) interfaceC11182aM11487c);
        } else if (interfaceC11182aM11487c instanceof InterfaceC11182a.g) {
            c3693c.m11491c((InterfaceC11182a.g) interfaceC11182aM11487c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m39054B(String str, String str2, C3693c c3693c, C3691a c3691a, InterfaceC11182a.i iVar, int i13, Composer composer, int i14) {
        m39082x(str, str2, c3693c, c3691a, iVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m39055C(InterfaceC11182a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m39056D(C11184c c11184c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m39081w(c11184c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m39070l(C11184c viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        onEvent = onEvent;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(457324633);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C34188a c34188aM30311a = viewState.getBottomSheet();
            if (c34188aM30311a == null) {
                c28655q.m87150e0(522057507);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(522057508);
                C2314t c2314t = C2314t.f9131w;
                AbstractC18489d0.m53380u(1, 4, c2314t, c28655q);
                C2305k c2305k = C2299e.f9110M;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 2.5d) * 8);
                Modifier modifierM66722k = AbstractC22953f.m66722k(c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(c34188aM30311a.getTitle());
                int i15 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM21278l, c28655q, i15);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                int i17 = i14;
                AbstractC30795n.m94707h(strM21274h, modifierM3409f, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getT3(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                String strM108021b = c34188aM30311a.getDescription();
                C21054m c21054mM58880a = C21053l.f79834a.m58880a(null, 0L, 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, C21053l.f79835b << 15, 32767);
                c28655q = c28655q;
                AbstractC21048g.m58807M(strM108021b, modifierM3409f2, false, C21054m.m58881b(c21054mM58880a, null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, 0L, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, 32733, null), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
                C27273p0 c27273p0M108020a = c34188aM30311a.getButton();
                if (c27273p0M108020a == null) {
                    c28655q.m87150e0(-1474295390);
                    c28655q.m87173q(false);
                    z4 = false;
                } else {
                    c28655q.m87150e0(-1474295389);
                    TextResource text = c27273p0M108020a.getText();
                    InterfaceC21430b interfaceC21430bM60318a = p712j91.Function1.m60318a(AbstractC15673b0.m43972A());
                    C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, null);
                    boolean zM87157i = c28655q.m87157i(c27273p0M108020a) | ((i17 & 112) == 32) | c28655q.m87157i(viewState);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C13412g(onEvent, c27273p0M108020a, viewState, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27265l0.m82217i(null, null, text, null, c39274g, false, null, interfaceC21430bM60318a, false, false, null, null, (Function1) objM87133R, c28655q, 100663296 | (i15 << 6) | (C39274g.f168929c << 12), 0, 3691);
                    c28655q = c28655q;
                    z4 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z4);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onEvent, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m39071m(Function1 function1, C27273p0 c27273p0, C11184c c11184c, Object it) {
        String strM30331c;
        AbstractC22676k.m65750j(it, "it");
        C9598e navigationAction = c27273p0.getNavigationAction();
        C11184c.d dVarM30313c = c11184c.getScreenContent();
        if (dVarM30313c == null || (strM30331c = dVarM30313c.getSource()) == null) {
            strM30331c = "";
        }
        function1.invoke(new InterfaceC11182a.c(navigationAction, strM30331c, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m39072n(C11184c c11184c, Function1 function1, int i13, Composer composer, int i14) {
        m39070l(c11184c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m39073o(C11184c viewState, Function1 onEvent, C15199y3 bottomSheetState, String str, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        boolean z4;
        C28655q c28655q;
        String str3;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1712011665);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(bottomSheetState) : c28655q2.m87157i(bottomSheetState) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                c28655q = c28655q2;
                AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(bottomSheetState), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(876941631, c28655q2, new C22931l(22, viewState, onEvent)), false, null, null, null, false, null, AbstractC37817c.m121344e(1466262019, c28655q2, new C0084d((Object) viewState, onEvent, (Object) str3, 12)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f(viewState, onEvent, bottomSheetState, str3, i13, i14, 23);
            }
        }
        i15 |= 3072;
        str2 = str;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                str3 = "";
            } else {
                str3 = str2;
            }
            c28655q = c28655q2;
            AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(bottomSheetState), EnumC39333f.BLACK_50, null, null, null, AbstractC37817c.m121344e(876941631, c28655q2, new C22931l(22, viewState, onEvent)), false, null, null, null, false, null, AbstractC37817c.m121344e(1466262019, c28655q2, new C0084d((Object) viewState, onEvent, (Object) str3, 12)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f(viewState, onEvent, bottomSheetState, str3, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m39074p(C11184c c11184c, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m39070l(c11184c, function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m39075q(C11184c c11184c, Function1 function1, String str, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C11184c.d dVarM30313c = c11184c.getScreenContent();
            if (dVarM30313c == null) {
                c28655q.m87150e0(1594449095);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1594449096);
                AbstractC13740g.m39040n(dVarM30313c, function1, str, null, c28655q, 0, 8);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m39076r(C11184c c11184c, Function1 function1, C15199y3 c15199y3, String str, int i13, int i14, Composer composer, int i15) {
        m39073o(c11184c, function1, c15199y3, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static final void m39077s(C11184c viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        String str3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C15199y3 c15199y3M3460c;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(962263161);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
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
                    if (i18 != 0) {
                        str2 = "";
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C13693b(10);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                    C34188a c34188aM30311a = viewState.getBottomSheet();
                    int i19 = C34188a.f143397d;
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(c34188aM30311a, c28655q);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    C34188a c34188aM30311a2 = viewState.getBottomSheet();
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c34188aM30311a2);
                    zM87157i2 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F) | ((i15 & 896) == 256);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R3 == c28676v0) {
                        objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c15199y3M3460c);
                    int i24 = (i15 & 14) | ((i15 >> 3) & 112) | 512 | ((i15 << 6) & 7168);
                    Function1 function5 = function4;
                    m39073o(viewState, function5, c15199y3M3460c, str2, c28655q, i24, 0);
                    str3 = str2;
                    function3 = function5;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13741h(viewState, str3, function3, i13, i14, 1);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    str2 = "";
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13693b(10);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                C34188a c34188aM30311a3 = viewState.getBottomSheet();
                int i110 = C34188a.f143397d;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c34188aM30311a3, c28655q);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                C34188a c34188aM30311a4 = viewState.getBottomSheet();
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c34188aM30311a4);
                zM87157i2 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F) | ((i15 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c15199y3M3460c);
                int i25 = (i15 & 14) | ((i15 >> 3) & 112) | 512 | ((i15 << 6) & 7168);
                Function1 function6 = function4;
                m39073o(viewState, function6, c15199y3M3460c, str2, c28655q, i25, 0);
                str3 = str2;
                function3 = function6;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13741h(viewState, str3, function3, i13, i14, 1);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
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
                if (i18 != 0) {
                    str2 = "";
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C13693b(10);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
                C34188a c34188aM30311a5 = viewState.getBottomSheet();
                int i111 = C34188a.f143397d;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c34188aM30311a5, c28655q);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                C34188a c34188aM30311a6 = viewState.getBottomSheet();
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c34188aM30311a6);
                zM87157i2 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F) | ((i15 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c15199y3M3460c);
                int i26 = (i15 & 14) | ((i15 >> 3) & 112) | 512 | ((i15 << 6) & 7168);
                Function1 function7 = function4;
                m39073o(viewState, function7, c15199y3M3460c, str2, c28655q, i26, 0);
                str3 = str2;
                function3 = function7;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13741h(viewState, str3, function3, i13, i14, 1);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                str2 = "";
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C13693b(10);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, false, c28655q, 6, 14);
            C34188a c34188aM30311a7 = viewState.getBottomSheet();
            int i112 = C34188a.f143397d;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c34188aM30311a7, c28655q);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            C34188a c34188aM30311a8 = viewState.getBottomSheet();
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(viewState) | c28655q.m87157i(c15199y3M3460c);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(interfaceC2994c0, viewState, c15199y3M3460c, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c34188aM30311a8);
            zM87157i2 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F) | ((i15 & 896) == 256);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(c15199y3M3460c, function4, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c15199y3M3460c);
            int i27 = (i15 & 14) | ((i15 >> 3) & 112) | 512 | ((i15 << 6) & 7168);
            Function1 function8 = function4;
            m39073o(viewState, function8, c15199y3M3460c, str2, c28655q, i27, 0);
            str3 = str2;
            function3 = function8;
        } else {
            c28655q.m87138X();
            str3 = str2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13741h(viewState, str3, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m39078t(InterfaceC11182a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C34188a m39079u(InterfaceC28670t2 interfaceC28670t2) {
        return (C34188a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m39080v(C11184c c11184c, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m39077s(c11184c, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m39081w(C11184c viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1489052225);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                str = "";
            }
            String str3 = str;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13693b(9);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(755084520);
                AbstractC13737d.m39017j(viewState.getFullScreenModal(), function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(755088175);
                m39077s(viewState, str3, function3, c28655q, i15 & 1022, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1932947105);
                c28655q.m87173q(false);
            }
            str2 = str3;
            function2 = function3;
        } else {
            c28655q.m87138X();
            str2 = str;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13741h(viewState, str2, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m39082x(String pillar, String str, C3693c navRouter, C3691a actionRouter, InterfaceC11182a.i screenViewEvent, Composer composer, int i13) {
        int i14;
        C3691a c3691a;
        Object obj;
        Object dVar;
        InterfaceC23462h interfaceC23462h;
        AbstractC22676k.m65750j(pillar, "pillar");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(screenViewEvent, "screenViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1904605038);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(pillar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(actionRouter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(screenViewEvent) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G);
                obj = interfaceC23462hM92087G;
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) obj;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m39083y(interfaceC23462h2).getViewState(), new C11184c(null, new C11184c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), false ? 1 : 0, 5, null), null, c28655q, 0, 2);
            C11183b c11183bM39083y = m39083y(interfaceC23462h2);
            boolean zM87157i = c28655q.m87157i(actionRouter) | ((57344 & i14) == 16384) | c28655q.m87157i(interfaceC23462h2) | ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                interfaceC23462h = interfaceC23462h2;
                dVar = new d(actionRouter, screenViewEvent, pillar, str, interfaceC23462h, null);
                c3691a = actionRouter;
                c28655q.m87172p0(dVar);
            } else {
                interfaceC23462h = interfaceC23462h2;
                dVar = objM87133R2;
                c3691a = actionRouter;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) dVar, c11183bM39083y);
            C11184c c11184cM39084z = m39084z(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c3691a) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R3 = c28655q.m87133R();
            Object obj2 = objM87133R3;
            if (zM87157i2 || objM87133R3 == c28676v0) {
                C13412g c13412g = new C13412g(c3691a, navRouter, interfaceC23462h, 3);
                c28655q.m87172p0(c13412g);
                obj2 = c13412g;
            }
            m39081w(c11184cM39084z, pillar, (Function1) obj2, c28655q, (i14 << 3) & 112, 0);
        } else {
            c3691a = actionRouter;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(pillar, (Object) str, (Object) navRouter, (Object) c3691a, (Object) screenViewEvent, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C11183b m39083y(InterfaceC23462h interfaceC23462h) {
        return (C11183b) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final C11184c m39084z(InterfaceC28670t2 interfaceC28670t2) {
        return (C11184c) interfaceC28670t2.getValue();
    }
}
