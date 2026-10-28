.class public enum Lcom/stripe/android/uicore/address/FieldType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/address/FieldType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0081\u0002\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B#\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u000cj\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldType;",
        "",
        "",
        "serializedValue",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "identifierSpec",
        "",
        "defaultLabel",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V",
        "Lq3/m;",
        "capitalization-IUNYP9k",
        "()I",
        "capitalization",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getIdentifierSpec",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "I",
        "getDefaultLabel",
        "Companion",
        "e40/d",
        "AddressLine1",
        "AddressLine2",
        "Locality",
        "DependentLocality",
        "PostalCode",
        "SortingCode",
        "AdministrativeArea",
        "Name",
        "stripe-ui-core_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/address/FieldType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum AddressLine1:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "addressLine1"
    .end annotation
.end field

.field public static final enum AddressLine2:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "addressLine2"
    .end annotation
.end field

.field public static final enum AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "administrativeArea"
    .end annotation
.end field

.field public static final Companion:Le40/d;

.field public static final enum DependentLocality:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "dependentLocality"
    .end annotation
.end field

.field public static final enum Locality:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "locality"
    .end annotation
.end field

.field public static final enum Name:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "name"
    .end annotation
.end field

.field public static final enum PostalCode:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "postalCode"
    .end annotation
.end field

.field public static final enum SortingCode:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime Lwc3/h;
        value = "sortingCode"
    .end annotation
.end field


# instance fields
.field private final defaultLabel:I

.field private final identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/address/FieldType;
    .locals 8

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v1, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v5, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v6, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    sget-object v7, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    const v5, 0x7f140f6e

    const-string v1, "AddressLine1"

    const/4 v2, 0x0

    const-string v3, "addressLine1"

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v1, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    const v6, 0x7f140f70

    const-string v2, "AddressLine2"

    const/4 v3, 0x1

    const-string v4, "addressLine2"

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v1, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v2, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    const v7, 0x7f140f78

    const-string v3, "Locality"

    const/4 v4, 0x2

    const-string v5, "locality"

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v3, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getDependentLocality$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    const v8, 0x7f140f78

    const-string v4, "DependentLocality"

    const/4 v5, 0x3

    const-string v6, "dependentLocality"

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v3, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v4, Le40/e;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    const v9, 0x7f140f8e

    const/4 v10, 0x0

    const-string v5, "PostalCode"

    const/4 v6, 0x4

    const-string v7, "postalCode"

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v5, Le40/f;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSortingCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    const v10, 0x7f140f8e

    const/4 v11, 0x0

    const-string v6, "SortingCode"

    const/4 v7, 0x5

    const-string v8, "sortingCode"

    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v6, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    sget-object v0, Lcom/stripe/android/uicore/address/NameType;->State:Lcom/stripe/android/uicore/address/NameType;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/address/NameType;->getStringResId()I

    move-result v11

    const-string v7, "AdministrativeArea"

    const/4 v8, 0x6

    const-string v9, "administrativeArea"

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v6, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    const v5, 0x7f140f80

    const-string v1, "Name"

    const/4 v2, 0x7

    const-string v3, "name"

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->$values()[Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$VALUES:[Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$ENTRIES:Lt83/a;

    new-instance v0, Le40/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->Companion:Le40/d;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Ldx2/a;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldType;->serializedValue:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/stripe/android/uicore/address/FieldType;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 5
    iput p5, p0, Lcom/stripe/android/uicore/address/FieldType;->defaultLabel:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 10

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->values()[Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    const-string v7, "administrativeArea"

    const-string v8, "name"

    const-string v1, "addressLine1"

    const-string v2, "addressLine2"

    const-string v3, "locality"

    const-string v4, "dependentLocality"

    const-string v5, "postalCode"

    const-string v6, "sortingCode"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    filled-new-array/range {v2 .. v9}, [[Ljava/lang/annotation/Annotation;

    move-result-object v2

    const-string v4, "com.stripe.android.uicore.address.FieldType"

    invoke-static {v4, v0, v1, v2, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/address/FieldType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$VALUES:[Lcom/stripe/android/uicore/address/FieldType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/uicore/address/FieldType;

    return-object v0
.end method


# virtual methods
.method public capitalization-IUNYP9k()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final getDefaultLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/address/FieldType;->defaultLabel:I

    return v0
.end method

.method public final getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldType;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldType;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
