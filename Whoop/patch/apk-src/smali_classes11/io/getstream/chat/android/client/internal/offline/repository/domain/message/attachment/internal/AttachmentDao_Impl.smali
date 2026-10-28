.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "",
        "messageId",
        "Lec3/l;",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;",
        "observeAttachmentsForMessage",
        "(Ljava/lang/String;)Lec3/l;",
        "Ll83/a0;",
        "deleteAll",
        "()V",
        "Landroidx/room/z0;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "__extraDataConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl$Companion;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->__db:Landroidx/room/z0;

    return-void
.end method

.method public static synthetic a(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM attachment_inner_entity"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->deleteAll$lambda$1(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;Ltb/a;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "SELECT * FROM attachment_inner_entity WHERE messageId == ?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->observeAttachmentsForMessage$lambda$0(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    return-object p0
.end method

.method private static final deleteAll$lambda$1(Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final observeAttachmentsForMessage$lambda$0(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 48

    move-object/from16 v0, p3

    const-string v1, "_connection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move-object/from16 v2, p1

    :try_start_0
    invoke-interface {v1, v0, v2}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v0, "id"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "messageId"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "authorName"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "titleLink"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "authorLink"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "thumbUrl"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "imageUrl"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "assetUrl"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "ogUrl"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "mimeType"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "fileSize"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "title"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "text"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "type"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "image"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p0, v15

    const-string v15, "name"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "fallback"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p3, v15

    const-string v15, "uploadFilePath"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "originalHeight"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v17, v15

    const-string v15, "originalWidth"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v18, v15

    const-string v15, "extraData"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v19, v15

    const-string v15, "statusCode"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v20, v15

    const-string v15, "errorMessage"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v21, v15

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v22

    if-eqz v22, :cond_16

    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v24

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v25

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v22

    const/16 v23, 0x0

    if-eqz v22, :cond_0

    move-object/from16 v26, v23

    goto :goto_1

    :cond_0
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v26, v22

    :goto_1
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_1

    move-object/from16 v27, v23

    goto :goto_2

    :cond_1
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v27, v22

    :goto_2
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_2

    move-object/from16 v28, v23

    goto :goto_3

    :cond_2
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v28, v22

    :goto_3
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_3

    move-object/from16 v29, v23

    goto :goto_4

    :cond_3
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v29, v22

    :goto_4
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_4

    move-object/from16 v30, v23

    goto :goto_5

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v30, v22

    :goto_5
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_5

    move-object/from16 v31, v23

    goto :goto_6

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v31, v22

    :goto_6
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_6

    move-object/from16 v32, v23

    goto :goto_7

    :cond_6
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v32, v22

    :goto_7
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_7

    move-object/from16 v33, v23

    move/from16 v22, v2

    move/from16 v46, v3

    goto :goto_8

    :cond_7
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v33, v22

    move/from16 v46, v3

    move/from16 v22, v2

    :goto_8
    invoke-interface {v1, v11}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-interface {v1, v12}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_8

    move-object/from16 v35, v23

    goto :goto_9

    :cond_8
    invoke-interface {v1, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v35, v3

    :goto_9
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object/from16 v36, v23

    goto :goto_a

    :cond_9
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v36, v3

    :goto_a
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_a

    move-object/from16 v37, v23

    :goto_b
    move/from16 v3, p0

    goto :goto_c

    :cond_a
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v37, v3

    goto :goto_b

    :goto_c
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_b

    move-object/from16 v38, v23

    :goto_d
    move/from16 p0, v0

    move/from16 v0, p1

    goto :goto_e

    :cond_b
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v34

    move-object/from16 v38, v34

    goto :goto_d

    :goto_e
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_c

    move-object/from16 v39, v23

    :goto_f
    move/from16 p1, v0

    move/from16 v0, p3

    goto :goto_10

    :cond_c
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v34

    move-object/from16 v39, v34

    goto :goto_f

    :goto_10
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_d

    move-object/from16 v40, v23

    :goto_11
    move/from16 p3, v0

    move/from16 v0, v16

    goto :goto_12

    :cond_d
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v34

    move-object/from16 v40, v34

    goto :goto_11

    :goto_12
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v16

    if-eqz v16, :cond_e

    move-object/from16 v41, v23

    :goto_13
    move/from16 v16, v0

    move/from16 v0, v17

    goto :goto_14

    :cond_e
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v41, v16

    goto :goto_13

    :goto_14
    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_f

    move/from16 v34, v2

    move/from16 v17, v3

    move-object/from16 v42, v23

    :goto_15
    move/from16 v2, v18

    goto :goto_16

    :cond_f
    move/from16 v34, v2

    move/from16 v17, v3

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v42, v2

    goto :goto_15

    :goto_16
    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_10

    move/from16 v18, v4

    move-object/from16 v43, v23

    :goto_17
    move/from16 v3, v19

    goto :goto_18

    :cond_10
    move/from16 v18, v4

    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v43, v3

    goto :goto_17

    :goto_18
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_11

    move-object/from16 v4, v23

    :goto_19
    move/from16 v19, v0

    move/from16 v47, v2

    move-object/from16 v0, p2

    goto :goto_1a

    :cond_11
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_19

    :goto_1a
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->__extraDataConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v45

    if-eqz v45, :cond_15

    move/from16 v2, v20

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_13

    move/from16 v4, v21

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v20

    if-nez v20, :cond_12

    :goto_1b
    move/from16 v20, v5

    move/from16 v21, v6

    goto :goto_1c

    :cond_12
    move/from16 v20, v5

    move/from16 v21, v6

    move-object/from16 v44, v23

    goto :goto_1f

    :catchall_0
    move-exception v0

    goto :goto_20

    :cond_13
    move/from16 v4, v21

    goto :goto_1b

    :goto_1c
    invoke-interface {v1, v2}, Ltb/c;->getLong(I)J

    move-result-wide v5

    long-to-int v5, v5

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_14

    :goto_1d
    move-object/from16 v6, v23

    goto :goto_1e

    :cond_14
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v23

    goto :goto_1d

    :goto_1e
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;

    invoke-direct {v0, v5, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;-><init>(ILjava/lang/String;)V

    move-object/from16 v44, v0

    :goto_1f
    new-instance v23, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;

    invoke-direct/range {v23 .. v45}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;Ljava/util/Map;)V

    move-object/from16 v0, v23

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, p0

    move/from16 p0, v17

    move/from16 v17, v19

    move/from16 v5, v20

    move/from16 v6, v21

    move/from16 v20, v2

    move/from16 v19, v3

    move/from16 v21, v4

    move/from16 v4, v18

    move/from16 v2, v22

    move/from16 v3, v46

    move/from16 v18, v47

    goto/16 :goto_0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.Map<kotlin.String, kotlin.Any>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_16
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v15

    :goto_20
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method


# virtual methods
.method public final deleteAll()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lhu1/g;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lhu1/g;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public final observeAttachmentsForMessage(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->__db:Landroidx/room/z0;

    const-string v1, "attachment_inner_entity"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lh02/h;

    const/16 v3, 0xc

    invoke-direct {v2, v3, p1, p0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object p1

    return-object p1
.end method
