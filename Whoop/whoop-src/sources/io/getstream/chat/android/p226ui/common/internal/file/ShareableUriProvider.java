package io.getstream.chat.android.p226ui.common.internal.file;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import androidx.core.content.FileProvider;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.StreamFileProvider;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;", "", "<init>", "()V", "getUriForFile", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "getFileProviderAuthority", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ShareableUriProvider {
    public static final int $stable = 0;

    private final String getFileProviderAuthority(Context context) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, StreamFileProvider.class.getName()), 0);
        AbstractC22676k.m65749i(providerInfo, "getProviderInfo(...)");
        String authority = providerInfo.authority;
        AbstractC22676k.m65749i(authority, "authority");
        return authority;
    }

    public final Uri getUriForFile(Context context, File file) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(file, "file");
        Uri uriForFile = FileProvider.getUriForFile(context, getFileProviderAuthority(context), file);
        AbstractC22676k.m65749i(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }
}
