.class public final La63/k;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lio/ktor/utils/io/jvm/javaio/h;

.field public final synthetic x:Lr63/e;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/jvm/javaio/h;Lr63/e;)V
    .locals 0

    iput-object p1, p0, La63/k;->w:Lio/ktor/utils/io/jvm/javaio/h;

    iput-object p2, p0, La63/k;->x:Lr63/e;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    iget-object v0, p0, La63/k;->w:Lio/ktor/utils/io/jvm/javaio/h;

    invoke-virtual {v0}, Lio/ktor/utils/io/jvm/javaio/h;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    invoke-super {p0}, Ljava/io/InputStream;->close()V

    iget-object v0, p0, La63/k;->w:Lio/ktor/utils/io/jvm/javaio/h;

    invoke-virtual {v0}, Lio/ktor/utils/io/jvm/javaio/h;->close()V

    iget-object v0, p0, La63/k;->x:Lr63/e;

    iget-object v0, v0, Lr63/e;->w:Ljava/lang/Object;

    check-cast v0, Lw53/b;

    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object v0

    invoke-static {v0}, Lj93/l0;->q(Lf63/c;)V

    return-void
.end method

.method public final read()I
    .locals 1

    .line 1
    iget-object v0, p0, La63/k;->w:Lio/ktor/utils/io/jvm/javaio/h;

    invoke-virtual {v0}, Lio/ktor/utils/io/jvm/javaio/h;->read()I

    move-result v0

    return v0
.end method

.method public final read([BII)I
    .locals 1

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, La63/k;->w:Lio/ktor/utils/io/jvm/javaio/h;

    invoke-virtual {v0, p1, p2, p3}, Lio/ktor/utils/io/jvm/javaio/h;->read([BII)I

    move-result p1

    return p1
.end method
