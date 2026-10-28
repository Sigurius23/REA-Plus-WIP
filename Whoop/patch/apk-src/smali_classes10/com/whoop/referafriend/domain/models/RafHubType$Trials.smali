.class public final Lcom/whoop/referafriend/domain/models/RafHubType$Trials;
.super Lcom/whoop/referafriend/domain/models/RafHubType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/referafriend/domain/models/RafHubType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Trials"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/referafriend/domain/models/RafHubType$Trials$$serializer;,
        Lcom/whoop/referafriend/domain/models/RafHubType$Trials$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBS\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJH\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010/\u0012\u0004\u00081\u00102\u001a\u0004\u00080\u0010\u001eR \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00103\u0012\u0004\u00085\u00102\u001a\u0004\u00084\u0010 R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010-\u0012\u0004\u00087\u00102\u001a\u0004\u00086\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010-\u0012\u0004\u00089\u00102\u001a\u0004\u00088\u0010\u001c\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;",
        "Lcom/whoop/referafriend/domain/models/RafHubType;",
        "",
        "title",
        "",
        "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
        "trialItems",
        "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;",
        "tutorialContent",
        "skipCtaText",
        "continueCtaText",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$refer_a_friend_release",
        "(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/RafHubType$Trials;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/List;",
        "getTrialItems",
        "getTrialItems$annotations",
        "()V",
        "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;",
        "getTutorialContent",
        "getTutorialContent$annotations",
        "getSkipCtaText",
        "getSkipCtaText$annotations",
        "getContinueCtaText",
        "getContinueCtaText$annotations",
        "Companion",
        "$serializer",
        "refer-a-friend_release"
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

.field public static final Companion:Lcom/whoop/referafriend/domain/models/RafHubType$Trials$Companion;


# instance fields
.field private final continueCtaText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "continue_cta_text"
    .end annotation
.end field

.field private final skipCtaText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "skip_cta_text"
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final trialItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trial_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tutorial_content"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->Companion:Lcom/whoop/referafriend/domain/models/RafHubType$Trials$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljx2/b;

    invoke-direct {v3, v0}, Ljx2/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1f

    const/16 v1, 0x1f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/RafHubType$Trials$$serializer;

    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0, p1, p7}, Lcom/whoop/referafriend/domain/models/RafHubType;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    iput-object p5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
            ">;",
            "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trialItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tutorialContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skipCtaText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "continueCtaText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/whoop/referafriend/domain/models/RafHubType;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/referafriend/domain/models/TrialsItemModel$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/TrialsItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/referafriend/domain/models/RafHubType$Trials;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getContinueCtaText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "continue_cta_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSkipCtaText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "skip_cta_text"
    .end annotation

    return-void
.end method

.method public static synthetic getTrialItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trial_items"
    .end annotation

    return-void
.end method

.method public static synthetic getTutorialContent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "tutorial_content"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$refer_a_friend_release(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Lzc3/c;Lyc3/g;)V
    .locals 3

    invoke-static {p0, p1, p2}, Lcom/whoop/referafriend/domain/models/RafHubType;->write$Self(Lcom/whoop/referafriend/domain/models/RafHubType;Lzc3/c;Lyc3/g;)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/TrialsTutorialModel$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel$$serializer;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/RafHubType$Trials;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
            ">;",
            "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trialItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tutorialContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skipCtaText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "continueCtaText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getContinueCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSkipCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrialItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/referafriend/domain/models/TrialsItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    return-object v0
.end method

.method public final getTutorialContent()Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    invoke-virtual {v2}, Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->trialItems:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->tutorialContent:Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;

    iget-object v3, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->skipCtaText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->continueCtaText:Ljava/lang/String;

    const-string v5, ", trialItems="

    const-string v6, ", tutorialContent="

    const-string v7, "Trials(title="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", skipCtaText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", continueCtaText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
