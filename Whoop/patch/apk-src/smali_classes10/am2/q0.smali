.class public final Lam2/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lam2/q0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ3\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ+\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ-\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lam2/q0;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "listOfId",
        "Ld61/a;",
        "scrubEvent",
        "Lvl2/z;",
        "g",
        "(Ljava/util/List;Ld61/a;)Ljava/util/List;",
        "",
        "isHoursVsNeededTrendEnabled",
        "f",
        "(Ljava/util/List;Ld61/a;Z)Ljava/util/List;",
        "e",
        "",
        "a",
        "(Ld61/a;)I",
        "La71/a;",
        "dataScrubberDetailsState",
        "Lcom/whoop/design/util/TextResource;",
        "valueDisplay",
        "Ly81/e;",
        "zoneScrubberColorDisplay",
        "b",
        "(La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;)Lvl2/z;",
        "Lam2/p0;",
        "state",
        "sendAnalytics",
        "Lcm2/y;",
        "d",
        "(Lam2/p0;Ld61/a;ZZ)Lcm2/y;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lam2/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lam2/q0;

    invoke-direct {v0}, Lam2/q0;-><init>()V

    sput-object v0, Lam2/q0;->a:Lam2/q0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ld61/a;)I
    .locals 3

    invoke-interface {p1}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "HOURS_OF_SLEEP"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz0/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcz0/s;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La71/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La71/a;->j()Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-interface {p1}, Ld61/a;->b()Ljava/util/Map;

    move-result-object p1

    const-string v2, "SLEEP_NEED"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcz0/s;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcz0/s;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La71/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, La71/a;->j()Ljava/lang/Float;

    move-result-object v1

    :cond_1
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    const/4 p1, 0x0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    div-float/2addr p1, v0

    const/16 v0, 0x64

    int-to-float v1, v0

    mul-float/2addr p1, v1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    if-le v0, p1, :cond_3

    return p1

    :cond_3
    return v0

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method private final b(La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;)Lvl2/z;
    .locals 8

    new-instance v0, Lvl2/z;

    if-nez p3, :cond_0

    invoke-virtual {p1}, La71/a;->f()Ly81/e;

    move-result-object p3

    :cond_0
    move-object v2, p3

    invoke-virtual {p1}, La71/a;->c()Lhy0/h1;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lhy0/h1;->t()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    :goto_0
    move-object v3, p3

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, La71/a;->c()Lhy0/h1;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lhy0/h1;->v()Ly81/e;

    move-result-object p3

    if-nez p3, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object v4, p3

    goto :goto_4

    :cond_3
    :goto_3
    sget-object p3, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_2

    :goto_4
    invoke-virtual {p1}, La71/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, La71/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, La71/a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v1, p2

    invoke-direct/range {v0 .. v7}, Lvl2/z;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public static synthetic c(Lam2/q0;La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;ILjava/lang/Object;)Lvl2/z;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-virtual {p1}, La71/a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-virtual {p1}, La71/a;->f()Ly81/e;

    move-result-object p3

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lam2/q0;->b(La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;)Lvl2/z;

    move-result-object p0

    return-object p0
.end method

