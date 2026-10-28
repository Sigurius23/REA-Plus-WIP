package am2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import java.util.List;
import or2.EnumC28166h0;
import p026b2.C2314t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: am2.e0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0010"}, m65681d2 = {"Lam2/e0;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "Lor2/h0;", "graphKey", "a", "(Landroidx/compose/ui/Modifier;Lor2/h0;)Landroidx/compose/ui/Modifier;", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "TWO_KEY_METRIC_GRAPH_KEYS", "THREE_KEY_METRIC_GRAPH_KEYS", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1015e0 {

    /* JADX INFO: renamed from: a */
    public static final C1015e0 f3803a = new C1015e0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final List<EnumC28166h0> TWO_KEY_METRIC_GRAPH_KEYS = AbstractC37056f.m118959K(EnumC28166h0.RESTORATIVE_SLEEP, EnumC28166h0.HOURS_V_NEED, EnumC28166h0.BODY_COMPOSITION);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final List<EnumC28166h0> THREE_KEY_METRIC_GRAPH_KEYS = AbstractC37056f.m118959K(EnumC28166h0.STRESS, EnumC28166h0.STRESS_DURING_NON_STRAIN, EnumC28166h0.STRESS_DURING_SLEEP);

    /* JADX INFO: renamed from: d */
    public static final int f3806d = 8;

    private C1015e0() {
    }

    /* JADX INFO: renamed from: a */
    public final Modifier m2724a(Modifier modifier, EnumC28166h0 graphKey) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(graphKey, "graphKey");
        boolean zContains = THREE_KEY_METRIC_GRAPH_KEYS.contains(graphKey);
        Modifier modifierM3405b = C2314t.f9131w;
        if (zContains) {
            modifierM3405b = AbstractC1102d.m3405b(modifierM3405b, 0.0f, 200, 1);
        } else if (TWO_KEY_METRIC_GRAPH_KEYS.contains(graphKey)) {
            modifierM3405b = AbstractC1102d.m3405b(modifierM3405b, 0.0f, 160, 1);
        }
        return modifier.mo3471e(modifierM3405b);
    }

    /* JADX INFO: renamed from: b */
    public final List<EnumC28166h0> m2725b() {
        return THREE_KEY_METRIC_GRAPH_KEYS;
    }

    /* JADX INFO: renamed from: c */
    public final List<EnumC28166h0> m2726c() {
        return TWO_KEY_METRIC_GRAPH_KEYS;
    }
}
