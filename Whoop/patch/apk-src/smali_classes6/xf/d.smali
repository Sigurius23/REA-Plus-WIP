.class public final Lxf/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lrg/f;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lve/g;

.field public z:I


# direct methods
.method public constructor <init>(Lve/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxf/d;->y:Lve/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxf/d;->x:Ljava/lang/Object;

    iget p1, p0, Lxf/d;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxf/d;->z:I

    iget-object p1, p0, Lxf/d;->y:Lve/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lve/g;->h(Lve/g;Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
