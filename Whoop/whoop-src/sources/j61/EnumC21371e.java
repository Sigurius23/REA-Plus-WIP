package j61;

import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: j61.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lj61/e;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "<init>", "(Ljava/lang/String;I)V", "", "isDrawnAbovePlotContent", "()Z", "REGION_HIGHLIGHT", "AVERAGE_MARKER", "VERTICAL_AXIS", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC21371e implements DesignSystemEnum {
    REGION_HIGHLIGHT,
    AVERAGE_MARKER,
    VERTICAL_AXIS;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final boolean isDrawnAbovePlotContent() {
        return this == AVERAGE_MARKER || this == VERTICAL_AXIS;
    }
}
