package io.getstream.chat.android.client.helpers;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import hn.C17508p;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.models.App;
import io.getstream.chat.android.models.AppSettings;
import io.getstream.chat.android.models.FileUploadConfig;
import m83.C25271y;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import se.AbstractC32417h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/helpers/AppSettingManager;", "", "Lio/getstream/chat/android/client/api/ChatApi;", "chatApi", "<init>", "(Lio/getstream/chat/android/client/api/ChatApi;)V", "Ll83/a0;", "loadAppSettings", "()V", "Lio/getstream/chat/android/models/AppSettings;", "getAppSettings", "()Lio/getstream/chat/android/models/AppSettings;", "clear", "Lio/getstream/chat/android/client/api/ChatApi;", "appSettings", "Lio/getstream/chat/android/models/AppSettings;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AppSettingManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String TAG = "Chat:AppSettingManager";
    private AppSettings appSettings;
    private final ChatApi chatApi;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/helpers/AppSettingManager$Companion;", "", "<init>", "()V", "TAG", "", "createDefaultAppSettings", "Lio/getstream/chat/android/models/AppSettings;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AppSettings createDefaultAppSettings() {
            C25271y c25271y = C25271y.f99162w;
            return new AppSettings(new App("", new FileUploadConfig(c25271y, c25271y, c25271y, c25271y, AppSettings.DEFAULT_SIZE_LIMIT_IN_BYTES), new FileUploadConfig(c25271y, c25271y, c25271y, c25271y, AppSettings.DEFAULT_SIZE_LIMIT_IN_BYTES)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AppSettingManager(ChatApi chatApi) {
        AbstractC22676k.m65750j(chatApi, "chatApi");
        this.chatApi = chatApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAppSettings$lambda$2(AppSettingManager appSettingManager, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            appSettingManager.appSettings = (AppSettings) ((C26204g) result).m77814e();
            return;
        }
        if (result instanceof C26203f) {
            C26203f c26203f = (C26203f) result;
            Throwable thM101171B = AbstractC32417h.m101171B(c26203f.m77813e());
            if (thM101171B == null) {
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
                    C2343i.f9271c.log(enumC2341g, TAG, "[loadAppSettings] failed: " + c26203f.m77813e(), null);
                    return;
                }
                return;
            }
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, TAG)) {
                C2343i.f9271c.log(enumC2341g2, TAG, "[loadAppSettings] failed: " + c26203f.m77813e(), thM101171B);
            }
        }
    }

    public final void clear() {
        this.appSettings = null;
    }

    public final AppSettings getAppSettings() {
        AppSettings appSettings = this.appSettings;
        return appSettings == null ? INSTANCE.createDefaultAppSettings() : appSettings;
    }

    public final void loadAppSettings() {
        if (this.appSettings == null) {
            this.chatApi.appSettings().enqueue(new C17508p(this, 3));
        }
    }
}
