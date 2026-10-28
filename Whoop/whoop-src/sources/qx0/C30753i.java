package qx0;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import hf1.InterfaceC17234a;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import lf1.C23992b;
import lf1.C23993c;
import lf1.C23994d;
import lf1.C23995e;
import lf1.C23998h;
import lf1.C24000j;
import lf1.C24001k;
import lf1.C24002l;
import lf1.C24005o;
import lf1.C24006p;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qx0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lqx0/i;", "Landroidx/lifecycle/w1;", "Lhf1/b;", "experimentsChecker", "<init>", "(Lhf1/b;)V", "", "experimentName", "", "q", "(Ljava/lang/String;)Z", "Ll83/a0;", "o", "()V", "r", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lhf1/b;", "Lec3/p1;", "Lqx0/h;", "x", "Lec3/p1;", "_uiState", "Lec3/f2;", "y", "Lec3/f2;", "p", "()Lec3/f2;", "uiState", "", "Lhf1/a;", "z", "Ljava/util/List;", "experiments", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30753i extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13075p1 _uiState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13037f2 uiState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final List<InterfaceC17234a> experiments;

    /* JADX INFO: renamed from: qx0.i$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.debug.experiments.ExperimentsDebugViewModel$fetchExperiments$1", m100430f = "ExperimentsDebugViewModel.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f126599E;

        /* JADX INFO: renamed from: F */
        Object f126600F;

        /* JADX INFO: renamed from: G */
        Object f126601G;

        /* JADX INFO: renamed from: H */
        Object f126602H;

        /* JADX INFO: renamed from: I */
        int f126603I;

        /* JADX INFO: renamed from: J */
        int f126604J;

        /* JADX INFO: renamed from: K */
        int f126605K;

        /* JADX INFO: renamed from: L */
        int f126606L;

        /* JADX INFO: renamed from: w */
        Object f126608w;

        /* JADX INFO: renamed from: x */
        Object f126609x;

        /* JADX INFO: renamed from: y */
        Object f126610y;

        /* JADX INFO: renamed from: z */
        Object f126611z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30753i.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0076  */
        /* JADX WARN: Code duplicated, block: B:13:0x00b2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x00b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00b3 -> B:15:0x00b5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qx0.C30753i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qx0.i$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.debug.experiments.ExperimentsDebugViewModel$resetCache$1", m100430f = "ExperimentsDebugViewModel.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f126612w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30753i.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126612w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ((C13045h2) C30753i.this._uiState).m36570j(AbstractC30752h.b.f126593a);
                InterfaceC17235b interfaceC17235b = C30753i.this.experimentsChecker;
                this.f126612w = 1;
                if (interfaceC17235b.mo48743b(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ((C13045h2) C30753i.this._uiState).m36570j(AbstractC30752h.a.f126592a);
            return C23454a0.f92919a;
        }
    }

    public C30753i(InterfaceC17235b experimentsChecker) {
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        this.experimentsChecker = experimentsChecker;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(AbstractC30752h.b.f126593a);
        this._uiState = c13045h2M36593c;
        this.uiState = AbstractC13091v.m36598h(c13045h2M36593c);
        this.experiments = AbstractC37056f.m118959K(new C23993c(null, null, null, null, 15, null), new C23998h(null, null, null, null, 15, null), new C23994d(null, null, null, null, 15, null), new C23995e(null, null, null, null, 15, null), new C24000j(null, null, null, null, 15, null), new C24001k(null, null, null, null, 15, null), new C23992b(null, null, null, null, 15, null), new C24005o(null, null, null, null, 15, null), new C24006p(null, null, null, null, 15, null), new C24002l(null, null, null, null, 15, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final boolean m94478q(String experimentName) {
        return AbstractC22676k.m65745e(experimentName, "exercise-details-v2-experiment") || AbstractC22676k.m65745e(experimentName, "simpler-strength");
    }

    /* JADX INFO: renamed from: o */
    public final void m94479o() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13037f2 getUiState() {
        return this.uiState;
    }

    /* JADX INFO: renamed from: r */
    public final void m94481r() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }
}
