.class public abstract Ll50/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\u0008\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/access/circumference/models/CircumferenceModel;",
        "Lm50/d;",
        "c",
        "(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;",
        "Lcom/whoop/access/circumference/models/CircumferencePickerModel;",
        "Li93/j;",
        "b",
        "(Lcom/whoop/access/circumference/models/CircumferencePickerModel;)Li93/j;",
        "a",
        "access_release"
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
.method private static final a(Lcom/whoop/access/circumference/models/CircumferencePickerModel;)Li93/j;
    .locals 3

    new-instance v0, Li93/j;

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getCmMin()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getCmMax()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getCmMin()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getCmMax()I

    move-result p0

    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p0, v2}, Li93/h;-><init>(III)V

    return-object v0
.end method

.method private static final b(Lcom/whoop/access/circumference/models/CircumferencePickerModel;)Li93/j;
    .locals 3

    new-instance v0, Li93/j;

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getInMin()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getInMax()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getInMin()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getInMax()I

    move-result p0

    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p0, v2}, Li93/h;-><init>(III)V

    return-object v0
.end method

.method public static final c(Lcom/whoop/access/circumference/models/CircumferenceModel;)Lm50/d;
    .locals 17

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getCircumferencePicker()Lcom/whoop/access/circumference/models/CircumferencePickerModel;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getUnitType()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getUnitType()Ljava/lang/String;

    move-result-object v2

    :cond_0
    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromStringOrDefault$default(Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getDefaultIn()I

    move-result v3

    invoke-virtual {v2, v3}, Ld21/a;->j(I)I

    move-result v2

    :goto_0
    move v8, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getDefaultCm()I

    move-result v2

    goto :goto_0

    :goto_1
    new-instance v5, Lm50/d;

    invoke-virtual {v1}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getSegmentedControlLabels()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getLabel()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, Ll50/a;->b(Lcom/whoop/access/circumference/models/CircumferencePickerModel;)Li93/j;

    move-result-object v9

    invoke-static {v0}, Ll50/a;->a(Lcom/whoop/access/circumference/models/CircumferencePickerModel;)Li93/j;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getInLabel()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getCmLabel()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/access/circumference/models/CircumferencePickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "$waist"

    :cond_2
    move-object v14, v0

    invoke-virtual {v1}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getStateUpdateUnitKey()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/access/circumference/models/CircumferenceModel;->getForeignMeasurements()Ljava/util/List;

    move-result-object v16

    invoke-direct/range {v5 .. v16}, Lm50/d;-><init>(Ljava/util/List;Ljava/lang/String;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v5
.end method
