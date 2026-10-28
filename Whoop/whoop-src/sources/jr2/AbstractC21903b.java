package jr2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import p208i2.AbstractC17918w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jr2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Ljr2/d;", "background", "a", "(Landroidx/compose/ui/Modifier;Ljr2/d;)Landroidx/compose/ui/Modifier;", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21903b {
    /* JADX INFO: renamed from: a */
    public static final Modifier m62312a(Modifier modifier, C21905d background) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(background, "background");
        if (background.getBrush() != null) {
            return AbstractC1092a.m3357b(modifier, background.getBrush(), null, 0.0f, 6);
        }
        return background.getColor() != null ? AbstractC1092a.m3358c(modifier, background.getColor().f69639a, AbstractC17918w0.f69621a) : modifier;
    }
}
