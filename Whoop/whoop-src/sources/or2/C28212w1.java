package or2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.User;
import f93.InterfaceC14291c;
import j93.InterfaceC21493z;
import l83.C23454a0;
import l83.InterfaceC23457c;
import nf3.C26669a;
import od1.C27858u;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.C35953c;
import xf3.C38266c;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: or2.w1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lor2/w1;", "Lf93/c;", "", "", "Lof3/a;", "<init>", "()V", "thisRef", "Lj93/z;", "property", "a", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Integer;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C28212w1 implements InterfaceC14291c, InterfaceC27903a {

    /* JADX INFO: renamed from: w */
    public static final C28212w1 f113986w = new C28212w1();

    /* JADX INFO: renamed from: or2.w1$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.UserIdProvider$getValue$1", m100430f = "UserIdProvider.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113987w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC40205a f113988x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40205a interfaceC40205a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113988x = interfaceC40205a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f113988x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113987w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC40205a interfaceC40205a = this.f113988x;
                this.f113987w = 1;
                obj = interfaceC40205a.mo129089c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            User user = (User) obj;
            return new Integer(user != null ? user.getId() : 0);
        }
    }

    private C28212w1() {
    }

    @Override // f93.InterfaceC14291c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getValue(Object thisRef, InterfaceC21493z property) {
        int iM84056g;
        AbstractC22676k.m65750j(thisRef, "thisRef");
        AbstractC22676k.m65750j(property, "property");
        try {
            C38266c c38266c = getKoin().f106046a.f159364d;
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            if (((FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null)).isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE)) {
                iM84056g = ((Number) AbstractC3006f0.m8699E(C30064k.f122676w, new a((InterfaceC40205a) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), null))).intValue();
            } else {
                iM84056g = ((C27858u) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"))).m84056g();
            }
        } catch (Exception unused) {
            iM84056g = 0;
        }
        return Integer.valueOf(iM84056g);
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
