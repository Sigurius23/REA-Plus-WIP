.class public final Lio/ktor/utils/io/internal/i;
.super Lio/ktor/utils/io/internal/m;
.source "SourceFile"


# instance fields
.field public final c:Lio/ktor/utils/io/internal/j;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/internal/j;)V
    .locals 2

    iget-object v0, p1, Lio/ktor/utils/io/internal/m;->a:Ljava/nio/ByteBuffer;

    iget-object v1, p1, Lio/ktor/utils/io/internal/m;->b:Lio/ktor/utils/io/internal/o;

    invoke-direct {p0, v0, v1}, Lio/ktor/utils/io/internal/m;-><init>(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/o;)V

    iput-object p1, p0, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    return-void
.end method


# virtual methods
.method public final c()Lio/ktor/utils/io/internal/m;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    iget-object v0, v0, Lio/ktor/utils/io/internal/j;->f:Lio/ktor/utils/io/internal/k;

    return-object v0
.end method

.method public final d()Lio/ktor/utils/io/internal/m;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/internal/i;->c:Lio/ktor/utils/io/internal/j;

    iget-object v0, v0, Lio/ktor/utils/io/internal/j;->g:Lio/ktor/utils/io/internal/k;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "IDLE(with buffer)"

    return-object v0
.end method
