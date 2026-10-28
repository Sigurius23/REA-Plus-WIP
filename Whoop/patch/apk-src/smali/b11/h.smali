.class public final Lb11/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0019\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lb11/h;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "chargeLabel",
        "",
        "isLowBattery",
        "Lb11/k;",
        "indicatorIcon",
        "Lb11/i;",
        "connectivityIndicatorStatusType",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ZLb11/k;Lb11/i;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Z",
        "e",
        "()Z",
        "c",
        "Lb11/k;",
        "()Lb11/k;",
        "d",
        "Lb11/i;",
        "()Lb11/i;",
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


# static fields
.field public static final e:I = 0x8


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Z

.field private final c:Lb11/k;

.field private final d:Lb11/i;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;ZLb11/k;Lb11/i;)V
    .locals 1

    const-string v0, "chargeLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "indicatorIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityIndicatorStatusType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb11/h;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-boolean p2, p0, Lb11/h;->b:Z

    .line 4
    iput-object p3, p0, Lb11/h;->c:Lb11/k;

    .line 5
    iput-object p4, p0, Lb11/h;->d:Lb11/i;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZLb11/k;Lb11/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    const-string p1, "--%"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 7
    sget-object p3, Lb11/k$c;->d:Lb11/k$c;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 8
    sget-object p4, Lb11/i$e;->f:Lb11/i$e;

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lb11/h;-><init>(Lcom/whoop/design/util/TextResource;ZLb11/k;Lb11/i;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lb11/h;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Lb11/i;
    .locals 1

    iget-object v0, p0, Lb11/h;->d:Lb11/i;

    return-object v0
.end method

.method public final c()Lb11/k;
    .locals 1

    iget-object v0, p0, Lb11/h;->c:Lb11/k;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lb11/h;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb11/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb11/h;

    iget-object v1, p0, Lb11/h;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lb11/h;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lb11/h;->b:Z

    iget-boolean v3, p1, Lb11/h;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lb11/h;->c:Lb11/k;

    iget-object v3, p1, Lb11/h;->c:Lb11/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lb11/h;->d:Lb11/i;

    iget-object p1, p1, Lb11/h;->d:Lb11/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public bridge getEvent()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lm91/u;->getEvent()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lb11/h;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lb11/h;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lb11/h;->c:Lb11/k;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lb11/h;->d:Lb11/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lb11/h;->a:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Lb11/h;->b:Z

    iget-object v2, p0, Lb11/h;->c:Lb11/k;

    iget-object v3, p0, Lb11/h;->d:Lb11/i;

    const-string v4, ", isLowBattery="

    const-string v5, ", indicatorIcon="

    const-string v6, "ConnectivityIndicatorState(chargeLabel="

    invoke-static {v6, v0, v4, v1, v5}, Lq63/c;->p(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectivityIndicatorStatusType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
