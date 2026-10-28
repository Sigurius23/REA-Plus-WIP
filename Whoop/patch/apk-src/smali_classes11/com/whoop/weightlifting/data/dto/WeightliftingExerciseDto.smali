.class public final Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;,
        Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008:\u0008\u0087\u0008\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0089\u0001\u0088\u0001B\u0087\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u0091\u0002\u0008\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001d\u0010#J\r\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0010\u0010+\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010(J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010(J\u0010\u00100\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010(J\u0010\u00101\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010(J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00106J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00106J\u0012\u00109\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0010\u0010<\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010(J\u0010\u0010=\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010(J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010(J\u0012\u0010?\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010(J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010(J\u00a2\u0002\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00022\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008C\u0010DJ\u0010\u0010E\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008E\u0010(J\u0010\u0010F\u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008F\u0010GJ\u001a\u0010I\u001a\u00020\u00062\u0008\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008I\u0010JJ\'\u0010S\u001a\u00020P2\u0006\u0010K\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0001\u00a2\u0006\u0004\u0008Q\u0010RR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010T\u0012\u0004\u0008V\u0010W\u001a\u0004\u0008U\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010T\u0012\u0004\u0008Y\u0010W\u001a\u0004\u0008X\u0010(R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010T\u0012\u0004\u0008[\u0010W\u001a\u0004\u0008Z\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\\\u0012\u0004\u0008^\u0010W\u001a\u0004\u0008]\u0010,R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010T\u0012\u0004\u0008`\u0010W\u001a\u0004\u0008_\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010T\u0012\u0004\u0008b\u0010W\u001a\u0004\u0008a\u0010(R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010T\u0012\u0004\u0008d\u0010W\u001a\u0004\u0008c\u0010(R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010T\u0012\u0004\u0008f\u0010W\u001a\u0004\u0008e\u0010(R \u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010T\u0012\u0004\u0008h\u0010W\u001a\u0004\u0008g\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010T\u0012\u0004\u0008j\u0010W\u001a\u0004\u0008i\u0010(R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010T\u0012\u0004\u0008l\u0010W\u001a\u0004\u0008k\u0010(R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010T\u0012\u0004\u0008n\u0010W\u001a\u0004\u0008m\u0010(R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010o\u0012\u0004\u0008q\u0010W\u001a\u0004\u0008p\u00106R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010o\u0012\u0004\u0008s\u0010W\u001a\u0004\u0008r\u00106R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010o\u0012\u0004\u0008u\u0010W\u001a\u0004\u0008t\u00106R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010T\u0012\u0004\u0008w\u0010W\u001a\u0004\u0008v\u0010(R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010x\u0012\u0004\u0008z\u0010W\u001a\u0004\u0008y\u0010;R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010T\u0012\u0004\u0008|\u0010W\u001a\u0004\u0008{\u0010(R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010T\u0012\u0004\u0008~\u0010W\u001a\u0004\u0008}\u0010(R#\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0013\n\u0004\u0008\u0018\u0010T\u0012\u0005\u0008\u0080\u0001\u0010W\u001a\u0004\u0008\u007f\u0010(R%\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001a\u0010\u0081\u0001\u0012\u0005\u0008\u0083\u0001\u0010W\u001a\u0005\u0008\u0082\u0001\u0010@R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001b\u0010T\u0012\u0005\u0008\u0085\u0001\u0010W\u001a\u0005\u0008\u0084\u0001\u0010(R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001c\u0010T\u0012\u0005\u0008\u0087\u0001\u0010W\u001a\u0005\u0008\u0086\u0001\u0010(\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "",
        "",
        "exerciseId",
        "name",
        "pushCoreName",
        "",
        "trackable",
        "equipment",
        "translatedEquipment",
        "exerciseType",
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
        "volumeInputFormat",
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "customExerciseInfo",
        "volumeInputUnit",
        "volumeInputValue",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "toWeightliftingExercise",
        "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Z",
        "component5",
        "component6",
        "component7",
        "component8",
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
        "()Ljava/lang/Boolean;",
        "component18",
        "component19",
        "component20",
        "component21",
        "()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "component22",
        "component23",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getExerciseId",
        "getExerciseId$annotations",
        "()V",
        "getName",
        "getName$annotations",
        "getPushCoreName",
        "getPushCoreName$annotations",
        "Z",
        "getTrackable",
        "getTrackable$annotations",
        "getEquipment",
        "getEquipment$annotations",
        "getTranslatedEquipment",
        "getTranslatedEquipment$annotations",
        "getExerciseType",
        "getExerciseType$annotations",
        "getLaterality",
        "getLaterality$annotations",
        "getMovementPattern",
        "getMovementPattern$annotations",
        "getTranslatedMovementPattern",
        "getTranslatedMovementPattern$annotations",
        "getImageUrl",
        "getImageUrl$annotations",
        "getVideoUrl",
        "getVideoUrl$annotations",
        "Ljava/util/List;",
        "getInstructions",
        "getInstructions$annotations",
        "getTrainingTypes",
        "getTrainingTypes$annotations",
        "getMuscleGroups",
        "getMuscleGroups$annotations",
        "getTranslatedMuscleGroups",
        "getTranslatedMuscleGroups$annotations",
        "Ljava/lang/Boolean;",
        "getDeleted",
        "getDeleted$annotations",
        "getCreatedAt",
        "getCreatedAt$annotations",
        "getUpdatedAt",
        "getUpdatedAt$annotations",
        "getVolumeInputFormat",
        "getVolumeInputFormat$annotations",
        "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
        "getCustomExerciseInfo",
        "getCustomExerciseInfo$annotations",
        "getVolumeInputUnit",
        "getVolumeInputUnit$annotations",
        "getVolumeInputValue",
        "getVolumeInputValue$annotations",
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$Companion;


