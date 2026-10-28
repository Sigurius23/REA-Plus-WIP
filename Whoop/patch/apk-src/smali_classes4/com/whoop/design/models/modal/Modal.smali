.class public interface abstract Lcom/whoop/design/models/modal/Modal;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/modal/Modal$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0006\u0003\u0004\u0005\u0006\u0007\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/Modal;",
        "",
        "Companion",
        "Lcom/whoop/design/models/modal/BottomSheet;",
        "Lcom/whoop/design/models/modal/CoachModal;",
        "Lcom/whoop/design/models/modal/DialogModel;",
        "Lcom/whoop/design/models/modal/FullScreenContentModal;",
        "Lcom/whoop/design/models/modal/ToastModal;",
        "Lcom/whoop/design/models/modal/UnknownModal;",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/design/models/modal/Modal$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/Modal$Companion;->$$INSTANCE:Lcom/whoop/design/models/modal/Modal$Companion;

    sput-object v0, Lcom/whoop/design/models/modal/Modal;->Companion:Lcom/whoop/design/models/modal/Modal$Companion;

    return-void
.end method
