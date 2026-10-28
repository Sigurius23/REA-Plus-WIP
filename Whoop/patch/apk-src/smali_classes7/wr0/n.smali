.class public final Lwr0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lwr0/n;",
        "Lm91/u;",
        "Lgz0/m0;",
        "icon",
        "",
        "contentDescription",
        "Lkd1/o;",
        "iconImage",
        "Lvy0/d0;",
        "menu",
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "style",
        "<init>",
        "(Lgz0/m0;Ljava/lang/String;Lkd1/o;Lvy0/d0;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lgz0/m0;",
        "b",
        "()Lgz0/m0;",
        "Ljava/lang/String;",
        "c",
        "Lkd1/o;",
        "()Lkd1/o;",
        "d",
        "Lvy0/d0;",
        "e",
        "()Lvy0/d0;",
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "f",
        "()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "community-moments_release"
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
.field private final a:Lgz0/m0;

.field private final b:Ljava/lang/String;

.field private final c:Lkd1/o;

.field private final d:Lvy0/d0;

.field private final e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvy0/d0;->b:I

    sget v1, Lkd1/o;->a:I

    or-int/2addr v0, v1

    sput v0, Lwr0/n;->f:I

    return-void
.end method

.method public constructor <init>(Lgz0/m0;Ljava/lang/String;Lkd1/o;Lvy0/d0;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menu"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr0/n;->a:Lgz0/m0;

    iput-object p2, p0, Lwr0/n;->b:Ljava/lang/String;

    iput-object p3, p0, Lwr0/n;->c:Lkd1/o;

    iput-object p4, p0, Lwr0/n;->d:Lvy0/d0;

    iput-object p5, p0, Lwr0/n;->e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwr0/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lwr0/n;->a:Lgz0/m0;

    return-object v0
.end method

.method public final c()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lwr0/n;->c:Lkd1/o;

    return-object v0
.end method

.method public final e()Lvy0/d0;
    .locals 1

    iget-object v0, p0, Lwr0/n;->d:Lvy0/d0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lwr0/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lwr0/n;

    iget-object v1, p0, Lwr0/n;->a:Lgz0/m0;

    iget-object v3, p1, Lwr0/n;->a:Lgz0/m0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lwr0/n;->b:Ljava/lang/String;

    iget-object v3, p1, Lwr0/n;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lwr0/n;->c:Lkd1/o;

    iget-object v3, p1, Lwr0/n;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lwr0/n;->d:Lvy0/d0;

    iget-object v3, p1, Lwr0/n;->d:Lvy0/d0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lwr0/n;->e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    iget-object p1, p1, Lwr0/n;->e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
    .locals 1

    iget-object v0, p0, Lwr0/n;->e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lwr0/n;->a:Lgz0/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwr0/n;->b:Ljava/lang/String;

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

    iget-object v1, p0, Lwr0/n;->c:Lkd1/o;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lwr0/n;->d:Lvy0/d0;

    invoke-virtual {v1}, Lvy0/d0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lwr0/n;->e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lwr0/n;->a:Lgz0/m0;

    iget-object v1, p0, Lwr0/n;->b:Ljava/lang/String;

    iget-object v2, p0, Lwr0/n;->c:Lkd1/o;

    iget-object v3, p0, Lwr0/n;->d:Lvy0/d0;

    iget-object v4, p0, Lwr0/n;->e:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MenuAnchorButtonState(icon="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentDescription="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconImage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", menu="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
