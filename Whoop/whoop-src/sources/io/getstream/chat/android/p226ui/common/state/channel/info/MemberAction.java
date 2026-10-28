package io.getstream.chat.android.p226ui.common.state.channel.info;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Member;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/MemberAction;", "", "Lio/getstream/chat/android/models/Member;", "getMember", "()Lio/getstream/chat/android/models/Member;", "member", "", "getIcon", "()I", "icon", "", "getLabel", "()Ljava/lang/String;", "label", "", "isDestructive", "()Z", "Lkotlin/Function0;", "Ll83/a0;", "getOnAction", "()Lc93/a;", "onAction", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MemberAction {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isDestructive(MemberAction memberAction) {
            memberAction.getClass();
            return false;
        }
    }

    static /* synthetic */ boolean access$isDestructive$jd(MemberAction memberAction) {
        memberAction.getClass();
        return false;
    }

    int getIcon();

    String getLabel();

    Member getMember();

    InterfaceC4339a getOnAction();

    default boolean isDestructive() {
        return false;
    }
}
