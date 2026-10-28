.class public final Lcv1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcv1/c$a;,
        Lcv1/c$b;,
        Lcv1/c$c;,
        Lcv1/c$d;,
        Lcv1/c$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0005\u0016\u001a\u001d\u001e\u0014B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcv1/c;",
        "",
        "Lcv1/c$c;",
        "popUpDialog",
        "Lcv1/c$b;",
        "fullScreenModal",
        "Lcv1/c$d;",
        "screenContent",
        "<init>",
        "(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;)V",
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
        "a",
        "Lcv1/c$c;",
        "b",
        "()Lcv1/c$c;",
        "Lcv1/c$b;",
        "()Lcv1/c$b;",
        "c",
        "Lcv1/c$d;",
        "()Lcv1/c$d;",
        "d",
        "e",
        "limited-time-offer_release"
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
.field private final a:Lcv1/c$c;

.field private final b:Lcv1/c$b;

.field private final c:Lcv1/c$d;


# direct methods
.method public constructor <init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcv1/c;->a:Lcv1/c$c;

    .line 3
    iput-object p2, p0, Lcv1/c;->b:Lcv1/c$b;

    .line 4
    iput-object p3, p0, Lcv1/c;->c:Lcv1/c$d;

    return-void
.end method

.method public synthetic constructor <init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcv1/c;-><init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;)V

    return-void
.end method


# virtual methods
.method public final a()Lcv1/c$b;
    .locals 1

    iget-object v0, p0, Lcv1/c;->b:Lcv1/c$b;

    return-object v0
.end method

.method public final b()Lcv1/c$c;
    .locals 1

    iget-object v0, p0, Lcv1/c;->a:Lcv1/c$c;

    return-object v0
.end method

.method public final c()Lcv1/c$d;
    .locals 1

    iget-object v0, p0, Lcv1/c;->c:Lcv1/c$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcv1/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcv1/c;

    iget-object v1, p0, Lcv1/c;->a:Lcv1/c$c;

    iget-object v3, p1, Lcv1/c;->a:Lcv1/c$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcv1/c;->b:Lcv1/c$b;

    iget-object v3, p1, Lcv1/c;->b:Lcv1/c$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcv1/c;->c:Lcv1/c$d;

    iget-object p1, p1, Lcv1/c;->c:Lcv1/c$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcv1/c;->b:Lcv1/c$b;

    if-nez v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcv1/c$b;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcv1/c;->c:Lcv1/c$d;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcv1/c$d;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcv1/c;->a:Lcv1/c$c;

    iget-object v1, p0, Lcv1/c;->b:Lcv1/c$b;

    iget-object v2, p0, Lcv1/c;->c:Lcv1/c$d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LimitedTimeOfferViewState(popUpDialog="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fullScreenModal="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", screenContent="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
