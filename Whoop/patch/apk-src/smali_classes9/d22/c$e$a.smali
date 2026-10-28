.class final Ld22/c$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld22/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Ld22/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ld22/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ld22/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ld22/c$e$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Ld22/c$e$a;->x:Ld22/c;

    iput-object p3, p0, Ld22/c$e$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ld22/a;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld22/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ld22/c$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ld22/c$e$a$a;

    iget v1, v0, Ld22/c$e$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld22/c$e$a$a;->E:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ld22/c$e$a$a;

    invoke-direct {v0, p0, p2}, Ld22/c$e$a$a;-><init>(Ld22/c$e$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Ld22/c$e$a$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Ld22/c$e$a$a;->E:I

    const/4 v8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v8, :cond_1

    iget-object p1, v7, Ld22/c$e$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ld22/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v7, Ld22/c$e$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v7, Ld22/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v1, Ld22/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-object p1, v7, Ld22/c$e$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v7, Ld22/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v1, Ld22/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ld22/c$e$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v1, p1, Ld22/a$b;

    if-eqz v1, :cond_6

    iget-object v1, p0, Ld22/c$e$a;->x:Ld22/c;

    iget-object v2, p0, Ld22/c$e$a;->y:Lec3/m;

    check-cast p1, Ld22/a$b;

    invoke-virtual {p1}, Ld22/a$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ld22/a$b;->b()Ljava/lang/String;

    move-result-object p1

    iput-object v9, v7, Ld22/c$e$a$a;->w:Ljava/lang/Object;

    iput-object p2, v7, Ld22/c$e$a$a;->x:Ljava/lang/Object;

    iput v3, v7, Ld22/c$e$a$a;->E:I

    invoke-static {v1, v2, v4, p1, v7}, Ld22/c;->d(Ld22/c;Lec3/m;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_5

    :cond_5
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    :goto_2
    check-cast p2, Ld22/b;

    goto :goto_4

    :cond_6
    instance-of v1, p1, Ld22/a$a;

    if-eqz v1, :cond_9

    iget-object v1, p0, Ld22/c$e$a;->x:Ld22/c;

    move v3, v2

    iget-object v2, p0, Ld22/c$e$a;->y:Lec3/m;

    iget-object v4, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Ld22/b;

    check-cast p1, Ld22/a$a;

    move v5, v3

    move-object v3, v4

    invoke-virtual {p1}, Ld22/a$a;->a()Ljava/lang/String;

    move-result-object v4

    move v6, v5

    invoke-virtual {p1}, Ld22/a$a;->b()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {p1}, Ld22/a$a;->c()Ljava/lang/String;

    move-result-object p1

    iput-object v9, v7, Ld22/c$e$a$a;->w:Ljava/lang/Object;

    iput-object p2, v7, Ld22/c$e$a$a;->x:Ljava/lang/Object;

    iput v6, v7, Ld22/c$e$a$a;->E:I

    move-object v6, p1

    invoke-static/range {v1 .. v7}, Ld22/c;->c(Ld22/c;Lec3/m;Ld22/b;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    :goto_3
    check-cast p2, Ld22/b;

    :goto_4
    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Ld22/c$e$a;->y:Lec3/m;

    iget-object p2, p0, Ld22/c$e$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v9, v7, Ld22/c$e$a$a;->w:Ljava/lang/Object;

    iput-object v9, v7, Ld22/c$e$a$a;->x:Ljava/lang/Object;

    iput v8, v7, Ld22/c$e$a$a;->E:I

    invoke-interface {p1, p2, v7}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_5
    return-object v0

    :cond_8
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ld22/a;

    invoke-virtual {p0, p1, p2}, Ld22/c$e$a;->b(Ld22/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
