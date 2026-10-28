.class public final Lwl1/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwl1/c$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lwl1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lwl1/c;)V
    .locals 0

    iput-object p1, p0, Lwl1/c$b$a;->w:Lec3/m;

    iput-object p2, p0, Lwl1/c$b$a;->x:Lwl1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lwl1/c$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwl1/c$b$a$a;

    iget v1, v0, Lwl1/c$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwl1/c$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwl1/c$b$a$a;

    invoke-direct {v0, p0, p2}, Lwl1/c$b$a$a;-><init>(Lwl1/c$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwl1/c$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwl1/c$b$a$a;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwl1/c$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lwl1/c$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lwl1/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v6, v0, Lwl1/c$b$a$a;->K:I

    iget-object p1, v0, Lwl1/c$b$a$a;->J:Ljava/lang/Object;

    check-cast p1, Lwl1/a;

    iget-object p1, v0, Lwl1/c$b$a$a;->I:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    iget-object p1, v0, Lwl1/c$b$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v2, v0, Lwl1/c$b$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v0, Lwl1/c$b$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lwl1/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget p1, v0, Lwl1/c$b$a$a;->K:I

    iget-object v2, v0, Lwl1/c$b$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lwl1/a;

    iget-object v2, v0, Lwl1/c$b$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lwl1/c$b$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lwl1/c$b$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lwl1/c$b$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lwl1/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwl1/c$b$a;->w:Lec3/m;

    check-cast p1, Lwl1/a;

    sget-object v2, Lwl1/a$c;->a:Lwl1/a$c;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object p1, Lwl1/b$a;->a:Lwl1/b$a;

    goto/16 :goto_3

    :cond_5
    sget-object v2, Lwl1/a$a;->a:Lwl1/a$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object p1, p0, Lwl1/c$b$a;->x:Lwl1/c;

    iput-object v7, v0, Lwl1/c$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lwl1/c$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Lwl1/c$b$a$a;->K:I

    iput v6, v0, Lwl1/c$b$a$a;->L:I

    iput v5, v0, Lwl1/c$b$a$a;->x:I

    invoke-static {p1, v0}, Lwl1/c;->h(Lwl1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v2, p2

    move-object p2, p1

    move p1, v6

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v4, p0, Lwl1/c$b$a;->x:Lwl1/c;

    invoke-static {v4}, Lwl1/c;->e(Lwl1/c;)Ltr2/n;

    move-result-object v4

    const-string v5, "InAppReviewPrompt should pop up: "

    invoke-static {v5, p2}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p2, :cond_7

    sget-object p2, Lwl1/b$b;->a:Lwl1/b$b;

    goto :goto_4

    :cond_7
    sget-object p2, Lwl1/b$a;->a:Lwl1/b$a;

    move v6, p1

    move-object p1, p2

    move-object p2, v2

    goto :goto_3

    :cond_8
    sget-object v2, Lwl1/a$b;->a:Lwl1/a$b;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lwl1/c$b$a;->x:Lwl1/c;

    invoke-static {p1}, Lwl1/c;->i(Lwl1/c;)V

    iget-object p1, p0, Lwl1/c$b$a;->x:Lwl1/c;

    iput-object v7, v0, Lwl1/c$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lwl1/c$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Lwl1/c$b$a$a;->K:I

    iput v6, v0, Lwl1/c$b$a$a;->L:I

    iput v4, v0, Lwl1/c$b$a$a;->x:I

    invoke-static {p1, v0}, Lwl1/c;->j(Lwl1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_5

    :cond_9
    move-object p1, p2

    :goto_2
    sget-object p2, Lwl1/b$a;->a:Lwl1/b$a;

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_3
    move-object v2, p2

    move-object p2, p1

    move p1, v6

    :goto_4
    iput-object v7, v0, Lwl1/c$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v0, Lwl1/c$b$a$a;->J:Ljava/lang/Object;

    iput p1, v0, Lwl1/c$b$a$a;->K:I

    iput v3, v0, Lwl1/c$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_5
    return-object v1

    :cond_a
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
