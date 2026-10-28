.class final Lkl1/c$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkl1/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lkl1/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.calendar.CalendarDomainInteractor$interact$1$1"
    f = "CalendarDomainInteractor.kt"
    l = {
        0x2b,
        0x2c,
        0x2d,
        0x2e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lil1/m$a;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkl1/c;


# direct methods
.method public constructor <init>(Lkl1/c;Lil1/m$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkl1/c;",
            "Lil1/m$a;",
            "Lq83/d<",
            "-",
            "Lkl1/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkl1/c$d;->z:Lkl1/c;

    iput-object p2, p0, Lkl1/c$d;->E:Lil1/m$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lkl1/c$d;

    iget-object v1, p0, Lkl1/c$d;->z:Lkl1/c;

    iget-object v2, p0, Lkl1/c$d;->E:Lil1/m$a;

    invoke-direct {v0, v1, v2, p2}, Lkl1/c$d;-><init>(Lkl1/c;Lil1/m$a;Lq83/d;)V

    iput-object p1, v0, Lkl1/c$d;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkl1/c$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkl1/c$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkl1/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkl1/c$d;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lkl1/c$d;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkl1/c$d;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lkl1/c$d;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/home/domain/models/CalendarResponse;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lkl1/b$b;->a:Lkl1/b$b;

    iput-object v0, p0, Lkl1/c$d;->y:Ljava/lang/Object;

    iput v6, p0, Lkl1/c$d;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    sget-object p1, Lkl1/b$a;->a:Lkl1/b$a;

    iput-object v0, p0, Lkl1/c$d;->y:Ljava/lang/Object;

    iput v5, p0, Lkl1/c$d;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iget-object p1, p0, Lkl1/c$d;->z:Lkl1/c;

    iget-object v2, p0, Lkl1/c$d;->E:Lil1/m$a;

    iput-object v0, p0, Lkl1/c$d;->y:Ljava/lang/Object;

    iput v4, p0, Lkl1/c$d;->x:I

    invoke-static {p1, v2, p0}, Lkl1/c;->c(Lkl1/c;Lil1/m$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast p1, Lcom/whoop/home/domain/models/CalendarResponse;

    new-instance v2, Lkl1/b$c;

    iget-object v4, p0, Lkl1/c$d;->E:Lil1/m$a;

    invoke-virtual {v4}, Lil1/m$a;->b()Lfm1/g;

    move-result-object v4

    iget-object v5, p0, Lkl1/c$d;->E:Lil1/m$a;

    invoke-virtual {v5}, Lil1/m$a;->a()I

    move-result v5

    invoke-direct {v2, p1, v4, v5}, Lkl1/b$c;-><init>(Lcom/whoop/home/domain/models/CalendarResponse;Lfm1/g;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lkl1/c$d;->y:Ljava/lang/Object;

    iput-object p1, p0, Lkl1/c$d;->w:Ljava/lang/Object;

    iput v3, p0, Lkl1/c$d;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
