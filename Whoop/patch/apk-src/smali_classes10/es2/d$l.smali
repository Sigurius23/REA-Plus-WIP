.class final Les2/d$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les2/d;->j(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Les2/d$b;",
        "acc",
        "Les2/b;",
        "domainAction",
        "<anonymous>",
        "(Les2/d$b;Les2/b;)Les2/d$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.videocall.domain.VideoCallInteractor$saveParamsForRefresh$1"
    f = "VideoCallInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Les2/d$l;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Les2/d$b;Les2/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les2/d$b;",
            "Les2/b;",
            "Lq83/d<",
            "-",
            "Les2/d$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Les2/d$l;

    invoke-direct {v0, p3}, Les2/d$l;-><init>(Lq83/d;)V

    iput-object p1, v0, Les2/d$l;->x:Ljava/lang/Object;

    iput-object p2, v0, Les2/d$l;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Les2/d$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Les2/d$b;

    check-cast p2, Les2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Les2/d$l;->f(Les2/d$b;Les2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Les2/d$l;->x:Ljava/lang/Object;

    check-cast v0, Les2/d$b;

    iget-object v1, p0, Les2/d$l;->y:Ljava/lang/Object;

    check-cast v1, Les2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Les2/d$l;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Les2/d$b;

    instance-of v2, v1, Les2/b$f;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Les2/d$b;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v2, Les2/b$a;

    invoke-virtual {v0}, Les2/d$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Les2/b$a;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    instance-of v3, v1, Les2/b$a;

    if-eqz v3, :cond_1

    check-cast v1, Les2/b$a;

    invoke-virtual {v1}, Les2/b$a;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Les2/d$b;->b()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {p1, v2, v0}, Les2/d$b;-><init>(Les2/b;Ljava/lang/String;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
