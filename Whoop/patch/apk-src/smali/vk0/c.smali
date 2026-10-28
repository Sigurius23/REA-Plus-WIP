.class public final Lvk0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B7\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J5\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lvk0/c;",
        "Lvk0/b;",
        "Lsj2/b;",
        "Lvk0/e;",
        "executionService",
        "Lvk0/h;",
        "crpDataDogMetrics",
        "Ljs0/c;",
        "configRepo",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lsj2/b;Lvk0/h;Ljs0/c;Ljava/time/Clock;Ltr2/n;)V",
        "Lst0/v;",
        "whoopDeviceType",
        "Ll83/a0;",
        "i",
        "(Lst0/v;)V",
        "Lvk0/a;",
        "bleTask",
        "Lsj2/a;",
        "executionPriority",
        "Lvk0/i;",
        "gattService",
        "Lbc3/i0;",
        "a",
        "(Lvk0/a;Lsj2/a;Lvk0/i;Lst0/v;)Lbc3/i0;",
        "Lsj2/b;",
        "b",
        "Lvk0/h;",
        "c",
        "Ljs0/c;",
        "getConfigRepo",
        "()Ljs0/c;",
        "d",
        "Ljava/time/Clock;",
        "f",
        "()Ljava/time/Clock;",
        "e",
        "Ltr2/n;",
        "",
        "g",
        "()J",
        "longRunningTaskTimeout",
        "connectivity_release"
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
.field private final a:Lsj2/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsj2/b<",
            "Lvk0/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lvk0/h;

.field private final c:Ljs0/c;

.field private final d:Ljava/time/Clock;

.field private final e:Ltr2/n;


