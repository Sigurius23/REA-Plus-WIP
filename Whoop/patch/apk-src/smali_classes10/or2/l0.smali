.class public abstract Lor2/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "IoUtils"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lor2/l0;->a:Ltr2/n;

    return-void
.end method

.method public static varargs a([Ljava/io/Closeable;)V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    :try_start_0
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v5, Lor2/l0;->a:Ltr2/n;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "failed to close "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v6, v1, [Lqr2/a$a;

    invoke-interface {v5, v3, v4, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
