.class public final Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$$serializer;,
        Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:;B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBM\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JJ\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\n2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00100\u0012\u0004\u00082\u00103\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u0008\u000b\u0010%\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;",
        "",
        "",
        "type",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "Lcom/whoop/coacheverywherecommon/models/CoachEntry;",
        "coachEntry",
        "",
        "isWcePrefetch",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$coach_everywhere_common_release",
        "(Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/navigation/e;",
        "component3",
        "()Lcom/whoop/navigation/AiAction;",
        "component4",
        "()Lcom/whoop/coacheverywherecommon/models/CoachEntry;",
        "component5",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getType",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Lcom/whoop/navigation/AiAction;",
        "getAiAction",
        "Lcom/whoop/coacheverywherecommon/models/CoachEntry;",
        "getCoachEntry",
        "Ljava/lang/Boolean;",
        "Companion",
        "$serializer",
        "a",
        "coach-everywhere-common_release"
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

.field public static final Companion:Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$a;


# instance fields
.field private final aiAction:Lcom/whoop/navigation/AiAction;

.field private final coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

.field private final destination:Lcom/whoop/navigation/e;

.field private final isWcePrefetch:Ljava/lang/Boolean;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->Companion:Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$a;

    sget v0, Lcom/whoop/navigation/AiAction;->$stable:I

    sget v2, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lep0/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lep0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$$serializer;->INSTANCE:Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$$serializer;

    invoke-virtual {p7}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    return-void

    :cond_3
    iput-object p6, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    .line 5
    iput-object p3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    .line 6
    iput-object p4, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    .line 7
    iput-object p5, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)V

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

    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->copy(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$coach_everywhere_common_release(Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/navigation/AiAction$$serializer;->INSTANCE:Lcom/whoop/navigation/AiAction$$serializer;

    iget-object v2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/coacheverywherecommon/models/CoachEntry$$serializer;->INSTANCE:Lcom/whoop/coacheverywherecommon/models/CoachEntry$$serializer;

    iget-object v2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final component4()Lcom/whoop/coacheverywherecommon/models/CoachEntry;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object v3, p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    iget-object v3, p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAiAction()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final getCoachEntry()Lcom/whoop/coacheverywherecommon/models/CoachEntry;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/CoachEntry;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public final isWcePrefetch()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->type:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->destination:Lcom/whoop/navigation/e;

    iget-object v2, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object v3, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->coachEntry:Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    iget-object v4, p0, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch:Ljava/lang/Boolean;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "BottomNavOverride(type="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiAction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", coachEntry="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isWcePrefetch="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
