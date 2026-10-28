.class public abstract Ll61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a/\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0015\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0003H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lj71/c;",
        "c",
        "()Lj71/c;",
        "",
        "Ll83/k;",
        "",
        "values",
        "Ll61/c;",
        "d",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lj71/b$a;",
        "e",
        "()Ljava/util/List;",
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
.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ll61/a;->g(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ll61/a;->f(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Lj71/c;
    .locals 25

    new-instance v0, Lj71/c;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const-string v1, "Overview Graph"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Le61/i;->s(Ljava/lang/String;ZZZZILjava/lang/Object;)Lj61/h;

    move-result-object v8

    new-instance v13, Lh2/c;

    const v1, 0x3d4ccccd    # 0.05f

    const v2, 0x3d23d70a    # 0.04f

    const/4 v3, 0x0

    const v4, 0x3ccccccd    # 0.025f

    invoke-direct {v13, v3, v4, v1, v2}, Lh2/c;-><init>(FFFF)V

    const/16 v23, 0x1fed

    const/16 v24, 0x0

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

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v8 .. v24}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v1

    invoke-static {}, Ll61/a;->e()Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final d(Ljava/util/List;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;)",
            "Ljava/util/List<",
            "Ll61/c;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_0

    check-cast v3, Ll83/k;

    new-instance v5, Ll61/c;

    const-string v2, ""

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    int-to-float v2, v4

    const/high16 v7, 0x41000000    # 8.0f

    div-float v7, v2, v7

    iget-object v2, v3, Ll83/k;->w:Ljava/lang/Object;

    iget-object v8, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    move-object v9, v8

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    new-instance v10, La71/a;

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " - "

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v23, 0xffb

    const/16 v24, 0x0

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

    invoke-direct/range {v10 .. v24}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v8, v2

    invoke-direct/range {v5 .. v10}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-object v1
.end method

.method private static final e()Ljava/util/List;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj71/b$a;",
            ">;"
        }
    .end annotation

    const v0, 0x3e4ccccd    # 0.2f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3e99999a    # 0.3f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x3ecccccd    # 0.4f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object v5, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v6, v5

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x3f19999a    # 0.6f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object v7, v6

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object v8, v7

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x3f4ccccd    # 0.8f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v9, v8

    new-instance v8, Ll83/k;

    invoke-direct {v8, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x3f666666    # 0.9f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v1, v9

    new-instance v9, Ll83/k;

    invoke-direct {v9, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v3, v1

    filled-new-array/range {v2 .. v9}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll61/a;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v5

    sub-int/2addr v6, v4

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ll61/a;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v8, Lj71/a;->TWO_DOTS:Lj71/a;

    new-instance v2, Ll61/d;

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x5

    invoke-static {v3, v4}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    new-instance v6, Lk61/a;

    new-instance v7, Ll60/a;

    invoke-direct {v7, v5}, Ll60/a;-><init>(I)V

    invoke-static {v7}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v6, v5, v14, v15, v14}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lk61/c;

    sget-object v5, Ll61/a$a;->w:Ll61/a$a;

    invoke-static {v5}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v20

    const/16 v24, 0x37

    const/16 v25, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v16 .. v25}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v16

    invoke-direct {v2, v3, v6, v5}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;)V

    new-instance v3, Ll61/d;

    invoke-static {v15, v1}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance v5, Lk61/a;

    new-instance v6, Ll60/a;

    invoke-direct {v6, v15}, Ll60/a;-><init>(I)V

    invoke-static {v6}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    invoke-direct {v5, v6, v14, v15, v14}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lk61/c;

    sget-object v6, Ll61/a$b;->w:Ll61/a$b;

    invoke-static {v6}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v20

    invoke-direct/range {v16 .. v25}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    invoke-direct {v3, v1, v5, v6}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;)V

    filled-new-array {v2, v3}, [Ll61/d;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v6, Lj71/b$a;

    const/16 v12, 0x18

    const/4 v13, 0x0

    const-string v9, "sleep band"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lj71/b$a;-><init>(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v6

    new-instance v16, Ll61/d;

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v15}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v17

    new-instance v2, Lk61/a;

    sget v3, Li2/x;->o:I

    sget-wide v5, Li2/x;->k:J

    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object v3

    invoke-direct {v2, v3, v14, v15, v14}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v2

    invoke-direct/range {v16 .. v21}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    new-instance v16, Ll61/d;

    invoke-static {v4, v0}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v17

    new-instance v0, Lk61/a;

    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object v3

    invoke-direct {v0, v3, v14, v15, v14}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    invoke-direct/range {v16 .. v21}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    filled-new-array {v2, v0}, [Ll61/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v6, Lj71/b$a;

    const-string v9, "cyan band"

    invoke-direct/range {v6 .. v13}, Lj71/b$a;-><init>(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v6}, [Lj71/b$a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final f(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
