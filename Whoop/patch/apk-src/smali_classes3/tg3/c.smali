.class public final Ltg3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final x:Lne3/l;


# instance fields
.field public final w:Lcom/squareup/moshi/JsonAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lne3/l;->z:Lne3/k;

    const-string v0, "EFBBBF"

    invoke-static {v0}, Lne3/k;->a(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Ltg3/c;->x:Lne3/l;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg3/c;->w:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->d1()Lne3/j;

    move-result-object v0

    :try_start_0
    sget-object v1, Ltg3/c;->x:Lne3/l;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lne3/l;->w:[B

    array-length v1, v1

    int-to-long v1, v1

    invoke-interface {v0, v1, v2}, Lne3/j;->skip(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v1, Lqx/x;

    invoke-direct {v1, v0}, Lqx/x;-><init>(Lne3/j;)V

    iget-object v0, p0, Ltg3/c;->w:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, Lqx/x;->k()Lqx/w;

    move-result-object v1

    sget-object v2, Lqx/w;->J:Lqx/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lud3/a1;->close()V

    return-object v0

    :cond_1
    :try_start_1
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p1}, Lud3/a1;->close()V

    throw v0
.end method
