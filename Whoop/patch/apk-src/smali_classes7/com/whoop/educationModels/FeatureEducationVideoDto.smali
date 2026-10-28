.class public final Lcom/whoop/educationModels/FeatureEducationVideoDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;,
        Lcom/whoop/educationModels/FeatureEducationVideoDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBi\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJf\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00062\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u0015J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001\u00a2\u0006\u0004\u0008.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00105\u0012\u0004\u00087\u00104\u001a\u0004\u00086\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008:\u00104\u001a\u0004\u00089\u0010\u0019R \u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00108\u0012\u0004\u0008<\u00104\u001a\u0004\u0008;\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00108\u0012\u0004\u0008>\u00104\u001a\u0004\u0008=\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00108\u0012\u0004\u0008@\u00104\u001a\u0004\u0008?\u0010\u0019R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u00108\u0012\u0004\u0008B\u00104\u001a\u0004\u0008A\u0010\u0019R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010C\u0012\u0004\u0008E\u00104\u001a\u0004\u0008D\u0010\u001f\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/educationModels/FeatureEducationVideoDto;",
        "",
        "",
        "id",
        "Lcom/whoop/educationModels/FeatureEducationThumbnailDto;",
        "thumbnail",
        "",
        "createdAt",
        "updatedAt",
        "title",
        "playtime",
        "url",
        "Lcom/whoop/educationModels/EducationVideoTypeDto;",
        "type",
        "<init>",
        "(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Lcom/whoop/educationModels/FeatureEducationThumbnailDto;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/educationModels/EducationVideoTypeDto;",
        "copy",
        "(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)Lcom/whoop/educationModels/FeatureEducationVideoDto;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$education_models_release",
        "(Lcom/whoop/educationModels/FeatureEducationVideoDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getId",
        "getId$annotations",
        "()V",
        "Lcom/whoop/educationModels/FeatureEducationThumbnailDto;",
        "getThumbnail",
        "getThumbnail$annotations",
        "Ljava/lang/String;",
        "getCreatedAt",
        "getCreatedAt$annotations",
        "getUpdatedAt",
        "getUpdatedAt$annotations",
        "getTitle",
        "getTitle$annotations",
        "getPlaytime",
        "getPlaytime$annotations",
        "getUrl",
        "getUrl$annotations",
        "Lcom/whoop/educationModels/EducationVideoTypeDto;",
        "getType",
        "getType$annotations",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/educationModels/FeatureEducationVideoDto$Companion;


# instance fields
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

.field private final playtime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "playtime"
    .end annotation
.end field

.field private final thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "thumbnail"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final type:Lcom/whoop/educationModels/EducationVideoTypeDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
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
    .locals 4

    new-instance v0, Lcom/whoop/educationModels/FeatureEducationVideoDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/educationModels/FeatureEducationVideoDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->Companion:Lcom/whoop/educationModels/FeatureEducationVideoDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lve/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lve/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x8

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

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v1, 0x7

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/educationModels/FeatureEducationVideoDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/educationModels/FeatureEducationVideoDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    iput-object p3, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    iput-object p4, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    return-void
.end method

.method public constructor <init>(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)V
    .locals 1

    const-string v0, "thumbnail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    .line 4
    iput-object p2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    .line 5
    iput-object p3, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/educationModels/EducationVideoTypeDto;->Companion:Lcom/whoop/educationModels/EducationVideoTypeDto$Companion;

    invoke-virtual {v0}, Lcom/whoop/educationModels/EducationVideoTypeDto$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/educationModels/FeatureEducationVideoDto;ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;ILjava/lang/Object;)Lcom/whoop/educationModels/FeatureEducationVideoDto;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->copy(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)Lcom/whoop/educationModels/FeatureEducationVideoDto;

    move-result-object p0

    return-object p0
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

.method public static synthetic getPlaytime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "playtime"
    .end annotation

    return-void
.end method

.method public static synthetic getThumbnail$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "thumbnail"
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

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "type"
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

.method public static final synthetic write$Self$education_models_release(Lcom/whoop/educationModels/FeatureEducationVideoDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lcom/whoop/educationModels/FeatureEducationThumbnailDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/FeatureEducationThumbnailDto$$serializer;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    return v0
.end method

.method public final component2()Lcom/whoop/educationModels/FeatureEducationThumbnailDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/educationModels/EducationVideoTypeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    return-object v0
.end method

.method public final copy(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)Lcom/whoop/educationModels/FeatureEducationVideoDto;
    .locals 10

    const-string v0, "thumbnail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/educationModels/FeatureEducationVideoDto;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/educationModels/FeatureEducationVideoDto;-><init>(ILcom/whoop/educationModels/FeatureEducationThumbnailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/educationModels/EducationVideoTypeDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;

    iget v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    iget v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    iget-object p1, p1, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    return v0
.end method

.method public final getPlaytime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    return-object v0
.end method

.method public final getThumbnail()Lcom/whoop/educationModels/FeatureEducationThumbnailDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/whoop/educationModels/EducationVideoTypeDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    invoke-virtual {v2}, Lcom/whoop/educationModels/FeatureEducationThumbnailDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->id:I

    iget-object v1, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->thumbnail:Lcom/whoop/educationModels/FeatureEducationThumbnailDto;

    iget-object v2, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->createdAt:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->updatedAt:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->title:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->playtime:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->url:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/educationModels/FeatureEducationVideoDto;->type:Lcom/whoop/educationModels/EducationVideoTypeDto;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "FeatureEducationVideoDto(id="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", thumbnail="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    const-string v1, ", title="

    invoke-static {v8, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", playtime="

    const-string v1, ", url="

    invoke-static {v8, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
