.class public final Lrh/s;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lrh/j;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lrh/t;

.field public H:I

.field public w:Lrh/t;

.field public x:Lfi/p;

.field public y:Lfi/i;

.field public z:Lrh/f;


# direct methods
.method public constructor <init>(Lrh/t;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lrh/s;->G:Lrh/t;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lrh/s;->F:Ljava/lang/Object;

    iget p1, p0, Lrh/s;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrh/s;->H:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lrh/s;->G:Lrh/t;

    invoke-virtual {v1, p1, v0, p0}, Lrh/t;->b(Lfi/i;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
