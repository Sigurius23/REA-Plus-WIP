.class public final Lil1/u$c;
.super Lil1/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lil1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ<\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lil1/u$c;",
        "Lil1/u;",
        "Ljava/time/LocalDate;",
        "requestDate",
        "Lfm1/g;",
        "pillarType",
        "",
        "shouldRefresh",
        "Lem1/r;",
        "refreshType",
        "<init>",
        "(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)V",
        "a",
        "(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)Lil1/u$c;",
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
        "Ljava/time/LocalDate;",
        "e",
        "()Ljava/time/LocalDate;",
        "b",
        "Lfm1/g;",
        "c",
        "()Lfm1/g;",
        "Z",
        "f",
        "()Z",
        "d",
        "Lem1/r;",
        "()Lem1/r;",
        "home_release"
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
.field private final a:Ljava/time/LocalDate;

.field private final b:Lfm1/g;

.field private final c:Z

.field private final d:Lem1/r;


# direct methods
.method public constructor <init>(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)V
    .locals 1

    const-string v0, "refreshType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lil1/u;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lil1/u$c;->a:Ljava/time/LocalDate;

    .line 3
    iput-object p2, p0, Lil1/u$c;->b:Lfm1/g;

    .line 4
    iput-boolean p3, p0, Lil1/u$c;->c:Z

    .line 5
    iput-object p4, p0, Lil1/u$c;->d:Lem1/r;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 6
    sget-object p4, Lem1/r;->NONE:Lem1/r;

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lil1/u$c;-><init>(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)V

    return-void
.end method

.method public static synthetic b(Lil1/u$c;Ljava/time/LocalDate;Lfm1/g;ZLem1/r;ILjava/lang/Object;)Lil1/u$c;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lil1/u$c;->a:Ljava/time/LocalDate;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lil1/u$c;->b:Lfm1/g;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lil1/u$c;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lil1/u$c;->d:Lem1/r;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lil1/u$c;->a(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)Lil1/u$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)Lil1/u$c;
    .locals 1

    const-string v0, "refreshType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lil1/u$c;

    invoke-direct {v0, p1, p2, p3, p4}, Lil1/u$c;-><init>(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)V

    return-object v0
.end method

.method public final c()Lfm1/g;
    .locals 1

    iget-object v0, p0, Lil1/u$c;->b:Lfm1/g;

    return-object v0
.end method

.method public final d()Lem1/r;
    .locals 1

    iget-object v0, p0, Lil1/u$c;->d:Lem1/r;

    return-object v0
.end method

.method public final e()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lil1/u$c;->a:Ljava/time/LocalDate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lil1/u$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lil1/u$c;

    iget-object v1, p0, Lil1/u$c;->a:Ljava/time/LocalDate;

    iget-object v3, p1, Lil1/u$c;->a:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lil1/u$c;->b:Lfm1/g;

    iget-object v3, p1, Lil1/u$c;->b:Lfm1/g;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lil1/u$c;->c:Z

    iget-boolean v3, p1, Lil1/u$c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lil1/u$c;->d:Lem1/r;

    iget-object p1, p1, Lil1/u$c;->d:Lem1/r;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lil1/u$c;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lil1/u$c;->a:Ljava/time/LocalDate;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/time/LocalDate;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lil1/u$c;->b:Lfm1/g;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lil1/u$c;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lil1/u$c;->d:Lem1/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lil1/u$c;->a:Ljava/time/LocalDate;

    iget-object v1, p0, Lil1/u$c;->b:Lfm1/g;

    iget-boolean v2, p0, Lil1/u$c;->c:Z

    iget-object v3, p0, Lil1/u$c;->d:Lem1/r;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Refresh(requestDate="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pillarType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shouldRefresh="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", refreshType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
