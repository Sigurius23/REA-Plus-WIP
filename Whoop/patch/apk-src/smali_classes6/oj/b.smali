.class public abstract Loj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Loj/a;->x:Loj/a;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0xb7290b7

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Loj/b;->a:Lx1/b;

    return-void
.end method
