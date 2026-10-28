package io.getstream.chat.android.p226ui.common.contract.internal;

import java.io.File;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0002"}, m65681d2 = {"takeIfCaptured", "Ljava/io/File;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CaptureMediaContractKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final File takeIfCaptured(File file) {
        if (file == null || !file.exists() || file.length() <= 0) {
            return null;
        }
        return file;
    }
}
