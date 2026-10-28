package io.getstream.chat.android.p226ui.common.permissions;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p267k.C22082c;
import p267k.C22083d;
import p267k.C22084e;
import p267k.InterfaceC22085f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "Lk/f;", "toContractVisualMediaType", "(Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;)Lk/f;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class VisualMediaTypeKt {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisualMediaType.values().length];
            try {
                iArr[VisualMediaType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisualMediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisualMediaType.IMAGE_AND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InternalStreamChatApi
    public static final InterfaceC22085f toContractVisualMediaType(VisualMediaType visualMediaType) {
        AbstractC22676k.m65750j(visualMediaType, "<this>");
        int i13 = WhenMappings.$EnumSwitchMapping$0[visualMediaType.ordinal()];
        if (i13 == 1) {
            return C22083d.f85640a;
        }
        if (i13 == 2) {
            return C22084e.f85641a;
        }
        if (i13 == 3) {
            return C22082c.f85639a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
