.class public final Lw62/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw62/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u001cBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lw62/a;",
        "",
        "Ljava/io/File;",
        "androidCacheDir",
        "Ly62/b;",
        "researchPacketDbManager",
        "Lcom/whoop/researchPacket/api/ResearchMetricsApi;",
        "researchMetricsApi",
        "Ljs0/c;",
        "configurationRepository",
        "Lmh2/a;",
        "strapMetadataDaoInteractor",
        "Lvt0/a;",
        "dataPacketUploadFileWriter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljava/io/File;Ly62/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Lmh2/a;Lvt0/a;Ltr2/n;)V",
        "",
        "revision",
        "",
        "numberOfPacketsToUpload",
        "Ll83/n;",
        "Ll83/a0;",
        "c",
        "(SILq83/d;)Ljava/lang/Object;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Ljava/io/File;",
        "b",
        "Ly62/b;",
        "Lcom/whoop/researchPacket/api/ResearchMetricsApi;",
        "Ljs0/c;",
        "e",
        "Lmh2/a;",
        "f",
        "Lvt0/a;",
        "g",
        "Ltr2/n;",
        "h",
        "research-packet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final h:Lw62/a$a;


# instance fields
.field private final a:Ljava/io/File;

.field private final b:Ly62/b;

.field private final c:Lcom/whoop/researchPacket/api/ResearchMetricsApi;

.field private final d:Ljs0/c;

.field private final e:Lmh2/a;

.field private final f:Lvt0/a;

.field private final g:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw62/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw62/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lw62/a;->h:Lw62/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ly62/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Lmh2/a;Lvt0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "androidCacheDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "researchPacketDbManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "researchMetricsApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapMetadataDaoInteractor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacketUploadFileWriter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw62/a;->a:Ljava/io/File;

    .line 3
    iput-object p2, p0, Lw62/a;->b:Ly62/b;

    .line 4
    iput-object p3, p0, Lw62/a;->c:Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    .line 5
    iput-object p4, p0, Lw62/a;->d:Ljs0/c;

    .line 6
    iput-object p5, p0, Lw62/a;->e:Lmh2/a;

    .line 7
    iput-object p6, p0, Lw62/a;->f:Lvt0/a;

    .line 8
    iput-object p7, p0, Lw62/a;->g:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Ly62/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Lmh2/a;Lvt0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 9
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "ResearchPacketsUploader"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v8}, Lw62/a;-><init>(Ljava/io/File;Ly62/b;Lcom/whoop/researchPacket/api/ResearchMetricsApi;Ljs0/c;Lmh2/a;Lvt0/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lw62/a;)Lcom/whoop/researchPacket/api/ResearchMetricsApi;
    .locals 0

    iget-object p0, p0, Lw62/a;->c:Lcom/whoop/researchPacket/api/ResearchMetricsApi;

    return-object p0
.end method

