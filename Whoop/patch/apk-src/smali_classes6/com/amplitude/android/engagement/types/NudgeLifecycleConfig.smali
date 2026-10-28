.class public final Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 +2\u00020\u0001:\u0002,-B/\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tB?\u0008\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u00c7\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010&\u001a\u0004\u0008\'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010&\u001a\u0004\u0008(\u0010\u0018R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008*\u0010\u001b\u00a8\u0006."
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
        "",
        "",
        "stopShowingIfCompleted",
        "stopShowingIfDismissed",
        "",
        "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;",
        "cooldownLimits",
        "<init>",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()Ljava/lang/Boolean;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Boolean;",
        "getStopShowingIfCompleted",
        "getStopShowingIfDismissed",
        "Ljava/util/List;",
        "getCooldownLimits",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/u0",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final $stable:I = 0x8

.field public static final Companion:Lcom/amplitude/android/engagement/types/u0;


# instance fields
.field private final cooldownLimits:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;",
            ">;"
        }
    .end annotation
.end field

.field private final stopShowingIfCompleted:Ljava/lang/Boolean;

.field private final stopShowingIfDismissed:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/amplitude/android/engagement/types/u0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->Companion:Lcom/amplitude/android/engagement/types/u0;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeCooldownLimit$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/4 v1, 0x3

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    sput-object v1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x0

    if-nez p5, :cond_0

    iput-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    :goto_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 3
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cooldownLimits"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    .line 7
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    .line 8
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 9
    sget-object p3, Lm83/y;->w:Lm83/y;

    .line 10
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;",
            ">;)",
            "Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;"
        }
    .end annotation

    const-string v0, "cooldownLimits"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    invoke-direct {v0, p1, p2, p3}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCooldownLimits()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    return-object v0
.end method

.method public final getStopShowingIfCompleted()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStopShowingIfDismissed()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NudgeLifecycleConfig(stopShowingIfCompleted="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfCompleted:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stopShowingIfDismissed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->stopShowingIfDismissed:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cooldownLimits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->cooldownLimits:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
