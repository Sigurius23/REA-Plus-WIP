.class public final synthetic Ldc3/e;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Ldc3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ldc3/e;

    const-string v4, "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, Ldc3/h;

    const-string v3, "processResultSelectReceiveCatching"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Ldc3/e;->w:Ldc3/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldc3/h;

    sget-object p2, Ldc3/h;->x:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Ldc3/j;->l:Lhc3/x;

    if-ne p3, p2, :cond_0

    invoke-virtual {p1}, Ldc3/h;->n()Ljava/lang/Throwable;

    move-result-object p1

    new-instance p3, Ldc3/m;

    invoke-direct {p3, p1}, Ldc3/m;-><init>(Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, Ldc3/o;

    invoke-direct {p1, p3}, Ldc3/o;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
