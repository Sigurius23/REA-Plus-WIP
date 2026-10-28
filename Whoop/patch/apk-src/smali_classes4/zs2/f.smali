.class public abstract Lzs2/f;
.super Lzs2/p;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ-\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010%\u001a\u00020\"8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lzs2/f;",
        "Lzs2/p;",
        "Lzs2/g;",
        "rangeContentReducer",
        "Lzs2/h;",
        "recommendedRangeMapper",
        "<init>",
        "(Lzs2/g;Lzs2/h;)V",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "",
        "saveValue",
        "Lbu2/d;",
        "f",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Lbu2/d;",
        "value",
        "Ll83/k;",
        "Lcom/whoop/design/util/TextResource;",
        "g",
        "(D)Ll83/k;",
        "Ljava/util/UUID;",
        "planId",
        "Lws2/g;",
        "progress",
        "",
        "showLoading",
        "Lys2/e;",
        "i",
        "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;",
        "Ly81/f;",
        "j",
        "()Ly81/f;",
        "k",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Ll83/k;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "h",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "screen",
        "weekly-plan_release"
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
.method public constructor <init>(Lzs2/g;Lzs2/h;)V
    .locals 1

    const-string v0, "rangeContentReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedRangeMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lzs2/p;-><init>(Lzs2/g;Lzs2/h;)V

    return-void
.end method

.method private final f(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Lbu2/d;
    .locals 9

    invoke-virtual {p0, p1, p2, p3}, Lzs2/f;->k(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lcom/whoop/design/util/TextResource;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/whoop/design/util/TextResource;

    invoke-virtual {p0}, Lzs2/f;->j()Ly81/f;

    move-result-object v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-virtual/range {v2 .. v8}, Lzs2/p;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)Lbu2/d;

    move-result-object p1

    return-object p1
.end method

.method private final g(D)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Ll83/k;"
        }
    .end annotation

    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lzs2/f;->h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p2

    invoke-static {p1, p2}, Lot2/v;->b(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/k;

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    sget v0, Lks2/a;->l:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_0
    new-instance v0, Ll83/k;

    double-to-int p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    sget p2, Lks2/a;->m:I

    invoke-static {p2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
.end method

.method public final i(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;
    .locals 10

    const-string v0, "planId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progress"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lzs2/p;->d(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Lys2/f;

    move-result-object v4

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v0

    double-to-float v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p2, v0}, Lzs2/p;->b(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D

    move-result-wide v7

    invoke-direct {p0, p2, v7, v8}, Lzs2/f;->f(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Lbu2/d;

    move-result-object v5

    invoke-virtual {p0, p2, p4}, Lzs2/p;->c(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Z)Lys2/b;

    move-result-object v6

    new-instance v1, Lys2/e$k;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string p1, "toString(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzs2/f;->h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Lys2/e$k;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;)V

    return-object v1
.end method

.method public j()Ly81/f;
    .locals 2

    invoke-virtual {p0}, Lzs2/f;->h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v0

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->HR_ZONES_ONE_TO_THREE:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-ne v0, v1, :cond_0

    sget-object v0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object v0

    :cond_0
    sget-object v0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object v0
.end method

.method public k(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Ll83/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
            "D)",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Lzs2/f;->g(D)Ll83/k;

    move-result-object p1

    return-object p1
.end method
