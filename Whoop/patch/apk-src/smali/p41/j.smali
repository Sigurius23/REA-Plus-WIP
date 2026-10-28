.class public final Lp41/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u001e\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001a\u0010%R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010&\u001a\u0004\u0008#\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lp41/j;",
        "Lm91/u;",
        "",
        "label",
        "",
        "isChecked",
        "isReadOnly",
        "Lp41/f;",
        "toggleInteraction",
        "Lp41/k;",
        "style",
        "Ly81/e;",
        "toggledOnColor",
        "<init>",
        "(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;)V",
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
        "Ljava/lang/String;",
        "b",
        "Z",
        "f",
        "()Z",
        "c",
        "g",
        "d",
        "Lp41/f;",
        "()Lp41/f;",
        "e",
        "Lp41/k;",
        "()Lp41/k;",
        "Ly81/e;",
        "()Ly81/e;",
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

.field private final b:Z

.field private final c:Z

.field private final d:Lp41/f;

.field private final e:Lp41/k;

.field private final f:Ly81/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lp41/j;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggledOnColor"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp41/j;->a:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Lp41/j;->b:Z

    .line 4
    iput-boolean p3, p0, Lp41/j;->c:Z

    .line 5
    iput-object p4, p0, Lp41/j;->d:Lp41/f;

    .line 6
    iput-object p5, p0, Lp41/j;->e:Lp41/k;

    .line 7
    iput-object p6, p0, Lp41/j;->f:Ly81/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x0

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    .line 8
    sget-object p5, Lp41/k;->TILE:Lp41/k;

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    .line 9
    sget-object p6, Ly81/f;->RECOVERY:Ly81/f;

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v6, p6

    .line 10
    invoke-direct/range {v0 .. v6}, Lp41/j;-><init>(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp41/j;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lp41/k;
    .locals 1

    iget-object v0, p0, Lp41/j;->e:Lp41/k;

    return-object v0
.end method

.method public final c()Lp41/f;
    .locals 1

    iget-object v0, p0, Lp41/j;->d:Lp41/f;

    return-object v0
.end method

.method public final e()Ly81/e;
    .locals 1

    iget-object v0, p0, Lp41/j;->f:Ly81/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp41/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp41/j;

    iget-object v1, p0, Lp41/j;->a:Ljava/lang/String;

    iget-object v3, p1, Lp41/j;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lp41/j;->b:Z

    iget-boolean v3, p1, Lp41/j;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lp41/j;->c:Z

    iget-boolean v3, p1, Lp41/j;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lp41/j;->d:Lp41/f;

    iget-object v3, p1, Lp41/j;->d:Lp41/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lp41/j;->e:Lp41/k;

    iget-object v3, p1, Lp41/j;->e:Lp41/k;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lp41/j;->f:Ly81/e;

    iget-object p1, p1, Lp41/j;->f:Ly81/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lp41/j;->b:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lp41/j;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lp41/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lp41/j;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lp41/j;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lp41/j;->d:Lp41/f;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp41/f;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lp41/j;->e:Lp41/k;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lp41/j;->f:Ly81/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lp41/j;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lp41/j;->b:Z

    iget-boolean v2, p0, Lp41/j;->c:Z

    iget-object v3, p0, Lp41/j;->d:Lp41/f;

    iget-object v4, p0, Lp41/j;->e:Lp41/k;

    iget-object v5, p0, Lp41/j;->f:Ly81/e;

    const-string v6, ", isChecked="

    const-string v7, ", isReadOnly="

    const-string v8, "ToggleState(label="

    invoke-static {v8, v0, v6, v7, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", toggleInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggledOnColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
