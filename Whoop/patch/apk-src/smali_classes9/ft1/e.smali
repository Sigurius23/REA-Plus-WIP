.class public abstract Lft1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\" \u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0003\u0010\u0004\" \u0010\u000c\u001a\u00020\u00088\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\t\u0012\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u0001\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lj71/b$h;",
        "a",
        "Lj71/b$h;",
        "b",
        "()Lj71/b$h;",
        "getLabradorLinePlot$annotations",
        "()V",
        "labradorLinePlot",
        "Lj71/b$m;",
        "Lj71/b$m;",
        "()Lj71/b$m;",
        "getLabradorLabelsPlot$annotations",
        "labradorLabelsPlot",
        "labrador_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lj71/b$h;

.field private static final b:Lj71/b$m;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x96

    const/4 v1, 0x0

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43150000    # 149.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    int-to-float v2, v2

    const/high16 v5, 0x40c00000    # 6.0f

    div-float/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v0, Lft1/e$a;->w:Lft1/e$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    new-instance v2, Lj71/b$h;

    const/16 v10, 0x60

    const/4 v11, 0x0

    const v6, 0x3d4ccccd    # 0.05f

    const-string v7, "labrador lines plot"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lj71/b$h;-><init>(Ljava/util/List;Ljava/util/List;Ly81/e;FLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lft1/e;->a:Lj71/b$h;

    const/16 v0, 0x1e

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    new-instance v3, Lyy0/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "s"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    int-to-float v2, v2

    const/high16 v5, 0x41f00000    # 30.0f

    div-float v7, v2, v5

    const/16 v10, 0x36

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v0, Lg71/d;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3, v1}, Lg71/d;-><init>(DLjava/util/List;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v4, Lj71/b$m;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const-string v6, "labrador second labels"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lj71/b$m;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lft1/e;->b:Lj71/b$m;

    return-void
.end method

.method public static final a()Lj71/b$m;
    .locals 1

    sget-object v0, Lft1/e;->b:Lj71/b$m;

    return-object v0
.end method

.method public static final b()Lj71/b$h;
    .locals 1

    sget-object v0, Lft1/e;->a:Lj71/b$h;

    return-object v0
.end method
