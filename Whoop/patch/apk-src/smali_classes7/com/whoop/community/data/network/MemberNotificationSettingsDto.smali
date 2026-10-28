.class public final Lcom/whoop/community/data/network/MemberNotificationSettingsDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/data/network/MemberNotificationSettingsDto$$serializer;,
        Lcom/whoop/community/data/network/MemberNotificationSettingsDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>?B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBO\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*JP\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010*J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\u001eJ\u001a\u00102\u001a\u00020\u00052\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010\'R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u00089\u0010\'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008;\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008<\u0010*\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/community/data/network/MemberNotificationSettingsDto;",
        "Landroid/os/Parcelable;",
        "",
        "userId",
        "communityId",
        "",
        "deleted",
        "online",
        "",
        "memberType",
        "notificationSetting",
        "<init>",
        "(IIZZLjava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIIZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_release",
        "(Lcom/whoop/community/data/network/MemberNotificationSettingsDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lbq0/d;",
        "toMemberNotificationSettings",
        "()Lbq0/d;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "copy",
        "(IIZZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/community/data/network/MemberNotificationSettingsDto;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getUserId",
        "getCommunityId",
        "Z",
        "getDeleted",
        "getOnline",
        "Ljava/lang/String;",
        "getMemberType",
        "getNotificationSetting",
        "Companion",
        "$serializer",
        "a",
        "community_release"
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/community/data/network/MemberNotificationSettingsDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/community/data/network/MemberNotificationSettingsDto$a;


# instance fields
.field private final communityId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "community_id"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final memberType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "member_type"
    .end annotation
.end field

.field private final notificationSetting:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "notification_setting"
    .end annotation
.end field

.field private final online:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "online"
    .end annotation
.end field

.field private final userId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/data/network/MemberNotificationSettingsDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->Companion:Lcom/whoop/community/data/network/MemberNotificationSettingsDto$a;

    new-instance v0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto$b;

    invoke-direct {v0}, Lcom/whoop/community/data/network/MemberNotificationSettingsDto$b;-><init>()V

    sput-object v0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IIIZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/community/data/network/MemberNotificationSettingsDto$$serializer;->INSTANCE:Lcom/whoop/community/data/network/MemberNotificationSettingsDto$$serializer;

    invoke-virtual {p8}, Lcom/whoop/community/data/network/MemberNotificationSettingsDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    iput p3, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    iput-boolean p4, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    iput-boolean p5, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    iput-object p6, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IIZZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    .line 4
    iput p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    .line 5
    iput-boolean p3, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/community/data/network/MemberNotificationSettingsDto;IIZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/community/data/network/MemberNotificationSettingsDto;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->copy(IIZZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/community/data/network/MemberNotificationSettingsDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_release(Lcom/whoop/community/data/network/MemberNotificationSettingsDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIZZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/community/data/network/MemberNotificationSettingsDto;
    .locals 7

    new-instance v0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;-><init>(IIZZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;

    iget v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    iget v3, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    iget v3, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    iget-boolean v3, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCommunityId()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    return v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    return v0
.end method

.method public final getMemberType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationSetting()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnline()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    return v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final toMemberNotificationSettings()Lbq0/d;
    .locals 7

    new-instance v0, Lbq0/d;

    iget v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    iget v2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    iget-boolean v3, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    iget-boolean v4, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    iget-object v5, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct/range {v0 .. v6}, Lbq0/d;-><init>(IIZZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    iget v1, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    iget-boolean v2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    iget-boolean v3, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    iget-object v4, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    const-string v6, ", communityId="

    const-string v7, ", deleted="

    const-string v8, "MemberNotificationSettingsDto(userId="

    invoke-static {v0, v1, v8, v6, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", online="

    const-string v6, ", memberType="

    invoke-static {v0, v2, v1, v3, v6}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", notificationSetting="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->userId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->communityId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->deleted:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->online:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->memberType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/community/data/network/MemberNotificationSettingsDto;->notificationSetting:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
