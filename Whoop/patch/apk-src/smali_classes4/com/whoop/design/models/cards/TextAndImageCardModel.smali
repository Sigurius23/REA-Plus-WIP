.class public final Lcom/whoop/design/models/cards/TextAndImageCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/NotificationCardModel;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/cards/TextAndImageCardModel$$serializer;,
        Lcom/whoop/design/models/cards/TextAndImageCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002JIB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001aJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u0094\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020\t2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008;\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010:\u001a\u0004\u0008<\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008=\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008>\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008?\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008A\u0010 R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008C\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010:\u001a\u0004\u0008D\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008E\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008F\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010:\u001a\u0004\u0008G\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010:\u001a\u0004\u0008H\u0010\u001a\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/TextAndImageCardModel;",
        "Lcom/whoop/design/models/NotificationCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "appNotificationType",
        "title",
        "body",
        "imageUrl",
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
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Z",
        "component7",
        "()Lh01/a;",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextAndImageCardModel;",
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
        "(Lcom/whoop/design/models/cards/TextAndImageCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getAppNotificationType",
        "getTitle",
        "getBody",
        "getImageUrl",
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

.field public static final Companion:Lcom/whoop/design/models/cards/TextAndImageCardModel$Companion;


# instance fields
.field private final androidFeatureFlagName:Ljava/lang/String;

.field private final appNotificationType:Ljava/lang/String;

.field private final backgroundStyle:Ljava/lang/String;

.field private final body:Ljava/lang/String;

.field private final cardType:Lh01/a;

.field private final endIcon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final showHighlight:Z

.field private final templateName:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleIconUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/cards/TextAndImageCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/cards/TextAndImageCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->Companion:Lcom/whoop/design/models/cards/TextAndImageCardModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lt42/a;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lt42/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xc

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

    aput-object v0, v2, v3

    const/4 v0, 0x7

    aput-object v1, v2, v0

    const/16 v0, 0x8

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    const/16 v0, 0xb

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/cards/TextAndImageCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xbf

    const/16 v0, 0xbf

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/design/models/cards/TextAndImageCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/TextAndImageCardModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/design/models/cards/TextAndImageCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lh01/a;->DEFAULT:Lh01/a;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    :goto_0
    iput-object p9, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x100

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p10, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    :goto_1
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p11, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p12, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    :goto_3
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    return-void

    :cond_5
    iput-object p13, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Lh01/a;->DEFAULT:Lh01/a;

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p7

    :goto_0
    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object/from16 v11, p9

    :goto_1
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object/from16 v12, p10

    :goto_2
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_3

    move-object v13, v2

    goto :goto_3

    :cond_3
    move-object/from16 v13, p11

    :goto_3
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_4

    move-object v14, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v10, p8

    move-object v2, p0

    goto :goto_4

    :cond_4
    move-object/from16 v14, p12

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v10, p8

    .line 18
    :goto_4
    invoke-direct/range {v2 .. v14}, Lcom/whoop/design/models/cards/TextAndImageCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-static {}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/cards/TextAndImageCardModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/cards/TextAndImageCardModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-boolean p6, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextAndImageCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/cards/TextAndImageCardModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getAppNotificationType()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x5

    iget-boolean v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    sget-object v4, Lh01/a;->DEFAULT:Lh01/a;

    if-eq v3, v4, :cond_1

    :goto_0
    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x7

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getAndroidFeatureFlagName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getAndroidFeatureFlagName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/TextAndImageCardModel;->getTemplateName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    return v0
.end method

.method public final component7()Lh01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/cards/TextAndImageCardModel;
    .locals 14

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/cards/TextAndImageCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLh01/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public getAndroidFeatureFlagName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    return-object v0
.end method

.method public getAppNotificationType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    return-object v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getCardType()Lh01/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowHighlight()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    return v0
.end method

.method public getTemplateName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->appNotificationType:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->body:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->imageUrl:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->showHighlight:Z

    iget-object v6, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->cardType:Lh01/a;

    iget-object v7, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->backgroundStyle:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->endIcon:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->titleIconUrl:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->androidFeatureFlagName:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/design/models/cards/TextAndImageCardModel;->templateName:Ljava/lang/String;

    const-string v12, ", appNotificationType="

    const-string v13, ", title="

    const-string v14, "TextAndImageCardModel(id="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    const-string v12, ", imageUrl="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", showHighlight="

    const-string v2, ", cardType="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", titleIconUrl="

    const-string v2, ", androidFeatureFlagName="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", templateName="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
