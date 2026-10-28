.class public final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008-\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008&\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0004\u00ae\u0001\u00af\u0001B\u00d3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020!\u0012\u000e\u0008\u0002\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0008\u0008\u0002\u0010$\u001a\u00020!\u00a2\u0006\u0004\u0008%\u0010&B\u00d3\u0001\u0008\u0010\u0012\u0006\u0010\'\u001a\u00020\u001d\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0006\u0010$\u001a\u00020!\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008%\u0010*J\u0015\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u000e\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\u000c\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00105J\u0016\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0016\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00108J\u0016\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0010\u0010<\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u0010\u0010@\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u001c\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0010\u0010D\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0010\u0010F\u001a\u00020\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0010\u0010H\u001a\u00020\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010MJ\u0010\u0010N\u001a\u00020!H\u00c6\u0003\u00a2\u0006\u0004\u0008N\u0010OJ\u0016\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008P\u0010;J\u0010\u0010Q\u001a\u00020!H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010OJ\u00f2\u0001\u0010R\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00150\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0008\u0002\u0010\"\u001a\u00020!2\u000e\u0008\u0002\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0008\u0008\u0002\u0010$\u001a\u00020!H\u00c6\u0001\u00a2\u0006\u0004\u0008R\u0010SJ\u0010\u0010T\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008T\u00103J\u0010\u0010U\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008U\u0010VJ\u001a\u0010X\u001a\u00020!2\u0008\u0010W\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008X\u0010YJ\u0013\u0010[\u001a\u00020Z*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008[\u0010\\J\u0013\u0010_\u001a\u00020^*\u00020]H\u0002\u00a2\u0006\u0004\u0008_\u0010`J\u001b\u0010e\u001a\u00020d*\u00020a2\u0006\u0010c\u001a\u00020bH\u0002\u00a2\u0006\u0004\u0008e\u0010fJ\'\u0010o\u001a\u00020l2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0001\u00a2\u0006\u0004\u0008m\u0010nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010p\u001a\u0004\u0008q\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010r\u001a\u0004\u0008s\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010r\u001a\u0004\u0008t\u00105R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010u\u001a\u0004\u0008v\u00108R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010u\u001a\u0004\u0008w\u00108R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010x\u001a\u0004\u0008y\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010z\u001a\u0004\u0008{\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010|\u001a\u0004\u0008}\u0010?R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010~\u001a\u0004\u0008\u007f\u0010AR%\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0016\u0010\u0080\u0001\u001a\u0005\u0008\u0081\u0001\u0010CR\u0019\u0010\u0018\u001a\u00020\u00178\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0018\u0010\u0082\u0001\u001a\u0005\u0008\u0083\u0001\u0010ER\u0019\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000e\n\u0005\u0008\u001a\u0010\u0084\u0001\u001a\u0005\u0008\u0085\u0001\u0010GR\u0019\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000e\n\u0005\u0008\u001c\u0010\u0086\u0001\u001a\u0005\u0008\u0087\u0001\u0010IR&\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008\u001e\u0010\u0088\u0001\u0012\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u001a\u0005\u0008\u0089\u0001\u0010KR&\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008 \u0010\u008c\u0001\u0012\u0006\u0008\u008e\u0001\u0010\u008b\u0001\u001a\u0005\u0008\u008d\u0001\u0010MR$\u0010\"\u001a\u00020!8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008\"\u0010\u008f\u0001\u0012\u0006\u0008\u0091\u0001\u0010\u008b\u0001\u001a\u0005\u0008\u0090\u0001\u0010OR\u001e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006\u00a2\u0006\r\n\u0004\u0008#\u0010x\u001a\u0005\u0008\u0092\u0001\u0010;R\u0018\u0010$\u001a\u00020!8\u0006\u00a2\u0006\r\n\u0005\u0008$\u0010\u008f\u0001\u001a\u0004\u0008$\u0010OR\u0015\u0010\u0096\u0001\u001a\u00030\u0093\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\u001d8F\u00a2\u0006\u0007\u001a\u0005\u0008\u0097\u0001\u0010VR\u0016\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0008\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0013\u0010\u009d\u0001\u001a\u00020\u001d8F\u00a2\u0006\u0007\u001a\u0005\u0008\u009c\u0001\u0010VR\u0016\u0010\u00a0\u0001\u001a\u0004\u0018\u00010]8F\u00a2\u0006\u0008\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\u0013\u0010\u00a2\u0001\u001a\u00020\u001d8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a1\u0001\u0010VR\u0016\u0010\u00a5\u0001\u001a\u0004\u0018\u00010a8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R\u0013\u0010\u00a7\u0001\u001a\u00020\u001d8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0001\u0010VR\u0013\u0010\u00a9\u0001\u001a\u00020!8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a8\u0001\u0010OR\u0016\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u000c8F\u00a2\u0006\u0008\u001a\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u00a8\u0006\u00b0\u0001"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "",
        "",
        "name",
        "",
        "parentTemplateId",
        "workoutTemplateId",
        "",
        "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
        "groups",
        "originalGroups",
        "",
        "Ljava/util/UUID;",
        "idsOfExpandedExercises",
        "Lorg/joda/time/DateTime;",
        "startTime",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "positionInWorkout",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
        "currentSetState",
        "",
        "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
        "completedSetData",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "strapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "strapLaterality",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
        "analytics",
        "",
        "rpe",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;",
        "currentDialog",
        "",
        "shouldReturnToWorkoutLibrary",
        "manuallyEditedSetIds",
        "isSimpleStrengthLogging",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "completedTime",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;",
        "toCompletedWeightliftingWorkout",
        "(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;",
        "id",
        "getSetPositionById",
        "(Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Long;",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Ljava/util/Set;",
        "component7",
        "()Lorg/joda/time/DateTime;",
        "component8",
        "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "component9",
        "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
        "component10",
        "()Ljava/util/Map;",
        "component11",
        "()Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "component12",
        "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "component13",
        "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
        "component14",
        "()Ljava/lang/Integer;",
        "component15",
        "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;",
        "component16",
        "()Z",
        "component17",
        "component18",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
        "toWeightliftingWorkoutGroup",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;",
        "toWeightliftingWorkoutExercise",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "exercise",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
        "toWeightliftingWorkoutSet",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getName",
        "Ljava/lang/Long;",
        "getParentTemplateId",
        "getWorkoutTemplateId",
        "Ljava/util/List;",
        "getGroups",
        "getOriginalGroups",
        "Ljava/util/Set;",
        "getIdsOfExpandedExercises",
        "Lorg/joda/time/DateTime;",
        "getStartTime",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
        "getPositionInWorkout",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
        "getCurrentSetState",
        "Ljava/util/Map;",
        "getCompletedSetData",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "getStrapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "getStrapLaterality",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
        "getAnalytics",
        "Ljava/lang/Integer;",
        "getRpe",
        "getRpe$annotations",
        "()V",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;",
        "getCurrentDialog",
        "getCurrentDialog$annotations",
        "Z",
        "getShouldReturnToWorkoutLibrary",
        "getShouldReturnToWorkoutLibrary$annotations",
        "getManuallyEditedSetIds",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "getWorkoutTemplate",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "workoutTemplate",
        "getCurrentGroupIndex",
        "currentGroupIndex",
        "getCurrentGroup",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
        "currentGroup",
        "getCurrentExerciseIndex",
        "currentExerciseIndex",
        "getCurrentExercise",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;",
        "currentExercise",
        "getCurrentSetIndex",
        "currentSetIndex",
        "getCurrentSet",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "currentSet",
        "getNumSetsLeft",
        "numSetsLeft",
        "getFinishedFinalSet",
        "finishedFinalSet",
        "getLastCompletedSetId",
        "()Ljava/util/UUID;",
        "lastCompletedSetId",
        "Companion",
        "$serializer",
        "a",
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

