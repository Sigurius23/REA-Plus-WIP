.class public abstract Lg1/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lg1/e1;->y:Lg1/e1;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, 0x100c7e83

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sget-object v0, Lg1/e1;->x:Lg1/e1;

    new-instance v1, Lx1/b;

    const v3, 0x4b1c13bb    # 1.0228667E7f

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lg1/f1;->a:Lx1/b;

    return-void
.end method
