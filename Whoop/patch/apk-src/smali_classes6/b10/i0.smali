.class public final Lb10/i0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lb10/z0;

.field public G:I

.field public w:Lb10/z0;

.field public x:Lyy/g;

.field public y:Lkotlin/jvm/functions/Function1;

.field public z:Lb10/i;


# direct methods
.method public constructor <init>(Lb10/z0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lb10/i0;->F:Lb10/z0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lb10/i0;->E:Ljava/lang/Object;

    iget p1, p0, Lb10/i0;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb10/i0;->G:I

    iget-object p1, p0, Lb10/i0;->F:Lb10/z0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lb10/z0;->G(Lyy/g;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
