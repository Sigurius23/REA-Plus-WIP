.class final Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->d(Ljava/lang/String;)Lec3/l;
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
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lec3/m;",
        "Lpm0/a;",
        "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;",
        "",
        "e",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.domain.SessionTargetsFetcher$fetch$2$2"
    f = "SessionTargetsFetcher.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->y:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

    iput-object p2, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->z:Ljava/lang/String;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;

    iget-object v0, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->y:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

    iget-object v1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p3}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;-><init>(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;Ljava/lang/String;Lq83/d;)V

    iput-object p2, p1, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->w:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->y:Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;

    invoke-static {p1}, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;->c(Lcom/whoop/trackactivity/domain/SessionTargetsFetcher;)Ltr2/n;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/trackactivity/domain/SessionTargetsFetcher$b;->z:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Failed to fetch live activity targets for ["

    const-string v3, "]: "

    invoke-static {v2, v1, v3, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
