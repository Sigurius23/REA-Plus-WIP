.class final Lsl0/s3$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/s3;->t(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.WhoopCoachMessageListV2Kt$WhoopCoachMessageListV2$3$1"
    f = "WhoopCoachMessageListV2.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf0/r1;

.field w:I

.field final synthetic x:Lnl0/f;

.field final synthetic y:Z

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lnl0/f;ZZLf0/r1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/f;",
            "ZZ",
            "Lf0/r1;",
            "Lq83/d<",
            "-",
            "Lsl0/s3$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/s3$b;->x:Lnl0/f;

    iput-boolean p2, p0, Lsl0/s3$b;->y:Z

    iput-boolean p3, p0, Lsl0/s3$b;->z:Z

    iput-object p4, p0, Lsl0/s3$b;->E:Lf0/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lsl0/s3$b;

    iget-object v1, p0, Lsl0/s3$b;->x:Lnl0/f;

    iget-boolean v2, p0, Lsl0/s3$b;->y:Z

    iget-boolean v3, p0, Lsl0/s3$b;->z:Z

    iget-object v4, p0, Lsl0/s3$b;->E:Lf0/r1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsl0/s3$b;-><init>(Lnl0/f;ZZLf0/r1;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lsl0/s3$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/s3$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/s3$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/s3$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/s3$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/s3$b;->x:Lnl0/f;

    invoke-virtual {p1}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lsl0/s3$b;->y:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lsl0/s3$b;->z:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lsl0/s3$b;->E:Lf0/r1;

    iget-object v1, p1, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    sget-object v3, Ld0/b0;->c:Lb23/h;

    const/4 v4, 0x2

    const/16 v5, 0x1f4

    const/4 v6, 0x0

    invoke-static {v5, v6, v3, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    iput v2, p0, Lsl0/s3$b;->w:I

    invoke-virtual {p1, v1, v3, p0}, Lf0/r1;->f(ILd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
