.class public abstract Lqs/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqs/l;

.field public static final b:Lqs/l;

.field public static final c:Lqs/d;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    sget-object v0, Lqs/j;->f:Lqs/j;

    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lqs/j;->d:Lqs/j;

    sget-object v3, Lqs/k;->b:Lqs/k;

    const/16 v4, 0x20

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :try_start_0
    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v6

    iput-object v5, v6, Lzt/q;->x:Ljava/lang/Object;

    const/16 v7, 0x10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v6, Lzt/q;->y:Ljava/lang/Object;

    iput-object v3, v6, Lzt/q;->E:Ljava/lang/Object;

    iput-object v2, v6, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v6}, Lzt/q;->n()Lqs/l;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    sput-object v6, Lqs/o;->a:Lqs/l;

    :try_start_1
    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v6

    iput-object v5, v6, Lzt/q;->x:Ljava/lang/Object;

    iput-object v5, v6, Lzt/q;->y:Ljava/lang/Object;

    iput-object v3, v6, Lzt/q;->E:Ljava/lang/Object;

    iput-object v2, v6, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v6}, Lzt/q;->n()Lqs/l;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v2

    iput-object v1, v2, Lzt/q;->x:Ljava/lang/Object;

    iput-object v5, v2, Lzt/q;->y:Ljava/lang/Object;

    iput-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    iput-object v0, v2, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->n()Lqs/l;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v2

    iput-object v1, v2, Lzt/q;->x:Ljava/lang/Object;

    iput-object v1, v2, Lzt/q;->y:Ljava/lang/Object;

    iput-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    iput-object v0, v2, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->n()Lqs/l;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    sput-object v0, Lqs/o;->b:Lqs/l;

    :try_start_4
    invoke-static {}, Lqs/d;->b()La3/p;

    move-result-object v0

    invoke-virtual {v0, v4}, La3/p;->S(I)V

    invoke-virtual {v0, v7}, La3/p;->V(I)V

    sget-object v1, Lqs/c;->b:Lqs/c;

    iput-object v1, v0, La3/p;->z:Ljava/lang/Object;

    invoke-virtual {v0}, La3/p;->o()Lqs/d;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sput-object v0, Lqs/o;->c:Lqs/d;

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
.end method
