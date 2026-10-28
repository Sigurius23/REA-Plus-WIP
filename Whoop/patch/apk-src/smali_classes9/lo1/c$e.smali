.class public final Llo1/c$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llo1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0018\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010$\u001a\u0004\u0008\u001e\u0010%R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006*"
    }
    d2 = {
        "Llo1/c$e;",
        "",
        "Llo1/c$c;",
        "navigationBar",
        "",
        "title",
        "Le51/n;",
        "categorySelector",
        "Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "style",
        "Lny0/a0;",
        "primaryButton",
        "",
        "displayRefreshingAnimation",
        "<init>",
        "(Llo1/c$c;Ljava/lang/String;Le51/n;Lcom/whoop/design/models/items/CyclePhaseStyle;Lny0/a0;Z)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Llo1/c$c;",
        "b",
        "()Llo1/c$c;",
        "Ljava/lang/String;",
        "e",
        "c",
        "Le51/n;",
        "()Le51/n;",
        "d",
        "Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "()Lcom/whoop/design/models/items/CyclePhaseStyle;",
        "Lny0/a0;",
        "()Lny0/a0;",
        "f",
        "Z",
        "getDisplayRefreshingAnimation",
        "()Z",
        "hormonal-insights_release"
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
.field public static final g:I


# instance fields
.field private final a:Llo1/c$c;

.field private final b:Ljava/lang/String;

.field private final c:Le51/n;

.field private final d:Lcom/whoop/design/models/items/CyclePhaseStyle;

.field private final e:Lny0/a0;

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lny0/a0;->k:I

    sget v1, Le51/n;->f:I

    or-int/2addr v0, v1

    sput v0, Llo1/c$e;->g:I

    return-void
.end method

.method public constructor <init>(Llo1/c$c;Ljava/lang/String;Le51/n;Lcom/whoop/design/models/items/CyclePhaseStyle;Lny0/a0;Z)V
    .locals 1

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categorySelector"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo1/c$e;->a:Llo1/c$c;

    iput-object p2, p0, Llo1/c$e;->b:Ljava/lang/String;

    iput-object p3, p0, Llo1/c$e;->c:Le51/n;

    iput-object p4, p0, Llo1/c$e;->d:Lcom/whoop/design/models/items/CyclePhaseStyle;

    iput-object p5, p0, Llo1/c$e;->e:Lny0/a0;

    iput-boolean p6, p0, Llo1/c$e;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Le51/n;
    .locals 1

    iget-object v0, p0, Llo1/c$e;->c:Le51/n;

    return-object v0
.end method

.method public final b()Llo1/c$c;
    .locals 1

    iget-object v0, p0, Llo1/c$e;->a:Llo1/c$c;

    return-object v0
.end method

.method public final c()Lny0/a0;
    .locals 1

    iget-object v0, p0, Llo1/c$e;->e:Lny0/a0;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/models/items/CyclePhaseStyle;
    .locals 1

    iget-object v0, p0, Llo1/c$e;->d:Lcom/whoop/design/models/items/CyclePhaseStyle;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llo1/c$e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llo1/c$e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llo1/c$e;

    iget-object v1, p0, Llo1/c$e;->a:Llo1/c$c;

    iget-object v3, p1, Llo1/c$e;->a:Llo1/c$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llo1/c$e;->b:Ljava/lang/String;

    iget-object v3, p1, Llo1/c$e;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llo1/c$e;->c:Le51/n;

    iget-object v3, p1, Llo1/c$e;->c:Le51/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llo1/c$e;->d:Lcom/whoop/design/models/items/CyclePhaseStyle;

    iget-object v3, p1, Llo1/c$e;->d:Lcom/whoop/design/models/items/CyclePhaseStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llo1/c$e;->e:Lny0/a0;

    iget-object v3, p1, Llo1/c$e;->e:Lny0/a0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Llo1/c$e;->f:Z

    iget-boolean p1, p1, Llo1/c$e;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llo1/c$e;->a:Llo1/c$c;

    invoke-virtual {v0}, Llo1/c$c;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llo1/c$e;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llo1/c$e;->c:Le51/n;

    invoke-virtual {v2}, Le51/n;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Llo1/c$e;->d:Lcom/whoop/design/models/items/CyclePhaseStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Llo1/c$e;->e:Lny0/a0;

    invoke-virtual {v2}, Lny0/a0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Llo1/c$e;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Llo1/c$e;->a:Llo1/c$c;

    iget-object v1, p0, Llo1/c$e;->b:Ljava/lang/String;

    iget-object v2, p0, Llo1/c$e;->c:Le51/n;

    iget-object v3, p0, Llo1/c$e;->d:Lcom/whoop/design/models/items/CyclePhaseStyle;

    iget-object v4, p0, Llo1/c$e;->e:Lny0/a0;

    iget-boolean v5, p0, Llo1/c$e;->f:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ScreenContent(navigationBar="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", categorySelector="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", primaryButton="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingAnimation="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
