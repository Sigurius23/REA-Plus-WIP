package zz1;

import c93.InterfaceC4339a;
import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductOption;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.SelectorType;
import com.whoop.nativestore.pdp.domain.model.SizeChart;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayMetadata;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayPriceBreakdownAccordionModel;

/* JADX INFO: renamed from: zz1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C41253a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177982w;

    public /* synthetic */ C41253a(int i13) {
        this.f177982w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f177982w) {
            case 0:
                return ProductMetadata._childSerializers$_anonymous_();
            case 1:
                return ProductMetadata._childSerializers$_anonymous_$0();
            case 2:
                return ProductOption._childSerializers$_anonymous_();
            case 3:
                return ProductVariantSelectorModel._childSerializers$_anonymous_();
            case 4:
                return ProductVariantSelectorModel._childSerializers$_anonymous_$0();
            case 5:
                return ProductVariantSelectorModel._childSerializers$_anonymous_$1();
            case 6:
                return SelectorLevel._init_$_anonymous_();
            case 7:
                return SelectorType._init_$_anonymous_();
            case 8:
                return SizeChart._childSerializers$_anonymous_();
            case 9:
                return VariantOption._childSerializers$_anonymous_();
            case 10:
                return VariantOption._childSerializers$_anonymous_$0();
            case 11:
                return VariantOption._childSerializers$_anonymous_$1();
            case 12:
                return VariantOption._childSerializers$_anonymous_$2();
            case 13:
                return WhoopYourWayMetadata._childSerializers$_anonymous_();
            case 14:
                return WhoopYourWayMetadata._childSerializers$_anonymous_$0();
            default:
                return WhoopYourWayPriceBreakdownAccordionModel._childSerializers$_anonymous_();
        }
    }
}
