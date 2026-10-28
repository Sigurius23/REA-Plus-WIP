.class public abstract Lqf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/c;

.field public static final b:Lgf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    new-instance v1, Lgf/a;

    const-string v2, "state"

    invoke-direct {v1, v2}, Lgf/a;-><init>(Ljava/lang/String;)V

    const-string v3, "idle"

    invoke-virtual {v0, v1, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    sput-object v0, Lqf/a;->a:Lgf/c;

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    new-instance v1, Lgf/a;

    invoke-direct {v1, v2}, Lgf/a;-><init>(Ljava/lang/String;)V

    const-string v3, "acquired"

    invoke-virtual {v0, v1, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    new-instance v1, Lgf/a;

    invoke-direct {v1, v2}, Lgf/a;-><init>(Ljava/lang/String;)V

    const-string v3, "queued"

    invoke-virtual {v0, v1, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    new-instance v1, Lgf/a;

    invoke-direct {v1, v2}, Lgf/a;-><init>(Ljava/lang/String;)V

    const-string v2, "in-flight"

    invoke-virtual {v0, v1, v2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    sput-object v0, Lqf/a;->b:Lgf/c;

    return-void
.end method

.method public static a()Lgf/c;
    .locals 1

    sget-object v0, Lqf/a;->a:Lgf/c;

    return-object v0
.end method

.method public static b()Lgf/c;
    .locals 1

    sget-object v0, Lqf/a;->b:Lgf/c;

    return-object v0
.end method
