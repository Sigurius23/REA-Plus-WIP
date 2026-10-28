package jx2;

import a80.C0542f;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import ay2.InterfaceC2155a;
import az2.C2174a;
import bc3.InterfaceC2994c0;
import by2.C3701a;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.whooplabs.feature.navigation.AbstractC10838a;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import com.whoop.whooplabs.feature.navigation.C10839b;
import com.whoop.whooplabs.feature.navigation.WhoopLabsNavHostDestination;
import cz2.InterfaceC11265a;
import e93.AbstractC12889b;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import fy2.AbstractC14879a;
import fz2.AbstractC14892a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import hy2.AbstractC17810a;
import hz2.InterfaceC17819d;
import ih1.C18522f;
import io.getstream.chat.android.client.api2.C19054d;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import iz2.C21060a;
import j81.C21421e;
import j93.InterfaceC21461d;
import jf3.C21647a;
import jp2.C21875f;
import jp2.C21881l;
import js2.C21930h;
import ky2.AbstractC22896e;
import ky2.InterfaceC22898g;
import l83.C23454a0;
import lx2.AbstractC24796a;
import ly2.C24803a;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny2.AbstractC27299a;
import o12.AbstractC27417d;
import o12.C27418e;
import ox2.AbstractC28462h;
import p114eb.AbstractC12958g1;
import p114eb.AbstractC12964i1;
import p114eb.C12953f;
import p114eb.C12974m;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p12.AbstractC28734x;
import p12.C28712d;
import p12.C28714e;
import p12.C28735y;
import p12.EnumC28717g;
import p245j8.AbstractC21412c;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p558vp.AbstractC36259c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p733ry2.AbstractC31916e;
import pf3.C29155a;
import px2.InterfaceC29603f;
import q83.C30064k;
import q83.InterfaceC30057d;
import qx2.C30761a;
import r83.EnumC31071a;
import rx2.AbstractC31904a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ty2.AbstractC34268a;
import ux2.AbstractC35371a;
import ux2.InterfaceC35372b;
import uy2.C35386a;
import vx2.C36560a;
import wb3.AbstractC37056f;
import wx2.AbstractC37687a;
import wy2.AbstractC37698a;
import x81.AbstractC38073e;
import xf3.C38266c;
import yb3.AbstractC39421y;
import zw2.AbstractC41177a;
import zw2.C41178b;
import zx2.AbstractC41208a;
import zy2.AbstractC41231d;
import zy2.InterfaceC41233f;

