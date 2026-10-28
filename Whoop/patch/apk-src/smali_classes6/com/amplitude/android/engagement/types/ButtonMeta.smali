.class public final Lcom/amplitude/android/engagement/types/ButtonMeta;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/ButtonMeta$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278BI\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u00c7\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJR\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00082\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010/\u001a\u0004\u00085\u0010\u001e\u00a8\u00069"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/ButtonMeta;",
        "",
        "",
        "label",
        "Lcom/amplitude/android/engagement/types/Action;",
        "action",
        "Lcom/amplitude/android/engagement/types/ButtonType;",
        "buttonType",
        "",
        "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;",
        "conditionalActions",
        "defaultAction",
        "<init>",
        "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/ButtonMeta;Lzc3/c;Lyc3/g;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/amplitude/android/engagement/types/Action;",
        "component3",
        "()Lcom/amplitude/android/engagement/types/ButtonType;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "copy",
        "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/ButtonMeta;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLabel",
        "Lcom/amplitude/android/engagement/types/Action;",
        "getAction",
        "Lcom/amplitude/android/engagement/types/ButtonType;",
        "getButtonType",
        "Ljava/util/List;",
        "getConditionalActions",
        "getDefaultAction",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/h",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final $stable:I = 0x8

.field public static final Companion:Lcom/amplitude/android/engagement/types/h;


# instance fields
.field private final action:Lcom/amplitude/android/engagement/types/Action;

.field private final buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

.field private final conditionalActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;",
            ">;"
        }
    .end annotation
.end field

.field private final defaultAction:Lcom/amplitude/android/engagement/types/Action;

.field private final label:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/amplitude/android/engagement/types/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/ButtonMeta;->Companion:Lcom/amplitude/android/engagement/types/h;

    sget-object v0, Lcom/amplitude/android/engagement/types/Action;->Companion:Llj/a;

    invoke-virtual {v0}, Llj/a;->serializer()Lwc3/c;

    move-result-object v1

    sget-object v2, Lcom/amplitude/android/engagement/types/ButtonType;->Companion:Llj/e;

    invoke-virtual {v2}, Llj/e;->serializer()Lwc3/c;

    move-result-object v2

    new-instance v3, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v4, Lcom/amplitude/android/engagement/types/NudgeConditionalAction$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/NudgeConditionalAction$$serializer;

    invoke-direct {v3, v4}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-virtual {v0}, Llj/a;->serializer()Lwc3/c;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Lwc3/c;

    const/4 v5, 0x0

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const/4 v1, 0x4

    aput-object v0, v4, v1

    sput-object v4, Lcom/amplitude/android/engagement/types/ButtonMeta;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/amplitude/android/engagement/types/ButtonMeta;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 3
    sget-object p2, Lcom/amplitude/android/engagement/types/ButtonType;->PRIMARY:Lcom/amplitude/android/engagement/types/ButtonType;

    .line 4
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/amplitude/android/engagement/types/Action;",
            "Lcom/amplitude/android/engagement/types/ButtonType;",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;",
            ">;",
            "Lcom/amplitude/android/engagement/types/Action;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    .line 8
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    .line 9
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    .line 10
    iput-object p5, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 11
    sget-object p3, Lcom/amplitude/android/engagement/types/ButtonType;->PRIMARY:Lcom/amplitude/android/engagement/types/ButtonType;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/amplitude/android/engagement/types/ButtonMeta;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/ButtonMeta;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/ButtonMeta;Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/ButtonMeta;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/amplitude/android/engagement/types/ButtonMeta;->copy(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/ButtonMeta;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/amplitude/android/engagement/types/ButtonMeta;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    sget-object v3, Lcom/amplitude/android/engagement/types/ButtonType;->PRIMARY:Lcom/amplitude/android/engagement/types/ButtonType;

    if-eq v2, v3, :cond_5

    :goto_2
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/amplitude/android/engagement/types/Action;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    return-object v0
.end method

.method public final component3()Lcom/amplitude/android/engagement/types/ButtonType;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/amplitude/android/engagement/types/Action;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/ButtonMeta;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/amplitude/android/engagement/types/Action;",
            "Lcom/amplitude/android/engagement/types/ButtonType;",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;",
            ">;",
            "Lcom/amplitude/android/engagement/types/Action;",
            ")",
            "Lcom/amplitude/android/engagement/types/ButtonMeta;"
        }
    .end annotation

    new-instance v0, Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/amplitude/android/engagement/types/ButtonMeta;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/ButtonMeta;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/ButtonMeta;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAction()Lcom/amplitude/android/engagement/types/Action;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    return-object v0
.end method

.method public final getButtonType()Lcom/amplitude/android/engagement/types/ButtonType;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    return-object v0
.end method

.method public final getConditionalActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    return-object v0
.end method

.method public final getDefaultAction()Lcom/amplitude/android/engagement/types/Action;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ButtonMeta(label="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->label:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->action:Lcom/amplitude/android/engagement/types/Action;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->buttonType:Lcom/amplitude/android/engagement/types/ButtonType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", conditionalActions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->conditionalActions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/ButtonMeta;->defaultAction:Lcom/amplitude/android/engagement/types/Action;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
