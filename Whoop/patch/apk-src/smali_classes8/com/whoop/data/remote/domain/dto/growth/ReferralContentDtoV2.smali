.class public final Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$$serializer;,
        Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J>\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;",
        "",
        "Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;",
        "shareSheetContent",
        "Lcom/whoop/data/remote/domain/dto/growth/BannerContent;",
        "bannerContent",
        "Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;",
        "rafMenuItem",
        "Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;",
        "rafHubContent",
        "<init>",
        "(Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/domain/model/ReferralContentV2;",
        "toReferralContentV2",
        "()Lcom/whoop/domain/model/ReferralContentV2;",
        "component1",
        "()Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;",
        "component2",
        "()Lcom/whoop/data/remote/domain/dto/growth/BannerContent;",
        "component3",
        "()Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;",
        "component4",
        "()Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;",
        "copy",
        "(Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;)Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;",
        "getShareSheetContent",
        "Lcom/whoop/data/remote/domain/dto/growth/BannerContent;",
        "getBannerContent",
        "Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;",
        "getRafMenuItem",
        "Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;",
        "getRafHubContent",
        "Companion",
        "$serializer",
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$Companion;


# instance fields
.field private final bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner_content"
    .end annotation
.end field

.field private final rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "raf_hub_content"
    .end annotation
.end field

.field private final rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "raf_menu_item"
    .end annotation
.end field

.field private final shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "share_sheet_content"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->Companion:Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$$serializer;

    invoke-virtual {p6}, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;)V
    .locals 1

    const-string v0, "shareSheetContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->copy(Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;)Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/growth/BannerContent$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/growth/BannerContent$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/growth/RafHubContent$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent$$serializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    return-object v0
.end method

.method public final component2()Lcom/whoop/data/remote/domain/dto/growth/BannerContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    return-object v0
.end method

.method public final component3()Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    return-object v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    return-object v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;)Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;
    .locals 1

    const-string v0, "shareSheetContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;-><init>(Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;Lcom/whoop/data/remote/domain/dto/growth/BannerContent;Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBannerContent()Lcom/whoop/data/remote/domain/dto/growth/BannerContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    return-object v0
.end method

.method public final getRafHubContent()Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    return-object v0
.end method

.method public final getRafMenuItem()Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    return-object v0
.end method

.method public final getShareSheetContent()Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/growth/BannerContent;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final toReferralContentV2()Lcom/whoop/domain/model/ReferralContentV2;
    .locals 5

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/domain/model/ReferralContentV2;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/growth/BannerContent;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/growth/BannerContent;->getBody()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;->getMessageText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/growth/BannerContent;->getCtaText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/whoop/domain/model/ReferralContentV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->shareSheetContent:Lcom/whoop/data/remote/domain/dto/growth/ShareSheetContent;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->bannerContent:Lcom/whoop/data/remote/domain/dto/growth/BannerContent;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafMenuItem:Lcom/whoop/data/remote/domain/dto/growth/RafMenuItem;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/growth/ReferralContentDtoV2;->rafHubContent:Lcom/whoop/data/remote/domain/dto/growth/RafHubContent;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ReferralContentDtoV2(shareSheetContent="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bannerContent="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rafMenuItem="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rafHubContent="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
