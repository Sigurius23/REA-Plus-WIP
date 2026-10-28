.class public final Lhg1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg1/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 \'2\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010$R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lhg1/d;",
        "Lhg1/c;",
        "Ltr2/n;",
        "logger",
        "Ljava/io/File;",
        "androidCacheDir",
        "Lfg1/c;",
        "firmwareEventsRoomInteractor",
        "Ljs0/c;",
        "configurationRepository",
        "Lmh2/a;",
        "strapMetadataDaoInteractor",
        "Lvt0/a;",
        "dataPacketUploadFileWriter",
        "<init>",
        "(Ltr2/n;Ljava/io/File;Lfg1/c;Ljs0/c;Lmh2/a;Lvt0/a;)V",
        "",
        "Lbu0/a;",
        "records",
        "Lfg1/b;",
        "e",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "oldestTimestamp",
        "newestTimestamp",
        "Ll83/a0;",
        "a",
        "(JJLq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Ljava/io/File;",
        "c",
        "Lfg1/c;",
        "d",
        "Ljs0/c;",
        "Lmh2/a;",
        "f",
        "Lvt0/a;",
        "g",
        "firmware-events_release"
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
.field public static final g:Lhg1/d$a;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Ljava/io/File;

.field private final c:Lfg1/c;

.field private final d:Ljs0/c;

.field private final e:Lmh2/a;

.field private final f:Lvt0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhg1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhg1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhg1/d;->g:Lhg1/d$a;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Ljava/io/File;Lfg1/c;Ljs0/c;Lmh2/a;Lvt0/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidCacheDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareEventsRoomInteractor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapMetadataDaoInteractor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacketUploadFileWriter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg1/d;->a:Ltr2/n;

    iput-object p2, p0, Lhg1/d;->b:Ljava/io/File;

    iput-object p3, p0, Lhg1/d;->c:Lfg1/c;

    iput-object p4, p0, Lhg1/d;->d:Ljs0/c;

    iput-object p5, p0, Lhg1/d;->e:Lmh2/a;

    iput-object p6, p0, Lhg1/d;->f:Lvt0/a;

    return-void
.end method

