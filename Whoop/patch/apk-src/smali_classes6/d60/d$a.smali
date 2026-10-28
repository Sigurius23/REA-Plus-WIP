.class public final Ld60/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld60/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Ld60/d$a;",
        "",
        "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
        "response",
        "",
        "Lns1/b;",
        "processedFiles",
        "Ld60/c;",
        "state",
        "<init>",
        "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)V",
        "a",
        "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)Ld60/d$a;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
        "d",
        "()Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
        "b",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "Ld60/c;",
        "e",
        "()Ld60/c;",
        "access_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lns1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ld60/c;


# direct methods
.method public constructor <init>(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
            "Ljava/util/List<",
            "+",
            "Lns1/b;",
            ">;",
            "Ld60/c;",
            ")V"
        }
    .end annotation

    const-string v0, "processedFiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    .line 3
    iput-object p2, p0, Ld60/d$a;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Ld60/d$a;->c:Ld60/c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 5
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 6
    new-instance v0, Ld60/c;

    .line 7
    sget-object v1, Ld60/a$b;->a:Ld60/a$b;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 8
    invoke-direct/range {v0 .. v7}, Ld60/c;-><init>(Ld60/a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/e;Lf60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ld60/d$a;-><init>(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)V

    return-void
.end method

.method public static synthetic b(Ld60/d$a;Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;ILjava/lang/Object;)Ld60/d$a;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Ld60/d$a;->b:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Ld60/d$a;->c:Ld60/c;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Ld60/d$a;->a(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)Ld60/d$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)Ld60/d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
            "Ljava/util/List<",
            "+",
            "Lns1/b;",
            ">;",
            "Ld60/c;",
            ")",
            "Ld60/d$a;"
        }
    .end annotation

    const-string v0, "processedFiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld60/d$a;

    invoke-direct {v0, p1, p2, p3}, Ld60/d$a;-><init>(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/util/List;Ld60/c;)V

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lns1/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld60/d$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;
    .locals 1

    iget-object v0, p0, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    return-object v0
.end method

.method public final e()Ld60/c;
    .locals 1

    iget-object v0, p0, Ld60/d$a;->c:Ld60/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld60/d$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld60/d$a;

    iget-object v1, p0, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    iget-object v3, p1, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ld60/d$a;->b:Ljava/util/List;

    iget-object v3, p1, Ld60/d$a;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ld60/d$a;->c:Ld60/c;

    iget-object p1, p1, Ld60/d$a;->c:Ld60/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ld60/d$a;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Ld60/d$a;->c:Ld60/c;

    invoke-virtual {v1}, Ld60/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ld60/d$a;->a:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    iget-object v1, p0, Ld60/d$a;->b:Ljava/util/List;

    iget-object v2, p0, Ld60/d$a;->c:Ld60/c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "InternalData(response="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", processedFiles="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
