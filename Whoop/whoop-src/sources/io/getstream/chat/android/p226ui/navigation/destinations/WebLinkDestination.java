package io.getstream.chat.android.p226ui.navigation.destinations;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.utils.extensions.StringKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/navigation/destinations/WebLinkDestination;", "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;", "Landroid/content/Context;", "context", "", QueryParams.URL, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Ll83/a0;", "navigate", "()V", "Ljava/lang/String;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class WebLinkDestination extends ChatDestination {
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLinkDestination(Context context, String url) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(url, "url");
        this.url = url;
    }

    @Override // io.getstream.chat.android.p226ui.navigation.destinations.ChatDestination
    public final void navigate() {
        try {
            start(new Intent("android.intent.action.VIEW", Uri.parse(StringKt.addSchemeToUrlIfNeeded(this.url))));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getContext(), getContext().getString(C19470R.string.stream_ui_message_list_error_cannot_open_link, this.url), 1).show();
        }
    }
}
