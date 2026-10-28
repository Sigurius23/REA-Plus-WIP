package androidx.compose.material;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p163g1.C15119q3;
import p207i1.AbstractC17850a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/material/MinimumInteractiveModifier;", "La3/h1;", "Lg1/q3;", "<init>", "()V", "material"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MinimumInteractiveModifier extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public static final MinimumInteractiveModifier f4718w = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C15119q3();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return AbstractC17850a.m51333a(this);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("minimumInteractiveComponentSize");
        c2404l2.m7400b().m7292c("Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller", "README");
    }

    @Override // p005a3.AbstractC0207h1
    public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
    }
}
