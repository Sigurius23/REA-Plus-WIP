package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import hc3.AbstractC17176i;
import i93.C18284j;
import java.io.File;
import java.util.Map;
import m83.C25272z;
import n23.AbstractC26202e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;
import yb0.AbstractC39383f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002WXBÿ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00109\u001a\u00020\u0003H\u0016J\f\u0010:\u001a\u00020\u0003*\u00020\u0003H\u0002J\b\u0010;\u001a\u00020<H\u0007J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0015\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u0086\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010V\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006Y"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/models/CustomObject;", "authorName", "", "authorLink", "titleLink", "thumbUrl", "imageUrl", "assetUrl", "ogUrl", "mimeType", "fileSize", "", "title", "text", "type", "image", "name", "fallback", "originalHeight", "originalWidth", "upload", "Ljava/io/File;", "uploadState", "Lio/getstream/chat/android/models/Attachment$UploadState;", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)V", "getAuthorName", "()Ljava/lang/String;", "getAuthorLink", "getTitleLink", "getThumbUrl", "getImageUrl", "getAssetUrl", "getOgUrl", "getMimeType", "getFileSize", "()I", "getTitle", "getText", "getType", "getImage", "getName", "getFallback", "getOriginalHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalWidth", "getUpload", "()Ljava/io/File;", "getUploadState", "()Lio/getstream/chat/android/models/Attachment$UploadState;", "getExtraData", "()Ljava/util/Map;", "toString", "shorten", "newBuilder", "Lio/getstream/chat/android/models/Attachment$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)Lio/getstream/chat/android/models/Attachment;", "equals", "", "other", "hashCode", "UploadState", "Builder", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Attachment implements CustomObject {
    private final String assetUrl;
    private final String authorLink;
    private final String authorName;
    private final Map<String, Object> extraData;
    private final String fallback;
    private final int fileSize;
    private final String image;
    private final String imageUrl;
    private final String mimeType;
    private final String name;
    private final String ogUrl;
    private final Integer originalHeight;
    private final Integer originalWidth;
    private final String text;
    private final String thumbUrl;
    private final String title;
    private final String titleLink;
    private final String type;
    private final File upload;
    private final UploadState uploadState;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState;", "", "<init>", "()V", "Idle", "InProgress", EnumC39339b.RESULT_SUCCESS, EnumC39339b.RESULT_FAILURE, "Lio/getstream/chat/android/models/Attachment$UploadState$Failed;", "Lio/getstream/chat/android/models/Attachment$UploadState$Idle;", "Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;", "Lio/getstream/chat/android/models/Attachment$UploadState$Success;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class UploadState {

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$Failed;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "Ln23/e;", "error", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/models/Attachment$UploadState$Failed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getError", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Failed extends UploadState {
            private final AbstractC26202e error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(AbstractC26202e error) {
                super(null);
                AbstractC22676k.m65750j(error, "error");
                this.error = error;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = failed.error;
                }
                return failed.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getError() {
                return this.error;
            }

            public final Failed copy(AbstractC26202e error) {
                AbstractC22676k.m65750j(error, "error");
                return new Failed(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failed) && AbstractC22676k.m65745e(this.error, ((Failed) other).error);
            }

            public final AbstractC26202e getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return AbstractC17176i.m48503e("Failed(error=", this.error, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$Idle;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "<init>", "()V", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Idle extends UploadState {
            public static final Idle INSTANCE = new Idle();

            private Idle() {
                super(null);
            }

            public String toString() {
                return "Idle";
            }
        }

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "bytesUploaded", "", "totalBytes", "<init>", "(JJ)V", "getBytesUploaded", "()J", "getTotalBytes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class InProgress extends UploadState {
            private final long bytesUploaded;
            private final long totalBytes;

            public InProgress(long j7, long j13) {
                super(null);
                this.bytesUploaded = j7;
                this.totalBytes = j13;
            }

            public static /* synthetic */ InProgress copy$default(InProgress inProgress, long j7, long j13, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    j7 = inProgress.bytesUploaded;
                }
                if ((i13 & 2) != 0) {
                    j13 = inProgress.totalBytes;
                }
                return inProgress.copy(j7, j13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getBytesUploaded() {
                return this.bytesUploaded;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final long getTotalBytes() {
                return this.totalBytes;
            }

            public final InProgress copy(long bytesUploaded, long totalBytes) {
                return new InProgress(bytesUploaded, totalBytes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InProgress)) {
                    return false;
                }
                InProgress inProgress = (InProgress) other;
                return this.bytesUploaded == inProgress.bytesUploaded && this.totalBytes == inProgress.totalBytes;
            }

            public final long getBytesUploaded() {
                return this.bytesUploaded;
            }

            public final long getTotalBytes() {
                return this.totalBytes;
            }

            public int hashCode() {
                return Long.hashCode(this.totalBytes) + (Long.hashCode(this.bytesUploaded) * 31);
            }

            public String toString() {
                return AbstractC11266d.m30457k(this.totalBytes, ")", AbstractC39383f.m125596b(this.bytesUploaded, "InProgress(bytesUploaded=", ", totalBytes="));
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$Success;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "<init>", "()V", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class Success extends UploadState {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public String toString() {
                return EnumC39339b.RESULT_SUCCESS;
            }
        }

        public /* synthetic */ UploadState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UploadState() {
        }
    }

    public Attachment() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Integer num2, File file, UploadState uploadState, Map map, int i14, Object obj) {
        Map map2;
        UploadState uploadState2;
        String str15 = (i14 & 1) != 0 ? attachment.authorName : str;
        String str16 = (i14 & 2) != 0 ? attachment.authorLink : str2;
        String str17 = (i14 & 4) != 0 ? attachment.titleLink : str3;
        String str18 = (i14 & 8) != 0 ? attachment.thumbUrl : str4;
        String str19 = (i14 & 16) != 0 ? attachment.imageUrl : str5;
        String str20 = (i14 & 32) != 0 ? attachment.assetUrl : str6;
        String str21 = (i14 & 64) != 0 ? attachment.ogUrl : str7;
        String str22 = (i14 & 128) != 0 ? attachment.mimeType : str8;
        int i15 = (i14 & 256) != 0 ? attachment.fileSize : i13;
        String str23 = (i14 & 512) != 0 ? attachment.title : str9;
        String str24 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? attachment.text : str10;
        String str25 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? attachment.type : str11;
        String str26 = (i14 & 4096) != 0 ? attachment.image : str12;
        String str27 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? attachment.name : str13;
        String str28 = str15;
        String str29 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? attachment.fallback : str14;
        Integer num3 = (i14 & 32768) != 0 ? attachment.originalHeight : num;
        Integer num4 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? attachment.originalWidth : num2;
        File file2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? attachment.upload : file;
        UploadState uploadState3 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? attachment.uploadState : uploadState;
        if ((i14 & 524288) != 0) {
            uploadState2 = uploadState3;
            map2 = attachment.extraData;
        } else {
            map2 = map;
            uploadState2 = uploadState3;
        }
        return attachment.copy(str28, str16, str17, str18, str19, str20, str21, str22, i15, str23, str24, str25, str26, str27, str29, num3, num4, file2, uploadState2, map2);
    }

    private final String shorten(String str) {
        return str.length() <= 9 ? str : AbstractC39414r.m125857C0(str, new C18284j(0, 9, 1)).concat("...");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final File getUpload() {
        return this.upload;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final UploadState getUploadState() {
        return this.uploadState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final Map<String, Object> component20() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleLink() {
        return this.titleLink;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOgUrl() {
        return this.ogUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    public final Attachment copy(String authorName, String authorLink, String titleLink, String thumbUrl, String imageUrl, String assetUrl, String ogUrl, String mimeType, int fileSize, String title, String text, String type, String image, String name, String fallback, Integer originalHeight, Integer originalWidth, File upload, UploadState uploadState, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        return new Attachment(authorName, authorLink, titleLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, originalHeight, originalWidth, upload, uploadState, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) other;
        return AbstractC22676k.m65745e(this.authorName, attachment.authorName) && AbstractC22676k.m65745e(this.authorLink, attachment.authorLink) && AbstractC22676k.m65745e(this.titleLink, attachment.titleLink) && AbstractC22676k.m65745e(this.thumbUrl, attachment.thumbUrl) && AbstractC22676k.m65745e(this.imageUrl, attachment.imageUrl) && AbstractC22676k.m65745e(this.assetUrl, attachment.assetUrl) && AbstractC22676k.m65745e(this.ogUrl, attachment.ogUrl) && AbstractC22676k.m65745e(this.mimeType, attachment.mimeType) && this.fileSize == attachment.fileSize && AbstractC22676k.m65745e(this.title, attachment.title) && AbstractC22676k.m65745e(this.text, attachment.text) && AbstractC22676k.m65745e(this.type, attachment.type) && AbstractC22676k.m65745e(this.image, attachment.image) && AbstractC22676k.m65745e(this.name, attachment.name) && AbstractC22676k.m65745e(this.fallback, attachment.fallback) && AbstractC22676k.m65745e(this.originalHeight, attachment.originalHeight) && AbstractC22676k.m65745e(this.originalWidth, attachment.originalWidth) && AbstractC22676k.m65745e(this.upload, attachment.upload) && AbstractC22676k.m65745e(this.uploadState, attachment.uploadState) && AbstractC22676k.m65745e(this.extraData, attachment.extraData);
    }

    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOgUrl() {
        return this.ogUrl;
    }

    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleLink() {
        return this.titleLink;
    }

    public final String getType() {
        return this.type;
    }

    public final File getUpload() {
        return this.upload;
    }

    public final UploadState getUploadState() {
        return this.uploadState;
    }

    public int hashCode() {
        String str = this.authorName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authorLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumbUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.assetUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ogUrl;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mimeType;
        int iM30448b = AbstractC11266d.m30448b(this.fileSize, (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31);
        String str9 = this.title;
        int iHashCode8 = (iM30448b + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.text;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.image;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.name;
        int iHashCode12 = (iHashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fallback;
        int iHashCode13 = (iHashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.originalHeight;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.originalWidth;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        File file = this.upload;
        int iHashCode16 = (iHashCode15 + (file == null ? 0 : file.hashCode())) * 31;
        UploadState uploadState = this.uploadState;
        return this.extraData.hashCode() + ((iHashCode16 + (uploadState != null ? uploadState.hashCode() : 0)) * 31);
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Attachment(mimeType=\"");
        sb4.append(this.mimeType);
        sb4.append("\"");
        if (this.authorName != null) {
            sb4.append(", authorName=");
            sb4.append(this.authorName);
        }
        if (this.authorLink != null) {
            sb4.append(", authorLink=");
            sb4.append(this.authorLink);
        }
        if (this.titleLink != null) {
            sb4.append(", titleLink=");
            sb4.append(this.titleLink);
        }
        if (this.thumbUrl != null) {
            sb4.append(", thumbUrl=");
            sb4.append(shorten(this.thumbUrl));
        }
        if (this.imageUrl != null) {
            sb4.append(", imageUrl=");
            sb4.append(shorten(this.imageUrl));
        }
        if (this.assetUrl != null) {
            sb4.append(", assetUrl=");
            sb4.append(shorten(this.assetUrl));
        }
        if (this.ogUrl != null) {
            sb4.append(", ogUrl=");
            sb4.append(this.ogUrl.hashCode());
        }
        if (this.fileSize > 0) {
            sb4.append(", fileSize=");
            sb4.append(this.fileSize);
        }
        if (this.title != null) {
            sb4.append(", title=\"");
            sb4.append(this.title);
            sb4.append("\"");
        }
        if (this.text != null) {
            sb4.append(", text=\"");
            sb4.append(this.text);
            sb4.append("\"");
        }
        if (this.type != null) {
            sb4.append(", type=\"");
            sb4.append(this.type);
            sb4.append("\"");
        }
        if (this.image != null) {
            sb4.append(", image=");
            sb4.append(this.image);
        }
        if (this.name != null) {
            sb4.append(", name=");
            sb4.append(this.name);
        }
        if (this.fallback != null) {
            sb4.append(", fallback=");
            sb4.append(this.fallback);
        }
        if (this.originalHeight != null) {
            sb4.append(", origH=");
            sb4.append(this.originalHeight.intValue());
        }
        if (this.originalWidth != null) {
            sb4.append(", origW=");
            sb4.append(this.originalWidth.intValue());
        }
        if (this.upload != null) {
            sb4.append(", upload=\"");
            sb4.append(this.upload);
            sb4.append("\"");
        }
        if (this.uploadState != null) {
            sb4.append(", uploadState=");
            sb4.append(this.uploadState);
        }
        if (!getExtraData().isEmpty()) {
            sb4.append(", extraData=");
            sb4.append(getExtraData());
        }
        sb4.append(")");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0015\u00100\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00101J\u0010\u00103\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u00104\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001a\u00105\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010 J\u0006\u00106\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, m65681d2 = {"Lio/getstream/chat/android/models/Attachment$Builder;", "", "<init>", "()V", "attachment", "Lio/getstream/chat/android/models/Attachment;", "(Lio/getstream/chat/android/models/Attachment;)V", "authorName", "", "authorLink", "titleLink", "thumbUrl", "imageUrl", "assetUrl", "ogUrl", "mimeType", "fileSize", "", "title", "text", "type", "image", "name", "fallback", "originalHeight", "Ljava/lang/Integer;", "originalWidth", "upload", "Ljava/io/File;", "uploadState", "Lio/getstream/chat/android/models/Attachment$UploadState;", "extraData", "", "withAuthorName", "withAuthorLink", "withTitleLink", "withThumbUrl", "withImageUrl", "withAssetUrl", "withOgUrl", "withMimeType", "withFileSize", "withTitle", "withText", "withType", "withImage", "withName", "withFallback", "withOriginalHeight", "(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Attachment$Builder;", "withOriginalWidth", "withUpload", "withUploadState", "withExtraData", "build", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private String assetUrl;
        private String authorLink;
        private String authorName;
        private Map<String, ? extends Object> extraData;
        private String fallback;
        private int fileSize;
        private String image;
        private String imageUrl;
        private String mimeType;
        private String name;
        private String ogUrl;
        private Integer originalHeight;
        private Integer originalWidth;
        private String text;
        private String thumbUrl;
        private String title;
        private String titleLink;
        private String type;
        private File upload;
        private UploadState uploadState;

        public Builder() {
            this.extraData = C25272z.f99163w;
        }

        public final Attachment build() {
            return new Attachment(this.authorName, this.authorLink, this.titleLink, this.thumbUrl, this.imageUrl, this.assetUrl, this.ogUrl, this.mimeType, this.fileSize, this.title, this.text, this.type, this.image, this.name, this.fallback, this.originalHeight, this.originalWidth, this.upload, this.uploadState, this.extraData);
        }

        public final Builder withAssetUrl(String assetUrl) {
            this.assetUrl = assetUrl;
            return this;
        }

        public final Builder withAuthorLink(String authorLink) {
            this.authorLink = authorLink;
            return this;
        }

        public final Builder withAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            AbstractC22676k.m65750j(extraData, "extraData");
            this.extraData = extraData;
            return this;
        }

        public final Builder withFallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public final Builder withFileSize(int fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public final Builder withImage(String image) {
            this.image = image;
            return this;
        }

        public final Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public final Builder withMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public final Builder withName(String name) {
            this.name = name;
            return this;
        }

        public final Builder withOgUrl(String ogUrl) {
            this.ogUrl = ogUrl;
            return this;
        }

        public final Builder withOriginalHeight(Integer originalHeight) {
            this.originalHeight = originalHeight;
            return this;
        }

        public final Builder withOriginalWidth(Integer originalWidth) {
            this.originalWidth = originalWidth;
            return this;
        }

        public final Builder withText(String text) {
            this.text = text;
            return this;
        }

        public final Builder withThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public final Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public final Builder withTitleLink(String titleLink) {
            this.titleLink = titleLink;
            return this;
        }

        public final Builder withType(String type) {
            this.type = type;
            return this;
        }

        public final Builder withUpload(File upload) {
            this.upload = upload;
            return this;
        }

        public final Builder withUploadState(UploadState uploadState) {
            this.uploadState = uploadState;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Attachment attachment) {
            this();
            AbstractC22676k.m65750j(attachment, "attachment");
            this.authorName = attachment.getAuthorName();
            this.authorLink = attachment.getAuthorLink();
            this.titleLink = attachment.getTitleLink();
            this.thumbUrl = attachment.getThumbUrl();
            this.imageUrl = attachment.getImageUrl();
            this.assetUrl = attachment.getAssetUrl();
            this.ogUrl = attachment.getOgUrl();
            this.mimeType = attachment.getMimeType();
            this.fileSize = attachment.getFileSize();
            this.title = attachment.getTitle();
            this.text = attachment.getText();
            this.type = attachment.getType();
            this.image = attachment.getImage();
            this.name = attachment.getName();
            this.fallback = attachment.getFallback();
            this.originalHeight = attachment.getOriginalHeight();
            this.originalWidth = attachment.getOriginalWidth();
            this.upload = attachment.getUpload();
            this.uploadState = attachment.getUploadState();
            this.extraData = attachment.getExtraData();
        }
    }

    public Attachment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Integer num2, File file, UploadState uploadState, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(extraData, "extraData");
        this.authorName = str;
        this.authorLink = str2;
        this.titleLink = str3;
        this.thumbUrl = str4;
        this.imageUrl = str5;
        this.assetUrl = str6;
        this.ogUrl = str7;
        this.mimeType = str8;
        this.fileSize = i13;
        this.title = str9;
        this.text = str10;
        this.type = str11;
        this.image = str12;
        this.name = str13;
        this.fallback = str14;
        this.originalHeight = num;
        this.originalWidth = num2;
        this.upload = file;
        this.uploadState = uploadState;
        this.extraData = extraData;
    }

    public /* synthetic */ Attachment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Integer num2, File file, UploadState uploadState, Map map, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? 0 : i13, (i14 & 512) != 0 ? null : str9, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str10, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str11, (i14 & 4096) != 0 ? null : str12, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str13, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str14, (i14 & 32768) != 0 ? null : num, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : num2, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : file, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : uploadState, (i14 & 524288) != 0 ? C25272z.f99163w : map);
    }
}
