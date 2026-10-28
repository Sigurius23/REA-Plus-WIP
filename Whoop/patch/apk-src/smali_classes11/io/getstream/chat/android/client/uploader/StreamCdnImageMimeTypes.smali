.class public final Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;",
        "",
        "<init>",
        "()V",
        "SUPPORTED_IMAGE_MIME_TYPES",
        "",
        "",
        "isImageMimeTypeSupported",
        "",
        "mimeType",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;

.field private static final SUPPORTED_IMAGE_MIME_TYPES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;->INSTANCE:Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;

    const-string v9, "image/heif-sequence"

    const-string v10, "image/svg+xml"

    const-string v1, "image/bmp"

    const-string v2, "image/gif"

    const-string v3, "image/jpeg"

    const-string v4, "image/png"

    const-string v5, "image/webp"

    const-string v6, "image/heic"

    const-string v7, "image/heic-sequence"

    const-string v8, "image/heif"

    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;->SUPPORTED_IMAGE_MIME_TYPES:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final isImageMimeTypeSupported(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;->SUPPORTED_IMAGE_MIME_TYPES:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
