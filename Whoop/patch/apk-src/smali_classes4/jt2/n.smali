.class public final Ljt2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ljt2/n;",
        "",
        "Ljt2/q;",
        "metricSliderMatcher",
        "Lls2/b;",
        "analyticHelper",
        "<init>",
        "(Ljt2/q;Lls2/b;)V",
        "Ljt2/p;",
        "domainAction",
        "Ljt2/j;",
        "domainState",
        "a",
        "(Ljt2/p;Ljt2/j;)Ljt2/j;",
        "Ll83/a0;",
        "c",
        "()V",
        "",
        "action",
        "b",
        "(Ljava/lang/String;)V",
        "Ljt2/q;",
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
.field private final a:Ljt2/q;

.field private final b:Lls2/b;


# direct methods
.method public constructor <init>(Ljt2/q;Lls2/b;)V
    .locals 1

    const-string v0, "metricSliderMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljt2/n;->a:Ljt2/q;

    iput-object p2, p0, Ljt2/n;->b:Lls2/b;

    return-void
.end method


# virtual methods
.method public final a(Ljt2/p;Ljt2/j;)Ljt2/j;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "domainAction"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "domainState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v1, Ljt2/p$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const-string v3, "Add"

    invoke-virtual {v0, v3}, Ljt2/n;->b(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    check-cast v1, Ljt2/p$a;

    invoke-virtual {v1}, Ljt2/p$a;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    const v28, 0x1ffffd

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

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
    instance-of v3, v1, Ljt2/p$r;

    if-eqz v3, :cond_1

    const-string v3, "Remove"

    invoke-virtual {v0, v3}, Ljt2/n;->b(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    check-cast v1, Ljt2/p$r;

    invoke-virtual {v1}, Ljt2/p$r;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3, v1}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v8

    const v28, 0x1ffffd

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

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

    :cond_1
    instance-of v1, v1, Ljt2/p$n;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljt2/n;->c()V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v1

    invoke-virtual {v1}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v1

    invoke-virtual {v1}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v8

    iget-object v1, v0, Ljt2/n;->a:Ljt2/q;

    invoke-virtual {v1, v2}, Ljt2/q;->e(Ljt2/j;)Ljava/util/List;

    move-result-object v10

    iget-object v1, v0, Ljt2/n;->a:Ljt2/q;

    invoke-virtual {v1, v2}, Ljt2/q;->e(Ljt2/j;)Ljava/util/List;

    move-result-object v11

    const v28, 0x1ff7e4

    const/16 v29, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

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

    :cond_2
    return-object v2
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljt2/n;->b:Lls2/b;

    new-instance v1, Lls2/a$d;

    const-string v2, "Metrics"

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toLowerCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v2}, Lls2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Ljt2/n;->b:Lls2/b;

    const-string v1, "Metrics"

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lls2/a$d;

    const-string v3, "Save"

    invoke-direct {v2, v3, v1}, Lls2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lls2/b;->q(Lls2/a;)V

    return-void
.end method
