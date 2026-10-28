.class public final Lw43/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Throwable;

.field public F:J

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lt9/p;

.field public I:I

.field public w:Lt9/p;

.field public x:Lw43/b;

.field public y:Lc93/m;

.field public z:Lkotlin/jvm/internal/e0;


# direct methods
.method public constructor <init>(Lt9/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lw43/c;->H:Lt9/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw43/c;->G:Ljava/lang/Object;

    iget p1, p0, Lw43/c;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw43/c;->I:I

    iget-object p1, p0, Lw43/c;->H:Lt9/p;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lt9/p;->u(Lw43/b;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
