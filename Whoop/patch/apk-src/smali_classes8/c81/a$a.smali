.class public final Lc81/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc81/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000c\u001a\u0004\u0008\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000c\u001a\u0004\u0008\u0016\u0010\u000e\u00a8\u0006\u0017"
    }
    d2 = {
        "Lc81/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "currentValueIndex",
        "",
        "Lc81/e;",
        "f",
        "(I)Ljava/util/List;",
        "Lc81/g;",
        "realisticPaceOfAgingFixture",
        "Lc81/g;",
        "c",
        "()Lc81/g;",
        "realisticPaceOfAgingFixtureAnimation",
        "d",
        "realisticPaceOfAgingFixtureAnimationReversed",
        "e",
        "leftCurrentPaceOfAgingFixture",
        "a",
        "numberedPaceOfAgingFixture",
        "b",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc81/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lc81/g;
    .locals 1

    invoke-static {}, Lc81/a;->a()Lc81/g;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lc81/g;
    .locals 1

    invoke-static {}, Lc81/a;->b()Lc81/g;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lc81/g;
    .locals 1

    invoke-static {}, Lc81/a;->c()Lc81/g;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lc81/g;
    .locals 1

    invoke-static {}, Lc81/a;->d()Lc81/g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lc81/g;
    .locals 1

    invoke-static {}, Lc81/a;->e()Lc81/g;

    move-result-object v0

    return-object v0
.end method

.method public final f(I)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lc81/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc81/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    const-string v4, "HIGHLIGHT"

    const-string v5, "CURRENT_VALUE"

    if-nez p1, :cond_1

    move-object v6, v5

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    const-string v7, "-1.0x"

    invoke-direct {v0, v7, v7, v3, v6}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v6, 0x4e

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v1

    :goto_2
    if-ge v7, v6, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, p1, :cond_2

    move v8, v2

    goto :goto_3

    :cond_2
    move v8, v1

    :goto_3
    const/16 v9, 0x27

    if-eqz v8, :cond_3

    move-object v10, v5

    goto :goto_4

    :cond_3
    const/16 v10, 0x13

    if-eq v7, v10, :cond_4

    if-eq v7, v9, :cond_4

    const/16 v10, 0x3b

    if-eq v7, v10, :cond_4

    const-string v10, "NEUTRAL"

    goto :goto_4

    :cond_4
    move-object v10, v4

    :goto_4
    const/4 v11, -0x1

    int-to-float v11, v11

    int-to-float v12, v7

    const v13, 0x3d4ccccd    # 0.05f

    mul-float/2addr v12, v13

    const v13, 0x3dcccccd    # 0.1f

    invoke-static {v12, v13}, Lor2/a1;->f(FF)F

    move-result v12

    add-float/2addr v12, v11

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    const-string v12, "%.1f"

    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "x"

    invoke-virtual {v11, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-ne v7, v9, :cond_5

    const-string v9, "1.0x"

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    :goto_5
    new-instance v12, Lc81/e;

    invoke-direct {v12, v11, v9, v8, v10}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-static {v0, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v3, Lc81/e;

    const/16 v6, 0x4f

    if-ne p1, v6, :cond_7

    move v1, v2

    :cond_7
    if-ne p1, v6, :cond_8

    move-object v4, v5

    :cond_8
    const-string p1, "3.0x"

    invoke-direct {v3, p1, p1, v1, v4}, Lc81/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