.method public static final synthetic c(Lhg1/d;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lhg1/d;->b:Ljava/io/File;

    return-object p0
.end method

.method public static final synthetic d(Lhg1/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lhg1/d;->e(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Lfg1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v0, p2

    instance-of v1, v0, Lhg1/d$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lhg1/d$c;

    iget v2, v1, Lhg1/d$c;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lhg1/d$c;->G:I

    :goto_0
    move-object v8, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lhg1/d$c;

    invoke-direct {v1, p0, p2}, Lhg1/d$c;-><init>(Lhg1/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Lhg1/d$c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Lhg1/d$c;->G:I

    const/4 v11, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v12, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v8, Lhg1/d$c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v2, v8, Lhg1/d$c;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v2, v8, Lhg1/d$c;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v1

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v8, Lhg1/d$c;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v4, v8, Lhg1/d$c;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    invoke-static {v0}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v2

    :try_start_2
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v5, Lhg1/d$d;

    invoke-direct {v5, v2, p0, v12}, Lhg1/d$d;-><init>(Lkotlin/jvm/internal/g0;Lhg1/d;Lq83/d;)V

    iput-object p1, v8, Lhg1/d$c;->w:Ljava/lang/Object;

    iput-object v2, v8, Lhg1/d$c;->x:Ljava/lang/Object;

    iput v4, v8, Lhg1/d$c;->G:I

    invoke-static {v0, v5, v8}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, p1

    :goto_2
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    if-eqz v0, :cond_6

    iget-object v2, p0, Lhg1/d;->f:Lvt0/a;

    iput-object v12, v8, Lhg1/d$c;->w:Ljava/lang/Object;

    iput-object v12, v8, Lhg1/d$c;->x:Ljava/lang/Object;

    iput-object v0, v8, Lhg1/d$c;->y:Ljava/lang/Object;

    iput v11, v8, Lhg1/d$c;->z:I

    iput v3, v8, Lhg1/d$c;->G:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0x1c

    const/4 v10, 0x0

    move-object v3, v0

    invoke-static/range {v2 .. v10}, Lvt0/a;->b(Lvt0/a;Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    :goto_4
    check-cast v0, Lvt0/b;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lhg1/d;->e:Lmh2/a;

    invoke-virtual {v0}, Lvt0/b;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Lmh2/a;->g(I)Loh2/a;

    move-result-object v2

    new-instance v1, Lfg1/b;

    invoke-virtual {v0}, Lvt0/b;->b()J

    move-result-wide v4

    invoke-virtual {v0}, Lvt0/b;->a()J

    move-result-wide v6

    invoke-virtual {v0}, Lvt0/b;->d()J

    move-result-wide v8

    long-to-int v8, v8

    invoke-direct/range {v1 .. v8}, Lfg1/b;-><init>(Loh2/a;Ljava/io/File;JJI)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :goto_5
    iget-object v1, p0, Lhg1/d;->a:Ltr2/n;

    const-string v2, "Something went wrong trying to create a temp file to write fw events"

    new-array v3, v11, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->i(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_6
    return-object v12
.end method


# virtual methods
.method public a(JJLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lhg1/d;->c:Lfg1/c;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lfg1/c;->d(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfg1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lhg1/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lhg1/d$b;

    iget v1, v0, Lhg1/d$b;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhg1/d$b;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhg1/d$b;

    invoke-direct {v0, p0, p1}, Lhg1/d$b;-><init>(Lhg1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lhg1/d$b;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhg1/d$b;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lhg1/d$b;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lhg1/d$b;->x:I

    iget v4, v0, Lhg1/d$b;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget v2, v0, Lhg1/d$b;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lhg1/d;->d:Ljs0/c;

    sget-object v2, Lhg1/d$a$a;->a:Lhg1/d$a$a;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v10, Ljava/lang/Integer;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_1

    :cond_5
    move-object p1, v7

    goto/16 :goto_1

    :cond_6
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :cond_7
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    goto :goto_1

    :cond_8
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    goto :goto_1

    :cond_9
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_a
    const-class v11, Ljava/lang/String;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_b
    move-object p1, v2

    :goto_1
    if-nez p1, :cond_c

    goto :goto_2

    :cond_c
    move-object v2, p1

    :goto_2
    if-eqz v2, :cond_12

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v2, p0, Lhg1/d;->c:Lfg1/c;

    iput p1, v0, Lhg1/d$b;->w:I

    iput v5, v0, Lhg1/d$b;->F:I

    invoke-interface {v2, v0}, Lfg1/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_d

    goto :goto_5

    :cond_d
    move-object v12, v2

    move v2, p1

    move-object p1, v12

    :goto_3
    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v5, p0, Lhg1/d;->c:Lfg1/c;

    iput v2, v0, Lhg1/d$b;->w:I

    iput p1, v0, Lhg1/d$b;->x:I

    iput v4, v0, Lhg1/d$b;->F:I

    invoke-interface {v5, p1, v2, v0}, Lfg1/c;->a(IILq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_e

    goto :goto_5

    :cond_e
    move v12, v2

    move v2, p1

    move-object p1, v4

    move v4, v12

    :goto_4
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object p1, p0, Lhg1/d;->a:Ltr2/n;

    const-string v0, "No firmware events found for version "

    invoke-static {v2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v7

    :cond_f
    iget-object v5, p0, Lhg1/d;->a:Ltr2/n;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    const-string v9, " number of firmware event packets for version "

    const-string v10, " to cloud"

    const-string v11, "Uploading "

    invoke-static {v8, v2, v11, v9, v10}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v5, v8, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v7, v0, Lhg1/d$b;->y:Ljava/lang/Object;

    iput v4, v0, Lhg1/d$b;->w:I

    iput v2, v0, Lhg1/d$b;->x:I

    iput v3, v0, Lhg1/d$b;->F:I

    invoke-direct {p0, p1, v0}, Lhg1/d;->e(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_10

    :goto_5
    return-object v1

    :cond_10
    return-object p1

    :cond_11
    iget-object p1, p0, Lhg1/d;->a:Ltr2/n;

    const-string v0, "No firmware events found in database"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v7

    :cond_12
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
