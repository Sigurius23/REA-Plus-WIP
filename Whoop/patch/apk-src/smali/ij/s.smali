.class public final synthetic Lij/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Lcom/amplitude/quickjs/wrapper/JSFunction;

.field public final synthetic x:Lij/t;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/quickjs/wrapper/JSFunction;Lij/t;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/s;->w:Lcom/amplitude/quickjs/wrapper/JSFunction;

    iput-object p2, p0, Lij/s;->x:Lij/t;

    iput-wide p3, p0, Lij/s;->y:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lij/s;->w:Lcom/amplitude/quickjs/wrapper/JSFunction;

    iget-wide v1, p0, Lij/s;->y:J

    const-string v3, "Error in setTimeout callback: "

    iget-object v4, p0, Lij/s;->x:Lij/t;

    iget-object v4, v4, Lij/t;->G:Ljava/util/LinkedHashMap;

    const/4 v5, 0x0

    :try_start_0
    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v0, v5}, Lcom/amplitude/quickjs/wrapper/JSFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    sget-object v5, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method
