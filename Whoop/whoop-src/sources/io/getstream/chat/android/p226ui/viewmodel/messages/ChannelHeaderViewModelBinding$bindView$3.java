package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.messages.header.ChannelHeaderView;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ChannelHeaderViewModelBinding$bindView$3 extends C22672i implements Function1 {
    public ChannelHeaderViewModelBinding$bindView$3(Object obj) {
        super(1, 0, ChannelHeaderView.class, obj, "showTypingStateLabel", "showTypingStateLabel(Ljava/util/List;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<User>) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(List<User> p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((ChannelHeaderView) this.receiver).showTypingStateLabel(p13);
    }
}
