.class public final Llb/k;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Llb/n;

.field public z:I


# direct methods
.method public constructor <init>(Llb/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Llb/k;->y:Llb/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llb/k;->x:Ljava/lang/Object;

    iget p1, p0, Llb/k;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llb/k;->z:I

    iget-object p1, p0, Llb/k;->y:Llb/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Llb/n;->e(Landroidx/room/w1;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
