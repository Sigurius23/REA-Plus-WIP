package c41;

import com.whoop.design.models.ActivityTileSelectionState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c41.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lc41/r;", "", "a", "(Lc41/r;)Z", "isSelectable", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4110s {
    /* JADX INFO: renamed from: a */
    public static final boolean m12668a(C4103r c4103r) {
        AbstractC22676k.m65750j(c4103r, "<this>");
        return c4103r.getSelectableState() == ActivityTileSelectionState.SELECTABLE;
    }
}
