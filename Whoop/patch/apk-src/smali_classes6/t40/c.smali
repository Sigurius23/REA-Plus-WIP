.class public final Lt40/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lt40/f;

.field public F:I

.field public w:Lt40/f;

.field public x:Lt40/f;

.field public y:Lmc3/a;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt40/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt40/c;->E:Lt40/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt40/c;->z:Ljava/lang/Object;

    iget p1, p0, Lt40/c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt40/c;->F:I

    iget-object p1, p0, Lt40/c;->E:Lt40/f;

    invoke-virtual {p1, p0}, Lt40/f;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
