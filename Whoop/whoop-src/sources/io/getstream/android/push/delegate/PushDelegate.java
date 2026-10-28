package io.getstream.android.push.delegate;

import java.util.Map;
import p715kotlin.Metadata;
import y03.AbstractC39026a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\t\u001a\u00020\b2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/push/delegate/PushDelegate;", "", "<init>", "()V", "", "", "metadata", "payload", "", "handlePushMessage", "(Ljava/util/Map;Ljava/util/Map;)Z", "Ly03/a;", "pushDevice", "Ll83/a0;", "registerPushDevice", "(Ly03/a;)V", "stream-android-push-delegate_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class PushDelegate {
    public abstract boolean handlePushMessage(Map<String, ? extends Object> metadata, Map<String, ? extends Object> payload);

    public abstract void registerPushDevice(AbstractC39026a pushDevice);
}
