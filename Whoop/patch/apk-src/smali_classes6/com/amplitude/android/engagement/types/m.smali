.class public final Lcom/amplitude/android/engagement/types/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lcom/amplitude/android/engagement/types/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/amplitude/android/engagement/types/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/m;->w:Lcom/amplitude/android/engagement/types/m;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/amplitude/android/engagement/types/ContentBlock;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/amplitude/android/engagement/types/ButtonBlock;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/amplitude/android/engagement/types/ImageBlock;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/amplitude/android/engagement/types/MarkdownBlock;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    const-class v6, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const-class v7, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    const-class v8, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const-class v9, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const-class v10, Lcom/amplitude/android/engagement/types/VideoBlock;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/16 v10, 0x8

    move-object v11, v3

    new-array v3, v10, [Lj93/d;

    const/4 v12, 0x0

    aput-object v11, v3, v12

    const/4 v11, 0x1

    aput-object v4, v3, v11

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

    aput-object v1, v3, v9

    new-array v1, v10, [Lwc3/c;

    sget-object v10, Lcom/amplitude/android/engagement/types/ButtonBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ButtonBlock$$serializer;

    aput-object v10, v1, v12

    sget-object v10, Lcom/amplitude/android/engagement/types/ImageBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ImageBlock$$serializer;

    aput-object v10, v1, v11

    sget-object v10, Lcom/amplitude/android/engagement/types/MarkdownBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/MarkdownBlock$$serializer;

    aput-object v10, v1, v4

    sget-object v4, Lcom/amplitude/android/engagement/types/SurveyListBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SurveyListBlock$$serializer;

    aput-object v4, v1, v5

    sget-object v4, Lcom/amplitude/android/engagement/types/SurveyRatingBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SurveyRatingBlock$$serializer;

    aput-object v4, v1, v6

    sget-object v4, Lcom/amplitude/android/engagement/types/SurveyTextBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SurveyTextBlock$$serializer;

    aput-object v4, v1, v7

    sget-object v4, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SurveyTextShortBlock$$serializer;

    aput-object v4, v1, v8

    sget-object v4, Lcom/amplitude/android/engagement/types/VideoBlock$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/VideoBlock$$serializer;

    aput-object v4, v1, v9

    new-array v5, v12, [Ljava/lang/annotation/Annotation;

    move-object v4, v1

    const-string v1, "com.amplitude.android.engagement.types.ContentBlock"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
