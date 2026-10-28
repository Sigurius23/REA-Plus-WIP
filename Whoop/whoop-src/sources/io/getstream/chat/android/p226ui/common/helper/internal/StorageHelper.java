package io.getstream.chat.android.p226ui.common.helper.internal;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import va3.AbstractC35854l;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010!J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0013H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "selection", "", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "getFilteredAttachments", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "Landroid/database/Cursor;", "cursor", "getAttachmentFromCursor", "(Landroid/database/Cursor;)Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "mimeType", "", "id", "Landroid/net/Uri;", "getContentUri", "(Ljava/lang/String;J)Landroid/net/Uri;", "getModelType", "(Ljava/lang/String;)Ljava/lang/String;", "", "isImage", "(Ljava/lang/String;)Z", "isVideo", "attachmentMetaData", "Ljava/io/File;", "getCachedFileFromUri", "(Landroid/content/Context;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/io/File;", "getFileAttachments", "(Landroid/content/Context;)Ljava/util/List;", "getMediaAttachments", "uriList", "getAttachmentsFromUriList", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "uri", "isUriResolvable$stream_chat_android_ui_common_release", "(Landroid/content/Context;Landroid/net/Uri;)Z", "isUriResolvable", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "fileManager", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StorageHelper {
    public static final int $stable = 8;
    public static final String FILE_NAME_PREFIX = "STREAM_";
    private static final int MILISECOND_IN_A_SECOND = 1000;
    public static final String TIME_FORMAT = "HHmmssSSS";
    private final StreamFileManager fileManager = new StreamFileManager();

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:StorageHelper");

    private final AttachmentMetaData getAttachmentFromCursor(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("_display_name");
        int columnIndex2 = cursor.getColumnIndex("_size");
        int columnIndex3 = cursor.getColumnIndex("mime_type");
        int columnIndex4 = cursor.getColumnIndex(AttachmentExtensionsKt.EXTRA_DURATION);
        long j7 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = null;
        String string2 = (columnIndex == -1 || cursor.isNull(columnIndex)) ? null : cursor.getString(columnIndex);
        long j13 = 0;
        long j14 = (columnIndex2 == -1 || cursor.isNull(columnIndex2)) ? 0L : cursor.getLong(columnIndex2);
        if (columnIndex3 != -1 && !cursor.isNull(columnIndex3)) {
            string = cursor.getString(columnIndex3);
        }
        if (columnIndex4 != -1 && !cursor.isNull(columnIndex4)) {
            j13 = cursor.getLong(columnIndex4);
        }
        AttachmentMetaData attachmentMetaData = new AttachmentMetaData(getContentUri(string, j7), null, string, null, null, null, 58, null);
        attachmentMetaData.setType(getModelType(string));
        attachmentMetaData.setSize(j14);
        attachmentMetaData.setTitle(string2);
        attachmentMetaData.setVideoLength(j13 / ((long) 1000));
        return attachmentMetaData;
    }

    private final Uri getContentUri(String mimeType, long id4) {
        Uri EXTERNAL_CONTENT_URI;
        if (isImage(mimeType)) {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            AbstractC22676k.m65749i(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        } else if (isVideo(mimeType)) {
            EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            AbstractC22676k.m65749i(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        } else {
            EXTERNAL_CONTENT_URI = MediaStore.Files.getContentUri("external");
            AbstractC22676k.m65749i(EXTERNAL_CONTENT_URI, "getContentUri(...)");
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(EXTERNAL_CONTENT_URI, id4);
        AbstractC22676k.m65749i(uriWithAppendedId, "withAppendedId(...)");
        return uriWithAppendedId;
    }

    private final List<AttachmentMetaData> getFilteredAttachments(Context context, String selection) throws IOException {
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id", "_display_name", "mime_type", "_size", AttachmentExtensionsKt.EXTRA_DURATION}, selection, null, "date_added DESC");
        if (cursorQuery == null) {
            return C25271y.f99162w;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                arrayList.add(getAttachmentFromCursor(cursorQuery));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(cursorQuery, th3);
                throw th4;
            }
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final String getModelType(String mimeType) {
        if (isImage(mimeType)) {
            return "image";
        }
        return isVideo(mimeType) ? "video" : "file";
    }

    private final boolean isImage(String mimeType) {
        if (mimeType != null) {
            return AbstractC39421y.m125930O(mimeType, "image", false);
        }
        return false;
    }

    private final boolean isVideo(String mimeType) {
        if (mimeType != null) {
            return AbstractC39421y.m125930O(mimeType, "video", false);
        }
        return false;
    }

    public final List<AttachmentMetaData> getAttachmentsFromUriList(Context context, List<? extends Uri> uriList) throws IOException {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(uriList, "uriList");
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uriList) {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name", "mime_type", "_size", AttachmentExtensionsKt.EXTRA_DURATION}, null, null, null);
            AttachmentMetaData attachmentMetaData = null;
            attachmentMetaData = null;
            string = null;
            String string = null;
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        int columnIndex2 = cursorQuery.getColumnIndex("_size");
                        int columnIndex3 = cursorQuery.getColumnIndex("mime_type");
                        int columnIndex4 = cursorQuery.getColumnIndex(AttachmentExtensionsKt.EXTRA_DURATION);
                        if (columnIndex != -1 && !cursorQuery.isNull(columnIndex)) {
                            string = cursorQuery.getString(columnIndex);
                        }
                        long j7 = 0;
                        long j13 = (columnIndex2 == -1 || cursorQuery.isNull(columnIndex2)) ? 0L : cursorQuery.getLong(columnIndex2);
                        String type = (columnIndex3 == -1 || cursorQuery.isNull(columnIndex3)) ? context.getContentResolver().getType(uri) : cursorQuery.getString(columnIndex3);
                        if (columnIndex4 != -1 && !cursorQuery.isNull(columnIndex4)) {
                            j7 = cursorQuery.getLong(columnIndex4);
                        }
                        long j14 = j7;
                        try {
                            attachmentMetaData = new AttachmentMetaData(uri, getModelType(type), type, string, null, null, 48, null);
                            attachmentMetaData.setSize(j13);
                            attachmentMetaData.setVideoLength(j14 / ((long) 1000));
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable th4 = th;
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                AbstractC35854l.m113829i(cursorQuery, th4);
                                throw th5;
                            }
                        }
                    }
                    cursorQuery.close();
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            if (attachmentMetaData != null) {
                arrayList.add(attachmentMetaData);
            }
        }
        return arrayList;
    }

    public final File getCachedFileFromUri(Context context, AttachmentMetaData attachmentMetaData) {
        InputStream inputStreamOpenInputStream;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attachmentMetaData, "attachmentMetaData");
        if (attachmentMetaData.getFile() != null || attachmentMetaData.getUri() != null) {
            File file = attachmentMetaData.getFile();
            if (file != null) {
                return file;
            }
            Uri uri = attachmentMetaData.getUri();
            if (uri != null) {
                String titleWithExtension = StorageHelperKt.getTitleWithExtension(attachmentMetaData);
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                } catch (Exception e5) {
                    C2345k logger = getLogger();
                    InterfaceC2339e interfaceC2339e = logger.f9275c;
                    String str = logger.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95637m(uri, "[getCachedFileFromUri] Failed to open input stream for URI: "), e5);
                    }
                    inputStreamOpenInputStream = null;
                }
                if (inputStreamOpenInputStream != null) {
                    return (File) this.fileManager.writeFileInTimestampedCache(context, titleWithExtension, inputStreamOpenInputStream).m77816b();
                }
            }
        }
        return null;
    }

    public final List<AttachmentMetaData> getFileAttachments(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return getFilteredAttachments(context, "mime_type IS NOT NULL AND mime_type != ''");
    }

    public final List<AttachmentMetaData> getMediaAttachments(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return getFilteredAttachments(context, "media_type=1 OR media_type=3");
    }

    public final boolean isUriResolvable$stream_chat_android_ui_common_release(Context context, Uri uri) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(uri, "uri");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
