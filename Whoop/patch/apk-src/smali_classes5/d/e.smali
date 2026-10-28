.class public final Ld/e;
.super Ld/b1;
.source "SourceFile"


# static fields
.field public static final a:Ld/e;

.field public static final b:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld/e;->a:Ld/e;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Ld/e;->b:[B

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    sget-object v0, Ld/e;->b:[B

    const/4 v1, 0x5

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 0

    instance-of p1, p1, Ld/e;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NULL"

    return-object v0
.end method
