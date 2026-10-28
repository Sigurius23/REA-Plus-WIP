.class public final Lp6/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lc93/m;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lp6/n;

.field public z:I


# direct methods
.method public constructor <init>(Lp6/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lp6/m;->y:Lp6/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp6/m;->x:Ljava/lang/Object;

    iget p1, p0, Lp6/m;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/m;->z:I

    iget-object p1, p0, Lp6/m;->y:Lp6/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lp6/n;->a(Lc93/m;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
