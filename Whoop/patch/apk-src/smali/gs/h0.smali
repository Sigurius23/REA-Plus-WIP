.class public abstract Lgs/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgs/q;

.field public static final b:Lgs/q;

.field public static final c:Lgs/n;

.field public static final d:Lgs/n;

.field public static final e:Lgs/k;

.field public static final f:Lgs/k;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Lgs/j;->h:Lgs/j;

    sget-object v1, Lgs/j;->e:Lgs/j;

    sget-object v2, Lgs/j;->k:Lgs/j;

    sget-object v3, Lgs/j;->n:Lgs/j;

    :try_start_0
    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v4

    invoke-virtual {v4}, Lzt/q;->I()V

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lzt/q;->K(I)V

    invoke-virtual {v4}, Lzt/q;->L()V

    iput-object v3, v4, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v4}, Lzt/q;->j()Lgs/q;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    sput-object v4, Lgs/h0;->a:Lgs/q;

    :try_start_1
    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v4

    invoke-virtual {v4}, Lzt/q;->I()V

    const/16 v6, 0x20

    invoke-virtual {v4, v6}, Lzt/q;->K(I)V

    invoke-virtual {v4}, Lzt/q;->L()V

    iput-object v3, v4, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v4}, Lzt/q;->j()Lgs/q;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    sput-object v3, Lgs/h0;->b:Lgs/q;

    :try_start_2
    invoke-static {}, Lgs/n;->b()Lzt/q;

    move-result-object v3

    invoke-virtual {v3, v5}, Lzt/q;->J(I)V

    invoke-virtual {v3, v5}, Lzt/q;->K(I)V

    invoke-virtual {v3}, Lzt/q;->L()V

    iput-object v2, v3, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v3}, Lzt/q;->g()Lgs/n;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    sput-object v3, Lgs/h0;->c:Lgs/n;

    :try_start_3
    invoke-static {}, Lgs/n;->b()Lzt/q;

    move-result-object v3

    invoke-virtual {v3, v5}, Lzt/q;->J(I)V

    invoke-virtual {v3, v6}, Lzt/q;->K(I)V

    invoke-virtual {v3}, Lzt/q;->L()V

    iput-object v2, v3, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v3}, Lzt/q;->g()Lgs/n;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    sput-object v2, Lgs/h0;->d:Lgs/n;

    :try_start_4
    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v1, v2, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v0, v2, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    sput-object v2, Lgs/h0;->e:Lgs/k;

    :try_start_5
    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v1, v2, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v0, v2, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    sput-object v0, Lgs/h0;->f:Lgs/k;

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
.end method
