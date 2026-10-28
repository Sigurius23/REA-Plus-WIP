.class final Lx90/i$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx90/i;->a(Ljava/lang/String;ZLcom/whoop/navigation/e;JLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activitysession.RoomActivitySessionHandler"
    f = "RoomActivitySessionHandler.kt"
    l = {
        0x25
    }
    m = "createSession-yxL6bBk"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lx90/i;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Z

.field z:J


# direct methods
.method public constructor <init>(Lx90/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx90/i;",
            "Lq83/d<",
            "-",
            "Lx90/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx90/i$b;->F:Lx90/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lx90/i$b;->E:Ljava/lang/Object;

    iget p1, p0, Lx90/i$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx90/i$b;->G:I

    iget-object v0, p0, Lx90/i$b;->F:Lx90/i;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lx90/i;->a(Ljava/lang/String;ZLcom/whoop/navigation/e;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
