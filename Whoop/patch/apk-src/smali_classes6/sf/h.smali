.class public final Lsf/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:La30/w0;

.field public H:I

.field public w:La30/w0;

.field public x:Ljava/util/Iterator;

.field public y:Lsf/b;

.field public z:I


# direct methods
.method public constructor <init>(La30/w0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lsf/h;->G:La30/w0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsf/h;->F:Ljava/lang/Object;

    iget p1, p0, Lsf/h;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsf/h;->H:I

    iget-object p1, p0, Lsf/h;->G:La30/w0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La30/w0;->x(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
