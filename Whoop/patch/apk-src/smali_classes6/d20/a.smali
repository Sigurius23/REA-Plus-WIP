.class public final Ld20/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ld20/c;

.field public G:I

.field public w:Ld20/c;

.field public x:Lq30/a0;

.field public y:Lyy/f;

.field public z:I


# direct methods
.method public constructor <init>(Ld20/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld20/a;->F:Ld20/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ld20/a;->E:Ljava/lang/Object;

    iget p1, p0, Ld20/a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld20/a;->G:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Ld20/a;->F:Ld20/c;

    invoke-virtual {v1, p1, p1, v0, p0}, Ld20/c;->a(Lq30/a0;Lyy/f;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
