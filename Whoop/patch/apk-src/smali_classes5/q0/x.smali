.class public final Lq0/x;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lq0/y;

.field public F:I

.field public w:Lq0/y;

.field public x:Lf0/z0;

.field public y:Ls83/i;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq0/y;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lq0/x;->E:Lq0/y;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq0/x;->z:Ljava/lang/Object;

    iget p1, p0, Lq0/x;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq0/x;->F:I

    iget-object p1, p0, Lq0/x;->E:Lq0/y;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lq0/y;->u(Lq0/y;Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
