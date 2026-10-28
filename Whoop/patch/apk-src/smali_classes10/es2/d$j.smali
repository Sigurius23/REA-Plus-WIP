.class final Les2/d$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les2/d;->interact(Lec3/l;)Lec3/l;
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
        "Les2/c;",
        "previousState",
        "Les2/d$a;",
        "internalAction",
        "<anonymous>",
        "(Les2/c;Les2/d$a;)Les2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.videocall.domain.VideoCallInteractor$interact$1"
    f = "VideoCallInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Les2/d;


# direct methods
.method public constructor <init>(Les2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les2/d;",
            "Lq83/d<",
            "-",
            "Les2/d$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Les2/d$j;->z:Les2/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Les2/c;Les2/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les2/c;",
            "Les2/d$a;",
            "Lq83/d<",
            "-",
            "Les2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Les2/d$j;

    iget-object v1, p0, Les2/d$j;->z:Les2/d;

    invoke-direct {v0, v1, p3}, Les2/d$j;-><init>(Les2/d;Lq83/d;)V

    iput-object p1, v0, Les2/d$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Les2/d$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Les2/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Les2/c;

    check-cast p2, Les2/d$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Les2/d$j;->f(Les2/c;Les2/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Les2/d$j;->x:Ljava/lang/Object;

    check-cast v0, Les2/c;

    iget-object v1, p0, Les2/d$j;->y:Ljava/lang/Object;

    check-cast v1, Les2/d$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Les2/d$j;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Les2/d$j;->z:Les2/d;

    invoke-static {p1, v0, v1}, Les2/d;->c(Les2/d;Les2/c;Les2/d$a;)Les2/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
