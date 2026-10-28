.class public final Ljt2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Ljt2/e;",
        "",
        "Lls2/b;",
        "analyticHelper",
        "<init>",
        "(Lls2/b;)V",
        "",
        "Ljt2/a;",
        "selectedActivities",
        "Ljt2/p$u;",
        "domainAction",
        "d",
        "(Ljava/util/List;Ljt2/p$u;)Ljava/util/List;",
        "Ljt2/p;",
        "internalAction",
        "Ljt2/j;",
        "domainState",
        "a",
        "(Ljt2/p;Ljt2/j;)Ljt2/j;",
        "Ll83/a0;",
        "b",
        "()V",
        "pendingSelectedActivities",
        "c",
        "(Ljt2/p$u;Ljava/util/List;)V",
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

    iput-object p1, p0, Ljt2/e;->a:Lls2/b;

    return-void
.end method

.method private final d(Ljava/util/List;Ljt2/p$u;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljt2/a;",
            ">;",
            "Ljt2/p$u;",
            ")",
            "Ljava/util/List<",
            "Ljt2/a;",
            ">;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljt2/a;

    invoke-virtual {v1}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljt2/p$u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_3

    move-object v4, v2

    check-cast v4, Ljt2/a;

    invoke-virtual {v4}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljt2/p$u;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2}, Ljt2/p$u;->c()Z

    move-result v6

    invoke-virtual {p2}, Ljt2/p$u;->b()I

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-static/range {v4 .. v9}, Ljt2/a;->b(Ljt2/a;Ljava/lang/String;ZIILjava/lang/Object;)Ljt2/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move v1, v3

    goto :goto_0

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p1, 0x0

    throw p1

    :cond_4
    return-object v0

    :cond_5
    :goto_1
    new-instance p1, Ljt2/a;

    invoke-virtual {p2}, Ljt2/p$u;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljt2/p$u;->c()Z

    move-result v2

    invoke-virtual {p2}, Ljt2/p$u;->b()I

    move-result p2

    invoke-direct {p1, v1, v2, p2}, Ljt2/a;-><init>(Ljava/lang/String;ZI)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public final a(Ljt2/p;Ljt2/j;)Ljt2/j;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "internalAction"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "domainState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v1, Ljt2/p$u;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    check-cast v1, Ljt2/p$u;

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljt2/e;->c(Ljt2/p$u;Ljava/util/List;)V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v3

    invoke-virtual {v3}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3, v1}, Ljt2/e;->d(Ljava/util/List;Ljt2/p$u;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    const v28, 0x1fffbf

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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
    instance-of v1, v1, Ljt2/p$j;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljt2/e;->b()V

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v6

    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v1

    invoke-virtual {v1}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v14

    const v28, 0x1ff77f

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    :cond_1
    return-object v2
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Ljt2/e;->a:Lls2/b;

    const-string v1, "Activities"

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

.method public final c(Ljt2/p$u;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/p$u;",
            "Ljava/util/List<",
            "Ljt2/a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "internalAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingSelectedActivities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljt2/a;

    invoke-virtual {v1}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljt2/p$u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljt2/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljt2/a;->e()Z

    move-result p2

    invoke-virtual {p1}, Ljt2/p$u;->c()Z

    move-result v0

    if-eq p2, v0, :cond_2

    iget-object p2, p0, Ljt2/e;->a:Lls2/b;

    new-instance v0, Lls2/a$e;

    invoke-virtual {p1}, Ljt2/p$u;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljt2/p$u;->c()Z

    move-result v2

    invoke-virtual {p1}, Ljt2/p$u;->b()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lls2/a$e;-><init>(Ljava/lang/String;ZI)V

    invoke-virtual {p2, v0}, Lls2/b;->q(Lls2/a;)V

    :cond_2
    return-void
.end method
