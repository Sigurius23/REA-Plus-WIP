.class public final Lgj/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lgj/m;

.field public H:I

.field public w:Lgj/m;

.field public x:Ljk/a;

.field public y:Ljava/lang/Iterable;

.field public z:J


# direct methods
.method public constructor <init>(Lgj/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lgj/j;->G:Lgj/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgj/j;->F:Ljava/lang/Object;

    iget p1, p0, Lgj/j;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgj/j;->H:I

    iget-object p1, p0, Lgj/j;->G:Lgj/m;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lgj/m;->d0(Lgj/m;Lgj/i;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
