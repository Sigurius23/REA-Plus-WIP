.class public final Lcom/whoop/addactivity/network/model/Activity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/addactivity/network/model/Activity$$serializer;,
        Lcom/whoop/addactivity/network/model/Activity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rB]\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!JV\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00062\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u00081\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010!R\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u00084\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010$R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00102\u001a\u0004\u00087\u0010!\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/addactivity/network/model/Activity;",
        "",
        "",
        "displayName",
        "internalName",
        "iconUrl",
        "",
        "deleted",
        "category",
        "Lcom/whoop/addactivity/network/model/ScoreType;",
        "scoreType",
        "hasGps",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/addactivity/network/model/Activity;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Z",
        "component5",
        "component6",
        "()Lcom/whoop/addactivity/network/model/ScoreType;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)Lcom/whoop/addactivity/network/model/Activity;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDisplayName",
        "getInternalName",
        "getIconUrl",
        "Z",
        "getDeleted",
        "getCategory",
        "Lcom/whoop/addactivity/network/model/ScoreType;",
        "getScoreType",
        "getHasGps",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/addactivity/network/model/Activity$a;


# instance fields
.field private final category:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "category"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final displayName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "display_name"
    .end annotation
.end field

.field private final hasGps:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "has_gps"
    .end annotation
.end field

.field private final iconUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon_url"
    .end annotation
.end field

.field private final internalName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "internal_name"
    .end annotation
.end field

.field private final scoreType:Lcom/whoop/addactivity/network/model/ScoreType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "score_type"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/addactivity/network/model/Activity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/addactivity/network/model/Activity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/addactivity/network/model/Activity;->Companion:Lcom/whoop/addactivity/network/model/Activity$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lj02/w;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lj02/w;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

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

    const/4 v3, 0x5

    aput-object v0, v2, v3

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/addactivity/network/model/Activity;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/addactivity/network/model/Activity$$serializer;->INSTANCE:Lcom/whoop/addactivity/network/model/Activity$$serializer;

    invoke-virtual {p9}, Lcom/whoop/addactivity/network/model/Activity$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    iput-object p6, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    iput-boolean p8, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V
    .locals 1

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/addactivity/network/model/ScoreType;->Companion:Lcom/whoop/addactivity/network/model/ScoreType$a;

    invoke-virtual {v0}, Lcom/whoop/addactivity/network/model/ScoreType$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/addactivity/network/model/Activity;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/addactivity/network/model/Activity;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/addactivity/network/model/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;ZILjava/lang/Object;)Lcom/whoop/addactivity/network/model/Activity;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/addactivity/network/model/Activity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)Lcom/whoop/addactivity/network/model/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/addactivity/network/model/Activity;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/addactivity/network/model/Activity;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-boolean p0, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/addactivity/network/model/ScoreType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)Lcom/whoop/addactivity/network/model/Activity;
    .locals 9

    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/addactivity/network/model/Activity;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/addactivity/network/model/Activity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/addactivity/network/model/Activity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/addactivity/network/model/Activity;

    iget-object v1, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    iget-object v3, p1, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    iget-boolean p1, p1, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    return v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasGps()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    return v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getScoreType()Lcom/whoop/addactivity/network/model/ScoreType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/addactivity/network/model/Activity;->displayName:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/addactivity/network/model/Activity;->internalName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/addactivity/network/model/Activity;->iconUrl:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/whoop/addactivity/network/model/Activity;->deleted:Z

    iget-object v4, p0, Lcom/whoop/addactivity/network/model/Activity;->category:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/addactivity/network/model/Activity;->scoreType:Lcom/whoop/addactivity/network/model/ScoreType;

    iget-boolean v6, p0, Lcom/whoop/addactivity/network/model/Activity;->hasGps:Z

    const-string v7, ", internalName="

    const-string v8, ", iconUrl="

    const-string v9, "Activity(displayName="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deleted="

    const-string v7, ", category="

    invoke-static {v0, v2, v1, v3, v7}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", scoreType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasGps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
