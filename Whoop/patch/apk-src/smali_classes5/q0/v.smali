.class public final Lq0/v;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:I

.field public x:Ld0/l;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lq0/y;


# direct methods
.method public constructor <init>(Lq0/y;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lq0/v;->z:Lq0/y;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lq0/v;->y:Ljava/lang/Object;

    iget p1, p0, Lq0/v;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq0/v;->E:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lq0/v;->z:Lq0/y;

    invoke-virtual {v1, p1, v0, p0}, Lq0/y;->f(ILd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
