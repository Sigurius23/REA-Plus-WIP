package io.getstream.chat.android.p226ui.common.feature.messages.list;

import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MessageListController$closePoll$2$1 extends C22672i implements Function1 {
    public static final MessageListController$closePoll$2$1 INSTANCE = new MessageListController$closePoll$2$1();

    public MessageListController$closePoll$2$1() {
        super(1, MessageListController.ErrorEvent.PollClosingError.class, "<init>", "<init>(Lio/getstream/result/Error;)V", 0);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final MessageListController.ErrorEvent.PollClosingError invoke(AbstractC26202e p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return new MessageListController.ErrorEvent.PollClosingError(p13);
    }
}
