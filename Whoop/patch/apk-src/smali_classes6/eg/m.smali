.class public final Leg/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/functions/Function1;

.field public F:Lgg/g;

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Leg/o;

.field public J:I

.field public w:Leg/o;

.field public x:Lpg3/p;

.field public y:Lt23/u3;

.field public z:Leg/o;


# direct methods
.method public constructor <init>(Leg/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Leg/m;->I:Leg/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Leg/m;->H:Ljava/lang/Object;

    iget p1, p0, Leg/m;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Leg/m;->J:I

    iget-object p1, p0, Leg/m;->I:Leg/o;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Leg/o;->g(Leg/o;Lpg3/p;Lt23/u3;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