# instance fields
.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "custom_exercise_info"
    .end annotation
.end field

.field private final deleted:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final equipment:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "equipment"
    .end annotation
.end field

.field private final exerciseId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_id"
    .end annotation
.end field

.field private final exerciseType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_type"
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_url"
    .end annotation
.end field

.field private final instructions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "instructions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final laterality:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "laterality"
    .end annotation
.end field

.field private final movementPattern:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "movement_pattern"
    .end annotation
.end field

.field private final muscleGroups:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "muscle_groups"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final pushCoreName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "push_core_name"
    .end annotation
.end field

.field private final trackable:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trackable"
    .end annotation
.end field

.field private final trainingTypes:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "training_types"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final translatedEquipment:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "translated_equipment"
    .end annotation
.end field

.field private final translatedMovementPattern:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "translated_movement_pattern"
    .end annotation
.end field

.field private final translatedMuscleGroups:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "translated_muscle_groups"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final videoUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "video_url"
    .end annotation
.end field

.field private final volumeInputFormat:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "volume_input_format"
    .end annotation
.end field

.field private final volumeInputUnit:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "volume_input_units"
    .end annotation
.end field

.field private final volumeInputValue:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "volume_input_value"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lku2/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lku2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lku2/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lku2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lku2/a;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lku2/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x17

    new-array v7, v7, [Ll83/h;

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v4, 0x3

    aput-object v1, v7, v4

    const/4 v4, 0x4

    aput-object v1, v7, v4

    const/4 v4, 0x5

    aput-object v1, v7, v4

    const/4 v4, 0x6

    aput-object v1, v7, v4

    const/4 v4, 0x7

    aput-object v1, v7, v4

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v1, v7, v0

    const/16 v0, 0xa

    aput-object v1, v7, v0

    const/16 v0, 0xb

    aput-object v1, v7, v0

    const/16 v0, 0xc

    aput-object v3, v7, v0

    const/16 v0, 0xd

    aput-object v5, v7, v0

    const/16 v0, 0xe

    aput-object v2, v7, v0

    const/16 v0, 0xf

    aput-object v1, v7, v0

    const/16 v0, 0x10

    aput-object v1, v7, v0

    const/16 v0, 0x11

    aput-object v1, v7, v0

    const/16 v0, 0x12

    aput-object v1, v7, v0

    const/16 v0, 0x13

    aput-object v1, v7, v0

    const/16 v0, 0x14

    aput-object v1, v7, v0

    const/16 v0, 0x15

    aput-object v1, v7, v0

    const/16 v0, 0x16

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x1001df

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    :goto_0
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p11, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p12, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p13, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    goto :goto_4

    :cond_5
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    :goto_4
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    goto :goto_5

    :cond_6
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    :goto_5
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    goto :goto_6

    :cond_7
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    :goto_6
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    :goto_7
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    goto :goto_8

    :cond_9
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    :goto_8
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    const-string p4, ""

    if-nez p2, :cond_a

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    :goto_9
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_b

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    :goto_a
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_c

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    :goto_b
    move-object/from16 p2, p22

    goto :goto_c

    :cond_c
    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    goto :goto_b

    :goto_c
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    const/high16 p2, 0x200000

    and-int/2addr p2, p1

    if-nez p2, :cond_d

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    :goto_d
    const/high16 p2, 0x400000

    and-int/2addr p1, p2

    if-nez p1, :cond_e

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    return-void

    :cond_e
    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p18

    move-object/from16 v1, p19

    const-string v2, "exerciseId"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "name"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "pushCoreName"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "equipment"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "exerciseType"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "laterality"

    invoke-static {p8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "movementPattern"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "createdAt"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "updatedAt"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    move-object p1, p11

    .line 13
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    move-object p1, p12

    .line 14
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    move-object/from16 p1, p13

    .line 15
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    .line 20
    iput-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    .line 21
    iput-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 27

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    move-object v13, v2

    goto :goto_1

    :cond_1
    move-object/from16 v13, p10

    :goto_1
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_2

    move-object v14, v2

    goto :goto_2

    :cond_2
    move-object/from16 v14, p11

    :goto_2
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_3

    move-object v15, v2

    goto :goto_3

    :cond_3
    move-object/from16 v15, p12

    :goto_3
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_4

    move-object/from16 v16, v2

    goto :goto_4

    :cond_4
    move-object/from16 v16, p13

    :goto_4
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_5

    move-object/from16 v17, v2

    goto :goto_5

    :cond_5
    move-object/from16 v17, p14

    :goto_5
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_6

    move-object/from16 v18, v2

    goto :goto_6

    :cond_6
    move-object/from16 v18, p15

    :goto_6
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object/from16 v19, v2

    goto :goto_7

    :cond_7
    move-object/from16 v19, p16

    :goto_7
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v20, v2

    goto :goto_8

    :cond_8
    move-object/from16 v20, p17

    :goto_8
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    .line 26
    const-string v3, ""

    if-eqz v1, :cond_9

    move-object/from16 v21, v3

    goto :goto_9

    :cond_9
    move-object/from16 v21, p18

    :goto_9
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v22, v3

    goto :goto_a

    :cond_a
    move-object/from16 v22, p19

    :goto_a
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v23, v2

    goto :goto_b

    :cond_b
    move-object/from16 v23, p20

    :goto_b
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v25, v2

    goto :goto_c

    :cond_c
    move-object/from16 v25, p22

    :goto_c
    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move-object/from16 v26, v2

    :goto_d
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v24, p21

    goto :goto_e

    :cond_d
    move-object/from16 v26, p23

    goto :goto_d

    :goto_e
    invoke-direct/range {v3 .. v26}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p24, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p24, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p24, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p24, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p24, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p24, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p24, v16

    if-eqz v16, :cond_16

    move-object/from16 p8, v1

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    move-object/from16 p23, p8

    move-object/from16 p24, v1

    :goto_16
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

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

    goto :goto_17

    :cond_16
    move-object/from16 p24, p23

    move-object/from16 p23, v1

    goto :goto_16

    :goto_17
    invoke-virtual/range {p1 .. p24}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCreatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "created_at"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomExerciseInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "custom_exercise_info"
    .end annotation

    return-void
.end method

.method public static synthetic getDeleted$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "deleted"
    .end annotation

    return-void
.end method

.method public static synthetic getEquipment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "equipment"
    .end annotation

    return-void
.end method

.method public static synthetic getExerciseId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercise_id"
    .end annotation

    return-void
.end method

.method public static synthetic getExerciseType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exercise_type"
    .end annotation

    return-void
.end method

.method public static synthetic getImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getInstructions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "instructions"
    .end annotation

    return-void
.end method

.method public static synthetic getLaterality$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "laterality"
    .end annotation

    return-void
.end method

.method public static synthetic getMovementPattern$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "movement_pattern"
    .end annotation

    return-void
.end method

.method public static synthetic getMuscleGroups$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "muscle_groups"
    .end annotation

    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "name"
    .end annotation

    return-void
.end method

.method public static synthetic getPushCoreName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "push_core_name"
    .end annotation

    return-void
.end method

.method public static synthetic getTrackable$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trackable"
    .end annotation

    return-void
.end method

.method public static synthetic getTrainingTypes$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "training_types"
    .end annotation

    return-void
.end method

.method public static synthetic getTranslatedEquipment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "translated_equipment"
    .end annotation

    return-void
.end method

.method public static synthetic getTranslatedMovementPattern$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "translated_movement_pattern"
    .end annotation

    return-void
.end method

.method public static synthetic getTranslatedMuscleGroups$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "translated_muscle_groups"
    .end annotation

    return-void
.end method

.method public static synthetic getUpdatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "updated_at"
    .end annotation

    return-void
.end method

.method public static synthetic getVideoUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "video_url"
    .end annotation

    return-void
.end method

.method public static synthetic getVolumeInputFormat$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "volume_input_format"
    .end annotation

    return-void
.end method

.method public static synthetic getVolumeInputUnit$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "volume_input_units"
    .end annotation

    return-void
.end method

.method public static synthetic getVolumeInputValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "volume_input_value"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :goto_9
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_13
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :goto_a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_15
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    if-eqz v1, :cond_17

    :goto_b
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    sget-object v0, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto$$serializer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    const/16 v2, 0x14

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    if-eqz v1, :cond_19

    :goto_c
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0x16

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    if-eqz v1, :cond_1b

    :goto_d
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;"
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

    const-string v0, "exerciseType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "laterality"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPattern"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v5, p19

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v20, v5

    move/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    return v2

    :cond_18
    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomExerciseInfo()Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    return-object v0
.end method

.method public final getDeleted()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getEquipment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final getLaterality()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    return-object v0
.end method

.method public final getMovementPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPushCoreName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

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

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getTranslatedEquipment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    return-object v0
.end method

.method public final getTranslatedMovementPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getTranslatedMuscleGroups()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeInputFormat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeInputUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeInputValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    if-nez v1, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    iget-object v5, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputUnit:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputValue:Ljava/lang/String;

    const-string v0, ", name="

    move-object/from16 v24, v15

    const-string v15, ", pushCoreName="

    move-object/from16 v25, v13

    const-string v13, "WeightliftingExerciseDto(exerciseId="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", trackable="

    const-string v2, ", equipment="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", translatedEquipment="

    const-string v2, ", exerciseType="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", laterality="

    const-string v2, ", movementPattern="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", translatedMovementPattern="

    const-string v2, ", imageUrl="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", videoUrl="

    const-string v2, ", instructions="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trainingTypes="

    const-string v2, ", muscleGroups="

    move-object/from16 v3, v25

    invoke-static {v0, v3, v1, v14, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", translatedMuscleGroups="

    const-string v2, ", deleted="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v1, v4, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", createdAt="

    const-string v2, ", updatedAt="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", volumeInputFormat="

    const-string v2, ", customExerciseInfo="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", volumeInputUnit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", volumeInputValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v24

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toWeightliftingExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 28

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseId:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->name:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->pushCoreName:Ljava/lang/String;

    iget-boolean v5, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trackable:Z

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->equipment:Ljava/lang/String;

    sget-object v6, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->Unknown:Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;->values()[Lcom/whoop/weightlifting/data/domain/ExerciseEquipment;

    move-result-object v7

    array-length v8, v7

    const/4 v10, 0x0

    :goto_0
    const/4 v11, 0x0

    if-ge v10, v8, :cond_1

    aget-object v12, v7, v10

    invoke-interface {v12}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    move-object v12, v11

    :goto_1
    if-nez v12, :cond_2

    goto :goto_2

    :cond_2
    move-object v6, v12

    :goto_2
    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedEquipment:Ljava/lang/String;

    const-string v7, ""

    if-nez v1, :cond_3

    move-object v1, v7

    :cond_3
    iget-object v8, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->exerciseType:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->laterality:Ljava/lang/String;

    sget-object v12, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->Unknown:Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;->values()[Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;

    move-result-object v13

    array-length v14, v13

    const/4 v15, 0x0

    :goto_3
    if-ge v15, v14, :cond_5

    aget-object v16, v13, v15

    invoke-interface/range {v16 .. v16}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    :cond_5
    move-object/from16 v16, v11

    :goto_4
    if-nez v16, :cond_6

    move-object v9, v12

    goto :goto_5

    :cond_6
    move-object/from16 v9, v16

    :goto_5
    iget-object v10, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->movementPattern:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMovementPattern:Ljava/lang/String;

    if-nez v12, :cond_7

    move-object v12, v7

    :cond_7
    iget-object v13, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->imageUrl:Ljava/lang/String;

    move-object v14, v11

    move-object v11, v12

    move-object v12, v13

    iget-object v13, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->videoUrl:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->instructions:Ljava/util/List;

    sget-object v16, Lm83/y;->w:Lm83/y;

    if-nez v15, :cond_8

    move-object/from16 v15, v16

    :cond_8
    iget-object v14, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->trainingTypes:Ljava/util/List;

    if-nez v14, :cond_9

    move-object/from16 v14, v16

    :cond_9
    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->muscleGroups:Ljava/util/List;

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    move-object/from16 v16, v1

    :goto_6
    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->translatedMuscleGroups:Ljava/lang/String;

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    move-object v7, v1

    :goto_7
    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->deleted:Ljava/lang/Boolean;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v20, v1

    goto :goto_8

    :cond_c
    const/16 v20, 0x0

    :goto_8
    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->createdAt:Ljava/lang/String;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->updatedAt:Ljava/lang/String;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->volumeInputFormat:Ljava/lang/String;

    sget-object v23, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->Reps:Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-object/from16 v24, v2

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;->values()[Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;

    move-result-object v2

    move-object/from16 v25, v3

    array-length v3, v2

    move-object/from16 v26, v2

    const/4 v2, 0x0

    :goto_9
    if-ge v2, v3, :cond_e

    aget-object v17, v26, v2

    move/from16 v27, v2

    invoke-interface/range {v17 .. v17}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_a

    :cond_d
    add-int/lit8 v2, v27, 0x1

    goto :goto_9

    :cond_e
    const/16 v17, 0x0

    :goto_a
    if-nez v17, :cond_f

    goto :goto_b

    :cond_f
    move-object/from16 v23, v17

    :goto_b
    iget-object v1, v0, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->customExerciseInfo:Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;

    if-eqz v1, :cond_10

    invoke-static {v1}, Lcom/whoop/weightlifting/data/dto/CustomExerciseDtoKt;->toDomain(Lcom/whoop/weightlifting/data/dto/CustomExerciseInfoDto;)Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;

    move-result-object v1

    goto :goto_c

    :cond_10
    const/4 v1, 0x0

    :goto_c
    new-instance v2, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-object v3, v15

    move-object v15, v14

    move-object v14, v3

    move-object/from16 v17, v7

    move-object/from16 v7, v19

    move/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move-object/from16 v21, v23

    move-object/from16 v3, v25

    move-object/from16 v22, v1

    move-object v1, v2

    move-object/from16 v2, v24

    invoke-direct/range {v1 .. v22}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/weightlifting/data/domain/ExerciseEquipment;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/ExerciseLaterality;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Lcom/whoop/weightlifting/data/domain/CustomExerciseInfo;)V

    return-object v1
.end method
