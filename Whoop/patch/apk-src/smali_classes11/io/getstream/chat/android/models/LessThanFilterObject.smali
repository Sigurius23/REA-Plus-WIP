.class public final Lio/getstream/chat/android/models/LessThanFilterObject;
.super Lio/getstream/chat/android/models/FilterObject;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\"\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c0\u0001\u00a2\u0006\u0002\u0008\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/models/LessThanFilterObject;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "fieldName",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Object;)V",
        "getFieldName",
        "()Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/Object;",
        "component1",
        "component2",
        "copy",
        "copy$stream_chat_android_core",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-core"
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
.field private final fieldName:Ljava/lang/String;

.field private final value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/models/FilterObject;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic copy$stream_chat_android_core$default(Lio/getstream/chat/android/models/LessThanFilterObject;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Lio/getstream/chat/android/models/LessThanFilterObject;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/models/LessThanFilterObject;->copy$stream_chat_android_core(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/LessThanFilterObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy$stream_chat_android_core(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/LessThanFilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/LessThanFilterObject;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/models/LessThanFilterObject;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/LessThanFilterObject;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/LessThanFilterObject;

    iget-object v1, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    iget-object p1, p1, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFieldName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->fieldName:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/models/LessThanFilterObject;->value:Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "LessThanFilterObject(fieldName="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
