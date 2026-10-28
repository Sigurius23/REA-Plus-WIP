package io.getstream.chat.android.p226ui.utils;

import bc3.AbstractC3006f0;
import ec3.InterfaceC13058l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"T", "Lec3/l;", "Lq83/j;", "context", "Lio/getstream/chat/android/ui/utils/SingleLiveEvent;", "asSingleLiveEvent", "(Lec3/l;Lq83/j;)Lio/getstream/chat/android/ui/utils/SingleLiveEvent;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SingleLiveEventKt {
    public static final <T> SingleLiveEvent<T> asSingleLiveEvent(InterfaceC13058l interfaceC13058l, InterfaceC30063j context) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        AbstractC22676k.m65750j(context, "context");
        SingleLiveEvent<T> singleLiveEvent = new SingleLiveEvent<>();
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(context), null, null, new SingleLiveEventKt$asSingleLiveEvent$1$1(interfaceC13058l, singleLiveEvent, null), 3);
        return singleLiveEvent;
    }

    public static /* synthetic */ SingleLiveEvent asSingleLiveEvent$default(InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        return asSingleLiveEvent(interfaceC13058l, interfaceC30063j);
    }
}
