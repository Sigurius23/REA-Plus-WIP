.class public final Lud3/r0;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lud3/h0;

.field public final synthetic b:Lne3/l;


# direct methods
.method public constructor <init>(Lud3/h0;Lne3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/r0;->a:Lud3/h0;

    iput-object p2, p0, Lud3/r0;->b:Lne3/l;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lud3/r0;->b:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lud3/r0;->a:Lud3/h0;

    return-object v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 1

    iget-object v0, p0, Lud3/r0;->b:Lne3/l;

    invoke-interface {p1, v0}, Lne3/i;->Q(Lne3/l;)Lne3/i;

    return-void
.end method
