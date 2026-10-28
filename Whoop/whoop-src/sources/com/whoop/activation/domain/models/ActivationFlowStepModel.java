package com.whoop.activation.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import java.util.List;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "getNavigationBarText", "()Ljava/lang/String;", "navigationBarText", "getMobileScreenName", "mobileScreenName", "getAnalyticsName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "()Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "getFooterButtons", "()Ljava/util/List;", "footerButtons", "Lcom/whoop/activation/domain/models/FooterAlignment;", "getFooterAlignment", "()Lcom/whoop/activation/domain/models/FooterAlignment;", "footerAlignment", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ActivationFlowStepModel extends DesignSystemModel {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static FooterAlignment getFooterAlignment(ActivationFlowStepModel activationFlowStepModel) {
            return ActivationFlowStepModel.super.getFooterAlignment();
        }
    }

    String getAnalyticsName();

    default FooterAlignment getFooterAlignment() {
        return null;
    }

    List<DesignSystemModel> getFooterButtons();

    String getMobileScreenName();

    String getNavigationBarText();

    ProgressButtonModel getProgressCircle();
}
