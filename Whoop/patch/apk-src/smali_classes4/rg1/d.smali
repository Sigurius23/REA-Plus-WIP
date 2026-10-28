.class public final Lrg1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lrg1/d;",
        "",
        "Lgt0/e;",
        "firmwareUpdateApi",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lnl1/a;",
        "newFirmwareUpdateMonitor",
        "Ltr2/n;",
        "logger",
        "Lgt0/d;",
        "fwAnalyticsHelper",
        "<init>",
        "(Lgt0/e;Lci2/b;Lnl1/a;Ltr2/n;Lgt0/d;)V",
        "Ll83/a0;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "d",
        "c",
        "a",
        "Lgt0/e;",
        "Lci2/b;",
        "Lnl1/a;",
        "Ltr2/n;",
        "e",
        "Lgt0/d;",
        "firmware-update-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lgt0/e;

.field private final b:Lci2/b;

.field private final c:Lnl1/a;

.field private final d:Ltr2/n;

.field private final e:Lgt0/d;


# direct methods
.method public constructor <init>(Lgt0/e;Lci2/b;Lnl1/a;Ltr2/n;Lgt0/d;)V
    .locals 1

    const-string v0, "firmwareUpdateApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newFirmwareUpdateMonitor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwAnalyticsHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg1/d;->a:Lgt0/e;

    iput-object p2, p0, Lrg1/d;->b:Lci2/b;

    iput-object p3, p0, Lrg1/d;->c:Lnl1/a;

    iput-object p4, p0, Lrg1/d;->d:Ltr2/n;

    iput-object p5, p0, Lrg1/d;->e:Lgt0/d;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrg1/d$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrg1/d$a;

    iget v1, v0, Lrg1/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrg1/d$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrg1/d$a;

    invoke-direct {v0, p0, p1}, Lrg1/d$a;-><init>(Lrg1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lrg1/d$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrg1/d$a;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lrg1/d$a;->w:Ljava/lang/Object;

    check-cast v0, Ljk0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrg1/d;->d:Ltr2/n;

    const-string v2, "Delaying firmware update"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrg1/d;->b:Lci2/b;

    invoke-interface {p1}, Lci2/b;->a()Lec3/f2;

    move-result-object p1

    iput v5, v0, Lrg1/d$a;->E:I

    invoke-static {p1, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljk0/d;

    if-eqz p1, :cond_5

    iget-object v2, p0, Lrg1/d;->a:Lgt0/e;

    new-instance v5, Lgt0/g$c;

    invoke-static {p1}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-direct {v5, p1}, Lgt0/g$c;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {v2, v5}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, v0, Lrg1/d$a;->w:Ljava/lang/Object;

    iput v3, v0, Lrg1/d$a;->x:I

    iput v4, v0, Lrg1/d$a;->E:I

    invoke-static {p1, v0}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrg1/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrg1/d$b;

    iget v1, v0, Lrg1/d$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrg1/d$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrg1/d$b;

    invoke-direct {v0, p0, p1}, Lrg1/d$b;-><init>(Lrg1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lrg1/d$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrg1/d$b;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lrg1/d$b;->w:Ljava/lang/Object;

    check-cast v0, Ljk0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrg1/d;->d:Ltr2/n;

    const-string v2, "Processing firmware update"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrg1/d;->b:Lci2/b;

    invoke-interface {p1}, Lci2/b;->a()Lec3/f2;

    move-result-object p1

    iput v5, v0, Lrg1/d$b;->E:I

    invoke-static {p1, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljk0/d;

    if-eqz p1, :cond_5

    iget-object v2, p0, Lrg1/d;->a:Lgt0/e;

    new-instance v5, Lgt0/g$e;

    invoke-static {p1}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-direct {v5, p1}, Lgt0/g$e;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {v2, v5}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, v0, Lrg1/d$b;->w:Ljava/lang/Object;

    iput v3, v0, Lrg1/d$b;->x:I

    iput v4, v0, Lrg1/d$b;->E:I

    invoke-static {p1, v0}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lrg1/d$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lrg1/d$c;

    iget v1, v0, Lrg1/d$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrg1/d$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrg1/d$c;

    invoke-direct {v0, p0, p1}, Lrg1/d$c;-><init>(Lrg1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lrg1/d$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrg1/d$c;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lrg1/d$c;->w:Ljava/lang/Object;

    check-cast v0, Ljk0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrg1/d;->d:Ltr2/n;

    const-string v2, "Resetting firmware update state"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrg1/d;->c:Lnl1/a;

    invoke-virtual {p1}, Lnl1/a;->e()V

    iget-object p1, p0, Lrg1/d;->b:Lci2/b;

    invoke-interface {p1}, Lci2/b;->a()Lec3/f2;

    move-result-object p1

    iput v5, v0, Lrg1/d$c;->E:I

    invoke-static {p1, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljk0/d;

    if-eqz p1, :cond_5

    iget-object v2, p0, Lrg1/d;->a:Lgt0/e;

    new-instance v5, Lgt0/g$f;

    invoke-static {p1}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-direct {v5, p1}, Lgt0/g$f;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {v2, v5}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, v0, Lrg1/d$c;->w:Ljava/lang/Object;

    iput v3, v0, Lrg1/d$c;->x:I

    iput v4, v0, Lrg1/d$c;->E:I

    invoke-static {p1, v0}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lrg1/d$d;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lrg1/d$d;

    iget v3, v2, Lrg1/d$d;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lrg1/d$d;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lrg1/d$d;

    invoke-direct {v2, v0, v1}, Lrg1/d$d;-><init>(Lrg1/d;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lrg1/d$d;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lrg1/d$d;->E:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lrg1/d$d;->w:Ljava/lang/Object;

    check-cast v2, Ljk0/d;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lrg1/d;->d:Ltr2/n;

    const-string v4, "Retrying firmware update"

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v1, v4, v8}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v0, Lrg1/d;->c:Lnl1/a;

    invoke-virtual {v1}, Lnl1/a;->e()V

    iget-object v8, v0, Lrg1/d;->e:Lgt0/d;

    sget-object v9, Lgt0/b;->PROMPT:Lgt0/b;

    sget-object v11, Lgt0/a;->RETRY:Lgt0/a;

    const/16 v15, 0x30

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v1, v0, Lrg1/d;->b:Lci2/b;

    invoke-interface {v1}, Lci2/b;->a()Lec3/f2;

    move-result-object v1

    iput v7, v2, Lrg1/d$d;->E:I

    invoke-static {v1, v2}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast v1, Ljk0/d;

    if-eqz v1, :cond_5

    iget-object v4, v0, Lrg1/d;->a:Lgt0/e;

    new-instance v7, Lgt0/g$e;

    invoke-static {v1}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v1

    invoke-direct {v7, v1}, Lgt0/g$e;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {v4, v7}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    move-result-object v1

    const/4 v4, 0x0

    iput-object v4, v2, Lrg1/d$d;->w:Ljava/lang/Object;

    iput v5, v2, Lrg1/d$d;->x:I

    iput v6, v2, Lrg1/d$d;->E:I

    invoke-static {v1, v2}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
