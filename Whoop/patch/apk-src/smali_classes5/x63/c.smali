.class public final synthetic Lx63/c;
.super Lkotlin/jvm/internal/q;
.source "SourceFile"


# static fields
.field public static final w:Lx63/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lx63/c;

    const-string v1, "getTop()J"

    const/4 v2, 0x0

    const-class v3, Lx63/d;

    const-string v4, "top"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lx63/c;->w:Lx63/c;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lx63/d;

    invoke-static {p1}, Lx63/d;->b(Lx63/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lx63/d;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lx63/d;->h(Lx63/d;J)V

    return-void
.end method
