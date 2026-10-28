package q81;

import a01.C0091k;
import android.graphics.Paint;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.C12253i;
import e93.AbstractC12889b;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import i91.AbstractC18249c;
import i93.C18279e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j81.C21421e;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C2040y;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23457c;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25267u;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p077d0.EnumC11408v0;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17906q0;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p294l3.C23285v0;
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
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p718lz1.C24823a;
import p719m22.C24965t;
import pf.C29124b;
import q11.C29793c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: q81.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001f\u0010\u0017\u001a\u000f\u0010 \u001a\u00020\u0004H\u0003¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010!\u001a\u000f\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010!\"\u0017\u0010-\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b*\u0010\u0005\u001a\u0004\b+\u0010,¨\u00060²\u0006\u0010\u0010.\u001a\u0004\u0018\u00010\u001b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lq81/j;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "F", "(Lq81/j;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll3/v0;", "titleTextStyle", "Lb91/a;", "timerTextStyle", "Lq81/h;", "weightliftingTimerState", "E", "(Landroidx/compose/ui/Modifier;Landroidx/lifecycle/g0;Ll3/v0;Lb91/a;Lq81/h;Landroidx/compose/runtime/Composer;II)V", "Lq81/c;", "o", "(Lq81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lq81/i;", "timerStyle", "r", "(Lq81/i;Landroidx/compose/runtime/Composer;I)V", "style", "Ly3/f;", "size", "", "fillPercent", "u", "(Lq81/i;FFLandroidx/compose/runtime/Composer;I)V", "y", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/runtime/Composer;I)V", "N", "(Landroidx/compose/ui/Modifier;Lq81/i;)Landroidx/compose/ui/Modifier;", "Q", "", "S", "(F)Ljava/lang/String;", "C", "A", "a", "R", "()F", "WEIGHTLIFTING_TIMER_MIN_SIZE", "percentTargetTimeElapsed", "rotation", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30049g {

    /* JADX INFO: renamed from: a */
    private static final float f122648a = 150;

    /* JADX INFO: renamed from: q81.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m92058a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1711591125);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
            float f13 = 200;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13, c2314t);
            EnumC30051i enumC30051i = EnumC30051i.ACTIVE;
            AbstractC30049g.m92046o(new C30045c(enumC30051i, new TextResource.C8691e("ACTIVE"), new TextResource.C8691e("05:30"), 1.0f), modifierM3411h, c28655q, 48);
            AbstractC30049g.m92046o(new C30045c(enumC30051i, new TextResource.C8691e("ACTIVE"), new TextResource.C8691e("02:13"), 0.7f), AbstractC1102d.m3411h(180, c2314t), c28655q, 48);
            AbstractC30049g.m92046o(new C30045c(EnumC30051i.REST, new TextResource.C8691e("REST"), new TextResource.C8691e("00:12"), 1.0f), AbstractC1102d.m3411h(AbstractC30049g.m92030R(), c2314t), c28655q, 48);
            AbstractC30049g.m92046o(new C30045c(EnumC30051i.WARMUP, new TextResource.C8691e("WARMUP"), new TextResource.C8691e("00:00"), 1.0f), AbstractC1102d.m3411h(f13, c2314t), c28655q, 48);
            AbstractC30049g.m92046o(new C30045c(EnumC30051i.COOLDOWN, new TextResource.C8691e("COOLDOWN"), new TextResource.C8691e("11:47"), 1.0f), AbstractC1102d.m3411h(f13, c2314t), c28655q, 48);
            AbstractC30049g.m92046o(new C30045c(EnumC30051i.TARGET_TIME_ELAPSED, new TextResource.C8691e("ACTIVE"), new TextResource.C8691e("00:06"), 1.0f), AbstractC1102d.m3411h(220, c2314t), c28655q, 48);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m92058a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q81.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m92059a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1311466171);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
            float f13 = 200;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13, c2314t);
            EnumC30051i enumC30051i = EnumC30051i.ACTIVE;
            TextResource.C8691e c8691e = new TextResource.C8691e("ACTIVE");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = c.f122649w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC30049g.m92017E(modifierM3411h, null, null, null, new C30050h(enumC30051i, c8691e, new C30044b(0, false, null, (InterfaceC4339a) objM87133R, false, null, false, 119, null), null, 8, 0 == true ? 1 : 0), c28655q, 6, 14);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(AbstractC30049g.m92030R(), c2314t);
            EnumC30051i enumC30051i2 = EnumC30051i.REST;
            TextResource.C8691e c8691e2 = new TextResource.C8691e("REST");
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = d.f122650w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC30049g.m92017E(modifierM3411h2, null, null, null, new C30050h(enumC30051i2, c8691e2, new C30044b(0, false, null, (InterfaceC4339a) objM87133R2, false, null, false, 119, null), null, 8, null), c28655q, 6, 14);
            Modifier modifierM3411h3 = AbstractC1102d.m3411h(f13, c2314t);
            EnumC30051i enumC30051i3 = EnumC30051i.WARMUP;
            TextResource.C8691e c8691e3 = new TextResource.C8691e("WARMUP");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = e.f122651w;
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC30049g.m92017E(modifierM3411h3, null, null, null, new C30050h(enumC30051i3, c8691e3, new C30044b(0, false, null, (InterfaceC4339a) objM87133R3, false, null, false, 119, null), null, 8, null), c28655q, 6, 14);
            Modifier modifierM3411h4 = AbstractC1102d.m3411h(f13, c2314t);
            EnumC30051i enumC30051i4 = EnumC30051i.COOLDOWN;
            TextResource.C8691e c8691e4 = new TextResource.C8691e("COOLDOWN");
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = f.f122652w;
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC30049g.m92017E(modifierM3411h4, null, null, null, new C30050h(enumC30051i4, c8691e4, new C30044b(0, false, null, (InterfaceC4339a) objM87133R4, false, null, false, 119, null), null, 8, null), c28655q, 6, 14);
            Modifier modifierM3411h5 = AbstractC1102d.m3411h(210, c2314t);
            EnumC30051i enumC30051i5 = EnumC30051i.TARGET_TIME_ELAPSED;
            TextResource.C8691e c8691e5 = new TextResource.C8691e("ACTIVE");
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = g.f122653w;
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC30049g.m92017E(modifierM3411h5, null, null, null, new C30050h(enumC30051i5, c8691e5, new C30044b(0, false, null, (InterfaceC4339a) objM87133R5, false, null, false, 119, null), null, 8, null), c28655q, 6, 14);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m92059a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q81.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final c f122649w = new c();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: q81.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final d f122650w = new d();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: q81.g$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final e f122651w = new e();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: q81.g$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final f f122652w = new f();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: q81.g$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        public static final g f122653w = new g();

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: q81.g$h */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.weightliftingtimer.WeightliftingTimerKt$WeightliftingTimer$2$1$1", m100430f = "WeightliftingTimer.kt", m100431l = {207}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C11344e f122654E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C30050h f122655F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f122656G;

        /* JADX INFO: renamed from: w */
        int f122657w;

        /* JADX INFO: renamed from: x */
        int f122658x;

        /* JADX INFO: renamed from: y */
        float f122659y;

        /* JADX INFO: renamed from: z */
        int f122660z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C11344e c11344e, C30050h c30050h, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122654E = c11344e;
            this.f122655F = c30050h;
            this.f122656G = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f122654E, this.f122655F, this.f122656G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Integer numM92067c;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122660z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (((Number) this.f122654E.m30549e()).floatValue() < 1.0f && (numM92067c = this.f122655F.getTargetTimeInSeconds()) != null) {
                    C11344e c11344e = this.f122654E;
                    InterfaceC28601c1 interfaceC28601c1 = this.f122656G;
                    int iIntValue = numM92067c.intValue();
                    float f13 = 1;
                    Float fM92020H = AbstractC30049g.m92020H(interfaceC28601c1);
                    float fFloatValue = f13 - (fM92020H != null ? fM92020H.floatValue() : 1.0f);
                    Float f14 = new Float(1.0f);
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(AbstractC12889b.m36258X(iIntValue * 1000 * fFloatValue), 0, AbstractC11333b0.f36312c, 2);
                    this.f122657w = iIntValue;
                    this.f122658x = 0;
                    this.f122659y = fFloatValue;
                    this.f122660z = 1;
                    if (C11344e.m30547d(c11344e, f14, c11347e2M30574v, null, this, 12) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: q81.g$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class i {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f122661a;

        static {
            int[] iArr = new int[EnumC30051i.values().length];
            try {
                iArr[EnumC30051i.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30051i.TARGET_TIME_ELAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122661a = iArr;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m92013A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(492321617);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m92014B(int i13, Composer composer, int i14) {
        m92013A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m92015C(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(269670471);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m92016D(int i13, Composer composer, int i14) {
        m92015C(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    @InterfaceC23457c
    /* JADX INFO: renamed from: E */
    public static final void m92017E(Modifier modifier, InterfaceC1585g0 interfaceC1585g0, C23285v0 c23285v0, C2886a c2886a, C30050h weightliftingTimerState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC1585g0 interfaceC1585g1;
        C23285v0 c23285v1;
        C2886a c2886a2;
        Modifier modifier3;
        C23285v0 c23285v2;
        C23285v0 style;
        C2886a c2886a3;
        Modifier modifier4;
        int i16;
        C2886a c2886aM8443x = c2886a;
        AbstractC22676k.m65750j(weightliftingTimerState, "weightliftingTimerState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(682815142);
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
            if ((i14 & 2) == 0) {
                interfaceC1585g1 = interfaceC1585g0;
                int i18 = c28655q.m87157i(interfaceC1585g1) ? 32 : 16;
                i15 |= i18;
            } else {
                interfaceC1585g1 = interfaceC1585g0;
            }
            i15 |= i18;
        } else {
            interfaceC1585g1 = interfaceC1585g0;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c23285v1 = c23285v0;
                int i19 = c28655q.m87153g(c23285v1) ? 256 : 128;
                i15 |= i19;
            } else {
                c23285v1 = c23285v0;
            }
            i15 |= i19;
        } else {
            c23285v1 = c23285v0;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) != 0) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            } else {
                if ((i13 & 4096) == 0 ? c28655q.m87153g(c2886aM8443x) : c28655q.m87157i(c2886aM8443x)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
            }
            i15 |= i16;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87153g(weightliftingTimerState) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                Modifier modifier5 = i17 != 0 ? C2314t.f9131w : modifier2;
                InterfaceC1585g0 interfaceC1585g2 = (i14 & 2) != 0 ? (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()) : interfaceC1585g1;
                style = (i14 & 4) != 0 ? C38072d.f163053a.m121952e(c28655q, 6).getSh3().getStyle() : c23285v1;
                if ((i14 & 8) != 0) {
                    c2886aM8443x = C38072d.f163053a.m121952e(c28655q, 6).getN3();
                }
                c2886a3 = c2886aM8443x;
                modifier4 = modifier5;
                interfaceC1585g1 = interfaceC1585g2;
            } else {
                c28655q.m87138X();
                modifier4 = modifier2;
                style = c23285v1;
                c2886a3 = c2886aM8443x;
            }
            c28655q.m87175r();
            boolean zM87153g = c28655q.m87153g(weightliftingTimerState.getTargetTimeInSeconds());
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Float fM92020H = m92020H(interfaceC28601c1);
            if (fM92020H != null) {
                if (fM92020H.floatValue() >= 1.0f) {
                    z4 = true;
                }
            }
            AbstractC22953f.m66714a(AbstractC1099a.m3384f(AbstractC1102d.m3407d(1.0f, modifier4), true, 1.0f), null, false, AbstractC37817c.m121344e(471357200, c28655q, new C2040y(weightliftingTimerState, interfaceC28601c1, z4 ? EnumC30051i.TARGET_TIME_ELAPSED : weightliftingTimerState.getStyle(), style, interfaceC1585g1, c2886a3)), c28655q, 3072, 6);
            c23285v2 = style;
            c2886a2 = c2886a3;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            c2886a2 = c2886aM8443x;
            modifier3 = modifier2;
            c23285v2 = c23285v1;
        }
        InterfaceC1585g0 interfaceC1585g3 = interfaceC1585g1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(modifier3, interfaceC1585g3, c23285v2, c2886a2, weightliftingTimerState, i13, i14, 16);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m92018F(InterfaceC30052j state, Modifier modifier, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-884013296);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            modifier2 = modifier;
            c28655q.m87138X();
        } else if (state instanceof C30050h) {
            c28655q.m87150e0(866751629);
            modifier2 = modifier;
            m92017E(modifier2, null, null, null, (C30050h) state, c28655q, ((i14 >> 3) & 14) | ((i14 << 12) & 57344), 14);
            c28655q.m87173q(false);
        } else {
            modifier2 = modifier;
            if (state instanceof C30045c) {
                c28655q.m87150e0(866755166);
                m92046o((C30045c) state, modifier2, c28655q, i14 & 126);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1099656530);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(state, modifier2, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m92019G(InterfaceC30052j interfaceC30052j, Modifier modifier, int i13, Composer composer, int i14) {
        m92018F(interfaceC30052j, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final Float m92020H(InterfaceC28601c1 interfaceC28601c1) {
        return (Float) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: I */
    private static final void m92021I(InterfaceC28601c1 interfaceC28601c1, Float f13) {
        interfaceC28601c1.setValue(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m92022J(C30050h c30050h, InterfaceC28601c1 interfaceC28601c1, EnumC30051i enumC30051i, C23285v0 c23285v0, InterfaceC1585g0 interfaceC1585g0, C2886a c2886a, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C1101c c1101c = (C1101c) BoxWithConstraints;
            long j7 = c1101c.f4585b;
            InterfaceC39171c interfaceC39171c = c1101c.f4584a;
            float fMo733e0 = interfaceC39171c.mo733e0(C39169a.m124766j(j7));
            float f13 = f122648a;
            if (Float.compare(fMo733e0, f13) < 0 || Float.compare(interfaceC39171c.mo733e0(C39169a.m124767k(j7)), f13) < 0) {
                c28655q.m87150e0(1956906194);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1954665142);
                boolean zM87155h = c28655q.m87155h(m92020H(interfaceC28601c1) != null);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87155h || objM87133R == c28676v0) {
                    Float fM92020H = m92020H(interfaceC28601c1);
                    objM87133R = AbstractC11348f.m30553a(fM92020H != null ? fM92020H.floatValue() : 1.0f);
                    c28655q.m87172p0(objM87133R);
                }
                C11344e c11344e = (C11344e) objM87133R;
                Integer numM92067c = c30050h.getTargetTimeInSeconds();
                boolean zM87157i = c28655q.m87157i(c11344e) | c28655q.m87153g(c30050h) | c28655q.m87153g(interfaceC28601c1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new h(c11344e, c30050h, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(numM92067c, c11344e, (InterfaceC4351m) objM87133R2, c28655q);
                m92049r(enumC30051i, c28655q, 0);
                m92052u(enumC30051i, c1101c.m3402c(), ((Number) c11344e.m30549e()).floatValue(), c28655q, 0);
                m92056y(enumC30051i, c28655q, 0);
                m92054w(c28655q, 0);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                AbstractC15011f9.m43114b(AbstractC8693b.m21274h(c30050h.getTitle(), c28655q, 0), null, enumC30051i.getPrimaryColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q, 0, 0, 65530);
                C30044b c30044bM92065a = c30050h.getBaseTimerState();
                boolean zM87153g = c28655q.m87153g(c30050h) | c28655q.m87153g(interfaceC28601c1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C29793c(2, c30050h, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC30043a.m91985e(null, C30044b.m92000d(c30044bM92065a, 0, false, (Function1) objM87133R3, null, false, null, false, 123, null), interfaceC1585g0, c2886a, enumC30051i.getPrimaryColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0, 1);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m92023K(C30050h c30050h, InterfaceC28601c1 interfaceC28601c1, int i13) {
        if (c30050h.getTargetTimeInSeconds() != null) {
            m92021I(interfaceC28601c1, Float.valueOf(i13 / c30050h.getTargetTimeInSeconds().intValue()));
        }
        c30050h.getBaseTimerState().getOnTimeChanged().invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m92024L(Modifier modifier, InterfaceC1585g0 interfaceC1585g0, C23285v0 c23285v0, C2886a c2886a, C30050h c30050h, int i13, int i14, Composer composer, int i15) {
        m92017E(modifier, interfaceC1585g0, c23285v0, c2886a, c30050h, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final Modifier m92026N(Modifier modifier, EnumC30051i enumC30051i) {
        return AbstractC37056f.m118997u(modifier, new C24823a(enumC30051i, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Modifier m92027O(EnumC30051i enumC30051i, Modifier composed, Composer composer, int i13) {
        Modifier modifierM92029Q;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1613531486);
        int i14 = i.f122661a[enumC30051i.ordinal()];
        if (i14 == 1 || i14 == 2) {
            c28655q.m87150e0(557599610);
            modifierM92029Q = m92029Q(AbstractC1772c1.m5375L(m92028P(AbstractC11348f.m30559g(AbstractC11348f.m30571s(null, c28655q, 1), 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(ErrorCodes.InitAPIErrors.cServerErrors, 0, AbstractC11333b0.f36312c, 2), EnumC11408v0.f36577w, 4), null, c28655q, 4536, 8)), composed), enumC30051i);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-120544613);
            c28655q.m87173q(false);
            modifierM92029Q = m92029Q(composed, enumC30051i);
        }
        c28655q.m87173q(false);
        return modifierM92029Q;
    }

    /* JADX INFO: renamed from: P */
    private static final float m92028P(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: Q */
    private static final Modifier m92029Q(Modifier modifier, EnumC30051i enumC30051i) {
        return AbstractC15751g.m44456i(1 * 4, modifier, C17909s.m51486d(AbstractC17911t.f69612b, enumC30051i.getBorderColors(), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32), 8), AbstractC33253j.m105486b(50));
    }

    /* JADX INFO: renamed from: R */
    public static final float m92030R() {
        return f122648a;
    }

    /* JADX INFO: renamed from: S */
    private static final String m92031S(float f13) {
        return "inner border fillPercent = ".concat(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f13)}, 1)));
    }

    /* JADX INFO: renamed from: o */
    public static final void m92046o(C30045c state, Modifier modifier, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(593079707);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC22953f.m66714a(AbstractC1099a.m3384f(AbstractC1102d.m3407d(1.0f, modifier), true, 1.0f), null, false, AbstractC37817c.m121344e(-2011431951, c28655q, new C24823a(state, 17)), c28655q, 3072, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(state, modifier, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m92047p(C30045c c30045c, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C1101c c1101c = (C1101c) BoxWithConstraints;
            long j7 = c1101c.f4585b;
            InterfaceC39171c interfaceC39171c = c1101c.f4584a;
            float fMo733e0 = interfaceC39171c.mo733e0(C39169a.m124766j(j7));
            float f13 = f122648a;
            if (Float.compare(fMo733e0, f13) < 0 || Float.compare(interfaceC39171c.mo733e0(C39169a.m124767k(j7)), f13) < 0) {
                c28655q.m87150e0(815680721);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(814827353);
                m92049r(c30045c.getStyle(), c28655q, 0);
                m92052u(c30045c.getStyle(), c1101c.m3402c(), c30045c.getBorderFillPercent(), c28655q, 0);
                m92056y(c30045c.getStyle(), c28655q, 0);
                m92054w(c28655q, 0);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
                String strM21274h = AbstractC8693b.m21274h(c30045c.getTitle(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, null, c30045c.getStyle().getPrimaryColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh3(), null, c28655q, 0, 0, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c30045c.getTimerText(), c28655q, 0), null, c30045c.getStyle().getPrimaryColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN3(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m92048q(C30045c c30045c, Modifier modifier, int i13, Composer composer, int i14) {
        m92046o(c30045c, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m92049r(EnumC30051i enumC30051i, Composer composer, int i13) {
        int i14;
        Object obj;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-140534423);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC30051i.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            long jMo134584toComposableColorWaAFU9c = enumC30051i.getPrimaryColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                obj = objM87133R;
                C17887h c17887hM51522j = AbstractC17918w0.m51522j();
                c17887hM51522j.m51455m(1);
                c17887hM51522j.m51454l(interfaceC39171c.mo743q0(2 * 4));
                c28655q.m87172p0(c17887hM51522j);
                obj = c17887hM51522j;
            }
            obj = objM87133R;
            InterfaceC17906q0 interfaceC17906q0 = (InterfaceC17906q0) obj;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = ((C17887h) interfaceC17906q0).f69578a;
                c28655q.m87172p0(objM87133R2);
            }
            Paint paint = (Paint) objM87133R2;
            paint.setColor(AbstractC17918w0.m51506H(C17919x.m51541c(0.0f, jMo134584toComposableColorWaAFU9c)));
            paint.setShadowLayer(10.0f, 0.0f, 0.0f, AbstractC17918w0.m51506H(C17919x.m51541c(enumC30051i.getBorderOpacity() * 0.5f, jMo134584toComposableColorWaAFU9c)));
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87157i = c28655q.m87157i(interfaceC17906q0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C29124b(interfaceC17906q0, 9);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R3, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30046d(enumC30051i, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m92050s(InterfaceC17906q0 interfaceC17906q0, InterfaceC22131e Canvas) {
        float f13;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f14 = 2;
        float fMo743q0 = Canvas.mo743q0(f14);
        ((C0929d) Canvas.mo744t0().f812x).m2355o(fMo743q0, fMo743q0, fMo743q0, fMo743q0);
        try {
            Canvas.mo744t0().m716w().mo51424o(0.0f, 0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)), Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)), Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / f14, Float.intBitsToFloat((int) (4294967295L & Canvas.mo731d())) / f14, interfaceC17906q0);
            return C23454a0.f92919a;
        } finally {
            f13 = -fMo743q0;
            ((C0929d) Canvas.mo744t0().f812x).m2355o(f13, f13, f13, f13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m92051t(EnumC30051i enumC30051i, int i13, Composer composer, int i14) {
        m92049r(enumC30051i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m92052u(EnumC30051i enumC30051i, float f13, float f14, Composer composer, int i13) {
        int i14;
        float f15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1278511792);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC30051i.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            f15 = f14;
            i14 |= c28655q.m87147d(f15) ? 256 : 128;
        } else {
            f15 = f14;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC34132o.m107879c(enumC30051i.getBorderOpacity(), C2314t.f9131w), m92031S(f15));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
            float f16 = f13 / 2;
            float f17 = 4;
            float f18 = f17 * f17;
            float fFloatValue = ((Number) AbstractC12889b.m36288r(Float.valueOf(f15), new C18279e(0.0f, 1.0f))).floatValue();
            C17909s c17909s = AbstractC17911t.f69612b;
            List<C17919x> borderColors = enumC30051i.getBorderColors();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(borderColors, 10));
            Iterator<T> it = borderColors.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17919x(C17919x.m51541c(enumC30051i.getBorderShadowOpacity(), ((C17919x) it.next()).f69639a)));
            }
            AbstractC37692c.m121117c(null, f16, fFloatValue, AbstractC18249c.m52570h(C17909s.m51486d(c17909s, arrayList, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 8)), f18, false, 0.0f, 0, null, c28655q, 24576, 481);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0091k(enumC30051i, f13, f14, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m92053v(EnumC30051i enumC30051i, float f13, float f14, int i13, Composer composer, int i14) {
        m92052u(enumC30051i, f13, f14, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m92054w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(657448863);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            C38072d c38072d = C38072d.f163053a;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1092a.m3358c(modifierM3394p, c38072d.m121949b(c28655q, 6).getBlack20(), AbstractC33253j.m105486b(50)), C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent())), new C23465k(Float.valueOf(0.75f), new C17919x(c38072d.m121949b(c28655q, 6).getTransparent())), new C23465k(Float.valueOf(1.0f), new C17919x(c38072d.m121949b(c28655q, 6).getBlack20()))}, 0L, 0.0f, 14), AbstractC33253j.m105486b(50), 0.0f, 4), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m92055x(int i13, Composer composer, int i14) {
        m92054w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m92056y(EnumC30051i enumC30051i, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-553910981);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC30051i.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22989q.m66760a(m92026N(AbstractC1102d.m3407d(1.0f, AbstractC34132o.m107879c(enumC30051i.getBorderOpacity(), C2314t.f9131w)), enumC30051i), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30046d(enumC30051i, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m92057z(EnumC30051i enumC30051i, int i13, Composer composer, int i14) {
        m92056y(enumC30051i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
