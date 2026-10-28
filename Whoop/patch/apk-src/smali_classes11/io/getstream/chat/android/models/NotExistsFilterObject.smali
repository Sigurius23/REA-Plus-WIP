.class public final Lio/getstream/chat/android/models/NotExistsFilterObject;
.super Lio/getstream/chat/android/models/FilterObject;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0018\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c0\u0001\u00a2\u0006\u0002\u0008\nJ\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/models/NotExistsFilterObject;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "fieldName",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getFieldName",
        "()Ljava/lang/String;",
        "component1",
        "copy",
        "copy$stream_chat_android_core",
        "equals",
        "",
        "other",
        "",
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


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/models/FilterObject;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$stream_chat_android_core$default(Lio/getstream/chat/android/models/NotExistsFilterObject;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/NotExistsFilterObject;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/models/NotExistsFilterObject;->copy$stream_chat_android_core(Ljava/lang/String;)Lio/getstream/chat/android/models/NotExistsFilterObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy$stream_chat_android_core(Ljava/lang/String;)Lio/getstream/chat/android/models/NotExistsFilterObject;
    .locals 1

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/NotExistsFilterObject;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/models/NotExistsFilterObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/NotExistsFilterObject;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/NotExistsFilterObject;

    iget-object v1, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getFieldName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/NotExistsFilterObject;->fieldName:Ljava/lang/String;

    const-string v1, "NotExistsFilterObject(fieldName="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
