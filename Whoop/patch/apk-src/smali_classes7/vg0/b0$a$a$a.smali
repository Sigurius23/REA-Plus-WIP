.class final Lvg0/b0$a$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b0$a$a;->b(Ltg0/c;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.LoadingDebounceInteractor$interact$1$1$1"
    f = "LoadingDebounceInteractor.kt"
    l = {
        0x28,
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/internal/b0;

.field final synthetic F:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic G:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:J


# direct methods
.method public constructor <init>(JLkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;Ldc3/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/internal/b0;",
            "Lkotlin/jvm/internal/g0;",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Lvg0/b0$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lvg0/b0$a$a$a;->z:J

    iput-object p3, p0, Lvg0/b0$a$a$a;->E:Lkotlin/jvm/internal/b0;

    iput-object p4, p0, Lvg0/b0$a$a$a;->F:Lkotlin/jvm/internal/g0;

    iput-object p5, p0, Lvg0/b0$a$a$a;->G:Ldc3/u;

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

    new-instance v0, Lvg0/b0$a$a$a;

    iget-wide v1, p0, Lvg0/b0$a$a$a;->z:J

    iget-object v3, p0, Lvg0/b0$a$a$a;->E:Lkotlin/jvm/internal/b0;

    iget-object v4, p0, Lvg0/b0$a$a$a;->F:Lkotlin/jvm/internal/g0;

    iget-object v5, p0, Lvg0/b0$a$a$a;->G:Ldc3/u;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lvg0/b0$a$a$a;-><init>(JLkotlin/jvm/internal/b0;Lkotlin/jvm/internal/g0;Ldc3/u;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvg0/b0$a$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/b0$a$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/b0$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/b0$a$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvg0/b0$a$a$a;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lvg0/b0$a$a$a;->w:Ljava/lang/Object;

    check-cast v0, Ltg0/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v4, p0, Lvg0/b0$a$a$a;->z:J

    iput v3, p0, Lvg0/b0$a$a$a;->y:I

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lvg0/b0$a$a$a;->E:Lkotlin/jvm/internal/b0;

    iput-boolean v3, p1, Lkotlin/jvm/internal/b0;->w:Z

    iget-object p1, p0, Lvg0/b0$a$a$a;->F:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Ltg0/c;

    if-eqz p1, :cond_4

    iget-object v1, p0, Lvg0/b0$a$a$a;->G:Ldc3/u;

    invoke-static {p1, v3}, Lvg0/c0;->a(Ltg0/c;Z)Ltg0/c;

    move-result-object p1

    const/4 v3, 0x0

    iput-object v3, p0, Lvg0/b0$a$a$a;->w:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lvg0/b0$a$a$a;->x:I

    iput v2, p0, Lvg0/b0$a$a$a;->y:I

    check-cast v1, Ldc3/t;

    iget-object v1, v1, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v1, p1, p0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
