.class public final Lcom/whoop/educationModels/MediaHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/MediaHeader$$serializer;,
        Lcom/whoop/educationModels/MediaHeader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008*\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rB_\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001dJ^\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00062\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010.\u0012\u0004\u00083\u00101\u001a\u0004\u00082\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010.\u0012\u0004\u00085\u00101\u001a\u0004\u00084\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00106\u0012\u0004\u00088\u00101\u001a\u0004\u00087\u0010!R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010.\u0012\u0004\u0008:\u00101\u001a\u0004\u00089\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010;\u0012\u0004\u0008=\u00101\u001a\u0004\u0008<\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010.\u0012\u0004\u0008?\u00101\u001a\u0004\u0008>\u0010\u001d\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/educationModels/MediaHeader;",
        "",
        "",
        "title",
        "subText",
        "imageUrl",
        "",
        "shareEnabled",
        "ctaIcon",
        "Lcom/whoop/educationModels/PodcastPicker;",
        "podcastPicker",
        "shareLink",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$education_models_release",
        "(Lcom/whoop/educationModels/MediaHeader;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Z",
        "component5",
        "component6",
        "()Lcom/whoop/educationModels/PodcastPicker;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)Lcom/whoop/educationModels/MediaHeader;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getSubText",
        "getSubText$annotations",
        "getImageUrl",
        "getImageUrl$annotations",
        "Z",
        "getShareEnabled",
        "getShareEnabled$annotations",
        "getCtaIcon",
        "getCtaIcon$annotations",
        "Lcom/whoop/educationModels/PodcastPicker;",
        "getPodcastPicker",
        "getPodcastPicker$annotations",
        "getShareLink",
        "getShareLink$annotations",
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

.field public static final Companion:Lcom/whoop/educationModels/MediaHeader$Companion;


# instance fields
.field private final ctaIcon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_icon"
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_url"
    .end annotation
.end field

.field private final podcastPicker:Lcom/whoop/educationModels/PodcastPicker;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "podcast_picker"
    .end annotation
.end field

.field private final shareEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_enabled"
    .end annotation
.end field

.field private final shareLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_link"
    .end annotation
.end field

.field private final subText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sub_text"
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

    new-instance v0, Lcom/whoop/educationModels/MediaHeader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/educationModels/MediaHeader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/educationModels/MediaHeader;->Companion:Lcom/whoop/educationModels/MediaHeader$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/educationModels/MediaHeader;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/educationModels/MediaHeader$$serializer;->INSTANCE:Lcom/whoop/educationModels/MediaHeader$$serializer;

    invoke-virtual {p9}, Lcom/whoop/educationModels/MediaHeader$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    iput-object p6, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    iput-object p8, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    .line 9
    iput-object p7, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/educationModels/MediaHeader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/educationModels/MediaHeader;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/educationModels/MediaHeader;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)Lcom/whoop/educationModels/MediaHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCtaIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_icon"
    .end annotation

    return-void
.end method

.method public static synthetic getImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getPodcastPicker$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "podcast_picker"
    .end annotation

    return-void
.end method

.method public static synthetic getShareEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "share_enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getShareLink$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "share_link"
    .end annotation

    return-void
.end method

.method public static synthetic getSubText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sub_text"
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

.method public static final synthetic write$Self$education_models_release(Lcom/whoop/educationModels/MediaHeader;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/educationModels/PodcastPicker$$serializer;->INSTANCE:Lcom/whoop/educationModels/PodcastPicker$$serializer;

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object p0, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/educationModels/PodcastPicker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)Lcom/whoop/educationModels/MediaHeader;
    .locals 9

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/educationModels/MediaHeader;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/educationModels/MediaHeader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/educationModels/PodcastPicker;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/educationModels/MediaHeader;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/educationModels/MediaHeader;

    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    iget-object v3, p1, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCtaIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPodcastPicker()Lcom/whoop/educationModels/PodcastPicker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    return-object v0
.end method

.method public final getShareEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    return v0
.end method

.method public final getShareLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/educationModels/PodcastPicker;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/educationModels/MediaHeader;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/educationModels/MediaHeader;->subText:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/educationModels/MediaHeader;->imageUrl:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/whoop/educationModels/MediaHeader;->shareEnabled:Z

    iget-object v4, p0, Lcom/whoop/educationModels/MediaHeader;->ctaIcon:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/educationModels/MediaHeader;->podcastPicker:Lcom/whoop/educationModels/PodcastPicker;

    iget-object v6, p0, Lcom/whoop/educationModels/MediaHeader;->shareLink:Ljava/lang/String;

    const-string v7, ", subText="

    const-string v8, ", imageUrl="

    const-string v9, "MediaHeader(title="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shareEnabled="

    const-string v7, ", ctaIcon="

    invoke-static {v0, v2, v1, v3, v7}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", podcastPicker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shareLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
