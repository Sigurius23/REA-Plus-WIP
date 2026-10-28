package cm2;

import c01.C3801a;
import c01.C3808h;
import c01.C3809i;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.trends.data.model.BarDTOV3;
import com.whoop.trends.data.model.BreakDownBarDtoV3;
import com.whoop.trends.data.model.ConfigurableBarDTOV3;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import or2.EnumC28166h0;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cm2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcm2/c;", "", "Lcm2/x;", "trendsColorHelper", "<init>", "(Lcm2/x;)V", "", "Lcom/whoop/trends/data/model/BarDTOV3;", "bars", "Lor2/h0;", "graphKey", "Lc01/a;", "c", "(Ljava/util/List;Lor2/h0;)Ljava/util/List;", "Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;", "Lc01/i;", "b", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;", "breakDownBarDto", "Lc01/h;", "a", "(Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lor2/h0;)Lc01/h;", "Lcm2/x;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4815c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4836x trendsColorHelper;

    /* JADX INFO: renamed from: cm2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ BarDTOV3 f19826w;

        public a(BarDTOV3 barDTOV3) {
            this.f19826w = barDTOV3;
        }

        /* JADX INFO: renamed from: a */
        public final long m15203a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c((float) this.f19826w.getOpacity(), whoopColor.getBrandWhite());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15203a((C39336i) obj));
        }
    }

    public C4815c(C4836x trendsColorHelper) {
        AbstractC22676k.m65750j(trendsColorHelper, "trendsColorHelper");
        this.trendsColorHelper = trendsColorHelper;
    }

    /* JADX INFO: renamed from: b */
    private final List<C3809i> m15200b(List<ConfigurableBarDTOV3> bars) {
        List<ConfigurableBarDTOV3> list = bars;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ConfigurableBarDTOV3 configurableBarDTOV3 : list) {
            arrayList.add(new C3809i(this.trendsColorHelper.m15319h(configurableBarDTOV3.getBarColor()), ((float) configurableBarDTOV3.getPercentage()) * 1000, AbstractC8693b.m21278l(configurableBarDTOV3.getBottomLabelDisplay()), AbstractC8693b.m21278l(String.valueOf(configurableBarDTOV3.getTopLabel()))));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final List<C3801a> m15201c(List<BarDTOV3> bars, EnumC28166h0 graphKey) {
        C3801a c3801a;
        EnumC28166h0 enumC28166h0;
        List<BarDTOV3> list = bars;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            BarDTOV3 barDTOV3 = (BarDTOV3) obj;
            if (graphKey == EnumC28166h0.RECOVERY) {
                c3801a = new C3801a(this.trendsColorHelper.m15318g(i13), (float) barDTOV3.getOpacity(), barDTOV3.getBotLabel(), AbstractC8693b.m21278l(String.valueOf(barDTOV3.getTopLabel())));
                enumC28166h0 = graphKey;
            } else {
                enumC28166h0 = graphKey;
                InterfaceC39332e interfaceC39332eM15314j = C4836x.m15314j(this.trendsColorHelper, enumC28166h0, null, false, false, 14, null);
                if (interfaceC39332eM15314j == null) {
                    interfaceC39332eM15314j = p745y81.Function1.m125323a(new a(barDTOV3));
                }
                c3801a = new C3801a(interfaceC39332eM15314j, (float) barDTOV3.getOpacity(), barDTOV3.getBotLabel(), AbstractC8693b.m21278l(String.valueOf(barDTOV3.getTopLabel())));
            }
            arrayList.add(c3801a);
            i13 = i14;
            graphKey = enumC28166h0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final C3808h m15202a(BreakDownBarDtoV3 breakDownBarDto, EnumC28166h0 graphKey) {
        TextResource textResourceM21267a;
        AbstractC22676k.m65750j(breakDownBarDto, "breakDownBarDto");
        AbstractC22676k.m65750j(graphKey, "graphKey");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(breakDownBarDto.getTitle());
        String subTitle = breakDownBarDto.getSubTitle();
        if (subTitle == null || (textResourceM21267a = AbstractC8693b.m21278l(subTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        Integer numberOfGridColumns = breakDownBarDto.getNumberOfGridColumns();
        return new C3808h(textResourceM21278l, textResource, m15201c(breakDownBarDto.getBars(), graphKey), m15200b(breakDownBarDto.getConfigurableBars()), numberOfGridColumns != null ? numberOfGridColumns.intValue() : 1);
    }
}
