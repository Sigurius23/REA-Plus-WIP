package r50;

import com.whoop.access.measurementprogress.models.MeasurementProgressModel;
import com.whoop.access.measurementprogress.models.MeasurementReadingModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.items.ImpactModel;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23632g2;
import p716lb1.AbstractC23653j2;
import s50.C32202d;
import s50.C32203e;

/* JADX INFO: renamed from: r50.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;", "Ls50/d;", "a", "(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;)Ls50/d;", "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "Ls50/e;", "b", "(Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;)Ls50/e;", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30932a {
    /* JADX INFO: renamed from: a */
    public static final C32202d m95141a(MeasurementProgressModel measurementProgressModel) {
        AbstractC22676k.m65750j(measurementProgressModel, "<this>");
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(measurementProgressModel.getIcon());
        String title = measurementProgressModel.getTitle();
        ImpactModel tag = measurementProgressModel.getTag();
        C17731c2 c17731c2M68791d = tag != null ? AbstractC23632g2.m68791d(tag) : null;
        C32203e c32203eM95142b = m95142b(measurementProgressModel.getStart());
        C32203e c32203eM95142b2 = m95142b(measurementProgressModel.getLatest());
        C32203e c32203eM95142b3 = m95142b(measurementProgressModel.getTarget());
        InfoCalloutTileModel callout = measurementProgressModel.getCallout();
        return new C32202d(enumC16313m0M46377b, title, c17731c2M68791d, c32203eM95142b, c32203eM95142b2, c32203eM95142b3, callout != null ? AbstractC23653j2.m68922b(callout) : null);
    }

    /* JADX INFO: renamed from: b */
    private static final C32203e m95142b(MeasurementReadingModel measurementReadingModel) {
        return new C32203e(measurementReadingModel.getLabel(), measurementReadingModel.getValue(), measurementReadingModel.getStyle());
    }
}
