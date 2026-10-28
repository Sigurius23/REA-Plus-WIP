.class public final Lcom/whoop/design/models/items/form/FormTextFieldModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/form/FormTextFieldModel$$serializer;,
        Lcom/whoop/design/models/items/form/FormTextFieldModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B{\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0080\u0001\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\u000b2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00106\u001a\u0004\u00088\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008:\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u0008;\u0010\u0018R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u0008<\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u0008=\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u0008>\u0010\u0018R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010?\u001a\u0004\u0008@\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010#R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010?\u001a\u0004\u0008\u000f\u0010!\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "",
        "",
        "id",
        "label",
        "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;",
        "keyboardType",
        "hintText",
        "text",
        "validRegex",
        "errorMessage",
        "",
        "disabled",
        "Lcom/whoop/design/models/items/form/FormSheetModel;",
        "selectionSheet",
        "isRequired",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Z",
        "component9",
        "()Lcom/whoop/design/models/items/form/FormSheetModel;",
        "component10",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getLabel",
        "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;",
        "getKeyboardType",
        "getHintText",
        "getText",
        "getValidRegex",
        "getErrorMessage",
        "Z",
        "getDisabled",
        "Lcom/whoop/design/models/items/form/FormSheetModel;",
        "getSelectionSheet",
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

.field public static final Companion:Lcom/whoop/design/models/items/form/FormTextFieldModel$Companion;


# instance fields
.field private final disabled:Z

.field private final errorMessage:Ljava/lang/String;

.field private final hintText:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isRequired:Z

.field private final keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

.field private final label:Ljava/lang/String;

.field private final selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

.field private final text:Ljava/lang/String;

.field private final validRegex:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/form/FormTextFieldModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/form/FormTextFieldModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->Companion:Lcom/whoop/design/models/items/form/FormTextFieldModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lf1/z1;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/form/FormTextFieldModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x283

    const/16 v0, 0x283

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/design/models/items/form/FormTextFieldModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/form/FormTextFieldModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/design/models/items/form/FormTextFieldModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    :goto_4
    iput-boolean p9, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    :goto_5
    iput-boolean p11, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    .line 12
    iput-boolean p10, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x4

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_3

    move-object p6, v0

    :cond_3
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_5

    move p11, p10

    move-object p10, v0

    :goto_0
    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p11, p10

    move-object p10, p9

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/items/form/FormTextFieldModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.form.FormTextFieldKeyboardType"

    invoke-static {}, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->values()[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/form/FormTextFieldModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;ZILjava/lang/Object;)Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-boolean p8, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    :cond_9
    move-object p11, p9

    move p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lo91/d;->a:Lo91/d;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x9

    iget-boolean p0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    return v0
.end method

.method public final component9()Lcom/whoop/design/models/items/form/FormSheetModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 12

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/form/FormTextFieldModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/form/FormTextFieldModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getHintText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyboardType()Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectionSheet()Lcom/whoop/design/models/items/form/FormSheetModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getValidRegex()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/form/FormSheetModel;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->keyboardType:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    iget-object v3, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hintText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->text:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->validRegex:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->errorMessage:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->disabled:Z

    iget-object v8, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->selectionSheet:Lcom/whoop/design/models/items/form/FormSheetModel;

    iget-boolean v9, p0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->isRequired:Z

    const-string v10, ", label="

    const-string v11, ", keyboardType="

    const-string v12, "FormTextFieldModel(id="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hintText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", validRegex="

    const-string v2, ", errorMessage="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disabled="

    const-string v2, ", selectionSheet="

    invoke-static {v0, v6, v1, v7, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
