.class public final Lux1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001e\u001a\u0004\u0008\u0015\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lux1/b;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "",
        "trackingLabel",
        "Ly71/g;",
        "icon",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly71/g;Lcom/whoop/navigation/e;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Ljava/lang/String;",
        "d",
        "Ly71/g;",
        "()Ly71/g;",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "membership_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Ljava/lang/String;

.field private final c:Ly71/g;

.field private final d:Lcom/whoop/navigation/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Ly71/g;->c:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lux1/b;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly71/g;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lux1/b;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lux1/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lux1/b;->c:Ly71/g;

    iput-object p4, p0, Lux1/b;->d:Lcom/whoop/navigation/e;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lux1/b;->d:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final b()Ly71/g;
    .locals 1

    iget-object v0, p0, Lux1/b;->c:Ly71/g;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lux1/b;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lux1/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lux1/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lux1/b;

    iget-object v1, p0, Lux1/b;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lux1/b;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lux1/b;->b:Ljava/lang/String;

    iget-object v3, p1, Lux1/b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lux1/b;->c:Ly71/g;

    iget-object v3, p1, Lux1/b;->c:Ly71/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lux1/b;->d:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lux1/b;->d:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lux1/b;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lux1/b;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lux1/b;->c:Ly71/g;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ly71/g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lux1/b;->d:Lcom/whoop/navigation/e;

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lux1/b;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lux1/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lux1/b;->c:Ly71/g;

    iget-object v3, p0, Lux1/b;->d:Lcom/whoop/navigation/e;

    const-string v4, ", trackingLabel="

    const-string v5, ", icon="

    const-string v6, "ReactivationModalCta(text="

    invoke-static {v6, v0, v4, v1, v5}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
