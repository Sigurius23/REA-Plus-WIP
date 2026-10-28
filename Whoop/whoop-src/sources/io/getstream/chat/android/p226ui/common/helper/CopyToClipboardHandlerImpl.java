package io.getstream.chat.android.p226ui.common.helper;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import c93.InterfaceC4339a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandlerImpl;", "Lio/getstream/chat/android/ui/common/helper/CopyToClipboardHandler;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Landroid/content/ClipboardManager;", "clipboardManagerProvider", "<init>", "(Landroid/content/Context;Lc93/a;)V", "", "text", "Ll83/a0;", "copy", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Lc93/a;", "getClipboardManager", "()Landroid/content/ClipboardManager;", "clipboardManager", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CopyToClipboardHandlerImpl implements CopyToClipboardHandler {
    public static final int $stable = 8;
    private final InterfaceC4339a clipboardManagerProvider;
    private final Context context;

    public CopyToClipboardHandlerImpl(Context context, InterfaceC4339a clipboardManagerProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(clipboardManagerProvider, "clipboardManagerProvider");
        this.context = context;
        this.clipboardManagerProvider = clipboardManagerProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClipboardManager _init_$lambda$0(Context context) {
        Object systemService = AbstractC32122c.getSystemService(context, ClipboardManager.class);
        if (systemService != null) {
            return (ClipboardManager) systemService;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final ClipboardManager getClipboardManager() {
        return (ClipboardManager) this.clipboardManagerProvider.invoke();
    }

    @Override // io.getstream.chat.android.p226ui.common.helper.CopyToClipboardHandler
    public final void copy(String text) {
        AbstractC22676k.m65750j(text, "text");
        getClipboardManager().setPrimaryClip(ClipData.newPlainText("plain text", text));
    }

    public /* synthetic */ CopyToClipboardHandlerImpl(Context context, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? new C19601b(context, 1) : interfaceC4339a);
    }
}
