.class public final synthetic Lmc3/f;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lmc3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lmc3/f;

    const-string v4, "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    const-class v2, Lmc3/j;

    const-string v3, "createSegment"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lmc3/f;->w:Lmc3/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lmc3/k;

    sget p1, Lmc3/j;->a:I

    new-instance p1, Lmc3/k;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lmc3/k;-><init>(JLmc3/k;I)V

    return-object p1
.end method
