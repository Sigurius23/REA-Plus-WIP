.class public final Lcom/whoop/puffin/sync/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/c;",
        "",
        "Ltr2/n;",
        "logger",
        "Lf52/f;",
        "batterySyncInteractor",
        "Lic/p0;",
        "workManager",
        "Lx42/b;",
        "metricWriter",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Ltr2/n;Lf52/f;Lic/p0;Lx42/b;Ljava/time/Clock;)V",
        "Ly42/a;",
        "puffin",
        "Lcom/whoop/puffin/sync/f$b;",
        "i",
        "(Ly42/a;Lq83/d;)Ljava/lang/Object;",
        "Lvk0/i;",
        "gattService",
        "Ll83/a0;",
        "a",
        "(Lvk0/i;Lq83/d;)Ljava/lang/Object;",
        "h",
        "j",
        "Ltr2/n;",
        "b",
        "Lf52/f;",
        "c",
        "Lic/p0;",
        "d",
        "Lx42/b;",
        "e",
        "Ljava/time/Clock;",
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
.field private final a:Ltr2/n;

.field private final b:Lf52/f;

.field private final c:Lic/p0;

.field private final d:Lx42/b;

.field private final e:Ljava/time/Clock;


# direct methods
.method public constructor <init>(Ltr2/n;Lf52/f;Lic/p0;Lx42/b;Ljava/time/Clock;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batterySyncInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/puffin/sync/c;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Lcom/whoop/puffin/sync/c;->b:Lf52/f;

    .line 4
    iput-object p3, p0, Lcom/whoop/puffin/sync/c;->c:Lic/p0;

    .line 5
    iput-object p4, p0, Lcom/whoop/puffin/sync/c;->d:Lx42/b;

    .line 6
    iput-object p5, p0, Lcom/whoop/puffin/sync/c;->e:Ljava/time/Clock;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Lf52/f;Lic/p0;Lx42/b;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "BatterySyncHolder"

    invoke-virtual {p1, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    .line 8
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p5

    const-string p6, "systemDefaultZone(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 9
    invoke-direct/range {p2 .. p7}, Lcom/whoop/puffin/sync/c;-><init>(Ltr2/n;Lf52/f;Lic/p0;Lx42/b;Ljava/time/Clock;)V

    return-void
.end method

.method private final a(Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "AbortHistorySync puffin response - "

    instance-of v1, p2, Lcom/whoop/puffin/sync/c$a;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lcom/whoop/puffin/sync/c$a;

    iget v2, v1, Lcom/whoop/puffin/sync/c$a;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/puffin/sync/c$a;->z:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lcom/whoop/puffin/sync/c$a;

    invoke-direct {v1, p0, p2}, Lcom/whoop/puffin/sync/c$a;-><init>(Lcom/whoop/puffin/sync/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Lcom/whoop/puffin/sync/c$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v7, Lcom/whoop/puffin/sync/c$a;->z:I

    const/4 v10, 0x0

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v7, Lcom/whoop/puffin/sync/c$a;->w:Ljava/lang/Object;

    check-cast p1, Lvk0/i;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, v3

    :try_start_1
    new-instance v3, La52/c;

    invoke-direct {v3}, La52/c;-><init>()V

    const/4 v2, 0x0

    iput-object v2, v7, Lcom/whoop/puffin/sync/c$a;->w:Ljava/lang/Object;

    iput p2, v7, Lcom/whoop/puffin/sync/c$a;->z:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v9}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    iget-object p2, p0, Lcom/whoop/puffin/sync/c;->a:Ltr2/n;

    invoke-static {p1}, Ll83/n;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v10, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :goto_3
    iget-object p2, p0, Lcom/whoop/puffin/sync/c;->a:Ltr2/n;

    const-string v0, "Timeout while aborting history sync"

    new-array v1, v10, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static final synthetic b(Lcom/whoop/puffin/sync/c;Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/puffin/sync/c;->a(Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/puffin/sync/c;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lcom/whoop/puffin/sync/c;->e:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/puffin/sync/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/puffin/sync/c;->a:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/puffin/sync/c;)Lx42/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/puffin/sync/c;->d:Lx42/b;

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/puffin/sync/c;)Lic/p0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/puffin/sync/c;->c:Lic/p0;

    return-object p0
.end method

.method public static final synthetic g(Lcom/whoop/puffin/sync/c;Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/puffin/sync/c;->i(Ly42/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/puffin/sync/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/puffin/sync/c$c;

    iget v1, v0, Lcom/whoop/puffin/sync/c$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/puffin/sync/c$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/puffin/sync/c$c;

    invoke-direct {v0, p0, p2}, Lcom/whoop/puffin/sync/c$c;-><init>(Lcom/whoop/puffin/sync/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/puffin/sync/c$c;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/puffin/sync/c$c;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/whoop/puffin/sync/c$c;->E:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    iget-object p1, v0, Lcom/whoop/puffin/sync/c$c;->z:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v0, Lcom/whoop/puffin/sync/c$c;->y:Ljava/lang/Object;

    check-cast v1, Lc52/d;

    iget-object v1, v0, Lcom/whoop/puffin/sync/c$c;->x:Ljava/lang/Object;

    check-cast v1, Lvk0/i;

    iget-object v0, v0, Lcom/whoop/puffin/sync/c$c;->w:Ljava/lang/Object;

    check-cast v0, Ly42/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/whoop/puffin/sync/c$c;->z:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lcom/whoop/puffin/sync/c$c;->y:Ljava/lang/Object;

    check-cast v2, Lc52/d;

    iget-object v2, v0, Lcom/whoop/puffin/sync/c$c;->x:Ljava/lang/Object;

    check-cast v2, Lvk0/i;

    iget-object v5, v0, Lcom/whoop/puffin/sync/c$c;->w:Ljava/lang/Object;

    check-cast v5, Ly42/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto/16 :goto_5

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lvk0/i;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Lvk0/i;

    move-object v2, p2

    goto :goto_1

    :cond_4
    move-object v2, v6

    :goto_1
    if-eqz v2, :cond_a

    invoke-interface {p1}, Ly42/a;->O()Lc52/d;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v7, Lkotlin/jvm/internal/g0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    :try_start_1
    invoke-interface {p1}, Ly42/a;->s()Lec3/l;

    move-result-object p1

    sget-object v8, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v8, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/4 v9, 0x5

    invoke-static {v9, v8}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lec3/v;->O(Lec3/l;J)La6/u;

    move-result-object p1

    iget-object v8, p0, Lcom/whoop/puffin/sync/c;->b:Lf52/f;

    invoke-static {p1, v8, p2}, Lf52/e;->a(Lec3/l;Lf52/f;Lc52/d;)Lec3/l;

    move-result-object p1

    new-instance p2, Lcom/whoop/puffin/sync/c$d;

    invoke-direct {p2, v7, v6}, Lcom/whoop/puffin/sync/c$d;-><init>(Lkotlin/jvm/internal/g0;Lq83/d;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    new-instance v8, Lec3/a0;

    invoke-direct {v8, p1, p2}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    new-instance p1, Lcom/whoop/puffin/sync/c$e;

    invoke-direct {p1, p0, v2, v6}, Lcom/whoop/puffin/sync/c$e;-><init>(Lcom/whoop/puffin/sync/c;Lvk0/i;Lq83/d;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    new-instance p2, Lec3/j1;

    invoke-direct {p2, v8, p1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :try_start_5
    new-instance p1, Lcom/whoop/puffin/sync/c$f;

    invoke-direct {p1, v7, v6}, Lcom/whoop/puffin/sync/c$f;-><init>(Lkotlin/jvm/internal/g0;Lq83/d;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    new-instance v8, La1/h;

    invoke-direct {v8, p2, p1, v6}, La1/h;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v8}, Lec3/s1;-><init>(Lc93/m;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :try_start_7
    iput-object v6, v0, Lcom/whoop/puffin/sync/c$c;->w:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/puffin/sync/c$c;->x:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/puffin/sync/c$c;->y:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/puffin/sync/c$c;->z:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/puffin/sync/c$c;->H:I

    invoke-static {p1, v0}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    if-ne p1, v1, :cond_5

    goto :goto_6

    :cond_5
    move-object p1, v7

    :goto_2
    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v0, p2, Lcom/whoop/puffin/sync/f$b;

    if-eqz v0, :cond_6

    move-object v6, p2

    check-cast v6, Lcom/whoop/puffin/sync/f$b;

    :cond_6
    if-eqz v6, :cond_7

    return-object v6

    :cond_7
    new-instance p2, Ljava/lang/IllegalStateException;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const-string v0, "HPS ended with non terminal "

    invoke-static {p1, v0}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catch_1
    move-exception p2

    :goto_3
    move-object p1, v7

    goto :goto_5

    :goto_4
    move-object p2, p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_4

    :catch_3
    move-exception p1

    goto :goto_4

    :goto_5
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v5

    invoke-static {v5}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v5, p0, Lcom/whoop/puffin/sync/c;->a:Ltr2/n;

    const-string v7, "Error during BP HPS"

    new-array v8, v3, [Lqr2/a$a;

    invoke-interface {v5, v7, p2, v8}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of p2, p2, Lcom/whoop/puffin/sync/f$b$d;

    if-nez p2, :cond_8

    iget-object p2, p0, Lcom/whoop/puffin/sync/c;->a:Ltr2/n;

    const-string v5, "sending abort command to BP"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p2, v5, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v6, v0, Lcom/whoop/puffin/sync/c$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/puffin/sync/c$c;->x:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/puffin/sync/c$c;->y:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/puffin/sync/c$c;->z:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/puffin/sync/c$c;->E:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/puffin/sync/c$c;->H:I

    invoke-direct {p0, v2, v0}, Lcom/whoop/puffin/sync/c;->a(Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    :goto_6
    return-object v1

    :cond_8
    :goto_7
    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/puffin/sync/f;

    invoke-static {p1}, Lcom/whoop/puffin/sync/g;->a(Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$a;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Battery pack metadata must be present for HPS"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Puffin must be a GenericGattService"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final h(Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/puffin/sync/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/puffin/sync/c$b;-><init>(Ly42/a;Lcom/whoop/puffin/sync/c;Lq83/d;)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/whoop/puffin/sync/c;->a(Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
