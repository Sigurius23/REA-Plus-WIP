package io.getstream.chat.android.client.api;

import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.call.RetrofitCall;
import io.getstream.chat.android.client.parser.ChatParser;
import java.lang.reflect.Type;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.InterfaceC29182e;
import pg3.InterfaceC29187g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api/RetrofitCallAdapter;", "", "T", "Lpg3/g;", "Lo23/d;", "Ljava/lang/reflect/Type;", "responseType", "Lio/getstream/chat/android/client/parser/ChatParser;", "parser", "Lbc3/c0;", "coroutineScope", "<init>", "(Ljava/lang/reflect/Type;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V", "()Ljava/lang/reflect/Type;", "Lpg3/e;", NotificationCompat.CATEGORY_CALL, "adapt", "(Lpg3/e;)Lo23/d;", "Ljava/lang/reflect/Type;", "Lio/getstream/chat/android/client/parser/ChatParser;", "Lbc3/c0;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RetrofitCallAdapter<T> implements InterfaceC29187g {
    private final InterfaceC2994c0 coroutineScope;
    private final ChatParser parser;
    private final Type responseType;

    public RetrofitCallAdapter(Type responseType, ChatParser parser, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(responseType, "responseType");
        AbstractC22676k.m65750j(parser, "parser");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.responseType = responseType;
        this.parser = parser;
        this.coroutineScope = coroutineScope;
    }

    @Override // pg3.InterfaceC29187g
    /* JADX INFO: renamed from: responseType, reason: from getter */
    public final Type getResponseType() {
        return this.responseType;
    }

    @Override // pg3.InterfaceC29187g
    public final InterfaceC27474d adapt(InterfaceC29182e call) {
        AbstractC22676k.m65750j(call, "call");
        return new RetrofitCall(call, this.parser, this.coroutineScope);
    }
}
