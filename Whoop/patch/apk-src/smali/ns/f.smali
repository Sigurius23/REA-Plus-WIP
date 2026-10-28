.class public final Lns/f;
.super Lns/t;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/Set;


# instance fields
.field public final a:Lns/b;

.field public final b:Lns/c;

.field public final c:Lns/d;

.field public final d:Lns/e;

.field public final e:Lfs/k;

.field public final f:Lct/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/okhttp/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lio/sentry/okhttp/b;-><init>(I)V

    sget v1, Lcom/google/crypto/tink/internal/TinkBugException;->w:I

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/okhttp/b;->k()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    check-cast v0, Ljava/util/Set;

    sput-object v0, Lns/f;->g:Ljava/util/Set;

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Lns/b;Lns/c;Lns/d;Lfs/k;Lns/e;Lct/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns/f;->a:Lns/b;

    iput-object p2, p0, Lns/f;->b:Lns/c;

    iput-object p3, p0, Lns/f;->c:Lns/d;

    iput-object p4, p0, Lns/f;->e:Lfs/k;

    iput-object p5, p0, Lns/f;->d:Lns/e;

    iput-object p6, p0, Lns/f;->f:Lct/a;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/internal/k0;
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    sget-object v2, Lns/e;->d:Lns/e;

    iput-object v2, v0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lns/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lns/f;

    iget-object v0, p1, Lns/f;->a:Lns/b;

    iget-object v2, p0, Lns/f;->a:Lns/b;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lns/f;->b:Lns/c;

    iget-object v2, p0, Lns/f;->b:Lns/c;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lns/f;->c:Lns/d;

    iget-object v2, p0, Lns/f;->c:Lns/d;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lns/f;->e:Lfs/k;

    iget-object v2, p0, Lns/f;->e:Lfs/k;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lns/f;->d:Lns/e;

    iget-object v2, p0, Lns/f;->d:Lns/e;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lns/f;->f:Lct/a;

    iget-object v0, p0, Lns/f;->f:Lct/a;

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 7

    iget-object v5, p0, Lns/f;->d:Lns/e;

    iget-object v6, p0, Lns/f;->f:Lct/a;

    const-class v0, Lns/f;

    iget-object v1, p0, Lns/f;->a:Lns/b;

    iget-object v2, p0, Lns/f;->b:Lns/c;

    iget-object v3, p0, Lns/f;->c:Lns/d;

    iget-object v4, p0, Lns/f;->e:Lfs/k;

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v4, p0, Lns/f;->d:Lns/e;

    iget-object v5, p0, Lns/f;->f:Lct/a;

    iget-object v0, p0, Lns/f;->a:Lns/b;

    iget-object v1, p0, Lns/f;->b:Lns/c;

    iget-object v2, p0, Lns/f;->c:Lns/d;

    iget-object v3, p0, Lns/f;->e:Lfs/k;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
