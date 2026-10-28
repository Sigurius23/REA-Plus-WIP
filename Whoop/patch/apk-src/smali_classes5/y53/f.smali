.class public abstract Ly53/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbc3/b0;

.field public static final b:Lo63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbc3/b0;

    const-string v1, "call-context"

    invoke-direct {v0, v1}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly53/f;->a:Lbc3/b0;

    new-instance v0, Lo63/a;

    const-string v1, "client-config"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly53/f;->b:Lo63/a;

    return-void
.end method
