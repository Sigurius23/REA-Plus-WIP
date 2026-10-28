package com.whoop.profile.view.edit;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/profile/view/edit/StateInfo;", "", "displayText", "Lcom/whoop/design/util/TextResource;", "stateCode", "", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "getDisplayText", "()Lcom/whoop/design/util/TextResource;", "getStateCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class StateInfo {
    public static final int $stable = TextResource.$stable;
    private final TextResource displayText;
    private final String stateCode;

    public StateInfo(TextResource displayText, String stateCode) {
        AbstractC22676k.m65750j(displayText, "displayText");
        AbstractC22676k.m65750j(stateCode, "stateCode");
        this.displayText = displayText;
        this.stateCode = stateCode;
    }

    public static /* synthetic */ StateInfo copy$default(StateInfo stateInfo, TextResource textResource, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = stateInfo.displayText;
        }
        if ((i13 & 2) != 0) {
            str = stateInfo.stateCode;
        }
        return stateInfo.copy(textResource, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getDisplayText() {
        return this.displayText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final StateInfo copy(TextResource displayText, String stateCode) {
        AbstractC22676k.m65750j(displayText, "displayText");
        AbstractC22676k.m65750j(stateCode, "stateCode");
        return new StateInfo(displayText, stateCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateInfo)) {
            return false;
        }
        StateInfo stateInfo = (StateInfo) other;
        return AbstractC22676k.m65745e(this.displayText, stateInfo.displayText) && AbstractC22676k.m65745e(this.stateCode, stateInfo.stateCode);
    }

    public final TextResource getDisplayText() {
        return this.displayText;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        return this.stateCode.hashCode() + (this.displayText.hashCode() * 31);
    }

    public String toString() {
        return "StateInfo(displayText=" + this.displayText + ", stateCode=" + this.stateCode + ")";
    }
}
