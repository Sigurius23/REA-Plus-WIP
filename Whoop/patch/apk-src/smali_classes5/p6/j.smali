.class public final Lp6/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lp6/l;

.field public H:I

.field public w:Lp6/l;

.field public x:Lp6/l;

.field public y:Ljava/util/List;

.field public z:I


# direct methods
.method public constructor <init>(Lp6/l;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lp6/j;->G:Lp6/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp6/j;->F:Ljava/lang/Object;

    iget p1, p0, Lp6/j;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/j;->H:I

    iget-object p1, p0, Lp6/j;->G:Lp6/l;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lp6/l;->d(Lp6/l;Ljava/util/ArrayList;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
