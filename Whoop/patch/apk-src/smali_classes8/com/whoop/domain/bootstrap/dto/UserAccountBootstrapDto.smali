.class public final Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$$serializer;,
        Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rB[\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJX\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0010\u0010(\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\u00052\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008/\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00083\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010-\u001a\u0004\u00086\u0010\u001c\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;",
        "",
        "",
        "username",
        "email",
        "",
        "canUploadData",
        "deidentified",
        "concealed",
        "",
        "userId",
        "createdAt",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Integer;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getUsername",
        "getEmail",
        "Z",
        "getCanUploadData",
        "getDeidentified",
        "getConcealed",
        "Ljava/lang/Integer;",
        "getUserId",
        "getCreatedAt",
        "Companion",
        "$serializer",
        "a",
        "core_release"
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
.field public static final Companion:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$a;


# instance fields
.field private final canUploadData:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "can_upload_data"
    .end annotation
.end field

.field private final concealed:Z

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final deidentified:Z

.field private final email:Ljava/lang/String;

.field private final userId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private final username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->Companion:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$$serializer;->INSTANCE:Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    iput-boolean p5, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    iput-boolean p6, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    iput-object p7, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    iput-object p8, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    .line 7
    iput-boolean p5, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    .line 9
    iput-object p7, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->copy(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x4

    iget-boolean v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    return v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;
    .locals 9

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Integer;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    iget-boolean v3, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    iget-boolean v3, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    iget-boolean v3, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCanUploadData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    return v0
.end method

.method public final getConcealed()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeidentified()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    return v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->username:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->email:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->canUploadData:Z

    iget-boolean v3, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->deidentified:Z

    iget-boolean v4, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->concealed:Z

    iget-object v5, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->userId:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/whoop/domain/bootstrap/dto/UserAccountBootstrapDto;->createdAt:Ljava/lang/String;

    const-string v7, ", email="

    const-string v8, ", canUploadData="

    const-string v9, "UserAccountBootstrapDto(username="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deidentified="

    const-string v7, ", concealed="

    invoke-static {v0, v2, v1, v3, v7}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
