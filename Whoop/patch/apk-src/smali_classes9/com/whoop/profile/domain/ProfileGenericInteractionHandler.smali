.class public final Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "Lad3/c;",
        "json",
        "Lcom/whoop/profile/domain/ProfileInteractionResolution;",
        "resolve",
        "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/profile/domain/ProfileInteractionResolution;",
        "profile_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;

    invoke-direct {v0}, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;-><init>()V

    sput-object v0, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;->INSTANCE:Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final resolve(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/profile/domain/ProfileInteractionResolution;
    .locals 1

    const-string v0, "interaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/whoop/design/models/modal/GenericInteractionDecoderKt;->toDecodedGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;

    invoke-direct {p1, v0, p2}, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;

    invoke-direct {p1, v0, p2}, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object p1

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    invoke-direct {v0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;-><init>(Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0

    :cond_3
    new-instance p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$None;

    invoke-direct {p1, p2}, Lcom/whoop/profile/domain/ProfileInteractionResolution$None;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object p1
.end method
