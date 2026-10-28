.class Li92/p;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private w:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "Web Exception Tracer"

    invoke-direct {p0, v0}, Li92/p;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Li92/p;->w:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Li92/p;
    .locals 2

    iget-boolean v0, p0, Li92/p;->w:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Li92/p;->w:Z

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object p0

    :cond_0
    new-instance v0, Li92/p;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Li92/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    invoke-virtual {v0, p1}, Li92/p;->a(Ljava/lang/Throwable;)Li92/p;

    move-result-object p1

    return-object p1
.end method