.method public static final synthetic b(Lw62/a;SILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw62/a;->c(SILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(SILq83/d;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(SI",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "Failed to upload due to "

    const-string v5, "Error while uploading research packets, "

    instance-of v6, v3, Lw62/a$b;

    if-eqz v6, :cond_0

    move-object v6, v3

    check-cast v6, Lw62/a$b;

    iget v7, v6, Lw62/a$b;->L:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Lw62/a$b;->L:I

    :goto_0
    move-object v12, v6

    goto :goto_1

    :cond_0
    new-instance v6, Lw62/a$b;

    invoke-direct {v6, v1, v3}, Lw62/a$b;-><init>(Lw62/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v3, v12, Lw62/a$b;->J:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v12, Lw62/a$b;->L:I

    sget-object v16, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v7, :cond_5

    if-eq v7, v11, :cond_4

    if-eq v7, v10, :cond_3

    if-eq v7, v9, :cond_2

    if-ne v7, v8, :cond_1

    iget-object v0, v12, Lw62/a$b;->I:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v12, Lw62/a$b;->H:Ljava/lang/Object;

    check-cast v0, Loh2/d;

    iget-object v0, v12, Lw62/a$b;->G:Ljava/lang/Object;

    check-cast v0, Lud3/v0;

    iget-object v0, v12, Lw62/a$b;->F:Ljava/lang/Object;

    check-cast v0, Lud3/v0;

    iget-object v0, v12, Lw62/a$b;->E:Ljava/lang/Object;

    check-cast v0, Lvt0/b;

    iget-object v0, v12, Lw62/a$b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v12, Lw62/a$b;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/io/File;

    :try_start_0
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :catch_0
    move-exception v0

    :goto_2
    move v9, v13

    move-object v13, v12

    goto/16 :goto_e

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v12, Lw62/a$b;->x:I

    iget-short v2, v12, Lw62/a$b;->w:S

    iget-object v7, v12, Lw62/a$b;->H:Ljava/lang/Object;

    check-cast v7, Loh2/d;

    iget-object v7, v12, Lw62/a$b;->G:Ljava/lang/Object;

    check-cast v7, Lud3/v0;

    iget-object v7, v12, Lw62/a$b;->F:Ljava/lang/Object;

    check-cast v7, Lud3/v0;

    iget-object v7, v12, Lw62/a$b;->E:Ljava/lang/Object;

    check-cast v7, Lvt0/b;

    iget-object v7, v12, Lw62/a$b;->z:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v9, v12, Lw62/a$b;->y:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    :try_start_1
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move v15, v2

    move-object v8, v7

    move-object v2, v9

    move-object v13, v12

    move-object v7, v3

    move-object v3, v14

    goto/16 :goto_9

    :catchall_1
    move-exception v0

    move-object v2, v9

    goto/16 :goto_f

    :catch_1
    move-exception v0

    move-object v2, v9

    goto :goto_2

    :cond_3
    iget v0, v12, Lw62/a$b;->x:I

    iget-short v2, v12, Lw62/a$b;->w:S

    iget-object v7, v12, Lw62/a$b;->z:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v10, v12, Lw62/a$b;->y:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    :try_start_2
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move v15, v2

    move-object v8, v7

    move-object v2, v10

    move-object v13, v12

    move-object v7, v3

    move-object v3, v14

    goto/16 :goto_4

    :catchall_2
    move-exception v0

    move-object v2, v10

    goto/16 :goto_f

    :catch_2
    move-exception v0

    move-object v2, v10

    goto :goto_2

    :cond_4
    iget v0, v12, Lw62/a$b;->x:I

    iget-short v2, v12, Lw62/a$b;->w:S

    iget-object v7, v12, Lw62/a$b;->y:Ljava/lang/Object;

    check-cast v7, Ljava/io/File;

    :try_start_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move/from16 v20, v2

    move v2, v0

    move/from16 v0, v20

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v2, v7

    goto/16 :goto_f

    :catch_3
    move-exception v0

    move-object v2, v7

    goto :goto_2

    :cond_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v3, ""

    iget-object v7, v1, Lw62/a;->a:Ljava/io/File;

    const-string v15, "research_packets_exported"

    invoke-static {v15, v3, v7}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v3

    :try_start_4
    iget-object v7, v1, Lw62/a;->b:Ly62/b;

    iput-object v3, v12, Lw62/a$b;->y:Ljava/lang/Object;

    iput-short v0, v12, Lw62/a$b;->w:S

    iput v2, v12, Lw62/a$b;->x:I

    iput v11, v12, Lw62/a$b;->L:I

    invoke-virtual {v7, v0, v2, v12}, Ly62/b;->b(IILq83/d;)Ljava/lang/Object;

    move-result-object v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    if-ne v7, v6, :cond_6

    goto/16 :goto_a

    :cond_6
    move-object/from16 v20, v7

    move-object v7, v3

    move-object/from16 v3, v20

    :goto_3
    :try_start_5
    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v11
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eqz v11, :cond_7

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    return-object v16

    :cond_7
    :try_start_6
    iget-object v11, v1, Lw62/a;->f:Lvt0/a;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v0}, Ljava/lang/Integer;-><init>(I)V

    iput-object v7, v12, Lw62/a$b;->y:Ljava/lang/Object;

    iput-object v3, v12, Lw62/a$b;->z:Ljava/lang/Object;

    iput-short v0, v12, Lw62/a$b;->w:S

    iput v2, v12, Lw62/a$b;->x:I

    iput v10, v12, Lw62/a$b;->L:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    move v10, v8

    move-object v8, v7

    move-object v7, v11

    const/4 v11, 0x0

    move/from16 v17, v13

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v18, v14

    const/16 v14, 0x18

    move/from16 v19, v10

    move-object v10, v15

    const/4 v15, 0x0

    move-object v9, v3

    move-object/from16 v3, v18

    :try_start_7
    invoke-static/range {v7 .. v15}, Lvt0/a;->b(Lvt0/a;Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    if-ne v7, v6, :cond_8

    goto/16 :goto_a

    :cond_8
    move v15, v0

    move v0, v2

    move-object v2, v8

    move-object v8, v9

    :goto_4
    :try_start_8
    check-cast v7, Lvt0/b;

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lvt0/b;->c()Ljava/io/File;

    move-result-object v9

    if-eqz v9, :cond_9

    sget-object v10, Lud3/v0;->Companion:Lud3/u0;

    sget-object v11, Lud3/h0;->e:Lyb3/p;

    const-string v11, "application/octet-stream"

    invoke-static {v11}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v11

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9, v11}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object v14

    goto :goto_6

    :goto_5
    const/4 v9, 0x0

    goto/16 :goto_e

    :catch_4
    move-exception v0

    goto :goto_5

    :cond_9
    move-object v14, v3

    :goto_6
    if-eqz v14, :cond_a

    sget-object v9, Lwp0/a;->a:Lwp0/a;

    invoke-virtual {v9, v14}, Lwp0/a;->a(Lud3/v0;)Lud3/v0;

    move-result-object v14

    goto :goto_7

    :cond_a
    move-object v14, v3

    :goto_7
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lvt0/b;->e()I

    move-result v7

    iget-object v9, v1, Lw62/a;->e:Lmh2/a;

    invoke-virtual {v9, v7}, Lmh2/a;->h(I)Loh2/d;

    move-result-object v7

    goto :goto_8

    :cond_b
    move-object v7, v3

    :goto_8
    sget-object v9, Lu02/a;->a:Lu02/a$a;

    iget-object v10, v1, Lw62/a;->g:Ltr2/n;

    move-object v11, v10

    const-string v10, "Failed to upload research packets"

    move-object v12, v11

    new-instance v11, Lw62/a$c;

    invoke-direct {v11, v14, v1, v7, v3}, Lw62/a$c;-><init>(Lud3/v0;Lw62/a;Loh2/d;Lq83/d;)V

    iput-object v2, v13, Lw62/a$b;->y:Ljava/lang/Object;

    iput-object v8, v13, Lw62/a$b;->z:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->E:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->F:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->G:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->H:Ljava/lang/Object;

    iput-short v15, v13, Lw62/a$b;->w:S

    iput v0, v13, Lw62/a$b;->x:I

    const/4 v7, 0x3

    iput v7, v13, Lw62/a$b;->L:I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object v7, v9

    const/4 v9, 0x0

    move-object v14, v8

    move-object v8, v12

    move-object v12, v13

    const/4 v13, 0x2

    move-object/from16 v17, v14

    const/4 v14, 0x0

    :try_start_9
    invoke-static/range {v7 .. v14}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object v13, v12

    if-ne v7, v6, :cond_c

    goto :goto_a

    :cond_c
    move-object/from16 v8, v17

    :goto_9
    :try_start_a
    check-cast v7, Lu02/a;

    instance-of v9, v7, Lu02/a$c;

    if-eqz v9, :cond_d

    iget-object v5, v1, Lw62/a;->g:Ltr2/n;

    const-string v7, "Uploading of research packets was successful."
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const/4 v9, 0x0

    :try_start_b
    new-array v10, v9, [Lqr2/a$a;

    invoke-interface {v5, v7, v10}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v5, v1, Lw62/a;->b:Ly62/b;

    iput-object v2, v13, Lw62/a$b;->y:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->z:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->E:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->F:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->G:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->H:Ljava/lang/Object;

    iput-object v3, v13, Lw62/a$b;->I:Ljava/lang/Object;

    iput-short v15, v13, Lw62/a$b;->w:S

    iput v0, v13, Lw62/a$b;->x:I

    const/4 v10, 0x4

    iput v10, v13, Lw62/a$b;->L:I

    invoke-virtual {v5, v8, v13}, Ly62/b;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_e

    :goto_a
    return-object v6

    :catch_5
    move-exception v0

    goto :goto_e

    :cond_d
    const/4 v9, 0x0

    instance-of v0, v7, Lu02/a$b;

    if-eqz v0, :cond_f

    iget-object v0, v1, Lw62/a;->g:Ltr2/n;

    move-object v3, v7

    check-cast v3, Lu02/a$b;

    invoke-virtual {v3}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v5, v9, [Lqr2/a$a;

    invoke-interface {v0, v3, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    check-cast v7, Lu02/a$b;

    invoke-virtual {v7}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v16
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :cond_e
    :goto_b
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    return-object v16

    :cond_f
    :try_start_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catch_6
    move-exception v0

    move-object v13, v12

    goto/16 :goto_5

    :catchall_4
    move-exception v0

    :goto_c
    move-object v2, v8

    goto :goto_f

    :catch_7
    move-exception v0

    const/4 v9, 0x0

    :goto_d
    move-object v2, v8

    goto :goto_e

    :catchall_5
    move-exception v0

    move-object v8, v7

    goto :goto_c

    :catch_8
    move-exception v0

    move-object v8, v7

    move v9, v13

    move-object v13, v12

    goto :goto_d

    :catchall_6
    move-exception v0

    move-object v2, v3

    goto :goto_f

    :catch_9
    move-exception v0

    move v9, v13

    move-object v13, v12

    move-object v2, v3

    :goto_e
    :try_start_d
    invoke-interface {v13}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v3, v1, Lw62/a;->g:Ltr2/n;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v9, [Lqr2/a$a;

    invoke-interface {v3, v4, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    return-object v0

    :goto_f
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    throw v0
.end method


# virtual methods
.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lw62/a$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw62/a$d;

    iget v1, v0, Lw62/a$d;->N:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw62/a$d;->N:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw62/a$d;

    invoke-direct {v0, p0, p1}, Lw62/a$d;-><init>(Lw62/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lw62/a$d;->L:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw62/a$d;->N:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget v2, v0, Lw62/a$d;->y:I

    iget v6, v0, Lw62/a$d;->x:I

    iget v7, v0, Lw62/a$d;->w:I

    iget-object v8, v0, Lw62/a$d;->J:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lw62/a$d;->H:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v0, Lw62/a$d;->G:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    iget-object v11, v0, Lw62/a$d;->F:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v0, Lw62/a$d;->E:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lw62/a;->d:Ljs0/c;

    sget-object v2, Lw62/a$a$a;->a:Lw62/a$a$a;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v8, Ljava/lang/Integer;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_1

    :cond_3
    move-object p1, v5

    goto/16 :goto_1

    :cond_4
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :cond_5
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    goto :goto_1

    :cond_6
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    goto :goto_1

    :cond_7
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_8
    const-class v9, Ljava/lang/String;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_9
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    move-object v2, p1

    :goto_2
    if-eqz v2, :cond_12

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v2, Ljava/lang/Short;

    const/16 v6, 0x13

    invoke-direct {v2, v6}, Ljava/lang/Short;-><init>(S)V

    new-instance v6, Ljava/lang/Short;

    const/16 v7, 0x16

    invoke-direct {v6, v7}, Ljava/lang/Short;-><init>(S)V

    filled-new-array {v2, v6}, [Ljava/lang/Short;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v7, p1

    move-object v9, v2

    move v2, v4

    move-object v8, v6

    move v6, v2

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    int-to-short v10, p1

    iput-object v5, v0, Lw62/a$d;->E:Ljava/lang/Object;

    iput-object v5, v0, Lw62/a$d;->F:Ljava/lang/Object;

    iput-object v8, v0, Lw62/a$d;->G:Ljava/lang/Object;

    iput-object v9, v0, Lw62/a$d;->H:Ljava/lang/Object;

    iput-object v5, v0, Lw62/a$d;->I:Ljava/lang/Object;

    iput-object v8, v0, Lw62/a$d;->J:Ljava/lang/Object;

    iput v7, v0, Lw62/a$d;->w:I

    iput v6, v0, Lw62/a$d;->x:I

    iput v2, v0, Lw62/a$d;->y:I

    iput-short p1, v0, Lw62/a$d;->K:S

    iput v4, v0, Lw62/a$d;->z:I

    iput v3, v0, Lw62/a$d;->N:I

    invoke-direct {p0, v10, v7, v0}, Lw62/a;->c(SILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    return-object v1

    :cond_b
    move-object v10, v8

    :goto_4
    new-instance v11, Ll83/n;

    invoke-direct {v11, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v8, v10

    goto :goto_3

    :cond_c
    check-cast v8, Ljava/util/List;

    check-cast v8, Ljava/lang/Iterable;

    instance-of p1, v8, Ljava/util/Collection;

    if-eqz p1, :cond_d

    move-object p1, v8

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_d

    goto :goto_5

    :cond_d
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    instance-of v0, v0, Ll83/m;

    if-eqz v0, :cond_e

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    instance-of v1, v0, Ll83/m;

    if-eqz v1, :cond_f

    return-object v0

    :cond_10
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_12
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
