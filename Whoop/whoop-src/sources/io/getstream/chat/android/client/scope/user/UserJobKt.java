package io.getstream.chat.android.client.scope.user;

import bc3.C3004e2;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lbc3/k1;", "parent", "Lkotlin/Function0;", "", "Lio/getstream/chat/android/models/UserId;", "getUserId", "Lio/getstream/chat/android/client/scope/user/UserJob;", "UserJob", "(Lbc3/k1;Lc93/a;)Lio/getstream/chat/android/client/scope/user/UserJob;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserJobKt {
    public static final UserJob UserJob(InterfaceC3027k1 interfaceC3027k1, InterfaceC4339a getUserId) {
        AbstractC22676k.m65750j(getUserId, "getUserId");
        return new UserJobImpl(new C3004e2(interfaceC3027k1), getUserId);
    }

    public static /* synthetic */ UserJob UserJob$default(InterfaceC3027k1 interfaceC3027k1, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC3027k1 = null;
        }
        return UserJob(interfaceC3027k1, interfaceC4339a);
    }
}
