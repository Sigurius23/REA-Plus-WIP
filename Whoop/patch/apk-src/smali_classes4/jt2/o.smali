.class public final Ljt2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ljt2/o;",
        "",
        "Lls2/b;",
        "analyticHelper",
        "<init>",
        "(Lls2/b;)V",
        "Ljt2/j;",
        "domainState",
        "Ljt2/p$o;",
        "domainAction",
        "",
        "Ljt2/r;",
        "b",
        "(Ljt2/j;Ljt2/p$o;)Ljava/util/List;",
        "Ljt2/p;",
        "a",
        "(Ljt2/p;Ljt2/j;)Ljt2/j;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "targetGoalType",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V",
        "Lls2/b;",
        "weekly-plan_release"
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
.field private final a:Lls2/b;


# direct methods
.method public constructor <init>(Lls2/b;)V
    .locals 1

    const-string v0, "analyticHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljt2/o;->a:Lls2/b;

    return-void
.end method

.method private final b(Ljt2/j;Ljt2/p$o;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/j;",
            "Ljt2/p$o;",
            ")",
            "Ljava/util/List<",
            "Ljt2/r;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v0

    invoke-virtual {v0}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljt2/r;

    invoke-virtual {v2}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    invoke-virtual {p2}, Ljt2/p$o;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Ljt2/r;

    new-instance v2, Ljt2/r;

    invoke-virtual {p2}, Ljt2/p$o;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljt2/r;->b()D

    move-result-wide v0

    :goto_1
    move-wide v4, v0

    goto :goto_2

    :cond_2
    const-wide/16 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p2}, Ljt2/p$o;->a()D

    move-result-wide v6

    invoke-direct/range {v2 .. v7}, Ljt2/r;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DD)V

    invoke-virtual {p1}, Ljt2/j;->c()Ljt2/d;

    move-result-object p1

    invoke-virtual {p1}, Ljt2/d;->r()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljt2/r;

    invoke-virtual {v3}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    invoke-virtual {p2}, Ljt2/p$o;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v4

    if-eq v3, v4, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {v2, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Ljt2/p;Ljt2/j;)Ljt2/j;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "domainAction"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "domainState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v1, Ljt2/p$w;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    check-cast v1, Ljt2/p$w;

    invoke-virtual {v1}, Ljt2/p$w;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v9

    const v28, 0x1ffffb

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v29}, Ljt2/d;->b(Ljt2/d;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljt2/d;

    move-result-object v1

    invoke-static {v2, v5, v1, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Ljt2/p$y;

    if-eqz v3, :cond_6

    check-cast v1, Ljt2/p$y;

    invoke-virtual {v1}, Ljt2/p$y;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v7

    invoke-virtual {v1}, Ljt2/p$y;->b()D

    move-result-wide v8

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->r()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Ljt2/r;

    invoke-virtual {v10}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v10

    invoke-virtual {v1}, Ljt2/p$y;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v11

    if-ne v10, v11, :cond_1

    goto :goto_0

    :cond_2
    move-object v6, v5

    :goto_0
    check-cast v6, Ljt2/r;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljt2/r;->a()D

    move-result-wide v10

    goto :goto_1

    :cond_3
    const-wide/16 v10, 0x0

    :goto_1
    new-instance v6, Ljt2/r;

    invoke-direct/range {v6 .. v11}, Ljt2/r;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DD)V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljt2/r;

    invoke-virtual {v9}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v9

    invoke-virtual {v1}, Ljt2/p$y;->a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v10

    if-eq v9, v10, :cond_4

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v6, v7}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v16

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v11

    const v33, 0x1fffef

    const/16 v34, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v11 .. v34}, Ljt2/d;->b(Ljt2/d;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljt2/d;

    move-result-object v1

    invoke-static {v2, v5, v1, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Ljt2/p$o;

    if-eqz v3, :cond_7

    check-cast v1, Ljt2/p$o;

    invoke-virtual {v1}, Ljt2/p$o;->b()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljt2/o;->c(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    invoke-direct {v0, v2, v1}, Ljt2/o;->b(Ljt2/j;Ljt2/p$o;)Ljava/util/List;

    move-result-object v10

    const v28, 0x1ffff7

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v29}, Ljt2/d;->b(Ljt2/d;Ljava/util/List;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;Lsw0/g;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljt2/d;

    move-result-object v1

    invoke-static {v2, v5, v1, v4, v5}, Ljt2/j;->b(Ljt2/j;Ljt2/m;Ljt2/d;ILjava/lang/Object;)Ljt2/j;

    move-result-object v1

    return-object v1

    :cond_7
    return-object v2
.end method

.method public final c(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V
    .locals 3

    const-string v0, "targetGoalType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljt2/o;->a:Lls2/b;

    new-instance v1, Lls2/a$i;

    const-string v2, "Save"

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lls2/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    return-void
.end method
