.class public final Lx6/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Landroid/content/Context;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lx6/k;

.field public z:I


# direct methods
.method public constructor <init>(Lx6/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lx6/j;->y:Lx6/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx6/j;->x:Ljava/lang/Object;

    iget p1, p0, Lx6/j;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/j;->z:I

    iget-object p1, p0, Lx6/j;->y:Lx6/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lx6/k;->c(Landroid/content/Context;Lp6/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
