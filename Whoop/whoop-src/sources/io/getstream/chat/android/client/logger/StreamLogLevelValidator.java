package io.getstream.chat.android.client.logger;

import b23.EnumC2341g;
import b23.InterfaceC2339e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/logger/StreamLogLevelValidator;", "Lb23/e;", "Lio/getstream/chat/android/client/logger/ChatLogLevel;", "logLevel", "<init>", "(Lio/getstream/chat/android/client/logger/ChatLogLevel;)V", "Lb23/g;", "priority", "", "tag", "", "isLoggable", "(Lb23/g;Ljava/lang/String;)Z", "Lio/getstream/chat/android/client/logger/ChatLogLevel;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamLogLevelValidator implements InterfaceC2339e {
    private final ChatLogLevel logLevel;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatLogLevel.values().length];
            try {
                iArr[ChatLogLevel.NOTHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatLogLevel.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatLogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatLogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChatLogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamLogLevelValidator(ChatLogLevel logLevel) {
        AbstractC22676k.m65750j(logLevel, "logLevel");
        this.logLevel = logLevel;
    }

    @Override // b23.InterfaceC2339e
    public final boolean isLoggable(EnumC2341g priority, String tag) {
        AbstractC22676k.m65750j(priority, "priority");
        int i13 = priority.f9267w;
        AbstractC22676k.m65750j(tag, "tag");
        int i14 = WhenMappings.$EnumSwitchMapping$0[this.logLevel.ordinal()];
        if (i14 == 1) {
            return false;
        }
        if (i14 != 2) {
            if (i14 == 3) {
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (i13 < 3) {
                    return false;
                }
            } else if (i14 == 4) {
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (i13 < 5) {
                    return false;
                }
            } else {
                if (i14 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
                if (i13 < 6) {
                    return false;
                }
            }
        }
        return true;
    }
}
