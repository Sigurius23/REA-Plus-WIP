.class public final Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsentUi$ConsentPane;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ScopesSection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$$serializer;,
        Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u0003345B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B5\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J*\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010+\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008,\u0010\u001fR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010/\u0012\u0004\u00081\u0010.\u001a\u0004\u00080\u0010!\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;",
        "Lvy/b;",
        "",
        "header",
        "",
        "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;",
        "scopes",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_model_release",
        "(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Lzc3/c;Lyc3/g;)V",
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
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getHeader",
        "getHeader$annotations",
        "()V",
        "Ljava/util/List;",
        "getScopes",
        "getScopes$annotations",
        "Companion",
        "Scope",
        "$serializer",
        "com/stripe/android/model/d",
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
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/d;


# instance fields
.field private final header:Ljava/lang/String;

.field private final scopes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->Companion:Lcom/stripe/android/model/d;

    new-instance v0, Lcom/stripe/android/model/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v0, v1, v2

    sput-object v1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;",
            ">;)V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->copy(Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getHeader$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header"
    .end annotation

    return-void
.end method

.method public static synthetic getScopes$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "scopes"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_model_release(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;",
            ">;)",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;-><init>(Ljava/lang/String;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final getScopes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    const-string v2, ", scopes="

    const-string v3, ")"

    const-string v4, "ScopesSection(header="

    invoke-static {v4, v0, v2, v3, v1}, Lvl/b;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->header:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->scopes:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
