.class public final Lpg3/d0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/reflect/Method;

.field public final d:I

.field public final e:Lpg3/n;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILpg3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/d0;->c:Ljava/lang/reflect/Method;

    iput p2, p0, Lpg3/d0;->d:I

    iput-object p3, p0, Lpg3/d0;->e:Lpg3/n;

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 5

    const/4 v0, 0x0

    iget v1, p0, Lpg3/d0;->d:I

    iget-object v2, p0, Lpg3/d0;->c:Ljava/lang/reflect/Method;

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v3, p0, Lpg3/d0;->e:Lpg3/n;

    invoke-interface {v3, p2}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lud3/v0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object v3, p1, Lpg3/s0;->k:Lud3/v0;

    return-void

    :catch_0
    move-exception p1

    const-string v3, "Unable to convert "

    const-string v4, " to RequestBody"

    invoke-static {p2, v3, v4}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, p1, v1, p2, v0}, Lpg3/e1;->o(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_0
    const-string p1, "Body parameter value must not be null."

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p1, p2}, Lpg3/e1;->n(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method
