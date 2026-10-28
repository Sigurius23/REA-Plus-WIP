package yy0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import v41.C35658c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yy0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "e", "Ly3/f;", "a", "F", "planeSize", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39887a {

    /* JADX INFO: renamed from: a */
    private static final float f172223a = 280;

    /* JADX INFO: renamed from: yy0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f172224w = new a();

        /* JADX INFO: renamed from: a */
        public final long m127964a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m127964a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yy0.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f172225w = new b();

        /* JADX INFO: renamed from: a */
        public final long m127965a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m127965a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yy0.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f172226w = new c();

        /* JADX INFO: renamed from: a */
        public final long m127966a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m127966a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yy0.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f172227w = new d();

        /* JADX INFO: renamed from: a */
        public final long m127967a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m127967a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: yy0.a$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f172228w = new e();

        /* JADX INFO: renamed from: a */
        public final long m127968a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m127968a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m127960c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1436504588);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            List listM118959K = AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l("Sun"), AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), null, 0.14285715f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Mon"), AbstractC8693b.m21278l("2"), null, 0.2857143f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Tue"), AbstractC8693b.m21278l("3"), null, 0.42857143f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Wed"), AbstractC8693b.m21278l("4"), null, 0.5714286f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Thu"), AbstractC8693b.m21278l("5"), null, 0.71428573f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Fri"), AbstractC8693b.m21278l("6"), null, 0.85714287f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Sat"), AbstractC8693b.m21278l("7"), null, 1.0f, 0.0f, null, 52, null));
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 1 * 8, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC39891e.m127984b(null, null, null, c28655q, 0, 7);
            AbstractC39891e.m127984b(AbstractC1102d.m3424u(f172223a, c2314t), listM118959K, null, c28655q, 6, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127961d(int i13, Composer composer, int i14) {
        m127960c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m127962e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(193205574);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l("0%");
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f172224w;
                c28655q.m87172p0(objM87133R);
            }
            C39889c c39889c = new C39889c(textResourceM21278l, null, p745y81.Function1.m125323a((Function1) objM87133R), 0.0f, 1.0f, null, 42, null);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("25%");
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f172225w;
                c28655q.m87172p0(objM87133R2);
            }
            C39889c c39889c2 = new C39889c(textResourceM21278l2, null, p745y81.Function1.m125323a((Function1) objM87133R2), 0.0f, 0.75f, null, 42, null);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("50%");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = c.f172226w;
                c28655q.m87172p0(objM87133R3);
            }
            C39889c c39889c3 = new C39889c(textResourceM21278l3, null, p745y81.Function1.m125323a((Function1) objM87133R3), 0.0f, 0.5f, null, 42, null);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("75%");
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = d.f172227w;
                c28655q.m87172p0(objM87133R4);
            }
            C39889c c39889c4 = new C39889c(textResourceM21278l4, null, p745y81.Function1.m125323a((Function1) objM87133R4), 0.0f, 0.25f, null, 42, null);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("100%");
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = e.f172228w;
                c28655q.m87172p0(objM87133R5);
            }
            List listM118959K = AbstractC37056f.m118959K(c39889c, c39889c2, c39889c3, c39889c4, new C39889c(textResourceM21278l5, null, p745y81.Function1.m125323a((Function1) objM87133R5), 0.0f, 0.0f, null, 42, null));
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 1 * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC39892f.m127987b(null, null, null, c28655q, 0, 7);
            AbstractC39892f.m127987b(AbstractC1102d.m3411h(f172223a, c2314t), listM118959K, null, c28655q, 6, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m127963f(int i13, Composer composer, int i14) {
        m127962e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
