.class public final Lr0/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lr0/c;

.field public G:I

.field public w:Lh2/c;

.field public x:[Ljava/lang/Object;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lr0/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lr0/b;->F:Lr0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr0/b;->E:Ljava/lang/Object;

    iget p1, p0, Lr0/b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr0/b;->G:I

    iget-object p1, p0, Lr0/b;->F:Lr0/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lr0/c;->b(Lh2/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
