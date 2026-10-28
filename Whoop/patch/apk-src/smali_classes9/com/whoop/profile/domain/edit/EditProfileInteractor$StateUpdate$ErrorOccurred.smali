.class public final Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;
.super Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ErrorOccurred"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u00d6\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;",
        "error",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "<init>",
        "(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V",
        "getError",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;Lcom/whoop/profile/domain/edit/EditProfileDomainState;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->copy(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    return-object v0
.end method

.method public final copy(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    invoke-direct {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;-><init>(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    iget-object p1, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getError()Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ErrorOccurred(error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
