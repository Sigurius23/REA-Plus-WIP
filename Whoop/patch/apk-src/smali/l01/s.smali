.class public final Ll01/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010 \u001a\u0004\u0008\u001f\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008$\u0010&R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\'\u001a\u0004\u0008\u0019\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Ll01/s;",
        "Lm91/u;",
        "",
        "title",
        "Lgz0/m0;",
        "endIcon",
        "Lkd1/o;",
        "titleImage",
        "sideImage",
        "Ll01/t;",
        "style",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Lgz0/m0;Lkd1/o;Lkd1/o;Ll01/t;Lcom/whoop/navigation/e;)V",
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
        "Ljava/lang/String;",
        "f",
        "b",
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "c",
        "Lkd1/o;",
        "g",
        "()Lkd1/o;",
        "d",
        "e",
        "Ll01/t;",
        "()Ll01/t;",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
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
.field public static final g:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lgz0/m0;

.field private final c:Lkd1/o;

.field private final d:Lkd1/o;

.field private final e:Ll01/t;

.field private final f:Lcom/whoop/navigation/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Ll01/s;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lgz0/m0;Lkd1/o;Lkd1/o;Ll01/t;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sideImage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll01/s;->a:Ljava/lang/String;

    iput-object p2, p0, Ll01/s;->b:Lgz0/m0;

    iput-object p3, p0, Ll01/s;->c:Lkd1/o;

    iput-object p4, p0, Ll01/s;->d:Lkd1/o;

    iput-object p5, p0, Ll01/s;->e:Ll01/t;

    iput-object p6, p0, Ll01/s;->f:Lcom/whoop/navigation/e;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Ll01/s;->f:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final b()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Ll01/s;->b:Lgz0/m0;

    return-object v0
.end method

.method public final c()Lkd1/o;
    .locals 1

    iget-object v0, p0, Ll01/s;->d:Lkd1/o;

    return-object v0
.end method

.method public final e()Ll01/t;
    .locals 1

    iget-object v0, p0, Ll01/s;->e:Ll01/t;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll01/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll01/s;

    iget-object v1, p0, Ll01/s;->a:Ljava/lang/String;

    iget-object v3, p1, Ll01/s;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll01/s;->b:Lgz0/m0;

    iget-object v3, p1, Ll01/s;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ll01/s;->c:Lkd1/o;

    iget-object v3, p1, Ll01/s;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ll01/s;->d:Lkd1/o;

    iget-object v3, p1, Ll01/s;->d:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ll01/s;->e:Ll01/t;

    iget-object v3, p1, Ll01/s;->e:Ll01/t;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ll01/s;->f:Lcom/whoop/navigation/e;

    iget-object p1, p1, Ll01/s;->f:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll01/s;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Lkd1/o;
    .locals 1

    iget-object v0, p0, Ll01/s;->c:Lkd1/o;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ll01/s;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll01/s;->b:Lgz0/m0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ll01/s;->c:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Ll01/s;->d:Lkd1/o;

    invoke-static {v2, v0, v1}, Lq63/c;->c(Lkd1/o;II)I

    move-result v0

    iget-object v2, p0, Ll01/s;->e:Ll01/t;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ll01/s;->f:Lcom/whoop/navigation/e;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Ll01/s;->a:Ljava/lang/String;

    iget-object v1, p0, Ll01/s;->b:Lgz0/m0;

    iget-object v2, p0, Ll01/s;->c:Lkd1/o;

    iget-object v3, p0, Ll01/s;->d:Lkd1/o;

    iget-object v4, p0, Ll01/s;->e:Ll01/t;

    iget-object v5, p0, Ll01/s;->f:Lcom/whoop/navigation/e;

    const-string v6, ", endIcon="

    const-string v7, ", titleImage="

    const-string v8, "UpsellCardSmallState(title="

    invoke-static {v8, v0, v6, v1, v7}, Ljh3/c;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sideImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
