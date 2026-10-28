.class public final Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$$serializer;,
        Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0002\'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B-\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0006\u0010\u000cJ\'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010$\u001a\u0004\u0008%\u0010\u0019\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;",
        "",
        "",
        "id",
        "",
        "selected",
        "<init>",
        "(Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$shepherd_release",
        "(Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "copy",
        "(Ljava/lang/String;Z)Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Z",
        "getSelected",
        "Companion",
        "$serializer",
        "a",
        "shepherd_release"
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

.field public static final Companion:Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$a;


# instance fields
.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final selected:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selected"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->Companion:Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$$serializer;

    invoke-virtual {p4}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->copy(Ljava/lang/String;Z)Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$shepherd_release(Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-boolean p0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Z)Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    invoke-direct {v0, p1, p2}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    iget-boolean p1, p1, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->id:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;->selected:Z

    const-string v2, ", selected="

    const-string v3, ")"

    const-string v4, "TermsOfUseCriteriaItem(id="

    invoke-static {v4, v0, v2, v3, v1}, Lnh3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
