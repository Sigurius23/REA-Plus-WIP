.class public final Lxz/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lxz/x;

.field public y:I


# direct methods
.method public constructor <init>(Lxz/x;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxz/f;->x:Lxz/x;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lxz/f;->w:Ljava/lang/Object;

    iget p1, p0, Lxz/f;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxz/f;->y:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lxz/f;->x:Lxz/x;

    invoke-virtual {v1, p1, v0, p0}, Lxz/x;->f(Ld00/l;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
