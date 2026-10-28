.class public final Lc42/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001a\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010%\u001a\u0004\u0008!\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008\u001e\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010*\u001a\u0004\u0008\'\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lc42/q;",
        "",
        "Lc42/s;",
        "pregnancyToggle",
        "Lc42/b;",
        "dueDate",
        "Lc42/u;",
        "privacy",
        "Lc42/c;",
        "exitDialog",
        "Lc42/a;",
        "dueDateOptions",
        "Lc42/t;",
        "previousPregnanciesSection",
        "<init>",
        "(Lc42/s;Lc42/b;Lc42/u;Lc42/c;Lc42/a;Lc42/t;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lc42/s;",
        "d",
        "()Lc42/s;",
        "b",
        "Lc42/b;",
        "()Lc42/b;",
        "c",
        "Lc42/u;",
        "f",
        "()Lc42/u;",
        "Lc42/c;",
        "()Lc42/c;",
        "e",
        "Lc42/a;",
        "()Lc42/a;",
        "Lc42/t;",
        "()Lc42/t;",
        "pregnancy_release"
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
.field private final a:Lc42/s;

.field private final b:Lc42/b;

.field private final c:Lc42/u;

.field private final d:Lc42/c;

.field private final e:Lc42/a;

.field private final f:Lc42/t;


# direct methods
.method public constructor <init>(Lc42/s;Lc42/b;Lc42/u;Lc42/c;Lc42/a;Lc42/t;)V
    .locals 1

    const-string v0, "pregnancyToggle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dueDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "privacy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exitDialog"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dueDateOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc42/q;->a:Lc42/s;

    iput-object p2, p0, Lc42/q;->b:Lc42/b;

    iput-object p3, p0, Lc42/q;->c:Lc42/u;

    iput-object p4, p0, Lc42/q;->d:Lc42/c;

    iput-object p5, p0, Lc42/q;->e:Lc42/a;

    iput-object p6, p0, Lc42/q;->f:Lc42/t;

    return-void
.end method


# virtual methods
.method public final a()Lc42/b;
    .locals 1

    iget-object v0, p0, Lc42/q;->b:Lc42/b;

    return-object v0
.end method

.method public final b()Lc42/a;
    .locals 1

    iget-object v0, p0, Lc42/q;->e:Lc42/a;

    return-object v0
.end method

.method public final c()Lc42/c;
    .locals 1

    iget-object v0, p0, Lc42/q;->d:Lc42/c;

    return-object v0
.end method

.method public final d()Lc42/s;
    .locals 1

    iget-object v0, p0, Lc42/q;->a:Lc42/s;

    return-object v0
.end method

.method public final e()Lc42/t;
    .locals 1

    iget-object v0, p0, Lc42/q;->f:Lc42/t;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc42/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc42/q;

    iget-object v1, p0, Lc42/q;->a:Lc42/s;

    iget-object v3, p1, Lc42/q;->a:Lc42/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc42/q;->b:Lc42/b;

    iget-object v3, p1, Lc42/q;->b:Lc42/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc42/q;->c:Lc42/u;

    iget-object v3, p1, Lc42/q;->c:Lc42/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc42/q;->d:Lc42/c;

    iget-object v3, p1, Lc42/q;->d:Lc42/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lc42/q;->e:Lc42/a;

    iget-object v3, p1, Lc42/q;->e:Lc42/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lc42/q;->f:Lc42/t;

    iget-object p1, p1, Lc42/q;->f:Lc42/t;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Lc42/u;
    .locals 1

    iget-object v0, p0, Lc42/q;->c:Lc42/u;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lc42/q;->a:Lc42/s;

    invoke-virtual {v0}, Lc42/s;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc42/q;->b:Lc42/b;

    invoke-virtual {v1}, Lc42/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc42/q;->c:Lc42/u;

    invoke-virtual {v0}, Lc42/u;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc42/q;->d:Lc42/c;

    invoke-virtual {v1}, Lc42/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lc42/q;->e:Lc42/a;

    invoke-virtual {v0}, Lc42/a;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc42/q;->f:Lc42/t;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lc42/t;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lc42/q;->a:Lc42/s;

    iget-object v1, p0, Lc42/q;->b:Lc42/b;

    iget-object v2, p0, Lc42/q;->c:Lc42/u;

    iget-object v3, p0, Lc42/q;->d:Lc42/c;

    iget-object v4, p0, Lc42/q;->e:Lc42/a;

    iget-object v5, p0, Lc42/q;->f:Lc42/t;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "PregnancySettingsScreenViewState(pregnancyToggle="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dueDate="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", privacy="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exitDialog="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dueDateOptions="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", previousPregnanciesSection="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
