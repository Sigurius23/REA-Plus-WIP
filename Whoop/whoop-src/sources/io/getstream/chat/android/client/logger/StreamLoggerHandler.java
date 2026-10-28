package io.getstream.chat.android.client.logger;

import b23.EnumC2341g;
import b23.InterfaceC2344j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/logger/StreamLoggerHandler;", "Lb23/j;", "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "handler", "<init>", "(Lio/getstream/chat/android/client/logger/ChatLoggerHandler;)V", "Lb23/g;", "priority", "", "tag", "message", "", "throwable", "Ll83/a0;", "log", "(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lio/getstream/chat/android/client/logger/ChatLoggerHandler;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamLoggerHandler implements InterfaceC2344j {
    private final ChatLoggerHandler handler;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2341g.values().length];
            try {
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC2341g enumC2341g4 = EnumC2341g.VERBOSE;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC2341g enumC2341g5 = EnumC2341g.VERBOSE;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EnumC2341g enumC2341g6 = EnumC2341g.VERBOSE;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamLoggerHandler(ChatLoggerHandler chatLoggerHandler) {
        this.handler = chatLoggerHandler;
    }

    @Override // b23.InterfaceC2344j
    public final void log(EnumC2341g priority, String tag, String message, Throwable throwable) {
        AbstractC22676k.m65750j(priority, "priority");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        ChatLoggerHandler chatLoggerHandler = this.handler;
        if (chatLoggerHandler != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[priority.ordinal()]) {
                case 1:
                    chatLoggerHandler.logV(tag, message);
                    return;
                case 2:
                    chatLoggerHandler.logD(tag, message);
                    return;
                case 3:
                    chatLoggerHandler.logI(tag, message);
                    return;
                case 4:
                    chatLoggerHandler.logW(tag, message);
                    return;
                case 5:
                case 6:
                    if (throwable == null) {
                        chatLoggerHandler.logE(tag, message);
                        return;
                    } else {
                        chatLoggerHandler.logE(tag, message, throwable);
                        return;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
