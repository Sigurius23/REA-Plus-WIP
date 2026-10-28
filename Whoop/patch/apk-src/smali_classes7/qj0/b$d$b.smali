.class final Lqj0/b$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lqj0/b;


# direct methods
.method public constructor <init>(Lqj0/b;)V
    .locals 0

    iput-object p1, p0, Lqj0/b$d$b;->w:Lqj0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b([BLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lqj0/b$d$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqj0/b$d$b$a;

    iget v1, v0, Lqj0/b$d$b$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqj0/b$d$b$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqj0/b$d$b$a;

    invoke-direct {v0, p0, p2}, Lqj0/b$d$b$a;-><init>(Lqj0/b$d$b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lqj0/b$d$b$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqj0/b$d$b$a;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lqj0/b$d$b$a;->x:Ljava/lang/Object;

    check-cast p1, Lzj0/h;

    iget-object p1, v0, Lqj0/b$d$b$a;->w:Ljava/lang/Object;

    check-cast p1, [B

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lqj0/b$d$b$a;->w:Ljava/lang/Object;

    check-cast p1, [B

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lqj0/b$d$b;->w:Lqj0/b;

    iput-object v5, v0, Lqj0/b$d$b$a;->w:Ljava/lang/Object;

    iput v4, v0, Lqj0/b$d$b$a;->F:I

    invoke-static {p2, p1, v0}, Lqj0/b;->f(Lqj0/b;[BLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lzj0/h;

    if-eqz p2, :cond_5

    iget-object p1, p0, Lqj0/b$d$b;->w:Lqj0/b;

    invoke-static {p1}, Lqj0/b;->c(Lqj0/b;)Lec3/o1;

    move-result-object p1

    iput-object v5, v0, Lqj0/b$d$b$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lqj0/b$d$b$a;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lqj0/b$d$b$a;->y:I

    iput v3, v0, Lqj0/b$d$b$a;->F:I

    invoke-interface {p1, p2, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2}, Lqj0/b$d$b;->b([BLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
