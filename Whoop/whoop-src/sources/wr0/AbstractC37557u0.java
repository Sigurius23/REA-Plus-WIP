package wr0;

import android.graphics.Paint;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2588o1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.communitymoments.domain.models.MomentCardFillMode;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import dn0.C12212l;
import e61.C12769l;
import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kd1.AbstractC22403o;
import kotlin.C2030t;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25249h0;
import m83.C25271y;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p163g1.C15101o5;
import p180h0.AbstractC16412k1;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16427n1;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17919x;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.C18022d;
import p209i3.C18027i;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31915d;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wo1.C37445e0;

/* JADX INFO: renamed from: wr0.u0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aw\u0010\u001b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0018H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aq\u0010#\u001a\u00020\u0006*\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00162\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001a/\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010%\u001a\u00020\u001d2\b\b\u0002\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0000¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000fH\u0000¢\u0006\u0004\b.\u0010-\u001a-\u00100\u001a\b\u0012\u0004\u0012\u00020/0\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0016H\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b3\u00104\u001a/\u00106\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b6\u00107\u001a?\u0010:\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b:\u0010;\u001a\u0017\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u000fH\u0000¢\u0006\u0004\b=\u0010>\u001a\u0017\u0010?\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016H\u0000¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010A\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u0016H\u0000¢\u0006\u0004\bA\u0010@\u001a'\u0010D\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010E\u001a'\u0010F\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0000¢\u0006\u0004\bF\u0010G\u001a'\u0010H\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0000¢\u0006\u0004\bH\u0010I¨\u0006O²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010J\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010K\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\u0018\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010N\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lwr0/x0;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "t", "(Landroidx/compose/ui/Modifier;Lwr0/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwr0/b0;", "d0", "(Lwr0/b0;)Lwr0/b0;", "", "items", "", "frontIndex", "onFrontIndexChange", "", "accessibilityLabel", "", "dragEnabled", "", "frontWidthPx", "Lkotlin/Function2;", "Ll0/u;", "content", "K", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Ljava/lang/String;ZFLandroidx/compose/ui/Modifier;Lc93/n;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "frontWidth", "frontHeight", "overlap", "dragProgress", "onPromote", "F", "(Ll0/u;Ljava/util/List;IFFFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "cornerRadius", "blurRadius", "Li2/x;", "color", "g0", "(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;", "itemCount", "j0", "(II)I", "p0", "Lwr0/w0;", "s0", "(IIF)Ljava/util/List;", "dragOffsetPx", "f0", "(FF)F", "offsetPx", "e0", "(FIIF)F", "velocityPxPerSec", "thresholdPx", "q0", "(FFFIIF)F", "depth", "m0", "(I)F", "l0", "(F)F", "n0", "containerWidth", "peekCount", "r0", "(FFI)F", "k0", "(IFF)F", "o0", "(FFF)F", "latestFrontIndex", "latestItemCount", "latestFrontWidthPx", "latestOnFrontIndexChange", "isSettling", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37557u0 {

    /* JADX INFO: renamed from: wr0.u0$a */
    @InterfaceC32271e(m100429c = "com.whoop.communitymoments.view.MomentStackKt$MomentStack$3$1", m100430f = "MomentStack.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28593a1 f160596E;

        /* JADX INFO: renamed from: w */
        int f160597w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List<String> f160598x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f160599y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<C37519b0> f160600z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, InterfaceC28601c1 interfaceC28601c1, List<C37519b0> list2, InterfaceC28593a1 interfaceC28593a1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160598x = list;
            this.f160599y = interfaceC28601c1;
            this.f160600z = list2;
            this.f160596E = interfaceC28593a1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f160598x, this.f160599y, this.f160600z, this.f160596E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f160597w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC22676k.m65745e(this.f160598x, this.f160599y.getValue())) {
                if (!AbstractC37565y0.m120568a((List) this.f160599y.getValue(), this.f160598x)) {
                    AbstractC37557u0.m120548y(this.f160596E, 0);
                }
                this.f160599y.setValue(this.f160598x);
            }
            if (AbstractC37557u0.m120547x(this.f160596E) > AbstractC37056f.m118951C(this.f160600z)) {
                InterfaceC28593a1 interfaceC28593a1 = this.f160596E;
                int iM118951C = AbstractC37056f.m118951C(this.f160600z);
                AbstractC37557u0.m120548y(interfaceC28593a1, iM118951C >= 0 ? iM118951C : 0);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wr0.u0$b */
    @InterfaceC32271e(m100429c = "com.whoop.communitymoments.view.MomentStackKt$MomentStack$4$1", m100430f = "MomentStack.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f160601w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f160602x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C37563x0 f160603y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f160604z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, C37563x0 c37563x0, int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f160602x = function1;
            this.f160603y = c37563x0;
            this.f160604z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f160602x, this.f160603y, this.f160604z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f160601w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f160602x.invoke(new C37541m0(this.f160603y.getId(), this.f160604z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wr0.u0$c */
    @InterfaceC32271e(m100429c = "com.whoop.communitymoments.view.MomentStackKt$MomentStackPager$2$1", m100430f = "MomentStack.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Lh2/b;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Lh2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f160605w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11344e f160606x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f160607y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C11344e c11344e, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f160606x = c11344e;
            this.f160607y = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: f */
        public final Object m120550f(InterfaceC2994c0 interfaceC2994c0, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new c(this.f160606x, this.f160607y, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m120550f((InterfaceC2994c0) obj, ((C16617b) obj2).f63937a, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160605w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11344e c11344e = this.f160606x;
                this.f160605w = 1;
                if (c11344e.m30552h(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC37557u0.m120500V(this.f160607y, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wr0.u0$d */
    @InterfaceC32271e(m100429c = "com.whoop.communitymoments.view.MomentStackKt$MomentStackPager$3$1", m100430f = "MomentStack.kt", m100431l = {251, 252, 260}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "velocity", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;F)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        int f160608E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ float f160609F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28690z0 f160610G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ float f160611H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C11344e f160612I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28670t2 f160613J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC28670t2 f160614K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC28670t2 f160615L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ InterfaceC28601c1 f160616M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ InterfaceC28670t2 f160617N;

        /* JADX INFO: renamed from: w */
        float f160618w;

        /* JADX INFO: renamed from: x */
        float f160619x;

        /* JADX INFO: renamed from: y */
        int f160620y;

        /* JADX INFO: renamed from: z */
        int f160621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC28690z0 interfaceC28690z0, float f13, C11344e c11344e, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t5, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f160610G = interfaceC28690z0;
            this.f160611H = f13;
            this.f160612I = c11344e;
            this.f160613J = interfaceC28670t2;
            this.f160614K = interfaceC28670t3;
            this.f160615L = interfaceC28670t4;
            this.f160616M = interfaceC28601c1;
            this.f160617N = interfaceC28670t5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C23454a0 m120552i(InterfaceC28690z0 interfaceC28690z0, C11344e c11344e) {
            ((C28617g1) interfaceC28690z0).m87023y(((Number) c11344e.m30549e()).floatValue());
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: h */
        public final Object m120553h(InterfaceC2994c0 interfaceC2994c0, float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(this.f160610G, this.f160611H, this.f160612I, this.f160613J, this.f160614K, this.f160615L, this.f160616M, this.f160617N, interfaceC30057d);
            dVar.f160609F = f13;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m120553h((InterfaceC2994c0) obj, ((Number) obj2).floatValue(), (InterfaceC30057d) obj3);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00cb A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:14:0x002c, B:30:0x00cb, B:34:0x00f4, B:33:0x00e2, B:17:0x0039, B:24:0x0094, B:21:0x0071), top: B:41:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00de  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:14:0x002c, B:30:0x00cb, B:34:0x00f4, B:33:0x00e2, B:17:0x0039, B:24:0x0094, B:21:0x0071), top: B:41:0x000c }] */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
        
            if (r7.m30551g(r8, r16) == r11) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.AbstractC37557u0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m120479A(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m120548y(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m120480B(List list, int i13, Function1 function1, InterfaceC23001u MomentStackPager, float f13, Composer composer, int i14) {
        AbstractC22676k.m65750j(MomentStackPager, "$this$MomentStackPager");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 129) != 128)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C37519b0 c37519b0M120512d0 = m120512d0((C37519b0) list.get(i13));
            int i15 = AbstractC22403o.f87638a;
            int i16 = TextResource.$stable;
            int i17 = i15 | i16;
            int i18 = GenericInteraction.$stable;
            int i19 = i17 | i18 | i17 | i16;
            int i24 = i17 | i16;
            int i25 = C2886a.f11498d;
            AbstractC37566z.m120582m(c37519b0M120512d0, modifierM3409f, function1, c28655q, i24 | i25 | i25 | i19 | i18 | 48, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m120481C(List list, InterfaceC28593a1 interfaceC28593a1, int i13) {
        m120548y(interfaceC28593a1, AbstractC12889b.m36284n(i13, 0, AbstractC37056f.m118951C(list)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m120482D(List list, int i13, float f13, float f14, float f15, InterfaceC28593a1 interfaceC28593a1, Function1 function1, InterfaceC23001u MomentStackPager, float f16, Composer composer, int i14) {
        int i15;
        float f17;
        AbstractC22676k.m65750j(MomentStackPager, "$this$MomentStackPager");
        if ((i14 & 6) == 0) {
            i15 = i14 | (((C28655q) composer).m87153g(MomentStackPager) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            f17 = f16;
            i15 |= ((C28655q) composer).m87147d(f17) ? 32 : 16;
        } else {
            f17 = f16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            boolean zM87153g = c28655q.m87153g(interfaceC28593a1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C37531h0(interfaceC28593a1, 3);
                c28655q.m87172p0(objM87133R);
            }
            m120484F(MomentStackPager, list, i13, f13, f14, f15, f17, (Function1) objM87133R, function1, c28655q, (i15 & 14) | ((i15 << 15) & 3670016));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m120483E(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m120548y(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m120484F(final InterfaceC23001u interfaceC23001u, final List<C37519b0> list, final int i13, final float f13, final float f14, final float f15, final float f16, final Function1 function1, final Function1 function2, Composer composer, final int i14) {
        int i15;
        C2314t c2314t;
        Modifier modifierM120520h0;
        boolean z4;
        Modifier modifier;
        Function1 function3;
        boolean z13;
        InterfaceC23001u interfaceC23001u2 = interfaceC23001u;
        int i16 = i13;
        float f17 = f13;
        float f18 = f14;
        float f19 = f15;
        float f24 = f16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-659253688);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i16) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87147d(f17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87147d(f18) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87147d(f19) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i15 |= c28655q.m87147d(f24) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= c28655q.m87157i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= c28655q.m87157i(function2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q.m87135U(i15 & 1, (38347923 & i15) != 38347922)) {
            List<C37561w0> listM120542s0 = m120542s0(i16, list.size(), f24);
            float f25 = 3 * 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f25);
            boolean z14 = Math.abs(f24) < 0.01f;
            Iterator it = AbstractC25265s.m74143q0(listM120542s0).iterator();
            while (true) {
                ListIterator listIterator = (ListIterator) ((C25249h0) it).f99126x;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                C37561w0 c37561w0 = (C37561w0) listIterator.previous();
                int iM120561a = c37561w0.getCardIndex();
                float fM120562b = c37561w0.getDepth() - f24;
                float fM120528l0 = m120528l0(fM120562b);
                float f26 = f17 * fM120528l0;
                int i17 = i15;
                float f27 = f18 * fM120528l0;
                float fM120534o0 = m120534o0(fM120562b, f17, f19);
                boolean z15 = z14 && iM120561a == i16;
                boolean z16 = fM120562b <= 0.0f && fM120562b > -1.0f;
                C2307m c2307m = C2299e.f9117z;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3411h = AbstractC1102d.m3411h(f27, AbstractC1102d.m3424u(f26, AbstractC1099a.m3392n(AbstractC2294a.m7154a(-fM120562b, interfaceC23001u2.mo3400a(c2314t2, c2307m)), fM120534o0, 0.0f, 2)));
                if (z16) {
                    modifierM120520h0 = m120520h0(c2314t2, f25, 0.0f, 0L, 6, null);
                    c2314t = c2314t2;
                } else {
                    c2314t = c2314t2;
                    modifierM120520h0 = c2314t;
                }
                Modifier modifierMo3471e = modifierM3411h.mo3471e(modifierM120520h0);
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3407d(1.0f, c2314t), c33252iM105489e);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                C33252i c33252i = c33252iM105489e;
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z15) {
                    c28655q.m87150e0(931424254);
                    z4 = false;
                    c28655q.m87173q(false);
                    modifier = c2314t;
                } else {
                    c28655q.m87150e0(931425006);
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C37445e0(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM51774b = AbstractC18032n.m51774b(c2314t, (Function1) objM87133R);
                    z4 = false;
                    c28655q.m87173q(false);
                    modifier = modifierM51774b;
                }
                C37519b0 c37519b0M120512d0 = m120512d0(list.get(iM120561a));
                if (z15) {
                    c28655q.m87150e0(931429281);
                    c28655q.m87173q(z4);
                    function3 = function2;
                } else {
                    c28655q.m87150e0(-1190446588);
                    Object objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37445e0(19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                    c28655q.m87173q(false);
                }
                int i18 = AbstractC22403o.f87638a;
                int i19 = TextResource.$stable;
                int i24 = i18 | i19;
                int i25 = GenericInteraction.$stable;
                int i26 = i24 | i25 | i24 | i19;
                int i27 = i24 | i19;
                int i28 = C2886a.f11498d;
                AbstractC37566z.m120582m(c37519b0M120512d0, modifier, function3, c28655q, i27 | i28 | i28 | i26 | i25, 0);
                if (z15) {
                    c28655q.m87150e0(-1189548084);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1190363973);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C17919x.m51541c(m120532n0(fM120562b), C17919x.f69625b), AbstractC17918w0.f69621a), c28655q, 0);
                    if (z14) {
                        c28655q.m87150e0(-1190113710);
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC37565y0.m120569b(iM120561a));
                        String strM8294g = AbstractC2875y.m8294g(iM120561a + 1, list.size(), "Moment ", " of ");
                        C18027i c18027i = new C18027i(0);
                        boolean zM87149e = ((i17 & 29360128) == 8388608) | c28655q.m87149e(iM120561a);
                        Object objM87133R3 = c28655q.m87133R();
                        if (zM87149e || objM87133R3 == c28676v0) {
                            objM87133R3 = new C12212l(function1, iM120561a, 4);
                            c28655q.m87172p0(objM87133R3);
                        }
                        z13 = false;
                        AbstractC22989q.m66760a(AbstractC1092a.m3362g(modifierM3599a, false, strM8294g, c18027i, (InterfaceC4339a) objM87133R3, 9), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        z13 = false;
                        c28655q.m87150e0(-1189565940);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC23001u2 = interfaceC23001u;
                i16 = i13;
                f17 = f13;
                f19 = f15;
                f24 = f16;
                c33252iM105489e = c33252i;
                i15 = i17;
                f18 = f14;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wr0.s0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC37557u0.m120488J(interfaceC23001u, list, i13, f13, f14, f15, f16, function1, function2, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m120485G(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m120486H(Object obj) {
        AbstractC22676k.m65750j(obj, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m120487I(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m120488J(InterfaceC23001u interfaceC23001u, List list, int i13, float f13, float f14, float f15, float f16, Function1 function1, Function1 function2, int i14, Composer composer, int i15) {
        m120484F(interfaceC23001u, list, i13, f13, f14, f15, f16, function1, function2, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019c  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x0246  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267  */
    /* JADX WARN: Code duplicated, block: B:121:0x0297  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x014c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Code duplicated, block: B:94:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    /* JADX INFO: renamed from: K */
    private static final void m120489K(List<C37519b0> list, int i13, Function1 function1, String str, boolean z4, float f13, Modifier modifier, InterfaceC4352n interfaceC4352n, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        InterfaceC4352n interfaceC4352n2;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        float fMo743q0;
        String str2;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        InterfaceC28601c1 interfaceC28601c1M87238F3;
        InterfaceC28601c1 interfaceC28601c1M87238F4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        C11344e c11344e;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R5;
        boolean zM87157i;
        Object objM87133R6;
        boolean zM87153g2;
        Object objM87133R7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        float f14 = f13;
        InterfaceC4352n interfaceC4352n3 = interfaceC4352n;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(935066835);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87157i(list) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q.m87147d(f14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i18 = i15 & 64;
        if (i18 == 0) {
            if ((1572864 & i14) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? 1048576 : 524288;
            }
            if ((12582912 & i14) == 0) {
                if (c28655q.m87157i(interfaceC4352n3)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i16 |= i17;
            }
            if ((4793491 & i16) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(40);
                if (str == null) {
                    str2 = "Moments";
                } else {
                    str2 = str;
                }
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(Integer.valueOf(i13), c28655q);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Integer.valueOf(list.size()), c28655q);
                int i19 = i16 >> 15;
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(Float.valueOf(f14), c28655q);
                interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(function1, c28655q);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11348f.m30553a(0.0f);
                    c28655q.m87172p0(objM87133R2);
                }
                c11344e = (C11344e) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c1M87238F3);
                objM87133R4 = c28655q.m87133R();
                if (!zM87153g || objM87133R4 == c28676v0) {
                    objM87133R4 = new C31915d(interfaceC28690z0, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, 23);
                    interfaceC28601c2 = interfaceC28601c1M87238F;
                    interfaceC28601c3 = interfaceC28601c1M87238F2;
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c3 = interfaceC28601c1M87238F2;
                    interfaceC28601c2 = interfaceC28601c1M87238F;
                }
                InterfaceC16427n1 interfaceC16427n1M46599b = AbstractC16412k1.m46599b((Function1) objM87133R4, c28655q);
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier4, "moment_stack");
                boolean zM87153g3 = c28655q.m87153g(str2);
                Modifier modifier5 = modifier4;
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i2 = zM87153g3 | z14 | c28655q.m87157i(list);
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | zM87157i2;
                objM87133R5 = c28655q.m87133R();
                if (z16 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C2588o1(i13, str2, list, function1);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R5);
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62972x;
                boolean zM120499U = m120499U(interfaceC28601c1);
                zM87157i = c28655q.m87157i(c11344e);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i || objM87133R6 == c28676v0) {
                    objM87133R6 = new c(c11344e, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R6);
                }
                Function3 function3 = (Function3) objM87133R6;
                zM87153g2 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(r20) | c28655q.m87147d(fMo743q0) | c28655q.m87157i(c11344e) | c28655q.m87153g(interfaceC28601c1M87238F4);
                objM87133R7 = c28655q.m87133R();
                if (zM87153g2 || objM87133R7 == c28676v0) {
                    objM87133R7 = new d(interfaceC28690z0, fMo743q0, c11344e, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1M87238F3, interfaceC28601c1, interfaceC28601c1M87238F4, null);
                    c28655q.m87172p0(objM87133R7);
                }
                Modifier modifierM46598a = AbstractC16412k1.m46598a(modifierM51775c, interfaceC16427n1M46599b, enumC16377d2, z4, null, zM120499U, function3, (Function3) objM87133R7, false, 136);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM46598a);
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
                f14 = f13;
                InterfaceC4352n interfaceC4352n4 = interfaceC4352n;
                interfaceC4352n4.invoke(C1100b.f4583a, Float.valueOf(m120516f0(((C28617g1) interfaceC28690z0).m87022x(), f14)), c28655q, Integer.valueOf((i19 & 896) | 6));
                c28655q.m87173q(true);
                modifier3 = modifier5;
                interfaceC4352n2 = interfaceC4352n4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC4352n2 = interfaceC4352n3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15101o5(list, i13, function1, str, z4, f14, modifier3, interfaceC4352n2, i14, i15);
            }
        }
        i16 |= 1572864;
        modifier2 = modifier;
        if ((12582912 & i14) == 0) {
            if (c28655q.m87157i(interfaceC4352n3)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i16 |= i17;
        }
        if ((4793491 & i16) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i16 & 1, z13)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(40);
            if (str == null) {
                str2 = "Moments";
            } else {
                str2 = str;
            }
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(Integer.valueOf(i13), c28655q);
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(Integer.valueOf(list.size()), c28655q);
            int i110 = i16 >> 15;
            interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(Float.valueOf(f14), c28655q);
            interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(function1, c28655q);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11348f.m30553a(0.0f);
                c28655q.m87172p0(objM87133R2);
            }
            c11344e = (C11344e) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c1M87238F3);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R4 = new C31915d(interfaceC28690z0, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, 23);
                interfaceC28601c2 = interfaceC28601c1M87238F;
                interfaceC28601c3 = interfaceC28601c1M87238F2;
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C31915d(interfaceC28690z0, interfaceC28601c1M87238F, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, 23);
                interfaceC28601c2 = interfaceC28601c1M87238F;
                interfaceC28601c3 = interfaceC28601c1M87238F2;
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC16427n1 interfaceC16427n1M46599b2 = AbstractC16412k1.m46599b((Function1) objM87133R4, c28655q);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier4, "moment_stack");
            boolean zM87153g4 = c28655q.m87153g(str2);
            Modifier modifier6 = modifier4;
            if ((i16 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zM87157i3 = zM87153g4 | z14 | c28655q.m87157i(list);
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | zM87157i3;
            objM87133R5 = c28655q.m87133R();
            if (z16) {
                objM87133R5 = new C2588o1(i13, str2, list, function1);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2588o1(i13, str2, list, function1);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3599a2, false, (Function1) objM87133R5);
            EnumC16377d2 enumC16377d3 = EnumC16377d2.f62972x;
            boolean zM120499U2 = m120499U(interfaceC28601c1);
            zM87157i = c28655q.m87157i(c11344e);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R6 = new c(c11344e, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new c(c11344e, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R6);
            }
            Function3 function4 = (Function3) objM87133R6;
            zM87153g2 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(r20) | c28655q.m87147d(fMo743q0) | c28655q.m87157i(c11344e) | c28655q.m87153g(interfaceC28601c1M87238F4);
            objM87133R7 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R7 = new d(interfaceC28690z0, fMo743q0, c11344e, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1M87238F3, interfaceC28601c1, interfaceC28601c1M87238F4, null);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new d(interfaceC28690z0, fMo743q0, c11344e, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1M87238F3, interfaceC28601c1, interfaceC28601c1M87238F4, null);
                c28655q.m87172p0(objM87133R7);
            }
            Modifier modifierM46598a2 = AbstractC16412k1.m46598a(modifierM51775c2, interfaceC16427n1M46599b2, enumC16377d3, z4, null, zM120499U2, function4, (Function3) objM87133R7, false, 136);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM46598a2);
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
            f14 = f13;
            InterfaceC4352n interfaceC4352n5 = interfaceC4352n;
            interfaceC4352n5.invoke(C1100b.f4583a, Float.valueOf(m120516f0(((C28617g1) interfaceC28690z0).m87022x(), f14)), c28655q, Integer.valueOf((i110 & 896) | 6));
            c28655q.m87173q(true);
            modifier3 = modifier6;
            interfaceC4352n2 = interfaceC4352n5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC4352n2 = interfaceC4352n3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15101o5(list, i13, function1, str, z4, f14, modifier3, interfaceC4352n2, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final int m120490L(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m120491M(InterfaceC28690z0 interfaceC28690z0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, float f13) {
        C28617g1 c28617g1 = (C28617g1) interfaceC28690z0;
        c28617g1.m87023y(m120514e0(c28617g1.m87022x() + f13, m120490L(interfaceC28670t2), m120496R(interfaceC28670t3), m120497S(interfaceC28670t4)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m120492N(String str, final int i13, final List list, final Function1 function1, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str + ", " + (i13 + 1) + " of " + list.size(), semantics);
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (i13 < AbstractC37056f.m118951C(list)) {
            final int i14 = 0;
            c26460cM119000x.add(new C18022d("Next", new InterfaceC4339a() { // from class: wr0.t0
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    boolean zM120493O;
                    switch (i14) {
                        case 0:
                            zM120493O = AbstractC37557u0.m120493O(function1, i13, list);
                            break;
                        default:
                            zM120493O = AbstractC37557u0.m120494P(function1, i13, list);
                            break;
                    }
                    return Boolean.valueOf(zM120493O);
                }
            }));
        }
        if (i13 > 0) {
            final int i15 = 1;
            c26460cM119000x.add(new C18022d("Previous", new InterfaceC4339a() { // from class: wr0.t0
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    boolean zM120493O;
                    switch (i15) {
                        case 0:
                            zM120493O = AbstractC37557u0.m120493O(function1, i13, list);
                            break;
                        default:
                            zM120493O = AbstractC37557u0.m120494P(function1, i13, list);
                            break;
                    }
                    return Boolean.valueOf(zM120493O);
                }
            }));
        }
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        C18043y c18043y = AbstractC18029k.f69976w;
        InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[28];
        c18043y.m51817a(semantics, c26460cM118988k);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final boolean m120493O(Function1 function1, int i13, List list) {
        function1.invoke(Integer.valueOf(m120524j0(i13, list.size())));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final boolean m120494P(Function1 function1, int i13, List list) {
        function1.invoke(Integer.valueOf(m120536p0(i13, list.size())));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m120495Q(List list, int i13, Function1 function1, String str, boolean z4, float f13, Modifier modifier, InterfaceC4352n interfaceC4352n, int i14, int i15, Composer composer, int i16) {
        m120489K(list, i13, function1, str, z4, f13, modifier, interfaceC4352n, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final int m120496R(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final float m120497S(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final Function1 m120498T(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: U */
    private static final boolean m120499U(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m120500V(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: d0 */
    private static final C37519b0 m120512d0(C37519b0 c37519b0) {
        MomentCardFillMode fillMode = c37519b0.getFillMode();
        MomentCardFillMode momentCardFillMode = MomentCardFillMode.FILL;
        return fillMode == momentCardFillMode ? c37519b0 : C37519b0.m120301b(c37519b0, null, momentCardFillMode, null, null, null, null, null, null, 253, null);
    }

    /* JADX INFO: renamed from: e0 */
    public static final float m120514e0(float f13, int i13, int i14, float f14) {
        if (i14 <= 1) {
            return 0.0f;
        }
        float f15 = i13 >= i14 - 1 ? 0.0f : -f14;
        if (i13 <= 0) {
            f14 = 0.0f;
        }
        return AbstractC12889b.m36283m(f13, f15, f14);
    }

    /* JADX INFO: renamed from: f0 */
    public static final float m120516f0(float f13, float f14) {
        if (f14 <= 0.0f) {
            return 0.0f;
        }
        return (-f13) / f14;
    }

    /* JADX INFO: renamed from: g0 */
    private static final Modifier m120518g0(Modifier modifier, float f13, float f14, long j7) {
        return AbstractC1125a.m3478a(modifier, new C12769l(f13, j7, f14, 10));
    }

    /* JADX INFO: renamed from: h0 */
    public static Modifier m120520h0(Modifier modifier, float f13, float f14, long j7, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f14 = 5 * 8;
        }
        if ((i13 & 4) != 0) {
            j7 = C17919x.m51541c(0.6f, C17919x.f69625b);
        }
        return m120518g0(modifier, f13, f14, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m120522i0(float f13, long j7, float f14, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17887h c17887hM51522j = AbstractC17918w0.m51522j();
        float fMo743q0 = drawBehind.mo743q0(f13);
        Paint paint = c17887hM51522j.f69578a;
        paint.setAntiAlias(true);
        paint.setColor(AbstractC17918w0.m51506H(j7));
        paint.setShadowLayer(drawBehind.mo743q0(f14), 0.0f, 0.0f, AbstractC17918w0.m51506H(j7));
        drawBehind.mo744t0().m716w().mo51424o(0.0f, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)), fMo743q0, fMo743q0, c17887hM51522j);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m120524j0(int i13, int i14) {
        if (i14 <= 0) {
            return 0;
        }
        int i15 = i13 + 1;
        int i16 = i14 - 1;
        return i15 > i16 ? i16 : i15;
    }

    /* JADX INFO: renamed from: k0 */
    public static final float m120526k0(int i13, float f13, float f14) {
        if (i13 <= 0) {
            return 0;
        }
        float fM120530m0 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            fM120530m0 += (m120530m0(i14) * f13) - f14;
        }
        return fM120530m0;
    }

    /* JADX INFO: renamed from: l0 */
    public static final float m120528l0(float f13) {
        return 1.0f - (Math.max(f13, 0.0f) * 0.1f);
    }

    /* JADX INFO: renamed from: m0 */
    public static final float m120530m0(int i13) {
        return m120528l0(i13);
    }

    /* JADX INFO: renamed from: n0 */
    public static final float m120532n0(float f13) {
        return Math.max(f13, 0.0f) * 0.2f;
    }

    /* JADX INFO: renamed from: o0 */
    public static final float m120534o0(float f13, float f14, float f15) {
        if (f13 <= 0.0f) {
            return f14 * f13;
        }
        int iFloor = (int) Math.floor(f13);
        float f16 = f13 - iFloor;
        float fM120526k0 = m120526k0(iFloor, f14, f15);
        return ((m120526k0(iFloor + 1, f14, f15) - fM120526k0) * f16) + fM120526k0;
    }

    /* JADX INFO: renamed from: p0 */
    public static final int m120536p0(int i13, int i14) {
        int i15;
        if (i14 > 0 && (i15 = i13 - 1) >= 0) {
            return i15;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q0 */
    public static final float m120538q0(float f13, float f14, float f15, int i13, int i14, float f16) {
        if (i14 <= 1) {
            return 0.0f;
        }
        boolean z4 = i13 < i14 - 1;
        boolean z13 = i13 > 0;
        if (z4 && (f13 <= (-f15) || (f13 <= 0.0f && f14 <= -400.0f))) {
            return -f16;
        }
        if (!z13 || (f13 < f15 && (f13 < 0.0f || f14 < 400.0f))) {
            return 0.0f;
        }
        return f16;
    }

    /* JADX INFO: renamed from: r0 */
    public static final float m120540r0(float f13, float f14, int i13) {
        int i14 = 0;
        if (i13 <= 0) {
            return 0;
        }
        float fM120530m0 = 0;
        if (i13 >= 0) {
            while (true) {
                fM120530m0 += m120530m0(i14) * f13;
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        return (fM120530m0 - f14) / i13;
    }

    /* JADX INFO: renamed from: s0 */
    public static final List<C37561w0> m120542s0(int i13, int i14, float f13) {
        if (i14 <= 0) {
            return C25271y.f99162w;
        }
        int i15 = (i14 - i13) - 1;
        int i16 = 0;
        if (i15 < 0) {
            i15 = 0;
        }
        int i17 = (f13 >= 0.0f || i13 <= 0) ? 0 : -1;
        if (f13 > 0.0f && i15 > 0) {
            i16 = 1;
        }
        int iMin = Math.min(3, i15) + 1 + i16;
        int i18 = i15 + 1;
        if (iMin > i18) {
            iMin = i18;
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(i17, iMin);
        ArrayList arrayList = new ArrayList();
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            int i19 = i13 + iNextInt;
            C37561w0 c37561w0 = (i19 < 0 || i19 >= i14) ? null : new C37561w0(iNextInt, i19);
            if (c37561w0 != null) {
                arrayList.add(c37561w0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7 A[LOOP:0: B:54:0x00c1->B:56:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public static final void m120543t(Modifier modifier, final C37563x0 viewState, Function1 function1, Composer composer, final int i13, final int i14) {
        final Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        final Function1 function3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C28676v0 c28676v0;
        final Function1 function4;
        List<C37519b0> listM120567b;
        ArrayList arrayList;
        Iterator<T> it;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC28593a1 interfaceC28593a1;
        boolean zM87153g2;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        int iM36284n;
        boolean zM87157i;
        Object objM87133R3;
        InterfaceC28593a1 interfaceC28593a2;
        List<C37519b0> list;
        boolean zM87157i2;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(348186142);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C37445e0(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                listM120567b = viewState.m120567b();
                if (listM120567b.isEmpty()) {
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i18 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: wr0.o0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i18) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC37557u0.m120546w(modifier2, viewState, function4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC37557u0.m120545v(modifier2, viewState, function4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier3 = modifier2;
                    List<C37519b0> list2 = listM120567b;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C37519b0) it.next()).getId());
                    }
                    zM87153g = c28655q2.m87153g(viewState.getId());
                    objM87133R = c28655q2.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                    }
                    interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                    zM87153g2 = c28655q2.m87153g(viewState.getId());
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(arrayList);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    iM36284n = AbstractC12889b.m36284n(m120547x(interfaceC28593a1), 0, AbstractC37056f.m118951C(listM120567b));
                    zM87157i = c28655q2.m87157i(arrayList) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28593a1) | c28655q2.m87157i(listM120567b);
                    objM87133R3 = c28655q2.m87133R();
                    if (!zM87157i || objM87133R3 == c28676v0) {
                        interfaceC28593a2 = interfaceC28593a1;
                        list = listM120567b;
                        objM87133R3 = new a(arrayList, interfaceC28601c1, list, interfaceC28593a2, null);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        interfaceC28593a2 = interfaceC28593a1;
                        list = listM120567b;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, arrayList);
                    String id4 = viewState.getId();
                    Integer numValueOf = Integer.valueOf(iM36284n);
                    zM87157i2 = c28655q2.m87157i(viewState) | ((i15 & 896) == 256) | c28655q2.m87149e(iM36284n);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R4 == c28676v0) {
                        objM87133R4 = new b(function4, viewState, iM36284n, null);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(id4, numValueOf, (InterfaceC4351m) objM87133R4, c28655q2);
                    Function1 function5 = function4;
                    c28655q = c28655q2;
                    AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier3), null, false, AbstractC37817c.m121344e(1707324936, c28655q2, new C2030t(iM36284n, 4, list, interfaceC28593a2, viewState, function5)), c28655q, 3072, 6);
                    function3 = function5;
                    modifier2 = modifier3;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i19 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: wr0.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i19) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC37557u0.m120546w(modifier2, viewState, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC37557u0.m120545v(modifier2, viewState, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier2 = C2314t.f9131w;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C37445e0(20);
                    c28655q2.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            listM120567b = viewState.m120567b();
            if (listM120567b.isEmpty()) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i110 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: wr0.o0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i110) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC37557u0.m120546w(modifier2, viewState, function4, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC37557u0.m120545v(modifier2, viewState, function4, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier4 = modifier2;
                List<C37519b0> list3 = listM120567b;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C37519b0) it.next()).getId());
                }
                zM87153g = c28655q2.m87153g(viewState.getId());
                objM87133R = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                } else {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                zM87153g2 = c28655q2.m87153g(viewState.getId());
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R2 = AbstractC28683x.m87272z(arrayList);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = AbstractC28683x.m87272z(arrayList);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                iM36284n = AbstractC12889b.m36284n(m120547x(interfaceC28593a1), 0, AbstractC37056f.m118951C(listM120567b));
                zM87157i = c28655q2.m87157i(arrayList) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28593a1) | c28655q2.m87157i(listM120567b);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i) {
                    interfaceC28593a2 = interfaceC28593a1;
                    list = listM120567b;
                    objM87133R3 = new a(arrayList, interfaceC28601c1, list, interfaceC28593a2, null);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    interfaceC28593a2 = interfaceC28593a1;
                    list = listM120567b;
                    objM87133R3 = new a(arrayList, interfaceC28601c1, list, interfaceC28593a2, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, arrayList);
                String id5 = viewState.getId();
                Integer numValueOf2 = Integer.valueOf(iM36284n);
                zM87157i2 = c28655q2.m87157i(viewState) | ((i15 & 896) == 256) | c28655q2.m87149e(iM36284n);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new b(function4, viewState, iM36284n, null);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new b(function4, viewState, iM36284n, null);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(id5, numValueOf2, (InterfaceC4351m) objM87133R4, c28655q2);
                Function1 function6 = function4;
                c28655q = c28655q2;
                AbstractC22953f.m66714a(AbstractC1102d.m3409f(1.0f, modifier4), null, false, AbstractC37817c.m121344e(1707324936, c28655q2, new C2030t(iM36284n, 4, list, interfaceC28593a2, viewState, function6)), c28655q, 3072, 6);
                function3 = function6;
                modifier2 = modifier4;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i111 = 0;
            interfaceC4351m = new InterfaceC4351m() { // from class: wr0.o0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i111) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC37557u0.m120546w(modifier2, viewState, function3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC37557u0.m120545v(modifier2, viewState, function3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m120544u(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m120545v(Modifier modifier, C37563x0 c37563x0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120543t(modifier, c37563x0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m120546w(Modifier modifier, C37563x0 c37563x0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120543t(modifier, c37563x0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final int m120547x(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m120548y(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m120549z(final List list, final int i13, final InterfaceC28593a1 interfaceC28593a1, C37563x0 c37563x0, final Function1 function1, InterfaceC23004v BoxWithConstraints, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i14 & 6) == 0) {
            i15 = i14 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i15 = i14;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float fM3403d = ((C1101c) BoxWithConstraints).m3403d();
            int size = list.size();
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (size == 1) {
                c28655q.m87150e0(1914533931);
                boolean zM87153g = c28655q.m87153g(interfaceC28593a1);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C37531h0(interfaceC28593a1, 2);
                    c28655q.m87172p0(objM87133R);
                }
                m120489K(list, i13, (Function1) objM87133R, c37563x0.getAccessibilityLabel(), false, 0.0f, AbstractC1102d.m3409f(1.0f, c2314t), AbstractC37817c.m121344e(1982042459, c28655q, new InterfaceC4352n() { // from class: wr0.p0
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC37557u0.m120480B(list, i13, function1, (InterfaceC23001u) obj, ((Float) obj2).floatValue(), (Composer) obj3, iIntValue);
                    }
                }), c28655q, 14376960, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1915151296);
                final float f13 = 0.6980609f * fM3403d;
                final float f14 = f13 / 0.75f;
                float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13);
                final float fM120540r0 = m120540r0(f13, fM3403d, Math.min(3, list.size() - 1));
                boolean zM87153g2 = c28655q.m87153g(interfaceC28593a1) | c28655q.m87157i(list);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37549q0(list, interfaceC28593a1, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                m120489K(list, i13, (Function1) objM87133R2, c37563x0.getAccessibilityLabel(), true, fMo743q0, AbstractC1102d.m3411h(f14, AbstractC1102d.m3409f(1.0f, c2314t)), AbstractC37817c.m121344e(-1999373198, c28655q, new InterfaceC4352n() { // from class: wr0.r0
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC37557u0.m120482D(list, i13, f13, f14, fM120540r0, interfaceC28593a1, function1, (InterfaceC23001u) obj, ((Float) obj2).floatValue(), (Composer) obj3, iIntValue);
                    }
                }), c28655q, 12607488, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
