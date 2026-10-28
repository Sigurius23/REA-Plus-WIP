.class final Lvg0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b;->j(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;J)Lec3/l;
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
    c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$performUpload$1"
    f = "AiChatFileInteractor.kt"
    l = {
        0x61,
        0x70,
        0x79,
        0x8e,
        0x94
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lvg0/b;

.field final synthetic K:Landroid/net/Uri;

.field final synthetic L:Ljava/lang/String;

.field final synthetic M:Ljava/lang/String;

.field final synthetic N:J

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvg0/b;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/b;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Lq83/d<",
            "-",
            "Lvg0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/b$b;->J:Lvg0/b;

    iput-object p2, p0, Lvg0/b$b;->K:Landroid/net/Uri;

    iput-object p3, p0, Lvg0/b$b;->L:Ljava/lang/String;

    iput-object p4, p0, Lvg0/b$b;->M:Ljava/lang/String;

    iput-wide p5, p0, Lvg0/b$b;->N:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lvg0/b$b;

    iget-object v1, p0, Lvg0/b$b;->J:Lvg0/b;

    iget-object v2, p0, Lvg0/b$b;->K:Landroid/net/Uri;

    iget-object v3, p0, Lvg0/b$b;->L:Ljava/lang/String;

    iget-object v4, p0, Lvg0/b$b;->M:Ljava/lang/String;

    iget-wide v5, p0, Lvg0/b$b;->N:J

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lvg0/b$b;-><init>(Lvg0/b;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLq83/d;)V

    iput-object p1, v0, Lvg0/b$b;->I:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/b$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/b$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/b$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v5, p0

    iget-object v0, v5, Lvg0/b$b;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lvg0/b$b;->H:I

    const-string v10, "upload_file"

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v14, 0x2

    const/4 v1, 0x1

    const/4 v15, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_3

    if-eq v0, v14, :cond_2

    if-eq v0, v13, :cond_1

    if-eq v0, v12, :cond_1

    if-ne v0, v11, :cond_0

    iget-object v0, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lvg0/b$b;->G:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    :cond_2
    iget-object v0, v5, Lvg0/b$b;->F:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    check-cast v0, Lud3/i0;

    iget-object v0, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    check-cast v0, Lud3/v0;

    iget-object v0, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    check-cast v0, Lud3/i0;

    iget-object v0, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    check-cast v0, [B

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_3
    iget-object v0, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    check-cast v0, Lud3/i0;

    iget-object v0, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    check-cast v0, Lud3/v0;

    iget-object v0, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    check-cast v0, Lud3/i0;

    iget-object v0, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    check-cast v0, [B

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v0}, Lvg0/b;->e(Lvg0/b;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v2, v5, Lvg0/b$b;->K:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v2, :cond_9

    :try_start_3
    invoke-static {v2}, Ls40/e0;->g(Ljava/io/InputStream;)[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    sget-object v2, Lad3/c;->d:Lad3/b;

    new-instance v3, Lcom/whoop/ai/chat/api/FileUploadMetadata;

    iget-object v4, v5, Lvg0/b$b;->L:Ljava/lang/String;

    invoke-direct {v3, v4}, Lcom/whoop/ai/chat/api/FileUploadMetadata;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/ai/chat/api/FileUploadMetadata;->Companion:Lcom/whoop/ai/chat/api/FileUploadMetadata$a;

    invoke-virtual {v4}, Lcom/whoop/ai/chat/api/FileUploadMetadata$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v2, v4, v3}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "metadata"

    sget-object v4, Lud3/v0;->Companion:Lud3/u0;

    sget-object v6, Lud3/h0;->e:Lyb3/p;

    const-string v6, "text/plain"

    invoke-static {v6}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v6}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object v2

    invoke-static {v3, v15, v2}, Lrj/o;->o(Ljava/lang/String;Ljava/lang/String;Lud3/v0;)Lud3/i0;

    move-result-object v2

    const-string v3, "application/pdf"

    invoke-static {v3}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x6

    invoke-static {v4, v0, v3, v6, v7}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object v0

    const-string v3, "files"

    iget-object v4, v5, Lvg0/b$b;->L:Ljava/lang/String;

    invoke-static {v3, v4, v0}, Lrj/o;->o(Ljava/lang/String;Ljava/lang/String;Lud3/v0;)Lud3/i0;

    move-result-object v0

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v4, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v4}, Lvg0/b;->f(Lvg0/b;)Ltr2/n;

    move-result-object v4

    move-object v6, v4

    new-instance v4, Lvg0/b$b$a;

    iget-object v7, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-direct {v4, v7, v2, v0, v15}, Lvg0/b$b$a;-><init>(Lvg0/b;Lud3/i0;Lud3/i0;Lq83/d;)V

    iput-object v8, v5, Lvg0/b$b;->I:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    iput v1, v5, Lvg0/b$b;->H:I

    const/4 v2, 0x0

    move-object v0, v3

    const/4 v3, 0x0

    move-object v1, v6

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_2

    :cond_5
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_6

    iget-object v1, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v1}, Lvg0/b;->c(Lvg0/b;)Lrg0/b;

    move-result-object v1

    check-cast v0, Lu02/a$b;

    invoke-virtual {v1, v0, v10}, Lrg0/b;->b(Lu02/a$b;Ljava/lang/String;)V

    iget-object v0, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v0}, Lvg0/b;->c(Lvg0/b;)Lrg0/b;

    move-result-object v0

    new-instance v16, Lrg0/a$x;

    iget-object v1, v5, Lvg0/b$b;->M:Ljava/lang/String;

    const-string v18, "user"

    const-string v19, "file"

    const-string v20, "upload_failed"

    const-string v21, "pdf"

    const-string v22, "upload_failed"

    move-object/from16 v17, v1

    invoke-direct/range {v16 .. v22}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->PDF:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-object v0, v5, Lvg0/b$b;->K:Landroid/net/Uri;

    iget-object v1, v5, Lvg0/b$b;->L:Ljava/lang/String;

    iget-wide v2, v5, Lvg0/b$b;->N:J

    const/16 v26, 0xa2

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-wide/from16 v23, v2

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    iput-object v8, v5, Lvg0/b$b;->I:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->F:Ljava/lang/Object;

    iput v14, v5, Lvg0/b$b;->H:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto/16 :goto_2

    :cond_6
    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    move-object v1, v0

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpg3/v0;

    iget-object v1, v1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    if-eqz v0, :cond_7

    if-eqz v1, :cond_7

    iget-object v0, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v0}, Lvg0/b;->c(Lvg0/b;)Lrg0/b;

    move-result-object v0

    new-instance v2, Lrg0/a$u;

    iget-object v3, v5, Lvg0/b$b;->M:Ljava/lang/String;

    const-string v4, "pdf"

    invoke-direct {v2, v3, v4}, Lrg0/a$u;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->PDF:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-object v0, v5, Lvg0/b$b;->K:Landroid/net/Uri;

    iget-object v2, v5, Lvg0/b$b;->L:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->getFileId()Ljava/lang/String;

    move-result-object v22

    iget-wide v3, v5, Lvg0/b$b;->N:J

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;->getCreatedAtFormatted()Ljava/lang/String;

    move-result-object v25

    const/16 v26, 0x6

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v2

    move-wide/from16 v23, v3

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    iput-object v8, v5, Lvg0/b$b;->I:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->G:Ljava/lang/Object;

    iput v13, v5, Lvg0/b$b;->H:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto/16 :goto_2

    :cond_7
    iget-object v0, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v0}, Lvg0/b;->c(Lvg0/b;)Lrg0/b;

    move-result-object v0

    new-instance v16, Lrg0/a$x;

    iget-object v1, v5, Lvg0/b$b;->M:Ljava/lang/String;

    const-string v18, "user"

    const-string v19, "file"

    const-string v20, "upload_failed"

    const-string v21, "pdf"

    const-string v22, "upload_failed"

    move-object/from16 v17, v1

    invoke-direct/range {v16 .. v22}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->PDF:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-object v0, v5, Lvg0/b$b;->K:Landroid/net/Uri;

    iget-object v1, v5, Lvg0/b$b;->L:Ljava/lang/String;

    iget-wide v2, v5, Lvg0/b$b;->N:J

    const/16 v26, 0xa2

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-wide/from16 v23, v2

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    iput-object v8, v5, Lvg0/b$b;->I:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->G:Ljava/lang/Object;

    iput v12, v5, Lvg0/b$b;->H:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_2

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-static {v2, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not read content URI"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_1
    iget-object v1, v5, Lvg0/b$b;->J:Lvg0/b;

    invoke-static {v1}, Lvg0/b;->c(Lvg0/b;)Lrg0/b;

    move-result-object v1

    invoke-virtual {v1, v0, v10}, Lrg0/b;->c(Ljava/lang/Exception;Ljava/lang/String;)V

    new-instance v16, Lxg0/c;

    sget-object v17, Lcom/whoop/ai/chat/models/AttachmentType;->PDF:Lcom/whoop/ai/chat/models/AttachmentType;

    iget-object v0, v5, Lvg0/b$b;->K:Landroid/net/Uri;

    iget-object v1, v5, Lvg0/b$b;->L:Ljava/lang/String;

    iget-wide v2, v5, Lvg0/b$b;->N:J

    const/16 v26, 0xa2

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-wide/from16 v23, v2

    invoke-direct/range {v16 .. v27}, Lxg0/c;-><init>(Lcom/whoop/ai/chat/models/AttachmentType;ZZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    iput-object v15, v5, Lvg0/b$b;->I:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->w:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->x:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->y:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->z:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->E:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->F:Ljava/lang/Object;

    iput-object v15, v5, Lvg0/b$b;->G:Ljava/lang/Object;

    iput v11, v5, Lvg0/b$b;->H:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    :goto_2
    return-object v9

    :cond_a
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
