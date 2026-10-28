package n03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import d03.AbstractC11447b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k71.C22252i;
import kotlin.C2032u;
import l83.C23454a0;
import mw1.C25985a;
import o03.AbstractC27356a;
import p008a7.C0510a;
import p008a7.C0515f;
import p031b9.AbstractC2875y;
import p138f6.AbstractC14134f;
import p208i2.C17919x;
import p335n6.AbstractC26391h;
import p335n6.C26386c;
import p335n6.InterfaceC26395l;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p395p6.AbstractC28880g0;
import p395p6.C28920t1;
import p395p6.C28921u;
import p395p6.InterfaceC28923u1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p639y6.C39256h;
import p639y6.InterfaceC39255g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: n03.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ln03/k;", "Lp6/g0;", "Ly6/g;", "Lf6/f;", "stateDefinition", "<init>", "(Ly6/g;)V", "Landroid/content/Context;", "context", "Ln6/l;", "id", "Ll83/a0;", "l", "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;", "x", "(Landroidx/compose/runtime/Composer;I)V", "E", "Ly6/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ly6/g;", "Lp6/u1;", "F", "Lp6/u1;", "g", "()Lp6/u1;", "sizeMode", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26100k extends AbstractC28880g0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC39255g stateDefinition;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC28923u1 sizeMode;

    /* JADX INFO: renamed from: n03.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.single.SmallWidgetStress", m100430f = "SmallWidgetStress.kt", m100431l = {40}, m100432m = "provideGlance", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f103390E;

        /* JADX INFO: renamed from: w */
        Object f103391w;

        /* JADX INFO: renamed from: x */
        Object f103392x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f103393y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f103393y = obj;
            this.f103390E |= Integer.MIN_VALUE;
            return C26100k.this.mo63263l(null, null, this);
        }
    }

    public C26100k(InterfaceC39255g stateDefinition) {
        AbstractC22676k.m65750j(stateDefinition, "stateDefinition");
        this.stateDefinition = stateDefinition;
        this.sizeMode = C28920t1.f117030a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m77664v(Context context, String str, String str2, String str3, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            if (str == null) {
                string = context.getString(AbstractC11447b.f36718a);
                AbstractC22676k.m65749i(string, "getString(...)");
            } else {
                string = str;
            }
            AbstractC26094e.m77617d(context, string, AbstractC27356a.m82540g(str2), AbstractC27356a.m82541h(str2), str3, AbstractC27356a.m82535b(context, "whoop://com.whoop/stress_monitor"), new C26386c(new C0515f(C17919x.m51541c(0.95f, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkAlt()))).mo78107d(new C28921u(new C0510a(16))), 1, c28655q, 12582912, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m77665w(C26100k c26100k, int i13, Composer composer, int i14) {
        c26100k.m77667x(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m77666y(C26100k c26100k, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c26100k.m77667x(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: g, reason: from getter */
    public InterfaceC28923u1 getSizeMode() {
        return this.sizeMode;
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: h, reason: from getter */
    public InterfaceC39255g getStateDefinition() {
        return this.stateDefinition;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: l */
    public Object mo63263l(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f103390E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f103390E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f103393y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f103390E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        C37816b c37816b = new C37816b(new C25985a(this, 7), true, 2035872126);
        aVar.f103391w = null;
        aVar.f103392x = null;
        aVar.f103390E = 1;
        AbstractC29125c.m88508Q(c37816b, aVar);
        return enumC31071a;
    }

    /* JADX INFO: renamed from: x */
    public final void m77667x(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(498949555);
        int i14 = i13 & 1;
        if (c28655q.m87135U(i14, i14 != 0)) {
            c28655q.m87152f0(-534706435);
            Object objM87161k = c28655q.m87161k(AbstractC26391h.f104842c);
            if (objM87161k == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            AbstractC14134f abstractC14134f = (AbstractC14134f) objM87161k;
            c28655q.m87173q(false);
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1618038872, c28655q, new C2032u((Context) c28655q.m87161k(AbstractC26391h.f104841b), (String) abstractC14134f.mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_SCORE")), (String) abstractC14134f.mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_STATE")), (String) abstractC14134f.mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_STRESS_BUCKET")), 25)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(this, i13, 20);
        }
    }

    public /* synthetic */ C26100k(InterfaceC39255g interfaceC39255g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C39256h.f168775a : interfaceC39255g);
    }
}
