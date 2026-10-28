.class public final Lq81/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq81/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0016\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010 \u001a\u0004\u0008\u001d\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lq81/h;",
        "Lq81/j;",
        "Lq81/i;",
        "style",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lq81/b;",
        "baseTimerState",
        "",
        "targetTimeInSeconds",
        "<init>",
        "(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lq81/i;",
        "b",
        "()Lq81/i;",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "Lq81/b;",
        "()Lq81/b;",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final e:I


# instance fields
.field private final a:Lq81/i;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lq81/b;

.field private final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseTimerState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq81/h;->a:Lq81/i;

    .line 3
    iput-object p2, p0, Lq81/h;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lq81/h;->c:Lq81/b;

    .line 5
    iput-object p4, p0, Lq81/h;->d:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lq81/h;-><init>(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final a()Lq81/b;
    .locals 1

    iget-object v0, p0, Lq81/h;->c:Lq81/b;

    return-object v0
.end method

.method public final b()Lq81/i;
    .locals 1

    iget-object v0, p0, Lq81/h;->a:Lq81/i;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lq81/h;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lq81/h;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lq81/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq81/h;

    iget-object v1, p0, Lq81/h;->a:Lq81/i;

    iget-object v3, p1, Lq81/h;->a:Lq81/i;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lq81/h;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lq81/h;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lq81/h;->c:Lq81/b;

    iget-object v3, p1, Lq81/h;->c:Lq81/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lq81/h;->d:Ljava/lang/Integer;

    iget-object p1, p1, Lq81/h;->d:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lq81/h;->a:Lq81/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lq81/h;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lq81/h;->c:Lq81/b;

    invoke-virtual {v2}, Lq81/b;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lq81/h;->d:Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lq81/h;->a:Lq81/i;

    iget-object v1, p0, Lq81/h;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lq81/h;->c:Lq81/b;

    iget-object v3, p0, Lq81/h;->d:Ljava/lang/Integer;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WeightliftingTimerState(style="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", baseTimerState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", targetTimeInSeconds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
