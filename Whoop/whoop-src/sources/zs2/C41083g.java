package zs2;

import bu2.C3640b0;
import bu2.C3655p;
import com.whoop.data.remote.domain.dto.BoundType;
import com.whoop.data.remote.domain.dto.DoubleRange;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.ProgressionToolTip;
import com.whoop.weeklyplan.customizeplan.domain.api.RangeWithTip;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import or2.AbstractC28145a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30619y;
import p745y81.EnumC39333f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zs2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lzs2/g;", "", "<init>", "()V", "", "roundToInterval", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;", "it", "Lcom/whoop/data/remote/domain/dto/BoundType;", "lowerBoundType", "upperBoundType", "Lcom/whoop/data/remote/domain/dto/DoubleRange;", "b", "(Ljava/lang/Double;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/DoubleRange;", "", "boundString", "boundTypeOverride", "a", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/BoundType;)Lcom/whoop/data/remote/domain/dto/BoundType;", "", "rangeContent", "Ly81/f;", "color", "Lbu2/p;", "c", "(Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;)Ljava/util/List;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41083g {
    /* JADX INFO: renamed from: a */
    private final BoundType m133395a(String boundString, BoundType boundTypeOverride) {
        if (boundTypeOverride != null) {
            return boundTypeOverride;
        }
        if (boundString == null) {
            boundString = "";
        }
        try {
            return BoundType.valueOf(boundString);
        } catch (IllegalArgumentException unused) {
            return BoundType.CLOSED;
        }
    }

    /* JADX INFO: renamed from: b */
    private final DoubleRange m133396b(Double roundToInterval, RangeWithTip it, BoundType lowerBoundType, BoundType upperBoundType) {
        return roundToInterval != null ? new DoubleRange(AbstractC28145a1.m85169e(it.getRange().getMin(), roundToInterval.doubleValue()), lowerBoundType, AbstractC28145a1.m85169e(it.getRange().getMax(), roundToInterval.doubleValue()), upperBoundType) : new DoubleRange(it.getRange().getMin(), lowerBoundType, it.getRange().getMax(), upperBoundType);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m133397d(C41083g c41083g, List list, Double d3, BoundType boundType, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            d3 = null;
        }
        if ((i13 & 4) != 0) {
            boundType = null;
        }
        if ((i13 & 8) != 0) {
            enumC39333f = EnumC39333f.SLEEP;
        }
        return c41083g.m133398c(list, d3, boundType, enumC39333f);
    }

    /* JADX INFO: renamed from: c */
    public final List<C3655p> m133398c(List<RangeWithTip> rangeContent, Double roundToInterval, BoundType boundTypeOverride, EnumC39333f color) {
        EnumC39333f color2 = color;
        AbstractC22676k.m65750j(color2, "color");
        if (rangeContent == null) {
            return null;
        }
        List<RangeWithTip> list = rangeContent;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (RangeWithTip rangeWithTip : list) {
            DoubleRange doubleRangeM133396b = m133396b(roundToInterval, rangeWithTip, m133395a(rangeWithTip.getRange().getLowerBoundType(), boundTypeOverride), m133395a(rangeWithTip.getRange().getUpperBoundType(), boundTypeOverride));
            String titleDisplay = rangeWithTip.getTooltip().getTitleDisplay();
            if (titleDisplay == null || AbstractC39414r.m125890i0(titleDisplay)) {
                titleDisplay = null;
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l(titleDisplay);
            String subtitleDisplay = rangeWithTip.getTooltip().getSubtitleDisplay();
            if (subtitleDisplay == null || AbstractC39414r.m125890i0(subtitleDisplay)) {
                subtitleDisplay = null;
            }
            C3640b0 c3640b0 = new C3640b0(textResourceM21278l, AbstractC8693b.m21278l(subtitleDisplay), rangeWithTip.getTooltip().getData());
            ProgressionToolTip progressionToolTip = rangeWithTip.getProgressionToolTip();
            arrayList.add(new C3655p(doubleRangeM133396b, c3640b0, progressionToolTip != null ? new C30619y(AbstractC8693b.m21278l(progressionToolTip.getTitle()), AbstractC8693b.m21278l(progressionToolTip.getDescription()), progressionToolTip.getCurrentBarCopy(), progressionToolTip.getWeeklyIncreaseCopy(), progressionToolTip.getTargetBarCopy(), progressionToolTip.isOptimal(), color2) : null));
            color2 = color;
        }
        return arrayList;
    }
}
