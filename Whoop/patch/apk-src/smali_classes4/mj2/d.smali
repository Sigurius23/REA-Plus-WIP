.class public final Lmj2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\n\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lmj2/d;",
        "",
        "Loj2/a;",
        "breathingAnimationHelper",
        "<init>",
        "(Loj2/a;)V",
        "Lcom/whoop/stress/domain/model/StressIntervention;",
        "intervention",
        "",
        "totalRounds",
        "Lec3/l;",
        "Lnj2/t;",
        "h",
        "(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;",
        "Lcom/whoop/stress/domain/model/StressSession;",
        "session",
        "g",
        "(Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;",
        "Lcom/whoop/stress/domain/model/StressCustomizationOptions;",
        "options",
        "Lnj2/b;",
        "e",
        "(Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;",
        "Lnj2/r;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Loj2/a;",
        "stress_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Loj2/a;


# direct methods
.method public constructor <init>(Loj2/a;)V
    .locals 1

    const-string v0, "breathingAnimationHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj2/d;->a:Loj2/a;

    return-void
.end method

.method public static final synthetic a(Lmj2/d;)Loj2/a;
    .locals 0

    iget-object p0, p0, Lmj2/d;->a:Loj2/a;

    return-object p0
.end method

.method public static final synthetic b(Lmj2/d;Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;
    .locals 0

    invoke-direct {p0, p1}, Lmj2/d;->e(Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lmj2/d;Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lmj2/d;->g(Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lmj2/d;Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmj2/d;->h(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;
    .locals 38

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->component1()Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->component2()Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->component3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->component4()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    const/4 v4, 0x2

    if-eqz v5, :cond_1

    sget-object v12, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v6, Ly71/g;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getIcon()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    invoke-direct {v6, v7, v3, v4, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getSubDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const v36, 0x7fe7de

    const/16 v37, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v18, v6

    invoke-static/range {v12 .. v37}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v1

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v7

    invoke-static {v7}, Lm83/g0;->W(I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Ly71/o;->p:Ly71/o$c;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v10}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v15, Ly71/g;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v11}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getIcon()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/m0;->toWhoopIcon()I

    move-result v11

    invoke-direct {v15, v11, v3, v4, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v11}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getDescription()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v7}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getSubDescription()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    const v33, 0x7fe7de

    const/16 v34, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v9 .. v34}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v7

    invoke-interface {v6, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_0
    new-instance v3, Lv41/g;

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressCustomizationDrawer;->getDrawerTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/16 v17, 0x7e

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v18}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lnj2/b$a;

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lnj2/b$a;-><init>(Ly71/o;Ljava/lang/String;Lv41/g;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCustomizationDrawer;)V

    return-object v0

    :cond_1
    if-eqz v11, :cond_5

    sget-object v12, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v5, Ly71/g;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getIcon()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-direct {v5, v6, v3, v4, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getSubDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const v36, 0x7ff9de

    const/16 v37, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v18, v5

    invoke-static/range {v12 .. v37}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v7

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    sget-object v12, Ly71/o;->p:Ly71/o$c;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v6, Ly71/g;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v8}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getIcon()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    invoke-direct {v6, v8, v3, v4, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v8}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getDescription()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressCustomizationDisplay;->getSubDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const v36, 0x7ff9de

    const/16 v37, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v18, v6

    invoke-static/range {v12 .. v37}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v1

    invoke-interface {v10, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_2
    invoke-virtual {v11}, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->getSuffix()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, " ("

    const-string v3, ")"

    invoke-static {v1, v0, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    const-string v0, ""

    :cond_4
    invoke-virtual {v11}, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->getPickerTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v9, Lv41/g;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v20, 0x7e

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v12, v9

    invoke-direct/range {v12 .. v21}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lnj2/b$b;

    move-object v8, v2

    invoke-direct/range {v6 .. v11}, Lnj2/b$b;-><init>(Ly71/o;Ljava/lang/String;Lv41/g;Ljava/util/Map;Lcom/whoop/stress/domain/model/StressCustomizationPicker;)V

    return-object v6

    :cond_5
    return-object v3
.end method

.method private final g(Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressSession;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lmj2/d$h;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lmj2/d$h;-><init>(Lcom/whoop/stress/domain/model/StressSession;Lmj2/d;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final h(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressIntervention;",
            "I)",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/stress/domain/model/StressIntervention;->getRepeatCount()I

    move-result v0

    if-gtz v0, :cond_0

    new-instance p2, Lmj2/d$i;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, v0}, Lmj2/d$i;-><init>(Lmj2/d;Lcom/whoop/stress/domain/model/StressIntervention;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p2}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lmj2/d;->a:Loj2/a;

    invoke-virtual {v0, p1, p2}, Loj2/a;->n(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmj2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lmj2/d$a;-><init>(Lq83/d;Lmj2/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
