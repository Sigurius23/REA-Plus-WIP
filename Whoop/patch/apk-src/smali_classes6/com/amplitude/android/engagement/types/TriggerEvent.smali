.class public final Lcom/amplitude/android/engagement/types/TriggerEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBM\u0008\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u00c7\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JF\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010#\u00a8\u0006:"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/TriggerEvent;",
        "",
        "",
        "type",
        "",
        "nudgeId",
        "Lcom/amplitude/android/engagement/types/Trigger;",
        "trigger",
        "Lcom/amplitude/android/engagement/types/TriggerSource;",
        "source",
        "Lcom/amplitude/android/engagement/types/TriggerEventOverrides;",
        "overrides",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/TriggerEvent;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "()Lcom/amplitude/android/engagement/types/Trigger;",
        "component4",
        "()Lcom/amplitude/android/engagement/types/TriggerSource;",
        "component5",
        "()Lcom/amplitude/android/engagement/types/TriggerEventOverrides;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)Lcom/amplitude/android/engagement/types/TriggerEvent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getType",
        "Ljava/lang/Integer;",
        "getNudgeId",
        "Lcom/amplitude/android/engagement/types/Trigger;",
        "getTrigger",
        "Lcom/amplitude/android/engagement/types/TriggerSource;",
        "getSource",
        "Lcom/amplitude/android/engagement/types/TriggerEventOverrides;",
        "getOverrides",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/e2",
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
.field public static final $stable:I = 0x8

.field public static final Companion:Lcom/amplitude/android/engagement/types/e2;


# instance fields
.field private final nudgeId:Ljava/lang/Integer;

.field private final overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

.field private final source:Lcom/amplitude/android/engagement/types/TriggerSource;

.field private final trigger:Lcom/amplitude/android/engagement/types/Trigger;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/e2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerEvent;->Companion:Lcom/amplitude/android/engagement/types/e2;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    and-int/lit8 p7, p1, 0xd

    const/16 v0, 0xd

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;

    invoke-virtual {p7}, Lcom/amplitude/android/engagement/types/TriggerEvent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p7, 0x0

    if-nez p2, :cond_1

    iput-object p7, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    :goto_0
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    iput-object p5, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    iput-object p7, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trigger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    .line 5
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    .line 6
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    .line 7
    iput-object p5, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/amplitude/android/engagement/types/TriggerEvent;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/TriggerEvent;Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/TriggerEvent;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/amplitude/android/engagement/types/TriggerEvent;->copy(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)Lcom/amplitude/android/engagement/types/TriggerEvent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/TriggerEvent;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/amplitude/android/engagement/types/Trigger$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/Trigger$$serializer;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/amplitude/android/engagement/types/TriggerSource$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerSource$$serializer;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/amplitude/android/engagement/types/TriggerEventOverrides$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/TriggerEventOverrides$$serializer;

    iget-object p0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Lcom/amplitude/android/engagement/types/Trigger;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    return-object v0
.end method

.method public final component4()Lcom/amplitude/android/engagement/types/TriggerSource;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    return-object v0
.end method

.method public final component5()Lcom/amplitude/android/engagement/types/TriggerEventOverrides;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)Lcom/amplitude/android/engagement/types/TriggerEvent;
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trigger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/amplitude/android/engagement/types/TriggerEvent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/amplitude/android/engagement/types/TriggerEvent;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lcom/amplitude/android/engagement/types/Trigger;Lcom/amplitude/android/engagement/types/TriggerSource;Lcom/amplitude/android/engagement/types/TriggerEventOverrides;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/TriggerEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/TriggerEvent;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getNudgeId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOverrides()Lcom/amplitude/android/engagement/types/TriggerEventOverrides;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    return-object v0
.end method

.method public final getSource()Lcom/amplitude/android/engagement/types/TriggerSource;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    return-object v0
.end method

.method public final getTrigger()Lcom/amplitude/android/engagement/types/Trigger;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Trigger;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/TriggerSource;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/TriggerEventOverrides;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TriggerEvent(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nudgeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->nudgeId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trigger="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->trigger:Lcom/amplitude/android/engagement/types/Trigger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->source:Lcom/amplitude/android/engagement/types/TriggerSource;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overrides="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/TriggerEvent;->overrides:Lcom/amplitude/android/engagement/types/TriggerEventOverrides;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
