.class public final Ln53/w1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ln53/x1;

.field public G:I

.field public w:Ln53/x1;

.field public x:Ljava/lang/String;

.field public y:Lbc3/t;

.field public z:I


# direct methods
.method public constructor <init>(Ln53/x1;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln53/w1;->F:Ln53/x1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln53/w1;->E:Ljava/lang/Object;

    iget p1, p0, Ln53/w1;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln53/w1;->G:I

    iget-object p1, p0, Ln53/w1;->F:Ln53/x1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
