.class public final Lcom/whoop/design/models/modal/Modal$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/modal/Modal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/Modal$Companion;",
        "",
        "<init>",
        "()V",
        "Lwc3/c;",
        "Lcom/whoop/design/models/modal/Modal;",
        "serializer",
        "()Lwc3/c;",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/whoop/design/models/modal/Modal$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/design/models/modal/Modal$Companion;

    invoke-direct {v0}, Lcom/whoop/design/models/modal/Modal$Companion;-><init>()V

    sput-object v0, Lcom/whoop/design/models/modal/Modal$Companion;->$$INSTANCE:Lcom/whoop/design/models/modal/Modal$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/modal/Modal;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/whoop/design/models/modal/BottomSheet;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/whoop/design/models/modal/CoachModal;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/whoop/design/models/modal/DialogModel;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    const-class v6, Lcom/whoop/design/models/modal/FullScreenContentModal;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const-class v7, Lcom/whoop/design/models/modal/ToastModal;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    const-class v8, Lcom/whoop/design/models/modal/UnknownModal;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v8, 0x6

    move-object v9, v3

    new-array v3, v8, [Lj93/d;

    const/4 v10, 0x0

    aput-object v9, v3, v10

    const/4 v9, 0x1

    aput-object v4, v3, v9

    const/4 v4, 0x2

    aput-object v5, v3, v4

    const/4 v5, 0x3

    aput-object v6, v3, v5

    const/4 v6, 0x4

    aput-object v7, v3, v6

    const/4 v7, 0x5

    aput-object v1, v3, v7

    new-instance v1, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v11, Lcom/whoop/design/models/modal/UnknownModal;->INSTANCE:Lcom/whoop/design/models/modal/UnknownModal;

    new-array v12, v10, [Ljava/lang/annotation/Annotation;

    const-string v13, "com.whoop.design.models.modal.UnknownModal"

    invoke-direct {v1, v13, v11, v12}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    new-array v8, v8, [Lwc3/c;

    sget-object v11, Lcom/whoop/design/models/modal/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/BottomSheet$$serializer;

    aput-object v11, v8, v10

    sget-object v11, Lcom/whoop/design/models/modal/CoachModal$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/CoachModal$$serializer;

    aput-object v11, v8, v9

    sget-object v9, Lcom/whoop/design/models/modal/DialogModel$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/DialogModel$$serializer;

    aput-object v9, v8, v4

    sget-object v4, Lcom/whoop/design/models/modal/FullScreenContentModal$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/FullScreenContentModal$$serializer;

    aput-object v4, v8, v5

    sget-object v4, Lcom/whoop/design/models/modal/ToastModal$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/ToastModal$$serializer;

    aput-object v4, v8, v6

    aput-object v1, v8, v7

    new-array v5, v10, [Ljava/lang/annotation/Annotation;

    const-string v1, "com.whoop.design.models.modal.Modal"

    move-object v4, v8

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
