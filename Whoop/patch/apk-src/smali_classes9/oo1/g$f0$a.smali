.class public final Loo1/g$f0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g$f0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

    iput-object p1, p0, Loo1/g$f0$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Loo1/g$f0$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Loo1/g$f0$a$a;

    iget v1, v0, Loo1/g$f0$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loo1/g$f0$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Loo1/g$f0$a$a;

    invoke-direct {v0, p0, p2}, Loo1/g$f0$a$a;-><init>(Loo1/g$f0$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Loo1/g$f0$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Loo1/g$f0$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Loo1/g$f0$a$a;->H:Ljava/lang/Object;

    check-cast p1, Loo1/e;

    iget-object p1, v0, Loo1/g$f0$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Loo1/g$f0$a$a;->E:Ljava/lang/Object;

    check-cast p1, Loo1/g$f0$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Loo1/g$f0$a;->w:Lec3/m;

    check-cast p1, Lqw2/b;

    instance-of v2, p1, Lqw2/b$i;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    new-instance p1, Loo1/e$l;

    sget-object v2, Loo1/f$f;->a:Loo1/f$f;

    invoke-direct {p1, v2}, Loo1/e$l;-><init>(Loo1/f;)V

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lqw2/b$a;

    if-eqz v2, :cond_4

    new-instance p1, Loo1/e$l;

    sget-object v2, Loo1/f$d;->a:Loo1/f$d;

    invoke-direct {p1, v2}, Loo1/e$l;-><init>(Loo1/f;)V

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lqw2/b$f;

    if-eqz v2, :cond_5

    new-instance p1, Loo1/e$k;

    invoke-direct {p1, v3}, Loo1/e$k;-><init>(Z)V

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lqw2/b$d;

    if-eqz v2, :cond_6

    new-instance v2, Loo1/e$l;

    new-instance v5, Loo1/f$c;

    check-cast p1, Lqw2/b$d;

    invoke-virtual {p1}, Lqw2/b$d;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v5, p1}, Loo1/f$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-direct {v2, v5}, Loo1/e$l;-><init>(Loo1/f;)V

    move-object p1, v2

    goto :goto_1

    :cond_6
    move-object p1, v4

    :goto_1
    if-eqz p1, :cond_7

    iput-object v4, v0, Loo1/g$f0$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Loo1/g$f0$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Loo1/g$f0$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Loo1/g$f0$a$a;->G:Ljava/lang/Object;

    iput-object v4, v0, Loo1/g$f0$a$a;->H:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Loo1/g$f0$a$a;->I:I

    iput v3, v0, Loo1/g$f0$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
