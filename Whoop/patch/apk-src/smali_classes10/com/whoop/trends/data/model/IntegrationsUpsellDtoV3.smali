.class public final Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;,
        Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJF\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010)\u0012\u0004\u0008.\u0010,\u001a\u0004\u0008-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010)\u0012\u0004\u00080\u0010,\u001a\u0004\u0008/\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00101\u0012\u0004\u00083\u0010,\u001a\u0004\u00082\u0010\u001eR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00101\u0012\u0004\u00085\u0010,\u001a\u0004\u00084\u0010\u001e\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
        "",
        "",
        "image",
        "title",
        "subtitle",
        "Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;",
        "primaryButton",
        "secondaryButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getImage",
        "getImage$annotations",
        "()V",
        "getTitle",
        "getTitle$annotations",
        "getSubtitle",
        "getSubtitle$annotations",
        "Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;",
        "getPrimaryButton",
        "getPrimaryButton$annotations",
        "getSecondaryButton",
        "getSecondaryButton$annotations",
        "Companion",
        "$serializer",
        "trends_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$Companion;


# instance fields
.field private final image:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image"
    .end annotation
.end field

.field private final primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "primary_button"
    .end annotation
.end field

.field private final secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "secondary_button"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->Companion:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;

    invoke-virtual {p7}, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    iput-object p6, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)V
    .locals 1

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;ILjava/lang/Object;)Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getImage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image"
    .end annotation

    return-void
.end method

.method public static synthetic getPrimaryButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "primary_button"
    .end annotation

    return-void
.end method

.method public static synthetic getSecondaryButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "secondary_button"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    return-object v0
.end method

.method public final component5()Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;
    .locals 7

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    iget-object p1, p1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->image:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->primaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    iget-object v4, p0, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->secondaryButton:Lcom/whoop/trends/data/model/IntegrationsUpsellButtonDtoV3;

    const-string v5, ", title="

    const-string v6, ", subtitle="

    const-string v7, "IntegrationsUpsellDtoV3(image="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
