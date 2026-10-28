.class public final enum Lcom/whoop/analytics/strain/model/BiologicalSex;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/analytics/strain/model/BiologicalSex;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/whoop/analytics/strain/model/BiologicalSex;

.field public static final enum female:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field public static final enum femaleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field public static final enum male:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field public static final enum maleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field public static final enum nonBinary:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field public static final enum nonBinaryNew:Lcom/whoop/analytics/strain/model/BiologicalSex;


# instance fields
.field private final calorieRestingAgeValue:D

.field private final calorieRestingAlphaValue:D

.field private final calorieRestingHeightValue:D

.field private final calorieRestingWeightValue:D

.field private final calorieWorkoutAgeValue:D

.field private final calorieWorkoutAlphaValue:D

.field private final calorieWorkoutHeartRateValue:D

.field private final calorieWorkoutWeightValue:D

.field private final heartRateWeightValue:D


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/whoop/analytics/strain/model/BiologicalSex;

    const-wide v17, 0x3fc999999999999aL    # 0.2

    const-wide/high16 v19, -0x3fb7000000000000L    # -50.0

    const-string v1, "male"

    const/4 v2, 0x0

    const-wide v3, -0x3fffd0efd738f171L    # -2.0229800401446663

    const-wide v5, 0x4018cccccccccccdL    # 6.2

    const-wide/high16 v7, 0x4028000000000000L    # 12.0

    const-wide v9, 0x401b333333333333L    # 6.8

    const-wide/high16 v11, 0x404e000000000000L    # 60.0

    const-wide v13, 0x3fe3333333333333L    # 0.6

    const-wide v15, 0x3fc851eb851eb852L    # 0.19

    invoke-direct/range {v0 .. v20}, Lcom/whoop/analytics/strain/model/BiologicalSex;-><init>(Ljava/lang/String;IDDDDDDDDD)V

    sput-object v0, Lcom/whoop/analytics/strain/model/BiologicalSex;->male:Lcom/whoop/analytics/strain/model/BiologicalSex;

    new-instance v1, Lcom/whoop/analytics/strain/model/BiologicalSex;

    const-wide v18, 0x3fb1eb851eb851ecL    # 0.07

    const-wide/high16 v20, -0x3fd2000000000000L    # -15.0

    const-string v2, "female"

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const-wide v6, 0x4011333333333333L    # 4.3

    const-wide/high16 v8, 0x4010000000000000L    # 4.0

    const-wide v10, 0x4012cccccccccccdL    # 4.7

    const-wide v12, 0x4084500000000000L    # 650.0

    const-wide v14, 0x3fd999999999999aL    # 0.4

    const-wide v16, -0x403f5c28f5c28f5cL    # -0.13

    invoke-direct/range {v1 .. v21}, Lcom/whoop/analytics/strain/model/BiologicalSex;-><init>(Ljava/lang/String;IDDDDDDDDD)V

    sput-object v1, Lcom/whoop/analytics/strain/model/BiologicalSex;->female:Lcom/whoop/analytics/strain/model/BiologicalSex;

    new-instance v2, Lcom/whoop/analytics/strain/model/BiologicalSex;

    const-wide v19, 0x3fc147ae147ae148L    # 0.135

    const-wide v21, -0x3fbfc00000000000L    # -32.5

    const-string v3, "nonBinary"

    const/4 v4, 0x2

    const-wide v5, -0x400fd0efd738f206L    # -1.0114900200723

    const-wide/high16 v7, 0x4015000000000000L    # 5.25

    const-wide/high16 v9, 0x4020000000000000L    # 8.0

    const-wide/high16 v11, 0x4017000000000000L    # 5.75

    const-wide v13, 0x4076300000000000L    # 355.0

    const-wide/high16 v15, 0x3fe0000000000000L    # 0.5

    const-wide v17, 0x3f9eb851eb851eb8L    # 0.03

    invoke-direct/range {v2 .. v22}, Lcom/whoop/analytics/strain/model/BiologicalSex;-><init>(Ljava/lang/String;IDDDDDDDDD)V

    sput-object v2, Lcom/whoop/analytics/strain/model/BiologicalSex;->nonBinary:Lcom/whoop/analytics/strain/model/BiologicalSex;

    new-instance v3, Lcom/whoop/analytics/strain/model/BiologicalSex;

    const-wide v20, 0x3fc9d14e3bcd35a8L    # 0.2017

    const-wide v22, -0x3fb47398c7e28241L    # -55.0969

    const-string v4, "maleNew"

    const/4 v5, 0x3

    const-wide v6, -0x3fffd0efd738f171L    # -2.0229800401446663

    const-wide v8, 0x402acb4395810625L    # 13.397

    const-wide v10, 0x407dfe6666666666L    # 479.9

    const-wide v12, 0x4016b53f7ced9168L    # 5.677

    const-wide v14, 0x4056172b020c49baL    # 88.362

    const-wide v16, 0x3fe4305532617c1cL    # 0.6309

    const-wide v18, 0x3fc972474538ef35L    # 0.1988

    invoke-direct/range {v3 .. v23}, Lcom/whoop/analytics/strain/model/BiologicalSex;-><init>(Ljava/lang/String;IDDDDDDDDD)V

    sput-object v3, Lcom/whoop/analytics/strain/model/BiologicalSex;->maleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    new-instance v4, Lcom/whoop/analytics/strain/model/BiologicalSex;

    const-wide v21, 0x3fb2f1a9fbe76c8bL    # 0.074

    const-wide v23, -0x3fcb99096bb98c7eL    # -20.4022

    const-string v5, "femaleNew"

    const/4 v6, 0x4

    const-wide/16 v7, 0x0

    const-wide v9, 0x40227e76c8b43958L    # 9.247

    const-wide v11, 0x40735ccccccccccdL    # 309.8

    const-wide v13, 0x401151eb851eb852L    # 4.33

    const-wide v15, 0x407bf97ced916873L    # 447.593

    const-wide v17, 0x3fdc9eecbfb15b57L    # 0.4472

    const-wide v19, -0x403fd566cf41f213L    # -0.1263

    invoke-direct/range {v4 .. v24}, Lcom/whoop/analytics/strain/model/BiologicalSex;-><init>(Ljava/lang/String;IDDDDDDDDD)V

    sput-object v4, Lcom/whoop/analytics/strain/model/BiologicalSex;->femaleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    new-instance v5, Lcom/whoop/analytics/strain/model/BiologicalSex;

    const-wide v22, 0x3fc1a5119ce075f7L    # 0.13785

    const-wide v24, -0x3fbd200ebedfa440L    # -37.74955

    const-string v6, "nonBinaryNew"

    const/4 v7, 0x5

    const-wide v8, -0x400fd0efd738f206L    # -1.0114900200723

    const-wide v10, 0x4026a4dd2f1a9fbeL    # 11.322

    const-wide v12, 0x4078ad999999999aL    # 394.85

    const-wide v14, 0x40140395810624ddL    # 5.0035

    const-wide v16, 0x4070bfa3d70a3d71L    # 267.9775

    const-wide v18, 0x3fe13fe5c91d14e4L    # 0.53905

    const-wide v20, 0x3fa28f5c28f5c28fL    # 0.03625

    invoke-direct/range {v5 .. v25}, Lcom/whoop/analytics/strain/model/BiologicalSex;-><init>(Ljava/lang/String;IDDDDDDDDD)V

    sput-object v5, Lcom/whoop/analytics/strain/model/BiologicalSex;->nonBinaryNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v0

    sput-object v0, Lcom/whoop/analytics/strain/model/BiologicalSex;->$VALUES:[Lcom/whoop/analytics/strain/model/BiologicalSex;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IDDDDDDDDD)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDDDDDDD)V"
        }
    .end annotation

    invoke-direct/range {p0 .. p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->heartRateWeightValue:D

    iput-wide p5, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingWeightValue:D

    iput-wide p7, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingHeightValue:D

    iput-wide p9, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingAgeValue:D

    iput-wide p11, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingAlphaValue:D

    move-wide p1, p15

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutWeightValue:D

    iput-wide p13, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutHeartRateValue:D

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutAgeValue:D

    move-wide/from16 p1, p19

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutAlphaValue:D

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/analytics/strain/model/BiologicalSex;
    .locals 1

    const-class v0, Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/strain/model/BiologicalSex;

    return-object p0
.end method

.method public static values()[Lcom/whoop/analytics/strain/model/BiologicalSex;
    .locals 1

    sget-object v0, Lcom/whoop/analytics/strain/model/BiologicalSex;->$VALUES:[Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v0}, [Lcom/whoop/analytics/strain/model/BiologicalSex;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/analytics/strain/model/BiologicalSex;

    return-object v0
.end method


# virtual methods
.method public getCalorieRestingAgeValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingAgeValue:D

    return-wide v0
.end method

.method public getCalorieRestingAlphaValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingAlphaValue:D

    return-wide v0
.end method

.method public getCalorieRestingHeightValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingHeightValue:D

    return-wide v0
.end method

.method public getCalorieRestingWeightValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieRestingWeightValue:D

    return-wide v0
.end method

.method public getCalorieWorkoutAgeValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutAgeValue:D

    return-wide v0
.end method

.method public getCalorieWorkoutAlphaValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutAlphaValue:D

    return-wide v0
.end method

.method public getCalorieWorkoutHeartRateValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutHeartRateValue:D

    return-wide v0
.end method

.method public getCalorieWorkoutWeightValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->calorieWorkoutWeightValue:D

    return-wide v0
.end method

.method public getHeartRateWeightValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/BiologicalSex;->heartRateWeightValue:D

    return-wide v0
.end method
