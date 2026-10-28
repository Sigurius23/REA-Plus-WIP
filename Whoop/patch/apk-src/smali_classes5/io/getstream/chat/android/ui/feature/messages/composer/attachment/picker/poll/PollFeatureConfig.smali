.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\tJ\u001a\u0010\u001b\u001a\u00020\u00022\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;",
        "Landroid/os/Parcelable;",
        "",
        "configurable",
        "defaultValue",
        "<init>",
        "(ZZ)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Z",
        "component2",
        "copy",
        "(ZZ)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getConfigurable",
        "getDefaultValue",
        "Companion",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig$Companion;

.field private static final Default:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

.field private static final NotConfigurable:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;


# instance fields
.field private final configurable:Z

.field private final defaultValue:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig$Companion;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig$Creator;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;-><init>(ZZ)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->Default:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-direct {v0, v2, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;-><init>(ZZ)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->NotConfigurable:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->Default:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    return-object v0
.end method

.method public static final synthetic access$getNotConfigurable$cp()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->NotConfigurable:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    return-object v0
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;ZZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;-><init>(ZZ)V

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    return v0
.end method

.method public final copy(ZZ)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;-><init>(ZZ)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getConfigurable()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    return v0
.end method

.method public final getDefaultValue()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    const-string v2, ", defaultValue="

    const-string v3, ")"

    const-string v4, "PollFeatureConfig(configurable="

    invoke-static {v4, v2, v3, v0, v1}, Lr;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->configurable:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollFeatureConfig;->defaultValue:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
