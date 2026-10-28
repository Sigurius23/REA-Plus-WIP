.class public final Lcom/whoop/domain/model/teams/CommunityMemberDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;,
        Lcom/whoop/domain/model/teams/CommunityMemberDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rB[\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&JZ\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010!J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001fJ\u001a\u0010-\u001a\u00020\t2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00083\u0010!R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00084\u0010!R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00085\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010&R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00088\u0010&\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/CommunityMemberDto;",
        "",
        "",
        "userId",
        "",
        "name",
        "username",
        "email",
        "avatarUrl",
        "",
        "disabled",
        "canUploadData",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/teams/CommunityMemberDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "toTeamUser",
        "()Lcom/whoop/domain/model/teams/TeamUser;",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Z",
        "component7",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/whoop/domain/model/teams/CommunityMemberDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getUserId",
        "Ljava/lang/String;",
        "getName",
        "getUsername",
        "getEmail",
        "getAvatarUrl",
        "Z",
        "getDisabled",
        "getCanUploadData",
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
.field public static final Companion:Lcom/whoop/domain/model/teams/CommunityMemberDto$Companion;


# instance fields
.field private final avatarUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avatar_url"
    .end annotation
.end field

.field private final canUploadData:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "can_upload_data"
    .end annotation
.end field

.field private final disabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disabled"
    .end annotation
.end field

.field private final email:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "email"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final userId:I
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

    new-instance v0, Lcom/whoop/domain/model/teams/CommunityMemberDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/teams/CommunityMemberDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->Companion:Lcom/whoop/domain/model/teams/CommunityMemberDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x15

    const/16 v0, 0x15

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;->INSTANCE:Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/domain/model/teams/CommunityMemberDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    and-int/lit8 p2, p1, 0x2

    const-string p9, ""

    if-nez p2, :cond_1

    iput-object p9, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    :goto_0
    iput-object p4, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p9, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    :goto_1
    iput-object p6, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    goto :goto_2

    :cond_3
    iput-boolean p7, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-boolean p3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    return-void

    :cond_4
    iput-boolean p8, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    .line 9
    iput-boolean p7, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    .line 10
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move p6, v0

    :cond_2
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_3

    move p8, v0

    :goto_0
    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/domain/model/teams/CommunityMemberDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/CommunityMemberDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Lcom/whoop/domain/model/teams/CommunityMemberDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    :cond_6
    move p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/domain/model/teams/CommunityMemberDto;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/whoop/domain/model/teams/CommunityMemberDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/teams/CommunityMemberDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    if-eqz v1, :cond_5

    :goto_2
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    if-eqz v1, :cond_7

    :goto_3
    iget-boolean p0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/whoop/domain/model/teams/CommunityMemberDto;
    .locals 9

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/teams/CommunityMemberDto;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/domain/model/teams/CommunityMemberDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;

    iget v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    iget v3, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    iget-boolean p1, p1, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanUploadData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    return v0
.end method

.method public final getDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    return v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    return v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    iget-object v1, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->email:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->disabled:Z

    iget-boolean v6, p0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->canUploadData:Z

    const-string v7, ", name="

    const-string v8, ", username="

    const-string v9, "CommunityMemberDto(userId="

    invoke-static {v0, v9, v7, v1, v8}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", email="

    const-string v7, ", avatarUrl="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disabled="

    const-string v2, ", canUploadData="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTeamUser()Lcom/whoop/domain/model/teams/TeamUser;
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Lcom/whoop/domain/model/teams/TeamUser;

    iget v2, v0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->userId:I

    iget-object v3, v0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->avatarUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->name:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/domain/model/teams/CommunityMemberDto;->username:Ljava/lang/String;

    if-nez v5, :cond_0

    const-string v5, ""

    :cond_0
    new-instance v6, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    const/16 v16, 0x1ff

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lcom/whoop/domain/model/teams/TeamPrivacyProfile;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;Lcom/whoop/domain/model/teams/PrivacyType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {v1 .. v6}, Lcom/whoop/domain/model/teams/TeamUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/teams/TeamPrivacyProfile;)V

    return-object v1
.end method
