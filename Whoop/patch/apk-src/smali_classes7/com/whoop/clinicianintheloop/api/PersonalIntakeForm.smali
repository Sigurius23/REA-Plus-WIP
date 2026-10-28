.class public final Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$$serializer;,
        Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BCBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eB\u007f\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0015Jt\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00103\u001a\u0004\u00085\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00086\u0010\u0015R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00103\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010\u0015R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00103\u0012\u0004\u0008;\u00109\u001a\u0004\u0008:\u0010\u0015R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u0008<\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u0008=\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u0008>\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008?\u0010\u0015R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u0008@\u0010\u0015\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;",
        "",
        "Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "firstName",
        "lastName",
        "dateOfBirth",
        "addressLine1",
        "addressLine2",
        "city",
        "state",
        "zipCode",
        "country",
        "phoneNumber",
        "<init>",
        "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/items/form/FormTextFieldModel;",
        "getFirstName",
        "getLastName",
        "getDateOfBirth",
        "getAddressLine1",
        "getAddressLine1$annotations",
        "()V",
        "getAddressLine2",
        "getAddressLine2$annotations",
        "getCity",
        "getState",
        "getZipCode",
        "getCountry",
        "getPhoneNumber",
        "Companion",
        "$serializer",
        "a",
        "clinician-in-the-loop_release"
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

.field public static final Companion:Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$a;


# instance fields
.field private final addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

.field private final zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->Companion:Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$a;

    sget v0, Lcom/whoop/design/models/items/form/FormTextFieldModel;->$stable:I

    sput v0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$$serializer;

    invoke-virtual {p12}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p7, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p8, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p9, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p10, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iput-object p11, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)V
    .locals 1

    const-string v0, "firstName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateOfBirth"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressLine1"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressLine2"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "city"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zipCode"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumber"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->copy(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAddressLine1$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "address_line_1"
    .end annotation

    return-void
.end method

.method public static synthetic getAddressLine2$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "address_line_2"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/form/FormTextFieldModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/form/FormTextFieldModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object p0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;
    .locals 12

    const-string v0, "firstName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateOfBirth"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressLine1"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressLine2"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "city"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zipCode"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phoneNumber"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v11}, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;-><init>(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;Lcom/whoop/design/models/items/form/FormTextFieldModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAddressLine1()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getAddressLine2()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getCity()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getCountry()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getDateOfBirth()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getFirstName()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getLastName()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getPhoneNumber()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getState()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public final getZipCode()Lcom/whoop/design/models/items/form/FormTextFieldModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/form/FormTextFieldModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->firstName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->lastName:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->dateOfBirth:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine1:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v4, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->addressLine2:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v5, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->city:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v6, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->state:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v7, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->zipCode:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v8, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->country:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    iget-object v9, p0, Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;->phoneNumber:Lcom/whoop/design/models/items/form/FormTextFieldModel;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "PersonalIntakeForm(firstName="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastName="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dateOfBirth="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addressLine1="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addressLine2="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", city="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", zipCode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", country="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", phoneNumber="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
