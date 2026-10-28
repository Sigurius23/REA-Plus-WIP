.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;,
        Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008.\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0088\u0001\u0087\u0001B\u00d5\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u00fb\u0001\u0008\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008\u001e\u0010$J\r\u0010%\u001a\u00020 \u00a2\u0006\u0004\u0008%\u0010&J\u001d\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020 \u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010.J\u0010\u00100\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010.J\u0010\u00101\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010.J\u0010\u00106\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010.J\u0010\u00107\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0010\u00109\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010.J\u0010\u0010:\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010.J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010.J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010.J\u0016\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u0016\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010>J\u0016\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010>J\u0010\u0010A\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010.J\u0010\u0010B\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u00102J\u0010\u0010C\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010.J\u0010\u0010D\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010.J\u0010\u0010E\u001a\u00020\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0004\u0008G\u0010HJ\u00fa\u0001\u0010I\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00c6\u0001\u00a2\u0006\u0004\u0008I\u0010JJ\u0010\u0010K\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008K\u0010.J\u0010\u0010L\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008L\u0010&J\u001a\u0010O\u001a\u00020\u00062\u0008\u0010N\u001a\u0004\u0018\u00010MH\u00d6\u0003\u00a2\u0006\u0004\u0008O\u0010PJ\'\u0010X\u001a\u00020*2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0001\u00a2\u0006\u0004\u0008V\u0010WR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010Y\u001a\u0004\u0008Z\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010Y\u001a\u0004\u0008[\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010Y\u001a\u0004\u0008\\\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010]\u001a\u0004\u0008^\u00102R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010_\u0012\u0004\u0008a\u0010b\u001a\u0004\u0008`\u00104R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010Y\u001a\u0004\u0008c\u0010.R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010Y\u001a\u0004\u0008d\u0010.R \u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010e\u0012\u0004\u0008g\u0010b\u001a\u0004\u0008f\u00108R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010Y\u001a\u0004\u0008h\u0010.R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010Y\u001a\u0004\u0008i\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010Y\u001a\u0004\u0008j\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010Y\u001a\u0004\u0008k\u0010.R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010l\u001a\u0004\u0008m\u0010>R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010l\u001a\u0004\u0008n\u0010>R\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010l\u001a\u0004\u0008o\u0010>R\u0017\u0010\u0016\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010Y\u001a\u0004\u0008p\u0010.R\u0017\u0010\u0017\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010]\u001a\u0004\u0008q\u00102R\u0017\u0010\u0018\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010Y\u001a\u0004\u0008r\u0010.R\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010Y\u001a\u0004\u0008s\u0010.R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010t\u001a\u0004\u0008u\u0010FR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010v\u001a\u0004\u0008w\u0010HR&\u0010x\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008x\u0010l\u0012\u0004\u0008z\u0010b\u001a\u0004\u0008y\u0010>R \u0010{\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008{\u0010]\u0012\u0004\u0008|\u0010b\u001a\u0004\u0008{\u00102R\"\u0010}\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008}\u0010Y\u0012\u0004\u0008\u007f\u0010b\u001a\u0004\u0008~\u0010.R*\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0080\u0001\u0010l\u0012\u0005\u0008\u0082\u0001\u0010b\u001a\u0005\u0008\u0081\u0001\u0010>R\u0017\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "Landroid/os/Parcelable;",
        "",
        "exerciseId",
        "name",
        "pushCoreName",
        "",
        "trackable",
        "Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;",
        "equipment",
        "translatedEquipment",
        "exerciseType",
        "Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;",
        "laterality",
        "movementPattern",
        "translatedMovementPattern",
        "imageUrl",
        "videoUrl",
        "",
        "instructions",
        "trainingTypes",
        "muscleGroups",
        "translatedMuscleGroups",
        "deleted",
        "createdAt",
        "updatedAt",
        "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;",
        "volumeInputFormat",
        "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;",
        "customExerciseInfo",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Z",
        "component5",
        "()Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Ljava/util/List;",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;",
        "component21",
        "()Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getExerciseId",
        "getName",
        "getPushCoreName",
        "Z",
        "getTrackable",
        "Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;",
        "getEquipment",
        "getEquipment$annotations",
        "()V",
        "getTranslatedEquipment",
        "getExerciseType",
        "Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;",
        "getLaterality",
        "getLaterality$annotations",
        "getMovementPattern",
        "getTranslatedMovementPattern",
        "getImageUrl",
        "getVideoUrl",
        "Ljava/util/List;",
        "getInstructions",
        "getTrainingTypes",
        "getMuscleGroups",
        "getTranslatedMuscleGroups",
        "getDeleted",
        "getCreatedAt",
        "getUpdatedAt",
        "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;",
        "getVolumeInputFormat",
        "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;",
        "getCustomExerciseInfo",
        "nameKeywords",
        "getNameKeywords",
        "getNameKeywords$annotations",
        "isCustomExercise",
        "isCustomExercise$annotations",
        "linkedExerciseId",
        "getLinkedExerciseId",
        "getLinkedExerciseId$annotations",
        "metadataKeywords",
        "getMetadataKeywords",
        "getMetadataKeywords$annotations",
        "Lcom/whoop/design/util/TextResource;",
        "getRepsWeightInfoText",
        "()Lcom/whoop/design/util/TextResource;",
        "repsWeightInfoText",
        "Companion",
        "$serializer",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Companion;


