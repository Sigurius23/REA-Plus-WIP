.class public abstract Lc53/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc53/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc53/b;

    const/4 v1, 0x0

    sget-object v2, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v2, v1}, Lc53/b;-><init>(Lq83/i;I)V

    sput-object v0, Lc53/c;->a:Lc53/b;

    return-void
.end method

.method public static a()Lc53/a;
    .locals 2

    new-instance v0, Lc53/a;

    sget-object v1, Lc53/c;->a:Lc53/b;

    invoke-direct {v0, v1}, Lc53/a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler;)V

    return-object v0
.end method
