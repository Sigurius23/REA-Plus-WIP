.class public final Lcom/whoop/activation/domain/models/steps/TrialPlanOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/activation/domain/models/steps/PlanPickerOption;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;,
        Lcom/whoop/activation/domain/models/steps/TrialPlanOption$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 R2\u00020\u0001:\u0002SRBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010#J\u0012\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010#J\u0010\u0010)\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0098\u0001\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010#J\u0010\u00100\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00104\u001a\u00020\u00022\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105J\'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001\u00a2\u0006\u0004\u0008<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010?\u001a\u0004\u0008@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010A\u001a\u0004\u0008B\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010A\u001a\u0004\u0008C\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010A\u001a\u0004\u0008D\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010A\u001a\u0004\u0008E\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010F\u001a\u0004\u0008G\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008H\u0010\u001cR\u0017\u0010\u000c\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010F\u001a\u0004\u0008I\u0010#R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010F\u001a\u0004\u0008J\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010F\u001a\u0004\u0008K\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008L\u0010#R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010M\u001a\u0004\u0008N\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010O\u001a\u0004\u0008P\u0010,R\u0014\u0010Q\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010\u001c\u00a8\u0006T"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/TrialPlanOption;",
        "Lcom/whoop/activation/domain/models/steps/PlanPickerOption;",
        "",
        "shouldSkipNextScreen",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "price",
        "priceSubtitle",
        "",
        "disclaimer",
        "selected",
        "membershipTier",
        "trackingLabel",
        "tag",
        "strikethroughPrice",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "commitmentType",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Z",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/String;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "component13",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;",
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
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/TrialPlanOption;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Z",
        "getShouldSkipNextScreen",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getSubtitle",
        "getPrice",
        "getPriceSubtitle",
        "Ljava/lang/String;",
        "getDisclaimer",
        "getSelected",
        "getMembershipTier",
        "getTrackingLabel",
        "getTag",
        "getStrikethroughPrice",
        "Lcom/whoop/activation/domain/models/steps/CommitmentType;",
        "getCommitmentType",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "isSelected",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/TrialPlanOption$Companion;


# instance fields
.field private final commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

.field private final destination:Lcom/whoop/navigation/e;

.field private final disclaimer:Ljava/lang/String;

.field private final membershipTier:Ljava/lang/String;

.field private final price:Lcom/whoop/design/util/TextResource;

.field private final priceSubtitle:Lcom/whoop/design/util/TextResource;

.field private final selected:Z

.field private final shouldSkipNextScreen:Z

.field private final strikethroughPrice:Ljava/lang/String;

.field private final subtitle:Lcom/whoop/design/util/TextResource;

.field private final tag:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final trackingLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->Companion:Lcom/whoop/activation/domain/models/steps/TrialPlanOption$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lr70/b;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lr70/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lr70/b;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lr70/b;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v4, 0xd

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v1, v4, v6

    const/4 v6, 0x2

    aput-object v1, v4, v6

    const/4 v6, 0x3

    aput-object v1, v4, v6

    const/4 v6, 0x4

    aput-object v1, v4, v6

    const/4 v6, 0x5

    aput-object v1, v4, v6

    const/4 v6, 0x6

    aput-object v1, v4, v6

    const/4 v6, 0x7

    aput-object v1, v4, v6

    const/16 v6, 0x8

    aput-object v1, v4, v6

    const/16 v6, 0x9

    aput-object v1, v4, v6

    aput-object v1, v4, v3

    aput-object v2, v4, v5

    const/16 v1, 0xc

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1fff

    const/16 v1, 0x1fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceSubtitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTier"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commitmentType"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    .line 15
    iput-object p13, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.activation.domain.models.steps.CommitmentType"

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/CommitmentType;->values()[Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/TrialPlanOption;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-boolean p1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-boolean v6, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    goto :goto_5

    :cond_6
    move/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move p3, p1

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
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->copy(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/TrialPlanOption;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    const/16 v3, 0x9

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;

    move-result-object v3

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/activation/domain/models/steps/CommitmentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    return-object v0
.end method

.method public final component13()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)Lcom/whoop/activation/domain/models/steps/TrialPlanOption;
    .locals 15

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "priceSubtitle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTier"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commitmentType"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    move/from16 v2, p1

    move/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/CommitmentType;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;

    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    iget-boolean v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    iget-boolean v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public getCommitmentType()Lcom/whoop/activation/domain/models/steps/CommitmentType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getMembershipTier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPriceSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    return v0
.end method

.method public final getShouldSkipNextScreen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    return v0
.end method

.method public final getStrikethroughPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTrackingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
.end method

.method public isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->shouldSkipNextScreen:Z

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->price:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->priceSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->disclaimer:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->selected:Z

    iget-object v7, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->membershipTier:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->trackingLabel:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->tag:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->strikethroughPrice:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->commitmentType:Lcom/whoop/activation/domain/models/steps/CommitmentType;

    iget-object v12, p0, Lcom/whoop/activation/domain/models/steps/TrialPlanOption;->destination:Lcom/whoop/navigation/e;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "TrialPlanOption(shouldSkipNextScreen="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", price="

    const-string v1, ", priceSubtitle="

    invoke-static {v13, v2, v0, v3, v1}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v0, ", disclaimer="

    const-string v1, ", selected="

    invoke-static {v13, v4, v0, v5, v1}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", membershipTier="

    const-string v1, ", trackingLabel="

    invoke-static {v13, v6, v0, v7, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", tag="

    const-string v1, ", strikethroughPrice="

    invoke-static {v13, v8, v0, v9, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", commitmentType="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v13, v12, v0}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
