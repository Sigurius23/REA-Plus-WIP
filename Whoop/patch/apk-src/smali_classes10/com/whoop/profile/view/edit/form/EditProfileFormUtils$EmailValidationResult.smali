.class public final Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EmailValidationResult"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0007H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;",
        "",
        "formState",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "shouldTriggerApiValidation",
        "",
        "emailToValidate",
        "",
        "<init>",
        "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)V",
        "getFormState",
        "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "getShouldTriggerApiValidation",
        "()Z",
        "getEmailToValidate",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
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
.field public static final $stable:I


# instance fields
.field private final emailToValidate:Ljava/lang/String;

.field private final formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

.field private final shouldTriggerApiValidation:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    .line 3
    iput-boolean p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->copy(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;
    .locals 1

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    iget-boolean v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEmailToValidate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    return-object v0
.end method

.method public final getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final getShouldTriggerApiValidation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->shouldTriggerApiValidation:Z

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->emailToValidate:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EmailValidationResult(formState="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldTriggerApiValidation="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", emailToValidate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
