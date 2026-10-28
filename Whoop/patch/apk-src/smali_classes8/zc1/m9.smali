.class public abstract Lzc1/m9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\" \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\" \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u000b\" \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\t\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u0016\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lj71/b$n;",
        "j",
        "()Lj71/b$n;",
        "",
        "Lu61/e;",
        "a",
        "Ljava/util/List;",
        "getFilteredFakeSleepHrPoint",
        "()Ljava/util/List;",
        "filteredFakeSleepHrPoint",
        "b",
        "getFakeSleepHrPointFirstHalf",
        "fakeSleepHrPointFirstHalf",
        "getFakeSleepHrPointSecondHalf",
        "fakeSleepHrPointSecondHalf",
        "",
        "zoom",
        "Lcom/whoop/design/util/TextResource;",
        "scrubValue",
        "design-showcase_release"
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
            "Lu61/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu61/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu61/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lf61/k;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-ltz v3, :cond_1

    move-object v6, v4

    check-cast v6, Lu61/e;

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    move v3, v5

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_2
    sput-object v1, Lzc1/m9;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-interface {v1, v2, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/m9;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lzc1/m9;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/m9;->h(Ljava/lang/String;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/m9;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x78ad169c

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x2

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v5, 0x3faaaaab

    invoke-static {v4, v3, v5}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v1, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v1, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lzc1/m9;->j()Lj71/b$n;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {}, Lf61/l;->a()Lg61/b;

    move-result-object v10

    new-instance v6, Lh71/k;

    const/16 v16, 0x36

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v17}, Lh71/k;-><init>(Lg61/b;Lh2/c;Lj61/g;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lt81/r;

    const/16 v20, 0x1ffa

    const/16 v21, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v5 .. v21}, Lt81/r;-><init>(Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_4

    invoke-virtual {v5}, Lt81/r;->k()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lp1/c1;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_5

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v7, Lp1/c1;

    invoke-virtual {v5}, Lt81/r;->j()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj71/b;

    invoke-virtual {v8}, Lj71/b;->c()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4}, Lzc1/m9;->d(Lp1/c1;)F

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Zoom Level: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7}, Lzc1/m9;->f(Lp1/c1;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v1, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Scrub Value: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_6

    if-ne v10, v6, :cond_7

    :cond_6
    new-instance v10, Lkd1/a;

    const/4 v6, 0x1

    invoke-direct {v10, v8, v4, v7, v6}, Lkd1/a;-><init>(Ljava/lang/String;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v4, Lt81/r;->n:I

    invoke-static {v5, v10, v1, v4, v3}, Lt81/l;->q(Lt81/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lzc1/w8;

    const/16 v3, 0xf

    invoke-direct {v2, v0, v3}, Lzc1/w8;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final d(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final e(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final f(Lp1/c1;)Lcom/whoop/design/util/TextResource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/design/util/TextResource;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/util/TextResource;

    return-object p0
.end method

.method private static final g(Lp1/c1;Lcom/whoop/design/util/TextResource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Ljava/lang/String;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lt81/f;

    if-eqz v0, :cond_0

    check-cast p3, Lt81/f;

    invoke-interface {p3}, Lt81/f;->a()F

    move-result p0

    invoke-static {p1, p0}, Lzc1/m9;->e(Lp1/c1;F)V

    goto :goto_0

    :cond_0
    instance-of p1, p3, Ld61/a;

    if-eqz p1, :cond_3

    check-cast p3, Ld61/a;

    invoke-interface {p3}, Ld61/a;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcz0/s;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcz0/s;->a()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La71/a;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, La71/a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    const-string p0, "--"

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    :cond_2
    invoke-static {p2, p0}, Lzc1/m9;->g(Lp1/c1;Lcom/whoop/design/util/TextResource;)V

    :cond_3
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/m9;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j()Lj71/b$n;
    .locals 28

    sget-object v0, Lzc1/m9;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v3, 0x1

    if-ltz v3, :cond_1

    move-object v5, v4

    check-cast v5, Lu61/e;

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    move v3, v6

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v2

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v3, 0x1

    if-ltz v3, :cond_4

    move-object v7, v4

    check-cast v7, Lu61/e;

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    move v3, v6

    goto :goto_1

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "%.2f"

    const/4 v6, 0x1

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lu61/e;

    invoke-virtual {v9}, Lu61/e;->h()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v10, La71/a;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v23, 0xff9

    const/16 v24, 0x0

    const/4 v11, 0x0

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

    const/16 v16, 0x1f

    move-object v15, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v17}, Lu61/e;->c(Lu61/e;FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILjava/lang/Object;)Lu61/e;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance v9, Lk61/c;

    sget-object v0, Lzc1/m9$a;->w:Lzc1/m9$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v13

    const/16 v17, 0x37

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lu61/a;

    move-object v10, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xa

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v13}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lzc1/m9;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v8, v2

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    if-ltz v8, :cond_8

    move-object v11, v9

    check-cast v11, Lu61/e;

    rem-int/lit8 v8, v8, 0x2

    if-nez v8, :cond_7

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move v8, v10

    goto :goto_3

    :cond_8
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v2, 0x1

    if-ltz v2, :cond_b

    move-object v10, v8

    check-cast v10, Lu61/e;

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_a

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    move v2, v9

    goto :goto_4

    :cond_b
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_c
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lu61/e;

    invoke-virtual {v12}, Lu61/e;->h()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v18, La71/a;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v26, 0xff9

    const/16 v27, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v13 .. v27}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x1f

    move-object/from16 v18, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v20}, Lu61/e;->c(Lu61/e;FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILjava/lang/Object;)Lu61/e;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    new-instance v12, Lk61/c;

    sget-object v0, Lzc1/m9$b;->w:Lzc1/m9$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-static {v0}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v16

    const/16 v20, 0x37

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v12 .. v21}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lu61/a;

    move-object v13, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xa

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v16}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7, v10}, [Lu61/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v1, Lj71/b$n;

    const-string v3, "id"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Lj71/b$n;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
