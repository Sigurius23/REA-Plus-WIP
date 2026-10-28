.class final Lil1/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/i;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lil1/h;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.DismissConfigInteractor$interact$1$1"
    f = "DismissConfigInteractor.kt"
    l = {
        0x1a,
        0x1b,
        0x1e,
        0x1f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lil1/i;

.field final synthetic z:Lil1/g;


# direct methods
.method public constructor <init>(Lil1/i;Lil1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/i;",
            "Lil1/g;",
            "Lq83/d<",
            "-",
            "Lil1/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/i$b;->y:Lil1/i;

    iput-object p2, p0, Lil1/i$b;->z:Lil1/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lil1/i$b;

    iget-object v1, p0, Lil1/i$b;->y:Lil1/i;

    iget-object v2, p0, Lil1/i$b;->z:Lil1/g;

    invoke-direct {v0, v1, v2, p2}, Lil1/i$b;-><init>(Lil1/i;Lil1/g;Lq83/d;)V

    iput-object p1, v0, Lil1/i$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lil1/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lil1/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lil1/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lil1/i$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lil1/i$b;->x:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lil1/i$b;->w:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v12, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lil1/h$b;->a:Lil1/h$b;

    iput-object v8, p0, Lil1/i$b;->x:Ljava/lang/Object;

    iput v12, p0, Lil1/i$b;->w:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lil1/i$b;->y:Lil1/i;

    invoke-static {v2}, Lil1/i;->d(Lil1/i;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lil1/i$b$a;

    iget-object v3, p0, Lil1/i$b;->y:Lil1/i;

    iget-object v6, p0, Lil1/i$b;->z:Lil1/g;

    invoke-direct {v4, v3, v6, v13}, Lil1/i$b$a;-><init>(Lil1/i;Lil1/g;Lq83/d;)V

    iput-object v8, p0, Lil1/i$b;->x:Ljava/lang/Object;

    iput v1, p0, Lil1/i$b;->w:I

    move-object v1, v2

    const/4 v2, 0x0

    const-string v3, "failed to update home Api"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iget-object v0, p0, Lil1/i$b;->y:Lil1/i;

    invoke-static {v0}, Lil1/i;->e(Lil1/i;)Lwm0/a;

    move-result-object v0

    iput-object v8, p0, Lil1/i$b;->x:Ljava/lang/Object;

    iput v11, p0, Lil1/i$b;->w:I

    invoke-static {v0, v13, p0, v12, v13}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    new-instance v0, Lil1/h$d;

    iget-object v1, p0, Lil1/i$b;->z:Lil1/g;

    check-cast v1, Lil1/g$a;

    invoke-virtual {v1}, Lil1/g$a;->a()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lil1/h$d;-><init>(J)V

    iput-object v13, p0, Lil1/i$b;->x:Ljava/lang/Object;

    iput v10, p0, Lil1/i$b;->w:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    :goto_3
    return-object v9

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
