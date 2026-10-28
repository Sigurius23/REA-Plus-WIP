.class public final Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$$serializer;,
        Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bBO\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JJ\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010)\u001a\u00020\u00022\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u0008/\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00081\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010\"\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;",
        "",
        "",
        "shareToStrava",
        "shareAllActivities",
        "",
        "templateName",
        "",
        "sharedActivityNames",
        "importActivities",
        "<init>",
        "(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$strava_release",
        "(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Ljava/lang/Boolean;",
        "copy",
        "(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getShareToStrava",
        "getShareAllActivities",
        "Ljava/lang/String;",
        "getTemplateName",
        "Ljava/util/List;",
        "getSharedActivityNames",
        "Ljava/lang/Boolean;",
        "getImportActivities",
        "Companion",
        "$serializer",
        "a",
        "strava_release"
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

.field public static final Companion:Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$a;


# instance fields
.field private final importActivities:Ljava/lang/Boolean;

.field private final shareAllActivities:Z

.field private final shareToStrava:Z

.field private final sharedActivityNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final templateName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->Companion:Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lhb1/l;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lhb1/l;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$$serializer;

    invoke-virtual {p7}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    iput-boolean p3, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    iput-object p4, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    return-void

    :cond_1
    iput-object p6, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "templateName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedActivityNames"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    .line 4
    iput-boolean p2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->copy(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$strava_release(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;"
        }
    .end annotation

    const-string v0, "templateName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedActivityNames"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;

    iget-boolean v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    iget-boolean v3, p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    iget-boolean v3, p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getImportActivities()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getShareAllActivities()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    return v0
.end method

.method public final getShareToStrava()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    return v0
.end method

.method public final getSharedActivityNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    return-object v0
.end method

.method public final getTemplateName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareToStrava:Z

    iget-boolean v1, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->shareAllActivities:Z

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->templateName:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->sharedActivityNames:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;->importActivities:Ljava/lang/Boolean;

    const-string v5, ", shareAllActivities="

    const-string v6, ", templateName="

    const-string v7, "StravaUserSettingsInformationRequest(shareToStrava="

    invoke-static {v7, v5, v6, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sharedActivityNames="

    const-string v5, ", importActivities="

    invoke-static {v2, v1, v5, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
