.class public final Lzs2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzs2/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lzs2/h;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
        "displayRange",
        "Lzs2/i;",
        "percentageSource",
        "Ll83/k;",
        "",
        "b",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Lzs2/i;)Ll83/k;",
        "Ly81/e;",
        "color",
        "Lbu2/k;",
        "a",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ly81/e;Lzs2/i;)Lbu2/k;",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Lzs2/i;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;",
            "Lzs2/i;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Lzs2/h$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_5

    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    new-instance p2, Ll83/k;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getProgressionRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRange;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRange;->getRecommendation()D

    move-result-wide v2

    :goto_0
    double-to-float v0, v2

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getPercentRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getProgressionRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRange;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRange;->getBaseline()D

    move-result-wide v1

    :goto_2
    double-to-float v1, v1

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getPercentRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v1

    goto :goto_2

    :cond_3
    :goto_3
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p2, Ll83/k;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getPercentRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v2

    double-to-float v0, v2

    goto :goto_4

    :cond_6
    move v0, v1

    :goto_4
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getPercentRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v1

    double-to-float v1, v1

    :cond_7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public final a(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ly81/e;Lzs2/i;)Lbu2/k;
    .locals 9

    const-string v0, "color"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "percentageSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p3}, Lzs2/h;->b(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Lzs2/i;)Ll83/k;

    move-result-object p3

    iget-object v0, p3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iget-object p3, p3, Ll83/k;->x:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result v6

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimits;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimits;->getMin()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimits;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimits;->getMax()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p3

    :goto_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;->getLabelDisplay()Ljava/lang/String;

    move-result-object p3

    :cond_2
    invoke-static {p3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v1, Lbu2/k;

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Lbu2/k;-><init>(Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Ly81/e;)V

    return-object v1
.end method
