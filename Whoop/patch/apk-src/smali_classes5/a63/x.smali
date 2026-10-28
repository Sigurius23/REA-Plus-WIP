.class public final La63/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La63/a;

.field public static final b:Lo63/a;

.field public static final c:Lio/sentry/hints/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La63/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, La63/a;-><init>(I)V

    sput-object v0, La63/x;->a:La63/a;

    new-instance v0, Lo63/a;

    const-string v1, "HttpRedirect"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/x;->b:Lo63/a;

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, La63/x;->c:Lio/sentry/hints/j;

    return-void
.end method
