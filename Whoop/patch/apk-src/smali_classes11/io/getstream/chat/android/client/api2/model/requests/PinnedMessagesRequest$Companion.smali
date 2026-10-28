.class public final Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;",
        "limit",
        "",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Message;",
        "pagination",
        "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
            ")",
            "Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;"
        }
    .end annotation

    move-object/from16 v0, p3

    const-string v1, "sort"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "pagination"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundDate;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundDate;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundDate;->getDate()Ljava/util/Date;

    move-result-object v9

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v3

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v14, 0xf7c

    const/4 v15, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v2, p1

    invoke-direct/range {v1 .. v15}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v1, v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;

    if-eqz v1, :cond_2

    check-cast v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;->getInclusive()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;->getDate()Ljava/util/Date;

    move-result-object v14

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0x7fc

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeDate;->getDate()Ljava/util/Date;

    move-result-object v13

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xbfc

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    instance-of v1, v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;

    if-eqz v1, :cond_4

    check-cast v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;->getInclusive()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;->getDate()Ljava/util/Date;

    move-result-object v12

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xdfc

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterDate;->getDate()Ljava/util/Date;

    move-result-object v11

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xefc

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    instance-of v1, v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundMessage;

    if-eqz v1, :cond_5

    check-cast v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundMessage;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AroundMessage;->getMessageId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xff8

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_5
    instance-of v1, v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;

    if-eqz v1, :cond_7

    check-cast v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;->getInclusive()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;->getMessageId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xfbc

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_6
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$BeforeMessage;->getMessageId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xfdc

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_7
    instance-of v1, v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;

    if-eqz v1, :cond_9

    check-cast v0, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;->getInclusive()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;->getMessageId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xfec

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_8
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination$AfterMessage;->getMessageId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object v4

    new-instance v2, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;

    const/16 v15, 0xff4

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/requests/PinnedMessagesRequest;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
