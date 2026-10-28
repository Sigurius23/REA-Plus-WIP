.class final Lpt1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpt1/d;->l(Lec3/l;)Lec3/l;
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
        "Lpt1/b;",
        "domainState",
        "Ldk0/j;",
        "r17",
        "<anonymous>",
        "(Lpt1/b;Ldk0/j;)Lpt1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$1$1"
    f = "LabradorReadingInteractor.kt"
    l = {
        0x6d,
        0x72,
        0x82,
        0x9f,
        0xa4
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:J

.field I:I

.field synthetic J:Ljava/lang/Object;

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lpt1/d;

.field final synthetic M:Lpt1/a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpt1/d;Lpt1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpt1/d;",
            "Lpt1/a;",
            "Lq83/d<",
            "-",
            "Lpt1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpt1/d$c;->L:Lpt1/d;

    iput-object p2, p0, Lpt1/d$c;->M:Lpt1/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lpt1/b;Ldk0/j;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpt1/b;",
            "Ldk0/j;",
            "Lq83/d<",
            "-",
            "Lpt1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lpt1/d$c;

    iget-object v1, p0, Lpt1/d$c;->L:Lpt1/d;

    iget-object v2, p0, Lpt1/d$c;->M:Lpt1/a;

    invoke-direct {v0, v1, v2, p3}, Lpt1/d$c;-><init>(Lpt1/d;Lpt1/a;Lq83/d;)V

    iput-object p1, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    iput-object p2, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lpt1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpt1/b;

    check-cast p2, Ldk0/j;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lpt1/d$c;->f(Lpt1/b;Ldk0/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lpt1/b;

    iget-object v1, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    check-cast v1, Ldk0/j;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lpt1/d$c;->I:I

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v10, :cond_3

    if-eq v4, v8, :cond_2

    if-eq v4, v7, :cond_1

    if-ne v4, v6, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_9

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_7

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_0

    :cond_3
    iget-object v1, v0, Lpt1/d$c;->G:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Lpt1/d$c;->F:Ljava/lang/Object;

    check-cast v2, Ldk0/j;

    iget-object v3, v0, Lpt1/d$c;->E:Ljava/lang/Object;

    check-cast v3, Lpt1/b;

    iget-object v4, v0, Lpt1/d$c;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v0, Lpt1/d$c;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v0, Lpt1/d$c;->x:Ljava/lang/Object;

    check-cast v4, Lorg/joda/time/DateTime;

    iget-object v4, v0, Lpt1/d$c;->w:Ljava/lang/Object;

    check-cast v4, Lrk1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    move-object v4, v1

    move-object v1, v2

    move-object v6, v3

    goto/16 :goto_4

    :cond_4
    iget-wide v6, v0, Lpt1/d$c;->H:J

    iget-object v4, v0, Lpt1/d$c;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v8, v0, Lpt1/d$c;->y:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v0, Lpt1/d$c;->x:Ljava/lang/Object;

    check-cast v9, Lorg/joda/time/DateTime;

    iget-object v9, v0, Lpt1/d$c;->w:Ljava/lang/Object;

    check-cast v9, Lrk1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    move-object v12, v4

    move-object v4, v8

    goto/16 :goto_3

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lpt1/b;->c()Lpt1/c;

    move-result-object v4

    instance-of v12, v4, Lpt1/c$g;

    const/16 v13, 0xff

    if-eqz v12, :cond_7

    invoke-virtual {v1}, Ldk0/j;->k0()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v3

    if-lez v3, :cond_6

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v3

    if-eq v3, v13, :cond_6

    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v3

    invoke-virtual {v3}, Lss1/a;->b()V

    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v3

    invoke-interface {v3, v1}, Lts1/c;->a(Ldk0/j;)V

    new-instance v3, Lpt1/c$e;

    invoke-direct {v3, v1, v11, v10, v11}, Lpt1/c$e;-><init>(Ldk0/j;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_6
    invoke-virtual {v1}, Ldk0/j;->k0()Z

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v12, v4, Lpt1/c$e;

    if-eqz v12, :cond_15

    invoke-virtual {v1}, Ldk0/j;->k0()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v4

    invoke-virtual {v2}, Lpt1/b;->c()Lpt1/c;

    move-result-object v6

    check-cast v6, Lpt1/c$e;

    invoke-virtual {v6}, Lpt1/c$e;->c()Ldk0/j;

    move-result-object v6

    invoke-virtual {v6}, Ldk0/j;->h0()S

    move-result v6

    if-ge v4, v6, :cond_8

    goto/16 :goto_5

    :cond_8
    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v4

    const/16 v6, 0x64

    if-eq v4, v6, :cond_d

    invoke-virtual {v1}, Ldk0/j;->e0()S

    move-result v4

    int-to-byte v4, v4

    invoke-static {v4}, Lqt1/d;->a(B)Lqt1/c;

    move-result-object v4

    sget-object v6, Lqt1/c$a;->a:Lqt1/c$a;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v4

    if-ne v4, v13, :cond_a

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v1

    invoke-virtual {v1}, Lss1/a;->q()V

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v1

    invoke-interface {v1}, Lts1/c;->d()V

    sget-object v3, Lpt1/c$d;->a:Lpt1/c$d;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_a
    invoke-virtual {v1}, Ldk0/j;->j0()Z

    move-result v4

    if-nez v4, :cond_c

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    iput-object v11, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    iput v8, v0, Lpt1/d$c;->I:I

    invoke-static {v1, v2, v0}, Lpt1/d;->f(Lpt1/d;Lpt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto/16 :goto_8

    :cond_b
    :goto_0
    check-cast v1, Lpt1/b;

    return-object v1

    :cond_c
    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v3

    invoke-interface {v3, v1}, Lts1/c;->a(Ldk0/j;)V

    new-instance v3, Lpt1/c$e;

    invoke-direct {v3, v1, v11, v10, v11}, Lpt1/c$e;-><init>(Ldk0/j;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_d
    :goto_1
    sget-object v4, Lrk1/c;->Companion:Lrk1/c$a;

    invoke-virtual {v1}, Ldk0/j;->d0()S

    move-result v6

    invoke-virtual {v1}, Ldk0/j;->g0()S

    move-result v7

    invoke-virtual {v4, v6, v7}, Lrk1/c$a;->b(II)Lrk1/c;

    move-result-object v4

    sget-object v6, Lrk1/c;->Unreadable:Lrk1/c;

    if-ne v4, v6, :cond_e

    sget-object v3, Lpt1/e;->Companion:Lpt1/e$a;

    invoke-virtual {v1}, Ldk0/j;->i0()S

    move-result v1

    invoke-virtual {v3, v1}, Lpt1/e$a;->a(S)Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v3

    invoke-virtual {v3, v1}, Lss1/a;->t(Ljava/util/List;)V

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v1

    invoke-interface {v1}, Lts1/c;->d()V

    sget-object v3, Lpt1/c$i;->a:Lpt1/c$i;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_e
    sget-object v6, Lrk1/c;->Inconclusive:Lrk1/c;

    if-ne v4, v6, :cond_f

    iget-object v6, v0, Lpt1/d$c;->M:Lpt1/a;

    check-cast v6, Lpt1/a$b;

    invoke-virtual {v6}, Lpt1/a$b;->a()Z

    move-result v6

    if-nez v6, :cond_f

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v1

    invoke-interface {v1}, Lts1/c;->d()V

    sget-object v3, Lpt1/c$f;->a:Lpt1/c$f;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_f
    iget-object v6, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v6}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v6

    invoke-virtual {v4}, Lrk1/c;->getAnalyticsId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Lss1/a;->s(Ljava/lang/String;)V

    invoke-virtual {v1}, Llt0/b;->Y()Lfk2/a;

    move-result-object v4

    invoke-virtual {v4}, Lfk2/a;->j()J

    move-result-wide v6

    new-instance v4, Lorg/joda/time/DateTime;

    sget-object v8, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v4, v6, v7, v8}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v8, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-static {v8}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v8

    invoke-virtual {v8, v4}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ldk0/j;->c0()[S

    move-result-object v8

    new-instance v12, Ljava/util/ArrayList;

    array-length v13, v8

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    array-length v13, v8

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v13, :cond_10

    aget-short v15, v8, v14

    int-to-short v15, v15

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v15}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_10
    iget-object v5, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v5}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v5

    invoke-interface {v5, v1}, Lts1/c;->a(Ldk0/j;)V

    iget-object v5, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v5}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v5

    iput-object v2, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    iput-object v1, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->w:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->x:Ljava/lang/Object;

    iput-object v4, v0, Lpt1/d$c;->y:Ljava/lang/Object;

    iput-object v12, v0, Lpt1/d$c;->z:Ljava/lang/Object;

    iput-wide v6, v0, Lpt1/d$c;->H:J

    iput v9, v0, Lpt1/d$c;->I:I

    invoke-interface {v5, v0}, Lts1/c;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_11

    goto/16 :goto_8

    :cond_11
    :goto_3
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v5, v0, Lpt1/d$c;->L:Lpt1/d;

    sget-object v8, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    iput-object v11, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->w:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->x:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->y:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->z:Ljava/lang/Object;

    iput-object v2, v0, Lpt1/d$c;->E:Ljava/lang/Object;

    iput-object v1, v0, Lpt1/d$c;->F:Ljava/lang/Object;

    iput-object v4, v0, Lpt1/d$c;->G:Ljava/lang/Object;

    iput-wide v6, v0, Lpt1/d$c;->H:J

    iput v10, v0, Lpt1/d$c;->I:I

    const/4 v6, 0x0

    invoke-static {v5, v12, v8, v6, v0}, Lpt1/d;->a(Lpt1/d;Ljava/util/List;Ly81/f;ZLq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_12

    goto/16 :goto_8

    :cond_12
    move-object v6, v2

    :goto_4
    check-cast v5, Ljava/util/List;

    new-instance v7, Lpt1/c$b;

    invoke-direct {v7, v1, v4, v5}, Lpt1/c$b;-><init>(Ldk0/j;Ljava/lang/String;Ljava/util/List;)V

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_13
    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v1

    invoke-interface {v1}, Lts1/c;->d()V

    sget-object v3, Lpt1/c$d;->a:Lpt1/c$d;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_14
    :goto_5
    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v3

    invoke-interface {v3}, Lts1/c;->d()V

    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v3

    invoke-virtual {v3}, Lss1/a;->q()V

    new-instance v3, Lpt1/c$h;

    invoke-direct {v3, v1}, Lpt1/c$h;-><init>(Ldk0/j;)V

    invoke-virtual {v2}, Lpt1/b;->d()I

    move-result v1

    add-int/lit8 v4, v1, 0x1

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_15
    instance-of v5, v4, Lpt1/c$h;

    if-eqz v5, :cond_19

    invoke-virtual {v1}, Ldk0/j;->k0()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v3

    if-lez v3, :cond_16

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v3

    if-eq v3, v13, :cond_16

    iget-object v3, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v3}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v3

    invoke-interface {v3, v1}, Lts1/c;->a(Ldk0/j;)V

    new-instance v3, Lpt1/c$e;

    invoke-direct {v3, v1, v11, v10, v11}, Lpt1/c$e;-><init>(Ldk0/j;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_16
    invoke-virtual {v2}, Lpt1/b;->d()I

    move-result v3

    if-ge v3, v8, :cond_18

    invoke-virtual {v1}, Ldk0/j;->h0()S

    move-result v3

    if-ne v3, v13, :cond_17

    goto :goto_6

    :cond_17
    new-instance v3, Lpt1/c$h;

    invoke-direct {v3, v1}, Lpt1/c$h;-><init>(Ldk0/j;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_18
    :goto_6
    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v1

    invoke-virtual {v1}, Lss1/a;->q()V

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v1

    invoke-virtual {v1}, Lss1/a;->r()V

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v1

    invoke-interface {v1}, Lts1/c;->d()V

    sget-object v3, Lpt1/c$d;->a:Lpt1/c$d;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lpt1/b;->b(Lpt1/b;Lpt1/c;IZILjava/lang/Object;)Lpt1/b;

    move-result-object v1

    return-object v1

    :cond_19
    instance-of v1, v4, Lpt1/c$b;

    if-eqz v1, :cond_1b

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    iput-object v11, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    iput v7, v0, Lpt1/d$c;->I:I

    invoke-static {v1, v2, v0}, Lpt1/d;->h(Lpt1/d;Lpt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1a

    goto :goto_8

    :cond_1a
    :goto_7
    check-cast v1, Lpt1/b;

    return-object v1

    :cond_1b
    instance-of v1, v4, Lpt1/c$d;

    if-eqz v1, :cond_1d

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->b(Lpt1/d;)Lss1/a;

    move-result-object v1

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-virtual {v1, v4}, Lss1/a;->t(Ljava/util/List;)V

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    invoke-static {v1}, Lpt1/d;->c(Lpt1/d;)Lts1/c;

    move-result-object v1

    invoke-interface {v1}, Lts1/c;->d()V

    iget-object v1, v0, Lpt1/d$c;->L:Lpt1/d;

    iput-object v11, v0, Lpt1/d$c;->J:Ljava/lang/Object;

    iput-object v11, v0, Lpt1/d$c;->K:Ljava/lang/Object;

    iput v6, v0, Lpt1/d$c;->I:I

    invoke-static {v1, v2, v0}, Lpt1/d;->h(Lpt1/d;Lpt1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1c

    :goto_8
    return-object v3

    :cond_1c
    :goto_9
    check-cast v1, Lpt1/b;

    return-object v1

    :cond_1d
    return-object v2
.end method
