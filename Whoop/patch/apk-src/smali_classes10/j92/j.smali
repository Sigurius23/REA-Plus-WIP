.class public interface abstract Lj92/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj92/j$a;,
        Lj92/j$b;,
        Lj92/j$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001:\u0003\u0003\u000e\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0008\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0003\u0011\u0012\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lj92/j;",
        "",
        "Ljy1/a;",
        "b",
        "()Ljy1/a;",
        "",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "",
        "c",
        "()Ljava/lang/Boolean;",
        "usingCognito",
        "",
        "a",
        "()Ljava/util/List;",
        "tags",
        "Lj92/j$a;",
        "Lj92/j$b;",
        "Lj92/j$c;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public b()Ljy1/a;
    .locals 9

    invoke-interface {p0}, Lj92/j;->c()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Lj92/j;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const-string v1, "using_cognito:true"

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lj92/j;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const-string v1, "using_cognito:false"

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    invoke-interface {p0}, Lj92/j;->a()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :goto_1
    new-instance v1, Ljy1/a;

    invoke-interface {p0}, Lj92/j;->getName()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public abstract c()Ljava/lang/Boolean;
.end method

.method public abstract getName()Ljava/lang/String;
.end method
