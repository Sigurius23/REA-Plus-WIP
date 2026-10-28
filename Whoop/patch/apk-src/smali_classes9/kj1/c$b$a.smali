.class public final Lkj1/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj1/c$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lkj1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lkj1/c;)V
    .locals 0

    iput-object p1, p0, Lkj1/c$b$a;->w:Lec3/m;

    iput-object p2, p0, Lkj1/c$b$a;->x:Lkj1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lkj1/c$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkj1/c$b$a$a;

    iget v1, v0, Lkj1/c$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkj1/c$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkj1/c$b$a$a;

    invoke-direct {v0, p0, p2}, Lkj1/c$b$a$a;-><init>(Lkj1/c$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkj1/c$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkj1/c$b$a$a;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkj1/c$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lkj1/c$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lkj1/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lkj1/c$b$a$a;->K:I

    iget-object v2, v0, Lkj1/c$b$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lkj1/a;

    iget-object v2, v0, Lkj1/c$b$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lkj1/c$b$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lkj1/c$b$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lkj1/c$b$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lkj1/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lkj1/c$b$a;->w:Lec3/m;

    check-cast p1, Lkj1/a;

    instance-of p2, p1, Lkj1/a$a;

    const/4 v6, 0x0

    if-eqz p2, :cond_5

    iget-object p1, p0, Lkj1/c$b$a;->x:Lkj1/c;

    iput-object v5, v0, Lkj1/c$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lkj1/c$b$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Lkj1/c$b$a$a;->K:I

    iput v6, v0, Lkj1/c$b$a$a;->L:I

    iput v4, v0, Lkj1/c$b$a$a;->x:I

    invoke-static {p1, v0}, Lkj1/c;->a(Lkj1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_4

    :cond_4
    move p1, v6

    :goto_1
    move v6, p1

    goto :goto_3

    :cond_5
    instance-of p2, p1, Lkj1/a$b;

    if-eqz p2, :cond_6

    iget-object p1, p0, Lkj1/c$b$a;->x:Lkj1/c;

    invoke-static {p1}, Lkj1/c;->b(Lkj1/c;)Lkj1/b;

    move-result-object p1

    :goto_2
    move-object p2, p1

    goto :goto_3

    :cond_6
    instance-of p1, p1, Lkj1/a$c;

    if-eqz p1, :cond_8

    sget-object p1, Lkj1/b$c;->a:Lkj1/b$c;

    goto :goto_2

    :goto_3
    iput-object v5, v0, Lkj1/c$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lkj1/c$b$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Lkj1/c$b$a$a;->K:I

    iput v3, v0, Lkj1/c$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
