.class public final Lcom/squareup/wire/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lne3/i;


# direct methods
.method public constructor <init>(Lne3/i;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/squareup/wire/s;->a:Lne3/i;

    return-void
.end method


# virtual methods
.method public final a(Lne3/l;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/squareup/wire/s;->a:Lne3/i;

    invoke-interface {v0, p1}, Lne3/i;->Q(Lne3/l;)Lne3/i;

    return-void
.end method

.method public final b(ILcom/squareup/wire/d;)V
    .locals 1

    const-string v0, "fieldEncoding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    shl-int/lit8 p1, p1, 0x3

    iget p2, p2, Lcom/squareup/wire/d;->w:I

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/squareup/wire/s;->c(I)V

    return-void
.end method

.method public final c(I)V
    .locals 2

    :goto_0
    and-int/lit8 v0, p1, -0x80

    iget-object v1, p0, Lcom/squareup/wire/s;->a:Lne3/i;

    if-eqz v0, :cond_0

    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-interface {v1, v0}, Lne3/i;->writeByte(I)Lne3/i;

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_0
    invoke-interface {v1, p1}, Lne3/i;->writeByte(I)Lne3/i;

    return-void
.end method

.method public final d(J)V
    .locals 4

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    iget-object v1, p0, Lcom/squareup/wire/s;->a:Lne3/i;

    if-eqz v0, :cond_0

    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-interface {v1, v0}, Lne3/i;->writeByte(I)Lne3/i;

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0

    :cond_0
    long-to-int p1, p1

    invoke-interface {v1, p1}, Lne3/i;->writeByte(I)Lne3/i;

    return-void
.end method
