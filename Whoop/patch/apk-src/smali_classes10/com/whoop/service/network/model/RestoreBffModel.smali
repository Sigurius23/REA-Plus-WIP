.class public final Lcom/whoop/service/network/model/RestoreBffModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/network/model/RestoreBffModel$$serializer;,
        Lcom/whoop/service/network/model/RestoreBffModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bq\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J\u0010\u0010)\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*Jf\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u00088\u0010#R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00089\u0010 R\u001a\u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u0008:\u0010 R \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\'R\u001a\u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00104\u001a\u0004\u0008=\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008?\u0010*\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/service/network/model/RestoreBffModel;",
        "",
        "",
        "header",
        "subHeader",
        "Lcom/whoop/service/network/model/ReplacementStatus;",
        "replacementStatus",
        "tag",
        "subtitle",
        "",
        "Lcom/whoop/service/network/model/RestorePerk;",
        "perks",
        "disclaimer",
        "Lcom/whoop/service/network/model/RestoreCta;",
        "cta",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/service/network/model/RestoreBffModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/service/network/model/ReplacementStatus;",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "()Lcom/whoop/service/network/model/RestoreCta;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)Lcom/whoop/service/network/model/RestoreBffModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getHeader",
        "getSubHeader",
        "Lcom/whoop/service/network/model/ReplacementStatus;",
        "getReplacementStatus",
        "getTag",
        "getSubtitle",
        "Ljava/util/List;",
        "getPerks",
        "getDisclaimer",
        "Lcom/whoop/service/network/model/RestoreCta;",
        "getCta",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/service/network/model/RestoreBffModel$Companion;


# instance fields
.field private final cta:Lcom/whoop/service/network/model/RestoreCta;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta"
    .end annotation
.end field

.field private final disclaimer:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disclaimer"
    .end annotation
.end field

.field private final header:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header"
    .end annotation
.end field

.field private final perks:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "perks"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/RestorePerk;",
            ">;"
        }
    .end annotation
.end field

.field private final replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "replacement_status"
    .end annotation
.end field

.field private final subHeader:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sub_header"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final tag:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tag"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/service/network/model/RestoreBffModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/network/model/RestoreBffModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/network/model/RestoreBffModel;->Companion:Lcom/whoop/service/network/model/RestoreBffModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljx2/b;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Ljx2/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ljx2/b;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Ljx2/b;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v3, 0x8

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    const/4 v0, 0x7

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/service/network/model/RestoreBffModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/service/network/model/RestoreBffModel$$serializer;->INSTANCE:Lcom/whoop/service/network/model/RestoreBffModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/service/network/model/RestoreBffModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    iput-object p5, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/service/network/model/ReplacementStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/RestorePerk;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/service/network/model/RestoreCta;",
            ")V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subHeader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replacementStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "perks"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    .line 6
    iput-object p4, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/service/network/model/ReplacementStatus;->Companion:Lcom/whoop/service/network/model/ReplacementStatus$Companion;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/ReplacementStatus$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/service/network/model/RestorePerk$$serializer;->INSTANCE:Lcom/whoop/service/network/model/RestorePerk$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/service/network/model/RestoreBffModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/service/network/model/RestoreBffModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/service/network/model/RestoreBffModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/RestoreBffModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;ILjava/lang/Object;)Lcom/whoop/service/network/model/RestoreBffModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/service/network/model/RestoreBffModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)Lcom/whoop/service/network/model/RestoreBffModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/service/network/model/RestoreBffModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/service/network/model/RestoreBffModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/service/network/model/RestoreCta$$serializer;->INSTANCE:Lcom/whoop/service/network/model/RestoreCta$$serializer;

    iget-object p0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/service/network/model/ReplacementStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/RestorePerk;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/service/network/model/RestoreCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)Lcom/whoop/service/network/model/RestoreBffModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/service/network/model/ReplacementStatus;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/RestorePerk;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/service/network/model/RestoreCta;",
            ")",
            "Lcom/whoop/service/network/model/RestoreBffModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subHeader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replacementStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "perks"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/RestoreBffModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/service/network/model/RestoreBffModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/RestoreBffModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/RestoreBffModel;

    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    iget-object p1, p1, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCta()Lcom/whoop/service/network/model/RestoreCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final getPerks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/RestorePerk;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    return-object v0
.end method

.method public final getReplacementStatus()Lcom/whoop/service/network/model/ReplacementStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    return-object v0
.end method

.method public final getSubHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/RestoreCta;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/service/network/model/RestoreBffModel;->header:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subHeader:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/service/network/model/RestoreBffModel;->replacementStatus:Lcom/whoop/service/network/model/ReplacementStatus;

    iget-object v3, p0, Lcom/whoop/service/network/model/RestoreBffModel;->tag:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/service/network/model/RestoreBffModel;->subtitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/service/network/model/RestoreBffModel;->perks:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/service/network/model/RestoreBffModel;->disclaimer:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/service/network/model/RestoreBffModel;->cta:Lcom/whoop/service/network/model/RestoreCta;

    const-string v8, ", subHeader="

    const-string v9, ", replacementStatus="

    const-string v10, "RestoreBffModel(header="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", perks="

    const-string v2, ", disclaimer="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
