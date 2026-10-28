.class public final Lcom/whoop/membership/extensions/domain/models/ProgressContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/extensions/domain/models/ProgressContent$$serializer;,
        Lcom/whoop/membership/extensions/domain/models/ProgressContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'Jb\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010 J\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00084\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00085\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00086\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u00088\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00089\u0010$R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContentType;",
        "type",
        "",
        "icon",
        "title",
        "subtitle",
        "Lcom/whoop/membership/extensions/domain/models/Cta;",
        "primaryCta",
        "secondaryCta",
        "Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "autoDismissAction",
        "<init>",
        "(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/membership/extensions/domain/models/ProgressContentType;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/membership/extensions/domain/models/Cta;",
        "component6",
        "component7",
        "()Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "copy",
        "(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Lcom/whoop/membership/extensions/domain/models/ProgressContent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/membership/extensions/domain/models/ProgressContentType;",
        "getType",
        "Ljava/lang/String;",
        "getIcon",
        "getTitle",
        "getSubtitle",
        "Lcom/whoop/membership/extensions/domain/models/Cta;",
        "getPrimaryCta",
        "getSecondaryCta",
        "Lcom/whoop/membership/extensions/domain/models/CtaAction;",
        "getAutoDismissAction",
        "Companion",
        "$serializer",
        "membership_release"
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

.field public static final Companion:Lcom/whoop/membership/extensions/domain/models/ProgressContent$Companion;


# instance fields
.field private final autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;
    .annotation runtime Lcom/google/gson/annotations/JsonAdapter;
        value = Lcom/whoop/membership/extensions/domain/models/CtaActionAdapter;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "auto_dismiss_action"
    .end annotation
.end field

.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "primary_cta"
    .end annotation
.end field

.field private final secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "secondary_cta"
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

.field private final type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;
    .annotation runtime Lcom/google/gson/annotations/JsonAdapter;
        value = Lcom/whoop/membership/extensions/domain/models/PlaceOrderResponseTypeAdapter;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/membership/extensions/domain/models/ProgressContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/extensions/domain/models/ProgressContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->Companion:Lcom/whoop/membership/extensions/domain/models/ProgressContent$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgw1/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lgw1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lgw1/a;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lgw1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v1, 0x6

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/membership/extensions/domain/models/ProgressContent$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/ProgressContent$$serializer;

    invoke-virtual {p9}, Lcom/whoop/membership/extensions/domain/models/ProgressContent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    iput-object p7, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    iput-object p8, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    .line 8
    iput-object p6, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ProgressContentType;->Companion:Lcom/whoop/membership/extensions/domain/models/ProgressContentType$Companion;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContentType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/CtaAction;->Companion:Lcom/whoop/membership/extensions/domain/models/CtaAction$Companion;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/CtaAction$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/ProgressContent;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->copy(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/membership/extensions/domain/models/Cta$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/Cta$$serializer;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/membership/extensions/domain/models/ProgressContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/membership/extensions/domain/models/Cta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    return-object v0
.end method

.method public final component6()Lcom/whoop/membership/extensions/domain/models/Cta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    return-object v0
.end method

.method public final component7()Lcom/whoop/membership/extensions/domain/models/CtaAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    return-object v0
.end method

.method public final copy(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Lcom/whoop/membership/extensions/domain/models/ProgressContent;
    .locals 9

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;-><init>(Lcom/whoop/membership/extensions/domain/models/ProgressContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/Cta;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    iget-object p1, p1, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAutoDismissAction()Lcom/whoop/membership/extensions/domain/models/CtaAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    return-object v0
.end method

.method public final getSecondaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lcom/whoop/membership/extensions/domain/models/ProgressContentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/Cta;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/Cta;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->type:Lcom/whoop/membership/extensions/domain/models/ProgressContentType;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->subtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->primaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    iget-object v5, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->secondaryCta:Lcom/whoop/membership/extensions/domain/models/Cta;

    iget-object v6, p0, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->autoDismissAction:Lcom/whoop/membership/extensions/domain/models/CtaAction;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ProgressContent(type="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    const-string v1, ", primaryCta="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", secondaryCta="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", autoDismissAction="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
