.class final Lfu2/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfu2/f;->e(Lbc3/c0;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.common.domain.StrainStartupHandler$disableDataStreamingIfLeftOn$1"
    f = "StrainStartupHandler.kt"
    l = {
        0x22
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Z

.field x:I

.field y:I

.field final synthetic z:Lfu2/f;


# direct methods
.method public constructor <init>(Lfu2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfu2/f;",
            "Lq83/d<",
            "-",
            "Lfu2/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfu2/f$a;->z:Lfu2/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lfu2/f$a;

    iget-object v0, p0, Lfu2/f$a;->z:Lfu2/f;

    invoke-direct {p1, v0, p2}, Lfu2/f$a;-><init>(Lfu2/f;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lfu2/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfu2/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfu2/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfu2/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfu2/f$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfu2/f$a;->z:Lfu2/f;

    invoke-static {p1}, Lfu2/f;->b(Lfu2/f;)Lu92/d;

    move-result-object p1

    const-string v1, "RawDataStreamingEnabled"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result p1

    iget-object v1, p0, Lfu2/f$a;->z:Lfu2/f;

    invoke-static {v1}, Lfu2/f;->b(Lfu2/f;)Lu92/d;

    move-result-object v1

    const-string v4, "StrengthBuilderSavedState"

    invoke-virtual {v1, v4}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    if-eqz p1, :cond_3

    if-nez v1, :cond_3

    iget-object v4, p0, Lfu2/f$a;->z:Lfu2/f;

    invoke-static {v4}, Lfu2/f;->a(Lfu2/f;)Ltr2/n;

    move-result-object v4

    const-string v5, "Detected IMU or raw data streaming is still on, but there is no active strength builder workout. Turning it off."

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v4, v5, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v3, p0, Lfu2/f$a;->z:Lfu2/f;

    invoke-static {v3}, Lfu2/f;->c(Lfu2/f;)Liu2/a;

    move-result-object v3

    iput-boolean p1, p0, Lfu2/f$a;->w:Z

    iput v1, p0, Lfu2/f$a;->x:I

    iput v2, p0, Lfu2/f$a;->y:I

    invoke-virtual {v3, p0}, Liu2/a;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
