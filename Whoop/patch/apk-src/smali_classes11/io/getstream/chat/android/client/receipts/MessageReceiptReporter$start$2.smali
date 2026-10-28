.class final Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.receipts.MessageReceiptReporter$start$2"
    f = "MessageReceiptReporter.kt"
    l = {
        0x2f,
        0x3e,
        0x48
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;-><init>(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 64

    move-object/from16 v1, p0

    iget-object v0, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->label:I

    const-string v4, "Reporter is no longer active"

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v5

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$6:Ljava/lang/Object;

    check-cast v3, Ll83/a0;

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$5:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$4:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$3:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v9, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$2:Ljava/lang/Object;

    check-cast v9, Ln23/h;

    iget-object v9, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v3, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    :try_start_2
    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-static {v3}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getMessageReceiptRepository$p(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    move-result-object v3

    iput-object v0, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$1:Ljava/lang/Object;

    iput v7, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->label:I

    const/16 v9, 0x64

    invoke-interface {v3, v9, v1}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->selectMessageReceipts(ILq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto/16 :goto_6

    :cond_4
    :goto_1
    check-cast v3, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v3, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/client/receipts/MessageReceipt;

    new-instance v12, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v11}, Lio/getstream/chat/android/client/receipts/MessageReceipt;->getMessageId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Lio/getstream/chat/android/client/receipts/MessageReceipt;->getCid()Ljava/lang/String;

    move-result-object v14

    const v62, 0xffff

    const/16 v63, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, -0x4

    invoke-direct/range {v12 .. v63}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-static {v3}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getLogger(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lb23/k;

    move-result-object v3

    iget-object v11, v3, Lb23/k;->c:Lb23/e;

    iget-object v12, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Reporting delivery receipts for "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " messages\u2026"

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v3, v13, v12, v11, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-static {v3}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getApi$p(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lio/getstream/chat/android/client/api/ChatApi;

    move-result-object v3

    invoke-interface {v3, v9}, Lio/getstream/chat/android/client/api/ChatApi;->markDelivered(Ljava/util/List;)Lo23/d;

    move-result-object v3

    invoke-interface {v3}, Lo23/d;->execute()Ln23/h;

    move-result-object v3

    iget-object v11, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    instance-of v12, v3, Ln23/g;

    if-eqz v12, :cond_9

    move-object v12, v3

    check-cast v12, Ln23/g;

    iget-object v12, v12, Ln23/g;->a:Ljava/lang/Object;

    check-cast v12, Ll83/a0;

    invoke-static {v11}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getLogger(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lb23/k;

    move-result-object v12

    iget-object v14, v12, Lb23/k;->c:Lb23/e;

    iget-object v15, v12, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v14, v13, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_7

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v14

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Successfully reported delivery receipts for "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " messages"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v12, v13, v15, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v9, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-static {v11}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getMessageReceiptRepository$p(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    move-result-object v7

    iput-object v0, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$2:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$3:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$4:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$5:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$6:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$7:Ljava/lang/Object;

    const/4 v10, 0x0

    iput v10, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->I$0:I

    iput v10, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->I$1:I

    iput v10, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->I$2:I

    iput v6, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->label:I

    invoke-interface {v7, v5, v1}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->deleteMessageReceiptsByMessageIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_a

    goto :goto_6

    :cond_9
    instance-of v5, v3, Ln23/f;

    if-eqz v5, :cond_c

    :cond_a
    :goto_4
    iget-object v5, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    instance-of v7, v3, Ln23/g;

    if-nez v7, :cond_d

    instance-of v7, v3, Ln23/f;

    if-eqz v7, :cond_b

    check-cast v3, Ln23/f;

    iget-object v3, v3, Ln23/f;->a:Ln23/e;

    invoke-static {v5}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getLogger(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lb23/k;

    move-result-object v5

    iget-object v7, v5, Lb23/k;->c:Lb23/e;

    iget-object v10, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->F:Lb23/g;

    invoke-interface {v7, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v3}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Failed to report delivery receipts for "

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " messages: "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v5, v11, v10, v3, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    :goto_5
    iput-object v0, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$0:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$2:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$3:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$4:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$5:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$6:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->L$7:Ljava/lang/Object;

    const/4 v3, 0x3

    iput v3, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->label:I

    const-wide/16 v9, 0x3e8

    invoke-static {v9, v10, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v5, v2, :cond_e

    :goto_6
    return-object v2

    :cond_e
    :goto_7
    move v5, v3

    const/4 v7, 0x1

    goto/16 :goto_0

    :cond_f
    iget-object v0, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-static {v0}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getLogger(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {v0, v5, v3, v4, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_8
    iget-object v2, v1, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter$start$2;->this$0:Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;

    invoke-static {v2}, Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;->access$getLogger(Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;)Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {v2, v6, v5, v4, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    throw v0
.end method
