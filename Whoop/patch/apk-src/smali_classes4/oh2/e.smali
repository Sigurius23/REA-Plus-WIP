.class public Loh2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loh2/e$a;
    }
.end annotation


# instance fields
.field private a:S

.field private b:S

.field private c:S


# direct methods
.method public constructor <init>(SSS)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, Loh2/e;->a:S

    iput-short p2, p0, Loh2/e;->b:S

    iput-short p3, p0, Loh2/e;->c:S

    return-void
.end method

.method public static a()Loh2/e$a;
    .locals 1

    new-instance v0, Loh2/e$a;

    invoke-direct {v0}, Loh2/e$a;-><init>()V

    return-object v0
.end method

.method public static b(Ljava/nio/ByteBuffer;)Loh2/e;
    .locals 2

    invoke-static {}, Loh2/e;->a()Loh2/e$a;

    move-result-object v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    invoke-virtual {v0, v1}, Loh2/e$a;->b(S)Loh2/e$a;

    move-result-object v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    invoke-virtual {v0, v1}, Loh2/e$a;->c(S)Loh2/e$a;

    move-result-object v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    invoke-static {p0}, Luk0/b;->b(B)S

    move-result p0

    invoke-virtual {v0, p0}, Loh2/e$a;->d(S)Loh2/e$a;

    move-result-object p0

    invoke-virtual {p0}, Loh2/e$a;->a()Loh2/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()S
    .locals 1

    iget-short v0, p0, Loh2/e;->a:S

    return v0
.end method

.method public d()S
    .locals 1

    iget-short v0, p0, Loh2/e;->b:S

    return v0
.end method

.method public e()S
    .locals 1

    iget-short v0, p0, Loh2/e;->c:S

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    instance-of v2, p1, Loh2/e;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Loh2/e;

    iget-short v2, p0, Loh2/e;->c:S

    iget-short v3, p1, Loh2/e;->c:S

    if-ne v2, v3, :cond_2

    iget-short v2, p0, Loh2/e;->b:S

    iget-short v3, p1, Loh2/e;->b:S

    if-ne v2, v3, :cond_2

    iget-short v2, p0, Loh2/e;->a:S

    iget-short p1, p1, Loh2/e;->a:S

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public f()Ljava/lang/String;
    .locals 8

    iget-short v0, p0, Loh2/e;->a:S

    int-to-long v0, v0

    iget-short v2, p0, Loh2/e;->b:S

    int-to-long v2, v2

    iget-short v4, p0, Loh2/e;->c:S

    int-to-long v4, v4

    const/4 v6, 0x3

    new-array v6, v6, [J

    const/4 v7, 0x0

    aput-wide v0, v6, v7

    const/4 v0, 0x1

    aput-wide v2, v6, v0

    const/4 v0, 0x2

    aput-wide v4, v6, v0

    invoke-static {v6}, Luk0/c;->b([J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-short v0, p0, Loh2/e;->a:S

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Loh2/e;->b:S

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-short v1, p0, Loh2/e;->c:S

    add-int/2addr v0, v1

    return v0
.end method
