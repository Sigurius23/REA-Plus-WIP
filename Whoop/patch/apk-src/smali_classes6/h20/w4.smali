.class public final Lh20/w4;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lh20/z4;

.field public x:Ljava/lang/String;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lh20/z4;


# direct methods
.method public constructor <init>(Lh20/z4;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh20/w4;->z:Lh20/z4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh20/w4;->y:Ljava/lang/Object;

    iget p1, p0, Lh20/w4;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh20/w4;->E:I

    iget-object p1, p0, Lh20/w4;->z:Lh20/z4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh20/z4;->b(Ly00/o4;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
