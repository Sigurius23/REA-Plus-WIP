.class public final Lrf/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lrf/o;

.field public G:I

.field public w:Ldg/a;

.field public x:Lvf/a;

.field public y:Lq83/j;

.field public z:Lzd3/o;


# direct methods
.method public constructor <init>(Lrf/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lrf/n;->F:Lrf/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lrf/n;->E:Ljava/lang/Object;

    iget p1, p0, Lrf/n;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrf/n;->G:I

    iget-object p1, p0, Lrf/n;->F:Lrf/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lrf/o;->z0(Ldg/a;Lvf/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
