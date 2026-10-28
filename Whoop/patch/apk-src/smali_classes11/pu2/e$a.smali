.class public final Lpu2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpu2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010$\u001a\u0004\u0008\u001d\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010&\u001a\u0004\u0008\u0019\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lpu2/e$a;",
        "Lpu2/e;",
        "Lpu2/q;",
        "headerState",
        "Lpu2/r;",
        "heartRateDisplayState",
        "Lpu2/s;",
        "timerState",
        "Lpu2/o;",
        "exerciseContentState",
        "Lpu2/n;",
        "actionButtonState",
        "<init>",
        "(Lpu2/q;Lpu2/r;Lpu2/s;Lpu2/o;Lpu2/n;)V",
        "",
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
        "Lpu2/q;",
        "c",
        "()Lpu2/q;",
        "b",
        "Lpu2/r;",
        "d",
        "()Lpu2/r;",
        "Lpu2/s;",
        "e",
        "()Lpu2/s;",
        "Lpu2/o;",
        "()Lpu2/o;",
        "Lpu2/n;",
        "()Lpu2/n;",
        "weightlifting_release"
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
.field private final a:Lpu2/q;

.field private final b:Lpu2/r;

.field private final c:Lpu2/s;

.field private final d:Lpu2/o;

.field private final e:Lpu2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lpu2/e$a;->f:I

    return-void
.end method

.method public constructor <init>(Lpu2/q;Lpu2/r;Lpu2/s;Lpu2/o;Lpu2/n;)V
    .locals 1

    const-string v0, "headerState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateDisplayState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timerState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseContentState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionButtonState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpu2/e$a;->a:Lpu2/q;

    iput-object p2, p0, Lpu2/e$a;->b:Lpu2/r;

    iput-object p3, p0, Lpu2/e$a;->c:Lpu2/s;

    iput-object p4, p0, Lpu2/e$a;->d:Lpu2/o;

    iput-object p5, p0, Lpu2/e$a;->e:Lpu2/n;

    return-void
.end method


# virtual methods
.method public final a()Lpu2/n;
    .locals 1

    iget-object v0, p0, Lpu2/e$a;->e:Lpu2/n;

    return-object v0
.end method

.method public final b()Lpu2/o;
    .locals 1

    iget-object v0, p0, Lpu2/e$a;->d:Lpu2/o;

    return-object v0
.end method

.method public final c()Lpu2/q;
    .locals 1

    iget-object v0, p0, Lpu2/e$a;->a:Lpu2/q;

    return-object v0
.end method

.method public final d()Lpu2/r;
    .locals 1

    iget-object v0, p0, Lpu2/e$a;->b:Lpu2/r;

    return-object v0
.end method

.method public final e()Lpu2/s;
    .locals 1

    iget-object v0, p0, Lpu2/e$a;->c:Lpu2/s;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpu2/e$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpu2/e$a;

    iget-object v1, p0, Lpu2/e$a;->a:Lpu2/q;

    iget-object v3, p1, Lpu2/e$a;->a:Lpu2/q;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpu2/e$a;->b:Lpu2/r;

    iget-object v3, p1, Lpu2/e$a;->b:Lpu2/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpu2/e$a;->c:Lpu2/s;

    iget-object v3, p1, Lpu2/e$a;->c:Lpu2/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpu2/e$a;->d:Lpu2/o;

    iget-object v3, p1, Lpu2/e$a;->d:Lpu2/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpu2/e$a;->e:Lpu2/n;

    iget-object p1, p1, Lpu2/e$a;->e:Lpu2/n;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lpu2/e$a;->a:Lpu2/q;

    invoke-virtual {v0}, Lpu2/q;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpu2/e$a;->b:Lpu2/r;

    invoke-virtual {v1}, Lpu2/r;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lpu2/e$a;->c:Lpu2/s;

    invoke-virtual {v0}, Lpu2/s;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpu2/e$a;->d:Lpu2/o;

    invoke-virtual {v1}, Lpu2/o;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lpu2/e$a;->e:Lpu2/n;

    invoke-virtual {v0}, Lpu2/n;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lpu2/e$a;->a:Lpu2/q;

    iget-object v1, p0, Lpu2/e$a;->b:Lpu2/r;

    iget-object v2, p0, Lpu2/e$a;->c:Lpu2/s;

    iget-object v3, p0, Lpu2/e$a;->d:Lpu2/o;

    iget-object v4, p0, Lpu2/e$a;->e:Lpu2/n;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Interactive(headerState="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heartRateDisplayState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timerState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exerciseContentState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionButtonState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
