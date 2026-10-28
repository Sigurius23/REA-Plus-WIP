.class public abstract Lj00/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;

.field public static final b:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lj00/a;->x:Lj00/a;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x4e577e0e    # 9.0384064E8f

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lj00/b;->a:Lx1/b;

    sget-object v0, Lj00/a;->y:Lj00/a;

    new-instance v1, Lx1/b;

    const v3, 0x61b14d08

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lj00/b;->b:Lx1/b;

    return-void
.end method
