.class public final Lnz/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lgm/r;

.field public F:I

.field public w:Lgm/r;

.field public x:Lyy/m0;

.field public y:Lnq0/m;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgm/r;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lnz/b;->E:Lgm/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnz/b;->z:Ljava/lang/Object;

    iget p1, p0, Lnz/b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnz/b;->F:I

    iget-object p1, p0, Lnz/b;->E:Lgm/r;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lgm/r;->D(Lyy/m0;Lnq0/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
