.class public final Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/communitymoments/domain/models/MomentCardModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Footer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$$serializer;,
        Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000212B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJL\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008/\u0010\u001e\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;",
        "",
        "",
        "iconUrl",
        "title",
        "subtitle",
        "Lb91/c;",
        "titleTypography",
        "subtitleTypography",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_moments_release",
        "(Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lb91/c;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIconUrl",
        "getTitle",
        "getSubtitle",
        "Lb91/c;",
        "getTitleTypography",
        "getSubtitleTypography",
        "Companion",
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

.field public static final Companion:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$a;


# instance fields
.field private final iconUrl:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final subtitleTypography:Lb91/c;

.field private final title:Ljava/lang/String;

.field private final titleTypography:Lb91/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->Companion:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lur0/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lur0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lur0/a;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lur0/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v1, 0x3

    aput-object v2, v3, v1

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$$serializer;

    invoke-virtual {p7}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    .line 7
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.typography.WhoopTextStyle"

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.typography.WhoopTextStyle"

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;ILjava/lang/Object;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_moments_release(Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    return-object v0
.end method

.method public final component5()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;
    .locals 6

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    iget-object p1, p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleTypography()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleTypography()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->iconUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->titleTypography:Lb91/c;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;->subtitleTypography:Lb91/c;

    const-string v5, ", title="

    const-string v6, ", subtitle="

    const-string v7, "Footer(iconUrl="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", titleTypography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleTypography="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
