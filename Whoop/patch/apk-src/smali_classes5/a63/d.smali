.class public final La63/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La63/a;

.field public static final b:Lo63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La63/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La63/a;-><init>(I)V

    sput-object v0, La63/d;->a:La63/a;

    new-instance v0, Lo63/a;

    const-string v1, "BodyProgress"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/d;->b:Lo63/a;

    return-void
.end method
