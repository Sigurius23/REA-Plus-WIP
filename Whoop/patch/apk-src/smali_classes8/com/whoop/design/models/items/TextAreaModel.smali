.class public final Lcom/whoop/design/models/items/TextAreaModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/TextAreaModel$$serializer;,
        Lcom/whoop/design/models/items/TextAreaModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;BS\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eBg\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001dJj\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0010\u0010*\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010$J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00083\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00085\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00086\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00089\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00100\u001a\u0004\u0008:\u0010\u001d\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/design/models/items/TextAreaModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "label",
        "text",
        "Lcom/whoop/design/util/TextResource;",
        "hintText",
        "errorMessage",
        "",
        "maxLines",
        "maxCharacterCount",
        "stateUpdateValueKey",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/TextAreaModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/util/TextResource;",
        "component5",
        "component6",
        "()I",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)Lcom/whoop/design/models/items/TextAreaModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getLabel",
        "getText",
        "Lcom/whoop/design/util/TextResource;",
        "getHintText",
        "getErrorMessage",
        "I",
        "getMaxLines",
        "getMaxCharacterCount",
        "getStateUpdateValueKey",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/TextAreaModel$Companion;


# instance fields
.field private final errorMessage:Ljava/lang/String;

.field private final hintText:Lcom/whoop/design/util/TextResource;

.field private final id:Ljava/lang/String;

.field private final label:Ljava/lang/String;

.field private final maxCharacterCount:I

.field private final maxLines:I

.field private final stateUpdateValueKey:Ljava/lang/String;

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/TextAreaModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/TextAreaModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/TextAreaModel;->Companion:Lcom/whoop/design/models/items/TextAreaModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/TextAreaModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/items/TextAreaModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TextAreaModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/items/TextAreaModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    iput p7, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    iput p8, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p9, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)V
    .locals 1

    const-string v0, "hintText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    .line 9
    iput p7, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/TextAreaModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/TextAreaModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/TextAreaModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    :cond_7
    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/TextAreaModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)Lcom/whoop/design/models/items/TextAreaModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/TextAreaModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    iget-object p0, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)Lcom/whoop/design/models/items/TextAreaModel;
    .locals 10

    const-string v0, "hintText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/TextAreaModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/TextAreaModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/TextAreaModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/TextAreaModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    iget v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    iget v3, p1, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getHintText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxCharacterCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    return v0
.end method

.method public final getMaxLines()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    return v0
.end method

.method public final getStateUpdateValueKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/TextAreaModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/TextAreaModel;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/TextAreaModel;->text:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/TextAreaModel;->hintText:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/design/models/items/TextAreaModel;->errorMessage:Ljava/lang/String;

    iget v5, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxLines:I

    iget v6, p0, Lcom/whoop/design/models/items/TextAreaModel;->maxCharacterCount:I

    iget-object v7, p0, Lcom/whoop/design/models/items/TextAreaModel;->stateUpdateValueKey:Ljava/lang/String;

    const-string v8, ", label="

    const-string v9, ", text="

    const-string v10, "TextAreaModel(id="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hintText="

    const-string v8, ", errorMessage="

    invoke-static {v0, v2, v1, v3, v8}, Lq63/c;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", maxLines="

    const-string v2, ", maxCharacterCount="

    invoke-static {v5, v4, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", stateUpdateValueKey="

    const-string v2, ")"

    invoke-static {v6, v1, v7, v2, v0}, Ly00/t7;->f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
