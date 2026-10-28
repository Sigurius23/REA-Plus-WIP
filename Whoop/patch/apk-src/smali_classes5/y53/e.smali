.class public abstract Ly53/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo63/a;

    const-string v1, "EngineCapabilities"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly53/e;->a:Lo63/a;

    sget-object v0, La63/h0;->d:La63/g0;

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    return-void
.end method
