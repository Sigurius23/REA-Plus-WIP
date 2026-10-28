package uw0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bs1.C3601t;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dn0.C12211k;
import fc0.C14359c;
import gb1.AbstractC15676d;
import hy0.AbstractC17755i2;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import ih0.AbstractC18489d0;
import java.util.List;
import km0.AbstractC22578b;
import km0.AbstractC22579c;
import km0.C22577a;
import km0.C22580d;
import km0.C22581e;
import km0.C22583g;
import kotlin.C2000e1;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p095dp.AbstractC12240d;
import p163g1.C15199y3;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39185q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import p745y81.InterfaceC39332e;
import pw0.AbstractC29584a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud0.C34789b;
import uk2.C35051a;
import v41.AbstractC35664f;
import wb3.AbstractC37056f;
import x31.AbstractC37947f;
import x81.C38072d;

/* JADX INFO: renamed from: uw0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a£\u0001\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aY\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aa\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010%\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+¨\u0006-²\u0006\f\u0010,\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkm0/e;", "viewState", "", "selectedIndex", "Lbc3/c0;", "coroutineScope", "Lv41/f$a;", "bottomSheetState", "", "dismissOnSave", "sendFocusChangedEvent", "Lkotlin/Function1;", "", "Ll83/a0;", "onToggleItem", "Lkotlin/Function0;", "onSaveBottomSheetCtaClicked", "onChangeCategory", "onUpdateSearchQuery", "onSearchFieldFocusChanged", "o", "(Lkm0/e;ILbc3/c0;Lv41/f$a;ZZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lg2/i;", "focusManager", "z", "(Landroidx/compose/ui/Modifier;Lkm0/e;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lg2/i;Landroidx/compose/runtime/Composer;II)V", "C", "(Landroidx/compose/ui/Modifier;Lkm0/e;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lg2/i;Landroidx/compose/runtime/Composer;II)V", "", "Lkm0/g;", "groupedToggles", "Ly81/e;", "activeColor", "Lm91/u;", "customBehaviorsWidget", "t", "(Ljava/util/List;Ly81/e;Lm91/u;Lkotlin/jvm/functions/Function1;Lg2/i;Landroidx/compose/runtime/Composer;I)V", "Ln0/u;", "listState", "Lt2/a;", "I", "(Ln0/u;)Lt2/a;", "isScrolling", "custombottomsheet_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35302l {

    /* JADX INFO: renamed from: uw0.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetContentKt$CustomBottomSheetContent$2$2$1$1", m100430f = "CustomBottomSheetContent.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150335w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f150336x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35664f.a aVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150336x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f150336x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150335w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f150336x.getModalBottomSheetState();
                this.f150335w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetContentKt$GroupedTogglesList$1$1", m100430f = "CustomBottomSheetContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC15237i f150338x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f150339y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC15237i interfaceC15237i, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150338x = interfaceC15237i;
            this.f150339y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f150338x, this.f150339y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150337w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC35302l.m112037v(this.f150339y)) {
                ((C15240l) this.f150338x).m43339b(false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC15237i f150340w;

        public c(InterfaceC15237i interfaceC15237i) {
            this.f150340w = interfaceC15237i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m112043b(InterfaceC15237i interfaceC15237i, C16617b c16617b) {
            ((C15240l) interfaceC15237i).m43339b(false);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C35303m(this.f150340w, 0), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f150341w;

        public d(Function1 function1) {
            this.f150341w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m112044a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            if (event instanceof AbstractC22579c.a) {
                this.f150341w.invoke(((AbstractC22579c.a) event).getId());
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m112044a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f150342w = new e();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22583g c22583g) {
            return null;
        }
    }

    /* JADX INFO: renamed from: uw0.l$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f150343w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f150344x;

        public f(Function1 function1, List list) {
            this.f150343w = function1;
            this.f150344x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m112046a(int i13) {
            return this.f150343w.invoke(this.f150344x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m112046a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: uw0.l$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f150345w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC39332e f150346x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f150347y;

        public g(List list, InterfaceC39332e interfaceC39332e, Function1 function1) {
            this.f150345w = list;
            this.f150346x = interfaceC39332e;
            this.f150347y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m112047a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            C28655q c28655q;
            TextResource textResourceM21278l;
            int i15 = (i14 & 6) == 0 ? i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) : i14;
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q2 = (C28655q) composer;
            if (!c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q2.m87138X();
                return;
            }
            C22583g c22583g = (C22583g) this.f150345w.get(i13);
            c28655q2.m87150e0(-820230738);
            InterfaceC25312u interfaceC25312uM65436a = c22583g.getEmptyState();
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC25312uM65436a == null) {
                c28655q2.m87150e0(-820256997);
                c28655q2.m87173q(false);
                float f13 = 4;
                float f14 = f13 * f13;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7);
                if (AbstractC8693b.m21270d(c22583g.getTitle())) {
                    c28655q2.m87150e0(-819900496);
                    c28655q2.m87173q(false);
                    textResourceM21278l = c22583g.getTitle();
                } else {
                    c28655q2.m87150e0(-819841875);
                    textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC29584a.f120741a));
                    c28655q2.m87173q(false);
                }
                AbstractC17755i2.m50938j(modifierM3398t, null, null, textResourceM21278l, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite50(), 0L, null, c28655q2, (TextResource.$stable << 9) | 6, 214);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                c28655q.m87150e0(1220488850);
                for (C22580d c22580d : c22583g.m65438c()) {
                    C22577a c22577a = new C22577a(c22580d.getId(), c22580d.getTitle(), c22580d.getIsSelected(), c22580d.getIcon(), c22580d.getSubtitle(), this.f150346x, c22580d.getTag(), c22580d.m65413e());
                    boolean zM87153g = c28655q.m87153g(this.f150347y);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new d(this.f150347y);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC22578b.m65404d(c22577a, null, (Function1) objM87133R, c28655q, C22577a.f88844i, 2);
                }
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(-820256996);
                float f15 = 4;
                AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q2);
                AbstractC25303l.m74291r(interfaceC25312uM65436a, null, null, null, c28655q2, 0, 14);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m112047a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$h */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetContentKt$SetupPagedGroupedToggles$1$1", m100430f = "CustomBottomSheetContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150348w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f150349x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC29701y f150350y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, AbstractC29701y abstractC29701y, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150349x = function1;
            this.f150350y = abstractC29701y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f150349x, this.f150350y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150348w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f150349x.invoke(new Integer(this.f150350y.m91162k()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC15237i f150351w;

        public i(InterfaceC15237i interfaceC15237i) {
            this.f150351w = interfaceC15237i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m112049b(InterfaceC15237i interfaceC15237i, C16617b c16617b) {
            ((C15240l) interfaceC15237i).m43339b(false);
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C35303m(this.f150351w, 1), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$j */
    @InterfaceC32271e(m100429c = "com.whoop.custombottomsheet.view.CustomBottomSheetContentKt$SetupPagedGroupedToggles$3$1$1", m100430f = "CustomBottomSheetContent.kt", m100431l = {202}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150352w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f150353x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f150354y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC29701y f150355z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function1 function1, int i13, AbstractC29701y abstractC29701y, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150353x = function1;
            this.f150354y = i13;
            this.f150355z = abstractC29701y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f150353x, this.f150354y, this.f150355z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150352w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f150353x.invoke(new Integer(this.f150354y));
                AbstractC29701y abstractC29701y = this.f150355z;
                int i14 = this.f150354y;
                this.f150352w = 1;
                if (AbstractC29701y.m91155g(abstractC29701y, i14, null, this, 6) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uw0.l$k */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"uw0/l$k", "Lt2/a;", "Lh2/b;", "available", "", "source", "l0", "(JI)J", "consumed", "J", "(JJI)J", "Ly3/q;", "p0", "(JLq83/d;)Ljava/lang/Object;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC33313a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C26068u f150356w;

        public k(C26068u c26068u) {
            this.f150356w = c26068u;
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: J */
        public long mo9761J(long consumed, long available, int source) {
            boolean zMo39182c = this.f150356w.mo39182c();
            boolean z4 = Float.intBitsToFloat((int) (4294967295L & available)) > 0.0f;
            if (zMo39182c || !z4) {
                return 0L;
            }
            return available;
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: V */
        public Object mo9762V(long j7, long j13, InterfaceC30057d<? super C39185q> interfaceC30057d) {
            return new C39185q(0L);
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: l0 */
        public long mo29341l0(long available, int source) {
            boolean zMo39182c = this.f150356w.mo39182c();
            boolean z4 = Float.intBitsToFloat((int) (4294967295L & available)) > 0.0f;
            if (zMo39182c || !z4) {
                return 0L;
            }
            return available;
        }

        @Override // p492t2.InterfaceC33313a
        /* JADX INFO: renamed from: p0 */
        public Object mo29342p0(long j7, InterfaceC30057d<? super C39185q> interfaceC30057d) {
            boolean zMo39182c = this.f150356w.mo39182c();
            boolean z4 = C39185q.m124814e(j7) > 0.0f;
            if (zMo39182c || !z4) {
                j7 = 0;
            }
            return new C39185q(j7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m112007A(InterfaceC15237i interfaceC15237i, Function1 function1, int i13) {
        ((C15240l) interfaceC15237i).m43339b(false);
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m112008B(Modifier modifier, C22581e c22581e, int i13, Function1 function1, Function1 function2, InterfaceC15237i interfaceC15237i, int i14, int i15, Composer composer, int i16) {
        m112041z(modifier, c22581e, i13, function1, function2, interfaceC15237i, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m112009C(Modifier modifier, final C22581e c22581e, final int i13, final InterfaceC2994c0 interfaceC2994c0, final Function1 function1, final Function1 function2, final InterfaceC15237i interfaceC15237i, Composer composer, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        C28655q c28655q;
        final Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-118883711);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q2.m87153g(c22581e) : c28655q2.m87157i(c22581e) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87157i(interfaceC2994c0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q2.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i16 |= c28655q2.m87157i(interfaceC15237i) ? 1048576 : 524288;
        }
        int i18 = i16;
        if (c28655q2.m87135U(i18 & 1, (599187 & i18) != 599186)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            boolean z4 = (i18 & 112) == 32 || ((i18 & 64) != 0 && c28655q2.m87157i(c22581e));
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C35300j(c22581e, 0);
                c28655q2.m87172p0(objM87133R);
            }
            int i19 = (i18 >> 6) & 14;
            C29674b c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, i13, i19 | 48, c28655q2, 0);
            Integer numValueOf = Integer.valueOf(c29674bM91150b.m91162k());
            int i24 = i18 & 57344;
            boolean zM87153g = (i24 == 16384) | c28655q2.m87153g(c29674bM91150b);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new h(function1, c29674bM91150b, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, numValueOf);
            List<TextResource> listM65420e = c22581e.m65420e();
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 1.5d) * 8, 1);
            boolean zM87157i = c28655q2.m87157i(interfaceC15237i);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new i(interfaceC15237i);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM3396r, C23454a0.f92919a, (PointerInputEventHandler) objM87133R3);
            EnumC2888c enumC2888c = EnumC2888c.SH5;
            boolean zM87157i2 = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87157i(interfaceC2994c0) | (i24 == 16384) | c28655q2.m87153g(c29674bM91150b);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                C31915d c31915d = new C31915d(interfaceC15237i, interfaceC2994c0, function1, c29674bM91150b, 15);
                c28655q2.m87172p0(c31915d);
                objM87133R4 = c31915d;
            }
            AbstractC37947f.m121524r(i13, listM65420e, modifierM108903b, null, enumC2888c, (Function1) objM87133R4, c28655q2, i19 | 24576, 8);
            Modifier modifier5 = modifier4;
            AbstractC12240d.m34066d(c29674bM91150b, modifier5, null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(-1249937406, c28655q2, new C14359c(c22581e, function2, interfaceC15237i, 8)), c28655q2, (i18 << 3) & 112, 24576, 16380);
            c28655q = c28655q2;
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: uw0.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35302l.m112013G(modifier3, c22581e, i13, interfaceC2994c0, function1, function2, interfaceC15237i, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final int m112010D(C22581e c22581e) {
        return c22581e.m65420e().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m112011E(InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC29701y abstractC29701y, int i13) {
        ((C15240l) interfaceC15237i).m43339b(false);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new j(function1, i13, abstractC29701y, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m112012F(C22581e c22581e, Function1 function1, InterfaceC15237i interfaceC15237i, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        m112035t(c22581e.m65425j().get(i13), c22581e.getActiveColor(), c22581e.getCustomBehaviorsWidget(), function1, interfaceC15237i, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m112013G(Modifier modifier, C22581e c22581e, int i13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, InterfaceC15237i interfaceC15237i, int i14, int i15, Composer composer, int i16) {
        m112009C(modifier, c22581e, i13, interfaceC2994c0, function1, function2, interfaceC15237i, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    public static final InterfaceC33313a m112015I(C26068u listState) {
        AbstractC22676k.m65750j(listState, "listState");
        return new k(listState);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x015f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0162  */
    /* JADX WARN: Code duplicated, block: B:111:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x016b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:118:0x0180  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0202  */
    /* JADX WARN: Code duplicated, block: B:131:0x0204  */
    /* JADX WARN: Code duplicated, block: B:135:0x020d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0261  */
    /* JADX WARN: Code duplicated, block: B:141:0x026e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0278  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x0331  */
    /* JADX WARN: Code duplicated, block: B:157:0x0333  */
    /* JADX WARN: Code duplicated, block: B:160:0x033a  */
    /* JADX WARN: Code duplicated, block: B:161:0x033c  */
    /* JADX WARN: Code duplicated, block: B:164:0x034b  */
    /* JADX WARN: Code duplicated, block: B:166:0x034f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0358  */
    /* JADX WARN: Code duplicated, block: B:171:0x035c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0366  */
    /* JADX WARN: Code duplicated, block: B:177:0x036a  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX INFO: renamed from: o */
    public static final void m112030o(final C22581e viewState, final int i13, InterfaceC2994c0 coroutineScope, AbstractC35664f.a bottomSheetState, boolean z4, boolean z13, final Function1 onToggleItem, final InterfaceC4339a onSaveBottomSheetCtaClicked, final Function1 onChangeCategory, final Function1 onUpdateSearchQuery, Function1 function1, Composer composer, final int i14, final int i15, final int i16) {
        int i17;
        int i18;
        final boolean z14;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        final InterfaceC2994c0 interfaceC2994c0;
        final AbstractC35664f.a aVar;
        final Function1 function2;
        C28655q c28655q;
        final boolean z16;
        C28677v1 c28677v1M87180u;
        boolean z17;
        C28676v0 c28676v0;
        Function1 function3;
        InterfaceC15237i interfaceC15237i;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z18;
        Object objM87133R;
        int i29;
        boolean z19;
        C28676v0 c28676v1;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objM87133R2;
        Object objM87133R3;
        int i34;
        int i35;
        int i36;
        int i37;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(bottomSheetState, "bottomSheetState");
        AbstractC22676k.m65750j(onToggleItem, "onToggleItem");
        AbstractC22676k.m65750j(onSaveBottomSheetCtaClicked, "onSaveBottomSheetCtaClicked");
        AbstractC22676k.m65750j(onChangeCategory, "onChangeCategory");
        AbstractC22676k.m65750j(onUpdateSearchQuery, "onUpdateSearchQuery");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1495777342);
        if ((i14 & 6) == 0) {
            i17 = ((i14 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i18 = i13;
            i17 |= c28655q2.m87149e(i18) ? 32 : 16;
        } else {
            i18 = i13;
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87157i(coroutineScope) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= (i14 & 4096) == 0 ? c28655q2.m87153g(bottomSheetState) : c28655q2.m87157i(bottomSheetState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i38 = i16 & 16;
        if (i38 == 0) {
            if ((i14 & 24576) == 0) {
                z14 = z4;
                i17 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i19 = i16 & 32;
            if (i19 != 0) {
                i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87155h(z13)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i17 |= i24;
            }
            if ((i14 & 1572864) == 0) {
                if (c28655q2.m87157i(onToggleItem)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i17 |= i37;
            }
            if ((i14 & 12582912) == 0) {
                if (c28655q2.m87157i(onSaveBottomSheetCtaClicked)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i17 |= i36;
            }
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87157i(onChangeCategory)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i17 |= i35;
            }
            if ((i14 & 805306368) == 0) {
                if (c28655q2.m87157i(onUpdateSearchQuery)) {
                    i34 = 536870912;
                } else {
                    i34 = 268435456;
                }
                i17 |= i34;
            }
            i25 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i25 != 0) {
                i26 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i15 | i27;
            } else {
                i26 = i15;
            }
            i28 = i17;
            if ((i17 & 306783379) == 306783378 || (i26 & 3) != 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i28 & 1, z15)) {
                if (i38 != 0) {
                    z14 = true;
                }
                if (i19 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35051a(19);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1102d.m3406c(0.9f, c2314t)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66720i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                TextResource textResourceM65428m = viewState.getSearchQuery();
                TextResource textResourceM65429n = viewState.getSearchTitle();
                if ((i28 & 1879048192) == 536870912) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z18 || objM87133R == c28676v0) {
                    objM87133R = new C35298h(onUpdateSearchQuery, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                int i39 = TextResource.$stable;
                i29 = i28 >> 9;
                AbstractC17795v0.m51127j(null, textResourceM65428m, textResourceM65429n, null, 0L, 0, false, null, 0L, false, null, false, z17, function3, (Function1) objM87133R, c28655q2, (i39 << 3) | (i39 << 6), (i29 & 896) | ((i26 << 9) & 7168), 4089);
                boolean z29 = z17;
                Function1 function4 = function3;
                if (viewState.m65425j().isEmpty()) {
                    c28655q2.m87150e0(-1776247072);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    int i44 = i28 << 3;
                    m112041z(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), viewState, i18, onToggleItem, onChangeCategory, interfaceC15237i, c28655q2, (i29 & 7168) | (C22581e.f88865n << 3) | (i44 & 112) | (i44 & 896) | ((i28 >> 12) & 57344), 0);
                    c28655q2.m87173q(false);
                    interfaceC2994c0 = coroutineScope;
                    c28676v1 = c28676v0;
                    z19 = z14;
                    z24 = false;
                } else {
                    boolean z34 = z14;
                    c28655q2.m87150e0(-1775908118);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    int i45 = i28 << 3;
                    z19 = z34;
                    c28676v1 = c28676v0;
                    z24 = false;
                    interfaceC2994c0 = coroutineScope;
                    m112009C(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), viewState, i13, interfaceC2994c0, onChangeCategory, onToggleItem, interfaceC15237i, c28655q2, (C22581e.f88865n << 3) | (i45 & 112) | (i45 & 896) | (i45 & 7168) | ((i28 >> 12) & 57344) | ((i28 >> 3) & 458752), 0);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                TextResource textResourceM65419d = viewState.getButtonTitle();
                Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t, 0.0f, 5 * 4, 0.0f, 0.0f, 13), "Save_Selection_Button");
                if ((i28 & 29360128) == 8388608) {
                    z25 = true;
                } else {
                    z25 = z24;
                }
                if ((i28 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = z24;
                }
                boolean zM87157i = z26 | z25 | c28655q2.m87157i(interfaceC2994c0);
                if ((i28 & 7168) != 2048) {
                    if ((i28 & 4096) != 0) {
                        aVar = bottomSheetState;
                        if (c28655q2.m87157i(aVar)) {
                        }
                        z28 = zM87157i | z27;
                        objM87133R2 = c28655q2.m87133R();
                        if (z28 || objM87133R2 == c28676v1) {
                            objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        z14 = z19;
                        AbstractC27292z.m82343j(modifierM44101d, false, false, null, null, null, textResourceM65419d, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i39 << 18, 0, 8126);
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        z16 = z29;
                        function2 = function4;
                    } else {
                        aVar = bottomSheetState;
                    }
                    z27 = z24;
                    z28 = zM87157i | z27;
                    objM87133R2 = c28655q2.m87133R();
                    if (z28) {
                        objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z14 = z19;
                    AbstractC27292z.m82343j(modifierM44101d, false, false, null, null, null, textResourceM65419d, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i39 << 18, 0, 8126);
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    z16 = z29;
                    function2 = function4;
                } else {
                    aVar = bottomSheetState;
                }
                z27 = true;
                z28 = zM87157i | z27;
                objM87133R2 = c28655q2.m87133R();
                if (z28) {
                    objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                    c28655q2.m87172p0(objM87133R2);
                }
                z14 = z19;
                AbstractC27292z.m82343j(modifierM44101d, false, false, null, null, null, textResourceM65419d, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i39 << 18, 0, 8126);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                z16 = z29;
                function2 = function4;
            } else {
                interfaceC2994c0 = coroutineScope;
                aVar = bottomSheetState;
                c28655q2.m87138X();
                function2 = function1;
                c28655q = c28655q2;
                z16 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: uw0.i
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC35302l.m112034s(viewState, i13, interfaceC2994c0, aVar, z14, z16, onToggleItem, onSaveBottomSheetCtaClicked, onChangeCategory, onUpdateSearchQuery, function2, i14, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= 24576;
        z14 = z4;
        i19 = i16 & 32;
        if (i19 != 0) {
            i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87155h(z13)) {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i17 |= i24;
        }
        if ((i14 & 1572864) == 0) {
            if (c28655q2.m87157i(onToggleItem)) {
                i37 = 1048576;
            } else {
                i37 = 524288;
            }
            i17 |= i37;
        }
        if ((i14 & 12582912) == 0) {
            if (c28655q2.m87157i(onSaveBottomSheetCtaClicked)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i17 |= i36;
        }
        if ((i14 & 100663296) == 0) {
            if (c28655q2.m87157i(onChangeCategory)) {
                i35 = 67108864;
            } else {
                i35 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i17 |= i35;
        }
        if ((i14 & 805306368) == 0) {
            if (c28655q2.m87157i(onUpdateSearchQuery)) {
                i34 = 536870912;
            } else {
                i34 = 268435456;
            }
            i17 |= i34;
        }
        i25 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i25 != 0) {
            i26 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (c28655q2.m87157i(function1)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i15 | i27;
        } else {
            i26 = i15;
        }
        i28 = i17;
        if ((i17 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (c28655q2.m87135U(i28 & 1, z15)) {
            if (i38 != 0) {
                z14 = true;
            }
            if (i19 != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C35051a(19);
                    c28655q2.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function1;
            }
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC1102d.m3406c(0.9f, c2314t2)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66720i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            TextResource textResourceM65428m2 = viewState.getSearchQuery();
            TextResource textResourceM65429n2 = viewState.getSearchTitle();
            if ((i28 & 1879048192) == 536870912) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z18) {
                objM87133R = new C35298h(onUpdateSearchQuery, 0);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C35298h(onUpdateSearchQuery, 0);
                c28655q2.m87172p0(objM87133R);
            }
            int i310 = TextResource.$stable;
            i29 = i28 >> 9;
            AbstractC17795v0.m51127j(null, textResourceM65428m2, textResourceM65429n2, null, 0L, 0, false, null, 0L, false, null, false, z17, function3, (Function1) objM87133R, c28655q2, (i310 << 3) | (i310 << 6), (i29 & 896) | ((i26 << 9) & 7168), 4089);
            boolean z210 = z17;
            Function1 function5 = function3;
            if (viewState.m65425j().isEmpty()) {
                c28655q2.m87150e0(-1776247072);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                int i46 = i28 << 3;
                m112041z(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), viewState, i18, onToggleItem, onChangeCategory, interfaceC15237i, c28655q2, (i29 & 7168) | (C22581e.f88865n << 3) | (i46 & 112) | (i46 & 896) | ((i28 >> 12) & 57344), 0);
                c28655q2.m87173q(false);
                interfaceC2994c0 = coroutineScope;
                c28676v1 = c28676v0;
                z19 = z14;
                z24 = false;
            } else {
                boolean z35 = z14;
                c28655q2.m87150e0(-1775908118);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                int i47 = i28 << 3;
                z19 = z35;
                c28676v1 = c28676v0;
                z24 = false;
                interfaceC2994c0 = coroutineScope;
                m112009C(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), viewState, i13, interfaceC2994c0, onChangeCategory, onToggleItem, interfaceC15237i, c28655q2, (C22581e.f88865n << 3) | (i47 & 112) | (i47 & 896) | (i47 & 7168) | ((i28 >> 12) & 57344) | ((i28 >> 3) & 458752), 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            TextResource textResourceM65419d2 = viewState.getButtonTitle();
            Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(c2314t2, 0.0f, 5 * 4, 0.0f, 0.0f, 13), "Save_Selection_Button");
            if ((i28 & 29360128) == 8388608) {
                z25 = true;
            } else {
                z25 = z24;
            }
            if ((i28 & 57344) == 16384) {
                z26 = true;
            } else {
                z26 = z24;
            }
            boolean zM87157i2 = z26 | z25 | c28655q2.m87157i(interfaceC2994c0);
            if ((i28 & 7168) != 2048) {
                if ((i28 & 4096) != 0) {
                    aVar = bottomSheetState;
                    if (c28655q2.m87157i(aVar)) {
                    }
                    z28 = zM87157i2 | z27;
                    objM87133R2 = c28655q2.m87133R();
                    if (z28) {
                        objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    z14 = z19;
                    AbstractC27292z.m82343j(modifierM44101d2, false, false, null, null, null, textResourceM65419d2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i310 << 18, 0, 8126);
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    z16 = z210;
                    function2 = function5;
                } else {
                    aVar = bottomSheetState;
                }
                z27 = z24;
                z28 = zM87157i2 | z27;
                objM87133R2 = c28655q2.m87133R();
                if (z28) {
                    objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                    c28655q2.m87172p0(objM87133R2);
                }
                z14 = z19;
                AbstractC27292z.m82343j(modifierM44101d2, false, false, null, null, null, textResourceM65419d2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i310 << 18, 0, 8126);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                z16 = z210;
                function2 = function5;
            } else {
                aVar = bottomSheetState;
            }
            z27 = true;
            z28 = zM87157i2 | z27;
            objM87133R2 = c28655q2.m87133R();
            if (z28) {
                objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C12211k(onSaveBottomSheetCtaClicked, z19, interfaceC2994c0, aVar);
                c28655q2.m87172p0(objM87133R2);
            }
            z14 = z19;
            AbstractC27292z.m82343j(modifierM44101d2, false, false, null, null, null, textResourceM65419d2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q2, i310 << 18, 0, 8126);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            z16 = z210;
            function2 = function5;
        } else {
            interfaceC2994c0 = coroutineScope;
            aVar = bottomSheetState;
            c28655q2.m87138X();
            function2 = function1;
            c28655q = c28655q2;
            z16 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: uw0.i
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35302l.m112034s(viewState, i13, interfaceC2994c0, aVar, z14, z16, onToggleItem, onSaveBottomSheetCtaClicked, onChangeCategory, onUpdateSearchQuery, function2, i14, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m112031p(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m112032q(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC17801x0.a.f69231a)) {
            function1.invoke("");
        } else if (event instanceof AbstractC17801x0.c) {
            function1.invoke(((AbstractC17801x0.c) event).getNewText());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m112033r(InterfaceC4339a interfaceC4339a, boolean z4, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        interfaceC4339a.invoke();
        if (z4) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(aVar, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m112034s(C22581e c22581e, int i13, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, boolean z4, boolean z13, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, Function1 function3, Function1 function4, int i14, int i15, int i16, Composer composer, int i17) {
        m112030o(c22581e, i13, interfaceC2994c0, aVar, z4, z13, function1, interfaceC4339a, function2, function3, function4, composer, AbstractC28683x.m87244L(i14 | 1), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m112035t(List<C22583g> list, InterfaceC39332e interfaceC39332e, InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC15237i interfaceC15237i, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-190713824);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC39332e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC25312u) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            function2 = function1;
            i14 |= c28655q2.m87157i(function2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function2 = function1;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(interfaceC15237i) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C35295e(c26068uM77569a, 1));
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            Boolean boolValueOf = Boolean.valueOf(m112037v(interfaceC28670t2));
            boolean zM87157i = c28655q2.m87157i(interfaceC15237i);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new b(interfaceC15237i, interfaceC28670t2, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, boolValueOf);
            boolean zM87153g = c28655q2.m87153g(c26068uM77569a);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = m112015I(c26068uM77569a);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM3495a = AbstractC1129a.m3495a(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), (InterfaceC33313a) objM87133R3, null);
            boolean zM87157i2 = c28655q2.m87157i(interfaceC15237i);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new c(interfaceC15237i);
                c28655q2.m87172p0(objM87133R4);
            }
            Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM3495a, C23454a0.f92919a, (PointerInputEventHandler) objM87133R4);
            boolean zM87157i3 = c28655q2.m87157i(interfaceC25312u) | c28655q2.m87157i(list) | c28655q2.m87157i(interfaceC39332e) | ((i14 & 7168) == 2048);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v0) {
                C31915d c31915d = new C31915d((Object) interfaceC25312u, (Object) list, (Object) interfaceC39332e, function2, 14);
                c28655q2.m87172p0(c31915d);
                objM87133R5 = c31915d;
            }
            c28655q = c28655q2;
            AbstractC22674j.m65717c(modifierM108903b, c26068uM77569a, null, null, null, null, false, null, (Function1) objM87133R5, c28655q, 0, 508);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b((Object) list, (Object) interfaceC39332e, (Object) interfaceC25312u, function1, (Object) interfaceC15237i, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final boolean m112036u(C26068u c26068u) {
        return c26068u.f103226i.mo9765b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m112037v(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m112038w(final InterfaceC25312u interfaceC25312u, List list, InterfaceC39332e interfaceC39332e, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        if (interfaceC25312u != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: uw0.g
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC35302l.m112039x(interfaceC25312u, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
                }
            }, true, 1455196983), 3);
        }
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), null, new f(e.f150342w, list), new C37816b(new g(list, interfaceC39332e, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112039x(InterfaceC25312u interfaceC25312u, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m112040y(List list, InterfaceC39332e interfaceC39332e, InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC15237i interfaceC15237i, int i13, Composer composer, int i14) {
        m112035t(list, interfaceC39332e, interfaceC25312u, function1, interfaceC15237i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m112041z(Modifier modifier, C22581e c22581e, int i13, Function1 function1, Function1 function2, InterfaceC15237i interfaceC15237i, Composer composer, int i14, int i15) {
        Modifier modifier2;
        int i16;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2099195998);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q.m87153g(c22581e) : c28655q.m87157i(c22581e) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 = i13;
            i16 |= c28655q.m87149e(i17) ? 256 : 128;
        } else {
            i17 = i13;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q.m87157i(interfaceC15237i) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i16 & 1, (74899 & i16) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            }
            List<TextResource> listM65420e = c22581e.m65420e();
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 1.5d) * 8, 1);
            EnumC2888c enumC2888c = EnumC2888c.SH5;
            boolean zM87157i = c28655q.m87157i(interfaceC15237i) | ((i16 & 57344) == 16384);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3601t(interfaceC15237i, function2, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC37947f.m121524r(i17, listM65420e, modifierM3396r, null, enumC2888c, (Function1) objM87133R, c28655q, ((i16 >> 6) & 14) | 24960, 8);
            c28655q = c28655q;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m112035t(c22581e.m65424i(), c22581e.getActiveColor(), c22581e.getCustomBehaviorsWidget(), function1, interfaceC15237i, c28655q, (i16 & 7168) | ((i16 >> 3) & 57344));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(modifier3, c22581e, i13, function1, function2, interfaceC15237i, i14, i15);
        }
    }
}
