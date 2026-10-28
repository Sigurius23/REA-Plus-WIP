.class public abstract Lzz0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aK\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a?\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00082\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\"\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "",
        "displayRange",
        "",
        "monthNames",
        "",
        "hasToday",
        "nextDateTime",
        "previousDateTime",
        "",
        "patternSeed",
        "Lzz0/m;",
        "c",
        "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;",
        "name",
        "Lzz0/i;",
        "b",
        "(Ljava/lang/String;ZI)Lzz0/i;",
        "leadingEmpty",
        "trailingEmpty",
        "offset",
        "todayAt",
        "Lzz0/c;",
        "d",
        "(IIILjava/lang/Integer;)Ljava/util/List;",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "Ljava/util/List;",
        "dayHeaders",
        "Lzz0/b;",
        "statusPattern",
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


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/util/TextResource;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzz0/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-string v5, "F"

    const-string v6, "S"

    const-string v0, "S"

    const-string v1, "M"

    const-string v2, "T"

    const-string v3, "W"

    const-string v4, "T"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, Lzz0/k;->a:Ljava/util/List;

    sget-object v3, Lzz0/b;->YES:Lzz0/b;

    sget-object v4, Lzz0/b;->NO:Lzz0/b;

    sget-object v5, Lzz0/b;->INVALID:Lzz0/b;

    move-object v6, v4

    move-object v7, v3

    move-object v8, v4

    move-object v9, v5

    filled-new-array/range {v3 .. v9}, [Lzz0/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzz0/k;->b:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzz0/k;->c(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/String;ZI)Lzz0/i;
    .locals 12

    const/16 v4, 0xa

    const/4 v5, 0x0

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v2, p2

    invoke-static/range {v0 .. v5}, Lzz0/k;->e(IIILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const/16 v4, 0xb

    const/4 v0, 0x0

    invoke-static/range {v0 .. v5}, Lzz0/k;->e(IIILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    add-int/lit8 v5, v2, 0x2

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lzz0/k;->e(IIILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    add-int/lit8 v5, v2, 0x4

    invoke-static/range {v3 .. v8}, Lzz0/k;->e(IIILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    add-int/lit8 v7, v2, 0x1

    const/4 v2, 0x0

    const/4 v11, 0x0

    if-eqz p1, :cond_0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v8, p1

    goto :goto_0

    :cond_0
    move-object v8, v2

    :goto_0
    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static/range {v5 .. v10}, Lzz0/k;->e(IIILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/util/List;

    aput-object p2, v5, v11

    aput-object v0, v5, v4

    const/4 p2, 0x2

    aput-object v1, v5, p2

    const/4 p2, 0x3

    aput-object v3, v5, p2

    const/4 p2, 0x4

    aput-object p1, v5, p2

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzz0/c;

    invoke-virtual {v0}, Lzz0/c;->a()Lzz0/b;

    move-result-object v0

    sget-object v1, Lzz0/b;->YES:Lzz0/b;

    if-ne v0, v1, :cond_2

    add-int/lit8 v11, v11, 0x1

    if-ltz v11, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Lwb3/f;->c0()V

    throw v2

    :cond_4
    :goto_2
    new-instance p2, Lzz0/i;

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    sget-object v0, Lzz0/k;->a:Ljava/util/List;

    invoke-direct {p2, p0, v11, v0, p1}, Lzz0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Ljava/util/List;)V

    return-object p2
.end method

.method private static final c(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;I)Lzz0/m;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lzz0/m;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v7, v3, 0x1

    if-ltz v3, :cond_1

    check-cast v4, Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v8

    if-ne v3, v8, :cond_0

    goto :goto_1

    :cond_0
    move v6, v2

    :goto_1
    add-int v3, p5, v3

    invoke-static {v4, v6, v3}, Lzz0/k;->b(Ljava/lang/String;ZI)Lzz0/i;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v7

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzz0/i;

    invoke-virtual {v0}, Lzz0/i;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_3
    new-instance p2, Lzz0/k$a;

    invoke-direct {p2, p1}, Lzz0/k$a;-><init>(Ljava/lang/Iterable;)V

    invoke-static {p2}, Lse/a;->J(Lm83/b0;)Ljava/util/Map;

    move-result-object p1

    const-string p2, "Logging History"

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    new-instance v4, Lzz0/a;

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-eqz p3, :cond_4

    move v9, v6

    goto :goto_3

    :cond_4
    move v9, v2

    :goto_3
    if-eqz p4, :cond_5

    move v10, v6

    :goto_4
    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object v7, v4

    goto :goto_5

    :cond_5
    move v10, v2

    goto :goto_4

    :goto_5
    invoke-direct/range {v7 .. v12}, Lzz0/a;-><init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V

    move-object v4, v7

    sget-object p0, Lzz0/b;->YES:Lzz0/b;

    new-instance v0, Ll83/k;

    const-string v3, "Yes"

    invoke-direct {v0, p0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lzz0/b;->NO:Lzz0/b;

    new-instance v3, Ll83/k;

    const-string v6, "No"

    invoke-direct {v3, p0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p0, Lzz0/b;->INVALID:Lzz0/b;

    new-instance v6, Ll83/k;

    const-string v7, "Missing"

    invoke-direct {v6, p0, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v3, v6}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lzz0/b;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    new-instance v3, Lzz0/h;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_7

    :cond_6
    move v7, v2

    :goto_7
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "("

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ")"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v3, v1, v0, v7}, Lzz0/h;-><init>(Lzz0/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_7
    new-instance v1, Lzz0/m;

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x22

    const/4 v9, 0x0

    move-object v2, p2

    invoke-direct/range {v1 .. v9}, Lzz0/m;-><init>(Lcom/whoop/design/util/TextResource;ZLzz0/a;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final d(IIILjava/lang/Integer;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/util/List<",
            "Lzz0/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Li93/j;

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Li93/h;-><init>(III)V

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v5, v0

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    if-lt v5, p0, :cond_1

    rsub-int/lit8 v6, p1, 0x6

    if-le v5, v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v1

    goto :goto_2

    :cond_1
    :goto_1
    move v6, v3

    :goto_2
    new-instance v7, Lzz0/c;

    if-eqz v6, :cond_2

    sget-object v6, Lzz0/b;->EMPTY:Lzz0/b;

    goto :goto_3

    :cond_2
    sget-object v6, Lzz0/k;->b:Ljava/util/List;

    add-int v8, v5, p2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    rem-int/2addr v8, v9

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzz0/b;

    :goto_3
    if-nez p3, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne v5, v8, :cond_4

    move v8, v3

    goto :goto_5

    :cond_4
    :goto_4
    move v8, v1

    :goto_5
    invoke-direct {v7, v5, v6, v8}, Lzz0/c;-><init>(ILzz0/b;Z)V

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v4
.end method

.method public static synthetic e(IIILjava/lang/Integer;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p0, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p1, v0

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    const/4 p3, 0x0

    :cond_3
    invoke-static {p0, p1, p2, p3}, Lzz0/k;->d(IIILjava/lang/Integer;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
