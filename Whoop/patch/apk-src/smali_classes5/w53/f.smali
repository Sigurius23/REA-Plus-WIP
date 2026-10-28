.class public final Lw53/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le63/b;


# instance fields
.field public final synthetic w:Le63/b;


# direct methods
.method public constructor <init>(Lw53/e;Le63/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw53/f;->w:Le63/b;

    return-void
.end method


# virtual methods
.method public final getAttributes()Lo63/f;
    .locals 1

    iget-object v0, p0, Lw53/f;->w:Le63/b;

    invoke-interface {v0}, Le63/b;->getAttributes()Lo63/f;

    move-result-object v0

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lw53/f;->w:Le63/b;

    invoke-interface {v0}, Le63/b;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final getHeaders()Li63/m;
    .locals 1

    iget-object v0, p0, Lw53/f;->w:Le63/b;

    invoke-interface {v0}, Li63/s;->getHeaders()Li63/m;

    move-result-object v0

    return-object v0
.end method

.method public final getMethod()Li63/t;
    .locals 1

    iget-object v0, p0, Lw53/f;->w:Le63/b;

    invoke-interface {v0}, Le63/b;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public final getUrl()Li63/e0;
    .locals 1

    iget-object v0, p0, Lw53/f;->w:Le63/b;

    invoke-interface {v0}, Le63/b;->getUrl()Li63/e0;

    move-result-object v0

    return-object v0
.end method
