.class public final Lcom/whoop/educationModels/FeatureEducationThumbnailDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/FeatureEducationThumbnailDto$$serializer;,
        Lcom/whoop/educationModels/FeatureEducationThumbnailDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008)\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rB]\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JX\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001cJ\u001a\u0010*\u001a\u00020\n2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010,\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00100\u0012\u0004\u00082\u0010/\u001a\u0004\u00081\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00100\u0012\u0004\u00084\u0010/\u001a\u0004\u00083\u0010\u001eR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00100\u0012\u0004\u00086\u0010/\u001a\u0004\u00085\u0010\u001eR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00100\u0012\u0004\u00088\u0010/\u001a\u0004\u00087\u0010\u001eR \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00100\u0012\u0004\u0008:\u0010/\u001a\u0004\u00089\u0010\u001eR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010;\u0012\u0004\u0008=\u0010/\u001a\u0004\u0008<\u0010$\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/educationModels/FeatureEducationThumbnailDto;",
        "",
        "",
        "id",
        "",
        "createdAt",
        "updatedAt",
        "url",
        "scrim",
        "alignment",
        "",
        "backgroundImage",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$education_models_release",
        "(Lcom/whoop/educationModels/FeatureEducationThumbnailDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Z",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/educationModels/FeatureEducationThumbnailDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getId",
        "getId$annotations",
        "()V",
        "Ljava/lang/String;",
        "getCreatedAt",
        "getCreatedAt$annotations",
        "getUpdatedAt",
        "getUpdatedAt$annotations",
        "getUrl",
        "getUrl$annotations",
        "getScrim",
        "getScrim$annotations",
        "getAlignment",
        "getAlignment$annotations",
        "Z",
        "getBackgroundImage",
        "getBackgroundImage$annotations",
        "Companion",
        "$serializer",
        "education-models_release"
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

.field public static final Companion:Lcom/whoop/educationModels/FeatureEducationThumbnailDto$Companion;


# instance fields
.field private final alignment:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alignment"
    .end annotation
.end field

.field private final backgroundImage:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "background_image"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final scrim:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "scrim"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final url:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "url"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->Companion:Lcom/whoop/educationModels/FeatureEducationThumbnailDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/educationModels/FeatureEducationThumbnailDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationThumbnailDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    iput-object p3, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/educationModels/FeatureEducationThumbnailDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/educationModels/FeatureEducationThumbnailDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAlignment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "alignment"
    .end annotation

    return-void
.end method

.method public static synthetic getBackgroundImage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "background_image"
    .end annotation

    return-void
.end method

.method public static synthetic getCreatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "created_at"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getScrim$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "scrim"
    .end annotation

    return-void
.end method

.method public static synthetic getUpdatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "updated_at"
    .end annotation

    return-void
.end method

.method public static synthetic getUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "url"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$education_models_release(Lcom/whoop/educationModels/FeatureEducationThumbnailDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-boolean p0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/educationModels/FeatureEducationThumbnailDto;
    .locals 9

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    iget v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    iget v3, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    iget-boolean p1, p1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAlignment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundImage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    return v0
.end method

.method public final getScrim()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->id:I

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->createdAt:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->url:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->scrim:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->alignment:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->backgroundImage:Z

    const-string v7, ", createdAt="

    const-string v8, ", updatedAt="

    const-string v9, "FeatureEducationThumbnailDto(id="

    invoke-static {v0, v9, v7, v1, v8}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    const-string v7, ", scrim="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", alignment="

    const-string v2, ", backgroundImage="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
