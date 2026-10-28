.class public abstract Lu0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lu0/a;->z:Lu0/a;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x2d481636

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sget-object v0, Lu0/a;->y:Lu0/a;

    new-instance v1, Lx1/b;

    const v3, 0x1d0170c9

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lu0/s;->a:Lx1/b;

    return-void
.end method
