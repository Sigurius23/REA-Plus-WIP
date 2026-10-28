.class public final Lcom/whoop/clinicianintheloop/api/StateSelectScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgo0/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/api/StateSelectScreen$$serializer;,
        Lcom/whoop/clinicianintheloop/api/StateSelectScreen$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBM\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JH\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00082\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/StateSelectScreen;",
        "Lgo0/c;",
        "",
        "title",
        "subtitle",
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "image",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "disclaimer",
        "Lcom/whoop/clinicianintheloop/api/StateSelector;",
        "stateSelector",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/api/StateSelectScreen;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/ImageUrlModel;",
        "component4",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component5",
        "()Lcom/whoop/clinicianintheloop/api/StateSelector;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)Lcom/whoop/clinicianintheloop/api/StateSelectScreen;",
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
        "getSubtitle",
        "Lcom/whoop/design/models/items/ImageUrlModel;",
        "getImage",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getDisclaimer",
        "Lcom/whoop/clinicianintheloop/api/StateSelector;",
        "getStateSelector",
        "Companion",
        "$serializer",
        "a",
        "clinician-in-the-loop_release"
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

.field public static final Companion:Lcom/whoop/clinicianintheloop/api/StateSelectScreen$a;


# instance fields
.field private final disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final image:Lcom/whoop/design/models/items/ImageUrlModel;

.field private final stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/api/StateSelectScreen$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->Companion:Lcom/whoop/clinicianintheloop/api/StateSelectScreen$a;

    sget v0, Lcom/whoop/design/models/items/SelectableCellListModel;->$stable:I

    sget v1, Lcom/whoop/design/models/items/SearchFieldModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/InfoCalloutTileModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/ImageUrlModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/clinicianintheloop/api/StateSelectScreen$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/StateSelectScreen$$serializer;

    invoke-virtual {p7}, Lcom/whoop/clinicianintheloop/api/StateSelectScreen$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateSelector"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/api/StateSelectScreen;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/api/StateSelectScreen;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)Lcom/whoop/clinicianintheloop/api/StateSelectScreen;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/api/StateSelectScreen;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/ImageUrlModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImageUrlModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/clinicianintheloop/api/StateSelector$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/StateSelector$$serializer;

    iget-object p0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/ImageUrlModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/clinicianintheloop/api/StateSelector;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)Lcom/whoop/clinicianintheloop/api/StateSelectScreen;
    .locals 7

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateSelector"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImageUrlModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/clinicianintheloop/api/StateSelector;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDisclaimer()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getImage()Lcom/whoop/design/models/items/ImageUrlModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    return-object v0
.end method

.method public final getStateSelector()Lcom/whoop/clinicianintheloop/api/StateSelector;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ImageUrlModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    invoke-virtual {v1}, Lcom/whoop/clinicianintheloop/api/StateSelector;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->image:Lcom/whoop/design/models/items/ImageUrlModel;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->disclaimer:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v4, p0, Lcom/whoop/clinicianintheloop/api/StateSelectScreen;->stateSelector:Lcom/whoop/clinicianintheloop/api/StateSelector;

    const-string v5, ", subtitle="

    const-string v6, ", image="

    const-string v7, "StateSelectScreen(title="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stateSelector="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
