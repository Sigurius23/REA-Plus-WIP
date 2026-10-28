.class public final Lhh/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lmh/m;

.field public F:Lbh/c;

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Lhh/g;

.field public J:I

.field public w:Lhh/g;

.field public x:Lbh/b;

.field public y:Lmh/j;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhh/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lhh/d;->I:Lhh/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lhh/d;->H:Ljava/lang/Object;

    iget p1, p0, Lhh/d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhh/d;->J:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lhh/d;->I:Lhh/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lhh/g;->d(Lbh/b;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
