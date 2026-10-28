package io.getstream.chat.android.p226ui.common.state.messages.list;

import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;", "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;", "text", "", "extraData", "", "", "", "<init>", "(ILjava/util/Map;)V", "getText", "()I", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CustomModerationOption extends ModeratedMessageOption {
    public static final int $stable = 8;
    private final Map<String, Object> extraData;
    private final int text;

    public CustomModerationOption(int i13, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        this.text = i13;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomModerationOption copy$default(CustomModerationOption customModerationOption, int i13, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = customModerationOption.text;
        }
        if ((i14 & 2) != 0) {
            map = customModerationOption.extraData;
        }
        return customModerationOption.copy(i13, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getText() {
        return this.text;
    }

    public final Map<String, Object> component2() {
        return this.extraData;
    }

    public final CustomModerationOption copy(int text, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        return new CustomModerationOption(text, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModerationOption)) {
            return false;
        }
        CustomModerationOption customModerationOption = (CustomModerationOption) other;
        return this.text == customModerationOption.text && AbstractC22676k.m65745e(this.extraData, customModerationOption.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption
    public final int getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.extraData.hashCode() + (Integer.hashCode(this.text) * 31);
    }

    public final String toString() {
        return "CustomModerationOption(text=" + this.text + ", extraData=" + this.extraData + ")";
    }

    public /* synthetic */ CustomModerationOption(int i13, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? C25272z.f99163w : map);
    }
}
