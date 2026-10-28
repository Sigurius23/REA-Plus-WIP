.class final Lil1/i$c;
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
    c = "com.whoop.home.domain.DismissConfigInteractor$interact$1$2"
    f = "DismissConfigInteractor.kt"
    l = {
        0x24,
        0x25,
        0x28
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lil1/i;


# direct methods
.method public constructor <init>(Lil1/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/i;",
            "Lq83/d<",
            "-",
            "Lil1/i$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/i$c;->y:Lil1/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lil1/i$c;

    iget-object v1, p0, Lil1/i$c;->y:Lil1/i;

    invoke-direct {v0, v1, p2}, Lil1/i$c;-><init>(Lil1/i;Lq83/d;)V

    iput-object p1, v0, Lil1/i$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lil1/i$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lil1/i$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lil1/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lil1/i$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lil1/i$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lil1/i$c;->w:I

    const/4 v9, 0x3

    const/4 v2, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v10, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v9, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lil1/h$c;->a:Lil1/h$c;

    iput-object v11, p0, Lil1/i$c;->x:Ljava/lang/Object;

    iput v10, p0, Lil1/i$c;->w:I

    invoke-interface {v0, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lil1/i$c;->y:Lil1/i;

    invoke-static {v1}, Lil1/i;->d(Lil1/i;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lil1/i$c$a;

    iget-object v3, p0, Lil1/i$c;->y:Lil1/i;

    invoke-direct {v4, v3, v11}, Lil1/i$c$a;-><init>(Lil1/i;Lq83/d;)V

    iput-object v11, p0, Lil1/i$c;->x:Ljava/lang/Object;

    iput v2, p0, Lil1/i$c;->w:I

    const/4 v2, 0x0

    const-string v3, "failed to update behavior impact Api"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object v0, p0, Lil1/i$c;->y:Lil1/i;

    invoke-static {v0}, Lil1/i;->e(Lil1/i;)Lwm0/a;

    move-result-object v0

    iput-object v11, p0, Lil1/i$c;->x:Ljava/lang/Object;

    iput v9, p0, Lil1/i$c;->w:I

    invoke-static {v0, v11, p0, v10, v11}, Lwm0/a;->c(Lwm0/a;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    :goto_2
    return-object v8

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
