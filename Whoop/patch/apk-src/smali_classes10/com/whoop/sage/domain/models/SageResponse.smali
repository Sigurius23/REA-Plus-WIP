.class public final Lcom/whoop/sage/domain/models/SageResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sage/domain/models/SageResponse$$serializer;,
        Lcom/whoop/sage/domain/models/SageResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBW\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)JV\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00105\u0012\u0004\u00087\u00108\u001a\u0004\u00086\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010=\u001a\u0004\u0008>\u0010\'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010?\u001a\u0004\u0008@\u0010)\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/sage/domain/models/SageResponse;",
        "",
        "",
        "navigationTitle",
        "Lcom/whoop/design/models/items/TagModel;",
        "navigationTag",
        "Lcom/whoop/sage/domain/models/UnlockedContent;",
        "unlockedContent",
        "Lcom/whoop/sage/domain/models/LockedContent;",
        "lockedContent",
        "Lcom/whoop/sage/domain/models/SageBottomSheetModel;",
        "navigationTagDialogContent",
        "Lcom/whoop/sage/domain/models/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sage_release",
        "(Lcom/whoop/sage/domain/models/SageResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component3",
        "()Lcom/whoop/sage/domain/models/UnlockedContent;",
        "component4",
        "()Lcom/whoop/sage/domain/models/LockedContent;",
        "component5",
        "()Lcom/whoop/sage/domain/models/SageBottomSheetModel;",
        "component6",
        "()Lcom/whoop/sage/domain/models/MetaData;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)Lcom/whoop/sage/domain/models/SageResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "Lcom/whoop/design/models/items/TagModel;",
        "getNavigationTag",
        "getNavigationTag$annotations",
        "()V",
        "Lcom/whoop/sage/domain/models/UnlockedContent;",
        "getUnlockedContent",
        "Lcom/whoop/sage/domain/models/LockedContent;",
        "getLockedContent",
        "Lcom/whoop/sage/domain/models/SageBottomSheetModel;",
        "getNavigationTagDialogContent",
        "Lcom/whoop/sage/domain/models/MetaData;",
        "getMetadata",
        "Companion",
        "$serializer",
        "sage_release"
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

.field public static final Companion:Lcom/whoop/sage/domain/models/SageResponse$Companion;


# instance fields
.field private final lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

.field private final metadata:Lcom/whoop/sage/domain/models/MetaData;

.field private final navigationTag:Lcom/whoop/design/models/items/TagModel;

.field private final navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

.field private final navigationTitle:Ljava/lang/String;

.field private final unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/sage/domain/models/SageResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sage/domain/models/SageResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sage/domain/models/SageResponse;->Companion:Lcom/whoop/sage/domain/models/SageResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/sage/domain/models/SageResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldx2/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/sage/domain/models/SageResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/sage/domain/models/SageResponse$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/SageResponse$$serializer;

    invoke-virtual {p8}, Lcom/whoop/sage/domain/models/SageResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iput-object p4, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    iput-object p5, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    iput-object p6, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    iput-object p7, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)V
    .locals 1

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    .line 6
    iput-object p4, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    .line 7
    iput-object p5, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/design/models/items/TagModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/sage/domain/models/SageResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/sage/domain/models/SageResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/sage/domain/models/SageResponse;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;ILjava/lang/Object;)Lcom/whoop/sage/domain/models/SageResponse;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/sage/domain/models/SageResponse;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)Lcom/whoop/sage/domain/models/SageResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getNavigationTag$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$sage_release(Lcom/whoop/sage/domain/models/SageResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/sage/domain/models/SageResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sage/domain/models/UnlockedContent$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/UnlockedContent$$serializer;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sage/domain/models/LockedContent$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/LockedContent$$serializer;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sage/domain/models/SageBottomSheetModel$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/SageBottomSheetModel$$serializer;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/sage/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/sage/domain/models/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/sage/domain/models/UnlockedContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    return-object v0
.end method

.method public final component4()Lcom/whoop/sage/domain/models/LockedContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    return-object v0
.end method

.method public final component5()Lcom/whoop/sage/domain/models/SageBottomSheetModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/sage/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)Lcom/whoop/sage/domain/models/SageResponse;
    .locals 8

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sage/domain/models/SageResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/sage/domain/models/SageResponse;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sage/domain/models/SageResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sage/domain/models/SageResponse;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    iget-object v3, p1, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    iget-object p1, p1, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getLockedContent()Lcom/whoop/sage/domain/models/LockedContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/sage/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    return-object v0
.end method

.method public final getNavigationTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getNavigationTagDialogContent()Lcom/whoop/sage/domain/models/SageBottomSheetModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnlockedContent()Lcom/whoop/sage/domain/models/UnlockedContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/UnlockedContent;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/LockedContent;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/SageBottomSheetModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/MetaData;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v2, p0, Lcom/whoop/sage/domain/models/SageResponse;->unlockedContent:Lcom/whoop/sage/domain/models/UnlockedContent;

    iget-object v3, p0, Lcom/whoop/sage/domain/models/SageResponse;->lockedContent:Lcom/whoop/sage/domain/models/LockedContent;

    iget-object v4, p0, Lcom/whoop/sage/domain/models/SageResponse;->navigationTagDialogContent:Lcom/whoop/sage/domain/models/SageBottomSheetModel;

    iget-object v5, p0, Lcom/whoop/sage/domain/models/SageResponse;->metadata:Lcom/whoop/sage/domain/models/MetaData;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SageResponse(navigationTitle="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationTag="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unlockedContent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lockedContent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationTagDialogContent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
