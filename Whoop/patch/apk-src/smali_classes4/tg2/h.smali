.class public final Ltg2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg2/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u0008\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004*\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004*\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Ltg2/h;",
        "",
        "<init>",
        "()V",
        "",
        "Lod1/a;",
        "activities",
        "Ll83/k;",
        "e",
        "(Ljava/util/List;)Ll83/k;",
        "",
        "d",
        "(Lod1/a;)Z",
        "",
        "selectedInternalName",
        "Ly71/o;",
        "i",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "h",
        "(Lod1/a;Ljava/lang/String;)Ly71/o;",
        "c",
        "b",
        "(Ly71/o;Ljava/lang/String;)Ly71/o;",
        "Lod1/m;",
        "domainState",
        "Ln82/c;",
        "f",
        "(Lod1/m;Ljava/lang/String;)Ln82/c;",
        "viewState",
        "a",
        "(Ln82/c;Ljava/lang/String;)Ln82/c;",
        "start-activity_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ly71/o;Ljava/lang/String;)Ly71/o;
    .locals 19

    invoke-virtual/range {p1 .. p1}, Ly71/o;->getEvent()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static/range {p2 .. p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Ltg2/h$b;->w:Ltg2/h$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    const-wide/high16 v0, 0x3fd8000000000000L    # 0.375

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v1, Ltg2/h$c;->w:Ltg2/h$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    invoke-interface {v1}, Ly81/e;->toTestableColor-0d7_KjU()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v10

    const/16 v17, 0x7e7f

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v18}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final c(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly71/o;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ly71/o;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly71/o;

    invoke-direct {p0, v1, p2}, Ltg2/h;->b(Ly71/o;Ljava/lang/String;)Ly71/o;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final d(Lod1/a;)Z
    .locals 2

    invoke-virtual {p1}, Lod1/a;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "increase_alertness"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lod1/a;->g()Ljava/lang/String;

    move-result-object p1

    const-string v0, "increase_relaxation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final e(Ljava/util/List;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lod1/a;",
            ">;)",
            "Ll83/k;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lod1/a;

    invoke-direct {p0, v3}, Ltg2/h;->d(Lod1/a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    check-cast v0, Ljava/util/List;

    check-cast v1, Ljava/util/List;

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic g(Ltg2/h;Lod1/m;Ljava/lang/String;ILjava/lang/Object;)Ln82/c;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Ltg2/h;->f(Lod1/m;Ljava/lang/String;)Ln82/c;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lod1/a;Ljava/lang/String;)Ly71/o;
    .locals 19

    sget-object v1, Ly71/o;->p:Ly71/o$c;

    invoke-virtual/range {p1 .. p1}, Lod1/a;->g()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lod1/a;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "toUpperCase(...)"

    invoke-static {v2, v0, v3}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lod1/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v6

    const/16 v17, 0x4fee

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v1 .. v18}, Ly71/o$c;->f(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lkd1/o;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLjava/lang/Object;ZILjava/lang/Object;)Ly71/o;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v0, v2}, Ltg2/h;->b(Ly71/o;Ljava/lang/String;)Ly71/o;

    move-result-object v0

    return-object v0
.end method

.method private final i(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lod1/a;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ly71/o;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lod1/a;

    invoke-direct {p0, v1, p2}, Ltg2/h;->h(Lod1/a;Ljava/lang/String;)Ly71/o;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ln82/c;Ljava/lang/String;)Ln82/c;
    .locals 13

    move-object v1, p2

    const-string v2, "viewState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "selectedInternalName"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ln82/c;->h()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Ltg2/h;->c(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Ln82/c;->d()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Ltg2/h;->c(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Ln82/c;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v2, p2}, Ltg2/h;->c(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/16 v11, 0x3e3

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Ln82/c;->b(Ln82/c;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;ZILjava/lang/Object;)Ln82/c;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lod1/m;Ljava/lang/String;)Ln82/c;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "domainState"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "selectedInternalName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lod1/m;->h()Ln82/a;

    move-result-object v2

    sget-object v4, Ltg2/h$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    invoke-virtual {v3}, Lod1/m;->d()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ltg2/h;->e(Ljava/util/List;)Ll83/k;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Lod1/m;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lod1/a;

    invoke-virtual {v6}, Lod1/a;->g()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ltg2/k;->a(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lod1/m;->d()Ljava/util/List;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v2, v5

    :goto_1
    iget-object v4, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    new-instance v5, Ln82/c;

    invoke-virtual {v3}, Lod1/m;->g()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v4, v1}, Ltg2/h;->i(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ltg2/h$d;

    invoke-direct {v4}, Ltg2/h$d;-><init>()V

    invoke-static {v2, v4}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ltg2/h;->i(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v3}, Lod1/m;->f()Ln82/a;

    move-result-object v12

    const/16 v16, 0x3b1

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Ln82/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
