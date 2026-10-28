.class public final Lcom/whoop/referafriend/domain/models/RafHubType$Basic;
.super Lcom/whoop/referafriend/domain/models/RafHubType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/referafriend/domain/models/RafHubType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Basic"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/referafriend/domain/models/RafHubType$Basic$$serializer;,
        Lcom/whoop/referafriend/domain/models/RafHubType$Basic$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBW\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"JN\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00083\u0010\u001eR \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00104\u0012\u0004\u00086\u00107\u001a\u0004\u00085\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00104\u0012\u0004\u00089\u00107\u001a\u0004\u00088\u0010\"\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;",
        "Lcom/whoop/referafriend/domain/models/RafHubType;",
        "Lcom/whoop/referafriend/domain/models/BasicRafStyle;",
        "style",
        "",
        "icon",
        "title",
        "subtitle",
        "Lcom/whoop/referafriend/domain/models/RafHubCTA;",
        "primaryCta",
        "secondaryCta",
        "<init>",
        "(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$refer_a_friend_release",
        "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/referafriend/domain/models/BasicRafStyle;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/referafriend/domain/models/RafHubCTA;",
        "component6",
        "copy",
        "(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lcom/whoop/referafriend/domain/models/RafHubType$Basic;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/referafriend/domain/models/BasicRafStyle;",
        "getStyle",
        "Ljava/lang/String;",
        "getIcon",
        "getTitle",
        "getSubtitle",
        "Lcom/whoop/referafriend/domain/models/RafHubCTA;",
        "getPrimaryCta",
        "getPrimaryCta$annotations",
        "()V",
        "getSecondaryCta",
        "getSecondaryCta$annotations",
        "Companion",
        "$serializer",
        "refer-a-friend_release"
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

.field public static final Companion:Lcom/whoop/referafriend/domain/models/RafHubType$Basic$Companion;


# instance fields
.field private final icon:Ljava/lang/String;

.field private final primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "primary_cta"
    .end annotation
.end field

.field private final secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "secondary_cta"
    .end annotation
.end field

.field private final style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/referafriend/domain/models/RafHubType$Basic$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->Companion:Lcom/whoop/referafriend/domain/models/RafHubType$Basic$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljx2/b;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Ljx2/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x3f

    const/16 v1, 0x3f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/RafHubType$Basic$$serializer;

    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/RafHubType$Basic$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0, p1, p8}, Lcom/whoop/referafriend/domain/models/RafHubType;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    iput-object p7, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryCta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/whoop/referafriend/domain/models/RafHubType;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    .line 4
    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    .line 8
    iput-object p6, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/referafriend/domain/models/BasicRafStyle;->Companion:Lcom/whoop/referafriend/domain/models/BasicRafStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/BasicRafStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;ILjava/lang/Object;)Lcom/whoop/referafriend/domain/models/RafHubType$Basic;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->copy(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPrimaryCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "primary_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getSecondaryCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "secondary_cta"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$refer_a_friend_release(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lzc3/c;Lyc3/g;)V
    .locals 3

    invoke-static {p0, p1, p2}, Lcom/whoop/referafriend/domain/models/RafHubType;->write$Self(Lcom/whoop/referafriend/domain/models/RafHubType;Lzc3/c;Lyc3/g;)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubCTA$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/RafHubCTA$$serializer;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/referafriend/domain/models/BasicRafStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/referafriend/domain/models/RafHubCTA;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    return-object v0
.end method

.method public final component6()Lcom/whoop/referafriend/domain/models/RafHubCTA;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    return-object v0
.end method

.method public final copy(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lcom/whoop/referafriend/domain/models/RafHubType$Basic;
    .locals 8

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryCta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;-><init>(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    iget-object p1, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryCta()Lcom/whoop/referafriend/domain/models/RafHubCTA;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    return-object v0
.end method

.method public final getSecondaryCta()Lcom/whoop/referafriend/domain/models/RafHubCTA;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/referafriend/domain/models/BasicRafStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    invoke-virtual {v2}, Lcom/whoop/referafriend/domain/models/RafHubCTA;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/RafHubCTA;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->style:Lcom/whoop/referafriend/domain/models/BasicRafStyle;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->subtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->primaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    iget-object v5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->secondaryCta:Lcom/whoop/referafriend/domain/models/RafHubCTA;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Basic(style="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    const-string v1, ", primaryCta="

    invoke-static {v6, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryCta="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
