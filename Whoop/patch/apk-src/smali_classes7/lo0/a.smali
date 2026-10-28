.class public final Llo0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u001c\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010!\u001a\u0004\u0008\u001a\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010#\u001a\u0004\u0008\u0017\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Llo0/a;",
        "Lm91/u;",
        "",
        "id",
        "text",
        "",
        "isSelected",
        "Ly81/f;",
        "selectedColor",
        "selectedBorderColor",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V",
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
        "getId",
        "b",
        "e",
        "c",
        "Z",
        "f",
        "()Z",
        "d",
        "Ly81/f;",
        "()Ly81/f;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "clinician-in-the-loop_release"
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

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:Ly81/f;

.field private final e:Ly81/f;

.field private final f:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Llo0/a;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedBorderColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo0/a;->a:Ljava/lang/String;

    iput-object p2, p0, Llo0/a;->b:Ljava/lang/String;

    iput-boolean p3, p0, Llo0/a;->c:Z

    iput-object p4, p0, Llo0/a;->d:Ly81/f;

    iput-object p5, p0, Llo0/a;->e:Ly81/f;

    iput-object p6, p0, Llo0/a;->f:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Llo0/a;->f:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final b()Ly81/f;
    .locals 1

    iget-object v0, p0, Llo0/a;->e:Ly81/f;

    return-object v0
.end method

.method public final c()Ly81/f;
    .locals 1

    iget-object v0, p0, Llo0/a;->d:Ly81/f;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llo0/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llo0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llo0/a;

    iget-object v1, p0, Llo0/a;->a:Ljava/lang/String;

    iget-object v3, p1, Llo0/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llo0/a;->b:Ljava/lang/String;

    iget-object v3, p1, Llo0/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llo0/a;->c:Z

    iget-boolean v3, p1, Llo0/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llo0/a;->d:Ly81/f;

    iget-object v3, p1, Llo0/a;->d:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llo0/a;->e:Ly81/f;

    iget-object v3, p1, Llo0/a;->e:Ly81/f;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Llo0/a;->f:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Llo0/a;->f:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Llo0/a;->c:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llo0/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llo0/a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llo0/a;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Llo0/a;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Llo0/a;->d:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Llo0/a;->e:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v1, p0, Llo0/a;->f:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Llo0/a;->a:Ljava/lang/String;

    iget-object v1, p0, Llo0/a;->b:Ljava/lang/String;

    iget-boolean v2, p0, Llo0/a;->c:Z

    iget-object v3, p0, Llo0/a;->d:Ly81/f;

    iget-object v4, p0, Llo0/a;->e:Ly81/f;

    iget-object v5, p0, Llo0/a;->f:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v6, ", text="

    const-string v7, ", isSelected="

    const-string v8, "AppointmentButtonViewState(id="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", selectedColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedBorderColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
