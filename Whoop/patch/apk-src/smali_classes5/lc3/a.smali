.class public final synthetic Llc3/a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Llc3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Llc3/a;

    const-string v4, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, Llc3/b;

    const-string v3, "register"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Llc3/a;->w:Llc3/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Llc3/b;

    check-cast p2, Llc3/g;

    iget-wide v0, p1, Llc3/b;->a:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-gtz p3, :cond_0

    check-cast p2, Llc3/f;

    iput-object v2, p2, Llc3/f;->E:Ljava/lang/Object;

    return-object v2

    :cond_0
    new-instance p3, Landroidx/lifecycle/m;

    const/16 v3, 0x19

    invoke-direct {p3, v3, p2, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Llc3/f;

    iget-object p1, p2, Llc3/f;->w:Lq83/j;

    invoke-static {p1}, Lbc3/m0;->d(Lq83/j;)Lbc3/k0;

    move-result-object v3

    invoke-interface {v3, v0, v1, p3, p1}, Lbc3/k0;->i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;

    move-result-object p1

    iput-object p1, p2, Llc3/f;->y:Ljava/lang/Object;

    return-object v2
.end method
