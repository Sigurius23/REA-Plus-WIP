.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\r\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;",
        "",
        "visualMediaAttachmentsTabEnabled",
        "",
        "visualMediaAllowMultiple",
        "visualMediaType",
        "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;",
        "fileAttachmentsTabEnabled",
        "cameraAttachmentsTabEnabled",
        "pollAttachmentsTabEnabled",
        "<init>",
        "(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V",
        "getVisualMediaAttachmentsTabEnabled",
        "()Z",
        "getVisualMediaAllowMultiple",
        "getVisualMediaType",
        "()Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;",
        "getFileAttachmentsTabEnabled",
        "getCameraAttachmentsTabEnabled",
        "getPollAttachmentsTabEnabled",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final cameraAttachmentsTabEnabled:Z

.field private final fileAttachmentsTabEnabled:Z

.field private final pollAttachmentsTabEnabled:Z

.field private final visualMediaAllowMultiple:Z

.field private final visualMediaAttachmentsTabEnabled:Z

.field private final visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;


# direct methods
.method public constructor <init>(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V
    .locals 1

    const-string v0, "visualMediaType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->copy(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    return v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    return v0
.end method

.method public final copy(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;
    .locals 8

    const-string v0, "visualMediaType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;-><init>(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCameraAttachmentsTabEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    return v0
.end method

.method public final getFileAttachmentsTabEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    return v0
.end method

.method public final getPollAttachmentsTabEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    return v0
.end method

.method public final getVisualMediaAllowMultiple()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    return v0
.end method

.method public final getVisualMediaAttachmentsTabEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    return v0
.end method

.method public final getVisualMediaType()Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAttachmentsTabEnabled:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaAllowMultiple:Z

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->visualMediaType:Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->fileAttachmentsTabEnabled:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->cameraAttachmentsTabEnabled:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;->pollAttachmentsTabEnabled:Z

    const-string v6, ", visualMediaAllowMultiple="

    const-string v7, ", visualMediaType="

    const-string v8, "AttachmentsPickerSystemConfig(visualMediaAttachmentsTabEnabled="

    invoke-static {v8, v6, v7, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fileAttachmentsTabEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cameraAttachmentsTabEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pollAttachmentsTabEnabled="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
