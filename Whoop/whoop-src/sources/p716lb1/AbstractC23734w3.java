package p716lb1;

import b91.AbstractC2890e;
import com.whoop.design.models.CircularProgressStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ProgressMetricRowModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d31.C11578c;
import e93.AbstractC12889b;
import l83.C23454a0;
import p01.C28582b;
import p01.EnumC28588h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.w3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/ProgressMetricRowModel;", "Ld31/c;", "g", "(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;", "Lcom/whoop/design/models/CircularProgressStyle;", "Llb1/e0;", "c", "(Lcom/whoop/design/models/CircularProgressStyle;)Llb1/e0;", "Llb1/y0;", "a", "Llb1/y0;", "d", "()Llb1/y0;", "progressMetricRowMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23734w3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94043a = Function1.m68251a(new C23654j3(27));

    /* JADX INFO: renamed from: lb1.w3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94044a;

        static {
            int[] iArr = new int[CircularProgressStyle.values().length];
            try {
                iArr[CircularProgressStyle.ACTIVITY_SNAPSHOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f94044a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.w3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94045w;

        public b(Function1 function1) {
            this.f94045w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94045w.invoke((ProgressMetricRowModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    private static final C23616e0 m69620c(CircularProgressStyle circularProgressStyle) {
        if (circularProgressStyle == null) {
            circularProgressStyle = CircularProgressStyle.ACTIVITY_SNAPSHOT;
        }
        if (a.f94044a[circularProgressStyle.ordinal()] == 1) {
            return new C23616e0(EnumC39333f.STRAIN, EnumC39333f.WHITE_10, AbstractC2890e.m8450e().getN45(), EnumC39333f.BRAND_WHITE, 22 * 4, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m69621d() {
        return f94043a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69622e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProgressMetricRowModel.class), new b(new C23654j3(28)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C11578c m69623f(ProgressMetricRowModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69624g(model);
    }

    /* JADX INFO: renamed from: g */
    private static final C11578c m69624g(ProgressMetricRowModel progressMetricRowModel) {
        C23616e0 c23616e0M69620c = m69620c(progressMetricRowModel.getStyle());
        float fM36283m = AbstractC12889b.m36283m(progressMetricRowModel.getProgress(), 0.0f, 1.0f);
        String progressDisplay = progressMetricRowModel.getProgressDisplay();
        if (progressDisplay == null) {
            progressDisplay = "";
        }
        C28582b c28582b = new C28582b(0, 0, fM36283m, progressDisplay, c23616e0M69620c.getLabelTextStyle(), c23616e0M69620c.getLabelTextColor(), null, c23616e0M69620c.getFillColor(), c23616e0M69620c.getFillColor(), c23616e0M69620c.getTrackColor(), null, null, c23616e0M69620c.getRingDiameter(), 0.0f, 0.0f, false, false, 0L, EnumC28588h.PERCENTAGE, null, 781379, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(progressMetricRowModel.getTitleDisplay());
        String subtitleDisplay = progressMetricRowModel.getSubtitleDisplay();
        return new C11578c(c28582b, textResourceM21278l, subtitleDisplay != null ? AbstractC8693b.m21278l(subtitleDisplay) : null);
    }
}
