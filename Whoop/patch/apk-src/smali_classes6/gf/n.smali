.class public final Lgf/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lgf/o;

.field public G:I

.field public w:Ljava/lang/Object;

.field public x:Lo23/p;

.field public y:Lmc3/a;

.field public z:I


# direct methods
.method public constructor <init>(Lgf/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lgf/n;->F:Lgf/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgf/n;->E:Ljava/lang/Object;

    iget p1, p0, Lgf/n;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgf/n;->G:I

    iget-object p1, p0, Lgf/n;->F:Lgf/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lgf/o;->a(Ljava/lang/Object;Lo23/p;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
