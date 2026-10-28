.class public final Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0007\u0018\u0000 12\u00020\u0001:\u000221BW\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rBk\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0002\u00a2\u0006\u0004\u0008#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010%\u001a\u0004\u0008&\u0010\'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010(\u001a\u0004\u0008)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010(\u001a\u0004\u0008+\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010(\u001a\u0004\u0008,\u0010*R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010(\u001a\u0004\u0008-\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010(\u001a\u0004\u0008.\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010(\u001a\u0004\u0008/\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010(\u001a\u0004\u00080\u0010*\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;",
        "Landroid/os/Parcelable;",
        "",
        "userId",
        "",
        "firstName",
        "lastName",
        "name",
        "username",
        "avatarUrl",
        "createdAt",
        "updatedAt",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/local/room/entity/AmaHost;",
        "toAmaHost",
        "()Lcom/whoop/data/local/room/entity/AmaHost;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Ljava/lang/Integer;",
        "getUserId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/String;",
        "getFirstName",
        "()Ljava/lang/String;",
        "getLastName",
        "getName",
        "getUsername",
        "getAvatarUrl",
        "getCreatedAt",
        "getUpdatedAt",
        "Companion",
        "$serializer",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Companion;


# instance fields
.field private final avatarUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avatar_url"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final firstName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "first_name"
    .end annotation
.end field

.field private final lastName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_name"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final userId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private final username:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "username"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->Companion:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Companion;

    new-instance v0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Creator;

    invoke-direct {v0}, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$Creator;-><init>()V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->userId:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->firstName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->lastName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->name:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->username:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->avatarUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->createdAt:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->userId:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->firstName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->lastName:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->name:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->username:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->avatarUrl:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->createdAt:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->userId:Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->firstName:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->lastName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->username:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->avatarUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final toAmaHost()Lcom/whoop/data/local/room/entity/AmaHost;
    .locals 11

    new-instance v0, Lcom/whoop/data/local/room/entity/AmaHost;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->userId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->firstName:Ljava/lang/String;

    const-string v3, ""

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->lastName:Ljava/lang/String;

    if-nez v4, :cond_2

    move-object v4, v3

    :cond_2
    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->name:Ljava/lang/String;

    if-nez v5, :cond_3

    move-object v5, v3

    :cond_3
    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->username:Ljava/lang/String;

    if-nez v6, :cond_4

    move-object v6, v3

    :cond_4
    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->avatarUrl:Ljava/lang/String;

    if-nez v7, :cond_5

    move-object v7, v3

    :cond_5
    iget-object v8, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->createdAt:Ljava/lang/String;

    if-nez v8, :cond_6

    move-object v8, v3

    :cond_6
    iget-object v9, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->updatedAt:Ljava/lang/String;

    if-nez v9, :cond_7

    move-object v10, v8

    move-object v8, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v10

    goto :goto_1

    :cond_7
    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    :goto_1
    invoke-direct/range {v0 .. v8}, Lcom/whoop/data/local/room/entity/AmaHost;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->userId:Ljava/lang/Integer;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->firstName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->lastName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->username:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->avatarUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->createdAt:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/community/memberstories/AmaHostDto;->updatedAt:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
