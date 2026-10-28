.class public final Ldv0/b$e$a$a;
.super Ls83/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv0/b$e$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$special$$inlined$transform$1$1"
    f = "RealtimeGapDetector.kt"
    l = {
        0x2c,
        0x34,
        0x41,
        0x4f
    }
    m = "emit"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field synthetic w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ldv0/b$e$a;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldv0/b$e$a;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ldv0/b$e$a$a;->y:Ldv0/b$e$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldv0/b$e$a$a;->w:Ljava/lang/Object;

    iget p1, p0, Ldv0/b$e$a$a;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldv0/b$e$a$a;->x:I

    iget-object p1, p0, Ldv0/b$e$a$a;->y:Ldv0/b$e$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldv0/b$e$a;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
