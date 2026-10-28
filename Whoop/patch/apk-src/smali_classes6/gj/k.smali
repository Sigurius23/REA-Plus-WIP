.class public final Lgj/k;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lgj/m;

.field public G:I

.field public w:Lgj/m;

.field public x:Ljava/util/List;

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(Lgj/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lgj/k;->F:Lgj/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lgj/k;->E:Ljava/lang/Object;

    iget p1, p0, Lgj/k;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgj/k;->G:I

    iget-object p1, p0, Lgj/k;->F:Lgj/m;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lgj/m;->g0(JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
