package u11;

import a81.C0557h;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.whoopaction.domain.models.Action;
import cp0.C10965i;
import d42.C11690f;
import e31.AbstractC12610b;
import e31.C12611c;
import e31.C12612d;
import eo2.C13391k;
import gy0.AbstractC16272a;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p181h2.C16618c;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p323m8.AbstractC25218a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p510u0.C34350r;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p705ea2.C12909h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25300i;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p734sl0.C32632k2;
import q12.C29802c;
import q81.C30048f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rz0.AbstractC31926e;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32451b;
import sg2.C32458i;
import so2.C32848f;
import tr2.InterfaceC34116n;
import tu1.C34190c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: u11.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0011\u001aA\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001a\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0006H\u0003¢\u0006\u0004\b#\u0010$\u001a/\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0003¢\u0006\u0004\b)\u0010*\u001a+\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b,\u0010-\u001a+\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b.\u0010-\u001a'\u00101\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010%2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0003¢\u0006\u0004\b1\u00102\u001a\u000f\u00103\u001a\u00020\u0006H\u0003¢\u0006\u0004\b3\u0010$\"\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<²\u0006\f\u0010\f\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\u0004\u0018\u0001088\n@\nX\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu11/j;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lu11/d;", "defaultViewState", "V", "(Landroidx/compose/ui/Modifier;Lu11/j;Lkotlin/jvm/functions/Function1;Lu11/d;Landroidx/compose/runtime/Composer;II)V", "viewState", "Lu11/a;", "style", "onEvent", "M", "(Landroidx/compose/ui/Modifier;Lu11/d;Lu11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "R", "Lm91/o;", "filtersWrapper", "", "filterTagWrappers", "J", "(Lm91/o;Ljava/util/List;Lu11/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "tagWrappers", "E", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "l0", "(Lu11/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sentinelKey", "Lkotlin/Function0;", "onVisible", "a0", "(Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "p0", "(Landroidx/compose/runtime/Composer;I)V", "", "messageText", "retryActionText", "onRetry", "h0", "(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", NotificationCompat.CATEGORY_EVENT, "s0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "u0", "error", "onDismiss", "C", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "H", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Lh2/c;", "bounds", "", "isVisible", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34443i {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f144721a = InterfaceC34116n.INSTANCE.m107848a("FilteredListWrapper");

    /* JADX INFO: renamed from: u11.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.filteredlist.FilteredListWrapperKt$ActionErrorToastEffect$1$1", m100430f = "FilteredListWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144722w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f144723x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f144724y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144723x = context;
            this.f144724y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f144723x, this.f144724y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f144722w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Context context = this.f144723x;
            Toast.makeText(context, context.getString(AbstractC16277f.f62281T), 1).show();
            this.f144724y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u11.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f144725w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C25306o c25306o) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u11.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f144726w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f144727x;

        public c(Function1 function1, List list) {
            this.f144726w = function1;
            this.f144727x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m108891a(int i13) {
            return this.f144726w.invoke(this.f144727x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m108891a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: u11.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f144728w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f144729x;

        public d(List list, Function1 function1) {
            this.f144728w = list;
            this.f144729x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m108892a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C25306o c25306o = (C25306o) this.f144728w.get(i13);
            c28655q.m87150e0(1717898930);
            AbstractC25303l.m74290q(c25306o, null, null, this.f144729x, c28655q, 0, 6);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m108892a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u11.i$e */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.filteredlist.FilteredListWrapperKt$FilteredListWrapper$2$1", m100430f = "FilteredListWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144730w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C34438d, AbstractC34436b> f144731x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34444j f144732y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC23864c<C34438d, AbstractC34436b> abstractC23864c, C34444j c34444j, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144731x = abstractC23864c;
            this.f144732y = c34444j;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f144731x, this.f144732y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f144730w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f144731x.mo1216g(new AbstractC34436b.c(this.f144732y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u11.i$f */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.filteredlist.FilteredListWrapperKt$LoadMoreSentinel$2$1", m100430f = "FilteredListWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f144733w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f144734x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f144735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4339a interfaceC4339a, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f144734x = interfaceC4339a;
            this.f144735y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f144734x, this.f144735y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f144733w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC34443i.m108851e0(this.f144735y)) {
                this.f144734x.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u11.i$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f144736a;

        static {
            int[] iArr = new int[EnumC34435a.values().length];
            try {
                iArr[EnumC34435a.CONTEXT_HUB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC34435a.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f144736a = iArr;
        }
    }

    /* JADX INFO: renamed from: C */
    private static final void m108818C(String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2082752213);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            if (str != null) {
                c28655q.m87150e0(-2121211117);
                boolean zM87157i = c28655q.m87157i(context) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new a(context, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, str);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2120970867);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(str, interfaceC4339a, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m108819D(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m108818C(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m108820E(List<C25306o> list, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1907516181);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            float f13 = 8;
            float f14 = 1 * f13;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            float f15 = 2 * f13;
            C22976l1 c22976l1 = new C22976l1(f15, f14, f15, f14);
            boolean zM87157i = c28655q.m87157i(list) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0557h(list, 5, function1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65718d(modifierM3409f, null, c22976l1, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24966, 490);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13391k(i13, 4, list, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m108821F(List list, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(list.size(), null, new c(b.f144725w, list), new C37816b(new d(list, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m108822G(List list, Function1 function1, int i13, Composer composer, int i14) {
        m108820E(list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m108823H(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1455886071);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4 * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(f13, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m108824I(int i13, Composer composer, int i14) {
        m108823H(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m108825J(C25306o c25306o, List<C25306o> list, EnumC34435a enumC34435a, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2089099352);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(c25306o) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC34435a.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean z4 = (i14 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32451b(function1, 20);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            int i15 = g.f144736a[enumC34435a.ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(2012612965);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((C25306o) obj).getState() instanceof C17750h1) {
                        arrayList.add(obj);
                    }
                }
                m108820E(arrayList, function2, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (i15 != 2) {
                    throw AbstractC11895b.m32003v(-1874741237, c28655q, false);
                }
                c28655q.m87150e0(-1874732687);
                AbstractC25303l.m74290q(c25306o, null, null, function2, c28655q, i14 & 14, 6);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34190c(c25306o, list, enumC34435a, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m108826K(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m108879s0(event, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m108827L(C25306o c25306o, List list, EnumC34435a enumC34435a, Function1 function1, int i13, Composer composer, int i14) {
        m108825J(c25306o, list, enumC34435a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0162  */
    /* JADX WARN: Code duplicated, block: B:94:0x016b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0182  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a0  */
    /* JADX INFO: renamed from: M */
    public static final void m108828M(Modifier modifier, C34438d viewState, EnumC34435a enumC34435a, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        EnumC34435a enumC34435a2;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        EnumC34435a enumC34435a3;
        C28676v0 c28676v0;
        Function1 function4;
        int i16;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        Modifier modifier5;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1997233276);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC34435a == null ? -1 : enumC34435a.ordinal()) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i18 != 0) {
                    enumC34435a3 = EnumC34435a.DEFAULT;
                } else {
                    enumC34435a3 = enumC34435a;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C34350r(17);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                String strM108800a = viewState.getActionError();
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C32458i(function4, 21);
                    c28655q.m87172p0(objM87133R);
                }
                m108818C(strM108800a, (InterfaceC4339a) objM87133R, c28655q, 0);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (viewState.getIsLoading()) {
                    c28655q.m87150e0(-1829876568);
                    AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                    c28655q.m87173q(false);
                } else {
                    if (viewState.getIsError()) {
                        c28655q.m87150e0(-1829871969);
                        C12611c c12611cM35368c = C12612d.f43056a.m35368c();
                        if (i16 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C32458i(function4, 22);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC12610b.m35349f(c12611cM35368c, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1829865144);
                        int i24 = i15 & 8176;
                        function5 = function4;
                        modifier5 = modifier4;
                        m108833R(null, viewState, enumC34435a3, function5, c28655q, i24, 1);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier5;
                    enumC34435a2 = enumC34435a3;
                }
                modifier5 = modifier4;
                function5 = function4;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
                enumC34435a2 = enumC34435a3;
            } else {
                c28655q.m87138X();
                enumC34435a2 = enumC34435a;
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C34440f(modifier3, viewState, enumC34435a2, function3, i13, i14, 1);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i18 != 0) {
                enumC34435a3 = EnumC34435a.DEFAULT;
            } else {
                enumC34435a3 = enumC34435a;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C34350r(17);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            String strM108800a2 = viewState.getActionError();
            i16 = i15 & 7168;
            if (i16 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C32458i(function4, 21);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C32458i(function4, 21);
                c28655q.m87172p0(objM87133R);
            }
            m108818C(strM108800a2, (InterfaceC4339a) objM87133R, c28655q, 0);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (viewState.getIsLoading()) {
                c28655q.m87150e0(-1829876568);
                AbstractC12610b.m35349f(C12612d.f43056a.m35366a(), null, null, c28655q, 6, 6);
                c28655q.m87173q(false);
            } else {
                if (viewState.getIsError()) {
                    c28655q.m87150e0(-1829871969);
                    C12611c c12611cM35368c2 = C12612d.f43056a.m35368c();
                    if (i16 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C32458i(function4, 22);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32458i(function4, 22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC12610b.m35349f(c12611cM35368c2, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1829865144);
                    int i25 = i15 & 8176;
                    function5 = function4;
                    modifier5 = modifier4;
                    m108833R(null, viewState, enumC34435a3, function5, c28655q, i25, 1);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
                enumC34435a2 = enumC34435a3;
            }
            modifier5 = modifier4;
            function5 = function4;
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier5;
            enumC34435a2 = enumC34435a3;
        } else {
            c28655q.m87138X();
            enumC34435a2 = enumC34435a;
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34440f(modifier3, viewState, enumC34435a2, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m108829N(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m108830O(Function1 function1) {
        function1.invoke(AbstractC34436b.a.f144687a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m108831P(Function1 function1) {
        function1.invoke(AbstractC34436b.f.f144692a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m108832Q(Modifier modifier, C34438d c34438d, EnumC34435a enumC34435a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m108828M(modifier, c34438d, enumC34435a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX INFO: renamed from: R */
    private static final void m108833R(Modifier modifier, C34438d c34438d, EnumC34435a enumC34435a, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C34438d c34438d2;
        Function1 function2;
        ?? r15;
        C22957g c22957g;
        float f13;
        EnumC34435a enumC34435a2;
        Function1 function3;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(158002805);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c34438d) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC34435a.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier2;
            float f14 = (enumC34435a == EnumC34435a.CONTEXT_HUB ? 0 : 1) * 8;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifier4 = modifier3;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C25306o c25306oM108802c = c34438d.getFilters();
            if (c25306oM108802c == null) {
                c28655q.m87150e0(-2091038357);
                r15 = 0;
                c28655q.m87173q(false);
                enumC34435a2 = enumC34435a;
                function3 = function1;
                c22957g = c22957g2;
                f13 = 1.0f;
            } else {
                r15 = 0;
                c28655q.m87150e0(-2091038356);
                int i18 = i17 & 8064;
                c22957g = c22957g2;
                f13 = 1.0f;
                m108825J(c25306oM108802c, c34438d.m108801b(), enumC34435a, function1, c28655q, i18);
                enumC34435a2 = enumC34435a;
                function3 = function1;
                c28655q.m87173q(false);
            }
            if (c34438d.getIsFilterLoading()) {
                c28655q.m87150e0(209652537);
                m108823H(c28655q, r15);
                c28655q.m87173q(r15);
                c34438d2 = c34438d;
                function2 = function3;
                z4 = true;
            } else if (c34438d.m108804e().isEmpty()) {
                c34438d2 = c34438d;
                function2 = function3;
                z4 = true;
                c28655q.m87150e0(-2089014335);
                c28655q.m87173q(r15);
            } else {
                c28655q.m87150e0(209656499);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, r15);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                c28655q.m87150e0(-137922680);
                int i19 = 0;
                for (Object obj : c34438d.m108804e()) {
                    int i24 = i19 + 1;
                    if (i19 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C25306o c25306o = (C25306o) obj;
                    Object objM74316c = c25306o.m74316c();
                    if (objM74316c == null) {
                        objM74316c = Integer.valueOf(i19);
                    }
                    c28655q.m87144b0(2086927353, objM74316c);
                    final boolean z13 = i19 == 0;
                    final boolean z14 = enumC34435a2 == EnumC34435a.CONTEXT_HUB;
                    Function3 function4 = new Function3() { // from class: u11.h
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC34443i.m108834S(z14, z13, (InterfaceC25312u) obj2, (Composer) obj3, iIntValue);
                        }
                    };
                    int i25 = i17;
                    boolean z15 = (i25 & 7168) == 2048;
                    Object objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C32451b(function3, 21);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74290q(c25306o, null, function4, (Function1) objM87133R, c28655q, 0, 2);
                    c28655q.m87173q(false);
                    enumC34435a2 = enumC34435a;
                    i17 = i25;
                    function3 = function1;
                    i19 = i24;
                }
                function2 = function3;
                int i26 = i17;
                c28655q.m87173q(false);
                int i27 = ((i26 >> 3) & 14) | ((i26 >> 6) & 112);
                c34438d2 = c34438d;
                m108865l0(c34438d2, function2, c28655q, i27);
                z4 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(z4);
            modifier2 = modifier4;
        } else {
            c34438d2 = c34438d;
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34440f(modifier2, c34438d2, enumC34435a, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Modifier m108834S(boolean z4, boolean z13, InterfaceC25312u it, Composer composer, int i13) {
        float f13;
        float f14;
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1492284244);
        if (z4 && z13) {
            f13 = 1;
        } else {
            f13 = z13 ? 4 : 0;
        }
        float f15 = f13 * 8;
        if (z4) {
            float f16 = 4;
            f14 = f16 * f16;
        } else {
            f14 = (z13 ? 4 : 3) * 8;
        }
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, f15, 0.0f, f14, 5);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m108835T(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m108883u0(event, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m108836U(Modifier modifier, C34438d c34438d, EnumC34435a enumC34435a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m108833R(modifier, c34438d, enumC34435a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:114:0x020e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:127:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0261  */
    /* JADX WARN: Code duplicated, block: B:131:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x026b  */
    /* JADX WARN: Code duplicated, block: B:135:0x028b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0295  */
    /* JADX WARN: Code duplicated, block: B:141:0x02af  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5 A[PHI: r0 r3 r4
      0x00a5: PHI (r0v8 androidx.compose.ui.Modifier) = (r0v5 androidx.compose.ui.Modifier), (r0v10 androidx.compose.ui.Modifier) binds: [B:68:0x00c5, B:56:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r3v13 kotlin.jvm.functions.Function1) = (r3v7 kotlin.jvm.functions.Function1), (r3v14 kotlin.jvm.functions.Function1) binds: [B:68:0x00c5, B:56:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r4v16 int) = (r4v10 int), (r4v17 int) binds: [B:68:0x00c5, B:56:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Code duplicated, block: B:79:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x016f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0192  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a8  */
    /* JADX INFO: renamed from: V */
    public static final void m108837V(Modifier modifier, C34444j itemState, Function1 function1, C34438d c34438d, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C34438d c34438d2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C34438d c34438d3;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Modifier modifier4;
        C34438d c34438d4;
        Object objM87133R;
        int i17;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R2;
        C34438d c34438d5;
        AbstractC23864c abstractC23864c;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        boolean zM87157i;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R5;
        Object obj;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R6;
        int i18;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(94236675);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 8) == 0) {
                    c34438d2 = c34438d;
                    if (c28655q.m87157i(c34438d2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i18;
                } else {
                    c34438d2 = c34438d;
                }
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i18;
            } else {
                c34438d2 = c34438d;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i19 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C34350r(14);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        c34438d4 = new C34438d(true, false, false, null, null, null, false, null, null, false, false, false, null, null, 0, 32766, null);
                    }
                    c28655q.m87175r();
                    i17 = i15 >> 9;
                    c28655q.m87150e0(1371609227);
                    if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                        interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                        applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                        } else {
                            application = null;
                        }
                        zM87153g = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                        objM87133R2 = c28655q.m87133R();
                        if (!zM87153g || objM87133R2 == c28676v0) {
                            c34438d5 = c34438d4;
                            objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c34438d5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            c34438d5 = c34438d4;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R2;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-707976188);
                        interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                        if (interfaceC1583f2M73844a == null) {
                            c28655q.m87150e0(-707931115);
                            c28655q.m87173q(false);
                            obj2 = null;
                            obj = null;
                            abstractC23864c = null;
                        } else {
                            c28655q.m87150e0(-707931114);
                            Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                            AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                            application2 = (Application) applicationContext2;
                            zM87153g2 = c28655q.m87153g(null) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(null);
                            objM87133R5 = c28655q.m87133R();
                            if (!zM87153g2 || objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, new C23863b(c34438d4), null);
                                obj = null;
                                obj2 = null;
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                obj2 = null;
                                obj = null;
                            }
                            abstractC23864c = (AbstractC23864c) objM87133R5;
                            c28655q.m87173q(false);
                        }
                        if (abstractC23864c == null) {
                            c28655q.m87150e0(-707430526);
                            zM87153g3 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R6 == c28676v0) {
                                objM87133R6 = new C23863b(c34438d4);
                                c28655q.m87172p0(objM87133R6);
                            }
                            abstractC23864c = (C23863b) objM87133R6;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-438479417);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                        c34438d5 = c34438d4;
                    }
                    InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c34438d5, null, c28655q, (i15 >> 6) & 112, 2);
                    String strM108893a = itemState.getPath();
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i2 | z13;
                    objM87133R3 = c28655q.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = new e(abstractC23864c, itemState, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM108893a);
                    C34438d c34438dM108839X = m108839X(interfaceC28601c1M87260n);
                    EnumC34435a enumC34435aM108894b = itemState.getStyle();
                    zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 896) == 256);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i || objM87133R4 == c28676v0) {
                        objM87133R4 = new C2205b(abstractC23864c, function3, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Modifier modifier5 = modifier4;
                    m108828M(modifier5, c34438dM108839X, enumC34435aM108894b, (Function1) objM87133R4, c28655q, i15 & 14, 0);
                    c28655q = c28655q;
                    modifier3 = modifier5;
                    c34438d3 = c34438d5;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    modifier4 = modifier2;
                    function3 = function2;
                }
                c34438d4 = c34438d2;
                c28655q.m87175r();
                i17 = i15 >> 9;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext3;
                        zM87153g2 = c28655q.m87153g(null) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g2) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, new C23863b(c34438d4), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, new C23863b(c34438d4), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R6 = new C23863b(c34438d4);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C23863b(c34438d4);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    c34438d5 = c34438d4;
                } else {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        c34438d5 = c34438d4;
                        objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c34438d5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        c34438d5 = c34438d4;
                        objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c34438d5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R2;
                    c28655q.m87173q(false);
                }
                InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c34438d5, null, c28655q, (i15 >> 6) & 112, 2);
                String strM108893a2 = itemState.getPath();
                boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i3 | z13;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    objM87133R3 = new e(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new e(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM108893a2);
                C34438d c34438dM108839X2 = m108839X(interfaceC28601c1M87260n2);
                EnumC34435a enumC34435aM108894b2 = itemState.getStyle();
                zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 896) == 256);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C2205b(abstractC23864c, function3, 6);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2205b(abstractC23864c, function3, 6);
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifier6 = modifier4;
                m108828M(modifier6, c34438dM108839X2, enumC34435aM108894b2, (Function1) objM87133R4, c28655q, i15 & 14, 0);
                c28655q = c28655q;
                modifier3 = modifier6;
                c34438d3 = c34438d5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c34438d3 = c34438d2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier3, itemState, function3, c34438d3, i13, i14, 7);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c34438d2 = c34438d;
                if (c28655q.m87157i(c34438d2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i18;
            } else {
                c34438d2 = c34438d;
            }
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i18;
        } else {
            c34438d2 = c34438d;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34350r(14);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c34438d4 = new C34438d(true, false, false, null, null, null, false, null, null, false, false, false, null, null, 0, 32766, null);
                } else {
                    c34438d4 = c34438d2;
                }
            } else {
                if (i19 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C34350r(14);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    c34438d4 = new C34438d(true, false, false, null, null, null, false, null, null, false, false, false, null, null, 0, 32766, null);
                } else {
                    c34438d4 = c34438d2;
                }
            }
            c28655q.m87175r();
            i17 = i15 >> 9;
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext4;
                    zM87153g2 = c28655q.m87153g(null) | ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, new C23863b(c34438d4), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, new C23863b(c34438d4), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R6 = new C23863b(c34438d4);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(c34438d4);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                c34438d5 = c34438d4;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = ((((i17 & 14) ^ 6) <= 4 && c28655q.m87153g(c34438d4)) || (i17 & 6) == 4) | c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g) {
                    c34438d5 = c34438d4;
                    objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c34438d5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    c34438d5 = c34438d4;
                    objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c34438d5, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC34437c.class), null, null);
                    c28655q.m87172p0(objM87133R2);
                }
                abstractC23864c = (AbstractC23864c) objM87133R2;
                c28655q.m87173q(false);
            }
            InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c34438d5, null, c28655q, (i15 >> 6) & 112, 2);
            String strM108893a3 = itemState.getPath();
            boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i4 | z13;
            objM87133R3 = c28655q.m87133R();
            if (z14) {
                objM87133R3 = new e(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new e(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM108893a3);
            C34438d c34438dM108839X3 = m108839X(interfaceC28601c1M87260n3);
            EnumC34435a enumC34435aM108894b3 = itemState.getStyle();
            zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 896) == 256);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new C2205b(abstractC23864c, function3, 6);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2205b(abstractC23864c, function3, 6);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifier7 = modifier4;
            m108828M(modifier7, c34438dM108839X3, enumC34435aM108894b3, (Function1) objM87133R4, c28655q, i15 & 14, 0);
            c28655q = c28655q;
            modifier3 = modifier7;
            c34438d3 = c34438d5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c34438d3 = c34438d2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier3, itemState, function3, c34438d3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m108838W(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private static final C34438d m108839X(InterfaceC28670t2 interfaceC28670t2) {
        return (C34438d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m108840Y(AbstractC23864c abstractC23864c, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC34436b) {
            abstractC23864c.mo1216g(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m108841Z(Modifier modifier, C34444j c34444j, Function1 function1, C34438d c34438d, int i13, int i14, Composer composer, int i15) {
        m108837V(modifier, c34444j, function1, c34438d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private static final void m108843a0(Object obj, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(300420297);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zM87153g = c28655q.m87153g(obj);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(obj) | c28655q.m87153g(view);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87264r(new C32209f(23, view, interfaceC28601c1));
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R2;
            Modifier modifierM3411h = AbstractC1102d.m3411h(2 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            boolean zM87153g3 = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C29802c(15, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22989q.m66760a(AbstractC1131a.m3500d(modifierM3411h, (Function1) objM87133R3), c28655q, 0);
            Boolean boolValueOf = Boolean.valueOf(m108851e0(interfaceC28670t2));
            boolean zM87153g4 = c28655q.m87153g(interfaceC28670t2) | ((i14 & 112) == 32);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v0) {
                objM87133R4 = new f(interfaceC4339a, interfaceC28670t2, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(obj, boolValueOf, (InterfaceC4351m) objM87133R4, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(obj, interfaceC4339a, i13, 18);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private static final C16618c m108845b0(InterfaceC28601c1 interfaceC28601c1) {
        return (C16618c) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private static final void m108847c0(InterfaceC28601c1 interfaceC28601c1, C16618c c16618c) {
        interfaceC28601c1.setValue(c16618c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final boolean m108849d0(View view, InterfaceC28601c1 interfaceC28601c1) {
        C16618c c16618cM108845b0 = m108845b0(interfaceC28601c1);
        if (c16618cM108845b0 == null) {
            return false;
        }
        float height = view.getHeight();
        return height > 0.0f && c16618cM108845b0.f63940b < height && c16618cM108845b0.f63942d > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final boolean m108851e0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m108853f0(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y coords) {
        AbstractC22676k.m65750j(coords, "coords");
        m108847c0(interfaceC28601c1, AbstractC39125q1.m124660f(coords));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m108855g0(Object obj, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m108843a0(obj, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private static final void m108857h0(String str, String str2, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1456209714);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, C38072d.f163053a.m121949b(c28655q, 6).getAccentNegativeTrend15(), null, null, null, 0.0f, AbstractC37817c.m121344e(-1721284514, c28655q, new C34441g(str2, str, interfaceC4339a)), c28655q, 12582918, 122);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12909h0(str, str2, interfaceC4339a, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m108859i0(String str, String str2, InterfaceC4339a interfaceC4339a, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16272a.f61940I4, c28655q, 6);
            float f14 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f14, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC23164r1.m67133b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getAccentNegativeTrend(), c28655q, 432, 0);
            AbstractC18489d0.m53380u(f14, f14, c2314t, c28655q);
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, 6).getB2();
            long jM125392f = c38072d.m121949b(c28655q, 6).getAccentNegativeTrend();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(str2, new LayoutWeightElement(1.0f, true), jM125392f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, 0, 196600);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            if (str == null) {
                c28655q2.m87150e0(-1667979037);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1667979036);
                AbstractC23124k3.m67105i(interfaceC4339a, AbstractC1099a.m3398t(c2314t, f14 * f13, 0.0f, 0.0f, 0.0f, 14), false, null, null, null, AbstractC37817c.m121344e(-1592514055, c28655q2, new C11690f(str, 3)), c28655q2, 805306416, 508);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m108861j0(String str, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh4(), null, c28655q, 0, 0, 196602);
            C2314t c2314t = C2314t.f9131w;
            AbstractC18489d0.m53380u(1, 8, c2314t, c28655q);
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(AbstractC16272a.f62140q, c28655q, 6), null, AbstractC1102d.m3411h(3 * 4, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m108863k0(String str, String str2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m108857h0(str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l0 */
    private static final void m108865l0(C34438d c34438d, Function1 function1, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1303156697);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c34438d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            String strM108806g = c34438d.getPaginationErrorMessage();
            if (c34438d.getIsPaginationLoading()) {
                c28655q.m87150e0(1796870979);
                m108873p0(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                boolean zM108811l = c34438d.getIsPaginationError();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM108811l && strM108806g != null) {
                    c28655q.m87150e0(1796874066);
                    String strM108807h = c34438d.getPaginationRetryActionText();
                    z4 = (i14 & 112) == 32;
                    Object objM87133R = c28655q.m87133R();
                    if (z4 || objM87133R == c28676v0) {
                        objM87133R = new C32458i(function1, 19);
                        c28655q.m87172p0(objM87133R);
                    }
                    m108857h0(strM108806g, strM108807h, (InterfaceC4339a) objM87133R, c28655q, 0);
                    c28655q.m87173q(false);
                } else if (c34438d.getHasMore()) {
                    c28655q.m87150e0(1796881465);
                    Integer numValueOf = Integer.valueOf(c34438d.getLoadMoreEpoch());
                    z4 = (i14 & 112) == 32;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z4 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C32458i(function1, 20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m108843a0(numValueOf, (InterfaceC4339a) objM87133R2, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-131103173);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c34438d, function1, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m108867m0(Function1 function1) {
        function1.invoke(AbstractC34436b.d.f144690a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m108869n0(Function1 function1) {
        function1.invoke(AbstractC34436b.d.f144690a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m108871o0(C34438d c34438d, Function1 function1, int i13, Composer composer, int i14) {
        m108865l0(c34438d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p0 */
    private static final void m108873p0(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-491570407);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 2 * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(6 * 4, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 6, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m108875q0(int i13, Composer composer, int i14) {
        m108873p0(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m108879s0(Object event, Function1 onEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if (event instanceof DesignItemInteraction) {
            AbstractC25300i.m74263a((DesignItemInteraction) event, onEvent, new C34350r(16));
        } else if (event instanceof Action) {
            onEvent.invoke(new AbstractC34436b.b((Action) event));
        } else {
            onEvent.invoke(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final Object m108881t0(Action it) {
        AbstractC22676k.m65750j(it, "it");
        return new AbstractC34436b.b(it);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m108883u0(Object event, Function1 onEvent) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if (event instanceof DesignItemInteraction) {
            AbstractC25300i.m74263a((DesignItemInteraction) event, onEvent, new C34350r(15));
        } else if (event instanceof Action) {
            onEvent.invoke(new AbstractC34436b.e((Action) event));
        } else {
            onEvent.invoke(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Object m108885v0(Action it) {
        AbstractC22676k.m65750j(it, "it");
        return new AbstractC34436b.e(it);
    }
}
