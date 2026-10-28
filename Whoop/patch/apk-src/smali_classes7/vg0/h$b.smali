.class final Lvg0/h$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/h;->j(Landroid/net/Uri;Ljava/lang/String;J)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lxg0/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$performUpload$1"
    f = "AiChatImageInteractor.kt"
    l = {
        0x46,
        0x48,
        0x78,
        0x7b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/h;

.field final synthetic F:Landroid/net/Uri;

.field final synthetic G:J

.field final synthetic H:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvg0/h;Landroid/net/Uri;JLjava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/h;",
            "Landroid/net/Uri;",
            "J",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvg0/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/h$b;->E:Lvg0/h;

    iput-object p2, p0, Lvg0/h$b;->F:Landroid/net/Uri;

    iput-wide p3, p0, Lvg0/h$b;->G:J

    iput-object p5, p0, Lvg0/h$b;->H:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lvg0/h$b;

    iget-object v1, p0, Lvg0/h$b;->E:Lvg0/h;

    iget-object v2, p0, Lvg0/h$b;->F:Landroid/net/Uri;

    iget-wide v3, p0, Lvg0/h$b;->G:J

    iget-object v5, p0, Lvg0/h$b;->H:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lvg0/h$b;-><init>(Lvg0/h;Landroid/net/Uri;JLjava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lvg0/h$b;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvg0/h$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/h$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/h$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v5, p0

    iget-object v0, v5, Lvg0/h$b;->z:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lvg0/h$b;->y:I

    const-string v10, "upload_image"

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v12, :cond_1

    if-ne v0, v11, :cond_0

    iget-object v0, v5, Lvg0/h$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lvg0/h$b;->x:Ljava/lang/Object;

    check-cast v0, Lxg0/c;

    iget-object v0, v5, Lvg0/h$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_2
    iget-object v0, v5, Lvg0/h$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v5, Lvg0/h$b;->E:Lvg0/h;

    invoke-static {v0}, Lvg0/h;->e(Lvg0/h;)Lfl0/h;

    move-result-object v0

    iget-object v3, v5, Lvg0/h$b;->F:Landroid/net/Uri;

    iput-object v8, v5, Lvg0/h$b;->z:Ljava/lang/Object;

    iput v2, v5, Lvg0/h$b;->y:I

    invoke-virtual {v0, v3, v5}, Lfl0/h;->d(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_5

    :cond_5
    :goto_0
    check-cast v0, Lcom/whoop/bot/models/conversation/ImageUploadRequest;

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v5, Lvg0/h$b;->E:Lvg0/h;

    invoke-static {v3}, Lvg0/h;->f(Lvg0/h;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lvg0/h$b$a;

    iget-object v6, v5, Lvg0/h$b;->E:Lvg0/h;

    invoke-direct {v4, v6, v0, v13}, Lvg0/h$b$a;-><init>(Lvg0/h;Lcom/whoop/bot/models/conversation/ImageUploadRequest;Lq83/d;)V

    iput-object v8, v5, Lvg0/h$b;->z:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/h$b;->w:Ljava/lang/Object;

    iput v1, v5, Lvg0/h$b;->y:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_5

    :cond_6
    :goto_1
    iget-object v1, v5, Lvg0/h$b;->E:Lvg0/h;

    iget-object v15, v5, Lvg0/h$b;->H:Ljava/lang/String;

    iget-object v2, v5, Lvg0/h$b;->F:Landroid/net/Uri;

    iget-wide v3, v5, Lvg0/h$b;->G:J

    check-cast v0, Lu02/a;

    instance-of v6, v0, Lu02/a$b;

    if-eqz v6, :cond_7

    invoke-static {v1}, Lvg0/h;->c(Lvg0/h;)Lrg0/b;

    move-result-object v6

    check-cast v0, Lu02/a$b;

    invoke-virtual {v6, v0, v10}, Lrg0/b;->b(Lu02/a$b;Ljava/lang/String;)V

    invoke-static {v1}, Lvg0/h;->c(Lvg0/h;)Lrg0/b;

    move-result-object v0

    new-instance v14, Lrg0/a$x;

    const-string v16, "user"

    const-string v17, "image"

    const-string v18, "upload_failed"

    const-string v19, "image"

    const-string v20, "upload_failed"

    invoke-direct/range {v14 .. v20}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->IMAGE:Lcom/whoop/ai/chat/models/AttachmentType;

    const/16 v26, 0xb2

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v2

    move-wide/from16 v23, v3

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    move-object/from16 v0, v16

    goto/16 :goto_3

    :cond_7
    move-object/from16 v20, v2

    move-wide/from16 v23, v3

    instance-of v2, v0, Lu02/a$c;

    if-eqz v2, :cond_9

    move-object v2, v0

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpg3/v0;

    iget-object v2, v2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    if-eqz v0, :cond_8

    if-eqz v2, :cond_8

    invoke-static {v1}, Lvg0/h;->c(Lvg0/h;)Lrg0/b;

    move-result-object v0

    new-instance v1, Lrg0/a$u;

    const-string v3, "image"

    invoke-direct {v1, v15, v3}, Lrg0/a$u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->IMAGE:Lcom/whoop/ai/chat/models/AttachmentType;

    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->getFileId()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->getCreatedAtFormatted()Ljava/lang/String;

    move-result-object v25

    const/16 v26, 0x16

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_8
    move-object/from16 v0, v20

    invoke-static {v1}, Lvg0/h;->c(Lvg0/h;)Lrg0/b;

    move-result-object v1

    new-instance v14, Lrg0/a$x;

    const-string v16, "user"

    const-string v17, "image"

    const-string v18, "upload_failed"

    const-string v19, "image"

    const-string v20, "upload_failed"

    invoke-direct/range {v14 .. v20}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->IMAGE:Lcom/whoop/ai/chat/models/AttachmentType;

    const/16 v26, 0xb2

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v0

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :goto_3
    iput-object v8, v5, Lvg0/h$b;->z:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/h$b;->w:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/h$b;->x:Ljava/lang/Object;

    iput v12, v5, Lvg0/h$b;->y:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_5

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    iget-object v1, v5, Lvg0/h$b;->E:Lvg0/h;

    invoke-static {v1}, Lvg0/h;->c(Lvg0/h;)Lrg0/b;

    move-result-object v1

    invoke-virtual {v1, v0, v10}, Lrg0/b;->c(Ljava/lang/Exception;Ljava/lang/String;)V

    new-instance v14, Lxg0/c;

    sget-object v15, Lcom/whoop/ai/chat/models/AttachmentType;->IMAGE:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-object v0, v5, Lvg0/h$b;->F:Landroid/net/Uri;

    iget-wide v1, v5, Lvg0/h$b;->G:J

    const/16 v24, 0xb2

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v0

    move-wide/from16 v21, v1

    invoke-direct/range {v14 .. v25}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v13, v5, Lvg0/h$b;->z:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/h$b;->w:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/h$b;->x:Ljava/lang/Object;

    iput v11, v5, Lvg0/h$b;->y:I

    invoke-interface {v8, v14, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    :goto_5
    return-object v9

    :cond_a
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
