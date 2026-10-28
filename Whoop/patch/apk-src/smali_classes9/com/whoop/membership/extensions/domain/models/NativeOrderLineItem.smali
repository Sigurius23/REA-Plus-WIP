.class public final Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$$serializer;,
        Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tBC\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\'\u0012\u0004\u0008)\u0010*\u001a\u0004\u0008(\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010+\u0012\u0004\u0008-\u0010*\u001a\u0004\u0008,\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010+\u0012\u0004\u0008/\u0010*\u001a\u0004\u0008.\u0010\u001bR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010+\u0012\u0004\u00081\u0010*\u001a\u0004\u00080\u0010\u001b\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;",
        "",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;",
        "icon",
        "",
        "title",
        "subtitle",
        "amount",
        "<init>",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "copy",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;",
        "getIcon",
        "getIcon$annotations",
        "()V",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "getSubtitle",
        "getSubtitle$annotations",
        "getAmount",
        "getAmount$annotations",
        "Companion",
        "$serializer",
        "membership_release"
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

.field public static final Companion:Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$Companion;


# instance fields
.field private final amount:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "amount"
    .end annotation
.end field

.field private final icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->Companion:Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$$serializer;

    invoke-virtual {p6}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amount"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->copy(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAmount$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "amount"
    .end annotation

    return-void
.end method

.method public static synthetic getIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon$$serializer;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object p0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amount"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;-><init>(Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAmount()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->icon:Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->amount:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NativeOrderLineItem(icon="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", amount="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
