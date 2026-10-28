.class public final Lxy1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ8\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lxy1/a;",
        "",
        "Lxy1/c;",
        "inputMode",
        "",
        "inputValue",
        "",
        "progress",
        "Lxy1/f;",
        "submissionState",
        "<init>",
        "(Lxy1/c;Ljava/lang/String;FLxy1/f;)V",
        "a",
        "(Lxy1/c;Ljava/lang/String;FLxy1/f;)Lxy1/a;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lxy1/c;",
        "c",
        "()Lxy1/c;",
        "b",
        "Ljava/lang/String;",
        "d",
        "F",
        "e",
        "()F",
        "Lxy1/f;",
        "f",
        "()Lxy1/f;",
        "mfa_release"
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
.field private final a:Lxy1/c;

.field private final b:Ljava/lang/String;

.field private final c:F

.field private final d:Lxy1/f;


# direct methods
.method public constructor <init>(Lxy1/c;Ljava/lang/String;FLxy1/f;)V
    .locals 1

    const-string v0, "inputMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submissionState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxy1/a;->a:Lxy1/c;

    .line 3
    iput-object p2, p0, Lxy1/a;->b:Ljava/lang/String;

    .line 4
    iput p3, p0, Lxy1/a;->c:F

    .line 5
    iput-object p4, p0, Lxy1/a;->d:Lxy1/f;

    return-void
.end method

.method public synthetic constructor <init>(Lxy1/c;Ljava/lang/String;FLxy1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lxy1/c;->PHONE:Lxy1/c;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    const-string p2, ""

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 8
    sget-object p4, Lxy1/f;->IDLE:Lxy1/f;

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lxy1/a;-><init>(Lxy1/c;Ljava/lang/String;FLxy1/f;)V

    return-void
.end method

.method public static synthetic b(Lxy1/a;Lxy1/c;Ljava/lang/String;FLxy1/f;ILjava/lang/Object;)Lxy1/a;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lxy1/a;->a:Lxy1/c;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lxy1/a;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lxy1/a;->c:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lxy1/a;->d:Lxy1/f;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lxy1/a;->a(Lxy1/c;Ljava/lang/String;FLxy1/f;)Lxy1/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lxy1/c;Ljava/lang/String;FLxy1/f;)Lxy1/a;
    .locals 1

    const-string v0, "inputMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submissionState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxy1/a;

    invoke-direct {v0, p1, p2, p3, p4}, Lxy1/a;-><init>(Lxy1/c;Ljava/lang/String;FLxy1/f;)V

    return-object v0
.end method

.method public final c()Lxy1/c;
    .locals 1

    iget-object v0, p0, Lxy1/a;->a:Lxy1/c;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxy1/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lxy1/a;->c:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxy1/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxy1/a;

    iget-object v1, p0, Lxy1/a;->a:Lxy1/c;

    iget-object v3, p1, Lxy1/a;->a:Lxy1/c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxy1/a;->b:Ljava/lang/String;

    iget-object v3, p1, Lxy1/a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lxy1/a;->c:F

    iget v3, p1, Lxy1/a;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxy1/a;->d:Lxy1/f;

    iget-object p1, p1, Lxy1/a;->d:Lxy1/f;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lxy1/f;
    .locals 1

    iget-object v0, p0, Lxy1/a;->d:Lxy1/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lxy1/a;->a:Lxy1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lxy1/a;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lxy1/a;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lxy1/a;->d:Lxy1/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lxy1/a;->a:Lxy1/c;

    iget-object v1, p0, Lxy1/a;->b:Ljava/lang/String;

    iget v2, p0, Lxy1/a;->c:F

    iget-object v3, p0, Lxy1/a;->d:Lxy1/f;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MfaInputDomainState(inputMode="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", inputValue="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", submissionState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
