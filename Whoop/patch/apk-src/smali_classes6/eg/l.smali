.class public final Leg/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Lfg/q;

.field public H:I

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Leg/o;

.field public K:I

.field public w:Lkotlin/jvm/functions/Function1;

.field public x:Lgg/g;

.field public y:Lfg/q;

.field public z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Leg/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Leg/l;->J:Leg/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Leg/l;->I:Ljava/lang/Object;

    iget p1, p0, Leg/l;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Leg/l;->K:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Leg/l;->J:Leg/o;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Leg/o;->d(Lkotlin/jvm/functions/Function1;Lgg/g;ILfg/q;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
