.class public final Lhh/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Lmh/m;

.field public G:Lbh/c;

.field public H:I

.field public synthetic I:Ljava/lang/Object;

.field public final synthetic J:Lhh/g;

.field public K:I

.field public w:Lhh/g;

.field public x:Lgh/n;

.field public y:Lbh/b;

.field public z:Lmh/j;


# direct methods
.method public constructor <init>(Lhh/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lhh/b;->J:Lhh/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lhh/b;->I:Ljava/lang/Object;

    iget p1, p0, Lhh/b;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhh/b;->K:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v0, p0, Lhh/b;->J:Lhh/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Lhh/g;->b(Lhh/g;Lgh/n;Lbh/b;Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