/* JADX INFO: renamed from: jx2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0016²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/whooplabs/feature/navigation/a;", "entry", "Leb/u0;", "navController", "Lcom/whoop/whooplabs/feature/navigation/b;", "navRouter", "Lzw2/b;", "analytics", "Lkotlin/Function0;", "Ll83/a0;", "closeWhoopLabsScreenHandler", "H", "(Lcom/whoop/whooplabs/feature/navigation/a;Leb/u0;Lcom/whoop/whooplabs/feature/navigation/b;Lzw2/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lhz2/d;", "viewState", "Lay2/a;", "Lp12/y;", "Lpx2/f;", "Lux2/b;", "Lky2/g;", "Lty2/a;", "Lzy2/f;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22042f {

    /* JADX INFO: renamed from: jx2.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$1$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85478w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41178b f85479x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21060a f85480y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C41178b c41178b, C21060a c21060a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85479x = c41178b;
            this.f85480y = c21060a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f85479x, this.f85480y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85478w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85479x.m133828a(new AbstractC41177a.o(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
            this.f85480y.m58911l(InterfaceC11265a.a.f36180a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$1$4$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85481w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41178b f85482x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C3701a f85483y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C41178b c41178b, C3701a c3701a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85482x = c41178b;
            this.f85483y = c3701a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f85482x, this.f85483y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85481w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85482x.m133828a(new AbstractC41177a.o(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
            this.f85483y.m11526q(AbstractC37687a.a.f161490a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$2$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85484w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27418e f85485x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C27418e c27418e, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85485x = c27418e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f85485x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85484w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85485x.m82822q(new AbstractC27417d.d("DIGITAL_WHOOP_LABS_EDUCATION"));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$3$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85486w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41178b f85487x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f85488y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30761a f85489z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C41178b c41178b, int i13, C30761a c30761a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85487x = c41178b;
            this.f85488y = i13;
            this.f85489z = c30761a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f85487x, this.f85488y, this.f85489z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85486w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85487x.m133828a(new AbstractC41177a.p(null, String.valueOf(this.f85488y), 1, 0 == true ? 1 : 0));
            this.f85489z.m94508r(new AbstractC24796a.g(this.f85488y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$6$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85490w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36560a f85491x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f85492y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C36560a c36560a, int i13, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85491x = c36560a;
            this.f85492y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f85491x, this.f85492y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85490w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85491x.m117287q(new AbstractC31904a.a(this.f85492y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$f */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$7$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85493w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24803a f85494x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f85495y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Integer f85496z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C24803a c24803a, int i13, Integer num, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85494x = c24803a;
            this.f85495y = i13;
            this.f85496z = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f85494x, this.f85495y, this.f85496z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85493w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85494x.m72714o(new AbstractC17810a.b(this.f85495y, this.f85496z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$g */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$8$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85497w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35386a f85498x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f85499y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Integer f85500z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C35386a c35386a, int i13, Integer num, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85498x = c35386a;
            this.f85499y = i13;
            this.f85500z = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f85498x, this.f85499y, this.f85500z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85497w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85498x.m112316n(new AbstractC27299a.u(this.f85499y, this.f85500z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$h */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.WhoopLabsNavHostKt$WhoopLabsNavHost$2$1$9$1$1", m100430f = "WhoopLabsNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85501w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2174a f85502x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f85503y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C2174a c2174a, String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85502x = c2174a;
            this.f85503y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f85502x, this.f85503y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85501w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f85502x.m6852q(new AbstractC37698a.a(this.f85503y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jx2.f$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85504w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C21647a c21647a) {
            super(0);
            this.f85504w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85504w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85505w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C21647a c21647a) {
            super(0);
            this.f85505w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85505w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85506w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C21647a c21647a) {
            super(0);
            this.f85506w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85506w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85507w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C21647a c21647a) {
            super(0);
            this.f85507w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85507w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85508w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C21647a c21647a) {
            super(0);
            this.f85508w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85508w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85509w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C21647a c21647a) {
            super(0);
            this.f85509w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85509w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85510w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C21647a c21647a) {
            super(0);
            this.f85510w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85510w;
        }
    }

    /* JADX INFO: renamed from: jx2.f$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21647a f85511w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C21647a c21647a) {
            super(0);
            this.f85511w = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.f85511w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public static final void m63027H(AbstractC10838a abstractC10838a, C12991u0 c12991u0, C10839b navRouter, C41178b analytics, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        AbstractC10838a abstractC10838a2;
        int i15;
        C12991u0 c12991u1;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C12991u0 c12991u2;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        AbstractC10838a abstractC10838a3;
        C12991u0 c12991u0M44439S;
        int i17;
        InterfaceC4339a interfaceC4339a4;
        AbstractC10838a abstractC10838a4;
        C12991u0 c12991u3;
        Object objM87133R;
        FeatureFlagChecker featureFlagChecker;
        boolean zM87157i;
        Object objM87133R2;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(analytics, "analytics");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(102985800);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            abstractC10838a2 = abstractC10838a;
        } else if ((i13 & 6) == 0) {
            abstractC10838a2 = abstractC10838a;
            i15 = (c28655q.m87153g(abstractC10838a2) ? 4 : 2) | i13;
        } else {
            abstractC10838a2 = abstractC10838a;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c12991u1 = c12991u0;
                int i19 = c28655q.m87157i(c12991u1) ? 32 : 16;
                i15 |= i19;
            } else {
                c12991u1 = c12991u0;
            }
            i15 |= i19;
        } else {
            c12991u1 = c12991u0;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(navRouter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(analytics) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i14 & 16;
        if (i24 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i18 != 0) {
                        abstractC10838a3 = AbstractC10838a.b.f33250a;
                    } else {
                        abstractC10838a3 = abstractC10838a2;
                    }
                    if ((i14 & 2) != 0) {
                        c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q);
                        i15 &= -113;
                    } else {
                        c12991u0M44439S = c12991u1;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C22038b(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        abstractC10838a4 = abstractC10838a3;
                        c12991u3 = c12991u0M44439S;
                        i17 = i15;
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                    } else {
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a2;
                        i17 = i15;
                        interfaceC4339a4 = interfaceC4339a5;
                        abstractC10838a4 = abstractC10838a3;
                        c12991u3 = c12991u0M44439S;
                    }
                } else {
                    c28655q.m87138X();
                    if ((i14 & 2) != 0) {
                        i15 &= -113;
                    }
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
                    i17 = i15;
                    interfaceC4339a4 = interfaceC4339a6;
                    abstractC10838a4 = abstractC10838a2;
                    c12991u3 = c12991u1;
                }
                c28655q.m87175r();
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                String strM28560a = abstractC10838a4.m28560a();
                zM87157i = c28655q.m87157i(featureFlagChecker) | c28655q.m87157i(analytics) | c28655q.m87157i(navRouter) | ((57344 & i17) == 16384);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    C21881l c21881l = new C21881l(featureFlagChecker, analytics, navRouter, interfaceC4339a4, 1);
                    c28655q.m87172p0(c21881l);
                    objM87133R2 = c21881l;
                }
                AbstractC17269i.m48888e(c12991u3, strM28560a, null, (Function1) objM87133R2, c28655q, (i17 >> 3) & 14);
                interfaceC4339a3 = interfaceC4339a4;
                c12991u2 = c12991u3;
                abstractC10838a2 = abstractC10838a4;
            } else {
                c28655q.m87138X();
                c12991u2 = c12991u1;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(abstractC10838a2, c12991u2, navRouter, analytics, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i18 != 0) {
                    abstractC10838a3 = AbstractC10838a.b.f33250a;
                } else {
                    abstractC10838a3 = abstractC10838a2;
                }
                if ((i14 & 2) != 0) {
                    c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q);
                    i15 &= -113;
                } else {
                    c12991u0M44439S = c12991u1;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C22038b(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC10838a4 = abstractC10838a3;
                    c12991u3 = c12991u0M44439S;
                    i17 = i15;
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a2;
                    i17 = i15;
                    interfaceC4339a4 = interfaceC4339a7;
                    abstractC10838a4 = abstractC10838a3;
                    c12991u3 = c12991u0M44439S;
                }
            } else {
                if (i18 != 0) {
                    abstractC10838a3 = AbstractC10838a.b.f33250a;
                } else {
                    abstractC10838a3 = abstractC10838a2;
                }
                if ((i14 & 2) != 0) {
                    c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q);
                    i15 &= -113;
                } else {
                    c12991u0M44439S = c12991u1;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C22038b(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC10838a4 = abstractC10838a3;
                    c12991u3 = c12991u0M44439S;
                    i17 = i15;
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    InterfaceC4339a interfaceC4339a8 = interfaceC4339a2;
                    i17 = i15;
                    interfaceC4339a4 = interfaceC4339a8;
                    abstractC10838a4 = abstractC10838a3;
                    c12991u3 = c12991u0M44439S;
                }
            }
            c28655q.m87175r();
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            String strM28560a2 = abstractC10838a4.m28560a();
            zM87157i = c28655q.m87157i(featureFlagChecker) | c28655q.m87157i(analytics) | c28655q.m87157i(navRouter) | ((57344 & i17) == 16384);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                C21881l c21881l2 = new C21881l(featureFlagChecker, analytics, navRouter, interfaceC4339a4, 1);
                c28655q.m87172p0(c21881l2);
                objM87133R2 = c21881l2;
            } else {
                C21881l c21881l3 = new C21881l(featureFlagChecker, analytics, navRouter, interfaceC4339a4, 1);
                c28655q.m87172p0(c21881l3);
                objM87133R2 = c21881l3;
            }
            AbstractC17269i.m48888e(c12991u3, strM28560a2, null, (Function1) objM87133R2, c28655q, (i17 >> 3) & 14);
            interfaceC4339a3 = interfaceC4339a4;
            c12991u2 = c12991u3;
            abstractC10838a2 = abstractC10838a4;
        } else {
            c28655q.m87138X();
            c12991u2 = c12991u1;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(abstractC10838a2, c12991u2, navRouter, analytics, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m63028I() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m63029J(FeatureFlagChecker featureFlagChecker, C41178b c41178b, final C10839b c10839b, InterfaceC4339a interfaceC4339a, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, WhoopLabsNavHostDestination.C10836g.f33245a.getBaseRoute(), null, new C37816b(new C0542f(featureFlagChecker, c41178b, c10839b, 22), true, 292132237), 6);
        AbstractC12889b.m36291u(NavHost, WhoopLabsNavHostDestination.C10837h.f33247a.getBaseRoute(), null, new C37816b(new C18522f(4, interfaceC4339a, c10839b), true, -324719484), 6);
        WhoopLabsNavHostDestination.C10830a c10830a = WhoopLabsNavHostDestination.C10830a.f33233a;
        AbstractC12889b.m36291u(NavHost, c10830a.getRoute(), c10830a.getArgs(), new C37816b(new C18522f(5, c41178b, c10839b), true, -882703547), 4);
        String route = WhoopLabsNavHostDestination.C10832c.f33237a.getRoute();
        C12974m c12974m = new C12974m();
        m63055e0(c12974m);
        final int i13 = 1;
        AbstractC12889b.m36291u(NavHost, route, AbstractC37056f.m118958J(new C12953f("campaignId", c12974m.f44811a.m36452a())), new C37816b(new Function3() { // from class: jx2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC22042f.m63085t0(c10839b, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC22042f.m63057f0(c10839b, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC22042f.m63061h0(c10839b, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC22042f.m63069l0(c10839b, c12982q, composer, iIntValue);
                    default:
                        return AbstractC22042f.m63077p0(c10839b, c12982q, composer, iIntValue);
                }
            }
        }, true, -1440687610), 4);
        WhoopLabsNavHostDestination.C10831b c10831b = WhoopLabsNavHostDestination.C10831b.f33235a;
        final int i14 = 2;
        AbstractC12889b.m36291u(NavHost, c10831b.getRoute(), c10831b.getArgs(), new C37816b(new Function3() { // from class: jx2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC22042f.m63085t0(c10839b, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC22042f.m63057f0(c10839b, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC22042f.m63061h0(c10839b, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC22042f.m63069l0(c10839b, c12982q, composer, iIntValue);
                    default:
                        return AbstractC22042f.m63077p0(c10839b, c12982q, composer, iIntValue);
                }
            }
        }, true, -1998671673), 4);
        WhoopLabsNavHostDestination.C10833d c10833d = WhoopLabsNavHostDestination.C10833d.f33239a;
        final int i15 = 3;
        AbstractC12889b.m36291u(NavHost, c10833d.getRoute(), c10833d.getArgs(), new C37816b(new Function3() { // from class: jx2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i16) {
                    case 0:
                        return AbstractC22042f.m63085t0(c10839b, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC22042f.m63057f0(c10839b, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC22042f.m63061h0(c10839b, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC22042f.m63069l0(c10839b, c12982q, composer, iIntValue);
                    default:
                        return AbstractC22042f.m63077p0(c10839b, c12982q, composer, iIntValue);
                }
            }
        }, true, 1738311560), 4);
        WhoopLabsNavHostDestination.C10834e c10834e = WhoopLabsNavHostDestination.C10834e.f33241a;
        final int i16 = 4;
        AbstractC12889b.m36291u(NavHost, c10834e.getRoute(), c10834e.getArgs(), new C37816b(new Function3() { // from class: jx2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i17 = i16;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i17) {
                    case 0:
                        return AbstractC22042f.m63085t0(c10839b, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC22042f.m63057f0(c10839b, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC22042f.m63061h0(c10839b, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC22042f.m63069l0(c10839b, c12982q, composer, iIntValue);
                    default:
                        return AbstractC22042f.m63077p0(c10839b, c12982q, composer, iIntValue);
                }
            }
        }, true, 1180327497), 4);
        WhoopLabsNavHostDestination.C10835f c10835f = WhoopLabsNavHostDestination.C10835f.f33243a;
        final int i17 = 0;
        AbstractC12889b.m36291u(NavHost, c10835f.getRoute(), c10835f.getArgs(), new C37816b(new Function3() { // from class: jx2.c
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i18 = i17;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i18) {
                    case 0:
                        return AbstractC22042f.m63085t0(c10839b, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC22042f.m63057f0(c10839b, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC22042f.m63061h0(c10839b, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC22042f.m63069l0(c10839b, c12982q, composer, iIntValue);
                    default:
                        return AbstractC22042f.m63077p0(c10839b, c12982q, composer, iIntValue);
                }
            }
        }, true, 622343434), 4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m63030K(FeatureFlagChecker featureFlagChecker, C41178b c41178b, C10839b c10839b, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("dwl-landing-v2");
        C23454a0 c23454a0 = C23454a0.f92919a;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (!zIsFeatureEnabled) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1308410851);
            c28655q.m87152f0(1509148315);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC21598x.m60668X(c38266c, null, new j(c21647aM114690r), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3701a.class), null, null);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            C3701a c3701a = (C3701a) ((AbstractC1637w1) objM87133R);
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c3701a.getViewState(), c28655q, 0);
            boolean zM87157i = c28655q.m87157i(c41178b) | c28655q.m87157i(c3701a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(c41178b, c3701a, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
            InterfaceC2155a interfaceC2155aM63034O = m63034O(interfaceC28601c1M87261o);
            boolean zM87157i2 = c28655q.m87157i(c3701a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C19962a(c3701a, 8);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(c10839b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C22040d(c10839b, 4);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC41208a.m133881s(interfaceC2155aM63034O, function1, (Function1) objM87133R4, c28655q, 0);
            c28655q.m87173q(false);
            return c23454a0;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1307817573);
        c28655q2.m87152f0(1509148315);
        C26669a c26669a2 = C29155a.f118017b;
        if (c26669a2 == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c2 = c26669a2.f106046a.f159364d;
        C21647a c21647aM114690r2 = AbstractC36095b.m114690r(c28655q2, 1509148620, c28655q2, false, -3686552);
        boolean zM87153g2 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
        Object objM87133R5 = c28655q2.m87133R();
        if (zM87153g2 || objM87133R5 == c28676v0) {
            objM87133R5 = AbstractC21598x.m60668X(c38266c2, null, new i(c21647aM114690r2), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21060a.class), null, null);
            c28655q2.m87172p0(objM87133R5);
        }
        c28655q2.m87173q(false);
        c28655q2.m87173q(false);
        C21060a c21060a = (C21060a) ((AbstractC1637w1) objM87133R5);
        InterfaceC13037f2 viewState = c21060a.getViewState();
        InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q2.m87161k(AbstractC21412c.f82093a);
        InterfaceC28601c1 interfaceC28601c1M115713x = AbstractC36259c.m115713x(viewState, viewState.getValue(), interfaceC1585g0.getLifecycle(), EnumC1635w.f6328z, C30064k.f122676w, c28655q2, 0);
        boolean zM87157i4 = c28655q2.m87157i(c41178b) | c28655q2.m87157i(c21060a);
        Object objM87133R6 = c28655q2.m87133R();
        if (zM87157i4 || objM87133R6 == c28676v0) {
            objM87133R6 = new a(c41178b, c21060a, null);
            c28655q2.m87172p0(objM87133R6);
        }
        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R6, c23454a0);
        InterfaceC17819d interfaceC17819dM63031L = m63031L(interfaceC28601c1M115713x);
        boolean zM87157i5 = c28655q2.m87157i(c21060a);
        Object objM87133R7 = c28655q2.m87133R();
        if (zM87157i5 || objM87133R7 == c28676v0) {
            objM87133R7 = new C19962a(c21060a, 7);
            c28655q2.m87172p0(objM87133R7);
        }
        Function1 function2 = (Function1) objM87133R7;
        boolean zM87157i6 = c28655q2.m87157i(c10839b);
        Object objM87133R8 = c28655q2.m87133R();
        if (zM87157i6 || objM87133R8 == c28676v0) {
            objM87133R8 = new C22040d(c10839b, 3);
            c28655q2.m87172p0(objM87133R8);
        }
        AbstractC14892a.m42984g(interfaceC17819dM63031L, function2, (Function1) objM87133R8, null, c28655q2, 0, 8);
        c28655q2.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: renamed from: L */
    private static final InterfaceC17819d m63031L(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC17819d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m63032M(C21060a c21060a, InterfaceC11265a it) {
        AbstractC22676k.m65750j(it, "it");
        c21060a.m58911l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m63033N(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final InterfaceC2155a m63034O(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2155a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m63035P(C3701a c3701a, AbstractC37687a it) {
        AbstractC22676k.m65750j(it, "it");
        c3701a.m11526q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m63036Q(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m63037R(InterfaceC4339a interfaceC4339a, C10839b c10839b, C12982q it, Composer composer, int i13) {
        C28714e c28714eM87345a;
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1509148315);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60668X(c38266c, null, new k(c21647aM114690r), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27418e.class), null, null);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        final C27418e c27418e = (C27418e) ((AbstractC1637w1) objM87133R);
        InterfaceC13058l viewState = c27418e.getViewState();
        C28735y c28735y = new C28735y(true, false, null, false, null, 30, null);
        int i14 = C28735y.f116302f;
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, c28735y, null, c28655q, i14 << 3, 2);
        C28712d c28712dM87471c = m63038S(interfaceC28601c1M87260n).getDisplaying();
        Integer numValueOf = (c28712dM87471c == null || (c28714eM87345a = c28712dM87471c.getEducationType()) == null) ? null : Integer.valueOf(c28714eM87345a.getId());
        boolean zM87157i = c28655q.m87157i(c27418e);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new c(c27418e, null);
            c28655q.m87172p0(objM87133R2);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        C28735y c28735yM63038S = m63038S(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(c27418e);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            final int i15 = 0;
            objM87133R3 = new InterfaceC4339a() { // from class: jx2.e
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return AbstractC22042f.m63039T(c27418e);
                        default:
                            return AbstractC22042f.m63040U(c27418e);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(c27418e);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            final int i16 = 1;
            objM87133R4 = new InterfaceC4339a() { // from class: jx2.e
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            return AbstractC22042f.m63039T(c27418e);
                        default:
                            return AbstractC22042f.m63040U(c27418e);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
        Object objM87133R5 = c28655q.m87133R();
        if (objM87133R5 == c28676v0) {
            objM87133R5 = new C21875f(12);
            c28655q.m87172p0(objM87133R5);
        }
        Function1 function1 = (Function1) objM87133R5;
        boolean zM87153g2 = c28655q.m87153g(numValueOf) | c28655q.m87157i(c27418e) | c28655q.m87157i(c10839b);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87153g2 || objM87133R6 == c28676v0) {
            objM87133R6 = new C21930h(numValueOf, c27418e, c10839b, 1);
            c28655q.m87172p0(objM87133R6);
        }
        Function1 function2 = (Function1) objM87133R6;
        Object objM87133R7 = c28655q.m87133R();
        if (objM87133R7 == c28676v0) {
            objM87133R7 = new C21875f(13);
            c28655q.m87172p0(objM87133R7);
        }
        Function1 function3 = (Function1) objM87133R7;
        Object objM87133R8 = c28655q.m87133R();
        if (objM87133R8 == c28676v0) {
            objM87133R8 = new C19054d(27);
            c28655q.m87172p0(objM87133R8);
        }
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R8;
        Object objM87133R9 = c28655q.m87133R();
        if (objM87133R9 == c28676v0) {
            objM87133R9 = new C21875f(14);
            c28655q.m87172p0(objM87133R9);
        }
        AbstractC28734x.m87404Q(c28735yM63038S, false, interfaceC4339a2, interfaceC4339a3, interfaceC4339a, function1, function2, function3, interfaceC4351m, null, false, false, false, (Function1) objM87133R9, c28655q, i14 | 113442864, 3072, 7680);
        return c23454a0;
    }

    /* JADX INFO: renamed from: S */
    private static final C28735y m63038S(InterfaceC28670t2 interfaceC28670t2) {
        return (C28735y) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m63039T(C27418e c27418e) {
        c27418e.m82822q(AbstractC27417d.e.f110424a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m63040U(C27418e c27418e) {
        c27418e.m82822q(AbstractC27417d.f.f110425a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m63041V(C28714e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m63042W(Integer num, C27418e c27418e, C10839b c10839b, C28714e c28714e) {
        AbstractC22676k.m65750j(c28714e, "<unused var>");
        if (num != null) {
            c27418e.m82822q(new AbstractC27417d.b(num.intValue()));
            c10839b.m28564c(AbstractC10840c.g.f33264a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m63043X(EnumC28717g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m63044Y(String str, String str2) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(str2, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m63045Z(EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m63047a0(C41178b c41178b, C10839b c10839b, C12982q backStackEntry, Composer composer, int i13) {
        Object objValueOf;
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a != null) {
                objValueOf = bundleM36479a.getString("campaignId");
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("campaignId"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument campaignId is missing or is of wrong type");
        }
        int iIntValue = ((Integer) objValueOf).intValue();
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1509148315);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60668X(c38266c, null, new l(c21647aM114690r), c22673i0.getOrCreateKotlinClass(C30761a.class), null, null);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        C30761a c30761a = (C30761a) ((AbstractC1637w1) objM87133R);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c30761a.getViewState(), c28655q, 0);
        boolean zM87157i = c28655q.m87157i(c41178b) | c28655q.m87149e(iIntValue) | c28655q.m87157i(c30761a);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new d(c41178b, iIntValue, c30761a, null);
            c28655q.m87172p0(objM87133R2);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        InterfaceC29603f interfaceC29603fM63049b0 = m63049b0(interfaceC28601c1M87261o);
        InterfaceC13058l interfaceC13058lM94507n = c30761a.getEffects();
        boolean zM87157i2 = c28655q.m87157i(c30761a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C19962a(c30761a, 5);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(c10839b);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            objM87133R4 = new C22040d(c10839b, 0);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC28462h.m86328M(interfaceC29603fM63049b0, interfaceC13058lM94507n, function1, (Function1) objM87133R4, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: b0 */
    private static final InterfaceC29603f m63049b0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC29603f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m63051c0(C30761a c30761a, AbstractC24796a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        c30761a.m94508r(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m63053d0(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    private static final C23454a0 m63055e0(C12974m navArgument) {
        AbstractC22676k.m65750j(navArgument, "$this$navArgument");
        navArgument.m36462b(AbstractC12958g1.f44757b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m63057f0(C10839b c10839b, C12982q backStackEntry, Composer composer, int i13) {
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Object objValueOf = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a != null) {
                objValueOf = bundleM36479a.getString("campaignId");
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("campaignId"));
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument campaignId is missing or is of wrong type");
        }
        int iIntValue = ((Integer) objValueOf).intValue();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c10839b);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C22040d(c10839b, 1);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC14879a.m42935q(iIntValue, (Function1) objM87133R, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m63059g0(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m63061h0(C10839b c10839b, C12982q backStackEntry, Composer composer, int i13) {
        Object objValueOf;
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a != null) {
                objValueOf = bundleM36479a.getString("campaignId");
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("campaignId"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument campaignId is missing or is of wrong type");
        }
        int iIntValue = ((Integer) objValueOf).intValue();
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1509148315);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60668X(c38266c, null, new m(c21647aM114690r), c22673i0.getOrCreateKotlinClass(C36560a.class), null, null);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        C36560a c36560a = (C36560a) ((AbstractC1637w1) objM87133R);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c36560a.getViewState(), c28655q, 0);
        boolean zM87157i = c28655q.m87157i(c36560a) | c28655q.m87149e(iIntValue);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new e(c36560a, iIntValue, null);
            c28655q.m87172p0(objM87133R2);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        InterfaceC35372b interfaceC35372bM63063i0 = m63063i0(interfaceC28601c1M87261o);
        boolean zM87157i2 = c28655q.m87157i(c36560a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C19962a(c36560a, 11);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(c10839b);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            objM87133R4 = new C22040d(c10839b, 7);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC35371a.m112246k(interfaceC35372bM63063i0, function1, (Function1) objM87133R4, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: i0 */
    private static final InterfaceC35372b m63063i0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC35372b) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m63065j0(C36560a c36560a, AbstractC31904a it) {
        AbstractC22676k.m65750j(it, "it");
        c36560a.m117287q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m63067k0(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m63069l0(C10839b c10839b, C12982q backStackEntry, Composer composer, int i13) {
        Object objValueOf;
        String string;
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a != null) {
                objValueOf = bundleM36479a.getString("campaignId");
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("campaignId"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument campaignId is missing or is of wrong type");
        }
        int iIntValue = ((Integer) objValueOf).intValue();
        Bundle bundleM36479a3 = backStackEntry.m36479a();
        Integer numM125932Q = (bundleM36479a3 == null || (string = bundleM36479a3.getString("sessionId")) == null) ? null : AbstractC39421y.m125932Q(string);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1509148315);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60668X(c38266c, null, new n(c21647aM114690r), c22673i0.getOrCreateKotlinClass(C24803a.class), null, null);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        C24803a c24803a = (C24803a) ((AbstractC1637w1) objM87133R);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c24803a.getViewState(), c28655q, 0);
        boolean zM87157i = c28655q.m87157i(c24803a) | c28655q.m87149e(iIntValue) | c28655q.m87153g(numM125932Q);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new f(c24803a, iIntValue, numM125932Q, null);
            c28655q.m87172p0(objM87133R2);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        InterfaceC22898g interfaceC22898gM63071m0 = m63071m0(interfaceC28601c1M87261o);
        boolean zM87157i2 = c28655q.m87157i(c24803a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C19962a(c24803a, 6);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(c10839b);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            objM87133R4 = new C22040d(c10839b, 2);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC22896e.m66564i(interfaceC22898gM63071m0, function1, (Function1) objM87133R4, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: m0 */
    private static final InterfaceC22898g m63071m0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC22898g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m63073n0(C24803a c24803a, AbstractC17810a it) {
        AbstractC22676k.m65750j(it, "it");
        c24803a.m72714o(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m63075o0(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m63077p0(C10839b c10839b, C12982q backStackEntry, Composer composer, int i13) {
        Object objValueOf;
        String string;
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a != null) {
                objValueOf = bundleM36479a.getString("campaignId");
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("campaignId"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument campaignId is missing or is of wrong type");
        }
        int iIntValue = ((Integer) objValueOf).intValue();
        Bundle bundleM36479a3 = backStackEntry.m36479a();
        Integer numM125932Q = (bundleM36479a3 == null || (string = bundleM36479a3.getString("sessionId")) == null) ? null : AbstractC39421y.m125932Q(string);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1509148315);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60668X(c38266c, null, new o(c21647aM114690r), c22673i0.getOrCreateKotlinClass(C35386a.class), null, null);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        C35386a c35386a = (C35386a) ((AbstractC1637w1) objM87133R);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c35386a.getViewState(), c28655q, 0);
        boolean zM87157i = c28655q.m87157i(c35386a) | c28655q.m87149e(iIntValue) | c28655q.m87153g(numM125932Q);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new g(c35386a, iIntValue, numM125932Q, null);
            c28655q.m87172p0(objM87133R2);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        AbstractC34268a abstractC34268aM63079q0 = m63079q0(interfaceC28601c1M87261o);
        boolean zM87157i2 = c28655q.m87157i(c35386a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C19962a(c35386a, 9);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(c10839b);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            objM87133R4 = new C22040d(c10839b, 5);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC31916e.m99337u(abstractC34268aM63079q0, false, function1, (Function1) objM87133R4, c28655q, 0, 2);
        return c23454a0;
    }

    /* JADX INFO: renamed from: q0 */
    private static final AbstractC34268a m63079q0(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC34268a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m63081r0(C35386a c35386a, AbstractC27299a it) {
        AbstractC22676k.m65750j(it, "it");
        c35386a.m112316n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m63083s0(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m63085t0(C10839b c10839b, C12982q backStackEntry, Composer composer, int i13) {
        Object objValueOf;
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a != null) {
                objValueOf = bundleM36479a.getString("campaignFilter");
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("campaignFilter"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument campaignFilter is missing or is of wrong type");
        }
        String str = (String) objValueOf;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87152f0(1509148315);
        C26669a c26669a = C29155a.f118017b;
        if (c26669a == null) {
            throw new IllegalStateException("KoinApplication has not been started");
        }
        C38266c c38266c = c26669a.f106046a.f159364d;
        C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, 1509148620, c28655q, false, -3686552);
        boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = AbstractC21598x.m60668X(c38266c, null, new p(c21647aM114690r), c22673i0.getOrCreateKotlinClass(C2174a.class), null, null);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        C2174a c2174a = (C2174a) ((AbstractC1637w1) objM87133R);
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c2174a.getViewState(), c28655q, 0);
        boolean zM87157i = c28655q.m87157i(c2174a) | c28655q.m87153g(str);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new h(c2174a, str, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, str);
        InterfaceC41233f interfaceC41233fM63087u0 = m63087u0(interfaceC28601c1M87261o);
        boolean zM87157i2 = c28655q.m87157i(c2174a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new C19962a(c2174a, 10);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function1 = (Function1) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(c10839b);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            objM87133R4 = new C22040d(c10839b, 6);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC41231d.m133938q(interfaceC41233fM63087u0, function1, (Function1) objM87133R4, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u0 */
    private static final InterfaceC41233f m63087u0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC41233f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m63089v0(C2174a c2174a, AbstractC37698a it) {
        AbstractC22676k.m65750j(it, "it");
        c2174a.m6852q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m63091w0(C10839b c10839b, AbstractC10840c it) {
        AbstractC22676k.m65750j(it, "it");
        c10839b.m28564c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m63093x0(AbstractC10838a abstractC10838a, C12991u0 c12991u0, C10839b c10839b, C41178b c41178b, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m63027H(abstractC10838a, c12991u0, c10839b, c41178b, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
