.class public abstract Lk7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 43

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lm7/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_ACTIVE_CALORIES_BURNED"

    const-string v3, "android.permission.health.READ_"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BASAL_BODY_TEMPERATURE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BASAL_METABOLIC_RATE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BLOOD_GLUCOSE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BLOOD_PRESSURE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v8, Ll83/k;

    invoke-direct {v8, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BODY_FAT"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ll83/k;

    invoke-direct {v9, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/h;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BODY_TEMPERATURE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v10, Ll83/k;

    invoke-direct {v10, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BODY_WATER_MASS"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v11, Ll83/k;

    invoke-direct {v11, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_BONE_MASS"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/k;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_CERVICAL_MUCUS"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v13, Ll83/k;

    invoke-direct {v13, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/m;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_EXERCISE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ll83/k;

    invoke-direct {v15, v1, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/n;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v14, "android.permission.health.READ_DISTANCE"

    invoke-static {v14, v3, v14}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v15

    new-instance v15, Ll83/k;

    invoke-direct {v15, v1, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/o;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v14, "android.permission.health.READ_ELEVATION_GAINED"

    invoke-static {v14, v3, v14}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v17, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/w;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v14, Ll83/k;

    invoke-direct {v14, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/x;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_FLOORS_CLIMBED"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/z;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_HEART_RATE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_HEART_RATE_VARIABILITY"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/b0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_HEIGHT"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/d0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_HYDRATION"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v22, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/f0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_INTERMENSTRUAL_BLEEDING"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v23, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/h0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_LEAN_BODY_MASS"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/j0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_MENSTRUATION"

    move-object/from16 v25, v4

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v26, v5

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/k0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/m0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_NUTRITION"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v27, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/n0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_OVULATION_TEST"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/o0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_OXYGEN_SATURATION"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v29, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/q0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_POWER"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v30, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/s0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_RESPIRATORY_RATE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v31, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/t0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_RESTING_HEART_RATE"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v32, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/v0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_SEXUAL_ACTIVITY"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v33, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/x0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_SLEEP"

    move-object/from16 v34, v4

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v35, v5

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/y0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/a1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_SPEED"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v36, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/c1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_STEPS"

    move-object/from16 v37, v4

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v38, v5

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/d1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/e1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_TOTAL_CALORIES_BURNED"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v39, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/f1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_VO2_MAX"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v40, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/g1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v2, "android.permission.health.READ_WEIGHT"

    invoke-static {v2, v3, v2}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v41, v4

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lm7/h1;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v1, "android.permission.health.READ_WHEELCHAIR_PUSHES"

    invoke-static {v1, v3, v1}, Lyb3/r;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v42, v41

    move-object/from16 v41, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v35

    move-object/from16 v35, v36

    move-object/from16 v36, v37

    move-object/from16 v37, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v27

    move-object/from16 v27, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v30

    move-object/from16 v30, v31

    move-object/from16 v31, v32

    move-object/from16 v32, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v38

    move-object/from16 v38, v39

    move-object/from16 v39, v40

    move-object/from16 v40, v42

    move-object/from16 v42, v2

    filled-new-array/range {v4 .. v42}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lk7/b;->a:Ljava/lang/Object;

    return-void
.end method
