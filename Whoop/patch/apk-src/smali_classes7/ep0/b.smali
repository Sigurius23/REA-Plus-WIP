.class public abstract Lep0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u0010\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lep0/j;",
        "a",
        "Lep0/j;",
        "()Lep0/j;",
        "sampleScreenContextMetadata",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "b",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "getSampleAiContextMetadata",
        "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "sampleAiContextMetadata",
        "Lcom/whoop/navigation/AiAction;",
        "c",
        "Lcom/whoop/navigation/AiAction;",
        "getSampleAiAction",
        "()Lcom/whoop/navigation/AiAction;",
        "sampleAiAction",
        "coach-everywhere-common_release"
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
.field private static final a:Lep0/j;

.field private static final b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

.field private static final c:Lcom/whoop/navigation/AiAction;


# direct methods
.method static constructor <clinit>()V
    .locals 58

    const-string v0, "Test Screen"

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "context"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "value1"

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v4

    new-instance v5, Ll83/k;

    const-string v6, "key1"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v4, "value2"

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v7

    new-instance v8, Ll83/k;

    const-string v9, "key2"

    invoke-direct {v8, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v5, v8}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v27

    sget-object v25, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->COACH_EVERYWHERE_DAY_ZERO:Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    new-instance v10, Lep0/j;

    sget-object v40, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const v34, 0x7c9282

    const/16 v35, 0x0

    const-string v11, "test_screen"

    const/4 v12, 0x0

    const/4 v13, 0x1

    const-string v15, "test_type"

    const-string v16, "source123"

    const-string v17, "seed123"

    const/16 v18, 0x0

    const-string v19, "Entry text"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v22, "Preset question"

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const-string v28, ""

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v14, v40

    invoke-direct/range {v10 .. v35}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lep0/b;->a:Lep0/j;

    new-instance v10, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    new-instance v11, Lcom/whoop/navigation/e;

    sget-object v12, Lcom/whoop/navigation/AppScreen$k1;->w:Lcom/whoop/navigation/AppScreen$k1;

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    new-instance v8, Ll83/k;

    invoke-direct {v8, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v7, v8}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v50

    new-instance v41, Lcom/whoop/navigation/CoachScreenModel;

    const/16 v56, 0x3c18

    const/16 v57, 0x0

    const-string v42, "test_type"

    const-string v43, "Entry text"

    const-string v44, "seed123"

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-string v47, "Preset question"

    const/16 v48, 0x0

    const-string v49, "source123"

    const-string v51, ""

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    invoke-direct/range {v41 .. v57}, Lcom/whoop/navigation/CoachScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v13, v41

    invoke-direct/range {v11 .. v16}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x60

    const/16 v19, 0x0

    move-object v13, v11

    const/4 v11, 0x1

    const-string v15, "test_screen"

    const/16 v17, 0x0

    move-object/from16 v14, v25

    move-object/from16 v12, v40

    invoke-direct/range {v10 .. v19}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;-><init>(ZLjava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lep0/b;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    new-instance v3, Ll83/k;

    invoke-direct {v3, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v44

    new-instance v28, Lcom/whoop/navigation/AiAction;

    const v46, 0x16000

    const/16 v47, 0x0

    const-string v29, ""

    const-string v31, "test_type"

    const-string v32, "source123"

    const/16 v33, 0x0

    const-string v34, "seed123"

    const-string v35, "fp_fallback"

    const-string v36, "Preset question"

    const-string v37, "COACH_EVERYWHERE_DAY_ZERO"

    const/16 v38, 0x0

    const-string v39, "Entry text"

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v28 .. v47}, Lcom/whoop/navigation/AiAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v28, Lep0/b;->c:Lcom/whoop/navigation/AiAction;

    return-void
.end method

.method public static final a()Lep0/j;
    .locals 1

    sget-object v0, Lep0/b;->a:Lep0/j;

    return-object v0
.end method
