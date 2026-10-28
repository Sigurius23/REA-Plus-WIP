.class public final Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$$serializer;,
        Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCBe\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bk\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+Jn\u0010,\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010 J\u0010\u0010/\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u000101H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00088\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00106\u001a\u0004\u00089\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008;\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008=\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010>\u001a\u0004\u0008?\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00106\u001a\u0004\u0008@\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010+\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "cardName",
        "title",
        "endIcon",
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;",
        "bodyContent",
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;",
        "tag",
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;",
        "footer",
        "cta",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_release",
        "(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;",
        "component5",
        "()Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;",
        "component6",
        "()Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;",
        "component7",
        "component8",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCardName",
        "getTitle",
        "getEndIcon",
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;",
        "getBodyContent",
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;",
        "getTag",
        "Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;",
        "getFooter",
        "getCta",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Companion",
        "$serializer",
        "health_release"
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

.field public static final Companion:Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$Companion;


# instance fields
.field private final bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

.field private final cardName:Ljava/lang/String;

.field private final cta:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final endIcon:Ljava/lang/String;

.field private final footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

.field private final tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->Companion:Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lsh2/d;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lsh2/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

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

    sput-object v2, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 3
    new-instance v2, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 p2, p8

    iput-object p2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    return-void

    :cond_7
    move-object/from16 p1, p9

    iput-object p1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "bodyContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    .line 10
    iput-object p5, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    .line 11
    iput-object p6, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    .line 12
    iput-object p7, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    .line 13
    iput-object p8, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object p2, v2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move-object p3, v2

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    .line 14
    new-instance v3, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_3
    move-object v3, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object v1, v2

    goto :goto_1

    :cond_4
    move-object v1, p5

    :goto_1
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_5

    move-object v4, v2

    goto :goto_2

    :cond_5
    move-object v4, p6

    :goto_2
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_6

    move-object v5, v2

    goto :goto_3

    :cond_6
    move-object/from16 v5, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_7

    move-object/from16 p9, v2

    :goto_4
    move-object p4, p3

    move-object p6, v1

    move-object p5, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_5

    :cond_7
    move-object/from16 p9, p8

    goto :goto_4

    .line 15
    :goto_5
    invoke-direct/range {p1 .. p9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_release(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;Lzc3/c;Lyc3/g;)V
    .locals 9

    sget-object v0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    new-instance v3, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel$$serializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel$$serializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel$$serializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;
    .locals 10

    const-string v0, "bodyContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;

    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBodyContent()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    return-object v0
.end method

.method public final getCardName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cardName:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->endIcon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->bodyContent:Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    iget-object v4, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->tag:Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    iget-object v5, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->footer:Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    iget-object v6, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->cta:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->destination:Lcom/whoop/navigation/e;

    const-string v8, ", title="

    const-string v9, ", endIcon="

    const-string v10, "HorizontalRecordsTileModel(cardName="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bodyContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
