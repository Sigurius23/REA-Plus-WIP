.class public final Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$$serializer;,
        Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BU\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB]\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J^\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u00020\u00072\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00087\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008\u0008\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008;\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010<\u001a\u0004\u0008=\u0010)\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "percentValue",
        "centerSubtitle",
        "",
        "isPreview",
        "Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;",
        "center",
        "centerImageUrl",
        "Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;",
        "footer",
        "<init>",
        "(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()F",
        "component3",
        "component4",
        "()Z",
        "component5",
        "()Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;",
        "copy",
        "(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "F",
        "getPercentValue",
        "getCenterSubtitle",
        "Z",
        "Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;",
        "getCenter",
        "getCenterImageUrl",
        "Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;",
        "getFooter",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$Companion;


# instance fields
.field private final center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

.field private final centerImageUrl:Ljava/lang/String;

.field private final centerSubtitle:Ljava/lang/String;

.field private final footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

.field private final id:Ljava/lang/String;

.field private final isPreview:Z

.field private final percentValue:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->Companion:Lcom/whoop/design/models/items/ChallengeProgressGaugeModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;-><init>(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x0

    if-nez p9, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    goto :goto_1

    :cond_1
    iput p3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 3
    const-string p2, ""

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    goto :goto_3

    :cond_3
    iput-boolean p5, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)V
    .locals 1

    const-string v0, "centerSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    .line 7
    iput p2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    .line 9
    iput-boolean p4, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    .line 13
    const-string p3, ""

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const/4 p4, 0x0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p8, p7

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;-><init>(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->copy(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    if-eqz v1, :cond_7

    :goto_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    return v0
.end method

.method public final component5()Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;
    .locals 9

    const-string v0, "centerSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;-><init>(Ljava/lang/String;FLjava/lang/String;ZLcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;Ljava/lang/String;Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    iget v3, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCenter()Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    return-object v0
.end method

.method public final getCenterImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCenterSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPercentValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public final isPreview()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->id:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->percentValue:F

    iget-object v2, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerSubtitle:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->isPreview:Z

    iget-object v4, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->center:Lcom/whoop/design/models/items/ChallengeProgressGaugeCenterModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->centerImageUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/ChallengeProgressGaugeModel;->footer:Lcom/whoop/design/models/items/ChallengeProgressGaugeFooterModel;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ChallengeProgressGaugeModel(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", percentValue="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", centerSubtitle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isPreview="

    const-string v1, ", center="

    invoke-static {v7, v2, v0, v3, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", centerImageUrl="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
