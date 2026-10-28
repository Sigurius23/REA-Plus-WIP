.class public final Lud3/t0;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lud3/h0;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lud3/h0;[BII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/t0;->a:Lud3/h0;

    iput p3, p0, Lud3/t0;->b:I

    iput-object p2, p0, Lud3/t0;->c:[B

    iput p4, p0, Lud3/t0;->d:I

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget v0, p0, Lud3/t0;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lud3/t0;->a:Lud3/h0;

    return-object v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 3

    iget v0, p0, Lud3/t0;->d:I

    iget v1, p0, Lud3/t0;->b:I

    iget-object v2, p0, Lud3/t0;->c:[B

    invoke-interface {p1, v2, v0, v1}, Lne3/i;->write([BII)Lne3/i;

    return-void
.end method
