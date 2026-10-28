.class final Lpr0/c$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpr0/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Lpr0/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lpr0/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lpr0/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lpr0/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lpr0/c$h$a;->x:Lpr0/c;

    iput-object p3, p0, Lpr0/c$h$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lpr0/a;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lpr0/c$h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpr0/c$h$a$a;

    iget v1, v0, Lpr0/c$h$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpr0/c$h$a$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lpr0/c$h$a$a;

    invoke-direct {v0, p0, p2}, Lpr0/c$h$a$a;-><init>(Lpr0/c$h$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lpr0/c$h$a$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lpr0/c$h$a$a;->E:I

    const/4 v9, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v4, :cond_4

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lpr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lpr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object p1, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lpr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget-object p1, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lpr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lpr0/c$h$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v1, p1, Lpr0/a$b;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lpr0/c$h$a;->x:Lpr0/c;

    iget-object v2, p0, Lpr0/c$h$a;->y:Lec3/m;

    check-cast p1, Lpr0/a$b;

    invoke-virtual {p1}, Lpr0/a$b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lpr0/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lpr0/b;

    iput-object v10, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    iput v4, v6, Lpr0/c$h$a$a;->E:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lpr0/c;->n(Lpr0/c;Lec3/m;Ljava/lang/String;Lpr0/b;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_7

    :cond_6
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_2
    check-cast p2, Lpr0/b;

    :goto_3
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    goto :goto_6

    :cond_7
    instance-of v1, p1, Lpr0/a$c;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lpr0/c$h$a;->x:Lpr0/c;

    iget-object v2, p0, Lpr0/c$h$a;->y:Lec3/m;

    check-cast p1, Lpr0/a$c;

    invoke-virtual {p1}, Lpr0/a$c;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    iget-object v4, p0, Lpr0/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v4, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lpr0/b;

    iput-object v10, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    iput v3, v6, Lpr0/c$h$a$a;->E:I

    invoke-static {v1, v2, p1, v4, v6}, Lpr0/c;->h(Lpr0/c;Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lpr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_7

    :cond_8
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_4
    check-cast p2, Lpr0/b;

    goto :goto_3

    :cond_9
    instance-of v1, p1, Lpr0/a$a;

    if-eqz v1, :cond_a

    iget-object p1, p0, Lpr0/c$h$a;->x:Lpr0/c;

    iget-object v1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lpr0/b;

    invoke-static {p1, v1}, Lpr0/c;->f(Lpr0/c;Lpr0/b;)Lpr0/b;

    move-result-object p1

    goto :goto_6

    :cond_a
    instance-of p1, p1, Lpr0/a$d;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lpr0/c$h$a;->x:Lpr0/c;

    iget-object v1, p0, Lpr0/c$h$a;->y:Lec3/m;

    iget-object v3, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lpr0/b;

    iput-object v10, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    iput v2, v6, Lpr0/c$h$a$a;->E:I

    invoke-static {p1, v1, v3, v6}, Lpr0/c;->i(Lpr0/c;Lec3/m;Lpr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_7

    :cond_b
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_5
    check-cast p2, Lpr0/b;

    goto :goto_3

    :goto_6
    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lpr0/c$h$a;->y:Lec3/m;

    iget-object p2, p0, Lpr0/c$h$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v10, v6, Lpr0/c$h$a$a;->w:Ljava/lang/Object;

    iput-object v10, v6, Lpr0/c$h$a$a;->x:Ljava/lang/Object;

    iput v9, v6, Lpr0/c$h$a$a;->E:I

    invoke-interface {p1, p2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_7
    return-object v0

    :cond_c
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpr0/a;

    invoke-virtual {p0, p1, p2}, Lpr0/c$h$a;->b(Lpr0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
