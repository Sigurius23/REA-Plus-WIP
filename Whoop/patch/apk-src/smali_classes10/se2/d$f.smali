.class final Lse2/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse2/d;->interact(Lec3/l;)Lec3/l;
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
        "Lse2/a;",
        "initial",
        "Lse2/b;",
        "domainAction",
        "<anonymous>",
        "(Lse2/a;Lse2/b;)Lse2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor$interact$1"
    f = "TurnoffAlarmWarningInteractor.kt"
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
            "Lse2/d$f;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lse2/a;Lse2/b;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lse2/a;",
            "Lse2/b;",
            "Lq83/d<",
            "-",
            "Lse2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lse2/d$f;

    invoke-direct {v0, p3}, Lse2/d$f;-><init>(Lq83/d;)V

    iput-object p1, v0, Lse2/d$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lse2/d$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lse2/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lse2/a;

    check-cast p2, Lse2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lse2/d$f;->f(Lse2/a;Lse2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lse2/d$f;->x:Ljava/lang/Object;

    check-cast v0, Lse2/a;

    iget-object v1, p0, Lse2/d$f;->y:Ljava/lang/Object;

    check-cast v1, Lse2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lse2/d$f;->w:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lse2/b$b;

    if-eqz p1, :cond_0

    move-object p1, v1

    check-cast p1, Lse2/b$b;

    invoke-virtual {p1}, Lse2/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lse2/a;->a(Ljava/lang/String;Lse2/b;)Lse2/a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1, v2}, Lse2/a;->b(Lse2/a;Ljava/lang/String;Lse2/b;ILjava/lang/Object;)Lse2/a;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
