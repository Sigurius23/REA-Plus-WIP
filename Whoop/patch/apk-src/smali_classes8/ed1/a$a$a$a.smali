.class final Led1/a$a$a$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led1/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.showcase.menu.view.DesignShowcaseMenuItem$consumeTap$1$1$1"
    f = "DesignShowcaseMenuItem.kt"
    l = {
        0x5b,
        0x64
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Led1/a$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Led1/a$a$a$a;->E:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Led1/a$a$a$a;

    iget-object v1, p0, Led1/a$a$a$a;->E:Lc93/a;

    invoke-direct {v0, v1, p2}, Led1/a$a$a$a;-><init>(Lc93/a;Lq83/d;)V

    iput-object p1, v0, Led1/a$a$a$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Led1/a$a$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Led1/a$a$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Led1/a$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Led1/a$a$a$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Led1/a$a$a$a;->z:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Led1/a$a$a$a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Led1/a$a$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lu2/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lu2/l;->w:Lu2/l;

    iput-object v0, p0, Led1/a$a$a$a;->z:Ljava/lang/Object;

    iput v4, p0, Led1/a$a$a$a;->y:I

    move-object v2, v0

    check-cast v2, Lu2/g0;

    invoke-virtual {v2, p1, p0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lu2/k;

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    invoke-static {v2}, Lu2/d0;->b(Lu2/r;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v2}, Lu2/r;->a()V

    goto :goto_1

    :cond_5
    sget-object p1, Lu2/l;->w:Lu2/l;

    const/4 v2, 0x0

    iput-object v2, p0, Led1/a$a$a$a;->z:Ljava/lang/Object;

    iput-object v2, p0, Led1/a$a$a$a;->x:Ljava/lang/Object;

    iput v3, p0, Led1/a$a$a$a;->y:I

    check-cast v0, Lu2/g0;

    invoke-virtual {v0, p1, p0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p1, Lu2/k;

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Led1/a$a$a$a;->E:Lc93/a;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu2/r;

    invoke-static {v1}, Lu2/d0;->d(Lu2/r;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {v1}, Lu2/r;->a()V

    goto :goto_4

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
