package rt1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import rs1.AbstractC31794f;

/* JADX INFO: renamed from: rt1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lrt1/a;", "", "", "isCalibrating", "Lcom/whoop/design/util/TextResource;", "calibrationTile", "calibrationBody", "<init>", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "a", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lrt1/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31803a {

    /* JADX INFO: renamed from: d */
    public static final int f131717d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isCalibrating;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource calibrationTile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource calibrationBody;

    public C31803a(boolean z4, TextResource calibrationTile, TextResource calibrationBody) {
        AbstractC22676k.m65750j(calibrationTile, "calibrationTile");
        AbstractC22676k.m65750j(calibrationBody, "calibrationBody");
        this.isCalibrating = z4;
        this.calibrationTile = calibrationTile;
        this.calibrationBody = calibrationBody;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31803a m98794b(C31803a c31803a, boolean z4, TextResource textResource, TextResource textResource2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c31803a.isCalibrating;
        }
        if ((i13 & 2) != 0) {
            textResource = c31803a.calibrationTile;
        }
        if ((i13 & 4) != 0) {
            textResource2 = c31803a.calibrationBody;
        }
        return c31803a.m98795a(z4, textResource, textResource2);
    }

    /* JADX INFO: renamed from: a */
    public final C31803a m98795a(boolean isCalibrating, TextResource calibrationTile, TextResource calibrationBody) {
        AbstractC22676k.m65750j(calibrationTile, "calibrationTile");
        AbstractC22676k.m65750j(calibrationBody, "calibrationBody");
        return new C31803a(isCalibrating, calibrationTile, calibrationBody);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCalibrationBody() {
        return this.calibrationBody;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getCalibrationTile() {
        return this.calibrationTile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCalibrating() {
        return this.isCalibrating;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31803a)) {
            return false;
        }
        C31803a c31803a = (C31803a) other;
        return this.isCalibrating == c31803a.isCalibrating && AbstractC22676k.m65745e(this.calibrationTile, c31803a.calibrationTile) && AbstractC22676k.m65745e(this.calibrationBody, c31803a.calibrationBody);
    }

    public int hashCode() {
        return this.calibrationBody.hashCode() + AbstractC31061c.m95625a(Boolean.hashCode(this.isCalibrating) * 31, this.calibrationTile, 31);
    }

    public String toString() {
        boolean z4 = this.isCalibrating;
        TextResource textResource = this.calibrationTile;
        TextResource textResource2 = this.calibrationBody;
        StringBuilder sb4 = new StringBuilder("CalibrationState(isCalibrating=");
        sb4.append(z4);
        sb4.append(", calibrationTile=");
        sb4.append(textResource);
        sb4.append(", calibrationBody=");
        return AbstractC30007c.m91841k(sb4, textResource2, ")");
    }

    public /* synthetic */ C31803a(boolean z4, TextResource textResource, TextResource textResource2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? new TextResource.C8688b(AbstractC31794f.f131675p, null, 2, null) : textResource, (i13 & 4) != 0 ? new TextResource.C8688b(AbstractC31794f.f131677q, null, 2, null) : textResource2);
    }
}
