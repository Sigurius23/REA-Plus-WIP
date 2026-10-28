package pp0;

import ci2.InterfaceC4733b;
import com.whoop.common.network.model.GarmentItemDto;
import com.whoop.common.network.model.StrapGenerationSupportInfo;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import jk0.InterfaceC21750d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: pp0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lpp0/c;", "", "Lci2/b;", "whoopStrapProvider", "<init>", "(Lci2/b;)V", "Lst0/v;", "", "b", "(Lst0/v;)Ljava/lang/String;", "", "Lcom/whoop/common/network/model/GarmentItemDto;", "garments", "a", "(Ljava/util/List;)Ljava/util/List;", "Lci2/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29425c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: pp0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119473a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f119473a = iArr;
        }
    }

    public C29425c(InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.whoopStrapProvider = whoopStrapProvider;
    }

    /* JADX INFO: renamed from: b */
    private final String m89699b(EnumC32978v enumC32978v) {
        int i13 = a.f119473a[enumC32978v.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? "GEN_5" : "GEN_5_MG";
        }
        return "GEN_4";
    }

    /* JADX INFO: renamed from: a */
    public final List<GarmentItemDto> m89700a(List<GarmentItemDto> garments) {
        EnumC32978v enumC32978vMo24752w0;
        List<String> supportedGenStraps;
        AbstractC22676k.m65750j(garments, "garments");
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d == null || (enumC32978vMo24752w0 = interfaceC21750d.mo24752w0()) == null) {
            return garments;
        }
        String strM89699b = m89699b(enumC32978vMo24752w0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : garments) {
            StrapGenerationSupportInfo strapGenerationSupportInfo = ((GarmentItemDto) obj).getStrapGenerationSupportInfo();
            if (strapGenerationSupportInfo != null && (supportedGenStraps = strapGenerationSupportInfo.getSupportedGenStraps()) != null && supportedGenStraps.contains(strM89699b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
