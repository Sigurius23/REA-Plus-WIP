.class public final Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00152\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R(\u0010&\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020#0\"0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010$\u001a\u0004\u0008\u001a\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;",
        "Lrw2/a;",
        "Lu02/c;",
        "apiClient",
        "Lor2/a0;",
        "fileManager",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lu02/c;Lor2/a0;Ljava/time/Clock;Ltr2/n;)V",
        "Lcom/whoop/whoopaction/domain/models/DownloadAction;",
        "action",
        "Lqw2/b;",
        "e",
        "(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lq83/d;)Ljava/lang/Object;",
        "",
        "filename",
        "f",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lec3/l;",
        "Lqw2/a;",
        "upstream",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu02/c;",
        "Lor2/a0;",
        "c",
        "Ljava/time/Clock;",
        "d",
        "Ltr2/n;",
        "",
        "Lj93/d;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "actionTypes",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lu02/c;

.field private final b:Lor2/a0;

.field private final c:Ljava/time/Clock;

.field private final d:Ltr2/n;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu02/c;Lor2/a0;Ljava/time/Clock;Ltr2/n;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->a:Lu02/c;

    .line 3
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->b:Lor2/a0;

    .line 4
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->c:Ljava/time/Clock;

    .line 5
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    .line 6
    const-class p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    .line 7
    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    .line 8
    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->e:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Lor2/a0;Ljava/time/Clock;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 9
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p3

    const-string p6, "systemDefaultZone(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 10
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "DownloadActionHandler"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;-><init>(Lu02/c;Lor2/a0;Ljava/time/Clock;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;Lcom/whoop/whoopaction/domain/models/DownloadAction;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->e(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    return-object p0
.end method

.method private final e(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lq83/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/DownloadAction;",
            "Lq83/d<",
            "-",
            "Lqw2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, " "

    const-class v4, Ljava/lang/String;

    const-string v5, "Download complete \u2014 navigating to DownloadedFileExport with path: \'"

    const-string v6, "File does not exist after save \u2014 path: \'"

    const-string v7, "File save result \u2014 path: \'"

    const-string v8, "Saving "

    const-string v9, "Read "

    const-string v10, "Download failed \u2014 HTTP "

    const-string v11, "Response received \u2014 status: "

    const-string v12, "Making GET request \u2014 path: \'"

    instance-of v13, v0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;

    if-eqz v13, :cond_0

    move-object v13, v0

    check-cast v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;

    iget v14, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->G:I

    const/high16 v15, -0x80000000

    and-int v16, v14, v15

    if-eqz v16, :cond_0

    sub-int/2addr v14, v15

    iput v14, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;

    invoke-direct {v13, v1, v0}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;-><init>(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;Lq83/d;)V

    :goto_0
    iget-object v0, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->E:Ljava/lang/Object;

    sget-object v14, Lr83/a;->w:Lr83/a;

    iget v15, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->G:I

    move-object/from16 v16, v0

    const-string v0, "\'"

    move-object/from16 v18, v5

    const-string v5, "Download failed: "

    move-object/from16 v20, v6

    if-eqz v15, :cond_4

    const/4 v6, 0x1

    if-eq v15, v6, :cond_3

    const/4 v2, 0x2

    if-eq v15, v2, :cond_2

    const/4 v2, 0x3

    if-ne v15, v2, :cond_1

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->y:Ljava/lang/Object;

    check-cast v2, Lf63/c;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    :try_start_0
    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v21, v8

    move-object/from16 v3, v16

    move-object/from16 v16, v7

    goto/16 :goto_5

    :catch_0
    move-exception v0

    move-object v8, v2

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->y:Ljava/lang/Object;

    check-cast v2, Lf63/c;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    :try_start_1
    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v21, v8

    move-object/from16 v3, v16

    move-object/from16 v16, v7

    goto/16 :goto_3

    :cond_3
    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;

    iget-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    :try_start_2
    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v21, v8

    move-object/from16 v4, v16

    const/4 v8, 0x1

    move-object/from16 v16, v7

    goto :goto_1

    :cond_4
    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object v6, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getPath()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "\', Accept: */*"

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    new-array v15, v12, [Lqr2/a$a;

    invoke-interface {v6, v7, v15}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v6, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;

    invoke-direct {v6, v2}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;-><init>(Lcom/whoop/whoopaction/domain/models/DownloadAction;)V

    iget-object v7, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->a:Lu02/c;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v12

    invoke-static {v12}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v15

    move-object/from16 v21, v8

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v4, v12, v15}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v4

    iput-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->w:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->x:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->G:I

    invoke-virtual {v7, v6, v4, v13}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_1
    check-cast v4, Lf63/c;

    invoke-interface {v4}, Li63/s;->getHeaders()Li63/m;

    move-result-object v6

    sget-object v7, Li63/r;->a:Ljava/util/List;

    const-string v7, "Content-Type"

    invoke-interface {v6, v7}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v4}, Lf63/c;->e()Li63/v;

    move-result-object v12

    iget v12, v12, Li63/v;->a:I

    invoke-virtual {v4}, Lf63/c;->e()Li63/v;

    move-result-object v15

    iget-object v15, v15, Li63/v;->b:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ", Content-Type: "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v12, 0x0

    new-array v8, v12, [Lqr2/a$a;

    invoke-interface {v7, v6, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v4}, Lf63/c;->e()Li63/v;

    move-result-object v6

    const-string v7, "<this>"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v6, v6, Li63/v;->a:I

    const/16 v7, 0xc8

    if-gt v7, v6, :cond_6

    const/16 v7, 0x12c

    if-ge v6, v7, :cond_6

    const/16 v19, 0x1

    goto :goto_2

    :cond_6
    const/16 v19, 0x0

    :goto_2
    if-nez v19, :cond_7

    iget-object v6, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v4}, Lf63/c;->e()Li63/v;

    move-result-object v7

    iget v7, v7, Li63/v;->a:I

    invoke-virtual {v4}, Lf63/c;->e()Li63/v;

    move-result-object v8

    iget-object v8, v8, Li63/v;->b:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getPath()Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " for path \'"

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v3, v12, [Lqr2/a$a;

    invoke-interface {v6, v0, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v13, Lqw2/b$a;

    invoke-virtual {v4}, Lf63/c;->e()Li63/v;

    move-result-object v0

    iget v0, v0, Li63/v;->a:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13

    :cond_7
    iput-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->w:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->x:Ljava/lang/Object;

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->y:Ljava/lang/Object;

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->z:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->G:I

    invoke-static {v4, v13}, Lj93/l0;->j(Lf63/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    check-cast v3, Lio/ktor/utils/io/q;

    iput-object v2, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->w:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->x:Ljava/lang/Object;

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->y:Ljava/lang/Object;

    iput-object v8, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->z:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, v13, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$a;->G:I

    check-cast v3, Lio/ktor/utils/io/m;

    invoke-virtual {v3, v13}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_9

    :goto_4
    return-object v14

    :cond_9
    :goto_5
    check-cast v3, Lv63/e;

    invoke-static {v3}, Lv63/h;->d(Lv63/e;)[B

    move-result-object v3

    iget-object v4, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    array-length v6, v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " bytes from response body"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v12, 0x0

    new-array v7, v12, [Lqr2/a$a;

    invoke-interface {v4, v6, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getFilename()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v6, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    array-length v7, v3

    new-instance v8, Ljava/lang/StringBuilder;

    move-object/from16 v9, v21

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " bytes as \'"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\' to downloads"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    new-array v8, v12, [Lqr2/a$a;

    invoke-interface {v6, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v6, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->b:Lor2/a0;

    invoke-virtual {v6, v4, v3}, Lor2/a0;->g(Ljava/lang/String;[B)Ljava/io/File;

    move-result-object v3

    iget-object v4, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v8

    new-instance v10, Ljava/lang/StringBuilder;

    move-object/from16 v11, v16

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\', exists: "

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ", size: "

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " bytes"

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v12, 0x0

    new-array v7, v12, [Lqr2/a$a;

    invoke-interface {v4, v6, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_a

    iget-object v4, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    move-object/from16 v7, v20

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v3, v12, [Lqr2/a$a;

    invoke-interface {v4, v0, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v6, Lqw2/b$a;

    const-string v7, "Failed to save file"

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_a
    new-instance v6, Lcom/whoop/navigation/e;

    sget-object v7, Lcom/whoop/navigation/AppScreen$z1;->w:Lcom/whoop/navigation/AppScreen$z1;

    new-instance v8, Lcom/whoop/navigation/DownloadedFileExportScreenModel;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v9, "getAbsolutePath(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v4}, Lcom/whoop/navigation/DownloadedFileExportScreenModel;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v4, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    move-object/from16 v8, v18

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v3, v12, [Lqr2/a$a;

    invoke-interface {v4, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lqw2/b$d;

    const/4 v8, 0x0

    invoke-direct {v0, v6, v8, v2}, Lqw2/b$d;-><init>(Lcom/whoop/navigation/e;Lj02/s;Lcom/whoop/whoopaction/domain/models/Action;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object v0

    :goto_6
    iget-object v2, v1, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->d:Ltr2/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, " \u2014 path: \'"

    const-string v9, "\', message: "

    const-string v10, "Download failed with "

    invoke-static {v10, v3, v7, v4, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v12, 0x0

    new-array v4, v12, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v6, Lqw2/b$a;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method private final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->c:Ljava/time/Clock;

    invoke-static {v0}, Ljava/time/LocalDateTime;->now(Ljava/time/Clock;)Ljava/time/LocalDateTime;

    move-result-object v0

    const-string v1, "yyyyMMdd_HHmmss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/16 v2, 0x2e

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v1}, Lyb3/r;->k0(Ljava/lang/CharSequence;CII)I

    move-result v1

    const-string v2, "_"

    if-lez v1, :cond_0

    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2, v0, p1}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, v2, v0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->e:Ljava/util/Set;

    return-object v0
.end method

.method public b(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$b;-><init>(Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;Lq83/d;)V

    invoke-static {v0, p1}, Lec3/v;->D(Lc93/m;Lec3/l;)Lch/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge interact(Lec3/l;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-super {p0, p1}, Lrw2/a;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
