package ih0;

import androidx.compose.foundation.relocation.AbstractC1108a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import i21.C18008r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.WeakHashMap;
import l83.C23454a0;
import p027b3.AbstractC2453v1;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p181h2.C16618c;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.InterfaceC22940b2;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ih0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u000e\u0010\u000e\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "i", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Ly3/l;", "Lh2/c;", "g", "(J)Lh2/c;", "Lp1/t1;", "", "a", "Lp1/t1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lp1/t1;", "LocalKeepFormWidgetInView", "hasFocus", "widgetSize", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18504n {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f72090a = new C28674u2(new C18008r(22));

    /* JADX INFO: renamed from: ih0.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.formwidget.FormWidgetInViewKt$keepFormWidgetInView$1$1", m100430f = "FormWidgetInView.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC30833a f72091E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f72092F;

        /* JADX INFO: renamed from: w */
        int f72093w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f72094x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f72095y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC39171c f72096z;

        /* JADX INFO: renamed from: ih0.n$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.formwidget.FormWidgetInViewKt$keepFormWidgetInView$1$1$2", m100430f = "FormWidgetInView.kt", m100431l = {66, 67}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "imeBottomPx", "Ll83/a0;", "<anonymous>", "(I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41743a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC30833a f72097E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC28601c1 f72098F;

            /* JADX INFO: renamed from: w */
            int f72099w;

            /* JADX INFO: renamed from: x */
            Object f72100x;

            /* JADX INFO: renamed from: y */
            int f72101y;

            /* JADX INFO: renamed from: z */
            /* synthetic */ int f72102z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41743a(InterfaceC30833a interfaceC30833a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super C41743a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f72097E = interfaceC30833a;
                this.f72098F = interfaceC28601c1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41743a c41743a = new C41743a(this.f72097E, this.f72098F, interfaceC30057d);
                c41743a.f72102z = ((Number) obj).intValue();
                return c41743a;
            }

            public final Object invoke(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41743a) create(Integer.valueOf(i13), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                int i13 = this.f72102z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f72101y;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (i13 != 0) {
                        InterfaceC30833a interfaceC30833a = this.f72097E;
                        this.f72102z = i13;
                        this.f72101y = 1;
                        if (((C30835c) interfaceC30833a).m94839b(null, this) != enumC31071a) {
                        }
                        return enumC31071a;
                    }
                    return c23454a0;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C16618c c16618cM53618g = AbstractC18504n.m53618g(AbstractC18504n.m53623l(this.f72098F));
                if (c16618cM53618g != null) {
                    InterfaceC30833a interfaceC30833a2 = this.f72097E;
                    this.f72100x = null;
                    this.f72102z = i13;
                    this.f72099w = 0;
                    this.f72101y = 2;
                    if (((C30835c) interfaceC30833a2).m94839b(c16618cM53618g, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return c23454a0;
            }

            @Override // c93.InterfaceC4351m
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (InterfaceC30057d<? super C23454a0>) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c, InterfaceC30833a interfaceC30833a, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72094x = interfaceC28601c1;
            this.f72095y = interfaceC28670t2;
            this.f72096z = interfaceC39171c;
            this.f72091E = interfaceC30833a;
            this.f72092F = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m53628h(InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c) {
            return ((InterfaceC22940b2) interfaceC28670t2.getValue()).mo43079c(interfaceC39171c);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f72094x, this.f72095y, this.f72096z, this.f72091E, this.f72092F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72093w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC18504n.m53621j(this.f72094x)) {
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C18503m(0, this.f72095y, this.f72096z));
                C41743a c41743a = new C41743a(this.f72091E, this.f72092F, null);
                this.f72093w = 1;
                if (AbstractC13091v.m36604n(c13084s1M87240H, c41743a, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m53615d() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final C16618c m53618g(long j7) {
        C39180l c39180l = new C39180l(j7);
        if (((int) (j7 & 4294967295L)) <= 0) {
            c39180l = null;
        }
        if (c39180l == null) {
            return null;
        }
        long j13 = c39180l.f168422a;
        int i13 = (int) (4294967295L & j13);
        return new C16618c(0.0f, i13 - 1, (int) (j13 >> 32), i13);
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC28669t1 m53619h() {
        return f72090a;
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m53620i(Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(2056442006);
        if (!((Boolean) c28655q.m87161k(f72090a)).booleanValue()) {
            c28655q.m87173q(false);
            return modifier;
        }
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C30835c();
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC30833a interfaceC30833a = (InterfaceC30833a) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC28683x.m87272z(new C39180l(0L));
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
        WeakHashMap weakHashMap = C22944c2.f90553v;
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(C22949e.m66712e(c28655q).f90556c, c28655q);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        Boolean boolValueOf = Boolean.valueOf(m53621j(interfaceC28601c1));
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC39171c) | c28655q.m87157i(interfaceC30833a);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g || objM87133R4 == c28676v0) {
            a aVar = new a(interfaceC28601c1, interfaceC28601c1M87238F, interfaceC39171c, interfaceC30833a, interfaceC28601c2, null);
            c28655q.m87172p0(aVar);
            objM87133R4 = aVar;
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf);
        Object objM87133R5 = c28655q.m87133R();
        if (objM87133R5 == c28676v0) {
            objM87133R5 = new C18496h(1, interfaceC28601c1);
            c28655q.m87172p0(objM87133R5);
        }
        Modifier modifierM3484c = AbstractC1126a.m3484c(modifier, (Function1) objM87133R5);
        Object objM87133R6 = c28655q.m87133R();
        if (objM87133R6 == c28676v0) {
            objM87133R6 = new C18496h(2, interfaceC28601c2);
            c28655q.m87172p0(objM87133R6);
        }
        Modifier modifierM3443a = AbstractC1108a.m3443a(AbstractC1132b.m3502b(modifierM3484c, (Function1) objM87133R6), interfaceC30833a);
        c28655q.m87173q(false);
        return modifierM3443a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m53621j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m53622k(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final long m53623l(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39180l) interfaceC28601c1.getValue()).f168422a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m53624m(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C39180l(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m53625n(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        m53622k(interfaceC28601c1, ((EnumC15251w) it).m43353a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m53626o(InterfaceC28601c1 interfaceC28601c1, C39180l c39180l) {
        m53624m(interfaceC28601c1, c39180l.f168422a);
        return C23454a0.f92919a;
    }
}
