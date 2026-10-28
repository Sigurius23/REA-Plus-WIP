.class public final Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$$serializer;,
        Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBE\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJD\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010(\u001a\u00020\u00022\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010*\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008/\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010*\u001a\u0004\u00080\u0010\u001a\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;",
        "",
        "",
        "showLoading",
        "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "loadingTreatment",
        "showSaving",
        "showSuccess",
        "showError",
        "<init>",
        "(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "component3",
        "component4",
        "component5",
        "copy",
        "(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getShowLoading",
        "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "getLoadingTreatment",
        "getShowSaving",
        "getShowSuccess",
        "getShowError",
        "Companion",
        "$serializer",
        "whoop-action_release"
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

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$Companion;


# instance fields
.field private final loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

.field private final showError:Z

.field private final showLoading:Z

.field private final showSaving:Z

.field private final showSuccess:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->Companion:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(IZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x2

    const/4 v0, 0x2

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$$serializer;

    invoke-virtual {p7}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_1

    iput-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    goto :goto_0

    :cond_1
    iput-boolean p2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    :goto_0
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    goto :goto_1

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    goto :goto_2

    :cond_3
    iput-boolean p5, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    return-void

    :cond_4
    iput-boolean p6, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    return-void
.end method

.method public constructor <init>(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    .line 7
    iput-boolean p5, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    const/4 p5, 0x1

    :cond_3
    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p6}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;-><init>(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->copy(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    if-eqz v1, :cond_1

    :goto_0
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    sget-object v0, Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/LoadingTreatment$$serializer;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    if-eqz v1, :cond_3

    :goto_1
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    if-eqz v1, :cond_5

    :goto_2
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    if-eq v1, v2, :cond_7

    :goto_3
    iget-boolean p0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    return v0
.end method

.method public final component2()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    return v0
.end method

.method public final copy(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;
    .locals 6

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    move v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;-><init>(ZLcom/whoop/whoopaction/domain/models/LoadingTreatment;ZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;

    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    iget-boolean v3, p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    iget-boolean v3, p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    iget-boolean v3, p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    iget-boolean p1, p1, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getLoadingTreatment()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    return-object v0
.end method

.method public final getShowError()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    return v0
.end method

.method public final getShowLoading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    return v0
.end method

.method public final getShowSaving()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    return v0
.end method

.method public final getShowSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showLoading:Z

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->loadingTreatment:Lcom/whoop/whoopaction/domain/models/LoadingTreatment;

    iget-boolean v2, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSaving:Z

    iget-boolean v3, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showSuccess:Z

    iget-boolean v4, p0, Lcom/whoop/whoopaction/domain/models/ActionSequenceFullScreenBehavior;->showError:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ActionSequenceFullScreenBehavior(showLoading="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", loadingTreatment="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showSaving="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showSuccess="

    const-string v1, ", showError="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
