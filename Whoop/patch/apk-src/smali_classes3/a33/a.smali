.class public final La33/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:J

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:La33/d;

.field public I:I

.field public w:La33/d;

.field public x:Lkotlin/jvm/functions/Function1;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(La33/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, La33/a;->H:La33/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, La33/a;->G:Ljava/lang/Object;

    iget p1, p0, La33/a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La33/a;->I:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, La33/a;->H:La33/d;

    invoke-virtual {v1, p1, v0, p0}, La33/d;->E(ILa33/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
