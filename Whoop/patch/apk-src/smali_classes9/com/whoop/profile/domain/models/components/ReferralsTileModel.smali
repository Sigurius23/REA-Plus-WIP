.class public final Lcom/whoop/profile/domain/models/components/ReferralsTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/models/components/ReferralsTileModel$$serializer;,
        Lcom/whoop/profile/domain/models/components/ReferralsTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBW\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)JT\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00087\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008=\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010>\u001a\u0004\u0008?\u0010\'R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010@\u0012\u0004\u0008B\u0010;\u001a\u0004\u0008A\u0010)\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/components/ReferralsTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;",
        "header",
        "Lcom/whoop/profile/domain/models/components/ReferredListModel;",
        "referredList",
        "Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;",
        "footer",
        "Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;",
        "button",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$profile_release",
        "(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;",
        "component3",
        "()Lcom/whoop/profile/domain/models/components/ReferredListModel;",
        "component4",
        "()Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;",
        "component5",
        "()Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;",
        "component6",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)Lcom/whoop/profile/domain/models/components/ReferralsTileModel;",
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
        "Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;",
        "getHeader",
        "Lcom/whoop/profile/domain/models/components/ReferredListModel;",
        "getReferredList",
        "getReferredList$annotations",
        "()V",
        "Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;",
        "getFooter",
        "Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;",
        "getButton",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "Companion",
        "$serializer",
        "profile_release"
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

.field public static final Companion:Lcom/whoop/profile/domain/models/components/ReferralsTileModel$Companion;


# instance fields
.field private final button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

.field private final destination:Lcom/whoop/navigation/e;

.field private final footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

.field private final header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

.field private final id:Ljava/lang/String;

.field private final referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->Companion:Lcom/whoop/profile/domain/models/components/ReferralsTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lsr2/v;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lsr2/v;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v1, 0x5

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/profile/domain/models/components/ReferralsTileModel$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/components/ReferralsTileModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    iput-object p4, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    iput-object p5, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    iput-object p6, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    iput-object p7, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/profile/domain/models/components/ReferralsTileModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->copy(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getReferredList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "referred_list"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$profile_release(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/profile/domain/models/components/ReferredListModel$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/components/ReferredListModel$$serializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel$$serializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel$$serializer;->INSTANCE:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/profile/domain/models/components/ReferredListModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)Lcom/whoop/profile/domain/models/components/ReferralsTileModel;
    .locals 8

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;Lcom/whoop/profile/domain/models/components/ReferredListModel;Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    iget-object v3, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getButton()Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getReferredList()Lcom/whoop/profile/domain/models/components/ReferredListModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferredListModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->header:Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    iget-object v2, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->referredList:Lcom/whoop/profile/domain/models/components/ReferredListModel;

    iget-object v3, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->footer:Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    iget-object v4, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->button:Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    iget-object v5, p0, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->destination:Lcom/whoop/navigation/e;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ReferralsTileModel(id="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", header="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", referredList="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
