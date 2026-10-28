package z21;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2549j2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dn0.C12212l;
import f31.AbstractC14046c;
import f31.C14044a;
import gy0.AbstractC16277f;
import i93.C18282h;
import i93.C18284j;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p108e4.AbstractC12686t;
import p108e4.C12671e;
import p108e4.C12672f;
import p108e4.C12677k;
import p108e4.C12679m;
import p108e4.C12684r;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22961h;
import p291l0.C22994r1;
import p292l1.C23108i;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p745y81.AbstractC39330c;
import qz0.AbstractC30795n;
import tg2.C33795i;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: z21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0099\u0001\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aS\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aS\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00182\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aq\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010#\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "", "levels", "", "listOfNumbers", "initialSelection", "", "enabled", "Lny0/v0;", "buttonType", "Lkotlin/Function1;", "convertNumberToDisplay", "Lkotlin/Function0;", "Li2/x;", "activeColorProvider", "Ll83/a0;", "selectedNumber", "k", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li93/h;", "range", "l", "(Li93/h;Ljava/lang/Integer;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Li93/j;", "m", "(Li93/j;Ljava/lang/Integer;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "number", "Lf31/a;", "state", "makeFirstItemColorUniform", "g", "(ILf31/a;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isLast", "removePlus", "s", "(IZZ)Lcom/whoop/design/util/TextResource;", "isFirst", "t", "(ZZLandroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40020b {

    /* JADX INFO: renamed from: z21.b$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Ly2/t0;", "", "Ly2/q0;", "measurables", "Ly3/a;", "constraints", "Ly2/s0;", "a", "(Ly2/t0;Ljava/util/List;J)Ly2/s0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f172654a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12684r f172655b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C12679m f172656c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f172657d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC28601c1 f172658e;

        /* JADX INFO: renamed from: z21.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ly2/i1;", "Ll83/a0;", "a", "(Ly2/i1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42721a extends AbstractC22680m implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12684r f172659w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ List f172660x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42721a(C12684r c12684r, List list) {
                super(1);
                this.f172659w = c12684r;
                this.f172660x = list;
            }

            /* JADX INFO: renamed from: a */
            public final void m128268a(AbstractC39101i1 abstractC39101i1) {
                this.f172659w.m35489e(abstractC39101i1, this.f172660x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m128268a((AbstractC39101i1) obj);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC28601c1 interfaceC28601c1, C12684r c12684r, C12679m c12679m, int i13, InterfaceC28601c1 interfaceC28601c2) {
            this.f172654a = interfaceC28601c1;
            this.f172655b = c12684r;
            this.f172656c = c12679m;
            this.f172657d = i13;
            this.f172658e = interfaceC28601c2;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List<? extends InterfaceC39124q0> list, long j7) {
            this.f172654a.getValue();
            long jM35490f = this.f172655b.m35490f(j7, interfaceC39133t0.getLayoutDirection(), this.f172656c, list, this.f172657d);
            this.f172658e.getValue();
            return interfaceC39133t0.mo86822W((int) (jM35490f >> 32), (int) (jM35490f & 4294967295L), C25272z.f99163w, new C42721a(this.f172655b, list));
        }
    }

    /* JADX INFO: renamed from: z21.b$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f172661w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12679m f172662x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, C12679m c12679m) {
            super(0);
            this.f172661w = interfaceC28601c1;
            this.f172662x = c12679m;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134587invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134587invoke() {
            InterfaceC28601c1 interfaceC28601c1 = this.f172661w;
            interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
            this.f172662x.f43362z = true;
        }
    }

    /* JADX INFO: renamed from: z21.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Li3/z;", "Ll83/a0;", "a", "(Li3/z;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12684r f172663w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12684r c12684r) {
            super(1);
            this.f172663w = c12684r;
        }

        /* JADX INFO: renamed from: a */
        public final void m128269a(InterfaceC18044z interfaceC18044z) {
            AbstractC12686t.m35496a(interfaceC18044z, this.f172663w);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m128269a((InterfaceC18044z) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z21.b$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "a", "(Landroidx/compose/runtime/Composer;I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List f172664E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f172665F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f172666G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ List f172667H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f172668I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ boolean f172669J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ AbstractC27285v0 f172670K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ Function1 f172671L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ boolean f172672M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ Function1 f172673N;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f172674w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12677k f172675x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f172676y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ TextResource f172677z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC28601c1 interfaceC28601c1, C12677k c12677k, InterfaceC4339a interfaceC4339a, TextResource textResource, List list, InterfaceC4339a interfaceC4339a2, InterfaceC28601c1 interfaceC28601c2, List list2, InterfaceC28601c1 interfaceC28601c3, boolean z4, AbstractC27285v0 abstractC27285v0, Function1 function1, boolean z13, Function1 function2) {
            super(2);
            this.f172674w = interfaceC28601c1;
            this.f172675x = c12677k;
            this.f172676y = interfaceC4339a;
            this.f172677z = textResource;
            this.f172664E = list;
            this.f172665F = interfaceC4339a2;
            this.f172666G = interfaceC28601c2;
            this.f172667H = list2;
            this.f172668I = interfaceC28601c3;
            this.f172669J = z4;
            this.f172670K = abstractC27285v0;
            this.f172671L = function1;
            this.f172672M = z13;
            this.f172673N = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m128270a(Composer composer, int i13) {
            C12672f c12672f;
            C12672f c12672f2;
            C12672f c12672f3;
            C2314t c2314t;
            C28676v0 c28676v0;
            boolean z4;
            long jM125317c;
            if ((i13 & 3) == 2) {
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87121F()) {
                    c28655q.m87138X();
                    return;
                }
            }
            this.f172674w.setValue(C23454a0.f92919a);
            C12677k c12677k = this.f172675x;
            int i14 = c12677k.f43349b;
            c12677k.m35480e();
            C12677k c12677k2 = this.f172675x;
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1479434088);
            C12677k c12677k3 = (C12677k) c12677k2.m35479d().f2818x;
            C12672f c12672fM35478c = c12677k3.m35478c();
            C12672f c12672fM35478c2 = c12677k3.m35478c();
            C12672f c12672fM35478c3 = c12677k3.m35478c();
            TextResource textResource = this.f172677z;
            C2314t c2314t2 = C2314t.f9131w;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (textResource != null) {
                c28655q2.m87150e0(1479461057);
                boolean zM87153g = c28655q2.m87153g(c12672fM35478c3);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v1) {
                    objM87133R = new e(c12672fM35478c3);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(0.5f, C12677k.m35476b(c2314t2, c12672fM35478c, (Function1) objM87133R));
                String strM21274h = AbstractC8693b.m21274h(this.f172677z, c28655q2, 0);
                C38072d c38072d = C38072d.f163053a;
                z4 = false;
                c12672f = c12672fM35478c3;
                c2314t = c2314t2;
                c12672f2 = c12672fM35478c;
                c12672f3 = c12672fM35478c2;
                c28676v0 = c28676v1;
                AbstractC30795n.m94707h(strM21274h, modifierM3409f, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 0, 0, 196600);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c12672f = c12672fM35478c3;
                c12672f2 = c12672fM35478c;
                c12672f3 = c12672fM35478c2;
                c2314t = c2314t2;
                c28676v0 = c28676v1;
                z4 = false;
                c28655q2.m87150e0(1479911115);
                c28655q2.m87173q(false);
            }
            if (this.f172664E != null) {
                c28655q2.m87150e0(1479962079);
                InterfaceC4339a interfaceC4339a = this.f172665F;
                C17919x c17919x = interfaceC4339a != null ? (C17919x) interfaceC4339a.invoke() : null;
                if (c17919x == null) {
                    c28655q2.m87150e0(-1199183006);
                    jM125317c = C38070b.f163049a.m121943a(c28655q2, 6).getAffirmative();
                    c28655q2.m87173q(z4);
                } else {
                    c28655q2.m87150e0(-1199184711);
                    c28655q2.m87173q(z4);
                    jM125317c = c17919x.f69639a;
                }
                AbstractC39330c.m125320b(0L, jM125317c, 0L, 0L, AbstractC37817c.m121344e(2108977552, c28655q2, new f(c12677k2, c12672f3, c12672f, this.f172666G)), c28655q2, 24576, 13);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(1480650155);
                c28655q2.m87173q(z4);
            }
            C2306l c2306l = C2299e.f9108K;
            C22961h c22961h = AbstractC22977m.f90654e;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 2 * 4, 1);
            C12672f c12672f4 = c12672f2;
            boolean zM87153g2 = c28655q2.m87153g(c12672f4);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new g(c12672f4);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM35476b = C12677k.m35476b(modifierM3396r, c12672f, (Function1) objM87133R2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM35476b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            AbstractC14046c.m39965e(this.f172667H, this.f172668I.getValue(), null, null, null, AbstractC37817c.m121344e(126429615, c28655q2, new h(this.f172669J, this.f172670K, this.f172671L, this.f172672M, this.f172665F, this.f172664E, this.f172667H, this.f172673N, this.f172668I, this.f172666G)), c28655q2, ProfileVerifier.CompilationStatus.f6515xf2722a21, 28);
            c28655q2.m87173q(true);
            c28655q2.m87173q(false);
            if (this.f172675x.f43349b != i14) {
                AbstractC28683x.m87257k(this.f172676y, c28655q2);
            }
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m128270a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z21.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f172678w;

        public e(C12672f c12672f) {
            this.f172678w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m128271a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, constrainAs.f43326c.f43334e, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f172678w.f43333d, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, this.f172678w.f43334e, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m128271a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z21.b$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12677k f172679w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f172680x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12672f f172681y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f172682z;

        /* JADX INFO: renamed from: z21.b$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12672f f172683w;

            public a(C12672f c12672f) {
                this.f172683w = c12672f;
            }

            /* JADX INFO: renamed from: a */
            public final void m128273a(C12671e constrainAs) {
                AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
                C5101l0.m16026X(constrainAs.f43328e, constrainAs.f43326c.f43334e, 0.0f, 6);
                C37199o.m119194J(constrainAs.f43329f, this.f172683w.f43335f, 0.0f, 6);
                C5101l0.m16026X(constrainAs.f43330g, this.f172683w.f43334e, 0.0f, 6);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m128273a((C12671e) obj);
                return C23454a0.f92919a;
            }
        }

        public f(C12677k c12677k, C12672f c12672f, C12672f c12672f2, InterfaceC28601c1 interfaceC28601c1) {
            this.f172679w = c12677k;
            this.f172680x = c12672f;
            this.f172681y = c12672f2;
            this.f172682z = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m128272a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            C12677k c12677k = this.f172679w;
            C12672f c12672f = this.f172680x;
            boolean zM87153g = c28655q.m87153g(this.f172681y);
            C12672f c12672f2 = this.f172681y;
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(c12672f2);
                c28655q.m87172p0(objM87133R);
            }
            c12677k.getClass();
            AbstractC30795n.m94707h(AbstractC8693b.m21274h((TextResource) this.f172682z.getValue(), c28655q, 0), AbstractC1102d.m3409f(0.5f, C12677k.m35476b(C2314t.f9131w, c12672f, (Function1) objM87133R)), C38070b.f163049a.m121943a(c28655q, 6).getActive(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196088);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m128272a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z21.b$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f172684w;

        public g(C12672f c12672f) {
            this.f172684w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m128274a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f172684w.f43336g, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, constrainAs.f43326c.f43336g, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m128274a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z21.b$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4353o {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f172685E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ List<TextResource> f172686F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ List<Integer> f172687G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ Function1 f172688H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f172689I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f172690J;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ boolean f172691w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC27285v0 f172692x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f172693y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f172694z;

        /* JADX INFO: renamed from: z21.b$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C14044a f172695w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f172696x;

            public a(C14044a c14044a, boolean z4) {
                this.f172695w = c14044a;
                this.f172696x = z4;
            }

            /* JADX INFO: renamed from: a */
            public final TextResource m128276a(int i13) {
                return AbstractC40020b.m128266s(i13, this.f172695w.getIsLast(), this.f172696x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m128276a(((Number) obj).intValue());
            }
        }

        /* JADX INFO: renamed from: z21.b$h$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ Function1 f172697E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28601c1 f172698w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f172699x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<TextResource> f172700y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ List<Integer> f172701z;

            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, List<? extends TextResource> list, List<Integer> list2, Function1 function1) {
                this.f172698w = interfaceC28601c1;
                this.f172699x = interfaceC28601c2;
                this.f172700y = list;
                this.f172701z = list2;
                this.f172697E = function1;
            }

            /* JADX INFO: renamed from: a */
            public final void m128277a(int i13) {
                TextResource textResourceM21267a;
                this.f172698w.setValue(Integer.valueOf(i13));
                InterfaceC28601c1 interfaceC28601c1 = this.f172699x;
                List<TextResource> list = this.f172700y;
                if (list == null || (textResourceM21267a = (TextResource) AbstractC25265s.m74102I0(this.f172701z.indexOf(Integer.valueOf(i13)), list)) == null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                interfaceC28601c1.setValue(textResourceM21267a);
                this.f172697E.invoke(Integer.valueOf(i13));
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m128277a(((Number) obj).intValue());
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(boolean z4, AbstractC27285v0 abstractC27285v0, Function1 function1, boolean z13, InterfaceC4339a interfaceC4339a, List<? extends TextResource> list, List<Integer> list2, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f172691w = z4;
            this.f172692x = abstractC27285v0;
            this.f172693y = function1;
            this.f172694z = z13;
            this.f172685E = interfaceC4339a;
            this.f172686F = list;
            this.f172687G = list2;
            this.f172688H = function2;
            this.f172689I = interfaceC28601c1;
            this.f172690J = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m128275a(InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
            int i15;
            AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
            AbstractC22676k.m65750j(state, "state");
            if ((i14 & 48) == 0) {
                i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 384) == 0) {
                i15 |= ((C28655q) composer).m87153g(state) ? 256 : 128;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
                c28655q.m87138X();
                return;
            }
            boolean z4 = this.f172691w;
            AbstractC27285v0 abstractC27285v0 = this.f172692x;
            Function1 function1 = this.f172693y;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (function1 == null) {
                c28655q.m87150e0(-221386348);
                boolean zM87155h = c28655q.m87155h(this.f172694z) | ((i15 & 896) == 256);
                boolean z13 = this.f172694z;
                Object objM87133R = c28655q.m87133R();
                if (zM87155h || objM87133R == c28676v0) {
                    objM87133R = new a(state, z13);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            } else {
                c28655q.m87150e0(1239783688);
            }
            c28655q.m87173q(false);
            Function1 function2 = function1;
            InterfaceC4339a interfaceC4339a = this.f172685E;
            boolean z14 = this.f172694z;
            boolean zM87157i = c28655q.m87157i(this.f172686F) | c28655q.m87157i(this.f172687G) | c28655q.m87153g(this.f172688H);
            InterfaceC28601c1 interfaceC28601c1 = this.f172689I;
            InterfaceC28601c1 interfaceC28601c2 = this.f172690J;
            List<TextResource> list = this.f172686F;
            List<Integer> list2 = this.f172687G;
            Function1 function3 = this.f172688H;
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                b bVar = new b(interfaceC28601c1, interfaceC28601c2, list, list2, function3);
                c28655q.m87172p0(bVar);
                objM87133R2 = bVar;
            }
            AbstractC40020b.m128254g(i13, state, z4, abstractC27285v0, function2, interfaceC4339a, z14, (Function1) objM87133R2, c28655q, (i15 >> 3) & 126, 0);
        }

        @Override // c93.InterfaceC4353o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m128275a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (C14044a) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x0135  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x00ce, please report this as an issue */
    /* JADX INFO: renamed from: g */
    public static final void m128254g(final int i13, final C14044a c14044a, final boolean z4, final AbstractC27285v0 abstractC27285v0, final Function1 function1, InterfaceC4339a interfaceC4339a, final boolean z13, final Function1 function2, Composer composer, final int i14, final int i15) {
        int i16;
        C14044a c14044a2;
        Function1 function3;
        InterfaceC4339a interfaceC4339a2;
        Function1 function4;
        boolean z14;
        C28655q c28655q;
        final InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        InterfaceC4339a interfaceC4339a4;
        C17919x c17919x;
        long jM128267t;
        int i17;
        int i18;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1567389633);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            c14044a2 = c14044a;
            i16 |= c28655q2.m87153g(c14044a2) ? 32 : 16;
        } else {
            c14044a2 = c14044a;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? c28655q2.m87153g(abstractC27285v0) : c28655q2.m87157i(abstractC27285v0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            function3 = function1;
            i16 |= c28655q2.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            function3 = function1;
        }
        int i19 = i15 & 32;
        if (i19 == 0) {
            if ((196608 & i14) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i16 |= c28655q2.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((1572864 & i14) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((12582912 & i14) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i16 |= i17;
            } else {
                function4 = function2;
            }
            if ((4793491 & i16) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z14)) {
                if (i19 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c17919x = interfaceC4339a4 != null ? (C17919x) interfaceC4339a4.invoke() : null;
                if (c17919x == null) {
                    c28655q2.m87150e0(-1272072027);
                    jM128267t = m128267t(c14044a2.getIsFirst(), z13, c28655q2, (i16 >> 15) & 112);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1272073050);
                    c28655q2.m87173q(false);
                    jM128267t = c17919x.f69639a;
                }
                c28655q = c28655q2;
                AbstractC39330c.m125320b(0L, jM128267t, 0L, 0L, AbstractC37817c.m121344e(-1545713240, c28655q2, new C2549j2(function3, i13, abstractC27285v0, c14044a2, z4, function4, 21)), c28655q, 24576, 13);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z21.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40020b.m128257j(i13, c14044a, z4, abstractC27285v0, function1, interfaceC4339a3, z13, function2, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((1572864 & i14) == 0) {
            if (c28655q2.m87155h(z13)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i16 |= i18;
        }
        if ((12582912 & i14) == 0) {
            function4 = function2;
            if (c28655q2.m87157i(function4)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i16 |= i17;
        } else {
            function4 = function2;
        }
        if ((4793491 & i16) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z14)) {
            if (i19 != 0) {
                interfaceC4339a4 = null;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (interfaceC4339a4 != null) {
            }
            if (c17919x == null) {
                c28655q2.m87150e0(-1272072027);
                jM128267t = m128267t(c14044a2.getIsFirst(), z13, c28655q2, (i16 >> 15) & 112);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1272073050);
                c28655q2.m87173q(false);
                jM128267t = c17919x.f69639a;
            }
            c28655q = c28655q2;
            AbstractC39330c.m125320b(0L, jM128267t, 0L, 0L, AbstractC37817c.m121344e(-1545713240, c28655q2, new C2549j2(function3, i13, abstractC27285v0, c14044a2, z4, function4, 21)), c28655q, 24576, 13);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: z21.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40020b.m128257j(i13, c14044a, z4, abstractC27285v0, function1, interfaceC4339a3, z13, function2, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m128255h(Function1 function1, int i13, AbstractC27285v0 abstractC27285v0, C14044a c14044a, boolean z4, Function1 function2, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h((TextResource) function1.invoke(Integer.valueOf(i13)), c28655q, 0);
            boolean zM39960c = c14044a.getIsSelected();
            boolean zM87153g = c28655q.m87153g(function2) | c28655q.m87149e(i13);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C12212l(function2, i13, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27283u0.m82318q(null, strM21274h, null, null, abstractC27285v0, zM39960c, z4, 0.0f, null, (InterfaceC4339a) objM87133R, c28655q, 0, 397);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m128256i(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m128257j(int i13, C14044a c14044a, boolean z4, AbstractC27285v0 abstractC27285v0, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z13, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m128254g(i13, c14044a, z4, abstractC27285v0, function1, interfaceC4339a, z13, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:127:0x017a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0197  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x0210  */
    /* JADX WARN: Code duplicated, block: B:155:0x0222  */
    /* JADX WARN: Code duplicated, block: B:158:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0243  */
    /* JADX WARN: Code duplicated, block: B:164:0x025f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0275  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX INFO: renamed from: k */
    public static final void m128258k(TextResource textResource, List<? extends TextResource> list, List<Integer> listOfNumbers, Integer num, boolean z4, AbstractC27285v0 abstractC27285v0, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 selectedNumber, Composer composer, int i13, int i14) {
        TextResource textResource2;
        int i15;
        List<? extends TextResource> list2;
        int i16;
        Integer num2;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i24;
        Function1 function2;
        int i25;
        int i26;
        int i27;
        boolean z14;
        C28655q c28655q;
        AbstractC27285v0 abstractC27285v1;
        InterfaceC4339a interfaceC4339a2;
        Function1 function3;
        TextResource textResource3;
        List<? extends TextResource> list3;
        Integer num3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        AbstractC27285v0 cVar;
        InterfaceC4339a interfaceC4339a3;
        AbstractC27285v0 abstractC27285v2;
        Integer num4;
        TextResource textResource4;
        List<? extends TextResource> list4;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        boolean z16;
        InterfaceC39171c interfaceC39171c;
        Object objM87133R3;
        C12684r c12684r;
        Object objM87133R4;
        C12677k c12677k;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R6;
        C12679m c12679m;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87157i;
        Object objM87133R8;
        Object objM87133R9;
        boolean zM87157i2;
        Object objM87133R10;
        TextResource textResourceM21267a;
        int i28;
        int i29;
        boolean zM87157i3;
        int i34;
        AbstractC22676k.m65750j(listOfNumbers, "listOfNumbers");
        AbstractC22676k.m65750j(selectedNumber, "selectedNumber");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1115507456);
        int i35 = i14 & 1;
        if (i35 != 0) {
            i15 = i13 | 6;
            textResource2 = textResource;
        } else if ((i13 & 6) == 0) {
            textResource2 = textResource;
            i15 = (c28655q2.m87153g(textResource2) ? 4 : 2) | i13;
        } else {
            textResource2 = textResource;
            i15 = i13;
        }
        int i36 = i14 & 2;
        if (i36 == 0) {
            if ((i13 & 48) == 0) {
                list2 = list;
                i15 |= c28655q2.m87157i(list2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(listOfNumbers)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i15 |= i34;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    num2 = num;
                    if (c28655q2.m87153g(num2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        z13 = z4;
                        if (c28655q2.m87155h(z13)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if ((i14 & 32) != 0) {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        } else {
                            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                                zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                            } else {
                                zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                            }
                            if (zM87157i3) {
                                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                        }
                        i15 |= i29;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                        function2 = function1;
                    } else {
                        function2 = function1;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(function2)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q2.m87157i(interfaceC4339a)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i15 |= i27;
                        }
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(selectedNumber)) {
                                i28 = 67108864;
                            } else {
                                i28 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i28;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z14)) {
                            c28655q2.m87140Z();
                            if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                                if (i35 != 0) {
                                    textResource2 = null;
                                }
                                if (i36 != 0) {
                                    list2 = null;
                                }
                                if (i16 != 0) {
                                    num2 = null;
                                }
                                if (i18 != 0) {
                                    z13 = true;
                                }
                                if ((i14 & 32) != 0) {
                                    cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                                } else {
                                    cVar = abstractC27285v0;
                                }
                                if (i24 != 0) {
                                    function2 = null;
                                }
                                if (i26 != 0) {
                                    interfaceC4339a3 = null;
                                } else {
                                    interfaceC4339a3 = interfaceC4339a;
                                }
                                abstractC27285v2 = cVar;
                            } else {
                                c28655q2.m87138X();
                                abstractC27285v2 = abstractC27285v0;
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            num4 = num2;
                            Function1 function4 = function2;
                            textResource4 = textResource2;
                            list4 = list2;
                            boolean z17 = z13;
                            c28655q2.m87175r();
                            objM87133R = c28655q2.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(num4);
                                c28655q2.m87172p0(objM87133R);
                            }
                            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                if (list4 != null || (textResourceM21267a = (TextResource) AbstractC25265s.m74102I0(listOfNumbers.indexOf(num4), list4)) == null) {
                                    textResourceM21267a = AbstractC8693b.m21267a();
                                }
                                objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
                            if (textResource4 != null || list4 == null) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            c28655q2.m87150e0(-1003410150);
                            c28655q2.m87150e0(212064437);
                            c28655q2.m87173q(false);
                            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12684r(interfaceC39171c);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            c12684r = (C12684r) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C12677k();
                                c28655q2.m87172p0(objM87133R4);
                            }
                            c12677k = (C12677k) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C12679m(c12677k);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            c12679m = (C12679m) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                C28633k1 c28633k1 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                                c28655q2.m87172p0(c28633k1);
                                objM87133R7 = c28633k1;
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                            zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87157i || objM87133R8 == c28676v0) {
                                objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R8;
                            objM87133R9 = c28655q2.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new b(interfaceC28601c1, c12679m);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
                            zM87157i2 = c28655q2.m87157i(c12684r);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i2 || objM87133R10 == c28676v0) {
                                objM87133R10 = new c(c12684r);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            c28655q = c28655q2;
                            AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a4, textResource4, list4, interfaceC4339a3, interfaceC28601c4, listOfNumbers, interfaceC28601c3, z17, abstractC27285v2, function4, z16, selectedNumber)), interfaceC39127r0, c28655q, 48);
                            c28655q.m87173q(false);
                            textResource3 = textResource4;
                            list3 = list4;
                            interfaceC4339a2 = interfaceC4339a3;
                            z15 = z17;
                            abstractC27285v1 = abstractC27285v2;
                            function3 = function4;
                            num3 = num4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            abstractC27285v1 = abstractC27285v0;
                            interfaceC4339a2 = interfaceC4339a;
                            function3 = function2;
                            textResource3 = textResource2;
                            list3 = list2;
                            num3 = num2;
                            z15 = z13;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                        }
                    }
                    i15 |= 12582912;
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(selectedNumber)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        } else {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        }
                        num4 = num2;
                        Function1 function5 = function2;
                        textResource4 = textResource2;
                        list4 = list2;
                        boolean z18 = z13;
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(num4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            if (list4 != null) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            }
                            objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R2;
                        if (textResource4 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        c28655q2.m87150e0(-1003410150);
                        c28655q2.m87150e0(212064437);
                        c28655q2.m87173q(false);
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12684r(interfaceC39171c);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c12684r = (C12684r) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C12677k();
                            c28655q2.m87172p0(objM87133R4);
                        }
                        c12677k = (C12677k) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12679m(c12677k);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        c12679m = (C12679m) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            C28633k1 c28633k2 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                            c28655q2.m87172p0(c28633k2);
                            objM87133R7 = c28633k2;
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        InterfaceC39127r0 interfaceC39127r1 = (InterfaceC39127r0) objM87133R8;
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new b(interfaceC28601c1, c12679m);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R9;
                        zM87157i2 = c28655q2.m87157i(c12684r);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c28655q = c28655q2;
                        AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a5, textResource4, list4, interfaceC4339a3, interfaceC28601c6, listOfNumbers, interfaceC28601c5, z18, abstractC27285v2, function5, z16, selectedNumber)), interfaceC39127r1, c28655q, 48);
                        c28655q.m87173q(false);
                        textResource3 = textResource4;
                        list3 = list4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z15 = z18;
                        abstractC27285v1 = abstractC27285v2;
                        function3 = function5;
                        num3 = num4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        abstractC27285v1 = abstractC27285v0;
                        interfaceC4339a2 = interfaceC4339a;
                        function3 = function2;
                        textResource3 = textResource2;
                        list3 = list2;
                        num3 = num2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 24576;
                z13 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                        } else {
                            zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                        }
                        if (zM87157i3) {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i29;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(selectedNumber)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        } else {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        }
                        num4 = num2;
                        Function1 function6 = function2;
                        textResource4 = textResource2;
                        list4 = list2;
                        boolean z19 = z13;
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(num4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            if (list4 != null) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            }
                            objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R2;
                        if (textResource4 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        c28655q2.m87150e0(-1003410150);
                        c28655q2.m87150e0(212064437);
                        c28655q2.m87173q(false);
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12684r(interfaceC39171c);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c12684r = (C12684r) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C12677k();
                            c28655q2.m87172p0(objM87133R4);
                        }
                        c12677k = (C12677k) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12679m(c12677k);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        c12679m = (C12679m) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            C28633k1 c28633k3 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                            c28655q2.m87172p0(c28633k3);
                            objM87133R7 = c28633k3;
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        InterfaceC39127r0 interfaceC39127r2 = (InterfaceC39127r0) objM87133R8;
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new b(interfaceC28601c1, c12679m);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                        zM87157i2 = c28655q2.m87157i(c12684r);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c28655q = c28655q2;
                        AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a6, textResource4, list4, interfaceC4339a3, interfaceC28601c8, listOfNumbers, interfaceC28601c7, z19, abstractC27285v2, function6, z16, selectedNumber)), interfaceC39127r2, c28655q, 48);
                        c28655q.m87173q(false);
                        textResource3 = textResource4;
                        list3 = list4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z15 = z19;
                        abstractC27285v1 = abstractC27285v2;
                        function3 = function6;
                        num3 = num4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        abstractC27285v1 = abstractC27285v0;
                        interfaceC4339a2 = interfaceC4339a;
                        function3 = function2;
                        textResource3 = textResource2;
                        list3 = list2;
                        num3 = num2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 12582912;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(selectedNumber)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    } else {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    }
                    num4 = num2;
                    Function1 function7 = function2;
                    textResource4 = textResource2;
                    list4 = list2;
                    boolean z110 = z13;
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        if (list4 != null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R2;
                    if (textResource4 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k4 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k4);
                        objM87133R7 = c28633k4;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r3 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a7, textResource4, list4, interfaceC4339a3, interfaceC28601c10, listOfNumbers, interfaceC28601c9, z110, abstractC27285v2, function7, z16, selectedNumber)), interfaceC39127r3, c28655q, 48);
                    c28655q.m87173q(false);
                    textResource3 = textResource4;
                    list3 = list4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z15 = z110;
                    abstractC27285v1 = abstractC27285v2;
                    function3 = function7;
                    num3 = num4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    abstractC27285v1 = abstractC27285v0;
                    interfaceC4339a2 = interfaceC4339a;
                    function3 = function2;
                    textResource3 = textResource2;
                    list3 = list2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                }
            }
            i15 |= 3072;
            num2 = num;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                        } else {
                            zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                        }
                        if (zM87157i3) {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i29;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(selectedNumber)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        } else {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        }
                        num4 = num2;
                        Function1 function8 = function2;
                        textResource4 = textResource2;
                        list4 = list2;
                        boolean z111 = z13;
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(num4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            if (list4 != null) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            }
                            objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) objM87133R2;
                        if (textResource4 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        c28655q2.m87150e0(-1003410150);
                        c28655q2.m87150e0(212064437);
                        c28655q2.m87173q(false);
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12684r(interfaceC39171c);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c12684r = (C12684r) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C12677k();
                            c28655q2.m87172p0(objM87133R4);
                        }
                        c12677k = (C12677k) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12679m(c12677k);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        c12679m = (C12679m) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            C28633k1 c28633k5 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                            c28655q2.m87172p0(c28633k5);
                            objM87133R7 = c28633k5;
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        InterfaceC39127r0 interfaceC39127r4 = (InterfaceC39127r0) objM87133R8;
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new b(interfaceC28601c1, c12679m);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R9;
                        zM87157i2 = c28655q2.m87157i(c12684r);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c28655q = c28655q2;
                        AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a8, textResource4, list4, interfaceC4339a3, interfaceC28601c12, listOfNumbers, interfaceC28601c11, z111, abstractC27285v2, function8, z16, selectedNumber)), interfaceC39127r4, c28655q, 48);
                        c28655q.m87173q(false);
                        textResource3 = textResource4;
                        list3 = list4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z15 = z111;
                        abstractC27285v1 = abstractC27285v2;
                        function3 = function8;
                        num3 = num4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        abstractC27285v1 = abstractC27285v0;
                        interfaceC4339a2 = interfaceC4339a;
                        function3 = function2;
                        textResource3 = textResource2;
                        list3 = list2;
                        num3 = num2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 12582912;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(selectedNumber)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    } else {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    }
                    num4 = num2;
                    Function1 function9 = function2;
                    textResource4 = textResource2;
                    list4 = list2;
                    boolean z112 = z13;
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        if (list4 != null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R2;
                    if (textResource4 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k6 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k6);
                        objM87133R7 = c28633k6;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r5 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a9, textResource4, list4, interfaceC4339a3, interfaceC28601c14, listOfNumbers, interfaceC28601c13, z112, abstractC27285v2, function9, z16, selectedNumber)), interfaceC39127r5, c28655q, 48);
                    c28655q.m87173q(false);
                    textResource3 = textResource4;
                    list3 = list4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z15 = z112;
                    abstractC27285v1 = abstractC27285v2;
                    function3 = function9;
                    num3 = num4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    abstractC27285v1 = abstractC27285v0;
                    interfaceC4339a2 = interfaceC4339a;
                    function3 = function2;
                    textResource3 = textResource2;
                    list3 = list2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                    } else {
                        zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                    }
                    if (zM87157i3) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i29;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(selectedNumber)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    } else {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    }
                    num4 = num2;
                    Function1 function10 = function2;
                    textResource4 = textResource2;
                    list4 = list2;
                    boolean z113 = z13;
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        if (list4 != null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R2;
                    if (textResource4 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k7 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k7);
                        objM87133R7 = c28633k7;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r6 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a10, textResource4, list4, interfaceC4339a3, interfaceC28601c16, listOfNumbers, interfaceC28601c15, z113, abstractC27285v2, function10, z16, selectedNumber)), interfaceC39127r6, c28655q, 48);
                    c28655q.m87173q(false);
                    textResource3 = textResource4;
                    list3 = list4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z15 = z113;
                    abstractC27285v1 = abstractC27285v2;
                    function3 = function10;
                    num3 = num4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    abstractC27285v1 = abstractC27285v0;
                    interfaceC4339a2 = interfaceC4339a;
                    function3 = function2;
                    textResource3 = textResource2;
                    list3 = list2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                }
            }
            i15 |= 12582912;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(selectedNumber)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                } else {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                }
                num4 = num2;
                Function1 function11 = function2;
                textResource4 = textResource2;
                list4 = list2;
                boolean z114 = z13;
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(num4);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    if (list4 != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c18 = (InterfaceC28601c1) objM87133R2;
                if (textResource4 != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c28655q2.m87150e0(-1003410150);
                c28655q2.m87150e0(212064437);
                c28655q2.m87173q(false);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12684r(interfaceC39171c);
                    c28655q2.m87172p0(objM87133R3);
                }
                c12684r = (C12684r) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12677k();
                    c28655q2.m87172p0(objM87133R4);
                }
                c12677k = (C12677k) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12679m(c12677k);
                    c28655q2.m87172p0(objM87133R6);
                }
                c12679m = (C12679m) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    C28633k1 c28633k8 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    c28655q2.m87172p0(c28633k8);
                    objM87133R7 = c28633k8;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC39127r0 interfaceC39127r7 = (InterfaceC39127r0) objM87133R8;
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new b(interfaceC28601c1, c12679m);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R9;
                zM87157i2 = c28655q2.m87157i(c12684r);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q = c28655q2;
                AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a11, textResource4, list4, interfaceC4339a3, interfaceC28601c18, listOfNumbers, interfaceC28601c17, z114, abstractC27285v2, function11, z16, selectedNumber)), interfaceC39127r7, c28655q, 48);
                c28655q.m87173q(false);
                textResource3 = textResource4;
                list3 = list4;
                interfaceC4339a2 = interfaceC4339a3;
                z15 = z114;
                abstractC27285v1 = abstractC27285v2;
                function3 = function11;
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                abstractC27285v1 = abstractC27285v0;
                interfaceC4339a2 = interfaceC4339a;
                function3 = function2;
                textResource3 = textResource2;
                list3 = list2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
            }
        }
        i15 |= 48;
        list2 = list;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(listOfNumbers)) {
                i34 = 256;
            } else {
                i34 = 128;
            }
            i15 |= i34;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                num2 = num;
                if (c28655q2.m87153g(num2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & 32) != 0) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    } else {
                        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                        } else {
                            zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                        }
                        if (zM87157i3) {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                    }
                    i15 |= i29;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    function2 = function1;
                } else {
                    function2 = function1;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(selectedNumber)) {
                            i28 = 67108864;
                        } else {
                            i28 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        c28655q2.m87140Z();
                        if ((i13 & 1) != 0) {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        } else {
                            if (i35 != 0) {
                                textResource2 = null;
                            }
                            if (i36 != 0) {
                                list2 = null;
                            }
                            if (i16 != 0) {
                                num2 = null;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if ((i14 & 32) != 0) {
                                cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                            } else {
                                cVar = abstractC27285v0;
                            }
                            if (i24 != 0) {
                                function2 = null;
                            }
                            if (i26 != 0) {
                                interfaceC4339a3 = null;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            abstractC27285v2 = cVar;
                        }
                        num4 = num2;
                        Function1 function12 = function2;
                        textResource4 = textResource2;
                        list4 = list2;
                        boolean z115 = z13;
                        c28655q2.m87175r();
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(num4);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            if (list4 != null) {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            } else {
                                textResourceM21267a = AbstractC8693b.m21267a();
                            }
                            objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) objM87133R2;
                        if (textResource4 != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        c28655q2.m87150e0(-1003410150);
                        c28655q2.m87150e0(212064437);
                        c28655q2.m87173q(false);
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12684r(interfaceC39171c);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c12684r = (C12684r) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C12677k();
                            c28655q2.m87172p0(objM87133R4);
                        }
                        c12677k = (C12677k) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12679m(c12677k);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        c12679m = (C12679m) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            C28633k1 c28633k9 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                            c28655q2.m87172p0(c28633k9);
                            objM87133R7 = c28633k9;
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        InterfaceC39127r0 interfaceC39127r8 = (InterfaceC39127r0) objM87133R8;
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new b(interfaceC28601c1, c12679m);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R9;
                        zM87157i2 = c28655q2.m87157i(c12684r);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i2) {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new c(c12684r);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        c28655q = c28655q2;
                        AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a12, textResource4, list4, interfaceC4339a3, interfaceC28601c110, listOfNumbers, interfaceC28601c19, z115, abstractC27285v2, function12, z16, selectedNumber)), interfaceC39127r8, c28655q, 48);
                        c28655q.m87173q(false);
                        textResource3 = textResource4;
                        list3 = list4;
                        interfaceC4339a2 = interfaceC4339a3;
                        z15 = z115;
                        abstractC27285v1 = abstractC27285v2;
                        function3 = function12;
                        num3 = num4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        abstractC27285v1 = abstractC27285v0;
                        interfaceC4339a2 = interfaceC4339a;
                        function3 = function2;
                        textResource3 = textResource2;
                        list3 = list2;
                        num3 = num2;
                        z15 = z13;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                    }
                }
                i15 |= 12582912;
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(selectedNumber)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    } else {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    }
                    num4 = num2;
                    Function1 function13 = function2;
                    textResource4 = textResource2;
                    list4 = list2;
                    boolean z116 = z13;
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c111 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        if (list4 != null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c112 = (InterfaceC28601c1) objM87133R2;
                    if (textResource4 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k10 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k10);
                        objM87133R7 = c28633k10;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r9 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a13, textResource4, list4, interfaceC4339a3, interfaceC28601c112, listOfNumbers, interfaceC28601c111, z116, abstractC27285v2, function13, z16, selectedNumber)), interfaceC39127r9, c28655q, 48);
                    c28655q.m87173q(false);
                    textResource3 = textResource4;
                    list3 = list4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z15 = z116;
                    abstractC27285v1 = abstractC27285v2;
                    function3 = function13;
                    num3 = num4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    abstractC27285v1 = abstractC27285v0;
                    interfaceC4339a2 = interfaceC4339a;
                    function3 = function2;
                    textResource3 = textResource2;
                    list3 = list2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                }
            }
            i15 |= 24576;
            z13 = z4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                    } else {
                        zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                    }
                    if (zM87157i3) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i29;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(selectedNumber)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    } else {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    }
                    num4 = num2;
                    Function1 function14 = function2;
                    textResource4 = textResource2;
                    list4 = list2;
                    boolean z117 = z13;
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        if (list4 != null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c114 = (InterfaceC28601c1) objM87133R2;
                    if (textResource4 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k11 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k11);
                        objM87133R7 = c28633k11;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r10 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a14, textResource4, list4, interfaceC4339a3, interfaceC28601c114, listOfNumbers, interfaceC28601c113, z117, abstractC27285v2, function14, z16, selectedNumber)), interfaceC39127r10, c28655q, 48);
                    c28655q.m87173q(false);
                    textResource3 = textResource4;
                    list3 = list4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z15 = z117;
                    abstractC27285v1 = abstractC27285v2;
                    function3 = function14;
                    num3 = num4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    abstractC27285v1 = abstractC27285v0;
                    interfaceC4339a2 = interfaceC4339a;
                    function3 = function2;
                    textResource3 = textResource2;
                    list3 = list2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                }
            }
            i15 |= 12582912;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(selectedNumber)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                } else {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                }
                num4 = num2;
                Function1 function15 = function2;
                textResource4 = textResource2;
                list4 = list2;
                boolean z118 = z13;
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(num4);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c115 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    if (list4 != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) objM87133R2;
                if (textResource4 != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c28655q2.m87150e0(-1003410150);
                c28655q2.m87150e0(212064437);
                c28655q2.m87173q(false);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12684r(interfaceC39171c);
                    c28655q2.m87172p0(objM87133R3);
                }
                c12684r = (C12684r) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12677k();
                    c28655q2.m87172p0(objM87133R4);
                }
                c12677k = (C12677k) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12679m(c12677k);
                    c28655q2.m87172p0(objM87133R6);
                }
                c12679m = (C12679m) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    C28633k1 c28633k12 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    c28655q2.m87172p0(c28633k12);
                    objM87133R7 = c28633k12;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC39127r0 interfaceC39127r11 = (InterfaceC39127r0) objM87133R8;
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new b(interfaceC28601c1, c12679m);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R9;
                zM87157i2 = c28655q2.m87157i(c12684r);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q = c28655q2;
                AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a15, textResource4, list4, interfaceC4339a3, interfaceC28601c116, listOfNumbers, interfaceC28601c115, z118, abstractC27285v2, function15, z16, selectedNumber)), interfaceC39127r11, c28655q, 48);
                c28655q.m87173q(false);
                textResource3 = textResource4;
                list3 = list4;
                interfaceC4339a2 = interfaceC4339a3;
                z15 = z118;
                abstractC27285v1 = abstractC27285v2;
                function3 = function15;
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                abstractC27285v1 = abstractC27285v0;
                interfaceC4339a2 = interfaceC4339a;
                function3 = function2;
                textResource3 = textResource2;
                list3 = list2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
            }
        }
        i15 |= 3072;
        num2 = num;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & 32) != 0) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                    } else {
                        zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                    }
                    if (zM87157i3) {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                }
                i15 |= i29;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                function2 = function1;
            } else {
                function2 = function1;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(selectedNumber)) {
                        i28 = 67108864;
                    } else {
                        i28 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i28;
                }
                if ((i15 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    c28655q2.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    } else {
                        if (i35 != 0) {
                            textResource2 = null;
                        }
                        if (i36 != 0) {
                            list2 = null;
                        }
                        if (i16 != 0) {
                            num2 = null;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if ((i14 & 32) != 0) {
                            cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                        } else {
                            cVar = abstractC27285v0;
                        }
                        if (i24 != 0) {
                            function2 = null;
                        }
                        if (i26 != 0) {
                            interfaceC4339a3 = null;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        abstractC27285v2 = cVar;
                    }
                    num4 = num2;
                    Function1 function16 = function2;
                    textResource4 = textResource2;
                    list4 = list2;
                    boolean z119 = z13;
                    c28655q2.m87175r();
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(num4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c117 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        if (list4 != null) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        } else {
                            textResourceM21267a = AbstractC8693b.m21267a();
                        }
                        objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c118 = (InterfaceC28601c1) objM87133R2;
                    if (textResource4 != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    c28655q2.m87150e0(-1003410150);
                    c28655q2.m87150e0(212064437);
                    c28655q2.m87173q(false);
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12684r(interfaceC39171c);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c12684r = (C12684r) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12677k();
                        c28655q2.m87172p0(objM87133R4);
                    }
                    c12677k = (C12677k) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12679m(c12677k);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    c12679m = (C12679m) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        C28633k1 c28633k13 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                        c28655q2.m87172p0(c28633k13);
                        objM87133R7 = c28633k13;
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC39127r0 interfaceC39127r12 = (InterfaceC39127r0) objM87133R8;
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c1, c12679m);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R9;
                    zM87157i2 = c28655q2.m87157i(c12684r);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new c(c12684r);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c28655q = c28655q2;
                    AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a16, textResource4, list4, interfaceC4339a3, interfaceC28601c118, listOfNumbers, interfaceC28601c117, z119, abstractC27285v2, function16, z16, selectedNumber)), interfaceC39127r12, c28655q, 48);
                    c28655q.m87173q(false);
                    textResource3 = textResource4;
                    list3 = list4;
                    interfaceC4339a2 = interfaceC4339a3;
                    z15 = z119;
                    abstractC27285v1 = abstractC27285v2;
                    function3 = function16;
                    num3 = num4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    abstractC27285v1 = abstractC27285v0;
                    interfaceC4339a2 = interfaceC4339a;
                    function3 = function2;
                    textResource3 = textResource2;
                    list3 = list2;
                    num3 = num2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
                }
            }
            i15 |= 12582912;
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(selectedNumber)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                } else {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                }
                num4 = num2;
                Function1 function17 = function2;
                textResource4 = textResource2;
                list4 = list2;
                boolean z1110 = z13;
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(num4);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c119 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    if (list4 != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c1110 = (InterfaceC28601c1) objM87133R2;
                if (textResource4 != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c28655q2.m87150e0(-1003410150);
                c28655q2.m87150e0(212064437);
                c28655q2.m87173q(false);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12684r(interfaceC39171c);
                    c28655q2.m87172p0(objM87133R3);
                }
                c12684r = (C12684r) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12677k();
                    c28655q2.m87172p0(objM87133R4);
                }
                c12677k = (C12677k) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12679m(c12677k);
                    c28655q2.m87172p0(objM87133R6);
                }
                c12679m = (C12679m) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    C28633k1 c28633k14 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    c28655q2.m87172p0(c28633k14);
                    objM87133R7 = c28633k14;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC39127r0 interfaceC39127r13 = (InterfaceC39127r0) objM87133R8;
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new b(interfaceC28601c1, c12679m);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R9;
                zM87157i2 = c28655q2.m87157i(c12684r);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q = c28655q2;
                AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a17, textResource4, list4, interfaceC4339a3, interfaceC28601c1110, listOfNumbers, interfaceC28601c119, z1110, abstractC27285v2, function17, z16, selectedNumber)), interfaceC39127r13, c28655q, 48);
                c28655q.m87173q(false);
                textResource3 = textResource4;
                list3 = list4;
                interfaceC4339a2 = interfaceC4339a3;
                z15 = z1110;
                abstractC27285v1 = abstractC27285v2;
                function3 = function17;
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                abstractC27285v1 = abstractC27285v0;
                interfaceC4339a2 = interfaceC4339a;
                function3 = function2;
                textResource3 = textResource2;
                list3 = list2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & 32) != 0) {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i3 = c28655q2.m87153g(abstractC27285v0);
                } else {
                    zM87157i3 = c28655q2.m87157i(abstractC27285v0);
                }
                if (zM87157i3) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
            }
            i15 |= i29;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(selectedNumber)) {
                    i28 = 67108864;
                } else {
                    i28 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i28;
            }
            if ((i15 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                } else {
                    if (i35 != 0) {
                        textResource2 = null;
                    }
                    if (i36 != 0) {
                        list2 = null;
                    }
                    if (i16 != 0) {
                        num2 = null;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if ((i14 & 32) != 0) {
                        cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                    } else {
                        cVar = abstractC27285v0;
                    }
                    if (i24 != 0) {
                        function2 = null;
                    }
                    if (i26 != 0) {
                        interfaceC4339a3 = null;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    abstractC27285v2 = cVar;
                }
                num4 = num2;
                Function1 function18 = function2;
                textResource4 = textResource2;
                list4 = list2;
                boolean z1111 = z13;
                c28655q2.m87175r();
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(num4);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c1111 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    if (list4 != null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    } else {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c1112 = (InterfaceC28601c1) objM87133R2;
                if (textResource4 != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c28655q2.m87150e0(-1003410150);
                c28655q2.m87150e0(212064437);
                c28655q2.m87173q(false);
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12684r(interfaceC39171c);
                    c28655q2.m87172p0(objM87133R3);
                }
                c12684r = (C12684r) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12677k();
                    c28655q2.m87172p0(objM87133R4);
                }
                c12677k = (C12677k) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12679m(c12677k);
                    c28655q2.m87172p0(objM87133R6);
                }
                c12679m = (C12679m) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    C28633k1 c28633k15 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                    c28655q2.m87172p0(c28633k15);
                    objM87133R7 = c28633k15;
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC39127r0 interfaceC39127r14 = (InterfaceC39127r0) objM87133R8;
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new b(interfaceC28601c1, c12679m);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R9;
                zM87157i2 = c28655q2.m87157i(c12684r);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new c(c12684r);
                    c28655q2.m87172p0(objM87133R10);
                }
                c28655q = c28655q2;
                AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a18, textResource4, list4, interfaceC4339a3, interfaceC28601c1112, listOfNumbers, interfaceC28601c1111, z1111, abstractC27285v2, function18, z16, selectedNumber)), interfaceC39127r14, c28655q, 48);
                c28655q.m87173q(false);
                textResource3 = textResource4;
                list3 = list4;
                interfaceC4339a2 = interfaceC4339a3;
                z15 = z1111;
                abstractC27285v1 = abstractC27285v2;
                function3 = function18;
                num3 = num4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                abstractC27285v1 = abstractC27285v0;
                interfaceC4339a2 = interfaceC4339a;
                function3 = function2;
                textResource3 = textResource2;
                list3 = list2;
                num3 = num2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
            }
        }
        i15 |= 12582912;
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87157i(selectedNumber)) {
                i28 = 67108864;
            } else {
                i28 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i28;
        }
        if ((i15 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if (i35 != 0) {
                    textResource2 = null;
                }
                if (i36 != 0) {
                    list2 = null;
                }
                if (i16 != 0) {
                    num2 = null;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if ((i14 & 32) != 0) {
                    cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                } else {
                    cVar = abstractC27285v0;
                }
                if (i24 != 0) {
                    function2 = null;
                }
                if (i26 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                abstractC27285v2 = cVar;
            } else {
                if (i35 != 0) {
                    textResource2 = null;
                }
                if (i36 != 0) {
                    list2 = null;
                }
                if (i16 != 0) {
                    num2 = null;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if ((i14 & 32) != 0) {
                    cVar = new AbstractC27285v0.c(EnumC27251e1.FIXED, null, 2, null);
                } else {
                    cVar = abstractC27285v0;
                }
                if (i24 != 0) {
                    function2 = null;
                }
                if (i26 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                abstractC27285v2 = cVar;
            }
            num4 = num2;
            Function1 function19 = function2;
            textResource4 = textResource2;
            list4 = list2;
            boolean z1112 = z13;
            c28655q2.m87175r();
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(num4);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1113 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                if (list4 != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                objM87133R2 = AbstractC28683x.m87272z(textResourceM21267a);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1114 = (InterfaceC28601c1) objM87133R2;
            if (textResource4 != null) {
                z16 = false;
            } else {
                z16 = false;
            }
            c28655q2.m87150e0(-1003410150);
            c28655q2.m87150e0(212064437);
            c28655q2.m87173q(false);
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C12684r(interfaceC39171c);
                c28655q2.m87172p0(objM87133R3);
            }
            c12684r = (C12684r) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C12677k();
                c28655q2.m87172p0(objM87133R4);
            }
            c12677k = (C12677k) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C12679m(c12677k);
                c28655q2.m87172p0(objM87133R6);
            }
            c12679m = (C12679m) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                C28633k1 c28633k16 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                c28655q2.m87172p0(c28633k16);
                objM87133R7 = c28633k16;
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
            zM87157i = c28655q2.m87157i(c12684r) | c28655q2.m87149e(257);
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R8);
            }
            InterfaceC39127r0 interfaceC39127r15 = (InterfaceC39127r0) objM87133R8;
            objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new b(interfaceC28601c1, c12679m);
                c28655q2.m87172p0(objM87133R9);
            }
            InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R9;
            zM87157i2 = c28655q2.m87157i(c12684r);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R10 = new c(c12684r);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new c(c12684r);
                c28655q2.m87172p0(objM87133R10);
            }
            c28655q = c28655q2;
            AbstractC39125q1.m124655a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R10), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a19, textResource4, list4, interfaceC4339a3, interfaceC28601c1114, listOfNumbers, interfaceC28601c1113, z1112, abstractC27285v2, function19, z16, selectedNumber)), interfaceC39127r15, c28655q, 48);
            c28655q.m87173q(false);
            textResource3 = textResource4;
            list3 = list4;
            interfaceC4339a2 = interfaceC4339a3;
            z15 = z1112;
            abstractC27285v1 = abstractC27285v2;
            function3 = function19;
            num3 = num4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            abstractC27285v1 = abstractC27285v0;
            interfaceC4339a2 = interfaceC4339a;
            function3 = function2;
            textResource3 = textResource2;
            list3 = list2;
            num3 = num2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23108i(textResource3, list3, listOfNumbers, num3, z15, abstractC27285v1, function3, interfaceC4339a2, selectedNumber, i13, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static final void m128259l(C18282h range, Integer num, boolean z4, InterfaceC4339a interfaceC4339a, Function1 selectedNumber, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        Integer num2;
        boolean z14;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z15;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(selectedNumber, "selectedNumber");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-765718093);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(range) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(num) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i17 != 0) {
                    num = null;
                }
                if (i18 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                if (i19 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                int i24 = (i15 << 6) & 64512;
                int i25 = i15 << 12;
                Integer num3 = num;
                m128258k(null, null, AbstractC25265s.m74093D1(range), num3, z15, null, null, interfaceC4339a4, selectedNumber, c28655q, i24 | (29360128 & i25) | (i25 & 234881024), 99);
                num2 = num3;
                z14 = z15;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                num2 = num;
                z14 = z4;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(range, num2, z14, interfaceC4339a3, selectedNumber, i13, i14, 7);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(selectedNumber)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i17 != 0) {
                num = null;
            }
            if (i18 != 0) {
                z15 = true;
            } else {
                z15 = z4;
            }
            if (i19 != 0) {
                interfaceC4339a4 = null;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            int i26 = (i15 << 6) & 64512;
            int i27 = i15 << 12;
            Integer num4 = num;
            m128258k(null, null, AbstractC25265s.m74093D1(range), num4, z15, null, null, interfaceC4339a4, selectedNumber, c28655q, i26 | (29360128 & i27) | (i27 & 234881024), 99);
            num2 = num4;
            z14 = z15;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            num2 = num;
            z14 = z4;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(range, num2, z14, interfaceC4339a3, selectedNumber, i13, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m128260m(C18284j range, Integer num, boolean z4, InterfaceC4339a interfaceC4339a, Function1 selectedNumber, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        Integer num2;
        boolean z14;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        boolean z15;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(selectedNumber, "selectedNumber");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1371973301);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(range) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(num) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(selectedNumber)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i17 != 0) {
                    num = null;
                }
                if (i18 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                if (i19 != 0) {
                    interfaceC4339a4 = null;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                int i24 = (i15 << 6) & 64512;
                int i25 = i15 << 12;
                Integer num3 = num;
                m128258k(null, null, AbstractC25265s.m74093D1(range), num3, z15, null, null, interfaceC4339a4, selectedNumber, c28655q, i24 | (29360128 & i25) | (i25 & 234881024), 99);
                num2 = num3;
                z14 = z15;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                num2 = num;
                z14 = z4;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(range, num2, z14, interfaceC4339a3, selectedNumber, i13, i14, 6);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(selectedNumber)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i17 != 0) {
                num = null;
            }
            if (i18 != 0) {
                z15 = true;
            } else {
                z15 = z4;
            }
            if (i19 != 0) {
                interfaceC4339a4 = null;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            int i26 = (i15 << 6) & 64512;
            int i27 = i15 << 12;
            Integer num4 = num;
            m128258k(null, null, AbstractC25265s.m74093D1(range), num4, z15, null, null, interfaceC4339a4, selectedNumber, c28655q, i26 | (29360128 & i27) | (i27 & 234881024), 99);
            num2 = num4;
            z14 = z15;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            num2 = num;
            z14 = z4;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(range, num2, z14, interfaceC4339a3, selectedNumber, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m128261n(TextResource textResource, List list, List list2, Integer num, boolean z4, AbstractC27285v0 abstractC27285v0, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m128258k(textResource, list, list2, num, z4, abstractC27285v0, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m128262o(C18282h c18282h, Integer num, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128259l(c18282h, num, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m128263p(C18284j c18284j, Integer num, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m128260m(c18284j, num, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final TextResource m128266s(int i13, boolean z4, boolean z13) {
        return (!z4 || z13) ? new TextResource.C8691e(String.valueOf(i13)) : new TextResource.C8688b(AbstractC16277f.f62392w1, new TextResource.AbstractC8690d.b(Integer.valueOf(i13)));
    }

    /* JADX INFO: renamed from: t */
    private static final long m128267t(boolean z4, boolean z13, Composer composer, int i13) {
        if (!z4 || z13) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-778214539);
            long jM125317c = C38070b.f163049a.m121943a(c28655q, 6).getAffirmative();
            c28655q.m87173q(false);
            return jM125317c;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-778258280);
        long jM125318d = C38070b.f163049a.m121943a(c28655q2, 6).getNegative();
        c28655q2.m87173q(false);
        return jM125318d;
    }
}
