.class public final Lcom/whoop/communitymoments/domain/models/MomentCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$$serializer;,
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;,
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$a;,
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;,
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;,
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0006JKLMNOBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bk\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jn\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\"J\u0010\u00103\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00108\u001a\u0002072\u0008\u00106\u001a\u0004\u0018\u000105H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008=\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008>\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008@\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010/\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;",
        "fillMode",
        "imageUrl",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;",
        "dateBadge",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;",
        "profile",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;",
        "badge",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;",
        "footer",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_moments_release",
        "(Lcom/whoop/communitymoments/domain/models/MomentCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;",
        "component3",
        "component4",
        "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;",
        "component5",
        "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;",
        "component6",
        "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;",
        "component7",
        "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;",
        "component8",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communitymoments/domain/models/MomentCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;",
        "getFillMode",
        "getImageUrl",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;",
        "getDateBadge",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;",
        "getProfile",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;",
        "getBadge",
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;",
        "getFooter",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "Companion",
        "DateBadge",
        "Profile",
        "Badge",
        "Footer",
        "$serializer",
        "a",
        "community-moments_release"
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

.field public static final Companion:Lcom/whoop/communitymoments/domain/models/MomentCardModel$a;


# instance fields
.field private final badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

.field private final dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

.field private final fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

.field private final footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->Companion:Lcom/whoop/communitymoments/domain/models/MomentCardModel$a;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lur0/a;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lur0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x8

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v0, v2, v4

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    const/4 v0, 0x7

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xfd

    const/16 v0, 0xfd

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/communitymoments/domain/models/MomentCardModel$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCardModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;->FIT_CONTENT:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    .line 3
    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    :goto_0
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    iput-object p9, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    .line 7
    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    .line 9
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    .line 10
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    .line 11
    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    .line 12
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_0

    .line 13
    sget-object p2, Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;->FIT_CONTENT:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 14
    invoke-direct/range {v0 .. v8}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;-><init>(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;->Companion:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode$a;

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MomentCardFillMode$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communitymoments/domain/models/MomentCardModel;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/communitymoments/domain/models/MomentCardModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->copy(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_moments_release(Lcom/whoop/communitymoments/domain/models/MomentCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    sget-object v3, Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;->FIT_CONTENT:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge$$serializer;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile$$serializer;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge$$serializer;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$$serializer;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    return-object v0
.end method

.method public final component5()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    return-object v0
.end method

.method public final component6()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    return-object v0
.end method

.method public final component7()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communitymoments/domain/models/MomentCardModel;
    .locals 10

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/communitymoments/domain/models/MomentCardModel;-><init>(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBadge()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    return-object v0
.end method

.method public final getDateBadge()Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    return-object v0
.end method

.method public final getFillMode()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getProfile()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->fillMode:Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->dateBadge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->profile:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;

    iget-object v5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->badge:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;

    iget-object v6, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->footer:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    iget-object v7, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "MomentCardModel(id="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fillMode="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", imageUrl="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dateBadge="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", profile="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", badge="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", interaction="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
