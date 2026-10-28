package kd1;

import android.content.Context;
import androidx.compose.p018ui.graphics.painter.ColorPainter;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bh.C3238a;
import bh.InterfaceC3242e;
import bp0.C3526n;
import c93.InterfaceC4351m;
import ch.AbstractC4585f;
import ch.AbstractC4590k;
import ch.AbstractC4601v;
import ch.C4591l;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Success;
import j02.C21174w;
import ji0.C21714b;
import l83.C23454a0;
import mh.C25540h;
import mh.C25542j;
import p088dc.AbstractC11895b;
import p092dh.C12032s;
import p208i2.C17919x;
import p331n2.AbstractC26165a;
import p341nh.C26711e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.InterfaceC28620h0;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: kd1.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u000e\u001a\u00020\r*\u00020\u00012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"", "Lkd1/o;", "k", "(I)Lkd1/o;", "", "l", "(Ljava/lang/String;)Lkd1/o;", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Success;", "Ll83/a0;", "onSuccess", "Lmh/h;", "builder", "Ln2/a;", "i", "(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;", "Lkd1/o$c;", "source", "Lcoil/compose/AsyncImagePainter;", "g", "(Lkd1/o$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "", "f", "(Lkd1/o;)Z", "Lp1/t1;", "a", "Lp1/t1;", "e", "()Lp1/t1;", "LocalUseSoftwareBitmaps", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22404p {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f87647a = new C28596b0(new C21174w(16));

    /* JADX INFO: renamed from: kd1.p$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.util.ImageSourceKt$imagePainterFromImageRequestBuilder$2$1", m100430f = "ImageSource.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f87648w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC4585f f87649x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22401m f87650y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Object f87651z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4585f abstractC4585f, C22401m c22401m, Object obj, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f87649x = abstractC4585f;
            this.f87650y = c22401m;
            this.f87651z = obj;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f87649x, this.f87650y, this.f87651z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f87648w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC4585f abstractC4585f = this.f87649x;
            if ((abstractC4585f instanceof AsyncImagePainter$State$Success) || (abstractC4585f instanceof AsyncImagePainter$State$Error)) {
                this.f87650y.m64480b(this.f87651z);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kd1.p$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"kd1/p$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C22401m f87652a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f87653b;

        public b(C22401m c22401m, Object obj) {
            this.f87652a = c22401m;
            this.f87653b = obj;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f87652a.m64483f(this.f87653b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m64495d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC28669t1 m64496e() {
        return f87647a;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m64497f(AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(abstractC22403o, "<this>");
        return (abstractC22403o instanceof AbstractC22403o.c) || (abstractC22403o instanceof AbstractC22403o.a);
    }

    /* JADX INFO: renamed from: g */
    private static final AsyncImagePainter m64498g(AbstractC22403o.c cVar, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        if ((i14 & 4) != 0) {
            function2 = null;
        }
        C28655q c28655q = (C28655q) composer;
        C22401m c22401m = (C22401m) c28655q.m87161k(AbstractC22402n.m64486c());
        boolean zBooleanValue = ((Boolean) c28655q.m87161k(f87647a)).booleanValue();
        C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
        C25540h c25540h = new C25540h((Context) c28655q.m87161k(c28674u2));
        c25540h.f100079c = cVar.getData();
        c25540h.f100094r = Integer.valueOf(cVar.getPlaceholder());
        c25540h.f100095s = Integer.valueOf(cVar.getError());
        c25540h.f100096t = Integer.valueOf(cVar.getFallback());
        c25540h.f100084h = new C12032s();
        if (zBooleanValue) {
            c25540h.f100090n = Boolean.FALSE;
        }
        function1.invoke(c25540h);
        C25542j c25542jM75117a = c25540h.m75117a();
        InterfaceC3242e interfaceC3242eM9378a = C3238a.m9378a((Context) c28655q.m87161k(c28674u2));
        c28655q.m87152f0(2140758544);
        C4591l c4591l = new C4591l(c25542jM75117a, AbstractC4590k.f18473b, interfaceC3242eM9378a);
        C26711e c26711e = AbstractC4601v.f18506b;
        AsyncImagePainter asyncImagePainterM14259b = AbstractC4590k.m14259b(c4591l, AsyncImagePainter.f20210T, AbstractC4601v.m14263a(function2, null), C39102j.f168200b, c28655q);
        c28655q.m87173q(false);
        if (c22401m == null || cVar.getData() == null) {
            c28655q.m87150e0(-1240599434);
            c28655q.m87173q(false);
            return asyncImagePainterM14259b;
        }
        c28655q.m87150e0(-1241194293);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new Object();
            c28655q.m87172p0(objM87133R);
        }
        boolean zM87157i = c28655q.m87157i(c22401m) | c28655q.m87157i(objM87133R);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C3526n(22, c22401m, objM87133R);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87251e(objM87133R, (Function1) objM87133R2, c28655q);
        AbstractC4585f abstractC4585f = (AbstractC4585f) asyncImagePainterM14259b.f20223Q.getValue();
        boolean zM87157i2 = c28655q.m87157i(abstractC4585f) | c28655q.m87157i(c22401m) | c28655q.m87157i(objM87133R);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = new a(abstractC4585f, c22401m, objM87133R, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, abstractC4585f);
        c28655q.m87173q(false);
        return asyncImagePainterM14259b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC28620h0 m64499h(C22401m c22401m, Object obj, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        c22401m.m64482d(obj);
        return new b(c22401m, obj);
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC26165a m64500i(AbstractC22403o abstractC22403o, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(abstractC22403o, "<this>");
        if ((i14 & 1) != 0) {
            function1 = null;
        }
        Function1 function3 = function1;
        int i15 = i14 & 2;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (i15 != 0) {
            C28655q c28655q = (C28655q) composer;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C21714b(24);
                c28655q.m87172p0(objM87133R);
            }
            function2 = (Function1) objM87133R;
        }
        Function1 function4 = function2;
        if (abstractC22403o instanceof AbstractC22403o.c) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1996222775);
            AsyncImagePainter asyncImagePainterM64498g = m64498g((AbstractC22403o.c) abstractC22403o, function4, function3, c28655q2, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & 896), 0);
            c28655q2.m87173q(false);
            return asyncImagePainterM64498g;
        }
        if (abstractC22403o instanceof AbstractC22403o.a) {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-1996219836);
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(((AbstractC22403o.a) abstractC22403o).getId(), c28655q3, 0);
            c28655q3.m87173q(false);
            return abstractC26165aM88500I;
        }
        if (!abstractC22403o.equals(AbstractC22403o.b.f87641b)) {
            throw AbstractC11895b.m32003v(-1996223837, (C28655q) composer, false);
        }
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87150e0(-1753172950);
        Object objM87133R2 = c28655q4.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new ColorPainter(C17919x.f69636m);
            c28655q4.m87172p0(objM87133R2);
        }
        ColorPainter colorPainter = (ColorPainter) objM87133R2;
        c28655q4.m87173q(false);
        return colorPainter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m64501j(C25540h c25540h) {
        AbstractC22676k.m65750j(c25540h, "<this>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC22403o m64502k(int i13) {
        return new AbstractC22403o.a(i13);
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC22403o m64503l(String str) {
        return new AbstractC22403o.c(str, 0, 0, 0, 14, null);
    }
}
