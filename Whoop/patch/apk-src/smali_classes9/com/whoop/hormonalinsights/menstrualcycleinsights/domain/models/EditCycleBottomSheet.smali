.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB9\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;",
        "",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;",
        "editOption",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;",
        "hideOption",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;",
        "unhideOption",
        "<init>",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;",
        "component2",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;",
        "component3",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;",
        "copy",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;",
        "getEditOption",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;",
        "getHideOption",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;",
        "getUnhideOption",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$Companion;


# instance fields
.field private final editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

.field private final hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

.field private final unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$$serializer;

    invoke-virtual {p5}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->copy(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    return-object v0
.end method

.method public final component2()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    return-object v0
.end method

.method public final component3()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    return-object v0
.end method

.method public final copy(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;
    .locals 1

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEditOption()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    return-object v0
.end method

.method public final getHideOption()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    return-object v0
.end method

.method public final getUnhideOption()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->editOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->unhideOption:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EditCycleBottomSheet(editOption="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hideOption="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unhideOption="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
