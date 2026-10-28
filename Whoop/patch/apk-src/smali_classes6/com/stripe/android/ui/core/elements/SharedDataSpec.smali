.class public final Lcom/stripe/android/ui/core/elements/SharedDataSpec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;<B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0008\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bB?\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J \u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J@\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0018\u0008\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\"J\u0010\u0010*\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010 J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00100\u0012\u0004\u00082\u00103\u001a\u0004\u00081\u0010\"R0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\u0008\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00104\u0012\u0004\u00086\u00103\u001a\u0004\u00085\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00107\u0012\u0004\u00089\u00103\u001a\u0004\u00088\u0010&\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "Landroid/os/Parcelable;",
        "",
        "type",
        "Ljava/util/ArrayList;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "Lkotlin/collections/ArrayList;",
        "fields",
        "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
        "selectorIcon",
        "<init>",
        "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_ui_core_release",
        "(Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/ArrayList;",
        "component3",
        "()Lcom/stripe/android/ui/core/elements/SelectorIcon;",
        "copy",
        "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getType",
        "getType$annotations",
        "()V",
        "Ljava/util/ArrayList;",
        "getFields",
        "getFields$annotations",
        "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
        "getSelectorIcon",
        "getSelectorIcon$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/ui/core/elements/z",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/z;


# instance fields
.field private final fields:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/ui/core/elements/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->Companion:Lcom/stripe/android/ui/core/elements/z;

    new-instance v0, Lx30/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lx30/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lx30/w0;->c:Lx30/w0;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/4 v1, 0x3

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const/4 v0, 0x2

    aput-object v3, v1, v0

    sput-object v1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;",
            "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
            ")V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    .line 7
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/SharedDataSpec;Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->copy(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getFields$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "fields"
    .end annotation

    return-void
.end method

.method public static synthetic getSelectorIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "selector_icon"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_ui_core_release(Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/ui/core/elements/SelectorIcon$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/SelectorIcon$$serializer;

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/ui/core/elements/SelectorIcon;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)Lcom/stripe/android/ui/core/elements/SharedDataSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;",
            "Lcom/stripe/android/ui/core/elements/SelectorIcon;",
            ")",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    iget-object p1, p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFields()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SharedDataSpec(type="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fields="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectorIcon="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->type:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->fields:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->selectorIcon:Lcom/stripe/android/ui/core/elements/SelectorIcon;

    if-nez v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
