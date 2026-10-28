package io.getstream.chat.android.p226ui.common.contract.internal;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p267k.AbstractC22081b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/contract/internal/SelectFilesContract;", "Lk/b;", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/ClipData;", "clipData", "parseMultipleResults", "(Landroid/content/ClipData;)Ljava/util/List;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Z)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SelectFilesContract extends AbstractC22081b {
    public static final int $stable = 8;

    private final List<Uri> parseMultipleResults(ClipData clipData) {
        if (clipData == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        int itemCount = clipData.getItemCount();
        for (int i13 = 0; i13 < itemCount; i13++) {
            arrayList.add(clipData.getItemAt(i13).getUri());
        }
        return arrayList;
    }

    @Override // p267k.AbstractC22081b
    public final /* bridge */ /* synthetic */ Intent createIntent(Context context, Object obj) {
        return createIntent(context, ((Boolean) obj).booleanValue());
    }

    public final Intent createIntent(Context context, boolean input) {
        AbstractC22676k.m65750j(context, "context");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", input);
        return intent;
    }

    @Override // p267k.AbstractC22081b
    public final List<Uri> parseResult(int resultCode, Intent intent) {
        ClipData clipData;
        ClipData clipData2 = null;
        Uri data = intent != null ? intent.getData() : null;
        if (resultCode != -1) {
            data = null;
        }
        if (data != null) {
            return AbstractC37056f.m118958J(data);
        }
        if (intent != null && (clipData = intent.getClipData()) != null && resultCode == -1) {
            clipData2 = clipData;
        }
        return parseMultipleResults(clipData2);
    }
}
