.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
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


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_0

    move v1, v6

    move v6, v7

    goto :goto_0

    :cond_0
    move v1, v6

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->valueOf(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    move-result-object v8

    move v9, v7

    move-object v7, v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    move v10, v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->valueOf(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    move-result-object v11

    move v12, v10

    move-object v10, v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move v13, v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    move v14, v13

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    move v15, v14

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    move/from16 v16, v15

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v15

    move/from16 v17, v16

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v16

    move/from16 v18, v17

    invoke-virtual {v0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v17

    move/from16 v19, v18

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-eqz v20, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v19, v1

    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->valueOf(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v22

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-nez v1, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    move-object/from16 v23, v0

    check-cast v23, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    invoke-direct/range {v2 .. v23}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V

    return-object v2
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Creator;->newArray(I)[Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object p1

    return-object p1
.end method
