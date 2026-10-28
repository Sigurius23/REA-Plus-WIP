.class final Lvh2/e$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/e;->a(Lbc3/c0;Ljk0/d;Lzj0/t$b;)V
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
    c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl$scheduleRefresh$1"
    f = "StrapUnlockServiceImpl.kt"
    l = {
        0x4e,
        0x51,
        0x52
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lzj0/t$b;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lvh2/e;

.field final synthetic z:Ljk0/d;


# direct methods
.method public constructor <init>(Lvh2/e;Ljk0/d;Lzj0/t$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/e;",
            "Ljk0/d;",
            "Lzj0/t$b;",
            "Lq83/d<",
            "-",
            "Lvh2/e$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/e$h;->y:Lvh2/e;

    iput-object p2, p0, Lvh2/e$h;->z:Ljk0/d;

    iput-object p3, p0, Lvh2/e$h;->E:Lzj0/t$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lvh2/e$h;

    iget-object v0, p0, Lvh2/e$h;->y:Lvh2/e;

    iget-object v1, p0, Lvh2/e$h;->z:Ljk0/d;

    iget-object v2, p0, Lvh2/e$h;->E:Lzj0/t$b;

    invoke-direct {p1, v0, v1, v2, p2}, Lvh2/e$h;-><init>(Lvh2/e;Ljk0/d;Lzj0/t$b;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lvh2/e$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvh2/e$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvh2/e$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvh2/e$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvh2/e$h;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v6, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Lvh2/e$h;->w:Ljava/lang/Object;

    check-cast v1, Lvh2/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lvh2/e$h;->w:Ljava/lang/Object;

    check-cast v1, Lvh2/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvh2/e$h;->y:Lvh2/e;

    iget-object v1, p0, Lvh2/e$h;->z:Ljk0/d;

    iget-object v7, p0, Lvh2/e$h;->E:Lzj0/t$b;

    iput v6, p0, Lvh2/e$h;->x:I

    invoke-static {p1, v1, v7, v3, p0}, Lvh2/e;->k(Lvh2/e;Ljk0/d;Lzj0/t$b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    check-cast p1, Lvh2/h;

    :goto_1
    new-instance v1, Lvh2/h$a;

    sget-object v7, Lvh2/h$b;->INTERRUPTED:Lvh2/h$b;

    invoke-direct {v1, v7}, Lvh2/h$a;-><init>(Lvh2/h$b;)V

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lvh2/e$h;->y:Lvh2/e;

    invoke-static {p1}, Lvh2/e;->i(Lvh2/e;)Ltr2/n;

    move-result-object p1

    const-string v1, "Cert transfer was interrupted, rescheduling after 5 seconds delay"

    new-array v7, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v7}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x5

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    iput-object v2, p0, Lvh2/e$h;->w:Ljava/lang/Object;

    iput v5, p0, Lvh2/e$h;->x:I

    invoke-static {v7, v8, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p1, p0, Lvh2/e$h;->y:Lvh2/e;

    iget-object v1, p0, Lvh2/e$h;->z:Ljk0/d;

    iget-object v7, p0, Lvh2/e$h;->E:Lzj0/t$b;

    iput-object v2, p0, Lvh2/e$h;->w:Ljava/lang/Object;

    iput v4, p0, Lvh2/e$h;->x:I

    invoke-static {p1, v1, v7, v6, p0}, Lvh2/e;->k(Lvh2/e;Ljk0/d;Lzj0/t$b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    check-cast p1, Lvh2/h;

    goto :goto_1

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
