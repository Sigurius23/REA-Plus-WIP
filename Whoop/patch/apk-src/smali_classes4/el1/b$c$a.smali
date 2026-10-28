.class public final Lel1/b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lel1/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lel1/b$c$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lel1/b$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lel1/b$c$a$a;

    iget v1, v0, Lel1/b$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lel1/b$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lel1/b$c$a$a;

    invoke-direct {v0, p0, p2}, Lel1/b$c$a$a;-><init>(Lel1/b$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lel1/b$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lel1/b$c$a$a;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    :cond_1
    iget-object p1, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    check-cast p1, Llt0/k;

    iget-object p1, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget p1, v0, Lel1/b$c$a$a;->H:I

    iget-object v2, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    check-cast v4, Llt0/k;

    iget-object v4, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget p1, v0, Lel1/b$c$a$a;->H:I

    iget-object v2, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    check-cast v5, Llt0/k;

    iget-object v5, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lel1/b$c$a;->w:Lec3/m;

    check-cast p1, Llt0/k;

    invoke-virtual {p1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    instance-of v2, p1, Ldk0/g;

    const/4 v8, 0x0

    if-nez v2, :cond_9

    instance-of v2, p1, Ldk0/d;

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    instance-of p1, p1, Ldk0/b;

    if-eqz p1, :cond_a

    sget-object p1, Lel1/a;->DONE:Lel1/a;

    iput-object v7, v0, Lel1/b$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Lel1/b$c$a$a;->H:I

    iput v5, v0, Lel1/b$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v2, p2

    move p1, v8

    :goto_1
    iput-object v7, v0, Lel1/b$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lel1/b$c$a$a;->H:I

    iput v4, v0, Lel1/b$c$a$a;->x:I

    const-wide/16 v4, 0x7d0

    invoke-static {v4, v5, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_2
    sget-object p2, Lel1/a;->NONE:Lel1/a;

    iput-object v7, v0, Lel1/b$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lel1/b$c$a$a;->H:I

    iput v3, v0, Lel1/b$c$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    :cond_9
    :goto_3
    sget-object p1, Lel1/a;->IN_PROGRESS:Lel1/a;

    iput-object v7, v0, Lel1/b$c$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Lel1/b$c$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Lel1/b$c$a$a;->H:I

    iput v6, v0, Lel1/b$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
