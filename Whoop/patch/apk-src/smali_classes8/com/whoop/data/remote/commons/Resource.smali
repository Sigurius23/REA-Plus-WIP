.class public final Lcom/whoop/data/remote/commons/Resource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/commons/Resource$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u0000 )*\u0006\u0008\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001)B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JN\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u001b2\u0008\u0010&\u001a\u0004\u0018\u00010\u0002H\u00d6\u0083\u0004J\n\u0010\'\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010(\u001a\u00020\u0007H\u00d6\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006*"
    }
    d2 = {
        "Lcom/whoop/data/remote/commons/Resource;",
        "T",
        "",
        "status",
        "Lcom/whoop/data/remote/commons/Status;",
        "data",
        "errorMessage",
        "",
        "errorCode",
        "",
        "exception",
        "Lcom/whoop/network/exception/DomainException;",
        "<init>",
        "(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)V",
        "getStatus",
        "()Lcom/whoop/data/remote/commons/Status;",
        "getData",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "getErrorMessage",
        "()Ljava/lang/String;",
        "getErrorCode",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getException",
        "()Lcom/whoop/network/exception/DomainException;",
        "success",
        "",
        "getSuccess",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/whoop/data/remote/commons/Resource$Companion;


# instance fields
.field private final data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final errorCode:Ljava/lang/Integer;

.field private final errorMessage:Ljava/lang/String;

.field private final exception:Lcom/whoop/network/exception/DomainException;

.field private final status:Lcom/whoop/data/remote/commons/Status;

.field private final success:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/commons/Resource$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/commons/Resource$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/commons/Status;",
            "TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/network/exception/DomainException;",
            ")V"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    .line 3
    iput-object p2, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    .line 6
    iput-object p5, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    .line 7
    sget-object p2, Lcom/whoop/data/remote/commons/Status;->SUCCESS:Lcom/whoop/data/remote/commons/Status;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/whoop/data/remote/commons/Resource;->success:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/data/remote/commons/Resource;-><init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/commons/Resource;Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/data/remote/commons/Resource;->copy(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/commons/Status;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    return-object v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Lcom/whoop/network/exception/DomainException;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    return-object v0
.end method

.method public final copy(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/commons/Status;",
            "TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/network/exception/DomainException;",
            ")",
            "Lcom/whoop/data/remote/commons/Resource<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/commons/Resource;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/remote/commons/Resource;-><init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/commons/Resource;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    iget-object v3, p1, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    iget-object v3, p1, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    iget-object p1, p1, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final getErrorCode()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getException()Lcom/whoop/network/exception/DomainException;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    return-object v0
.end method

.method public final getStatus()Lcom/whoop/data/remote/commons/Status;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/commons/Resource;->success:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/data/remote/commons/Resource;->status:Lcom/whoop/data/remote/commons/Status;

    iget-object v1, p0, Lcom/whoop/data/remote/commons/Resource;->data:Ljava/lang/Object;

    iget-object v2, p0, Lcom/whoop/data/remote/commons/Resource;->errorMessage:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/commons/Resource;->errorCode:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/whoop/data/remote/commons/Resource;->exception:Lcom/whoop/network/exception/DomainException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Resource(status="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", errorCode="

    const-string v1, ", exception="

    invoke-static {v3, v2, v0, v1, v5}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
