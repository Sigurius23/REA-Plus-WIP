.class public final Lcom/whoop/referafriend/domain/models/RafHubResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/referafriend/domain/models/RafHubResponse$$serializer;,
        Lcom/whoop/referafriend/domain/models/RafHubResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB9\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/referafriend/domain/models/RafHubResponse;",
        "",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;",
        "basic",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Full;",
        "full",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;",
        "trials",
        "<init>",
        "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$refer_a_friend_release",
        "(Lcom/whoop/referafriend/domain/models/RafHubResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/referafriend/domain/models/RafHubType$Basic;",
        "component2",
        "()Lcom/whoop/referafriend/domain/models/RafHubType$Full;",
        "component3",
        "()Lcom/whoop/referafriend/domain/models/RafHubType$Trials;",
        "copy",
        "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lcom/whoop/referafriend/domain/models/RafHubResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;",
        "getBasic",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Full;",
        "getFull",
        "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;",
        "getTrials",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/referafriend/domain/models/RafHubResponse$Companion;


# instance fields
.field private final basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

.field private final full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

.field private final trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/referafriend/domain/models/RafHubResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/referafriend/domain/models/RafHubResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->Companion:Lcom/whoop/referafriend/domain/models/RafHubResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->$stable:I

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

    invoke-direct/range {v0 .. v5}, Lcom/whoop/referafriend/domain/models/RafHubResponse;-><init>(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x0

    if-nez p5, :cond_0

    iput-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    :goto_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    iput-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/referafriend/domain/models/RafHubResponse;-><init>(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/referafriend/domain/models/RafHubResponse;Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;ILjava/lang/Object;)Lcom/whoop/referafriend/domain/models/RafHubResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/referafriend/domain/models/RafHubResponse;->copy(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lcom/whoop/referafriend/domain/models/RafHubResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$refer_a_friend_release(Lcom/whoop/referafriend/domain/models/RafHubResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/referafriend/domain/models/RafHubType$Basic$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/RafHubType$Basic$$serializer;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/referafriend/domain/models/RafHubType$Full$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/RafHubType$Full$$serializer;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/referafriend/domain/models/RafHubType$Trials$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/RafHubType$Trials$$serializer;

    iget-object p0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/referafriend/domain/models/RafHubType$Basic;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    return-object v0
.end method

.method public final component2()Lcom/whoop/referafriend/domain/models/RafHubType$Full;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    return-object v0
.end method

.method public final component3()Lcom/whoop/referafriend/domain/models/RafHubType$Trials;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    return-object v0
.end method

.method public final copy(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lcom/whoop/referafriend/domain/models/RafHubResponse;
    .locals 1

    new-instance v0, Lcom/whoop/referafriend/domain/models/RafHubResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/referafriend/domain/models/RafHubResponse;-><init>(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/referafriend/domain/models/RafHubResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/referafriend/domain/models/RafHubResponse;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    iget-object p1, p1, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBasic()Lcom/whoop/referafriend/domain/models/RafHubType$Basic;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    return-object v0
.end method

.method public final getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    return-object v0
.end method

.method public final getTrials()Lcom/whoop/referafriend/domain/models/RafHubType$Trials;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/RafHubType$Basic;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/referafriend/domain/models/RafHubType$Full;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/referafriend/domain/models/RafHubType$Trials;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->basic:Lcom/whoop/referafriend/domain/models/RafHubType$Basic;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->full:Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/RafHubResponse;->trials:Lcom/whoop/referafriend/domain/models/RafHubType$Trials;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RafHubResponse(basic="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", full="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trials="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
