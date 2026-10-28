.class public final Lwe/e0;
.super Lb3/b;
.source "SourceFile"


# instance fields
.field public final d:Lc93/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lwe/d0;->w:Lwe/d0;

    sget-object v1, Lwe/e;->x:Lwe/e;

    invoke-direct {p0, v1, v0}, Lb3/b;-><init>(Lwe/e;Lc93/a;)V

    iput-object v0, p0, Lwe/e0;->d:Lc93/a;

    return-void
.end method


# virtual methods
.method public final a(Lwe/g;)[B
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AWS4"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lwe/g;->m:Lve/e;

    iget-object v1, v1, Lve/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p1, Lwe/g;->d:Lug/b;

    sget-object v2, Lug/t;->y:Lug/t;

    invoke-virtual {v1, v2}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v1

    iget-object v2, p0, Lwe/e0;->d:Lc93/a;

    invoke-static {v0, v1, v2}, Ltx/f;->P([B[BLc93/a;)[B

    move-result-object v0

    iget-object v1, p1, Lwe/g;->b:Ljava/lang/String;

    invoke-static {v1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1, v2}, Ltx/f;->P([B[BLc93/a;)[B

    move-result-object v0

    iget-object p1, p1, Lwe/g;->c:Ljava/lang/String;

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {v0, p1, v2}, Ltx/f;->P([B[BLc93/a;)[B

    move-result-object p1

    const-string v0, "aws4_request"

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {p1, v0, v2}, Ltx/f;->P([B[BLc93/a;)[B

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 1

    const-string v0, "signingKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringToSign"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v0, p0, Lwe/e0;->d:Lc93/a;

    invoke-static {p2, p1, v0}, Ltx/f;->P([B[BLc93/a;)[B

    move-result-object p1

    invoke-static {p1}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final t()Lc93/a;
    .locals 1

    iget-object v0, p0, Lwe/e0;->d:Lc93/a;

    return-object v0
.end method
