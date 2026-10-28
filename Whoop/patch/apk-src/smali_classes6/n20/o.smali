.class public final Ln20/o;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ln20/p;

.field public x:La30/f1;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ln20/p;


# direct methods
.method public constructor <init>(Ln20/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln20/o;->z:Ln20/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln20/o;->y:Ljava/lang/Object;

    iget p1, p0, Ln20/o;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln20/o;->E:I

    iget-object p1, p0, Ln20/o;->z:Ln20/p;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ln20/p;->c(La30/f1;Lh20/x1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
