.class public final Lbk/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:La33/d;

.field public x:Lik/a;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:La33/d;


# direct methods
.method public constructor <init>(La33/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lbk/c;->z:La33/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lbk/c;->y:Ljava/lang/Object;

    iget p1, p0, Lbk/c;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lbk/c;->E:I

    iget-object p1, p0, Lbk/c;->z:La33/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
