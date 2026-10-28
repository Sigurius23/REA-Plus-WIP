package io.getstream.chat.android.p226ui.navigation.destinations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll83/a0;", "navigate", "()V", "Landroid/content/Intent;", "intent", "start", "(Landroid/content/Intent;)V", "", "requestCode", "startForResult", "(Landroid/content/Intent;I)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChatDestination {
    private final Context context;

    public ChatDestination(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract void navigate();

    public final void start(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        this.context.startActivity(intent);
    }

    public final void startForResult(Intent intent, int requestCode) {
        AbstractC22676k.m65750j(intent, "intent");
        Context context = this.context;
        if (!(context instanceof Activity)) {
            throw new IllegalStateException("startForResult can only be used if your destination uses an Activity as its Context");
        }
        ((Activity) context).startActivityForResult(intent, requestCode);
    }
}
