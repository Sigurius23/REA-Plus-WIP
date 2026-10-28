.class public abstract Lwv2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "miniArchModelReducer",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwo1/e0;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lwo1/e0;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lwv2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;)Luu2/h0;
    .locals 0

    invoke-static {p0}, Lwv2/a;->h(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;)Luu2/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwv2/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;)Lov2/e;
    .locals 0

    invoke-static {p0}, Lwv2/a;->i(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;)Lov2/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwv2/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lwv2/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwo1/e0;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lwo1/e0;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwo1/e0;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lwo1/e0;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lwv2/a$a;

    invoke-direct {v3, v0}, Lwv2/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, Lff1/a;->b(Llb1/z0;)V

    invoke-static {p0}, Lr32/a;->b(Llb1/z0;)V

    new-instance v0, Lwo1/e0;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lwo1/e0;-><init>(I)V

    const-class v2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lwv2/a$b;

    invoke-direct {v2, v0}, Lwv2/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;)Luu2/h0;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getExerciseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getEquipmentBody()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    const/4 v0, 0x0

    if-eqz v7, :cond_0

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v6, v0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getVideoUrl()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lgu2/a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getInstructions()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v9, Ly81/f;->WHITE_70:Ly81/f;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->a()Lb91/a;

    move-result-object v10

    invoke-direct {v8, v2, v9, v10}, Lgu2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V

    new-instance v2, Lgu2/a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getEquipmentTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->a()Lb91/a;

    move-result-object v12

    invoke-direct {v2, v10, v11, v12}, Lgu2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V

    new-instance v10, Lgu2/a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getEquipmentBody()Ljava/lang/String;

    move-result-object v12

    const-string v13, ""

    if-nez v12, :cond_1

    move-object v12, v13

    :cond_1
    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->a()Lb91/a;

    move-result-object v14

    invoke-direct {v10, v12, v9, v14}, Lgu2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V

    new-instance v12, Lgu2/a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getMuscleGroupsTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->a()Lb91/a;

    move-result-object v15

    invoke-direct {v12, v14, v11, v15}, Lgu2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V

    move-object v14, v12

    new-instance v12, Lgu2/a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getMuscleGroupsBody()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_2

    goto :goto_1

    :cond_2
    move-object v13, v15

    :goto_1
    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->a()Lb91/a;

    move-result-object v15

    invoke-direct {v12, v13, v9, v15}, Lgu2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getCustomExerciseInfo()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;->getLinkedExercise()Lcom/whoop/weightlifting/data/domain/LinkedExercise;

    move-result-object v9

    if-eqz v9, :cond_3

    new-instance v9, Lgu2/a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getCustomExerciseInfo()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;->getCustomExerciseTitle()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->a()Lb91/a;

    move-result-object v15

    invoke-direct {v9, v13, v11, v15}, Lgu2/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V

    move-object v13, v9

    goto :goto_2

    :cond_3
    move-object v13, v0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getCustomExerciseInfo()Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsCustomExerciseInfo;->getLinkedExercise()Lcom/whoop/weightlifting/data/domain/LinkedExercise;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/LinkedExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/LinkedExercise;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    :goto_3
    move-object/from16 v17, v0

    goto :goto_5

    :cond_5
    :goto_4
    sget v0, Lcu2/h;->i1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    goto :goto_3

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/LinkedExercise;->getImageUrl()Ljava/lang/String;

    move-result-object v18

    new-instance v15, Lo11/m$c$a;

    const/16 v24, 0x48

    const/16 v25, 0x0

    const/16 v19, 0x0

    sget-object v20, Ll83/a0;->a:Ll83/a0;

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v21, v20

    invoke-direct/range {v15 .. v25}, Lo11/m$c$a;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v15

    :cond_6
    new-instance v1, Luu2/h0;

    move-object v9, v2

    const/4 v2, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    move-object v11, v14

    move-object v14, v0

    invoke-direct/range {v1 .. v16}, Luu2/h0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lgu2/a;Lgu2/a;Lgu2/a;Lgu2/a;Lgu2/a;Lgu2/a;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final i(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;)Lov2/e;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lov2/e;

    new-instance v1, Lnv2/c;

    new-instance v2, Lnv2/c$a;

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lnv2/c$a;-><init>(Le31/c;Lnv2/a;Lnv2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lnv2/c;-><init>(Lnv2/c$a;Lnv2/c$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;->resolvedPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;->resolvedExpansionAnalyticsAction()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lov2/e;-><init>(Lnv2/c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
