.class public final Lcom/whoop/activation/domain/models/steps/ConsentsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;,
        Lcom/whoop/activation/domain/models/steps/ConsentsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008&\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBo\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010%J\u0010\u0010)\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010%Jj\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00100\u001a\u00020\u00082\u0008\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00087\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u00089\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008;\u0010\'R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u0008<\u0010%R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00108\u001a\u0004\u0008=\u0010%\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
        "",
        "",
        "id",
        "region",
        "consent",
        "consentText",
        "fullTermsUrl",
        "",
        "consentRequired",
        "Lcom/whoop/activation/domain/models/steps/TermExpansion;",
        "expansionType",
        "expansionRequired",
        "bottomScrollAllowed",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/ConsentsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Z",
        "component7",
        "()Lcom/whoop/activation/domain/models/steps/TermExpansion;",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getRegion",
        "getConsent",
        "getConsentText",
        "getFullTermsUrl",
        "Z",
        "getConsentRequired",
        "Lcom/whoop/activation/domain/models/steps/TermExpansion;",
        "getExpansionType",
        "getExpansionRequired",
        "getBottomScrollAllowed",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/ConsentsModel$Companion;


# instance fields
.field private final bottomScrollAllowed:Z

.field private final consent:Ljava/lang/String;

.field private final consentRequired:Z

.field private final consentText:Ljava/lang/String;

.field private final expansionRequired:Z

.field private final expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

.field private final fullTermsUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final region:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/steps/ConsentsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/ConsentsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->Companion:Lcom/whoop/activation/domain/models/steps/ConsentsModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lqv1/e;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lqv1/e;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x9

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v0, v2, v3

    const/4 v0, 0x7

    aput-object v1, v2, v0

    const/16 v0, 0x8

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    iput-boolean p9, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    iput-boolean p10, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consentText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fullTermsUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expansionType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    .line 11
    iput-boolean p9, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.activation.domain.models.steps.TermExpansion"

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/TermExpansion;->values()[Lcom/whoop/activation/domain/models/steps/TermExpansion;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/ConsentsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/ConsentsModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)Lcom/whoop/activation/domain/models/steps/ConsentsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/ConsentsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x8

    iget-boolean p0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    return v0
.end method

.method public final component7()Lcom/whoop/activation/domain/models/steps/TermExpansion;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)Lcom/whoop/activation/domain/models/steps/ConsentsModel;
    .locals 11

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consentText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fullTermsUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expansionType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/activation/domain/models/steps/ConsentsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/activation/domain/models/steps/TermExpansion;ZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    iget-boolean v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    iget-boolean v3, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    iget-boolean p1, p1, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBottomScrollAllowed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    return v0
.end method

.method public final getConsent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    return-object v0
.end method

.method public final getConsentRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    return v0
.end method

.method public final getConsentText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpansionRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    return v0
.end method

.method public final getExpansionType()Lcom/whoop/activation/domain/models/steps/TermExpansion;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    return-object v0
.end method

.method public final getFullTermsUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getRegion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->region:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consent:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->fullTermsUrl:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->consentRequired:Z

    iget-object v6, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionType:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    iget-boolean v7, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->expansionRequired:Z

    iget-boolean v8, p0, Lcom/whoop/activation/domain/models/steps/ConsentsModel;->bottomScrollAllowed:Z

    const-string v9, ", region="

    const-string v10, ", consent="

    const-string v11, "ConsentsModel(id="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", consentText="

    const-string v9, ", fullTermsUrl="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", consentRequired="

    const-string v2, ", expansionType="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expansionRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bottomScrollAllowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
