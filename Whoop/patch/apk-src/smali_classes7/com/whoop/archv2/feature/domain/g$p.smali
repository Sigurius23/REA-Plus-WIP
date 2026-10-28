.class final Lcom/whoop/archv2/feature/domain/g$p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->s(Lec3/l;)Lec3/l;
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
        "Lcom/whoop/archv2/feature/domain/g$b;",
        "state",
        "Lcom/whoop/archv2/feature/domain/c;",
        "action",
        "<anonymous>",
        "(Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.archv2.feature.domain.GenericInteractor$createFetchFlow$2"
    f = "GenericInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/archv2/feature/domain/g;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/g;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/g$p;->z:Lcom/whoop/archv2/feature/domain/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/g$b;",
            "Lcom/whoop/archv2/feature/domain/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/archv2/feature/domain/g$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/archv2/feature/domain/g$p;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$p;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {v0, v1, p3}, Lcom/whoop/archv2/feature/domain/g$p;-><init>(Lcom/whoop/archv2/feature/domain/g;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$p;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/archv2/feature/domain/g$p;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/archv2/feature/domain/g$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/archv2/feature/domain/g$b;

    check-cast p2, Lcom/whoop/archv2/feature/domain/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/g$p;->f(Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$p;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/archv2/feature/domain/g$b;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$p;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/archv2/feature/domain/g$p;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$p;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-static {p1, v0, v1}, Lcom/whoop/archv2/feature/domain/g;->o(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
