.class public final Lp6/q0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lp6/s0;

.field public G:I

.field public w:Landroid/content/Context;

.field public x:[I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lp6/s0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp6/q0;->F:Lp6/s0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp6/q0;->E:Ljava/lang/Object;

    iget p1, p0, Lp6/q0;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/q0;->G:I

    iget-object p1, p0, Lp6/q0;->F:Lp6/s0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lp6/s0;->a(Lbc3/c0;Landroid/content/Context;[ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
