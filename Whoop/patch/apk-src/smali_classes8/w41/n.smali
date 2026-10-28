.class public abstract Lw41/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lw41/o;",
        "a",
        "()Lw41/o;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a()Lw41/o;
    .locals 10

    new-instance v0, Lw41/z$b;

    new-instance v1, Lw41/w;

    const-wide v2, 0x40452c15ebfa8f7eL    # 42.344419

    const-wide v4, -0x3fae39affb04ee7cL    # -71.098634

    invoke-direct {v1, v2, v3, v4, v5}, Lw41/w;-><init>(DD)V

    new-instance v2, Lw41/w;

    const-wide v3, 0x40452b0ceb145f88L    # 42.33633173460754

    const-wide v5, -0x3fae3a4226220c1dL    # -71.08971258807246

    invoke-direct {v2, v3, v4, v5, v6}, Lw41/w;-><init>(DD)V

    invoke-static {}, Lw41/y;->a()Ljava/util/List;

    move-result-object v3

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lw41/z$b;-><init>(Lw41/w;Lw41/w;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    new-instance v4, Lw41/r;

    const-string v5, "1.3"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v6, "mi"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v7, "distance"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lw41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lw41/o;

    move-object v2, v0

    move-object v0, v1

    const-string v1, "route"

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lw41/o;-><init>(Ljava/lang/String;Lw41/z;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
