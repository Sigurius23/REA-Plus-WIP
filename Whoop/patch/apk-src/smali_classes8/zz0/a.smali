.class public final Lzz0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001aR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001c\u001a\u0004\u0008\u001d\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lzz0/a;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "currentDateRangeDisplay",
        "",
        "canNavigateForward",
        "canNavigateBackward",
        "",
        "nextDateTime",
        "previousDateTime",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V",
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
        "d",
        "Ljava/lang/String;",
        "e",
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


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "currentDateRangeDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzz0/a;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-boolean p2, p0, Lzz0/a;->b:Z

    .line 4
    iput-boolean p3, p0, Lzz0/a;->c:Z

    .line 5
    iput-object p4, p0, Lzz0/a;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lzz0/a;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p7, v0

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move-object p7, p5

    move-object p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 8
    :goto_0
    invoke-direct/range {p2 .. p7}, Lzz0/a;-><init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lzz0/a;->c:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lzz0/a;->b:Z

    return v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lzz0/a;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzz0/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzz0/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzz0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzz0/a;

    iget-object v1, p0, Lzz0/a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lzz0/a;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lzz0/a;->b:Z

    iget-boolean v3, p1, Lzz0/a;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lzz0/a;->c:Z

    iget-boolean v3, p1, Lzz0/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lzz0/a;->d:Ljava/lang/String;

    iget-object v3, p1, Lzz0/a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lzz0/a;->e:Ljava/lang/String;

    iget-object p1, p1, Lzz0/a;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lzz0/a;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lzz0/a;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lzz0/a;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lzz0/a;->d:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lzz0/a;->e:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lzz0/a;->a:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Lzz0/a;->b:Z

    iget-boolean v2, p0, Lzz0/a;->c:Z

    iget-object v3, p0, Lzz0/a;->d:Ljava/lang/String;

    iget-object v4, p0, Lzz0/a;->e:Ljava/lang/String;

    const-string v5, ", canNavigateForward="

    const-string v6, ", canNavigateBackward="

    const-string v7, "BehaviorsCalendarDatePickerViewState(currentDateRangeDisplay="

    invoke-static {v7, v0, v5, v1, v6}, Lq63/c;->p(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nextDateTime="

    const-string v5, ", previousDateTime="

    invoke-static {v0, v2, v1, v3, v5}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
