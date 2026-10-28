.class public final Lcom/stripe/android/model/ConsentUi$ConsentPane;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsentUi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConsentPane"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsentUi$ConsentPane$$serializer;,
        Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0003>?@B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010!JF\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010!J\u0010\u0010*\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001fJ\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00100\u0012\u0004\u00082\u00103\u001a\u0004\u00081\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00104\u0012\u0004\u00086\u00103\u001a\u0004\u00085\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00100\u0012\u0004\u00088\u00103\u001a\u0004\u00087\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00100\u0012\u0004\u0008:\u00103\u001a\u0004\u00089\u0010!R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00100\u0012\u0004\u0008<\u00103\u001a\u0004\u0008;\u0010!\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsentUi$ConsentPane;",
        "Lvy/b;",
        "",
        "title",
        "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;",
        "scopesSection",
        "disclaimer",
        "denyButtonLabel",
        "allowButtonLabel",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_model_release",
        "(Lcom/stripe/android/model/ConsentUi$ConsentPane;Lzc3/c;Lyc3/g;)V",
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
        "()Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$ConsentPane;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;",
        "getScopesSection",
        "getScopesSection$annotations",
        "getDisclaimer",
        "getDisclaimer$annotations",
        "getDenyButtonLabel",
        "getDenyButtonLabel$annotations",
        "getAllowButtonLabel",
        "getAllowButtonLabel$annotations",
        "Companion",
        "ScopesSection",
        "$serializer",
        "com/stripe/android/model/b",
        "payments-model_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/b;


# instance fields
.field private final allowButtonLabel:Ljava/lang/String;

.field private final denyButtonLabel:Ljava/lang/String;

.field private final disclaimer:Ljava/lang/String;

.field private final scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->Companion:Lcom/stripe/android/model/b;

    new-instance v0, Lcom/stripe/android/model/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/stripe/android/model/ConsentUi$ConsentPane$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsentUi$ConsentPane$$serializer;

    invoke-virtual {p7}, Lcom/stripe/android/model/ConsentUi$ConsentPane$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    iput-object p4, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopesSection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowButtonLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    .line 5
    iput-object p3, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsentUi$ConsentPane;Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsentUi$ConsentPane;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/model/ConsentUi$ConsentPane;->copy(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$ConsentPane;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAllowButtonLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "allow_button_label"
    .end annotation

    return-void
.end method

.method public static synthetic getDenyButtonLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "deny_button_label"
    .end annotation

    return-void
.end method

.method public static synthetic getDisclaimer$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disclaimer"
    .end annotation

    .annotation runtime Lwc3/i;
        with = Lyy/t;
    .end annotation

    return-void
.end method

.method public static synthetic getScopesSection$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "scopes_section"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_model_release(Lcom/stripe/android/model/ConsentUi$ConsentPane;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$$serializer;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lyy/t;->a:Lyy/t;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$ConsentPane;
    .locals 7

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopesSection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowButtonLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/ConsentUi$ConsentPane;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/model/ConsentUi$ConsentPane;-><init>(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
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
    instance-of v1, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    iget-object v3, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAllowButtonLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDenyButtonLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getScopesSection()Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    iget-object v2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ConsentPane(title="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scopesSection="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disclaimer="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", denyButtonLabel="

    const-string v1, ", allowButtonLabel="

    invoke-static {v5, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->scopesSection:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->disclaimer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->denyButtonLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane;->allowButtonLabel:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
