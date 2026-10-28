.class final Lza0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0082\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ@\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lza0/a;",
        "",
        "Lza0/b;",
        "action",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "currentResponse",
        "",
        "emitDateSelectorLoading",
        "",
        "",
        "dismissedCardIds",
        "<init>",
        "(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)V",
        "a",
        "(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)Lza0/a;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lza0/b;",
        "c",
        "()Lza0/b;",
        "b",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "getCurrentResponse",
        "()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "Z",
        "e",
        "()Z",
        "d",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "advanced-labs_release"
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
.field private final a:Lza0/b;

.field private final b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

.field private final c:Z

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/b;",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissedCardIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lza0/a;->a:Lza0/b;

    .line 3
    iput-object p2, p0, Lza0/a;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    .line 4
    iput-boolean p3, p0, Lza0/a;->c:Z

    .line 5
    iput-object p4, p0, Lza0/a;->d:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 6
    sget-object p4, Lm83/a0;->w:Lm83/a0;

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lza0/a;-><init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)V

    return-void
.end method

.method public static synthetic b(Lza0/a;Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;ILjava/lang/Object;)Lza0/a;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lza0/a;->a:Lza0/b;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lza0/a;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lza0/a;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lza0/a;->d:Ljava/util/Set;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lza0/a;->a(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)Lza0/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)Lza0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lza0/b;",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lza0/a;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissedCardIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza0/a;

    invoke-direct {v0, p1, p2, p3, p4}, Lza0/a;-><init>(Lza0/b;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;ZLjava/util/Set;)V

    return-object v0
.end method

.method public final c()Lza0/b;
    .locals 1

    iget-object v0, p0, Lza0/a;->a:Lza0/b;

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lza0/a;->d:Ljava/util/Set;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lza0/a;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lza0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lza0/a;

    iget-object v1, p0, Lza0/a;->a:Lza0/b;

    iget-object v3, p1, Lza0/a;->a:Lza0/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lza0/a;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    iget-object v3, p1, Lza0/a;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lza0/a;->c:Z

    iget-boolean v3, p1, Lza0/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lza0/a;->d:Ljava/util/Set;

    iget-object p1, p1, Lza0/a;->d:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lza0/a;->a:Lza0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lza0/a;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lza0/a;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lza0/a;->d:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lza0/a;->a:Lza0/b;

    iget-object v1, p0, Lza0/a;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    iget-boolean v2, p0, Lza0/a;->c:Z

    iget-object v3, p0, Lza0/a;->d:Ljava/util/Set;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BiomarkerDetailsAccumulator(action="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentResponse="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", emitDateSelectorLoading="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", dismissedCardIds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
