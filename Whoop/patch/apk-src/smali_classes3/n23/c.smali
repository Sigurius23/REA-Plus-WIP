.class public final Ln23/c;
.super Ln23/e;
.source "SourceFile"


# static fields
.field public static final e:Ln23/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln23/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln23/c;->e:Ln23/b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;III)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, -0x1

    :cond_0
    const/4 p4, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Ln23/c;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln23/c;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Ln23/c;->b:I

    .line 4
    iput p3, p0, Ln23/c;->c:I

    .line 5
    iput-object p4, p0, Ln23/c;->d:Ljava/lang/Throwable;

    return-void
.end method

.method public static b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z
    .locals 3

    if-nez p0, :cond_0

    if-eqz p1, :cond_6

    :cond_0
    if-ne p0, p1, :cond_1

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v0

    :goto_1
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_2

    :cond_4
    move-object p0, v0

    :goto_2
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    :cond_5
    invoke-static {p0, v0}, Ln23/c;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p0

    if-eqz p0, :cond_7

    :cond_6
    :goto_3
    const/4 p0, 0x1

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln23/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Ln23/c;->d:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ln23/c;->b:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ln23/c;->c:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    const-class v0, Ln23/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Ln23/e;

    if-eqz v0, :cond_2

    check-cast p1, Ln23/e;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Ln23/c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln23/c;->d:Ljava/lang/Throwable;

    invoke-static {p1}, Lse/h;->B(Ln23/e;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v0, p1}, Ln23/c;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ln23/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln23/c;->d:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", serverErrorCode="

    const-string v1, ", statusCode="

    iget v2, p0, Ln23/c;->b:I

    const-string v3, "NetworkError(message="

    iget-object v4, p0, Ln23/c;->a:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ln23/c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cause="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln23/c;->d:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
