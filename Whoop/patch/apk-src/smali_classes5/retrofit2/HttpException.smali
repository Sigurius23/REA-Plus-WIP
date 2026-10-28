.class public Lretrofit2/HttpException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Ljava/lang/String;

.field public final transient y:Lpg3/v0;


# direct methods
.method public constructor <init>(Lpg3/v0;)V
    .locals 3

    const-string v0, "response == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HTTP "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lpg3/v0;->a:Lud3/x0;

    iget v2, v1, Lud3/x0;->z:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lud3/x0;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iget v0, v1, Lud3/x0;->z:I

    iput v0, p0, Lretrofit2/HttpException;->w:I

    iget-object v0, v1, Lud3/x0;->y:Ljava/lang/String;

    iput-object v0, p0, Lretrofit2/HttpException;->x:Ljava/lang/String;

    iput-object p1, p0, Lretrofit2/HttpException;->y:Lpg3/v0;

    return-void
.end method
