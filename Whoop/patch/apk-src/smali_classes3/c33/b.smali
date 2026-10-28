.class public final Lc33/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lc33/b;

.field public static final y:Lc33/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lc33/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc33/b;-><init>(II)V

    sput-object v0, Lc33/b;->x:Lc33/b;

    new-instance v0, Lc33/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc33/b;-><init>(II)V

    sput-object v0, Lc33/b;->y:Lc33/b;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lc33/b;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc33/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lc33/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Lc33/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc33/a;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadExecutor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbc3/d1;

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-direct {v1, v0}, Lbc3/d1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
