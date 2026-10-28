.class public final La63/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La63/a;

.field public static final c:Lo63/a;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La63/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, La63/a;-><init>(I)V

    sput-object v0, La63/e0;->b:La63/a;

    new-instance v0, Lo63/a;

    const-string v1, "HttpSend"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/e0;->c:Lo63/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La63/e0;->a:Ljava/util/ArrayList;

    return-void
.end method
