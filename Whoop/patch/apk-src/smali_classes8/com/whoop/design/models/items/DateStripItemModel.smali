.class public final Lcom/whoop/design/models/items/DateStripItemModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DateStripItemModel$$serializer;,
        Lcom/whoop/design/models/items/DateStripItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBK\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JD\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00082\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u0008\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010%\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DateStripItemModel;",
        "",
        "",
        "date",
        "Lcom/whoop/design/models/items/DateStripDateDisplayModel;",
        "dateDisplay",
        "Lcom/whoop/design/models/items/DateStripEntryStatus;",
        "entryStatus",
        "",
        "isSelected",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/DateStripItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/DateStripDateDisplayModel;",
        "component3",
        "()Lcom/whoop/design/models/items/DateStripEntryStatus;",
        "component4",
        "()Z",
        "component5",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DateStripItemModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDate",
        "Lcom/whoop/design/models/items/DateStripDateDisplayModel;",
        "getDateDisplay",
        "Lcom/whoop/design/models/items/DateStripEntryStatus;",
        "getEntryStatus",
        "Z",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
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

.field public static final Companion:Lcom/whoop/design/models/items/DateStripItemModel$Companion;


# instance fields
.field private final date:Ljava/lang/String;

.field private final dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

.field private final entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final isSelected:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/DateStripItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DateStripItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DateStripItemModel;->Companion:Lcom/whoop/design/models/items/DateStripItemModel$Companion;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/design/models/items/DateStripItemModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/c;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lw91/c;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/DateStripItemModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x13

    const/16 v0, 0x13

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/items/DateStripItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateStripItemModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/DateStripItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lcom/whoop/design/models/items/DateStripEntryStatus;->NO:Lcom/whoop/design/models/items/DateStripEntryStatus;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    goto :goto_1

    :cond_2
    iput-boolean p5, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    :goto_1
    iput-object p6, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entryStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    .line 8
    iput-boolean p4, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 10
    sget-object p3, Lcom/whoop/design/models/items/DateStripEntryStatus;->NO:Lcom/whoop/design/models/items/DateStripEntryStatus;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/DateStripItemModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DateStripEntryStatus;->Companion:Lcom/whoop/design/models/items/DateStripEntryStatus$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateStripEntryStatus$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/DateStripItemModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/DateStripItemModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DateStripItemModel;Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/design/models/items/DateStripItemModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/DateStripItemModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DateStripItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DateStripItemModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/DateStripItemModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/items/DateStripDateDisplayModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateStripDateDisplayModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    sget-object v3, Lcom/whoop/design/models/items/DateStripEntryStatus;->NO:Lcom/whoop/design/models/items/DateStripEntryStatus;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    if-eqz v1, :cond_3

    :goto_1
    iget-boolean v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/DateStripDateDisplayModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/DateStripEntryStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    return v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/DateStripItemModel;
    .locals 7

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entryStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/DateStripItemModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/DateStripItemModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/DateStripDateDisplayModel;Lcom/whoop/design/models/items/DateStripEntryStatus;ZLcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DateStripItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DateStripItemModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateDisplay()Lcom/whoop/design/models/items/DateStripDateDisplayModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    return-object v0
.end method

.method public final getEntryStatus()Lcom/whoop/design/models/items/DateStripEntryStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateStripDateDisplayModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/DateStripItemModel;->date:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/DateStripItemModel;->dateDisplay:Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateStripItemModel;->entryStatus:Lcom/whoop/design/models/items/DateStripEntryStatus;

    iget-boolean v3, p0, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected:Z

    iget-object v4, p0, Lcom/whoop/design/models/items/DateStripItemModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DateStripItemModel(date="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dateDisplay="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", entryStatus="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", interaction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
