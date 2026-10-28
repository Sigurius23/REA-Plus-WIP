.class final Lyu0/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyu0/b;->a(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.connectivityanalytics.DataBacklogReporter"
    f = "DataBacklogReporter.kt"
    l = {
        0x28
    }
    m = "getBacklogMinutes"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lyu0/b;

.field y:I


# direct methods
.method public constructor <init>(Lyu0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyu0/b;",
            "Lq83/d<",
            "-",
            "Lyu0/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyu0/b$a;->x:Lyu0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyu0/b$a;->w:Ljava/lang/Object;

    iget p1, p0, Lyu0/b$a;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyu0/b$a;->y:I

    iget-object p1, p0, Lyu0/b$a;->x:Lyu0/b;

    invoke-virtual {p1, p0}, Lyu0/b;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
