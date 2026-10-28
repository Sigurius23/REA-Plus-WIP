.class public final Lec3/v1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lec3/w1;

.field public G:I

.field public w:Lec3/w1;

.field public x:Lec3/m;

.field public y:Lec3/x1;

.field public z:Lbc3/k1;


# direct methods
.method public constructor <init>(Lec3/w1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/v1;->F:Lec3/w1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/v1;->E:Ljava/lang/Object;

    iget p1, p0, Lec3/v1;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/v1;->G:I

    iget-object p1, p0, Lec3/v1;->F:Lec3/w1;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
