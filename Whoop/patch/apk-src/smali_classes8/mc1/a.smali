.class public abstract Lmc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lj71/b$g;",
        "graphPlotState",
        "Lj71/b;",
        "b",
        "(Lj71/b$g;)Lj71/b;",
        "design-models_release"
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
.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lmc1/a;->c(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lj71/b$g;)Lj71/b;
    .locals 18

    const-string v0, "graphPlotState"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lj71/b$g;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lu61/a;

    new-instance v6, Lk61/a;

    new-instance v3, Lm01/c;

    const/16 v5, 0x15

    invoke-direct {v3, v5}, Lm01/c;-><init>(I)V

    invoke-static {v3}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v3

    const/4 v5, 0x2

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7, v5, v7}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lk61/c;

    const/4 v3, 0x1

    int-to-float v9, v3

    sget-object v3, Lmc1/a$a;->w:Lmc1/a$a;

    invoke-static {v3}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    const/16 v16, 0x36

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object v8, v7

    invoke-direct/range {v8 .. v17}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lu61/a;->b(Lu61/a;Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILjava/lang/Object;)Lu61/a;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v8, 0x3a

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lj71/b$g;->f(Lj71/b$g;Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILjava/lang/Object;)Lj71/b$g;

    move-result-object v0

    return-object v0
.end method

.method private static final c(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->s()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