.field public static final Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$a;


# instance fields
.field private final analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

.field private final completedSetData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
            ">;"
        }
    .end annotation
.end field

.field private final currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

.field private final currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

.field private final groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final idsOfExpandedExercises:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private final isSimpleStrengthLogging:Z

.field private final manuallyEditedSetIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final originalGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final parentTemplateId:Ljava/lang/Long;

.field private final positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

.field private final rpe:Ljava/lang/Integer;

.field private final shouldReturnToWorkoutLibrary:Z

.field private final startTime:Lorg/joda/time/DateTime;

.field private final strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

.field private final strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

.field private final workoutTemplateId:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lno2/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lno2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lno2/a;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Lno2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lno2/a;

    const/16 v7, 0x11

    invoke-direct {v6, v7}, Lno2/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lno2/a;

    const/16 v8, 0x12

    invoke-direct {v7, v8}, Lno2/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lno2/a;

    const/16 v9, 0x13

    invoke-direct {v8, v9}, Lno2/a;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    new-instance v9, Lno2/a;

    const/16 v10, 0x14

    invoke-direct {v9, v10}, Lno2/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v10, Lno2/a;

    const/16 v11, 0x15

    invoke-direct {v10, v11}, Lno2/a;-><init>(I)V

    invoke-static {v2, v10}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v10

    new-instance v11, Lno2/a;

    const/16 v12, 0x16

    invoke-direct {v11, v12}, Lno2/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v12, Lno2/a;

    const/16 v13, 0x17

    invoke-direct {v12, v13}, Lno2/a;-><init>(I)V

    invoke-static {v2, v12}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v4, v4, [Ll83/h;

    const/4 v12, 0x0

    aput-object v1, v4, v12

    const/4 v12, 0x1

    aput-object v1, v4, v12

    const/4 v12, 0x2

    aput-object v1, v4, v12

    const/4 v12, 0x3

    aput-object v3, v4, v12

    const/4 v3, 0x4

    aput-object v5, v4, v3

    const/4 v3, 0x5

    aput-object v6, v4, v3

    const/4 v3, 0x6

    aput-object v7, v4, v3

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v8, v4, v0

    const/16 v0, 0x9

    aput-object v9, v4, v0

    const/16 v0, 0xa

    aput-object v10, v4, v0

    const/16 v0, 0xb

    aput-object v11, v4, v0

    const/16 v0, 0xc

    aput-object v1, v4, v0

    const/16 v0, 0xd

    aput-object v2, v4, v0

    const/16 v0, 0xe

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p5

    and-int/lit16 v3, v1, 0xfef

    const/16 v4, 0xfef

    if-eq v4, v3, :cond_0

    .line 1
    sget-object v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v3

    invoke-static {v1, v4, v3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v3, p2

    iput-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    move-object/from16 v3, p3

    iput-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    move-object/from16 v3, p4

    iput-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    and-int/lit8 v3, v1, 0x10

    if-nez v3, :cond_1

    :goto_0
    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    move-object/from16 v2, p7

    goto :goto_1

    :cond_1
    move-object/from16 v2, p6

    goto :goto_0

    :goto_1
    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    move-object/from16 v2, p8

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    move-object/from16 v2, p9

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    move-object/from16 v2, p10

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    move-object/from16 v2, p11

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    move-object/from16 v2, p12

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-object/from16 v2, p13

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    and-int/lit16 v2, v1, 0x1000

    if-nez v2, :cond_2

    .line 2
    new-instance v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    const/16 v15, 0x7ff

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v16}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    goto :goto_2

    :cond_2
    move-object/from16 v2, p14

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    iput-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_3

    .line 4
    sget-object v3, Lm83/a0;->w:Lm83/a0;

    .line 5
    :goto_3
    iput-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    goto :goto_4

    :cond_3
    move-object/from16 v3, p15

    goto :goto_3

    :goto_4
    and-int/lit16 v1, v1, 0x4000

    if-nez v1, :cond_4

    iput-boolean v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    return-void

    :cond_4
    move/from16 v1, p16

    iput-boolean v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Lorg/joda/time/DateTime;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
            "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;Z)V"
        }
    .end annotation

    move-object v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object/from16 v3, p9

    move-object/from16 v4, p10

    move-object/from16 v5, p11

    move-object/from16 v6, p12

    move-object/from16 v7, p13

    move-object/from16 v8, p17

    const-string v9, "name"

    invoke-static {p1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "groups"

    invoke-static {p4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "originalGroups"

    invoke-static {p5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "idsOfExpandedExercises"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "startTime"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "currentSetState"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "completedSetData"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "strapLocation"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "strapLaterality"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "analytics"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "manuallyEditedSetIds"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    .line 9
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    .line 10
    iput-object p4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    .line 11
    iput-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    .line 12
    iput-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    .line 13
    iput-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    move-object/from16 p1, p8

    .line 14
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    .line 15
    iput-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    .line 16
    iput-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    .line 17
    iput-object v5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    .line 18
    iput-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    .line 19
    iput-object v7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    move-object/from16 p1, p14

    .line 20
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    move-object/from16 p1, p15

    .line 21
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move/from16 p1, p16

    .line 22
    iput-boolean p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    .line 23
    iput-object v8, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    move/from16 p1, p18

    .line 24
    iput-boolean p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    move-object/from16 v7, p4

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1

    .line 25
    new-instance v8, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    const/16 v20, 0x7ff

    const/16 v21, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v21}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v8

    goto :goto_1

    :cond_1
    move-object/from16 v15, p13

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object/from16 v16, v2

    goto :goto_2

    :cond_2
    move-object/from16 v16, p14

    :goto_2
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_3

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p15

    :goto_3
    const v1, 0x8000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move/from16 v18, v2

    goto :goto_4

    :cond_4
    move/from16 v18, p16

    :goto_4
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_5

    .line 26
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    move-object/from16 v19, v1

    goto :goto_5

    :cond_5
    move-object/from16 v19, p17

    :goto_5
    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_6

    move/from16 v20, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v2, p0

    goto :goto_6

    :cond_6
    move/from16 v20, p18

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    .line 27
    :goto_6
    invoke-direct/range {v2 .. v20}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    sget-object v1, Llu2/c;->a:Llu2/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lorg/joda/time/DateTime;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;->Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Llu2/c;->a:Llu2/c;

    sget-object v2, Lcom/whoop/weightlifting/data/domain/CompletedSetData$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/CompletedSetData$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.weightlifting.data.domain.StrapLocation"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapLocation;->values()[Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$6()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.weightlifting.data.domain.StrapLaterality"

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->values()[Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$7()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    sget-object v1, Llu2/c;->a:Llu2/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$6()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-boolean v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    move-object/from16 p18, p3

    move/from16 p19, v1

    :goto_11
    move/from16 p17, p2

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

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

    goto :goto_12

    :cond_11
    move/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCurrentDialog$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRpe$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShouldReturnToWorkoutLibrary$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic h()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$7()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private final toWeightliftingWorkoutExercise(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getExercise()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->toWeightliftingWorkoutSet(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    invoke-direct {p1, v2, v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V

    return-object p1
.end method

.method private final toWeightliftingWorkoutGroup(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-direct {p0, v1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->toWeightliftingWorkoutExercise(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;

    invoke-direct {p1, v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method private final toWeightliftingWorkoutSet(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;
    .locals 12

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getNumberOfRepsAsInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getTimeAsIntSeconds()Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getWeightAsFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, v2

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getTrackable()Z

    move-result v8

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->getDuring()Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    move-result-object p2

    move-object v9, p2

    goto :goto_3

    :cond_3
    move-object v9, v2

    :goto_3
    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;

    move-result-object p2

    move-object v10, p2

    goto :goto_4

    :cond_4
    move-object v10, v2

    :goto_4
    iget-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    move-result-object v2

    :cond_5
    move-object v11, v2

    new-instance v3, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    invoke-direct/range {v3 .. v11}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)V

    return-object v3
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lzc3/c;Lyc3/g;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->$childSerializers:[Ll83/h;

    const/4 v4, 0x0

    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    invoke-interface {v1, v2, v4, v5}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v4, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    const/4 v6, 0x1

    invoke-interface {v1, v2, v6, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v5, 0x2

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    invoke-interface {v1, v2, v5, v4, v6}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v4, 0x3

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v4, 0x4

    invoke-interface {v1, v2, v4}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    :goto_0
    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v4, 0x5

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v4, 0x6

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout$$serializer;

    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    const/4 v6, 0x7

    invoke-interface {v1, v2, v6, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0x8

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0x9

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0xa

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0xb

    aget-object v5, v3, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0xc

    invoke-interface {v1, v2, v4}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    new-instance v6, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    const/16 v18, 0x7ff

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;-><init>(IIIIIIIZLjava/util/Set;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :goto_1
    sget-object v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics$$serializer;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    invoke-interface {v1, v2, v4, v5, v6}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v4, 0xd

    invoke-interface {v1, v2, v4}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    sget-object v6, Lm83/a0;->w:Lm83/a0;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :goto_2
    aget-object v3, v3, v4

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    invoke-interface {v1, v2, v4, v3, v5}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v3, 0xe

    invoke-interface {v1, v2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    if-eqz v4, :cond_7

    :goto_3
    iget-boolean v0, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    invoke-interface {v1, v2, v3, v0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    return-object v0
.end method

.method public final component11()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final component12()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final component13()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component15()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    return v0
.end method

.method public final component17()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    return-object v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    return v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    return-object v0
.end method

.method public final component7()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    return-object v0
.end method

.method public final component9()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;",
            "Lorg/joda/time/DateTime;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
            "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;Z)",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"
        }
    .end annotation

    const-string v0, "name"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groups"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalGroups"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idsOfExpandedExercises"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTime"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentSetState"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completedSetData"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLocation"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLaterality"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manuallyEditedSetIds"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v9, p8

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    iget-boolean p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    if-eq v1, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    return-object v0
.end method

.method public final getCompletedSetData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/util/UUID;",
            "Lcom/whoop/weightlifting/data/domain/CompletedSetData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    return-object v0
.end method

.method public final getCurrentDialog()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    return-object v0
.end method

.method public final getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentGroup()Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExerciseIndex()I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCurrentExerciseIndex()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentGroup()Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getExerciseId()Ljava/util/UUID;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final getCurrentGroup()Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
    .locals 2

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentGroupIndex()I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    return-object v0
.end method

.method public final getCurrentGroupIndex()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getGroupId()Ljava/util/UUID;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final getCurrentSet()Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentSetIndex()I

    move-result v1

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCurrentSetIndex()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getCurrentExercise()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->getSetId()Ljava/util/UUID;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final getCurrentSetState()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    return-object v0
.end method

.method public final getFinishedFinalSet()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->getNumSetsLeft()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    return-object v0
.end method

.method public final getIdsOfExpandedExercises()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    return-object v0
.end method

.method public final getLastCompletedSetId()Ljava/util/UUID;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_2

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->getDuring()Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v6

    goto :goto_0

    :cond_2
    move-wide v6, v4

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/weightlifting/data/domain/CompletedSetData;

    invoke-virtual {v8}, Lcom/whoop/weightlifting/data/domain/CompletedSetData;->getDuring()Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v8

    goto :goto_1

    :cond_4
    move-wide v8, v4

    :goto_1
    cmp-long v10, v6, v8

    if-gez v10, :cond_5

    move-object v1, v3

    move-wide v6, v8

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    :goto_2
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    return-object v0

    :cond_6
    return-object v2
.end method

.method public final getManuallyEditedSetIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumSetsLeft()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_1

    :cond_0
    add-int/2addr v2, v4

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    sub-int/2addr v2, v0

    return v2
.end method

.method public final getOriginalGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getParentTemplateId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getPositionInWorkout()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    return-object v0
.end method

.method public final getRpe()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSetPositionById(Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getExercises()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getSets()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;->getId()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->getId()Ljava/util/UUID;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;-><init>(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getShouldReturnToWorkoutLibrary()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    return v0
.end method

.method public final getStartTime()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final getWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;
    .locals 8

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final getWorkoutTemplateId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isSimpleStrengthLogging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    return v0
.end method

.method public final toCompletedWeightliftingWorkout(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "completedTime"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lorg/joda/time/base/AbstractInstant;->getZone()Lorg/joda/time/DateTimeZone;

    move-result-object v5

    const-string v1, "getZone(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v1, v3

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v1, v3

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    move-object/from16 v16, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-direct {v0, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->toWeightliftingWorkoutGroup(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    iget-boolean v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    move-object v4, v2

    new-instance v2, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;

    move-object/from16 v17, v3

    const/4 v3, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move/from16 v18, v1

    invoke-direct/range {v2 .. v20}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;-><init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->name:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->parentTemplateId:Ljava/lang/Long;

    iget-object v3, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->workoutTemplateId:Ljava/lang/Long;

    iget-object v4, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->groups:Ljava/util/List;

    iget-object v5, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->originalGroups:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->idsOfExpandedExercises:Ljava/util/Set;

    iget-object v7, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->startTime:Lorg/joda/time/DateTime;

    iget-object v8, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->positionInWorkout:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;

    iget-object v9, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentSetState:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;

    iget-object v10, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->completedSetData:Ljava/util/Map;

    iget-object v11, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v12, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-object v13, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->analytics:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;

    iget-object v14, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->rpe:Ljava/lang/Integer;

    iget-object v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->currentDialog:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->shouldReturnToWorkoutLibrary:Z

    move/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->manuallyEditedSetIds:Ljava/util/Set;

    move-object/from16 v18, v15

    iget-boolean v15, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->isSimpleStrengthLogging:Z

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v19, v15

    const-string v15, "ActiveWorkout(name="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", parentTemplateId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutTemplateId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", groups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", originalGroups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", idsOfExpandedExercises="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", positionInWorkout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentSetState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", completedSetData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strapLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strapLaterality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analytics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rpe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldReturnToWorkoutLibrary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", manuallyEditedSetIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSimpleStrengthLogging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
