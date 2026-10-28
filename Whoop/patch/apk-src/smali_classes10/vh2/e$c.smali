.class final Lvh2/e$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvh2/e;->l(Ljk0/d;Ljava/lang/String;Ljava/lang/String;Lsj2/a;Lvh2/i;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strapauth.unlock.StrapUnlockServiceImpl"
    f = "StrapUnlockServiceImpl.kt"
    l = {
        0x86,
        0x91
    }
    m = "attempt"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Z

.field J:I

.field K:J

.field L:J

.field M:J

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lvh2/e;

.field P:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvh2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvh2/e;",
            "Lq83/d<",
            "-",
            "Lvh2/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvh2/e$c;->O:Lvh2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lvh2/e$c;->N:Ljava/lang/Object;

    iget p1, p0, Lvh2/e$c;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvh2/e$c;->P:I

    iget-object v0, p0, Lvh2/e$c;->O:Lvh2/e;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Lvh2/e;->g(Lvh2/e;Ljk0/d;Ljava/lang/String;Ljava/lang/String;Lsj2/a;Lvh2/i;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
