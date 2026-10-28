.class public final Lcn0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcn0/c;",
        "",
        "Ljb1/a;",
        "itemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lan0/a;",
        "",
        "monthIndex",
        "Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;",
        "a",
        "(Lan0/a;I)Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;",
        "",
        "Lk71/d;",
        "b",
        "(Lan0/a;I)Ljava/util/List;",
        "domainState",
        "Lbn0/a;",
        "accumulator",
        "Lbn0/e;",
        "c",
        "(Lan0/a;Lbn0/a;)Lbn0/e;",
        "Ljb1/a;",
        "calendar-arch-mini_release"
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lcn0/c;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "itemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcn0/c;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-static {p1, p3, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcn0/c;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lan0/a;I)Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;
    .locals 1

    invoke-virtual {p1}, Lan0/a;->i()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lan0/a;->h()Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method private final b(Lan0/a;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lan0/a;",
            "I)",
            "Ljava/util/List<",
            "Lk71/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lan0/a;->f()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lan0/a;->e()Ljava/util/List;

    move-result-object p2

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/graph/GraphLegendModel;

    sget-object v1, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {v0, v1}, Lvb1/b;->z(Lcom/whoop/design/models/items/graph/GraphLegendModel;Ly81/f;)Lk71/d;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public final c(Lan0/a;Lbn0/a;)Lbn0/e;
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "domainState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "accumulator"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lan0/a;->d()Lh91/b;

    move-result-object v3

    const/4 v2, 0x0

    if-eqz v3, :cond_2

    invoke-virtual/range {p2 .. p2}, Lbn0/a;->b()Ljava/time/LocalDate;

    move-result-object v6

    if-eqz v6, :cond_1

    const/16 v13, 0x1fb

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v3 .. v14}, Lh91/b;->b(Lh91/b;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :cond_1
    :goto_0
    move-object v4, v3

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    invoke-virtual {v1}, Lan0/a;->k()I

    move-result v3

    invoke-direct {v0, v1, v3}, Lcn0/c;->a(Lan0/a;I)Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    move-result-object v3

    invoke-virtual {v1}, Lan0/a;->n()Z

    move-result v16

    invoke-virtual {v1}, Lan0/a;->m()Z

    move-result v17

    invoke-virtual {v1}, Lan0/a;->k()I

    move-result v18

    invoke-virtual {v1}, Lan0/a;->j()Ljava/lang/Integer;

    move-result-object v19

    invoke-virtual {v1}, Lan0/a;->g()Ljava/lang/Integer;

    move-result-object v20

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;->getLeadingItems()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lcom/whoop/design/models/items/DateSelectorModel;

    if-eqz v8, :cond_3

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/DateSelectorModel;

    if-eqz v5, :cond_5

    invoke-static {v5}, Llb1/w0;->f(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object v21

    invoke-virtual {v5}, Lcom/whoop/design/models/items/DateSelectorModel;->getCurrentDateRange()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v7, "toUpperCase(...)"

    invoke-static {v6, v5, v7}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const/16 v32, 0x3fd

    const/16 v33, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v21 .. v33}, Li11/f;->b(Li11/f;Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILjava/lang/Object;)Li11/f;

    move-result-object v5

    move-object/from16 v21, v5

    goto :goto_3

    :cond_5
    move-object/from16 v21, v2

    :goto_3
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;->getTrailingItems()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_8

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lcom/whoop/design/models/items/FabMenuModel;

    if-eqz v8, :cond_6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/FabMenuModel;

    if-eqz v5, :cond_8

    invoke-static {v5}, Llb1/p1;->f(Lcom/whoop/design/models/items/FabMenuModel;)Lvy0/d0;

    move-result-object v5

    move-object/from16 v22, v5

    goto :goto_5

    :cond_8
    move-object/from16 v22, v2

    :goto_5
    iget-object v5, v0, Lcn0/c;->a:Ljb1/a;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;->getTrailingItems()Ljava/util/List;

    move-result-object v3

    goto :goto_6

    :cond_9
    move-object v3, v2

    :goto_6
    if-nez v3, :cond_a

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_a
    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v8, v8, Lcom/whoop/design/models/items/FabMenuModel;

    if-nez v8, :cond_b

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    invoke-virtual {v5, v6}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lh91/b;->e()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1}, Lan0/a;->k()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5, v2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v5, Ljava/util/LinkedHashMap;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, Lm83/g0;->W(I)I

    move-result v6

    const/16 v7, 0x10

    if-ge v6, v7, :cond_d

    move v6, v7

    :cond_d
    invoke-direct {v5, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v1, v7}, Lcn0/c;->b(Lan0/a;I)Ljava/util/List;

    move-result-object v12

    const/16 v14, 0x17f

    const/4 v15, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move v10, v7

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    const/4 v11, 0x0

    move-object/from16 v25, v13

    const/4 v13, 0x0

    move-object/from16 p2, v2

    move/from16 v2, v23

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-static/range {v4 .. v15}, Lh91/b;->b(Lh91/b;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object v5

    invoke-static {v5, v2}, Lcn0/b;->b(Lh91/b;I)Lg51/c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v5, v0

    move-object/from16 v0, p0

    goto :goto_8

    :cond_e
    move-object v0, v5

    move-object v2, v0

    :cond_f
    if-nez v2, :cond_10

    sget-object v2, Lm83/z;->w:Lm83/z;

    :cond_10
    move-object v14, v2

    new-instance v5, Lbn0/e;

    move-object v13, v3

    move/from16 v6, v16

    move/from16 v7, v17

    move/from16 v8, v18

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    move-object/from16 v11, v21

    move-object/from16 v12, v22

    invoke-direct/range {v5 .. v14}, Lbn0/e;-><init>(ZZILjava/lang/Integer;Ljava/lang/Integer;Li11/f;Lvy0/d0;Ljava/util/List;Ljava/util/Map;)V

    return-object v5
.end method
