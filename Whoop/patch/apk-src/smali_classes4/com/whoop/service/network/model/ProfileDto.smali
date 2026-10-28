.class public final Lcom/whoop/service/network/model/ProfileDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\"\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bw\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003Jy\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0014\u0010.\u001a\u00020\u00102\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00100\u001a\u00020\rH\u00d6\u0081\u0004J\n\u00101\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/service/network/model/ProfileDto;",
        "",
        "height",
        "",
        "weight",
        "birthday",
        "",
        "gender",
        "unitSystem",
        "fitnessLevel",
        "timezoneOffset",
        "physiologicalBaseline",
        "maxHeartRate",
        "",
        "minHeartRate",
        "canUploadData",
        "",
        "<init>",
        "(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V",
        "getHeight",
        "()F",
        "getWeight",
        "getBirthday",
        "()Ljava/lang/String;",
        "getGender",
        "getUnitSystem",
        "getFitnessLevel",
        "getTimezoneOffset",
        "getPhysiologicalBaseline",
        "getMaxHeartRate",
        "()I",
        "getMinHeartRate",
        "getCanUploadData",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "core_release"
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
.field private final birthday:Ljava/lang/String;

.field private final canUploadData:Z

.field private final fitnessLevel:Ljava/lang/String;

.field private final gender:Ljava/lang/String;

.field private final height:F

.field private final maxHeartRate:I

.field private final minHeartRate:I

.field private final physiologicalBaseline:Ljava/lang/String;

.field private final timezoneOffset:Ljava/lang/String;

.field private final unitSystem:Ljava/lang/String;

.field private final weight:F


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/service/network/model/ProfileDto;-><init>(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V
    .locals 1

    const-string v0, "birthday"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fitnessLevel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezoneOffset"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    .line 4
    iput p2, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    .line 5
    iput-object p3, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    .line 11
    iput p9, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    .line 12
    iput p10, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    .line 13
    iput-boolean p11, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    return-void
.end method

.method public synthetic constructor <init>(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    .line 14
    const-string v0, ""

    if-eqz p13, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    const/4 p8, 0x0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    const/4 v0, 0x0

    if-eqz p13, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move p12, v0

    :goto_0
    move p11, p10

    move p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_a
    move p12, p11

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/service/network/model/ProfileDto;-><init>(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/ProfileDto;FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZILjava/lang/Object;)Lcom/whoop/service/network/model/ProfileDto;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-boolean p11, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    :cond_a
    move p12, p10

    move p13, p11

    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/service/network/model/ProfileDto;->copy(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)Lcom/whoop/service/network/model/ProfileDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    return v0
.end method

.method public final copy(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)Lcom/whoop/service/network/model/ProfileDto;
    .locals 13

    const-string v0, "birthday"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fitnessLevel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezoneOffset"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/ProfileDto;

    move v2, p1

    move v3, p2

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/service/network/model/ProfileDto;-><init>(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/ProfileDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/ProfileDto;

    iget v1, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    iget v3, p1, Lcom/whoop/service/network/model/ProfileDto;->height:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    iget v3, p1, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    iget v3, p1, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    iget v3, p1, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    iget-boolean p1, p1, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBirthday()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanUploadData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    return v0
.end method

.method public final getFitnessLevel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    return-object v0
.end method

.method public final getGender()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    return v0
.end method

.method public final getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    return v0
.end method

.method public final getMinHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    return v0
.end method

.method public final getPhysiologicalBaseline()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimezoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitSystem()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget v0, p0, Lcom/whoop/service/network/model/ProfileDto;->height:F

    iget v1, p0, Lcom/whoop/service/network/model/ProfileDto;->weight:F

    iget-object v2, p0, Lcom/whoop/service/network/model/ProfileDto;->birthday:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/service/network/model/ProfileDto;->gender:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/service/network/model/ProfileDto;->unitSystem:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/service/network/model/ProfileDto;->fitnessLevel:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/service/network/model/ProfileDto;->timezoneOffset:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/service/network/model/ProfileDto;->physiologicalBaseline:Ljava/lang/String;

    iget v8, p0, Lcom/whoop/service/network/model/ProfileDto;->maxHeartRate:I

    iget v9, p0, Lcom/whoop/service/network/model/ProfileDto;->minHeartRate:I

    iget-boolean v10, p0, Lcom/whoop/service/network/model/ProfileDto;->canUploadData:Z

    const-string v11, ", weight="

    const-string v12, ", birthday="

    const-string v13, "ProfileDto(height="

    invoke-static {v13, v0, v11, v1, v12}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gender="

    const-string v11, ", unitSystem="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", fitnessLevel="

    const-string v2, ", timezoneOffset="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", physiologicalBaseline="

    const-string v2, ", maxHeartRate="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", minHeartRate="

    const-string v2, ", canUploadData="

    invoke-static {v0, v8, v1, v9, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
