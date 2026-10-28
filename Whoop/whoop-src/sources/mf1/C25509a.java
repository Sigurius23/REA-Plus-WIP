package mf1;

import ae3.C0801i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import md0.C25447b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: renamed from: mf1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m65681d2 = {"Lmf1/a;", "Lud3/g0;", "Lhf1/b;", "experimentsChecker", "<init>", "(Lhf1/b;)V", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lhf1/b;", "x", "a", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25509a implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: mf1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.interceptor.ExperimentsInterceptor$intercept$experiments$1", m100430f = "ExperimentsInterceptor.kt", m100431l = {14}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "", "<anonymous>", "(Lbc3/c0;)Ljava/util/Map;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99898w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25509a.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Map<String, String>> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99898w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC17235b interfaceC17235b = C25509a.this.experimentsChecker;
            this.f99898w = 1;
            Object objMo48744c = interfaceC17235b.mo48744c(this);
            return objMo48744c == enumC31071a ? enumC31071a : objMo48744c;
        }
    }

    public C25509a(InterfaceC17235b experimentsChecker) {
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        this.experimentsChecker = experimentsChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m74997c(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        String strM74110N0 = AbstractC25265s.m74110N0(((Map) AbstractC3006f0.m8699E(C30064k.f122676w, new b(null))).entrySet(), ", ", null, null, new C25447b(7), 30);
        C0801i c0801i = (C0801i) chain;
        C34830n0 c34830n0M109907b = c0801i.f2955e.m109907b();
        c34830n0M109907b.m109900a("X-WHOOP-Experiment-Properties", strM74110N0);
        return c0801i.m1939b(new C34832o0(c34830n0M109907b));
    }
}
