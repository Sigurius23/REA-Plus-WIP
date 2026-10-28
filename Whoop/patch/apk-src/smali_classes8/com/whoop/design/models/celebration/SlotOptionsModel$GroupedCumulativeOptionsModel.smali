.class public final Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;
.super Lcom/whoop/design/models/celebration/SlotOptionsModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/celebration/SlotOptionsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GroupedCumulativeOptionsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer;,
        Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tB;\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0018J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008)\u0010\u0018R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008+\u0010\u001b\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;",
        "Lcom/whoop/design/models/celebration/SlotOptionsModel;",
        "",
        "selectedGroup",
        "selectedLevel",
        "",
        "Lcom/whoop/design/models/celebration/SlotGroupModel;",
        "groups",
        "<init>",
        "(IILjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(IILjava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getSelectedGroup",
        "getSelectedLevel",
        "Ljava/util/List;",
        "getGroups",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;


# instance fields
.field private final groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotGroupModel;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedGroup:I

.field private final selectedLevel:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lu91/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lu91/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v1, 0x2

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x7

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0, p1, p5}, Lcom/whoop/design/models/celebration/SlotOptionsModel;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput p2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    iput p3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    iput-object p4, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotGroupModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "groups"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput p1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    .line 4
    iput p2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/celebration/SlotGroupModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/SlotGroupModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;IILjava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->copy(IILjava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    invoke-static {p0, p1, p2}, Lcom/whoop/design/models/celebration/SlotOptionsModel;->write$Self(Lcom/whoop/design/models/celebration/SlotOptionsModel;Lzc3/c;Lyc3/g;)V

    sget-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotGroupModel;",
            ">;)",
            "Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;"
        }
    .end annotation

    const-string v0, "groups"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;

    iget v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    iget v3, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    iget v3, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedGroup()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    return v0
.end method

.method public final getSelectedLevel()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedGroup:I

    iget v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->selectedLevel:I

    iget-object v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$GroupedCumulativeOptionsModel;->groups:Ljava/util/List;

    const-string v3, ", selectedLevel="

    const-string v4, ", groups="

    const-string v5, "GroupedCumulativeOptionsModel(selectedGroup="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
