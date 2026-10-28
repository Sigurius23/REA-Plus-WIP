.class public final Lv60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u000e\u001a\u00020\u0007*\u00020\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lv60/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lr60/c;",
        "Lu60/c;",
        "c",
        "(Lr60/c;)Lu60/c;",
        "Lu60/c$a;",
        "dialog",
        "Lgv1/h;",
        "lottieTesterConfig",
        "d",
        "(Lr60/c;Lu60/c$a;Lgv1/h;)Lu60/c;",
        "Lcom/whoop/achievements/domain/models/AchievementsResponse;",
        "response",
        "",
        "Lu60/c$b;",
        "a",
        "(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lgv1/h;)Ljava/util/List;",
        "domainResult",
        "b",
        "(Lr60/c;Lgv1/h;)Lu60/c;",
        "Ljb1/a;",
        "achievements_release"
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

    sput v0, Lv60/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv60/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lv60/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lv60/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lgv1/h;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/achievements/domain/models/AchievementsResponse;",
            "Lgv1/h;",
            ")",
            "Ljava/util/List<",
            "Lu60/c$b;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getSections()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/achievements/domain/models/AchievementsSectionModel;

    invoke-virtual {v2}, Lcom/whoop/achievements/domain/models/AchievementsSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    :cond_0
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;->COMPACT:Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;

    invoke-static {}, Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;->values()[Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_3

    goto :goto_3

    :cond_3
    move-object v4, v8

    :goto_3
    iget-object v3, p0, Lv60/a;->a:Ljb1/a;

    invoke-virtual {v2}, Lcom/whoop/achievements/domain/models/AchievementsSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/u;

    invoke-static {v5}, Lv60/b;->c(Lm91/u;)Lm91/u;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    new-instance v2, Lu60/c$b;

    invoke-direct {v2, v3, v4}, Lu60/c$b;-><init>(Ljava/util/List;Lcom/whoop/achievements/domain/models/AchievementsSectionSpacingType;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_6
    invoke-virtual {p2}, Lgv1/h;->a()Lgv1/o;

    return-object v0
.end method

.method private final c(Lr60/c;)Lu60/c;
    .locals 11

    invoke-virtual {p1}, Lr60/c;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-virtual {p1}, Lr60/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lr60/c;->b()Lr60/a;

    move-result-object p1

    instance-of v2, p1, Lr60/a$b;

    if-eqz v2, :cond_1

    new-instance v3, Lu60/c;

    new-instance v4, Lu60/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lu60/c$c;-><init>(Lsz0/q0;Lu60/a;Lu60/a;Lu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0xd

    const/4 v9, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    invoke-direct/range {v3 .. v9}, Lu60/c;-><init>(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of v2, p1, Lr60/a$c;

    if-eqz v2, :cond_2

    new-instance v3, Lu60/c;

    new-instance v4, Lu60/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v5

    new-instance v6, Lu60/a$i;

    invoke-direct {v6, v0, v1}, Lu60/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v8, Lu60/a$d;->a:Lu60/a$d;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v10}, Lu60/c$c;-><init>(Lsz0/q0;Lu60/a;Lu60/a;Lu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0xd

    const/4 v9, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Lu60/c;-><init>(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    instance-of p1, p1, Lr60/a$d;

    if-eqz p1, :cond_3

    new-instance v2, Lu60/c;

    new-instance v3, Lu60/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v4

    new-instance v5, Lu60/a$i;

    invoke-direct {v5, v0, v1}, Lu60/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v7, Lu60/a$d;->a:Lu60/a$d;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Lu60/c$c;-><init>(Lsz0/q0;Lu60/a;Lu60/a;Lu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lu60/c;-><init>(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    new-instance v3, Lu60/c;

    new-instance v4, Lu60/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lu60/c$c;-><init>(Lsz0/q0;Lu60/a;Lu60/a;Lu60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0xd

    const/4 v9, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    invoke-direct/range {v3 .. v9}, Lu60/c;-><init>(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final d(Lr60/c;Lu60/c$a;Lgv1/h;)Lu60/c;
    .locals 18

    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getAnalyticProperties()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    move-object v10, v1

    goto :goto_2

    :cond_2
    sget-object v1, Lm83/z;->w:Lm83/z;

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getBackgroundStyle()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    if-nez v0, :cond_4

    const-string v0, ""

    :cond_4
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toUpperCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/whoop/design/models/AchievementsBackgroundStyle;->DEFAULT:Lcom/whoop/design/models/AchievementsBackgroundStyle;

    invoke-static {}, Lcom/whoop/design/models/AchievementsBackgroundStyle;->values()[Lcom/whoop/design/models/AchievementsBackgroundStyle;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_4
    if-ge v6, v4, :cond_6

    aget-object v7, v3, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_6
    move-object v7, v1

    :goto_5
    if-nez v7, :cond_7

    move-object v6, v2

    goto :goto_6

    :cond_7
    move-object v6, v7

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getNavigationIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v0

    move-object v8, v0

    goto :goto_7

    :cond_8
    move-object v8, v1

    :goto_7
    new-instance v14, Lu60/c$d;

    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_9

    :cond_9
    :goto_8
    move-object v3, v0

    goto :goto_a

    :cond_a
    :goto_9
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_8

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    move-object/from16 v11, p0

    move-object/from16 v2, p3

    invoke-direct {v11, v0, v2}, Lv60/a;->a(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lgv1/h;)Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lr60/c;->e()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual/range {p1 .. p1}, Lr60/c;->c()Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v5, 0x1

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->getBackground()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {v0}, Llb1/f0;->a(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;

    move-result-object v0

    move-object v7, v0

    goto :goto_b

    :cond_c
    move-object v7, v1

    :goto_b
    invoke-virtual/range {p1 .. p1}, Lr60/c;->f()Lcom/whoop/achievements/domain/models/AchievementsResponse;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/whoop/achievements/domain/models/AchievementsResponse;->getNavigationDestination()Lcom/whoop/navigation/e;

    move-result-object v1

    :cond_d
    move-object v9, v1

    move-object v2, v14

    invoke-direct/range {v2 .. v10}, Lu60/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcom/whoop/design/models/AchievementsBackgroundStyle;Lm51/a;Lgz0/m0;Lcom/whoop/navigation/e;Ljava/util/Map;)V

    move-object v14, v2

    new-instance v11, Lu60/c;

    const/16 v16, 0xa

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, p2

    invoke-direct/range {v11 .. v17}, Lu60/c;-><init>(Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method


# virtual methods
.method public final b(Lr60/c;Lgv1/h;)Lu60/c;
    .locals 7

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lottieTesterConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lr60/c;->b()Lr60/a;

    move-result-object v0

    instance-of v0, v0, Lr60/a$a;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lv60/a;->c(Lr60/c;)Lu60/c;

    move-result-object p1

    :goto_0
    move-object v0, p1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lv60/a;->d(Lr60/c;Lu60/c$a;Lgv1/h;)Lu60/c;

    move-result-object p1

    goto :goto_0

    :goto_1
    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Lu60/c;->c(Lu60/c;Lu60/c$a;Lu60/c$c;Lu60/c$d;Lgv1/h;ILjava/lang/Object;)Lu60/c;

    move-result-object p1

    return-object p1
.end method
