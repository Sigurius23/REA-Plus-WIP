.class public final Lcom/amplitude/android/engagement/types/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lcom/amplitude/android/engagement/types/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/amplitude/android/engagement/types/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/a;->w:Lcom/amplitude/android/engagement/types/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/amplitude/android/engagement/types/Action;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/amplitude/android/engagement/types/AppReviewAction;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/amplitude/android/engagement/types/CallbackAction;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/amplitude/android/engagement/types/ClickAction;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    const-class v6, Lcom/amplitude/android/engagement/types/CompleteAction;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const-class v7, Lcom/amplitude/android/engagement/types/DismissAction;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    const-class v8, Lcom/amplitude/android/engagement/types/GoToNudgeStepAction;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const-class v9, Lcom/amplitude/android/engagement/types/LinkAction;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const-class v10, Lcom/amplitude/android/engagement/types/NoAction;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const-class v11, Lcom/amplitude/android/engagement/types/NudgeAction;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const-class v12, Lcom/amplitude/android/engagement/types/SnoozeAction;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    const-class v13, Lcom/amplitude/android/engagement/types/StepBackAction;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    const-class v14, Lcom/amplitude/android/engagement/types/StepForwardAction;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    const-class v15, Lcom/amplitude/android/engagement/types/UseConditionalLogicAction;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/16 v15, 0xd

    move-object/from16 v16, v3

    new-array v3, v15, [Lj93/d;

    const/4 v15, 0x0

    aput-object v16, v3, v15

    const/16 v16, 0x1

    aput-object v4, v3, v16

    const/4 v4, 0x2

    aput-object v5, v3, v4

    const/4 v5, 0x3

    aput-object v6, v3, v5

    const/4 v6, 0x4

    aput-object v7, v3, v6

    const/4 v7, 0x5

    aput-object v8, v3, v7

    const/4 v8, 0x6

    aput-object v9, v3, v8

    const/4 v9, 0x7

    aput-object v10, v3, v9

    const/16 v10, 0x8

    aput-object v11, v3, v10

    const/16 v11, 0x9

    aput-object v12, v3, v11

    const/16 v12, 0xa

    aput-object v13, v3, v12

    const/16 v13, 0xb

    aput-object v14, v3, v13

    const/16 v14, 0xc

    aput-object v1, v3, v14

    const/16 v1, 0xd

    new-array v1, v1, [Lwc3/c;

    sget-object v17, Lcom/amplitude/android/engagement/types/AppReviewAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/AppReviewAction$$serializer;

    aput-object v17, v1, v15

    sget-object v17, Lcom/amplitude/android/engagement/types/CallbackAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/CallbackAction$$serializer;

    aput-object v17, v1, v16

    sget-object v16, Lcom/amplitude/android/engagement/types/ClickAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ClickAction$$serializer;

    aput-object v16, v1, v4

    sget-object v4, Lcom/amplitude/android/engagement/types/CompleteAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/CompleteAction$$serializer;

    aput-object v4, v1, v5

    sget-object v4, Lcom/amplitude/android/engagement/types/DismissAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/DismissAction$$serializer;

    aput-object v4, v1, v6

    sget-object v4, Lcom/amplitude/android/engagement/types/GoToNudgeStepAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/GoToNudgeStepAction$$serializer;

    aput-object v4, v1, v7

    sget-object v4, Lcom/amplitude/android/engagement/types/LinkAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/LinkAction$$serializer;

    aput-object v4, v1, v8

    sget-object v4, Lcom/amplitude/android/engagement/types/NoAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NoAction$$serializer;

    aput-object v4, v1, v9

    sget-object v4, Lcom/amplitude/android/engagement/types/NudgeAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeAction$$serializer;

    aput-object v4, v1, v10

    sget-object v4, Lcom/amplitude/android/engagement/types/SnoozeAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SnoozeAction$$serializer;

    aput-object v4, v1, v11

    sget-object v4, Lcom/amplitude/android/engagement/types/StepBackAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/StepBackAction$$serializer;

    aput-object v4, v1, v12

    sget-object v4, Lcom/amplitude/android/engagement/types/StepForwardAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/StepForwardAction$$serializer;

    aput-object v4, v1, v13

    sget-object v4, Lcom/amplitude/android/engagement/types/UseConditionalLogicAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/UseConditionalLogicAction$$serializer;

    aput-object v4, v1, v14

    new-array v5, v15, [Ljava/lang/annotation/Annotation;

    move-object v4, v1

    const-string v1, "com.amplitude.android.engagement.types.Action"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
