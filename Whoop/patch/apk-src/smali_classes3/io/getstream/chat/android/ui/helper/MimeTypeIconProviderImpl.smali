.class public final Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;",
        "Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;",
        "<init>",
        "()V",
        "mimeTypesToIconResMap",
        "",
        "",
        "",
        "getIconRes",
        "mimeType",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mimeTypesToIconResMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 28

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_pdf:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "application/pdf"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_csv:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "text/comma-separated-values"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_tar:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "application/tar"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_zip:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "application/zip"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_rar:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v5, Ll83/k;

    const-string v6, "application/vnd.rar"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_7z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "application/x-7z-compressed"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_doc:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "application/msword"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_docx:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v8, Ll83/k;

    const-string v9, "application/vnd.openxmlformats-officedocument.wordprocessingml.document"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_txt:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v9, Ll83/k;

    const-string v10, "text/plain"

    invoke-direct {v9, v10, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_rtf:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v10, Ll83/k;

    const-string v11, "application/rtf"

    invoke-direct {v10, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_html:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v11, Ll83/k;

    const-string v12, "text/html"

    invoke-direct {v11, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_md:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v12, Ll83/k;

    const-string v13, "text/markdown"

    invoke-direct {v12, v13, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_odt:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v13, Ll83/k;

    const-string v14, "application/vnd.oasis.opendocument.text"

    invoke-direct {v13, v14, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_xls:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v14, Ll83/k;

    const-string v15, "application/vnd.ms-excel"

    invoke-direct {v14, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_xlsx:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v15, Ll83/k;

    move-object/from16 v16, v1

    const-string v1, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    invoke-direct {v15, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_ppt:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v17, v2

    const-string v2, "application/vnd.ms-powerpoint"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_pptx:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    move-object/from16 v18, v1

    const-string v1, "application/vnd.openxmlformats-officedocument.presentationml.presentation"

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mov:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v19, v2

    const-string v2, "video/mov"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mov:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    move-object/from16 v20, v1

    const-string v1, "quicktime"

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mov:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v21, v2

    const-string v2, "video/quicktime"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mov:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    move-object/from16 v22, v1

    const-string v1, "mp4"

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mp4:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v23, v2

    const-string v2, "video/mp4"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mp3:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    move-object/from16 v24, v1

    const-string v1, "audio/mp4"

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_m4a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v25, v2

    const-string v2, "audio/m4a"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_mp3:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    move-object/from16 v26, v1

    const-string v1, "audio/mp3"

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_aac:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    move-object/from16 v27, v2

    const-string v2, "audio/aac"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v26

    move-object/from16 v26, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    move-object/from16 v25, v27

    filled-new-array/range {v1 .. v26}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;->mimeTypesToIconResMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final getIconRes(Ljava/lang/String;)I
    .locals 2

    if-nez p1, :cond_0

    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file:I

    return p1

    :cond_0
    const-string v0, "mimeType: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MimeTypeIconProvider"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;->mimeTypesToIconResMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    const-string v0, "audio"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_audio_generic:I

    return p1

    :cond_2
    const-string v0, "video"

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file_video_generic:I

    return p1

    :cond_3
    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file:I

    return p1
.end method
