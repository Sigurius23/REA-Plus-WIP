.class public final synthetic Lbc3/s1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lbc3/s1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lbc3/s1;

    const-string v4, "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, Lbc3/t1;

    const-string v3, "registerSelectForOnJoin"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lbc3/s1;->w:Lbc3/s1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lbc3/t1;

    check-cast p2, Llc3/g;

    sget-object p3, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    sget-object p3, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    instance-of v0, p3, Lbc3/g1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_1

    check-cast p2, Llc3/f;

    iput-object v1, p2, Llc3/f;->E:Ljava/lang/Object;

    return-object v1

    :cond_1
    invoke-virtual {p1, p3}, Lbc3/t1;->U(Ljava/lang/Object;)I

    move-result p3

    if-ltz p3, :cond_0

    new-instance p3, Lbc3/q1;

    invoke-direct {p3, p1, p2}, Lbc3/q1;-><init>(Lbc3/t1;Llc3/g;)V

    const/4 v0, 0x1

    invoke-static {p1, v0, p3}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    move-result-object p1

    check-cast p2, Llc3/f;

    iput-object p1, p2, Llc3/f;->y:Ljava/lang/Object;

    return-object v1
.end method
