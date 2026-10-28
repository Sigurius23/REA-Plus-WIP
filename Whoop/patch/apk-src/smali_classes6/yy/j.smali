.class public final Lyy/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lab/i0;

.field public final b:Lq83/j;

.field public final c:Lqy/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    .line 2
    sget-object v0, Lkc3/d;->w:Lkc3/d;

    .line 3
    sget-object v1, Lqy/e;->b:Lqy/d;

    invoke-direct {p0, v1, v0}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    return-void
.end method

.method public constructor <init>(Lqy/d;Lq83/j;)V
    .locals 2

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lab/i0;

    const/16 v1, 0xe

    invoke-direct {v0, p2, p1, v1}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object v0, p0, Lyy/j;->a:Lab/i0;

    .line 7
    iput-object p2, p0, Lyy/j;->b:Lq83/j;

    .line 8
    iput-object p1, p0, Lyy/j;->c:Lqy/d;

    return-void
.end method


# virtual methods
.method public final a(Lyy/b;)V
    .locals 4

    iget-object v0, p1, Lyy/b;->a:Ljava/util/LinkedHashMap;

    const-string v1, "event"

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Event: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lyy/j;->c:Lqy/d;

    invoke-virtual {v1, v0}, Lqy/d;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lyy/j;->b:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Lx30/k0;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
