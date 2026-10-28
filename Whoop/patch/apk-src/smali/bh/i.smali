.class public final Lbh/i;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final synthetic w:Lbh/j;


# direct methods
.method public constructor <init>(Lbh/j;)V
    .locals 0

    iput-object p1, p0, Lbh/i;->w:Lbh/j;

    sget-object p1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {p0, p1}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method


# virtual methods
.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lbh/i;->w:Lbh/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
