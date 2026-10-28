package x81;

import a91.C0586a;
import a91.InterfaceC0587b;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2889d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import dp0.AbstractC12252h;
import dp0.C12253i;
import dp0.InterfaceC12251g;
import fy1.AbstractC14877m;
import fy1.InterfaceC14876l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import of3.InterfaceC27903a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.AbstractC42793j;
import p745y81.C39336i;
import p747z81.AbstractC42794f;
import p747z81.C40182b;
import p747z81.C40185e;
import p747z81.Function1;
import pf3.C29155a;
import q83.AbstractC30060g;
import qf1.AbstractC30320a;
import v71.C35766g;
import vf3.InterfaceC35951a;
import we1.C37224h;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: x81.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\r8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012\"\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlag", "Lfy1/l;", "screenStateTracker", "Ldp0/g;", "globalCoachManager", "La91/b;", "systemBarAppearanceManager", "Lkotlin/Function0;", "Ll83/a0;", "content", "n", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lp1/t1;", "Ly81/i;", "a", "Lp1/t1;", "s", "()Lp1/t1;", "LocalWhoopColors", "Lz81/b;", "b", "r", "LocalWhoopBorders", "Lb91/d;", "c", "t", "LocalWhoopFonts", "Lz81/e;", "d", "u", "LocalWhoopShadows", "e", "p", "LocalFeatureFlag", "f", "q", "LocalSystemBarAppearanceManager", "Lq2/a;", "g", "Lq2/a;", "v", "()Lq2/a;", "NoOpHapticFeedback", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38073e {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f163055a = new C28674u2(new C37224h(2));

    /* JADX INFO: renamed from: b */
    private static final AbstractC28669t1 f163056b = new C28674u2(new C37224h(3));

    /* JADX INFO: renamed from: c */
    private static final AbstractC28669t1 f163057c = new C28674u2(new C37224h(4));

    /* JADX INFO: renamed from: d */
    private static final AbstractC28669t1 f163058d = new C28674u2(new C37224h(5));

    /* JADX INFO: renamed from: e */
    private static final AbstractC28669t1 f163059e = new C28674u2(new C37224h(6));

    /* JADX INFO: renamed from: f */
    private static final AbstractC28669t1 f163060f = new C28674u2(new C37224h(7));

    /* JADX INFO: renamed from: g */
    private static final InterfaceC29805a f163061g = new b();

    /* JADX INFO: renamed from: x81.e$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0006\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"x81/e$a", "Lof3/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "a", "()Ljava/lang/Object;", "value", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC27903a {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final InterfaceC23462h value = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C42629a(this, null, null));

        /* JADX INFO: renamed from: x81.e$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42629a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC27903a f163063w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC35951a f163064x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC4339a f163065y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42629a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
                super(0);
                this.f163063w = interfaceC27903a;
                this.f163064x = interfaceC35951a;
                this.f163065y = interfaceC4339a;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
            @Override // c93.InterfaceC4339a
            public final FeatureFlagChecker invoke() {
                InterfaceC27903a interfaceC27903a = this.f163063w;
                InterfaceC35951a interfaceC35951a = this.f163064x;
                return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f163065y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        /* JADX INFO: renamed from: a */
        public final FeatureFlagChecker m121975a() {
            return this.value.getValue();
        }

        @Override // of3.InterfaceC27903a
        public /* bridge */ C26669a getKoin() {
            return AbstractC34132o.m107856A(this);
        }
    }

    /* JADX INFO: renamed from: x81.e$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"x81/e$b", "Lq2/a;", "Ltx/f;", "hapticFeedbackType", "Ll83/a0;", "a", "(I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC29805a {
        @Override // p411q2.InterfaceC29805a
        /* JADX INFO: renamed from: a */
        public void mo7428a(int hapticFeedbackType) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final FeatureFlagChecker m121960h() {
        return (FeatureFlagChecker) new a().m121975a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC0587b m121961i() {
        return C0586a.f2084a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C40182b m121962j() {
        return new C40182b(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C39336i m121963k() {
        return new C39336i(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, -1, -1, -1, 8191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C2889d m121964l() {
        return new C2889d(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C40185e m121965m() {
        return new C40185e(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX INFO: renamed from: n */
    public static final void m121966n(FeatureFlagChecker featureFlagChecker, InterfaceC14876l interfaceC14876l, InterfaceC12251g interfaceC12251g, InterfaceC0587b interfaceC0587b, InterfaceC4351m content, Composer composer, int i13, int i14) {
        FeatureFlagChecker featureFlagChecker2;
        int i15;
        InterfaceC14876l interfaceC14876l2;
        InterfaceC12251g interfaceC12251g2;
        Object objM122604c;
        C37247a c37247a;
        Object objM122604c2;
        C37247a c37247a2;
        int i16;
        InterfaceC0587b interfaceC0587b2 = interfaceC0587b;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(669573278);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                featureFlagChecker2 = featureFlagChecker;
                int i17 = c28655q.m87157i(featureFlagChecker2) ? 4 : 2;
                i15 = i17 | i13;
            } else {
                featureFlagChecker2 = featureFlagChecker;
            }
            i15 = i17 | i13;
        } else {
            featureFlagChecker2 = featureFlagChecker;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                interfaceC14876l2 = interfaceC14876l;
                int i18 = c28655q.m87157i(interfaceC14876l2) ? 32 : 16;
                i15 |= i18;
            } else {
                interfaceC14876l2 = interfaceC14876l;
            }
            i15 |= i18;
        } else {
            interfaceC14876l2 = interfaceC14876l;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC12251g2 = interfaceC12251g;
                int i19 = c28655q.m87157i(interfaceC12251g2) ? 256 : 128;
                i15 |= i19;
            } else {
                interfaceC12251g2 = interfaceC12251g;
            }
            i15 |= i19;
        } else {
            interfaceC12251g2 = interfaceC12251g;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0 ? c28655q.m87153g(interfaceC0587b2) : c28655q.m87157i(interfaceC0587b2)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i16;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(content) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                int i24 = i14 & 1;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    c28655q.m87152f0(-909571169);
                    C26669a c26669a = C29155a.f118017b;
                    if (c26669a == null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    C38266c c38266c = c26669a.f106046a.f159364d;
                    c28655q.m87152f0(-3686552);
                    boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    featureFlagChecker2 = (FeatureFlagChecker) objM87133R;
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    c28655q.m87152f0(-909571169);
                    C26669a c26669a2 = C29155a.f118017b;
                    if (c26669a2 == null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    C38266c c38266c2 = c26669a2.f106046a.f159364d;
                    c28655q.m87152f0(-3686552);
                    boolean zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = c38266c2.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14876l.class), null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    interfaceC14876l2 = (InterfaceC14876l) objM87133R2;
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    Object obj = C12253i.f40998a;
                    int i25 = C12253i.f41002e << 6;
                    C26669a c26669a3 = C29155a.f118017b;
                    C38266c c38266c3 = (c26669a3 == null || (c37247a2 = c26669a3.f106046a) == null) ? null : c37247a2.f159364d;
                    boolean zM87153g3 = c28655q.m87153g(null) | ((((i25 & 7168) ^ 3072) > 2048 && c28655q.m87153g(null)) || (i25 & 3072) == 2048) | ((((i25 & 896) ^ 384) > 256 && c28655q.m87153g(obj)) || (i25 & 384) == 256);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R3 == c28676v0) {
                        if (c38266c3 != null && (objM122604c2 = c38266c3.m122604c(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), null)) != null) {
                            obj = objM122604c2;
                        }
                        c28655q.m87172p0(obj);
                        objM87133R3 = obj;
                    }
                    interfaceC12251g2 = (InterfaceC12251g) objM87133R3;
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    Object obj2 = C0586a.f2084a;
                    C26669a c26669a4 = C29155a.f118017b;
                    C38266c c38266c4 = (c26669a4 == null || (c37247a = c26669a4.f106046a) == null) ? null : c37247a.f159364d;
                    boolean zM87153g4 = c28655q.m87153g(null) | c28655q.m87153g(null);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87153g4 || objM87133R4 == c28676v0) {
                        if (c38266c4 != null && (objM122604c = c38266c4.m122604c(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0587b.class), null)) != null) {
                            obj2 = objM122604c;
                        }
                        c28655q.m87172p0(obj2);
                        objM87133R4 = obj2;
                    }
                    interfaceC0587b2 = (InterfaceC0587b) objM87133R4;
                    i15 &= -7169;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 1) != 0) {
                    i15 &= -15;
                }
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            }
            c28655q.m87175r();
            C22677k0 c22677k0 = new C22677k0(10);
            c22677k0.m65760a(f163055a.mo86977a(AbstractC42793j.m125436c()));
            c22677k0.m65760a(f163057c.mo86977a(AbstractC2890e.m8450e()));
            c22677k0.m65760a(f163056b.mo86977a(Function1.m128938q()));
            c22677k0.m65760a(f163058d.mo86977a(AbstractC42794f.m128943c()));
            c22677k0.m65760a(f163059e.mo86977a(featureFlagChecker2));
            c22677k0.m65760a(AbstractC30320a.m92665c().mo86977a(featureFlagChecker2));
            c22677k0.m65760a(AbstractC14877m.m42918c().mo86977a(interfaceC14876l2));
            c22677k0.m65760a(AbstractC12252h.m34153c().mo86977a(interfaceC12251g2));
            c22677k0.m65760a(f163060f.mo86977a(interfaceC0587b2));
            c22677k0.m65764e(AbstractC38071c.m121947d());
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[arrayList.size()]), content, c28655q, ((i15 >> 9) & 112) | 8);
        } else {
            c28655q.m87138X();
        }
        InterfaceC12251g interfaceC12251g3 = interfaceC12251g2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35766g(featureFlagChecker2, interfaceC14876l2, interfaceC12251g3, interfaceC0587b2, content, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m121967o(FeatureFlagChecker featureFlagChecker, InterfaceC14876l interfaceC14876l, InterfaceC12251g interfaceC12251g, InterfaceC0587b interfaceC0587b, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m121966n(featureFlagChecker, interfaceC14876l, interfaceC12251g, interfaceC0587b, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final AbstractC28669t1 m121968p() {
        return f163059e;
    }

    /* JADX INFO: renamed from: q */
    public static final AbstractC28669t1 m121969q() {
        return f163060f;
    }

    /* JADX INFO: renamed from: r */
    public static final AbstractC28669t1 m121970r() {
        return f163056b;
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC28669t1 m121971s() {
        return f163055a;
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC28669t1 m121972t() {
        return f163057c;
    }

    /* JADX INFO: renamed from: u */
    public static final AbstractC28669t1 m121973u() {
        return f163058d;
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC29805a m121974v() {
        return f163061g;
    }
}
