.class final Lvg0/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lvg0/d;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lvg0/d;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lvg0/d;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/d$e$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lvg0/d$e$a;->x:Lvg0/d;

    iput-object p3, p0, Lvg0/d$e$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/c;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvg0/d$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvg0/d$e$a$a;

    iget v1, v0, Lvg0/d$e$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg0/d$e$a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvg0/d$e$a$a;

    invoke-direct {v0, p0, p2}, Lvg0/d$e$a$a;-><init>(Lvg0/d$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvg0/d$e$a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvg0/d$e$a$a;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvg0/d$e$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lvg0/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lvg0/d$e$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lvg0/d$e$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lvg0/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lvg0/d$e$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lvg0/d$e$a;->x:Lvg0/d;

    iget-object v6, p0, Lvg0/d$e$a;->y:Lec3/m;

    iget-object v7, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lvg0/e;

    iput-object v5, v0, Lvg0/d$e$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lvg0/d$e$a$a;->x:Ljava/lang/Object;

    iput v4, v0, Lvg0/d$e$a$a;->E:I

    invoke-static {v2, v6, p1, v7, v0}, Lvg0/d;->f(Lvg0/d;Lec3/m;Lvg0/c;Lvg0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_1
    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lvg0/d$e$a;->y:Lec3/m;

    iget-object p2, p0, Lvg0/d$e$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v5, v0, Lvg0/d$e$a$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lvg0/d$e$a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lvg0/d$e$a$a;->E:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

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

    check-cast p1, Lvg0/c;

    invoke-virtual {p0, p1, p2}, Lvg0/d$e$a;->b(Lvg0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
