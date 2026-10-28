.class final Lvh2/g$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/g;->a(Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strapauth.unlock.StuckLockedTracker"
    f = "StuckLockedTracker.kt"
    l = {
        0x31,
        0x34,
        0x36
    }
    m = "onUnlockResolved"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lvh2/g;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lvh2/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/g;",
            "Lq83/d<",
            "-",
            "Lvh2/g$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/g$b;->H:Lvh2/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lvh2/g$b;->G:Ljava/lang/Object;

    iget p1, p0, Lvh2/g$b;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvh2/g$b;->I:I

    iget-object v0, p0, Lvh2/g$b;->H:Lvh2/g;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lvh2/g;->a(Ljava/lang/String;Lvh2/h;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
