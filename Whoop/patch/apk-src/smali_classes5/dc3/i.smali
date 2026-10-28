.class public final synthetic Ldc3/i;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Ldc3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ldc3/i;

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Ldc3/j;

    const-string v3, "createSegment"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Ldc3/i;->w:Ldc3/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    move-object v3, p2

    check-cast v3, Ldc3/p;

    sget-object p1, Ldc3/j;->a:Ldc3/p;

    new-instance v0, Ldc3/p;

    iget-object v4, v3, Ldc3/p;->E:Ldc3/h;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Ldc3/p;-><init>(JLdc3/p;Ldc3/h;I)V

    return-object v0
.end method
