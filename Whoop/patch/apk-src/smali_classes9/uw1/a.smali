.class public final Luw1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001b\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Luw1/a;",
        "Lm91/u;",
        "Lny0/h;",
        "topButton",
        "Lhy0/e;",
        "divider",
        "bottomButton",
        "Lcom/whoop/design/util/TextResource;",
        "disclaimer",
        "",
        "disabled",
        "<init>",
        "(Lny0/h;Lhy0/e;Lny0/h;Lcom/whoop/design/util/TextResource;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lny0/h;",
        "e",
        "()Lny0/h;",
        "b",
        "Lhy0/e;",
        "c",
        "()Lhy0/e;",
        "d",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "Z",
        "getDisabled",
        "()Z",
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
.field public static final f:I


# instance fields
.field private final a:Lny0/h;

.field private final b:Lhy0/e;

.field private final c:Lny0/h;

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v1, Lny0/h;->z:I

    or-int/2addr v0, v1

    sget v2, Lhy0/e;->d:I

    or-int/2addr v0, v2

    or-int/2addr v0, v1

    sput v0, Luw1/a;->f:I

    return-void
.end method

.method public constructor <init>(Lny0/h;Lhy0/e;Lny0/h;Lcom/whoop/design/util/TextResource;Z)V
    .locals 1

    const-string v0, "topButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "divider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomButton"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Luw1/a;->a:Lny0/h;

    .line 3
    iput-object p2, p0, Luw1/a;->b:Lhy0/e;

    .line 4
    iput-object p3, p0, Luw1/a;->c:Lny0/h;

    .line 5
    iput-object p4, p0, Luw1/a;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-boolean p5, p0, Luw1/a;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lny0/h;Lhy0/e;Lny0/h;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Luw1/a;-><init>(Lny0/h;Lhy0/e;Lny0/h;Lcom/whoop/design/util/TextResource;Z)V

    return-void
.end method


# virtual methods
.method public final a()Lny0/h;
    .locals 1

    iget-object v0, p0, Luw1/a;->c:Lny0/h;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Luw1/a;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Lhy0/e;
    .locals 1

    iget-object v0, p0, Luw1/a;->b:Lhy0/e;

    return-object v0
.end method

.method public final e()Lny0/h;
    .locals 1

    iget-object v0, p0, Luw1/a;->a:Lny0/h;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Luw1/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Luw1/a;

    iget-object v1, p0, Luw1/a;->a:Lny0/h;

    iget-object v3, p1, Luw1/a;->a:Lny0/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Luw1/a;->b:Lhy0/e;

    iget-object v3, p1, Luw1/a;->b:Lhy0/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Luw1/a;->c:Lny0/h;

    iget-object v3, p1, Luw1/a;->c:Lny0/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Luw1/a;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Luw1/a;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Luw1/a;->e:Z

    iget-boolean p1, p1, Luw1/a;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Luw1/a;->a:Lny0/h;

    invoke-virtual {v0}, Lny0/h;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Luw1/a;->b:Lhy0/e;

    invoke-virtual {v2}, Lhy0/e;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Luw1/a;->c:Lny0/h;

    invoke-virtual {v0}, Lny0/h;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Luw1/a;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v1, p0, Luw1/a;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Luw1/a;->a:Lny0/h;

    iget-object v1, p0, Luw1/a;->b:Lhy0/e;

    iget-object v2, p0, Luw1/a;->c:Lny0/h;

    iget-object v3, p0, Luw1/a;->d:Lcom/whoop/design/util/TextResource;

    iget-boolean v4, p0, Luw1/a;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DividedCardButtonsState(topButton="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", divider="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disclaimer="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disabled="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
