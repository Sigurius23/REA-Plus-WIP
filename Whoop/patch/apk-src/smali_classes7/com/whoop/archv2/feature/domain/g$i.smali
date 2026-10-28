.class final Lcom/whoop/archv2/feature/domain/g$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->r(Lec3/l;)Lec3/l;
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
        "Lcom/whoop/archv2/feature/domain/g$a;",
        "state",
        "Lcom/whoop/archv2/feature/domain/c;",
        "incoming",
        "<anonymous>",
        "(Lcom/whoop/archv2/feature/domain/g$a;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.domain.GenericInteractor$createActionFlow$1"
    f = "GenericInteractor.kt"
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
            "Lcom/whoop/archv2/feature/domain/g$i;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/archv2/feature/domain/g$a;Lcom/whoop/archv2/feature/domain/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/g$a;",
            "Lcom/whoop/archv2/feature/domain/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/archv2/feature/domain/g$i;

    invoke-direct {v0, p3}, Lcom/whoop/archv2/feature/domain/g$i;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/archv2/feature/domain/g$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/archv2/feature/domain/g$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/archv2/feature/domain/g$a;

    check-cast p2, Lcom/whoop/archv2/feature/domain/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/g$i;->f(Lcom/whoop/archv2/feature/domain/g$a;Lcom/whoop/archv2/feature/domain/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/feature/domain/g$a;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$i;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/archv2/feature/domain/g$i;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lcom/whoop/archv2/feature/domain/c$d;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    check-cast v1, Lcom/whoop/archv2/feature/domain/c$d;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/c$d;->a()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Lcom/whoop/archv2/feature/domain/g$a;->a(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v1}, Lcom/whoop/archv2/feature/domain/d;->a(Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/e;

    move-result-object p1

    sget-object v3, Lcom/whoop/archv2/feature/domain/e;->Action:Lcom/whoop/archv2/feature/domain/e;

    const/4 v4, 0x1

    if-ne p1, v3, :cond_1

    invoke-static {v0, v2, v1, v4, v2}, Lcom/whoop/archv2/feature/domain/g$a;->b(Lcom/whoop/archv2/feature/domain/g$a;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/c;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/g$a;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v0, v2, v2, v4, v2}, Lcom/whoop/archv2/feature/domain/g$a;->b(Lcom/whoop/archv2/feature/domain/g$a;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/c;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/g$a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