# direct methods
.method public constructor <init>(Lsj2/b;Lvk0/h;Ljs0/c;Ljava/time/Clock;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsj2/b<",
            "Lvk0/e;",
            ">;",
            "Lvk0/h;",
            "Ljs0/c;",
            "Ljava/time/Clock;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "executionService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crpDataDogMetrics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configRepo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk0/c;->a:Lsj2/b;

    iput-object p2, p0, Lvk0/c;->b:Lvk0/h;

    iput-object p3, p0, Lvk0/c;->c:Ljs0/c;

    iput-object p4, p0, Lvk0/c;->d:Ljava/time/Clock;

    iput-object p5, p0, Lvk0/c;->e:Ltr2/n;

    return-void
.end method

.method public static synthetic b(Lvk0/c;Lvk0/a;Lst0/v;Lkotlin/jvm/internal/f0;Ljava/lang/Throwable;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvk0/c;->h(Lvk0/c;Lvk0/a;Lst0/v;Lkotlin/jvm/internal/f0;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lvk0/c;)Lvk0/h;
    .locals 0

    iget-object p0, p0, Lvk0/c;->b:Lvk0/h;

    return-object p0
.end method

.method public static final synthetic d(Lvk0/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvk0/c;->e:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lvk0/c;)J
    .locals 2

    invoke-direct {p0}, Lvk0/c;->g()J

    move-result-wide v0

    return-wide v0
.end method

.method private final g()J
    .locals 7

    iget-object v0, p0, Lvk0/c;->c:Ljs0/c;

    sget-object v1, Lvk0/l;->a:Lvk0/l;

    invoke-virtual {v0}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v0

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Long;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_0

    :cond_0
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_0

    :cond_1
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_0

    :cond_4
    const-class v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v2}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_5
    move-object v6, v1

    :cond_6
    :goto_0
    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move-object v1, v6

    :goto_1
    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final h(Lvk0/c;Lvk0/a;Lst0/v;Lkotlin/jvm/internal/f0;Ljava/lang/Throwable;)Ll83/a0;
    .locals 9

    iget-object p4, p0, Lvk0/c;->b:Lvk0/h;

    check-cast p1, Lvk0/j;

    invoke-interface {p1}, Lvk0/j;->F()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1, p2}, Lvk0/h;->l(Ljava/lang/String;ZLst0/v;)V

    iget-object v2, p0, Lvk0/c;->b:Lvk0/h;

    invoke-interface {p1}, Lvk0/j;->F()Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p3, Lkotlin/jvm/internal/f0;->w:J

    iget-object p0, p0, Lvk0/c;->d:Ljava/time/Clock;

    invoke-virtual {p0}, Ljava/time/Clock;->millis()J

    move-result-wide v6

    move-object v8, p2

    invoke-virtual/range {v2 .. v8}, Lvk0/h;->m(Ljava/lang/String;JJLst0/v;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final i(Lst0/v;)V
    .locals 3

    iget-object v0, p0, Lvk0/c;->b:Lvk0/h;

    iget-object v1, p0, Lvk0/c;->a:Lsj2/b;

    sget-object v2, Lsj2/a$b;->a:Lsj2/a$b;

    invoke-interface {v1, v2}, Lsj2/b;->a(Lsj2/a;)I

    move-result v1

    invoke-virtual {v2}, Lsj2/a$b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lvk0/h;->k(ILjava/lang/String;Lst0/v;)V

    iget-object v0, p0, Lvk0/c;->b:Lvk0/h;

    iget-object v1, p0, Lvk0/c;->a:Lsj2/b;

    sget-object v2, Lsj2/a$c;->a:Lsj2/a$c;

    invoke-interface {v1, v2}, Lsj2/b;->a(Lsj2/a;)I

    move-result v1

    invoke-virtual {v2}, Lsj2/a$c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lvk0/h;->k(ILjava/lang/String;Lst0/v;)V

    iget-object v0, p0, Lvk0/c;->b:Lvk0/h;

    iget-object v1, p0, Lvk0/c;->a:Lsj2/b;

    sget-object v2, Lsj2/a$a;->a:Lsj2/a$a;

    invoke-interface {v1, v2}, Lsj2/b;->a(Lsj2/a;)I

    move-result v1

    invoke-virtual {v2}, Lsj2/a$a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lvk0/h;->k(ILjava/lang/String;Lst0/v;)V

    return-void
.end method


# virtual methods
.method public a(Lvk0/a;Lsj2/a;Lvk0/i;Lst0/v;)Lbc3/i0;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/a;",
            "Lsj2/a;",
            "Lvk0/i;",
            "Lst0/v;",
            ")",
            "Lbc3/i0;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v9, p2

    move-object/from16 v5, p3

    move-object/from16 v3, p4

    const-string v0, "bleTask"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executionPriority"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gattService"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopDeviceType"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Lvk0/c;->i(Lst0/v;)V

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkotlin/jvm/internal/g0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    instance-of v0, v2, Lvk0/g;

    const-string v10, ", returning error"

    const-string v11, " was interrupted due to "

    const-string v12, "Task "

    const-string v7, " to the queue"

    const-string v8, "Submitting task "

    if-eqz v0, :cond_6

    :try_start_0
    move-object v0, v2

    check-cast v0, Lvk0/g;

    iget-object v15, v1, Lvk0/c;->e:Ltr2/n;

    invoke-interface {v0, v3}, Lvk0/g;->s(Lst0/v;)Llt0/a;

    move-result-object v14

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    new-array v13, v8, [Lqr2/a$a;

    invoke-interface {v15, v7, v13}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-interface {v0, v3}, Lvk0/g;->s(Lst0/v;)Llt0/a;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    if-eqz v7, :cond_0

    :try_start_1
    invoke-interface {v7}, Llt0/a;->commandName()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v9, v0

    move-object v15, v1

    move-object v7, v4

    move-object v8, v6

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-nez v7, :cond_1

    const-string v7, ""
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :try_start_2
    iput-object v7, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v8, v1, Lvk0/c;->b:Lvk0/h;

    invoke-virtual {v8, v7, v3}, Lvk0/h;->g(Ljava/lang/String;Lst0/v;)V

    iget-object v13, v1, Lvk0/c;->a:Lsj2/b;

    iget-object v7, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v14, v7

    check-cast v14, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    move-object v2, v6

    move-object v6, v0

    :try_start_3
    new-instance v0, Lvk0/c$a;

    const/4 v8, 0x0

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v8}, Lvk0/c$a;-><init>(Lvk0/c;Lkotlin/jvm/internal/g0;Lst0/v;Lkotlin/jvm/internal/g0;Lvk0/i;Lvk0/g;Lvk0/a;Lq83/d;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-object v15, v1

    move-object v8, v2

    move-object v7, v4

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, v0

    move-object v2, v9

    move-object v0, v13

    move-object v1, v14

    :try_start_4
    invoke-static/range {v0 .. v6}, Lsj2/b;->b(Lsj2/b;Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lbc3/i0;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    :goto_1
    move-object v9, v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v15, v1

    move-object v8, v2

    move-object v7, v4

    goto :goto_1

    :catch_3
    move-exception v0

    move-object v15, v1

    move-object v7, v4

    move-object v8, v6

    goto :goto_1

    :goto_2
    iget-object v0, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v1, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v1, :cond_2

    move-object v2, v0

    iget-object v0, v15, Lvk0/c;->b:Lvk0/h;

    check-cast v1, Ljava/lang/String;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    iget-object v2, v15, Lvk0/c;->d:Ljava/time/Clock;

    invoke-virtual {v2}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    const/4 v2, 0x0

    move-object/from16 v7, p4

    invoke-virtual/range {v0 .. v7}, Lvk0/h;->h(Ljava/lang/String;ZJJLst0/v;)V

    move-object v3, v7

    goto :goto_3

    :cond_2
    move-object/from16 v3, p4

    :goto_3
    instance-of v0, v9, Lcom/whoop/taskexecutor/TaskInterruptedException;

    if-nez v0, :cond_4

    instance-of v0, v9, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    throw v9

    :cond_4
    :goto_4
    instance-of v0, v9, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v0, :cond_5

    iget-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_5

    iget-object v1, v15, Lvk0/c;->b:Lvk0/h;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0, v3}, Lvk0/h;->j(Ljava/lang/String;Lst0/v;)V

    :cond_5
    iget-object v0, v15, Lvk0/c;->e:Ltr2/n;

    move-object/from16 v1, p1

    check-cast v1, Lvk0/g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lvk0/g;->B(Lvk0/g;Lst0/v;ILjava/lang/Object;)Llt0/a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    new-array v2, v8, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lvk0/e$a;

    invoke-direct {v0, v9}, Lvk0/e$a;-><init>(Ljava/lang/Exception;)V

    new-instance v1, Lbc3/t;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lbc3/t;-><init>(Lbc3/k1;)V

    invoke-virtual {v1, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-object v1

    :cond_6
    move-object v15, v1

    instance-of v0, v2, Lvk0/j;

    if-eqz v0, :cond_7

    iget-object v0, v15, Lvk0/c;->e:Ltr2/n;

    move-object v13, v2

    check-cast v13, Lvk0/j;

    invoke-interface {v13}, Lvk0/j;->F()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    new-array v4, v8, [Lqr2/a$a;

    invoke-interface {v0, v1, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lkotlin/jvm/internal/f0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v0, v15, Lvk0/c;->d:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    iput-wide v0, v4, Lkotlin/jvm/internal/f0;->w:J

    :try_start_5
    iget-object v7, v15, Lvk0/c;->a:Lsj2/b;

    move-object v0, v2

    check-cast v0, Lvk0/j;

    invoke-interface {v0}, Lvk0/j;->F()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lvk0/c$b;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    const/4 v6, 0x0

    move-object v1, v4

    move-object v4, v3

    move-object v3, v1

    move-object/from16 v5, p3

    move-object v1, v2

    move-object v2, v15

    :try_start_6
    invoke-direct/range {v0 .. v6}, Lvk0/c$b;-><init>(Lvk0/a;Lvk0/c;Lkotlin/jvm/internal/f0;Lst0/v;Lvk0/i;Lq83/d;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    move-object v2, v1

    :try_start_7
    new-instance v1, Lvk0/c$c;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v5, v4}, Lvk0/c$c;-><init>(Lvk0/a;Lvk0/i;Lq83/d;)V

    invoke-interface {v7, v8, v9, v0, v1}, Lsj2/b;->c(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;

    move-result-object v6

    new-instance v0, Ld0/a;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    const/4 v5, 0x5

    move-object/from16 v1, p0

    move-object v4, v3

    move-object/from16 v3, p4

    :try_start_8
    invoke-direct/range {v0 .. v5}, Ld0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v2, v6

    check-cast v2, Lbc3/t1;

    invoke-virtual {v2, v0}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    return-object v6

    :catch_4
    move-exception v0

    goto :goto_5

    :catch_5
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_5

    :catch_6
    move-exception v0

    move-object v1, v2

    goto :goto_5

    :catch_7
    move-exception v0

    move-object v1, v15

    :goto_5
    iget-object v2, v1, Lvk0/c;->e:Ltr2/n;

    invoke-interface {v13}, Lvk0/j;->F()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    new-array v4, v8, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    throw v0

    :cond_7
    move-object v1, v15

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final f()Ljava/time/Clock;
    .locals 1

    iget-object v0, p0, Lvk0/c;->d:Ljava/time/Clock;

    return-object v0
.end method
