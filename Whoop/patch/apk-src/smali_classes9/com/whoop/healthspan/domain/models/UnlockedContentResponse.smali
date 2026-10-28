.class public final Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$$serializer;,
        Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KJBo\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u008b\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\"J\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u008c\u0001\u0010)\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00042\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010,\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00101\u001a\u00020\u00042\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102J\'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001\u00a2\u0006\u0004\u00089\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010<\u001a\u0004\u0008=\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010>\u001a\u0004\u0008\u0005\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010?\u001a\u0004\u0008@\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008A\u0010\u001fR\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008C\u0010\"R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008D\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008E\u0010\u001dR\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010B\u001a\u0004\u0008F\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010>\u001a\u0004\u0008G\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010H\u001a\u0004\u0008I\u0010(\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;",
        "",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "datePicker",
        "",
        "isCalibrating",
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "whoopAgeAmoeba",
        "previousWhoopAgeAmoeba",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;",
        "featuredHighlights",
        "hasBeenSeenByUser",
        "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;",
        "amoebaOnboardingSteps",
        "hasOnboarded",
        "healthspanLabsIntroEnabled",
        "<init>",
        "(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component2",
        "()Z",
        "component3",
        "()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$healthspan_release",
        "(Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getDatePicker",
        "Z",
        "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
        "getWhoopAgeAmoeba",
        "getPreviousWhoopAgeAmoeba",
        "Ljava/util/List;",
        "getItems",
        "getFeaturedHighlights",
        "getHasBeenSeenByUser",
        "getAmoebaOnboardingSteps",
        "getHasOnboarded",
        "Ljava/lang/Boolean;",
        "getHealthspanLabsIntroEnabled",
        "Companion",
        "$serializer",
        "healthspan_release"
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

.field public static final Companion:Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$Companion;


# instance fields
.field private final amoebaOnboardingSteps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;",
            ">;"
        }
    .end annotation
.end field

.field private final datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final featuredHighlights:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;",
            ">;"
        }
    .end annotation
.end field

.field private final hasBeenSeenByUser:Z

.field private final hasOnboarded:Z

.field private final healthspanLabsIntroEnabled:Ljava/lang/Boolean;

.field private final isCalibrating:Z

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

.field private final whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->Companion:Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lga1/a;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lga1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lga1/a;

    const/16 v5, 0x19

    invoke-direct {v4, v5}, Lga1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lga1/a;

    const/16 v6, 0x1a

    invoke-direct {v5, v6}, Lga1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xa

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v3, v5, v6

    const/4 v3, 0x5

    aput-object v4, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v2, v5, v3

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$$serializer;

    invoke-virtual {p12}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-boolean p3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    iput-boolean p8, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    iput-object p9, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    iput-boolean p10, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    iput-object p11, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Z",
            "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
            "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;",
            ">;Z",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;",
            ">;Z",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "whoopAgeAmoeba"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featuredHighlights"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amoebaOnboardingSteps"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    .line 6
    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    .line 7
    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    .line 12
    iput-object p10, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthspan/domain/models/FeaturedHighlight$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/FeaturedHighlight$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-boolean p2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    :cond_9
    move p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->copy(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$healthspan_release(Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$$serializer;->INSTANCE:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba$$serializer;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    return v0
.end method

.method public final component3()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    return v0
.end method

.method public final copy(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Z",
            "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
            "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;",
            ">;Z",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;",
            ">;Z",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;"
        }
    .end annotation

    const-string v0, "whoopAgeAmoeba"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featuredHighlights"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amoebaOnboardingSteps"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;-><init>(Lcom/whoop/design/models/items/DateSelectorModel;ZLcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/util/List;Ljava/util/List;ZLjava/util/List;ZLjava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    iget-boolean v3, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAmoebaOnboardingSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    return-object v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getFeaturedHighlights()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/FeaturedHighlight;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    return-object v0
.end method

.method public final getHasBeenSeenByUser()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    return v0
.end method

.method public final getHasOnboarded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    return v0
.end method

.method public final getHealthspanLabsIntroEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getPreviousWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    return-object v0
.end method

.method public final getWhoopAgeAmoeba()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final isCalibrating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-boolean v1, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->isCalibrating:Z

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->whoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->previousWhoopAgeAmoeba:Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    iget-object v4, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->items:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->featuredHighlights:Ljava/util/List;

    iget-boolean v6, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasBeenSeenByUser:Z

    iget-object v7, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->amoebaOnboardingSteps:Ljava/util/List;

    iget-boolean v8, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->hasOnboarded:Z

    iget-object v9, p0, Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;->healthspanLabsIntroEnabled:Ljava/lang/Boolean;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "UnlockedContentResponse(datePicker="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isCalibrating="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", whoopAgeAmoeba="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", previousWhoopAgeAmoeba="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", featuredHighlights="

    const-string v1, ", hasBeenSeenByUser="

    invoke-static {v10, v4, v0, v5, v1}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v0, ", amoebaOnboardingSteps="

    const-string v1, ", hasOnboarded="

    invoke-static {v0, v1, v10, v7, v6}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", healthspanLabsIntroEnabled="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
