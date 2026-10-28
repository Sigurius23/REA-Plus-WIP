.class public abstract Lb30/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;

.field public static final b:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lx1/b;

    sget-object v1, Lb30/c0;->w:Lb30/c0;

    const/4 v2, 0x0

    const v3, -0x565427a6

    invoke-direct {v0, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v0, Lb30/e0;->a:Lx1/b;

    new-instance v0, Lx1/b;

    sget-object v1, Lb30/d0;->w:Lb30/d0;

    const v3, 0x4587950

    invoke-direct {v0, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v0, Lb30/e0;->b:Lx1/b;

    return-void
.end method
