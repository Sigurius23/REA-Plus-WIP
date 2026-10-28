.class public final Lci1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei1/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lci1/a;",
        "Lei1/a;",
        "Lai1/a;",
        "foregroundGpsRoutePointDao",
        "<init>",
        "(Lai1/a;)V",
        "",
        "sessionStartTimeMs",
        "Lfv1/b;",
        "location",
        "Ll83/a0;",
        "b",
        "(JLfv1/b;Lq83/d;)Ljava/lang/Object;",
        "",
        "a",
        "(JLq83/d;)Ljava/lang/Object;",
        "c",
        "minTimestamp",
        "maxTimestamp",
        "d",
        "(JJJLq83/d;)Ljava/lang/Object;",
        "Lai1/a;",
        "gps-tracking_release"
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
.field private final a:Lai1/a;


# direct methods
.method public constructor <init>(Lai1/a;)V
    .locals 1

    const-string v0, "foregroundGpsRoutePointDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lci1/a;->a:Lai1/a;

    return-void
.end method


# virtual methods
.method public a(JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lfv1/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lci1/a$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lci1/a$a;

    iget v1, v0, Lci1/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lci1/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lci1/a$a;

    invoke-direct {v0, p0, p3}, Lci1/a$a;-><init>(Lci1/a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lci1/a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lci1/a$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lci1/a;->a:Lai1/a;

    iput-wide p1, v0, Lci1/a$a;->w:J

    iput v3, v0, Lci1/a$a;->z:I

    invoke-interface {p3, p1, p2, v0}, Lai1/a;->a(JLq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p3, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lbi1/a;

    invoke-static {p3}, Lci1/b;->a(Lbi1/a;)Lfv1/b;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object p1
.end method

.method public b(JLfv1/b;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lfv1/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lci1/a;->a:Lai1/a;

    new-instance v2, Lbi1/a;

    invoke-virtual/range {p3 .. p3}, Lfv1/b;->e()J

    move-result-wide v5

    invoke-virtual/range {p3 .. p3}, Lfv1/b;->c()D

    move-result-wide v7

    invoke-virtual/range {p3 .. p3}, Lfv1/b;->d()D

    move-result-wide v9

    invoke-virtual/range {p3 .. p3}, Lfv1/b;->a()D

    move-result-wide v11

    invoke-virtual/range {p3 .. p3}, Lfv1/b;->b()D

    move-result-wide v13

    invoke-virtual/range {p3 .. p3}, Lfv1/b;->f()D

    move-result-wide v15

    move-wide/from16 v3, p1

    invoke-direct/range {v2 .. v16}, Lbi1/a;-><init>(JJDDDDD)V

    move-object v3, v2

    move-object/from16 v2, p4

    invoke-interface {v1, v3, v2}, Lai1/a;->d(Lbi1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public c(JLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lci1/a;->a:Lai1/a;

    invoke-interface {v0, p1, p2, p3}, Lai1/a;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public d(JJJLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lci1/a;->a:Lai1/a;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lai1/a;->c(JJJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
