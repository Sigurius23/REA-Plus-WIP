.class public final Lx6/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:I

.field public x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroidx/glance/session/SessionWorker;


# direct methods
.method public constructor <init>(Landroidx/glance/session/SessionWorker;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lx6/n;->z:Landroidx/glance/session/SessionWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx6/n;->y:Ljava/lang/Object;

    iget p1, p0, Lx6/n;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/n;->E:I

    iget-object p1, p0, Lx6/n;->z:Landroidx/glance/session/SessionWorker;

    invoke-virtual {p1, p0}, Landroidx/glance/session/SessionWorker;->doWork(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
