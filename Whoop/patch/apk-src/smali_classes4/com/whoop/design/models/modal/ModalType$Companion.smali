.class public final Lcom/whoop/design/models/modal/ModalType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/modal/ModalType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/ModalType$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/modal/Modal;",
        "modal",
        "Lcom/whoop/design/models/modal/ModalType;",
        "fromModal",
        "(Lcom/whoop/design/models/modal/Modal;)Lcom/whoop/design/models/modal/ModalType;",
        "Ltr2/n;",
        "logger",
        "Ltr2/n;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/design/models/modal/ModalType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromModal(Lcom/whoop/design/models/modal/Modal;)Lcom/whoop/design/models/modal/ModalType;
    .locals 2

    const-string v0, "modal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/design/models/modal/DialogModel;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/design/models/modal/ModalType;->DIALOG:Lcom/whoop/design/models/modal/ModalType;

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/design/models/modal/BottomSheet;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/design/models/modal/ModalType;->BOTTOM_SHEET:Lcom/whoop/design/models/modal/ModalType;

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;

    if-eqz v0, :cond_2

    sget-object p1, Lcom/whoop/design/models/modal/ModalType;->FULLSCREEN:Lcom/whoop/design/models/modal/ModalType;

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/whoop/design/models/modal/CoachModal;

    if-eqz v0, :cond_3

    sget-object p1, Lcom/whoop/design/models/modal/ModalType;->COACH:Lcom/whoop/design/models/modal/ModalType;

    return-object p1

    :cond_3
    instance-of v0, p1, Lcom/whoop/design/models/modal/ToastModal;

    if-eqz v0, :cond_4

    sget-object p1, Lcom/whoop/design/models/modal/ModalType;->TOAST:Lcom/whoop/design/models/modal/ModalType;

    return-object p1

    :cond_4
    invoke-static {}, Lcom/whoop/design/models/modal/ModalType;->access$getLogger$cp()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unknown Modal subtype: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method
