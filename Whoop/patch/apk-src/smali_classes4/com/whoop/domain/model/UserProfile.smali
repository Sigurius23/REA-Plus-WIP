.class public final Lcom/whoop/domain/model/UserProfile;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008&\u0008\u0086\u0008\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0008H\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\t\u0010/\u001a\u00020\u000cH\u00c6\u0003J\t\u00100\u001a\u00020\u000eH\u00c6\u0003J\t\u00101\u001a\u00020\u0010H\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u00104\u001a\u00020\u0014H\u00c6\u0003Jy\u00105\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0014\u00106\u001a\u00020\u00142\u0008\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00108\u001a\u00020\u0010H\u00d6\u0081\u0004J\n\u00109\u001a\u00020\nH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/domain/model/UserProfile;",
        "",
        "gender",
        "Lcom/whoop/domain/model/Gender;",
        "height",
        "",
        "weight",
        "birthday",
        "Lorg/joda/time/LocalDate;",
        "timeZoneOffset",
        "",
        "unitSystem",
        "Lcom/whoop/domain/model/UnitSystem;",
        "fitnessLevel",
        "Lcom/whoop/domain/model/FitnessLevel;",
        "maxHeartRate",
        "",
        "minHeartRate",
        "physiologicalBaseline",
        "canUploadData",
        "",
        "<init>",
        "(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V",
        "getGender",
        "()Lcom/whoop/domain/model/Gender;",
        "getHeight",
        "()F",
        "getWeight",
        "getBirthday",
        "()Lorg/joda/time/LocalDate;",
        "getTimeZoneOffset",
        "()Ljava/lang/String;",
        "getUnitSystem",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "getFitnessLevel",
        "()Lcom/whoop/domain/model/FitnessLevel;",
        "getMaxHeartRate",
        "()I",
        "getMinHeartRate",
        "getPhysiologicalBaseline",
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
.field private final birthday:Lorg/joda/time/LocalDate;

.field private final canUploadData:Z

.field private final fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

.field private final gender:Lcom/whoop/domain/model/Gender;

.field private final height:F

.field private final maxHeartRate:I

.field private final minHeartRate:I

.field private final physiologicalBaseline:Ljava/lang/String;

.field private final timeZoneOffset:Ljava/lang/String;

.field private final unitSystem:Lcom/whoop/domain/model/UnitSystem;

.field private final weight:F


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V
    .locals 1

    const-string v0, "gender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birthday"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneOffset"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fitnessLevel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    .line 3
    iput p2, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    .line 4
    iput p3, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    .line 5
    iput-object p4, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    .line 6
    iput-object p5, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    .line 8
    iput-object p7, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    .line 9
    iput p8, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    .line 10
    iput p9, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    .line 11
    iput-object p10, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    .line 12
    iput-boolean p11, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p10

    :goto_0
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v13, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    goto :goto_2

    :cond_1
    move/from16 v13, p11

    goto :goto_1

    .line 13
    :goto_2
    invoke-direct/range {v2 .. v13}, Lcom/whoop/domain/model/UserProfile;-><init>(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/UserProfile;Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;ZILjava/lang/Object;)Lcom/whoop/domain/model/UserProfile;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-boolean p11, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    :cond_a
    move-object p12, p10

    move p13, p11

    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/domain/model/UserProfile;->copy(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)Lcom/whoop/domain/model/UserProfile;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/domain/model/Gender;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    return v0
.end method

.method public final component4()Lorg/joda/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public final component7()Lcom/whoop/domain/model/FitnessLevel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    return v0
.end method

.method public final copy(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)Lcom/whoop/domain/model/UserProfile;
    .locals 13

    const-string v0, "gender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birthday"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZoneOffset"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fitnessLevel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/UserProfile;

    move-object v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/domain/model/UserProfile;-><init>(Lcom/whoop/domain/model/Gender;FFLorg/joda/time/LocalDate;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/domain/model/FitnessLevel;IILjava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/UserProfile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/UserProfile;

    iget-object v1, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    iget-object v3, p1, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    iget v3, p1, Lcom/whoop/domain/model/UserProfile;->height:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    iget v3, p1, Lcom/whoop/domain/model/UserProfile;->weight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    iget-object v3, p1, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    iget-object v3, p1, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    iget-object v3, p1, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    iget v3, p1, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    iget v3, p1, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    iget-boolean p1, p1, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBirthday()Lorg/joda/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    return-object v0
.end method

.method public final getCanUploadData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    return v0
.end method

.method public final getFitnessLevel()Lcom/whoop/domain/model/FitnessLevel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    return-object v0
.end method

.method public final getGender()Lcom/whoop/domain/model/Gender;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    return-object v0
.end method

.method public final getHeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    return v0
.end method

.method public final getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    return v0
.end method

.method public final getMinHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    return v0
.end method

.method public final getPhysiologicalBaseline()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitSystem()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/domain/model/UserProfile;->gender:Lcom/whoop/domain/model/Gender;

    iget v1, p0, Lcom/whoop/domain/model/UserProfile;->height:F

    iget v2, p0, Lcom/whoop/domain/model/UserProfile;->weight:F

    iget-object v3, p0, Lcom/whoop/domain/model/UserProfile;->birthday:Lorg/joda/time/LocalDate;

    iget-object v4, p0, Lcom/whoop/domain/model/UserProfile;->timeZoneOffset:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/domain/model/UserProfile;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    iget-object v6, p0, Lcom/whoop/domain/model/UserProfile;->fitnessLevel:Lcom/whoop/domain/model/FitnessLevel;

    iget v7, p0, Lcom/whoop/domain/model/UserProfile;->maxHeartRate:I

    iget v8, p0, Lcom/whoop/domain/model/UserProfile;->minHeartRate:I

    iget-object v9, p0, Lcom/whoop/domain/model/UserProfile;->physiologicalBaseline:Ljava/lang/String;

    iget-boolean v10, p0, Lcom/whoop/domain/model/UserProfile;->canUploadData:Z

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "UserProfile(gender="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", birthday="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeZoneOffset="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unitSystem="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fitnessLevel="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", maxHeartRate="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", minHeartRate="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", physiologicalBaseline="

    const-string v1, ", canUploadData="

    invoke-static {v8, v0, v9, v1, v11}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
