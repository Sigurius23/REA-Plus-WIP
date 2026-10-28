.class final Lyr0/c$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyr0/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Lyr0/c;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lyr0/c;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lyr0/c;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lyr0/c$g$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lyr0/c$g$a;->x:Lyr0/c;

    iput-object p3, p0, Lyr0/c$g$a;->y:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lyr0/a;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyr0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lyr0/c$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyr0/c$g$a$a;

    iget v1, v0, Lyr0/c$g$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyr0/c$g$a$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lyr0/c$g$a$a;

    invoke-direct {v0, p0, p2}, Lyr0/c$g$a$a;-><init>(Lyr0/c$g$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lyr0/c$g$a$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lyr0/c$g$a$a;->E:I

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

    iget-object p1, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lyr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lyr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object p1, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lyr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object p1, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v1, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lyr0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lyr0/c$g$a;->w:Lkotlin/jvm/internal/g0;

    instance-of v1, p1, Lyr0/a$b;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lyr0/c$g$a;->x:Lyr0/c;

    iget-object v2, p0, Lyr0/c$g$a;->y:Lec3/m;

    check-cast p1, Lyr0/a$b;

    invoke-virtual {p1}, Lyr0/a$b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lyr0/c$g$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lyr0/b;

    iput-object v10, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    iput v4, v6, Lyr0/c$g$a$a;->E:I

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lyr0/c;->o(Lyr0/c;Lec3/m;Ljava/lang/String;Lyr0/b;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_2
    check-cast p2, Lyr0/b;

    goto :goto_5

    :cond_7
    instance-of v1, p1, Lyr0/a$c;

    if-eqz v1, :cond_9

    iget-object p1, p0, Lyr0/c$g$a;->x:Lyr0/c;

    iget-object v1, p0, Lyr0/c$g$a;->y:Lec3/m;

    iget-object v2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Lyr0/b;

    iput-object v10, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    iput v3, v6, Lyr0/c$g$a$a;->E:I

    invoke-static {p1, v1, v2, v6}, Lyr0/c;->j(Lyr0/c;Lec3/m;Lyr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_6

    :cond_8
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_3
    check-cast p2, Lyr0/b;

    goto :goto_5

    :cond_9
    instance-of v1, p1, Lyr0/a$a;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lyr0/c$g$a;->x:Lyr0/c;

    iget-object v3, p0, Lyr0/c$g$a;->y:Lec3/m;

    check-cast p1, Lyr0/a$a;

    invoke-virtual {p1}, Lyr0/a$a;->a()I

    move-result p1

    iget-object v4, p0, Lyr0/c$g$a;->w:Lkotlin/jvm/internal/g0;

    iget-object v4, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v4, Lyr0/b;

    iput-object v10, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    iput-object p2, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    iput v2, v6, Lyr0/c$g$a$a;->E:I

    invoke-static {v1, v3, p1, v4, v6}, Lyr0/c;->h(Lyr0/c;Lec3/m;ILyr0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_6

    :cond_a
    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_4
    check-cast p2, Lyr0/b;

    :goto_5
    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lyr0/c$g$a;->y:Lec3/m;

    iget-object p2, p0, Lyr0/c$g$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v10, v6, Lyr0/c$g$a$a;->w:Ljava/lang/Object;

    iput-object v10, v6, Lyr0/c$g$a$a;->x:Ljava/lang/Object;

    iput v9, v6, Lyr0/c$g$a$a;->E:I

    invoke-interface {p1, p2, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_6
    return-object v0

    :cond_b
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyr0/a;

    invoke-virtual {p0, p1, p2}, Lyr0/c$g$a;->b(Lyr0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
