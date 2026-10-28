.class public final Ly6/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ly6/f;

.field public G:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/String;

.field public z:Lmc3/c;


# direct methods
.method public constructor <init>(Ly6/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ly6/c;->F:Ly6/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly6/c;->E:Ljava/lang/Object;

    iget p1, p0, Ly6/c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly6/c;->G:I

    iget-object p1, p0, Ly6/c;->F:Ly6/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Ly6/f;->b(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
