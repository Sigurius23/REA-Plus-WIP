.class public final Lum0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lum0/e$a;,
        Lum0/e$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u000f\u0012B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lum0/e;",
        "",
        "Lum0/a;",
        "dao",
        "Ljs0/c;",
        "configurationRepository",
        "Lvm0/b;",
        "events",
        "Lfy1/g;",
        "nanoClock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lum0/a;Ljs0/c;Lvm0/b;Lfy1/g;Ltr2/n;)V",
        "Ll83/a0;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lum0/a;",
        "b",
        "Ljs0/c;",
        "c",
        "Lvm0/b;",
        "d",
        "Lfy1/g;",
        "e",
        "Ltr2/n;",
        "f",
        "cache_release"
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
.field private static final f:Lum0/e$b;


# instance fields
.field private final a:Lum0/a;

.field private final b:Ljs0/c;

.field private final c:Lvm0/b;

.field private final d:Lfy1/g;

.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lum0/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lum0/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lum0/e;->f:Lum0/e$b;

    return-void
.end method

.method public constructor <init>(Lum0/a;Ljs0/c;Lvm0/b;Lfy1/g;Ltr2/n;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "events"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nanoClock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lum0/e;->a:Lum0/a;

    .line 3
    iput-object p2, p0, Lum0/e;->b:Ljs0/c;

    .line 4
    iput-object p3, p0, Lum0/e;->c:Lvm0/b;

    .line 5
    iput-object p4, p0, Lum0/e;->d:Lfy1/g;

    .line 6
    iput-object p5, p0, Lum0/e;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lum0/a;Ljs0/c;Lvm0/b;Lfy1/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 7
    new-instance p4, Lfy1/n;

    invoke-direct {p4}, Lfy1/n;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 8
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "CacheMaintainer"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lum0/e;-><init>(Lum0/a;Ljs0/c;Lvm0/b;Lfy1/g;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lum0/e$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lum0/e$c;

    iget v1, v0, Lum0/e$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lum0/e$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lum0/e$c;

    invoke-direct {v0, p0, p1}, Lum0/e$c;-><init>(Lum0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lum0/e$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lum0/e$c;->E:I

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v5, :cond_1

    iget-wide v0, v0, Lum0/e$c;->x:J

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lum0/e$c;->w:I

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lum0/e;->b:Ljs0/c;

    sget-object v2, Lum0/e$a;->a:Lum0/e$a;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v2

    const-class v7, Ljava/lang/Integer;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_4

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_1

    :cond_4
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v10

    goto :goto_1

    :cond_5
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v10

    goto :goto_1

    :cond_6
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v10

    goto :goto_1

    :cond_7
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_1

    :cond_8
    const-class v9, Ljava/lang/String;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {p1, v6}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_1

    :cond_9
    move-object v10, v2

    :cond_a
    :goto_1
    if-nez v10, :cond_b

    goto :goto_2

    :cond_b
    move-object v2, v10

    :goto_2
    if-eqz v2, :cond_10

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-gtz v2, :cond_c

    return-object v4

    :cond_c
    iget-object p1, p0, Lum0/e;->a:Lum0/a;

    iput v2, v0, Lum0/e$c;->w:I

    iput v3, v0, Lum0/e$c;->E:I

    invoke-virtual {p1, v0}, Lum0/a;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    goto :goto_4

    :cond_d
    :goto_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-ge p1, v2, :cond_e

    return-object v4

    :cond_e
    iget-object p1, p0, Lum0/e;->d:Lfy1/g;

    invoke-interface {p1}, Lfy1/g;->a()J

    move-result-wide v6

    iget-object p1, p0, Lum0/e;->a:Lum0/a;

    div-int/lit8 v3, v2, 0x2

    iput v2, v0, Lum0/e$c;->w:I

    iput-wide v6, v0, Lum0/e$c;->x:J

    iput v5, v0, Lum0/e$c;->E:I

    invoke-virtual {p1, v3, v0}, Lum0/a;->c(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    :goto_4
    return-object v1

    :cond_f
    move-wide v0, v6

    :goto_5
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v2, p0, Lum0/e;->d:Lfy1/g;

    invoke-interface {v2}, Lfy1/g;->a()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr v2, v0

    iget-object v0, p0, Lum0/e;->c:Lvm0/b;

    new-instance v1, Lvm0/a$c;

    invoke-direct {v1, p1, v2, v3}, Lvm0/a$c;-><init>(IJ)V

    invoke-virtual {v0, v1}, Lvm0/b;->a(Lvm0/a;)V

    goto :goto_7

    :cond_10
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_6
    iget-object v0, p0, Lum0/e;->e:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "BFF cache maintenance failed"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_7
    return-object v4
.end method
