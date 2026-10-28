.class final Ldx1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Ldx1/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ldx1/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ldx1/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ldx1/c$c$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Ldx1/c$c$a;->x:Ldx1/c;

    iput-object p3, p0, Ldx1/c$c$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ldx1/a;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldx1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ldx1/c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldx1/c$c$a$a;

    iget v1, v0, Ldx1/c$c$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldx1/c$c$a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldx1/c$c$a$a;

    invoke-direct {v0, p0, p2}, Ldx1/c$c$a$a;-><init>(Ldx1/c$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldx1/c$c$a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldx1/c$c$a$a;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldx1/c$c$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ldx1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ldx1/c$c$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Ldx1/c$c$a$a;->w:Ljava/lang/Object;

    check-cast v2, Ldx1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ldx1/c$c$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v2, p1, Ldx1/a$a;

    if-eqz v2, :cond_5

    iget-object p1, p0, Ldx1/c$c$a;->x:Ldx1/c;

    iget-object v2, p0, Ldx1/c$c$a;->y:Lec3/m;

    iput-object v5, v0, Ldx1/c$c$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Ldx1/c$c$a$a;->x:Ljava/lang/Object;

    iput v4, v0, Ldx1/c$c$a$a;->E:I

    invoke-static {p1, v2, v0}, Ldx1/c;->c(Ldx1/c;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_1
    check-cast p2, Ldx1/b;

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    goto :goto_2

    :cond_5
    instance-of p1, p1, Ldx1/a$b;

    if-eqz p1, :cond_7

    sget-object p1, Ldx1/b$d;->a:Ldx1/b$d;

    :goto_2
    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Ldx1/c$c$a;->y:Lec3/m;

    iget-object p2, p0, Ldx1/c$c$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v5, v0, Ldx1/c$c$a$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Ldx1/c$c$a$a;->x:Ljava/lang/Object;

    iput v3, v0, Ldx1/c$c$a$a;->E:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldx1/a;

    invoke-virtual {p0, p1, p2}, Ldx1/c$c$a;->b(Ldx1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
