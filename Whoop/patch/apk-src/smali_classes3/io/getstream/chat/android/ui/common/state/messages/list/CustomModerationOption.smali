.class public final Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;
.super Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageOption;",
        "text",
        "",
        "extraData",
        "",
        "",
        "",
        "<init>",
        "(ILjava/util/Map;)V",
        "getText",
        "()I",
        "getExtraData",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final text:I


# direct methods
.method public constructor <init>(ILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;-><init>(ILjava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;ILjava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->copy(ILjava/util/Map;)Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    return v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(ILjava/util/Map;)Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;-><init>(ILjava/util/Map;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;

    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getText()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->text:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/list/CustomModerationOption;->extraData:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CustomModerationOption(text="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", extraData="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
