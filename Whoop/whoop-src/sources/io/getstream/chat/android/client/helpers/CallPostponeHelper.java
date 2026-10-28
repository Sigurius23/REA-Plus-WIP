package io.getstream.chat.android.client.helpers;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.scope.UserScope;
import l83.InterfaceC23462h;
import o23.C27478h;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\f*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R*\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/helpers/CallPostponeHelper;", "", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "", "timeoutInMillis", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "awaitConnection", "<init>", "(Lio/getstream/chat/android/client/scope/UserScope;JLkotlin/jvm/functions/Function1;)V", "T", "Lkotlin/Function0;", "Lo23/d;", NotificationCompat.CATEGORY_CALL, "postponeCall$stream_chat_android_client_release", "(Lc93/a;)Lo23/d;", "postponeCall", "Lio/getstream/chat/android/client/scope/UserScope;", "J", "Lkotlin/jvm/functions/Function1;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CallPostponeHelper {
    private static final long DEFAULT_TIMEOUT = 5000;
    private final Function1 awaitConnection;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final long timeoutInMillis;
    private final UserScope userScope;

    public CallPostponeHelper(UserScope userScope, long j7, Function1 awaitConnection) {
        AbstractC22676k.m65750j(userScope, "userScope");
        AbstractC22676k.m65750j(awaitConnection, "awaitConnection");
        this.userScope = userScope;
        this.timeoutInMillis = j7;
        this.awaitConnection = awaitConnection;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:CallPostponeHelper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public final <T> InterfaceC27474d postponeCall$stream_chat_android_client_release(InterfaceC4339a call) {
        AbstractC22676k.m65750j(call, "call");
        return new C27478h(this.userScope, new CallPostponeHelper$postponeCall$1(this, call, null));
    }

    public /* synthetic */ CallPostponeHelper(UserScope userScope, long j7, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(userScope, (i13 & 2) != 0 ? 5000L : j7, function1);
    }
}
