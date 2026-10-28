package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import c41.AbstractC4145x;
import c41.C4082o;
import c41.C4138w;
import c41.EnumC4040i;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.service.network.model.cycles.Period;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h31.C16824q;
import h31.EnumC16821n;
import i31.C18052g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import m83.C25271y;
import ny0.C27264l;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import uy0.C35375b;
import v71.C35764e;
import v71.C35768i;
import v71.EnumC35760a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.d4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e\"\u001a\u0010\u0019\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u001a\u0010\u001f\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006 "}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "", "id", "title", "glyph", "Lm91/u;", "trailing", "Lh31/q;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;)Lh31/q;", "Lc41/w;", "a", "Lc41/w;", "sleepActivityTile", "runningActivityTile", "c", "weightliftingActivityTile", "napToProcessActivityTile", "Lv71/i;", "e", "Lv71/i;", "getStandardItemsCard", "()Lv71/i;", "standardItemsCard", "f", "getAiCoachItemsCard", "aiCoachItemsCard", "g", "getEducationCtaItemsCard", "educationCtaItemsCard", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40302d4 {

    /* JADX INFO: renamed from: a */
    private static final C4138w f174224a;

    /* JADX INFO: renamed from: b */
    private static final C4138w f174225b;

    /* JADX INFO: renamed from: c */
    private static final C4138w f174226c;

    /* JADX INFO: renamed from: d */
    private static final C4138w f174227d;

    /* JADX INFO: renamed from: e */
    private static final C35768i f174228e;

    /* JADX INFO: renamed from: f */
    private static final C35768i f174229f;

    /* JADX INFO: renamed from: g */
    private static final C35768i f174230g;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("SLEEP");
        EnumC39333f enumC39333f = EnumC39333f.SLEEP;
        C4082o c4082o = new C4082o(false, enumC39333f, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), AbstractC8693b.m21278l("7:42"), null, 17, null);
        AbstractC4145x.c cVar = new AbstractC4145x.c(AbstractC8693b.m21278l("11:08pm"), AbstractC8693b.m21278l("6:50am"), enumC39333f);
        ActivityDetailType activityDetailType = ActivityDetailType.SLEEP;
        Object[] objArr = 0 == true ? 1 : 0;
        C4138w c4138w = new C4138w(null, textResourceM21278l, c4082o, cVar, activityDetailType, null, null, 0 == true ? 1 : 0, null, objArr, null, false, null, null, 16353, null);
        f174224a = c4138w;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("RUNNING");
        EnumC39333f enumC39333f2 = EnumC39333f.STRAIN;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        C4138w c4138w2 = new C4138w(objArr5, textResourceM21278l2, new C4082o(false, enumC39333f2, new AbstractC22403o.a(AbstractC16319p0.m46430a().getActivities().getRunning()), AbstractC8693b.m21278l("11.4"), objArr3, 17, objArr2), new AbstractC4145x.c(AbstractC8693b.m21278l("7:15am"), AbstractC8693b.m21278l("7:58am"), enumC39333f2), ActivityDetailType.CARDIO, null, null, objArr6, null, objArr4, null, false, null, null, 16353, null);
        f174225b = c4138w2;
        Object[] objArr7 = 0 == true ? 1 : 0;
        int i13 = 16353;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        boolean z4 = false;
        C9598e c9598e = null;
        C4138w c4138w3 = new C4138w(str, AbstractC8693b.m21278l("WEIGHTLIFTING"), new C4082o(false, enumC39333f2, new AbstractC22403o.a(AbstractC16319p0.m46430a().getActivities().getWeightlifting()), AbstractC8693b.m21278l("8.6"), objArr7, 17, 0 == true ? 1 : 0), new AbstractC4145x.c(AbstractC8693b.m21278l("12:30pm"), AbstractC8693b.m21278l("1:25pm"), enumC39333f2), ActivityDetailType.WEIGHTLIFTING_MSK, null, null, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, z4, 0 == true ? 1 : 0, c9598e, i13, defaultConstructorMarker);
        f174226c = c4138w3;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("NAP");
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Period period = null;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        C4138w c4138w4 = new C4138w(str, textResourceM21278l3, new C4082o(true, null, new AbstractC22403o.a(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getNap()), 0 == true ? 1 : 0, objArr8, 26, objArr9), new AbstractC4145x.a(AbstractC8693b.m21278l("PROCESS"), period, EnumC4040i.PROCESS_NOW, false, null, 26, 0 == true ? 1 : 0), activityDetailType, period, null, null, 0 == true ? 1 : 0, null, objArr11, z4, objArr10, c9598e, i13, defaultConstructorMarker);
        f174227d = c4138w4;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_EXPAND;
        C25271y c25271y = C25271y.f99162w;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        f174228e = new C35768i(new C35764e(null, null, enumC16313m0.toWhoopIcon(), "TODAY'S ACTIVITIES", Integer.valueOf(EnumC16313m0.ACTIVITY.toWhoopIcon()), c25271y, 2, 0 == true ? 1 : 0), objArr12, objArr13, AbstractC37056f.m118959K(c4138w, c4138w2, c4138w4), null, null, 54, null);
        int whoopIcon = enumC16313m0.toWhoopIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.AI_SPARKLE;
        C35764e c35764e = new C35764e(null, 0 == true ? 1 : 0, whoopIcon, "COACH MOMENT", Integer.valueOf(enumC16313m1.toWhoopIcon()), c25271y, 2, null);
        EnumC2888c enumC2888c = EnumC2888c.B1;
        EnumC39333f enumC39333f3 = EnumC39333f.WHITE_70;
        f174229f = new C35768i(c35764e, null, EnumC35760a.AI_COACH, AbstractC37056f.m118959K(new C33169c0("Your HRV is up 12% this week. You're primed for a harder session today, so try to lock in your training before 6 pm.", enumC2888c, enumC39333f3, 5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, false, null, MessageListItemViewType.GIPHY, 0 == true ? 1 : 0), m129513d("items-card-gallery-strength", "Full Body Strength Training", "🏋️", new C27264l("items-card-gallery-strength-chevron", EnumC16313m0.CARET_FORWARD, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0)), m129513d("items-card-gallery-sleep", "Asleep by 10:45 pm", "😴", new C27264l("items-card-gallery-sleep-coach", enumC16313m1, null, false, null, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0))), null, 0 == true ? 1 : 0, 50, 0 == true ? 1 : 0);
        C35764e c35764e2 = new C35764e(null, new GenericInteraction((JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null), EnumC16313m0.EDUCATION.toWhoopIcon(), "ONE REP MAX (1RM)", null, c25271y);
        InterfaceC25312u[] interfaceC25312uArr = {new C33169c0("Your 1RM is the most weight you can lift for a single rep. WHOOP estimates it from your logged sets so you can track strength gains over time.", enumC2888c, enumC39333f3, 5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, null, MessageListItemViewType.GIPHY, null), c4138w3};
        f174230g = new C35768i(c35764e2, null, null, AbstractC37056f.m118959K(interfaceC25312uArr), 0 == true ? 1 : 0, null, 54, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m129511b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(363454908);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Standard", c28655q, 6);
            C35768i c35768i = f174228e;
            int i14 = C35768i.f152124g;
            AbstractC25303l.m74291r(c35768i, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("AI Coach", c28655q, 6);
            AbstractC25303l.m74291r(f174229f, null, null, null, c28655q, i14, 14);
            AbstractC22399k.m64473c("Education CTA", c28655q, 6);
            AbstractC25303l.m74291r(f174230g, null, null, null, c28655q, i14, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129512c(int i13, Composer composer, int i14) {
        m129511b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private static final C16824q m129513d(String str, String str2, String str3, InterfaceC25312u interfaceC25312u) {
        EnumC16821n enumC16821n = EnumC16821n.UNCOMMITTED;
        String str4 = null;
        EnumC2888c enumC2888c = null;
        InterfaceC25312u interfaceC25312u2 = null;
        List list = null;
        boolean z4 = false;
        boolean z13 = false;
        GenericInteraction genericInteraction = null;
        Object[] objArr = 0 == true ? 1 : 0;
        return new C16824q(str, enumC16821n, new C18052g(str4, str2, enumC2888c, interfaceC25312u2, objArr, list, interfaceC25312u, new C35375b(AbstractC2875y.m8299l(str, "-emoji"), str3, 6 * 4, 20.25f, null), z4, z13, genericInteraction, 1852, null), 0 == true ? 1 : 0, null, true, false, 0 == true ? 1 : 0, 216, null);
    }
}
