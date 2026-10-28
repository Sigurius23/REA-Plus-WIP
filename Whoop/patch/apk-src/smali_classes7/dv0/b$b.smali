.class final Ldv0/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv0/b;-><init>(Ltr2/n;Lyu0/f;Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V
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
        "Ldv0/d;",
        "currentCounter",
        "Ldv0/e;",
        "reducedRealTimePacket",
        "<anonymous>",
        "(Ldv0/d;Ldv0/e;)Ldv0/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$realtimeDataFlow$4"
    f = "RealtimeGapDetector.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldv0/b;


# direct methods
.method public constructor <init>(Ldv0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv0/b;",
            "Lq83/d<",
            "-",
            "Ldv0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv0/b$b;->z:Ldv0/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldv0/d;Ldv0/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv0/d;",
            "Ldv0/e;",
            "Lq83/d<",
            "-",
            "Ldv0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldv0/b$b;

    iget-object v1, p0, Ldv0/b$b;->z:Ldv0/b;

    invoke-direct {v0, v1, p3}, Ldv0/b$b;-><init>(Ldv0/b;Lq83/d;)V

    iput-object p1, v0, Ldv0/b$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldv0/b$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldv0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv0/d;

    check-cast p2, Ldv0/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldv0/b$b;->f(Ldv0/d;Ldv0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Ldv0/b$b;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ldv0/d;

    iget-object v0, p0, Ldv0/b$b;->y:Ljava/lang/Object;

    check-cast v0, Ldv0/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldv0/b$b;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ldv0/d;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ldv0/e;->a()J

    move-result-wide v3

    invoke-virtual {v0}, Ldv0/e;->b()I

    move-result v5

    invoke-virtual {v0}, Ldv0/e;->c()D

    move-result-wide v6

    invoke-virtual {v1}, Ldv0/d;->e()I

    move-result p1

    add-int/lit8 v10, p1, 0x1

    iget-object p1, p0, Ldv0/b$b;->z:Ldv0/b;

    invoke-static {p1}, Ldv0/b;->i(Ldv0/b;)Lfy1/g;

    move-result-object p1

    invoke-interface {p1}, Lfy1/g;->a()J

    move-result-wide v8

    iget-object p1, p0, Ldv0/b$b;->z:Ldv0/b;

    invoke-static {p1}, Ldv0/b;->h(Ldv0/b;)J

    move-result-wide v11

    sub-long/2addr v8, v11

    long-to-double v8, v8

    const-wide v11, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v8, v11

    new-instance v11, Ljava/lang/Double;

    invoke-direct {v11, v8, v9}, Ljava/lang/Double;-><init>(D)V

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v2, 0x0

    const-wide/16 v8, 0x0

    invoke-static/range {v1 .. v13}, Ldv0/d;->b(Ldv0/d;ZJIDDILjava/lang/Double;ILjava/lang/Object;)Ldv0/d;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0}, Ldv0/e;->c()D

    move-result-wide v2

    invoke-virtual {v1}, Ldv0/d;->f()D

    move-result-wide v4

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    sub-double v4, v2, v4

    const-wide v6, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpl-double p1, v4, v6

    if-lez p1, :cond_1

    invoke-virtual {v1}, Ldv0/d;->c()D

    move-result-wide v4

    add-double v8, v4, v2

    invoke-virtual {v0}, Ldv0/e;->a()J

    move-result-wide v3

    invoke-virtual {v0}, Ldv0/e;->b()I

    move-result v5

    invoke-virtual {v0}, Ldv0/e;->c()D

    move-result-wide v6

    invoke-virtual {v1}, Ldv0/d;->e()I

    move-result p1

    add-int/lit8 v10, p1, 0x1

    const/16 v12, 0x41

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Ldv0/d;->b(Ldv0/d;ZJIDDILjava/lang/Double;ILjava/lang/Object;)Ldv0/d;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Ldv0/e;->a()J

    move-result-wide v3

    invoke-virtual {v0}, Ldv0/e;->b()I

    move-result v5

    invoke-virtual {v0}, Ldv0/e;->c()D

    move-result-wide v6

    invoke-virtual {v1}, Ldv0/d;->e()I

    move-result p1

    add-int/lit8 v10, p1, 0x1

    const/16 v12, 0x51

    const/4 v13, 0x0

    const/4 v2, 0x0

    const-wide/16 v8, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Ldv0/d;->b(Ldv0/d;ZJIDDILjava/lang/Double;ILjava/lang/Object;)Ldv0/d;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
