.class public final Ln10/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ln10/o;

.field public F:I

.field public w:Ln10/o;

.field public x:Ly00/g6;

.field public y:Ly00/o4;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln10/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/n;->E:Ln10/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln10/n;->z:Ljava/lang/Object;

    iget p1, p0, Ln10/n;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/n;->F:I

    iget-object p1, p0, Ln10/n;->E:Ln10/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ln10/o;->b(Ly00/g6;Ly00/o4;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
