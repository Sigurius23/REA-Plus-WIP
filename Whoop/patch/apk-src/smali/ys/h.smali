.class public abstract Lys/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lys/d;

.field public static final b:Lys/d;

.field public static final c:Lys/d;

.field public static final d:Lys/d;

.field public static final e:Lys/g;

.field public static final f:Lys/g;

.field public static final g:Lys/g;

.field public static final h:Lys/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Lys/c;->g:Lys/c;

    const/high16 v1, 0x100000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lys/c;->d:Lys/c;

    const/16 v4, 0x10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v5, 0x20

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :try_start_0
    invoke-static {}, Lys/d;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v6

    iput-object v4, v6, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v4, v6, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v2, v6, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/google/crypto/tink/internal/k0;->l()Lys/d;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    sput-object v6, Lys/h;->a:Lys/d;

    :try_start_1
    invoke-static {}, Lys/d;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v6

    iput-object v4, v6, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v4, v6, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v1, v6, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/google/crypto/tink/internal/k0;->l()Lys/d;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    sput-object v6, Lys/h;->b:Lys/d;

    :try_start_2
    invoke-static {}, Lys/d;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v6

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v2, v6, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/google/crypto/tink/internal/k0;->l()Lys/d;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    sput-object v6, Lys/h;->c:Lys/d;

    :try_start_3
    invoke-static {}, Lys/d;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v6

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v3, v6, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v5, v6, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v1, v6, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/google/crypto/tink/internal/k0;->l()Lys/d;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    sput-object v3, Lys/h;->d:Lys/d;

    :try_start_4
    invoke-static {}, Lys/g;->b()Lzt/q;

    move-result-object v3

    iput-object v4, v3, Lzt/q;->x:Ljava/lang/Object;

    iput-object v4, v3, Lzt/q;->y:Ljava/lang/Object;

    iput-object v0, v3, Lzt/q;->z:Ljava/lang/Object;

    iput-object v2, v3, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v3}, Lzt/q;->p()Lys/g;

    move-result-object v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    sput-object v3, Lys/h;->e:Lys/g;

    :try_start_5
    invoke-static {}, Lys/g;->b()Lzt/q;

    move-result-object v3

    iput-object v4, v3, Lzt/q;->x:Ljava/lang/Object;

    iput-object v4, v3, Lzt/q;->y:Ljava/lang/Object;

    iput-object v0, v3, Lzt/q;->z:Ljava/lang/Object;

    iput-object v1, v3, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v3}, Lzt/q;->p()Lys/g;

    move-result-object v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    sput-object v3, Lys/h;->f:Lys/g;

    :try_start_6
    invoke-static {}, Lys/g;->b()Lzt/q;

    move-result-object v3

    iput-object v5, v3, Lzt/q;->x:Ljava/lang/Object;

    iput-object v5, v3, Lzt/q;->y:Ljava/lang/Object;

    iput-object v0, v3, Lzt/q;->z:Ljava/lang/Object;

    iput-object v2, v3, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v3}, Lzt/q;->p()Lys/g;

    move-result-object v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    sput-object v2, Lys/h;->g:Lys/g;

    :try_start_7
    invoke-static {}, Lys/g;->b()Lzt/q;

    move-result-object v2

    iput-object v5, v2, Lzt/q;->x:Ljava/lang/Object;

    iput-object v5, v2, Lzt/q;->y:Ljava/lang/Object;

    iput-object v0, v2, Lzt/q;->z:Ljava/lang/Object;

    iput-object v1, v2, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->p()Lys/g;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    sput-object v0, Lys/h;->h:Lys/g;

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_5
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_6
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_7
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
