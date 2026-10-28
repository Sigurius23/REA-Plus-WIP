package k03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import d03.AbstractC11447b;
import d71.C11757c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.AbstractC25260n;
import o03.AbstractC27356a;
import p031b9.AbstractC2875y;
import p138f6.AbstractC14134f;
import p335n6.AbstractC26391h;
import p335n6.C26396m;
import p335n6.InterfaceC26395l;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p395p6.AbstractC28880g0;
import p395p6.C28917s1;
import p395p6.InterfaceC28923u1;
import p477s2.AbstractC32072d;
import p505ts.AbstractC34132o;
import p545v6.C35714c;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39176h;
import p639y6.C39256h;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rs.AbstractC31780b;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.AbstractC35952b;
import x30.AbstractC37926s0;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: k03.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lk03/c;", "Lp6/g0;", "<init>", "()V", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Ln6/l;", "id", "l", "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;", "Ly6/h;", "E", "Ly6/h;", "A", "()Ly6/h;", "stateDefinition", "Lp6/u1;", "F", "Lp6/u1;", "g", "()Lp6/u1;", "sizeMode", "G", "a", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22098c extends AbstractC28880g0 {

    /* JADX INFO: renamed from: G */
    private static final a f85715G = new a(null);

    /* JADX INFO: renamed from: H */
    public static final int f85716H = 8;

    /* JADX INFO: renamed from: I */
    private static final long f85717I;

    /* JADX INFO: renamed from: J */
    private static final long f85718J;

    /* JADX INFO: renamed from: K */
    private static final long f85719K;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C39256h stateDefinition = C39256h.f168775a;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC28923u1 sizeMode = new C28917s1(AbstractC25260n.m74059b1(new C39176h[]{new C39176h(f85717I), new C39176h(f85718J), new C39176h(f85719K)}));

    /* JADX INFO: renamed from: k03.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lk03/c$a;", "", "<init>", "()V", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k03.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.dynamic.OverviewWidget", m100430f = "OverviewWidget.kt", m100431l = {70}, m100432m = "provideGlance", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f85722E;

        /* JADX INFO: renamed from: w */
        Object f85723w;

        /* JADX INFO: renamed from: x */
        Object f85724x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f85725y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f85725y = obj;
            this.f85722E |= Integer.MIN_VALUE;
            return C22098c.this.mo63263l(null, null, this);
        }
    }

    static {
        float f13 = 1;
        f85717I = AbstractC35952b.m114193a(90, f13);
        f85718J = AbstractC35952b.m114193a(160, f13);
        f85719K = AbstractC35952b.m114193a(270, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m63251B(C22098c c22098c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c22098c.m63256w(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private final void m63256w(Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-484092828);
        int i14 = i13 & 1;
        if (c28655q.m87135U(i14, i14 != 0)) {
            c28655q.m87152f0(-534706435);
            Object objM87161k = c28655q.m87161k(AbstractC26391h.m78102c());
            if (objM87161k == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            AbstractC14134f abstractC14134f = (AbstractC14134f) objM87161k;
            c28655q.m87173q(false);
            Integer num = (Integer) abstractC14134f.mo40227b(AbstractC15751g.m44423C("WIDGET_KEY_STRAP_BATTERY_PERCENT"));
            if (num != null) {
                c28655q.m87150e0(890953713);
                c28655q.m87173q(false);
                string = num + "%";
            } else {
                c28655q.m87150e0(-1356731207);
                string = ((Context) c28655q.m87161k(AbstractC26391h.m78100a())).getString(AbstractC11447b.f36719b);
                AbstractC22676k.m65747g(string);
                c28655q.m87173q(false);
            }
            String str = string;
            int iM82537d = AbstractC27356a.m82537d(num);
            long jM82536c = AbstractC27356a.m82536c(num);
            Float f13 = (Float) abstractC14134f.mo40227b(AbstractC15751g.m44471x("WIDGET_KEY_RECOVERY_PERCENT"));
            float fFloatValue = f13 != null ? f13.floatValue() : -1.0f;
            String string2 = (String) abstractC14134f.mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_SLEEP_PERCENT"));
            if (string2 == null) {
                c28655q.m87150e0(-1356717212);
                string2 = ((Context) c28655q.m87161k(AbstractC26391h.m78100a())).getString(AbstractC11447b.f36718a);
                AbstractC22676k.m65749i(string2, "getString(...)");
            } else {
                c28655q.m87150e0(-1356720002);
            }
            c28655q.m87173q(false);
            String str2 = string2;
            String string3 = (String) abstractC14134f.mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_STRAIN_PERCENT"));
            if (string3 == null) {
                c28655q.m87150e0(-1356712444);
                string3 = ((Context) c28655q.m87161k(AbstractC26391h.m78100a())).getString(AbstractC11447b.f36718a);
                AbstractC22676k.m65749i(string3, "getString(...)");
            } else {
                c28655q.m87150e0(-1356715265);
            }
            c28655q.m87173q(false);
            String str3 = string3;
            Boolean bool = (Boolean) abstractC14134f.mo40227b(AbstractC15751g.m44453f("WIDGET_KEY_IS_CALIBRATING"));
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(787713695, c28655q, new C22097b(fFloatValue, iM82537d, 0, jM82536c, str2, str3, str, bool != null ? bool.booleanValue() : false)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(this, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m63257x(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC31780b.m98680a(null, C35714c.f151948d, AbstractC37817c.m121344e(-773193731, c28655q, new C22097b(f13, i13, 1, j7, str, str2, str3, z4)), c28655q, 384, 1);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m63258y(float f13, String str, String str2, String str3, int i13, long j7, boolean z4, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            long j13 = ((C39176h) c28655q.m87161k(AbstractC26391h.m78101b())).f168415a;
            if (C39176h.m124785a(j13, f85717I)) {
                c28655q.m87150e0(-9830738);
                AbstractC22109n.m63313z(f13, str, str2, str3, i13, j7, z4, c28655q, 0);
                c28655q.m87173q(false);
            } else if (C39176h.m124785a(j13, f85718J)) {
                c28655q.m87150e0(-9826105);
                AbstractC22109n.m63312y(f13, str, str2, str3, i13, j7, z4, c28655q, 0);
                c28655q.m87173q(false);
            } else if (C39176h.m124785a(j13, f85719K)) {
                c28655q.m87150e0(-9821748);
                AbstractC22109n.m63272I(f13, str, str2, str3, i13, j7, z4, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-304349659);
                c28655q.m87173q(false);
            }
            AbstractC31780b.m98680a(AbstractC37926s0.m121474l(AbstractC32072d.m99703l(AbstractC32072d.m99705o(C26396m.f104850a, 180)), AbstractC27356a.m82534a((Context) c28655q.m87161k(AbstractC26391h.m78100a()))), null, C22096a.f85704a.m63250d(), c28655q, 384, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m63259z(C22098c c22098c, int i13, Composer composer, int i14) {
        c22098c.m63256w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: A, reason: from getter and merged with bridge method [inline-methods] */
    public C39256h getStateDefinition() {
        return this.stateDefinition;
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: g, reason: from getter */
    public InterfaceC28923u1 getSizeMode() {
        return this.sizeMode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: l */
    public Object mo63263l(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f85722E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f85722E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f85725y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f85722E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        C37816b c37816b = new C37816b(new C17098f(this, 25), true, 1227443641);
        bVar.f85723w = null;
        bVar.f85724x = null;
        bVar.f85722E = 1;
        AbstractC29125c.m88508Q(c37816b, bVar);
        return enumC31071a;
    }
}
