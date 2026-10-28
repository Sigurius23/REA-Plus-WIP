.class public final Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/edit/EditProfileViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EmailValidationViewState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J<\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u00d6\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0008H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u0004\u0010\u000cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;",
        "",
        "isValidating",
        "",
        "isValid",
        "validationError",
        "Lcom/whoop/design/util/TextResource;",
        "lastValidatedEmail",
        "",
        "<init>",
        "(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V",
        "()Z",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getValidationError",
        "()Lcom/whoop/design/util/TextResource;",
        "getLastValidatedEmail",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;",
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
.field public static final $stable:I


# instance fields
.field private final isValid:Ljava/lang/Boolean;

.field private final isValidating:Z

.field private final lastValidatedEmail:Ljava/lang/String;

.field private final validationError:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->$stable:I

    return-void
.end method

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

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->copy(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    return v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;
    .locals 1

    new-instance v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getLastValidatedEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final getValidationError()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final isValid()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isValidating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValidating:Z

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->validationError:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->lastValidatedEmail:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "EmailValidationViewState(isValidating="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isValid="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", validationError="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastValidatedEmail="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
