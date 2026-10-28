.class public abstract Lm40/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/b;

.field public static final b:Lx1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lm40/a;->x:Lm40/a;

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x250c284d

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lm40/b;->a:Lx1/b;

    sget-object v0, Lm40/a;->y:Lm40/a;

    new-instance v1, Lx1/b;

    const v3, 0x76f8f9e7

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lm40/b;->b:Lx1/b;

    return-void
.end method
