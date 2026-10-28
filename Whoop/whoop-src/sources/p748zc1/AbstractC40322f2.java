package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentHeaderPosition;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentLayout;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.models.GenericInteraction;
import f81.C14249c;
import gz0.EnumC16313m0;
import h31.C16824q;
import h31.EnumC16821n;
import hy0.C17736e;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import i31.C18052g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import l83.C23465k;
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
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import uy0.C35375b;
import v51.C35702a;
import v51.C35704c;
import v71.AbstractC35767h;
import v71.C35768i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.f2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001aI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\")\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00140\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "id", "title", "glyph", "Lm91/u;", "trailing", "", "isSelected", "", "description", "Lh31/q;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;ZLjava/util/List;)Lh31/q;", "Lv71/i;", "a", "Lv71/i;", "allTasksPreviewItemsCardState", "Ll83/k;", "Lv51/c;", "b", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "expandableContentGalleryStates", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40322f2 {

    /* JADX INFO: renamed from: a */
    private static final C35768i f174253a;

    /* JADX INFO: renamed from: b */
    private static final List<C23465k> f174254b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listM118958J = AbstractC37056f.m118958J(new C14249c(null, null, 0.084f, EnumC39333f.ACCENT_ONBOARDING_ACTION));
        EnumC16313m0 enumC16313m0 = EnumC16313m0.AI_SPARKLE;
        C16824q c16824qM129711f = m129711f("all-tasks-preview-steps", "648 / 7,700 steps", "👟", new C27264l("all-tasks-preview-steps-coach", enumC16313m0, null, false, null, null, 60, null), true, listM118958J);
        ExpandableContentLayout expandableContentLayout = ExpandableContentLayout.VERTICAL;
        ExpandableContentHeaderPosition expandableContentHeaderPosition = ExpandableContentHeaderPosition.BOTTOM;
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        Integer num = null;
        f174253a = new C35768i(null, null, null, AbstractC37056f.m118959K(c16824qM129711f, new C35704c("program-hub-all-tasks-expansion", "ALL TASKS (4)", null, null, null, false, null, false, null, null, expandableContentLayout, expandableContentHeaderPosition, AbstractC37056f.m118959K(m129712g("all-tasks-preview-strength", "Full Body Strength Training", "🏋️", new C27264l("all-tasks-preview-strength-chevron", enumC16313m1, null, false, null, null, 60, null), false, null, 48, null), m129712g("all-tasks-preview-teeth", "Brush teeth by 8:30", "🪥", new C27264l("all-tasks-preview-strength-chevron", enumC16313m1, null, false, null, null, 60, null), false, null, 48, null), m129712g("all-tasks-preview-sleep", "Asleep by 1:10 am", "😴", new C27264l("all-tasks-preview-sleep-coach", enumC16313m0, null, false, null, null, 60, null), false, null, 48, null)), 892, 0 == true ? 1 : 0)), null, null, 55, 0 == true ? 1 : 0);
        EnumC2888c enumC2888c = EnumC2888c.B1;
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        InterfaceC25312u[] interfaceC25312uArr = {new C33169c0("Warm up with 5-10 minutes of light cardio before every session.", enumC2888c, enumC39333f, 5, null, 0 == true ? 1 : 0, num, null, false, null, MessageListItemViewType.GIPHY, null), new C17736e(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0), new C33169c0("Drink water before, during, and after exercise.", enumC2888c, enumC39333f, 5, 0 == true ? 1 : 0, num, 0 == true ? 1 : 0, null, false, null, MessageListItemViewType.GIPHY, null)};
        C23465k c23465k = new C23465k("Expanded — no tag", new C35704c(null, "Training Tips", null, null, null, false, 0 == true ? 1 : 0, true, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, AbstractC37056f.m118959K(interfaceC25312uArr), 3901, null));
        int i13 = MessageListItemViewType.GIPHY;
        DefaultConstructorMarker defaultConstructorMarker = null;
        InterfaceC25312u[] interfaceC25312uArr2 = {new C33169c0("REM sleep is critical for memory consolidation and emotional regulation.", enumC2888c, enumC39333f, 5, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, i13, defaultConstructorMarker), new C17736e(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null), new C33169c0("Aim for 7-9 hours of sleep to maximize your Recovery score.", enumC2888c, enumC39333f, 5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, i13, defaultConstructorMarker)};
        Object[] objArr = 0 == true ? 1 : 0;
        C23465k c23465k2 = new C23465k("Collapsed — no tag", new C35704c(null, "Sleep Insights", null, null, null, false, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, null, objArr, null, AbstractC37056f.m118959K(interfaceC25312uArr2), 3901, null));
        C17750h1 c17750h1 = new C17750h1(AbstractC8693b.m21278l("6"), null, null, null, null, null, null, EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194174, null);
        int i14 = MessageListItemViewType.GIPHY;
        C33169c0 c33169c0 = new C33169c0("HRV is one of the primary inputs for your WHOOP Recovery score.", enumC2888c, enumC39333f, 5, null, null, null, 0 == true ? 1 : 0, false, null, i14, null);
        C17736e c17736e = new C17736e(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        f174254b = AbstractC37056f.m118959K(c23465k, c23465k2, new C23465k("Expanded — with tag", new C35704c(null, "Recovery Factors", null, null, objArr4, false, c17750h1, true, null, objArr6, null, objArr5, AbstractC37056f.m118959K(c33169c0, c17736e, new C33169c0("A lower resting heart rate generally indicates better cardiovascular fitness.", enumC2888c, enumC39333f, 5, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, i14, objArr3)), 3901, null)));
    }

    /* JADX INFO: renamed from: c */
    public static final void m129708c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(298394652);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            c28655q.m87150e0(11584761);
            for (C23465k c23465k : f174254b) {
                AbstractC22399k.m64473c((String) c23465k.f92937w, c28655q, 0);
                float f13 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
                C35702a c35702a = new C35702a();
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) c23465k.f92938x;
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40499w1(2);
                    c28655q.m87172p0(objM87133R);
                }
                c35702a.Compose(interfaceC25312u, (Function1) objM87133R, c28655q, (C35702a.f151901a << 6) | C35704c.f151903n | 48);
                AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            AbstractC22399k.m64473c("Header bottom — inside items card, collapsed", c28655q, 6);
            float f14 = 4;
            AbstractC18489d0.m53380u(2, f14, c2314t, c28655q);
            AbstractC35767h.m113349q(null, f174253a, null, null, null, c28655q, C35768i.f152124g << 3, 29);
            AbstractC31061c.m95650z(f14, f14, c2314t, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40498w0(i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m129709d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m129710e(int i13, Composer composer, int i14) {
        m129708c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private static final C16824q m129711f(String str, String str2, String str3, InterfaceC25312u interfaceC25312u, boolean z4, List<? extends InterfaceC25312u> list) {
        EnumC16821n enumC16821n = EnumC16821n.UNCOMMITTED;
        String str4 = null;
        EnumC2888c enumC2888c = null;
        InterfaceC25312u interfaceC25312u2 = null;
        boolean z13 = false;
        GenericInteraction genericInteraction = null;
        Object[] objArr = 0 == true ? 1 : 0;
        return new C16824q(str, enumC16821n, new C18052g(str4, str2, enumC2888c, interfaceC25312u2, objArr, list, interfaceC25312u, new C35375b(AbstractC2875y.m8299l(str, "-emoji"), str3, 6 * 4, 20.25f, null), z4, z13, genericInteraction, 1564, null), 0 == true ? 1 : 0, null, true, z4, 0 == true ? 1 : 0, 152, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C16824q m129712g(String str, String str2, String str3, InterfaceC25312u interfaceC25312u, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z4 = false;
        }
        boolean z13 = z4;
        if ((i13 & 32) != 0) {
            list = C25271y.f99162w;
        }
        return m129711f(str, str2, str3, interfaceC25312u, z13, list);
    }

    /* JADX INFO: renamed from: h */
    public static final List<C23465k> m129713h() {
        return f174254b;
    }
}
