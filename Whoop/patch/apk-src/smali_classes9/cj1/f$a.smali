.class final Lcj1/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcj1/f;->a(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lsl1/b;",
        "connectivityTileDomainResult",
        "Lri1/h;",
        "healthTabContentDomainResult",
        "Lyg2/d;",
        "liveHrMonitorStatus",
        "<anonymous>",
        "(Lsl1/b;Lri1/h;Lyg2/d;)Lri1/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.health.presentation.HealthTabCombiner$combineFlows$1"
    f = "HealthTabCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcj1/f$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lsl1/b;Lri1/h;Lyg2/d;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl1/b;",
            "Lri1/h;",
            "Lyg2/d;",
            "Lq83/d<",
            "-",
            "Lri1/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcj1/f$a;

    invoke-direct {v0, p4}, Lcj1/f$a;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcj1/f$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcj1/f$a;->y:Ljava/lang/Object;

    iput-object p3, v0, Lcj1/f$a;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcj1/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsl1/b;

    check-cast p2, Lri1/h;

    check-cast p3, Lyg2/d;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcj1/f$a;->f(Lsl1/b;Lri1/h;Lyg2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcj1/f$a;->x:Ljava/lang/Object;

    check-cast v0, Lsl1/b;

    iget-object v1, p0, Lcj1/f$a;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lri1/h;

    iget-object v1, p0, Lcj1/f$a;->z:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lyg2/d;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcj1/f$a;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lcj1/x;->a()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    instance-of p1, v0, Lsl1/b$f;

    if-nez p1, :cond_0

    invoke-virtual {v2}, Lri1/h;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lsl1/b$f;->o:Lsl1/b$f;

    :cond_1
    :goto_0
    move-object v8, v0

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v10}, Lri1/h;->b(Lri1/h;Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;ILjava/lang/Object;)Lri1/h;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
