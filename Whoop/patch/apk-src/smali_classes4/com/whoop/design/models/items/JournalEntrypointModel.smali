.class public final Lcom/whoop/design/models/items/JournalEntrypointModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/JournalEntrypointModel$$serializer;,
        Lcom/whoop/design/models/items/JournalEntrypointModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bq\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010!J\u0012\u0010\'\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,Jl\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010!J\u0010\u00100\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010:\u001a\u0004\u0008;\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u0008<\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u0008=\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010>\u001a\u0004\u0008?\u0010(R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010@\u001a\u0004\u0008A\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010B\u001a\u0004\u0008C\u0010,\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/design/models/items/JournalEntrypointModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "icon",
        "title",
        "Lcom/whoop/design/models/items/JournalEntrypointState;",
        "state",
        "cta",
        "bodyText",
        "Lcom/whoop/design/models/items/JournalEntrypointTagModel;",
        "actionTag",
        "",
        "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;",
        "behaviorTags",
        "Lcom/whoop/design/models/items/JournalEntrypointNoteModel;",
        "note",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/JournalEntrypointModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/JournalEntrypointState;",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/JournalEntrypointTagModel;",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lcom/whoop/design/models/items/JournalEntrypointNoteModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)Lcom/whoop/design/models/items/JournalEntrypointModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getTitle",
        "Lcom/whoop/design/models/items/JournalEntrypointState;",
        "getState",
        "getCta",
        "getBodyText",
        "Lcom/whoop/design/models/items/JournalEntrypointTagModel;",
        "getActionTag",
        "Ljava/util/List;",
        "getBehaviorTags",
        "Lcom/whoop/design/models/items/JournalEntrypointNoteModel;",
        "getNote",
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

.field public static final Companion:Lcom/whoop/design/models/items/JournalEntrypointModel$Companion;


# instance fields
.field private final actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

.field private final behaviorTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final bodyText:Ljava/lang/String;

.field private final cta:Ljava/lang/String;

.field private final icon:Ljava/lang/String;

.field private final note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

.field private final state:Lcom/whoop/design/models/items/JournalEntrypointState;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/JournalEntrypointModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/JournalEntrypointModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/JournalEntrypointModel;->Companion:Lcom/whoop/design/models/items/JournalEntrypointModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/JournalEntrypointModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/g;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lw91/g;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/g;

    const/4 v6, 0x3

    invoke-direct {v5, v6}, Lw91/g;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    aput-object v3, v0, v4

    aput-object v1, v0, v6

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/items/JournalEntrypointModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/JournalEntrypointModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/JournalEntrypointModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/JournalEntrypointModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    iput-object p5, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    iput-object p8, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/JournalEntrypointState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/JournalEntrypointTagModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;",
            ">;",
            "Lcom/whoop/design/models/items/JournalEntrypointNoteModel;",
            ")V"
        }
    .end annotation

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorTags"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.JournalEntrypointState"

    invoke-static {}, Lcom/whoop/design/models/items/JournalEntrypointState;->values()[Lcom/whoop/design/models/items/JournalEntrypointState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/JournalEntrypointModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/JournalEntrypointModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/JournalEntrypointModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/JournalEntrypointModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/JournalEntrypointModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/JournalEntrypointModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)Lcom/whoop/design/models/items/JournalEntrypointModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/JournalEntrypointModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/JournalEntrypointModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/JournalEntrypointTagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/JournalEntrypointTagModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/JournalEntrypointNoteModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/JournalEntrypointNoteModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/JournalEntrypointState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/JournalEntrypointTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/JournalEntrypointNoteModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)Lcom/whoop/design/models/items/JournalEntrypointModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/JournalEntrypointState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/JournalEntrypointTagModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;",
            ">;",
            "Lcom/whoop/design/models/items/JournalEntrypointNoteModel;",
            ")",
            "Lcom/whoop/design/models/items/JournalEntrypointModel;"
        }
    .end annotation

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorTags"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/JournalEntrypointModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/JournalEntrypointModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/JournalEntrypointModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getActionTag()Lcom/whoop/design/models/items/JournalEntrypointTagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    return-object v0
.end method

.method public final getBehaviorTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    return-object v0
.end method

.method public final getBodyText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getNote()Lcom/whoop/design/models/items/JournalEntrypointNoteModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    return-object v0
.end method

.method public final getState()Lcom/whoop/design/models/items/JournalEntrypointState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/JournalEntrypointTagModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/JournalEntrypointNoteModel;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->state:Lcom/whoop/design/models/items/JournalEntrypointState;

    iget-object v3, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->cta:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->bodyText:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->actionTag:Lcom/whoop/design/models/items/JournalEntrypointTagModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->behaviorTags:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/design/models/items/JournalEntrypointModel;->note:Lcom/whoop/design/models/items/JournalEntrypointNoteModel;

    const-string v8, ", title="

    const-string v9, ", state="

    const-string v10, "JournalEntrypointModel(icon="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bodyText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", actionTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", behaviorTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", note="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
