.class public final Lcom/whoop/design/models/cards/TextOnlyCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/NotificationCardModel;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/cards/TextOnlyCardModel$$serializer;,
        Lcom/whoop/design/models/cards/TextOnlyCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002MLB\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u009b\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001bJ\u00a2\u0001\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001bJ\u0010\u0010-\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u00020\n2\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102J\'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001\u00a2\u0006\u0004\u00089\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010<\u001a\u0004\u0008=\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008>\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008?\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010<\u001a\u0004\u0008@\u0010\u001bR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010<\u001a\u0004\u0008A\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008B\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008D\u0010\"R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008F\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010<\u001a\u0004\u0008G\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010<\u001a\u0004\u0008H\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010<\u001a\u0004\u0008I\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010<\u001a\u0004\u0008J\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010<\u001a\u0004\u0008K\u0010\u001b\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/TextOnlyCardModel;",
        "Lcom/whoop/design/models/NotificationCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "appNotificationType",
        "title",
        "body",
        "ctaText",
        "cta",
        "",
        "showHighlight",
        "Lh01/a;",
        "cardType",
        "backgroundStyle",
        "endIcon",
        "titleIconUrl",
        "androidFeatureFlagName",
        "templateName",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Z",
        "component8",
        "()Lh01/a;",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextOnlyCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/cards/TextOnlyCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getAppNotificationType",
        "getTitle",
        "getBody",
        "getCtaText",
        "getCta",
        "Z",
        "getShowHighlight",
        "Lh01/a;",
        "getCardType",
        "getBackgroundStyle",
        "getEndIcon",
        "getTitleIconUrl",
        "getAndroidFeatureFlagName",
        "getTemplateName",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/cards/TextOnlyCardModel$Companion;


# instance fields
.field private final androidFeatureFlagName:Ljava/lang/String;

.field private final appNotificationType:Ljava/lang/String;

.field private final backgroundStyle:Ljava/lang/String;

.field private final body:Ljava/lang/String;

.field private final cardType:Lh01/a;

.field private final cta:Ljava/lang/String;

.field private final ctaText:Ljava/lang/String;

.field private final endIcon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final showHighlight:Z

.field private final templateName:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleIconUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/cards/TextOnlyCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/cards/TextOnlyCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->Companion:Lcom/whoop/design/models/cards/TextOnlyCardModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls52/d;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Ls52/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xd

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

    const/4 v3, 0x7

    aput-object v0, v2, v3

    const/16 v0, 0x8

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    const/16 v0, 0xb

    aput-object v1, v2, v0

    const/16 v0, 0xc

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/cards/TextOnlyCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x17f

    const/16 v1, 0x17f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/cards/TextOnlyCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/TextOnlyCardModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/cards/TextOnlyCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lh01/a;->DEFAULT:Lh01/a;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    goto :goto_0

    :cond_1
    iput-object p9, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    :goto_0
    iput-object p10, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x200

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p11, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p12, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p13, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    :goto_3
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    return-void

    :cond_5
    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardType"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    .line 11
    iput-boolean p7, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    .line 17
    iput-object p13, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p14

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 18
    sget-object v1, Lh01/a;->DEFAULT:Lh01/a;

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v1, v0, 0x200

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v12, v2

    goto :goto_1

    :cond_1
    move-object/from16 v12, p10

    :goto_1
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_2

    move-object v13, v2

    goto :goto_2

    :cond_2
    move-object/from16 v13, p11

    :goto_2
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_3

    move-object v14, v2

    goto :goto_3

    :cond_3
    move-object/from16 v14, p12

    :goto_3
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_4

    move-object v15, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v11, p9

    move-object/from16 v2, p0

    goto :goto_4

    :cond_4
    move-object/from16 v15, p13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v11, p9

    .line 19
    :goto_4
    invoke-direct/range {v2 .. v15}, Lcom/whoop/design/models/cards/TextOnlyCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.card.notification.HomeNotificationCardStyle"

    invoke-static {}, Lh01/a;->values()[Lh01/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/cards/TextOnlyCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/cards/TextOnlyCardModel;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-boolean v6, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    goto :goto_5

    :cond_6
    move/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextOnlyCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/cards/TextOnlyCardModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-boolean v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    sget-object v4, Lh01/a;->DEFAULT:Lh01/a;

    if-eq v3, v4, :cond_1

    :goto_0
    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v0, 0x8

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getAndroidFeatureFlagName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getAndroidFeatureFlagName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextOnlyCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    return v0
.end method

.method public final component8()Lh01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextOnlyCardModel;
    .locals 15

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardType"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/design/models/cards/TextOnlyCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public getAndroidFeatureFlagName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppNotificationType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getCardType()Lh01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowHighlight()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    return v0
.end method

.method public getTemplateName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->appNotificationType:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->title:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->body:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->ctaText:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cta:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->showHighlight:Z

    iget-object v8, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->cardType:Lh01/a;

    iget-object v9, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->endIcon:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->titleIconUrl:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->androidFeatureFlagName:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/cards/TextOnlyCardModel;->templateName:Ljava/lang/String;

    const-string v14, ", appNotificationType="

    const-string v15, ", title="

    const-string v0, "TextOnlyCardModel(id="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    const-string v2, ", ctaText="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", cta="

    const-string v2, ", showHighlight="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endIcon="

    const-string v2, ", titleIconUrl="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", androidFeatureFlagName="

    const-string v2, ", templateName="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v13, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
