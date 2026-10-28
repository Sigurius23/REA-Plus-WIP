.class public final Lp6/c0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lp6/g0;

.field public G:I

.field public w:Landroid/content/Context;

.field public x:Lp6/b;

.field public y:Ljava/lang/Throwable;

.field public z:I


# direct methods
.method public constructor <init>(Lp6/g0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp6/c0;->F:Lp6/g0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lp6/c0;->E:Ljava/lang/Object;

    iget p1, p0, Lp6/c0;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/c0;->G:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lp6/c0;->F:Lp6/g0;

    invoke-virtual {v1, p1, v0, p0}, Lp6/g0;->b(Landroid/content/Context;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
