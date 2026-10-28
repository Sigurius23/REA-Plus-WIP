package j02;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import l83.C23454a0;
import nf3.C26669a;
import p114eb.AbstractC12964i1;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf3.C29155a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import xf3.C38266c;

/* JADX INFO: renamed from: j02.a1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "tagPrefix", "Lj02/l0;", "navigationReporter", "Leb/u0;", "a", "(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21130a1 {

    /* JADX INFO: renamed from: j02.a1$a */
    @InterfaceC32271e(m100429c = "com.whoop.navigation.WhoopNavControllerKt$rememberWhoopNavController$1$1", m100430f = "WhoopNavController.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f80191w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21153l0 f80192x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12991u0 f80193y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f80194z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21153l0 interfaceC21153l0, C12991u0 c12991u0, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f80192x = interfaceC21153l0;
            this.f80193y = c12991u0;
            this.f80194z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f80192x, this.f80193y, this.f80194z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f80191w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f80192x.mo59007i(this.f80193y, this.f80194z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C12991u0 m58963a(String tagPrefix, InterfaceC21153l0 interfaceC21153l0, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(tagPrefix, "tagPrefix");
        int i15 = i14 & 2;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (i15 != 0) {
            C28655q c28655q = (C28655q) composer;
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
                objM87133R = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21153l0.class), null);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            interfaceC21153l0 = (InterfaceC21153l0) objM87133R;
        }
        C12991u0 c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], composer);
        boolean z4 = (((i13 & 112) ^ 48) > 32 && ((C28655q) composer).m87157i(interfaceC21153l0)) || (i13 & 48) == 32;
        C28655q c28655q2 = (C28655q) composer;
        boolean zM87157i = z4 | c28655q2.m87157i(c12991u0M44439S) | ((((i13 & 14) ^ 6) > 4 && c28655q2.m87153g(tagPrefix)) || (i13 & 6) == 4);
        Object objM87133R2 = c28655q2.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new a(interfaceC21153l0, c12991u0M44439S, tagPrefix, null);
            c28655q2.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
        return c12991u0M44439S;
    }
}
