.class public final Lq33/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb30/m;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb30/m;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lb30/m;-><init>(I)V

    const/4 v1, 0x0

    new-array v2, v1, [I

    iput-object v2, v0, Lb30/m;->x:Ljava/lang/Object;

    new-array v2, v1, [I

    iput-object v2, v0, Lb30/m;->y:Ljava/lang/Object;

    new-array v2, v1, [I

    iput-object v2, v0, Lb30/m;->z:Ljava/lang/Object;

    new-array v2, v1, [I

    iput-object v2, v0, Lb30/m;->E:Ljava/lang/Object;

    new-array v1, v1, [I

    iput-object v1, v0, Lb30/m;->F:Ljava/lang/Object;

    iput-object v0, p0, Lq33/a;->a:Lb30/m;

    return-void
.end method
