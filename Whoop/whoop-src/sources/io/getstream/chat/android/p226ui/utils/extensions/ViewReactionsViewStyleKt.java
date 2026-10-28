package io.getstream.chat.android.p226ui.utils.extensions;

import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.SingleReactionViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.ViewReactionsViewStyle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m65681d2 = {"toSingleReactionViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ViewReactionsViewStyleKt {
    public static final SingleReactionViewStyle toSingleReactionViewStyle(ViewReactionsViewStyle viewReactionsViewStyle) {
        AbstractC22676k.m65750j(viewReactionsViewStyle, "<this>");
        return new SingleReactionViewStyle(viewReactionsViewStyle.getBubbleBorderColorMine(), viewReactionsViewStyle.getBubbleBorderColorTheirs(), viewReactionsViewStyle.getBubbleColorMine(), viewReactionsViewStyle.getBubbleColorTheirs(), viewReactionsViewStyle.getBubbleBorderWidthMine(), viewReactionsViewStyle.getBubbleBorderWidthTheirs(), viewReactionsViewStyle.getTotalHeight(), viewReactionsViewStyle.getBubbleHeight(), viewReactionsViewStyle.getBubbleRadius(), viewReactionsViewStyle.getLargeTailBubbleCy(), viewReactionsViewStyle.getLargeTailBubbleRadius(), viewReactionsViewStyle.getLargeTailBubbleOffset(), viewReactionsViewStyle.getSmallTailBubbleCy(), viewReactionsViewStyle.getSmallTailBubbleRadius(), viewReactionsViewStyle.getSmallTailBubbleOffset(), viewReactionsViewStyle.getMessageOptionsUserReactionOrientation());
    }
}
