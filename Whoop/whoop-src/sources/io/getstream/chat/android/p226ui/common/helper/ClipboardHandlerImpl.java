package io.getstream.chat.android.p226ui.common.helper;

import android.content.ClipData;
import android.content.ClipboardManager;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/ClipboardHandlerImpl;", "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;", "Landroid/content/ClipboardManager;", "clipboardManager", "", "autoTranslationEnabled", "Lkotlin/Function0;", "Lio/getstream/chat/android/models/User;", "getCurrentUser", "<init>", "(Landroid/content/ClipboardManager;ZLc93/a;)V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "copyMessage", "(Lio/getstream/chat/android/models/Message;)V", "Landroid/content/ClipboardManager;", "Z", "Lc93/a;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ClipboardHandlerImpl implements ClipboardHandler {
    public static final int $stable = 8;
    private final boolean autoTranslationEnabled;
    private final ClipboardManager clipboardManager;
    private final InterfaceC4339a getCurrentUser;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.helper.ClipboardHandlerImpl$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195991 implements InterfaceC4339a {
        public static final C195991 INSTANCE = new C195991();

        @Override // c93.InterfaceC4339a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }

        @Override // c93.InterfaceC4339a
        public final Void invoke() {
            return null;
        }
    }

    public ClipboardHandlerImpl(ClipboardManager clipboardManager, boolean z4, InterfaceC4339a getCurrentUser) {
        AbstractC22676k.m65750j(clipboardManager, "clipboardManager");
        AbstractC22676k.m65750j(getCurrentUser, "getCurrentUser");
        this.clipboardManager = clipboardManager;
        this.autoTranslationEnabled = z4;
        this.getCurrentUser = getCurrentUser;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // io.getstream.chat.android.p226ui.common.helper.ClipboardHandler
    public final void copyMessage(Message message) {
        String text;
        User user;
        String language;
        AbstractC22676k.m65750j(message, "message");
        if (!this.autoTranslationEnabled || (user = (User) this.getCurrentUser.invoke()) == null || (language = user.getLanguage()) == null) {
            text = message.getText();
        } else {
            text = message.getTranslation(language);
            if (text.length() == 0) {
                text = message.getText();
            }
            if (text == null) {
                text = message.getText();
            }
        }
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("message", text));
    }

    public /* synthetic */ ClipboardHandlerImpl(ClipboardManager clipboardManager, boolean z4, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(clipboardManager, (i13 & 2) != 0 ? true : z4, (i13 & 4) != 0 ? C195991.INSTANCE : interfaceC4339a);
    }
}
