.class public final Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/edit/EditProfileDomainState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AvatarDomainState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J5\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;",
        "",
        "isUploading",
        "",
        "uploadSuccess",
        "uploadError",
        "",
        "pendingUploadData",
        "",
        "<init>",
        "(ZZLjava/lang/String;[B)V",
        "()Z",
        "getUploadSuccess",
        "getUploadError",
        "()Ljava/lang/String;",
        "getPendingUploadData",
        "()[B",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final isUploading:Z

.field private final pendingUploadData:[B

.field private final uploadError:Ljava/lang/String;

.field private final uploadSuccess:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;-><init>(ZZLjava/lang/String;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    .line 4
    iput-boolean p2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;-><init>(ZZLjava/lang/String;[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;ZZLjava/lang/String;[BILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->copy(ZZLjava/lang/String;[B)Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()[B
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;[B)Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;
    .locals 1

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;-><init>(ZZLjava/lang/String;[B)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    iget-object p1, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPendingUploadData()[B
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    return-object v0
.end method

.method public final getUploadError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    return-object v0
.end method

.method public final getUploadSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final isUploading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading:Z

    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadSuccess:Z

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->uploadError:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->pendingUploadData:[B

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v3

    const-string v4, ", uploadSuccess="

    const-string v5, ", uploadError="

    const-string v6, "AvatarDomainState(isUploading="

    invoke-static {v6, v4, v5, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pendingUploadData="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
