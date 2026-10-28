.class public final Lm7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/g0;


# static fields
.field public static final l:Ljava/lang/Object;

.field public static final m:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Ljava/time/Instant;

.field public final d:Ljava/time/ZoneOffset;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ln7/c;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Lkotlin/jvm/internal/j;


# direct methods
.method static constructor <clinit>()V
    .locals 87

    invoke-static {}, Lvd/e;->t()V

    const/16 v0, 0xd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "back_extension"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "badminton"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0x46

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v4, v3

    new-instance v3, Ll83/k;

    const-string v5, "barbell_shoulder_press"

    invoke-direct {v3, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v6, v4

    new-instance v4, Ll83/k;

    const-string v7, "baseball"

    invoke-direct {v4, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v7, Ll83/k;

    const-string v8, "basketball"

    invoke-direct {v7, v8, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v6

    new-instance v6, Ll83/k;

    const-string v8, "bench_press"

    invoke-direct {v6, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v5

    move-object v5, v7

    new-instance v7, Ll83/k;

    const-string v9, "bench_sit_up"

    invoke-direct {v7, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v9, 0x8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object v10, v8

    new-instance v8, Ll83/k;

    const-string v11, "biking"

    invoke-direct {v8, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v9, 0x9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v11, Ll83/k;

    const-string v12, "biking_stationary"

    invoke-direct {v11, v12, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v9, 0xa

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v13, v10

    new-instance v10, Ll83/k;

    const-string v14, "boot_camp"

    invoke-direct {v10, v14, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v12, 0xb

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move v14, v9

    move-object v9, v11

    new-instance v11, Ll83/k;

    const-string v15, "boxing"

    invoke-direct {v11, v15, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const-string v15, "burpee"

    invoke-direct {v12, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v15, 0xe

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v16, v13

    new-instance v13, Ll83/k;

    const-string v14, "cricket"

    invoke-direct {v13, v14, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    const-string v15, "crunch"

    invoke-direct {v14, v15, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v18, 0x10

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v19, v1

    new-instance v1, Ll83/k;

    move-object/from16 v20, v3

    const-string v3, "dancing"

    invoke-direct {v1, v3, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v15, "deadlift"

    invoke-direct {v3, v15, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v15, Ll83/k;

    move-object/from16 v21, v1

    const-string v1, "dumbbell_curl_left_arm"

    invoke-direct {v15, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v22, v3

    const-string v3, "dumbbell_curl_right_arm"

    invoke-direct {v1, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    move-object/from16 v23, v1

    const-string v1, "dumbbell_front_raise"

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v24, v3

    const-string v3, "dumbbell_lateral_raise"

    invoke-direct {v1, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    move-object/from16 v25, v1

    const-string v1, "dumbbell_triceps_extension_left_arm"

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    move-object/from16 v26, v3

    const-string v3, "dumbbell_triceps_extension_right_arm"

    invoke-direct {v1, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    move-object/from16 v27, v1

    const-string v1, "dumbbell_triceps_extension_two_arm"

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v28, v3

    new-instance v3, Ll83/k;

    move-object/from16 v29, v4

    const-string v4, "elliptical"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v30, v3

    const-string v3, "exercise_class"

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v31, v4

    const-string v4, "fencing"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v32, v3

    const-string v3, "football_american"

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v33, v4

    const-string v4, "football_australian"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v4, "forward_twist"

    invoke-direct {v1, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x1f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v34, v1

    new-instance v1, Ll83/k;

    move-object/from16 v35, v3

    const-string v3, "frisbee_disc"

    invoke-direct {v1, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x20

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v36, v1

    const-string v1, "golf"

    invoke-direct {v4, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v37, v4

    const-string v4, "guided_breathing"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v38, v3

    const-string v3, "gymnastics"

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v39, v4

    const-string v4, "handball"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x25

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v40, v3

    const-string v3, "hiking"

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v41, v4

    const-string v4, "ice_hockey"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v42, v3

    const-string v3, "ice_skating"

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v43, v4

    const-string v4, "jumping_jack"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    move-object/from16 v44, v3

    const-string v3, "jump_rope"

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    move-object/from16 v45, v4

    const-string v4, "lat_pull_down"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    move-object/from16 v46, v3

    const-string v3, "lunge"

    invoke-direct {v4, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x2c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v47, v4

    new-instance v4, Ll83/k;

    move-object/from16 v48, v5

    const-string v5, "martial_arts"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x2e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v49, v4

    const-string v4, "paddling"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x2f

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v50, v5

    const-string v5, "para_gliding"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x30

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v51, v4

    const-string v4, "pilates"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "plank"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x32

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v52, v3

    new-instance v3, Ll83/k;

    move-object/from16 v53, v5

    const-string v5, "racquetball"

    invoke-direct {v3, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x33

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ll83/k;

    move-object/from16 v54, v3

    const-string v3, "rock_climbing"

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x34

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v55, v5

    const-string v5, "roller_hockey"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x35

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v56, v4

    const-string v4, "rowing"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x36

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v57, v5

    const-string v5, "rowing_machine"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x37

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v58, v4

    const-string v4, "rugby"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x38

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v59, v5

    const-string v5, "running"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x39

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v60, v4

    const-string v4, "running_treadmill"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3a

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v61, v5

    const-string v5, "sailing"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3b

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v62, v4

    const-string v4, "scuba_diving"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v63, v5

    const-string v5, "skating"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3d

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v64, v4

    const-string v4, "skiing"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v65, v5

    const-string v5, "snowboarding"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x3f

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v66, v4

    const-string v4, "snowshoeing"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x40

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v67, v5

    const-string v5, "soccer"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x41

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v68, v4

    const-string v4, "softball"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x42

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v69, v5

    const-string v5, "squash"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v5, "squat"

    invoke-direct {v3, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v5, 0x44

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v70, v3

    new-instance v3, Ll83/k;

    move-object/from16 v71, v4

    const-string v4, "stair_climbing"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x45

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ll83/k;

    move-object/from16 v72, v3

    const-string v3, "stair_climbing_machine"

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x47

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v73, v5

    const-string v5, "stretching"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x48

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v74, v4

    const-string v4, "surfing"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x49

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v75, v5

    const-string v5, "swimming_open_water"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x4a

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v76, v4

    const-string v4, "swimming_pool"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x4b

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v77, v5

    const-string v5, "table_tennis"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x4c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v78, v4

    const-string v4, "tennis"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "upper_twist"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x4e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v79, v3

    new-instance v3, Ll83/k;

    move-object/from16 v80, v5

    const-string v5, "volleyball"

    invoke-direct {v3, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v4, 0x4f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ll83/k;

    move-object/from16 v81, v3

    const-string v3, "walking"

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x50

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v82, v5

    const-string v5, "water_polo"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x51

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v83, v4

    const-string v4, "weightlifting"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x52

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v84, v5

    const-string v5, "wheelchair"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    move-object/from16 v85, v4

    const-string v4, "workout"

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x53

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object/from16 v86, v5

    const-string v5, "yoga"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v5, "calisthenics"

    invoke-direct {v3, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    const-string v5, "high_intensity_interval_training"

    invoke-direct {v0, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v5, "strength_training"

    invoke-direct {v1, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v17, v15

    move-object/from16 v2, v16

    move-object/from16 v15, v21

    move-object/from16 v16, v22

    move-object/from16 v18, v23

    move-object/from16 v21, v26

    move-object/from16 v22, v27

    move-object/from16 v23, v28

    move-object/from16 v26, v32

    move-object/from16 v27, v33

    move-object/from16 v28, v35

    move-object/from16 v32, v38

    move-object/from16 v33, v39

    move-object/from16 v35, v41

    move-object/from16 v38, v44

    move-object/from16 v39, v45

    move-object/from16 v41, v47

    move-object/from16 v5, v48

    move-object/from16 v44, v51

    move-object/from16 v45, v53

    move-object/from16 v47, v54

    move-object/from16 v48, v55

    move-object/from16 v51, v58

    move-object/from16 v53, v60

    move-object/from16 v54, v61

    move-object/from16 v55, v62

    move-object/from16 v58, v65

    move-object/from16 v60, v67

    move-object/from16 v61, v68

    move-object/from16 v62, v69

    move-object/from16 v65, v72

    move-object/from16 v67, v74

    move-object/from16 v68, v75

    move-object/from16 v69, v76

    move-object/from16 v72, v80

    move-object/from16 v74, v81

    move-object/from16 v75, v82

    move-object/from16 v76, v83

    move-object/from16 v82, v0

    move-object/from16 v83, v1

    move-object/from16 v81, v3

    move-object/from16 v80, v4

    move-object/from16 v1, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v24

    move-object/from16 v20, v25

    move-object/from16 v4, v29

    move-object/from16 v24, v30

    move-object/from16 v25, v31

    move-object/from16 v29, v34

    move-object/from16 v30, v36

    move-object/from16 v31, v37

    move-object/from16 v34, v40

    move-object/from16 v36, v42

    move-object/from16 v37, v43

    move-object/from16 v40, v46

    move-object/from16 v42, v49

    move-object/from16 v43, v50

    move-object/from16 v46, v52

    move-object/from16 v49, v56

    move-object/from16 v50, v57

    move-object/from16 v52, v59

    move-object/from16 v56, v63

    move-object/from16 v57, v64

    move-object/from16 v59, v66

    move-object/from16 v64, v70

    move-object/from16 v63, v71

    move-object/from16 v66, v73

    move-object/from16 v70, v77

    move-object/from16 v71, v78

    move-object/from16 v73, v79

    move-object/from16 v77, v84

    move-object/from16 v78, v85

    move-object/from16 v79, v86

    const/16 v0, 0xa

    filled-new-array/range {v1 .. v83}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lm7/w;->l:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v15

    const/16 v0, 0x10

    if-ge v15, v0, :cond_0

    move v15, v0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, v15}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sput-object v0, Lm7/w;->m:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;ILjava/lang/String;Ljava/lang/String;Ln7/c;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/w;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/w;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/w;->c:Ljava/time/Instant;

    iput-object p4, p0, Lm7/w;->d:Ljava/time/ZoneOffset;

    iput p5, p0, Lm7/w;->e:I

    iput-object p6, p0, Lm7/w;->f:Ljava/lang/String;

    iput-object p7, p0, Lm7/w;->g:Ljava/lang/String;

    iput-object p8, p0, Lm7/w;->h:Ln7/c;

    iput-object p9, p0, Lm7/w;->i:Ljava/util/List;

    iput-object p10, p0, Lm7/w;->j:Ljava/util/List;

    iput-object p11, p0, Lm7/w;->k:Lkotlin/jvm/internal/j;

    invoke-virtual {p1, p3}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_d

    move-object p1, p9

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_5

    check-cast p9, Ljava/lang/Iterable;

    new-instance p1, Lm3/g;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Lm3/g;-><init>(I)V

    invoke-static {p9, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p3

    move p4, p2

    :goto_0
    if-ge p4, p3, :cond_1

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lm7/v;

    invoke-virtual {p5}, Lm7/v;->a()Ljava/time/Instant;

    move-result-object p5

    add-int/lit8 p4, p4, 0x1

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lm7/v;

    invoke-virtual {p6}, Lm7/v;->b()Ljava/time/Instant;

    move-result-object p6

    invoke-virtual {p5, p6}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p5

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "segments can not overlap."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm7/v;

    invoke-virtual {p3}, Lm7/v;->b()Ljava/time/Instant;

    move-result-object p3

    iget-object p4, p0, Lm7/w;->a:Ljava/time/Instant;

    invoke-virtual {p3, p4}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p3

    const-string p4, "segments can not be out of parent time range."

    if-nez p3, :cond_4

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm7/v;

    invoke-virtual {p3}, Lm7/v;->a()Ljava/time/Instant;

    move-result-object p3

    iget-object p5, p0, Lm7/w;->c:Ljava/time/Instant;

    invoke-virtual {p3, p5}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p3

    if-nez p3, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lm7/v;

    iget p4, p0, Lm7/w;->e:I

    invoke-virtual {p3, p4}, Lm7/v;->c(I)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "segmentType and sessionType is not compatible."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p1, p0, Lm7/w;->j:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lm7/w;->j:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Lm3/g;

    const/4 p4, 0x2

    invoke-direct {p3, p4}, Lm3/g;-><init>(I)V

    invoke-static {p1, p3}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p3

    :goto_2
    if-ge p2, p3, :cond_7

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lm7/p;

    invoke-virtual {p4}, Lm7/p;->a()Ljava/time/Instant;

    move-result-object p4

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lm7/p;

    invoke-virtual {p5}, Lm7/p;->b()Ljava/time/Instant;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p4

    if-nez p4, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "laps can not overlap."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lm7/p;

    invoke-virtual {p2}, Lm7/p;->b()Ljava/time/Instant;

    move-result-object p2

    iget-object p3, p0, Lm7/w;->a:Ljava/time/Instant;

    invoke-virtual {p2, p3}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p2

    const-string p3, "laps can not be out of parent time range."

    if-nez p2, :cond_9

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm7/p;

    invoke-virtual {p1}, Lm7/p;->a()Ljava/time/Instant;

    move-result-object p1

    iget-object p2, p0, Lm7/w;->c:Ljava/time/Instant;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_3
    iget-object p1, p0, Lm7/w;->k:Lkotlin/jvm/internal/j;

    instance-of p2, p1, Lm7/t;

    if-eqz p2, :cond_c

    check-cast p1, Lm7/t;

    invoke-virtual {p1}, Lm7/t;->W()Lm7/r;

    move-result-object p1

    iget-object p2, p0, Lm7/w;->a:Ljava/time/Instant;

    iget-object p3, p0, Lm7/w;->c:Ljava/time/Instant;

    invoke-virtual {p1, p2, p3}, Lm7/r;->a(Ljava/time/Instant;Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_4

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "route can not be out of parent time range."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_4
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startTime must be before endTime."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/w;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/w;->h:Ln7/c;

    return-object v0
.end method

.method public final e()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/w;->c:Ljava/time/Instant;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/w;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/w;

    iget v1, p1, Lm7/w;->e:I

    iget v3, p0, Lm7/w;->e:I

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/w;->f:Ljava/lang/String;

    iget-object v3, p1, Lm7/w;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/w;->g:Ljava/lang/String;

    iget-object v3, p1, Lm7/w;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/w;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/w;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm7/w;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/w;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm7/w;->c:Ljava/time/Instant;

    iget-object v3, p1, Lm7/w;->c:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lm7/w;->d:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/w;->d:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lm7/w;->h:Ln7/c;

    iget-object v3, p1, Lm7/w;->h:Ln7/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lm7/w;->i:Ljava/util/List;

    iget-object v3, p1, Lm7/w;->i:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lm7/w;->j:Ljava/util/List;

    iget-object v3, p1, Lm7/w;->j:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lm7/w;->k:Lkotlin/jvm/internal/j;

    iget-object p1, p1, Lm7/w;->k:Lkotlin/jvm/internal/j;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final f()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/w;->d:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final getStartTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/w;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, Lm7/w;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lm7/w;->f:Ljava/lang/String;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lm7/w;->g:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lm7/w;->b:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lm7/w;->c:Ljava/time/Instant;

    invoke-static {v3, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v3, p0, Lm7/w;->d:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/w;->h:Ln7/c;

    invoke-virtual {v2}, Ln7/c;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lm7/w;->k:Lkotlin/jvm/internal/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
