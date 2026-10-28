.class public final Lcom/whoop/core/details/activitytargets/ActivityTargetZone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/activitytargets/ActivityTargetZone$$serializer;,
        Lcom/whoop/core/details/activitytargets/ActivityTargetZone$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000223B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBK\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JB\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010(\u001a\u00020\u00082\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u0008\t\u0010!\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/core/details/activitytargets/ActivityTargetZone;",
        "",
        "",
        "label",
        "value",
        "target",
        "Ly81/f;",
        "color",
        "",
        "isCompleted",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ly81/f;",
        "component5",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)Lcom/whoop/core/details/activitytargets/ActivityTargetZone;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLabel",
        "getValue",
        "getTarget",
        "Ly81/f;",
        "getColor",
        "Z",
        "Companion",
        "$serializer",
        "a",
        "core-details_release"
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

.field public static final Companion:Lcom/whoop/core/details/activitytargets/ActivityTargetZone$a;


# instance fields
.field private final color:Ly81/f;

.field private final isCompleted:Z

.field private final label:Ljava/lang/String;

.field private final target:Ljava/lang/String;

.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->Companion:Lcom/whoop/core/details/activitytargets/ActivityTargetZone$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwr1/f;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/core/details/activitytargets/ActivityTargetZone$$serializer;->INSTANCE:Lcom/whoop/core/details/activitytargets/ActivityTargetZone$$serializer;

    invoke-virtual {p7}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    iput-boolean p6, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;ZILjava/lang/Object;)Lcom/whoop/core/details/activitytargets/ActivityTargetZone;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)Lcom/whoop/core/details/activitytargets/ActivityTargetZone;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-boolean p0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)Lcom/whoop/core/details/activitytargets/ActivityTargetZone;
    .locals 7

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;

    iget-object v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    iget-object v3, p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    iget-boolean p1, p1, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getTarget()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->label:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->value:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->target:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->color:Ly81/f;

    iget-boolean v4, p0, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->isCompleted:Z

    const-string v5, ", value="

    const-string v6, ", target="

    const-string v7, "ActivityTargetZone(label="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCompleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