.method private final e(Ljava/util/List;Ld61/a;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ld61/a;",
            ")",
            "Ljava/util/List<",
            "Lvl2/z;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcz0/s;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcz0/s;->a()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, La71/a;

    sget-object v3, Lam2/q0;->a:Lam2/q0;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lam2/q0;->c(Lam2/q0;La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;ILjava/lang/Object;)Lvl2/z;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final f(Ljava/util/List;Ld61/a;Z)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ld61/a;",
            "Z)",
            "Ljava/util/List<",
            "Lvl2/z;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p3, :cond_1

    invoke-direct {p0, p2}, Lam2/q0;->a(Ld61/a;)I

    move-result p3

    new-instance v1, Lvl2/z;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-interface {p2}, Ld61/a;->b()Ljava/util/Map;

    move-result-object p3

    const-string v4, "SLEEP_NEED"

    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcz0/s;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcz0/s;->a()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, La71/a;

    if-eqz p3, :cond_0

    invoke-virtual {p3}, La71/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    :goto_0
    move-object v6, p3

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    sget p3, Lsl2/a;->s:I

    invoke-static {p3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget p3, Lgy0/f;->F1:I

    invoke-static {p3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    const/4 v4, 0x0

    move-object v5, v3

    invoke-direct/range {v1 .. v8}, Lvl2/z;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcz0/s;

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lcz0/s;->a()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_2

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, La71/a;

    sget-object v2, Lam2/q0;->a:Lam2/q0;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lam2/q0;->c(Lam2/q0;La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;ILjava/lang/Object;)Lvl2/z;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-object v0
.end method

.method private final g(Ljava/util/List;Ld61/a;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ld61/a;",
            ")",
            "Ljava/util/List<",
            "Lvl2/z;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface/range {p2 .. p2}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcz0/s;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcz0/s;->a()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object v2

    invoke-virtual {v2}, Lm83/j0;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v6, v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    move-object v10, v3

    check-cast v10, Lm83/h0;

    iget-object v10, v10, Lm83/h0;->x:Ljava/lang/Object;

    check-cast v10, Ljava/util/ListIterator;

    invoke-interface {v10}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v10}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v6, 0x1

    const/4 v12, 0x0

    if-ltz v6, :cond_d

    check-cast v10, La71/a;

    const/4 v13, 0x1

    const/4 v14, 0x4

    if-nez v6, :cond_2

    invoke-virtual {v10}, La71/a;->j()Ljava/lang/Float;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    goto :goto_3

    :cond_1
    const/4 v9, 0x0

    goto :goto_3

    :cond_2
    if-gt v13, v6, :cond_4

    if-ge v6, v14, :cond_4

    invoke-virtual {v10}, La71/a;->j()Ljava/lang/Float;

    move-result-object v15

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v15

    goto :goto_1

    :cond_3
    const/4 v15, 0x0

    :goto_1
    add-float/2addr v7, v15

    goto :goto_3

    :cond_4
    if-gt v14, v6, :cond_6

    const/4 v15, 0x6

    if-ge v6, v15, :cond_6

    invoke-virtual {v10}, La71/a;->j()Ljava/lang/Float;

    move-result-object v15

    if-eqz v15, :cond_5

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v15

    goto :goto_2

    :cond_5
    const/4 v15, 0x0

    :goto_2
    add-float/2addr v8, v15

    :cond_6
    :goto_3
    const/4 v15, 0x5

    if-eqz v6, :cond_9

    const/4 v5, 0x3

    if-eq v6, v5, :cond_8

    if-eq v6, v15, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v8}, Lam2/r0;->a(F)Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    :cond_8
    invoke-static {v7}, Lam2/r0;->a(F)Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    :cond_9
    invoke-static {v9}, Lam2/r0;->a(F)Ljava/lang/String;

    move-result-object v12

    :goto_4
    if-gt v13, v6, :cond_a

    if-ge v6, v14, :cond_a

    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Lm83/j0;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La71/a;

    invoke-virtual {v5}, La71/a;->f()Ly81/e;

    move-result-object v5

    goto :goto_5

    :cond_a
    if-ne v6, v15, :cond_b

    invoke-virtual {v2, v14}, Lm83/j0;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La71/a;

    invoke-virtual {v5}, La71/a;->f()Ly81/e;

    move-result-object v5

    goto :goto_5

    :cond_b
    invoke-virtual {v2, v4}, Lm83/j0;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La71/a;

    invoke-virtual {v5}, La71/a;->f()Ly81/e;

    move-result-object v5

    :goto_5
    if-eqz v12, :cond_c

    sget-object v6, Lam2/q0;->a:Lam2/q0;

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-direct {v6, v10, v12, v5}, Lam2/q0;->b(La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;)Lvl2/z;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    move v6, v11

    goto/16 :goto_0

    :cond_d
    invoke-static {}, Lwb3/f;->d0()V

    throw v12

    :cond_e
    return-object v0
.end method


# virtual methods
.method public final d(Lam2/p0;Ld61/a;ZZ)Lcm2/y;
    .locals 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrubEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lam2/p0;->h()Lj71/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lj71/c;->f()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lj71/b;

    instance-of v3, v3, Lj71/b$k;

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj71/b;

    invoke-virtual {v2}, Lj71/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_3
    invoke-virtual {p1}, Lam2/p0;->t()Lam2/d0;

    move-result-object v1

    invoke-virtual {v1}, Lam2/d0;->c()Lor2/h0;

    move-result-object v1

    sget-object v2, Lam2/q0$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    invoke-direct {p0, v0, p2}, Lam2/q0;->e(Ljava/util/List;Ld61/a;)Ljava/util/List;

    move-result-object p2

    goto :goto_2

    :cond_4
    invoke-direct {p0, v0, p2, p4}, Lam2/q0;->f(Ljava/util/List;Ld61/a;Z)Ljava/util/List;

    move-result-object p2

    goto :goto_2

    :cond_5
    invoke-direct {p0, v0, p2}, Lam2/q0;->g(Ljava/util/List;Ld61/a;)Ljava/util/List;

    move-result-object p2

    :goto_2
    new-instance v0, Lcm2/y$l;

    invoke-virtual {p1}, Lam2/p0;->t()Lam2/d0;

    move-result-object p4

    invoke-virtual {p4}, Lam2/d0;->c()Lor2/h0;

    move-result-object p4

    sget-object v1, Lor2/h0;->HR_ZONES_ALL:Lor2/h0;

    if-ne p4, v1, :cond_6

    invoke-static {p2}, Lm83/s;->q0(Ljava/util/List;)Lm83/j0;

    move-result-object p2

    :cond_6
    move-object v1, p2

    invoke-virtual {p1}, Lam2/p0;->t()Lam2/d0;

    move-result-object p2

    invoke-virtual {p2}, Lam2/d0;->c()Lor2/h0;

    move-result-object v2

    invoke-virtual {p1}, Lam2/p0;->t()Lam2/d0;

    move-result-object p2

    invoke-virtual {p2}, Lam2/d0;->b()Lvl2/a;

    move-result-object v3

    invoke-virtual {p1}, Lam2/p0;->t()Lam2/d0;

    move-result-object p1

    invoke-virtual {p1}, Lam2/d0;->a()Ljava/lang/String;

    move-result-object v4

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcm2/y$l;-><init>(Ljava/util/List;Lor2/h0;Lvl2/a;Ljava/lang/String;Z)V

    return-object v0
.end method
