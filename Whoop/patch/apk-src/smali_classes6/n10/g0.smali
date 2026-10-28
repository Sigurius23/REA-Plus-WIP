.class public final Ln10/g0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Le10/v0;

.field public x:Le10/k;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lj10/a;


# direct methods
.method public constructor <init>(Lj10/a;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/g0;->z:Lj10/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln10/g0;->y:Ljava/lang/Object;

    iget p1, p0, Ln10/g0;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/g0;->E:I

    iget-object p1, p0, Ln10/g0;->z:Lj10/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lj10/a;->i(Le10/v0;Le10/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
