package com.whoop.whooplabs.data.domain;

import oy2.C28483i;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;", "Loy2/i;", "toDomainState", "(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)Loy2/i;", "", "PROTOCOL_STEP_CONFIG_TABLE", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProtocolStepConfigKt {
    public static final String PROTOCOL_STEP_CONFIG_TABLE = "whoop_labs_protocol_step_config";

    public static final C28483i toDomainState(ProtocolStepConfig protocolStepConfig) {
        if (protocolStepConfig == null) {
            return new C28483i(null, null, null, null, null, null, 0, 127, null);
        }
        String inputLabel = protocolStepConfig.getInputLabel();
        if (inputLabel == null) {
            inputLabel = "";
        }
        Integer min = protocolStepConfig.getMin();
        Integer max = protocolStepConfig.getMax();
        String minErrorText = protocolStepConfig.getMinErrorText();
        if (minErrorText == null) {
            minErrorText = "";
        }
        String maxErrorText = protocolStepConfig.getMaxErrorText();
        if (maxErrorText == null) {
            maxErrorText = "";
        }
        String hint = protocolStepConfig.getHint();
        if (hint == null) {
            hint = "";
        }
        Integer rowCount = protocolStepConfig.getRowCount();
        return new C28483i(inputLabel, min, max, minErrorText, maxErrorText, hint, rowCount != null ? rowCount.intValue() : 1);
    }
}
