.class public final Lf52/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J:\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u001d\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\"R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010#R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lf52/d;",
        "",
        "Lf52/c;",
        "fileExporter",
        "Lcom/whoop/puffin/network/BatteryPackApi;",
        "batteryPackApi",
        "",
        "modelString",
        "releaseVersion",
        "Lx42/b;",
        "batteryPackMetricWriter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lf52/c;Lcom/whoop/puffin/network/BatteryPackApi;Ljava/lang/String;Ljava/lang/String;Lx42/b;Ltr2/n;)V",
        "",
        "isConsole",
        "f",
        "(ZLq83/d;)Ljava/lang/Object;",
        "",
        "headers",
        "Lud3/v0;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "c",
        "(ZLjava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "d",
        "a",
        "Lf52/c;",
        "b",
        "Lcom/whoop/puffin/network/BatteryPackApi;",
        "Ljava/lang/String;",
        "Lx42/b;",
        "Ltr2/n;",
        "puffin_release"
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
.field private final a:Lf52/c;

.field private final b:Lcom/whoop/puffin/network/BatteryPackApi;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lx42/b;

.field private final f:Ltr2/n;


# direct methods
.method public constructor <init>(Lf52/c;Lcom/whoop/puffin/network/BatteryPackApi;Ljava/lang/String;Ljava/lang/String;Lx42/b;Ltr2/n;)V
    .locals 1

    const-string v0, "fileExporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryPackApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelString"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "releaseVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryPackMetricWriter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf52/d;->a:Lf52/c;

    .line 3
    iput-object p2, p0, Lf52/d;->b:Lcom/whoop/puffin/network/BatteryPackApi;

    .line 4
    iput-object p3, p0, Lf52/d;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lf52/d;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lf52/d;->e:Lx42/b;

    .line 7
    iput-object p6, p0, Lf52/d;->f:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lf52/c;Lcom/whoop/puffin/network/BatteryPackApi;Ljava/lang/String;Ljava/lang/String;Lx42/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 8
    sget-object p3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object p8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    filled-new-array {p3, p8, v0, v1}, [Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "|"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p3

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    .line 9
    sget-object p4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string p3, "RELEASE"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_2

    .line 10
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "BatteryPackRelativeEventsUploader"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    move-object v6, p6

    .line 11
    invoke-direct/range {v0 .. v6}, Lf52/d;-><init>(Lf52/c;Lcom/whoop/puffin/network/BatteryPackApi;Ljava/lang/String;Ljava/lang/String;Lx42/b;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf52/d;ZLjava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lf52/d;->c(ZLjava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lf52/d;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lf52/d;->f(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(ZLjava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lud3/v0;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf52/d;->b:Lcom/whoop/puffin/network/BatteryPackApi;

    invoke-interface {p1, p2, p3, p4}, Lcom/whoop/puffin/network/BatteryPackApi;->postRelativeConsoleLogEvents(Ljava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lf52/d;->b:Lcom/whoop/puffin/network/BatteryPackApi;

    invoke-interface {p1, p2, p3, p4}, Lcom/whoop/puffin/network/BatteryPackApi;->postRelativeFirmwareEvents(Ljava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final f(ZLq83/d;)Ljava/lang/Object;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lf52/d$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf52/d$a;

    iget v4, v3, Lf52/d$a;->I:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf52/d$a;->I:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lf52/d$a;

    invoke-direct {v3, v1, v2}, Lf52/d$a;-><init>(Lf52/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lf52/d$a;->G:Ljava/lang/Object;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v3, v9, Lf52/d$a;->I:I

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v6, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v3, :cond_7

    if-eq v3, v14, :cond_5

    if-eq v3, v6, :cond_4

    if-eq v3, v13, :cond_3

    if-eq v3, v12, :cond_2

    if-ne v3, v11, :cond_1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_2
    iget v0, v9, Lf52/d$a;->F:I

    iget-object v3, v9, Lf52/d$a;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v3, v9, Lf52/d$a;->z:Ljava/lang/Object;

    check-cast v3, Lud3/v0;

    iget-object v3, v9, Lf52/d$a;->y:Ljava/lang/Object;

    check-cast v3, Lf52/i;

    iget-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_3
    iget v0, v9, Lf52/d$a;->F:I

    iget-boolean v3, v9, Lf52/d$a;->w:Z

    iget-object v4, v9, Lf52/d$a;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v4, v9, Lf52/d$a;->z:Ljava/lang/Object;

    check-cast v4, Lud3/v0;

    iget-object v4, v9, Lf52/d$a;->y:Ljava/lang/Object;

    check-cast v4, Lf52/i;

    iget-object v5, v9, Lf52/d$a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, v3

    const/4 v3, 0x0

    goto/16 :goto_8

    :cond_4
    iget-boolean v0, v9, Lf52/d$a;->w:Z

    iget-object v3, v9, Lf52/d$a;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v3, v9, Lf52/d$a;->z:Ljava/lang/Object;

    check-cast v3, Lud3/v0;

    iget-object v3, v9, Lf52/d$a;->y:Ljava/lang/Object;

    check-cast v3, Lf52/i;

    iget-object v4, v9, Lf52/d$a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, v3

    const/4 v3, 0x0

    goto/16 :goto_6

    :cond_5
    iget-boolean v0, v9, Lf52/d$a;->w:Z

    iget-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v24, v2

    move v2, v0

    move-object/from16 v0, v24

    goto :goto_5

    :cond_7
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v0, :cond_8

    const-string v2, "console log"

    :goto_3
    move-object v3, v2

    goto :goto_4

    :cond_8
    const-string v2, "firmware event"

    goto :goto_3

    :goto_4
    iget-object v2, v1, Lf52/d;->a:Lf52/c;

    iput-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    iput-boolean v0, v9, Lf52/d$a;->w:Z

    iput v14, v9, Lf52/d$a;->I:I

    invoke-virtual {v2, v0, v9}, Lf52/c;->j(ZLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_6

    goto/16 :goto_9

    :goto_5
    move-object v8, v0

    check-cast v8, Lf52/i;

    if-eqz v8, :cond_11

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v8}, Lf52/i;->b()Ljava/nio/file/Path;

    move-result-object v4

    invoke-interface {v4}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    move-result-object v4

    const-string v5, "toFile(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lud3/h0;->e:Lyb3/p;

    const-string v5, "application/octet-stream"

    invoke-static {v5}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, v5}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object v4

    iget-object v0, v1, Lf52/d;->f:Ltr2/n;

    invoke-virtual {v8}, Lf52/i;->c()[J

    move-result-object v5

    array-length v5, v5

    invoke-virtual {v8}, Lf52/i;->b()Ljava/nio/file/Path;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lz83/a;->z(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object v14

    const-string v11, " bp "

    const-string v12, " packets file "

    const-string v13, "Uploading "

    invoke-static {v5, v13, v11, v3, v12}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v11, v15, [Lqr2/a$a;

    invoke-interface {v0, v5, v11}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v8}, Lf52/i;->a()Lf52/b;

    move-result-object v0

    invoke-virtual {v0}, Lf52/b;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ll83/k;

    const-string v11, "X-WHOOP-Device-Id"

    invoke-direct {v5, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lf52/i;->a()Lf52/b;

    move-result-object v0

    invoke-virtual {v0}, Lf52/b;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ll83/k;

    const-string v12, "X-WHOOP-Binary-Version"

    invoke-direct {v11, v12, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lf52/i;->a()Lf52/b;

    move-result-object v0

    invoke-virtual {v0}, Lf52/b;->c()Loh2/c;

    move-result-object v0

    invoke-virtual {v0}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ll83/k;

    const-string v13, "X-WHOOP-HW-Version"

    invoke-direct {v12, v13, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lf52/i;->a()Lf52/b;

    move-result-object v0

    invoke-virtual {v0}, Lf52/b;->b()Loh2/b$b;

    move-result-object v0

    invoke-virtual {v0}, Loh2/b$b;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v13, Ll83/k;

    const-string v14, "X-WHOOP-FW-Version"

    invoke-direct {v13, v14, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v1, Lf52/d;->d:Ljava/lang/String;

    new-instance v14, Ll83/k;

    const-string v15, "X-WHOOP-Device-OS"

    invoke-direct {v14, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v15, "X-WHOOP-Device-Platform"

    const-string v6, "ANDROID"

    invoke-direct {v0, v15, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v6, v1, Lf52/d;->c:Ljava/lang/String;

    new-instance v15, Ll83/k;

    const-string v7, "X-WHOOP-Device-Model"

    invoke-direct {v15, v7, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v22, v0

    move-object/from16 v17, v5

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    move-object/from16 v23, v15

    filled-new-array/range {v17 .. v23}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object v7, v1, Lf52/d;->f:Ltr2/n;

    const-string v5, "Failed to upload battery pack relative "

    invoke-static {v5, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object v3, v0

    new-instance v0, Lf52/d$b;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lf52/d$b;-><init>(Lf52/d;ZLjava/util/Map;Lud3/v0;Lq83/d;)V

    const/4 v3, 0x0

    iput-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    iput-object v8, v9, Lf52/d$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->z:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->E:Ljava/lang/Object;

    iput-boolean v2, v9, Lf52/d$a;->w:Z

    const/4 v4, 0x2

    iput v4, v9, Lf52/d$a;->I:I

    move-object v4, v6

    const/4 v6, 0x0

    move-object v5, v8

    move-object v8, v0

    move-object v0, v5

    move-object v5, v7

    move-object v7, v11

    invoke-virtual/range {v4 .. v9}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v10, :cond_9

    goto/16 :goto_9

    :cond_9
    move-object/from16 v24, v4

    move-object v4, v0

    move v0, v2

    move-object/from16 v2, v24

    :goto_6
    check-cast v2, Lu02/a;

    invoke-static {v2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpg3/v0;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v2, v2, Lud3/x0;->Q:Z

    goto :goto_7

    :cond_a
    const/4 v2, 0x0

    :goto_7
    invoke-virtual {v4}, Lf52/i;->b()Ljava/nio/file/Path;

    move-result-object v5

    invoke-static {v5}, Ljava/nio/file/Files;->deleteIfExists(Ljava/nio/file/Path;)Z

    move-result v5

    if-nez v5, :cond_b

    iget-object v5, v1, Lf52/d;->f:Ltr2/n;

    invoke-virtual {v4}, Lf52/i;->b()Ljava/nio/file/Path;

    move-result-object v6

    invoke-static {v6}, Lz83/a;->z(Ljava/nio/file/Path;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "Completed upload of bp packet file, but failed to delete it: "

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v8, v7, [Lqr2/a$a;

    invoke-interface {v5, v6, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_b
    if-eqz v2, :cond_d

    iget-object v5, v1, Lf52/d;->e:Lx42/b;

    invoke-virtual {v4}, Lf52/i;->c()[J

    move-result-object v6

    array-length v6, v6

    iput-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    iput-object v4, v9, Lf52/d$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->z:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->E:Ljava/lang/Object;

    iput-boolean v0, v9, Lf52/d$a;->w:Z

    iput v2, v9, Lf52/d$a;->F:I

    const/4 v7, 0x3

    iput v7, v9, Lf52/d$a;->I:I

    invoke-virtual {v5, v0, v6, v9}, Lx42/b;->i(ZILq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_c

    goto :goto_9

    :cond_c
    move/from16 v24, v2

    move v2, v0

    move/from16 v0, v24

    :goto_8
    iget-object v5, v1, Lf52/d;->a:Lf52/c;

    invoke-virtual {v4}, Lf52/i;->c()[J

    move-result-object v4

    iput-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->z:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->E:Ljava/lang/Object;

    iput-boolean v2, v9, Lf52/d$a;->w:Z

    iput v0, v9, Lf52/d$a;->F:I

    const/4 v3, 0x4

    iput v3, v9, Lf52/d$a;->I:I

    invoke-virtual {v5, v4, v2, v9}, Lf52/c;->h([JZLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_f

    goto :goto_9

    :cond_d
    iget-object v5, v1, Lf52/d;->e:Lx42/b;

    invoke-virtual {v4}, Lf52/i;->c()[J

    move-result-object v4

    array-length v4, v4

    iput-object v3, v9, Lf52/d$a;->x:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->y:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->z:Ljava/lang/Object;

    iput-object v3, v9, Lf52/d$a;->E:Ljava/lang/Object;

    iput-boolean v0, v9, Lf52/d$a;->w:Z

    iput v2, v9, Lf52/d$a;->F:I

    const/4 v3, 0x5

    iput v3, v9, Lf52/d$a;->I:I

    invoke-virtual {v5, v0, v4, v9}, Lx42/b;->g(ZILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_e

    :goto_9
    return-object v10

    :cond_e
    move v0, v2

    :cond_f
    :goto_a
    if-eqz v0, :cond_10

    const/4 v14, 0x1

    goto :goto_b

    :cond_10
    const/4 v14, 0x0

    :goto_b
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_11
    iget-object v0, v1, Lf52/d;->f:Ltr2/n;

    const-string v2, "No battery pack relative "

    const-string v4, " to upload"

    invoke-static {v2, v3, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    new-array v3, v7, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method


# virtual methods
.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lf52/d;->f(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lf52/d;->f(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
