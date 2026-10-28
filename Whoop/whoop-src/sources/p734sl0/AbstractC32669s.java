package p734sl0;

import android.content.Context;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import ge3.AbstractC15751g;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m32.InterfaceC25005a;
import ml0.C25671c;
import nf3.C26669a;
import nl0.C26803e;
import or2.C28180m;
import p007a6.InterfaceC0422g;
import p095dp.AbstractC12240d;
import p138f6.C14132d;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import xf3.C38266c;
import xk0.C38423a;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sl0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u001b²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroid/content/Context;", "context", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lsl0/n0;", "screenArgs", "Lsl0/q;", "e", "(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lsl0/q;", "Lf6/d;", "", "a", "Lf6/d;", "PERMISSION_DISCLAIMER_KEY", "Lml0/c;", "navigationRouter", "Lz92/a;", "userInfoAccessor", "La6/g;", "Lf6/f;", "dataStore", "Lm32/a;", "permissionChecker", "Lxk0/a;", "analyticsHelper", "Lzr2/a;", "dateAndTimeProvider", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32669s {

    /* JADX INFO: renamed from: a */
    private static final C14132d f135536a = AbstractC15751g.m44441U("has-shown-permission-disclaimer");

    /* JADX INFO: renamed from: sl0.s$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f135537w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f135538x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f135539y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f135537w = c38266c;
            this.f135538x = interfaceC35951a;
            this.f135539y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ml0.c] */
        @Override // c93.InterfaceC4339a
        public final C25671c invoke() {
            return this.f135537w.m122602a(this.f135539y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25671c.class), this.f135538x);
        }
    }

    /* JADX INFO: renamed from: sl0.s$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f135540w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f135541x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f135542y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f135540w = c38266c;
            this.f135541x = interfaceC35951a;
            this.f135542y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, z92.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40205a invoke() {
            return this.f135540w.m122602a(this.f135542y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40205a.class), this.f135541x);
        }
    }

    /* JADX INFO: renamed from: sl0.s$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f135543w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f135544x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f135545y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f135543w = c38266c;
            this.f135544x = interfaceC35951a;
            this.f135545y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a6.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC0422g invoke() {
            return this.f135543w.m122602a(this.f135545y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), this.f135544x);
        }
    }

    /* JADX INFO: renamed from: sl0.s$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f135546w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f135547x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f135548y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f135546w = c38266c;
            this.f135547x = interfaceC35951a;
            this.f135548y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, m32.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25005a invoke() {
            return this.f135546w.m122602a(this.f135548y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25005a.class), this.f135547x);
        }
    }

    /* JADX INFO: renamed from: sl0.s$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f135549w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f135550x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f135551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f135549w = c38266c;
            this.f135550x = interfaceC35951a;
            this.f135551y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xk0.a] */
        @Override // c93.InterfaceC4339a
        public final C38423a invoke() {
            return this.f135549w.m122602a(this.f135551y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38423a.class), this.f135550x);
        }
    }

    /* JADX INFO: renamed from: sl0.s$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f135552w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f135553x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f135554y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f135552w = c38266c;
            this.f135553x = interfaceC35951a;
            this.f135554y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            return this.f135552w.m122602a(this.f135554y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), this.f135553x);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C32659q m102284e(Context context, FeatureFlagChecker featureFlagChecker, final C32645n0 screenArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        C35953c c35953c = new C35953c("COACH_WRAPPER_NAVIGATION_ROUTER");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(context);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C32683v0(context, 2);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        c28655q.m87152f0(1903845737);
        C29155a c29155a = C29155a.f118016a;
        C38266c c38266c = c29155a.m88599a().f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g = c28655q.m87153g(c35953c) | c28655q.m87153g(interfaceC4339a);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, c35953c, interfaceC4339a));
            c28655q.m87172p0(objM87133R2);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R2;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C38266c c38266c2 = c29155a.m88599a().f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g2 || objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c2, null, null));
            c28655q.m87172p0(objM87133R3);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R3;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C38266c c38266c3 = c29155a.m88599a().f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g3 || objM87133R4 == c28676v0) {
            objM87133R4 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c3, null, null));
            c28655q.m87172p0(objM87133R4);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h3 = (InterfaceC23462h) objM87133R4;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C38266c c38266c4 = c29155a.m88599a().f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g4 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87153g4 || objM87133R5 == c28676v0) {
            objM87133R5 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c4, null, null));
            c28655q.m87172p0(objM87133R5);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h4 = (InterfaceC23462h) objM87133R5;
        c28655q.m87173q(false);
        boolean zM87157i2 = c28655q.m87157i(screenArgs);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i2 || objM87133R6 == c28676v0) {
            final int i14 = 0;
            objM87133R6 = new InterfaceC4339a() { // from class: sl0.r
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return AbstractC32669s.m102290k(screenArgs);
                        default:
                            return AbstractC32669s.m102293n(screenArgs);
                    }
                }
            };
            c28655q.m87172p0(objM87133R6);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
        c28655q.m87152f0(1903845737);
        C38266c c38266c5 = c29155a.m88599a().f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g5 = c28655q.m87153g(null) | c28655q.m87153g(interfaceC4339a2);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87153g5 || objM87133R7 == c28676v0) {
            objM87133R7 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c5, null, interfaceC4339a2));
            c28655q.m87172p0(objM87133R7);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h5 = (InterfaceC23462h) objM87133R7;
        c28655q.m87173q(false);
        c28655q.m87152f0(1903845737);
        C38266c c38266c6 = c29155a.m88599a().f106046a.f159364d;
        c28655q.m87152f0(-3686552);
        boolean zM87153g6 = c28655q.m87153g(null) | c28655q.m87153g(null);
        Object objM87133R8 = c28655q.m87133R();
        if (zM87153g6 || objM87133R8 == c28676v0) {
            objM87133R8 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c6, null, null));
            c28655q.m87172p0(objM87133R8);
        }
        c28655q.m87173q(false);
        InterfaceC23462h interfaceC23462h6 = (InterfaceC23462h) objM87133R8;
        c28655q.m87173q(false);
        C26669a c26669aM34042H = AbstractC12240d.m34042H(c28655q);
        Object objM87133R9 = c28655q.m87133R();
        if (objM87133R9 == c28676v0) {
            final int i15 = 1;
            C32659q c32659q = new C32659q((C26803e) c26669aM34042H.f106046a.f159364d.m122602a(new InterfaceC4339a() { // from class: sl0.r
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return AbstractC32669s.m102290k(screenArgs);
                        default:
                            return AbstractC32669s.m102293n(screenArgs);
                    }
                }
            }, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26803e.class), null), m102286g(interfaceC23462h), m102291l(interfaceC23462h5), m102287h(interfaceC23462h2), m102288i(interfaceC23462h3), m102289j(interfaceC23462h4), featureFlagChecker, m102292m(interfaceC23462h6));
            c28655q.m87172p0(c32659q);
            objM87133R9 = c32659q;
        }
        return (C32659q) objM87133R9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C34911a m102285f(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: renamed from: g */
    private static final C25671c m102286g(InterfaceC23462h interfaceC23462h) {
        return (C25671c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: h */
    private static final InterfaceC40205a m102287h(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC40205a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: i */
    private static final InterfaceC0422g m102288i(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC0422g) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final InterfaceC25005a m102289j(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC25005a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C34911a m102290k(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0.getSourcePillar(), c32645n0.getSourceType(), c32645n0.getPresetQuestion(), c32645n0.getSourceId(), c32645n0.getSource());
    }

    /* JADX INFO: renamed from: l */
    private static final C38423a m102291l(InterfaceC23462h interfaceC23462h) {
        return (C38423a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: m */
    private static final InterfaceC41070a m102292m(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC41070a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C34911a m102293n(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0, new C28180m(null, 1, null));
    }
}
