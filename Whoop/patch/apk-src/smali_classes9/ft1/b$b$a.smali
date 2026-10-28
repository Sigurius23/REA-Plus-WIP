.class public final Lft1/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lft1/b$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lft1/b$b$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lft1/b$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lft1/b$b$a$a;

    iget v1, v0, Lft1/b$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lft1/b$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lft1/b$b$a$a;

    invoke-direct {v0, p0, p2}, Lft1/b$b$a$a;-><init>(Lft1/b$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lft1/b$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lft1/b$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lft1/b$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lft1/b$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lft1/b$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lft1/b$b$a;->w:Lec3/m;

    check-cast p1, Lft1/a;

    instance-of v2, p1, Lft1/a$d;

    if-eqz v2, :cond_3

    new-instance v2, Ldt1/e$e;

    check-cast p1, Lft1/a$d;

    invoke-virtual {p1}, Lft1/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ldt1/e$e;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lft1/a$b;

    if-eqz v2, :cond_4

    new-instance v2, Ldt1/e$b;

    check-cast p1, Lft1/a$b;

    invoke-virtual {p1}, Lft1/a$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lft1/a$b;->b()Ljava/time/Instant;

    move-result-object p1

    invoke-direct {v2, v4, p1}, Ldt1/e$b;-><init>(Ljava/lang/String;Ljava/time/Instant;)V

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lft1/a$h;

    if-eqz v2, :cond_5

    new-instance v2, Ldt1/e$h;

    check-cast p1, Lft1/a$h;

    invoke-virtual {p1}, Lft1/a$h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lft1/a$h;->d()Ljava/time/Instant;

    move-result-object v5

    invoke-virtual {p1}, Lft1/a$h;->c()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p1}, Lft1/a$h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v4, v5, v6, p1}, Ldt1/e$h;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    sget-object v2, Lft1/a$c;->a:Lft1/a$c;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Ldt1/e$c;->a:Ldt1/e$c;

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lft1/a$g;

    if-eqz v2, :cond_7

    sget-object v2, Ldt1/e$g;->a:Ldt1/e$g;

    goto :goto_1

    :cond_7
    sget-object v2, Lft1/a$e;->a:Lft1/a$e;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Ldt1/e$d;->a:Ldt1/e$d;

    goto :goto_1

    :cond_8
    instance-of v2, p1, Lft1/a$f;

    if-eqz v2, :cond_9

    sget-object v2, Ldt1/e$f;->a:Ldt1/e$f;

    goto :goto_1

    :cond_9
    instance-of p1, p1, Lft1/a$a;

    if-eqz p1, :cond_b

    sget-object v2, Ldt1/e$a;->a:Ldt1/e$a;

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Lft1/b$b$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lft1/b$b$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lft1/b$b$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lft1/b$b$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lft1/b$b$a$a;->H:I

    iput v3, v0, Lft1/b$b$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
