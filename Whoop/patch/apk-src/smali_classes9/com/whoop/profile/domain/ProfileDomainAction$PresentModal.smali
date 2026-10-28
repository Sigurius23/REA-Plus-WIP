.class public final Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;
.super Lcom/whoop/profile/domain/ProfileDomainAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/ProfileDomainAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PresentModal"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;",
        "Lcom/whoop/profile/domain/ProfileDomainAction;",
        "modal",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "<init>",
        "(Lcom/whoop/design/models/modal/AnyModal;)V",
        "getModal",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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


# instance fields
.field private final modal:Lcom/whoop/design/models/modal/AnyModal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    sput v0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/modal/AnyModal;)V
    .locals 1

    const-string v0, "modal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/profile/domain/ProfileDomainAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;Lcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->copy(Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;
    .locals 1

    const-string v0, "modal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object p1, p1, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileDomainAction$PresentModal;->modal:Lcom/whoop/design/models/modal/AnyModal;

    const-string v1, "PresentModal(modal="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Ljh3/c;->f(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
