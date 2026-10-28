.class public final Lfc3/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Landroidx/room/b2;

.field public F:I

.field public w:Landroidx/room/b2;

.field public x:Ljava/lang/Object;

.field public y:Lbc3/k1;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/room/b2;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lfc3/j;->E:Landroidx/room/b2;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfc3/j;->z:Ljava/lang/Object;

    iget p1, p0, Lfc3/j;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfc3/j;->F:I

    iget-object p1, p0, Lfc3/j;->E:Landroidx/room/b2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/room/b2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
