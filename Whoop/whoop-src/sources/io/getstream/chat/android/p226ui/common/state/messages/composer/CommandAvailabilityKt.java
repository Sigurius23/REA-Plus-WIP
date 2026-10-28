package io.getstream.chat.android.p226ui.common.state.messages.composer;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import java.util.Comparator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"isAvailableFor", "", "Lio/getstream/chat/android/models/Command;", "action", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "sortedByAvailability", "", "MODERATION_COMMAND_SET", "", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CommandAvailabilityKt {
    private static final String MODERATION_COMMAND_SET = "moderation_set";

    @InternalStreamChatApi
    public static final boolean isAvailableFor(Command command, MessageAction messageAction) {
        AbstractC22676k.m65750j(command, "<this>");
        if (messageAction instanceof Edit) {
            return false;
        }
        return ((messageAction instanceof Reply) && AbstractC22676k.m65745e(command.getSet(), MODERATION_COMMAND_SET)) ? false : true;
    }

    @InternalStreamChatApi
    public static final List<Command> sortedByAvailability(List<Command> list, final MessageAction messageAction) {
        AbstractC22676k.m65750j(list, "<this>");
        final Comparator comparator = new Comparator() { // from class: io.getstream.chat.android.ui.common.state.messages.composer.CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t14, T t15) {
                return AbstractC30060g.m92127q(Boolean.valueOf(CommandAvailabilityKt.isAvailableFor((Command) t15, messageAction)), Boolean.valueOf(CommandAvailabilityKt.isAvailableFor((Command) t14, messageAction)));
            }
        };
        return AbstractC25265s.m74152u1(list, new Comparator() { // from class: io.getstream.chat.android.ui.common.state.messages.composer.CommandAvailabilityKt$sortedByAvailability$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t14, T t15) {
                int iCompare = comparator.compare(t14, t15);
                return iCompare != 0 ? iCompare : AbstractC30060g.m92127q(Boolean.valueOf(!AbstractC22676k.m65745e(((Command) t15).getSet(), "moderation_set")), Boolean.valueOf(!AbstractC22676k.m65745e(((Command) t14).getSet(), "moderation_set")));
            }
        });
    }
}
