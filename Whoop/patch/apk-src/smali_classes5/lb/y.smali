.class public final Llb/y;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Llb/a0;

.field public F:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Throwable;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Llb/a0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Llb/y;->E:Llb/a0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llb/y;->z:Ljava/lang/Object;

    iget p1, p0, Llb/y;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llb/y;->F:I

    iget-object p1, p0, Llb/y;->E:Llb/a0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Llb/a0;->g(Landroidx/room/w1;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
