package io.getstream.chat.android.client.notifications;

import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.PushProvider;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y03.AbstractC39026a;
import y03.EnumC39027b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b*\f\b\u0002\u0010\t\"\u00020\u00052\u00020\u0005¨\u0006\n"}, m65681d2 = {"Ly03/a;", "Lio/getstream/chat/android/models/Device;", "toDevice", "(Ly03/a;)Lio/getstream/chat/android/models/Device;", "Ly03/b;", "Lio/getstream/chat/android/models/PushProvider;", "Lio/getstream/chat/android/client/notifications/DevicePushProvider;", "toDevicePushProvider", "(Ly03/b;)Lio/getstream/chat/android/models/PushProvider;", "DevicePushProvider", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatPushDelegateKt {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC39027b.values().length];
            try {
                EnumC39027b[] enumC39027bArr = EnumC39027b.f167982w;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC39027b[] enumC39027bArr2 = EnumC39027b.f167982w;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC39027b[] enumC39027bArr3 = EnumC39027b.f167982w;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC39027b[] enumC39027bArr4 = EnumC39027b.f167982w;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Device toDevice(AbstractC39026a abstractC39026a) {
        AbstractC22676k.m65750j(abstractC39026a, "<this>");
        throw null;
    }

    private static final PushProvider toDevicePushProvider(EnumC39027b enumC39027b) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[enumC39027b.ordinal()];
        if (i13 == 1) {
            return PushProvider.FIREBASE;
        }
        if (i13 == 2) {
            return PushProvider.HUAWEI;
        }
        if (i13 == 3) {
            return PushProvider.XIAOMI;
        }
        if (i13 == 4) {
            return PushProvider.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
