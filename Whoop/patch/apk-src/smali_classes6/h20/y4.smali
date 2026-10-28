.class public final Lh20/y4;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lh20/z4;

.field public F:I

.field public w:Lh20/z4;

.field public x:Ly00/o4;

.field public y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh20/z4;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh20/y4;->E:Lh20/z4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh20/y4;->z:Ljava/lang/Object;

    iget p1, p0, Lh20/y4;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh20/y4;->F:I

    iget-object p1, p0, Lh20/y4;->E:Lh20/z4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh20/z4;->d(Ly00/o4;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
