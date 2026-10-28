package f01;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b30.C2609r;
import b91.C2886a;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4789l;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.edit.preview.C9809a;
import com.whoop.whoopaction.domain.models.Action;
import d30.C11546l;
import dp0.C12253i;
import e11.C12582b;
import ev2.C13693b;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hb3.AbstractC17104a0;
import hy0.C17750h1;
import hy0.EnumC17729c0;
import hy0.EnumC17775o1;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27246d;
import ny0.C27256h;
import ny0.C27273p0;
import ny0.EnumC27272p;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23001u;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p41.AbstractC28832c;
import p41.C28830a;
import p41.C28833d;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p720m91.AbstractC25303l;
import p720m91.C25292c0;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rz0.AbstractC31926e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: f01.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aS\u0010\u0018\u001a\u00020\u0006*\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001b\"\u0017\u0010\"\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lf01/q;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Lf01/q;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lf01/p;", "style", "", "isCoachRecommended", "Lf01/i;", "I", "(Lf01/p;ZLandroidx/compose/runtime/Composer;I)Lf01/i;", "Ll0/u;", "Ll0/k1;", "paddingValues", "Lgz0/m0;", "icon", "Ly81/e;", "color", "E", "(Ll0/u;Landroidx/compose/ui/Modifier;Lf01/q;Ll0/k1;Lgz0/m0;Ly81/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "y", "(Landroidx/compose/runtime/Composer;I)V", "C", "A", "a", "Lf01/q;", "getFakeButtonCardState", "()Lf01/q;", "fakeButtonCardState", "isExpanded", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13881n {

    /* JADX INFO: renamed from: a */
    private static final C13890q f49490a;

    /* JADX INFO: renamed from: f01.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.card.ButtonCardKt$ButtonCard$2$1", m100430f = "ButtonCard.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f49491w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13890q f49492x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f49493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13890q c13890q, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f49492x = c13890q;
            this.f49493y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f49492x, this.f49493y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f49491w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC13881n.m39395q(this.f49493y, this.f49492x.getShouldShowExpandedItems());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f49494w = new b();

        /* JADX INFO: renamed from: a */
        public final long m39405a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39405a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f01.n$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m39406a(Composer composer, int i13) throws XmlPullParserException, IOException {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(480147171);
            float f13 = 8;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3394p(1 * f13, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), AbstractC17918w0.f69621a);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            AbstractC13881n.m39392n(new C13890q("schedule_test_button_card", "Time to Update", "Your clinical report and action plan are outdated based on newer tests you have uploaded.", new AbstractC22403o.a(AbstractC16272a.f62152s), null, null, new C27256h(AbstractC8693b.m21278l("SCHEDULE YOUR NEXT TEST"), null, null, null, null, null, EnumC27272p.HIGHLIGHT, new C9598e(null, null, null, 7, null), objArr2, objArr3, objArr4, null, objArr, false, true, null, false, false, null, null, null, null, null, null, null, 33529612, null), objArr8, objArr9, objArr10, false, null, null, objArr5, objArr6, objArr7, 0 == true ? 1 : 0, 130976, null), null, null, c28655q, 0, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m39406a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m39407a(Composer composer, int i13) throws XmlPullParserException, IOException {
            int i14 = 2;
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1055914193);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3394p, c38072d.m121949b(c28655q, 6).getTransparent(), AbstractC17918w0.f69621a);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62152s);
            C17750h1 c17750h1 = new C17750h1(AbstractC8693b.m21278l("Starting at $150/test"), null, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, EnumC39333f.ACCENT_POSITIVE_TREND, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null);
            TextResource textResource = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            C25292c0 c25292c0 = new C25292c0(0.0f, 0.0f, 3, null);
            EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_ATTENTION_ORANGE;
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Restart your subscription to purchase additional tests");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = e.f49495w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = f.f49496w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC13881n.m39392n(new C13890q("schedule_test_button_card", "Time to Update", "Your clinical report and action plan are outdated based on newer tests you have uploaded.", aVar, null, null, null, c17750h1, AbstractC37056f.m118959K(c25292c0, new C4092p2(enumC16313m0, 0.0f, null, null, textResourceM21278l, null, interfaceC39332eM125323a, null, p745y81.Function1.m125323a((Function1) objM87133R2), null, null, null, null, false, null, null, null, AbstractC37056f.m118958J(new C25306o(new C27273p0(AbstractC8693b.m21278l("RESTART SUBSCRIPTION"), new C9598e(null, null, null, 7, null), 0 == true ? 1 : 0, new C39274g(AbstractC18489d0.m53359E(c38072d), textResource, i14, objArr3 == true ? 1 : 0), 0 == true ? 1 : 0, null, false, null, null, null, null, false, null, false, 16308, null), objArr2 == true ? 1 : 0, i14, objArr == true ? 1 : 0)), null, null, 917166, null), new C25292c0(0.0f, 0.0f, 3, null), new C27256h(AbstractC8693b.m21278l("SCHEDULE YOUR NEXT TEST"), null, null, null, null, null, EnumC27272p.DEFAULT, new C9598e(null, null, null, 7, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, false, true, null, false, false, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 33529612, null)), 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 130656, 0 == true ? 1 : 0), null, null, c28655q, 0, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m39407a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f49495w = new e();

        /* JADX INFO: renamed from: a */
        public final long m39408a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39408a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f01.n$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f49496w = new f();

        /* JADX INFO: renamed from: a */
        public final long m39409a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39409a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f01.n$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m39410a(Composer composer, int i13) throws XmlPullParserException, IOException {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(522551050);
            float f13 = 8;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3394p(1 * f13, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, 6).getTransparent(), AbstractC17918w0.f69621a);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            String str = "schedule_test_button_card";
            String str2 = "Time to Update";
            String str3 = "Your clinical report and action plan are outdated based on newer tests you have uploaded.";
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            AbstractC13881n.m39392n(new C13890q(str, str2, str3, new AbstractC22403o.a(AbstractC16272a.f62152s), null, null, new C27256h(AbstractC8693b.m21278l("SCHEDULE YOUR NEXT TEST"), null, null, null, null, null, EnumC27272p.HIGHLIGHT, new C9598e(null, null, null, 7, null), objArr2, objArr3, objArr4, null, objArr, false, true, null, false, false, null, null, null, null, null, null, null, 33529612, null), new C17750h1(AbstractC8693b.m21278l("Starting at $150/test"), null, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, EnumC39333f.ACCENT_POSITIVE_TREND, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null), null, 0 == true ? 1 : 0, false, null, null, objArr5, null, objArr6, null, 130848, null), null, null, c28655q, 0, 6);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m39410a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.n$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49497a;

        static {
            int[] iArr = new int[EnumC13887p.values().length];
            try {
                iArr[EnumC13887p.RAF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13887p.TRANSPARENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13887p.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13887p.HIGHLIGHTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f49497a = iArr;
        }
    }

    /* JADX INFO: renamed from: f01.n$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f49498w = new i();

        /* JADX INFO: renamed from: a */
        public final long m39411a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39411a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f01.n$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f49499w = new j();

        /* JADX INFO: renamed from: a */
        public final long m39412a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39412a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62152s);
        String str = null;
        C17750h1 c17750h1 = new C17750h1(AbstractC8693b.m21278l("Starting at $150/test"), null, EnumC39333f.ACCENT_POSITIVE_TREND_15, null, EnumC39333f.ACCENT_POSITIVE_TREND, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194282, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("SCHEDULE YOUR NEXT TEST");
        EnumC27272p enumC27272p = EnumC27272p.DEFAULT;
        EnumC16313m0 enumC16313m0 = null;
        EnumC39333f enumC39333f = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        int i13 = 2;
        List listM118959K = AbstractC37056f.m118959K(new C27256h(textResourceM21278l, enumC16313m0, null, enumC39333f, null, null, enumC27272p, new C9598e(null, null, null, 7, null), objArr, objArr3, objArr4, null, objArr2, false, true, str, false, false, null, null, null, null, null, null, null, 33529612, null), C28833d.m87698b(AbstractC28832c.m87697l(), null, null, null, null, null, false, 31, null));
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ATTENTION_ORANGE;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Restart your subscription to purchase additional tests");
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(i.f49498w);
        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a(j.f49499w);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("RESTART SUBSCRIPTION");
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        boolean z4 = false;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        C4092p2 c4092p2 = new C4092p2(enumC16313m1, 0.0f, null, null, textResourceM21278l2, null, interfaceC39332eM125323a, null, interfaceC39332eM125323a2, null, null, null, null, false, null, null, null, AbstractC37056f.m118958J(new C25306o(new C27273p0(textResourceM21278l3, new C9598e(objArr6, objArr7, objArr5, 7, null), 0 == true ? 1 : 0, new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), objArr8, null, false, str, null, null, objArr9, z4, objArr10, false, 16308, 0 == true ? 1 : 0), 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0)), null, null, 917166, null);
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        InterfaceC25312u[] interfaceC25312uArr = {c4092p2, new C27256h(AbstractC8693b.m21278l("SCHEDULE YOUR NEXT TEST"), objArr19, objArr13, objArr14, null, null, enumC27272p, new C9598e(null, null, objArr12, 7, objArr11), objArr17, null, objArr15, objArr22, null, false, true, objArr23, false, z4, objArr16, null, null, objArr20, objArr21, null, objArr18, 33529612, null)};
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        f49490a = new C13890q("schedule_test_button_card", "Time to Update", "Your clinical report and action plan are outdated based on newer tests you have uploaded.", aVar, null, null, null, c17750h1, listM118959K, AbstractC37056f.m118959K(interfaceC25312uArr), false, EnumC16313m0.CROSS, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, objArr25, 128096, objArr24);
    }

    /* JADX INFO: renamed from: A */
    public static final void m39370A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1580010526);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new d()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m39371B(int i13, Composer composer, int i14) {
        m39370A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m39372C(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1505651439);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new g()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m39373D(int i13, Composer composer, int i14) {
        m39372C(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5 A[PHI: r0 r9
      0x00f5: PHI (r0v20 int) = (r0v15 int), (r0v15 int), (r0v22 int) binds: [B:81:0x0100, B:75:0x00f1, B:76:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r9v16 androidx.compose.ui.Modifier) = (r9v4 androidx.compose.ui.Modifier), (r9v2 androidx.compose.ui.Modifier), (r9v2 androidx.compose.ui.Modifier) binds: [B:81:0x0100, B:75:0x00f1, B:76:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0131  */
    /* JADX WARN: Code duplicated, block: B:89:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:98:0x0193  */
    /* JADX INFO: renamed from: E */
    public static final void m39374E(InterfaceC23001u interfaceC23001u, Modifier modifier, C13890q viewState, InterfaceC22973k1 interfaceC22973k1, EnumC16313m0 icon, InterfaceC39332e color, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        InterfaceC22973k1 interfaceC22973k2;
        boolean z4;
        Modifier modifier3;
        InterfaceC22973k1 interfaceC22973k1M3381c;
        C28677v1 c28677v1M87180u;
        int i16;
        C2314t c2314t;
        int i17;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean zM87157i;
        Object objM87133R2;
        int i18;
        boolean zM87157i2;
        int i19;
        int i24;
        int i25;
        int i26;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-594382442);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 1;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(viewState)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i15 |= i26;
            }
            if ((i13 & 3072) == 0) {
                if ((i14 & 4) == 0) {
                    interfaceC22973k2 = interfaceC22973k1;
                    if (c28655q.m87153g(interfaceC22973k2)) {
                        i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i15 |= i25;
                } else {
                    interfaceC22973k2 = interfaceC22973k1;
                }
                i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                i15 |= i25;
            } else {
                interfaceC22973k2 = interfaceC22973k1;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87149e(icon.ordinal())) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((196608 & i13) == 0) {
                if ((262144 & i13) == 0) {
                    zM87157i2 = c28655q.m87153g(color);
                } else {
                    zM87157i2 = c28655q.m87157i(color);
                }
                if (zM87157i2) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i15 |= i18;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i16 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i16 != 0 || c28655q.m87118C()) {
                    if (i27 != 0) {
                        modifier2 = c2314t;
                    }
                    if ((i14 & 4) != 0) {
                        float f13 = ((float) 1.5d) * 8;
                        interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, f13, f13, f13, 1);
                        Modifier modifier5 = modifier2;
                        i17 = i15 & (-7169);
                        modifier4 = modifier5;
                    }
                    c28655q.m87175r();
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
                    long jMo134584toComposableColorWaAFU9c = color.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 15) & 14);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                    zM87157i = c28655q.m87157i(viewState) | ((i17 & 3670016) == 1048576);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C11546l(24, onViewEvent, viewState);
                        c28655q.m87172p0(objM87133R2);
                    }
                    float f14 = 4;
                    AbstractC23164r1.m67133b(c27430eM107874S, null, interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f14 * f14, AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1092a.m3360e(c2314t, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28))), C2299e.f9116y).mo3471e(modifier4), jMo134584toComposableColorWaAFU9c, c28655q, 48, 0);
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -7169;
                    }
                }
                Modifier modifier6 = modifier2;
                i17 = i15;
                modifier4 = modifier6;
                interfaceC22973k1M3381c = interfaceC22973k2;
                c28655q.m87175r();
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
                long jMo134584toComposableColorWaAFU9c2 = color.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 15) & 14);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                zM87157i = c28655q.m87157i(viewState) | ((i17 & 3670016) == 1048576);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11546l(24, onViewEvent, viewState);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11546l(24, onViewEvent, viewState);
                    c28655q.m87172p0(objM87133R2);
                }
                float f15 = 4;
                AbstractC23164r1.m67133b(c27430eM107874S2, null, interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1092a.m3360e(c2314t, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R2, 28))), C2299e.f9116y).mo3471e(modifier4), jMo134584toComposableColorWaAFU9c2, c28655q, 48, 0);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC22973k1M3381c = interfaceC22973k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) interfaceC23001u, (Object) modifier3, (Object) viewState, (Object) interfaceC22973k1M3381c, (Object) icon, (Object) color, onViewEvent, i13, i14, 6);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(viewState)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i15 |= i26;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC22973k2 = interfaceC22973k1;
                if (c28655q.m87153g(interfaceC22973k2)) {
                    i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i25;
            } else {
                interfaceC22973k2 = interfaceC22973k1;
            }
            i25 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i25;
        } else {
            interfaceC22973k2 = interfaceC22973k1;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87149e(icon.ordinal())) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((196608 & i13) == 0) {
            if ((262144 & i13) == 0) {
                zM87157i2 = c28655q.m87153g(color);
            } else {
                zM87157i2 = c28655q.m87157i(color);
            }
            if (zM87157i2) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i19;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i15 |= i18;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i16 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    float f16 = ((float) 1.5d) * 8;
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, f16, f16, f16, 1);
                    Modifier modifier7 = modifier2;
                    i17 = i15 & (-7169);
                    modifier4 = modifier7;
                } else {
                    Modifier modifier8 = modifier2;
                    i17 = i15;
                    modifier4 = modifier8;
                    interfaceC22973k1M3381c = interfaceC22973k2;
                }
            } else {
                if (i27 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    float f17 = ((float) 1.5d) * 8;
                    interfaceC22973k1M3381c = AbstractC1099a.m3381c(0.0f, f17, f17, f17, 1);
                    Modifier modifier9 = modifier2;
                    i17 = i15 & (-7169);
                    modifier4 = modifier9;
                } else {
                    Modifier modifier10 = modifier2;
                    i17 = i15;
                    modifier4 = modifier10;
                    interfaceC22973k1M3381c = interfaceC22973k2;
                }
            }
            c28655q.m87175r();
            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(icon.toWhoopIcon(), c28655q, 6);
            long jMo134584toComposableColorWaAFU9c3 = color.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 15) & 14);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
            zM87157i = c28655q.m87157i(viewState) | ((i17 & 3670016) == 1048576);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C11546l(24, onViewEvent, viewState);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11546l(24, onViewEvent, viewState);
                c28655q.m87172p0(objM87133R2);
            }
            float f18 = 4;
            AbstractC23164r1.m67133b(c27430eM107874S3, null, interfaceC23001u.mo3400a(AbstractC1102d.m3419p(f18 * f18, AbstractC1099a.m3393o(interfaceC22973k1M3381c, AbstractC1092a.m3360e(c2314t, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R2, 28))), C2299e.f9116y).mo3471e(modifier4), jMo134584toComposableColorWaAFU9c3, c28655q, 48, 0);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC22973k1M3381c = interfaceC22973k2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) interfaceC23001u, (Object) modifier3, (Object) viewState, (Object) interfaceC22973k1M3381c, (Object) icon, (Object) color, onViewEvent, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m39375F(Function1 function1, C13890q c13890q) {
        function1.invoke(new C13869j(c13890q.getId()));
        Action actionM39503e = c13890q.getDismissAction();
        if (actionM39503e != null) {
            function1.invoke(actionM39503e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m39376G(InterfaceC23001u interfaceC23001u, Modifier modifier, C13890q c13890q, InterfaceC22973k1 interfaceC22973k1, EnumC16313m0 enumC16313m0, InterfaceC39332e interfaceC39332e, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m39374E(interfaceC23001u, modifier, c13890q, interfaceC22973k1, enumC16313m0, interfaceC39332e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final C13866i m39378I(EnumC13887p enumC13887p, boolean z4, Composer composer, int i13) {
        long jM125379a1;
        C38072d c38072d = C38072d.f163053a;
        C2886a c2886aM8420a = c38072d.m121952e(composer, 6).getB1();
        long jM125430y = c38072d.m121949b(composer, 6).getBrandWhite();
        C2886a c2886aM8421b = c38072d.m121952e(composer, 6).getB2();
        long jM125385c1 = c38072d.m121949b(composer, 6).getWhite70();
        int i14 = h.f49497a[enumC13887p.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1158981110);
            C13866i c13866i = new C13866i(null, c38072d.m121949b(c28655q, 6).getNeutral15(), null, c38072d.m121952e(c28655q, 6).getB4(), c38072d.m121949b(c28655q, 6).getRecovery(), c38072d.m121952e(c28655q, 6).getB1(), c38072d.m121949b(c28655q, 6).getBrandWhite(), null);
            c28655q.m87173q(false);
            return c13866i;
        }
        if (i14 == 2) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1158968243);
            C13866i c13866i2 = new C13866i(null, c38072d.m121949b(c28655q2, 6).getTransparent(), new C13825t(1, new C17875c1(c38072d.m121949b(c28655q2, 6).getWhite10())), c2886aM8420a, jM125430y, c2886aM8421b, jM125385c1, null);
            c28655q2.m87173q(false);
            return c13866i2;
        }
        if (i14 != 3 && i14 != 4) {
            throw AbstractC11895b.m32003v(-1158981224, (C28655q) composer, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1567799484);
        boolean z13 = enumC13887p == EnumC13887p.HIGHLIGHTED;
        AbstractC17911t abstractC17911tM43973A0 = z4 ? null : AbstractC15673b0.m43973A0();
        if (z4) {
            c28655q3.m87150e0(-1158944663);
            jM125379a1 = c38072d.m121949b(c28655q3, 6).getWhite10();
        } else {
            c28655q3.m87150e0(-1158943672);
            jM125379a1 = c38072d.m121949b(c28655q3, 6).getWhite5();
        }
        c28655q3.m87173q(false);
        C13866i c13866i3 = new C13866i(abstractC17911tM43973A0, jM125379a1, z13 ? new C13825t((float) 1.5d, AbstractC15673b0.m43989I0()) : new C13825t(1, AbstractC15673b0.m43975B0()), c2886aM8420a, jM125430y, c2886aM8421b, jM125385c1, null);
        c28655q3.m87173q(false);
        return c13866i3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0226  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x0165  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0197  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f4  */
    /* JADX INFO: renamed from: n */
    public static final void m39392n(final C13890q viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Modifier modifier4;
        C28676v0 c28676v0;
        final Function1 function4;
        Object objM87133R;
        final InterfaceC28601c1 interfaceC28601c1;
        C17750h1 c17750h1M39513o;
        EnumC17775o1 enumC17775o1M50918s;
        boolean z13;
        boolean zM87157i;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C9598e c9598eM39502c;
        int i19;
        boolean z14;
        boolean zM87157i2;
        Object objM87133R3;
        InterfaceC17869a1 interfaceC17869a1;
        Modifier modifierM5391i;
        AbstractC17911t abstractC17911tM39308a;
        Function1 function5;
        EnumC16313m0 enumC16313m0M39504f;
        Object objM87133R4;
        boolean z15;
        Modifier modifierM3357b;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1722678411);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    modifier3 = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier4 = modifier3;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C13693b(16);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowExpandedItems()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c17750h1M39513o = viewState.getTag();
                    if (c17750h1M39513o != null) {
                        enumC17775o1M50918s = c17750h1M39513o.getTagStyle();
                    } else {
                        enumC17775o1M50918s = null;
                    }
                    if (enumC17775o1M50918s == EnumC17775o1.COACH_RECOMMENDED) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    final C13866i c13866iM39378I = m39378I(viewState.getStyle(), z13, c28655q, 0);
                    Boolean boolValueOf = Boolean.valueOf(viewState.getShouldShowExpandedItems());
                    zM87157i = c28655q.m87157i(viewState);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new a(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
                    Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), 3, 4);
                    c9598eM39502c = viewState.getDestination();
                    if (c9598eM39502c == null) {
                        c28655q.m87150e0(1407626260);
                        c28655q.m87173q(false);
                        modifierM5391i = null;
                        interfaceC17869a1 = null;
                    } else {
                        c28655q.m87150e0(1407626261);
                        if ((i19 & 896) == 256) {
                            i19 = i18;
                            z14 = true;
                        } else {
                            i19 = i18;
                            z14 = false;
                        }
                        zM87157i2 = z14 | c28655q.m87157i(c9598eM39502c);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC17869a1 = null;
                        modifierM5391i = AbstractC1772c1.m5391i(modifier3, false, null, (InterfaceC4339a) objM87133R3, 3);
                        c28655q.m87173q(false);
                    }
                    if (modifierM5391i == null) {
                        i19 = i18;
                        modifierM5391i = modifier3;
                    }
                    i19 = i18;
                    Modifier modifierMo3471e = modifierM53364e.mo3471e(modifierM5391i);
                    abstractC17911tM39308a = c13866iM39378I.getBackgroundBrush();
                    if (abstractC17911tM39308a != null && (modifierM3357b = AbstractC1092a.m3357b(modifier3, abstractC17911tM39308a, interfaceC17869a1, 0.0f, 6)) != null) {
                        modifier3 = modifierM3357b;
                    }
                    final boolean z16 = z13;
                    Modifier modifier5 = modifier4;
                    AbstractC31926e.m99375j(modifierMo3471e.mo3471e(modifier3), null, c13866iM39378I.getBackgroundColor(), null, c13866iM39378I.getBorder(), null, 0.0f, AbstractC37817c.m121344e(-2108305759, c28655q, new InterfaceC4351m() { // from class: f01.l
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC13881n.m39397s(viewState, z16, c13866iM39378I, function4, interfaceC28601c1, (Composer) obj, iIntValue);
                        }
                    }), c28655q, 12582912, 106);
                    function5 = function4;
                    enumC16313m0M39504f = viewState.getDismissIcon();
                    if (enumC16313m0M39504f == null) {
                        c28655q.m87150e0(1414454785);
                        c28655q.m87173q(false);
                        z15 = true;
                    } else {
                        c28655q.m87150e0(1414454786);
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = b.f49494w;
                            c28655q.m87172p0(objM87133R4);
                        }
                        z15 = true;
                        m39374E(C1100b.f4583a, null, viewState, null, enumC16313m0M39504f, p745y81.Function1.m125323a((Function1) objM87133R4), function5, c28655q, 6 | ((i19 << 6) & 896) | ((i19 << 12) & 3670016), 5);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                    function3 = function5;
                    modifier2 = modifier5;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12582b(i13, i14, 21, modifier2, function3, viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            i18 = i15;
            if ((i18 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                modifier3 = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13693b(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowExpandedItems()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c17750h1M39513o = viewState.getTag();
                if (c17750h1M39513o != null) {
                    enumC17775o1M50918s = c17750h1M39513o.getTagStyle();
                } else {
                    enumC17775o1M50918s = null;
                }
                if (enumC17775o1M50918s == EnumC17775o1.COACH_RECOMMENDED) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                final C13866i c13866iM39378I2 = m39378I(viewState.getStyle(), z13, c28655q, 0);
                Boolean boolValueOf2 = Boolean.valueOf(viewState.getShouldShowExpandedItems());
                zM87157i = c28655q.m87157i(viewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
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
                Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), 3, 4);
                c9598eM39502c = viewState.getDestination();
                if (c9598eM39502c == null) {
                    c28655q.m87150e0(1407626260);
                    c28655q.m87173q(false);
                    modifierM5391i = null;
                    interfaceC17869a1 = null;
                } else {
                    c28655q.m87150e0(1407626261);
                    if ((i19 & 896) == 256) {
                        i19 = i18;
                        z14 = true;
                    } else {
                        i19 = i18;
                        z14 = false;
                    }
                    zM87157i2 = z14 | c28655q.m87157i(c9598eM39502c);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC17869a1 = null;
                    modifierM5391i = AbstractC1772c1.m5391i(modifier3, false, null, (InterfaceC4339a) objM87133R3, 3);
                    c28655q.m87173q(false);
                }
                if (modifierM5391i == null) {
                    i19 = i18;
                    modifierM5391i = modifier3;
                }
                i19 = i18;
                Modifier modifierMo3471e2 = modifierM53364e2.mo3471e(modifierM5391i);
                abstractC17911tM39308a = c13866iM39378I2.getBackgroundBrush();
                if (abstractC17911tM39308a != null) {
                    modifier3 = modifierM3357b;
                }
                final boolean z17 = z13;
                Modifier modifier6 = modifier4;
                AbstractC31926e.m99375j(modifierMo3471e2.mo3471e(modifier3), null, c13866iM39378I2.getBackgroundColor(), null, c13866iM39378I2.getBorder(), null, 0.0f, AbstractC37817c.m121344e(-2108305759, c28655q, new InterfaceC4351m() { // from class: f01.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC13881n.m39397s(viewState, z17, c13866iM39378I2, function4, interfaceC28601c1, (Composer) obj, iIntValue);
                    }
                }), c28655q, 12582912, 106);
                function5 = function4;
                enumC16313m0M39504f = viewState.getDismissIcon();
                if (enumC16313m0M39504f == null) {
                    c28655q.m87150e0(1414454785);
                    c28655q.m87173q(false);
                    z15 = true;
                } else {
                    c28655q.m87150e0(1414454786);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = b.f49494w;
                        c28655q.m87172p0(objM87133R4);
                    }
                    z15 = true;
                    m39374E(C1100b.f4583a, null, viewState, null, enumC16313m0M39504f, p745y81.Function1.m125323a((Function1) objM87133R4), function5, c28655q, 6 | ((i19 << 6) & 896) | ((i19 << 12) & 3670016), 5);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                function3 = function5;
                modifier2 = modifier6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 21, modifier2, function3, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                modifier3 = C2314t.f9131w;
                if (i24 != 0) {
                    modifier4 = modifier3;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C13693b(16);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowExpandedItems()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c17750h1M39513o = viewState.getTag();
                if (c17750h1M39513o != null) {
                    enumC17775o1M50918s = c17750h1M39513o.getTagStyle();
                } else {
                    enumC17775o1M50918s = null;
                }
                if (enumC17775o1M50918s == EnumC17775o1.COACH_RECOMMENDED) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                final C13866i c13866iM39378I3 = m39378I(viewState.getStyle(), z13, c28655q, 0);
                Boolean boolValueOf3 = Boolean.valueOf(viewState.getShouldShowExpandedItems());
                zM87157i = c28655q.m87157i(viewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R2 = new a(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf3);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                Modifier modifierM53364e3 = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), 3, 4);
                c9598eM39502c = viewState.getDestination();
                if (c9598eM39502c == null) {
                    c28655q.m87150e0(1407626260);
                    c28655q.m87173q(false);
                    modifierM5391i = null;
                    interfaceC17869a1 = null;
                } else {
                    c28655q.m87150e0(1407626261);
                    if ((i19 & 896) == 256) {
                        i19 = i18;
                        z14 = true;
                    } else {
                        i19 = i18;
                        z14 = false;
                    }
                    zM87157i2 = z14 | c28655q.m87157i(c9598eM39502c);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC17869a1 = null;
                    modifierM5391i = AbstractC1772c1.m5391i(modifier3, false, null, (InterfaceC4339a) objM87133R3, 3);
                    c28655q.m87173q(false);
                }
                if (modifierM5391i == null) {
                    i19 = i18;
                    modifierM5391i = modifier3;
                }
                i19 = i18;
                Modifier modifierMo3471e3 = modifierM53364e3.mo3471e(modifierM5391i);
                abstractC17911tM39308a = c13866iM39378I3.getBackgroundBrush();
                if (abstractC17911tM39308a != null) {
                    modifier3 = modifierM3357b;
                }
                final boolean z18 = z13;
                Modifier modifier7 = modifier4;
                AbstractC31926e.m99375j(modifierMo3471e3.mo3471e(modifier3), null, c13866iM39378I3.getBackgroundColor(), null, c13866iM39378I3.getBorder(), null, 0.0f, AbstractC37817c.m121344e(-2108305759, c28655q, new InterfaceC4351m() { // from class: f01.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC13881n.m39397s(viewState, z18, c13866iM39378I3, function4, interfaceC28601c1, (Composer) obj, iIntValue);
                    }
                }), c28655q, 12582912, 106);
                function5 = function4;
                enumC16313m0M39504f = viewState.getDismissIcon();
                if (enumC16313m0M39504f == null) {
                    c28655q.m87150e0(1414454785);
                    c28655q.m87173q(false);
                    z15 = true;
                } else {
                    c28655q.m87150e0(1414454786);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = b.f49494w;
                        c28655q.m87172p0(objM87133R4);
                    }
                    z15 = true;
                    m39374E(C1100b.f4583a, null, viewState, null, enumC16313m0M39504f, p745y81.Function1.m125323a((Function1) objM87133R4), function5, c28655q, 6 | ((i19 << 6) & 896) | ((i19 << 12) & 3670016), 5);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                function3 = function5;
                modifier2 = modifier7;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 21, modifier2, function3, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        i18 = i15;
        if ((i18 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            modifier3 = C2314t.f9131w;
            if (i24 != 0) {
                modifier4 = modifier3;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13693b(16);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowExpandedItems()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c17750h1M39513o = viewState.getTag();
            if (c17750h1M39513o != null) {
                enumC17775o1M50918s = c17750h1M39513o.getTagStyle();
            } else {
                enumC17775o1M50918s = null;
            }
            if (enumC17775o1M50918s == EnumC17775o1.COACH_RECOMMENDED) {
                z13 = true;
            } else {
                z13 = false;
            }
            final C13866i c13866iM39378I4 = m39378I(viewState.getStyle(), z13, c28655q, 0);
            Boolean boolValueOf4 = Boolean.valueOf(viewState.getShouldShowExpandedItems());
            zM87157i = c28655q.m87157i(viewState);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            Modifier modifierM53364e4 = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier3), 3, 4);
            c9598eM39502c = viewState.getDestination();
            if (c9598eM39502c == null) {
                c28655q.m87150e0(1407626260);
                c28655q.m87173q(false);
                modifierM5391i = null;
                interfaceC17869a1 = null;
            } else {
                c28655q.m87150e0(1407626261);
                if ((i19 & 896) == 256) {
                    i19 = i18;
                    z14 = true;
                } else {
                    i19 = i18;
                    z14 = false;
                }
                zM87157i2 = z14 | c28655q.m87157i(c9598eM39502c);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4789l(function4, c9598eM39502c, 2);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC17869a1 = null;
                modifierM5391i = AbstractC1772c1.m5391i(modifier3, false, null, (InterfaceC4339a) objM87133R3, 3);
                c28655q.m87173q(false);
            }
            if (modifierM5391i == null) {
                i19 = i18;
                modifierM5391i = modifier3;
            }
            i19 = i18;
            Modifier modifierMo3471e4 = modifierM53364e4.mo3471e(modifierM5391i);
            abstractC17911tM39308a = c13866iM39378I4.getBackgroundBrush();
            if (abstractC17911tM39308a != null) {
                modifier3 = modifierM3357b;
            }
            final boolean z19 = z13;
            Modifier modifier8 = modifier4;
            AbstractC31926e.m99375j(modifierMo3471e4.mo3471e(modifier3), null, c13866iM39378I4.getBackgroundColor(), null, c13866iM39378I4.getBorder(), null, 0.0f, AbstractC37817c.m121344e(-2108305759, c28655q, new InterfaceC4351m() { // from class: f01.l
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC13881n.m39397s(viewState, z19, c13866iM39378I4, function4, interfaceC28601c1, (Composer) obj, iIntValue);
                }
            }), c28655q, 12582912, 106);
            function5 = function4;
            enumC16313m0M39504f = viewState.getDismissIcon();
            if (enumC16313m0M39504f == null) {
                c28655q.m87150e0(1414454785);
                c28655q.m87173q(false);
                z15 = true;
            } else {
                c28655q.m87150e0(1414454786);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = b.f49494w;
                    c28655q.m87172p0(objM87133R4);
                }
                z15 = true;
                m39374E(C1100b.f4583a, null, viewState, null, enumC16313m0M39504f, p745y81.Function1.m125323a((Function1) objM87133R4), function5, c28655q, 6 | ((i19 << 6) & 896) | ((i19 << 12) & 3670016), 5);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            function3 = function5;
            modifier2 = modifier8;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 21, modifier2, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m39393o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m39394p(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m39395q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m39396r(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 x81.d, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m39397s(C13890q c13890q, boolean z4, C13866i c13866i, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C2306l c2306l;
        C0209i c0209i;
        C0209i c0209i2;
        C28655q c28655q;
        C0209i c0209i3;
        float f13;
        ?? r10;
        C28655q c28655q2;
        C17919x c17919xM31989h;
        boolean z13;
        C28655q c28655q3;
        C28655q c28655q4;
        C28655q c28655q5;
        boolean z14;
        C28655q c28655q6;
        Function1 function2;
        C28655q c28655q7;
        Object obj;
        C28655q c28655q8;
        C28655q c28655q9;
        C28655q c28655q10;
        boolean z15;
        C28655q c28655q11;
        C28655q c28655q12 = (C28655q) composer;
        if (c28655q12.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 2;
            float f15 = 8;
            float f16 = f14 * f15;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f16, c2314t);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f16);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q12, 6);
            int iHashCode = Long.hashCode(c28655q12.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q12.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q12, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q12.m87158i0();
            if (c28655q12.f115903S) {
                c28655q12.m87163l(c0213j);
            } else {
                c28655q12.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q12, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q12, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q12.f115903S || !AbstractC22676k.m65745e(c28655q12.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q12, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q12, c0209i7, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q12, 54);
            int iHashCode2 = Long.hashCode(c28655q12.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q12.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q12, modifierM3409f);
            c28655q12.m87158i0();
            if (c28655q12.f115903S) {
                c28655q12.m87163l(c0213j);
            } else {
                c28655q12.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q12, c0209i4, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q12, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q12.f115903S || !AbstractC22676k.m65745e(c28655q12.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q12, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q12, c0209i7, modifierM118962N2);
            EnumC17729c0 enumC17729c0M39508j = c13890q.getImageUrlAlignment();
            EnumC17729c0 enumC17729c0 = EnumC17729c0.LEADING;
            if (enumC17729c0M39508j == enumC17729c0) {
                c28655q12.m87150e0(311048935);
                AbstractC22403o abstractC22403oM39507i = c13890q.getImageUrl();
                if (abstractC22403oM39507i == null) {
                    c28655q12.m87150e0(1052582394);
                    c28655q12.m87173q(false);
                    z15 = false;
                    c2306l = c2306l2;
                    c0209i = c0209i6;
                    c0209i2 = c0209i4;
                    c28655q11 = c28655q12;
                } else {
                    c28655q12.m87150e0(1052582395);
                    c0209i2 = c0209i4;
                    c2306l = c2306l2;
                    c0209i = c0209i6;
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM39507i, null, null, c28655q12, 0, 3);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q12, AbstractC16277f.f62241H);
                    Integer numM39506h = c13890q.getImageSize();
                    AbstractC29125c.m88522c(abstractC26165aM64500i, strM92103Y, AbstractC18489d0.m53364e(AbstractC1102d.m3419p(numM39506h != null ? numM39506h.intValue() : 100, c2314t), f14, 4), null, null, 0.0f, null, c28655q12, 0, 120);
                    C28655q c28655q13 = c28655q12;
                    z15 = false;
                    c28655q13.m87173q(false);
                    c28655q11 = c28655q13;
                }
                c28655q11.m87173q(z15);
                c28655q = c28655q11;
            } else {
                c2306l = c2306l2;
                c0209i = c0209i6;
                c0213j = c0213j;
                c0209i2 = c0209i4;
                c2305k = c2305k;
                c28655q12.m87150e0(1053077031);
                c28655q12.m87173q(false);
                c28655q = c28655q12;
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            float f17 = 1;
            float f18 = f15 * f17;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f18), c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i3 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                c0209i3 = c0209i;
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            if (z4) {
                c28655q.m87150e0(1851314265);
                C28655q c28655q14 = c28655q;
                f13 = f17;
                AbstractC25303l.m74291r(c13890q.getTag(), null, null, null, c28655q14, 0, 14);
                C28655q c28655q15 = c28655q14;
                r10 = 0;
                c28655q15.m87173q(false);
                c28655q2 = c28655q15;
            } else {
                f13 = f17;
                r10 = 0;
                c28655q.m87150e0(1851398833);
                c28655q.m87173q(false);
                c28655q2 = c28655q;
            }
            String strM39515q = c13890q.getTitleDisplay();
            EnumC39333f enumC39333fM39514p = c13890q.getTitleColor();
            if (enumC39333fM39514p == 0) {
                c28655q2.m87150e0(1851552189);
                c28655q2.m87173q(r10);
                c17919xM31989h = null;
            } else {
                c28655q2.m87150e0(-2018482492);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, r10, enumC39333fM39514p.mo134584toComposableColorWaAFU9c(c28655q2, r10));
            }
            C28655q c28655q16 = c28655q2;
            AbstractC30795n.m94707h(strM39515q, null, c17919xM31989h != null ? c17919xM31989h.f69639a : c13866i.getTitleColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c13866i.getTitleStyle(), null, c28655q16, 0, 0, 196602);
            AbstractC30795n.m94707h(c13890q.getBodyDisplay(), null, c13866i.getBodyColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c13866i.getBodyStyle(), null, c28655q16, 0, 0, 196602);
            C28655q c28655q17 = c28655q16;
            C13884o c13884oM39510l = c13890q.getPrice();
            if (c13884oM39510l == null) {
                c28655q17.m87150e0(1851996047);
                c28655q17.m87173q(false);
                z13 = false;
            } else {
                c28655q17.m87150e0(1851996048);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f18), c2306l, c28655q17, 54);
                int iHashCode4 = Long.hashCode(c28655q17.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q17.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q17, c2314t);
                c28655q17.m87158i0();
                if (c28655q17.f115903S) {
                    c28655q17.m87163l(c0213j);
                } else {
                    c28655q17.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q17, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q17, c0209i5, interfaceC28653p1M87165m4);
                if (c28655q17.f115903S || !AbstractC22676k.m65745e(c28655q17.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q17, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q17, c0209i7, modifierM118962N4);
                String strM39450a = c13884oM39510l.getAmount();
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM39450a, null, c38072d.m121949b(c28655q17, r13).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q17, r13).getN8(), null, c28655q17, 0, 0, 196602);
                C28655q c28655q18 = c28655q17;
                String strM39451b = c13884oM39510l.getSubtitle();
                if (strM39451b == null) {
                    c28655q18.m87150e0(-692482400);
                    c28655q18.m87173q(false);
                    z13 = false;
                    c28655q3 = c28655q18;
                } else {
                    c28655q18.m87150e0(-692482399);
                    AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * 4, AbstractC1102d.m3424u(f13, c2314t)), c38072d.m121949b(c28655q18, r13).getWhite30(), AbstractC17918w0.f69621a), c28655q18, 0);
                    AbstractC30795n.m94707h(strM39451b, null, c38072d.m121949b(c28655q18, r13).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q18, r13).getB2(), null, c28655q18, 0, 0, 196602);
                    C28655q c28655q19 = c28655q18;
                    z13 = false;
                    c28655q19.m87173q(false);
                    c28655q3 = c28655q19;
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(z13);
                c28655q4 = c28655q3;
            }
            if (z4) {
                c28655q4 = c28655q17;
                c28655q4.m87150e0(1853467153);
                c28655q4.m87173q(z13);
                c28655q5 = c28655q4;
            } else {
                c28655q4.m87150e0(-2018424310);
                C17750h1 c17750h1M39513o = c13890q.getTag();
                if (c17750h1M39513o == null) {
                    c28655q4 = c28655q17;
                    c28655q4.m87150e0(1853355831);
                    c28655q4.m87173q(z13);
                    c28655q10 = c28655q4;
                } else {
                    c28655q4 = c28655q17;
                    c28655q4.m87150e0(1853355832);
                    C28655q c28655q20 = c28655q4;
                    AbstractC25303l.m74291r(c17750h1M39513o, null, null, null, c28655q20, 0, 14);
                    C28655q c28655q21 = c28655q20;
                    c28655q21.m87173q(z13);
                    c28655q10 = c28655q21;
                }
                c28655q10.m87173q(z13);
                c28655q5 = c28655q10;
            }
            c28655q5.m87173q(true);
            if (c13890q.getImageUrlAlignment() != enumC17729c0) {
                c28655q5.m87150e0(311149912);
                AbstractC22403o abstractC22403oM39507i2 = c13890q.getImageUrl();
                if (abstractC22403oM39507i2 == null) {
                    c28655q5.m87150e0(1055712681);
                    c28655q5.m87173q(z13);
                    z14 = z13;
                    c28655q9 = c28655q5;
                } else {
                    c28655q5.m87150e0(1055712682);
                    AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403oM39507i2, null, null, c28655q5, 0, 3);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q5, AbstractC16277f.f62241H);
                    Integer numM39506h2 = c13890q.getImageSize();
                    C28655q c28655q22 = c28655q5;
                    AbstractC29125c.m88522c(abstractC26165aM64500i2, strM92103Y2, AbstractC1102d.m3419p(numM39506h2 != null ? numM39506h2.intValue() : 100, c2314t), null, null, 0.0f, null, c28655q22, 0, 120);
                    C28655q c28655q23 = c28655q22;
                    z14 = false;
                    c28655q23.m87173q(false);
                    c28655q9 = c28655q23;
                }
                c28655q9.m87173q(z14);
                c28655q6 = c28655q9;
            } else {
                z14 = z13;
                c28655q5.m87150e0(1056100647);
                c28655q5.m87173q(z14);
                c28655q6 = c28655q5;
            }
            c28655q6.m87173q(true);
            C27256h c27256hM39501b = c13890q.getButton();
            if (c27256hM39501b == null) {
                c28655q6.m87150e0(462416641);
                c28655q6.m87173q(z14);
                function2 = function1;
            } else {
                c28655q6.m87150e0(462416642);
                function2 = function1;
                new C27246d().Compose(AbstractC1102d.m3409f(1.0f, c2314t), c27256hM39501b, function2, c28655q6, 6);
                c28655q6.m87173q(z14);
            }
            List<InterfaceC25312u> listM39505g = c13890q.m39505g();
            if (listM39505g == null) {
                c28655q6.m87150e0(462736158);
                c28655q6.m87173q(z14);
                c28655q7 = c28655q6;
            } else {
                c28655q6.m87150e0(462736159);
                C28655q c28655q24 = c28655q6;
                AbstractC1090b.m3350e(C23016z.f90757a, m39394p(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(200, z14 ? 1 : 0, null, 6), 2), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(200, z14 ? 1 : 0, null, 6), 2), null, AbstractC37817c.m121344e(-1750171259, c28655q6, new C13878m(listM39505g, 0, function2)), c28655q24, 1600518, 18);
                C28655q c28655q25 = c28655q24;
                z14 = false;
                c28655q25.m87173q(false);
                c28655q7 = c28655q25;
            }
            List<InterfaceC25312u> listM39509k = c13890q.m39509k();
            if (listM39509k == null) {
                c28655q7.m87150e0(463494480);
                c28655q7.m87173q(z14);
                c28655q8 = c28655q7;
            } else {
                c28655q7.m87150e0(463494481);
                c28655q7.m87150e0(-1924709962);
                for (InterfaceC25312u interfaceC25312u : listM39509k) {
                    boolean z16 = interfaceC25312u instanceof C28833d;
                    Object obj2 = C28635l.f115821a;
                    if (z16) {
                        c28655q7.m87150e0(620657500);
                        C28833d c28833dM87698b = C28833d.m87698b((C28833d) interfaceC25312u, null, null, null, null, null, m39394p(interfaceC28601c1), 31, null);
                        boolean zM87153g = c28655q7.m87153g(function2);
                        Object objM87133R = c28655q7.m87133R();
                        if (zM87153g || objM87133R == obj2) {
                            Object c2609r = new C2609r(function2, interfaceC28601c1, 10);
                            c28655q7.m87172p0(c2609r);
                            obj = c2609r;
                        } else {
                            obj = objM87133R;
                        }
                        AbstractC28832c.m87690e(c2314t, c28833dM87698b, (Function1) obj, c28655q7, 6, 0);
                        c28655q7.m87173q(false);
                    } else {
                        c28655q7.m87150e0(621387085);
                        boolean zM87153g2 = c28655q7.m87153g(function2);
                        Object objM87133R2 = c28655q7.m87133R();
                        Object obj3 = objM87133R2;
                        if (zM87153g2 || objM87133R2 == obj2) {
                            Object c12122i = new C12122i(function2, 13);
                            c28655q7.m87172p0(c12122i);
                            obj3 = c12122i;
                        }
                        C28655q c28655q26 = c28655q7;
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) obj3, c28655q26, 0, 6);
                        c28655q7 = c28655q26;
                        c28655q7.m87173q(false);
                    }
                }
                c28655q7.m87173q(false);
                c28655q7.m87173q(false);
                c28655q8 = c28655q7;
            }
            c28655q8.m87173q(true);
        } else {
            c28655q12.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m39398t(List list, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, composer, 6);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, C2314t.f9131w);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        c28655q.m87150e0(-301074352);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) it.next();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C12122i(function1, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, composer, 0, 6);
        }
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m39399u(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m39400v(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C28830a) {
            C28830a c28830a = (C28830a) event;
            m39395q(interfaceC28601c1, c28830a.getIsExpanded());
            function1.invoke(new C28830a(c28830a.getIsExpanded()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m39401w(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m39402x(C13890q c13890q, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m39392n(c13890q, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m39403y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(473381981);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m39404z(int i13, Composer composer, int i14) {
        m39403y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
