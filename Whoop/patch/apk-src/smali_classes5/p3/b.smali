.class public final Lp3/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lp3/c;

.field public G:I

.field public w:Ljava/util/List;

.field public x:Lp3/x;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lp3/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lp3/b;->F:Lp3/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp3/b;->E:Ljava/lang/Object;

    iget p1, p0, Lp3/b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp3/b;->G:I

    iget-object p1, p0, Lp3/b;->F:Lp3/c;

    invoke-virtual {p1, p0}, Lp3/c;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
