.class public final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b;",
        "",
        "canUpdateTemplate",
        "shouldUpdateTemplate",
        "<init>",
        "(ZZ)V",
        "b",
        "(ZZ)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;",
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
        "Z",
        "d",
        "()Z",
        "e",
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


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    iput-boolean p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    return-void
.end method

.method public static synthetic c(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;ZZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b(ZZ)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(ZZ)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    invoke-direct {v0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;-><init>(ZZ)V

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;

    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    iget-boolean p1, p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->a:Z

    iget-boolean v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b$c;->b:Z

    const-string v2, ", shouldUpdateTemplate="

    const-string v3, ")"

    const-string v4, "EndWorkout(canUpdateTemplate="

    invoke-static {v4, v2, v3, v0, v1}, Lr;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
