.class public final Lpg3/r0;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final a:Lud3/v0;

.field public final b:Lud3/h0;


# direct methods
.method public constructor <init>(Lud3/v0;Lud3/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/r0;->a:Lud3/v0;

    iput-object p2, p0, Lpg3/r0;->b:Lud3/h0;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lpg3/r0;->a:Lud3/v0;

    invoke-virtual {v0}, Lud3/v0;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lpg3/r0;->b:Lud3/h0;

    return-object v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 1

    iget-object v0, p0, Lpg3/r0;->a:Lud3/v0;

    invoke-virtual {v0, p1}, Lud3/v0;->writeTo(Lne3/i;)V

    return-void
.end method
