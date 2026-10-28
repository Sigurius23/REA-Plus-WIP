package l03;

import ad3.AbstractC0757c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetLockedContentViewState;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetViewState;
import d03.AbstractC11446a;
import d03.AbstractC11447b;
import ge3.AbstractC15751g;
import ih1.C18522f;
import jp1.C21859k;
import k71.C22252i;
import kk1.C22541b;
import kotlinx.serialization.SerializationException;
import l01.C23038j;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m03.AbstractC24886b;
import m03.AbstractC24888d;
import m03.AbstractC24889e;
import nf3.C26669a;
import o03.AbstractC27356a;
import o73.C27648a;
import of3.InterfaceC27903a;
import p008a7.C0515f;
import p031b9.AbstractC2875y;
import p138f6.AbstractC14134f;
import p208i2.C17919x;
import p335n6.AbstractC26391h;
import p335n6.C26384a;
import p335n6.C26387d;
import p335n6.C26389f;
import p335n6.C26396m;
import p335n6.InterfaceC26395l;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p395p6.AbstractC28880g0;
import p463rj.AbstractC31484o;
import p470rv.AbstractC31834n;
import p474s.AbstractC32004s;
import p477s2.AbstractC32072d;
import p505ts.AbstractC34132o;
import p545v6.C35714c;
import p545v6.InterfaceC35718g;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39183o;
import p639y6.C39256h;
import p672z6.C40119b;
import p672z6.C40120c;
import p672z6.C40123f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rs.AbstractC31780b;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import v63.AbstractC35745c;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import x30.AbstractC37926s0;
import x81.AbstractC38073e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: l03.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Ll03/h;", "Lp6/g0;", "Lof3/a;", "<init>", "()V", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "viewState", "", "batteryPercentage", "Landroid/content/Context;", "context", "Ll83/a0;", "H", "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;", "L", "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "Ln6/l;", "id", "l", "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;", "G", "(Landroidx/compose/runtime/Composer;I)V", "Ly6/h;", "E", "Ly6/h;", "R", "()Ly6/h;", "stateDefinition", "Lad3/c;", "F", "Ll83/h;", "Q", "()Lad3/c;", "json", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23058h extends AbstractC28880g0 implements InterfaceC27903a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C39256h stateDefinition = C39256h.f168775a;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h json = AbstractC30060g.m92087G(EnumC23463i.f92933w, new b(this, new C35953c("WIDGET_KTX_SERIALIZATION_JSON"), null));

    /* JADX INFO: renamed from: l03.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.widget.ui.healthspan.HealthspanWidget", m100430f = "HealthspanWidget.kt", m100431l = {66}, m100432m = "provideGlance", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f90928E;

        /* JADX INFO: renamed from: w */
        Object f90929w;

        /* JADX INFO: renamed from: x */
        Object f90930x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f90931y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f90931y = obj;
            this.f90928E |= Integer.MIN_VALUE;
            return C23058h.this.mo63263l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: l03.h$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f90933w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f90934x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f90935y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f90933w = interfaceC27903a;
            this.f90934x = interfaceC35951a;
            this.f90935y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ad3.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final AbstractC0757c invoke() {
            InterfaceC27903a interfaceC27903a = this.f90933w;
            InterfaceC35951a interfaceC35951a = this.f90934x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f90935y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m67012D(Context context, HealthspanWidgetViewState healthspanWidgetViewState, C23058h c23058h, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC31780b.m98680a(AbstractC37926s0.m121474l(AbstractC32072d.m99702k(new C26387d(new C26384a(AbstractC11446a.f36717p))), AbstractC27356a.m82535b(context, "whoop://com.whoop/healthspan")), C35714c.f151948d, AbstractC37817c.m121344e(-595869490, c28655q, new C23057g(healthspanWidgetViewState, context, c23058h)), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m67013E(HealthspanWidgetViewState healthspanWidgetViewState, Context context, C23058h c23058h, Composer composer, int i13) {
        Context context2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            if (healthspanWidgetViewState == null) {
                c28655q.m87150e0(-1399927389);
                AbstractC24889e.m72988b(context, c28655q, 0);
                c28655q.m87173q(false);
                context2 = context;
            } else if (healthspanWidgetViewState.getLockedContentState() != null) {
                c28655q.m87150e0(-1399923889);
                context2 = context;
                c23058h.m67019L(healthspanWidgetViewState.getLockedContentState(), healthspanWidgetViewState.getBatteryPercentage(), context2, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                context2 = context;
                c28655q.m87150e0(-1399919850);
                c23058h.m67015H(healthspanWidgetViewState, healthspanWidgetViewState.getBatteryPercentage(), context2, c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC31780b.m98680a(AbstractC37926s0.m121474l(AbstractC32072d.m99702k(C26396m.f104850a), AbstractC27356a.m82535b(context2, "whoop://com.whoop/healthspan")), null, C23055e.f90918a.m67008b(), c28655q, 384, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m67014F(C23058h c23058h, int i13, Composer composer, int i14) {
        c23058h.m67034G(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private final void m67015H(HealthspanWidgetViewState healthspanWidgetViewState, Integer num, Context context, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-551744341);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(healthspanWidgetViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(num) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(context) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC31780b.m98680a(AbstractC32004s.m99552u(AbstractC32072d.m99702k(C26396m.f104850a), 12), C35714c.f151948d, AbstractC37817c.m121344e(1869677065, c28655q, new C21859k(healthspanWidgetViewState, context, num, 5)), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23038j(this, healthspanWidgetViewState, num, context, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m67016I(HealthspanWidgetViewState healthspanWidgetViewState, Context context, Integer num, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC24886b.m72980e(healthspanWidgetViewState, context, c28655q, 0);
            String ageValueDisplay = healthspanWidgetViewState.getAgeValueDisplay();
            if (AbstractC39414r.m125890i0(ageValueDisplay)) {
                ageValueDisplay = context.getString(AbstractC11447b.f36718a);
                AbstractC22676k.m65749i(ageValueDisplay, "getString(...)");
            }
            AbstractC24888d.m72984c(ageValueDisplay, healthspanWidgetViewState.getSubtitleDisplay(), C23053c.f90915a.m67003c(healthspanWidgetViewState.getSubtitleStyle()), c28655q, 0);
            AbstractC31780b.m98680a(AbstractC32072d.m99702k(C26396m.f104850a), C35714c.f151947c, AbstractC37817c.m121344e(1933029227, c28655q, new C23056f(0, num)), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m67017J(Integer num, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC23059i.m67037b(num, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m67018K(C23058h c23058h, HealthspanWidgetViewState healthspanWidgetViewState, Integer num, Context context, int i13, Composer composer, int i14) {
        c23058h.m67015H(healthspanWidgetViewState, num, context, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private final void m67019L(HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, Integer num, Context context, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1140625272);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(healthspanWidgetLockedContentViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(num) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(context) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC31780b.m98680a(AbstractC32004s.m99552u(AbstractC32072d.m99702k(C26396m.f104850a), 12), C35714c.f151948d, AbstractC37817c.m121344e(-1671032214, c28655q, new C21859k(context, healthspanWidgetLockedContentViewState, num, 4)), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23038j(this, healthspanWidgetLockedContentViewState, num, context, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m67020M(Context context, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, Integer num, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C26396m c26396m = C26396m.f104850a;
            AbstractC31834n.m98892a(AbstractC32072d.m99703l(c26396m), 1, 1, AbstractC37817c.m121344e(-1398140448, c28655q, new C18522f(11, context, healthspanWidgetLockedContentViewState)), c28655q, 3072, 0);
            AbstractC31780b.m98680a(AbstractC32072d.m99702k(c26396m), C35714c.f151947c, AbstractC37817c.m121344e(-1867360824, c28655q, new C23056f(1, num)), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m67021N(Context context, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, InterfaceC35718g Column, Composer composer, int i13) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            byte[] lockedIconByteArray = healthspanWidgetLockedContentViewState.getLockedIconByteArray();
            objM87133R = lockedIconByteArray != null ? BitmapFactory.decodeByteArray(lockedIconByteArray, 0, lockedIconByteArray.length) : null;
            c28655q.m87172p0(objM87133R);
        }
        Bitmap bitmap = (Bitmap) objM87133R;
        C27648a.m83581d(bitmap != null ? new C26389f(bitmap) : new C26384a(AbstractC11446a.f36716o), "", AbstractC32072d.m99710t(200 / context.getResources().getDisplayMetrics().density), 0, c28655q, 48, 24);
        String headerDisplay = healthspanWidgetLockedContentViewState.getHeaderDisplay();
        if (headerDisplay == null) {
            headerDisplay = context.getString(AbstractC11447b.f36718a);
            AbstractC22676k.m65749i(headerDisplay, "getString(...)");
        }
        AbstractC31484o.m96953e(headerDisplay, null, new C40123f(new C0515f(C17919x.f69629f), new C39183o(AbstractC35745c.m113246h(18)), new C40119b(700), new C40120c(3), 104), 0, c28655q, 0, 10);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m67022O(Integer num, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC23059i.m67037b(num, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m67023P(C23058h c23058h, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, Integer num, Context context, int i13, Composer composer, int i14) {
        c23058h.m67019L(healthspanWidgetLockedContentViewState, num, context, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private final AbstractC0757c m67024Q() {
        return (AbstractC0757c) this.json.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m67025S(C23058h c23058h, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c23058h.m67034G(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public final void m67034G(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1322059129);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-534706435);
            Object objM87161k = c28655q.m87161k(AbstractC26391h.f104842c);
            if (objM87161k == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            }
            c28655q.m87173q(false);
            Context context = (Context) c28655q.m87161k(AbstractC26391h.f104841b);
            String str = (String) ((AbstractC14134f) objM87161k).mo40227b(AbstractC15751g.m44441U("WIDGET_KEY_HEALTHSPAN_VIEW_STATE"));
            HealthspanWidgetViewState healthspanWidgetViewState = null;
            if (str != null) {
                try {
                    AbstractC0757c abstractC0757cM67024Q = m67024Q();
                    abstractC0757cM67024Q.getClass();
                    healthspanWidgetViewState = (HealthspanWidgetViewState) abstractC0757cM67024Q.m1831b(HealthspanWidgetViewState.INSTANCE.serializer(), str);
                } catch (SerializationException e5) {
                    InterfaceC34116n.INSTANCE.m107848a("HealthspanWidget").mo85213c("Failed to decode Healthspan widget state", e5, new AbstractC30556a.a[0]);
                }
            }
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(380950508, c28655q, new C23057g(context, healthspanWidgetViewState, this)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(this, i13, 5);
        }
    }

    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: R, reason: from getter and merged with bridge method [inline-methods] */
    public C39256h getStateDefinition() {
        return this.stateDefinition;
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p395p6.AbstractC28880g0
    /* JADX INFO: renamed from: l */
    public Object mo63263l(Context context, InterfaceC26395l interfaceC26395l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f90928E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f90928E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f90931y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f90928E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        C37816b c37816b = new C37816b(new C22541b(this, 7), true, -1808218222);
        aVar.f90929w = null;
        aVar.f90930x = null;
        aVar.f90928E = 1;
        AbstractC29125c.m88508Q(c37816b, aVar);
        return enumC31071a;
    }
}
