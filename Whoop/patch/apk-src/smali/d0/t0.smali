.class public final Ld0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Lmc3/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ld0/t0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Ld0/t0;->b:Lmc3/c;

    return-void
.end method

.method public static a(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Ld0/r0;->w:Ld0/r0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, La6/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, La6/f;-><init>(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
