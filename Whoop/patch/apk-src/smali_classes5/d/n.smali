.class public final Ld/n;
.super Ld/b1;
.source "SourceFile"


# static fields
.field public static final b:Ld/n;

.field public static final c:Ld/n;


# instance fields
.field public final a:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld/n;-><init>(B)V

    sput-object v0, Ld/n;->b:Ld/n;

    new-instance v0, Ld/n;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ld/n;-><init>(B)V

    sput-object v0, Ld/n;->c:Ld/n;

    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Ld/n;->a:B

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p1, v0}, Lro/i;->d(I)V

    iget-object p1, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/ByteArrayOutputStream;

    iget-byte p2, p0, Ld/n;->a:B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 2

    instance-of v0, p1, Ld/n;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ld/n;

    invoke-virtual {p0}, Ld/n;->l()Z

    move-result v0

    invoke-virtual {p1}, Ld/n;->l()Z

    move-result p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Ld/n;->l()Z

    move-result v0

    return v0
.end method

.method public final j()Ld/b1;
    .locals 1

    invoke-virtual {p0}, Ld/n;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ld/n;->c:Ld/n;

    return-object v0

    :cond_0
    sget-object v0, Ld/n;->b:Ld/n;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-byte v0, p0, Ld/n;->a:B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ld/n;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TRUE"

    return-object v0

    :cond_0
    const-string v0, "FALSE"

    return-object v0
.end method
