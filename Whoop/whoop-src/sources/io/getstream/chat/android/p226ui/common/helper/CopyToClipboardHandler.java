package io.getstream.chat.android.p226ui.common.helper;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandler;", "", "", "text", "Ll83/a0;", "copy", "(Ljava/lang/String;)V", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface CopyToClipboardHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandler$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandler;", "context", "Landroid/content/Context;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CopyToClipboardHandler invoke(Context context) {
            AbstractC22676k.m65750j(context, "context");
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            return new CopyToClipboardHandlerImpl(applicationContext, null, 2, null);
        }
    }

    void copy(String text);
}
