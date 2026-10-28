.class public final Lxq2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lxq2/k;",
        "",
        "Lkd1/o;",
        "leftImage",
        "Lcom/whoop/design/util/TextResource;",
        "leftText",
        "rightImage",
        "rightText",
        "<init>",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;)V",
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
        "Lkd1/o;",
        "()Lkd1/o;",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "d",
        "user-journey_release"
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
.field public static final e:I


# instance fields
.field private final a:Lkd1/o;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lkd1/o;

.field private final d:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v1, Lkd1/o;->a:I

    or-int v2, v0, v1

    or-int/2addr v0, v2

    or-int/2addr v0, v1

    sput v0, Lxq2/k;->e:I

    return-void
.end method

.method public constructor <init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "leftText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq2/k;->a:Lkd1/o;

    iput-object p2, p0, Lxq2/k;->b:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lxq2/k;->c:Lkd1/o;

    iput-object p4, p0, Lxq2/k;->d:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final a()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lxq2/k;->a:Lkd1/o;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lxq2/k;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lxq2/k;->c:Lkd1/o;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lxq2/k;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxq2/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxq2/k;

    iget-object v1, p0, Lxq2/k;->a:Lkd1/o;

    iget-object v3, p1, Lxq2/k;->a:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxq2/k;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lxq2/k;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxq2/k;->c:Lkd1/o;

    iget-object v3, p1, Lxq2/k;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxq2/k;->d:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lxq2/k;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lxq2/k;->a:Lkd1/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lxq2/k;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lxq2/k;->c:Lkd1/o;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lxq2/k;->d:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lxq2/k;->a:Lkd1/o;

    iget-object v1, p0, Lxq2/k;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lxq2/k;->c:Lkd1/o;

    iget-object v3, p0, Lxq2/k;->d:Lcom/whoop/design/util/TextResource;

    const-string v4, ", leftText="

    const-string v5, ", rightImage="

    const-string v6, "ComparisonHeaderState(leftImage="

    invoke-static {v6, v1, v0, v4, v5}, Lvl/b;->k(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rightText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
