.class final Lvg0/b0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic y:Lkotlin/jvm/internal/b0;

.field final synthetic z:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/b0;Ldc3/u;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lkotlin/jvm/internal/g0;",
            "Lkotlin/jvm/internal/b0;",
            "Ldc3/u;",
            "J)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/b0$a$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lvg0/b0$a$a;->x:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Lvg0/b0$a$a;->y:Lkotlin/jvm/internal/b0;

    iput-object p4, p0, Lvg0/b0$a$a;->z:Ldc3/u;

    iput-wide p5, p0, Lvg0/b0$a$a;->E:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ltg0/c;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lvg0/b0$a$a$b;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lvg0/b0$a$a$b;

    iget v4, v3, Lvg0/b0$a$a$b;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lvg0/b0$a$a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lvg0/b0$a$a$b;

    invoke-direct {v3, v0, v2}, Lvg0/b0$a$a$b;-><init>(Lvg0/b0$a$a;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lvg0/b0$a$a$b;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lvg0/b0$a$a$b;->z:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v10, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    check-cast v1, Ltg0/c;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    check-cast v1, Ltg0/c;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_3
    iget-object v1, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    check-cast v1, Ltg0/c;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_4
    iget-object v1, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    check-cast v1, Ltg0/c;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lvg0/b0$a$a;->w:Lkotlin/jvm/internal/g0;

    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v1}, Ltg0/c;->c()Ltg0/b;

    move-result-object v2

    invoke-virtual {v2}, Ltg0/b;->o()Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_7

    iget-object v2, v0, Lvg0/b0$a$a;->x:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lbc3/k1;

    if-eqz v2, :cond_6

    invoke-interface {v2, v11}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    iget-object v2, v0, Lvg0/b0$a$a;->x:Lkotlin/jvm/internal/g0;

    iput-object v11, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v2, v0, Lvg0/b0$a$a;->y:Lkotlin/jvm/internal/b0;

    iput-boolean v5, v2, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v2, v0, Lvg0/b0$a$a;->z:Ldc3/u;

    invoke-static {v1, v5}, Lvg0/c0;->a(Ltg0/c;Z)Ltg0/c;

    move-result-object v1

    iput-object v11, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    iput v10, v3, Lvg0/b0$a$a$b;->z:I

    check-cast v2, Ldc3/t;

    iget-object v2, v2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v2, v1, v3}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_9

    goto :goto_1

    :cond_7
    iget-object v2, v0, Lvg0/b0$a$a;->y:Lkotlin/jvm/internal/b0;

    iget-boolean v2, v2, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v2, :cond_8

    iget-object v2, v0, Lvg0/b0$a$a;->z:Ldc3/u;

    invoke-static {v1, v10}, Lvg0/c0;->a(Ltg0/c;Z)Ltg0/c;

    move-result-object v1

    iput-object v11, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    iput v8, v3, Lvg0/b0$a$a$b;->z:I

    check-cast v2, Ldc3/t;

    iget-object v2, v2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v2, v1, v3}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_9

    goto :goto_1

    :cond_8
    iget-object v2, v0, Lvg0/b0$a$a;->x:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v2, :cond_a

    iget-object v2, v0, Lvg0/b0$a$a;->z:Ldc3/u;

    invoke-static {v1, v5}, Lvg0/c0;->a(Ltg0/c;Z)Ltg0/c;

    move-result-object v1

    iput-object v11, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    iput v7, v3, Lvg0/b0$a$a$b;->z:I

    check-cast v2, Ldc3/t;

    iget-object v2, v2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v2, v1, v3}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_9

    goto :goto_1

    :cond_9
    return-object v9

    :cond_a
    iget-object v2, v0, Lvg0/b0$a$a;->z:Ldc3/u;

    invoke-static {v1, v5}, Lvg0/c0;->a(Ltg0/c;Z)Ltg0/c;

    move-result-object v1

    iput-object v11, v3, Lvg0/b0$a$a$b;->w:Ljava/lang/Object;

    iput v6, v3, Lvg0/b0$a$a$b;->z:I

    check-cast v2, Ldc3/t;

    iget-object v2, v2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v2, v1, v3}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_b

    :goto_1
    return-object v4

    :cond_b
    :goto_2
    iget-object v1, v0, Lvg0/b0$a$a;->x:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lvg0/b0$a$a;->z:Ldc3/u;

    new-instance v12, Lvg0/b0$a$a$a;

    iget-wide v13, v0, Lvg0/b0$a$a;->E:J

    iget-object v15, v0, Lvg0/b0$a$a;->y:Lkotlin/jvm/internal/b0;

    iget-object v3, v0, Lvg0/b0$a$a;->w:Lkotlin/jvm/internal/g0;

    const/16 v18, 0x0

    move-object/from16 v17, v2

    move-object/from16 v16, v3

    invoke-direct/range {v12 .. v18}, Lvg0/b0$a$a$a;-><init>(JLkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;Ldc3/u;Lq83/d;)V

    invoke-static {v2, v11, v11, v12, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v9
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltg0/c;

    invoke-virtual {p0, p1, p2}, Lvg0/b0$a$a;->b(Ltg0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
