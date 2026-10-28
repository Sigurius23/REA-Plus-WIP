.class public final Luz/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Luz/o;

.field public G:I

.field public w:Luz/o;

.field public x:Landroidx/fragment/app/r0;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Luz/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Luz/n;->F:Luz/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luz/n;->E:Ljava/lang/Object;

    iget p1, p0, Luz/n;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luz/n;->G:I

    iget-object p1, p0, Luz/n;->F:Luz/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Luz/o;->d(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
