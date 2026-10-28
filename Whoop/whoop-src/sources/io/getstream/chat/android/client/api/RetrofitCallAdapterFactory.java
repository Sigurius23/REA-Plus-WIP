package io.getstream.chat.android.client.api;

import bc3.InterfaceC2994c0;
import io.getstream.chat.android.client.call.RetrofitCall;
import io.getstream.chat.android.client.parser.ChatParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.AbstractC29184e1;
import pg3.AbstractC29185f;
import pg3.C29224y0;
import pg3.InterfaceC29187g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;", "Lpg3/f;", "Lio/getstream/chat/android/client/parser/ChatParser;", "chatParser", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lpg3/y0;", "retrofit", "Lpg3/g;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/g;", "Lio/getstream/chat/android/client/parser/ChatParser;", "Lbc3/c0;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RetrofitCallAdapterFactory extends AbstractC29185f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final ChatParser chatParser;
    private final InterfaceC2994c0 coroutineScope;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;", "", "<init>", "()V", "Lio/getstream/chat/android/client/parser/ChatParser;", "chatParser", "Lbc3/c0;", "coroutineScope", "Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;", "create", "(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final RetrofitCallAdapterFactory create(ChatParser chatParser, InterfaceC2994c0 coroutineScope) {
            AbstractC22676k.m65750j(chatParser, "chatParser");
            AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
            return new RetrofitCallAdapterFactory(chatParser, coroutineScope, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ RetrofitCallAdapterFactory(ChatParser chatParser, InterfaceC2994c0 interfaceC2994c0, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatParser, interfaceC2994c0);
    }

    @Override // pg3.AbstractC29185f
    public final InterfaceC29187g get(Type returnType, Annotation[] annotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(returnType, "returnType");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        if (!AbstractC22676k.m65745e(AbstractC29184e1.m88687i(returnType), RetrofitCall.class)) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo>");
        }
        Type typeM88686h = AbstractC29184e1.m88686h(0, (ParameterizedType) returnType);
        AbstractC22676k.m65749i(typeM88686h, "getParameterUpperBound(...)");
        return new RetrofitCallAdapter(typeM88686h, this.chatParser, this.coroutineScope);
    }

    private RetrofitCallAdapterFactory(ChatParser chatParser, InterfaceC2994c0 interfaceC2994c0) {
        this.chatParser = chatParser;
        this.coroutineScope = interfaceC2994c0;
    }
}
