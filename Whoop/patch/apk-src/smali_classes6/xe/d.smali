.class public final Lxe/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lmf/h;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ld9/p;

.field public z:I


# direct methods
.method public constructor <init>(Ld9/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxe/d;->y:Ld9/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxe/d;->x:Ljava/lang/Object;

    iget p1, p0, Lxe/d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxe/d;->z:I

    iget-object p1, p0, Lxe/d;->y:Ld9/p;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ld9/p;->e(Lmf/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
