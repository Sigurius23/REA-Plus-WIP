.class public final Luz/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic w:Lec3/m;

.field public final synthetic x:Luz/o;

.field public final synthetic y:Landroidx/fragment/app/r0;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Luz/o;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luz/l;->w:Lec3/m;

    iput-object p2, p0, Luz/l;->x:Luz/o;

    iput-object p3, p0, Luz/l;->y:Landroidx/fragment/app/r0;

    iput-object p4, p0, Luz/l;->z:Ljava/lang/String;

    iput-object p5, p0, Luz/l;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Luz/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Luz/k;

    iget v1, v0, Luz/k;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Luz/k;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Luz/k;

    invoke-direct {v0, p0, p2}, Luz/k;-><init>(Luz/l;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Luz/k;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Luz/k;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Luz/k;->y:Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Luz/e;

    sget-object p2, Luz/b;->a:Luz/b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iget-object v2, p0, Luz/l;->w:Lec3/m;

    if-eqz p2, :cond_5

    iput-object v2, v0, Luz/k;->y:Lec3/m;

    iput v5, v0, Luz/k;->x:I

    sget p1, Luz/o;->d:I

    iget-object p1, p0, Luz/l;->x:Luz/o;

    iget-object p2, p0, Luz/l;->y:Landroidx/fragment/app/r0;

    iget-object v5, p0, Luz/l;->z:Ljava/lang/String;

    iget-object v6, p0, Luz/l;->E:Ljava/lang/String;

    invoke-virtual {p1, p2, v5, v6, v0}, Luz/o;->b(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object p1, v2

    :goto_1
    check-cast p2, Luz/t;

    move-object v2, p1

    goto :goto_2

    :cond_5
    sget-object p2, Luz/c;->a:Luz/c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    move-object p2, v3

    goto :goto_2

    :cond_6
    instance-of p2, p1, Luz/d;

    if-eqz p2, :cond_7

    new-instance p2, Luz/s;

    check-cast p1, Luz/d;

    iget-object p1, p1, Luz/d;->a:Ljava/lang/String;

    invoke-direct {p2, p1}, Luz/s;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    instance-of p2, p1, Luz/a;

    if-eqz p2, :cond_9

    new-instance p2, Luz/r;

    check-cast p1, Luz/a;

    iget-object p1, p1, Luz/a;->a:Ljava/lang/Throwable;

    invoke-direct {p2, p1}, Luz/r;-><init>(Ljava/lang/Throwable;)V

    :goto_2
    if-eqz p2, :cond_8

    iput-object v3, v0, Luz/k;->y:Lec3/m;

    iput v4, v0, Luz/k;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
