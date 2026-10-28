.class public Ly82/b$t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly82/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "t"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;


# direct methods
.method private constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ly82/b$t;->a:Z

    iput-object p2, p0, Ly82/b$t;->b:Ljava/lang/String;

    return-void
.end method

.method public static a()Ly82/b$t;
    .locals 1

    const-string v0, "Failed"

    invoke-static {v0}, Ly82/b$t;->b(Ljava/lang/String;)Ly82/b$t;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ly82/b$t;
    .locals 2

    new-instance v0, Ly82/b$t;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ly82/b$t;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public static c()Ly82/b$t;
    .locals 1

    const-string v0, "Success"

    invoke-static {v0}, Ly82/b$t;->d(Ljava/lang/String;)Ly82/b$t;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ly82/b$t;
    .locals 2

    new-instance v0, Ly82/b$t;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ly82/b$t;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public static g(Ly82/b$t;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ly82/b$t;->f()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly82/b$t;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ly82/b$t;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WhoopAction.Result(success="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ly82/b$t;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly82/b$t;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
