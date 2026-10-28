.class public final Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$$serializer;,
        Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BCBC\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBM\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JL\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010)\u001a\u00020(H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00105\u0012\u0004\u00087\u00104\u001a\u0004\u00086\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008:\u00104\u001a\u0004\u00089\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010;\u0012\u0004\u0008=\u00104\u001a\u0004\u0008<\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010>\u0012\u0004\u0008@\u00104\u001a\u0004\u0008?\u0010%\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;",
        "",
        "Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;",
        "accountBootstrapDto",
        "Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;",
        "userInfoBootstrapDto",
        "Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;",
        "userProfileBootstrapDto",
        "Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;",
        "membershipBootstrapDto",
        "Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;",
        "userBioDataBootstrapDto",
        "<init>",
        "(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;",
        "component2",
        "()Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;",
        "component3",
        "()Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;",
        "component4",
        "()Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;",
        "component5",
        "()Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;",
        "copy",
        "(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;",
        "getAccountBootstrapDto",
        "getAccountBootstrapDto$annotations",
        "()V",
        "Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;",
        "getUserInfoBootstrapDto",
        "getUserInfoBootstrapDto$annotations",
        "Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;",
        "getUserProfileBootstrapDto",
        "getUserProfileBootstrapDto$annotations",
        "Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;",
        "getMembershipBootstrapDto",
        "getMembershipBootstrapDto$annotations",
        "Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;",
        "getUserBioDataBootstrapDto",
        "getUserBioDataBootstrapDto$annotations",
        "Companion",
        "$serializer",
        "a",
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
.field public static final Companion:Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$a;


# instance fields
.field private final accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "account"
    .end annotation
.end field

.field private final membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "membership"
    .end annotation
.end field

.field private final userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bio_data"
    .end annotation
.end field

.field private final userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user"
    .end annotation
.end field

.field private final userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "profile"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->Companion:Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;-><init>(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    .line 5
    iput-object p2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    .line 6
    iput-object p3, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    .line 7
    iput-object p4, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    .line 8
    iput-object p5, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;-><init>(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;ILjava/lang/Object;)Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->copy(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAccountBootstrapDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "account"
    .end annotation

    return-void
.end method

.method public static synthetic getMembershipBootstrapDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "membership"
    .end annotation

    return-void
.end method

.method public static synthetic getUserBioDataBootstrapDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bio_data"
    .end annotation

    return-void
.end method

.method public static synthetic getUserInfoBootstrapDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "user"
    .end annotation

    return-void
.end method

.method public static synthetic getUserProfileBootstrapDto$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "profile"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$$serializer;->INSTANCE:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$$serializer;

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto$$serializer;->INSTANCE:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto$$serializer;

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto$$serializer;->INSTANCE:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto$$serializer;

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto$$serializer;->INSTANCE:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto$$serializer;

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$$serializer;->INSTANCE:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$$serializer;

    iget-object p0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    return-object v0
.end method

.method public final component2()Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    return-object v0
.end method

.method public final component3()Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    return-object v0
.end method

.method public final component4()Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    return-object v0
.end method

.method public final component5()Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    return-object v0
.end method

.method public final copy(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;
    .locals 6

    new-instance v0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;-><init>(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    iget-object p1, p1, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccountBootstrapDto()Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    return-object v0
.end method

.method public final getMembershipBootstrapDto()Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    return-object v0
.end method

.method public final getUserBioDataBootstrapDto()Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    return-object v0
.end method

.method public final getUserInfoBootstrapDto()Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    return-object v0
.end method

.method public final getUserProfileBootstrapDto()Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->accountBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userInfoBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserInfoBootstrapDto;

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userProfileBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserProfileBootstrapDto;

    iget-object v3, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->membershipBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;

    iget-object v4, p0, Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;->userBioDataBootstrapDto:Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "UserBootstrapDto(accountBootstrapDto="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userInfoBootstrapDto="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userProfileBootstrapDto="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", membershipBootstrapDto="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userBioDataBootstrapDto="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
