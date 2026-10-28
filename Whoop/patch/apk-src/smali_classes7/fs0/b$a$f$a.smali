.class public final Lfs0/b$a$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs0/b$a$f;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lfs0/b$a;


# direct methods
.method public constructor <init>(Lec3/m;Lfs0/b$a;)V
    .locals 0

    iput-object p1, p0, Lfs0/b$a$f$a;->w:Lec3/m;

    iput-object p2, p0, Lfs0/b$a$f$a;->x:Lfs0/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lfs0/b$a$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfs0/b$a$f$a$a;

    iget v1, v0, Lfs0/b$a$f$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfs0/b$a$f$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfs0/b$a$f$a$a;

    invoke-direct {v0, p0, p2}, Lfs0/b$a$f$a$a;-><init>(Lfs0/b$a$f$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfs0/b$a$f$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfs0/b$a$f$a$a;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lfs0/b$a$f$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lfs0/b$a$f$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lfs0/b$a$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lfs0/b$a$f$a$a;->J:I

    iget-object v2, v0, Lfs0/b$a$f$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lfs0/a;

    iget-object v2, v0, Lfs0/b$a$f$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lfs0/b$a$f$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lfs0/b$a$f$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lfs0/b$a$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget p1, v0, Lfs0/b$a$f$a$a;->J:I

    iget-object v2, v0, Lfs0/b$a$f$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lfs0/a;

    iget-object v2, v0, Lfs0/b$a$f$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lfs0/b$a$f$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lfs0/b$a$f$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lfs0/b$a$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lfs0/b$a$f$a;->w:Lec3/m;

    check-cast p1, Lfs0/a;

    instance-of p2, p1, Lfs0/a$a;

    const/4 v8, 0x0

    if-eqz p2, :cond_6

    iget-object p2, p0, Lfs0/b$a$f$a;->x:Lfs0/b$a;

    check-cast p1, Lfs0/a$a;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lfs0/b$a$f$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->I:Ljava/lang/Object;

    iput v8, v0, Lfs0/b$a$f$a$a;->J:I

    iput v8, v0, Lfs0/b$a$f$a$a;->K:I

    iput v6, v0, Lfs0/b$a$f$a$a;->x:I

    invoke-static {p2, p1, v0}, Lfs0/b$a;->b(Lfs0/b$a;Lfs0/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    move p1, v8

    goto :goto_2

    :cond_6
    sget-object p2, Lfs0/a$b;->a:Lfs0/a$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lfs0/b$a$f$a;->x:Lfs0/b$a;

    invoke-static {p1}, Lfs0/b$a;->e(Lfs0/b$a;)Lec3/o1;

    move-result-object p1

    iput-object v7, v0, Lfs0/b$a$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lfs0/b$a$f$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->I:Ljava/lang/Object;

    iput v8, v0, Lfs0/b$a$f$a$a;->J:I

    iput v8, v0, Lfs0/b$a$f$a$a;->K:I

    iput v5, v0, Lfs0/b$a$f$a$a;->x:I

    invoke-interface {p1, v3, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    move p1, v8

    :goto_1
    move-object p2, v7

    :goto_2
    if-eqz p2, :cond_8

    iput-object v7, v0, Lfs0/b$a$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->G:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->H:Ljava/lang/Object;

    iput-object v7, v0, Lfs0/b$a$f$a$a;->I:Ljava/lang/Object;

    iput p1, v0, Lfs0/b$a$f$a$a;->J:I

    iput v4, v0, Lfs0/b$a$f$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    return-object v3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
