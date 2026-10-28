.class public final Lcom/whoop/cache/api/prefetch/PrefetchList;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/cache/api/prefetch/PrefetchList$$serializer;,
        Lcom/whoop/cache/api/prefetch/PrefetchList$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\"\u001a\u0004\u0008#\u0010\u0016\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "",
        "",
        "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
        "entries",
        "<init>",
        "(Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$cache_release",
        "(Lcom/whoop/cache/api/prefetch/PrefetchList;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/util/List;)Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getEntries",
        "Companion",
        "$serializer",
        "a",
        "cache_release"
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

.field public static final Companion:Lcom/whoop/cache/api/prefetch/PrefetchList$a;


# instance fields
.field private final entries:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "entries"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/cache/api/prefetch/PrefetchList$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/cache/api/prefetch/PrefetchList;->Companion:Lcom/whoop/cache/api/prefetch/PrefetchList$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lma1/a;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lma1/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ll83/h;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lcom/whoop/cache/api/prefetch/PrefetchList;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    .line 3
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p1, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 7
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/cache/api/prefetch/PrefetchEntry$$serializer;->INSTANCE:Lcom/whoop/cache/api/prefetch/PrefetchEntry$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/cache/api/prefetch/PrefetchList;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/cache/api/prefetch/PrefetchList;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/cache/api/prefetch/PrefetchList;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/cache/api/prefetch/PrefetchList;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/cache/api/prefetch/PrefetchList;->copy(Ljava/util/List;)Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$cache_release(Lcom/whoop/cache/api/prefetch/PrefetchList;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/cache/api/prefetch/PrefetchList;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lcom/whoop/cache/api/prefetch/PrefetchList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
            ">;)",
            "Lcom/whoop/cache/api/prefetch/PrefetchList;"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-direct {v0, p1}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/cache/api/prefetch/PrefetchList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/cache/api/prefetch/PrefetchList;

    iget-object v1, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/cache/api/prefetch/PrefetchList;->entries:Ljava/util/List;

    const-string v1, "PrefetchList(entries="

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lte0/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
