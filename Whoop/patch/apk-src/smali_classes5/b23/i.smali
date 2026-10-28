.class public final Lb23/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb23/i;

.field public static b:Z

.field public static volatile c:Lb23/j;

.field public static volatile d:Lb23/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb23/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/d;->a:Lb23/d;

    sput-object v0, Lb23/i;->c:Lb23/j;

    new-instance v0, Lb23/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb23/h;-><init>(I)V

    sput-object v0, Lb23/i;->d:Lb23/e;

    return-void
.end method

.method public static a()Lb23/j;
    .locals 1

    sget-object v0, Lb23/i;->c:Lb23/j;

    return-object v0
.end method

.method public static b()Lb23/e;
    .locals 1

    sget-object v0, Lb23/i;->d:Lb23/e;

    return-object v0
.end method

.method public static final c(Lb23/j;)V
    .locals 6

    sget-boolean v0, Lb23/i;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    const-string v2, "StreamLog"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb23/i;->c:Lb23/j;

    sget-object v3, Lb23/i;->c:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "The logger "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is already installed but you\'ve tried to install a new logger: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lb23/i;->b:Z

    sput-object p0, Lb23/i;->c:Lb23/j;

    return-void
.end method
