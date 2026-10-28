package f01;

import androidx.compose.p018ui.Modifier;
import ge3.AbstractC15751g;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17875c1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: f01.q1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m65681d2 = {"Lf01/q1;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/Modifier;", "styleModifier", "Landroidx/compose/ui/Modifier;", "getStyleModifier", "()Landroidx/compose/ui/Modifier;", "ONBOARDING_WITH_BORDER", "ONBOARDING", "OUTLINED", "ADVANCED_LABS", "HAL", "PROMO_LINEAR", "SUFFICIENT_WITH_BORDER", "ELEVATED", "NONE", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC13892q1 {
    ONBOARDING_WITH_BORDER,
    ONBOARDING,
    OUTLINED { // from class: f01.q1.b

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Modifier styleModifier = AbstractC15751g.m44456i((float) 1.5d, C2314t.f9131w, new C17875c1(AbstractC17918w0.m51515c(1308622847)), AbstractC33253j.m105489e(3 * 4));

        @Override // f01.EnumC13892q1
        public Modifier getStyleModifier() {
            return this.styleModifier;
        }
    },
    ADVANCED_LABS,
    HAL { // from class: f01.q1.a

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final Modifier styleModifier;

        @Override // f01.EnumC13892q1
        public Modifier getStyleModifier() {
            return this.styleModifier;
        }
    },
    PROMO_LINEAR,
    SUFFICIENT_WITH_BORDER,
    ELEVATED,
    NONE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final Modifier styleModifier;

    /* synthetic */ EnumC13892q1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public Modifier getStyleModifier() {
        return this.styleModifier;
    }

    EnumC13892q1() {
        this.styleModifier = C2314t.f9131w;
    }
}
