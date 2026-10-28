.class public final Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$$serializer;,
        Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0086\u0001\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001cJ\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008;\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008<\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008>\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010=\u001a\u0004\u0008?\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008@\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008A\u0010\u0018R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008C\u0010!R\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008D\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010&\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;",
        "",
        "title",
        "descriptionDisplay",
        "trailingText",
        "",
        "minValue",
        "maxValue",
        "buttonTitle",
        "skipTitle",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "skipNextId",
        "nextId",
        "currentValue",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "progress",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()I",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "component9",
        "component10",
        "()Ljava/lang/Integer;",
        "component11",
        "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;",
        "toString",
        "hashCode",
        "",
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
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getDescriptionDisplay",
        "getTrailingText",
        "I",
        "getMinValue",
        "getMaxValue",
        "getButtonTitle",
        "getSkipTitle",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "getSkipNextId",
        "getNextId",
        "Ljava/lang/Integer;",
        "getCurrentValue",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;",
        "getProgress",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;


# instance fields
.field private final buttonTitle:Ljava/lang/String;

.field private final currentValue:Ljava/lang/Integer;

.field private final descriptionDisplay:Ljava/lang/String;

.field private final maxValue:I

.field private final minValue:I

.field private final nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

.field private final progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

.field private final skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

.field private final skipTitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final trailingText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->Companion:Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lal0/i;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lal0/i;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lal0/i;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lal0/i;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v3, 0xb

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v2, v3, v4

    const/16 v2, 0x8

    aput-object v0, v3, v2

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$$serializer;

    invoke-virtual {p13}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    iput p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    iput-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iput-object p10, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iput-object p11, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    iput-object p12, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextId"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    .line 7
    iput p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    .line 11
    iput-object p9, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    .line 12
    iput-object p10, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    .line 13
    iput-object p11, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId"

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId"

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x4

    iget v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    const/16 v2, 0x9

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final component9()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;
    .locals 13

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingText"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;

    move-object v2, p1

    move-object v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    iget v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    iget v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrentValue()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    return v0
.end method

.method public final getMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    return v0
.end method

.method public final getNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final getProgress()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    return-object v0
.end method

.method public final getSkipNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    return-object v0
.end method

.method public final getSkipTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->descriptionDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->trailingText:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->minValue:I

    iget v4, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->maxValue:I

    iget-object v5, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->buttonTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipTitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->skipNextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v8, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->nextId:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    iget-object v9, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->currentValue:Ljava/lang/Integer;

    iget-object v10, p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/TextNumberPickerScreen;->progress:Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    const-string v11, ", descriptionDisplay="

    const-string v12, ", trailingText="

    const-string v13, "TextNumberPickerScreen(title="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minValue="

    const-string v11, ", maxValue="

    invoke-static {v3, v2, v1, v11, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", buttonTitle="

    const-string v2, ", skipTitle="

    invoke-static {v4, v1, v5, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", skipNextId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
