package dx2;

import com.whoop.whooplabs.data.remote.domain.dto.bff.BottomSheetOption;
import com.whoop.whooplabs.data.remote.domain.dto.bff.OptionsConfigResponse;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: dx2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C12431b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42358w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OptionsConfigResponse f42359x;

    public /* synthetic */ C12431b(OptionsConfigResponse optionsConfigResponse, int i13) {
        this.f42358w = i13;
        this.f42359x = optionsConfigResponse;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42358w) {
            case 0:
                return OptionsConfigResponse._get_negativeCta_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 1:
                return OptionsConfigResponse._get_cancelScreenBackText_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 2:
                return OptionsConfigResponse._get_cancelScreenTitle_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 3:
                return OptionsConfigResponse._get_errorTitle_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 4:
                return OptionsConfigResponse._get_errorPositiveCta_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 5:
                return OptionsConfigResponse._get_errorNegativeCta_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 6:
                return OptionsConfigResponse._get_cancelScreenOptions_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 7:
                return OptionsConfigResponse._get_positiveCta_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 8:
                return OptionsConfigResponse._get_body_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 9:
                return OptionsConfigResponse._get_cancelScreenCtaText_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 10:
                return OptionsConfigResponse._get_errorBody_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 11:
                return OptionsConfigResponse._get_cancelScreenBottomText_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            case 12:
                return OptionsConfigResponse._get_cancelScreenSubtitle_$lambda$0(this.f42359x, (BottomSheetOption) obj);
            default:
                return OptionsConfigResponse._get_title_$lambda$0(this.f42359x, (BottomSheetOption) obj);
        }
    }
}
