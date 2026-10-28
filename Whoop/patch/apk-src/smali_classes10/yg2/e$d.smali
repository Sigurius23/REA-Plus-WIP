.class final Lyg2/e$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg2/e;-><init>(Lci2/b;Lwu0/b;Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lrt0/c;Leq1/a;Lbc3/c0;Lfi0/a;Lus0/g;Ljt0/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "",
        "heartRate",
        "Ljk0/a;",
        "strapBodyStatus",
        "Ljk0/d;",
        "whoopStrap",
        "",
        "Ldq1/a;",
        "hrZones",
        "Lyg2/d;",
        "<anonymous>",
        "(ILjk0/a;Ljk0/d;Ljava/util/List;)Lyg2/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.state.LiveHrStateCombiner$liveHrCombinedFlow$1"
    f = "LiveHrStateCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lyg2/e;

.field w:I

.field synthetic x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyg2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg2/e;",
            "Lq83/d<",
            "-",
            "Lyg2/e$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyg2/e$d;->F:Lyg2/e;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(ILjk0/a;Ljk0/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljk0/a;",
            "Ljk0/d;",
            "Ljava/util/List<",
            "Ldq1/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Lyg2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lyg2/e$d;

    iget-object v1, p0, Lyg2/e$d;->F:Lyg2/e;

    invoke-direct {v0, v1, p5}, Lyg2/e$d;-><init>(Lyg2/e;Lq83/d;)V

    iput p1, v0, Lyg2/e$d;->x:I

    iput-object p2, v0, Lyg2/e$d;->y:Ljava/lang/Object;

    iput-object p3, v0, Lyg2/e$d;->z:Ljava/lang/Object;

    iput-object p4, v0, Lyg2/e$d;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lyg2/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move-object v2, p2

    check-cast v2, Ljk0/a;

    move-object v3, p3

    check-cast v3, Ljk0/d;

    move-object v4, p4

    check-cast v4, Ljava/util/List;

    move-object v5, p5

    check-cast v5, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lyg2/e$d;->f(ILjk0/a;Ljk0/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lyg2/e$d;->x:I

    iget-object v1, p0, Lyg2/e$d;->y:Ljava/lang/Object;

    check-cast v1, Ljk0/a;

    iget-object v2, p0, Lyg2/e$d;->z:Ljava/lang/Object;

    check-cast v2, Ljk0/d;

    iget-object v3, p0, Lyg2/e$d;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lyg2/e$d;->w:I

    if-nez v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyg2/e$d;->F:Lyg2/e;

    invoke-static {p1, v0, v1, v2, v3}, Lyg2/e;->a(Lyg2/e;ILjk0/a;Ljk0/d;Ljava/util/List;)Lyg2/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
