package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import io.getstream.chat.android.models.ChannelData;
import java.util.Date;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22656a;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MessageComposerController$5$3 extends C22656a implements Function3 {
    public static final MessageComposerController$5$3 INSTANCE = new MessageComposerController$5$3();

    public MessageComposerController$5$3() {
        super(3, C23465k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(ChannelData channelData, Date date, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        MessageComposerController.Companion companion = MessageComposerController.INSTANCE;
        return new C23465k(channelData, date);
    }
}