# instance fields
.field private final createdAt:Ljava/lang/String;

.field private final customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

.field private final deleted:Z

.field private final equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

.field private final exerciseId:Ljava/lang/String;

.field private final exerciseType:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final instructions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isCustomExercise:Z

.field private final laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

.field private final linkedExerciseId:Ljava/lang/String;

.field private final metadataKeywords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final movementPattern:Ljava/lang/String;

.field private final muscleGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final nameKeywords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pushCoreName:Ljava/lang/String;

.field private final trackable:Z

.field private final trainingTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final translatedEquipment:Ljava/lang/String;

.field private final translatedMovementPattern:Ljava/lang/String;

.field private final translatedMuscleGroups:Ljava/lang/String;

.field private final updatedAt:Ljava/lang/String;

.field private final videoUrl:Ljava/lang/String;

.field private final volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->Companion:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->$stable:I

    new-instance v2, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Creator;

    invoke-direct {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$Creator;-><init>()V

    sput-object v2, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljp1/p;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ljp1/p;

    const/16 v6, 0x12

    invoke-direct {v5, v6}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Ljp1/p;

    const/16 v8, 0x13

    invoke-direct {v7, v8}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Ljp1/p;

    const/16 v10, 0x14

    invoke-direct {v9, v10}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Ljp1/p;

    const/16 v12, 0x15

    invoke-direct {v11, v12}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v13, Ljp1/p;

    const/16 v14, 0x16

    invoke-direct {v13, v14}, Ljp1/p;-><init>(I)V

    invoke-static {v2, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v12, v12, [Ll83/h;

    const/4 v13, 0x0

    aput-object v1, v12, v13

    const/4 v13, 0x1

    aput-object v1, v12, v13

    const/4 v13, 0x2

    aput-object v1, v12, v13

    const/4 v13, 0x3

    aput-object v1, v12, v13

    const/4 v13, 0x4

    aput-object v3, v12, v13

    const/4 v3, 0x5

    aput-object v1, v12, v3

    const/4 v3, 0x6

    aput-object v1, v12, v3

    const/4 v3, 0x7

    aput-object v5, v12, v3

    aput-object v1, v12, v0

    const/16 v0, 0x9

    aput-object v1, v12, v0

    const/16 v0, 0xa

    aput-object v1, v12, v0

    const/16 v0, 0xb

    aput-object v1, v12, v0

    const/16 v0, 0xc

    aput-object v7, v12, v0

    const/16 v0, 0xd

    aput-object v9, v12, v0

    const/16 v0, 0xe

    aput-object v11, v12, v0

    const/16 v0, 0xf

    aput-object v1, v12, v0

    const/16 v0, 0x10

    aput-object v1, v12, v0

    aput-object v1, v12, v4

    aput-object v1, v12, v6

    aput-object v2, v12, v8

    aput-object v1, v12, v10

    sput-object v12, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 4

    move-object v1, p11

    const v2, 0xf3ff

    and-int v3, p1, v2

    if-eq v2, v3, :cond_0

    .line 1
    sget-object v3, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v3

    invoke-static {p1, v2, v3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    iput-object p6, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    iput-object p7, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    iput-object p10, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    iput-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    and-int/lit16 p4, p1, 0x400

    const/4 p5, 0x0

    if-nez p4, :cond_1

    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object/from16 p4, p12

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    :goto_0
    and-int/lit16 p4, p1, 0x800

    if-nez p4, :cond_2

    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    :goto_1
    move-object/from16 p4, p14

    goto :goto_2

    :cond_2
    move-object/from16 p4, p13

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    goto :goto_1

    :goto_2
    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    move-object/from16 p4, p15

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    move-object/from16 p4, p16

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    move-object/from16 p4, p17

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    const/high16 p4, 0x10000

    and-int/2addr p4, p1

    const/4 v2, 0x0

    if-nez p4, :cond_3

    iput-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    goto :goto_3

    :cond_3
    move/from16 p4, p18

    iput-boolean p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    :goto_3
    const/high16 p4, 0x20000

    and-int/2addr p4, p1

    const-string v3, ""

    if-nez p4, :cond_4

    iput-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 p4, p19

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    :goto_4
    const/high16 p4, 0x40000

    and-int/2addr p4, p1

    if-nez p4, :cond_5

    iput-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 p4, p20

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    :goto_5
    const/high16 p4, 0x80000

    and-int/2addr p4, p1

    if-nez p4, :cond_6

    .line 2
    sget-object p4, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Reps:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    .line 3
    :goto_6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    goto :goto_7

    :cond_6
    move-object/from16 p4, p21

    goto :goto_6

    :goto_7
    const/high16 p4, 0x100000

    and-int/2addr p1, p4

    if-nez p1, :cond_7

    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    goto :goto_8

    :cond_7
    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    .line 4
    :goto_8
    sget-object p1, Lor2/j1;->a:Lor2/j1;

    invoke-virtual {p1}, Lor2/j1;->c()Lyb3/p;

    move-result-object p1

    invoke-virtual {p1, p3}, Lyb3/p;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->nameKeywords:Ljava/util/List;

    .line 6
    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    if-eqz p1, :cond_8

    const/4 v2, 0x1

    .line 7
    :cond_8
    iput-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->isCustomExercise:Z

    if-eqz p1, :cond_9

    .line 8
    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;->getLinkedExercise()Lcom/whoop/weightlifting/data/domain/LinkedExercise;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/LinkedExercise;->getExerciseId()Ljava/lang/String;

    move-result-object p5

    .line 9
    :cond_9
    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->linkedExerciseId:Ljava/lang/String;

    .line 10
    const-string p1, "_"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x6

    invoke-static {p7, p3, p4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p3

    .line 11
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p5

    invoke-static {p8, p5, p4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p5

    .line 12
    invoke-virtual {p9}, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->getSerializedValue()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p2

    .line 13
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p11, p1, p4}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    .line 14
    check-cast p3, Ljava/util/Collection;

    .line 15
    check-cast p5, Ljava/lang/Iterable;

    invoke-static {p3, p5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p3

    .line 16
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p3, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    .line 17
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->metadataKeywords:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;",
            "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    move-object/from16 v12, p15

    move-object/from16 v13, p16

    move-object/from16 v14, p18

    move-object/from16 v15, p19

    const-string v0, "exerciseId"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushCoreName"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equipment"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedEquipment"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseType"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "laterality"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPattern"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedMovementPattern"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructions"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trainingTypes"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "muscleGroups"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedMuscleGroups"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "volumeInputFormat"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 20
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    .line 21
    iput-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    .line 22
    iput-object v3, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    move/from16 v1, p4

    .line 23
    iput-boolean v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    .line 24
    iput-object v4, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    .line 25
    iput-object v5, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    .line 26
    iput-object v6, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    .line 27
    iput-object v7, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    .line 28
    iput-object v8, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    .line 29
    iput-object v9, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    move-object/from16 v1, p11

    .line 30
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    move-object/from16 v1, p12

    .line 31
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    .line 32
    iput-object v10, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    .line 33
    iput-object v11, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    .line 34
    iput-object v12, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    .line 35
    iput-object v13, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    move/from16 v1, p17

    .line 36
    iput-boolean v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    .line 37
    iput-object v14, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 38
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    .line 39
    iput-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-object/from16 v1, p21

    .line 40
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    .line 41
    sget-object v3, Lor2/j1;->a:Lor2/j1;

    invoke-virtual {v3}, Lor2/j1;->c()Lyb3/p;

    move-result-object v3

    invoke-virtual {v3, v2}, Lyb3/p;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->nameKeywords:Ljava/util/List;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 42
    :goto_0
    iput-boolean v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->isCustomExercise:Z

    if-eqz v1, :cond_1

    .line 43
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;->getLinkedExercise()Lcom/whoop/weightlifting/data/domain/LinkedExercise;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/LinkedExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->linkedExerciseId:Ljava/lang/String;

    .line 44
    const-string v1, "_"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v5, v2, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    .line 45
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    .line 46
    invoke-virtual {v7}, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->getSerializedValue()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    .line 47
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    .line 48
    check-cast v2, Ljava/util/Collection;

    .line 49
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    .line 50
    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    .line 51
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v2, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    .line 52
    iput-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->metadataKeywords:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p22

    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v14, v2

    goto :goto_0

    :cond_0
    move-object/from16 v14, p11

    :goto_0
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_1

    move-object v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v15, p12

    :goto_1
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move/from16 v20, v1

    goto :goto_2

    :cond_2
    move/from16 v20, p17

    :goto_2
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    .line 53
    const-string v3, ""

    if-eqz v1, :cond_3

    move-object/from16 v21, v3

    goto :goto_3

    :cond_3
    move-object/from16 v21, p18

    :goto_3
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    move-object/from16 v22, v3

    goto :goto_4

    :cond_4
    move-object/from16 v22, p19

    :goto_4
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_5

    .line 54
    sget-object v1, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Reps:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-object/from16 v23, v1

    goto :goto_5

    :cond_5
    move-object/from16 v23, p20

    :goto_5
    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eqz v0, :cond_6

    move-object/from16 v24, v2

    :goto_6
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    goto :goto_7

    :cond_6
    move-object/from16 v24, p21

    goto :goto_6

    .line 55
    :goto_7
    invoke-direct/range {v3 .. v24}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "com.whoop.weightlifting.data.domain.ExerciseEquipment"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->values()[Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "com.whoop.weightlifting.data.domain.ExerciseLaterality"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->values()[Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.weightlifting.data.domain.VolumeInputFormat"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->values()[Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p22, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p22, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p22, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p22, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p22, v16

    if-eqz v16, :cond_14

    move-object/from16 p6, v1

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    move-object/from16 p21, p6

    move-object/from16 p22, v1

    :goto_14
    move-object/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_15

    :cond_14
    move-object/from16 p22, p21

    move-object/from16 p21, v1

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p22}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getEquipment$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLaterality$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLinkedExerciseId$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getMetadataKeywords$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getNameKeywords$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic h()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic isCustomExercise$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic k()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic s()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0xc

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    if-eqz v2, :cond_5

    :goto_2
    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/16 v1, 0x11

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/16 v1, 0x12

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_9
    const/16 v1, 0x13

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    sget-object v3, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Reps:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    if-eq v2, v3, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo$$serializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    return-object v0
.end method

.method public final component21()Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    return v0
.end method

.method public final component5()Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;",
            "Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;",
            ")",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;"
        }
    .end annotation

    const-string v0, "exerciseId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushCoreName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "equipment"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedEquipment"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "laterality"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPattern"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedMovementPattern"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructions"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trainingTypes"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "muscleGroups"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedMuscleGroups"

    move-object/from16 v5, p16

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v12, p18

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v13, p19

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "volumeInputFormat"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-object/from16 v16, p15

    move/from16 v18, p17

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v17, v5

    move-object/from16 v19, v12

    move-object/from16 v20, v13

    move/from16 v5, p4

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v22}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomExerciseInfo()Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    return v0
.end method

.method public final getEquipment()Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    return-object v0
.end method

.method public final getExerciseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final getLaterality()Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    return-object v0
.end method

.method public final getLinkedExerciseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->linkedExerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadataKeywords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->metadataKeywords:Ljava/util/List;

    return-object v0
.end method

.method public final getMovementPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getMuscleGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNameKeywords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->nameKeywords:Ljava/util/List;

    return-object v0
.end method

.method public final getPushCoreName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    return-object v0
.end method

.method public final getRepsWeightInfoText()Lcom/whoop/design/util/TextResource;
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->Dumbbell:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    if-ne v0, v1, :cond_0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    sget-object v3, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Alternating:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    if-eq v2, v3, :cond_0

    sget v0, Lcu2/h;->G0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_0
    if-ne v0, v1, :cond_1

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    sget-object v2, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Alternating:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    if-ne v1, v2, :cond_1

    sget v0, Lcu2/h;->F0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v1, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->BodyWeight:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    if-ne v0, v1, :cond_2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    sget-object v3, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Alternating:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    if-ne v2, v3, :cond_2

    sget v0, Lcu2/h;->Z:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_2
    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Alternating:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    if-eq v0, v1, :cond_3

    sget v0, Lcu2/h;->a0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Alternating:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    if-ne v0, v1, :cond_4

    sget v0, Lcu2/h;->Y:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTrackable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    return v0
.end method

.method public final getTrainingTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getTranslatedEquipment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    return-object v0
.end method

.method public final getTranslatedMovementPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getTranslatedMuscleGroups()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeInputFormat()Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
.end method

.method public final isCustomExercise()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->isCustomExercise:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    iget-object v5, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    iget-object v6, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    iget-object v9, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-boolean v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    move/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    const-string v0, ", name="

    move-object/from16 v22, v15

    const-string v15, ", pushCoreName="

    move-object/from16 v23, v13

    const-string v13, "WeightliftingExercise(exerciseId="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trackable="

    const-string v2, ", equipment="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", translatedEquipment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", exerciseType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", laterality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", movementPattern="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", translatedMovementPattern="

    const-string v2, ", imageUrl="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", videoUrl="

    const-string v2, ", instructions="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trainingTypes="

    const-string v2, ", muscleGroups="

    move-object/from16 v3, v23

    invoke-static {v0, v3, v1, v14, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", translatedMuscleGroups="

    const-string v2, ", deleted="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v1, v4, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", createdAt="

    const-string v2, ", updatedAt="

    move/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", volumeInputFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customExerciseInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->pushCoreName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trackable:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->equipment:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedEquipment:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->exerciseType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->laterality:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->movementPattern:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMovementPattern:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->imageUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->videoUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->instructions:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->trainingTypes:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->muscleGroups:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->translatedMuscleGroups:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->deleted:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->createdAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->updatedAt:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->volumeInputFormat:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->customExerciseInfo:Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
