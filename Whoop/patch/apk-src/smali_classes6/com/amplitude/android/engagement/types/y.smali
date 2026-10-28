.class public final Lcom/amplitude/android/engagement/types/y;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lcom/amplitude/android/engagement/types/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/amplitude/android/engagement/types/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/y;->w:Lcom/amplitude/android/engagement/types/y;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/amplitude/android/engagement/types/FormFactor;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/amplitude/android/engagement/types/BannerFormFactor;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/amplitude/android/engagement/types/PinFormFactor;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    const-class v6, Lcom/amplitude/android/engagement/types/PopoverFormFactor;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const-class v7, Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v7, 0x5

    move-object v8, v3

    new-array v3, v7, [Lj93/d;

    const/4 v9, 0x0

    aput-object v8, v3, v9

    const/4 v8, 0x1

    aput-object v4, v3, v8

    const/4 v4, 0x2

    aput-object v5, v3, v4

    const/4 v5, 0x3

    aput-object v6, v3, v5

    const/4 v6, 0x4

    aput-object v1, v3, v6

    new-array v1, v7, [Lwc3/c;

    sget-object v7, Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/BannerFormFactor$$serializer;

    aput-object v7, v1, v9

    sget-object v7, Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ModalFormFactor$$serializer;

    aput-object v7, v1, v8

    sget-object v7, Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PinFormFactor$$serializer;

    aput-object v7, v1, v4

    sget-object v4, Lcom/amplitude/android/engagement/types/PopoverFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/PopoverFormFactor$$serializer;

    aput-object v4, v1, v5

    sget-object v4, Lcom/amplitude/android/engagement/types/TooltipFormFactor$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TooltipFormFactor$$serializer;

    aput-object v4, v1, v6

    new-array v5, v9, [Ljava/lang/annotation/Annotation;

    move-object v4, v1

    const-string v1, "com.amplitude.android.engagement.types.FormFactor"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
