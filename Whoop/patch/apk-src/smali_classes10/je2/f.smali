.class public final Lje2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lje2/f;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "description",
        "",
        "enabled",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Z",
        "()Z",
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


# static fields
.field public static final d:I


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lje2/f;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje2/f;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lje2/f;->b:Lcom/whoop/design/util/TextResource;

    iput-boolean p3, p0, Lje2/f;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lje2/f;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lje2/f;->c:Z

    return v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lje2/f;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lje2/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lje2/f;

    iget-object v1, p0, Lje2/f;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lje2/f;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lje2/f;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lje2/f;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lje2/f;->c:Z

    iget-boolean p1, p1, Lje2/f;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lje2/f;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lje2/f;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v1, p0, Lje2/f;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lje2/f;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lje2/f;->b:Lcom/whoop/design/util/TextResource;

    iget-boolean v2, p0, Lje2/f;->c:Z

    const-string v3, ", description="

    const-string v4, ", enabled="

    const-string v5, "ShepherdToggleViewState(title="

    invoke-static {v5, v0, v3, v1, v4}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
