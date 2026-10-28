.class public final Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$$serializer;,
        Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KJBc\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B{\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010#J~\u00101\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010#J\u0010\u00104\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00109\u001a\u0002082\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010;\u001a\u0004\u0008=\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010;\u001a\u0004\u0008>\u0010#R\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008@\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010/R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010;\u001a\u0004\u0008I\u0010#\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "tierImage",
        "profilePhoto",
        "",
        "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;",
        "membershipInfo",
        "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;",
        "downgradeInfo",
        "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;",
        "inactive",
        "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;",
        "switchBillingInfo",
        "Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;",
        "additionalInfo",
        "style",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;",
        "component6",
        "()Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;",
        "component7",
        "()Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;",
        "component8",
        "()Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getTierImage",
        "getProfilePhoto",
        "Ljava/util/List;",
        "getMembershipInfo",
        "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;",
        "getDowngradeInfo",
        "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;",
        "getInactive",
        "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;",
        "getSwitchBillingInfo",
        "Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;",
        "getAdditionalInfo",
        "getStyle",
        "Companion",
        "$serializer",
        "membership_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$Companion;


# instance fields
.field private final additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

.field private final downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

.field private final inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

.field private final membershipInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;",
            ">;"
        }
    .end annotation
.end field

.field private final profilePhoto:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

.field private final tierImage:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->Companion:Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lhb1/l;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lhb1/l;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x9

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    iput-object p7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    iput-object p8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    iput-object p9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    iput-object p10, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;",
            ">;",
            "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;",
            "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;",
            "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;",
            "Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "tierImage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-object p0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;",
            ">;",
            "Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;",
            "Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;",
            "Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;",
            "Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;"
        }
    .end annotation

    const-string v0, "tierImage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAdditionalInfo()Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    return-object v0
.end method

.method public final getDowngradeInfo()Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    return-object v0
.end method

.method public final getInactive()Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    return-object v0
.end method

.method public final getMembershipInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/management/domain/models/items/MembershipInfoModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    return-object v0
.end method

.method public final getProfilePhoto()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getSwitchBillingInfo()Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    return-object v0
.end method

.method public final getTierImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    if-nez v3, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->tierImage:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->profilePhoto:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->membershipInfo:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->downgradeInfo:Lcom/whoop/membership/management/domain/models/items/DowngradeInfoModel;

    iget-object v5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->inactive:Lcom/whoop/membership/management/domain/models/items/InactiveInfoModel;

    iget-object v6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->switchBillingInfo:Lcom/whoop/membership/management/domain/models/items/SwitchBillingInfoModel;

    iget-object v7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->additionalInfo:Lcom/whoop/membership/management/domain/models/items/AdditionalInfoModel;

    iget-object v8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardModel;->style:Ljava/lang/String;

    const-string v9, ", tierImage="

    const-string v10, ", profilePhoto="

    const-string v11, "MembershipCardModel(title="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", membershipInfo="

    const-string v9, ", downgradeInfo="

    invoke-static {v2, v1, v9, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inactive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", switchBillingInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
