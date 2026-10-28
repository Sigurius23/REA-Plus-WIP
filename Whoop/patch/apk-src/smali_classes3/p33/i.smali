.class public final Lp33/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lp33/o;

.field public x:Lkotlin/jvm/internal/g0;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lp33/o;


# direct methods
.method public constructor <init>(Lp33/o;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp33/i;->z:Lp33/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp33/i;->y:Ljava/lang/Object;

    iget p1, p0, Lp33/i;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp33/i;->E:I

    iget-object p1, p0, Lp33/i;->z:Lp33/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lp33/o;->setPublisher(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
