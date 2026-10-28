.class public final Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UpdateFieldValueResult"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;",
        "",
        "formState",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "shouldValidateState",
        "",
        "<init>",
        "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)V",
        "getFormState",
        "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "getShouldValidateState",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
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
.field private final formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

.field private final shouldValidateState:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)V
    .locals 1

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    .line 3
    iput-boolean p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->copy(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    return v0
.end method

.method public final copy(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;
    .locals 1

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;

    invoke-direct {v0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    iget-boolean p1, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final getShouldValidateState()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->formState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-boolean v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->shouldValidateState:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "UpdateFieldValueResult(formState="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldValidateState="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
