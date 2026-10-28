.class public final Lwc/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lmc3/c;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lwc/s;

.field public H:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Exception;

.field public y:Lve/e;

.field public z:Lve/e;


# direct methods
.method public constructor <init>(Lwc/s;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwc/q;->G:Lwc/s;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwc/q;->F:Ljava/lang/Object;

    iget p1, p0, Lwc/q;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwc/q;->H:I

    iget-object p1, p0, Lwc/q;->G:Lwc/s;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lwc/s;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
