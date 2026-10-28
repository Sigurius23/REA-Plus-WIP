.class public final Lbk/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Long;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lbk/n;

.field public H:I

.field public w:Lbk/n;

.field public x:Ljava/lang/Long;

.field public y:Ljava/lang/Long;

.field public z:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lbk/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbk/m;->G:Lbk/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbk/m;->F:Ljava/lang/Object;

    iget p1, p0, Lbk/m;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbk/m;->H:I

    iget-object p1, p0, Lbk/m;->G:Lbk/n;

    invoke-virtual {p1, p0}, Lbk/n;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
